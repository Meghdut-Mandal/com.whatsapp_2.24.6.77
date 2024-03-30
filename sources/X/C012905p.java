package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.05p  reason: invalid class name and case insensitive filesystem */
public abstract class C012905p {
    public static void A01(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i) {
        View view2 = view;
        int[] iArr2 = iArr;
        view2.saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArray, i, 0);
    }

    public static View.AccessibilityDelegate A00(View view) {
        return view.getAccessibilityDelegate();
    }
}
