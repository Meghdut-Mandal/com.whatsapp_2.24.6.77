package X;

/* renamed from: X.ABe  reason: case insensitive filesystem */
public class C21170ABe implements C22938Ayo, C22942Ays, C17740rx {
    public final AnonymousClass1DU A00;

    public void B24(C196159Xy r3, AnonymousClass3T1 r4) {
        if (!(r4 instanceof AnonymousClass2cX)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FMessageViewOnceTextProtobuf not support message:");
            throw C165567td.A0O(A0u, r4.A1I);
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r1 = r6.A0A;
        if ((r1.bitField0_ & 32) == 0) {
            return null;
        }
        AnonymousClass8SD r2 = r1.extendedTextMessage_;
        AnonymousClass8SD r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass8SD.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 8388608) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass8SD.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r4);
        AnonymousClass2cX r12 = new AnonymousClass2cX(r6.A0C, r6.A04);
        AC0.A01(this.A00, r4, r12);
        r12.A03 = r6.A0F;
        return r12;
    }

    public C21170ABe(AnonymousClass1DU r1) {
        this.A00 = r1;
    }
}
