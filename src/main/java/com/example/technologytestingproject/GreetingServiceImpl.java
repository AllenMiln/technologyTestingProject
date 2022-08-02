package com.example.technologytestingproject;

import com.example.grpc.MyGreetingServiceGrpc;
import com.example.grpc.MyGreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends MyGreetingServiceGrpc.MyGreetingServiceImplBase {

    @Override
    public void greetingHello(MyGreetingServiceOuterClass.HelloRequest request, StreamObserver<MyGreetingServiceOuterClass.HelloResponse> responseObserver) {
        System.out.println(request);

        MyGreetingServiceOuterClass.HelloResponse response = MyGreetingServiceOuterClass.
                HelloResponse.newBuilder().setGreeting("Hello from server, " + request.getName()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
