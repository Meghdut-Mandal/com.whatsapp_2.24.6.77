package X;

/* renamed from: X.2al  reason: invalid class name and case insensitive filesystem */
public final class C46682al extends C55092u3 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46682al) && this.A00 == ((C46682al) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C46682al(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HeaderDataItem(title=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
