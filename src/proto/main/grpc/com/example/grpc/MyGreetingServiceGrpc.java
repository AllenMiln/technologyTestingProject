package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: MyGreetingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyGreetingServiceGrpc {

  private MyGreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.MyGreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.MyGreetingServiceOuterClass.HelloRequest,
      com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> getGreetingHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetingHello",
      requestType = com.example.grpc.MyGreetingServiceOuterClass.HelloRequest.class,
      responseType = com.example.grpc.MyGreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.MyGreetingServiceOuterClass.HelloRequest,
      com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> getGreetingHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.MyGreetingServiceOuterClass.HelloRequest, com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> getGreetingHelloMethod;
    if ((getGreetingHelloMethod = MyGreetingServiceGrpc.getGreetingHelloMethod) == null) {
      synchronized (MyGreetingServiceGrpc.class) {
        if ((getGreetingHelloMethod = MyGreetingServiceGrpc.getGreetingHelloMethod) == null) {
          MyGreetingServiceGrpc.getGreetingHelloMethod = getGreetingHelloMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.MyGreetingServiceOuterClass.HelloRequest, com.example.grpc.MyGreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetingHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MyGreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MyGreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyGreetingServiceMethodDescriptorSupplier("greetingHello"))
              .build();
        }
      }
    }
    return getGreetingHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyGreetingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceStub>() {
        @java.lang.Override
        public MyGreetingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyGreetingServiceStub(channel, callOptions);
        }
      };
    return MyGreetingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyGreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceBlockingStub>() {
        @java.lang.Override
        public MyGreetingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyGreetingServiceBlockingStub(channel, callOptions);
        }
      };
    return MyGreetingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyGreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyGreetingServiceFutureStub>() {
        @java.lang.Override
        public MyGreetingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyGreetingServiceFutureStub(channel, callOptions);
        }
      };
    return MyGreetingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MyGreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greetingHello(com.example.grpc.MyGreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetingHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.MyGreetingServiceOuterClass.HelloRequest,
                com.example.grpc.MyGreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class MyGreetingServiceStub extends io.grpc.stub.AbstractAsyncStub<MyGreetingServiceStub> {
    private MyGreetingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGreetingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyGreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void greetingHello(com.example.grpc.MyGreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetingHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MyGreetingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyGreetingServiceBlockingStub> {
    private MyGreetingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGreetingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyGreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.MyGreetingServiceOuterClass.HelloResponse greetingHello(com.example.grpc.MyGreetingServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetingHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyGreetingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyGreetingServiceFutureStub> {
    private MyGreetingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGreetingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyGreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.MyGreetingServiceOuterClass.HelloResponse> greetingHello(
        com.example.grpc.MyGreetingServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetingHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyGreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyGreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING_HELLO:
          serviceImpl.greetingHello((com.example.grpc.MyGreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.MyGreetingServiceOuterClass.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyGreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyGreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.MyGreetingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyGreetingService");
    }
  }

  private static final class MyGreetingServiceFileDescriptorSupplier
      extends MyGreetingServiceBaseDescriptorSupplier {
    MyGreetingServiceFileDescriptorSupplier() {}
  }

  private static final class MyGreetingServiceMethodDescriptorSupplier
      extends MyGreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyGreetingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyGreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyGreetingServiceFileDescriptorSupplier())
              .addMethod(getGreetingHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
