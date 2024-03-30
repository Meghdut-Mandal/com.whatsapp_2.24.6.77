package X;

import android.net.Uri;

/* renamed from: X.3mK  reason: invalid class name and case insensitive filesystem */
public final class C74883mK implements C87774Qc {
    public final int A00;
    public final Uri A01;
    public final C21060yb A02;
    public final C20810yC A03;
    public final AnonymousClass6N7 A04;
    public final AnonymousClass1A2 A05;
    public final boolean A06;

    public C88924Uo B4h(boolean z) {
        String str;
        C135036c1 A002;
        Uri uri = this.A01;
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        String str2 = null;
        if (str.startsWith(C36381kD.A0y(AnonymousClass2UH.A00))) {
            C20810yC r6 = this.A03;
            C21060yb r5 = this.A02;
            AnonymousClass1A2 r7 = this.A05;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            return new AnonymousClass2UH(r5, r6, r7, str2, this.A00);
        }
        if (!z) {
            A002 = new C135036c1((String) null, 0, 0, 0, false, false);
            A002.A05 = true;
        } else {
            int i = this.A00;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            A002 = AnonymousClass6N7.A00(str2, i, this.A06);
        }
        return this.A04.A01(A002);
    }

    public C74883mK(Uri uri, C21060yb r2, C20810yC r3, AnonymousClass6N7 r4, AnonymousClass1A2 r5, int i, boolean z) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = uri;
        this.A00 = i;
        this.A06 = z;
    }
}
