package X;

/* renamed from: X.9VC  reason: invalid class name */
public final class AnonymousClass9VC {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9VC) && this.A00 == ((AnonymousClass9VC) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass9VC(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BizBotMetadata(automatedType=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
