package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.6Ux  reason: invalid class name and case insensitive filesystem */
public final class C132706Ux {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;

    private EGLConfig A00(int i, int i2) {
        int i3 = 4;
        if (i2 >= 3) {
            i3 = 68;
        }
        int[] iArr = new int[13];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        C90494aF.A1Q(iArr, 8);
        iArr[7] = 8;
        iArr[8] = 12352;
        iArr[9] = i3;
        iArr[10] = 12344;
        iArr[11] = 0;
        iArr[12] = 12344;
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.A02, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("unable to find RGB8888 / ");
        A0u.append(i2);
        Log.w("Grafika", AnonymousClass000.A0q(" EGLConfig", A0u));
        return null;
    }

    public void A01() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void finalize() {
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                Log.w("Grafika", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A01();
            }
        } finally {
            super.finalize();
        }
    }

    public C132706Ux(int i) {
        EGLConfig A002;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        this.A00 = null;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    if (!((i & 2) == 0 || (A002 = A00(i, 3)) == null)) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.A02, A002, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.A00 = A002;
                            this.A01 = eglCreateContext;
                        }
                    }
                    EGLContext eGLContext2 = this.A01;
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig A003 = A00(i, 2);
                        if (A003 != null) {
                            eGLContext2 = EGL14.eglCreateContext(this.A02, A003, eGLContext, new int[]{12440, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.A00 = A003;
                                this.A01 = eGLContext2;
                            } else {
                                StringBuilder A0v = AnonymousClass000.A0v("eglCreateContext");
                                A0v.append(": EGL error: 0x");
                                throw C90464aC.A0U(Integer.toHexString(eglGetError), A0v);
                            }
                        } else {
                            throw C90514aH.A0s("Unable to find a suitable EGLConfig");
                        }
                    }
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr2, 0);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("EGLContext created, client version ");
                    Log.d("Grafika", C36381kD.A10(A0u, iArr2[0]));
                    return;
                }
                this.A02 = null;
                throw C90514aH.A0s("unable to initialize EGL14");
            }
            throw C90514aH.A0s("unable to get EGL14 display");
        }
        throw C90514aH.A0s("EGL already set up");
    }

    public C132706Ux() {
        this(0);
    }
}
