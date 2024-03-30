package X;

import java.util.List;

/* renamed from: X.6CA  reason: invalid class name */
public final class AnonymousClass6CA {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CA) {
                AnonymousClass6CA r5 = (AnonymousClass6CA) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36351kA.A05(this.A03, C36381kD.A08(this.A01, C36421kH.A04(this.A00))));
    }

    public AnonymousClass6CA(String str, String str2, String str3, List list) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PopularBizCustomListInfo(categoryId=");
        A0u.append(this.A00);
        A0u.append(", listName=");
        A0u.append(this.A01);
        A0u.append(", minifiedBusinessProfileList=");
        A0u.append(this.A03);
        A0u.append(", moduleName=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
