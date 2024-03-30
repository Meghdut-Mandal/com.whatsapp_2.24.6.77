package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: X.0ZH  reason: invalid class name */
public class AnonymousClass0ZH implements TypeEvaluator {
    public Rect A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) (((float) (rect2.left - i)) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) (((float) (rect2.top - i3)) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) (((float) (rect2.right - i5)) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) (((float) (rect2.bottom - i7)) * f));
        Rect rect3 = this.A00;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return rect3;
    }

    public AnonymousClass0ZH(Rect rect) {
        this.A00 = rect;
    }

    public AnonymousClass0ZH() {
    }
}
