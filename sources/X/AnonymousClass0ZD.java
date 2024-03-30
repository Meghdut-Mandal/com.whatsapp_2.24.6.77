package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0ZD  reason: invalid class name */
public class AnonymousClass0ZD implements TypeEvaluator {
    public float[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.A00;
        int i = 0;
        do {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
            i++;
        } while (i < 9);
        return fArr3;
    }

    public AnonymousClass0ZD(float[] fArr) {
        this.A00 = fArr;
    }
}
