package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.53k  reason: invalid class name and case insensitive filesystem */
public class C1030553k extends C92174dF implements C161087m8, SurfaceHolder.Callback {
    public static final String[] A0a = {"GT-I9195", "GT-I9190", "GT-I9192"};
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public C132706Ux A0A;
    public AnonymousClass61W A0B;
    public AnonymousClass677 A0C;
    public AnonymousClass677 A0D;
    public C160747lW A0E;
    public C21060yb A0F;
    public C20830yE A0G;
    public AnonymousClass1JD A0H;
    public C19890wg A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public byte[] A0P;
    public HandlerThread A0Q;
    public List A0R;
    public boolean A0S;
    public final Handler A0T = C36341k9.A0H();
    public final Display A0U;
    public final SurfaceHolder A0V;
    public final C144296rx A0W;
    public final float[] A0X = new float[16];
    public final C92124dA A0Y;
    public final C195409Ue A0Z;

    public static int A00(float f) {
        if (f < -995.0f) {
            f = -995.0f;
        } else if (f > 995.0f) {
            f = 995.0f;
        }
        return (int) f;
    }

    public static synchronized void A05(C1030553k r5) {
        synchronized (r5) {
            Camera camera = r5.A07;
            if (camera == null) {
                try {
                    if (r5.A00 >= Camera.getNumberOfCameras()) {
                        r5.A00 = Camera.getNumberOfCameras() - 1;
                    }
                    Camera open = Camera.open(r5.A00);
                    r5.A07 = open;
                    open.setErrorCallback(new AnonymousClass6ZS(r5));
                } catch (Exception e) {
                    Camera camera2 = r5.A07;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error opening camera", e);
                    if (r5.A00 != 0) {
                        C36341k9.A0v(r5.getSharedPreferences().edit(), "camera_index", 0);
                    }
                    A08(r5, e, 1);
                }
                Camera camera3 = r5.A07;
                if (camera3 != null) {
                    try {
                        camera3.setPreviewDisplay(r5.A0V);
                        A06(r5);
                    } catch (IOException | RuntimeException e2) {
                        r5.A07.release();
                        r5.A07 = null;
                        Log.e("cameraview/start-camera", e2);
                        if (r5.A00 != 0) {
                            C36341k9.A0v(r5.getSharedPreferences().edit(), "camera_index", 0);
                        }
                        A08(r5, e2, 1);
                    }
                }
            } else {
                try {
                    camera.reconnect();
                } catch (IOException e3) {
                    r5.A07.release();
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error reconnecting camera", e3);
                    A08(r5, e3, 1);
                }
            }
        }
        return;
    }

    public static synchronized void A07(C1030553k r2) {
        synchronized (r2) {
            Log.i("cameraview/stop-camera");
            Camera camera = r2.A07;
            if (camera != null) {
                try {
                    camera.stopPreview();
                    r2.A0K = false;
                } catch (Exception e) {
                    Log.w("cameraview/stop-camera error stopping camera preview", e);
                }
                try {
                    r2.A07.release();
                } catch (Exception e2) {
                    Log.w("cameraview/stop-camera error releasing camera", e2);
                }
                r2.A07 = null;
            }
            Log.i("cameraview/stop-camera-end");
        }
        return;
    }

    public static boolean A09(Camera.Size size, Camera.Size size2, int i, int i2) {
        if (size2 == null) {
            return true;
        }
        return (AnonymousClass000.A05(size.height, i2) * i) + (AnonymousClass000.A05(size.width, i) * i2) < (AnonymousClass000.A05(size2.height, i2) * i) + (AnonymousClass000.A05(size2.width, i) * i2);
    }

    public synchronized void BQC() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            boolean z = true;
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                if (getCameraInfo().facing != 1) {
                    z = false;
                }
                this.A0L = z;
                A07(this);
                Handler handler = this.A09;
                Objects.requireNonNull(handler);
                handler.post(new C81323wp((Object) this, 4));
                C36341k9.A0v(getSharedPreferences().edit(), "camera_index", this.A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r1 = "off";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String BQD() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0008
            java.lang.String r1 = "off"
            goto L_0x006b
        L_0x0008:
            java.util.List r2 = r4.getFlashModes()     // Catch:{ all -> 0x006d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "off"
            goto L_0x006b
        L_0x0015:
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            android.hardware.Camera$Parameters r3 = r0.getParameters()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r4.A0J     // Catch:{ all -> 0x006d }
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x006d }
            if (r0 >= 0) goto L_0x002c
            java.lang.String r1 = "off"
            int r0 = r2.indexOf(r1)     // Catch:{ all -> 0x006d }
            if (r0 >= 0) goto L_0x002c
            goto L_0x006b
        L_0x002c:
            int r1 = r0 + 1
            int r0 = r2.size()     // Catch:{ all -> 0x006d }
            int r1 = r1 % r0
            java.lang.String r2 = X.C36401kF.A0s(r2, r1)     // Catch:{ all -> 0x006d }
            r4.A0J = r2     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "cameraview/next flash mode:"
            X.C36321k7.A1Q(r0, r2, r1)     // Catch:{ all -> 0x006d }
            java.util.List r1 = r3.getSupportedFlashModes()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = r4.A0J     // Catch:{ all -> 0x006d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r4.A0J     // Catch:{ all -> 0x006d }
            r3.setFlashMode(r0)     // Catch:{ all -> 0x006d }
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            r0.setParameters(r3)     // Catch:{ all -> 0x006d }
        L_0x005a:
            android.content.SharedPreferences r0 = r4.getSharedPreferences()     // Catch:{ all -> 0x006d }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "flash_mode"
            java.lang.String r0 = r4.A0J     // Catch:{ all -> 0x006d }
            X.C36341k9.A0x(r2, r1, r0)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r4.A0J     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r4)
            return r1
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.BQD():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int Bso(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x003a
            android.hardware.Camera$Parameters r1 = r0.getParameters()     // Catch:{ all -> 0x003c }
            boolean r0 = r1.isZoomSupported()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            int r0 = r1.getMaxZoom()     // Catch:{ all -> 0x003c }
            if (r4 > r0) goto L_0x003a
            int r0 = r1.getZoom()     // Catch:{ all -> 0x003c }
            if (r0 == r4) goto L_0x0024
            r1.setZoom(r4)     // Catch:{ all -> 0x003c }
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r0.setParameters(r1)     // Catch:{ all -> 0x003c }
        L_0x0024:
            java.util.List r1 = r1.getZoomRatios()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            int r0 = r1.size()     // Catch:{ all -> 0x003c }
            if (r0 < r4) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x003c }
            int r0 = X.C90514aH.A0H(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r3)
            return r0
        L_0x003a:
            monitor-exit(r3)
            return r2
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.Bso(int):int");
    }

    public synchronized void Bv8() {
        try {
            MediaRecorder mediaRecorder = this.A08;
            Objects.requireNonNull(mediaRecorder);
            mediaRecorder.stop();
        } catch (RuntimeException e) {
            Log.w("cameraview/stop-video-capture ", e);
        }
        A03();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0M = false;
        this.A05 = null;
    }

    public synchronized void BvW(C1268165s r6, boolean z) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            e = new Exception("CameraCustomException: Camera is null");
        } else if (this.A0O) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0K = false;
            this.A0O = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                AnonymousClass6ZT r3 = new AnonymousClass6ZT(r6, this);
                Objects.requireNonNull(r6);
                this.A07.takePicture(new AnonymousClass6ZX(r6), (Camera.PictureCallback) null, r3);
            } catch (Exception e) {
                e = e;
                this.A0O = false;
                Log.e("cameraview/take-picture failed", e);
            }
        }
        A08(this, e, 1);
        return;
    }

    public int getCameraApi() {
        return 0;
    }

    public int getCameraType() {
        return 0;
    }

    public synchronized List getFlashModes() {
        ArrayList A0I2;
        A0I2 = AnonymousClass001.A0I();
        Camera camera = this.A07;
        if (camera != null) {
            try {
                List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (supportedFlashModes.contains("off")) {
                        A0I2.add("off");
                    }
                    if (supportedFlashModes.contains("on")) {
                        A0I2.add("on");
                    }
                    if (supportedFlashModes.contains("auto")) {
                        A0I2.add("auto");
                    }
                }
                if (this.A0L) {
                    C90474aD.A1H("off", A0I2);
                    C90474aD.A1H("on", A0I2);
                }
                if (getStoredFlashModeCount() != A0I2.size()) {
                    SharedPreferences.Editor edit = getSharedPreferences().edit();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("flash_mode_count");
                    C36341k9.A0v(edit, C36381kD.A10(A0u, this.A00), A0I2.size());
                }
            } catch (RuntimeException e) {
                Log.e("cameraview/getFlashModes ", e);
            }
        }
        return A0I2;
    }

    public synchronized int getMaxZoom() {
        int i;
        i = 0;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i = parameters.getMaxZoom();
            }
        }
        return i;
    }

    public synchronized long getPictureResolution() {
        long j;
        Camera.Size pictureSize;
        Camera camera = this.A07;
        j = 0;
        if (!(camera == null || (pictureSize = camera.getParameters().getPictureSize()) == null)) {
            j = (long) (pictureSize.width * pictureSize.height);
        }
        return j;
    }

    public synchronized long getVideoResolution() {
        long j;
        Camera.Size size = this.A06;
        if (size != null) {
            j = (long) (size.width * size.height);
        } else {
            j = 0;
        }
        return j;
    }

    public synchronized int getZoomLevel() {
        int i;
        Camera camera = this.A07;
        if (camera == null) {
            i = 0;
        } else {
            i = camera.getParameters().getZoom();
        }
        return i;
    }

    public static Camera.Size A01(List list, int i, int i2) {
        int i3 = i;
        double d = (double) i3;
        int i4 = i2;
        double d2 = d / ((double) i4);
        Camera.Size size = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i5 = size2.width;
                double d3 = (double) i5;
                int i6 = size2.height;
                double d4 = d3 / ((double) i6);
                double d5 = d3 / d;
                if (i5 * i6 >= 153600 && d5 <= 1.5d && C90504aG.A00(d4, d2) <= 0.1d && A09(size2, size, i3, i4)) {
                    size = size2;
                }
            }
            if (size == null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Camera.Size size3 = (Camera.Size) it2.next();
                    if (((double) size3.width) / d <= 1.5d && A09(size3, size, i3, i4)) {
                        size = size3;
                    }
                }
                if (size == null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Camera.Size size4 = (Camera.Size) it3.next();
                        if (A09(size4, size, i3, i4)) {
                            size = size4;
                        }
                    }
                }
            }
        }
        return size;
    }

    private void A03() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0M = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    parameters.getFlashMode();
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0K = false;
                    }
                } catch (RuntimeException e) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        AnonymousClass677 r0 = this.A0C;
        if (r0 != null) {
            r0.A01();
            this.A0C = null;
        }
        AnonymousClass61W r1 = this.A0B;
        if (r1 != null) {
            if (r1.A00 != null) {
                r1.A00 = null;
            }
            this.A0B = null;
        }
        AnonymousClass677 r02 = this.A0D;
        if (r02 != null) {
            r02.A01();
            this.A0D = null;
        }
        C132706Ux r03 = this.A0A;
        if (r03 != null) {
            r03.A01();
            this.A0A = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r9 != 3) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 == 2) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029e A[ADDED_TO_REGION, Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02bc A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e4 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0315 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0320 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0340 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034e A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a8 A[ADDED_TO_REGION, EDGE_INSN: B:154:0x02a8->B:106:0x02a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016f A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0190 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019c A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f9 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0250 A[Catch:{ RuntimeException -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0267 A[Catch:{ RuntimeException -> 0x015a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A06(X.C1030553k r20) {
        /*
            r11 = r20
            monitor-enter(r11)
            int r15 = r11.getWidth()     // Catch:{ all -> 0x035a }
            int r14 = r11.getHeight()     // Catch:{ all -> 0x035a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview view:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r15)     // Catch:{ all -> 0x035a }
            java.lang.String r10 = "x"
            X.C36321k7.A1T(r10, r1, r14)     // Catch:{ all -> 0x035a }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x035a }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "cameraview/start-preview camera is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "CameraCustomException: Camera is null"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x035a }
            r1.<init>(r0)     // Catch:{ all -> 0x035a }
            r0 = 1
            A08(r11, r1, r0)     // Catch:{ all -> 0x035a }
            goto L_0x0351
        L_0x0032:
            android.view.Display r0 = r11.A0U     // Catch:{ all -> 0x035a }
            int r9 = r0.getRotation()     // Catch:{ all -> 0x035a }
            r0 = 2
            r3 = 1
            if (r9 == 0) goto L_0x003f
            r13 = 0
            if (r9 != r0) goto L_0x0040
        L_0x003f:
            r13 = 1
        L_0x0040:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x035a }
            android.hardware.Camera$Parameters r8 = r0.getParameters()     // Catch:{ all -> 0x035a }
            java.util.List r2 = r8.getSupportedPreviewSizes()     // Catch:{ all -> 0x035a }
            r11.A0R = r2     // Catch:{ all -> 0x035a }
            if (r2 != 0) goto L_0x0054
            java.util.List r2 = r11.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x035a }
            r11.A0R = r2     // Catch:{ all -> 0x035a }
        L_0x0054:
            r1 = r15
            r0 = r14
            if (r13 == 0) goto L_0x005a
            r1 = r14
            r0 = r15
        L_0x005a:
            android.hardware.Camera$Size r0 = A01(r2, r1, r0)     // Catch:{ all -> 0x035a }
            r11.A04 = r0     // Catch:{ all -> 0x035a }
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r8.getFlashMode()     // Catch:{ all -> 0x035a }
            r11.A0J = r0     // Catch:{ all -> 0x035a }
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            java.util.List r0 = r11.A0R     // Catch:{ all -> 0x035a }
            java.lang.String r0 = A02(r0)     // Catch:{ all -> 0x035a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x035a }
            android.hardware.Camera$Size r2 = r11.A04     // Catch:{ all -> 0x035a }
            if (r2 == 0) goto L_0x0353
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview optimal preview size:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            int r0 = r2.width     // Catch:{ all -> 0x035a }
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r10)     // Catch:{ all -> 0x035a }
            int r0 = r2.height     // Catch:{ all -> 0x035a }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x035a }
            android.hardware.Camera$CameraInfo r18 = r11.getCameraInfo()     // Catch:{ all -> 0x035a }
            r0 = r18
            int r0 = r0.facing     // Catch:{ all -> 0x035a }
            boolean r12 = X.AnonymousClass000.A1S(r0, r3)
            r11.A0L = r12     // Catch:{ all -> 0x035a }
            double r6 = (double) r15     // Catch:{ all -> 0x035a }
            double r4 = (double) r14     // Catch:{ all -> 0x035a }
            double r16 = r6 / r4
            android.hardware.Camera$Size r1 = r11.A04     // Catch:{ all -> 0x035a }
            int r0 = r1.width     // Catch:{ all -> 0x035a }
            r20 = r0
            double r2 = (double) r0     // Catch:{ all -> 0x035a }
            int r0 = r1.height     // Catch:{ all -> 0x035a }
            r19 = r0
            double r0 = (double) r0     // Catch:{ all -> 0x035a }
            double r2 = r2 / r0
            r0 = r16
            double r16 = X.C90504aG.A00(r0, r2)     // Catch:{ all -> 0x035a }
            double r4 = r4 / r6
            double r2 = X.C90504aG.A00(r4, r2)     // Catch:{ all -> 0x035a }
            r0 = r16
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x035a }
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f9
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r4 = "cameraview/start-preview request layout to match preview size:"
            r3 = r20
            r2 = r19
            X.C90464aC.A1K(r4, r10, r5, r3, r2)     // Catch:{ all -> 0x035a }
            java.lang.String r2 = " (view is "
            X.C90464aC.A1K(r2, r10, r5, r15, r14)     // Catch:{ all -> 0x035a }
            java.lang.String r2 = ") aspect diff is "
            r5.append(r2)     // Catch:{ all -> 0x035a }
            r5.append(r0)     // Catch:{ all -> 0x035a }
            X.C36411kG.A1P(r5)     // Catch:{ all -> 0x035a }
            android.os.Handler r2 = r11.A0T     // Catch:{ all -> 0x035a }
            r1 = 5
            X.3wp r0 = new X.3wp     // Catch:{ all -> 0x035a }
            r0.<init>((java.lang.Object) r11, (int) r1)     // Catch:{ all -> 0x035a }
            r2.post(r0)     // Catch:{ all -> 0x035a }
            goto L_0x0351
        L_0x00f9:
            r0 = r18
            int r3 = r0.orientation     // Catch:{ all -> 0x035a }
            r1 = 3
            if (r9 == 0) goto L_0x010a
            r0 = 1
            if (r9 == r0) goto L_0x0111
            r0 = 2
            if (r9 == r0) goto L_0x010e
            r4 = 270(0x10e, float:3.78E-43)
            if (r9 == r1) goto L_0x010b
        L_0x010a:
            r4 = 0
        L_0x010b:
            if (r12 == 0) goto L_0x0114
            goto L_0x011d
        L_0x010e:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x010b
        L_0x0111:
            r4 = 90
            goto L_0x010b
        L_0x0114:
            int r0 = r3 - r4
            int r0 = r0 + 360
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x035a }
            goto L_0x0129
        L_0x011d:
            int r0 = r3 + r4
            int r0 = r0 % 360
            r11.A01 = r0     // Catch:{ all -> 0x035a }
            int r0 = 360 - r0
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x035a }
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview display:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r4)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = " camera:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r3)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r2)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = " front:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r12)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = " portrait:"
            X.C36321k7.A1X(r0, r1, r13)     // Catch:{ all -> 0x035a }
            android.hardware.Camera r1 = r11.A07     // Catch:{ RuntimeException -> 0x015a }
            int r0 = r11.A01     // Catch:{ RuntimeException -> 0x015a }
            r1.setDisplayOrientation(r0)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0160
        L_0x015a:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-preview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x035a }
        L_0x0160:
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x035a }
            int r1 = r0.width     // Catch:{ all -> 0x035a }
            int r0 = r0.height     // Catch:{ all -> 0x035a }
            r8.setPreviewSize(r1, r0)     // Catch:{ all -> 0x035a }
            java.util.List r2 = r8.getSupportedFocusModes()     // Catch:{ all -> 0x035a }
            if (r2 == 0) goto L_0x0190
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x035a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x035a }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0195
            r8.setFocusMode(r1)     // Catch:{ all -> 0x035a }
            r15 = 1
            goto L_0x0196
        L_0x0190:
            java.lang.String r0 = "cameraview/start-preview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x035a }
        L_0x0195:
            r15 = 0
        L_0x0196:
            java.util.List r2 = r8.getSupportedFlashModes()     // Catch:{ all -> 0x035a }
            if (r2 == 0) goto L_0x0250
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview supported flash:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x035a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x035a }
            r11.A0N = r0     // Catch:{ all -> 0x035a }
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x01d5
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x023f
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            r8.setFlashMode(r0)     // Catch:{ all -> 0x035a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview set flash mode:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x035a }
        L_0x01d5:
            java.util.List r7 = r8.getSupportedPictureSizes()     // Catch:{ all -> 0x035a }
            X.75w r0 = X.C1505975w.A00     // Catch:{ all -> 0x035a }
            java.util.Collections.sort(r7, r0)     // Catch:{ all -> 0x035a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview picture sizes:"
            r1.append(r0)     // Catch:{ all -> 0x035a }
            java.lang.String r0 = A02(r7)     // Catch:{ all -> 0x035a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x035a }
            r4 = 640(0x280, float:8.97E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            android.hardware.Camera$Size r1 = r11.A04     // Catch:{ all -> 0x035a }
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 == 0) goto L_0x0267
            int r0 = r1.height     // Catch:{ all -> 0x035a }
            float r2 = (float) r0     // Catch:{ all -> 0x035a }
            int r0 = r1.width     // Catch:{ all -> 0x035a }
            float r0 = (float) r0     // Catch:{ all -> 0x035a }
            float r2 = r2 / r0
            java.util.Iterator r14 = r7.iterator()     // Catch:{ all -> 0x035a }
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x020a:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x035a }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x035a }
            int r6 = r0.width     // Catch:{ all -> 0x035a }
            int r5 = r0.height     // Catch:{ all -> 0x035a }
            int r1 = r6 * r5
            if (r1 >= r9) goto L_0x020a
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0229
            int r1 = r1 * 2
            int r0 = r4 * r3
            if (r1 >= r0) goto L_0x0229
            goto L_0x0286
        L_0x0229:
            float r1 = (float) r5     // Catch:{ all -> 0x035a }
            float r0 = (float) r6     // Catch:{ all -> 0x035a }
            float r1 = r1 / r0
            float r1 = X.C90494aF.A01(r1, r2)     // Catch:{ all -> 0x035a }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x020a
            r3 = r5
            r4 = r6
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0286
            r12 = r1
            goto L_0x020a
        L_0x023f:
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x035a }
            if (r0 != 0) goto L_0x01d5
            java.lang.String r0 = r8.getFlashMode()     // Catch:{ all -> 0x035a }
            goto L_0x0263
        L_0x0250:
            java.lang.String r0 = "cameraview/start-preview supported flash:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x035a }
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = r11.A0J     // Catch:{ all -> 0x035a }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x035a }
            if (r0 != 0) goto L_0x01d5
            java.lang.String r0 = "off"
        L_0x0263:
            r11.A0J = r0     // Catch:{ all -> 0x035a }
            goto L_0x01d5
        L_0x0267:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x035a }
        L_0x026b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x035a }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x035a }
            int r5 = r0.width     // Catch:{ all -> 0x035a }
            int r2 = r0.height     // Catch:{ all -> 0x035a }
            int r1 = r5 * r2
            int r0 = r4 * r3
            if (r1 <= r0) goto L_0x026b
            if (r1 >= r9) goto L_0x026b
            r3 = r2
            r4 = r5
            goto L_0x026b
        L_0x0286:
            boolean r0 = r11.A0L     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x02c5
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x035a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x02c5
            java.lang.String[] r6 = A0a     // Catch:{ all -> 0x035a }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x035a }
            r2 = 3
            r1 = 0
        L_0x029a:
            r0 = r6[r1]     // Catch:{ all -> 0x035a }
            if (r0 == r5) goto L_0x02a8
            if (r5 == 0) goto L_0x0338
            if (r0 == 0) goto L_0x0338
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0338
        L_0x02a8:
            android.hardware.Camera r5 = r11.A07     // Catch:{ all -> 0x035a }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x035a }
            r1 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
            android.hardware.Camera$Size r2 = new android.hardware.Camera$Size     // Catch:{ all -> 0x035a }
            r2.<init>(r5, r1, r0)     // Catch:{ all -> 0x035a }
            boolean r0 = r7.contains(r2)     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0320
            int r4 = r2.width     // Catch:{ all -> 0x035a }
            int r3 = r2.height     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview workaround s4 mini preview size"
        L_0x02c2:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x035a }
        L_0x02c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview picture size "
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r4)     // Catch:{ all -> 0x035a }
            X.C36321k7.A1T(r10, r1, r3)     // Catch:{ all -> 0x035a }
            r8.setPictureSize(r4, r3)     // Catch:{ all -> 0x035a }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x035a }
            r0.setParameters(r8)     // Catch:{ all -> 0x035a }
            boolean r0 = r11.A0L     // Catch:{ all -> 0x035a }
            if (r0 != 0) goto L_0x0315
            boolean r0 = r11.A0S     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0315
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x035a }
            r0 = 0
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x035a }
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x035a }
            X.6ZW r0 = new X.6ZW     // Catch:{ all -> 0x035a }
            r0.<init>(r11)     // Catch:{ all -> 0x035a }
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x035a }
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x035a }
            int r1 = r0.width     // Catch:{ all -> 0x035a }
            int r0 = r0.height     // Catch:{ all -> 0x035a }
            int r1 = r1 * r0
            int r2 = r1 * 3
            r0 = 2
            int r2 = r2 / r0
            byte[] r1 = r11.A0P     // Catch:{ all -> 0x035a }
            if (r1 == 0) goto L_0x0306
            int r0 = r1.length     // Catch:{ all -> 0x035a }
            if (r0 == r2) goto L_0x030a
        L_0x0306:
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x035a }
            r11.A0P = r1     // Catch:{ all -> 0x035a }
        L_0x030a:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x035a }
            r0.addCallbackBuffer(r1)     // Catch:{ all -> 0x035a }
        L_0x030f:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x035a }
            r0.startPreview()     // Catch:{ all -> 0x035a }
            goto L_0x033e
        L_0x0315:
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x035a }
            X.6ZV r0 = new X.6ZV     // Catch:{ all -> 0x035a }
            r0.<init>(r11)     // Catch:{ all -> 0x035a }
            r1.setOneShotPreviewCallback(r0)     // Catch:{ all -> 0x035a }
            goto L_0x030f
        L_0x0320:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035a }
            java.lang.String r0 = "cameraview/start-preview could not workaround s4 mini preview size "
            r1.append(r0)     // Catch:{ all -> 0x035a }
            int r0 = r2.width     // Catch:{ all -> 0x035a }
            r1.append(r0)     // Catch:{ all -> 0x035a }
            r1.append(r10)     // Catch:{ all -> 0x035a }
            int r0 = r2.height     // Catch:{ all -> 0x035a }
            java.lang.String r0 = X.C36381kD.A10(r1, r0)     // Catch:{ all -> 0x035a }
            goto L_0x02c2
        L_0x0338:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x02c5
            goto L_0x029a
        L_0x033e:
            if (r15 != 0) goto L_0x0347
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x035a }
            X.6ZR r0 = X.AnonymousClass6ZR.A00     // Catch:{ all -> 0x035a }
            r1.autoFocus(r0)     // Catch:{ all -> 0x035a }
        L_0x0347:
            r0 = 1
            r11.A0K = r0     // Catch:{ all -> 0x035a }
            X.7lW r0 = r11.A0E     // Catch:{ all -> 0x035a }
            if (r0 == 0) goto L_0x0351
            r0.BdY()     // Catch:{ all -> 0x035a }
        L_0x0351:
            monitor-exit(r11)
            return
        L_0x0353:
            java.lang.String r0 = "previewSize is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x035a }
            throw r0     // Catch:{ all -> 0x035a }
        L_0x035a:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.A06(X.53k):void");
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        Log.i("cameraview/fallback-supported-preview-sizes");
        ArrayList A0I2 = AnonymousClass001.A0I();
        Camera camera = this.A07;
        Objects.requireNonNull(camera);
        Objects.requireNonNull(camera);
        A0I2.add(new Camera.Size(camera, 640, 480));
        return A0I2;
    }

    private int getRequiredCameraRotation() {
        int rotation = this.A0U.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i = 0;
        boolean A1S = AnonymousClass000.A1S(cameraInfo.facing, 1);
        this.A0L = A1S;
        int i2 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i3 = i2 - i;
        if (A1S) {
            i3 = i2 + i;
        }
        int i4 = (i3 + 360) % 360;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("cameraview/orientation display:");
        A0u.append(i);
        A0u.append(" camera:");
        A0u.append(i2);
        C36321k7.A1T(" rotate:", A0u, i4);
        return i4;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0I.A00(C19430v1.A0A);
    }

    public void A0B(SurfaceHolder surfaceHolder) {
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C1501974i(this, surfaceHolder, 26));
    }

    public void B2r() {
        C195409Ue r1 = this.A0Z;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void B7U(float f, float f2) {
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new AnonymousClass732(this, f, f2, 1));
    }

    public boolean BNS() {
        Camera camera = this.A07;
        if (camera == null || !this.A0N) {
            return false;
        }
        return "torch".equals(camera.getParameters().getFlashMode());
    }

    public boolean BQ2() {
        Camera camera;
        if (!this.A0L || !"on".equals(this.A0J) || (camera = this.A07) == null) {
            return false;
        }
        List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(this.A0J)) {
            return true;
        }
        return false;
    }

    public void Boh() {
        if (this instanceof C1030453i) {
            C1030453i r1 = (C1030453i) this;
            r1.A0B(r1.A04);
            return;
        }
        A0B(this.A0V);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0262, code lost:
        if (r2.contains(r1) != false) goto L_0x0264;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d1 A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fa A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x032a A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0363 A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a0 A[SYNTHETIC, Splitter:B:147:0x03a0] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0457 A[Catch:{ RuntimeException -> 0x045b }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0240 A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0288 A[Catch:{ IOException -> 0x02de }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0299 A[Catch:{ IOException -> 0x02de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Buy(java.io.File r26, int r27) {
        /*
            r25 = this;
            r6 = r25
            monitor-enter(r6)
            r24 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video front:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            boolean r0 = r6.A0L     // Catch:{ all -> 0x048b }
            X.C36331k8.A1S(r1, r0)     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ all -> 0x048b }
            r0.<init>()     // Catch:{ all -> 0x048b }
            r6.A08 = r0     // Catch:{ all -> 0x048b }
            int r0 = r6.A00     // Catch:{ all -> 0x048b }
            r4 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r4)     // Catch:{ all -> 0x048b }
            r3 = 5
            r2 = 1
            int r0 = r6.A00     // Catch:{ all -> 0x048b }
            if (r1 == 0) goto L_0x002c
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r4)     // Catch:{ all -> 0x048b }
            goto L_0x003d
        L_0x002c:
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r3)     // Catch:{ all -> 0x048b }
            int r0 = r6.A00     // Catch:{ all -> 0x048b }
            if (r1 == 0) goto L_0x0039
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r3)     // Catch:{ all -> 0x048b }
            goto L_0x003d
        L_0x0039:
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r2)     // Catch:{ all -> 0x048b }
        L_0x003d:
            if (r5 != 0) goto L_0x0041
            goto L_0x0471
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video profile:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.videoFrameWidth     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r13 = "x"
            r1.append(r13)     // Catch:{ all -> 0x048b }
            int r0 = r5.videoFrameHeight     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = " videoCodec:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.videoCodec     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = " audioCodec:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.audioCodec     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = " fileFormat:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.fileFormat     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = " videoFrameRate:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.videoFrameRate     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r23 = " videoBitRate:"
            r0 = r23
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r5.videoBitRate     // Catch:{ all -> 0x048b }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x048b }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Parameters r15 = r0.getParameters()     // Catch:{ all -> 0x048b }
            java.util.List r22 = r15.getSupportedPreviewSizes()     // Catch:{ all -> 0x048b }
            if (r22 != 0) goto L_0x00a0
            java.util.List r22 = r6.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x048b }
        L_0x00a0:
            java.util.List r7 = r15.getSupportedVideoSizes()     // Catch:{ all -> 0x048b }
            if (r7 != 0) goto L_0x00a8
            r7 = r22
        L_0x00a8:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "cameraview/prepare-video no supported video sizes"
            goto L_0x0473
        L_0x00b2:
            r21 = 2147483647(0x7fffffff, float:NaN)
            android.hardware.Camera$Size r4 = r15.getPreferredPreviewSizeForVideo()     // Catch:{ all -> 0x048b }
            if (r4 == 0) goto L_0x0153
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r4.width     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            r1.append(r13)     // Catch:{ all -> 0x048b }
            int r0 = r4.height     // Catch:{ all -> 0x048b }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x048b }
            int r2 = r4.width     // Catch:{ all -> 0x048b }
            r0 = 176(0xb0, float:2.47E-43)
            if (r2 != r0) goto L_0x00dd
            int r1 = r4.height     // Catch:{ all -> 0x048b }
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x00e1
        L_0x00dd:
            int r0 = r4.height     // Catch:{ all -> 0x048b }
            int r21 = r2 * r0
        L_0x00e1:
            X.75v r0 = X.C1505875v.A00     // Catch:{ all -> 0x048b }
            java.util.Collections.sort(r7, r0)     // Catch:{ all -> 0x048b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video supported video sizes:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = A02(r7)     // Catch:{ all -> 0x048b }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x048b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video supported preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = A02(r22)     // Catch:{ all -> 0x048b }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r1 = r6.A04     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "previewSize is NULL"
            java.util.Objects.requireNonNull(r1, r0)     // Catch:{ all -> 0x048b }
            int r0 = r1.width     // Catch:{ all -> 0x048b }
            double r0 = (double) r0     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r2 = r6.A04     // Catch:{ all -> 0x048b }
            int r2 = r2.height     // Catch:{ all -> 0x048b }
            double r2 = (double) r2     // Catch:{ all -> 0x048b }
            double r0 = r0 / r2
            java.util.Iterator r20 = r7.iterator()     // Catch:{ all -> 0x048b }
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r9 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0124:
            boolean r2 = r20.hasNext()     // Catch:{ all -> 0x048b }
            if (r2 == 0) goto L_0x0159
            java.lang.Object r14 = r20.next()     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r14 = (android.hardware.Camera.Size) r14     // Catch:{ all -> 0x048b }
            int r3 = r14.width     // Catch:{ all -> 0x048b }
            r2 = 1280(0x500, float:1.794E-42)
            if (r3 > r2) goto L_0x0124
            r2 = 320(0x140, float:4.48E-43)
            if (r3 < r2) goto L_0x0124
            double r2 = (double) r3     // Catch:{ all -> 0x048b }
            int r7 = r14.height     // Catch:{ all -> 0x048b }
            double r7 = (double) r7     // Catch:{ all -> 0x048b }
            double r2 = r2 / r7
            android.hardware.Camera$Size r7 = r6.A06     // Catch:{ all -> 0x048b }
            if (r7 == 0) goto L_0x014f
            double r18 = X.C90504aG.A00(r0, r2)     // Catch:{ all -> 0x048b }
            double r16 = X.C90504aG.A00(r0, r9)     // Catch:{ all -> 0x048b }
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0124
        L_0x014f:
            r6.A06 = r14     // Catch:{ all -> 0x048b }
            r9 = r2
            goto L_0x0124
        L_0x0153:
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            goto L_0x00e1
        L_0x0159:
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x048b }
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = "cameraview/prepare-video cannot find video size"
            goto L_0x0473
        L_0x0161:
            java.util.Iterator r1 = r22.iterator()     // Catch:{ all -> 0x048b }
        L_0x0165:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x017c
            java.lang.Object r9 = r1.next()     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r9 = (android.hardware.Camera.Size) r9     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x048b }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x0165
            if (r9 != 0) goto L_0x0200
            goto L_0x017d
        L_0x017c:
            r9 = 0
        L_0x017d:
            android.hardware.Camera$Size r1 = r6.A06     // Catch:{ all -> 0x048b }
            int r0 = r1.width     // Catch:{ all -> 0x048b }
            double r2 = (double) r0     // Catch:{ all -> 0x048b }
            int r0 = r1.height     // Catch:{ all -> 0x048b }
            double r0 = (double) r0     // Catch:{ all -> 0x048b }
            double r2 = r2 / r0
            java.util.Iterator r14 = r22.iterator()     // Catch:{ all -> 0x048b }
        L_0x018a:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r10 = r14.next()     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x048b }
            int r8 = r10.width     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r1 = r6.A06     // Catch:{ all -> 0x048b }
            int r0 = r1.width     // Catch:{ all -> 0x048b }
            if (r8 < r0) goto L_0x018a
            int r7 = r10.height     // Catch:{ all -> 0x048b }
            int r0 = r1.height     // Catch:{ all -> 0x048b }
            if (r7 < r0) goto L_0x018a
            int r1 = r7 * r8
            r0 = r21
            if (r1 > r0) goto L_0x018a
            double r0 = (double) r8     // Catch:{ all -> 0x048b }
            double r7 = (double) r7     // Catch:{ all -> 0x048b }
            double r0 = r0 / r7
            if (r9 == 0) goto L_0x01bb
            double r18 = X.C90504aG.A00(r2, r0)     // Catch:{ all -> 0x048b }
            double r16 = X.C90504aG.A00(r2, r11)     // Catch:{ all -> 0x048b }
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x018a
        L_0x01bb:
            r9 = r10
            r11 = r0
            goto L_0x018a
        L_0x01be:
            if (r9 != 0) goto L_0x0200
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size that is larger than video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            java.util.Iterator r14 = r22.iterator()     // Catch:{ all -> 0x048b }
        L_0x01c9:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r10 = r14.next()     // Catch:{ all -> 0x048b }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x048b }
            int r7 = r10.height     // Catch:{ all -> 0x048b }
            int r8 = r10.width     // Catch:{ all -> 0x048b }
            int r1 = r7 * r8
            r0 = r21
            if (r1 > r0) goto L_0x01c9
            double r0 = (double) r8     // Catch:{ all -> 0x048b }
            double r7 = (double) r7     // Catch:{ all -> 0x048b }
            double r0 = r0 / r7
            if (r9 == 0) goto L_0x01f0
            double r18 = X.C90504aG.A00(r2, r0)     // Catch:{ all -> 0x048b }
            double r16 = X.C90504aG.A00(r2, r11)     // Catch:{ all -> 0x048b }
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c9
        L_0x01f0:
            r9 = r10
            r11 = r0
            goto L_0x01c9
        L_0x01f3:
            if (r9 != 0) goto L_0x0200
            java.lang.String r0 = "cameraview/prepare-video use preferred video size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            if (r4 != 0) goto L_0x0201
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size"
            goto L_0x0473
        L_0x0200:
            r4 = r9
        L_0x0201:
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x048b }
            int r7 = r0.width     // Catch:{ all -> 0x048b }
            r5.videoFrameWidth = r7     // Catch:{ all -> 0x048b }
            int r3 = r0.height     // Catch:{ all -> 0x048b }
            r5.videoFrameHeight = r3     // Catch:{ all -> 0x048b }
            int r0 = r7 * r3
            int r2 = r0 * 4
            r5.videoBitRate = r2     // Catch:{ all -> 0x048b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video use profile:"
            X.C90464aC.A1K(r0, r13, r1, r7, r3)     // Catch:{ all -> 0x048b }
            r0 = r23
            r1.append(r0)     // Catch:{ all -> 0x048b }
            r1.append(r2)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            int r0 = r4.width     // Catch:{ all -> 0x048b }
            r1.append(r0)     // Catch:{ all -> 0x048b }
            r1.append(r13)     // Catch:{ all -> 0x048b }
            int r0 = r4.height     // Catch:{ all -> 0x048b }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x048b }
            java.lang.String r1 = "cam_mode"
            r0 = 1
            r15.set(r1, r0)     // Catch:{ all -> 0x048b }
            java.util.List r2 = r15.getSupportedFocusModes()     // Catch:{ all -> 0x048b }
            if (r2 == 0) goto L_0x0288
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cameraview/prepare-video supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x048b }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x048b }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x048b }
            java.lang.String r1 = "continuous-video"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x048b }
            if (r0 != 0) goto L_0x0264
            java.lang.String r1 = "infinity"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x0267
        L_0x0264:
            r15.setFocusMode(r1)     // Catch:{ all -> 0x048b }
        L_0x0267:
            android.hardware.Camera$Size r13 = r6.A04     // Catch:{ all -> 0x048b }
            int r0 = r13.width     // Catch:{ all -> 0x048b }
            double r7 = (double) r0     // Catch:{ all -> 0x048b }
            int r0 = r13.height     // Catch:{ all -> 0x048b }
            double r2 = (double) r0     // Catch:{ all -> 0x048b }
            double r11 = r7 / r2
            int r0 = r4.width     // Catch:{ all -> 0x048b }
            double r0 = (double) r0     // Catch:{ all -> 0x048b }
            int r9 = r4.height     // Catch:{ all -> 0x048b }
            double r9 = (double) r9     // Catch:{ all -> 0x048b }
            double r0 = r0 / r9
            double r9 = X.C90504aG.A00(r11, r0)     // Catch:{ all -> 0x048b }
            double r2 = r2 / r7
            double r0 = X.C90504aG.A00(r2, r0)     // Catch:{ all -> 0x048b }
            double r7 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x048b }
            r6.A05 = r13     // Catch:{ all -> 0x048b }
            goto L_0x028e
        L_0x0288:
            java.lang.String r0 = "cameraview/prepare-video supported focus: null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            goto L_0x0267
        L_0x028e:
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r3 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x02af
            r2 = 1
            java.lang.String r0 = "cameraview/prepare-video restart preview for video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            int r1 = r4.width     // Catch:{ all -> 0x048b }
            int r0 = r4.height     // Catch:{ all -> 0x048b }
            r15.setPreviewSize(r1, r0)     // Catch:{ all -> 0x048b }
            r6.A05 = r4     // Catch:{ all -> 0x048b }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.stopPreview()     // Catch:{ all -> 0x048b }
            r6.A0K = r3     // Catch:{ all -> 0x048b }
        L_0x02af:
            java.lang.String r1 = r6.A0J     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x02ca
            java.util.List r0 = r15.getSupportedFlashModes()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x02ca
            java.lang.String r1 = "torch"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x02ca
            r15.setFlashMode(r1)     // Catch:{ all -> 0x048b }
        L_0x02ca:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.setParameters(r15)     // Catch:{ all -> 0x048b }
            if (r2 == 0) goto L_0x02ef
            java.lang.String r0 = "cameraview/prepare-video restart preview"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x02de }
            android.view.SurfaceHolder r0 = r6.A0V     // Catch:{ IOException -> 0x02de }
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x02de }
            goto L_0x02e4
        L_0x02de:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video  error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x048b }
        L_0x02e4:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.startPreview()     // Catch:{ all -> 0x048b }
            r0 = 1
            r6.A0K = r0     // Catch:{ all -> 0x048b }
            r6.requestLayout()     // Catch:{ all -> 0x048b }
        L_0x02ef:
            android.hardware.Camera r1 = r6.A07     // Catch:{ all -> 0x048b }
            r0 = r24
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x048b }
            boolean r0 = r6.A0L     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x031f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x048b }
            r0 = 27
            if (r1 != r0) goto L_0x031d
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "oppo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x031d
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "cph1803"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x048b }
            if (r0 != 0) goto L_0x031f
            java.lang.String r0 = "cph1901"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            r4 = 1
            goto L_0x0320
        L_0x031f:
            r4 = 0
        L_0x0320:
            X.0yE r0 = r6.A0G     // Catch:{ all -> 0x048b }
            boolean r2 = r0.A0C()     // Catch:{ all -> 0x048b }
            java.lang.String r3 = "camerview/prepare-video record audio denied, will record without sound"
            if (r4 == 0) goto L_0x0363
            X.0yE r0 = r6.A0G     // Catch:{ all -> 0x048b }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x048b }
            if (r0 == 0) goto L_0x035f
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x048b }
        L_0x0338:
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            r0 = 2
            A04(r5, r1, r6, r0, r2)     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x048b }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x048b }
        L_0x0347:
            int r0 = r6.getRequiredCameraRotation()     // Catch:{ all -> 0x048b }
            int r0 = r0 + r27
            int r1 = r0 % 360
            if (r4 == 0) goto L_0x0359
            int r0 = r1 % 180
            if (r0 != 0) goto L_0x0359
            int r0 = r1 + 180
            int r1 = r0 % 360
        L_0x0359:
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ all -> 0x048b }
            r0.setOrientationHint(r1)     // Catch:{ all -> 0x048b }
            goto L_0x0399
        L_0x035f:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x048b }
            goto L_0x0338
        L_0x0363:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.unlock()     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r1.setCamera(r0)     // Catch:{ all -> 0x048b }
            if (r2 == 0) goto L_0x0372
            goto L_0x0376
        L_0x0372:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x048b }
            goto L_0x037c
        L_0x0376:
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x048b }
        L_0x037c:
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            r0 = 1
            A04(r5, r1, r6, r0, r2)     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x048b }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x048b }
            android.view.SurfaceHolder r0 = r6.getHolder()     // Catch:{ all -> 0x048b }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x048b }
            r1.setPreviewDisplay(r0)     // Catch:{ all -> 0x048b }
            goto L_0x0347
        L_0x0399:
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ IOException | IllegalStateException -> 0x0465 }
            r0.prepare()     // Catch:{ IOException | IllegalStateException -> 0x0465 }
            if (r4 == 0) goto L_0x0443
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.stopPreview()     // Catch:{ all -> 0x048b }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x03ad }
            r0 = r24
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x03ad }
            goto L_0x03b3
        L_0x03ad:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error clearing preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x048b }
        L_0x03b3:
            r0 = 1
            X.6Ux r3 = new X.6Ux     // Catch:{ all -> 0x048b }
            r3.<init>(r0)     // Catch:{ all -> 0x048b }
            r6.A0A = r3     // Catch:{ all -> 0x048b }
            android.view.SurfaceHolder r0 = r6.A0V     // Catch:{ all -> 0x048b }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x048b }
            r1 = 0
            X.677 r0 = new X.677     // Catch:{ all -> 0x048b }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x048b }
            r6.A0C = r0     // Catch:{ all -> 0x048b }
            r0.A00()     // Catch:{ all -> 0x048b }
            X.5yS r1 = new X.5yS     // Catch:{ all -> 0x048b }
            r1.<init>()     // Catch:{ all -> 0x048b }
            X.61W r0 = new X.61W     // Catch:{ all -> 0x048b }
            r0.<init>(r1)     // Catch:{ all -> 0x048b }
            r6.A0B = r0     // Catch:{ all -> 0x048b }
            r0 = 1
            int[] r2 = new int[r0]     // Catch:{ all -> 0x048b }
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r2, r1)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "glGenTextures"
            X.C132866Vo.A02(r0)     // Catch:{ all -> 0x048b }
            r3 = r2[r1]     // Catch:{ all -> 0x048b }
            r0 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r0, r3)     // Catch:{ all -> 0x048b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "glBindTexture "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x048b }
            X.C132866Vo.A02(r0)     // Catch:{ all -> 0x048b }
            r2 = 36197(0x8d65, float:5.0723E-41)
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)     // Catch:{ all -> 0x048b }
            X.C90514aH.A1D()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "glTexParameter"
            X.C132866Vo.A02(r0)     // Catch:{ all -> 0x048b }
            r6.A02 = r3     // Catch:{ all -> 0x048b }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x048b }
            r2.<init>(r3)     // Catch:{ all -> 0x048b }
            r6.A03 = r2     // Catch:{ all -> 0x048b }
            r1 = 2
            X.7pe r0 = new X.7pe     // Catch:{ all -> 0x048b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x048b }
            r2.setOnFrameAvailableListener(r0)     // Catch:{ all -> 0x048b }
            X.6Ux r3 = r6.A0A     // Catch:{ all -> 0x048b }
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ all -> 0x048b }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x048b }
            r1 = 1
            X.677 r0 = new X.677     // Catch:{ all -> 0x048b }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x048b }
            r6.A0D = r0     // Catch:{ all -> 0x048b }
            r0.A00()     // Catch:{ all -> 0x048b }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x0438 }
            android.graphics.SurfaceTexture r0 = r6.A03     // Catch:{ IOException -> 0x0438 }
            r1.setPreviewTexture(r0)     // Catch:{ IOException -> 0x0438 }
            goto L_0x043e
        L_0x0438:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error setting preview texture"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x048b }
        L_0x043e:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x048b }
            r0.startPreview()     // Catch:{ all -> 0x048b }
        L_0x0443:
            java.lang.String r0 = "cameraview/start-video-capture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x045b }
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ RuntimeException -> 0x045b }
            java.util.Objects.requireNonNull(r0)     // Catch:{ RuntimeException -> 0x045b }
            r0.start()     // Catch:{ RuntimeException -> 0x045b }
            r0 = 1
            r6.A0M = r0     // Catch:{ RuntimeException -> 0x045b }
            X.7lW r0 = r6.A0E     // Catch:{ RuntimeException -> 0x045b }
            if (r0 == 0) goto L_0x0489
            r0.BkF()     // Catch:{ RuntimeException -> 0x045b }
            goto L_0x0489
        L_0x045b:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x048b }
            r6.A03()     // Catch:{ all -> 0x048b }
            goto L_0x0485
        L_0x0465:
            r1 = move-exception
            r1.getMessage()     // Catch:{ all -> 0x048b }
            r6.A03()     // Catch:{ all -> 0x048b }
            r0 = 1
            A08(r6, r1, r0)     // Catch:{ all -> 0x048b }
            goto L_0x0476
        L_0x0471:
            java.lang.String r0 = "cameraview/ no profile"
        L_0x0473:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x048b }
        L_0x0476:
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x048b }
            r6.A03()     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "CameraCustomException: Start-video-capture failed"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x048b }
            r1.<init>(r0)     // Catch:{ all -> 0x048b }
        L_0x0485:
            r0 = 1
            A08(r6, r1, r0)     // Catch:{ all -> 0x048b }
        L_0x0489:
            monitor-exit(r6)
            return
        L_0x048b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x048d }
        L_0x048d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.Buy(java.io.File, int):void");
    }

    public void Bvw() {
        String str;
        Camera camera = this.A07;
        if (camera != null && this.A0N) {
            Camera.Parameters parameters = camera.getParameters();
            if (BNS()) {
                str = "off";
            } else {
                str = "torch";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r1 == 2) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            int r13 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A07
            java.lang.String r16 = "x"
            if (r0 == 0) goto L_0x0042
            android.hardware.Camera$Size r10 = r11.A05
            if (r10 != 0) goto L_0x0043
            java.util.List r0 = r11.A0R
            if (r0 == 0) goto L_0x0042
            X.0yb r0 = r11.A0F
            android.view.WindowManager r0 = r0.A0L()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0033
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            java.util.List r2 = r11.A0R
            r1 = r13
            r0 = r12
            if (r3 == 0) goto L_0x003c
            r1 = r12
            r0 = r13
        L_0x003c:
            android.hardware.Camera$Size r10 = A01(r2, r1, r0)
            if (r10 != 0) goto L_0x0043
        L_0x0042:
            return
        L_0x0043:
            double r4 = (double) r13
            double r2 = (double) r12
            double r8 = r4 / r2
            int r15 = r10.width
            double r6 = (double) r15
            int r14 = r10.height
            double r0 = (double) r14
            double r6 = r6 / r0
            double r8 = X.C90504aG.A00(r8, r6)
            double r0 = r2 / r4
            double r0 = X.C90504aG.A00(r0, r6)
            double r0 = java.lang.Math.min(r8, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "cameraview/measure optimalpreviewsize:"
            r6 = r16
            X.C90464aC.A1K(r8, r6, r7, r15, r14)
            java.lang.String r8 = " measured:"
            X.C90464aC.A1K(r8, r6, r7, r13, r12)
            java.lang.String r6 = " aspect diff:"
            r7.append(r6)
            r7.append(r0)
            X.C36411kG.A1P(r7)
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0042
            boolean r1 = X.C90474aD.A1T(r13, r12)
            int r13 = r10.width
            int r12 = r10.height
            boolean r0 = X.C90474aD.A1T(r13, r12)
            r8 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            java.lang.String r6 = " scaleMax:"
            java.lang.String r7 = "cameraview/measure optimalpreviewsize scaleMin:"
            if (r1 != r0) goto L_0x00d9
            double r0 = (double) r13
            double r4 = r4 / r0
            double r0 = (double) r12
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r7)
            r4.append(r0)
            r4.append(r6)
            r4.append(r2)
            X.C36411kG.A1P(r4)
            double r5 = r2 / r0
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x00ba
            r0 = r2
        L_0x00ba:
            int r2 = r10.width
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.height
        L_0x00c1:
            double r2 = (double) r2
            double r0 = r0 * r2
            int r2 = (int) r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cameraview/measure result:"
            r1.append(r0)
            r1.append(r4)
            r0 = r16
            X.C36321k7.A1T(r0, r1, r2)
            r11.setMeasuredDimension(r4, r2)
            return
        L_0x00d9:
            double r0 = (double) r12
            double r4 = r4 / r0
            double r0 = (double) r13
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r3 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r7)
            r2.append(r0)
            r2.append(r6)
            r2.append(r3)
            X.C36411kG.A1P(r2)
            double r5 = r3 / r0
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x00fc
            r0 = r3
        L_0x00fc:
            int r2 = r10.height
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.width
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.onMeasure(int, int):void");
    }

    public void setQrDecodeHints(Map map) {
        this.A0Z.A01 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r3.contains(r1) != false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5 A[Catch:{ RuntimeException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd A[Catch:{ RuntimeException -> 0x0026 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            r2 = r21
            boolean r0 = r2 instanceof X.C1030453i
            if (r0 == 0) goto L_0x014d
            X.53i r2 = (X.C1030453i) r2
            android.view.SurfaceHolder r7 = r2.A04
            android.view.Surface r0 = r7.getSurface()
            if (r0 == 0) goto L_0x0173
            android.hardware.Camera r0 = r2.A02
            if (r0 == 0) goto L_0x0173
            r0.stopPreview()     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.A02     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0148
            int r3 = r2.getDisplayOrientation()     // Catch:{ all -> 0x014a }
            android.hardware.Camera r0 = r2.A02     // Catch:{ RuntimeException -> 0x0026 }
            r0.setDisplayOrientation(r3)     // Catch:{ RuntimeException -> 0x0026 }
            goto L_0x002c
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "bloks_camera/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014a }
        L_0x002c:
            android.hardware.Camera r0 = r2.A02     // Catch:{ all -> 0x014a }
            android.hardware.Camera$Parameters r8 = r0.getParameters()     // Catch:{ all -> 0x014a }
            r8.setRotation(r3)     // Catch:{ all -> 0x014a }
            java.util.List r3 = r8.getSupportedFocusModes()     // Catch:{ all -> 0x014a }
            if (r3 == 0) goto L_0x0084
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "bloks_camera/startpreview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.Object[] r0 = r3.toArray()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x014a }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x014a }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = "auto"
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = "macro"
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = "edof"
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0072
        L_0x006f:
            r8.setFocusMode(r1)     // Catch:{ all -> 0x014a }
        L_0x0072:
            int r3 = r2.A01     // Catch:{ all -> 0x014a }
            if (r3 <= 0) goto L_0x0134
            int r11 = r2.A00     // Catch:{ all -> 0x014a }
            if (r11 <= 0) goto L_0x0134
            android.content.res.Configuration r0 = X.C36431kI.A0H(r2)     // Catch:{ all -> 0x014a }
            int r1 = r0.orientation     // Catch:{ all -> 0x014a }
            r0 = 1
            if (r1 != r0) goto L_0x008a
            goto L_0x0096
        L_0x0084:
            java.lang.String r0 = "bloks_camera/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x014a }
            goto L_0x0072
        L_0x008a:
            android.content.res.Configuration r0 = X.C36431kI.A0H(r2)     // Catch:{ all -> 0x014a }
            int r1 = r0.orientation     // Catch:{ all -> 0x014a }
            r0 = 2
            if (r1 != r0) goto L_0x009a
            double r5 = (double) r3     // Catch:{ all -> 0x014a }
            double r0 = (double) r11     // Catch:{ all -> 0x014a }
            goto L_0x0098
        L_0x0096:
            double r5 = (double) r11     // Catch:{ all -> 0x014a }
            double r0 = (double) r3     // Catch:{ all -> 0x014a }
        L_0x0098:
            double r5 = r5 / r0
            goto L_0x009c
        L_0x009a:
            r5 = 0
        L_0x009c:
            java.util.List r20 = r8.getSupportedPreviewSizes()     // Catch:{ all -> 0x014a }
            java.util.Iterator r19 = r20.iterator()     // Catch:{ all -> 0x014a }
            r17 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r9 = 0
            r15 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00af:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x00db
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x014a }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x014a }
            int r0 = r10.width     // Catch:{ all -> 0x014a }
            double r0 = (double) r0     // Catch:{ all -> 0x014a }
            int r12 = r10.height     // Catch:{ all -> 0x014a }
            double r3 = (double) r12     // Catch:{ all -> 0x014a }
            double r0 = r0 / r3
            double r13 = X.C90504aG.A00(r0, r5)     // Catch:{ all -> 0x014a }
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00af
            int r0 = X.AnonymousClass000.A05(r11, r12)     // Catch:{ all -> 0x014a }
            double r0 = (double) r0     // Catch:{ all -> 0x014a }
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x00af
            r15 = r0
            r9 = r10
            goto L_0x00af
        L_0x00db:
            if (r9 != 0) goto L_0x0108
            java.lang.String r0 = "bloks_camera/getOptimalSize optimalSize under tolerance not found"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x014a }
            java.util.Iterator r11 = r20.iterator()     // Catch:{ all -> 0x014a }
        L_0x00e6:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x014a }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x014a }
            int r0 = r10.width     // Catch:{ all -> 0x014a }
            double r3 = (double) r0     // Catch:{ all -> 0x014a }
            int r0 = r10.height     // Catch:{ all -> 0x014a }
            double r0 = (double) r0     // Catch:{ all -> 0x014a }
            double r3 = r3 / r0
            double r3 = X.C90504aG.A00(r3, r5)     // Catch:{ all -> 0x014a }
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
            r9 = r10
            r17 = r3
            goto L_0x00e6
        L_0x0105:
            if (r9 != 0) goto L_0x0108
            goto L_0x012f
        L_0x0108:
            int r1 = r9.width     // Catch:{ all -> 0x014a }
            int r0 = r9.height     // Catch:{ all -> 0x014a }
            r8.setPreviewSize(r1, r0)     // Catch:{ all -> 0x014a }
            int r1 = r9.width     // Catch:{ all -> 0x014a }
            int r0 = r9.height     // Catch:{ all -> 0x014a }
            r8.setPictureSize(r1, r0)     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "bloks_camera/preview and picture size width : "
            r1.append(r0)     // Catch:{ all -> 0x014a }
            int r0 = r9.width     // Catch:{ all -> 0x014a }
            r1.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "height :"
            r1.append(r0)     // Catch:{ all -> 0x014a }
            int r0 = r9.height     // Catch:{ all -> 0x014a }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x014a }
            goto L_0x0134
        L_0x012f:
            java.lang.String r0 = "bloks_camera/startpreview optimal size not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014a }
        L_0x0134:
            android.hardware.Camera r0 = r2.A02     // Catch:{ all -> 0x014a }
            r0.setParameters(r8)     // Catch:{ all -> 0x014a }
            android.hardware.Camera r0 = r2.A02     // Catch:{ Exception -> 0x0144 }
            r0.setPreviewDisplay(r7)     // Catch:{ Exception -> 0x0144 }
            android.hardware.Camera r0 = r2.A02     // Catch:{ Exception -> 0x0144 }
            r0.startPreview()     // Catch:{ Exception -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x014a }
        L_0x0148:
            monitor-exit(r2)
            return
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x014d:
            android.hardware.Camera r0 = r2.A07
            if (r0 == 0) goto L_0x0173
            android.view.SurfaceHolder r0 = r2.A0V
            android.view.Surface r0 = r0.getSurface()
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "cameraview/surface-changed: no surface"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "CameraCustomException: No surface"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 1
            A08(r2, r1, r0)
            return
        L_0x016a:
            boolean r0 = r2.A0M
            if (r0 != 0) goto L_0x0173
            r0 = r22
            r2.A0B(r0)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030553k.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!(this instanceof C1030453i)) {
            Handler handler = this.A09;
            Objects.requireNonNull(handler);
            handler.post(new C81323wp((Object) this, 4));
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C81323wp((Object) this, 6));
        A03();
    }

    public C1030553k(Context context) {
        super(context);
        C144296rx r3 = new C144296rx(this);
        this.A0W = r3;
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = C36371kC.A01(sharedPreferences, "camera_index");
        this.A0J = sharedPreferences.getString("flash_mode", "off");
        SurfaceHolder holder = getHolder();
        this.A0V = holder;
        holder.addCallback(this);
        holder.setType(3);
        this.A0U = C21060yb.A01(context).getDefaultDisplay();
        this.A0Y = new C92124dA(context, this);
        this.A0Z = new C195409Ue(new C144286rw(this), r3, 5);
    }

    public static String A02(List list) {
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            A0u.append(size.width);
            A0u.append('x');
            A0u.append(size.height);
            C90504aG.A1M(A0u);
        }
        if (A0u.length() > 1) {
            A0u.deleteCharAt(A0u.length() - 2);
        }
        return A0u.toString();
    }

    public static void A04(CamcorderProfile camcorderProfile, MediaRecorder mediaRecorder, C1030553k r5, int i, int i2) {
        mediaRecorder.setVideoSource(i);
        MediaRecorder mediaRecorder2 = r5.A08;
        if (i2 != 0) {
            mediaRecorder2.setProfile(camcorderProfile);
            return;
        }
        mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
        r5.A08.setVideoFrameRate(camcorderProfile.videoFrameRate);
        r5.A08.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        r5.A08.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        r5.A08.setVideoEncoder(camcorderProfile.videoCodec);
    }

    public static void A08(C1030553k r2, Exception exc, int i) {
        C36321k7.A1T("cameraview/on-error ", AnonymousClass000.A0u(), i);
        C160747lW r1 = r2.A0E;
        if (r1 != null) {
            int i2 = 2;
            if (i != 2) {
                i2 = 1;
            }
            r1.BSu(exc, i2);
        }
    }

    public boolean BLt() {
        return this.A0L;
    }

    public boolean BLy() {
        return this.A0K;
    }

    public boolean BMx() {
        return this.A0M;
    }

    public void Bok() {
    }

    public boolean BvN() {
        return this.A0N;
    }

    public String getFlashMode() {
        return this.A0J;
    }

    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("flash_mode_count");
        return C36371kC.A01(sharedPreferences, C36381kD.A10(A0u, this.A00));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0Y.enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0Q = handlerThread;
        handlerThread.start();
        this.A09 = C90514aH.A0M(this.A0Q);
        if (this.A0S) {
            this.A0Z.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0Y.disable();
        HandlerThread handlerThread = this.A0Q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A0Q = null;
        }
        this.A0Z.A00();
    }

    public void pause() {
    }

    public void setCameraCallback(C160747lW r1) {
        this.A0E = r1;
    }

    public void setQrScanningEnabled(boolean z) {
        this.A0S = z;
    }
}
