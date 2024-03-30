package com.whatsapp.stickers;

public final class WebpInfo {
    public final int height;
    public final int minFrameDurationMS;
    public final int numFrames;
    public final long totalAnimationDurationMS;
    public final int width;

    public WebpInfo(int i, int i2, int i3, int i4, long j) {
        this.numFrames = i;
        this.width = i2;
        this.height = i3;
        this.minFrameDurationMS = i4;
        this.totalAnimationDurationMS = j;
    }
}
