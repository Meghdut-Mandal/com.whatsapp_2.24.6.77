package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.4cV  reason: invalid class name and case insensitive filesystem */
public class C91724cV extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public AnonymousClass75D A01;
    public C92164dE A02;
    public Error A03;
    public RuntimeException A04;

    public C91724cV() {
        super("dummySurface");
    }

    public boolean handleMessage(Message message) {
        AnonymousClass78I r1;
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        AnonymousClass75D r4;
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                Objects.requireNonNull(this.A01);
                AnonymousClass75D r12 = this.A01;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] A1O = C36441kJ.A1O();
                    if (EGL14.eglInitialize(eglGetDisplay, A1O, 0, A1O, 1)) {
                        r12.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr3 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, AnonymousClass75D.A06, 0, eGLConfigArr, 0, 1, iArr3, 0);
                        if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            Object[] A1Q = C36441kJ.A1Q();
                            AnonymousClass000.A1N(A1Q, 0, eglChooseConfig);
                            AnonymousClass000.A1L(A1Q, iArr3[0], 1);
                            A1Q[2] = eGLConfigArr[0];
                            r1 = new AnonymousClass78I(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", A1Q));
                        } else {
                            EGLDisplay eGLDisplay = r12.A02;
                            if (i2 == 0) {
                                iArr = new int[]{12440, 2, 12344};
                            } else {
                                iArr = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                            if (eglCreateContext != null) {
                                r12.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay2 = r12.A02;
                                if (i2 == 1) {
                                    eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    if (i2 == 2) {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                    } else {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                    }
                                    eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                    if (eglCreatePbufferSurface == null) {
                                        r1 = new AnonymousClass78I("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    r12.A03 = eglCreatePbufferSurface;
                                    int[] iArr4 = r12.A05;
                                    GLES20.glGenTextures(1, iArr4, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr4[0]);
                                        r12.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(r12);
                                        SurfaceTexture surfaceTexture2 = this.A01.A00;
                                        Objects.requireNonNull(surfaceTexture2);
                                        this.A02 = new C92164dE(surfaceTexture2, this);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("glGenTextures failed. Error: ");
                                    r1 = new AnonymousClass78I(AnonymousClass000.A0q(Integer.toHexString(glGetError), A0u));
                                } else {
                                    r1 = new AnonymousClass78I("eglMakeCurrent failed");
                                }
                            } else {
                                r1 = new AnonymousClass78I("eglCreateContext failed");
                            }
                        }
                    } else {
                        r1 = new AnonymousClass78I("eglInitialize failed");
                    }
                } else {
                    r1 = new AnonymousClass78I("eglGetDisplay failed");
                }
                throw r1;
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                Objects.requireNonNull(this.A01);
                r4 = this.A01;
                r4.A04.removeCallbacks(r4);
                SurfaceTexture surfaceTexture3 = r4.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, r4.A05, 0);
                }
                EGLSurface eGLSurface = r4.A03;
                if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(r4.A02, r4.A03);
                }
                EGLContext eGLContext = r4.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(r4.A02, eGLContext);
                }
                r4.A02 = null;
                r4.A01 = null;
                r4.A03 = null;
                r4.A00 = null;
            } catch (Throwable th3) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th3);
                } catch (Throwable th4) {
                    quit();
                    throw th4;
                }
            }
            quit();
            return true;
        }
        return true;
    }
}
