package X;

import java.util.ArrayList;

/* renamed from: X.0d4  reason: invalid class name and case insensitive filesystem */
public class C09840d4 implements AnonymousClass09W {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass01z A03;

    public C09840d4(AnonymousClass01z r1, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean B7o(ArrayList arrayList, ArrayList arrayList2) {
        AnonymousClass01z r2 = this.A03;
        AnonymousClass02E r1 = r2.A06;
        if (r1 != null && this.A01 < 0 && this.A02 == null && AnonymousClass01z.A0H(r1.A0k(), (String) null)) {
            return false;
        }
        return r2.A0x(this.A02, arrayList, arrayList2, this.A01, this.A00);
    }
}
