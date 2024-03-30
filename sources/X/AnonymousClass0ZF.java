package X;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: X.0ZF  reason: invalid class name */
public class AnonymousClass0ZF implements TypeEvaluator {
    public FloatEvaluator A00 = new FloatEvaluator();
    public final /* synthetic */ AnonymousClass063 A01;

    public AnonymousClass0ZF(AnonymousClass063 r2) {
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.A00.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
