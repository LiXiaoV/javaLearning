package com.xiaov.download;

/**
 * @author xiaov
 * @create_time 2020-10-08 4:05 下午
 */
public interface DownLoadProgress {
    public void start();//开始回调

    public void running(long i);//进度百分比

    public void stop(String filePath);//成功后文件的路径

    public void error(Exception e);//错误信息
}
