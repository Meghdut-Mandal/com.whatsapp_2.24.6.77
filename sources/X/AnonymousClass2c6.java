package X;

/* renamed from: X.2c6  reason: invalid class name */
public final class AnonymousClass2c6 extends C46852bm implements C23043B1o, AnonymousClass4RU, AnonymousClass4TW {
    public C207219uk A00;
    public AnonymousClass2bZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2c6(C64933Qa r2, C207219uk r3, long j) {
        super(r2, 97, j);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r3;
    }

    public AnonymousClass2c6 A1l(C64933Qa r8) {
        AnonymousClass00C.A0D(r8, 0);
        long j = this.A0I;
        C65013Qj r1 = this.A01;
        AnonymousClass00C.A0B(r1);
        return new AnonymousClass2c6(r1, r8, this, j, true);
    }

    public AnonymousClass2bZ B9R() {
        return this.A01;
    }

    public C207219uk BA8() {
        return this.A00;
    }

    public void BqQ(AnonymousClass2bZ r1) {
        this.A01 = r1;
    }

    public void BqZ(C207219uk r1) {
        this.A00 = r1;
    }

    public AnonymousClass2c6(C65013Qj r2, C64933Qa r3, AnonymousClass2c6 r4, long j, boolean z) {
        super(r2, r3, r4, j, z);
        this.A00 = r4.A00;
    }
}
