package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: X.0F9  reason: invalid class name */
public class AnonymousClass0F9 extends PopupWindow {
    private void A00(Context context, AttributeSet attributeSet, int i, int i2) {
        C010404j A00 = C010404j.A00(context, attributeSet, AnonymousClass1MJ.A0H, i, i2);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(2)) {
            AnonymousClass0W8.A01(this, typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(A00.A02(0));
        typedArray.recycle();
    }

    public AnonymousClass0F9(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet, i, i2);
    }
}
