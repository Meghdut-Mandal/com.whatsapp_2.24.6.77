package X;

import android.view.SurfaceHolder;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7qo  reason: invalid class name and case insensitive filesystem */
public class C163817qo implements SurfaceHolder.Callback {
    public Object A00;
    public final int A01;

    public C163817qo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r2.A06 != r7) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            int r0 = r3.A01
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "videoview/surfaceChanged: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "x"
            X.C36321k7.A1T(r0, r1, r7)
            java.lang.Object r2 = r3.A00
            com.whatsapp.videoplayback.VideoSurfaceView r2 = (com.whatsapp.videoplayback.VideoSurfaceView) r2
            r2.A04 = r6
            r2.A03 = r7
            int r0 = r2.A07
            if (r0 != r6) goto L_0x0026
            int r0 = r2.A06
            r1 = 1
            if (r0 == r7) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            android.media.MediaPlayer r0 = r2.A0B
            if (r0 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            int r0 = r2.A02
            if (r0 < 0) goto L_0x0034
            r2.seekTo(r0)
        L_0x0034:
            int r1 = r2.A05
            r0 = 3
            if (r1 != r0) goto L_0x003c
            r2.start()
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r0 = r3.A00
            X.6ET r0 = (X.AnonymousClass6ET) r0
            X.70u r1 = r0.A01
            if (r1 == 0) goto L_0x003c
            android.view.Surface r0 = r4.getSurface()
            r1.A0D(r0, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163817qo.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.A01 != 0) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
            videoSurfaceView.A0C = surfaceHolder;
            VideoSurfaceView.A02(videoSurfaceView);
            return;
        }
        AnonymousClass6ET r2 = (AnonymousClass6ET) this.A00;
        C1493370u r1 = r2.A01;
        if (r1 != null) {
            r1.A0B(surfaceHolder.getSurface());
            r2.A01.setCornerRadius(r2.A00);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.A01 != 0) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
            videoSurfaceView.A02 = videoSurfaceView.getCurrentPosition();
            videoSurfaceView.A0C = null;
            VideoSurfaceView.A03(videoSurfaceView, true);
            return;
        }
        C1493370u r1 = ((AnonymousClass6ET) this.A00).A01;
        if (r1 != null) {
            r1.A0C(surfaceHolder.getSurface());
        }
    }
}
