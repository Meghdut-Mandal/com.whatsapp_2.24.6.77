package X;

/* renamed from: X.8oO  reason: invalid class name and case insensitive filesystem */
public final class C182008oO extends C21614ASg {
    public int BDg() {
        return 36;
    }

    public void B23(C196159Xy r8, AnonymousClass2cT r9) {
        C170918Hz r0;
        C36321k7.A0w(r8, r9);
        super.B23(r8, r9);
        C207149ud r5 = r9.A00;
        if (r5 != null && r5.A01 != null && r5.A05 == 2) {
            AnonymousClass8NL r3 = r8.A00;
            AnonymousClass8QZ r02 = ((AnonymousClass8SX) r3.A00).interactiveResponseMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8QZ.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            AnonymousClass8QZ r2 = (AnonymousClass8QZ) A0q.A00;
            if (r2.interactiveResponseMessageCase_ == 2) {
                r0 = (C170918Hz) r2.interactiveResponseMessage_;
            } else {
                r0 = AnonymousClass8Q3.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q2 = r0.A0q();
            C206919uD r52 = r5.A01;
            if (r52 != null) {
                String str = r52.A00;
                if (str != null) {
                    AnonymousClass8Q3 r1 = (AnonymousClass8Q3) C90524aI.A0H(A0q2);
                    int i = AnonymousClass8Q3.NAME_FIELD_NUMBER;
                    r1.bitField0_ |= 1;
                    r1.name_ = str;
                }
                String str2 = r52.A01;
                if (str2 != null) {
                    AnonymousClass8Q3 r12 = (AnonymousClass8Q3) C90524aI.A0H(A0q2);
                    int i2 = AnonymousClass8Q3.NAME_FIELD_NUMBER;
                    r12.bitField0_ |= 2;
                    r12.paramsJson_ = str2;
                }
            }
            AnonymousClass8QZ r13 = (AnonymousClass8QZ) C90524aI.A0H(A0q);
            C170918Hz A0R = A0q2.A0R();
            A0R.getClass();
            r13.interactiveResponseMessage_ = A0R;
            r13.interactiveResponseMessageCase_ = 2;
            AnonymousClass8QZ r03 = (AnonymousClass8QZ) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r03);
            A0F.interactiveResponseMessage_ = r03;
            A0F.bitField1_ |= 32;
        }
    }

    public C182008oO(C202029kv r1, C207149ud r2) {
        super(r1, r2);
    }
}
