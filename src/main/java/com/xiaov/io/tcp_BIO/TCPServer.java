package com.xiaov.io.tcp_BIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaov_li
 * @create 2020-05-27 8:17 上午
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        Logger logger = LoggerFactory.getLogger(TCPServer.class);
        logger.info("TcpServer 启动...");
        ServerSocket serverSocket = new ServerSocket(8099);
        logger.info("正在等待连接...");
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        logger.info("服务端收到客户端消息:"+new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("收到".getBytes());
        socket.close();
        serverSocket.close();
    }
}
