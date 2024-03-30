package X;

/* renamed from: X.6Ee  reason: invalid class name and case insensitive filesystem */
public class C128936Ee {
    public int A00;
    public boolean A01;
    public final int A02;
    public final C24451Cm A03;

    public static C128936Ee A00() {
        return new C128936Ee(3, AnonymousClass6X5.A0L);
    }

    public synchronized Long A01() {
        Long l;
        if (A04()) {
            l = this.A03.A00();
        } else {
            l = null;
        }
        return l;
    }

    public synchronized void A02() {
        this.A01 = true;
    }

    public synchronized boolean A03() {
        return this.A01;
    }

    public synchronized boolean A04() {
        int i;
        i = this.A00;
        this.A00 = i + 1;
        return AnonymousClass000.A1T(i, this.A02);
    }

    public C128936Ee(int i, long j) {
        this.A02 = i;
        this.A03 = new C24451Cm(AnonymousClass136.A00(), (long) i, j);
    }
}
