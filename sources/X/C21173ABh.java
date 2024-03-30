package X;

/* renamed from: X.ABh  reason: case insensitive filesystem */
public class C21173ABh implements C22938Ayo, C22942Ays, C17740rx {
    public final C196049Xl A00;
    public final C20810yC A01;

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof AnonymousClass2cY, AnonymousClass000.A0l(r5, "FMessagePushToVideoProtobuf: message type is not supported ", AnonymousClass000.A0u()));
        AnonymousClass8NL r2 = r4.A00;
        AnonymousClass8NH A0O = C170918Hz.A0O(r2);
        this.A00.A02(r4, A0O, (C46932bu) r5);
        AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
        AnonymousClass8SE r1 = (AnonymousClass8SE) A0O.A0R();
        int i = AnonymousClass8SX.AUDIO_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0E.ptvMessage_ = r1;
        A0E.bitField1_ |= 2097152;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r2 = r6.A0A;
        if ((r2.bitField1_ & 2097152) == 0) {
            return null;
        }
        if (!this.A01.A0E(3355)) {
            return r6.A02(0);
        }
        AnonymousClass8SE r4 = r2.ptvMessage_;
        if (r4 == null) {
            r4 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        AnonymousClass2cY r1 = new AnonymousClass2cY(r6.A0C, r6.A04);
        C196049Xl.A00(r6, r4, r1, this.A00);
        return r1;
    }

    public C21173ABh(C20810yC r1, C196049Xl r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
