package X;

import java.util.AbstractCollection;

/* renamed from: X.55x  reason: invalid class name and case insensitive filesystem */
public final class C1035555x extends C1266865b {
    public final C125385zp A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1035555x(X.C125385zp r3, java.lang.Integer r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r1 = 0
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0006
            r5 = r1
        L_0x0006:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000b
            r4 = r1
        L_0x000b:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "title-"
            r1.append(r0)
            r1.append(r5)
            r0 = 45
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0o(r4, r1)
        L_0x0024:
            r2.<init>((X.C125385zp) r3, (java.lang.Integer) r4, (java.lang.String) r5, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035555x.<init>(X.5zp, java.lang.Integer, java.lang.String, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1035555x) {
                C1035555x r5 = (C1035555x) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36351kA.A05(this.A00, ((C36341k9.A09(this.A03) * 31) + C36411kG.A09(this.A01)) * 31));
    }

    public static void A00(AnonymousClass6W5 r3, C125385zp r4, C125415zs r5, AbstractCollection abstractCollection) {
        abstractCollection.add(new C1035555x(r4, (Integer) null, r3.A04(r5), 10));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Title(title=");
        A0u.append(this.A03);
        A0u.append(", titleResource=");
        A0u.append(this.A01);
        A0u.append(", section=");
        A0u.append(this.A00);
        A0u.append(", id=");
        return C36321k7.A0E(this.A02, A0u);
    }

    public C1035555x(C125385zp r2, Integer num, String str, String str2) {
        C36331k8.A1G(r2, 3, str2);
        this.A03 = str;
        this.A01 = num;
        this.A00 = r2;
        this.A02 = str2;
    }
}
