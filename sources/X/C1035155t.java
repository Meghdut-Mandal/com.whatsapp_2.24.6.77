package X;

import java.util.AbstractCollection;

/* renamed from: X.55t  reason: invalid class name and case insensitive filesystem */
public final class C1035155t extends C1266865b {
    public final C125385zp A00;
    public final String A01;

    public C1035155t(C125385zp r2, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1035155t) {
                C1035155t r5 = (C1035155t) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C125385zp r1, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C1035155t(r1, str));
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerLoading(id=");
        C1266865b.A01(A0u, this.A01);
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
