package X;

/* renamed from: X.6f4  reason: invalid class name and case insensitive filesystem */
public final class C136836f4 implements C157527dg {
    public C159877k4 A00;
    public boolean A01;
    public final int A02;
    public final long A03;

    public void cancel() {
        if (!this.A01) {
            this.A01 = true;
            C159877k4 r0 = this.A00;
            if (r0 != null) {
                r0.dispose();
            }
            this.A00 = null;
        }
    }

    public C136836f4(int i, long j) {
        this.A02 = i;
        this.A03 = j;
    }
}
