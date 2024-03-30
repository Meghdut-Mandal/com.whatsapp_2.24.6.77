package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.0xT  reason: invalid class name and case insensitive filesystem */
public class C20380xT implements AnonymousClass00M {
    public final C18820ts A00;
    public final AnonymousClass1M4 A01;

    public Uri A02(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        if (!TextUtils.isEmpty(str)) {
            builder.appendPath(str);
        }
        builder.appendQueryParameter("locale", this.A00.A07());
        if (!TextUtils.isEmpty((CharSequence) null)) {
            builder.encodedFragment((String) null);
        }
        return builder.build();
    }

    public static Uri A00(Pair pair, C20380xT r4, String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        builder.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            builder.appendPath(str2);
        }
        A01(builder, r4);
        if (pair != null) {
            builder.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.encodedFragment(str3);
        }
        return builder.build();
    }

    public static void A01(Uri.Builder builder, C20380xT r4) {
        String str;
        C18820ts r2 = r4.A00;
        builder.appendQueryParameter("lg", r2.A06());
        builder.appendQueryParameter("lc", r2.A05());
        if (r4.A01.A04()) {
            str = "1";
        } else {
            str = "0";
        }
        builder.appendQueryParameter("eea", str);
    }

    @Deprecated
    public Uri A03(String str) {
        return A00((Pair) null, this, "general", str, (String) null);
    }

    @Deprecated
    public Uri A04(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        builder.appendPath("general");
        builder.appendPath(str);
        builder.appendPath(str2);
        A01(builder, this);
        return builder.build();
    }

    @Deprecated
    public String A05(String str) {
        return A00((Pair) null, this, "general", str, (String) null).toString();
    }

    public C20380xT(C18820ts r1, AnonymousClass1M4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
