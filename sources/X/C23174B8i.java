package X;

/* renamed from: X.B8i  reason: case insensitive filesystem */
public class C23174B8i implements AnonymousClass4Q6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23174B8i(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BU2(Object obj) {
        switch (this.A02) {
            case 0:
                C175228a3.A06((C175228a3) this.A00, (AnonymousClass11F) this.A01, (C107265Nh) obj);
                return;
            case 2:
                C175238a4.A08((C175238a4) this.A00, (AnonymousClass11F) this.A01, (C107265Nh) obj);
                return;
            case 4:
                C175328aD r2 = (C175328aD) this.A00;
                AnonymousClass4Q6 r1 = (AnonymousClass4Q6) this.A01;
                C175268a7 r0 = r2.A00;
                if (r0 != null && !r0.A00.A06()) {
                    r1.BU2(obj);
                }
                r2.A00 = null;
                return;
            default:
                AnonymousClass6X4 r12 = (AnonymousClass6X4) this.A00;
                AnonymousClass11F r02 = (AnonymousClass11F) this.A01;
                C107265Nh r4 = (C107265Nh) obj;
                if (r4 != null) {
                    r12.A09(r02, r4);
                    return;
                }
                return;
        }
    }
}
