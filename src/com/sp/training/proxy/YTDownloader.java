package com.sp.training.proxy;

import java.util.List;

public class YTDownloader {

    ThirdPartyYTLib thirdPartyYTLib;


    public YTDownloader(ThirdPartyYTLib thirdPartyYTLib) {
        this.thirdPartyYTLib = thirdPartyYTLib;
    }


    public Video downloadVideo(String videoId)
    {
       return thirdPartyYTLib.getVideoFromUrl(videoId);
    }

    public List<Video> getAllVideos()
    {

        return thirdPartyYTLib.getPlaylistVideos();
    }

}
