package X;

/* renamed from: X.2bR  reason: invalid class name */
public class AnonymousClass2bR extends AnonymousClass3T1 implements AnonymousClass4RU {
    public int A00;
    public long A01;

    public AnonymousClass2bR(C64933Qa r9, AnonymousClass2bR r10, long j) {
        super(r10, r9, j, true);
        this.A00 = r10.A00;
        this.A01 = r10.A01;
    }

    public AnonymousClass3T1 B32(C64933Qa r4) {
        return new AnonymousClass2bR(r4, this, this.A0I);
    }

    public int A1X() {
        return this.A00;
    }

    public long A1Y() {
        return this.A01;
    }

    public AnonymousClass2bR(C64933Qa r2, long j) {
        super(r2, 51, j);
    }
}
