package X;

/* renamed from: X.63u  reason: invalid class name */
public final class AnonymousClass63u {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public boolean A03 = false;
    public boolean A04 = false;

    public C98504rX A00() {
        long j = this.A00;
        if (j == 0 && this.A01 == 0 && this.A02 == 0) {
            throw AnonymousClass001.A08("Should set at least some max size limit");
        }
        long j2 = this.A01;
        if (j2 == 0) {
            this.A01 = j;
            j2 = j;
        }
        long j3 = this.A02;
        if (j3 == 0) {
            this.A02 = j2;
            j3 = j2;
        }
        return new C98504rX(j, j2, j3, this.A03, this.A04);
    }
}
