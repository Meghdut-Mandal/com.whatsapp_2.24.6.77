package X;

/* renamed from: X.6Bg  reason: invalid class name and case insensitive filesystem */
public final class C128186Bg {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128186Bg) {
                C128186Bg r5 = (C128186Bg) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C128186Bg(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoPlayState(isAutoPlayAllowed=");
        A0u.append(this.A01);
        A0u.append(", isVideoInView=");
        A0u.append(this.A02);
        A0u.append(", isActivityOn=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
