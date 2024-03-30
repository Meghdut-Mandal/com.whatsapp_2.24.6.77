package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.677  reason: invalid class name */
public class AnonymousClass677 {
    public EGLSurface A00;
    public C132706Ux A01;
    public Surface A02;
    public boolean A03;

    public void A00() {
        C132706Ux r3 = this.A01;
        EGLSurface eGLSurface = this.A00;
        if (r3.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(r3.A02, eGLSurface, eGLSurface, r3.A01)) {
            throw C90514aH.A0s("eglMakeCurrent failed");
        }
    }

    public void A01() {
        C132706Ux r0 = this.A01;
        EGL14.eglDestroySurface(r0.A02, this.A00);
        this.A00 = EGL14.EGL_NO_SURFACE;
        Surface surface = this.A02;
        if (surface != null) {
            if (this.A03) {
                surface.release();
            }
            this.A02 = null;
        }
    }

    public AnonymousClass677(Surface surface, C132706Ux r6, boolean z) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.A00 = eGLSurface;
        this.A01 = r6;
        if (eGLSurface != eGLSurface) {
            throw AnonymousClass001.A09("surface already created");
        } else if (surface == null) {
            throw C90514aH.A0s(AnonymousClass000.A0l(surface, "invalid surface: ", AnonymousClass000.A0u()));
        } else {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r6.A02, r6.A00, surface, new int[]{12344}, 0);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                StringBuilder A0v = AnonymousClass000.A0v("eglCreateWindowSurface");
                A0v.append(": EGL error: 0x");
                throw C90464aC.A0U(Integer.toHexString(eglGetError), A0v);
            } else if (eglCreateWindowSurface != null) {
                this.A00 = eglCreateWindowSurface;
                this.A02 = surface;
                this.A03 = z;
            } else {
                throw C90514aH.A0s("surface was null");
            }
        }
    }
}
