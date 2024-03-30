package X;

/* renamed from: X.52K  reason: invalid class name */
public final class AnonymousClass52K extends C110275aP {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52K) && this.A00 == ((AnonymousClass52K) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass52K(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenSharing(wasUsingBackCamera=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass52K() {
        this(false);
    }
}
