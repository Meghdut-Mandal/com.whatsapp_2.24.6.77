package X;

import android.text.TextUtils;

public class ABX implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        C18740tg.A0E(r8 instanceof AnonymousClass2cU, C165567td.A0W(r8, "Unexpected message type ", AnonymousClass000.A0u()));
        AnonymousClass2cU r82 = (AnonymousClass2cU) r8;
        AnonymousClass8NL r4 = r7.A00;
        C173258Qz r0 = ((AnonymousClass8SX) r4.A00).buttonsResponseMessage_;
        if (r0 == null) {
            r0 = C173258Qz.DEFAULT_INSTANCE;
        }
        AnonymousClass8NN A0q = r0.A0q();
        String A0b = r82.A0b();
        C173258Qz r1 = (C173258Qz) C90524aI.A0H(A0q);
        int i = C173258Qz.CONTEXT_INFO_FIELD_NUMBER;
        A0b.getClass();
        r1.responseCase_ = 2;
        r1.response_ = A0b;
        AnonymousClass90M r02 = AnonymousClass90M.DISPLAY_TEXT;
        C173258Qz r12 = (C173258Qz) C90524aI.A0H(A0q);
        r12.type_ = r02.value;
        r12.bitField0_ |= 8;
        if (!TextUtils.isEmpty(r82.A00)) {
            String str = r82.A00;
            C173258Qz r13 = (C173258Qz) C90524aI.A0H(A0q);
            str.getClass();
            r13.bitField0_ |= 1;
            r13.selectedButtonId_ = str;
        }
        AnonymousClass8SG A03 = this.A00.A03(r7.A02, r82, r7.A0B, r7.A04);
        C173258Qz r14 = (C173258Qz) C90524aI.A0H(A0q);
        A03.getClass();
        r14.contextInfo_ = A03;
        r14.bitField0_ |= 4;
        AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
        C173258Qz r03 = (C173258Qz) A0q.A0R();
        r03.getClass();
        A0E.buttonsResponseMessage_ = r03;
        A0E.bitField1_ |= 2;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r10) {
        AnonymousClass90M r1;
        String str;
        AnonymousClass8SX r12 = r10.A0A;
        if ((r12.bitField1_ & 2) == 0) {
            return null;
        }
        C173258Qz r0 = r12.buttonsResponseMessage_;
        C173258Qz r3 = r0;
        if (r0 == null) {
            r0 = C173258Qz.DEFAULT_INSTANCE;
        }
        int i = r0.type_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass90M.UNKNOWN;
        } else {
            r1 = AnonymousClass90M.DISPLAY_TEXT;
        }
        if (r1 == AnonymousClass90M.UNKNOWN) {
            return r10.A02(0);
        }
        C64933Qa r4 = r10.A0C;
        long j = r10.A04;
        C173258Qz r2 = r3;
        if (r3 == null) {
            r2 = C173258Qz.DEFAULT_INSTANCE;
        }
        if (r2.responseCase_ == 2) {
            str = (String) r2.response_;
        } else {
            str = "";
        }
        if (r3 == null) {
            r3 = C173258Qz.DEFAULT_INSTANCE;
        }
        return new AnonymousClass2cU(r4, str, r3.selectedButtonId_, j);
    }

    public ABX(C202029kv r1) {
        this.A00 = r1;
    }
}
