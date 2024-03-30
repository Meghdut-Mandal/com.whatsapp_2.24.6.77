package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.7oZ  reason: invalid class name and case insensitive filesystem */
public class C162427oZ extends TranslateAnimation {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C162427oZ(X.C133586Zc r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A01 = r11
            r1 = 1
            r2 = 0
            int r11 = 2 - r11
            if (r11 == 0) goto L_0x0016
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r10
            r8 = 0
        L_0x000e:
            r3 = 1
            r4 = 0
            r5 = 1
            r7 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0016:
            r8 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r10
            r6 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162427oZ.<init>(X.6Zc, int):void");
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A01;
        super.applyTransformation(f, transformation);
        switch (i) {
            case 0:
                C1262062y r1 = (C1262062y) this.A00;
                r1.A00(C36441kJ.A02(r1.A01) * f);
                return;
            case 1:
                C1262062y r2 = (C1262062y) this.A00;
                r2.A00(C36441kJ.A02(r2.A01) * (1.0f - f));
                return;
            case 2:
                C133586Zc r22 = (C133586Zc) this.A00;
                C133586Zc.A0D(r22, (int) (C36441kJ.A02(r22.A0D) * (1.0f - f)));
                return;
            default:
                C133586Zc r12 = (C133586Zc) this.A00;
                C133586Zc.A0D(r12, (int) (C36441kJ.A02(r12.A0D) * f));
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C162427oZ(X.C1262062y r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A01 = r11
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L_0x0014
            r8 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r10
            r6 = 0
        L_0x000c:
            r3 = 1
            r4 = 0
            r5 = 1
            r7 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0014:
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r10
            r8 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162427oZ.<init>(X.62y, int):void");
    }
}
