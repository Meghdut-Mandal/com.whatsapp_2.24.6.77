package X;

/* renamed from: X.ABo  reason: case insensitive filesystem */
public class C21180ABo implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;
    public final C196049Xl A01;
    public final ABE A02;

    public void B24(C196159Xy r5, AnonymousClass3T1 r6) {
        C18740tg.A0E(r6 instanceof C181798o3, AnonymousClass000.A0l(r6, "FMessageVideoProtobuf: message type is not supported ", AnonymousClass000.A0u()));
        C46932bu r62 = (C46932bu) r6;
        if (r62.A1T(C132986Wc.A0F)) {
            this.A02.A00(new C23149B7j(this, 4), r5, r62);
            return;
        }
        AnonymousClass8NL r3 = r5.A00;
        AnonymousClass8NH A0O = C170918Hz.A0O(r3);
        this.A01.A02(r5, A0O, r62);
        if (!r62.A1R(8) || C61583Cq.A00(r62) == null) {
            r3.A0h(A0O);
            return;
        }
        C173308Re r0 = ((AnonymousClass8SX) r3.A00).buttonsMessage_;
        if (r0 == null) {
            r0 = C173308Re.DEFAULT_INSTANCE;
        }
        AnonymousClass8N3 r2 = (AnonymousClass8N3) r0.A0q();
        C170918Hz.A0F(A0O, r2, r62).headerCase_ = 4;
        r2.A0U(AnonymousClass91C.VIDEO);
        r3.A0W((C173308Re) r2.A0R());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4.viewOnce_ == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r7) {
        /*
            r6 = this;
            X.8SX r1 = r7.A0A
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0039
            X.8SE r4 = r1.videoMessage_
            r3 = r4
            if (r4 != 0) goto L_0x0014
            X.8SE r4 = X.AnonymousClass8SE.DEFAULT_INSTANCE
        L_0x0014:
            boolean r2 = r4.gifPlayback_
            int r1 = r4.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0022
            boolean r1 = r4.viewOnce_
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r2 != 0) goto L_0x0039
            if (r0 != 0) goto L_0x0039
            if (r3 != 0) goto L_0x002b
            X.8SE r3 = X.AnonymousClass8SE.DEFAULT_INSTANCE
        L_0x002b:
            X.3Qa r2 = r7.A0C
            long r0 = r7.A04
            X.8o3 r5 = new X.8o3
            r5.<init>(r2, r0)
            X.9Xl r0 = r6.A01
            X.C196049Xl.A00(r7, r3, r5, r0)
        L_0x0039:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21180ABo.BlH(X.9YL):X.3T1");
    }

    public C21180ABo(ABE abe, C202029kv r2, C196049Xl r3) {
        this.A02 = abe;
        this.A00 = r2;
        this.A01 = r3;
    }
}
