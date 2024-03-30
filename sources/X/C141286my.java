package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6my  reason: invalid class name and case insensitive filesystem */
public class C141286my implements C160917ln {
    public MediaFormat A00;
    public long A01 = -1;
    public C141206mq A02;
    public C128986Em A03;
    public C123075vt A04;
    public AnonymousClass65W A05;
    public boolean A06;
    public final /* synthetic */ C141306n1 A07;

    public void finish() {
        long j;
        C109605Yf.A00("VideoTranscoderJBMR2", "finish", new Object[0]);
        AnonymousClass6MV r5 = new AnonymousClass6MV();
        new C162577oo(r5, this.A03).A00();
        C123075vt r8 = this.A04;
        if (r8 != null) {
            long j2 = r8.A00;
            AnonymousClass6ZO r7 = r8.A03;
            Objects.requireNonNull(r7);
            synchronized (r7) {
                j = r7.A00;
            }
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = Double.valueOf((((double) (j2 - j)) / ((double) r8.A00)) * 100.0d);
            C109605Yf.A00("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", A0L);
            C123075vt r4 = this.A04;
            C109605Yf.A00("TranscodeOutputSurfaceForJBMR2", "release", new Object[0]);
            Surface surface = r4.A02;
            if (surface != null) {
                surface.release();
            }
            r4.A02 = null;
            r4.A03 = null;
            if (r4.A01 != null) {
                C109605Yf.A00("TranscodeOutputSurfaceForJBMR2", "release: mHandlerThread.quitSafely", new Object[0]);
                r4.A01.quitSafely();
                r4.A01 = null;
            }
        }
        Throwable th = r5.A01;
        if (th != null) {
            throw th;
        }
    }

    public C141286my(C141306n1 r3) {
        this.A07 = r3;
    }

    public long B59(long j) {
        RuntimeException A0s;
        MediaFormat mediaFormat;
        C141206mq r1 = this.A02;
        long j2 = -1;
        if (r1 != null && r1.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = r1.A00;
            long j3 = bufferInfo.presentationTimeUs;
            if (Build.VERSION.SDK_INT >= 29 && (mediaFormat = this.A00) != null && mediaFormat.containsKey("color-transfer")) {
                this.A00.getInteger("color-transfer");
            }
            try {
                C128986Em r9 = this.A03;
                C141206mq r10 = this.A02;
                boolean A1U = C36401kF.A1U((bufferInfo.presentationTimeUs > 0 ? 1 : (bufferInfo.presentationTimeUs == 0 ? 0 : -1)));
                Trace.beginSection("MediaCodecWrapper.releaseOutputBuffer");
                int i = r10.A02;
                if (i >= 0) {
                    r9.A04.releaseOutputBuffer(i, A1U);
                }
                Trace.endSection();
                if ((bufferInfo.flags & 4) != 0) {
                    this.A06 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        C123075vt r0 = this.A04;
                        r0.A00++;
                        AnonymousClass6ZO r8 = r0.A03;
                        Objects.requireNonNull(r8);
                        long nanoTime = System.nanoTime();
                        long j4 = AnonymousClass6ZO.A05 + nanoTime;
                        Object obj = r8.A03;
                        synchronized (obj) {
                            while (!r8.A01) {
                                if (nanoTime < j4) {
                                    try {
                                        obj.wait(10000);
                                        nanoTime = System.nanoTime();
                                    } catch (InterruptedException e) {
                                        C90484aE.A0z();
                                        A0s = AnonymousClass001.A0B(e);
                                    }
                                } else {
                                    A0s = C90514aH.A0s("Surface frame wait timed out");
                                    throw A0s;
                                }
                            }
                            r8.A01 = false;
                        }
                        C200339hB.A02("before updateTexImage", new Object[0]);
                        r8.A02.updateTexImage();
                    }
                    j2 = j3;
                }
                this.A02 = null;
            } catch (IllegalStateException e2) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("codec info: ");
                A0u.append(this.A03.A01);
                throw new IllegalStateException(C36381kD.A0z(" , mDecoder Presentation Time: ", A0u, j3), e2);
            }
        }
        C141206mq A012 = this.A03.A01(j);
        if (A012 != null && A012.A02 >= 0) {
            this.A02 = A012;
            this.A01 = A012.A00.presentationTimeUs;
        }
        return j2;
    }

    public C141206mq B5H(long j) {
        return this.A03.A00(j);
    }

    public String BAr() {
        try {
            return this.A03.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public void Bm6(MediaFormat mediaFormat, AnonymousClass65W r9, List list, int i) {
        C128986Em r0;
        this.A00 = mediaFormat;
        this.A05 = r9;
        this.A04 = new C123075vt(this.A07.A00);
        if (list.isEmpty()) {
            String string = mediaFormat.getString("mime");
            Surface surface = this.A04.A02;
            if (!AnonymousClass6Xb.A05(string)) {
                throw new C98584rf(AnonymousClass000.A0p("Unsupported codec for ", string, AnonymousClass000.A0u()));
            }
            try {
                r0 = AnonymousClass6Xb.A01(MediaCodec.createDecoderByType(string), mediaFormat, surface);
            } catch (IOException e) {
                throw new C98584rf((Throwable) e);
            }
        } else {
            Surface surface2 = this.A04.A02;
            C114955i6 A032 = AnonymousClass6Xb.A03(mediaFormat.getString("mime"), list);
            if (A032 == null) {
                String string2 = mediaFormat.getString("mime");
                C131736Qi.A02(false, (String) null);
                C131736Qi.A02(AnonymousClass6Xb.A05(string2), (String) null);
                int codecCount = MediaCodecList.getCodecCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= codecCount) {
                        A032 = AnonymousClass6Xb.A03(string2, (List) null);
                        if (A032 == null) {
                            throw new C98584rf(AnonymousClass000.A0p("Unsupported codec for ", string2, AnonymousClass000.A0u()));
                        }
                    } else {
                        MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                        if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(string2)) {
                            String name = codecInfoAt.getName();
                            if (AnonymousClass6Xb.A01.contains(name)) {
                                A032 = new C114955i6(name);
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            MediaCodec createByCodecName = MediaCodec.createByCodecName(A032.A00);
            mediaFormat.setInteger("max-input-size", 0);
            r0 = AnonymousClass6Xb.A01(createByCodecName, mediaFormat, surface2);
        }
        this.A03 = r0;
        r0.A02();
    }

    public void Bmi(C141206mq r2) {
        this.A03.A03(r2);
    }

    public void Bwa(int i, Bitmap bitmap) {
        int i2;
        C125015zB r1 = this.A07.A00.A00;
        Objects.requireNonNull(r1);
        float[] fArr = r1.A0F;
        float f = (float) r1.A06.A05;
        if (f != 0.0f) {
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
        if (!r1.A0E.isEmpty()) {
            AnonymousClass67V r2 = r1.A04;
            C131736Qi.A02(AnonymousClass000.A1V(r2), (String) null);
            i2 = r2.A00;
        } else {
            i2 = r1.A01;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public long BAp() {
        return this.A01;
    }

    public boolean BNU() {
        return this.A06;
    }
}
