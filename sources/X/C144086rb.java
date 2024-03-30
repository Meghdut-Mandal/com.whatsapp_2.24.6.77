package X;

/* renamed from: X.6rb  reason: invalid class name and case insensitive filesystem */
public final class C144086rb implements C16250or {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C144086rb) {
                C144086rb r5 = (C144086rb) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C144086rb(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Visible(selected=");
        A0u.append(this.A01);
        A0u.append(", enabled=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public C144086rb() {
        this(false, true);
    }
}
