package X;

/* renamed from: X.2bO  reason: invalid class name */
public abstract class AnonymousClass2bO extends AnonymousClass3T1 implements AnonymousClass4RU {
    public long A00;
    public String A01;

    public AnonymousClass2bO(C64933Qa r9, AnonymousClass2bO r10, long j) {
        super(r10, r9, j, true);
        this.A01 = r10.A01;
        this.A00 = r10.A00;
    }

    public AnonymousClass2bO A1X(C64933Qa r5) {
        if (this instanceof AnonymousClass2c7) {
            return new AnonymousClass2c7(r5, this, this.A0I);
        }
        AnonymousClass2c8 r3 = (AnonymousClass2c8) this;
        return new AnonymousClass2c8(r5, r3, r3.A0I);
    }

    public AnonymousClass2bO(C64933Qa r2, int i, int i2, long j) {
        super(r2, i, j);
        this.A01 = i2;
        this.A00 = j;
        A0l(0);
    }
}
