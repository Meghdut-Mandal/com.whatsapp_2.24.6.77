package X;

/* renamed from: X.4iI  reason: invalid class name and case insensitive filesystem */
public final class C94484iI extends C125185zS {
    public final long A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94484iI) {
                long j = this.A00;
                long j2 = ((C94484iI) obj).A00;
                long j3 = C133336Xx.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C133336Xx.A01;
        return AnonymousClass000.A08(j);
    }

    public C94484iI(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SolidColor(value=");
        return AnonymousClass000.A0m(C133336Xx.A07(this.A00), A0u);
    }
}
