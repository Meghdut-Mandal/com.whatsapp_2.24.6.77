package X;

import java.util.List;

/* renamed from: X.3Jz  reason: invalid class name and case insensitive filesystem */
public final class C63423Jz {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63423Jz) {
                C63423Jz r5 = (C63423Jz) obj;
                if (!(this.A03 == r5.A03 && this.A00 == r5.A00 && this.A04 == r5.A04 && AnonymousClass00C.A0J(this.A02, r5.A02) && AnonymousClass00C.A0J(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, ((((C36341k9.A01(this.A03 ? 1 : 0) * 31) + this.A00) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A09(this.A01);
    }

    public C63423Jz(String str, List list, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SeeAllUiStateData(shouldShowEmptyText=");
        A0u.append(this.A03);
        A0u.append(", emptyTextResource=");
        A0u.append(this.A00);
        A0u.append(", shouldShowEmptyTextAction=");
        A0u.append(this.A04);
        A0u.append(", updateDataItems=");
        A0u.append(this.A02);
        A0u.append(", emptyTextOptionalArgument=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
