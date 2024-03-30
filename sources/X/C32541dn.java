package X;

import android.content.Context;

/* renamed from: X.1dn  reason: invalid class name and case insensitive filesystem */
public abstract class C32541dn {
    public static boolean A00(Context context) {
        C18810tr.A00(context, C18800tq.class);
        C20760y7 of = C20760y7.of();
        boolean z = false;
        if (of.size() <= 1) {
            z = true;
        }
        C31111bI.A00("Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0], z);
        if (of.isEmpty()) {
            return true;
        }
        return ((Boolean) of.iterator().next()).booleanValue();
    }
}
