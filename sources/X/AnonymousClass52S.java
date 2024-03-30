package X;

/* renamed from: X.52S  reason: invalid class name */
public final class AnonymousClass52S extends C110285aQ {
    public final C1511278i A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass52S) {
                AnonymousClass52S r5 = (AnonymousClass52S) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass52S(C1511278i r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Disabled(error=");
        A0u.append(this.A00);
        A0u.append(", shouldSkipErrorHandling=");
        A0u.append(this.A02);
        A0u.append(", shouldClearLoadingState=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public AnonymousClass52S() {
        this((C1511278i) null, false, false);
    }
}
