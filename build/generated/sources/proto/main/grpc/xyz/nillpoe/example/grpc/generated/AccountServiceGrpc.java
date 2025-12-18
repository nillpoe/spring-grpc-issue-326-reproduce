package xyz.nillpoe.example.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "example.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xyz.nillpoe.example.grpc.generated.ThrowErrorRequest,
      xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> getThrowErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThrowError",
      requestType = xyz.nillpoe.example.grpc.generated.ThrowErrorRequest.class,
      responseType = xyz.nillpoe.example.grpc.generated.ThrowErrorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.nillpoe.example.grpc.generated.ThrowErrorRequest,
      xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> getThrowErrorMethod() {
    io.grpc.MethodDescriptor<xyz.nillpoe.example.grpc.generated.ThrowErrorRequest, xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> getThrowErrorMethod;
    if ((getThrowErrorMethod = AccountServiceGrpc.getThrowErrorMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getThrowErrorMethod = AccountServiceGrpc.getThrowErrorMethod) == null) {
          AccountServiceGrpc.getThrowErrorMethod = getThrowErrorMethod =
              io.grpc.MethodDescriptor.<xyz.nillpoe.example.grpc.generated.ThrowErrorRequest, xyz.nillpoe.example.grpc.generated.ThrowErrorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ThrowError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  xyz.nillpoe.example.grpc.generated.ThrowErrorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  xyz.nillpoe.example.grpc.generated.ThrowErrorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getThrowErrorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AccountServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingV2Stub>() {
        @java.lang.Override
        public AccountServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AccountServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void throwError(xyz.nillpoe.example.grpc.generated.ThrowErrorRequest request,
        io.grpc.stub.StreamObserver<xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getThrowErrorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountService.
   */
  public static abstract class AccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void throwError(xyz.nillpoe.example.grpc.generated.ThrowErrorRequest request,
        io.grpc.stub.StreamObserver<xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getThrowErrorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingV2Stub> {
    private AccountServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public xyz.nillpoe.example.grpc.generated.ThrowErrorResponse throwError(xyz.nillpoe.example.grpc.generated.ThrowErrorRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getThrowErrorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public xyz.nillpoe.example.grpc.generated.ThrowErrorResponse throwError(xyz.nillpoe.example.grpc.generated.ThrowErrorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getThrowErrorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountService.
   */
  public static final class AccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.nillpoe.example.grpc.generated.ThrowErrorResponse> throwError(
        xyz.nillpoe.example.grpc.generated.ThrowErrorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getThrowErrorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_THROW_ERROR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_THROW_ERROR:
          serviceImpl.throwError((xyz.nillpoe.example.grpc.generated.ThrowErrorRequest) request,
              (io.grpc.stub.StreamObserver<xyz.nillpoe.example.grpc.generated.ThrowErrorResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getThrowErrorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              xyz.nillpoe.example.grpc.generated.ThrowErrorRequest,
              xyz.nillpoe.example.grpc.generated.ThrowErrorResponse>(
                service, METHODID_THROW_ERROR)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getThrowErrorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
