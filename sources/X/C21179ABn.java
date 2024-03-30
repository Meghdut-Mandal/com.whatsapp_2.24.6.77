package X;

/* renamed from: X.ABn  reason: case insensitive filesystem */
public class C21179ABn implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;
    public final C195739Vt A01;
    public final ABE A02;

    public void B24(C196159Xy r5, AnonymousClass3T1 r6) {
        C165567td.A1B(r6, "FMessageImageProtobuf: message type is not supported ", AnonymousClass000.A0u(), r6 instanceof C46882bp);
        C46922bt r62 = (C46922bt) r6;
        if (r62.A1T(C132986Wc.A0F)) {
            this.A02.A00(new C23149B7j(this, 3), r5, r62);
            return;
        }
        C195739Vt r1 = this.A01;
        AnonymousClass8NL r3 = r5.A00;
        AnonymousClass8SF r0 = ((AnonymousClass8SX) r3.A00).imageMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SF.DEFAULT_INSTANCE;
        }
        AnonymousClass8NJ A012 = r1.A01(r5, (AnonymousClass8NJ) r0.A0q(), r62);
        if (A012 == null) {
            return;
        }
        if (!r62.A1R(8) || C61583Cq.A00(r62) == null) {
            r3.A0Z((AnonymousClass8SF) A012.A0R());
            return;
        }
        C173308Re r02 = ((AnonymousClass8SX) r3.A00).buttonsMessage_;
        if (r02 == null) {
            r02 = C173308Re.DEFAULT_INSTANCE;
        }
        AnonymousClass8N3 r2 = (AnonymousClass8N3) r02.A0q();
        C170918Hz A0R = A012.A0R();
        C173308Re A06 = AnonymousClass8NN.A06(r2);
        A0R.getClass();
        A06.header_ = A0R;
        A06.headerCase_ = 3;
        r2.A0U(AnonymousClass91C.IMAGE);
        C202359le.A03(r2, C61583Cq.A00(r62));
        r3.A0W((C173308Re) r2.A0R());
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass8SX r1 = r9.A0A;
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        AnonymousClass8SF r2 = r1.imageMessage_;
        AnonymousClass8SF r3 = r2;
        if (r2 == null) {
            r2 = AnonymousClass8SF.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 524288) != 0 && r2.viewOnce_) {
            return null;
        }
        if (r3 == null) {
            r3 = AnonymousClass8SF.DEFAULT_INSTANCE;
        }
        C46882bp r4 = new C46882bp(r9.A0C, r9.A04);
        this.A01.A02(r3, r4, r9.A01, r9.A03(), r9.A0O);
        return r4;
    }

    public C21179ABn(ABE abe, C202029kv r2, C195739Vt r3) {
        this.A02 = abe;
        this.A00 = r2;
        this.A01 = r3;
    }
}
