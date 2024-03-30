package X;

/* renamed from: X.5Bu  reason: invalid class name and case insensitive filesystem */
public class C104875Bu extends AnonymousClass6Fk {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104875Bu(C25471Gl r3, int i) {
        super(r3, i);
        AnonymousClass00C.A0D(r3, 1);
    }

    public long A0D() {
        long j = this.A08;
        if (j == -1) {
            return 0;
        }
        long j2 = this.A01;
        if (j2 == -1) {
            return A04();
        }
        return j2 - j;
    }
}
