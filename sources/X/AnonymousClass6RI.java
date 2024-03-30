package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.whatsapp.R;

/* renamed from: X.6RI  reason: invalid class name */
public abstract class AnonymousClass6RI {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int color;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            color = num.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.f4nameremoved});
            color = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.f4nameremoved});
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
        obtainStyledAttributes2.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        int[][] iArr = A00;
        int[] iArr2 = new int[4];
        iArr2[0] = color;
        C90474aD.A1R(iArr2, defaultColor, colorForState, i);
        return new ColorStateList(iArr, iArr2);
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A09;
        int A092;
        int A06;
        int A062;
        if (num != null) {
            A09 = num.intValue();
        } else {
            A09 = C90484aE.A09(context.getTheme(), 16843818, -7829368);
        }
        if (num2 != null) {
            A092 = num2.intValue();
        } else {
            A092 = C90484aE.A09(context.getTheme(), 16842800, -7829368);
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A06 = C018107s.A06(obtainStyledAttributes.getColor(0, -7829368), C90514aH.A06((float) Color.alpha(A09), 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A062 = C018107s.A06(obtainStyledAttributes2.getColor(0, -7829368), C90514aH.A06((float) Color.alpha(A092), 0.25f));
            obtainStyledAttributes2.recycle();
        }
        int[][] iArr = A00;
        int[] iArr2 = new int[4];
        iArr2[0] = A09;
        C90474aD.A1R(iArr2, A092, A06, A062);
        return new ColorStateList(iArr, iArr2);
    }
}
