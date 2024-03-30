package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.6O5  reason: invalid class name */
public final class AnonymousClass6O5 {
    public EGLConfig A00 = null;
    public EGLContext A01;
    public EGLDisplay A02;

    public AnonymousClass6O5() {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLContext eGLContext2 = this.A01;
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        int[] iArr2 = new int[15];
                        iArr2[0] = 12324;
                        iArr2[1] = 8;
                        iArr2[2] = 12323;
                        C90494aF.A1Q(iArr2, 8);
                        iArr2[7] = 8;
                        iArr2[8] = 12325;
                        iArr2[9] = 24;
                        iArr2[10] = 12352;
                        iArr2[11] = 4;
                        iArr2[12] = 12344;
                        iArr2[13] = 0;
                        iArr2[14] = 12344;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (!EGL14.eglChooseConfig(this.A02, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("unable to find RGB8888 / ");
                            A0u.append(2);
                            Log.w("MsqrdEglCore", AnonymousClass000.A0q(" EGLConfig", A0u));
                        } else {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            if (eGLConfig != null) {
                                eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                                int eglGetError = EGL14.eglGetError();
                                if (eglGetError == 12288) {
                                    this.A00 = eGLConfig;
                                    this.A01 = eGLContext2;
                                } else {
                                    StringBuilder A0v = AnonymousClass000.A0v("eglCreateContext");
                                    A0v.append(": EGL error: 0x");
                                    throw C90464aC.A0U(Integer.toHexString(eglGetError), A0v);
                                }
                            }
                        }
                        throw C90514aH.A0s("Unable to find a suitable EGLConfig");
                    }
                    int[] iArr3 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr3, 0);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("EGLContext created, client version ");
                    Log.i("MsqrdEglCore", C36381kD.A10(A0u2, iArr3[0]));
                    return;
                }
                this.A02 = null;
                throw C90514aH.A0s("unable to initialize EGL14");
            }
            throw C90514aH.A0s("unable to get EGL14 display");
        }
        throw C90514aH.A0s("EGL already set up");
    }

    public void A00() {
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
                Log.w("MsqrdEglCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A00();
            }
        } finally {
            super.finalize();
        }
    }
}
