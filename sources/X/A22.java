package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class A22 implements C23071B3a, C23064B2n, C22874AxV {
    public C201589jv A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass9ST A05;
    public boolean A06;
    public boolean A07;
    public final C198549dl A08;
    public final C199559fW A09;
    public final C192309Gm A0A;
    public final C203159nQ A0B;
    public volatile C1263663q A0C;

    public String BBR() {
        return "GlSurfaceOutput";
    }

    public void A00() {
        synchronized (this.A09) {
            C1263663q r2 = this.A0C;
            this.A0C = null;
            if (r2 != null) {
                EGLSurface eGLSurface = r2.A00;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(r2.A01.A04, eGLSurface);
                }
                r2.A00 = EGL14.EGL_NO_SURFACE;
            }
        }
    }

    public void B1T(AnonymousClass9ST r10) {
        C97924qX r7;
        this.A05 = r10;
        if (r10 != null) {
            C197319bW r2 = r10.A07.A00;
            C199559fW r4 = this.A09;
            Object obj = r4.A05;
            if (obj != null || (obj = r4.A00()) != null) {
                HashMap hashMap = C197319bW.A01;
                synchronized (hashMap) {
                    A22 a22 = (A22) hashMap.remove(obj);
                    if (a22 != null) {
                        a22.A00();
                    }
                    hashMap.put(obj, this);
                    C192289Gk r22 = r2.A00;
                    synchronized (r4) {
                        Surface A002 = r4.A00();
                        Objects.requireNonNull(A002);
                        if (A002.isValid()) {
                            AnonymousClass9ST r0 = this.A05;
                            if (r0 == null || (r0.A02.A00 & 32) == 0 || this.A01 == 7) {
                                C133216Xg r02 = r22.A01.A02;
                                synchronized (r02.A07) {
                                    try {
                                        r7 = new C97924qX(A002, r02);
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } else {
                                AnonymousClass9ST r8 = r22.A01;
                                C133216Xg r5 = r8.A02;
                                if (0 != (r5.A00 & 32)) {
                                    C133216Xg r03 = r8.A00;
                                    if (r03 != null) {
                                        r5 = r03;
                                    } else {
                                        C197489bn r1 = r8.A05;
                                        AnonymousClass94R r04 = C197489bn.A02;
                                        Object obj2 = C198039cn.A05;
                                        Map map = r1.A00;
                                        Object obj3 = map.get(r04);
                                        if (obj3 != null) {
                                            obj2 = obj3;
                                        }
                                        Object obj4 = map.get(C197489bn.A06);
                                        Objects.requireNonNull(obj4);
                                        AnonymousClass00C.A08(obj4);
                                        C133216Xg A012 = AnonymousClass6UN.A01(obj2, AnonymousClass000.A0I(obj4));
                                        AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
                                        A012.A07(r5, 5);
                                        r8.A00 = A012;
                                        r5 = A012;
                                    }
                                }
                                synchronized (r5.A07) {
                                    try {
                                        r7 = new C97924qX(A002, r5, 5, r5.A06);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            }
                            this.A0C = r7;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r3.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B5N() {
        /*
            r3 = this;
            X.9ST r1 = r3.A05
            r0 = 0
            r3.A05 = r0
            if (r1 == 0) goto L_0x0013
            X.9fW r0 = r3.A09
            android.graphics.SurfaceTexture r2 = r0.A05
            if (r2 != 0) goto L_0x0022
            android.view.Surface r2 = r0.A00()
            if (r2 != 0) goto L_0x0022
        L_0x0013:
            X.9jv r0 = r3.A00
            if (r0 == 0) goto L_0x0021
            X.9pp r0 = r0.A07
            android.os.Handler r1 = r0.A01
            if (r1 == 0) goto L_0x0021
            r0 = 1
            r1.removeMessages(r0, r3)
        L_0x0021:
            return
        L_0x0022:
            java.util.HashMap r1 = X.C197319bW.A01
            monitor-enter(r1)
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0039 }
            X.A22 r0 = (X.A22) r0     // Catch:{ all -> 0x0039 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0034
            r1.remove(r2)     // Catch:{ all -> 0x0039 }
        L_0x0034:
            r3.A00()     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            goto L_0x0013
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A22.B5N():void");
    }

    public int BEo() {
        AnonymousClass9ST r0 = this.A05;
        if (r0 == null || (r0.A02.A00 & 32) == 0) {
            return 3;
        }
        return this.A03;
    }

    public int BEs() {
        int i = this.A09.A02;
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i == 4) {
                    return i2;
                }
                return 0;
            }
        }
        return i2;
    }

    public boolean BLf(AnonymousClass9NT r7) {
        boolean z;
        C199559fW r5 = this.A09;
        synchronized (r5) {
            if (this.A0C != null) {
                if (r5.A07 && !(r5.A06 == null && r5.A05 == null)) {
                    long j = r7.A03;
                    if (j >= 0 && ((j >= -1 && j <= -1) || j >= -1)) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public RuntimeException BP0() {
        IllegalStateException illegalStateException;
        synchronized (this.A09) {
            C1263663q r0 = this.A0C;
            if (r0 == null) {
                this.A08.A00(C188278zK.A0d);
                illegalStateException = AnonymousClass001.A09("Gl surface is null");
            } else {
                try {
                    r0.A00();
                    illegalStateException = null;
                } catch (AnonymousClass78N e) {
                    this.A08.A00(C188278zK.A0L);
                    return e;
                }
            }
        }
        return illegalStateException;
    }

    public void BvO() {
        synchronized (this.A09) {
            C1263663q r1 = this.A0C;
            if (r1 != null) {
                C133216Xg r0 = r1.A01;
                EGLSurface eGLSurface = r1.A00;
                synchronized (r0.A07) {
                    EGL14.eglSwapBuffers(r0.A04, eGLSurface);
                }
            } else {
                this.A08.A00(C188278zK.A0f);
            }
        }
        C201589jv r02 = this.A00;
        if (r02 != null) {
            r02.A07.A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        if (r7.A08 == false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194849Rm Bwr(X.AnonymousClass9NT r25) {
        /*
            r24 = this;
            r8 = r24
            X.9nQ r10 = r8.A0B
            X.9fW r7 = r8.A09
            monitor-enter(r7)
            r9 = r25
            X.9Rm r6 = r9.A05     // Catch:{ all -> 0x00e1 }
            r2 = 0
            if (r6 == 0) goto L_0x00d7
            boolean r0 = r6.A00()     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x001e
            X.9dl r1 = r8.A08     // Catch:{ all -> 0x00e1 }
            X.8zK r0 = X.C188278zK.A0h     // Catch:{ all -> 0x00e1 }
            r1.A00(r0)     // Catch:{ all -> 0x00e1 }
        L_0x001b:
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            goto L_0x00e0
        L_0x001e:
            X.63q r5 = r8.A0C     // Catch:{ all -> 0x00e1 }
            if (r5 != 0) goto L_0x002a
            X.9dl r1 = r8.A08     // Catch:{ all -> 0x00e1 }
            X.8zK r0 = X.C188278zK.A0g     // Catch:{ all -> 0x00e1 }
            r1.A00(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x001b
        L_0x002a:
            X.6Xg r4 = r5.A01     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLSurface r3 = r5.A00     // Catch:{ all -> 0x00e1 }
            int[] r2 = r5.A04     // Catch:{ all -> 0x00e1 }
            r1 = 12375(0x3057, float:1.7341E-41)
            android.opengl.EGLDisplay r0 = r4.A04     // Catch:{ all -> 0x00e1 }
            r11 = 0
            android.opengl.EGL14.eglQuerySurface(r0, r3, r1, r2, r11)     // Catch:{ all -> 0x00e1 }
            r0 = r2[r11]     // Catch:{ all -> 0x00e1 }
            r8.A04 = r0     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLSurface r3 = r5.A00     // Catch:{ all -> 0x00e1 }
            int[] r2 = r5.A03     // Catch:{ all -> 0x00e1 }
            r1 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGLDisplay r0 = r4.A04     // Catch:{ all -> 0x00e1 }
            android.opengl.EGL14.eglQuerySurface(r0, r3, r1, r2, r11)     // Catch:{ all -> 0x00e1 }
            r0 = r2[r11]     // Catch:{ all -> 0x00e1 }
            r8.A02 = r0     // Catch:{ all -> 0x00e1 }
            int r1 = r7.A04     // Catch:{ all -> 0x00e1 }
            r0 = 1
            if (r1 == 0) goto L_0x00a6
            if (r1 != r0) goto L_0x00af
            X.9Gm r11 = r8.A0A     // Catch:{ all -> 0x00e1 }
            long r2 = r9.A03     // Catch:{ all -> 0x00e1 }
            boolean r0 = r11.A01     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0087
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 3
            r14 = 0
        L_0x0061:
            r13 = 1
            if (r14 >= r15) goto L_0x0085
            long r20 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00e1 }
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e1 }
            long r18 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00e1 }
            long r16 = r18 - r20
            if (r14 == 0) goto L_0x0078
            int r12 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
        L_0x0078:
            long r20 = r20 + r18
            long r20 = r20 >> r13
            long r0 = r0 - r20
            r11.A00 = r0     // Catch:{ all -> 0x00e1 }
            r22 = r16
        L_0x0082:
            int r14 = r14 + 1
            goto L_0x0061
        L_0x0085:
            r11.A01 = r13     // Catch:{ all -> 0x00e1 }
        L_0x0087:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e1 }
            long r0 = r0 - r2
            float r12 = (float) r0     // Catch:{ all -> 0x00e1 }
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r12 = r12 / r0
            float r1 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x00e1 }
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            long r0 = r11.A00     // Catch:{ all -> 0x00e1 }
            long r2 = r2 - r0
        L_0x009e:
            android.opengl.EGLSurface r1 = r5.A00     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLDisplay r0 = r4.A04     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r2)     // Catch:{ all -> 0x00e1 }
            goto L_0x00af
        L_0x00a6:
            long r0 = r9.A03     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLSurface r3 = r5.A00     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLDisplay r2 = r4.A04     // Catch:{ all -> 0x00e1 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r2, r3, r0)     // Catch:{ all -> 0x00e1 }
        L_0x00af:
            int r5 = r6.A01     // Catch:{ all -> 0x00e1 }
            int r4 = r6.A00     // Catch:{ all -> 0x00e1 }
            int r3 = r8.A04     // Catch:{ all -> 0x00e1 }
            int r2 = r8.A02     // Catch:{ all -> 0x00e1 }
            int r1 = r7.A01     // Catch:{ all -> 0x00e1 }
            boolean r0 = r9.A06     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r7.A08     // Catch:{ all -> 0x00e1 }
            r16 = 1
            if (r0 != 0) goto L_0x00c5
        L_0x00c3:
            r16 = 0
        L_0x00c5:
            boolean r0 = r8.A06     // Catch:{ all -> 0x00e1 }
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r2
            r15 = r1
            r17 = r0
            r10.A07(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00e1 }
            X.9Rm r2 = r10.A06()     // Catch:{ all -> 0x00e1 }
            goto L_0x001b
        L_0x00d7:
            X.9dl r1 = r8.A08     // Catch:{ all -> 0x00e1 }
            X.8zK r0 = X.C188278zK.A0i     // Catch:{ all -> 0x00e1 }
            r1.A00(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x001b
        L_0x00e0:
            return r2
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A22.Bwr(X.9NT):X.9Rm");
    }

    public boolean contains(Object obj) {
        return C36361kB.A1a(this.A09, obj);
    }

    public void release() {
        Handler handler;
        C199559fW r1 = this.A09;
        synchronized (r1) {
            r1.A01();
        }
        C201589jv r0 = this.A00;
        if (r0 != null && (handler = r0.A07.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public A22(C198549dl r3, C199559fW r4) {
        C203159nQ r1;
        this.A08 = r3;
        this.A09 = r4;
        if (r4.A03 != 1) {
            r1 = new AnonymousClass88R();
        } else {
            r1 = new AnonymousClass88S();
        }
        this.A0B = r1;
        r1.A00 = "glSurfaceOutput";
        this.A03 = 0;
        this.A0A = new C192309Gm();
    }

    public Object BDd() {
        return this.A09;
    }

    public boolean BMY() {
        return this.A07;
    }

    public void BKM(C201589jv r1) {
        this.A00 = r1;
    }

    public A22() {
    }
}
