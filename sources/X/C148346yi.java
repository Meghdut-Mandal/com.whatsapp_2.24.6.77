package X;

import android.net.Uri;

/* renamed from: X.6yi  reason: invalid class name and case insensitive filesystem */
public class C148346yi implements AnonymousClass7hT {
    public final String A00;
    public final String A01;
    public final Uri.Builder A02;

    public String B7t(C1265864p r3, boolean z) {
        return C90474aD.A0b(this.A02.encodedAuthority(r3.A02));
    }

    public C148346yi(String str, String str2) {
        Uri parse = Uri.parse(str);
        this.A02 = parse.buildUpon();
        this.A00 = parse.getAuthority();
        this.A01 = str2;
    }
}
