package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import java.lang.reflect.Constructor;

/* renamed from: X.05W  reason: invalid class name */
public class AnonymousClass05W {
    public static final int[] A01 = {16843375};
    public static final String[] A02 = {"android.widget.", "android.view.", "android.webkit."};
    public static final AnonymousClass007 A03 = new AnonymousClass007(0);
    public static final Class[] A04 = {Context.class, AttributeSet.class};
    public final Object[] A00 = new Object[2];

    public static Context A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1MJ.A0O, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId == 0 || ((context instanceof C004602b) && ((C004602b) context).A00 == resourceId)) {
            return context;
        }
        return new C004602b(context, resourceId);
    }

    public static View A01(Context context, AnonymousClass05W r5, String str, String str2) {
        String str3;
        AnonymousClass007 r3 = A03;
        Constructor<? extends U> constructor = (Constructor) r3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(A04);
            r3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(r5.A00);
    }

    public C03320Ec A02(Context context, AttributeSet attributeSet) {
        return new C03320Ec(context, attributeSet);
    }

    public C015506r A03(Context context, AttributeSet attributeSet) {
        return new C015506r(context, attributeSet);
    }

    public AppCompatCheckBox A04(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton A05(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AnonymousClass07P A06(Context context, AttributeSet attributeSet) {
        return new AnonymousClass07P(context, attributeSet);
    }
}
