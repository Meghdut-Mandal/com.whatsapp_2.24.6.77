package X;

/* renamed from: X.6Cu  reason: invalid class name and case insensitive filesystem */
public final class C128576Cu {
    public final long A00;
    public final AnonymousClass6BP A01;
    public final AnonymousClass11F A02;
    public final AnonymousClass3T1 A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128576Cu) {
                C128576Cu r8 = (C128576Cu) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36321k7.A00(this.A00, C36381kD.A08(this.A04, (C36391kE.A0A(this.A03) + AnonymousClass000.A0H(this.A02)) * 31)));
    }

    public C128576Cu(AnonymousClass6BP r1, AnonymousClass11F r2, AnonymousClass3T1 r3, String str, long j) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = str;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsLoggingContext(originalMessage=");
        A0u.append(this.A03);
        A0u.append(", businessJid=");
        A0u.append(this.A02);
        A0u.append(", messageId=");
        A0u.append(this.A04);
        A0u.append(", messageRowId=");
        A0u.append(this.A00);
        A0u.append(", entrypointMetadata=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
