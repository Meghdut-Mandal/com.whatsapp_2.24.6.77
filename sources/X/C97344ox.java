package X;

/* renamed from: X.4ox  reason: invalid class name and case insensitive filesystem */
public final class C97344ox extends C109385Xj {
    public final AnonymousClass6X2 A00;

    public static C97344ox A00() {
        return new C97344ox();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C97344ox) obj).A00);
    }

    public int hashCode() {
        return -1876823561 + this.A00.hashCode();
    }

    public C97344ox(AnonymousClass6X2 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success {mOutputData=");
        return C90464aC.A0X(this.A00, A0u);
    }

    public C97344ox() {
        this(AnonymousClass6X2.A01);
    }
}
