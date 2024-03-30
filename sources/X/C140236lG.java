package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6lG  reason: invalid class name and case insensitive filesystem */
public class C140236lG implements C23072B3b, C23014B0f {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaRecorder A07;
    public Surface A08;
    public RandomAccessFile A09;
    public CountDownLatch A0A;
    public final boolean A0B;
    public final Object A0C;
    public volatile AnonymousClass6ZP A0D;
    public volatile SurfaceTexture A0E;
    public volatile SurfaceTexture A0F;

    public void Bv9() {
        try {
            MediaRecorder mediaRecorder = this.A07;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A07;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A07.release();
                this.A07 = null;
            }
            AnonymousClass6ZP r0 = this.A0D;
            if (r0 != null) {
                r0.A05((Surface) null);
            }
            Surface surface = this.A08;
            if (surface != null) {
                surface.release();
                this.A08 = null;
            }
            RandomAccessFile randomAccessFile = this.A09;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A09 = null;
            }
        } catch (RuntimeException e) {
            throw AnonymousClass001.A0B(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A07;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A07.release();
                this.A07 = null;
            }
            AnonymousClass6ZP r02 = this.A0D;
            if (r02 != null) {
                r02.A05((Surface) null);
            }
            Surface surface2 = this.A08;
            if (surface2 != null) {
                surface2.release();
                this.A08 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A09;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A09 = null;
            }
            throw th;
        }
    }

    public SurfaceTexture BI5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SurfaceTexture surfaceTexture;
        this.A03 = i5;
        this.A02 = i6;
        this.A06 = i4;
        boolean A1P = AnonymousClass000.A1P(i4 % 180);
        int i9 = i;
        if (A1P) {
            i9 = i2;
        }
        this.A01 = i9;
        if (!A1P) {
            i = i2;
        }
        this.A00 = i;
        try {
            this.A0A.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("GLSurfacePipeCoordinatorImpl", C36331k8.A0i("Timeout when creating SurfaceNode: ", AnonymousClass000.A0u(), e));
        }
        synchronized (this.A0C) {
            SurfaceTexture surfaceTexture2 = this.A0F;
            if (surfaceTexture2 != null) {
                AnonymousClass6ZP r4 = this.A0D;
                if (r4 == null) {
                    r4 = new AnonymousClass6ZP(this.A0B);
                    this.A0D = r4;
                }
                r4.A03(surfaceTexture2, this.A02);
                int i10 = this.A01;
                int i11 = this.A00;
                SurfaceTexture surfaceTexture3 = r4.A09;
                if (!(surfaceTexture3 != null && r4.A01 == i10 && r4.A00 == i11)) {
                    r4.A01 = i10;
                    r4.A00 = i11;
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                        r4.A09.release();
                        r4.A09 = null;
                    }
                    int i12 = r4.A03;
                    if (i12 != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i12}, 0);
                        r4.A03 = -1;
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    AnonymousClass6ZP.A02("glGenTextures");
                    int i13 = iArr[0];
                    r4.A03 = i13;
                    GLES20.glBindTexture(36197, i13);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("glBindTexture ");
                    AnonymousClass6ZP.A02(C36381kD.A10(A0u, r4.A03));
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    C90514aH.A1D();
                    AnonymousClass6ZP.A02("glTexParameter");
                    SurfaceTexture surfaceTexture4 = new SurfaceTexture(r4.A03);
                    r4.A09 = surfaceTexture4;
                    surfaceTexture4.setOnFrameAvailableListener(r4);
                    surfaceTexture3 = r4.A09;
                }
                this.A0E = surfaceTexture3;
                surfaceTexture = this.A0E;
            } else {
                throw AnonymousClass001.A09("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public void BSy(int i) {
        this.A02 = i;
        synchronized (this.A0C) {
            SurfaceTexture surfaceTexture = this.A0F;
            AnonymousClass6ZP r1 = this.A0D;
            if (!(r1 == null || surfaceTexture == null)) {
                r1.A03(surfaceTexture, this.A02);
            }
        }
    }

    public void Bfn(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    public void Bfo(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
        synchronized (this.A0C) {
            this.A0F = surfaceTexture;
            this.A0A.countDown();
        }
    }

    public void Bfp(SurfaceTexture surfaceTexture) {
        synchronized (this.A0C) {
            if (this.A0F != null) {
                this.A0E = null;
                this.A0F = null;
                this.A0A = C90484aE.A0u();
            }
            AnonymousClass6ZP r1 = this.A0D;
            if (r1 != null) {
                r1.A03((SurfaceTexture) null, 0);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnV(android.graphics.SurfaceTexture r11) {
        /*
            r10 = this;
            X.6ZP r4 = r10.A0D
            r3 = 0
            r10.A0D = r3
            if (r4 == 0) goto L_0x00d9
            android.opengl.EGLDisplay r1 = r4.A0D
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r6 = -1
            r5 = 0
            if (r1 == r0) goto L_0x00b9
            java.lang.Object r8 = r4.A0I
            monitor-enter(r8)
            android.opengl.EGLSurface r1 = r4.A0R     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0081 }
            r2 = 1
            if (r1 == r0) goto L_0x0065
            android.opengl.EGLDisplay r9 = r4.A0D     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r7 = r4.A0R     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0R     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLContext r0 = r4.A0C     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGL14.eglMakeCurrent(r9, r7, r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r7 = r4.A0D     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0R     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 12375(0x3057, float:1.7341E-41)
            int[] r9 = r4.A0K     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r5)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r7 = r4.A0D     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0R     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r2)     // Catch:{ RuntimeException -> 0x0051 }
            r1 = r9[r5]     // Catch:{ RuntimeException -> 0x0051 }
            r0 = r9[r2]     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.GLES20.glViewport(r5, r5, r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r1 = r4.A0D     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r0 = r4.A0R     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
        L_0x0051:
            android.opengl.EGLDisplay r7 = r4.A0D     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r1 = r4.A0E     // Catch:{ all -> 0x0081 }
            android.opengl.EGLContext r0 = r4.A0C     // Catch:{ all -> 0x0081 }
            android.opengl.EGL14.eglMakeCurrent(r7, r1, r1, r0)     // Catch:{ all -> 0x0081 }
            android.opengl.EGLDisplay r1 = r4.A0D     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = r4.A0R     // Catch:{ all -> 0x0081 }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0081 }
            r4.A0R = r0     // Catch:{ all -> 0x0081 }
        L_0x0065:
            r4.A0A = r3     // Catch:{ all -> 0x0081 }
            monitor-exit(r8)     // Catch:{ all -> 0x0081 }
            java.lang.Object r7 = r4.A0J
            monitor-enter(r7)
            android.opengl.EGLSurface r1 = r4.A0S     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007e }
            if (r1 == r0) goto L_0x007c
            android.opengl.EGLDisplay r1 = r4.A0D     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = r4.A0S     // Catch:{ all -> 0x007e }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007e }
            r4.A0S = r0     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            goto L_0x0084
        L_0x007e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0081 }
            throw r0
        L_0x0084:
            android.opengl.EGLSurface r1 = r4.A0E
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r1 == r0) goto L_0x008f
            android.opengl.EGLDisplay r0 = r4.A0D
            android.opengl.EGL14.eglDestroySurface(r0, r1)
        L_0x008f:
            int r1 = r4.A03
            if (r1 == r6) goto L_0x009a
            int[] r0 = new int[r2]
            r0[r5] = r1
            android.opengl.GLES20.glDeleteTextures(r2, r0, r5)
        L_0x009a:
            int r0 = r4.A02
            if (r0 == 0) goto L_0x00a1
            android.opengl.GLES20.glDeleteProgram(r0)
        L_0x00a1:
            android.opengl.EGLDisplay r2 = r4.A0D
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r1, r1, r0)
            android.opengl.EGLDisplay r1 = r4.A0D
            android.opengl.EGLContext r0 = r4.A0C
            android.opengl.EGL14.eglDestroyContext(r1, r0)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r4.A0D
            android.opengl.EGL14.eglTerminate(r0)
        L_0x00b9:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r4.A0D = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r4.A0C = r0
            r4.A0B = r3
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r4.A0E = r0
            r4.A02 = r5
            r4.A03 = r6
            android.graphics.SurfaceTexture r0 = r4.A09
            if (r0 == 0) goto L_0x00d9
            r0.setOnFrameAvailableListener(r3)
            android.graphics.SurfaceTexture r0 = r4.A09
            r0.release()
            r4.A09 = r3
        L_0x00d9:
            r10.A0E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140236lG.BnV(android.graphics.SurfaceTexture):void");
    }

    public C199989gN Bv0(CamcorderProfile camcorderProfile, AnonymousClass7cE r9, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.A06 % 180 != 0) {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        } else {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        if (!this.A0B) {
            i5 = this.A01;
            i6 = this.A00;
        } else if (this.A02 % 180 != 0) {
            i5 = this.A04;
            i6 = this.A05;
        } else {
            i5 = this.A05;
            i6 = this.A04;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = ((float) i5) / ((float) i6);
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        camcorderProfile.videoFrameWidth = i3 - (i3 % 16);
        camcorderProfile.videoFrameHeight = i4 - (i4 % 16);
        String str3 = str;
        this.A09 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A07 = mediaRecorder;
        mediaRecorder.setAudioSource(5);
        this.A07.setVideoSource(2);
        this.A07.setOrientationHint(this.A03);
        this.A07.setProfile(camcorderProfile);
        this.A07.setOutputFile(this.A09.getFD());
        this.A07.prepare();
        this.A08 = this.A07.getSurface();
        AnonymousClass6ZP r1 = this.A0D;
        if (r1 != null) {
            r1.A05(this.A08);
        }
        this.A07.start();
        return C90514aH.A0W(camcorderProfile, new C195099Sm(str3, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, this.A03, i));
    }

    public C140236lG(boolean z) {
        Object A11 = C36441kJ.A11();
        this.A0C = A11;
        synchronized (A11) {
            this.A0A = C90484aE.A0u();
        }
        this.A0B = z;
    }

    public /* synthetic */ B32 BFt() {
        return null;
    }

    public /* synthetic */ C23076B3g BGB() {
        return null;
    }

    public C23014B0f BJ1() {
        return this;
    }

    public void BVY(int i) {
        this.A03 = i;
    }
}
