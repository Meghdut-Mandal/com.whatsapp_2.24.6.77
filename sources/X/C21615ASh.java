package X;

/* renamed from: X.ASh  reason: case insensitive filesystem */
public final class C21615ASh implements C23044B1p {
    public final C202029kv A00;

    public int BDg() {
        return 26;
    }

    public C21615ASh(C202029kv r1) {
        this.A00 = r1;
    }

    public void B23(C196159Xy r7, AnonymousClass2cT r8) {
        boolean A1a = C36331k8.A1a(r7, r8);
        C207149ud r2 = r8.A00;
        if (r2 != null && r2.A05 == A1a) {
            AnonymousClass8NL r3 = r7.A00;
            AnonymousClass8RD r0 = ((AnonymousClass8SX) r3.A00).listResponseMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8RD.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            String str = r2.A04;
            AnonymousClass8RD r1 = (AnonymousClass8RD) C90524aI.A0H(A0q);
            int i = AnonymousClass8RD.CONTEXT_INFO_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.title_ = str;
            String str2 = r2.A02;
            if (!(str2 == null || str2.length() == 0)) {
                AnonymousClass8RD r12 = (AnonymousClass8RD) C90524aI.A0H(A0q);
                r12.bitField0_ |= 16;
                r12.description_ = str2;
            }
            AnonymousClass90P r02 = AnonymousClass90P.SINGLE_SELECT;
            AnonymousClass8RD r13 = (AnonymousClass8RD) C90524aI.A0H(A0q);
            r13.listType_ = r02.value;
            r13.bitField0_ |= 2;
            C172388Nq r03 = r13.singleSelectReply_;
            if (r03 == null) {
                r03 = C172388Nq.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q2 = r03.A0q();
            String str3 = r2.A03;
            if (str3 != null) {
                C172388Nq r14 = (C172388Nq) C90524aI.A0H(A0q2);
                int i2 = C172388Nq.SELECTED_ROW_ID_FIELD_NUMBER;
                r14.bitField0_ |= 1;
                r14.selectedRowId_ = str3;
            }
            C172388Nq r04 = (C172388Nq) A0q2.A0R();
            AnonymousClass8RD r15 = (AnonymousClass8RD) C90524aI.A0H(A0q);
            r04.getClass();
            r15.singleSelectReply_ = r04;
            r15.bitField0_ |= 4;
            C80103un r22 = r7.A02;
            byte[] bArr = r7.A0B;
            if (C202029kv.A02(r22, r8, bArr)) {
                AnonymousClass8SG A002 = C196159Xy.A00(this.A00, r7, r22, r8, bArr);
                AnonymousClass8RD r16 = (AnonymousClass8RD) C90524aI.A0H(A0q);
                A002.getClass();
                r16.contextInfo_ = A002;
                r16.bitField0_ |= 8;
            }
            AnonymousClass8RD r05 = (AnonymousClass8RD) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r05);
            A0F.listResponseMessage_ = r05;
            A0F.bitField0_ |= 1073741824;
        }
    }
}
