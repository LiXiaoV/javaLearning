package com.xiaov.download;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author xiaov
 * @create_time 2020-10-08 11:27 上午
 */
public class DownloadImage implements DownLoadProgress {
    private int downProgressNumber;

    public int getDownProgressNumber() {
        return downProgressNumber;
    }

    public void setDownProgressNumber(int downProgressNumber) {
        this.downProgressNumber = downProgressNumber;
    }

    public static void main(String[] args) {

    }

    @Test
    public void testDownload() throws Exception {
        DownLoadTool downLoadTool = new DownLoadTool();
//        downLoadTool.download("https://raw.githubusercontent.com/LiXiaoV/demo/master/bb/spring-overview.png",
//                "spring-overview.png", "/Users/xiaov/Downloads/temp", this);
//        downLoadTool.download("https://raw.githubusercontent.com/LiXiaoV/demo/master/cc/%E7%AE%A1%E9%81%93%E6%B5%81.png",
//                "管道流.png", "/Users/xiaov/Downloads/temp", this);
        downLoadTool.download("https://raw.githubusercontent.com/LiXiaoV/demo/master/cc/%E9%87%8D%E5%AE%9A%E5%90%91.bmp",
                "重定向.bmp", "/Users/xiaov/Downloads/temp", this);
//        downLoadTool.download("https://raw.githubusercontent.com/LiXiaoV/demo/master/moonlight.mp4",
//                "moonlight.mp4", "/Users/xiaov/Downloads/temp", this);
    }

    @Test
    public void getDownloadProgress() {
        while (true) {
            System.out.println("this.downProgressNumber = " + this.downProgressNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start() {
        System.out.println("开始下载");
        this.downProgressNumber = 0;
    }

    @Override
    public void running(long i) {
        this.downProgressNumber = (int) i;
        System.out.println("下载进度是" + this.downProgressNumber + "%");
    }


    @Override
    public void stop(String filePath) {
        System.out.println("下载完成,存储路径是" + filePath);
        this.downProgressNumber = 0;
    }

    @Override
    public void error(Exception e) {
        e.printStackTrace();
    }
}
