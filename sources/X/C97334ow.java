package X;

/* renamed from: X.4ow  reason: invalid class name and case insensitive filesystem */
public final class C97334ow extends C109385Xj {
    public final AnonymousClass6X2 A00 = AnonymousClass6X2.A01;

    public static C97334ow A00() {
        return new C97334ow();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C97334ow) obj).A00);
    }

    public int hashCode() {
        return 846803280 + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure {mOutputData=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
