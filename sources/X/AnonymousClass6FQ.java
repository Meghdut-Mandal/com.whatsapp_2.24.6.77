package X;

/* renamed from: X.6FQ  reason: invalid class name */
public final class AnonymousClass6FQ {
    public Boolean A00;
    public Long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C119555q3 A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6FQ) {
                AnonymousClass6FQ r5 = (AnonymousClass6FQ) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A05, r5.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i = this.A03;
        if (i == 80) {
            return 3;
        }
        if (i == 443) {
            return 2;
        }
        if (i != 5222) {
            return 4;
        }
        return 1;
    }

    public final Integer A01() {
        C119555q3 r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        int i = r0.A00;
        int i2 = 1;
        if (Integer.valueOf(i) == null) {
            return null;
        }
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (!(i == 3 || i == 4)) {
                        return null;
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public int hashCode() {
        return (((((this.A04 * 31) + this.A03) * 31) + this.A02) * 31) + AnonymousClass000.A0H(this.A05);
    }

    public AnonymousClass6FQ(C119555q3 r1, int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A05 = r1;
    }

    public final void A03(boolean z) {
        this.A00 = Boolean.valueOf(z);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ConnectionMetadata(sessionId=");
        A0u.append(this.A04);
        A0u.append(", port=");
        A0u.append(this.A03);
        A0u.append(", connectionSequenceState=");
        A0u.append(this.A02);
        A0u.append(", dnsResolverInfo=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }

    public final void A02(Long l) {
        this.A01 = l;
    }
}
