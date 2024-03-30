package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.67a  reason: invalid class name and case insensitive filesystem */
public class C1271167a {
    public final AnonymousClass1GX A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final AnonymousClass1H2 A03;
    public final AnonymousClass1HA A04;

    public final AnonymousClass6VQ A03(AnonymousClass6QO r8) {
        C130956Nc r1 = AnonymousClass6VQ.A05;
        String A0B = r8.A0B();
        Context context = this.A01.A00;
        AnonymousClass00C.A08(context);
        return r1.A02(context, this.A02, this.A03, this.A04, A0B);
    }

    public C1271167a(C19630wG r1, C18820ts r2, AnonymousClass1H2 r3, AnonymousClass1HA r4, AnonymousClass1GX r5) {
        C36321k7.A1B(r5, r1, r3, r2, r4);
        this.A00 = r5;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public final void A04(Uri.Builder builder, Uri uri) {
        C36321k7.A0w(builder, uri);
        builder.appendQueryParameter("mime_type", AnonymousClass1GW.A0M(uri, this.A00.A01.A0O()));
    }
}
