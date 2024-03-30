package X;

import java.util.List;

/* renamed from: X.6BQ  reason: invalid class name */
public final class AnonymousClass6BQ {
    public final AnonymousClass6PG A00;
    public final AnonymousClass6AF A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BQ) {
                AnonymousClass6BQ r5 = (AnonymousClass6BQ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass6BQ(AnonymousClass6PG r1, AnonymousClass6AF r2, List list) {
        this.A02 = list;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsMetadataResponse(flowIdLinks=");
        A0u.append(this.A02);
        A0u.append(", compatibility=");
        A0u.append(this.A00);
        A0u.append(", endpointPublicKey=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
