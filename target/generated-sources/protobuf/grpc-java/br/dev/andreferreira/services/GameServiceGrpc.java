package br.dev.andreferreira.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: services/gameService.proto")
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final String SERVICE_NAME = "services.GameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      br.dev.andreferreira.services.GameResponse> getGetAllGamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllGames",
      requestType = com.google.protobuf.Empty.class,
      responseType = br.dev.andreferreira.services.GameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      br.dev.andreferreira.services.GameResponse> getGetAllGamesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, br.dev.andreferreira.services.GameResponse> getGetAllGamesMethod;
    if ((getGetAllGamesMethod = GameServiceGrpc.getGetAllGamesMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getGetAllGamesMethod = GameServiceGrpc.getGetAllGamesMethod) == null) {
          GameServiceGrpc.getGetAllGamesMethod = getGetAllGamesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, br.dev.andreferreira.services.GameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.GameService", "getAllGames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.dev.andreferreira.services.GameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("getAllGames"))
                  .build();
          }
        }
     }
     return getGetAllGamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.dev.andreferreira.services.GameRequest,
      br.dev.andreferreira.entities.Game> getCreateNewGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createNewGame",
      requestType = br.dev.andreferreira.services.GameRequest.class,
      responseType = br.dev.andreferreira.entities.Game.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.dev.andreferreira.services.GameRequest,
      br.dev.andreferreira.entities.Game> getCreateNewGameMethod() {
    io.grpc.MethodDescriptor<br.dev.andreferreira.services.GameRequest, br.dev.andreferreira.entities.Game> getCreateNewGameMethod;
    if ((getCreateNewGameMethod = GameServiceGrpc.getCreateNewGameMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getCreateNewGameMethod = GameServiceGrpc.getCreateNewGameMethod) == null) {
          GameServiceGrpc.getCreateNewGameMethod = getCreateNewGameMethod = 
              io.grpc.MethodDescriptor.<br.dev.andreferreira.services.GameRequest, br.dev.andreferreira.entities.Game>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.GameService", "createNewGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.dev.andreferreira.services.GameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.dev.andreferreira.entities.Game.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("createNewGame"))
                  .build();
          }
        }
     }
     return getCreateNewGameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    return new GameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GameServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * gRPC Unary - Request and Response
     * </pre>
     */
    public void getAllGames(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<br.dev.andreferreira.services.GameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllGamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new game
     * </pre>
     */
    public void createNewGame(br.dev.andreferreira.services.GameRequest request,
        io.grpc.stub.StreamObserver<br.dev.andreferreira.entities.Game> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNewGameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllGamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                br.dev.andreferreira.services.GameResponse>(
                  this, METHODID_GET_ALL_GAMES)))
          .addMethod(
            getCreateNewGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.dev.andreferreira.services.GameRequest,
                br.dev.andreferreira.entities.Game>(
                  this, METHODID_CREATE_NEW_GAME)))
          .build();
    }
  }

  /**
   */
  public static final class GameServiceStub extends io.grpc.stub.AbstractStub<GameServiceStub> {
    private GameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * gRPC Unary - Request and Response
     * </pre>
     */
    public void getAllGames(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<br.dev.andreferreira.services.GameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new game
     * </pre>
     */
    public void createNewGame(br.dev.andreferreira.services.GameRequest request,
        io.grpc.stub.StreamObserver<br.dev.andreferreira.entities.Game> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNewGameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GameServiceBlockingStub extends io.grpc.stub.AbstractStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * gRPC Unary - Request and Response
     * </pre>
     */
    public br.dev.andreferreira.services.GameResponse getAllGames(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllGamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new game
     * </pre>
     */
    public br.dev.andreferreira.entities.Game createNewGame(br.dev.andreferreira.services.GameRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateNewGameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GameServiceFutureStub extends io.grpc.stub.AbstractStub<GameServiceFutureStub> {
    private GameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * gRPC Unary - Request and Response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<br.dev.andreferreira.services.GameResponse> getAllGames(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new game
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<br.dev.andreferreira.entities.Game> createNewGame(
        br.dev.andreferreira.services.GameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNewGameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_GAMES = 0;
  private static final int METHODID_CREATE_NEW_GAME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_GAMES:
          serviceImpl.getAllGames((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<br.dev.andreferreira.services.GameResponse>) responseObserver);
          break;
        case METHODID_CREATE_NEW_GAME:
          serviceImpl.createNewGame((br.dev.andreferreira.services.GameRequest) request,
              (io.grpc.stub.StreamObserver<br.dev.andreferreira.entities.Game>) responseObserver);
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

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.dev.andreferreira.services.GameServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getGetAllGamesMethod())
              .addMethod(getCreateNewGameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
