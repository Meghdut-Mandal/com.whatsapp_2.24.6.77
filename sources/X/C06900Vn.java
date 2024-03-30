package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.0Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C06900Vn {
    public static final AnonymousClass0UT A00 = new AnonymousClass0UT("GoogleSignInCommon", new String[0]);

    public static void A00(Context context) {
        C07170Wp.A00(context).A01();
        Set<AnonymousClass0XK> set = AnonymousClass0XK.A00;
        synchronized (set) {
        }
        for (AnonymousClass0XK A07 : set) {
            A07.A07();
        }
        C07720Za.A03();
    }
}
