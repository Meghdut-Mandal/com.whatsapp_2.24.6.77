package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: X.0Rj  reason: invalid class name and case insensitive filesystem */
public abstract class C05870Rj {
    public static Field A00;
    public static boolean A01;

    public static Drawable A00(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0Q7.A00(compoundButton);
        }
        if (!A01) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                A00 = null;
            }
        }
        return null;
    }
}
