package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.SurfaceHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.70u  reason: invalid class name and case insensitive filesystem */
public class C1493370u implements VideoPort {
    public static final float[] A0N = {0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] A0O = {0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0P = {0.19607843f, 0.19607843f, 0.19607843f, 1.0f};
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass13J A03;
    public C1272467n A04;
    public C159747jr A05;
    public WeakReference A06;
    public C131466Pd A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final HandlerThread A0B;
    public final C20810yC A0C;
    public final UserJid A0D;
    public final GlVideoRenderer A0E;
    public final Set A0F = C36441kJ.A16();
    public final AtomicBoolean A0G;
    public final boolean A0H;
    public final C110375aZ A0I;
    public final AnonymousClass711 A0J;
    public final boolean A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public static int A03(C1493370u r4, float[] fArr) {
        C18740tg.A03(r4.A0B);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClear(16384);
        return A01(r4);
    }

    public Context getContext() {
        return null;
    }

    @Deprecated
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public Point getWindowSize() {
        return new Point(0, 0);
    }

    public void setListener(AnonymousClass7dH r1) {
    }

    public static int A00(Message message, C1493370u r3, String str) {
        if (r3.A0A.sendMessage(message)) {
            return 0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/CoreVideoPort/");
        A0u.append(str);
        A0u.append(" failed: ");
        A0u.append(-100);
        A0u.append(" for ");
        C36331k8.A1P(r3.A0D, A0u);
        return -100;
    }

    public static int A01(C1493370u r2) {
        C18740tg.A03(r2.A0B);
        C156747ab r22 = (C156747ab) r2.A07;
        C156747ab.A02(r22);
        EGLSurface eGLSurface = r22.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw C90514aH.A0s("No EGLSurface - can't swap buffers");
        } else if (EGL14.eglSwapBuffers(r22.A02, eGLSurface)) {
            return 0;
        } else {
            return -3;
        }
    }

    public static int A02(C1493370u r1, Callable callable) {
        return AnonymousClass000.A0I(C110365aY.A00(r1.A0A, -100, callable));
    }

    public static void A04(C1493370u r2) {
        if (!r2.A0M) {
            r2.A0M = true;
            Set<AnonymousClass7gI> set = r2.A0F;
            synchronized (set) {
                for (AnonymousClass7gI Bee : set) {
                    Bee.Bee();
                }
            }
        }
    }

    public static void A05(C1493370u r2) {
        C18740tg.A03(r2.A0B);
        r2.A0E.release();
        r2.A0G.set(false);
        try {
            r2.A07.A03();
            r2.A07.A06();
            r2.A07.A05();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
    }

    public static void A06(C1493370u r3) {
        C18740tg.A03(r3.A0B);
        C131466Pd r2 = r3.A07;
        if (((C156747ab) r2).A03 != EGL14.EGL_NO_SURFACE) {
            r2.A03();
            r3.A07.A06();
        }
    }

    public static void A07(C1493370u r4, int i, int i2) {
        AnonymousClass711 r3 = r4.A0J;
        C18740tg.A01();
        UserJid userJid = r4.A0D;
        if (r3.A02.A0M(userJid)) {
            Voip.setVideoPreviewSize(i, i2);
            return;
        }
        C1502474n r2 = new C1502474n(r3, userJid, r4, 31);
        if (r3.A04.A0E(7807)) {
            ((C19930wk) r3.A06.get()).execute(r2);
        } else {
            r2.run();
        }
    }

    public static boolean A08(C1493370u r1) {
        return r1.A0C.A0E(2831);
    }

    public static boolean A09(C1493370u r2) {
        C18740tg.A03(r2.A0B);
        if (((C156747ab) r2.A07).A03 == EGL14.EGL_NO_SURFACE || !r2.A0G.get()) {
            return false;
        }
        return true;
    }

    public void A0A(AnonymousClass7gI r3) {
        Set set = this.A0F;
        synchronized (set) {
            set.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (X.C1901797e.A00(r0.get(), r6) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0038
            java.lang.ref.WeakReference r0 = r5.A06
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C1901797e.A00(r0, r6)
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.7jr r0 = r5.A05
            if (r0 != 0) goto L_0x0043
            X.76n r0 = new X.76n
            r0.<init>(r5, r6, r1)
            int r2 = A02(r5, r0)
        L_0x0023:
            r5.A0M = r3
            if (r2 != 0) goto L_0x0045
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0039
            r5.A09 = r4
            X.711 r0 = r5.A0J
            X.AnonymousClass711.A01(r5, r0)
        L_0x0032:
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r6)
            r5.A06 = r0
        L_0x0038:
            return
        L_0x0039:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.UserJid r0 = r5.A0D
            com.whatsapp.voipcalling.Voip.startVideoRenderStream(r0)
            goto L_0x0032
        L_0x0043:
            r2 = 0
            goto L_0x0023
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/onSurfaceAvailable failed to create surface ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            X.C36351kA.A1L(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493370u.A0B(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0L
            if (r0 != 0) goto L_0x004b
            java.lang.ref.WeakReference r0 = r3.A06
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C1901797e.A00(r0, r4)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
            X.7jr r0 = r3.A05
            if (r0 != 0) goto L_0x004c
            r0 = 12
            X.7qf r2 = new X.7qf
            r2.<init>(r3, r0)
            android.os.Handler r1 = r3.A0A
            java.lang.Boolean r0 = X.C36381kD.A0j()
            java.lang.Object r0 = X.C110365aY.A00(r1, r0, r2)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x004c
            r1 = 7
            X.7qf r0 = new X.7qf
            r0.<init>(r3, r1)
            A02(r3, r0)
        L_0x003b:
            java.lang.ref.WeakReference r0 = r3.A06
            if (r0 == 0) goto L_0x0042
            r0 = 0
            r3.A06 = r0
        L_0x0042:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x004b
            com.whatsapp.jid.UserJid r0 = r3.A0D
            com.whatsapp.voipcalling.Voip.stopVideoRenderStream(r0)
        L_0x004b:
            return
        L_0x004c:
            X.7jr r0 = r3.A05
            if (r0 == 0) goto L_0x003b
            r0.onSurfaceDestroyed(r4)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493370u.A0C(java.lang.Object):void");
    }

    public void A0D(Object obj, int i, int i2) {
        String str;
        if (!this.A0L) {
            WeakReference weakReference = this.A06;
            if (weakReference == null || !C1901797e.A00(weakReference.get(), obj)) {
                str = "voip/CoreVideoPort/onSurfaceSizeChanged invalid surface";
            } else {
                this.A02 = i;
                this.A00 = i2;
                C159747jr r0 = this.A05;
                if (r0 != null) {
                    r0.onSurfaceSizeChanged(obj, i, i2);
                }
                if (A08(this)) {
                    Handler handler = this.A0A;
                    handler.removeMessages(1);
                    A00(handler.obtainMessage(1, i, i2), this, "setWindowSize");
                    return;
                }
                if (this.A05 == null) {
                    int A0I2 = AnonymousClass000.A0I(C110365aY.A00(this.A0A, -100, new C163747qh(this, i, i2, 1)));
                    if (A0I2 != 0) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("voip/CoreVideoPort/setWindowSize failed: ");
                        A0u.append(A0I2);
                        A0u.append(" for ");
                        str = AnonymousClass000.A0o(this.A0D, A0u);
                    }
                }
                A07(this, i, i2);
                return;
            }
            Log.i(str);
        }
    }

    public C1272467n createSurfaceTexture() {
        if (this.A0L) {
            Log.w("voip/CoreVideoPort/createSurfaceTexture called after release");
            return null;
        }
        return (C1272467n) C110365aY.A00(this.A0A, (Object) null, new C163727qf(this, 6));
    }

    public void releaseSurfaceTexture(C1272467n r3) {
        if (this.A0L) {
            return;
        }
        if (A08(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, r3), this, "releaseSurfaceTexture");
            return;
        }
        A02(this, new C163757qi(this, r3, 3));
    }

    public int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5) {
        int A022 = A02(this, new C1508076v(this, i, i2, i3, i4, i5, j));
        if (A022 == 0) {
            A04(this);
        }
        return A022;
    }

    public int resetBlackScreen() {
        return A02(this, new C163727qf(this, 10));
    }

    public void setPassthroughVideoPortCallback(C159747jr r3) {
        Handler handler = this.A0A;
        handler.removeMessages(10);
        A00(handler.obtainMessage(10, r3), this, "attach new surface manager");
    }

    public int setScaleType(int i) {
        if (this.A0H) {
            return 0;
        }
        if (!A08(this)) {
            int A022 = A02(this, new C163777qk(this, i, 1));
            if (A022 == 0) {
                return A022;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/CoreVideoPort/setScaleType failed: ");
            A0u.append(A022);
            A0u.append(" for ");
            C36321k7.A1N(this.A0D, A0u);
            return A022;
        } else if (!this.A0G.get()) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("voip/CoreVideoPort/setScaleType failed: -6 for ");
            C36331k8.A1P(this.A0D, A0u2);
            return -6;
        } else {
            Handler handler = this.A0A;
            handler.removeMessages(2);
            return A00(handler.obtainMessage(2, Integer.valueOf(i)), this, "setScaleType");
        }
    }

    public C1493370u(C110375aZ r4, AnonymousClass711 r5, C20810yC r6, UserJid userJid, AnonymousClass13J r8, GlVideoRenderer glVideoRenderer, boolean z) {
        boolean z2 = false;
        this.A0G = new AtomicBoolean(false);
        this.A05 = null;
        this.A02 = 0;
        this.A00 = 0;
        this.A0D = userJid;
        this.A0C = r6;
        this.A0E = glVideoRenderer;
        this.A0I = r4;
        this.A0J = r5;
        this.A03 = r8;
        this.A0K = z;
        this.A0H = r6.A0E(4158) ? true : z2;
        HandlerThread handlerThread = new HandlerThread(C90464aC.A0W(this, "VideoPort_", AnonymousClass000.A0u()));
        this.A0B = handlerThread;
        handlerThread.start();
        C91664cP r2 = new C91664cP(handlerThread.getLooper(), this);
        this.A0A = r2;
        if (A08(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(4);
            A00(handler.obtainMessage(4), this, "initEgl");
            return;
        }
        int A0I2 = AnonymousClass000.A0I(C110365aY.A00(r2, -100, new C163727qf(this, 13)));
        if (A0I2 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/CoreVideoPort/create failed to init EGL (");
            A0u.append(A0I2);
            C36321k7.A1J(userJid, ") for ", A0u);
        }
    }

    public void release() {
        C18740tg.A01();
        UserJid userJid = this.A0D;
        this.A0L = true;
        Set set = this.A0F;
        synchronized (set) {
            set.clear();
        }
        if (this.A09) {
            this.A09 = false;
            AnonymousClass711.A02(this.A0J, userJid);
        }
        Handler handler = this.A0A;
        handler.removeCallbacksAndMessages((Object) null);
        if (A08(this)) {
            C1272467n r1 = this.A04;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, r1), this, "releaseSurfaceTexture");
        } else {
            A02(this, new C163727qf(this, 8));
        }
        A02(this, new C163727qf(this, 9));
        this.A0B.quit();
    }

    public void renderTexture(C1272467n r3, int i, int i2) {
        if (A08(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(6);
            A00(handler.obtainMessage(6, i, i2, r3), this, "renderTexture");
        } else if (A02(this, new AnonymousClass76p(this, r3, i, i2)) == 0) {
            A04(this);
        }
    }

    public void setCornerRadius(float f) {
        if (A08(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(3);
            A00(handler.obtainMessage(3, Float.valueOf(f)), this, "setCornerRadius");
            return;
        }
        int A022 = A02(this, new C1507276j(this, f));
        if (A022 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/CoreVideoPort/setCornerRadius failed: ");
            A0u.append(A022);
            A0u.append(" for ");
            A0u.append(this.A0D);
            C36321k7.A1a(A0u, ". Retrying on valid surface");
        }
    }
}
