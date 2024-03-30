package X;

import android.text.TextUtils;

public class ABT implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        if (r8 instanceof AnonymousClass2bX) {
            AnonymousClass2bX r82 = (AnonymousClass2bX) r8;
            String str = r82.A00;
            String A1X = r82.A1X();
            AnonymousClass8NL r3 = r7.A00;
            C172938Pt r0 = ((AnonymousClass8SX) r3.A00).contactMessage_;
            if (r0 == null) {
                r0 = C172938Pt.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            if (!TextUtils.isEmpty(str)) {
                C172938Pt r1 = (C172938Pt) C90524aI.A0H(A0q);
                int i = C172938Pt.CONTEXT_INFO_FIELD_NUMBER;
                str.getClass();
                r1.bitField0_ |= 1;
                r1.displayName_ = str;
            }
            if (!TextUtils.isEmpty(A1X)) {
                C172938Pt r12 = (C172938Pt) C90524aI.A0H(A0q);
                int i2 = C172938Pt.CONTEXT_INFO_FIELD_NUMBER;
                A1X.getClass();
                r12.bitField0_ |= 2;
                r12.vcard_ = A1X;
            }
            C80103un r2 = r7.A02;
            byte[] bArr = r7.A0B;
            if (C202029kv.A02(r2, r82, bArr)) {
                AnonymousClass8SG A002 = C196159Xy.A00(this.A00, r7, r2, r82, bArr);
                C172938Pt r13 = (C172938Pt) C90524aI.A0H(A0q);
                int i3 = C172938Pt.CONTEXT_INFO_FIELD_NUMBER;
                A002.getClass();
                r13.contextInfo_ = A002;
                r13.bitField0_ |= 4;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r3);
            C172938Pt r02 = (C172938Pt) A0q.A0R();
            r02.getClass();
            A0E.contactMessage_ = r02;
            A0E.bitField0_ |= 8;
            return;
        }
        throw AnonymousClass001.A08("FMessageContactSerializer/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r1 = r6.A0A;
        if ((r1.bitField0_ & 8) == 0) {
            return null;
        }
        C64933Qa r0 = r6.A0C;
        long j = r6.A04;
        C172938Pt r2 = r1.contactMessage_;
        if (r2 == null) {
            r2 = C172938Pt.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r2);
        AnonymousClass2bX r12 = new AnonymousClass2bX(r0, j);
        if ((r2.bitField0_ & 2) != 0) {
            r12.A1Y(r2.vcard_);
        }
        if ((r2.bitField0_ & 1) != 0) {
            r12.A00 = r2.displayName_;
        }
        return r12;
    }

    public ABT(C202029kv r1) {
        this.A00 = r1;
    }
}
