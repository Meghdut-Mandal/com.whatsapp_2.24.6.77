package X;

import android.text.TextUtils;

/* renamed from: X.ABv  reason: case insensitive filesystem */
public class C21187ABv implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;
    public final C195329Tv A01;
    public final ABE A02;

    public static AnonymousClass8NI A00(C196159Xy r4, C21187ABv aBv, C46972by r6) {
        C195329Tv r1 = aBv.A01;
        C196159Xy r3 = r4;
        AnonymousClass8SC r0 = ((AnonymousClass8SX) r4.A00.A00).documentMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SC.DEFAULT_INSTANCE;
        }
        AnonymousClass8NI r42 = (AnonymousClass8NI) r0.A0q();
        r1.A00(r6.A01, r3, r42, r6.A0V(), r6);
        return r42;
    }

    public void B24(C196159Xy r6, AnonymousClass3T1 r7) {
        C165567td.A1B(r7, "FMessageDocumentProtobuf: message type is not supported ", AnonymousClass000.A0u(), r7 instanceof C46972by);
        C46972by r72 = (C46972by) r7;
        if (r72.A1T(C132986Wc.A0F)) {
            this.A02.A00(new C23149B7j(this, 1), r6, r72);
            return;
        }
        C65013Qj r1 = r72.A01;
        if (r1 == null || (!r6.A02() && r1.A0a == null)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165577te.A1F(r72, "FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=", A0u);
            C165567td.A1A(r72, "; media_wa_type=", A0u);
            return;
        }
        AnonymousClass8NI A002 = A00(r6, this, r72);
        if (C202359le.A04(r72)) {
            AnonymousClass8NL r3 = r6.A00;
            C173308Re r0 = ((AnonymousClass8SX) r3.A00).buttonsMessage_;
            if (r0 == null) {
                r0 = C173308Re.DEFAULT_INSTANCE;
            }
            AnonymousClass8N3 r2 = (AnonymousClass8N3) r0.A0q();
            C170918Hz.A0F(A002, r2, r72).headerCase_ = 2;
            r2.A0U(AnonymousClass91C.DOCUMENT);
            r3.A0W((C173308Re) r2.A0R());
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(r72.A01);
        AnonymousClass8NL r4 = r6.A00;
        if (!isEmpty) {
            C172328Nk r02 = ((AnonymousClass8SX) r4.A00).documentWithCaptionMessage_;
            if (r02 == null) {
                r02 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r32 = (AnonymousClass8NC) r02.A0q();
            AnonymousClass8NN A0q = C170918Hz.A0P(r32).A0q();
            AnonymousClass8SC r03 = (AnonymousClass8SC) A002.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(A0q, r03);
            A0F.documentMessage_ = r03;
            A0F.bitField0_ |= 64;
            C172328Nk A003 = AnonymousClass8NC.A00(A0q, r32);
            AnonymousClass8SX A0F2 = AnonymousClass8NN.A0F(r4, A003);
            A0F2.documentWithCaptionMessage_ = A003;
            A0F2.bitField1_ |= 512;
            return;
        }
        r4.A0X(A002);
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass8SX r1 = r9.A0A;
        if ((r1.bitField0_ & 64) != 0) {
            if ("medianotify".equals(r9.A0J)) {
                return null;
            }
        } else if ((r1.bitField1_ & 512) == 0) {
            return null;
        } else {
            C172328Nk r0 = r1.documentWithCaptionMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8SX r02 = r0.message_;
            if (r02 == null) {
                r02 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
            r9 = r9.A01(r02);
        }
        AnonymousClass8SC r3 = r9.A0A.documentMessage_;
        if (r3 == null) {
            r3 = AnonymousClass8SC.DEFAULT_INSTANCE;
        }
        C46972by r4 = new C46972by(r9.A0C, r9.A04);
        this.A01.A01(r3, r4, r9.A01, r9.A03(), r9.A0O);
        return r4;
    }

    public C21187ABv(ABE abe, C202029kv r2, C195329Tv r3) {
        this.A02 = abe;
        this.A00 = r2;
        this.A01 = r3;
    }
}
