package com.xiaov.download;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author xiaov
 * @create_time 2020-10-08 4:31 下午
 */
public class DownLoadTool {

    public void download(String urlString, String filename, String savePath, DownLoadProgress downLoadProgress) throws Exception {
        /*将网络资源地址传给,即赋值给url*/
        URL url = new URL(urlString);
        /*此为联系获得网络资源的固定格式用法，以便后面的in变量获得url截取网络资源的输入流*/
        // 打开连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //设置请求超时为5s
        connection.setConnectTimeout(5 * 1000);
        connection.setReadTimeout(6000);
//        int code = connection.getResponseCode();
//        if (code != HttpURLConnection.HTTP_OK) {
//            throw new Exception("文件读取失败");
//        }
//        System.out.println("文件读取成功");
        DataInputStream in = new DataInputStream(connection.getInputStream());

        long contentLengthLong = connection.getContentLengthLong();
        System.out.println("contentLengthLong = " + contentLengthLong);
        // 输出的文件流
        File sf = new File(savePath);
        if (!sf.exists()) {
            sf.mkdirs();
        }
        /*此处也可用BufferedInputStream与BufferedOutputStream*/
        DataOutputStream out = new DataOutputStream(new FileOutputStream(sf.getPath() + "/" + filename));

        /*将输入流以字节的形式读取并写入buffer中*/
        // 4K的数据缓冲
        byte[] buffer = new byte[4096];
        // 读取到的数据长度
        int byteread = 0;
        downLoadProgress.start();

        long bytesum = 0;
        while ((byteread = in.read(buffer)) > 0) {
            out.write(buffer, 0, byteread);
            bytesum += byteread; //字节数 文件大小
            long i = bytesum * 100 / contentLengthLong;
//            System.out.println("百分比进度" + i);
            downLoadProgress.running(i);
        }
        downLoadProgress.stop(savePath);
        // 完毕，关闭所有链接
        out.close();/*后面三行为关闭输入输出流以及网络资源的固定格式*/
        in.close();
        connection.disconnect();


//        System.out.println("文件下载完毕");

    }
}
