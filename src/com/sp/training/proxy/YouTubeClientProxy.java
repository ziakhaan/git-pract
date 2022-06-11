package com.sp.training.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YouTubeClientProxy implements  ThirdPartyYTLib{

    private YouTubeClientOne youTubeClientOne;
    Map<String,Video> cache=new HashMap<>();

    public YouTubeClientProxy() {
    }

    public YouTubeClientProxy(YouTubeClientOne youTubeClientOne) {
        this.youTubeClientOne=youTubeClientOne;
    }


    @Override
    public Video getVideoFromUrl(String videoId) {

        if(cache.get(videoId)!=null)
        {
            return cache.get(videoId);
        }
        else
        {
            return youTubeClientOne.getVideoFromUrl(videoId);
        }

    }

    @Override
    public List<Video> getPlaylistVideos() {
        return youTubeClientOne.getPlaylistVideos();
    }
}
