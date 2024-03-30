package com.whatsapp.videoplayback;

import X.AnonymousClass000;
import X.AnonymousClass6YY;
import X.C133636Zj;
import X.C163427qB;
import X.C163817qo;
import X.C164117rI;
import X.C165277tA;
import X.C18740tg;
import X.C36441kJ;
import X.C90514aH;
import X.C92184dG;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class VideoSurfaceView extends C92184dG implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public MediaPlayer.OnCompletionListener A08;
    public MediaPlayer.OnErrorListener A09;
    public MediaPlayer.OnPreparedListener A0A;
    public MediaPlayer A0B;
    public SurfaceHolder A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public Uri A0H;
    public Map A0I;
    public boolean A0J;
    public boolean A0K;
    public final MediaPlayer.OnPreparedListener A0L = new C165277tA(this, 2);
    public final MediaPlayer.OnVideoSizeChangedListener A0M = C92184dG.A00(this);
    public final SurfaceHolder.Callback A0N = new C163817qo(this, 1);
    public final MediaPlayer.OnBufferingUpdateListener A0O = new C133636Zj(this);
    public final MediaPlayer.OnCompletionListener A0P = new C163427qB(this, 3);
    public final MediaPlayer.OnErrorListener A0Q = new C164117rI(this, 2);

    private void A01() {
        this.A07 = 0;
        this.A06 = 0;
        getHolder().addCallback(this.A0N);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.A01 = 0;
        this.A05 = 0;
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, (Map) null);
    }

    public static void A02(VideoSurfaceView videoSurfaceView) {
        Uri uri = videoSurfaceView.A0H;
        if (uri != null && videoSurfaceView.A0C != null) {
            File A032 = AnonymousClass6YY.A03(uri);
            if (A032 == null || !A032.exists() || !GifHelper.A01(A032)) {
                Intent A0I2 = C36441kJ.A0I("com.android.music.musicservicecommand");
                A0I2.putExtra("command", "pause");
                videoSurfaceView.getContext().sendBroadcast(A0I2);
            }
            A03(videoSurfaceView, false);
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                videoSurfaceView.A0B = mediaPlayer;
                int i = videoSurfaceView.A0G;
                if (i != 0) {
                    mediaPlayer.setAudioSessionId(i);
                } else {
                    videoSurfaceView.A0G = mediaPlayer.getAudioSessionId();
                }
                if (videoSurfaceView.A0K) {
                    videoSurfaceView.A0B.setVolume(0.0f, 0.0f);
                }
                if (videoSurfaceView.A0J) {
                    videoSurfaceView.A0B.setLooping(true);
                }
                videoSurfaceView.A0B.setOnPreparedListener(videoSurfaceView.A0L);
                videoSurfaceView.A0B.setOnVideoSizeChangedListener(videoSurfaceView.A0M);
                videoSurfaceView.A0B.setOnCompletionListener(videoSurfaceView.A0P);
                videoSurfaceView.A0B.setOnErrorListener(videoSurfaceView.A0Q);
                videoSurfaceView.A0B.setOnBufferingUpdateListener(videoSurfaceView.A0O);
                videoSurfaceView.A00 = 0;
                videoSurfaceView.A0B.setDataSource(videoSurfaceView.getContext(), videoSurfaceView.A0H, videoSurfaceView.A0I);
                videoSurfaceView.A0B.setDisplay(videoSurfaceView.A0C);
                videoSurfaceView.A0B.setAudioStreamType(3);
                videoSurfaceView.A0B.setScreenOnWhilePlaying(true);
                videoSurfaceView.A0B.prepareAsync();
                videoSurfaceView.A01 = 1;
            } catch (IOException | IllegalArgumentException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("videoview/ Unable to open content: ");
                Log.w(AnonymousClass000.A0o(videoSurfaceView.A0H, A0u), e);
                videoSurfaceView.A01 = -1;
                videoSurfaceView.A05 = -1;
                videoSurfaceView.A0Q.onError(videoSurfaceView.A0B, 1, 0);
            }
        }
    }

    public static void A03(VideoSurfaceView videoSurfaceView, boolean z) {
        MediaPlayer mediaPlayer = videoSurfaceView.A0B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            videoSurfaceView.A0B.release();
            videoSurfaceView.A0B = null;
            videoSurfaceView.A01 = 0;
            if (z) {
                videoSurfaceView.A05 = 0;
            }
        }
    }

    public void A04() {
        MediaPlayer mediaPlayer = this.A0B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0B.release();
            this.A0B = null;
            this.A01 = 0;
            this.A05 = 0;
        }
    }

    public boolean A05() {
        int i;
        if (this.A0B == null || (i = this.A01) == -1 || i == 0 || i == 1) {
            return false;
        }
        return true;
    }

    public int getAudioSessionId() {
        if (this.A0G == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A0G = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.A0G;
    }

    public int getBufferPercentage() {
        if (this.A0B != null) {
            return this.A00;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r2 > r5) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A07
            int r2 = android.view.View.getDefaultSize(r0, r8)
            int r0 = r7.A06
            int r4 = android.view.View.getDefaultSize(r0, r9)
            int r0 = r7.A07
            if (r0 <= 0) goto L_0x0035
            int r0 = r7.A06
            if (r0 <= 0) goto L_0x0035
            int r6 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 != r0) goto L_0x004a
            if (r2 != r0) goto L_0x004a
            int r3 = r7.A07
            int r2 = r3 * r4
            int r1 = r7.A06
            int r0 = r5 * r1
            if (r2 >= r0) goto L_0x007e
            int r2 = r2 / r1
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "videoview/setMeasuredDimension: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "x"
            X.C36321k7.A1T(r0, r1, r4)
            r7.setMeasuredDimension(r2, r4)
            return
        L_0x004a:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L_0x005b
            int r1 = r7.A06
            int r1 = r1 * r5
            int r0 = r7.A07
            int r1 = r1 / r0
            if (r2 != r3) goto L_0x0059
            if (r1 <= r4) goto L_0x0059
            goto L_0x0082
        L_0x0059:
            r4 = r1
            goto L_0x0082
        L_0x005b:
            if (r2 != r0) goto L_0x0068
            int r2 = r7.A07
            int r2 = r2 * r4
            int r0 = r7.A06
            int r2 = r2 / r0
            if (r6 != r3) goto L_0x0035
            if (r2 <= r5) goto L_0x0035
            goto L_0x0082
        L_0x0068:
            int r1 = r7.A07
            int r0 = r7.A06
            if (r2 != r3) goto L_0x007b
            if (r0 <= r4) goto L_0x007b
            int r2 = r4 * r1
            int r2 = r2 / r0
        L_0x0073:
            if (r6 != r3) goto L_0x0035
            if (r2 <= r5) goto L_0x0035
            int r0 = r0 * r5
            int r4 = r0 / r1
            goto L_0x0082
        L_0x007b:
            r2 = r1
            r4 = r0
            goto L_0x0073
        L_0x007e:
            if (r2 <= r0) goto L_0x0082
            int r4 = r0 / r3
        L_0x0082:
            r2 = r5
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.VideoSurfaceView.onMeasure(int, int):void");
    }

    public void setLooping(boolean z) {
        this.A0J = z;
        MediaPlayer mediaPlayer = this.A0B;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0K = z;
        MediaPlayer mediaPlayer = this.A0B;
        if (mediaPlayer != null) {
            float A032 = C90514aH.A03(z ? 1 : 0);
            mediaPlayer.setVolume(A032, A032);
        }
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public boolean canPause() {
        return this.A0D;
    }

    public boolean canSeekBackward() {
        return this.A0E;
    }

    public boolean canSeekForward() {
        return this.A0F;
    }

    public int getCurrentPosition() {
        if (!A05()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A0B;
        C18740tg.A06(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        if (!A05()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A0B;
        C18740tg.A06(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    public boolean isPlaying() {
        if (A05()) {
            MediaPlayer mediaPlayer = this.A0B;
            C18740tg.A06(mediaPlayer);
            if (!mediaPlayer.isPlaying()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoSurfaceView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoSurfaceView.class.getName());
    }

    public void pause() {
        if (A05()) {
            MediaPlayer mediaPlayer = this.A0B;
            C18740tg.A06(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.A0B.pause();
                this.A01 = 4;
            }
        }
        this.A05 = 4;
    }

    public void seekTo(int i) {
        if (A05()) {
            MediaPlayer mediaPlayer = this.A0B;
            C18740tg.A06(mediaPlayer);
            mediaPlayer.seekTo(i);
            i = -1;
        }
        this.A02 = i;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str), (Map) null);
    }

    public void start() {
        if (A05()) {
            MediaPlayer mediaPlayer = this.A0B;
            C18740tg.A06(mediaPlayer);
            mediaPlayer.start();
            this.A01 = 3;
        }
        this.A05 = 3;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A08 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A09 = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A0A = onPreparedListener;
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public void setVideoURI(Uri uri, Map map) {
        this.A0H = uri;
        this.A0I = map;
        this.A02 = -1;
        A02(this);
        requestLayout();
        invalidate();
    }

    public VideoSurfaceView(Context context) {
        super(context);
        A01();
    }
}
