package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Objects;

/* renamed from: X.4dE  reason: invalid class name and case insensitive filesystem */
public final class C92164dE extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final C91724cV A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A02(r5) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C92164dE A01(android.content.Context r5, boolean r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L_0x000a
            boolean r1 = A02(r5)
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C200319h9.A02(r0)
            X.4cV r3 = new X.4cV
            r3.<init>()
            if (r6 == 0) goto L_0x0017
            int r4 = A02
        L_0x0017:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.75D r0 = new X.75D
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x005e }
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch:{ all -> 0x005e }
            r0.sendToTarget()     // Catch:{ all -> 0x005e }
        L_0x0038:
            X.4dE r0 = r3.A02     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            java.lang.RuntimeException r0 = r3.A04     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            java.lang.Error r0 = r3.A03     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            r3.wait()     // Catch:{ InterruptedException -> 0x0048 }
            goto L_0x0038
        L_0x0048:
            r1 = 1
            goto L_0x0038
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0050
            X.C90484aE.A0z()
        L_0x0050:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L_0x0060
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L_0x0060
            X.4dE r0 = r3.A02
            java.util.Objects.requireNonNull(r0)
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92164dE.A01(android.content.Context, boolean):X.4dE");
    }

    public static int A00(Context context) {
        String eglQueryString;
        if ((Util.A00 >= 26 || (!"samsung".equals(Util.A03) && !"XT1650".equals(Util.A04) && context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return C36391kE.A00(eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 0);
        }
        return 0;
    }

    public static synchronized boolean A02(Context context) {
        boolean z;
        int i;
        synchronized (C92164dE.class) {
            z = true;
            if (!A03) {
                if (Util.A00 < 24) {
                    i = 0;
                } else {
                    i = A00(context);
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public C92164dE(SurfaceTexture surfaceTexture, C91724cV r2) {
        super(surfaceTexture);
        this.A01 = r2;
    }

    public void release() {
        super.release();
        C91724cV r2 = this.A01;
        synchronized (r2) {
            if (!this.A00) {
                Objects.requireNonNull(r2.A00);
                r2.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
