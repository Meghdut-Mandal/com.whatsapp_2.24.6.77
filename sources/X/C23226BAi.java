package X;

import android.media.MediaRecorder;
import android.util.Pair;

/* renamed from: X.BAi  reason: case insensitive filesystem */
public class C23226BAi implements C159927kB {
    public Object A00;
    public final int A01;

    public C23226BAi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Baa(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
        if (this.A01 == 0) {
            AnonymousClass9VB r0 = C202389lj.A00;
            new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            C202389lj.A00();
        }
    }

    public void BgR(MediaRecorder mediaRecorder) {
        String str;
        String str2;
        String str3;
        if (this.A01 != 0) {
            try {
                mediaRecorder.setVideoSource(2);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "";
                }
                str2 = "Camera2Device.setVideoRecordingSource";
                C202389lj.A02(str2, str);
            }
        } else {
            try {
                ((A29) this.A00).A0B(mediaRecorder);
            } catch (Exception e2) {
                if (e2.getMessage() != null) {
                    str3 = e2.getMessage();
                } else {
                    str3 = "";
                }
                str2 = "Camera1Device.setVideoRecordingSource";
                C202389lj.A02(str2, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (java.lang.Boolean.TRUE.equals(r5.A08(X.C201049ih.A0J)) == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BhG(android.media.MediaRecorder r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0023
            java.lang.Object r3 = r10.A00
            X.A28 r3 = (X.A28) r3
            X.9gr r1 = r3.A0X
            java.lang.String r0 = "Method onStartMediaRecorder() must run on the Optic Background Thread."
            r1.A06(r0)
            X.9n4 r4 = r3.A0R
            X.9VN r2 = r4.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r2.A01(r0)
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0024
            java.lang.String r1 = "Camera2Device"
            java.lang.String r0 = "Can not start video recording, PreviewController is not prepared"
            X.C202389lj.A03(r1, r0)
        L_0x0023:
            return
        L_0x0024:
            X.9St r1 = r3.A0S
            r0 = 1
            r1.A0C = r0
            android.view.Surface r7 = r11.getSurface()
            java.lang.String r0 = "Cannot start video recording."
            r2.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.A02
            if (r0 == 0) goto L_0x00c2
            android.view.Surface r0 = r4.A04
            if (r0 == 0) goto L_0x00c2
            X.9dX r1 = r4.A0E
            if (r1 == 0) goto L_0x004d
            X.9Ci r0 = X.C198429dX.A0W
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "Cannot start video native capture, not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x004d:
            X.9dX r1 = r4.A0E
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x006e
            X.9Ci r0 = X.C198429dX.A0F
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x006e
            X.88m r5 = r4.A0A
            if (r5 == 0) goto L_0x006e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Cj r0 = X.C201049ih.A0J
            java.lang.Object r0 = r5.A08(r0)
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r9 = 0
        L_0x006f:
            r0 = 0
            X.9JM r8 = new X.9JM
            r8.<init>(r7, r3, r0)
            android.view.Surface r6 = r4.A04
            X.9JM r5 = new X.9JM
            r5.<init>(r6, r3, r0)
            if (r9 == 0) goto L_0x0089
            X.9JM r8 = new X.9JM
            r8.<init>(r7, r2, r0)
            X.9JM r5 = new X.9JM
            r5.<init>(r6, r2, r0)
        L_0x0089:
            r4.A05 = r7
            r0 = 2
            X.9JM[] r0 = new X.AnonymousClass9JM[r0]
            r0[r3] = r5
            java.util.List r1 = X.C90524aI.A0p(r8, r0, r2)
            X.B31 r0 = r4.A09
            if (r0 == 0) goto L_0x009b
            r0.close()
        L_0x009b:
            java.lang.String r0 = "record_video_on_camera_thread"
            X.B31 r0 = X.C202989n4.A00(r4, r0, r1, r9)
            r4.A09 = r0
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.A02
            r0.addTarget(r7)
            X.A2F r1 = r4.A08
            java.util.Objects.requireNonNull(r1)
            r0 = 7
            r1.A0F = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A09 = r0
            r0 = 0
            r1.A02 = r0
            r4.A09(r3)
            java.lang.String r0 = "Preview session was closed while starting recording."
            r4.A0A(r2, r0)
            return
        L_0x00c2:
            java.lang.String r0 = "Cannot start video recording, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23226BAi.BhG(android.media.MediaRecorder):void");
    }
}
