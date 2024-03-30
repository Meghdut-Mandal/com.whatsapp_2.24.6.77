package X;

/* renamed from: X.6r5  reason: invalid class name and case insensitive filesystem */
public final class C143766r5 implements C16210on {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143766r5) && this.A00 == ((C143766r5) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C143766r5(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Mute(isMuted=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
