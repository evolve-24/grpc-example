package ev24;

import ev24.example.ExampleServiceGrpc;
import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

	protected final String description = "Example";
	protected final Server grpcServer;
	protected final Logger logger;

	public static void main(String[] args) throws IOException, InterruptedException {

		ExampleServiceGrpc exampleServiceGrpc = new ExampleServiceGrpc();
		Main main = new Main(
			NettyServerBuilder
			.forPort(8888)
			.addService(ProtoReflectionService.newInstance())
			.addService(exampleServiceGrpc)
			.maxConcurrentCallsPerConnection(2)
			.build(),
			LoggerFactory.getLogger(Main.class)
		);

		main.start();
	}

	public Main(Server grpcServer, Logger logger) {
		this.grpcServer = grpcServer;
		this.logger = logger;
	}

	public void start() throws IOException, InterruptedException {
		logger.info(">>> START: " + description);
		Runtime.getRuntime().addShutdownHook(
			new Thread(this::stop)
		);

		grpcServer.start().awaitTermination();
	}

	public void stop() {
		logger.info(">>> STOP: " + description);

		try {
			grpcServer.shutdown().awaitTermination();
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
