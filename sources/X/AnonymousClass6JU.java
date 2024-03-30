package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6JU  reason: invalid class name */
public final class AnonymousClass6JU {
    public final C112025dE A00;

    public AnonymousClass6JU(C112025dE r1) {
        this.A00 = r1;
    }

    public static final Uri A00(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("https://");
        A0u.append(C36391kE.A0y("m.%sfacebook.com", Locale.ENGLISH, new Object[]{""}, 1));
        String A0q = AnonymousClass000.A0q("/wa-xf-login/?app_id=%s&etoken=%s", A0u);
        Object[] objArr = new Object[2];
        C90494aF.A1H("3402315746664947", str, objArr);
        return Uri.parse(C90504aG.A0m(A0q, Arrays.copyOf(objArr, 2)));
    }
}
