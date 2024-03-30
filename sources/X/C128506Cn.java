package X;

import java.util.List;

/* renamed from: X.6Cn  reason: invalid class name and case insensitive filesystem */
public final class C128506Cn {
    public final C206759tv A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128506Cn) {
                C128506Cn r5 = (C128506Cn) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36351kA.A05(this.A00, C53202qw.A00(C36381kD.A08(this.A02, C36421kH.A04(this.A01)), this.A04)));
    }

    public C128506Cn(C206759tv r1, String str, String str2, List list, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = r1;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Category(categoryId=");
        C90494aF.A1N(A0u, this.A01);
        A0u.append(this.A02);
        A0u.append(", isLastLevel=");
        A0u.append(this.A04);
        A0u.append(", image=");
        A0u.append(this.A00);
        A0u.append(", subCategoryIds=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
