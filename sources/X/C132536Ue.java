package X;

import android.hardware.Camera;
import android.media.MediaRecorder;

/* renamed from: X.6Ue  reason: invalid class name and case insensitive filesystem */
public class C132536Ue {
    public boolean A00;
    public final AnonymousClass17Y A01;
    public final C123725wz A02;
    public final C1255560i A03;
    public final C19770wU A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.SurfaceView r4, X.C119125pH r5, X.C143246qE r6, X.C1255560i r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0038
            android.media.MediaRecorder r0 = r6.A04
            X.C18740tg.A06(r0)
            r0.stop()
            A02(r6)
            android.hardware.Camera r0 = r6.A03
            X.C18740tg.A06(r0)
            r0.lock()
            r0 = 0
        L_0x0018:
            r6.A0B = r0
        L_0x001a:
            X.6lc r1 = r5.A01
            r0 = 48
            java.lang.Object r0 = X.C140456lc.A0I(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = java.lang.Integer.parseInt(r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 5
            X.74n r2 = new X.74n
            r2.<init>(r6, r5, r7, r0)
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x0038:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r6.A04 = r0
            android.hardware.Camera r0 = r6.A03
            X.C18740tg.A06(r0)
            r0.unlock()
            android.media.MediaRecorder r1 = r6.A04
            android.hardware.Camera r0 = r6.A03
            r1.setCamera(r0)
            android.media.MediaRecorder r0 = r6.A04
            r2 = 1
            r0.setVideoSource(r2)
            int r0 = r6.A00
            r1 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00f2
            int r0 = r6.A00
            r1 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00f2
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r2)
        L_0x006c:
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.fileFormat
            r1.setOutputFormat(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoFrameRate
            r1.setVideoFrameRate(r0)
            android.media.MediaRecorder r2 = r6.A04
            int r1 = r3.videoFrameWidth
            int r0 = r3.videoFrameHeight
            r2.setVideoSize(r1, r0)
            android.media.MediaRecorder r1 = r6.A04
            r0 = 256000(0x3e800, float:3.58732E-40)
            r1.setVideoEncodingBitRate(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoCodec
            r1.setVideoEncoder(r0)
            X.6lc r1 = r5.A01
            r0 = 46
            java.lang.Object r1 = X.C140456lc.A0I(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "yyyyMMdd_HHmmss"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r1.format(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VID_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".mp4"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
        L_0x00c4:
            java.io.File r0 = r7.A00(r1)
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.getPath()
            android.media.MediaRecorder r0 = r6.A04
            r0.setOutputFile(r1)
            android.media.MediaRecorder r1 = r6.A04
            X.53i r0 = r6.A06
            X.C18740tg.A04(r0)
            int r0 = r0.getDisplayOrientation()
            int r0 = 360 - r0
            r1.setOrientationHint(r0)
            android.media.MediaRecorder r1 = r6.A04
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1.setPreviewDisplay(r0)
            goto L_0x00fa
        L_0x00f2:
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r1)
            goto L_0x006c
        L_0x00fa:
            android.media.MediaRecorder r0 = r6.A04     // Catch:{ IOException | IllegalStateException -> 0x010a }
            r0.prepare()     // Catch:{ IOException | IllegalStateException -> 0x010a }
            android.media.MediaRecorder r0 = r6.A04
            X.C18740tg.A06(r0)
            r0.start()
            r0 = 1
            goto L_0x0018
        L_0x010a:
            r0 = move-exception
            r0.getMessage()
            A02(r6)
            A02(r6)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132536Ue.A00(android.view.SurfaceView, X.5pH, X.6qE, X.60i):void");
    }

    public static void A02(C143246qE r1) {
        MediaRecorder mediaRecorder = r1.A04;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            r1.A04.release();
            r1.A04 = null;
            Camera camera = r1.A03;
            if (camera != null) {
                camera.lock();
            }
        }
    }

    public C132536Ue(AnonymousClass17Y r1, C123725wz r2, C1255560i r3, C19770wU r4) {
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C119125pH r6, X.C143246qE r7, X.C1255560i r8) {
        /*
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.String r2 = r7.A08
            int r1 = r2.hashCode()
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            r5 = 1
            if (r1 == r0) goto L_0x007d
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 == r0) goto L_0x0075
            r0 = 124969519(0x772e22f, float:1.8272526E-34)
            if (r1 != r0) goto L_0x0023
            java.lang.String r0 = "image_and_video"
            boolean r0 = r2.equals(r0)
            r4 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r4 = -1
        L_0x0024:
            java.lang.String r2 = "video_file_name"
            if (r4 == 0) goto L_0x006f
            java.lang.String r1 = "image_file_name"
            if (r4 == r5) goto L_0x004e
            java.lang.String r0 = r7.A07
            r3.put(r1, r0)
        L_0x0031:
            X.6lc r5 = r6.A01
            r0 = 44
            X.7ku r4 = r5.A0X(r0)
            if (r4 == 0) goto L_0x004d
            X.68b r2 = X.C1273868b.A00()
            r1 = 0
            java.util.HashMap r0 = X.C129386Gs.A01(r3)
            X.6MO r1 = X.C1273868b.A04(r2, r0, r1)
            X.67i r0 = r6.A00
            X.C131756Qk.A02(r0, r5, r1, r4)
        L_0x004d:
            return
        L_0x004e:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x005f
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x005f
            X.53i r0 = r7.A06
            X.C18740tg.A04(r0)
            A00(r0, r6, r7, r8)
            return
        L_0x005f:
            java.lang.String r0 = r7.A07
            r3.put(r1, r0)
            java.lang.String r0 = r7.A09
            r3.put(r2, r0)
            r0 = 0
            r7.A0C = r0
            r7.A0A = r0
            goto L_0x0031
        L_0x006f:
            java.lang.String r0 = r7.A09
            r3.put(r2, r0)
            goto L_0x0031
        L_0x0075:
            java.lang.String r0 = "video"
            boolean r0 = r2.equals(r0)
            r4 = 0
            goto L_0x0021
        L_0x007d:
            java.lang.String r0 = "image"
            boolean r0 = r2.equals(r0)
            r4 = 2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132536Ue.A01(X.5pH, X.6qE, X.60i):void");
    }
}
