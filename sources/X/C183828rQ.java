package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipCameraApi2$StopCameraRunnable;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8rQ  reason: invalid class name and case insensitive filesystem */
public class C183828rQ extends VoipPhysicalCamera {
    public static final AtomicBoolean A0J = C36431kI.A1H();
    public static final int[] A0K = {2, 0, 1, 3};
    public int A00 = 0;
    public CameraDevice A01;
    public Image A02;
    public Surface A03;
    public Runnable A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public Point A07;
    public ByteBuffer A08;
    public boolean A09 = false;
    public final CameraCharacteristics A0A;
    public final VoipPhysicalCamera.CameraInfo A0B;
    public final Object A0C = C36441kJ.A11();
    public final int A0D;
    public final CameraDevice.StateCallback A0E = new C165797uA(this);
    public final CameraManager A0F;
    public final ImageReader A0G;
    public final C21060yb A0H;
    public final C19770wU A0I;

    public int getCameraStartMode() {
        return 0;
    }

    public C183828rQ(Context context, C21060yb r14, C20810yC r15, AnonymousClass9NK r16, AnonymousClass13J r17, C19770wU r18, int i, int i2, int i3, int i4, int i5) {
        super(context, r15, r17, r16);
        this.A0H = r14;
        this.A0I = r18;
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
        C36321k7.A1K(this, ", api 2, this ", A0u);
        CameraManager A0B2 = r14.A0B();
        C18740tg.A06(A0B2);
        this.A0F = A0B2;
        this.A0D = i6;
        try {
            CameraCharacteristics cameraCharacteristics = A0B2.getCameraCharacteristics(Integer.toString(i6));
            this.A0A = cameraCharacteristics;
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            C18740tg.A06(obj);
            Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            C18740tg.A06(obj2);
            VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1Q(AnonymousClass000.A0I(obj2)), ((Number) obj).intValue(), i6);
            this.A0B = cameraInfo;
            ImageReader newInstance = ImageReader.newInstance(cameraInfo.width, cameraInfo.height, cameraInfo.format, 3);
            this.A0G = newInstance;
            if (newInstance != null) {
                C23058B2e b2e = this.cameraProcessor;
                if (b2e != null) {
                    Handler handler = this.cameraThreadHandler;
                    C21628ASu aSu = (C21628ASu) b2e;
                    aSu.A01 = new C23143B7d(this, 4);
                    aSu.A02 = handler;
                    C21628ASu.A00(aSu);
                } else {
                    newInstance.setOnImageAvailableListener(new C23143B7d(this, 4), this.cameraThreadHandler);
                }
                if (C19550w8.A09()) {
                    this.A09 = A03(context);
                    return;
                }
                return;
            }
            throw C90514aH.A0s("Unable to create image reader");
        } catch (CameraAccessException e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public static int A00(C183828rQ r10) {
        Surface surface;
        List singletonList;
        Log.i("voip/video/VoipCamera/ starting camera");
        if (r10.A01 == null || r10.videoPort == null) {
            return -5;
        }
        C1272467n r2 = r10.textureHolder;
        if (r2 == null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = r10.A0B;
            r10.createTexture(cameraInfo.width, cameraInfo.height);
            r2 = r10.textureHolder;
            if (r2 == null) {
                return -12;
            }
        }
        Surface surface2 = r10.A03;
        C23058B2e b2e = r10.cameraProcessor;
        if (b2e == null || !r10.cameraProcessorEnabled) {
            surface = new Surface(r2.A01);
        } else {
            C140206lD r0 = ((C21628ASu) b2e).A07;
            SurfaceTexture surfaceTexture = r0.A03;
            if (surfaceTexture == null) {
                surfaceTexture = C140206lD.A00(r0);
            }
            VoipPhysicalCamera.CameraInfo cameraInfo2 = r10.A0B;
            surfaceTexture.setDefaultBufferSize(cameraInfo2.width, cameraInfo2.height);
            surface = new Surface(surfaceTexture);
        }
        r10.A03 = surface;
        A02(r10);
        try {
            CaptureRequest.Builder createCaptureRequest = r10.A01.createCaptureRequest(1);
            createCaptureRequest.addTarget(r10.A03);
            List A0I2 = AnonymousClass001.A0I();
            if (!r10.cameraProcessorEnabled) {
                ImageReader imageReader = r10.A0G;
                createCaptureRequest.addTarget(imageReader.getSurface());
                Surface[] surfaceArr = new Surface[2];
                surfaceArr[0] = r10.A03;
                singletonList = C90524aI.A0p(imageReader.getSurface(), surfaceArr, 1);
                if (C19550w8.A09() && r10.A09) {
                    OutputConfiguration[] outputConfigurationArr = new OutputConfiguration[2];
                    outputConfigurationArr[0] = A01(r10.A03, 1);
                    A0I2 = C90524aI.A0p(A01(imageReader.getSurface(), 5), outputConfigurationArr, 1);
                }
            } else {
                singletonList = Collections.singletonList(r10.A03);
                if (C19550w8.A09() && r10.A09) {
                    A0I2 = Collections.singletonList(A01(r10.A03, 4));
                }
            }
            r10.A06 = true;
            C165777u8 r22 = new C165777u8(createCaptureRequest, surface2, r10);
            if (!C19550w8.A09() || !r10.A09) {
                r10.A01.createCaptureSession(singletonList, r22, r10.cameraThreadHandler);
                return 0;
            }
            r10.A01.createCaptureSession(new SessionConfiguration(0, A0I2, new C12500iB(r10.cameraThreadHandler), r22));
            return 0;
        } catch (CameraAccessException e) {
            Log.e("startCaptureSessionOnCameraThread", e);
            return -2;
        }
    }

    public static OutputConfiguration A01(Surface surface, long j) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
        outputConfiguration.setStreamUseCase(j);
        return outputConfiguration;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r4 == 2) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C183828rQ r5) {
        /*
            X.0yb r0 = r5.A0H
            android.view.WindowManager r0 = r0.A0L()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r4 = r0.getRotation()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r3 = r5.A0B
            int r0 = r3.orientation
            int r0 = r0 % 180
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            if (r4 == 0) goto L_0x001e
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r2 != r0) goto L_0x0035
            int r2 = r3.width
            int r1 = r3.height
        L_0x0025:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A07 = r0
            X.67n r1 = r5.textureHolder
            if (r1 == 0) goto L_0x0034
            int r0 = 4 - r4
            r1.A05 = r0
        L_0x0034:
            return
        L_0x0035:
            int r2 = r3.height
            int r1 = r3.width
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183828rQ.A02(X.8rQ):void");
    }

    private boolean A03(Context context) {
        if (Build.VERSION.SDK_INT != 33 || !Build.MODEL.contains("Pixel") || context.getPackageManager().hasSystemFeature("vendor.android.hardware.camera.stream-usecase")) {
            long[] jArr = (long[]) this.A0A.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null) {
                int length = jArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (jArr[i] == 5) {
                        Log.i("voip/video/VoipCamera/SCALER_AVAILABLE_STREAM_USE_CASES_VIDEO_CALL available");
                        if (!this.abProps.A0E(2971)) {
                            return false;
                        }
                        return true;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            Log.i("voip/video/VoipCamera/Google Pixel device without stream use case system flag");
        }
        return false;
    }

    public void closeOnCameraThread() {
        int i = this.A00;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        C18740tg.A0D(z, AnonymousClass000.A0r("closing camera while still open: ", AnonymousClass000.A0u(), i));
        this.cameraEventsDispatcher.A00();
        synchronized (this.A0C) {
            Image image = this.A02;
            if (image != null) {
                image.close();
                this.A02 = null;
            }
            this.A0G.close();
        }
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

    public int disableAREffectOnCameraThread() {
        Log.i("voip/video/VoipCamera/ Disabling AREffect");
        int i = 0;
        if (!this.cameraProcessorEnabled) {
            Log.i("voip/video/VoipCamera/ AREffect already disabled");
        } else if (this.A06) {
            Log.e("voip/video/VoipCamera/ Failed to disable AREffect. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            this.cameraProcessorEnabled = false;
            C23058B2e b2e = this.cameraProcessor;
            if (b2e != null) {
                b2e.Bqn((C128656Dc) null, (AnonymousClass7d4) null);
                ((C21628ASu) this.cameraProcessor).A05.pause();
            }
            this.A0G.setOnImageAvailableListener(new C23143B7d(this, 4), this.cameraThreadHandler);
            if (this.A00 == 2) {
                i = A00(this);
            }
            Iterator A0z = AnonymousClass000.A0z(this.virtualCameras);
            while (A0z.hasNext()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0B;
                ((VoipCamera) A0z.next()).formatChangeCallback(cameraInfo.width, cameraInfo.height, cameraInfo.format, cameraInfo.fps1000);
            }
        }
        return i;
    }

    public int enableAREffectOnCameraThread(C128656Dc r8, AnonymousClass7d4 r9) {
        Log.i("voip/video/VoipCamera/ Enabling AREffect");
        int i = 0;
        if (this.cameraProcessorEnabled) {
            C23058B2e b2e = this.cameraProcessor;
            C18740tg.A06(b2e);
            b2e.Bqn(r8, r9);
            Log.i("voip/video/VoipCamera/ AREffect already enabled.");
        } else if (this.A06) {
            Log.e("voip/video/VoipCamera/ Failed to set AREffect. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            C23058B2e b2e2 = this.cameraProcessor;
            if (b2e2 == null) {
                setupCameraProcessor();
                C23058B2e b2e3 = this.cameraProcessor;
                if (b2e3 == null) {
                    Log.e("voip/video/VoipCamera/ Failed to set AREffect. No Camera Processor!");
                    this.cameraProcessorEnabled = false;
                    return -11;
                }
                Handler handler = this.cameraThreadHandler;
                C21628ASu aSu = (C21628ASu) b2e3;
                aSu.A01 = new C23143B7d(this, 4);
                aSu.A02 = handler;
                C21628ASu.A00(aSu);
            } else {
                C21628ASu aSu2 = (C21628ASu) b2e2;
                C20973A1j a1j = aSu2.A05;
                a1j.Bok();
                C1690483a.A00(a1j).A02(aSu2.A08);
            }
            this.cameraProcessorEnabled = true;
            this.cameraProcessor.Bqn(r8, r9);
            if (this.A00 == 2) {
                i = A00(this);
            }
            Iterator A0z = AnonymousClass000.A0z(this.virtualCameras);
            while (A0z.hasNext()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0B;
                ((VoipCamera) A0z.next()).formatChangeCallback(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000);
            }
        }
        return i;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0B;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000, cameraInfo.isFrontCamera, cameraInfo.orientation, cameraInfo.idx);
        }
        return cameraInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r0 = r2.A0B;
        r9 = r0.width;
        r10 = r0.height;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
        if (r7 == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        r12 = r0.orientation;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r7 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r0.isFrontCamera != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        return new X.C124015xS(r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        r11 = r0.format;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C124015xS getLastCachedFrame() {
        /*
            r18 = this;
            r2 = r18
            java.lang.Object r1 = r2.A0C
            monitor-enter(r1)
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x000c
            r0 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            return r0
        L_0x000c:
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00d5 }
            int r0 = r0.length     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x003a
            r7 = 1
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d5 }
            int r3 = r0 * 4
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d5 }
            int r3 = r3 * r0
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r0, r5)     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x00d5 }
            r0.rewind()     // Catch:{ all -> 0x00d5 }
        L_0x0034:
            r0.get(r8)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            goto L_0x00b9
        L_0x003a:
            r7 = 0
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00d5 }
            int r3 = r0.length     // Catch:{ all -> 0x00d5 }
            r0 = 3
            boolean r3 = X.AnonymousClass000.A1S(r3, r0)
            java.lang.String r0 = "Cached image should either have 1 or 3 planes"
            X.C18740tg.A0D(r3, r0)     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d5 }
            int r3 = r0 * 3
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d5 }
            int r3 = r3 * r0
            r6 = 2
            int r3 = r3 / r6
            java.nio.ByteBuffer r0 = r2.A08     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0067
            int r0 = r0.capacity()     // Catch:{ all -> 0x00d5 }
            if (r0 == r3) goto L_0x006d
        L_0x0067:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x00d5 }
            r2.A08 = r0     // Catch:{ all -> 0x00d5 }
        L_0x006d:
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            android.media.Image$Plane r5 = X.C165617ti.A09(r0, r5)     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            android.media.Image$Plane r4 = X.C165617ti.A09(r0, r4)     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            android.media.Image$Plane r0 = X.C165617ti.A09(r0, r6)     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r8 = r5.getBuffer()     // Catch:{ all -> 0x00d5 }
            int r9 = r5.getRowStride()     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r10 = r4.getBuffer()     // Catch:{ all -> 0x00d5 }
            int r11 = r4.getRowStride()     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r12 = r0.getBuffer()     // Catch:{ all -> 0x00d5 }
            int r13 = r0.getRowStride()     // Catch:{ all -> 0x00d5 }
            int r14 = r4.getPixelStride()     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r15 = r0.getWidth()     // Catch:{ all -> 0x00d5 }
            android.media.Image r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            int r16 = r0.getHeight()     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r0 = r2.A08     // Catch:{ all -> 0x00d5 }
            r17 = r0
            com.whatsapp.VideoFrameConverter.convertAndroid420toI420(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d5 }
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r0 = r2.A08     // Catch:{ all -> 0x00d5 }
            r0.rewind()     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r0 = r2.A08     // Catch:{ all -> 0x00d5 }
            goto L_0x0034
        L_0x00b9:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r2.A0B
            int r9 = r0.width
            int r10 = r0.height
            if (r7 == 0) goto L_0x00d2
            r11 = 1
        L_0x00c2:
            int r12 = r0.orientation
            if (r7 != 0) goto L_0x00cb
            boolean r0 = r0.isFrontCamera
            r13 = 1
            if (r0 != 0) goto L_0x00cc
        L_0x00cb:
            r13 = 0
        L_0x00cc:
            X.5xS r7 = new X.5xS
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00d2:
            int r11 = r0.format
            goto L_0x00c2
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183828rQ.getLastCachedFrame():X.5xS");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw AnonymousClass001.A0E("VoipCameraApi2 does not support this operation ATM");
    }

    public boolean isCameraOpen() {
        return AnonymousClass000.A1S(this.A00, 2);
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        C1272467n r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0B;
            videoPort.renderTexture(r2, cameraInfo.width, cameraInfo.height);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i = 0;
        if (videoPort2 != videoPort) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            A0u.append(AnonymousClass000.A0J(videoPort));
            A0u.append(" from ");
            A0u.append(AnonymousClass000.A0J(videoPort2));
            A0u.append(", status: ");
            C36321k7.A1Y(A0u, this.A00);
            if (videoPort == null) {
                stopOnCameraThread();
                this.videoPort = null;
            } else if (this.A06) {
                i = -10;
            } else {
                this.videoPort = videoPort;
                videoPort.setScaleType(0);
                int i2 = this.A00;
                if (i2 == 2) {
                    if (videoPort2 != null) {
                        releaseTexture();
                    }
                    i = A00(this);
                } else if (i2 == 0 || i2 == 1) {
                    i = startOnCameraThread();
                }
                if (i != 0) {
                    this.videoPort = videoPort2;
                }
            }
        }
        if (this.abProps.A0E(7585)) {
            Iterator it = this.cameraEventsDispatcher.A00.iterator();
            while (it.hasNext()) {
                ((B3F) it.next()).BRK(i);
            }
        }
        return i;
    }

    public int startOnCameraThread() {
        String str;
        int i = this.A00;
        if (!(i == 2 || i == 3 || this.videoPort == null)) {
            if (i == 1) {
                Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
                this.A05 = true;
            } else if (A0J.get()) {
                Log.i("voip/video/VoipCamera/retryOpen");
                if (this.A04 == null) {
                    C1501674f r3 = new C1501674f(this, 0);
                    this.A04 = r3;
                    this.cameraThreadHandler.postDelayed(r3, 250);
                    return 0;
                }
            } else {
                try {
                    Log.i("voip/video/VoipCamera/ opening camera");
                    this.A0F.openCamera(Integer.toString(this.A0D), this.A0E, this.cameraThreadHandler);
                    this.A00 = 3;
                    if (this.textureHolder == null) {
                        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0B;
                        createTexture(cameraInfo.width, cameraInfo.height);
                        if (this.textureHolder == null) {
                            return -12;
                        }
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    str = "voip/video/VoipCamera/ failed to open camera ";
                    Log.e(str, e);
                    return -4;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    str = "voip/video/VoipCamera/ failed to open camera due to crashed HAL ";
                    Log.e(str, e);
                    return -4;
                }
            }
        }
        return 0;
    }

    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            syncRunOnCameraThread(new B8U((Object) this, 19), -100);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 < 4) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5 != r6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r3 = A0K;
        r1 = 0;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r0 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != r5) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 == r6) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.lang.String r5, int r6) {
        /*
            java.lang.String r1 = X.C165617ti.A0Z(r5)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2053249079: goto L_0x0042;
                case -1038134325: goto L_0x003a;
                case 2169487: goto L_0x0032;
                case 787768856: goto L_0x002a;
                case 894099834: goto L_0x0022;
                default: goto L_0x000b;
            }
        L_0x000b:
            r5 = -1
        L_0x000c:
            if (r5 != r6) goto L_0x0010
            r4 = 1
        L_0x000f:
            return r4
        L_0x0010:
            int[] r3 = A0K
            r2 = 4
            r1 = 0
            r4 = 0
        L_0x0015:
            r0 = r3[r1]
            if (r0 != r5) goto L_0x001a
            r4 = 1
        L_0x001a:
            if (r0 == r6) goto L_0x000f
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0015
            r4 = 0
            return r4
        L_0x0022:
            java.lang.String r0 = "LIMITED"
            boolean r0 = r1.equals(r0)
            r5 = 0
            goto L_0x0049
        L_0x002a:
            java.lang.String r0 = "LEVEL_3"
            boolean r0 = r1.equals(r0)
            r5 = 3
            goto L_0x0049
        L_0x0032:
            java.lang.String r0 = "FULL"
            boolean r0 = r1.equals(r0)
            r5 = 1
            goto L_0x0049
        L_0x003a:
            java.lang.String r0 = "EXTERNAL"
            boolean r0 = r1.equals(r0)
            r5 = 4
            goto L_0x0049
        L_0x0042:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r1.equals(r0)
            r5 = 2
        L_0x0049:
            if (r0 != 0) goto L_0x000c
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183828rQ.A04(java.lang.String, int):boolean");
    }

    public Point getAdjustedPreviewSize() {
        return this.A07;
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraDevice cameraDevice = this.A01;
        if (cameraDevice != null) {
            this.A01 = null;
            this.A00 = 1;
            A0J.set(true);
            this.A0I.Bp1(new VoipCameraApi2$StopCameraRunnable(cameraDevice));
        }
        Surface surface = this.A03;
        if (surface != null) {
            surface.release();
            this.A03 = null;
        }
        releaseTexture();
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.cameraThreadHandler.removeCallbacks(runnable);
            this.A04 = null;
        }
        this.A05 = false;
        this.A06 = false;
        return 0;
    }
}
