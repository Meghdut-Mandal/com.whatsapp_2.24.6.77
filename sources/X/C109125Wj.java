package X;

import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1;

/* renamed from: X.5Wj  reason: invalid class name and case insensitive filesystem */
public class C109125Wj implements C88234Rx {
    public Object A00;
    public final int A01;

    public C109125Wj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bhl(AnonymousClass11F r9, C135066c4 r10, Integer num, int i) {
        C88234Rx r1;
        AnonymousClass11F r0;
        C135066c4 r5 = r10;
        switch (this.A01) {
            case 0:
                C146806wC r2 = (C146806wC) this.A00;
                C123875xE r4 = (C123875xE) r2.A0Z.get();
                AnonymousClass01I r3 = r2.A0B;
                AnonymousClass01N r12 = r3.A06;
                C165047sn r7 = new C165047sn(r2, r10, 1);
                C36321k7.A0v(r12, 0, r10);
                C36381kD.A1R(r4.A04, new ExpressionsShapeCreator$createStickerShape$1(r3, r4, r5, (C023509x) null, r7), C33321f6.A00(r12));
                return;
            case 1:
                AnonymousClass5H9 r02 = (AnonymousClass5H9) this.A00;
                r1 = r02.A08;
                if (r1 != null) {
                    r0 = r02.A05;
                    break;
                } else {
                    return;
                }
            default:
                AnonymousClass5HA r03 = (AnonymousClass5HA) this.A00;
                r1 = r03.A04;
                if (r1 != null) {
                    r0 = r03.A02;
                    break;
                } else {
                    return;
                }
        }
        r1.Bhl(r0, r10, num, i);
    }
}
