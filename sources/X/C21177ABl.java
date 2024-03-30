package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ABl  reason: case insensitive filesystem */
public class C21177ABl implements C22938Ayo, C22942Ays, C17740rx {
    public final C195739Vt A00;
    public final C20810yC A01;

    public void B24(C196159Xy r9, AnonymousClass3T1 r10) {
        if (r10 instanceof C46892bq) {
            C46922bt r102 = (C46922bt) r10;
            AnonymousClass8NL r6 = r9.A00;
            C172328Nk r0 = ((AnonymousClass8SX) r6.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r7 = (AnonymousClass8NC) r0.A0q();
            AnonymousClass8NL r5 = (AnonymousClass8NL) C170918Hz.A0P(r7).A0q();
            C195739Vt r1 = this.A00;
            AnonymousClass8SF r02 = ((AnonymousClass8SX) r5.A00).imageMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            AnonymousClass8NJ A012 = r1.A01(r9, (AnonymousClass8NJ) r02.A0q(), r102);
            if (A012 != null) {
                AnonymousClass8SF A09 = AnonymousClass8NN.A09(A012);
                A09.bitField0_ |= 524288;
                A09.viewOnce_ = true;
                r5.A0Z((AnonymousClass8SF) A012.A0R());
                C172328Nk A002 = AnonymousClass8NC.A00(r5, r7);
                AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r6, A002);
                A0F.viewOnceMessageV2_ = A002;
                A0F.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FMessageViewOnceImageProtobuf not support: ");
        throw C165567td.A0O(A0u, r10.A1I);
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
        if ((r2.bitField0_ & 524288) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r3 == null) {
            r3 = AnonymousClass8SF.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r3);
        C46892bq r4 = new C46892bq(r9.A0C, r9.A04);
        this.A00.A02(r3, r4, r9.A01, r9.A03(), r9.A0O);
        return r4;
    }

    public C21177ABl(C20810yC r1, C195739Vt r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
