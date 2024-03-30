package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.ACi  reason: case insensitive filesystem */
public final class C21200ACi implements B6C, B15 {
    public final C30681ab A00;

    public void B22(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        AnonymousClass2bK r72;
        C36331k8.A1I(r7, r6);
        if (!(r7 instanceof AnonymousClass2bK) || (r72 = (AnonymousClass2bK) r7) == null) {
            throw C165567td.A0K(0);
        } else if (r72.A00 != 1000) {
            byte[] A1V = r72.A1V();
            r6.A0X(AnonymousClass91I.A1k);
            if (A1V != null) {
                AnonymousClass8I5 A0O = C90474aD.A0O(r6, A1V);
                AnonymousClass8SU r2 = (AnonymousClass8SU) r6.A00;
                int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
                r2.bitField0_ |= 536870912;
                r2.futureproofData_ = A0O;
            }
            r6.A0Y(String.valueOf(r72.A01));
        } else {
            throw new C25311Fu(69, "SkipFutureBotMessage");
        }
    }

    public Set BCE() {
        return C36411kG.A15(AnonymousClass91I.A1k);
    }

    public AnonymousClass3T1 BlF(C1275768v r5, AnonymousClass8SU r6) {
        AnonymousClass2bK r2 = new AnonymousClass2bK(this.A00.A02(r6), C30681ab.A00(r6));
        if ((r6.bitField0_ & 16) != 0) {
            C165577te.A17(UserJid.Companion, r2, r6.participant_);
        }
        if ((r6.bitField0_ & 536870912) != 0) {
            r2.A1B(r6.futureproofData_.A06());
        }
        if (C170918Hz.A00(r6) > 0) {
            String A0s = C36401kF.A0s(r6.messageStubParameters_, 0);
            AnonymousClass00C.A08(A0s);
            r2.A01 = Integer.parseInt(A0s);
        }
        return r2;
    }

    public C21200ACi(C30681ab r1) {
        this.A00 = r1;
    }

    public C188108z3 BCR() {
        return C188108z3.STUB_MESSAGE;
    }
}
