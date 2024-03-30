package X;

import java.util.UUID;

/* renamed from: X.889  reason: invalid class name */
public final class AnonymousClass889 extends C53062qe {
    public final C22885Axg A00;
    public final C22885Axg A01;
    public final AnonymousClass90V A02;
    public final UUID A03;
    public final UUID A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass889) {
                AnonymousClass889 r5 = (AnonymousClass889) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A00, C36351kA.A05(this.A01, C36351kA.A05(this.A03, C36391kE.A0A(this.A04)))));
    }

    public AnonymousClass889(C22885Axg axg, C22885Axg axg2, AnonymousClass90V r3, UUID uuid, UUID uuid2) {
        this.A04 = uuid;
        this.A03 = uuid2;
        this.A01 = axg;
        this.A00 = axg2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SetLinkResult(txId=");
        A0u.append(this.A04);
        A0u.append(", rxId=");
        A0u.append(this.A03);
        A0u.append(", txTransformer=");
        A0u.append(this.A01);
        A0u.append(", rxTransformer=");
        A0u.append(this.A00);
        A0u.append(", targetState=");
        A0u.append(this.A02);
        A0u.append(", rollover=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
