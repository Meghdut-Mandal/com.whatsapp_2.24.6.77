package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.FloatBuffer;

/* renamed from: X.6ZP  reason: invalid class name */
public class AnonymousClass6ZP implements SurfaceTexture.OnFrameAvailableListener {
    public static final FloatBuffer A0U;
    public static final FloatBuffer A0V;
    public static final float[] A0W;
    public static final float[] A0X;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public SurfaceTexture A09;
    public SurfaceTexture A0A;
    public EGLConfig A0B;
    public EGLContext A0C;
    public EGLDisplay A0D;
    public EGLSurface A0E;
    public long A0F;
    public long A0G;
    public boolean A0H;
    public final Object A0I;
    public final Object A0J;
    public final int[] A0K = new int[2];
    public final boolean A0L;
    public final float[] A0M;
    public final float[] A0N;
    public final float[] A0O;
    public final float[] A0P;
    public final float[] A0Q;
    public volatile EGLSurface A0R;
    public volatile EGLSurface A0S;
    public volatile int A0T;

    public void A05(Surface surface) {
        if (this.A0D != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0J) {
                if (this.A0S != EGL14.EGL_NO_SURFACE) {
                    Matrix.setIdentityM(this.A0N, 0);
                    EGL14.eglDestroySurface(this.A0D, this.A0S);
                    this.A0S = EGL14.EGL_NO_SURFACE;
                }
                if (surface != null) {
                    float[] fArr = this.A0N;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) 0, 0.0f, 0.0f, 1.0f);
                    this.A0S = EGL14.eglCreateWindowSurface(this.A0D, this.A0B, surface, new int[]{12344}, 0);
                    if (this.A0S == null || EGL14.eglGetError() != 12288) {
                        this.A0S = EGL14.EGL_NO_SURFACE;
                    }
                }
            }
        }
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0W = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0X = fArr2;
        FloatBuffer A0m = C90474aD.A0m(fArr, 32);
        A0m.position(0);
        A0V = A0m;
        FloatBuffer A0m2 = C90474aD.A0m(fArr2, 32);
        A0m2.position(0);
        A0U = A0m2;
    }

    public static void A01(int i, String str) {
        if (i < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unable to locate '");
            A0u.append(str);
            throw C90464aC.A0U("' in program", A0u);
        }
    }

    public void A03(SurfaceTexture surfaceTexture, int i) {
        if (this.A0D != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0I) {
                this.A0T = i;
                if (this.A0A == surfaceTexture) {
                    float[] fArr = this.A0M;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, 1.0f);
                } else {
                    if (this.A0R != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(this.A0D, this.A0R);
                        Matrix.setIdentityM(this.A0M, 0);
                        this.A0R = EGL14.EGL_NO_SURFACE;
                    }
                    this.A0A = surfaceTexture;
                    if (surfaceTexture != null) {
                        float[] fArr2 = this.A0M;
                        Matrix.setIdentityM(fArr2, 0);
                        Matrix.rotateM(fArr2, 0, (float) i, 0.0f, 0.0f, 1.0f);
                        this.A0R = EGL14.eglCreateWindowSurface(this.A0D, this.A0B, surfaceTexture, new int[]{12344}, 0);
                        if (this.A0R == null || EGL14.eglGetError() != 12288) {
                            this.A0R = EGL14.EGL_NO_SURFACE;
                        }
                    }
                }
            }
        }
    }

    public void A04(EGLSurface eGLSurface, float[] fArr, int i, long j) {
        int i2;
        int i3;
        float[] fArr2;
        EGLSurface eGLSurface2 = eGLSurface;
        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
            try {
                EGL14.eglMakeCurrent(this.A0D, eGLSurface2, eGLSurface2, this.A0C);
                EGLDisplay eGLDisplay = this.A0D;
                int[] iArr = this.A0K;
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface2, 12375, iArr, 0);
                EGL14.eglQuerySurface(this.A0D, eGLSurface2, 12374, iArr, 1);
                GLES20.glViewport(0, 0, iArr[0], iArr[1]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                if (i % 180 != 0) {
                    i2 = this.A00;
                    i3 = this.A01;
                } else {
                    i2 = this.A01;
                    i3 = this.A00;
                }
                float f = (float) i2;
                float f2 = (float) i3;
                float f3 = f / f2;
                int i4 = iArr[0];
                float f4 = (float) i4;
                int i5 = iArr[1];
                float f5 = (float) i5;
                float f6 = f4 / f5;
                float[] fArr3 = fArr;
                if (this.A0L) {
                    float f7 = (((f2 * 1.0f) / f) * f4) / f5;
                    if (i2 > i3 && f7 > 0.0f) {
                        f7 = 1.0f / f7;
                    }
                    fArr2 = this.A0P;
                    Matrix.scaleM(fArr2, 0, fArr3, 0, 1.0f, f7, 1.0f);
                } else {
                    if (f6 > f3) {
                        i4 = (int) (f5 * f3);
                    } else {
                        i5 = (int) (f4 / f3);
                    }
                    fArr2 = fArr3;
                }
                int i6 = iArr[0];
                int i7 = (i6 - i4) / 2;
                int i8 = iArr[1];
                int i9 = (i8 - i5) / 2;
                if (i7 < 8 && i9 < 8) {
                    i4 = i6;
                    i5 = i8;
                    i7 = 0;
                    i9 = 0;
                }
                GLES20.glViewport(i7, i9, i4, i5);
                A02("draw start");
                GLES20.glUseProgram(this.A02);
                A02("glUseProgram");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.A03);
                GLES20.glUniformMatrix4fv(this.A07, 1, false, this.A0O, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A08, 1, false, this.A0Q, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A06, 1, false, fArr2, 0);
                A02("glUniformMatrix4fv");
                int i10 = this.A04;
                GLES20.glEnableVertexAttribArray(i10);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, A0V);
                A02("glVertexAttribPointer");
                int i11 = this.A05;
                GLES20.glEnableVertexAttribArray(i11);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, A0U);
                A02("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, 4);
                A02("glDrawArrays");
                GLES20.glDisableVertexAttribArray(i10);
                GLES20.glDisableVertexAttribArray(i11);
                GLES20.glBindTexture(36197, 0);
                GLES20.glUseProgram(0);
                EGLExt.eglPresentationTimeANDROID(this.A0D, eGLSurface2, j);
                EGL14.eglSwapBuffers(this.A0D, eGLSurface2);
            } catch (RuntimeException unused) {
            }
            EGLDisplay eGLDisplay2 = this.A0D;
            EGLSurface eGLSurface3 = this.A0E;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, this.A0C);
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (surfaceTexture != null) {
            if (surfaceTexture2 == this.A09) {
                try {
                    surfaceTexture2.updateTexImage();
                    surfaceTexture2.getTransformMatrix(this.A0O);
                    this.A0G = surfaceTexture2.getTimestamp();
                    if (!this.A0H) {
                        long j = Long.MAX_VALUE;
                        for (int i = 0; i < 3; i++) {
                            long nanoTime = System.nanoTime();
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            long nanoTime2 = System.nanoTime();
                            long j2 = nanoTime2 - nanoTime;
                            if (i == 0 || j2 < j) {
                                this.A0F = elapsedRealtimeNanos - ((nanoTime + nanoTime2) >> 1);
                                j = j2;
                            }
                        }
                        this.A0H = true;
                    }
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    long j3 = this.A0G;
                    if (Math.abs(((float) (elapsedRealtimeNanos2 - j3)) / 1.0E9f) < 5.0f) {
                        this.A0G = j3 - this.A0F;
                    }
                } catch (RuntimeException unused) {
                }
                synchronized (this.A0I) {
                    A04(this.A0R, this.A0M, this.A0T, this.A0G);
                }
                synchronized (this.A0J) {
                    A04(this.A0S, this.A0N, 0, this.A0G);
                }
            }
        }
    }

    public AnonymousClass6ZP(boolean z) {
        EGLConfig eGLConfig;
        int A002;
        float[] fArr = new float[16];
        this.A0O = fArr;
        float[] fArr2 = new float[16];
        this.A0Q = fArr2;
        float[] fArr3 = new float[16];
        this.A0M = fArr3;
        float[] fArr4 = new float[16];
        this.A0N = fArr4;
        this.A0P = new float[16];
        this.A03 = -1;
        this.A0R = EGL14.EGL_NO_SURFACE;
        this.A0S = EGL14.EGL_NO_SURFACE;
        this.A0I = C36441kJ.A11();
        this.A0J = C36441kJ.A11();
        this.A0F = 0;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr4, 0);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A0D = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.A0D, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw C90514aH.A0s("Unable to find a suitable EGLConfig");
                }
                this.A0B = eGLConfig;
                this.A0C = EGL14.eglCreateContext(this.A0D, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                int eglGetError = EGL14.eglGetError();
                if (eglGetError != 12288 || this.A0C == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("eglCreateContext: EGL error: 0x");
                    throw C90464aC.A0U(Integer.toHexString(eglGetError), A0u);
                }
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A0D, this.A0B, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.A0E = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface == null || EGL14.eglGetError() != 12288) {
                    this.A0E = EGL14.EGL_NO_SURFACE;
                }
                EGLDisplay eGLDisplay = this.A0D;
                EGLSurface eGLSurface = this.A0E;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A0C);
                int A003 = A00(35633, "precision mediump float;\nuniform mat4 uSurfaceTransformMatrix;\nuniform mat4 uSceneTransformMatrix;\nuniform mat4 uVideoTransformMatrix;\n\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uSceneTransformMatrix * aPosition;\n  vTextureCoord = (uSurfaceTransformMatrix * uVideoTransformMatrix * aTextureCoord).xy;\n}\n");
                if (!(A003 == 0 || (A002 = A00(35632, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\n\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0)) {
                    this.A02 = GLES20.glCreateProgram();
                    A02("glCreateProgram");
                    if (this.A02 == 0) {
                        Log.e("GLSurfacePipe", "Could not create program");
                    }
                    GLES20.glAttachShader(this.A02, A003);
                    A02("glAttachShader");
                    GLES20.glAttachShader(this.A02, A002);
                    A02("glAttachShader");
                    GLES20.glLinkProgram(this.A02);
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(this.A02, 35714, iArr2, 0);
                    if (iArr2[0] != 1) {
                        Log.e("GLSurfacePipe", "Could not link program: ");
                        Log.e("GLSurfacePipe", GLES20.glGetProgramInfoLog(this.A02));
                        GLES20.glDeleteProgram(this.A02);
                        this.A02 = 0;
                    } else {
                        int glGetAttribLocation = GLES20.glGetAttribLocation(this.A02, "aPosition");
                        this.A04 = glGetAttribLocation;
                        A01(glGetAttribLocation, "aPosition");
                        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A02, "aTextureCoord");
                        this.A05 = glGetAttribLocation2;
                        A01(glGetAttribLocation2, "aTextureCoord");
                        int glGetUniformLocation = GLES20.glGetUniformLocation(this.A02, "uSurfaceTransformMatrix");
                        this.A07 = glGetUniformLocation;
                        A01(glGetUniformLocation, "uSurfaceTransformMatrix");
                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A02, "uVideoTransformMatrix");
                        this.A08 = glGetUniformLocation2;
                        A01(glGetUniformLocation2, "uVideoTransformMatrix");
                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A02, "uSceneTransformMatrix");
                        this.A06 = glGetUniformLocation3;
                        A01(glGetUniformLocation3, "uSceneTransformMatrix");
                    }
                }
                this.A0L = z;
                return;
            }
            this.A0D = EGL14.EGL_NO_DISPLAY;
            throw C90514aH.A0s("unable to initialize EGL14");
        }
        throw C90514aH.A0s("unable to get EGL14 display");
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass000.A0r("glCreateShader type=", AnonymousClass000.A0u(), i));
        if (C90504aG.A09(glCreateShader, str) != 0) {
            return glCreateShader;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not compile shader ");
        A0u.append(i);
        Log.e("GLSurfacePipe", AnonymousClass000.A0q(":", A0u));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36421kH.A1N(A0u2);
        Log.e("GLSurfacePipe", AnonymousClass000.A0q(GLES20.glGetShaderInfoLog(glCreateShader), A0u2));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(": glError 0x");
            String A0q = AnonymousClass000.A0q(Integer.toHexString(glGetError), A0v);
            Log.e("GLSurfacePipe", A0q);
            throw C90514aH.A0s(A0q);
        }
    }
}
