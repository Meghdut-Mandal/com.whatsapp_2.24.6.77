package X;

import com.whatsapp.util.Log;

public final class ABH implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        AnonymousClass90X r2;
        C36321k7.A0w(r8, r7);
        if (r8 instanceof C106245Ix) {
            AnonymousClass67Y r5 = ((C106245Ix) r8).A00;
            if (r5 != null) {
                AnonymousClass8NL r3 = r7.A00;
                C173068Qg r0 = ((AnonymousClass8SX) r3.A00).bcallMessage_;
                if (r0 == null) {
                    r0 = C173068Qg.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q = r0.A0q();
                int i = r5.A00;
                if (i == 1) {
                    r2 = AnonymousClass90X.AUDIO;
                } else if (i != 2) {
                    r2 = AnonymousClass90X.UNKNOWN;
                } else {
                    r2 = AnonymousClass90X.VIDEO;
                }
                C173068Qg r1 = (C173068Qg) C90524aI.A0H(A0q);
                int i2 = C173068Qg.CAPTION_FIELD_NUMBER;
                r1.mediaType_ = r2.value;
                r1.bitField0_ |= 2;
                String str = r5.A03;
                C173068Qg r12 = (C173068Qg) C90524aI.A0H(A0q);
                r12.bitField0_ |= 1;
                r12.sessionId_ = str;
                AnonymousClass8I5 A0O = C90474aD.A0O(A0q, r5.A04);
                C173068Qg r13 = (C173068Qg) A0q.A00;
                r13.bitField0_ |= 4;
                r13.masterKey_ = A0O;
                String str2 = r5.A02;
                if (str2 != null) {
                    C173068Qg r14 = (C173068Qg) C90524aI.A0H(A0q);
                    r14.bitField0_ |= 8;
                    r14.caption_ = str2;
                }
                C173068Qg r02 = (C173068Qg) A0q.A0R();
                AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r02);
                A0F.bcallMessage_ = r02;
                A0F.bitField1_ |= 67108864;
                return;
            }
            Log.e("FMessageBCallProtobuf/session is null");
            return;
        }
        throw AnonymousClass001.A08("FMessageBCallProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r12) {
        /*
            r11 = this;
            X.8SX r2 = X.AnonymousClass9YL.A00(r12)
            int r1 = r2.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0061
            X.8Qg r2 = r2.bcallMessage_
            if (r2 != 0) goto L_0x0011
            X.8Qg r2 = X.C173068Qg.DEFAULT_INSTANCE
        L_0x0011:
            int r0 = r2.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0056
            java.lang.String r5 = r2.sessionId_
            X.AnonymousClass00C.A08(r5)
            int r1 = r2.mediaType_
            if (r1 == 0) goto L_0x0053
            r0 = 1
            if (r1 == r0) goto L_0x0050
            r0 = 2
            if (r1 != r0) goto L_0x0053
            X.90X r0 = X.AnonymousClass90X.VIDEO
        L_0x0028:
            int r1 = r0.ordinal()
            r8 = 2
            r0 = 1
            if (r1 == r0) goto L_0x004e
            if (r1 == r8) goto L_0x0033
            r8 = 0
        L_0x0033:
            X.AUx r0 = r2.masterKey_
            byte[] r7 = X.C165617ti.A0i(r0)
            java.lang.String r6 = r2.caption_
            r9 = -1
            X.67Y r4 = new X.67Y
            r4.<init>(r5, r6, r7, r8, r9)
            X.3Qa r3 = r12.A0C
            long r1 = r12.A04
            X.5Ix r0 = new X.5Ix
            r0.<init>(r3, r1)
            r0.A00 = r4
            return r0
        L_0x004e:
            r8 = 1
            goto L_0x0033
        L_0x0050:
            X.90X r0 = X.AnonymousClass90X.AUDIO
            goto L_0x0028
        L_0x0053:
            X.90X r0 = X.AnonymousClass90X.UNKNOWN
            goto L_0x0028
        L_0x0056:
            java.lang.Integer r1 = X.C36421kH.A0U()
            java.lang.String r0 = "bcall message doesn't have master key"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0061:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABH.BlH(X.9YL):X.3T1");
    }
}
