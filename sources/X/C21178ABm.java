package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ABm  reason: case insensitive filesystem */
public class C21178ABm implements C22938Ayo, C22942Ays, C17740rx {
    public final C196049Xl A00;
    public final C20810yC A01;

    public void B24(C196159Xy r9, AnonymousClass3T1 r10) {
        if (r10 instanceof C47012ca) {
            C46932bu r102 = (C46932bu) r10;
            AnonymousClass8NL r7 = r9.A00;
            C172328Nk r0 = ((AnonymousClass8SX) r7.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r6 = (AnonymousClass8NC) r0.A0q();
            AnonymousClass8NL r5 = (AnonymousClass8NL) C170918Hz.A0P(r6).A0q();
            AnonymousClass8NH A0O = C170918Hz.A0O(r5);
            this.A00.A02(r9, A0O, r102);
            AnonymousClass8SE A0C = AnonymousClass8NN.A0C(A0O);
            A0C.bitField0_ |= C132986Wc.A0F;
            A0C.viewOnce_ = true;
            r5.A0i((AnonymousClass8SE) A0O.A0R());
            C172328Nk A002 = AnonymousClass8NC.A00(r5, r6);
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r7, A002);
            A0F.viewOnceMessageV2_ = A002;
            A0F.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FMessageViewOnceVideoProtobuf not support message: ");
        throw C165567td.A0O(A0u, r10.A1I);
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r1 = r6.A0A;
        if ((r1.bitField0_ & 256) == 0) {
            return null;
        }
        AnonymousClass8SE r2 = r1.videoMessage_;
        AnonymousClass8SE r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        if (r2.gifPlayback_ || (r2.bitField0_ & C132986Wc.A0F) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r4);
        C47012ca r12 = new C47012ca(r6.A0C, r6.A04);
        C196049Xl.A00(r6, r4, r12, this.A00);
        return r12;
    }

    public C21178ABm(C20810yC r1, C196049Xl r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
