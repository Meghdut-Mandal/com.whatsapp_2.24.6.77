package X;

/* renamed from: X.ACp  reason: case insensitive filesystem */
public final class C21207ACp implements B14 {
    public void Bd3(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        C36321k7.A0w(r7, r6);
        String str = (String) r7.A1L.A00;
        if (str != null) {
            AnonymousClass8NN A01 = C170918Hz.A01(AnonymousClass8OZ.DEFAULT_INSTANCE);
            AnonymousClass8OZ r1 = (AnonymousClass8OZ) A01.A00;
            r1.bitField0_ |= 1;
            r1.serverCampaignId_ = str;
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r6);
            AnonymousClass8OZ r12 = (AnonymousClass8OZ) A01.A0R();
            int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r12.getClass();
            A0I.premiumMessageInfo_ = r12;
            A0I.bitField1_ |= 256;
        }
    }

    public void Bd4(C1275768v r3, AnonymousClass8SU r4, AnonymousClass3T1 r5) {
        C36321k7.A0w(r4, r5);
        if ((r4.bitField1_ & 256) != 0) {
            AnonymousClass8OZ r0 = r4.premiumMessageInfo_;
            if (r0 == null) {
                r0 = AnonymousClass8OZ.DEFAULT_INSTANCE;
            }
            r5.A1L.A01(r0.serverCampaignId_);
        }
    }
}
