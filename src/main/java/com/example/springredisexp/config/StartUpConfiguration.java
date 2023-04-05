package com.example.springredisexp.config;

import com.corundumstudio.socketio.SocketIOServer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUpConfiguration implements CommandLineRunner {

    private final SocketIOServer socketIOServer;

    @Override
    public void run(String... args) throws Exception {
        socketIOServer.start(); // starts web socket on start up
    }

}
