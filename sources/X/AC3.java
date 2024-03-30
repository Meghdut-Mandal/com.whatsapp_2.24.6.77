package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

@Deprecated
public class AC3 implements C22938Ayo, C22942Ays, C22994Azk, C17740rx {
    public final C19730wQ A00;
    public final C20810yC A01;

    public void B24(C196159Xy r6, AnonymousClass3T1 r7) {
        AnonymousClass90Q r0;
        if (r7 instanceof AnonymousClass5JA) {
            AnonymousClass5JA r72 = (AnonymousClass5JA) r7;
            AnonymousClass8NL r3 = r6.A00;
            AnonymousClass8PD r02 = ((AnonymousClass8SX) r3.A00).scheduledCallEditMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8PD.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            AnonymousClass8SW r03 = ((AnonymousClass8PD) A0q.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r03);
            C64933Qa r1 = r72.A1J;
            AnonymousClass8NG.A01(r1.A00, A0Q, r1);
            String str = r72.A02;
            if (str != null) {
                A0Q.A0V(str);
            }
            C165607th.A1C(r72.A01, A0Q);
            AnonymousClass8PD r12 = (AnonymousClass8PD) C90524aI.A0H(A0q);
            r12.key_ = AnonymousClass8NN.A0G(A0Q);
            r12.bitField0_ |= 1;
            int i = r72.A00;
            if (i == 0) {
                r0 = AnonymousClass90Q.UNKNOWN;
            } else if (i == 1) {
                r0 = AnonymousClass90Q.CANCEL;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unexpected type (");
                A0u.append(i);
                throw AnonymousClass000.A0c(")", A0u);
            }
            AnonymousClass8PD r13 = (AnonymousClass8PD) C90524aI.A0H(A0q);
            r13.editType_ = r0.value;
            r13.bitField0_ |= 2;
            AnonymousClass8PD r04 = (AnonymousClass8PD) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r04);
            A0F.scheduledCallEditMessage_ = r04;
            A0F.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass001.A08("FMessageScheduledCallEditLegacyProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass90Q r0;
        AnonymousClass8SX r3 = r9.A0A;
        AnonymousClass5JA r2 = null;
        if (AnonymousClass000.A1P(r3.bitField1_ & 1048576) && !this.A01.A0E(4164)) {
            C64933Qa r7 = r9.A0C;
            AnonymousClass8PD r4 = r3.scheduledCallEditMessage_;
            if (r4 == null) {
                r4 = AnonymousClass8PD.DEFAULT_INSTANCE;
            }
            C18740tg.A06(r4);
            boolean A1W = C165577te.A1W(r4.bitField0_);
            Integer A0U = C36421kH.A0U();
            if (A1W) {
                AnonymousClass8SW r6 = r4.key_;
                if (r6 == null) {
                    r6 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                UserJid A0l = C36431kI.A0l(r6.participant_);
                if (r9.A01 == 8) {
                    C18740tg.A0D(AnonymousClass000.A1V(A0l), "originalMessageKey.getParticipant() can't be null in admin revoke");
                    r7 = C165617ti.A0R(r7.A00, r7.A01, this.A00.A0M(A0l));
                }
                r2 = new AnonymousClass5JA(r7, r9.A04);
                r2.A02 = r6.id_;
                r2.A01 = A0l;
                if ((r4.bitField0_ & 2) != 0) {
                    int i = r4.editType_;
                    if (i == 0 || i != 1) {
                        r0 = AnonymousClass90Q.UNKNOWN;
                    } else {
                        r0 = AnonymousClass90Q.CANCEL;
                    }
                    int ordinal = r0.ordinal();
                    int i2 = 0;
                    if (ordinal != 0) {
                        i2 = 1;
                    }
                    r2.A00 = i2;
                } else {
                    throw C165617ti.A0S(A0U, "scheduled_call_edit_missing_edit_type");
                }
            } else {
                throw C165617ti.A0S(A0U, "scheduled_call_edit_missing_creation_message_key");
            }
        }
        return r2;
    }

    public AC3(C19730wQ r1, C20810yC r2) {
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
