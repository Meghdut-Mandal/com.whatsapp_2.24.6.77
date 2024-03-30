package X;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: X.0WX  reason: invalid class name */
public class AnonymousClass0WX {
    public Method A00;
    public Method A01;
    public Method A02;

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public AnonymousClass0WX() {
        A00();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.A01 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.A00 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
        try {
            Method A0G = AnonymousClass001.A0G(cls, Boolean.TYPE, "ensureImeVisible", new Class[1], 0);
            this.A02 = A0G;
            A0G.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }
}
