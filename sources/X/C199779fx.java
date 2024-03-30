package X;

/* renamed from: X.9fx  reason: invalid class name and case insensitive filesystem */
public final class C199779fx {
    public final C128826Dt A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199779fx) {
                C199779fx r5 = (C199779fx) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C199779fx(C128826Dt r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UIModel(appliedPromotion=");
        A0u.append(this.A00);
        A0u.append(", hasPromotionsFeature=");
        A0u.append(this.A01);
        A0u.append(", isFetchedAtLeastOnce=");
        return C36321k7.A0H(A0u, this.A02);
    }

    public C199779fx() {
        this((C128826Dt) null, false, false);
    }
}
