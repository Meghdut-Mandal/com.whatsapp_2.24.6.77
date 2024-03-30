package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.05r  reason: invalid class name and case insensitive filesystem */
public abstract class C013105r {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static ColorStateList A00(Context context, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        AnonymousClass0SX r2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r2 = (AnonymousClass0SX) sparseArray.get(i)) == null)) {
                if (r2.A01.equals(context.getResources().getConfiguration())) {
                    colorStateList = r2.A00;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList2 = C02480Am.A02(context.getTheme(), resources2, resources2.getXml(i));
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 == null) {
            return AnonymousClass00F.A04(context, i);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new AnonymousClass0SX(colorStateList2, context.getResources().getConfiguration()));
        }
        return colorStateList2;
    }

    public static Drawable A01(Context context, int i) {
        return AnonymousClass02X.A03().A08(context, i);
    }
}
