package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class A29 implements C23082B3p {
    public static final Camera.ShutterCallback A0g = C204229pf.A00;
    public static volatile A29 A0h;
    public UUID A00;
    public int A01;
    public int A02;
    public int A03;
    public Camera.ErrorCallback A04;
    public C22877AxY A05;
    public C159927kB A06;
    public AnonymousClass9U6 A07;
    public B4X A08;
    public C199989gN A09;
    public C23014B0f A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Matrix A0E;
    public C114795hq A0F;
    public boolean A0G;
    public boolean A0H;
    public final C202659mN A0I;
    public final C198999eX A0J;
    public final C194859Rn A0K;
    public final AnonymousClass9XH A0L;
    public final AnonymousClass9PE A0M = new AnonymousClass9PE();
    public final C204199pc A0N;
    public final AnonymousClass9WX A0O;
    public final AnonymousClass9VB A0P = new AnonymousClass9VB();
    public final AnonymousClass9VB A0Q = new AnonymousClass9VB();
    public final C201439jb A0R;
    public final C200199gr A0S;
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final int A0U;
    public final Context A0V;
    public final AnonymousClass9VB A0W = new AnonymousClass9VB();
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final AtomicBoolean A0Y = new AtomicBoolean(false);
    public volatile int A0Z;
    public volatile Camera A0a;
    public volatile C23072B3b A0b;
    public volatile AnonymousClass9PG A0c;
    public volatile FutureTask A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;

    public static void A04(A29 a29) {
        try {
            if (a29.A0e) {
                A06(a29);
            }
        } catch (RuntimeException e) {
            Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
        } catch (Throwable th) {
            if (a29.A0a != null) {
                a29.A02();
                a29.A0L.A00();
            }
            if (a29.A0b != null) {
                a29.A0b.BnV((SurfaceTexture) null);
            }
            a29.A0b = null;
            a29.A07 = null;
            throw th;
        }
        if (a29.A0a != null) {
            a29.A02();
            a29.A0L.A00();
        }
        if (a29.A0b != null) {
            a29.A0b.BnV((SurfaceTexture) null);
        }
        a29.A0b = null;
        a29.A07 = null;
    }

    public static void A06(A29 a29) {
        try {
            C23014B0f b0f = a29.A0A;
            if (b0f != null) {
                b0f.Bv9();
                a29.A0A = null;
            }
        } finally {
            a29.A0B((MediaRecorder) null);
            a29.A0e = false;
        }
    }

    public static synchronized void A07(A29 a29) {
        synchronized (a29) {
            FutureTask futureTask = a29.A0d;
            if (futureTask != null) {
                a29.A0S.A08(futureTask);
                a29.A0d = null;
            }
        }
    }

    public boolean BNQ() {
        try {
            C202659mN r2 = this.A0I;
            int i = C202659mN.A03;
            if (i == -1) {
                if (C202659mN.A03(r2)) {
                    i = C202659mN.A03;
                } else {
                    r2.A00.A06("Number of cameras must be loaded on background thread.");
                    i = Camera.getNumberOfCameras();
                    C202659mN.A03 = i;
                }
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void Brh(AnonymousClass9T8 r4, int i) {
        this.A0S.A00(r4, "set_rotation", new B8Y(this, i, 2));
    }

    public void Bsq(AnonymousClass9T8 r5, int i) {
        this.A0S.A00((AnonymousClass9T8) null, "set_zoom_level", new B8Y(this, i, 3));
    }

    public static int A00(A29 a29, int i) {
        int i2;
        int i3;
        int i4 = a29.A01;
        int A042 = a29.A0I.A04(i4);
        if (i == 1) {
            i2 = 90;
        } else if (i != 2) {
            i2 = 270;
            if (i != 3) {
                i2 = 0;
            }
        } else {
            i2 = 180;
        }
        if (i4 == 1) {
            i3 = 360 - ((A042 + i2) % 360);
        } else {
            i3 = (A042 - i2) + 360;
        }
        return i3 % 360;
    }

    public static AnonymousClass9JP A01(AnonymousClass9U6 r23, A29 a29, B4X b4x, int i) {
        List A032;
        List list;
        List list2;
        int i2;
        Trace.beginSection("Camera1Device.initialiseCamera");
        C202399lk.A01("initialiseCamera should not run on the UI thread");
        AnonymousClass9U6 r3 = r23;
        if (r23 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A29 a292 = a29;
            if (a292.A0a != null) {
                C202389lj.A00();
                AtomicBoolean atomicBoolean = a292.A0X;
                B4X b4x2 = b4x;
                int i3 = i;
                if (!atomicBoolean.get() || !r3.equals(a292.A07) || a292.A0b != r3.A02 || a292.A02 != i3 || C165567td.A1a(B4X.A0Z, b4x2)) {
                    a292.A08 = b4x2;
                    a292.A07 = r3;
                    C23072B3b b3b = r3.A02;
                    a292.A0b = b3b;
                    a292.A0K.A00(false, a292.A0a);
                    B4X b4x3 = a292.A08;
                    Object B84 = b4x3.B84(B4X.A0Y);
                    Object B842 = b4x3.B84(B4X.A0c);
                    int i4 = r3.A01;
                    int i5 = r3.A00;
                    C203089nH r32 = (C203089nH) b4x3.B84(B4X.A0a);
                    C194239Ot r2 = (C194239Ot) b4x3.B84(B4X.A0H);
                    a292.A0D = C165567td.A1a(B4X.A0N, b4x2);
                    boolean A1a = C165567td.A1a(B4X.A0Q, b4x2);
                    a292.A02 = i3;
                    A00(a292, i3);
                    AnonymousClass9WX r1 = a292.A0O;
                    C198429dX A012 = r1.A01(a292.A01);
                    C188348zR r0 = C188348zR.DEACTIVATED;
                    boolean equals = B842.equals(r0);
                    boolean equals2 = B84.equals(r0);
                    if (!equals) {
                        if (!equals2) {
                            list = C198429dX.A03(C198429dX.A0w, A012);
                            list2 = C198429dX.A03(C198429dX.A17, A012);
                            A032 = C198429dX.A03(C198429dX.A10, A012);
                        } else {
                            list2 = C198429dX.A03(C198429dX.A17, A012);
                            A032 = C198429dX.A03(C198429dX.A10, A012);
                            list = null;
                        }
                    } else if (!equals2) {
                        list = C198429dX.A03(C198429dX.A0w, A012);
                        A032 = C198429dX.A03(C198429dX.A10, A012);
                        list2 = null;
                    } else {
                        A032 = C198429dX.A03(C198429dX.A10, A012);
                        list = null;
                        list2 = null;
                    }
                    AnonymousClass9JN A013 = C203089nH.A01(r32, list, list2, A032, i4, i5);
                    C1693088o A002 = r1.A00(a292.A01);
                    if (A1a) {
                        A002.A00.A01(C201049ih.A0b, new AnonymousClass9W3(0, 0));
                    }
                    AnonymousClass9W3 r5 = A013.A00;
                    if (r5 != null) {
                        A002.A00.A01(C201049ih.A0j, r5);
                    }
                    AnonymousClass9W3 r33 = A013.A01;
                    C191289Cj r11 = C201049ih.A0p;
                    A002.A00.A01(r11, r33);
                    AnonymousClass9W3 r52 = A013.A02;
                    if (r52 != null) {
                        A002.A00.A01(C201049ih.A0w, r52);
                    }
                    A002.A03();
                    A002.A00.A01(C201049ih.A00, C36371kC.A0n());
                    A002.A00.A01(C201049ih.A0x, C36361kB.A0i());
                    A002.A00.A01(C201049ih.A0m, r2.A00(C198429dX.A03(C198429dX.A0y, A002.A00)));
                    A002.A00.A01(C201049ih.A0r, C36381kD.A0m());
                    int i6 = a292.A01;
                    C198429dX A014 = r1.A01(i6);
                    Number number = (Number) a292.A08.B84(B4X.A0S);
                    if (number.intValue() != 0) {
                        A002.A00.A01(C201049ih.A0Z, number);
                    }
                    A002.A02();
                    AnonymousClass9XH r7 = a292.A0L;
                    r7.A01(a292.A0a);
                    C201049ih A022 = r1.A02(i6);
                    AnonymousClass9W3 r22 = (AnonymousClass9W3) C201049ih.A04(r11, A022);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("startCameraPreview ");
                    int i7 = r22.A02;
                    C90494aF.A1L(A0u, i7);
                    int i8 = r22.A01;
                    Trace.beginSection(C36381kD.A10(A0u, i8));
                    C202389lj.A00();
                    C191289Cj r12 = C201049ih.A0l;
                    int A023 = C201049ih.A02(r12, A022);
                    int A042 = a292.A0I.A04(i6);
                    int i9 = a292.A0Z;
                    int i10 = a292.A02;
                    if (i10 == 1) {
                        i2 = 90;
                    } else if (i10 != 2) {
                        i2 = 270;
                        if (i10 != 3) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 180;
                    }
                    SurfaceTexture BI5 = b3b.BI5(i7, i8, A023, A042, i9, i2, i6, 0);
                    C202389lj.A00();
                    Camera camera = a292.A0a;
                    if (BI5 != null) {
                        camera.setPreviewTexture(BI5);
                    } else {
                        camera.setPreviewDisplay((SurfaceHolder) null);
                    }
                    a292.A0a.setDisplayOrientation(A00(a292, 0));
                    a292.A0H = C198429dX.A04(C198429dX.A0U, A014);
                    atomicBoolean.set(true);
                    a292.A0Y.set(false);
                    a292.A0f = C198429dX.A04(C198429dX.A0Z, A014);
                    C204199pc r122 = a292.A0N;
                    Camera camera2 = a292.A0a;
                    int i11 = a292.A01;
                    r122.A03 = camera2;
                    r122.A00 = i11;
                    AnonymousClass9WX r13 = r122.A05;
                    C198429dX A015 = r13.A01(i11);
                    r122.A0A = C198429dX.A03(C198429dX.A1A, A015);
                    r122.A0E = C198429dX.A04(C198429dX.A0Y, A015);
                    r122.A09 = C201049ih.A02(C201049ih.A0z, r13.A02(i11));
                    r122.A01 = C198429dX.A01(C198429dX.A0d, r13.A01(i11));
                    Camera camera3 = r122.A03;
                    Objects.requireNonNull(camera3);
                    camera3.setZoomChangeListener(r122);
                    r122.A0B = true;
                    C198999eX r14 = a292.A0J;
                    Camera camera4 = a292.A0a;
                    int i12 = a292.A01;
                    r14.A06.A06("The FocusController must be prepared on the Optic thread.");
                    r14.A01 = camera4;
                    r14.A00 = i12;
                    r14.A09 = true;
                    r14.A08 = false;
                    r14.A07 = false;
                    r14.A04 = true;
                    r14.A0A = false;
                    A09(a292, i7, i8);
                    r7.A02(a292.A0a, (AnonymousClass9W3) A022.A08(r11), C201049ih.A02(r12, A022));
                    A05(a292);
                    C201199j3.A00().A01 = 0;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("time to setPreviewSurfaceTexture:");
                    A0u2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    Log.d("Camera1Device", AnonymousClass000.A0q("ms", A0u2));
                    AnonymousClass9JP r15 = new AnonymousClass9JP(new AnonymousClass9JO(A014, A022, i6));
                    C202389lj.A00();
                    Trace.endSection();
                    Trace.endSection();
                    return r15;
                }
                if (a292.A0K.A00.A00()) {
                    A05(a292);
                }
                int i13 = a292.A01;
                C198429dX B9Q = a292.B9Q();
                A0A(a292, "Cannot get camera settings");
                return new AnonymousClass9JP(new AnonymousClass9JO(B9Q, a292.A0O.A02(a292.A01), i13));
            }
            throw C90514aH.A0s("Can't connect to the camera service.");
        }
        throw AnonymousClass001.A08("StartupConfiguration cannot be null");
    }

    private void A02() {
        if (this.A0a != null) {
            A07(this);
            this.A0X.set(false);
            this.A0Y.set(false);
            Camera camera = this.A0a;
            this.A0a = null;
            C204199pc r2 = this.A0N;
            if (r2.A0B) {
                Handler handler = r2.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                r2.A0A = null;
                Camera camera2 = r2.A03;
                Objects.requireNonNull(camera2);
                camera2.setZoomChangeListener((Camera.OnZoomChangeListener) null);
                r2.A03 = null;
                r2.A0B = false;
            }
            C198999eX r22 = this.A0J;
            r22.A06.A06("The FocusController must be released on the Optic thread.");
            r22.A09 = false;
            r22.A01 = null;
            r22.A08 = false;
            r22.A07 = false;
            this.A0f = false;
            AnonymousClass9WX r0 = this.A0O;
            r0.A02.remove(C202659mN.A00(r0.A03, this.A01));
            this.A0S.A03("close_camera_on_camera_handler_thread", new B8X(camera, this, 6));
        }
    }

    public static void A08(A29 a29, int i) {
        if (AnonymousClass6IC.A00(a29.A0V)) {
            C202399lk.A01("Should not check for open camera on the UI thread.");
            if (a29.A0a == null || a29.A01 != i) {
                int A002 = C202659mN.A00(a29.A0I, i);
                if (A002 != -1) {
                    a29.A02();
                    C201199j3.A00().A00 = SystemClock.elapsedRealtime();
                    Camera camera = (Camera) a29.A0S.A03("open_camera_on_camera_handler_thread", new B8Y(a29, A002, 1));
                    Objects.requireNonNull(camera);
                    a29.A0a = camera;
                    a29.A01 = i;
                    Camera camera2 = a29.A0a;
                    Camera.ErrorCallback errorCallback = a29.A04;
                    if (errorCallback == null) {
                        errorCallback = new C23190B8y(a29, 0);
                        a29.A04 = errorCallback;
                    }
                    camera2.setErrorCallback(errorCallback);
                    AnonymousClass9WX r2 = a29.A0O;
                    Camera camera3 = a29.A0a;
                    Objects.requireNonNull(camera3, "camera is null!");
                    C202389lj.A00();
                    int A003 = C202659mN.A00(r2.A03, i);
                    Camera.Parameters parameters = camera3.getParameters();
                    C1692488i r5 = new C1692488i(parameters);
                    r2.A00.put(A003, r5);
                    C1692788l r6 = new C1692788l(parameters, r5);
                    r2.A01.put(A003, r6);
                    r2.A02.put(A003, new C1693088o(parameters, camera3, r5, r6, i));
                    C202389lj.A00();
                    return;
                }
                throw new C21855Abf(AnonymousClass000.A0r("Open Camera 1 failed: camera facing is not available: ", AnonymousClass000.A0u(), i));
            }
            return;
        }
        throw new SecurityException("Open Camera 1 failed: No camera permissions!");
    }

    public void A0B(MediaRecorder mediaRecorder) {
        Camera camera = this.A0a;
        if (camera != null) {
            boolean z = this.A0B;
            int i = this.A03;
            if (mediaRecorder != null) {
                if (C200349hC.A02(C197019az.A00)) {
                    this.A0J.A01();
                }
                camera.unlock();
                mediaRecorder.setCamera(camera);
                mediaRecorder.setVideoSource(1);
                return;
            }
            camera.lock();
            if (C200349hC.A02(C197019az.A00)) {
                camera.reconnect();
            }
            C1693088o A002 = this.A0O.A00(this.A01);
            C191299Ck.A02(C201049ih.A0A, A002, i);
            A002.A00.A01(C201049ih.A0V, Boolean.valueOf(z));
            A002.A03();
            A002.A02();
        }
    }

    public void B0b(C22877AxY axY) {
        if (axY != null) {
            AnonymousClass9XH r4 = this.A0L;
            synchronized (r4) {
                r4.A03.A01(axY);
            }
            C201049ih A022 = this.A0O.A02(this.A01);
            C200199gr r2 = this.A0S;
            boolean A092 = r2.A09();
            boolean isConnected = isConnected();
            if (A092) {
                if (isConnected) {
                    r4.A02(this.A0a, (AnonymousClass9W3) A022.A08(C201049ih.A0p), C201049ih.A02(C201049ih.A0l, A022));
                }
            } else if (isConnected) {
                r2.A07("enable_preview_frame_listeners", new B8X(A022, this, 3));
            }
        } else {
            throw AnonymousClass001.A08("listener is required");
        }
    }

    public void B0c(C114715hh r4) {
        B4X b4x = this.A08;
        if (b4x == null || !C165567td.A1a(B4X.A0O, b4x)) {
            this.A0K.A01.A01(r4);
        } else {
            this.A0S.A07("add_on_preview_started_listener", new B8X(r4, this, 1));
        }
    }

    public boolean B5Z(AnonymousClass9T8 r5) {
        C201439jb r2 = this.A0R;
        UUID uuid = r2.A03;
        C202389lj.A00();
        AnonymousClass9PE r1 = this.A0M;
        AtomicReference atomicReference = r1.A00;
        C165587tf.A1R(atomicReference);
        C165587tf.A1R(atomicReference);
        r1.A00(0);
        C194859Rn r12 = this.A0K;
        r12.A01.A00();
        r12.A02.A00();
        Bqw((C157797eh) null);
        this.A0N.A06.A00();
        this.A0Q.A00();
        if (this.A0C) {
            r2.A03(this.A00);
            this.A00 = null;
        }
        C200199gr r22 = this.A0S;
        r22.A00(r5, "disconnect", new B8X(uuid, this, 5));
        r22.A07("disconnect_guard", C21734AYm.A00);
        return true;
    }

    public void B7T(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0U;
        rect.inset(i3, i3);
        this.A0S.A00(new B6y(this, 5), "focus", new B8X(rect, this, 0));
    }

    public C198429dX B9Q() {
        A0A(this, "Cannot get camera capabilities");
        return this.A0O.A01(this.A01);
    }

    public int BHL() {
        return this.A0I.A04(this.A01);
    }

    public boolean BJn(int i) {
        try {
            return this.A0I.A06(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public void BKd(Matrix matrix, int i, int i2, int i3) {
        C114795hq r1 = new C114795hq(matrix, i3, A00(this, this.A02), i, i2);
        this.A0F = r1;
        this.A0J.A03 = r1;
    }

    public boolean BP4(float[] fArr) {
        C114795hq r0 = this.A0F;
        if (r0 == null) {
            return false;
        }
        r0.A00.mapPoints(fArr);
        return true;
    }

    public void BPw(AnonymousClass9T8 r4, AnonymousClass9T3 r5) {
        this.A0S.A00(r4, "modify_settings", new B8X(r5, this, 4));
    }

    public void Bc2(int i) {
        if (!this.A0G) {
            this.A0Z = i;
            C23072B3b b3b = this.A0b;
            if (b3b != null) {
                b3b.BVY(this.A0Z);
            }
        }
    }

    public void Bns(C22877AxY axY) {
        if (axY != null) {
            AnonymousClass9XH r1 = this.A0L;
            synchronized (r1) {
                r1.A05.remove(axY);
                r1.A03.A02(axY);
            }
            if (this.A0R.A04) {
                this.A0S.A07("disable_preview_frame_listeners", new B8U((Object) this, 1));
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("listener is required");
    }

    public void Bnt(C114715hh r4) {
        B4X b4x = this.A08;
        if (b4x == null || !C165567td.A1a(B4X.A0O, b4x)) {
            this.A0K.A01.A02(r4);
        } else {
            this.A0S.A07("remove_on_preview_started_listener", new B8X(r4, this, 2));
        }
    }

    public void BqN(Handler handler) {
        this.A0S.A00 = handler;
    }

    public void Bqw(C157797eh r2) {
        this.A0J.A02 = r2;
    }

    public void BrC(boolean z) {
        this.A0G = z;
        if (z) {
            this.A0Z = 0;
            C23072B3b b3b = this.A0b;
            if (b3b != null) {
                b3b.BVY(this.A0Z);
            }
        }
    }

    public void BrN(C191159Bw r3) {
        C201439jb r0 = this.A0R;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void BvA(AnonymousClass9T8 r4, boolean z) {
        if (!this.A0e) {
            r4.A00(C90514aH.A0s("Not recording video"));
            return;
        }
        this.A0S.A00(r4, "stop_video_recording", new AYW(this, SystemClock.elapsedRealtime()));
    }

    public void BvQ(AnonymousClass9T8 r6) {
        Object obj = this.A0M.A00.get();
        Objects.requireNonNull(obj);
        if (((CountDownLatch) obj).getCount() <= 0) {
            C202389lj.A00();
            this.A0S.A00(r6, "switch_camera", new B8U((Object) this, 3));
        }
    }

    public int getZoomLevel() {
        C204199pc r1 = this.A0N;
        if (r1.A0B) {
            return r1.A09;
        }
        return 0;
    }

    public boolean isConnected() {
        if (this.A0a == null) {
            return false;
        }
        if (this.A0X.get() || this.A0Y.get()) {
            return true;
        }
        return false;
    }

    public A29(Context context) {
        this.A0V = context;
        C200199gr r3 = new C200199gr();
        this.A0S = r3;
        C201439jb r2 = new C201439jb(r3);
        this.A0R = r2;
        C202659mN r0 = new C202659mN(context.getPackageManager(), r2, r3);
        this.A0I = r0;
        AnonymousClass9WX r1 = new AnonymousClass9WX(r0);
        this.A0O = r1;
        C194859Rn r22 = new C194859Rn();
        this.A0K = r22;
        this.A0N = new C204199pc(r1, r3);
        this.A0J = new C198999eX(r1, r3);
        this.A0U = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0X(context)));
        this.A0L = new AnonymousClass9XH();
        if (C112775eR.A00) {
            C201199j3 A002 = C201199j3.A00();
            A002.A05.A01(new AnonymousClass94X());
            this.A0c = new AnonymousClass9PG();
            AnonymousClass9PG r02 = this.A0c;
            r02.A00.add(new AnonymousClass94W());
            r22.A03 = this.A0c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r10.A00(X.C199609fb.A0P) != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r10.A00(X.C199609fb.A0b) != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass61X r6, X.A29 r7, X.B4X r8, X.C198749e8 r9, X.C195499Un r10, X.C199609fb r11) {
        /*
            boolean r0 = X.C131956Rl.A00()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0039
            X.9Ch r0 = X.B4X.A0L
            boolean r0 = X.C165567td.A1a(r0, r8)
            if (r0 != 0) goto L_0x0039
            X.9Co r0 = X.C199609fb.A0T
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9Co r0 = X.C199609fb.A0Z
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9Co r0 = X.C199609fb.A0O
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9Co r0 = X.C199609fb.A0V
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9Co r0 = X.C199609fb.A0P
            java.lang.Object r0 = r10.A00(r0)
            r3 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            X.9Cm r0 = X.C198749e8.A03
            boolean r0 = X.C198749e8.A00(r0, r9)
            if (r0 == 0) goto L_0x004b
            X.9Co r0 = X.C199609fb.A0b
            java.lang.Object r0 = r10.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            X.9Co r1 = X.C199609fb.A0X
            java.lang.Object r0 = r10.A00(r1)
            if (r0 != 0) goto L_0x017e
            if (r11 == 0) goto L_0x017f
            X.9Cn r0 = X.C199609fb.A0M
            android.graphics.Rect r0 = r11.A02
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A01 = r0
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r11.A00(r1)
            byte[] r0 = (byte[]) r0
            r10.A0F = r0
        L_0x006c:
            X.9Co r1 = X.C199609fb.A0b
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r11.A00(r1)
            byte[] r0 = (byte[]) r0
            r10.A0G = r0
        L_0x007c:
            X.9Co r1 = X.C199609fb.A0Y
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r11.A00(r1)
            X.9Sq r0 = (X.C195139Sq) r0
            r10.A03 = r0
        L_0x008c:
            X.9Co r1 = X.C199609fb.A0d
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r11.A00(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A02 = r0
        L_0x009c:
            X.9Co r1 = X.C199609fb.A0T
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r10.A0E = r0
        L_0x00ac:
            X.9Co r1 = X.C199609fb.A0Z
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
        L_0x00bc:
            X.9Co r1 = X.C199609fb.A0O
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A06 = r0
        L_0x00cc:
            X.9Co r1 = X.C199609fb.A0P
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A08 = r0
        L_0x00dc:
            X.9Co r1 = X.C199609fb.A0V
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A07 = r0
        L_0x00ec:
            X.9Co r1 = X.C199609fb.A0R
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00f7
            r11.A00(r1)
        L_0x00f7:
            X.9Co r1 = X.C199609fb.A0Q
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r11.A00(r1)
            X.9fb r0 = (X.C199609fb) r0
            r10.A04 = r0
        L_0x0107:
            X.9Co r1 = X.C199609fb.A0a
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0B = r0
        L_0x0117:
            X.9Co r1 = X.C199609fb.A0e
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0D = r0
        L_0x0127:
            X.9Co r1 = X.C199609fb.A0S
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10.A05 = r0
        L_0x0137:
            X.9Co r1 = X.C199609fb.A0c
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0C = r0
        L_0x0147:
            X.9Co r1 = X.C199609fb.A0U
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A09 = r0
        L_0x0157:
            X.9Co r1 = X.C199609fb.A0W
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r11.A00(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r10.A00 = r0
        L_0x0167:
            if (r3 != 0) goto L_0x017d
            if (r2 != 0) goto L_0x017d
            if (r4 != 0) goto L_0x017d
            X.9gr r3 = r7.A0S
            X.9jb r0 = r7.A0R
            java.util.UUID r2 = r0.A03
            r1 = 44
            X.75C r0 = new X.75C
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r10, (int) r1)
            r3.A05(r0, r2)
        L_0x017d:
            return
        L_0x017e:
            r5 = 0
        L_0x017f:
            r4 = r5
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A29.A03(X.61X, X.A29, X.B4X, X.9e8, X.9Un, X.9fb):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.A29 r4) {
        /*
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0093
            X.AxY r1 = r4.A05
            if (r1 != 0) goto L_0x0012
            r0 = 1
            X.B9G r1 = new X.B9G
            r1.<init>(r4, r0)
            r4.A05 = r1
        L_0x0012:
            r4.B0b(r1)
            X.9Rn r0 = r4.A0K
            android.hardware.Camera r4 = r4.A0a
            X.9QO r3 = r0.A00
            java.util.concurrent.locks.ReentrantLock r2 = r3.A01
            r2.lock()
            if (r4 == 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            r2.lock()     // Catch:{ all -> 0x0080 }
            int r0 = r3.A00     // Catch:{ all -> 0x007b }
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0048
            r2.lock()     // Catch:{ all -> 0x0080 }
            int r0 = r3.A00     // Catch:{ all -> 0x007b }
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass000.A1S(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0080 }
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r2.unlock()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            int r0 = r3.A00     // Catch:{ all -> 0x0080 }
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0059
            r1 = 0
        L_0x0059:
            r2.unlock()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            boolean r0 = r3.A00()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0074
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x0080 }
            r2.unlock()     // Catch:{ all -> 0x0085 }
            X.C202389lj.A00()     // Catch:{ all -> 0x0085 }
            r4.startPreview()     // Catch:{ all -> 0x0085 }
            goto L_0x008d
        L_0x0074:
            java.lang.String r0 = "Cannot progress to STARTING, not in STOPPED state"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0080 }
        L_0x007f:
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.C202389lj.A00()
            r2.unlock()
            throw r0
        L_0x008d:
            X.C202389lj.A00()
            r2.unlock()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A29.A05(X.A29):void");
    }

    public static void A09(A29 a29, int i, int i2) {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        Matrix A0B2 = C90524aI.A0B();
        a29.A0E = A0B2;
        float f4 = 1.0f;
        if (a29.A01 == 1) {
            f4 = -1.0f;
        }
        A0B2.setScale(f4, 1.0f);
        int A002 = A00(a29, a29.A02);
        a29.A0E.postRotate((float) A002);
        if (A002 == 90 || A002 == 270) {
            matrix = a29.A0E;
            f = (float) i2;
            f2 = f / 2000.0f;
            f3 = (float) i;
        } else {
            matrix = a29.A0E;
            f = (float) i;
            f2 = f / 2000.0f;
            f3 = (float) i2;
        }
        matrix.postScale(f2, f3 / 2000.0f);
        a29.A0E.postTranslate(f / 2.0f, f3 / 2.0f);
    }

    public static void A0A(A29 a29, String str) {
        if (!a29.isConnected()) {
            throw new C21815Aar(str);
        }
    }

    public void B3U(AnonymousClass9T8 r10, AnonymousClass9U6 r11, B4X b4x, C22791Aw2 aw2, AnonymousClass7cE r14, String str, int i, int i2) {
        C202389lj.A00();
        if (this.A0C) {
            this.A00 = this.A0R.A02(this.A0S.A00, str);
        }
        this.A0S.A00(r10, "connect", new B8T(r11, this, b4x, i, i2, 0));
        C202389lj.A00();
    }

    public int B9I() {
        return this.A01;
    }

    public boolean BMy() {
        return this.A0e;
    }

    public boolean Bss(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        float f;
        matrix.reset();
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        int A002 = A00(this, this.A02);
        if (A002 == 90 || A002 == 270) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        float f5 = (float) i3;
        float f6 = (float) i4;
        int i6 = ((f5 / f6) > f4 ? 1 : ((f5 / f6) == f4 ? 0 : -1));
        if (!z ? i6 <= 0 : i6 > 0) {
            f = f3 / f6;
        } else {
            f = f2 / f5;
        }
        matrix.setScale((f5 / f2) * f, (f6 / f3) * f, (float) (i / 2), (float) (i2 / 2));
        return true;
    }

    public void Bv1(AnonymousClass9T8 r6, File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw AnonymousClass001.A08("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        } else if (!isConnected()) {
            r6.A00(C90514aH.A0s("Can't record video before it's initialised."));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0e = true;
            this.A0S.A00(new C23138B6x(r6, this, 0), "start_video", new AYY(this, absolutePath, elapsedRealtime));
        }
    }

    public void BvV(AnonymousClass61X r7, C198749e8 r8) {
        if (!isConnected()) {
            r7.A00(new C21815Aar("Cannot take a photo"));
            return;
        }
        AnonymousClass9PE r3 = this.A0M;
        Object obj = r3.A00.get();
        Objects.requireNonNull(obj);
        if (((CountDownLatch) obj).getCount() > 0) {
            r7.A00(new AnonymousClass91V("Busy taking photo"));
        } else if (!this.A0e || this.A0H) {
            C201199j3.A00().A03 = SystemClock.elapsedRealtime();
            A0A(this, "Cannot get camera settings");
            C201049ih.A06(this.A0O.A02(this.A01));
            r3.A00(2);
            this.A0T.set(false);
            this.A0S.A00(new C1692188f(r7, this, r8), "take_photo", new B8V(r8, this, r7, 0));
        } else {
            r7.A00(new AnonymousClass91V("Cannot take a photo while recording video"));
        }
    }
}
