package X;

/* renamed from: X.52v  reason: invalid class name and case insensitive filesystem */
public final class C1029852v extends C1275168p {
    public final boolean A00;

    public C1029852v(boolean z) {
        super(6);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1029852v) && this.A00 == ((C1029852v) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NotConnectedHeaderViewState(shouldShowRingAllButton=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
