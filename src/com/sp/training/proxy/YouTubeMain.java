package com.sp.training.proxy;

public class YouTubeMain {


    public static void main(String[] args) {

        YTDownloader clientOneDownloader=new YTDownloader(new YouTubeClientOne());
        YTDownloader clientTwoDownloader=new YTDownloader(new YouTubeClientProxy());


        downloadVideos(clientOneDownloader,"ABCD");
        downloadVideos(clientTwoDownloader,"DEFGG");


    }

    private static void downloadVideos(YTDownloader clientTwoDownloader, String videoUrl) {
        clientTwoDownloader.downloadVideo(videoUrl);
    }


}
