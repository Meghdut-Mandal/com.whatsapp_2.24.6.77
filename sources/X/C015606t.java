package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.06t  reason: invalid class name and case insensitive filesystem */
public abstract class C015606t {
    public static final int[] A00 = {16842908};
    public static final int[] A01 = {16842919};
    public static final ThreadLocal A02 = new ThreadLocal();
    public static final int[] A03 = {16842912};
    public static final int[] A04 = {-16842910};
    public static final int[] A05 = new int[0];
    public static final int[] A06 = new int[1];

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        C010404j r0 = new C010404j(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r0.A01(0);
        } finally {
            r0.A02.recycle();
        }
    }

    public static void A03(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass1MJ.A09);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A04, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A02;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int A012 = A01(context, i);
        return C018107s.A06(A012, Math.round(((float) Color.alpha(A012)) * f));
    }

    public static void A04(View view) {
        A03(view.getContext(), view);
    }
}
