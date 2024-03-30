package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.4gB  reason: invalid class name and case insensitive filesystem */
public class C93224gB extends AnonymousClass07P {
    public static int A06(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize;
        int i = 0;
        do {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
            i++;
            if (i >= 2) {
                break;
            }
        } while (dimensionPixelSize < 0);
        return dimensionPixelSize;
    }

    private void A07(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C27931Qk.A0Q);
        Context context = getContext();
        int[] A1O = C36441kJ.A1O();
        A1O[0] = 1;
        A1O[1] = 2;
        int A06 = A06(context, obtainStyledAttributes, A1O);
        obtainStyledAttributes.recycle();
        if (A06 >= 0) {
            setLineHeight(A06);
        }
    }

    public C93224gB(Context context, AttributeSet attributeSet) {
        super(C27891Qg.A00(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (C014506h.A04(context2, R.attr.f4nameremoved, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C27931Qk.A0R;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int A06 = A06(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (A06 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    A07(theme, resourceId);
                }
            }
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C014506h.A04(context, R.attr.f4nameremoved, true)) {
            A07(context.getTheme(), i);
        }
    }
}
