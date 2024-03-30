package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: X.7ab  reason: invalid class name and case insensitive filesystem */
public final class C156747ab extends C131466Pd {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL14.EGL_NO_SURFACE;

    public static void A00(Object obj, C156747ab r5) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            A02(r5);
            if (r5.A03 == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r5.A02, r5.A00, obj, new int[]{12344}, 0);
                r5.A03 = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    A01("eglCreateWindowSurface");
                    throw C90514aH.A0s("Failed to create window surface");
                }
                return;
            }
            throw C90514aH.A0s("Already has an EGLSurface");
        }
        throw AnonymousClass001.A09("Input must be either a Surface or SurfaceTexture");
    }

    public static void A02(C156747ab r2) {
        if (r2.A02 == EGL14.EGL_NO_DISPLAY || r2.A01 == EGL14.EGL_NO_CONTEXT || r2.A00 == null) {
            throw C90514aH.A0s("This object has been released");
        }
    }

    public C156747ab(C108855Ve r11, int[] iArr) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] A1O = C36441kJ.A1O();
            if (EGL14.eglInitialize(eglGetDisplay, A1O, 0, A1O, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLDisplay eGLDisplay = this.A02;
                    if (r11 != null) {
                        throw AnonymousClass001.A0A("egl14Context");
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                    } else {
                        A01("eglCreateContext");
                        throw C90514aH.A0s("Failed to create EGL context");
                    }
                } else {
                    A01("eglChooseConfig");
                    throw C90514aH.A0s("Unable to find any matching EGL config");
                }
            } else {
                A01("eglInitialize");
                throw C90514aH.A0s("Unable to initialize EGL14");
            }
        } else {
            throw C90514aH.A0s("Unable to get EGL14 display");
        }
    }

    public static void A01(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C36321k7.A1S(": glError ", AnonymousClass000.A0v(str), glGetError);
            } else {
                return;
            }
        }
    }
}
