package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: X.6Pd  reason: invalid class name and case insensitive filesystem */
public abstract class C131466Pd {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public void A03() {
        EGLDisplay eGLDisplay = ((C156747ab) this).A02;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            C156747ab.A01("detachCurrent");
            throw C90514aH.A0s("eglMakeCurrent failed");
        }
    }

    public void A04() {
        C156747ab r3 = (C156747ab) this;
        C156747ab.A02(r3);
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw C90514aH.A0s("No EGLSurface - can't make current");
        } else if (!EGL14.eglMakeCurrent(r3.A02, eGLSurface, eGLSurface, r3.A01)) {
            C156747ab.A01("makeCurrent");
            throw C90514aH.A0s("eglMakeCurrent failed");
        }
    }

    public void A05() {
        C156747ab r2 = (C156747ab) this;
        C156747ab.A02(r2);
        r2.A06();
        r2.A03();
        EGL14.eglDestroyContext(r2.A02, r2.A01);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(r2.A02);
        r2.A01 = EGL14.EGL_NO_CONTEXT;
        r2.A02 = EGL14.EGL_NO_DISPLAY;
        r2.A00 = null;
    }

    public void A06() {
        C156747ab r2 = (C156747ab) this;
        EGLSurface eGLSurface = r2.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(r2.A02, eGLSurface);
            r2.A03 = EGL14.EGL_NO_SURFACE;
        }
    }
}
