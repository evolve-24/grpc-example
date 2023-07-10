package ev24;

import ev24.example.ExampleServiceGrpc;
import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;

public class Main {

	protected final String description = "Example";
	protected final Server grpcServer;

	public static void main(String[] args) throws IOException, InterruptedException {

		ExampleServiceGrpc exampleServiceGrpc = new ExampleServiceGrpc();
		Main main = new Main(
			NettyServerBuilder
				.forPort(8888)
				.addService(ProtoReflectionService.newInstance())
				.addService(exampleServiceGrpc)
				.maxConcurrentCallsPerConnection(2)
				.build()
		);

		main.start();
	}

	public Main(Server grpcServer) {
		this.grpcServer = grpcServer;
	}

	public void start() throws IOException, InterruptedException {
		System.out.println(">>> START: " + description);
		Runtime.getRuntime().addShutdownHook(
			new Thread(this::stop)
		);

		grpcServer.start().awaitTermination();
	}

	public void stop() {
		System.out.println(">>> STOP: " + description);

		try {
			grpcServer.shutdown().awaitTermination();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
