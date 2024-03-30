package X;

import java.util.ArrayList;

public class AC1 implements C22938Ayo, C22942Ays, C22994Azk, C17740rx {
    public void B24(C196159Xy r9, AnonymousClass3T1 r10) {
        C1886590d r4;
        if (r10 instanceof AnonymousClass2c9) {
            AnonymousClass2bJ r102 = (AnonymousClass2bJ) r10;
            int i = r102.A00;
            String str = r102.A02;
            long j = r102.A01;
            AnonymousClass8NL r5 = r9.A00;
            AnonymousClass8QA r0 = ((AnonymousClass8SX) r5.A00).scheduledCallCreationMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8QA.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            if (i == 0) {
                r4 = C1886590d.UNKNOWN;
            } else if (i == 1) {
                r4 = C1886590d.VOICE;
            } else if (i == 2) {
                r4 = C1886590d.VIDEO;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unexpected type (");
                A0u.append(i);
                throw AnonymousClass000.A0c(")", A0u);
            }
            AnonymousClass8QA r1 = (AnonymousClass8QA) C90524aI.A0H(A0q);
            int i2 = AnonymousClass8QA.CALL_TYPE_FIELD_NUMBER;
            r1.callType_ = r4.value;
            r1.bitField0_ |= 2;
            AnonymousClass8QA r12 = (AnonymousClass8QA) C90524aI.A0H(A0q);
            str.getClass();
            r12.bitField0_ |= 4;
            r12.title_ = str;
            AnonymousClass8QA r13 = (AnonymousClass8QA) C90524aI.A0H(A0q);
            r13.bitField0_ |= 1;
            r13.scheduledTimestampMs_ = j;
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r5);
            AnonymousClass8QA r02 = (AnonymousClass8QA) A0q.A0R();
            r02.getClass();
            A0E.scheduledCallCreationMessage_ = r02;
            A0E.bitField1_ |= 65536;
            return;
        }
        throw AnonymousClass001.A08("FMessageScheduledCallProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r8) {
        /*
            r7 = this;
            X.8SX r2 = r8.A0A
            int r1 = r2.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0080
            X.8QA r5 = r2.scheduledCallCreationMessage_
            if (r5 != 0) goto L_0x000f
            X.8QA r5 = X.AnonymousClass8QA.DEFAULT_INSTANCE
        L_0x000f:
            X.C18740tg.A06(r5)
            X.3Qa r2 = r8.A0C
            long r0 = r8.A04
            X.2c9 r4 = new X.2c9
            r4.<init>(r2, r0)
            int r6 = r5.bitField0_
            boolean r0 = X.C165577te.A1W(r6)
            java.lang.Integer r3 = X.C36381kD.A0m()
            if (r0 == 0) goto L_0x006c
            long r0 = r5.scheduledTimestampMs_
            r4.A01 = r0
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0049
            int r1 = r5.callType_
            if (r1 == 0) goto L_0x0055
            r0 = 1
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 != r0) goto L_0x0055
            X.90d r0 = X.C1886590d.VIDEO
        L_0x003b:
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0047
            r0 = 2
            if (r2 != r1) goto L_0x0047
            r0 = 1
        L_0x0047:
            r4.A00 = r0
        L_0x0049:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r5.title_
            r4.A02 = r0
            return r4
        L_0x0052:
            X.90d r0 = X.C1886590d.VOICE
            goto L_0x003b
        L_0x0055:
            X.90d r0 = X.C1886590d.UNKNOWN
            goto L_0x003b
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageScheduledCall/missing title; message.key="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            X.C36331k8.A1P(r0, r1)
            X.1Tb r0 = new X.1Tb
            r0.<init>(r3)
            throw r0
        L_0x006c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageScheduledCall/missing scheduledTimeStampMs; message.key="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            X.C36331k8.A1P(r0, r1)
            X.1Tb r0 = new X.1Tb
            r0.<init>(r3)
            throw r0
        L_0x0080:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC1.BlH(X.9YL):X.3T1");
    }

    public ArrayList BHq(AnonymousClass3T1 r5) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36381kD.A1N("scheduled_call_type", "creation", A0k);
        C203399nx.A0E("meta", A0I, A0k);
        return A0I;
    }
}
