package X;

/* renamed from: X.3K7  reason: invalid class name */
public final class AnonymousClass3K7 {
    public final long A00;
    public final AnonymousClass1M8 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K7) {
                AnonymousClass3K7 r8 = (AnonymousClass3K7) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, AnonymousClass000.A0H(this.A01) * 31);
    }

    public AnonymousClass3K7(AnonymousClass1M8 r3, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        this.A01 = r3;
        this.A00 = j;
        boolean z4 = false;
        if (r3 != null) {
            z = r3.A03;
        } else {
            z = false;
        }
        this.A02 = z;
        if (r3 != null) {
            z2 = r3.A06;
        } else {
            z2 = false;
        }
        this.A05 = z2;
        if (r3 != null) {
            z3 = r3.A05;
        } else {
            z3 = false;
        }
        this.A04 = z3;
        this.A03 = r3 != null ? r3.A04 : z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Connectivity{connected=");
        A0u.append(this.A02);
        A0u.append(", roaming=");
        A0u.append(this.A04);
        A0u.append(", typeWifi=");
        A0u.append(this.A05);
        A0u.append(", typeMobile=");
        A0u.append(this.A03);
        A0u.append(", eventUptimeMillis=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
