package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.A0j  reason: case insensitive filesystem */
public class C20952A0j implements C23114B5t, TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C157737eb A0A;
    public C157747ec A0B;
    public C203089nH A0C;
    public AnonymousClass9JP A0D;
    public AnonymousClass9EO A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final TextureView A0I;
    public final C191159Bw A0J;
    public final C114715hh A0K;
    public final C23082B3p A0L;
    public final C157797eh A0M;
    public final C22877AxY A0N;
    public final AnonymousClass9T8 A0O;
    public final C23072B3b A0P;
    public final AnonymousClass9VB A0Q = new AnonymousClass9VB();
    public final Object A0R = C36441kJ.A11();
    public final String A0S;
    public final Context A0T;
    public final Handler A0U;
    public final HandlerThread A0V;
    public final OrientationEventListener A0W;
    public final AnonymousClass9T8 A0X;
    public final AnonymousClass5RY A0Y;
    public final boolean A0Z;
    public volatile AnonymousClass9EN A0a;
    public volatile boolean A0b;

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.await(5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        throw X.C90514aH.A0s("Timeout stopping video recording.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r6 == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(boolean r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            java.lang.Object r2 = r5.A0R
            monitor-enter(r2)
            boolean r0 = r5.A0b     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x0010:
            X.B3p r1 = r5.A0L     // Catch:{ all -> 0x002d }
            X.88e r0 = new X.88e     // Catch:{ all -> 0x002d }
            r0.<init>(r5, r3, r6)     // Catch:{ all -> 0x002d }
            r1.BvA(r0, r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x002c
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0025 }
            r3.await(r1, r0)     // Catch:{ InterruptedException -> 0x0025 }
            return
        L_0x0025:
            java.lang.String r0 = "Timeout stopping video recording."
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20952A0j.A05(boolean):void");
    }

    public void B1R(String str) {
    }

    public boolean BLR(C1691688a r2) {
        return false;
    }

    public boolean BLS(AnonymousClass94T r2) {
        return false;
    }

    public void Bv9() {
        A05(false);
    }

    public void BvB(boolean z) {
        A05(true);
    }

    public void destroy() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C20952A0j(Context context, TextureView textureView, C204339pq r8, C23082B3p b3p, C23072B3b b3b, boolean z) {
        AnonymousClass5RY r0;
        boolean z2 = false;
        this.A07 = 0;
        this.A05 = 0;
        this.A09 = 0;
        this.A04 = -1;
        this.A03 = -1;
        this.A0F = true;
        this.A0O = new B6y(this, 3);
        this.A0X = new B6y(this, 4);
        this.A0M = new B9F(this, 0);
        this.A0J = new C191159Bw(this);
        this.A0K = new C114715hh(this);
        this.A0N = new B9G(this, 0);
        this.A0T = context;
        this.A0S = "WhatsAppCamera";
        if (z) {
            r0 = AnonymousClass5RY.CAMERA2;
        } else {
            r0 = AnonymousClass5RY.CAMERA1;
        }
        this.A0Y = r0;
        this.A02 = 1920;
        this.A01 = 1080;
        this.A0L = b3p;
        this.A0P = b3b;
        this.A0U = new Handler(Looper.getMainLooper(), r8);
        HandlerThread handlerThread = new HandlerThread("Simple-Lite-Camera-Callback-Thread");
        this.A0V = handlerThread;
        handlerThread.start();
        this.A00 = this.A0L.BJn(0) ^ true ? 1 : 0;
        this.A0H = true;
        this.A0Z = textureView == null ? true : z2;
        textureView = textureView == null ? new C92194dH(context) : textureView;
        this.A0I = textureView;
        textureView.setSurfaceTextureListener(this);
        this.A0W = new C166237vO(context, this);
    }

    public static int A00(C20952A0j a0j) {
        WindowManager windowManager = (WindowManager) a0j.A0T.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    private C198429dX A01() {
        C23082B3p b3p = this.A0L;
        if (b3p == null || !b3p.isConnected()) {
            return null;
        }
        try {
            return b3p.B9Q();
        } catch (C21815Aar unused) {
            return null;
        }
    }

    public static void A02(C20952A0j a0j, AnonymousClass9JP r4) {
        if (a0j.A0Z) {
            AnonymousClass9W3 r0 = (AnonymousClass9W3) r4.A02.A08(C201049ih.A0p);
            int i = r0.A02;
            a0j.A08 = i;
            int i2 = r0.A01;
            a0j.A06 = i2;
            C92194dH r1 = (C92194dH) a0j.A0I;
            r1.A01 = i;
            r1.A00 = i2;
            r1.A02 = true;
            C202399lk.A00(new AnonymousClass759((Object) a0j, 39));
        }
    }

    public static void A03(C20952A0j a0j, AnonymousClass9JP r5) {
        C23082B3p b3p = a0j.A0L;
        if (b3p.isConnected() && r5 != null) {
            int A002 = A00(a0j);
            if (a0j.A04 == A002) {
                Object[] A1Z = C36431kI.A1Z(a0j, 4);
                A1Z[1] = a0j.A0D;
                AnonymousClass000.A1L(A1Z, a0j.A08, 2);
                AnonymousClass000.A1L(A1Z, a0j.A06, 3);
                A04(a0j, A1Z, 15);
                return;
            }
            a0j.A04 = A002;
            b3p.Brh(new B6y(a0j, 2), A002);
        }
    }

    public static void A04(C20952A0j a0j, Object obj, int i) {
        AnonymousClass000.A14(a0j.A0U, obj, i);
    }

    public void B0K(C23063B2m b2m) {
        if (b2m != null) {
            this.A0Q.A01(b2m);
        }
    }

    public C23113B5s B9y(C1691688a r2) {
        throw AnonymousClass001.A0E("Components are not supported.");
    }

    public C22876AxX B9z(AnonymousClass94T r2) {
        throw AnonymousClass001.A0E("Components are not supported.");
    }

    public boolean BMy() {
        return this.A0L.BMy();
    }

    public boolean BNQ() {
        return this.A0L.BNQ();
    }

    public boolean BNa() {
        return C36361kB.A1a(this.A0Y, AnonymousClass5RY.CAMERA2);
    }

    public void Bnk(C23063B2m b2m) {
        if (b2m != null) {
            this.A0Q.A02(b2m);
        }
    }

    public void Bok() {
        C188348zR r2;
        if (this.A0H) {
            this.A0H = false;
            OrientationEventListener orientationEventListener = this.A0W;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = this.A0V;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                C23082B3p b3p = this.A0L;
                b3p.BqN(new Handler(looper));
                C203089nH r3 = this.A0C;
                if (r3 == null) {
                    r3 = new C203089nH(this.A07, this.A05, this.A09);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    r2 = C188348zR.HIGH;
                } else {
                    r2 = C188348zR.MEDIUM;
                }
                Map map = A2N.A01;
                A2N a2n = new A2N(r3, new C194239Ot(), C188348zR.HIGH, r2);
                C191269Ch r32 = B4X.A0K;
                a2n.A00.put(r32.A00, Boolean.valueOf(this.A0G));
                this.A04 = A00(this);
                b3p.B0c(this.A0K);
                b3p.Bqw(this.A0M);
                String str = this.A0S;
                int i = this.A00;
                int i2 = 0;
                if (i != 0) {
                    i2 = 1;
                    if (i != 1) {
                        throw C165567td.A0U("Could not convert camera facing to optic: ", AnonymousClass000.A0u(), i);
                    }
                }
                b3p.B3U(this.A0O, new AnonymousClass9U6(new AnonymousClass9JK(this.A0P, this.A02, this.A01)), a2n, (C22791Aw2) null, (AnonymousClass7cE) null, str, i2, this.A04);
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Callback handler looper is null. CallbackHandlerThread is alive: ");
            throw C90514aH.A0s(C36421kH.A0d(A0u, handlerThread.isAlive()));
        }
    }

    public void Bqt(int i) {
        int i2 = 1;
        if (this.A00 != 1) {
            C195519Up r2 = new C195519Up();
            C191289Cj r1 = C201049ih.A0A;
            if (i == 0) {
                i2 = 0;
            } else if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                }
            }
            r2.A01(r1, Integer.valueOf(i2));
            this.A0L.BPw(new C1691988d(), r2.A00());
        }
    }

    public void Br3(int i) {
        if (this.A0H) {
            C23082B3p b3p = this.A0L;
            int i2 = 0;
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    throw C165567td.A0U("Could not convert camera facing to optic: ", AnonymousClass000.A0u(), i);
                }
            }
            if (b3p.BJn(i2)) {
                this.A00 = i;
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Initial camera facing must be set before initializing the camera.");
    }

    public void BrY(boolean z) {
        throw AnonymousClass001.A0E("Gestures are not supported.");
    }

    public void Bri(C157737eb r3) {
        if (!this.A0H) {
            C23082B3p b3p = this.A0L;
            if (b3p.isConnected()) {
                if (r3 != null) {
                    b3p.B0b(this.A0N);
                } else if (this.A0A != null) {
                    b3p.Bns(this.A0N);
                }
            }
        }
        this.A0A = r3;
    }

    public void Buz(AnonymousClass9EN r7, File file) {
        if (this.A0H) {
            A04(this, C36431kI.A1a(r7, AnonymousClass001.A09("Cannot start video recording while camera is paused."), 2), 10);
            return;
        }
        synchronized (this.A0R) {
            if (this.A0b) {
                A04(this, C36431kI.A1a(r7, AnonymousClass001.A09("Cannot start video recording. Another recording already in progress"), 2), 10);
            } else {
                this.A0b = true;
                this.A0a = r7;
                this.A0L.Bv1(new B6y(this, 0), file, (File) null);
            }
        }
    }

    public void BvR() {
        if (!this.A0H) {
            C23082B3p b3p = this.A0L;
            if (b3p.BNQ()) {
                b3p.BvQ(this.A0X);
            }
        }
    }

    public void BvU(AnonymousClass9GN r5, AnonymousClass9HW r6) {
        AnonymousClass61X r3 = new AnonymousClass61X(this, r6);
        C23082B3p b3p = this.A0L;
        C198749e8 r1 = new C198749e8();
        r1.A00 = !r5.A00;
        r1.A01 = r5.A01;
        b3p.BvV(r3, r1);
    }

    public void finalize() {
        this.A0V.quitSafely();
        super.finalize();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0P.Bfo(surfaceTexture, i, i2);
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A0P.Bfp(surfaceTexture);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0P.Bfn(i, i2);
        this.A08 = i;
        this.A06 = i2;
        A03(this, this.A0D);
    }

    public void pause() {
        if (!this.A0H) {
            OrientationEventListener orientationEventListener = this.A0W;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            this.A0H = true;
            C23082B3p b3p = this.A0L;
            b3p.Bnt(this.A0K);
            b3p.Bqw((C157797eh) null);
            b3p.B5Z(new B6y(this, 1));
        }
    }

    public void B7T(int i, int i2) {
        C198429dX A012 = A01();
        if (A012 != null) {
            float[] fArr = {(float) i, (float) i2};
            C23082B3p b3p = this.A0L;
            b3p.BP4(fArr);
            if (C198429dX.A04(C198429dX.A0P, A012)) {
                b3p.B7T((int) fArr[0], (int) fArr[1]);
            }
        }
    }

    public int B9I() {
        return this.A00;
    }

    public int BDw() {
        C198429dX A012;
        C198429dX A013 = A01();
        if (A013 == null || (A012 = A01()) == null || !C198429dX.A04(C198429dX.A0Z, A012)) {
            return 0;
        }
        return C198429dX.A01(C198429dX.A0d, A013);
    }

    public int BJN() {
        C198429dX A012;
        int i;
        C198429dX A013 = A01();
        if (A013 == null || (A012 = A01()) == null) {
            return 100;
        }
        C191279Ci r2 = C198429dX.A0Z;
        if (!C198429dX.A04(r2, A012)) {
            return 100;
        }
        List A032 = C198429dX.A03(C198429dX.A1A, A013);
        C198429dX A014 = A01();
        if (A014 == null || !C198429dX.A04(r2, A014)) {
            i = 0;
        } else {
            i = this.A0L.getZoomLevel();
        }
        return C36351kA.A06(A032, i);
    }

    public boolean BLp(int i) {
        List A032;
        C198429dX A012 = A01();
        if (A012 == null || (A032 = C198429dX.A03(C198429dX.A0p, A012)) == null) {
            return false;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
            }
        }
        return C165607th.A1X(A032, i2);
    }

    public void Brj(int i) {
        if (this.A0H) {
            this.A07 = 921600;
            return;
        }
        throw AnonymousClass001.A09("Preview resolution level must be set before initializing the camera.");
    }

    public void Bsp(int i) {
        C198429dX A012 = A01();
        if (A012 != null && C198429dX.A04(C198429dX.A0Z, A012)) {
            this.A0L.Bsq((AnonymousClass9T8) null, i);
        }
    }

    public View B9J(Context context) {
        return this.A0I;
    }

    public void Bq7(boolean z) {
        this.A0G = z;
    }

    public void Bqx(AnonymousClass9EO r1) {
        this.A0E = r1;
    }

    public void Brk(C157747ec r1) {
        this.A0B = r1;
    }

    public void BsG(C203089nH r1) {
        this.A0C = r1;
    }
}
