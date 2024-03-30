package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* renamed from: X.63q  reason: invalid class name and case insensitive filesystem */
public abstract class C1263663q {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public C133216Xg A01;
    public final C133216Xg A02;
    public final int[] A03 = new int[1];
    public final int[] A04 = new int[1];

    public void A00() {
        C133216Xg r12 = this.A01;
        EGLSurface eGLSurface = this.A00;
        synchronized (r12.A07) {
            boolean equals = r12.A03.equals(EGL14.eglGetCurrentContext());
            boolean equals2 = r12.A04.equals(EGL14.EGL_NO_DISPLAY);
            boolean equals3 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
            boolean equals4 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12378));
            if (!equals || !equals3 || !equals4) {
                if (!EGL14.eglMakeCurrent(r12.A04, eGLSurface, eGLSurface, r12.A03)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("eglMakeCurrent, contextWasAlreadyCurrent=");
                    A0u.append(equals);
                    A0u.append(" isDisplayNoDisplay=");
                    A0u.append(equals2);
                    A0u.append(" drawSurfaceWasAlreadyCurrent=");
                    A0u.append(equals3);
                    C200339hB.A01(C36371kC.A0z(" readSurfaceWasAlreadyCurrent=", A0u, equals4));
                    if (!EGL14.eglMakeCurrent(r12.A04, eGLSurface, eGLSurface, r12.A03)) {
                        StringBuilder A0v = AnonymousClass000.A0v("eglMakeCurrent, contextWasAlreadyCurrent=");
                        A0v.append(equals);
                        A0v.append(" isDisplayNoDisplay=");
                        A0v.append(equals2);
                        A0v.append(" drawSurfaceWasAlreadyCurrent=");
                        A0v.append(equals3);
                        C200339hB.A01(C36371kC.A0z(" readSurfaceWasAlreadyCurrent=", A0v, equals4));
                    }
                }
            }
        }
    }

    public C1263663q(C133216Xg r3) {
        this.A01 = r3;
        this.A02 = r3;
    }
}
