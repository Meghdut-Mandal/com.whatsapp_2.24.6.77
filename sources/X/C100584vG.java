package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4vG  reason: invalid class name and case insensitive filesystem */
public final class C100584vG extends C115145iP {
    public final AnonymousClass6XK A00;
    public final AnonymousClass6S1 A01;
    public final List A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100584vG(AnonymousClass6XK r4, AnonymousClass6S1 r5) {
        super(r5);
        int A04 = C36361kB.A04(r4, r5, 1);
        C023409w r1 = C023409w.A00;
        C000500f A0D = C000400e.A0D();
        C36341k9.A1E(r1, A04, A0D);
        this.A00 = r4;
        this.A02 = r1;
        this.A03 = A0D;
        this.A01 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100584vG) {
                C100584vG r5 = (C100584vG) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36391kE.A0A(this.A00))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(data=");
        A0u.append(this.A00);
        A0u.append(", actions=");
        A0u.append(this.A02);
        A0u.append(", externalVariables=");
        A0u.append(this.A03);
        A0u.append(", fetchSummaryData=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
