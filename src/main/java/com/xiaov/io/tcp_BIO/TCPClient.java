package com.xiaov.io.tcp_BIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author xiaov_li
 * @create 2020-05-27 8:06 上午
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Logger logger = LoggerFactory.getLogger(TCPClient.class);
        logger.info("客户端启动...");
        Socket socket = new Socket("127.0.0.1",8099);
        OutputStream os = socket.getOutputStream();
        os.write("127.0.0.1：8099发送：hello world".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        logger.info("客户端收到服务端消息:"+new String(bytes,0,len));
        socket.close();
    }
}
