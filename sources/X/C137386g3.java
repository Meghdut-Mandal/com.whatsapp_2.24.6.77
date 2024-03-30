package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: X.6g3  reason: invalid class name and case insensitive filesystem */
public final class C137386g3 implements C161047m3 {
    public Canvas A00 = C112335dj.A00;
    public Rect A01;
    public Rect A02;

    public void B3L(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                float[] fArr2 = fArr;
                if (fArr[(i * 4) + i2] == f) {
                    i2++;
                } else {
                    Matrix A0B = C90524aI.A0B();
                    float f2 = fArr[2];
                    if (f2 == 0.0f) {
                        float f3 = fArr[6];
                        if (f3 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                            float f4 = fArr[8];
                            if (f4 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                                float f5 = fArr[0];
                                float f6 = fArr[1];
                                float f7 = fArr[3];
                                float f8 = fArr[4];
                                float f9 = fArr[5];
                                float f10 = fArr[7];
                                float f11 = fArr[12];
                                float f12 = fArr[13];
                                float f13 = fArr[15];
                                fArr[0] = f5;
                                fArr[1] = f8;
                                fArr[2] = f11;
                                fArr[3] = f6;
                                fArr[4] = f9;
                                fArr[5] = f12;
                                fArr[6] = f7;
                                fArr[7] = f10;
                                fArr[8] = f13;
                                A0B.setValues(fArr2);
                                fArr[0] = f5;
                                fArr[1] = f6;
                                fArr[2] = f2;
                                fArr[3] = f7;
                                fArr[4] = f8;
                                fArr[5] = f9;
                                fArr[6] = f3;
                                fArr[7] = f10;
                                fArr[8] = f4;
                                this.A00.concat(A0B);
                                return;
                            }
                        }
                    }
                    throw AnonymousClass001.A08("Android does not support arbitrary transforms");
                }
            } while (i2 < 4);
        }
    }

    public void B5z(C158827iI r10, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, false, ((C137416g6) r10).A01);
    }

    public void B2w(C161177mK r4, int i) {
        Canvas canvas = this.A00;
        if (r4 instanceof C137426g7) {
            canvas.clipPath(((C137426g7) r4).A02, Region.Op.INTERSECT);
            return;
        }
        throw AnonymousClass001.A0E("Unable to obtain android.graphics.Path");
    }

    public void B2x(float f, float f2, float f3, float f4, int i) {
        this.A00.clipRect(f, f2, f3, f4, Region.Op.INTERSECT);
    }

    public void B5U() {
        C113835gC.A00(this.A00, false);
    }

    public void B61(C158827iI r5, float f, long j) {
        this.A00.drawCircle(C133206Xf.A00(j), C133206Xf.A01(j), f, ((C137416g6) r5).A01);
    }

    public void B66(C23085B3v b3v, C158827iI r22, long j, long j2, long j3, long j4) {
        C158827iI r13 = r22;
        C23085B3v b3v2 = b3v;
        if (this.A02 == null) {
            this.A02 = AnonymousClass001.A06();
            this.A01 = AnonymousClass001.A06();
        }
        Canvas canvas = this.A00;
        if (b3v2 instanceof C137406g5) {
            Bitmap bitmap = ((C137406g5) b3v2).A00;
            Rect rect = this.A02;
            AnonymousClass00C.A0B(rect);
            int i = (int) (j >> 32);
            rect.left = i;
            int i2 = (int) (j & 4294967295L);
            rect.top = i2;
            rect.right = i + ((int) (j2 >> 32));
            rect.bottom = i2 + ((int) (j2 & 4294967295L));
            Rect rect2 = this.A01;
            AnonymousClass00C.A0B(rect2);
            int i3 = (int) (j3 >> 32);
            rect2.left = i3;
            int i4 = (int) (j3 & 4294967295L);
            rect2.top = i4;
            rect2.right = i3 + ((int) (j4 >> 32));
            rect2.bottom = i4 + ((int) (j4 & 4294967295L));
            canvas.drawBitmap(bitmap, rect, rect2, ((C137416g6) r13).A01);
            return;
        }
        throw AnonymousClass001.A0E("Unable to obtain android.graphics.Bitmap");
    }

    public void B6A(C158827iI r4, C161177mK r5) {
        Canvas canvas = this.A00;
        if (r5 instanceof C137426g7) {
            canvas.drawPath(((C137426g7) r5).A02, ((C137416g6) r4).A01);
            return;
        }
        throw AnonymousClass001.A0E("Unable to obtain android.graphics.Path");
    }

    public void B6D(C158827iI r7, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, ((C137416g6) r7).A01);
    }

    public void B6F(C158827iI r9, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, ((C137416g6) r9).A01);
    }

    public void B6R() {
        C113835gC.A00(this.A00, true);
    }

    public void Boi() {
        this.A00.restore();
    }

    public void BpF() {
        this.A00.save();
    }

    public void BpJ(float f, float f2) {
        this.A00.scale(f, f2);
    }

    public void Bw6(float f, float f2) {
        this.A00.translate(f, f2);
    }
}
