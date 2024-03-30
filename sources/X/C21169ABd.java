package X;

/* renamed from: X.ABd  reason: case insensitive filesystem */
public class C21169ABd implements C22938Ayo, C22942Ays, C17740rx {
    public final C198709e4 A00;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        if (r9 instanceof C46802bh) {
            C46942bv r1 = (C46942bv) r9;
            AnonymousClass8NL r6 = r8.A00;
            C172328Nk r0 = ((AnonymousClass8SX) r6.A00).viewOnceMessageV2Extension_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r5 = (AnonymousClass8NC) r0.A0q();
            AnonymousClass8NL r4 = (AnonymousClass8NL) C170918Hz.A0P(r5).A0q();
            AnonymousClass8N2 A01 = this.A00.A01(r8, r1);
            if (A01 == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165577te.A1F(r9, "FMessageViewOnceAudio/unable to send encrypted media message due to missing mediaKey; key=", A0u);
                C165567td.A1A(r9, "; media_wa_type=", A0u);
                return;
            }
            AnonymousClass8S5 A05 = AnonymousClass8NN.A05(A01);
            A05.bitField0_ |= 16384;
            A05.viewOnce_ = true;
            r4.A0V(A01);
            C172328Nk A002 = AnonymousClass8NC.A00(r4, r5);
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r6, A002);
            A0F.viewOnceMessageV2Extension_ = A002;
            A0F.bitField1_ |= 16384;
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("FMessageViewOnceAudioProtobuf not support: ");
        throw C165567td.A0O(A0u2, r9.A1I);
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        AnonymousClass8SX r1 = r7.A0A;
        if ((r1.bitField0_ & 128) == 0) {
            return null;
        }
        AnonymousClass8S5 r12 = r1.audioMessage_;
        AnonymousClass8S5 r5 = r12;
        if (r12 == null) {
            r12 = AnonymousClass8S5.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 16384) == 0 || !r12.viewOnce_) {
            return null;
        }
        if (r5 == null) {
            r5 = AnonymousClass8S5.DEFAULT_INSTANCE;
        }
        C64933Qa r4 = r7.A0C;
        C46802bh r13 = new C46802bh(r4, r7.A04);
        C198709e4.A00(r5, r4, r13, r7.A03());
        return r13;
    }

    public C21169ABd(C198709e4 r1) {
        this.A00 = r1;
    }
}
