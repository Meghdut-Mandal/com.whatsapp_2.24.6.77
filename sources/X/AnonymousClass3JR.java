package X;

import java.util.List;

/* renamed from: X.3JR  reason: invalid class name */
public final class AnonymousClass3JR {
    public final C51902oZ A00;
    public final List A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JR) {
                AnonymousClass3JR r5 = (AnonymousClass3JR) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3JR(C51902oZ r1, List list, boolean z) {
        this.A01 = list;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoteSearchResults(newsletters=");
        A0u.append(this.A01);
        A0u.append(", state=");
        A0u.append(this.A00);
        A0u.append(", resetScroll=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
