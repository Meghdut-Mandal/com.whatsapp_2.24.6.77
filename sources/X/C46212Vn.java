package X;

/* renamed from: X.2Vn  reason: invalid class name and case insensitive filesystem */
public final class C46212Vn extends C54492t2 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46212Vn) && this.A00 == ((C46212Vn) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C46212Vn(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProtocolError(error=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
