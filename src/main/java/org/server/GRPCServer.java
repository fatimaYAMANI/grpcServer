package org.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.service.BankGrpcService;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)

                .addService(new BankGrpcService())

                .build(); server.start(); server.awaitTermination();
    }
}