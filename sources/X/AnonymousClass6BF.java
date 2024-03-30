package X;

import java.util.List;

/* renamed from: X.6BF  reason: invalid class name */
public final class AnonymousClass6BF {
    public final String A00;
    public final String A01;
    public final List A02;

    public AnonymousClass6BF(String str, String str2, List list) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BF) {
                AnonymousClass6BF r5 = (AnonymousClass6BF) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36421kH.A04(this.A01)) + C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessApiSearchResult(usecase=");
        A0u.append(this.A01);
        A0u.append(", businesses=");
        A0u.append(this.A02);
        A0u.append(", pageId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
