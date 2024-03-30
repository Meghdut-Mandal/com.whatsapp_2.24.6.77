package X;

import android.net.Uri;

/* renamed from: X.5eT  reason: invalid class name and case insensitive filesystem */
public abstract class C112795eT {
    public static final Uri A00;

    static {
        String str;
        if (C112815eV.A00) {
            str = "com.facebook.appmanager.dev";
        } else {
            str = "com.facebook.appmanager";
        }
        A00 = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0q(".firstparty.settings", AnonymousClass000.A0v(str))).build();
    }
}
