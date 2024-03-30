package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Trace;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6n0  reason: invalid class name */
public class AnonymousClass6n0 implements C161017ly {
    public AnonymousClass6OY A00;
    public C128986Em A01;
    public C124095xa A02;
    public final /* synthetic */ C141306n1 A03;

    public void Bm7(Context context, AnonymousClass65N r12, AnonymousClass6OY r13, C109695Yo r14, AnonymousClass65W r15, int i) {
        int i2;
        HashMap A032;
        C108365Tf r2 = C108365Tf.CODEC_VIDEO_H264;
        AnonymousClass6OY r7 = r13;
        C128116Ay r0 = r13.A0C;
        if (r0 != null) {
            r2 = r0.A02;
        }
        int i3 = r13.A09;
        if (i3 <= 0 || (i2 = r13.A07) <= 0) {
            Object[] objArr = new Object[2];
            AnonymousClass000.A1L(objArr, i3, 0);
            AnonymousClass000.A1L(objArr, r13.A07, 1);
            throw new C98594rg(String.format("Invalid dimensions: width=%d, height=%d", objArr));
        }
        C124625yW r3 = new C124625yW(r2, i3, i2);
        r3.A05 = r13.A00();
        r3.A02 = 10;
        r3.A06 = r13.A01;
        C128116Ay r02 = r13.A0C;
        if (r02 != null) {
            int i4 = r02.A01;
            int i5 = r02.A00;
            r3.A04 = i4;
            r3.A03 = i5;
            r3.A09 = true;
        }
        C141306n1 r4 = this.A03;
        AnonymousClass6QD r1 = r4.A01;
        if (!(r1 == null || (A032 = r1.A03(AnonymousClass5TE.VIDEO)) == null)) {
            Iterator A10 = C36391kE.A10(A032);
            while (A10.hasNext()) {
                Iterator A0r = C90474aD.A0r(((C128956Eg) A10.next()).A01);
                while (A0r.hasNext()) {
                    ((AnonymousClass6F1) A0r.next()).A01();
                }
            }
        }
        int i6 = r13.A0A;
        if (i6 != -1) {
            r3.A00 = i6;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(r3.A08.value, r3.A07, r3.A01);
        createVideoFormat.setInteger("color-format", 2130708361);
        int i7 = r3.A05;
        if (i7 > 0) {
            createVideoFormat.setInteger("bitrate", i7);
        }
        int i8 = r3.A06;
        if (i8 > 0) {
            createVideoFormat.setInteger("frame-rate", i8);
        }
        createVideoFormat.setInteger("i-frame-interval", r3.A02);
        if (r3.A09) {
            createVideoFormat.setInteger("profile", r3.A04);
            createVideoFormat.setInteger("level", r3.A03);
        }
        int i9 = r3.A00;
        if (i9 != -1) {
            createVideoFormat.setInteger("bitrate-mode", i9);
        }
        new Pair(-1, -1);
        C128986Em A022 = AnonymousClass6Xb.A02(createVideoFormat, C107835Rb.SURFACE, r2.value, r13.A0E);
        this.A01 = A022;
        A022.A02();
        C114985i9 r8 = r4.A00;
        C128986Em r22 = this.A01;
        C131736Qi.A02(C36361kB.A1a(r22.A06, C023109s.A01), (String) null);
        this.A02 = new C124095xa(context, r22.A05, r12, r7, r8, r15);
        this.A00 = r13;
    }

    public AnonymousClass6n0(C141306n1 r1) {
        this.A03 = r1;
    }

    public void B0o(int i) {
        Objects.requireNonNull(this.A02.A06.A00);
    }

    public void B5j(long j) {
        C124095xa r2 = this.A02;
        Trace.beginSection("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        C125015zB r0 = r2.A06.A00;
        Objects.requireNonNull(r0);
        EGLDisplay eGLDisplay = r0.A09;
        EGLSurface eGLSurface = r0.A0A;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j * 1000);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        Trace.endSection();
    }

    public String BBW() {
        try {
            return this.A01.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public MediaFormat BEp() {
        return this.A01.A00;
    }

    public int BEt() {
        AnonymousClass6OY r0 = this.A00;
        return (r0.A08 + r0.A03) % 360;
    }

    public void BnS(C141206mq r5) {
        C128986Em r3 = this.A01;
        boolean z = r3.A07;
        Trace.beginSection("MediaCodecWrapper.releaseOutputBuffer");
        int i = r5.A02;
        if (i >= 0) {
            r3.A04.releaseOutputBuffer(i, z);
        }
        Trace.endSection();
    }

    public void Bo7(long j) {
        long j2 = j * 1000;
        C125015zB r3 = this.A02.A06.A00;
        Objects.requireNonNull(r3);
        C200339hB.A02("onDrawFrame start", C90524aI.A0w());
        List<C160697lR> list = r3.A0E;
        if (!list.isEmpty()) {
            C131736Qi.A02(AnonymousClass000.A1V(r3.A04), (String) null);
            SurfaceTexture surfaceTexture = r3.A02;
            float[] fArr = r3.A0H;
            surfaceTexture.getTransformMatrix(fArr);
            if (r3.A08) {
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            }
            for (C160697lR BWE : list) {
                long micros = TimeUnit.NANOSECONDS.toMicros(j2);
                AnonymousClass6NG r7 = r3.A0D;
                AnonymousClass67V r6 = r3.A04;
                float[] fArr2 = r3.A0F;
                float[] fArr3 = r3.A0I;
                float[] fArr4 = r3.A0G;
                r7.A01 = r6;
                r7.A04 = fArr;
                r7.A05 = fArr2;
                r7.A03 = fArr3;
                r7.A02 = fArr4;
                r7.A00 = j2;
                BWE.BWE(r7, micros);
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = r3.A02;
        float[] fArr5 = r3.A0H;
        surfaceTexture2.getTransformMatrix(fArr5);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, r3.A01);
        C130986Ng A022 = r3.A03.A02();
        A022.A02("uSTMatrix", fArr5);
        A022.A02("uConstMatrix", r3.A0F);
        A022.A02("uSceneMatrix", r3.A0I);
        A022.A02("uContentTransform", r3.A0G);
        AnonymousClass6TK.A01(r3.A0B, A022.A00);
        GLES20.glFinish();
    }

    public void BuA() {
        C128986Em r2 = this.A01;
        C131736Qi.A02(C36361kB.A1a(r2.A06, C023109s.A01), (String) null);
        r2.A04.signalEndOfInputStream();
    }

    public void finish() {
        EGLSurface eGLSurface;
        AnonymousClass6MV r4 = new AnonymousClass6MV();
        new C162577oo(r4, this.A01).A00();
        C124095xa r3 = this.A02;
        if (r3 != null) {
            C114985i9 r2 = r3.A06;
            if (r3.A00 != null) {
                if (EGL14.eglGetCurrentContext().equals(r3.A00)) {
                    EGLDisplay eGLDisplay = r3.A01;
                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                }
                EGL14.eglDestroyContext(r3.A01, r3.A00);
            }
            EGLDisplay eGLDisplay2 = r3.A01;
            if (!(eGLDisplay2 == null || (eGLSurface = r3.A02) == null)) {
                EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
            }
            C125015zB r0 = r2.A00;
            if (r0 != null) {
                for (C160697lR Bil : r0.A0E) {
                    Bil.Bil();
                }
            }
            r3.A01 = null;
            r3.A00 = null;
            r3.A02 = null;
            r2.A00 = null;
        }
        Throwable th = r4.A01;
        if (th != null) {
            throw th;
        }
    }

    public void flush() {
        Objects.requireNonNull(this.A02.A06.A00);
    }

    public C141206mq B5I(long j) {
        try {
            return this.A01.A01(250000);
        } catch (Throwable th) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("codec info: ");
            A0u.append(this.A01.A01);
            A0u.append(" , mMediaTranscodeParams.mDebugStats: ");
            throw new IllegalStateException(AnonymousClass000.A0q(this.A00.A0E, A0u), th);
        }
    }
}
