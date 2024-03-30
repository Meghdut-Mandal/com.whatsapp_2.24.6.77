package X;

/* renamed from: X.9fu  reason: invalid class name and case insensitive filesystem */
public final class C199759fu {
    public static final C199759fu A02 = new C199759fu(0, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199759fu r7 = (C199759fu) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C199759fu(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[timeUs=");
        A0u.append(this.A01);
        A0u.append(", position=");
        A0u.append(this.A00);
        return C90474aD.A0g(A0u);
    }
}
