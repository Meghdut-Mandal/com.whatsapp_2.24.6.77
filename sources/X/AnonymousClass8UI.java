package X;

import java.util.ArrayList;

/* renamed from: X.8UI  reason: invalid class name */
public class AnonymousClass8UI extends C21186ABu implements C22994Azk {
    public final C19730wQ A00;
    public final C20810yC A01;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        AnonymousClass11F r1;
        AnonymousClass90Q r0;
        if (r9 instanceof C46742bb) {
            C46742bb r92 = (C46742bb) r9;
            C64933Qa A1Z = r92.A1Z();
            C195759Vv r02 = r92.A04;
            if (r02 == null) {
                r1 = null;
            } else {
                r1 = r02.A00;
            }
            int i = r92.A00;
            AnonymousClass8NL r3 = r8.A00;
            AnonymousClass8PD r03 = ((AnonymousClass8SX) r3.A00).scheduledCallEditMessage_;
            if (r03 == null) {
                r03 = AnonymousClass8PD.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r03.A0q();
            AnonymousClass8SW r04 = ((AnonymousClass8PD) A0q.A00).key_;
            if (r04 == null) {
                r04 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r04);
            C18740tg.A06(A1Z);
            C183338qd.A02(r1, A0Q, A1Z, false);
            AnonymousClass8PD r12 = (AnonymousClass8PD) C90524aI.A0H(A0q);
            r12.key_ = AnonymousClass8NN.A0G(A0Q);
            r12.bitField0_ |= 1;
            if (i == 1) {
                r0 = AnonymousClass90Q.CANCEL;
            } else {
                r0 = AnonymousClass90Q.UNKNOWN;
            }
            AnonymousClass8PD r13 = (AnonymousClass8PD) C90524aI.A0H(A0q);
            r13.editType_ = r0.value;
            r13.bitField0_ |= 2;
            AnonymousClass8PD r05 = (AnonymousClass8PD) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r05);
            A0F.scheduledCallEditMessage_ = r05;
            A0F.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass001.A08("FMessageScheduledCallEditProtobuf/not supported message");
    }

    public AnonymousClass8UI(C19730wQ r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public ArrayList BHq(AnonymousClass3T1 r5) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36381kD.A1N("scheduled_call_type", "edit", A0k);
        C203399nx.A0E("meta", A0I, A0k);
        return A0I;
    }
}
