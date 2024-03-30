package X;

/* renamed from: X.9QQ  reason: invalid class name */
public class AnonymousClass9QQ {
    public final long A00;
    public final long A01;

    public AnonymousClass9QQ(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append("/");
        return C36411kG.A11(A0u, this.A00);
    }
}
