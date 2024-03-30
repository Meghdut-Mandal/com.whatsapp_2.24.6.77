package X;

import java.util.List;

/* renamed from: X.6CB  reason: invalid class name */
public final class AnonymousClass6CB {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public AnonymousClass6CB(String str, String str2, List list, List list2) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CB) {
                AnonymousClass6CB r5 = (AnonymousClass6CB) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36421kH.A04(this.A00))) + C36341k9.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AdditionalBusinessData(jid=");
        A0u.append(this.A00);
        A0u.append(", fbIgPostImageUrls=");
        A0u.append(this.A03);
        A0u.append(", catalogProductImageUrls=");
        A0u.append(this.A02);
        A0u.append(", productDescription=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
