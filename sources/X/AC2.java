package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

public class AC2 implements C22938Ayo, C22942Ays, C22994Azk, C17740rx {
    public final C20810yC A00;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        if (r9 instanceof AnonymousClass2bR) {
            AnonymousClass2bR r92 = (AnonymousClass2bR) r9;
            AnonymousClass8NL r5 = r8.A00;
            AnonymousClass8PA r0 = ((AnonymousClass8SX) r5.A00).paymentInviteMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8PA.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            AnonymousClass917 A002 = AnonymousClass917.A00(r92.A00);
            AnonymousClass8PA r1 = (AnonymousClass8PA) C90524aI.A0H(A0q);
            int i = AnonymousClass8PA.EXPIRY_TIMESTAMP_FIELD_NUMBER;
            r1.serviceType_ = A002.value;
            r1.bitField0_ |= 1;
            long j = r92.A01;
            if (j > 0) {
                long A0B = C36391kE.A0B(j);
                AnonymousClass8PA r12 = (AnonymousClass8PA) C90524aI.A0H(A0q);
                r12.bitField0_ |= 2;
                r12.expiryTimestamp_ = A0B;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r5);
            AnonymousClass8PA r02 = (AnonymousClass8PA) A0q.A0R();
            r02.getClass();
            A0E.paymentInviteMessage_ = r02;
            A0E.bitField1_ |= 4;
            return;
        }
        throw AnonymousClass001.A08("FMessagePaymentInviteProtobuf/not supported message");
    }

    public ArrayList BHq(AnonymousClass3T1 r8) {
        String str;
        if (!(r8 instanceof AnonymousClass2bR)) {
            return null;
        }
        int i = ((AnonymousClass2bR) r8).A00;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "invite", r3, 0);
        if (i == 1) {
            str = "FBPAY";
        } else if (i == 2) {
            str = "NOVI";
        } else if (i != 3) {
            str = null;
        } else {
            str = "UPI";
        }
        C18740tg.A06(str);
        C36341k9.A1L("service", str, r3, 1);
        C203399nx.A0E("pay", A0I, r3);
        return A0I;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        AnonymousClass8SX r2 = r7.A0A;
        if ((r2.bitField1_ & 4) == 0) {
            return null;
        }
        AnonymousClass8PA r0 = r2.paymentInviteMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8PA.DEFAULT_INSTANCE;
        }
        AnonymousClass917 A002 = AnonymousClass917.A00(r0.serviceType_);
        if (A002 == null) {
            A002 = AnonymousClass917.UNKNOWN;
        }
        AnonymousClass917 r5 = AnonymousClass917.UNKNOWN;
        if (A002 != r5) {
            C20810yC r1 = this.A00;
            if (r1.A0E(423) || r1.A0E(544)) {
                AnonymousClass8PA r3 = r2.paymentInviteMessage_;
                if (r3 == null) {
                    r3 = AnonymousClass8PA.DEFAULT_INSTANCE;
                }
                C18740tg.A06(r3);
                AnonymousClass2bR r4 = new AnonymousClass2bR(r7.A0C, r7.A04);
                AnonymousClass917 A003 = AnonymousClass917.A00(r3.serviceType_);
                if (A003 == null) {
                    A003 = r5;
                }
                r4.A00 = A003.value;
                if ((r3.bitField0_ & 2) != 0) {
                    r4.A01 = r3.expiryTimestamp_ * 1000;
                }
                return r4;
            }
        }
        return r7.A02(0);
    }

    public AC2(C20810yC r1) {
        this.A00 = r1;
    }
}
