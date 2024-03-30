package X;

/* renamed from: X.8UF  reason: invalid class name */
public class AnonymousClass8UF extends C21186ABu {
    public final C19730wQ A00;
    public final C20810yC A01;

    public void B24(C196159Xy r10, AnonymousClass3T1 r11) {
        AnonymousClass11F r1;
        AnonymousClass916 r0;
        if (r11 instanceof C46752bc) {
            C46752bc r112 = (C46752bc) r11;
            C64933Qa A1Z = r112.A1Z();
            C195759Vv r02 = r112.A04;
            if (r02 == null) {
                r1 = null;
            } else {
                r1 = r02.A00;
            }
            int i = r112.A01;
            long j = r112.A02;
            AnonymousClass8NL r4 = r10.A00;
            AnonymousClass8Q4 r03 = ((AnonymousClass8SX) r4.A00).keepInChatMessage_;
            if (r03 == null) {
                r03 = AnonymousClass8Q4.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r03.A0q();
            AnonymousClass8SW r04 = ((AnonymousClass8Q4) A0q.A00).key_;
            if (r04 == null) {
                r04 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r04);
            C18740tg.A06(A1Z);
            C183338qd.A02(r1, A0Q, A1Z, false);
            AnonymousClass8Q4 r12 = (AnonymousClass8Q4) C90524aI.A0H(A0q);
            r12.key_ = AnonymousClass8NN.A0G(A0Q);
            r12.bitField0_ |= 1;
            if (i == 1) {
                r0 = AnonymousClass916.KEEP_FOR_ALL;
            } else {
                r0 = AnonymousClass916.UNDO_KEEP_FOR_ALL;
            }
            AnonymousClass8Q4 r13 = (AnonymousClass8Q4) C90524aI.A0H(A0q);
            r13.keepType_ = r0.value;
            r13.bitField0_ |= 2;
            AnonymousClass8Q4 r14 = (AnonymousClass8Q4) C90524aI.A0H(A0q);
            r14.bitField0_ |= 4;
            r14.timestampMs_ = j;
            AnonymousClass8Q4 r05 = (AnonymousClass8Q4) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r4, r05);
            A0F.keepInChatMessage_ = r05;
            A0F.bitField1_ |= 256;
            return;
        }
        throw AnonymousClass001.A08("FMessageKeepInChatProtobuf/not supported message");
    }

    public AnonymousClass8UF(C19730wQ r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
