package X;

/* renamed from: X.3Pp  reason: invalid class name and case insensitive filesystem */
public final class C64833Pp {
    public boolean A00;
    public boolean A01;

    public C64833Pp(boolean z, boolean z2) {
        this.A00 = false;
        this.A01 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64833Pp) {
                C64833Pp r5 = (C64833Pp) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A00 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WaLinkConfiguration(isEu=");
        A0u.append(this.A00);
        A0u.append(", isUk=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public C64833Pp() {
        this(false, false);
    }
}
