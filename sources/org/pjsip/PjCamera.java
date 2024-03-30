package org.pjsip;

import X.AnonymousClass000;
import X.AnonymousClass13J;
import X.AnonymousClass7d4;
import X.AnonymousClass9NK;
import X.B3F;
import X.B8U;
import X.C1272467n;
import X.C128656Dc;
import X.C140206lD;
import X.C165617ti;
import X.C18740tg;
import X.C195779Vx;
import X.C20810yC;
import X.C20973A1j;
import X.C21060yb;
import X.C21628ASu;
import X.C23058B2e;
import X.C23190B8y;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36441kJ;
import X.C90464aC;
import X.C90494aF;
import X.C90504aG;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.Image;
import android.media.ImageReader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public final AtomicInteger cameraStartMode = new AtomicInteger(0);
    public final Object frameLock = C36441kJ.A11();
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public boolean receivedCameraError = false;
    public final C21060yb systemServices;

    private int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode.incrementAndGet();
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode.get() > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PjCamera(Context context, C20810yC r13, AnonymousClass13J r14, C21060yb r15, AnonymousClass9NK r16, int i, int i2, int i3, int i4, int i5) {
        super(context, r13, r14, r16);
        Class<PjCamera> cls = PjCamera.class;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/create idx: ");
        int i6 = i;
        A0u.append(i6);
        A0u.append(", size:");
        int i7 = i2;
        C90494aF.A1L(A0u, i7);
        int i8 = i3;
        A0u.append(i8);
        A0u.append(", format: 0x");
        int i9 = i4;
        C90504aG.A0z(i9, A0u);
        A0u.append(", fps * 1000: ");
        int i10 = i5;
        A0u.append(i10);
        A0u.append(", this ");
        A0u.append(this);
        A0u.append(", class ");
        Class<?> cls2 = getClass();
        A0u.append(cls2);
        A0u.append("@");
        A0u.append(cls2.hashCode());
        A0u.append(", class loader ");
        A0u.append(cls.getClassLoader());
        A0u.append(", hash: ");
        C36321k7.A1Y(A0u, System.identityHashCode(cls.getClassLoader()));
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i6, cameraInfo2);
        this.systemServices = r15;
        this.camIdx = i6;
        this.cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1O(cameraInfo2.facing), cameraInfo2.orientation, i6);
    }

    private int preparePreviewOnCameraThread() {
        C18740tg.A06(this.videoPort);
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        createTexture(cameraInfo2.width, cameraInfo2.height);
        try {
            C23058B2e b2e = this.cameraProcessor;
            if (b2e == null || this.textureHolder == null || !this.cameraProcessorEnabled) {
                C1272467n r0 = this.textureHolder;
                if (r0 != null) {
                    Camera camera2 = this.camera;
                    C18740tg.A06(camera2);
                    camera2.setPreviewTexture(r0.A01);
                } else {
                    Log.e("voip/video/VoipCamera/ Failed to create Surface Texture");
                    this.cameraProcessor = null;
                    return -12;
                }
            } else {
                C140206lD r02 = ((C21628ASu) b2e).A07;
                SurfaceTexture surfaceTexture = r02.A03;
                if (surfaceTexture == null) {
                    surfaceTexture = C140206lD.A00(r02);
                }
                VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                surfaceTexture.setDefaultBufferSize(cameraInfo3.width, cameraInfo3.height);
                Camera camera3 = this.camera;
                C18740tg.A06(camera3);
                camera3.setPreviewTexture(surfaceTexture);
            }
            this.videoPort.setScaleType(0);
            return 0;
        } catch (IOException e) {
            Log.e((Throwable) e);
            return -2;
        }
    }

    private int setVideoPortOnCameraThreadInternal(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i = 0;
        if (videoPort2 != videoPort) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            A0u.append(AnonymousClass000.A0J(videoPort));
            A0u.append(" from ");
            A0u.append(AnonymousClass000.A0J(videoPort2));
            A0u.append(", running: ");
            C36331k8.A1S(A0u, this.isRunning);
            if (!this.isRunning) {
                this.videoPort = videoPort;
                if (!(videoPort == null || (i = startOnCameraThread()) == 0)) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                }
            } else if (videoPort != null) {
                stopPreviewOnCameraThread(true);
                this.videoPort = videoPort;
                if (preparePreviewOnCameraThread() != 0) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                    return -7;
                }
                if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                    Camera camera2 = this.camera;
                    C18740tg.A06(camera2);
                    camera2.setPreviewCallback(this);
                } else {
                    Camera camera3 = this.camera;
                    C18740tg.A06(camera3);
                    camera3.setPreviewCallback((Camera.PreviewCallback) null);
                }
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread();
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            } else {
                int stopOnCameraThread = stopOnCameraThread();
                this.videoPort = null;
                return stopOnCameraThread;
            }
        }
        return i;
    }

    private void stopPreviewOnCameraThread(boolean z) {
        if (z && !this.receivedCameraError) {
            try {
                Camera camera2 = this.camera;
                C18740tg.A06(camera2);
                camera2.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                this.camera.stopPreview();
            } catch (RuntimeException e) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e);
            }
        }
        releaseTexture();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r1.getRotation() == 2) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAdjustedPreviewSizeOnCameraThread() {
        /*
            r5 = this;
            X.0yb r0 = r5.systemServices
            android.view.WindowManager r0 = r0.A0L()
            android.view.Display r1 = r0.getDefaultDisplay()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            int r0 = r0.orientation
            int r0 = r0 % 180
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            int r0 = r1.getRotation()
            if (r0 == 0) goto L_0x0023
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r3 == r0) goto L_0x0027
            r4 = 0
        L_0x0027:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            if (r4 == 0) goto L_0x0037
            int r2 = r0.width
            int r1 = r0.height
        L_0x002f:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.adjustedPreviewSize = r0
            return
        L_0x0037:
            int r2 = r0.height
            int r1 = r0.width
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updateAdjustedPreviewSizeOnCameraThread():void");
    }

    /* access modifiers changed from: private */
    public int updatePreviewOrientationOnCameraThread() {
        int i;
        if (this.videoPort == null || !this.isRunning) {
            return -1;
        }
        int rotation = this.systemServices.A0L().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i = 90;
        } else if (rotation != 2) {
            i = 270;
            if (rotation != 3) {
                i = 0;
            }
        } else {
            i = 180;
        }
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        boolean z = cameraInfo2.isFrontCamera;
        int i2 = cameraInfo2.orientation;
        int i3 = (i2 - i) + 360;
        if (z) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/updatePreviewOrientationOnCameraThread to ");
        A0u.append(i4);
        A0u.append(" degree. Camera #");
        A0u.append(this.camIdx);
        A0u.append(", facing front: ");
        A0u.append(z);
        A0u.append(", camera orientation: ");
        A0u.append(i2);
        C36321k7.A1T(", activity rotation: ", A0u, i);
        try {
            Camera camera2 = this.camera;
            C18740tg.A06(camera2);
            camera2.setDisplayOrientation(i4);
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        updateAdjustedPreviewSizeOnCameraThread();
        return 0;
    }

    public void closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        C18740tg.A0D(!this.isRunning, "close should only be called after stop.");
        this.cameraEventsDispatcher.A00();
        if (this.cameraProcessorEnabled) {
            this.cameraProcessorEnabled = false;
            C23058B2e b2e = this.cameraProcessor;
            if (b2e != null) {
                b2e.Bqn((C128656Dc) null, (AnonymousClass7d4) null);
                C20973A1j a1j = ((C21628ASu) this.cameraProcessor).A05;
                a1j.pause();
                a1j.destroy();
                this.cameraProcessor = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int disableAREffectOnCameraThread() {
        /*
            r7 = this;
            java.lang.String r0 = "voip/video/VoipCamera/ Disabling AREffect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.cameraProcessorEnabled
            r6 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "voip/video/VoipCamera/ AREffect already disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000f:
            return r6
        L_0x0010:
            X.B2e r0 = r7.cameraProcessor
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "Camera processor should not be null when cameraProcessorEnabled is true"
            X.C18740tg.A0D(r1, r0)
            r7.cameraProcessorEnabled = r6
            X.B2e r0 = r7.cameraProcessor
            if (r0 == 0) goto L_0x003a
            r1 = 0
            X.ASu r0 = (X.C21628ASu) r0
            r0.A01 = r1
            r0.A02 = r1
            X.C21628ASu.A00(r0)
            X.B2e r0 = r7.cameraProcessor
            r0.Bqn(r1, r1)
            X.B2e r0 = r7.cameraProcessor
            X.ASu r0 = (X.C21628ASu) r0
            X.A1j r0 = r0.A05
            r0.pause()
        L_0x003a:
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x005d
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x0043
            r6 = 1
        L_0x0043:
            java.lang.String r0 = "videoPort should not be null if the camera is running."
            X.C18740tg.A0D(r6, r0)
            r7.stopPreviewOnCameraThread(r2)
            int r6 = r7.preparePreviewOnCameraThread()
            if (r6 == 0) goto L_0x007d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/video/VoipCamera/ Disabling AREffect: preparePreviewOnCameraThread failed with "
            X.C36321k7.A1S(r0, r1, r6)
            r7.stopOnCameraThread()
        L_0x005d:
            java.util.Map r0 = r7.virtualCameras
            java.util.Iterator r5 = X.AnonymousClass000.A0z(r0)
        L_0x0063:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r4 = r5.next()
            com.whatsapp.voipcalling.camera.VoipCamera r4 = (com.whatsapp.voipcalling.camera.VoipCamera) r4
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r3 = r0.width
            int r2 = r0.height
            int r1 = r0.format
            int r0 = r0.fps1000
            r4.formatChangeCallback(r3, r2, r1, r0)
            goto L_0x0063
        L_0x007d:
            android.hardware.Camera r0 = r7.camera
            X.C18740tg.A06(r0)
            r0.setPreviewCallback(r7)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.disableAREffectOnCameraThread():int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int enableAREffectOnCameraThread(X.C128656Dc r8, X.AnonymousClass7d4 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "voip/video/VoipCamera/ Enabling AREffect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.cameraProcessorEnabled
            r6 = 0
            X.B2e r3 = r7.cameraProcessor
            if (r0 == 0) goto L_0x0018
            X.C18740tg.A06(r3)
            r3.Bqn(r8, r9)
            java.lang.String r0 = "voip/video/VoipCamera/ AREffect already enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0017:
            return r6
        L_0x0018:
            r2 = -11
            if (r3 != 0) goto L_0x002b
            r7.setupCameraProcessor()
            X.B2e r0 = r7.cameraProcessor
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "voip/video/VoipCamera/ Failed to set AREffect. No Camera Processor!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7.cameraProcessorEnabled = r6
            return r2
        L_0x002b:
            X.ASu r3 = (X.C21628ASu) r3
            X.A1j r0 = r3.A05
            r0.Bok()
            X.9Xt r1 = X.C1690483a.A00(r0)
            X.A1t r0 = r3.A08
            r1.A02(r0)
        L_0x003b:
            r5 = 1
            r7.cameraProcessorEnabled = r5
            X.B2e r4 = r7.cameraProcessor
            android.os.Handler r3 = r7.cameraThreadHandler
            r1 = 6
            X.B7d r0 = new X.B7d
            r0.<init>(r7, r1)
            X.ASu r4 = (X.C21628ASu) r4
            r4.A01 = r0
            r4.A02 = r3
            X.C21628ASu.A00(r4)
            X.B2e r0 = r7.cameraProcessor
            r0.Bqn(r8, r9)
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x0097
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x005f
            r6 = 1
        L_0x005f:
            java.lang.String r0 = "videoPort should not be null if the camera is running."
            X.C18740tg.A0D(r6, r0)
            r7.stopPreviewOnCameraThread(r5)
            int r0 = r7.preparePreviewOnCameraThread()
            if (r0 != 0) goto L_0x0083
            X.B2e r0 = r7.cameraProcessor
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "voip/video/VoipCamera/ Failed to attach cameraProcessor. Will fail this call and stop camera"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0076:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/video/VoipCamera/ Enable AREffect: Failed to preparePreviewOnCameraThread with "
            X.C36321k7.A1S(r0, r1, r2)
            r7.stopOnCameraThread()
            return r2
        L_0x0083:
            r2 = r0
            goto L_0x0076
        L_0x0085:
            android.hardware.Camera r1 = r7.camera
            X.C18740tg.A06(r1)
            r0 = 0
            r1.setPreviewCallback(r0)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
        L_0x0097:
            java.util.Map r0 = r7.virtualCameras
            java.util.Iterator r4 = X.AnonymousClass000.A0z(r0)
        L_0x009d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r3 = r4.next()
            com.whatsapp.voipcalling.camera.VoipCamera r3 = (com.whatsapp.voipcalling.camera.VoipCamera) r3
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r2 = r0.width
            int r1 = r0.height
            int r0 = r0.fps1000
            r3.formatChangeCallback(r2, r1, r5, r0)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.enableAREffectOnCameraThread(X.6Dc, X.7d4):int");
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo2.width, cameraInfo2.height, 1, cameraInfo2.fps1000, cameraInfo2.isFrontCamera, cameraInfo2.orientation, cameraInfo2.idx);
        }
        return cameraInfo2;
    }

    public int getCameraStartMode() {
        return this.cameraStartMode.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0.isFrontCamera == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r8.cameraProcessorEnabled == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C124015xS getLastCachedFrame() {
        /*
            r8 = this;
            byte[] r2 = r8.lastCachedFrameData
            if (r2 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            X.B2e r0 = r8.cameraProcessor
            if (r0 == 0) goto L_0x000f
            boolean r0 = r8.cameraProcessorEnabled
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r8.cameraInfo
            int r3 = r0.width
            int r4 = r0.height
            if (r1 == 0) goto L_0x0029
            r5 = 1
        L_0x0019:
            int r6 = r0.orientation
            if (r1 != 0) goto L_0x0022
            boolean r0 = r0.isFrontCamera
            r7 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            X.5xS r1 = new X.5xS
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0029:
            int r5 = r0.format
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.getLastCachedFrame():X.5xS");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        C18740tg.A0D(this.passiveMode, "Should be here only in passive mode");
        if (!this.passiveMode) {
            return -1;
        }
        synchronized (this.frameLock) {
            if (!this.newFrameAvailable) {
                return 0;
            }
            int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
            byteBuffer.rewind();
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(this.lastCachedFrameData, 0, min);
            this.newFrameAvailable = false;
            return min;
        }
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        C1272467n r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
            videoPort.renderTexture(r2, cameraInfo2.width, cameraInfo2.height);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera2) {
        byte[] bArr2;
        if (camera2 != null && bArr != null) {
            Camera camera3 = this.camera;
            if (camera2 != camera3) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unexpected camera in callback! current camera = ");
                A0u.append(camera3);
                C36321k7.A1L(camera2, ", callback camera is ", A0u);
                return;
            }
            updateCameraCallbackCheck();
            if (this.isRunning) {
                if (this.passiveMode) {
                    synchronized (this.frameLock) {
                        bArr2 = this.lastCachedFrameData;
                        this.lastCachedFrameData = bArr;
                        this.newFrameAvailable = true;
                    }
                    bArr = bArr2;
                } else {
                    Iterator A0y = AnonymousClass000.A0y(this.virtualCameras);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        if (((VoipCamera) A11.getValue()).started) {
                            ((VoipCamera) A11.getValue()).frameCallback(bArr, bArr.length);
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            if (this.cameraStartMode.get() == 0) {
                camera2.addCallbackBuffer(bArr);
            }
        }
    }

    public int startOnCameraThread() {
        StringBuilder sb;
        String str;
        List<int[]> supportedPreviewFpsRange;
        if (!this.isRunning) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = ");
            A0u.append(this.videoPort);
            A0u.append(" at start mode: ");
            C36321k7.A1N(this.cameraStartMode, A0u);
            if (this.camera == null) {
                try {
                    Camera open = Camera.open(this.camIdx);
                    this.camera = open;
                    if (open == null) {
                        Log.e("camera is null after open");
                        return -5;
                    }
                    open.setErrorCallback(new C23190B8y(this, 1));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return -4;
                }
            }
            if (this.videoPort != null) {
                if (preparePreviewOnCameraThread() != 0) {
                    return -2;
                }
                try {
                    Camera.Parameters parameters = this.camera.getParameters();
                    VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
                    parameters.setPreviewSize(cameraInfo2.width, cameraInfo2.height);
                    parameters.setPreviewFormat(this.cameraInfo.format);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: ");
                    A0u2.append(this.cameraStartMode);
                    A0u2.append(" width: ");
                    VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                    A0u2.append(cameraInfo3.width);
                    A0u2.append(" height: ");
                    A0u2.append(cameraInfo3.height);
                    A0u2.append(" format: ");
                    C36321k7.A1Y(A0u2, cameraInfo3.format);
                    int i = 2;
                    if (this.cameraStartMode.get() > 2) {
                        this.cameraStartMode.set(2);
                    }
                    if (!(this.cameraStartMode.get() == 2 || (supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange()) == null)) {
                        int i2 = Integer.MIN_VALUE;
                        int[] iArr = null;
                        for (int[] next : supportedPreviewFpsRange) {
                            if (next.length == 2) {
                                int i3 = next[0];
                                int i4 = next[1];
                                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(i3, i4, this.cameraInfo.fps1000);
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                C90464aC.A1K("voip/video/VoipCamera/startOnCameraThread check fps [", ", ", A0u3, i3, i4);
                                C36321k7.A1T("], score: ", A0u3, fpsRangeScore);
                                if (fpsRangeScore > i2) {
                                    iArr = next;
                                    i2 = fpsRangeScore;
                                }
                            }
                        }
                        if (iArr != null) {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                            A0u4.append(iArr[0]);
                            A0u4.append(", ");
                            A0u4.append(iArr[1]);
                            A0u4.append("], score: ");
                            A0u4.append(i2);
                            A0u4.append(", supported ranges : ");
                            C36321k7.A1a(A0u4, parameters.get("preview-fps-range-values"));
                            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        }
                    }
                    if (this.cameraStartMode.get() == 0) {
                        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null) {
                            if (supportedFocusModes.contains("continuous-video")) {
                                parameters.setFocusMode("continuous-video");
                            } else if (supportedFocusModes.contains("infinity")) {
                                parameters.setFocusMode("infinity");
                            }
                        }
                        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                        if (!(supportedFlashModes == null || parameters.getFlashMode() == null || !supportedFlashModes.contains("off"))) {
                            parameters.setFlashMode("off");
                        }
                        if (parameters.isAutoExposureLockSupported()) {
                            parameters.setAutoExposureLock(false);
                        }
                        if (parameters.isAutoWhiteBalanceLockSupported()) {
                            parameters.setAutoWhiteBalanceLock(false);
                        }
                        StringBuilder A0u5 = AnonymousClass000.A0u();
                        A0u5.append("voip/video/VoipCamera/startOnCameraThread with scene mode: ");
                        A0u5.append(parameters.getSceneMode());
                        A0u5.append(", supported scene mode: [");
                        A0u5.append(parameters.get("scene-mode-values"));
                        A0u5.append("], focus mode: ");
                        A0u5.append(parameters.getFocusMode());
                        A0u5.append(", supported focus mode: [");
                        A0u5.append(parameters.get("focus-mode-values"));
                        A0u5.append("], flash mode: ");
                        A0u5.append(parameters.getFlashMode());
                        A0u5.append(", supported flash mode: [");
                        A0u5.append(parameters.get("flash-mode-values"));
                        A0u5.append("], white balance: ");
                        A0u5.append(parameters.getWhiteBalance());
                        A0u5.append(", supported white balance: [");
                        A0u5.append(parameters.get("whitebalance-values"));
                        A0u5.append("], white balance lock: ");
                        A0u5.append(parameters.getAutoWhiteBalanceLock());
                        A0u5.append(", exposure: ");
                        A0u5.append(parameters.getExposureCompensation());
                        A0u5.append(", supported exposure range: [");
                        A0u5.append(parameters.getMinExposureCompensation());
                        A0u5.append(parameters.getMaxExposureCompensation());
                        A0u5.append("], , exposure lock: ");
                        C36331k8.A1S(A0u5, parameters.getAutoExposureLock());
                    }
                    try {
                        this.camera.setParameters(parameters);
                        this.isRunning = true;
                        this.receivedCameraError = false;
                        if (this.cameraStartMode.get() == 0) {
                            VoipPhysicalCamera.CameraInfo cameraInfo4 = this.cameraInfo;
                            int previewSizeForFormat = getPreviewSizeForFormat(cameraInfo4.width, cameraInfo4.height, cameraInfo4.format);
                            try {
                                this.camera.addCallbackBuffer(new byte[previewSizeForFormat]);
                                if (this.passiveMode) {
                                    this.lastCachedFrameData = new byte[previewSizeForFormat];
                                } else {
                                    i = 1;
                                }
                                StringBuilder A0u6 = AnonymousClass000.A0u();
                                A0u6.append("voip/video/VoipCamera/startOnCameraThread. added ");
                                A0u6.append(i);
                                C36321k7.A1T(" buffers of ", A0u6, previewSizeForFormat);
                                if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                                    this.camera.setPreviewCallbackWithBuffer(this);
                                } else {
                                    this.camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                                    Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                                }
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                sb = AnonymousClass000.A0u();
                                str = "voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: ";
                                sb.append(str);
                                sb.append(this.cameraStartMode);
                                C36351kA.A1Q(": ", sb, e);
                                return tryNextStartModeOnCameraThread();
                            }
                        } else {
                            StringBuilder A0u7 = AnonymousClass000.A0u();
                            A0u7.append("voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: ");
                            C36321k7.A1N(this.cameraStartMode, A0u7);
                            if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                                this.camera.setPreviewCallback(this);
                            } else {
                                this.camera.setPreviewCallback((Camera.PreviewCallback) null);
                                Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                            }
                        }
                        updatePreviewOrientationOnCameraThread();
                        try {
                            this.camera.startPreview();
                            StringBuilder A0u8 = AnonymousClass000.A0u();
                            A0u8.append("voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: ");
                            C36321k7.A1N(this.cameraStartMode, A0u8);
                            startPeriodicCameraCallbackCheck();
                            return 0;
                        } catch (Exception e3) {
                            e = e3;
                            sb = AnonymousClass000.A0u();
                            str = "voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: ";
                            sb.append(str);
                            sb.append(this.cameraStartMode);
                            C36351kA.A1Q(": ", sb, e);
                            return tryNextStartModeOnCameraThread();
                        }
                    } catch (RuntimeException e4) {
                        StringBuilder A0u9 = AnonymousClass000.A0u();
                        A0u9.append("voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: ");
                        A0u9.append(this.cameraStartMode);
                        C36351kA.A1Q(": ", A0u9, e4);
                        C195779Vx r4 = this.cameraEventsDispatcher;
                        int i5 = this.camIdx;
                        Iterator it = r4.A00.iterator();
                        while (it.hasNext()) {
                            ((B3F) it.next()).BSv(r4.A01, i5);
                        }
                        return -3;
                    }
                } catch (RuntimeException e5) {
                    Log.e("voip/video/VoipCamera/startOnCameraThread camera getParameters threw", e5);
                    return -9;
                }
            }
        }
        return 0;
    }

    public int stopOnCameraThread() {
        boolean z = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        C36321k7.A1T("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ", AnonymousClass000.A0u(), AnonymousClass000.A0I(B8U.A00(this, 23)));
    }

    public static int getPreviewSizeForFormat(int i, int i2, int i3) {
        if (i3 != 842094169) {
            return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
        }
        int ceil = ((int) Math.ceil(((double) i) / 16.0d)) * 16;
        return Math.max(((i * i2) * 3) / 2, (ceil * i2) + ((((((int) Math.ceil((((double) ceil) / 2.0d) / 16.0d)) * 16) * i2) / 2) * 2));
    }

    /* access modifiers changed from: private */
    public void imageAvailableListener(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            if (acquireLatestImage.getPlanes().length == 1 && this.camera != null) {
                updateCameraCallbackCheck();
                byte[] bArr = new byte[(acquireLatestImage.getWidth() * 4 * acquireLatestImage.getHeight())];
                ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                buffer.rewind();
                buffer.get(bArr);
                if (this.isRunning && !this.passiveMode) {
                    Iterator A0z = AnonymousClass000.A0z(this.virtualCameras);
                    while (A0z.hasNext()) {
                        VoipCamera voipCamera = (VoipCamera) A0z.next();
                        if (voipCamera.started) {
                            Image.Plane A09 = C165617ti.A09(acquireLatestImage, 0);
                            voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), A09.getBuffer(), A09.getRowStride());
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            acquireLatestImage.close();
        }
    }

    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    public boolean isCameraOpen() {
        return this.isRunning;
    }

    /* renamed from: lambda$startOnCameraThread$0$org-pjsip-PjCamera  reason: not valid java name */
    public /* synthetic */ void m81lambda$startOnCameraThread$0$orgpjsipPjCamera(int i, Camera camera2) {
        C36321k7.A1S("camera error occurred: ", AnonymousClass000.A0u(), i);
        this.receivedCameraError = true;
        if (i != 2) {
            C195779Vx r3 = this.cameraEventsDispatcher;
            if (i != 100) {
                r3.A01();
                return;
            }
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((B3F) it.next()).BgK(r3.A01);
            }
            return;
        }
        C195779Vx r32 = this.cameraEventsDispatcher;
        Iterator it2 = r32.A00.iterator();
        while (it2.hasNext()) {
            ((B3F) it2.next()).BX6(r32.A01);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int videoPortOnCameraThreadInternal = setVideoPortOnCameraThreadInternal(videoPort);
        if (this.abProps.A0E(7585)) {
            Iterator it = this.cameraEventsDispatcher.A00.iterator();
            while (it.hasNext()) {
                ((B3F) it.next()).BRK(videoPortOnCameraThreadInternal);
            }
        }
        return videoPortOnCameraThreadInternal;
    }

    public void startPreview(Camera camera2) {
        camera2.startPreview();
    }
}
