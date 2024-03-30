package X;

import android.net.Uri;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* renamed from: X.6mg  reason: invalid class name and case insensitive filesystem */
public class C141106mg implements C160697lR {
    public C122145uN A00;
    public boolean A01 = false;
    public final C141126mi A02;

    public void BqB(AnonymousClass60K r1) {
    }

    public boolean BWE(AnonymousClass6NG r12, long j) {
        float f;
        Uri A012;
        if (!this.A01) {
            C122145uN r1 = this.A00;
            float f2 = 0.0f;
            if (r1.A03) {
                float[] fArr = new float[4];
                Matrix.multiplyMV(fArr, 0, r12.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f3 = fArr[1];
                float[] fArr2 = new float[4];
                Matrix.multiplyMV(fArr2, 0, r12.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f4 = fArr2[1];
                f2 = ((1.0f - f3) / C90494aF.A01(1.0f, -1.0f)) + (0.0f * f4);
                f = (r1.A00 * f4) + f2;
            } else {
                f = 0.0f + r1.A00;
            }
            float f5 = 0.0f + r1.A01;
            float A013 = C90494aF.A01(1.0f, -1.0f);
            float f6 = ((0.0f * A013) - 4.0f) + 0.0f;
            float f7 = ((1.0f - f2) * A013) - 4.0f;
            float f8 = ((f5 * A013) - 4.0f) + 0.0f;
            float f9 = ((1.0f - f) * A013) - 4.0f;
            C141126mi r3 = this.A02;
            String str = r1.A02;
            if (str == null) {
                A012 = null;
            } else {
                A012 = C133036Wk.A01(str);
            }
            Uri uri = r3.A03;
            if (uri == null || !uri.equals(A012)) {
                C141126mi.A00(r3, AnonymousClass000.A1W(A012));
                r3.A08.A00 = A012;
                r3.A03 = A012;
            }
            float[] fArr3 = C112885ec.A00;
            C90484aE.A1O(fArr3, f6, f9);
            fArr3[2] = f8;
            fArr3[3] = f9;
            fArr3[4] = f6;
            fArr3[5] = f7;
            C90494aF.A1P(fArr3, f8, f7);
            r3.A08.A01 = fArr3;
            FloatBuffer floatBuffer = r3.A0F.A01;
            floatBuffer.put(fArr3);
            floatBuffer.position(0);
            this.A01 = true;
        }
        return this.A02.BWE(r12, j);
    }

    public void Bik(C131296Om r2) {
        this.A02.Bik(r2);
    }

    public void Bil() {
        this.A02.Bil();
    }

    public boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public C141106mg(AnonymousClass6M6 r3, C122145uN r4) {
        Uri A012;
        String str = r4.A02;
        if (str == null) {
            A012 = null;
        } else {
            A012 = C133036Wk.A01(str);
        }
        this.A02 = new C141126mi(A012, r3);
        this.A00 = r4;
    }

    public void Bij(int i, int i2) {
    }
}
