package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Handler;
import com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.5Nn  reason: invalid class name and case insensitive filesystem */
public final class C107305Nn extends VoipPhysicalCamera {
    public VirtualDisplay A00;
    public Image A01;
    public ImageReader A02;
    public AnonymousClass6PE A03;
    public VoipPhysicalCamera.CameraInfo A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final MediaProjection A08;
    public final C30531aM A09;
    public final C91424bz A0A;
    public final C131176Oa A0B;
    public final ScreenShareResourceManager A0C;
    public final C005502l A0D;
    public final C005502l A0E;

    public int disableAREffectOnCameraThread() {
        return -1;
    }

    public int enableAREffectOnCameraThread(C128656Dc r2, AnonymousClass7d4 r3) {
        return -1;
    }

    public Point getAdjustedPreviewSize() {
        return null;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C124015xS getLastCachedFrame() {
        return null;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return 0;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public void onScreenShareInfoChanged(AnonymousClass6PE r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (!this.A05) {
            C18740tg.A0D(false, "ScreenShareCaptureDevice Screen sharing not active, change ignored");
        } else if (!AnonymousClass00C.A0J(this.A03, r3)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ScreenShareCaptureDevice/onScreenShareInfoChanged -- w: ");
            A0u.append(r3.A02);
            A0u.append(", h: ");
            C36321k7.A1Y(A0u, r3.A01);
            Number number = (Number) syncRunOnCameraThread(new C163757qi(this, r3, 2), -100);
            if (number != null) {
                number.intValue();
            }
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public void updatePreviewOrientation() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C107305Nn(Context context, MediaProjection mediaProjection, C30531aM r12, AnonymousClass6PE r13, C131176Oa r14, ScreenShareResourceManager screenShareResourceManager, C20810yC r16, AnonymousClass13J r17, int i, int i2, int i3) {
        super(context, r16, r17, (AnonymousClass9NK) null);
        C005602m r2 = AnonymousClass19R.A00;
        AnonymousClass03P A0y = C36401kF.A0y();
        C90494aF.A11(r2, 12, A0y);
        this.A09 = r12;
        this.A08 = mediaProjection;
        this.A03 = r13;
        this.A0B = r14;
        this.A0C = screenShareResourceManager;
        this.A0D = r2;
        this.A0E = A0y;
        this.A0A = new C91424bz(context, this);
        AnonymousClass6PE r0 = this.A03;
        int i4 = r0.A02;
        int i5 = r0.A01;
        VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i4, i5, i2, i3, false, 0, i);
        this.A04 = cameraInfo;
        ImageReader newInstance = ImageReader.newInstance(i4, i5, cameraInfo.format, 3);
        AnonymousClass00C.A08(newInstance);
        newInstance.setOnImageAvailableListener(new C133626Zi(this), this.cameraThreadHandler);
        this.A02 = newInstance;
        screenShareResourceManager.setMediaProjectionHandle(mediaProjection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != r2.A01) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C107305Nn r10) {
        /*
            android.hardware.display.VirtualDisplay r3 = r10.A00
            android.media.ImageReader r0 = r10.A02
            int r1 = r0.getWidth()
            X.6PE r2 = r10.A03
            int r0 = r2.A02
            if (r1 != r0) goto L_0x001a
            android.media.ImageReader r0 = r10.A02
            int r1 = r0.getHeight()
            X.6PE r2 = r10.A03
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0050
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ScreenShareCaptureDevice recreating capture for w: "
            r1.append(r0)
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", h: "
            r1.append(r0)
            int r0 = r2.A01
            X.C36321k7.A1Y(r1, r0)
            X.6PE r0 = r10.A03
            int r4 = r0.A02
            int r2 = r0.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r10.A04
            int r1 = r0.format
            r0 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r4, r2, r1, r0)
            X.AnonymousClass00C.A08(r2)
            X.6Zi r1 = new X.6Zi
            r1.<init>(r10)
            android.os.Handler r0 = r10.cameraThreadHandler
            r2.setOnImageAvailableListener(r1, r0)
            r10.A02 = r2
        L_0x0050:
            if (r3 == 0) goto L_0x007b
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "ScreenShareCaptureDevice resizing VirtualDisplay"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6PE r0 = r10.A03
            int r2 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r3.resize(r2, r1, r0)
            android.media.ImageReader r0 = r10.A02
            android.view.Surface r0 = r0.getSurface()
            r3.setSurface(r0)
        L_0x0071:
            r10.startPeriodicCameraCallbackCheck()
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.scheduleLastFrameResend(r0)
            r0 = 0
            return r0
        L_0x007b:
            android.media.projection.MediaProjection r1 = r10.A08     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            java.lang.String r2 = "wa_screen_sharing"
            X.6PE r0 = r10.A03     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            int r3 = r0.A02     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            int r4 = r0.A01     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            int r5 = r0.A00     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            r6 = 16
            android.media.ImageReader r0 = r10.A02     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            android.view.Surface r7 = r0.getSurface()     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            r8 = 0
            r9 = r8
            android.hardware.display.VirtualDisplay r0 = r1.createVirtualDisplay(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            r10.A00 = r0     // Catch:{ SecurityException -> 0x00a1, IllegalStateException -> 0x0098 }
            goto L_0x0071
        L_0x0098:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Unable to start screen capture in state"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -14
            return r0
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Invalid MediaProjection, unable to start screen capture"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107305Nn.A00(X.5Nn):int");
    }

    public static final void A01(Image image, C107305Nn r13) {
        r13.scheduleLastFrameResend(1000);
        if (image != null) {
            Iterator A0z = AnonymousClass000.A0z(r13.virtualCameras);
            while (A0z.hasNext()) {
                VoipCamera voipCamera = (VoipCamera) A0z.next();
                if (voipCamera.started) {
                    r13.updateCameraCallbackCheck();
                    C131176Oa r9 = r13.A0B;
                    long j = r13.cameraCallbackCount;
                    long j2 = r13.totalElapsedCameraCallbackTime;
                    C128896Ea r10 = r9.A0O;
                    if (r10.A01) {
                        r10.A00();
                        r9.A0F = Math.max(r9.A0F, r10.A00);
                        r10.A01();
                    }
                    r9.A0A = j;
                    r9.A0E = j2;
                    C007403e r0 = r9.A0G;
                    if (r0 != null) {
                        r0.B2S((CancellationException) null);
                    }
                    r9.A0G = C36391kE.A12(new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(r9, (C023509x) null), C009403z.A02(r9.A0P));
                    voipCamera.abgrFramePlaneCallback(image.getWidth(), image.getHeight(), image.getPlanes()[0].getBuffer(), image.getPlanes()[0].getRowStride());
                }
            }
            if (!AnonymousClass00C.A0J(r13.A01, image)) {
                Image image2 = r13.A01;
                if (image2 != null) {
                    image2.close();
                }
                r13.A01 = null;
            }
            r13.A01 = image;
            if (!r13.A07) {
                r13.A07 = true;
                Log.i("ScreenShareCaptureDevice First frame rendered");
            }
        }
    }

    public void closeOnCameraThread() {
        if (!this.A06) {
            Log.i("ScreenShareCaptureDevice/closeOnCameraThread stop MediaProjection");
            this.A0C.clearMediaProjectionHandle();
            this.A08.stop();
        }
        this.A02.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        Image image = this.A01;
        if (image != null) {
            image.close();
        }
        this.A01 = null;
        this.A02.close();
        this.cameraEventsDispatcher.A00();
    }

    public void resendLastFrame() {
        A01(this.A01, this);
    }

    public int startOnCameraThread() {
        if (!this.A05) {
            A02(this);
        }
        this.A08.registerCallback(this.A0A, this.cameraThreadHandler);
        int A002 = A00(this);
        if (A002 != 0) {
            C36321k7.A1S("ScreenShareCaptureDevice Failed to setup screen capture: ", AnonymousClass000.A0u(), A002);
            return A002;
        }
        this.A05 = true;
        return 0;
    }

    public static final void A02(C107305Nn r6) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenShareCaptureDevice notifyFormatChange: ");
        VoipPhysicalCamera.CameraInfo cameraInfo = r6.A04;
        A0u.append(cameraInfo.width);
        A0u.append(" x ");
        C36321k7.A1Y(A0u, cameraInfo.height);
        Iterator A0z = AnonymousClass000.A0z(r6.virtualCameras);
        while (A0z.hasNext()) {
            VoipCamera voipCamera = (VoipCamera) A0z.next();
            if (voipCamera.started) {
                VoipPhysicalCamera.CameraInfo cameraInfo2 = r6.A04;
                voipCamera.formatChangeCallback(cameraInfo2.width, cameraInfo2.height, cameraInfo2.format, cameraInfo2.fps1000);
            }
        }
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.A04;
    }

    public boolean isCameraOpen() {
        return this.A05;
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        clearLastFrameResendMessages();
        this.A08.unregisterCallback(this.A0A);
        VirtualDisplay virtualDisplay = this.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.A00 = null;
        this.A05 = false;
        return 0;
    }
}
