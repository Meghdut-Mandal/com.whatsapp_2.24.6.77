package X;

import android.text.TextUtils;

/* renamed from: X.ABb  reason: case insensitive filesystem */
public class C21167ABb implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        C165567td.A1B(r8, "FMessageQuickReplyForTemplateProtobuf: message type is not supported ", AnonymousClass000.A0u(), r8 instanceof AnonymousClass2cV);
        AnonymousClass2cV r82 = (AnonymousClass2cV) r8;
        AnonymousClass8NL r4 = r7.A00;
        AnonymousClass8RH r0 = ((AnonymousClass8SX) r4.A00).templateButtonReplyMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8RH.DEFAULT_INSTANCE;
        }
        AnonymousClass8NN A0q = r0.A0q();
        String A0b = r82.A0b();
        AnonymousClass8RH r1 = (AnonymousClass8RH) C90524aI.A0H(A0q);
        int i = AnonymousClass8RH.CONTEXT_INFO_FIELD_NUMBER;
        A0b.getClass();
        r1.bitField0_ |= 2;
        r1.selectedDisplayText_ = A0b;
        if (!TextUtils.isEmpty(r82.A02)) {
            String str = r82.A02;
            AnonymousClass8RH r12 = (AnonymousClass8RH) C90524aI.A0H(A0q);
            str.getClass();
            r12.bitField0_ |= 1;
            r12.selectedId_ = str;
        }
        int i2 = r82.A00;
        AnonymousClass8RH r13 = (AnonymousClass8RH) C90524aI.A0H(A0q);
        r13.bitField0_ |= 8;
        r13.selectedIndex_ = i2;
        Integer num = r82.A01;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass8RH r14 = (AnonymousClass8RH) C90524aI.A0H(A0q);
            r14.bitField0_ |= 16;
            r14.selectedCarouselCardIndex_ = intValue;
        }
        AnonymousClass8SG A03 = this.A00.A03(r7.A02, r82, r7.A0B, r7.A04);
        AnonymousClass8RH r15 = (AnonymousClass8RH) C90524aI.A0H(A0q);
        A03.getClass();
        r15.contextInfo_ = A03;
        r15.bitField0_ |= 4;
        AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
        AnonymousClass8RH r02 = (AnonymousClass8RH) A0q.A0R();
        r02.getClass();
        A0E.templateButtonReplyMessage_ = r02;
        A0E.bitField0_ |= 8388608;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r2 = r6.A0A;
        if ((r2.bitField0_ & 8388608) == 0) {
            return null;
        }
        AnonymousClass8RH r4 = r2.templateButtonReplyMessage_;
        if (r4 == null) {
            r4 = AnonymousClass8RH.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r4);
        AnonymousClass2cV r1 = new AnonymousClass2cV(r6.A0C, r6.A04);
        r1.A16(r4.selectedDisplayText_);
        r1.A02 = r4.selectedId_;
        r1.A00 = r4.selectedIndex_;
        if ((r4.bitField0_ & 16) != 0) {
            r1.A01 = Integer.valueOf(r4.selectedCarouselCardIndex_);
        }
        return r1;
    }

    public C21167ABb(C202029kv r1) {
        this.A00 = r1;
    }
}
