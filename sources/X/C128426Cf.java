package X;

import java.util.List;

/* renamed from: X.6Cf  reason: invalid class name and case insensitive filesystem */
public final class C128426Cf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128426Cf)) {
            return false;
        }
        C128426Cf r4 = (C128426Cf) obj;
        if (!AnonymousClass00C.A0J(this.A02, r4.A02) || !AnonymousClass00C.A0J(this.A00, r4.A00) || !AnonymousClass00C.A0J(this.A01, r4.A01) || !AnonymousClass00C.A0J(this.A03, r4.A03)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A04, r4.A04);
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, C36351kA.A05(this.A03, C36381kD.A08(this.A01, C36381kD.A08(this.A00, C36421kH.A04(this.A02)))));
    }

    public C128426Cf(String str, String str2, String str3, List list, List list2) {
        C36331k8.A1H(list, list2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ForeignKey{referenceTable='");
        A0u.append(this.A02);
        A0u.append("', onDelete='");
        A0u.append(this.A00);
        A0u.append(" +', onUpdate='");
        A0u.append(this.A01);
        A0u.append("', columnNames=");
        A0u.append(this.A03);
        A0u.append(", referenceColumnNames=");
        return C90464aC.A0X(this.A04, A0u);
    }
}
