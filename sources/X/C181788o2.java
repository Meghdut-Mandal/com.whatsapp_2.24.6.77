package X;

/* renamed from: X.8o2  reason: invalid class name and case insensitive filesystem */
public class C181788o2 extends C47002cZ implements AnonymousClass4RU {
    public /* bridge */ /* synthetic */ AnonymousClass2bU A1Z(C65013Qj r9, C64933Qa r10, long j, boolean z) {
        C181788o2 r1;
        C65013Qj r2 = r9;
        C64933Qa r3 = r10;
        long j2 = j;
        if (this instanceof C180928me) {
            C18740tg.A06(r9);
            r1 = new C181788o2(this.A01, r3, this, j2);
        } else {
            C18740tg.A06(r9);
            r1 = new C181788o2(r2, r3, this, j2, false);
        }
        if (!z) {
            r1.A02 = null;
        }
        return r1;
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r8) {
        C64933Qa r2 = r8;
        if (this instanceof C180928me) {
            C180928me r3 = (C180928me) this;
            return new C180928me(r3.A01, r2, r3, r3.A0I);
        }
        return new C181788o2(this.A01, r2, this, this.A0I, true);
    }

    public C181788o2(C64933Qa r2, long j) {
        super(r2, 13, j);
    }

    public C181788o2(C65013Qj r9, C64933Qa r10, C181788o2 r11, long j) {
        super(r9, r10, r11, 13, j, false);
    }

    public C181788o2(C64933Qa r2, int i, long j) {
        super(r2, 29, j);
    }

    public C181788o2(C65013Qj r9, C64933Qa r10, C181788o2 r11, long j, boolean z) {
        super(r9, r10, r11, r11.A1I, j, z);
    }
}
