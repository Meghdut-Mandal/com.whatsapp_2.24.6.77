package X;

import java.util.UUID;

/* renamed from: X.88K  reason: invalid class name */
public final class AnonymousClass88K extends C53062qe {
    public C22885Axg A00 = null;
    public C22885Axg A01 = null;
    public AnonymousClass90V A02 = null;
    public AnonymousClass90V A03 = null;
    public UUID A04 = null;
    public UUID A05 = null;

    public /* synthetic */ AnonymousClass88K(C1891492l r2, C22885Axg axg, C22885Axg axg2, AnonymousClass90V r5, AnonymousClass90V r6, UUID uuid, UUID uuid2, C05250Oz r9, int i) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88K) {
                AnonymousClass88K r5 = (AnonymousClass88K) obj;
                if (!AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass000.A0H(this.A05) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A02)) * 31;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PendingLinkSetupValues(txId=");
        A0u.append(this.A05);
        A0u.append(", txTransformer=");
        A0u.append(this.A01);
        A0u.append(", txTargetState=");
        A0u.append(this.A03);
        A0u.append(", rxId=");
        A0u.append(this.A04);
        A0u.append(", rxTransformer=");
        A0u.append(this.A00);
        A0u.append(", rxTargetState=");
        A0u.append(this.A02);
        A0u.append(", rollover=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }

    public AnonymousClass88K() {
    }
}
