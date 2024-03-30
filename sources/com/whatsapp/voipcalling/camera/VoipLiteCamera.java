package com.whatsapp.voipcalling.camera;

import X.A22;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass7d4;
import X.AnonymousClass88P;
import X.B3E;
import X.B5c;
import X.B5h;
import X.BAL;
import X.C108915Vl;
import X.C128656Dc;
import X.C157737eb;
import X.C157747ec;
import X.C159747jr;
import X.C165607th;
import X.C1690483a;
import X.C1691688a;
import X.C1902097h;
import X.C199559fW;
import X.C203169nR;
import X.C23063B2m;
import X.C23107B5m;
import X.C23108B5n;
import X.C23113B5s;
import X.C23114B5t;
import X.C23143B7d;
import X.C23161B7v;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class VoipLiteCamera extends VoipPhysicalCamera implements C159747jr {
    public static final C1902097h Companion = new C1902097h();
    public static final int DEFAULT_SUPERNOVA_HEIGHT = 720;
    public static final int DEFAULT_SUPERNOVA_ORIENTATION = 90;
    public static final int DEFAULT_SUPERNOVA_WIDTH = 1280;
    public ByteBuffer cachedBuffer;
    public Image cachedImage;
    public final ReentrantLock cachedImageLock;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public final C23063B2m cameraStateListener;
    public final Context ctx;
    public ImageReader imageReader;
    public final boolean isSupernovaCamera;
    public final C23114B5t liteCameraController;
    public final C157737eb previewFrameListener;
    public final C157747ec renderingStartedListener;
    public boolean running;

    public static final void maybeInitSUPCamera$lambda$6(VoipLiteCamera voipLiteCamera, ImageReader imageReader2) {
        AnonymousClass00C.A0D(voipLiteCamera, 0);
        AnonymousClass00C.A0B(imageReader2);
        voipLiteCamera.imageAvailableListener(imageReader2);
    }

    public Point getAdjustedPreviewSize() {
        return new Point(0, 0);
    }

    public int getCameraStartMode() {
        return 0;
    }

    public void onSurfaceAvailable(Object obj) {
    }

    public void onSurfaceSizeChanged(Object obj, int i, int i2) {
        C23108B5n b5n;
        AnonymousClass00C.A0D(obj, 0);
        if (obj instanceof SurfaceTexture) {
            C23108B5n b5n2 = (C23108B5n) this.liteCameraController.B9y(C23108B5n.A00);
            if (b5n2 != null) {
                b5n2.Brl((SurfaceTexture) obj, i, i2);
            }
        } else if ((obj instanceof Surface) && (b5n = (C23108B5n) this.liteCameraController.B9y(C23108B5n.A00)) != null) {
            b5n.Brm((Surface) obj, i, i2);
        }
    }

    public void updatePreviewOrientation() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoipLiteCamera(X.C20810yC r15, X.AnonymousClass13J r16, X.C21060yb r17, X.AnonymousClass9NK r18, int r19, int r20, int r21, int r22, int r23, android.content.Context r24, boolean r25) {
        /*
            r14 = this;
            r3 = r16
            r2 = r17
            r1 = r18
            X.C36321k7.A18(r15, r3, r2, r1)
            r0 = 10
            r7 = r24
            X.AnonymousClass00C.A0D(r7, r0)
            r14.<init>(r7, r15, r3, r1)
            r14.ctx = r7
            r6 = r25
            r14.isSupernovaCamera = r6
            r10 = 0
            X.9bD r9 = new X.9bD
            r9.<init>()
            X.94Q r0 = X.B5j.A00
            r5 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            java.util.Map r3 = r9.A00
            r3.put(r0, r8)
            X.94Q r0 = X.B42.A00
            r3.put(r0, r8)
            X.94Q r1 = X.B4H.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r3.put(r1, r0)
            X.94Q r0 = X.C23106B5l.A00
            r3.put(r0, r8)
            X.94Q r0 = X.B4H.A0F
            r3.put(r0, r8)
            X.9bi r12 = new X.9bi
            r12.<init>(r9)
            X.A26 r0 = new X.A26
            r0.<init>()
            X.Aw1[] r5 = new X.C22790Aw1[r5]
            r5[r10] = r0
            long r10 = android.os.SystemClock.elapsedRealtimeNanos()
            X.9bD r3 = new X.9bD
            r3.<init>(r12)
            X.94Q r1 = X.C23109B5o.A00
            java.util.Map r0 = r3.A00
            r0.put(r1, r8)
            X.9bi r0 = new X.9bi
            r0.<init>(r3)
            X.A27 r3 = new X.A27
            r3.<init>(r7, r0, r5)
            X.A1i r9 = new X.A1i
            r9.<init>(r3)
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r7 - r10
            X.94Q r1 = X.C197439bi.A01
            java.util.Map r0 = r12.A00
            java.lang.Object r10 = r0.get(r1)
            if (r10 == 0) goto L_0x013b
            X.9S2 r5 = r3.A03
            java.lang.String r3 = "FbCameraLogger"
            float r1 = (float) r7
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = "OC creation %f [ms]"
            X.AnonymousClass6YR.A03(r1, r3, r0)
            java.util.Map r1 = r5.A03
            r1.clear()
            java.lang.String r0 = "plugin_list_name"
            r1.put(r0, r10)
            X.94T r0 = X.C23112B5r.A00
            r5.A00(r0)
            X.A0i r5 = new X.A0i
            r5.<init>(r9)
            r14.liteCameraController = r5
            X.A0g r0 = new X.A0g
            r0.<init>()
            r14.cameraStateListener = r0
            r1 = 1
            X.B9D r0 = new X.B9D
            r0.<init>(r14, r1)
            r14.previewFrameListener = r0
            X.9p2 r0 = new X.9p2
            r0.<init>(r14, r1)
            r14.renderingStartedListener = r0
            r3 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            if (r25 != 0) goto L_0x0128
            X.88a r1 = X.B5c.A00
            X.B3M r0 = r5.A00
            boolean r0 = r0.BLR(r1)
            if (r0 == 0) goto L_0x0121
            android.hardware.camera2.CameraManager r1 = r2.A0B()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x011c
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch:{ CameraAccessException -> 0x0111 }
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r0)     // Catch:{ CameraAccessException -> 0x0111 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ CameraAccessException -> 0x0111 }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x010c
            int r0 = X.AnonymousClass000.A0I(r0)
            boolean r11 = X.AnonymousClass000.A1Q(r0)
            r12 = 0
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r6 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r13 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.cameraInfo = r6
            boolean r0 = r6.isFrontCamera
            r5.Br3(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x010c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x0111:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/video/VoipCamera/ failed to open camera index "
            X.C36321k7.A1S(r0, r1, r3)
            throw r2
        L_0x011c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x0121:
            java.lang.String r0 = "There is no Preview Controller component in litecamera. This is needed for non-supernova cameras. Please ensure Optic is included in Litecamera aar"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x0128:
            r11 = 0
            r12 = 90
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r6 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r13 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.cameraInfo = r6
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r14.cachedImageLock = r0
            return
        L_0x013b:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipLiteCamera.<init>(X.0yC, X.13J, X.0yb, X.9NK, int, int, int, int, int, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void frameCallbackInternal(B3E b3e) {
        updateCameraCallbackCheck();
        Iterator A0y = AnonymousClass000.A0y(this.virtualCameras);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (((VoipCamera) A11.getValue()).started) {
                C23161B7v b7v = (C23161B7v) b3e;
                int i = b7v.A01;
                if (i == 1) {
                    ((VoipCamera) A11.getValue()).abgrFramePlaneCallback(b7v.A02, b7v.A00, (ByteBuffer) ((BAL) b7v.A03).get(0), AnonymousClass000.A0I(((BAL) b7v.A05).get(0)));
                } else if (i == 3) {
                    int i2 = b7v.A02;
                    int i3 = b7v.A00;
                    BAL bal = (BAL) b7v.A03;
                    BAL bal2 = (BAL) b7v.A05;
                    ((VoipCamera) A11.getValue()).framePlaneCallback(i2, i3, (ByteBuffer) bal.get(0), AnonymousClass000.A0I(bal2.get(0)), (ByteBuffer) bal.get(1), AnonymousClass000.A0I(bal2.get(1)), (ByteBuffer) bal.get(2), AnonymousClass000.A0I(bal2.get(2)), AnonymousClass000.A0I(((BAL) b7v.A04).get(2)));
                }
            }
        }
    }

    private final void maybeInitSUPCamera() {
        Log.i("voip/video/VoipCamera/ Initializing SUP Camera");
        C203169nR r6 = C108915Vl.A00;
        if (r6 != null) {
            if (this.imageReader == null) {
                Log.i("voip/video/VoipCamera/ Initializing SUP Camera. Constructing image reader. ");
                ImageReader newInstance = ImageReader.newInstance(DEFAULT_SUPERNOVA_WIDTH, DEFAULT_SUPERNOVA_HEIGHT, 1, 3);
                AnonymousClass00C.A08(newInstance);
                newInstance.setOnImageAvailableListener(new C23143B7d(this, 5), this.cameraThreadHandler);
                C199559fW r8 = new C199559fW(newInstance.getSurface(), false);
                r8.A01 = this.cameraInfo.orientation;
                B5h b5h = (B5h) this.liteCameraController.B9y(B5h.A00);
                if (b5h != null) {
                    AnonymousClass88P r2 = (AnonymousClass88P) b5h;
                    A22 a22 = new A22(r2.A0I, r8);
                    if (r2.A0O) {
                        a22.A01 = 7;
                        a22.A03 = 7;
                    }
                    a22.A07 = true;
                    ((C1690483a) r2.A06).A05.A02.A00(a22);
                }
                this.imageReader = newInstance;
            }
            C23114B5t b5t = this.liteCameraController;
            C1691688a r1 = B5c.A00;
            if (b5t.BLR(r1)) {
                this.liteCameraController.B9y(r1);
            }
            C23113B5s B9y = this.liteCameraController.B9y(C23107B5m.A00);
            AnonymousClass00C.A08(B9y);
            B5h b5h2 = (B5h) this.liteCameraController.B9y(B5h.A00);
            AnonymousClass00C.A0B(b5h2);
            r6.A0A((C23107B5m) B9y, b5h2);
            Iterator A0y = AnonymousClass000.A0y(this.virtualCameras);
            while (A0y.hasNext()) {
                ((VoipCamera) C36351kA.A0u(A0y)).formatChangeCallback(DEFAULT_SUPERNOVA_WIDTH, DEFAULT_SUPERNOVA_HEIGHT, 1, this.cameraInfo.fps1000);
            }
            Log.i("voip/video/VoipCamera/ Done Initializing SUP Camera");
            return;
        }
        throw AnonymousClass001.A09(C36371kC.A0z("Media Stream Lite Camera Coordinator's SUP Delegate is invalid: Null: ", AnonymousClass000.A0u(), true));
    }

    /* JADX INFO: finally extract failed */
    public void closeOnCameraThread() {
        this.liteCameraController.pause();
        this.liteCameraController.destroy();
        ReentrantLock reentrantLock = this.cachedImageLock;
        reentrantLock.lock();
        try {
            Image image = this.cachedImage;
            if (image != null) {
                image.close();
            }
            this.cachedImage = null;
            ImageReader imageReader2 = this.imageReader;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            reentrantLock.unlock();
            VideoPort videoPort = this.videoPort;
            if (videoPort != null) {
                videoPort.setPassthroughVideoPortCallback((C159747jr) null);
            }
            this.cameraEventsDispatcher.A00();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public int disableAREffectOnCameraThread() {
        throw AnonymousClass001.A0E("enable AREFfect not supported for litecamera");
    }

    public int enableAREffectOnCameraThread(C128656Dc r2, AnonymousClass7d4 r3) {
        throw AnonymousClass001.A0E("enable AREFfect not supported for litecamera");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (r0.length != 3) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[Catch:{ all -> 0x00e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C124015xS getLastCachedFrame() {
        /*
            r19 = this;
            r3 = r19
            java.util.concurrent.locks.ReentrantLock r1 = r3.cachedImageLock
            r1.lock()
            android.media.Image r5 = r3.cachedImage     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x00e4
            android.media.Image$Plane[] r0 = r5.getPlanes()     // Catch:{ all -> 0x00e9 }
            r2 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0055
            int r0 = r0.length     // Catch:{ all -> 0x00e9 }
            if (r0 != r2) goto L_0x0055
            r8 = 1
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r7)     // Catch:{ all -> 0x00e9 }
            int r4 = r0.getPixelStride()     // Catch:{ all -> 0x00e9 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x00e9 }
            int r4 = r4 * r0
            int r0 = r5.getHeight()     // Catch:{ all -> 0x00e9 }
            int r4 = r4 * r0
            byte[] r6 = new byte[r4]     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r7)     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x00e9 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00e9 }
            r0.rewind()     // Catch:{ all -> 0x00e9 }
        L_0x0039:
            r0.get(r6)     // Catch:{ all -> 0x00e9 }
        L_0x003c:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r3.cameraInfo     // Catch:{ all -> 0x00e9 }
            int r7 = r0.width     // Catch:{ all -> 0x00e9 }
            int r4 = r0.height     // Catch:{ all -> 0x00e9 }
            if (r8 != 0) goto L_0x0046
            int r2 = r0.format     // Catch:{ all -> 0x00e9 }
        L_0x0046:
            int r3 = r0.orientation     // Catch:{ all -> 0x00e9 }
            boolean r0 = r0.isFrontCamera     // Catch:{ all -> 0x00e9 }
            X.5xS r5 = new X.5xS     // Catch:{ all -> 0x00e9 }
            r8 = r4
            r9 = r2
            r10 = r3
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00e9 }
            goto L_0x00e5
        L_0x0055:
            r8 = 0
            android.media.Image$Plane[] r0 = r5.getPlanes()     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x0061
            int r6 = r0.length     // Catch:{ all -> 0x00e9 }
            r0 = 3
            r4 = 1
            if (r6 == r0) goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            java.lang.String r0 = "Cached image should either have 1 or 3 planes"
            X.C18740tg.A0D(r4, r0)     // Catch:{ all -> 0x00e9 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x00e9 }
            int r4 = r0 * 3
            int r0 = r5.getHeight()     // Catch:{ all -> 0x00e9 }
            int r4 = r4 * r0
            r6 = 2
            int r4 = r4 / r6
            java.nio.ByteBuffer r0 = r3.cachedBuffer     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00dd
            int r0 = r0.capacity()     // Catch:{ all -> 0x00e9 }
            if (r0 != r4) goto L_0x00dd
        L_0x007e:
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r7)     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r9 = r0.getBuffer()     // Catch:{ all -> 0x00e9 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r2)     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r11 = r0.getBuffer()     // Catch:{ all -> 0x00e9 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r6)     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r13 = r0.getBuffer()     // Catch:{ all -> 0x00e9 }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r7)     // Catch:{ all -> 0x00e9 }
            int r10 = r0.getRowStride()     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r2)     // Catch:{ all -> 0x00e9 }
            int r12 = r0.getRowStride()     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r6)     // Catch:{ all -> 0x00e9 }
            int r14 = r0.getRowStride()     // Catch:{ all -> 0x00e9 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r5, r6)     // Catch:{ all -> 0x00e9 }
            int r15 = r0.getPixelStride()     // Catch:{ all -> 0x00e9 }
            int r16 = r5.getWidth()     // Catch:{ all -> 0x00e9 }
            int r17 = r5.getHeight()     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r0 = r3.cachedBuffer     // Catch:{ all -> 0x00e9 }
            r18 = r0
            com.whatsapp.VideoFrameConverter.convertAndroid420toI420(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00e9 }
            byte[] r6 = new byte[r4]     // Catch:{ all -> 0x00e9 }
            java.nio.ByteBuffer r0 = r3.cachedBuffer     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00d7
            r0.rewind()     // Catch:{ all -> 0x00e9 }
        L_0x00d7:
            java.nio.ByteBuffer r0 = r3.cachedBuffer     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x003c
            goto L_0x0039
        L_0x00dd:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch:{ all -> 0x00e9 }
            r3.cachedBuffer = r0     // Catch:{ all -> 0x00e9 }
            goto L_0x007e
        L_0x00e4:
            r5 = 0
        L_0x00e5:
            r1.unlock()
            return r5
        L_0x00e9:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipLiteCamera.getLastCachedFrame():X.5xS");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw AnonymousClass001.A0E("VoipLiteCamera does not support this operation ATM");
    }

    public void onFrameAvailableOnCameraThread() {
        throw AnonymousClass001.A0E("We should not fire frame available in litecamera");
    }

    public void onSurfaceDestroyed(Object obj) {
        C23108B5n b5n = (C23108B5n) this.liteCameraController.B9y(C23108B5n.A00);
        if (b5n != null) {
            b5n.Brl((SurfaceTexture) null, 0, 0);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        Integer num;
        Integer num2;
        VideoPort videoPort2 = this.videoPort;
        if (!AnonymousClass00C.A0J(videoPort2, videoPort)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/video/VoipCamera/ setVideoPortOnCameraThread to ");
            if (videoPort != null) {
                num = C165607th.A0j(videoPort);
            } else {
                num = null;
            }
            A0u.append(num);
            A0u.append(" from ");
            if (videoPort2 != null) {
                num2 = C165607th.A0j(videoPort2);
            } else {
                num2 = null;
            }
            C36321k7.A1N(num2, A0u);
            if (videoPort2 != null) {
                videoPort2.setPassthroughVideoPortCallback((C159747jr) null);
            }
            if (videoPort == null) {
                C23108B5n b5n = (C23108B5n) this.liteCameraController.B9y(C23108B5n.A00);
                if (b5n != null) {
                    b5n.Brn((View) null);
                }
                if (!this.isSupernovaCamera) {
                    stopOnCameraThread();
                }
                this.videoPort = null;
            } else {
                videoPort.setPassthroughVideoPortCallback(this);
                this.videoPort = videoPort;
                return startOnCameraThread();
            }
        }
        return 0;
    }

    public int startOnCameraThread() {
        if (!this.running && (this.videoPort != null || this.isSupernovaCamera)) {
            this.liteCameraController.Bok();
            this.running = true;
            if (this.isSupernovaCamera) {
                maybeInitSUPCamera();
                return 0;
            }
        }
        return 0;
    }

    public int stopOnCameraThread() {
        this.liteCameraController.pause();
        this.running = false;
        ReentrantLock reentrantLock = this.cachedImageLock;
        reentrantLock.lock();
        try {
            Image image = this.cachedImage;
            if (image != null) {
                image.close();
            }
            this.cachedImage = null;
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void imageAvailableListener(ImageReader imageReader2) {
        ReentrantLock reentrantLock;
        Image acquireLatestImage = imageReader2.acquireLatestImage();
        if (acquireLatestImage != null) {
            if (!this.running) {
                reentrantLock = this.cachedImageLock;
                reentrantLock.lock();
                try {
                    Image image = this.cachedImage;
                    if (image != null) {
                        image.close();
                    }
                    this.cachedImage = null;
                    acquireLatestImage.close();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else {
                frameCallbackInternal(new C23161B7v(acquireLatestImage));
                reentrantLock = this.cachedImageLock;
                reentrantLock.lock();
                Image image2 = this.cachedImage;
                if (image2 != null) {
                    image2.close();
                }
                this.cachedImage = acquireLatestImage;
            }
            reentrantLock.unlock();
        }
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.cameraInfo;
    }

    public boolean isCameraOpen() {
        return this.running;
    }
}
