package X;

/* renamed from: X.2bp  reason: invalid class name and case insensitive filesystem */
public class C46882bp extends C46922bt implements AnonymousClass4RU {
    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r8) {
        C64933Qa r2 = r8;
        if (this instanceof C46852bm) {
            C46852bm r3 = (C46852bm) this;
            if (r3 instanceof AnonymousClass2c6) {
                return ((AnonymousClass2c6) r3).A1l(r8);
            }
            return new C46852bm(r3.A01, r2, r3, r3.A0I, true);
        } else if (this instanceof C46872bo) {
            return ((C46872bo) this).A1j(r8);
        } else {
            if (this instanceof C46862bn) {
                C46862bn r32 = (C46862bn) this;
                return new C46862bn(r32.A01, r2, r32, r32.A0I);
            } else if (this instanceof C46842bl) {
                C46842bl r33 = (C46842bl) this;
                return new C46842bl(r33.A01, r2, r33, r33.A0I, true);
            } else {
                return new C46882bp(this.A01, r2, this, this.A0I, true);
            }
        }
    }

    public C46882bp(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }

    public C46882bp(C65013Qj r9, C64933Qa r10, C46882bp r11, long j, boolean z) {
        super(r9, r10, r11, r11.A1I, j, z);
    }

    public C46882bp(C65013Qj r9, C64933Qa r10, C46882bp r11, long j) {
        super(r9, r10, r11, 1, j, false);
    }

    public C46882bp(C64933Qa r2, long j) {
        super(r2, 1, j);
    }
}
