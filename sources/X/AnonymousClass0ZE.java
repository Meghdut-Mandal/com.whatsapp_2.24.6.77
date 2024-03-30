package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0ZE  reason: invalid class name */
public class AnonymousClass0ZE implements TypeEvaluator {
    public AnonymousClass0YU[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        AnonymousClass0YU[] r11 = (AnonymousClass0YU[]) obj;
        AnonymousClass0YU[] r12 = (AnonymousClass0YU[]) obj2;
        if (AnonymousClass0YJ.A01(r11, r12)) {
            AnonymousClass0YU[] r4 = this.A00;
            if (!AnonymousClass0YJ.A01(r4, r11)) {
                if (r11 == null) {
                    r4 = null;
                } else {
                    int length = r11.length;
                    r4 = new AnonymousClass0YU[length];
                    for (int i = 0; i < length; i++) {
                        r4[i] = new AnonymousClass0YU(r11[i]);
                    }
                }
                this.A00 = r4;
            }
            for (int i2 = 0; i2 < r11.length; i2++) {
                AnonymousClass0YU r7 = r4[i2];
                AnonymousClass0YU r6 = r11[i2];
                AnonymousClass0YU r5 = r12[i2];
                r7.A00 = r6.A00;
                int i3 = 0;
                while (true) {
                    float[] fArr = r6.A01;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    r7.A01[i3] = (fArr[i3] * (1.0f - f)) + (r5.A01[i3] * f);
                    i3++;
                }
            }
            return r4;
        }
        throw AnonymousClass001.A08("Can't interpolate between two incompatible pathData");
    }
}
