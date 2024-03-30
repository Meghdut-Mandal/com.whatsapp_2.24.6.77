package X;

/* renamed from: X.1AO  reason: invalid class name */
public class AnonymousClass1AO {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final C21010yW A04;

    public void A00(AnonymousClass11F r4, int i) {
        this.A00 = i;
        int i2 = 1;
        if (AnonymousClass143.A0G(r4)) {
            i2 = 2;
        }
        this.A02 = i2;
        AnonymousClass2QC r2 = new AnonymousClass2QC();
        int i3 = this.A01;
        if (i3 > 0) {
            r2.A01 = Integer.valueOf(i3);
        }
        int i4 = this.A00;
        r2.A02 = Integer.valueOf(i4);
        r2.A00 = Integer.valueOf(this.A02);
        if (i4 == 1) {
            r2.A03 = Long.valueOf(this.A03);
        }
        this.A04.Bly(r2);
    }

    public AnonymousClass1AO(C21010yW r1) {
        this.A04 = r1;
    }
}
