package ev24.example;

import ev24.protobuf.example.ExampleRequest;
import ev24.protobuf.example.ExampleResponse;
import io.grpc.stub.StreamObserver;

import java.util.Map;

public class ExampleServiceGrpc extends ev24.protobuf.example.ExampleServiceGrpc.ExampleServiceImplBase {

	@Override
	public void handle(ExampleRequest request, StreamObserver<ExampleResponse> responseObserver) {

		ExampleResponse response = ExampleResponse.newBuilder()
			.setRequestId(request.getRequestId())
			.putAllPayload(request.getPayloadMap())
			.putAllPayload(Map.of("test1", "value1", "test2", "value2"))
			.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
