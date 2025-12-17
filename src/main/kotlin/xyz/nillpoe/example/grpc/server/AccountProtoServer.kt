package xyz.nillpoe.example.grpc.server

import org.springframework.stereotype.Service
import xyz.nillpoe.example.grpc.generated.AccountServiceGrpcKt
import xyz.nillpoe.example.grpc.generated.ThrowErrorRequest
import xyz.nillpoe.example.grpc.generated.ThrowErrorResponse

@Service
class AccountProtoServer : AccountServiceGrpcKt.AccountServiceCoroutineImplBase() {

    override suspend fun throwError(request: ThrowErrorRequest): ThrowErrorResponse {
        TODO()
    }
}