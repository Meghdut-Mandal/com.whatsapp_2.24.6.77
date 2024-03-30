package X;

import java.util.List;

/* renamed from: X.9Wv  reason: invalid class name and case insensitive filesystem */
public final class C195929Wv {
    public C195789Wa A00;
    public Integer A01;
    public String A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195929Wv) {
                C195929Wv r5 = (C195929Wv) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = C36381kD.A08(this.A02, C36421kH.A04(this.A03));
        return C36401kF.A02(this.A04, (C36351kA.A05(this.A00, A08) + AnonymousClass000.A0H(this.A01)) * 31);
    }

    public C195929Wv(C195789Wa r1, Integer num, String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A01 = num;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Collection(id=");
        A0u.append(this.A03);
        A0u.append(", name=");
        A0u.append(this.A02);
        A0u.append(", collectionStatus=");
        A0u.append(this.A00);
        A0u.append(", itemCount=");
        A0u.append(this.A01);
        A0u.append(", products=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
