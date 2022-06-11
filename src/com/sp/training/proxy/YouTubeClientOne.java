package com.sp.training.proxy;

import java.util.List;

public class YouTubeClientOne implements ThirdPartyYTLib{



    @Override
    public Video getVideoFromUrl(String videoId) {
        return null;
    }

    @Override
    public List<Video> getPlaylistVideos() {
        return null;
    }
}
