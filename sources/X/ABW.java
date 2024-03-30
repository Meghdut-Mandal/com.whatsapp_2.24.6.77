package X;

public class ABW implements C22938Ayo, C22942Ays, C17740rx {
    public final C198709e4 A00;

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C165567td.A1B(r5, "FMessageAudioProtobuf: message type is not supported ", AnonymousClass000.A0u(), r5 instanceof C46812bi);
        C46942bv r52 = (C46942bv) r5;
        AnonymousClass8N2 A01 = this.A00.A01(r4, r52);
        if (A01 != null) {
            r4.A00.A0V(A01);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C165577te.A1F(r52, "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key=", A0u);
        C165567td.A1A(r52, "; media_wa_type=", A0u);
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r1 = r6.A0A;
        if ((r1.bitField0_ & 128) == 0) {
            return null;
        }
        AnonymousClass8S5 r12 = r1.audioMessage_;
        AnonymousClass8S5 r4 = r12;
        if (r12 == null) {
            r12 = AnonymousClass8S5.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 16384) != 0 && r12.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass8S5.DEFAULT_INSTANCE;
        }
        C64933Qa r2 = r6.A0C;
        C46812bi r3 = new C46812bi(r2, r6.A04);
        C198709e4.A00(r4, r2, r3, r6.A03());
        return r3;
    }

    public ABW(C198709e4 r1) {
        this.A00 = r1;
    }
}
