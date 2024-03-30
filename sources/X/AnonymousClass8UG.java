package X;

/* renamed from: X.8UG  reason: invalid class name */
public final class AnonymousClass8UG extends C21186ABu {
    public final C19730wQ A00;
    public final C20810yC A01;

    public AnonymousClass8UG(C19730wQ r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        AnonymousClass11F r1;
        AnonymousClass90c r0;
        boolean A1a = C36331k8.A1a(r9, r8);
        if (r9 instanceof AnonymousClass5J2) {
            AnonymousClass5J2 r92 = (AnonymousClass5J2) r9;
            AnonymousClass8NL r4 = r8.A00;
            AnonymousClass8Q8 r02 = ((AnonymousClass8SX) r4.A00).pinInChatMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8Q8.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            AnonymousClass8SW r03 = ((AnonymousClass8Q8) A0q.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r03);
            C64933Qa A1Z = r92.A1Z();
            C18740tg.A06(A1Z);
            C195759Vv r04 = r92.A04;
            if (r04 == null) {
                r1 = null;
            } else {
                r1 = r04.A00;
            }
            C183338qd.A02(r1, A0Q, A1Z, false);
            AnonymousClass8Q8 r12 = (AnonymousClass8Q8) C90524aI.A0H(A0q);
            r12.key_ = AnonymousClass8NN.A0G(A0Q);
            r12.bitField0_ |= 1;
            if (r92.A00 == A1a) {
                r0 = AnonymousClass90c.PIN_FOR_ALL;
            } else {
                r0 = AnonymousClass90c.UNPIN_FOR_ALL;
            }
            AnonymousClass8Q8 r13 = (AnonymousClass8Q8) C90524aI.A0H(A0q);
            r13.type_ = r0.value;
            r13.bitField0_ |= 2;
            long j = r92.A01;
            AnonymousClass8Q8 r14 = (AnonymousClass8Q8) C90524aI.A0H(A0q);
            r14.bitField0_ |= 4;
            r14.senderTimestampMs_ = j;
            AnonymousClass8Q8 r05 = (AnonymousClass8Q8) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r4, r05);
            A0F.pinInChatMessage_ = r05;
            A0F.bitField1_ |= 262144;
            return;
        }
        throw C165567td.A0N(r9, "FMessagePinInChatProtobuf not supported message: ", AnonymousClass000.A0u());
    }
}
