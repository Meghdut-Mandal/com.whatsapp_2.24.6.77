package X;

import android.content.Context;

/* renamed from: X.5eK  reason: invalid class name and case insensitive filesystem */
public abstract class C112705eK {
    public static C160307kn A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (C160307kn) Class.forName("DefaultLocationProvider").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e) {
                throw new AnonymousClass78J(e);
            }
        }
    }
}
