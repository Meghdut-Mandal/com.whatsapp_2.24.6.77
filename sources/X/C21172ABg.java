package X;

/* renamed from: X.ABg  reason: case insensitive filesystem */
public final class C21172ABg implements C22938Ayo, C22942Ays, C17740rx {
    public final C19730wQ A00;
    public final C20810yC A01;

    public C21172ABg(C19730wQ r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void B24(C196159Xy r6, AnonymousClass3T1 r7) {
        C36321k7.A0w(r7, r6);
        if (r7 instanceof AnonymousClass2c1) {
            AnonymousClass8NL r4 = r6.A00;
            C172428Nu r0 = ((AnonymousClass8SX) r4.A00).placeholderMessage_;
            if (r0 == null) {
                r0 = C172428Nu.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            AnonymousClass90J r2 = AnonymousClass90J.A01;
            C172428Nu r1 = (C172428Nu) C90524aI.A0H(A0q);
            int i = C172428Nu.TYPE_FIELD_NUMBER;
            r1.type_ = r2.value;
            r1.bitField0_ |= 1;
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
            C172428Nu r02 = (C172428Nu) A0q.A0R();
            r02.getClass();
            A0E.placeholderMessage_ = r02;
            A0E.bitField2_ |= 2;
            return;
        }
        throw AnonymousClass001.A08("FMessageMaskLinkedDevicesProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX A002 = AnonymousClass9YL.A00(r6);
        if (AnonymousClass000.A1P(A002.bitField2_ & 2)) {
            C172428Nu r0 = A002.placeholderMessage_;
            if (r0 == null) {
                r0 = C172428Nu.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 1) != 0 && this.A01.A0E(6673) && this.A00.A0L()) {
                return new AnonymousClass2c1(C52102ot.A02, r6.A0C, r6.A04);
            }
        }
        return null;
    }
}
