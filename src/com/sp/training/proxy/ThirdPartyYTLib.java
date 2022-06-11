package com.sp.training.proxy;

import java.util.List;

public interface ThirdPartyYTLib {

    public Video getVideoFromUrl(String videoId);

    public List<Video> getPlaylistVideos();

}
