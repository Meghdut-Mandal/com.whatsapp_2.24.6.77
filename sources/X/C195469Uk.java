package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.9Uk  reason: invalid class name and case insensitive filesystem */
public abstract class C195469Uk {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass11F A05;
    public AnonymousClass11F A06;
    public UserJid A07;
    public UserJid A08;
    public String A09;
    public String A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C19700wN A0F;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v135, resolved type: X.8nq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v136, resolved type: X.8nq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v137, resolved type: X.8nv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v219, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.3T1] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v59, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r6v35 */
    /* JADX WARNING: type inference failed for: r6v37 */
    /* JADX WARNING: type inference failed for: r3v99, types: [X.8ny, X.3T1, X.8np] */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: type inference failed for: r3v105, types: [X.3T1] */
    /* JADX WARNING: type inference failed for: r3v106 */
    /* JADX WARNING: type inference failed for: r3v108 */
    /* JADX WARNING: type inference failed for: r3v109 */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0556, code lost:
        if (r3 == null) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0644, code lost:
        if (r3 == null) goto L_0x0646;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:833:0x0fe6  */
    /* JADX WARNING: Removed duplicated region for block: B:836:0x0ff9  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A0C(X.AnonymousClass8SU r13, X.C64933Qa r14, long r15) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C186708wZ
            r10 = r15
            if (r0 == 0) goto L_0x0025
            r1 = 0
            X.C36321k7.A0v(r14, r1, r13)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r3 = X.C36401kF.A0s(r0, r1)
            r2 = 0
            if (r3 == 0) goto L_0x0024
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            if (r0 == 0) goto L_0x0024
            X.5JD r2 = new X.5JD
            r2.<init>(r14, r10)
            r2.A01 = r3
            r2.A00 = r0
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r12 instanceof X.C186948wx
            if (r0 == 0) goto L_0x002f
            X.8mq r0 = new X.8mq
            r0.<init>(r14, r10)
            return r0
        L_0x002f:
            boolean r0 = r12 instanceof X.C186698wY
            if (r0 == 0) goto L_0x007c
            int r1 = X.C170918Hz.A00(r13)
            r3 = 0
            r0 = 3
            if (r1 == r0) goto L_0x0041
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage wrong number of parameters"
        L_0x003d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0040:
            return r3
        L_0x0041:
            X.2cN r5 = new X.2cN
            r5.<init>(r14, r10)
            java.lang.String r2 = X.C186938ww.A08(r13)
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r6 = X.C36401kF.A0s(r0, r1)
            r1 = 2
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r4 = X.C36401kF.A0s(r0, r1)
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0079
            boolean r0 = X.AnonymousClass14B.A0F(r6)
            if (r0 != 0) goto L_0x0079
            boolean r0 = X.AnonymousClass14B.A0F(r4)
            if (r0 != 0) goto L_0x0079
            long r2 = java.lang.Long.parseLong(r2)
            long r0 = java.lang.Long.parseLong(r6)
            r5.A01 = r2
            r5.A00 = r0
            r5.A02 = r4
            return r5
        L_0x0079:
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage one of the parameters is invalid"
            goto L_0x003d
        L_0x007c:
            boolean r0 = r12 instanceof X.C186688wX
            if (r0 == 0) goto L_0x00cf
            r4 = 0
            int r2 = X.C36361kB.A04(r14, r13, r4)
            int r1 = X.C170918Hz.A00(r13)
            r6 = 0
            r0 = 3
            if (r1 != r0) goto L_0x0c30
            X.5JE r3 = new X.5JE
            r3.<init>(r14, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r5 = X.C36401kF.A0s(r0, r4)
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r4 = X.C36401kF.A0s(r0, r1)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r2)
            boolean r0 = X.AnonymousClass14B.A0F(r5)
            if (r0 != 0) goto L_0x0c30
            boolean r0 = X.AnonymousClass14B.A0F(r4)
            if (r0 != 0) goto L_0x0c30
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0c30
            X.AnonymousClass00C.A0B(r5)
            long r0 = java.lang.Long.parseLong(r5)
            r3.A00 = r0
            X.AnonymousClass00C.A0B(r4)
            long r0 = java.lang.Long.parseLong(r4)
            r3.A01 = r0
            X.C36361kB.A1I(r2)
            r3.A02 = r2
            return r3
        L_0x00cf:
            boolean r0 = r12 instanceof X.C186678wW
            if (r0 == 0) goto L_0x00ee
            r3 = 0
            X.C36321k7.A0v(r14, r3, r13)
            X.8mz r2 = new X.8mz
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x0024
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            X.C165577te.A17(r1, r2, r0)
            return r2
        L_0x00ee:
            boolean r0 = r12 instanceof X.C186828wl
            if (r0 == 0) goto L_0x012c
            X.91I r0 = r13.A0u()
            int r1 = r0.ordinal()
            r0 = 54
            r2 = 40
            if (r1 == r0) goto L_0x0113
            r0 = 55
            r2 = 41
            if (r1 == r0) goto L_0x0113
            r0 = 56
            if (r1 == r0) goto L_0x0111
            java.lang.String r0 = "PaymentWebQuery/restoreFMessage malformed WMI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0110:
            return r1
        L_0x0111:
            r2 = 42
        L_0x0113:
            X.2cP r1 = new X.2cP
            r1.<init>(r14, r2, r10)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x0110
            java.lang.String r0 = X.C186938ww.A08(r13)
            X.11F r0 = X.C36421kH.A0N(r0)
            if (r0 == 0) goto L_0x0110
            r1.A0q(r0)
            return r1
        L_0x012c:
            boolean r0 = r12 instanceof X.C186668wV
            if (r0 == 0) goto L_0x0191
            X.91I r0 = r13.A0u()
            int r2 = r0.ordinal()
            r1 = 178(0xb2, float:2.5E-43)
            r3 = 2
            r0 = 179(0xb3, float:2.51E-43)
            if (r2 == r1) goto L_0x018b
            if (r2 == r0) goto L_0x0185
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 != r0) goto L_0x0c29
            X.8n4 r2 = new X.8n4
            r2.<init>(r14, r10)
        L_0x014a:
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.C36371kC.A1T(r0, r3)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A01 = r0
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= r3) goto L_0x0024
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            X.11F r0 = X.C36421kH.A0N(r0)
            if (r0 == 0) goto L_0x0c23
            r2.A0q(r0)
            return r2
        L_0x0185:
            X.8n3 r2 = new X.8n3
            r2.<init>(r14, r10)
            goto L_0x014a
        L_0x018b:
            X.8n5 r2 = new X.8n5
            r2.<init>(r14, r10)
            goto L_0x014a
        L_0x0191:
            boolean r0 = r12 instanceof X.C186658wU
            if (r0 == 0) goto L_0x01ad
            r2 = 0
            X.C36321k7.A0v(r14, r2, r13)
            X.8mt r1 = new X.8mt
            r1.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x0110
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r2)
            r1.A0m = r0
            return r1
        L_0x01ad:
            boolean r0 = r12 instanceof X.C186648wT
            if (r0 == 0) goto L_0x01b7
            X.8ms r0 = new X.8ms
            r0.<init>(r14, r10)
            return r0
        L_0x01b7:
            boolean r0 = r12 instanceof X.C186638wS
            if (r0 == 0) goto L_0x01dc
            r0 = 0
            X.C36321k7.A0v(r14, r0, r13)
            X.8nN r3 = new X.8nN
            r3.<init>(r14, r10)
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r2, r3, r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            int r1 = X.C170918Hz.A00(r13)
            r0 = 0
        L_0x01d4:
            if (r0 >= r1) goto L_0x0dac
            A0A(r2, r13, r4, r0)
            int r0 = r0 + 1
            goto L_0x01d4
        L_0x01dc:
            boolean r0 = r12 instanceof X.C186628wR
            if (r0 == 0) goto L_0x021a
            X.2cO r2 = new X.2cO
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            r3 = 2
            boolean r0 = X.C36371kC.A1T(r0, r3)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A02 = r0
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= r3) goto L_0x0024
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            r2.A01 = r0
            return r2
        L_0x021a:
            boolean r0 = r12 instanceof X.C186848wn
            if (r0 == 0) goto L_0x025a
            int r0 = X.C170918Hz.A00(r13)
            r5 = 1
            boolean r0 = X.C36371kC.A1T(r0, r5)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r4 = r0.A06(r1)
            X.8np r3 = new X.8np
            r3.<init>(r14, r10)
            r2 = 0
            int r1 = X.C170918Hz.A00(r13)
            r0 = 2
            if (r1 < r0) goto L_0x024a
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r5)
        L_0x024a:
            if (r4 == 0) goto L_0x0040
            r1 = 0
            X.9Wj r0 = new X.9Wj
            r0.<init>(r4, r2, r5, r1)
            java.util.List r0 = X.C36371kC.A11(r0)
            r3.A1f(r0)
            return r3
        L_0x025a:
            boolean r0 = r12 instanceof X.C186818wk
            if (r0 == 0) goto L_0x0287
            X.2cH r1 = new X.2cH
            r1.<init>(r14, r10)
            X.91I r0 = r13.A0u()
            int r0 = r0.ordinal()
            switch(r0) {
                case 79: goto L_0x0272;
                case 81: goto L_0x0275;
                case 84: goto L_0x0278;
                case 86: goto L_0x027a;
                case 94: goto L_0x027d;
                case 96: goto L_0x027f;
                case 126: goto L_0x027d;
                case 127: goto L_0x0278;
                case 193: goto L_0x0281;
                case 200: goto L_0x0284;
                default: goto L_0x026e;
            }
        L_0x026e:
            r0 = 0
        L_0x026f:
            r1.A00 = r0
            return r1
        L_0x0272:
            r0 = 9
            goto L_0x026f
        L_0x0275:
            r0 = 10
            goto L_0x026f
        L_0x0278:
            r0 = 7
            goto L_0x026f
        L_0x027a:
            r0 = 8
            goto L_0x026f
        L_0x027d:
            r0 = 5
            goto L_0x026f
        L_0x027f:
            r0 = 6
            goto L_0x026f
        L_0x0281:
            r0 = 17
            goto L_0x026f
        L_0x0284:
            r0 = 16
            goto L_0x026f
        L_0x0287:
            boolean r0 = r12 instanceof X.C186338vu
            if (r0 == 0) goto L_0x0291
            X.8nM r0 = new X.8nM
            r0.<init>(r14, r10)
            return r0
        L_0x0291:
            boolean r0 = r12 instanceof X.C186328vt
            if (r0 == 0) goto L_0x029b
            X.5JC r0 = new X.5JC
            r0.<init>(r14, r10)
            return r0
        L_0x029b:
            boolean r0 = r12 instanceof X.C186618wQ
            if (r0 == 0) goto L_0x02c4
            X.8nW r3 = new X.8nW
            r3.<init>(r14, r10)
            int r2 = X.C170918Hz.A00(r13)
            r1 = 0
            r0 = 1
            if (r2 != r0) goto L_0x0110
            java.lang.String r0 = X.C186938ww.A08(r13)
            java.lang.String r0 = X.C181468nW.A00(r0)
            if (r0 == 0) goto L_0x0110
            r3.A00 = r0
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            if (r0 == 0) goto L_0x0110
            r3.A0q(r0)
            return r3
        L_0x02c4:
            boolean r0 = r12 instanceof X.C186608wP
            if (r0 == 0) goto L_0x0313
            int r1 = X.C170918Hz.A00(r13)
            r2 = 0
            r0 = 2
            if (r1 != r0) goto L_0x0024
            java.lang.String r1 = X.C186938ww.A08(r13)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0308
            r3 = 84
        L_0x02de:
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f5
            java.lang.String r0 = "regular"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
        L_0x02f5:
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            if (r0 == 0) goto L_0x0024
            X.8nO r2 = new X.8nO
            r2.<init>(r14, r3, r10)
            r2.A00 = r1
            r2.A0q(r0)
            return r2
        L_0x0308:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r3 = 85
            goto L_0x02de
        L_0x0313:
            boolean r0 = r12 instanceof X.C186598wO
            if (r0 == 0) goto L_0x034b
            r3 = 0
            X.C36321k7.A0v(r14, r3, r13)
            int r1 = X.C170918Hz.A00(r13)
            r2 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0024
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r3)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0340
            r0 = 91
        L_0x0333:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r1, r2, r0)
            return r2
        L_0x0340:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r0 = 92
            goto L_0x0333
        L_0x034b:
            boolean r0 = r12 instanceof X.C186808wj
            if (r0 == 0) goto L_0x03d0
            r2 = 0
            X.C36321k7.A0v(r14, r2, r13)
            int r1 = X.C170918Hz.A00(r13)
            r6 = 0
            r0 = 5
            if (r1 < r0) goto L_0x0c30
            java.lang.String r0 = r13.participant_
            if (r0 == 0) goto L_0x03ce
            com.whatsapp.jid.Jid r5 = X.C36411kG.A0i(r0)
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0368
            r5 = r6
        L_0x0368:
            X.11F r5 = (X.AnonymousClass11F) r5
        L_0x036a:
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r2)
            if (r0 == 0) goto L_0x0c30
            com.whatsapp.jid.Jid r4 = X.C36411kG.A0i(r0)
            boolean r0 = r4 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x037b
            r4 = r6
        L_0x037b:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            if (r4 == 0) goto L_0x0c30
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = ""
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x038f
            r6 = r1
        L_0x038f:
            r1 = 3
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            java.lang.String r3 = "true"
            boolean r2 = r0.equals(r3)
            r1 = 4
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            boolean r0 = r0.equals(r3)
            if (r2 == 0) goto L_0x03c0
            X.8nm r2 = new X.8nm
            r2.<init>(r14, r10)
        L_0x03ae:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.9Wj r0 = X.C195869Wj.A00(r4, r6)
            r1.add(r0)
            r2.A1f(r1)
            r2.A0q(r5)
            return r2
        L_0x03c0:
            if (r0 == 0) goto L_0x03c8
            X.8nn r2 = new X.8nn
            r2.<init>(r14, r10)
            goto L_0x03ae
        L_0x03c8:
            X.8no r2 = new X.8no
            r2.<init>(r14, r10)
            goto L_0x03ae
        L_0x03ce:
            r5 = r6
            goto L_0x036a
        L_0x03d0:
            boolean r0 = r12 instanceof X.C186878wq
            if (r0 == 0) goto L_0x03fd
            r0 = 95
            X.8nQ r2 = new X.8nQ
            r2.<init>(r14, r0, r10)
            r0 = 2
            r2.A00 = r0
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0110
            r2.A0q(r0)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x03fa
            java.lang.String r1 = X.C186938ww.A08(r13)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r1 = r0.A06(r1)
        L_0x03fa:
            r2.A01 = r1
            return r2
        L_0x03fd:
            boolean r0 = r12 instanceof X.C186588wN
            if (r0 == 0) goto L_0x0416
            int r1 = X.C170918Hz.A00(r13)
            r3 = 0
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0C(r0)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r3)
            goto L_0x0c31
        L_0x0416:
            boolean r0 = r12 instanceof X.C186968wz
            if (r0 == 0) goto L_0x0446
            r1 = 0
            X.C36321k7.A0v(r14, r1, r13)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x043b
            r0 = 140(0x8c, float:1.96E-43)
        L_0x042e:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r1, r2, r0)
            return r2
        L_0x043b:
            java.lang.String r0 = "off"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0c6f
            r0 = 141(0x8d, float:1.98E-43)
            goto L_0x042e
        L_0x0446:
            boolean r0 = r12 instanceof X.C186578wM
            if (r0 == 0) goto L_0x047a
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x046f
            r1 = 53
        L_0x0466:
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            X.C186928wv.A09(r13, r0)
            return r0
        L_0x046f:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0c7d
            r1 = 54
            goto L_0x0466
        L_0x047a:
            boolean r0 = r12 instanceof X.C187008x5
            if (r0 == 0) goto L_0x04aa
            r1 = 0
            X.C36321k7.A0v(r14, r1, r13)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x049f
            r0 = 150(0x96, float:2.1E-43)
        L_0x0492:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r1, r2, r0)
            return r2
        L_0x049f:
            java.lang.String r0 = "off"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0c82
            r0 = 151(0x97, float:2.12E-43)
            goto L_0x0492
        L_0x04aa:
            boolean r0 = r12 instanceof X.AnonymousClass8x3
            if (r0 == 0) goto L_0x04de
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04d3
            r1 = 31
        L_0x04ca:
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            X.C186928wv.A09(r13, r0)
            return r0
        L_0x04d3:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0c90
            r1 = 32
            goto L_0x04ca
        L_0x04de:
            boolean r0 = r12 instanceof X.AnonymousClass8x4
            if (r0 == 0) goto L_0x050e
            r1 = 0
            X.C36321k7.A0v(r14, r1, r13)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0503
            r0 = 137(0x89, float:1.92E-43)
        L_0x04f6:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r1, r2, r0)
            return r2
        L_0x0503:
            java.lang.String r0 = "off"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0c97
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x04f6
        L_0x050e:
            boolean r0 = r12 instanceof X.C186318vs
            if (r0 == 0) goto L_0x051a
            r1 = 33
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            return r0
        L_0x051a:
            boolean r0 = r12 instanceof X.C186568wL
            if (r0 == 0) goto L_0x053c
            X.8n7 r2 = new X.8n7
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            return r2
        L_0x053c:
            boolean r0 = r12 instanceof X.C186558wK
            if (r0 == 0) goto L_0x0565
            X.8mw r2 = new X.8mw
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x0563
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            com.whatsapp.jid.UserJid r3 = X.C36431kI.A0l(r0)
            if (r3 != 0) goto L_0x055f
        L_0x0558:
            X.11F r0 = r14.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
        L_0x055c:
            X.C18740tg.A0C(r0)
        L_0x055f:
            r2.A0q(r3)
            return r2
        L_0x0563:
            r3 = 0
            goto L_0x0558
        L_0x0565:
            boolean r0 = r12 instanceof X.AnonymousClass8wJ
            if (r0 == 0) goto L_0x0578
            X.8mu r2 = new X.8mu
            r2.<init>(r14, r10)
            java.lang.String r1 = X.C186938ww.A08(r13)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r0, r2, r1)
            return r2
        L_0x0578:
            boolean r0 = r12 instanceof X.AnonymousClass8wI
            if (r0 == 0) goto L_0x05a5
            X.2cJ r2 = new X.2cJ
            r2.<init>(r14, r10)
            java.lang.String r1 = X.C186938ww.A08(r13)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r0, r2, r1)
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            r1 = 2
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A01 = r0
            return r2
        L_0x05a5:
            boolean r0 = r12 instanceof X.C186548wH
            if (r0 == 0) goto L_0x05ca
            r0 = 81
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r2, r3, r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x05be:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0B(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x05be
        L_0x05ca:
            boolean r0 = r12 instanceof X.C186538wG
            if (r0 == 0) goto L_0x05f6
            r0 = 82
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r2.A02(r0)
            X.C18740tg.A06(r0)
            r3.A0q(r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x05ea:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0A(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x05ea
        L_0x05f6:
            boolean r0 = r12 instanceof X.C186528wF
            if (r0 == 0) goto L_0x060b
            X.8n8 r3 = new X.8n8
            r3.<init>(r14, r10)
            X.91I r2 = r13.A0u()
            X.91I r0 = X.AnonymousClass91I.A05
            r1 = 1
            if (r2 != r0) goto L_0x0ca5
            r3.A01 = r1
            return r3
        L_0x060b:
            boolean r0 = r12 instanceof X.C186518wE
            if (r0 == 0) goto L_0x0652
            int r0 = X.C170918Hz.A00(r13)
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r3 = java.lang.Integer.parseInt(r0)
            X.11F r1 = r14.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x064a
            X.8nV r2 = new X.8nV
            r2.<init>(r14, r10)
            r2.A00 = r3
        L_0x0633:
            r3 = 0
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= r4) goto L_0x0646
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r4)
            com.whatsapp.jid.UserJid r3 = X.C36431kI.A0l(r0)
            if (r3 != 0) goto L_0x055f
        L_0x0646:
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            goto L_0x055c
        L_0x064a:
            X.2cF r2 = new X.2cF
            r2.<init>(r14, r10)
            r2.A00 = r3
            goto L_0x0633
        L_0x0652:
            boolean r0 = r12 instanceof X.C186798wi
            if (r0 == 0) goto L_0x0695
            r4 = r12
            X.8wi r4 = (X.C186798wi) r4
            X.8n1 r2 = new X.8n1
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            r3 = 1
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= r3) goto L_0x0cbe
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            if (r1 == 0) goto L_0x0cbe
            X.0wQ r0 = r4.A00
            boolean r0 = r0.A0M(r1)
            if (r0 != 0) goto L_0x0cbe
            r0 = 2
            r2.A00 = r0
            return r2
        L_0x0695:
            boolean r0 = r12 instanceof X.C186908wt
            if (r0 == 0) goto L_0x06c5
            r0 = r12
            X.8wt r0 = (X.C186908wt) r0
            r3 = 0
            X.C36321k7.A0v(r14, r3, r13)
            boolean r0 = r0 instanceof X.C186898ws
            if (r0 == 0) goto L_0x06c2
            r0 = 27
        L_0x06a6:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r1, r2, r0)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x0024
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            r2.A16(r0)
            return r2
        L_0x06c2:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x06a6
        L_0x06c5:
            boolean r0 = r12 instanceof X.C186508wD
            if (r0 == 0) goto L_0x06f0
            r0 = 69
            X.2cI r5 = new X.2cI
            r5.<init>(r14, r0, r10)
            X.91I r0 = r13.A0u()
            int r4 = r0.ordinal()
            r3 = 2
            r2 = 129(0x81, float:1.81E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r0) goto L_0x06ed
            r3 = 3
            r1 = 194(0xc2, float:2.72E-43)
            if (r4 == r2) goto L_0x06ed
            r3 = 4
            r0 = 201(0xc9, float:2.82E-43)
            if (r4 == r1) goto L_0x06ed
            r3 = 5
            if (r4 == r0) goto L_0x06ed
            r3 = 1
        L_0x06ed:
            r5.A00 = r3
            return r5
        L_0x06f0:
            boolean r0 = r12 instanceof X.C186498wC
            if (r0 == 0) goto L_0x070b
            r0 = 61
            X.2cI r1 = new X.2cI
            r1.<init>(r14, r0, r10)
            X.91I r0 = r13.A0u()
            int r0 = r0.ordinal()
            switch(r0) {
                case 76: goto L_0x0cec;
                case 77: goto L_0x0ce9;
                case 78: goto L_0x0cef;
                case 79: goto L_0x0706;
                case 80: goto L_0x0d25;
                case 81: goto L_0x0706;
                case 82: goto L_0x0d23;
                case 83: goto L_0x0cdd;
                case 84: goto L_0x0706;
                case 85: goto L_0x0d21;
                case 86: goto L_0x0706;
                case 87: goto L_0x0d1f;
                case 88: goto L_0x0ccb;
                case 89: goto L_0x0cce;
                case 90: goto L_0x0cd1;
                case 91: goto L_0x0cd4;
                case 92: goto L_0x0ce3;
                case 93: goto L_0x0ce6;
                case 94: goto L_0x0706;
                case 95: goto L_0x0d1d;
                case 96: goto L_0x0706;
                case 97: goto L_0x0d1b;
                case 98: goto L_0x0ce0;
                case 99: goto L_0x0706;
                case 100: goto L_0x0706;
                case 101: goto L_0x0cda;
                case 102: goto L_0x0cc8;
                case 103: goto L_0x0cd7;
                case 104: goto L_0x0d04;
                case 105: goto L_0x0cf8;
                case 106: goto L_0x0cfe;
                case 107: goto L_0x0d01;
                case 108: goto L_0x0d07;
                case 109: goto L_0x0d10;
                case 110: goto L_0x0d16;
                case 111: goto L_0x0d19;
                case 112: goto L_0x0cf2;
                case 113: goto L_0x0cfb;
                case 114: goto L_0x0d0a;
                case 115: goto L_0x0d13;
                case 116: goto L_0x0cf5;
                case 117: goto L_0x0d0d;
                default: goto L_0x0706;
            }
        L_0x0706:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x070b:
            boolean r0 = r12 instanceof X.C186488wB
            if (r0 == 0) goto L_0x0762
            X.91I r0 = r13.A0u()
            int r0 = r0.ordinal()
            switch(r0) {
                case 4: goto L_0x0753;
                case 5: goto L_0x0759;
                case 6: goto L_0x0756;
                case 7: goto L_0x075c;
                case 8: goto L_0x075f;
                case 16: goto L_0x074d;
                case 17: goto L_0x074a;
                case 18: goto L_0x0750;
                case 60: goto L_0x073e;
                case 61: goto L_0x0744;
                case 64: goto L_0x0738;
                case 65: goto L_0x073b;
                case 99: goto L_0x0741;
                case 100: goto L_0x0747;
                default: goto L_0x071a;
            }
        L_0x071a:
            r3 = 0
        L_0x071b:
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1P(r3)
            X.C18740tg.A0C(r0)
            X.2cG r2 = new X.2cG
            r2.<init>(r14, r3, r10)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 != r1) goto L_0x0024
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r2.A00 = r0
            return r2
        L_0x0738:
            r3 = 55
            goto L_0x071b
        L_0x073b:
            r3 = 50
            goto L_0x071b
        L_0x073e:
            r3 = 49
            goto L_0x071b
        L_0x0741:
            r3 = 46
            goto L_0x071b
        L_0x0744:
            r3 = 48
            goto L_0x071b
        L_0x0747:
            r3 = 47
            goto L_0x071b
        L_0x074a:
            r3 = 36
            goto L_0x071b
        L_0x074d:
            r3 = 35
            goto L_0x071b
        L_0x0750:
            r3 = 34
            goto L_0x071b
        L_0x0753:
            r3 = 26
            goto L_0x071b
        L_0x0756:
            r3 = 24
            goto L_0x071b
        L_0x0759:
            r3 = 25
            goto L_0x071b
        L_0x075c:
            r3 = 22
            goto L_0x071b
        L_0x075f:
            r3 = 23
            goto L_0x071b
        L_0x0762:
            boolean r0 = r12 instanceof X.C186478wA
            if (r0 == 0) goto L_0x0787
            X.91I r0 = r13.A0u()
            int r3 = r0.ordinal()
            r2 = 1
            r0 = 75
            if (r3 == r0) goto L_0x0784
            r0 = 118(0x76, float:1.65E-43)
            r1 = 63
            if (r3 == r0) goto L_0x077b
            r1 = 0
            r2 = 0
        L_0x077b:
            X.C18740tg.A0C(r2)
            X.2bI r0 = new X.2bI
            r0.<init>(r14, r1, r10)
            return r0
        L_0x0784:
            r1 = 62
            goto L_0x077b
        L_0x0787:
            boolean r0 = r12 instanceof X.C186468w9
            if (r0 == 0) goto L_0x07a1
            r0 = 0
            X.C36321k7.A0v(r14, r0, r13)
            X.91I r2 = r13.A0u()
            X.91I r0 = X.AnonymousClass91I.BIZ_BOT_1P_MESSAGING_ENABLED
            r1 = 155(0x9b, float:2.17E-43)
            if (r2 != r0) goto L_0x079b
            r1 = 147(0x93, float:2.06E-43)
        L_0x079b:
            X.8n0 r0 = new X.8n0
            r0.<init>(r14, r1, r10)
            return r0
        L_0x07a1:
            boolean r0 = r12 instanceof X.C186458w8
            if (r0 == 0) goto L_0x07c3
            X.2cL r2 = new X.2cL
            r2.<init>(r14, r10)
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A00 = r0
            return r2
        L_0x07c3:
            boolean r0 = r12 instanceof X.C186448w7
            if (r0 == 0) goto L_0x07e8
            r0 = 18
            X.2bI r2 = new X.2bI
            r2.<init>(r14, r0, r10)
            java.lang.String r0 = X.C186938ww.A08(r13)
            X.11F r1 = X.C36421kH.A0N(r0)
            if (r1 == 0) goto L_0x0024
            X.11F r0 = r14.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0024
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r1)
            r2.A0q(r0)
            return r2
        L_0x07e8:
            boolean r0 = r12 instanceof X.AnonymousClass8w6
            if (r0 == 0) goto L_0x080d
            r0 = 15
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r2, r3, r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x0801:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0B(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x0801
        L_0x080d:
            boolean r0 = r12 instanceof X.AnonymousClass8w5
            if (r0 == 0) goto L_0x0839
            r0 = 16
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r2.A02(r0)
            X.C18740tg.A06(r0)
            r3.A0q(r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x082d:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0A(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x082d
        L_0x0839:
            boolean r0 = r12 instanceof X.C186438w4
            if (r0 == 0) goto L_0x085c
            X.8nX r2 = new X.8nX
            r2.<init>(r14, r10)
            java.lang.String r0 = X.C186938ww.A08(r13)
            r2.A1a(r0)
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x0858
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r2.A01 = r0
        L_0x0858:
            X.C186928wv.A09(r13, r2)
            return r2
        L_0x085c:
            boolean r0 = r12 instanceof X.C186428w3
            if (r0 == 0) goto L_0x08a2
            java.lang.String r0 = r13.participant_
            X.13r r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = r4.A02(r0)
            r1 = 7
            r0 = 14
            if (r2 != 0) goto L_0x086e
            r0 = 7
        L_0x086e:
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            r2 = 0
            if (r0 != r1) goto L_0x089c
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r2)
            X.C165577te.A17(r4, r3, r0)
            r2 = 1
        L_0x0880:
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= r2) goto L_0x0040
            X.B6c r0 = r13.messageStubParameters_
            int r0 = X.C36421kH.A06(r0, r2)
            java.util.ArrayList r1 = X.C36441kJ.A14(r0)
        L_0x0890:
            int r0 = X.C170918Hz.A00(r13)
            if (r2 >= r0) goto L_0x0d2f
            A0B(r4, r13, r1, r2)
            int r2 = r2 + 1
            goto L_0x0890
        L_0x089c:
            java.lang.String r0 = r13.participant_
            X.C165577te.A17(r4, r3, r0)
            goto L_0x0880
        L_0x08a2:
            boolean r0 = r12 instanceof X.C186788wh
            if (r0 == 0) goto L_0x08dd
            r4 = r12
            X.8wh r4 = (X.C186788wh) r4
            r0 = 10
            X.8nA r3 = new X.8nA
            r3.<init>(r14, r0, r10)
            X.0wN r0 = r4.A0F
            r3.A02 = r0
            java.lang.String r0 = r13.participant_
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r3.A01 = r0
            java.lang.String r0 = X.C186938ww.A08(r13)
            com.whatsapp.jid.UserJid r1 = r1.A02(r0)
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x0d32
            X.12O r0 = r4.A00
            X.13w r1 = (X.C223313w) r1
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r1)
            if (r1 != 0) goto L_0x0d35
            java.lang.String r0 = "GroupParticipantChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
        L_0x08d9:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x08dd:
            boolean r0 = r12 instanceof X.C186778wg
            if (r0 == 0) goto L_0x08f5
            r5 = r12
            X.8wg r5 = (X.C186778wg) r5
            r0 = 9
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r4 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r4, r3, r0)
            r6 = 0
            goto L_0x0b6b
        L_0x08f5:
            boolean r0 = r12 instanceof X.C186418w2
            if (r0 == 0) goto L_0x0918
            int r0 = X.C170918Hz.A00(r13)
            r3 = 0
            r1 = 1
            if (r0 != r1) goto L_0x0d39
            r0 = 5
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            X.C18740tg.A06(r0)
            r2.A0q(r0)
            return r2
        L_0x0918:
            boolean r0 = r12 instanceof X.C186408w1
            if (r0 == 0) goto L_0x093d
            r0 = 52
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r2, r3, r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x0931:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0A(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x0931
        L_0x093d:
            boolean r0 = r12 instanceof X.C186938ww
            if (r0 == 0) goto L_0x0a13
            r3 = r12
            X.8ww r3 = (X.C186938ww) r3
            boolean r0 = r3 instanceof X.C177098dC
            if (r0 == 0) goto L_0x0978
            X.8nv r2 = new X.8nv
            r2.<init>(r14, r10)
        L_0x094d:
            java.lang.String r0 = r13.participant_
            X.11F r0 = X.C36421kH.A0N(r0)
            r2.A0q(r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            boolean r0 = r3 instanceof X.C177118dE
            if (r0 == 0) goto L_0x0d6b
            java.util.HashSet r6 = X.C36441kJ.A16()
            int r4 = X.C170918Hz.A00(r13)
            r1 = 3
        L_0x0967:
            if (r1 >= r4) goto L_0x0d86
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            X.AnonymousClass00C.A08(r0)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0967
        L_0x0978:
            boolean r0 = r3 instanceof X.C177118dE
            if (r0 == 0) goto L_0x09c5
            r8 = r3
            X.8dE r8 = (X.C177118dE) r8
            r7 = 0
            int r5 = X.C36361kB.A04(r14, r13, r7)
            X.8nv r2 = new X.8nv
            r2.<init>(r14, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r6 = X.C36401kF.A0s(r0, r7)
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r4 = X.C36401kF.A0s(r0, r1)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r1 = r0.A06(r6)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            if (r1 == 0) goto L_0x09c1
            X.9Wj r0 = new X.9Wj
            r0.<init>(r1, r4, r5, r7)
            r6.add(r0)
            X.17c r0 = r8.A01
            X.147 r5 = r0.A02(r1)
            if (r5 == 0) goto L_0x09c1
            X.12q r0 = r8.A00
            java.lang.String r4 = r0.A0D(r5)
            r1 = 1
            X.9Wj r0 = new X.9Wj
            r0.<init>(r5, r4, r1, r7)
            r6.add(r0)
        L_0x09c1:
            r2.A1f(r6)
            goto L_0x094d
        L_0x09c5:
            boolean r0 = r3 instanceof X.C177108dD
            if (r0 == 0) goto L_0x09f6
            java.lang.String r4 = X.C186938ww.A08(r13)
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x09f4
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
        L_0x09da:
            X.8nq r2 = new X.8nq
            r2.<init>(r14, r10)
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x094d
            X.9Wj r0 = X.C195869Wj.A00(r0, r1)
            java.util.List r0 = X.C36371kC.A11(r0)
            r2.A1f(r0)
            goto L_0x094d
        L_0x09f4:
            r1 = 0
            goto L_0x09da
        L_0x09f6:
            boolean r0 = r3 instanceof X.C177088dB
            if (r0 == 0) goto L_0x0a03
            r0 = 20
        L_0x09fc:
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            goto L_0x094d
        L_0x0a03:
            boolean r0 = r3 instanceof X.C177078dA
            if (r0 == 0) goto L_0x0a0a
            r0 = 79
            goto L_0x09fc
        L_0x0a0a:
            r0 = 90
            X.8nP r2 = new X.8nP
            r2.<init>(r14, r0, r10)
            goto L_0x094d
        L_0x0a13:
            boolean r0 = r12 instanceof X.C186398w0
            if (r0 == 0) goto L_0x0a38
            r0 = 51
            X.8nz r3 = new X.8nz
            r3.<init>(r14, r0, r10)
            java.lang.String r0 = r13.participant_
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r2, r3, r0)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r4 = X.C36361kB.A0r(r0)
            r1 = 0
        L_0x0a2c:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0dac
            A0A(r2, r13, r4, r1)
            int r1 = r1 + 1
            goto L_0x0a2c
        L_0x0a38:
            boolean r0 = r12 instanceof X.C186388vz
            if (r0 == 0) goto L_0x0a47
            r1 = 21
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            X.C186928wv.A09(r13, r0)
            return r0
        L_0x0a47:
            boolean r0 = r12 instanceof X.C186768wf
            if (r0 == 0) goto L_0x0a6d
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0C(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1 = 74
            if (r0 == 0) goto L_0x0a67
            r1 = 73
        L_0x0a67:
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            return r0
        L_0x0a6d:
            boolean r0 = r12 instanceof X.C186378vy
            if (r0 == 0) goto L_0x0ad3
            X.8n9 r1 = new X.8n9
            r1.<init>(r14, r10)
            X.C186928wv.A09(r13, r1)
            r3 = 0
            r1.A16(r3)
            r4 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r2 = X.C36401kF.A0s(r0, r4)
            java.lang.String r0 = "remove"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0acf
            r1.A1a(r3)
        L_0x0a8f:
            int r2 = r13.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0110
            X.8QP r3 = r13.photoChange_
            if (r3 != 0) goto L_0x0a9c
            X.8QP r3 = X.AnonymousClass8QP.DEFAULT_INSTANCE
        L_0x0a9c:
            com.whatsapp.data.ProfilePhotoChange r2 = new com.whatsapp.data.ProfilePhotoChange
            r2.<init>()
            int r0 = r3.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0ab0
            X.AUx r0 = r3.newPhoto_
            byte[] r0 = r0.A06()
            r2.newPhoto = r0
            r4 = 1
        L_0x0ab0:
            int r0 = r3.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0abf
            X.AUx r0 = r3.oldPhoto_
            byte[] r0 = r0.A06()
            r2.oldPhoto = r0
            r4 = 1
        L_0x0abf:
            int r0 = r3.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0acc
            int r0 = r3.newPhotoId_
            r2.newPhotoId = r0
        L_0x0ac9:
            r1.A00 = r2
            return r1
        L_0x0acc:
            if (r4 == 0) goto L_0x0110
            goto L_0x0ac9
        L_0x0acf:
            r1.A1a(r2)
            goto L_0x0a8f
        L_0x0ad3:
            boolean r0 = r12 instanceof X.C186368vx
            if (r0 == 0) goto L_0x0ae2
            r1 = 17
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            X.C186928wv.A09(r13, r0)
            return r0
        L_0x0ae2:
            boolean r0 = r12 instanceof X.C186358vw
            if (r0 == 0) goto L_0x0afe
            r0 = 11
            X.8nz r1 = new X.8nz
            r1.<init>(r14, r0, r10)
            X.C186928wv.A09(r13, r1)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x0110
            java.lang.String r0 = X.C186938ww.A08(r13)
            r1.A16(r0)
            return r1
        L_0x0afe:
            boolean r0 = r12 instanceof X.C186758we
            if (r0 == 0) goto L_0x0b2d
            r5 = r12
            X.8we r5 = (X.C186758we) r5
            int r0 = X.C170918Hz.A00(r13)
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0daf
            r0 = 4
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r4)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.C165577te.A17(r0, r2, r1)
            X.0wQ r1 = r5.A00
            X.11F r0 = r2.A0J()
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x0024
            r2.A00 = r3
            return r2
        L_0x0b2d:
            boolean r0 = r12 instanceof X.C186748wd
            if (r0 == 0) goto L_0x0bb6
            r5 = r12
            X.8wd r5 = (X.C186748wd) r5
            r0 = 28
            X.8nA r4 = new X.8nA
            r4.<init>(r14, r0, r10)
            X.0wN r0 = r5.A0F
            r4.A02 = r0
            java.lang.String r0 = X.C186938ww.A08(r13)
            X.13r r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r3.A02(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r4.A01 = r0
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            com.whatsapp.jid.UserJid r1 = r3.A02(r0)
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x0df6
            X.12O r0 = r5.A00
            X.13w r1 = (X.C223313w) r1
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r1)
            if (r1 != 0) goto L_0x0df9
            java.lang.String r0 = "ContactChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
            goto L_0x08d9
        L_0x0b6b:
            X.B6c r0 = r13.messageStubParameters_     // Catch:{ NumberFormatException -> 0x0b76 }
            java.lang.String r0 = X.C36401kF.A0s(r0, r6)     // Catch:{ NumberFormatException -> 0x0b76 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0b76 }
            goto L_0x0b7b
        L_0x0b76:
            java.lang.String r0 = "Failed to parse number of broadcast participants."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0b7b:
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x0b8b
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r3.A16(r0)
        L_0x0b8b:
            r2 = 2
            X.B6c r0 = r13.messageStubParameters_
            int r0 = X.C36421kH.A06(r0, r2)
            if (r0 != r6) goto L_0x0baa
            X.B6c r0 = r13.messageStubParameters_
            int r0 = X.C36421kH.A06(r0, r2)
            java.util.ArrayList r1 = X.C36441kJ.A14(r0)
        L_0x0b9e:
            int r0 = X.C170918Hz.A00(r13)
            if (r2 >= r0) goto L_0x0bb2
            A0B(r4, r13, r1, r2)
            int r2 = r2 + 1
            goto L_0x0b9e
        L_0x0baa:
            com.whatsapp.jid.UserJid r0 = r5.A00
            if (r0 == 0) goto L_0x0040
            java.util.List r1 = java.util.Collections.nCopies(r6, r0)
        L_0x0bb2:
            r3.A19(r1)
            return r3
        L_0x0bb6:
            boolean r0 = r12 instanceof X.C186958wy
            if (r0 == 0) goto L_0x0bdc
            r0 = 0
            X.C36321k7.A0v(r14, r0, r13)
            java.lang.String r3 = X.C1902497l.A00(r13, r0)
            if (r3 != 0) goto L_0x0bc6
            java.lang.String r3 = ""
        L_0x0bc6:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r2 = r1.A02(r0)
            r1 = 145(0x91, float:2.03E-43)
            X.8nz r0 = new X.8nz
            r0.<init>(r14, r1, r10)
            r0.A0q(r2)
            r0.A16(r3)
            return r0
        L_0x0bdc:
            boolean r0 = r12 instanceof X.C186348vv
            if (r0 == 0) goto L_0x0dfd
            r5 = 0
            int r4 = X.C36361kB.A04(r14, r13, r5)
            X.8ns r2 = new X.8ns
            r2.<init>(r14, r10)
            java.lang.String r0 = r13.participant_
            r3 = 0
            if (r0 == 0) goto L_0x0c21
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0bf8
            r1 = r3
        L_0x0bf8:
            X.11F r1 = (X.AnonymousClass11F) r1
        L_0x0bfa:
            r2.A0q(r1)
            int r0 = X.C170918Hz.A00(r13)
            if (r0 < r4) goto L_0x0024
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r5)
            if (r0 == 0) goto L_0x0c16
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r0)
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x0c14
            r3 = r1
        L_0x0c14:
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
        L_0x0c16:
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r2.A1g(r3, r0)
            return r2
        L_0x0c21:
            r1 = r3
            goto L_0x0bfa
        L_0x0c23:
            java.lang.String r0 = "Invalid Sender JID"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0c29:
            java.lang.String r0 = "Invalid stub type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0c30:
            return r6
        L_0x0c31:
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_     // Catch:{ NumberFormatException -> 0x0c3d }
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)     // Catch:{ NumberFormatException -> 0x0c3d }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0c3d }
            goto L_0x0c42
        L_0x0c3d:
            java.lang.String r0 = "Failed to parse number group size threshold."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0c42:
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0c58
            if (r3 <= 0) goto L_0x0c55
            X.8nR r1 = new X.8nR
            r1.<init>(r14, r3, r10)
        L_0x0c51:
            X.C186928wv.A09(r13, r1)
            return r1
        L_0x0c55:
            r0 = 29
            goto L_0x0c62
        L_0x0c58:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0c68
            r0 = 30
        L_0x0c62:
            X.8nz r1 = new X.8nz
            r1.<init>(r14, r0, r10)
            goto L_0x0c51
        L_0x0c68:
            java.lang.String r0 = "GroupChangeRestrict/restoreFMessage/invalid value of restrictModeEnabledValue parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0c6f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupChangeReportToAdminEnabledWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r2, r1)
            throw r0
        L_0x0c7d:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        L_0x0c82:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GROUP_CHANGE_RECENT_HISTORY_SHARING/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r2, r1)
            throw r0
        L_0x0c90:
            java.lang.String r0 = "GroupChangeAnnounceQuery/restoreFMessage/invalid value of groupAnnouncementsEnabled parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0c97:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupChangeAllowNonAdminSubgroupCreationWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r2, r1)
            throw r0
        L_0x0ca5:
            int r0 = X.C170918Hz.A00(r13)
            if (r0 == r1) goto L_0x0cb2
            java.lang.String r0 = "ChatAssignmentWebQuery/restoreFMessage  wrong parameter size"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
            return r3
        L_0x0cb2:
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r3.A01 = r1
            r3.A00 = r0
            return r3
        L_0x0cbe:
            r2.A00 = r3
            X.11F r0 = r14.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            X.C18740tg.A0C(r0)
            return r2
        L_0x0cc8:
            r0 = 34
            goto L_0x0d26
        L_0x0ccb:
            r0 = 33
            goto L_0x0d26
        L_0x0cce:
            r0 = 32
            goto L_0x0d26
        L_0x0cd1:
            r0 = 31
            goto L_0x0d26
        L_0x0cd4:
            r0 = 30
            goto L_0x0d26
        L_0x0cd7:
            r0 = 29
            goto L_0x0d26
        L_0x0cda:
            r0 = 28
            goto L_0x0d26
        L_0x0cdd:
            r0 = 27
            goto L_0x0d26
        L_0x0ce0:
            r0 = 26
            goto L_0x0d26
        L_0x0ce3:
            r0 = 25
            goto L_0x0d26
        L_0x0ce6:
            r0 = 24
            goto L_0x0d26
        L_0x0ce9:
            r0 = 23
            goto L_0x0d26
        L_0x0cec:
            r0 = 22
            goto L_0x0d26
        L_0x0cef:
            r0 = 21
            goto L_0x0d26
        L_0x0cf2:
            r0 = 20
            goto L_0x0d26
        L_0x0cf5:
            r0 = 19
            goto L_0x0d26
        L_0x0cf8:
            r0 = 18
            goto L_0x0d26
        L_0x0cfb:
            r0 = 17
            goto L_0x0d26
        L_0x0cfe:
            r0 = 16
            goto L_0x0d26
        L_0x0d01:
            r0 = 15
            goto L_0x0d26
        L_0x0d04:
            r0 = 14
            goto L_0x0d26
        L_0x0d07:
            r0 = 13
            goto L_0x0d26
        L_0x0d0a:
            r0 = 12
            goto L_0x0d26
        L_0x0d0d:
            r0 = 11
            goto L_0x0d26
        L_0x0d10:
            r0 = 10
            goto L_0x0d26
        L_0x0d13:
            r0 = 9
            goto L_0x0d26
        L_0x0d16:
            r0 = 8
            goto L_0x0d26
        L_0x0d19:
            r0 = 7
            goto L_0x0d26
        L_0x0d1b:
            r0 = 6
            goto L_0x0d26
        L_0x0d1d:
            r0 = 5
            goto L_0x0d26
        L_0x0d1f:
            r0 = 4
            goto L_0x0d26
        L_0x0d21:
            r0 = 3
            goto L_0x0d26
        L_0x0d23:
            r0 = 2
            goto L_0x0d26
        L_0x0d25:
            r0 = 1
        L_0x0d26:
            r1.A00 = r0
            java.lang.String r0 = X.C186938ww.A08(r13)
            r1.A01 = r0
            return r1
        L_0x0d2f:
            r3.A01 = r1
            return r3
        L_0x0d32:
            if (r1 != 0) goto L_0x0d35
            return r2
        L_0x0d35:
            r3.A1Z(r1)
            return r3
        L_0x0d39:
            int r0 = X.C170918Hz.A00(r13)
            if (r0 > r1) goto L_0x0d40
            r1 = 0
        L_0x0d40:
            X.C18740tg.A0C(r1)
            r0 = 13
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r1 = X.C36361kB.A0r(r0)
        L_0x0d50:
            int r0 = X.C170918Hz.A00(r13)
            if (r3 >= r0) goto L_0x0d68
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r3)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            if (r0 == 0) goto L_0x0d65
            r1.add(r0)
        L_0x0d65:
            int r3 = r3 + 1
            goto L_0x0d50
        L_0x0d68:
            r2.A01 = r1
            return r2
        L_0x0d6b:
            boolean r0 = r3 instanceof X.C177108dD
            java.util.HashSet r6 = X.C36441kJ.A16()
            if (r0 != 0) goto L_0x0d86
            r1 = 0
        L_0x0d74:
            int r0 = X.C170918Hz.A00(r13)
            if (r1 >= r0) goto L_0x0d86
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0d74
        L_0x0d86:
            java.util.Iterator r4 = r6.iterator()
        L_0x0d8a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0da9
            java.lang.String r0 = X.AnonymousClass001.A0C(r4)
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            if (r1 == 0) goto L_0x0d8a
            X.0wQ r0 = r3.A00
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0da5
            r0 = 1
            r2.A00 = r0
        L_0x0da5:
            r5.add(r1)
            goto L_0x0d8a
        L_0x0da9:
            r2.A01 = r5
            return r2
        L_0x0dac:
            r3.A01 = r4
            return r3
        L_0x0daf:
            int r0 = X.C170918Hz.A00(r13)
            boolean r0 = X.C90474aD.A1T(r0, r3)
            X.C18740tg.A0B(r0)
            r0 = 12
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            X.B6c r0 = r13.messageStubParameters_
            java.util.ArrayList r6 = X.C36361kB.A0r(r0)
            int r0 = r13.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0dd0
            X.C186928wv.A09(r13, r2)
        L_0x0dd0:
            int r0 = X.C170918Hz.A00(r13)
            if (r4 >= r0) goto L_0x0df3
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r4)
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            X.C18740tg.A06(r1)
            X.0wQ r0 = r5.A00
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0ded
            r2.A00 = r3
        L_0x0ded:
            r6.add(r1)
            int r4 = r4 + 1
            goto L_0x0dd0
        L_0x0df3:
            r2.A01 = r6
            return r2
        L_0x0df6:
            if (r1 != 0) goto L_0x0df9
            return r2
        L_0x0df9:
            r4.A1Z(r1)
            return r4
        L_0x0dfd:
            boolean r0 = r12 instanceof X.C186998x2
            if (r0 == 0) goto L_0x0e28
            r1 = r12
            X.8x2 r1 = (X.C186998x2) r1
            r0 = 0
            X.C36321k7.A0v(r14, r0, r13)
            X.12q r1 = r1.A00
            X.11F r0 = r14.A00
            java.lang.String r2 = r1.A0D(r0)
            if (r2 != 0) goto L_0x0e14
            java.lang.String r2 = ""
        L_0x0e14:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r1 = r1.A02(r0)
            X.8nT r0 = new X.8nT
            r0.<init>((X.C64933Qa) r14, (long) r10)
            r0.A16(r2)
            r0.A0q(r1)
            return r0
        L_0x0e28:
            boolean r0 = r12 instanceof X.C186988x1
            if (r0 == 0) goto L_0x0e6a
            r2 = r12
            X.8x1 r2 = (X.C186988x1) r2
            r0 = 0
            X.C36321k7.A0v(r14, r0, r13)
            java.lang.String r5 = X.C1902497l.A00(r13, r0)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.11F r1 = r14.A00
            X.147 r4 = X.C65533Sl.A03(r1)
            X.12q r0 = r2.A00
            java.lang.String r3 = r0.A0D(r1)
            if (r3 != 0) goto L_0x0e49
            java.lang.String r3 = ""
        L_0x0e49:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r2 = r1.A02(r0)
            X.8zi r0 = X.AnonymousClass97S.A00(r5)
            if (r0 != 0) goto L_0x0e59
            X.8zi r0 = X.C188518zi.AUTO_ADD_DISABLED_GROUP_IS_FULL
        L_0x0e59:
            X.8na r1 = new X.8na
            r1.<init>((X.C64933Qa) r14, (long) r10)
            int r0 = r0.versionId
            r1.A1i(r4, r3, r0)
            r1.A16(r3)
            r1.A0q(r2)
            return r1
        L_0x0e6a:
            boolean r0 = r12 instanceof X.C186978x0
            if (r0 == 0) goto L_0x0ecf
            r0 = 0
            int r1 = X.C36361kB.A04(r14, r13, r0)
            r2 = 0
            java.lang.String r5 = X.C1902497l.A00(r13, r0)
            r0 = 1
            java.lang.String r6 = X.C1902497l.A00(r13, r0)
            java.lang.String r0 = X.C1902497l.A00(r13, r1)
            if (r0 == 0) goto L_0x0e89
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto L_0x0e8a
        L_0x0e89:
            r2 = 1
        L_0x0e8a:
            java.lang.String r0 = "created"
            boolean r1 = X.AnonymousClass00C.A0J(r5, r0)
            java.lang.String r4 = ""
            r3 = r2 ^ 1
            X.3Sl r0 = X.AnonymousClass147.A01
            X.11F r0 = r14.A00
            X.147 r2 = X.C65533Sl.A03(r0)
            if (r1 == 0) goto L_0x0eb5
            if (r6 == 0) goto L_0x0ea1
            r4 = r6
        L_0x0ea1:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)
            X.8nZ r1 = new X.8nZ
            r1.<init>((X.C64933Qa) r14, (long) r10)
            r1.A1i(r2, r4, r3)
            r1.A0q(r0)
            return r1
        L_0x0eb5:
            if (r6 == 0) goto L_0x0eb8
            r4 = r6
        L_0x0eb8:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)
            X.8nY r1 = new X.8nY
            r1.<init>((X.C64933Qa) r14, (long) r10)
            r1.A1i(r2, r4, r3)
            r1.A0q(r0)
            r1.A16(r5)
            return r1
        L_0x0ecf:
            boolean r0 = r12 instanceof X.C186868wp
            if (r0 == 0) goto L_0x0f51
            r2 = r12
            X.8wp r2 = (X.C186868wp) r2
            r0 = 0
            int r3 = X.C36361kB.A04(r14, r13, r0)
            X.3Sl r1 = X.AnonymousClass147.A01
            java.lang.String r0 = X.C1902497l.A00(r13, r0)
            X.147 r5 = r1.A06(r0)
            r0 = 1
            java.lang.String r4 = X.C1902497l.A00(r13, r0)
            java.lang.String r3 = X.C1902497l.A00(r13, r3)
            r0 = 3
            java.lang.String r9 = X.C1902497l.A00(r13, r0)
            X.11F r6 = r14.A00
            boolean r0 = r6 instanceof X.AnonymousClass144
            r7 = 0
            if (r0 == 0) goto L_0x0f4f
            r1 = r6
            X.144 r1 = (X.AnonymousClass144) r1
            if (r1 == 0) goto L_0x0f4f
            X.17X r0 = r2.A01
            X.17r r0 = r0.A07
            X.6X6 r0 = r0.A0C(r1)
            java.util.ArrayList r0 = r0.A0F()
            java.util.Iterator r8 = r0.iterator()
        L_0x0f0f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0f4d
            java.lang.Object r2 = r8.next()
            r0 = r2
            X.6PM r0 = (X.AnonymousClass6PM) r0
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x0f0f
        L_0x0f21:
            X.6PM r2 = (X.AnonymousClass6PM) r2
        L_0x0f23:
            boolean r0 = r6 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x0f4b
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
        L_0x0f29:
            if (r2 == 0) goto L_0x0f49
            com.whatsapp.jid.UserJid r1 = r2.A03
        L_0x0f2d:
            if (r9 == 0) goto L_0x0f37
            boolean r0 = java.lang.Boolean.parseBoolean(r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0f37:
            X.8nL r0 = new X.8nL
            r0.<init>((X.C64933Qa) r14, (long) r10)
            r0.A1h(r5, r4)
            r0.A1i(r6, r7, r3)
            r0.A0q(r1)
            r0.A16(r3)
            return r0
        L_0x0f49:
            r1 = r7
            goto L_0x0f2d
        L_0x0f4b:
            r6 = r7
            goto L_0x0f29
        L_0x0f4d:
            r2 = r7
            goto L_0x0f21
        L_0x0f4f:
            r2 = r7
            goto L_0x0f23
        L_0x0f51:
            boolean r0 = r12 instanceof X.C186738wc
            if (r0 == 0) goto L_0x0f8d
            r2 = r12
            X.8wc r2 = (X.C186738wc) r2
            int r1 = X.C170918Hz.A00(r13)
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0B(r0)
            r1 = 0
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r1)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r5 = r0.A06(r1)
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r9 = X.C36401kF.A0s(r0, r1)
            X.19x r3 = r2.A01
            r7 = 0
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r6 = X.C36431kI.A0l(r0)
            X.11F r0 = r14.A00
            com.whatsapp.jid.GroupJid r4 = X.AnonymousClass6SZ.A00(r0)
            r8 = r7
            X.8ns r0 = r3.A0B(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0f8d:
            boolean r0 = r12 instanceof X.C186918wu
            if (r0 == 0) goto L_0x1033
            r5 = r12
            X.8wu r5 = (X.C186918wu) r5
            r4 = 0
            int r2 = X.C36361kB.A04(r14, r13, r4)
            X.91I r1 = r13.A0u()
            boolean r3 = r5 instanceof X.C174578Xq
            if (r3 == 0) goto L_0x102c
            r0 = r5
            X.8Xq r0 = (X.C174578Xq) r0
            X.91I r0 = r0.A00
        L_0x0fa6:
            r6 = 0
            if (r1 != r0) goto L_0x1006
            int r0 = X.C170918Hz.A00(r13)
            if (r0 < r2) goto L_0x1006
            X.11F r1 = r14.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x1006
            if (r1 == 0) goto L_0x1006
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r4)
            if (r0 == 0) goto L_0x1004
            com.whatsapp.jid.Jid r2 = X.C36411kG.A0i(r0)
            boolean r0 = r2 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x0fc8
            r2 = r6
        L_0x0fc8:
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
        L_0x0fca:
            r1 = 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r7 = X.C36401kF.A0s(r0, r1)
            if (r7 != 0) goto L_0x0fd5
            java.lang.String r7 = ""
        L_0x0fd5:
            java.lang.String r0 = r13.participant_
            if (r0 == 0) goto L_0x0fe4
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0fe2
            r6 = r1
        L_0x0fe2:
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x0fe4:
            if (r3 == 0) goto L_0x0ff9
            X.8Xq r5 = (X.C174578Xq) r5
            X.19x r3 = r5.A01
            r1 = 0
            X.8ne r0 = new X.8ne
            r0.<init>(r14, r10)
        L_0x0ff0:
            r0.A03 = r1
            r0.A1g(r2, r7)
            X.C238019x.A01(r6, r0, r3, r4)
            return r0
        L_0x0ff9:
            X.8Xp r5 = (X.C174568Xp) r5
            X.19x r3 = r5.A01
            r1 = 0
            X.8nb r0 = new X.8nb
            r0.<init>(r14, r10)
            goto L_0x0ff0
        L_0x1004:
            r2 = r6
            goto L_0x0fca
        L_0x1006:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r3 == 0) goto L_0x1029
            java.lang.String r0 = "SUBGROUP_UNLINKED_FROM_PARENT"
        L_0x100e:
            r1.append(r0)
            java.lang.String r0 = "/invalid wmi"
            X.C36321k7.A1Z(r1, r0)
            r2 = 0
            java.lang.String r0 = r13.participant_
            if (r0 == 0) goto L_0x1026
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x1024
            r6 = r1
        L_0x1024:
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x1026:
            java.lang.String r7 = ""
            goto L_0x0fe4
        L_0x1029:
            java.lang.String r0 = "SUBGROUP_LINKED_TO_PARENT"
            goto L_0x100e
        L_0x102c:
            r0 = r5
            X.8Xp r0 = (X.C174568Xp) r0
            X.91I r0 = r0.A00
            goto L_0x0fa6
        L_0x1033:
            boolean r0 = r12 instanceof X.C186858wo
            if (r0 == 0) goto L_0x108d
            r3 = r12
            X.8wo r3 = (X.C186858wo) r3
            int r0 = X.C170918Hz.A00(r13)
            r2 = 0
            if (r0 <= 0) goto L_0x108b
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r1 = X.C36401kF.A0s(r0, r2)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r5 = r0.A06(r1)
        L_0x104d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            X.91I r1 = r13.A0u()
            X.91I r0 = X.AnonymousClass91I.A1N
            r2 = 2
            if (r1 != r0) goto L_0x107a
            r6 = 2
        L_0x105b:
            X.19x r4 = r3.A03
            X.3Sl r0 = X.AnonymousClass147.A01
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r3 = X.C36431kI.A0l(r0)
            r2 = 0
            r0 = 75
            X.8nQ r1 = new X.8nQ
            r1.<init>(r14, r0, r10)
            r1.A03 = r2
            r1.A02 = r7
            r1.A00 = r6
            r1.A01 = r5
            r0 = 0
            X.C238019x.A01(r3, r1, r4, r0)
            return r1
        L_0x107a:
            X.91I r0 = X.AnonymousClass91I.A1X
            boolean r1 = X.C36361kB.A1a(r1, r0)
            java.lang.String r0 = "MessageStubeType was not COMMUNITY_UNLINK_PARENT_GROUP"
            X.C18740tg.A0D(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6 = 0
            goto L_0x105b
        L_0x108b:
            r5 = 0
            goto L_0x104d
        L_0x108d:
            boolean r0 = r12 instanceof X.C186838wm
            if (r0 == 0) goto L_0x1108
            r2 = 0
            X.C36321k7.A0v(r14, r2, r13)
            int r0 = X.C170918Hz.A00(r13)
            r4 = 0
            if (r0 <= 0) goto L_0x10d3
            X.3Sl r1 = X.AnonymousClass147.A01
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r2)
            X.147 r3 = r1.A06(r0)
        L_0x10a8:
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x10b5
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r4 = X.C36401kF.A0s(r0, r1)
        L_0x10b5:
            X.91I r2 = r13.A0u()
            int r0 = r2.ordinal()
            switch(r0) {
                case 142: goto L_0x10d5;
                case 163: goto L_0x10db;
                case 164: goto L_0x10e1;
                case 165: goto L_0x10e7;
                case 166: goto L_0x10ed;
                case 167: goto L_0x10f3;
                case 168: goto L_0x10f9;
                case 185: goto L_0x10ff;
                default: goto L_0x10c0;
            }
        L_0x10c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageStubType "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is not supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x10d3:
            r3 = r4
            goto L_0x10a8
        L_0x10d5:
            X.8nF r0 = new X.8nF
            r0.<init>((X.C64933Qa) r14, (long) r10)
            goto L_0x1104
        L_0x10db:
            X.8nH r0 = new X.8nH
            r0.<init>((X.C64933Qa) r14, (long) r10)
            goto L_0x1104
        L_0x10e1:
            X.8nI r0 = new X.8nI
            r0.<init>((X.C64933Qa) r14, (long) r10)
            goto L_0x1104
        L_0x10e7:
            X.8nC r0 = new X.8nC
            r0.<init>(r14, r10)
            goto L_0x1104
        L_0x10ed:
            X.8nD r0 = new X.8nD
            r0.<init>(r14, r10)
            goto L_0x1104
        L_0x10f3:
            X.8nB r0 = new X.8nB
            r0.<init>(r14, r10)
            goto L_0x1104
        L_0x10f9:
            X.8nJ r0 = new X.8nJ
            r0.<init>((X.C64933Qa) r14, (long) r10)
            goto L_0x1104
        L_0x10ff:
            X.8nG r0 = new X.8nG
            r0.<init>((X.C64933Qa) r14, (long) r10)
        L_0x1104:
            r0.A1h(r3, r4)
            return r0
        L_0x1108:
            boolean r0 = r12 instanceof X.C186728wb
            if (r0 == 0) goto L_0x112d
            int r0 = X.C170918Hz.A00(r13)
            if (r0 <= 0) goto L_0x112b
            java.lang.String r3 = X.C186938ww.A08(r13)
        L_0x1116:
            X.3Sl r0 = X.AnonymousClass147.A01
            java.lang.String r0 = r13.participant_
            com.whatsapp.jid.UserJid r2 = X.C36431kI.A0l(r0)
            r1 = 87
            X.8nP r0 = new X.8nP
            r0.<init>(r14, r1, r10)
            r0.A00 = r3
            r0.A0q(r2)
            return r0
        L_0x112b:
            r3 = 0
            goto L_0x1116
        L_0x112d:
            boolean r0 = r12 instanceof X.C186718wa
            if (r0 == 0) goto L_0x114c
            r0 = 11
            X.8nz r2 = new X.8nz
            r2.<init>(r14, r0, r10)
            int r0 = X.C170918Hz.A00(r13)
            r1 = 1
            if (r0 <= r1) goto L_0x1148
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            r2.A16(r0)
        L_0x1148:
            X.C186928wv.A09(r13, r2)
            return r2
        L_0x114c:
            boolean r0 = r12 instanceof X.C186928wv
            if (r0 == 0) goto L_0x1257
            r4 = r12
            X.8wv r4 = (X.C186928wv) r4
            X.12q r7 = r4.A01
            java.util.HashSet r2 = X.C36441kJ.A16()
            int r6 = X.C170918Hz.A00(r13)
            r5 = 0
        L_0x115e:
            if (r5 >= r6) goto L_0x118b
            X.B6c r0 = r13.messageStubParameters_     // Catch:{ 0wR -> 0x117f }
            java.lang.String r1 = X.C36401kF.A0s(r0, r5)     // Catch:{ 0wR -> 0x117f }
            X.3Sl r0 = X.AnonymousClass147.A01     // Catch:{ 0wR -> 0x117f }
            X.147 r3 = X.C65533Sl.A04(r1)     // Catch:{ 0wR -> 0x117f }
            X.3Qp r1 = X.C36371kC.A0W(r7, r3)
            if (r1 == 0) goto L_0x1182
            java.lang.String r0 = r1.A08()
            if (r0 == 0) goto L_0x1182
            java.lang.String r0 = r1.A08()
        L_0x117c:
            X.C165587tf.A1A(r3, r0, r2)
        L_0x117f:
            int r5 = r5 + 2
            goto L_0x115e
        L_0x1182:
            int r1 = r5 + 1
            X.B6c r0 = r13.messageStubParameters_
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            goto L_0x117c
        L_0x118b:
            X.11F r0 = r14.A00
            X.147 r3 = X.C65533Sl.A01(r0)
            boolean r0 = r4 instanceof X.AnonymousClass8Xk
            if (r0 == 0) goto L_0x11c1
            X.8Xk r4 = (X.AnonymousClass8Xk) r4
            r0 = 0
            X.C36321k7.A16(r14, r13, r2, r0)
            boolean r0 = r4 instanceof X.C174618Xu
            if (r0 == 0) goto L_0x11bb
            X.8nl r1 = new X.8nl
            r1.<init>(r14, r10)
        L_0x11a4:
            java.lang.String r0 = r13.participant_
            r4 = 0
            if (r0 == 0) goto L_0x11b4
            com.whatsapp.jid.Jid r3 = X.C36411kG.A0i(r0)
            boolean r0 = r3 instanceof X.AnonymousClass11F
            if (r0 == 0) goto L_0x11b2
            r4 = r3
        L_0x11b2:
            X.11F r4 = (X.AnonymousClass11F) r4
        L_0x11b4:
            r1.A0q(r4)
            r1.A1h(r2)
            return r1
        L_0x11bb:
            X.8nk r1 = new X.8nk
            r1.<init>(r14, r10)
            goto L_0x11a4
        L_0x11c1:
            boolean r0 = r4 instanceof X.AnonymousClass8Xj
            if (r0 == 0) goto L_0x1207
            X.8Xj r4 = (X.AnonymousClass8Xj) r4
            r0 = 0
            X.C36321k7.A16(r14, r13, r2, r0)
            r0 = 4
            X.AnonymousClass00C.A0D(r3, r0)
            boolean r0 = r4 instanceof X.C174598Xs
            if (r0 == 0) goto L_0x1201
            X.8nj r1 = new X.8nj
            r1.<init>(r14, r10)
        L_0x11d8:
            java.lang.String r0 = r13.participant_
            r6 = 0
            if (r0 == 0) goto L_0x11e8
            com.whatsapp.jid.Jid r5 = X.C36411kG.A0i(r0)
            boolean r0 = r5 instanceof X.AnonymousClass11F
            if (r0 == 0) goto L_0x11e6
            r6 = r5
        L_0x11e6:
            X.11F r6 = (X.AnonymousClass11F) r6
        L_0x11e8:
            r1.A0q(r6)
            X.17c r0 = r4.A02
            X.147 r4 = r0.A02(r3)
            if (r4 == 0) goto L_0x11fd
            java.util.List r3 = r1.A00
            r0 = 0
            X.9Wj r0 = X.C195869Wj.A00(r4, r0)
            r3.add(r0)
        L_0x11fd:
            r1.A1h(r2)
            return r1
        L_0x1201:
            X.8ni r1 = new X.8ni
            r1.<init>(r14, r10)
            goto L_0x11d8
        L_0x1207:
            boolean r0 = r4 instanceof X.C174558Xo
            if (r0 == 0) goto L_0x121c
            r0 = 89
            X.2cS r1 = new X.2cS
            r1.<init>(r14, r0, r10)
            X.C186928wv.A09(r13, r1)
            int r0 = X.C186928wv.A08(r4, r3, r1, r2)
            r1.A00 = r0
            return r1
        L_0x121c:
            boolean r0 = r4 instanceof X.C174548Xn
            if (r0 == 0) goto L_0x1231
            r0 = 88
            X.2cS r1 = new X.2cS
            r1.<init>(r14, r0, r10)
            X.C186928wv.A09(r13, r1)
            int r0 = X.C186928wv.A08(r4, r3, r1, r2)
            r1.A00 = r0
            return r1
        L_0x1231:
            boolean r0 = r4 instanceof X.C174538Xm
            if (r0 == 0) goto L_0x1246
            r0 = 78
            X.2cS r1 = new X.2cS
            r1.<init>(r14, r0, r10)
            X.C186928wv.A09(r13, r1)
            int r0 = X.C186928wv.A08(r4, r3, r1, r2)
            r1.A00 = r0
            return r1
        L_0x1246:
            r0 = 77
            X.2cS r1 = new X.2cS
            r1.<init>(r14, r0, r10)
            X.C186928wv.A09(r13, r1)
            int r0 = X.C186928wv.A08(r4, r3, r1, r2)
            r1.A00 = r0
            return r1
        L_0x1257:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195469Uk.A0C(X.8SU, X.3Qa, long):X.3T1");
    }

    public C195469Uk(C19700wN r1) {
        this.A0F = r1;
    }

    public static void A0A(C222813r r1, AnonymousClass8SU r2, AbstractCollection abstractCollection, int i) {
        UserJid A022 = r1.A02(r2.A0v(i));
        if (A022 != null) {
            abstractCollection.add(A022);
        }
    }

    public static void A0B(C222813r r1, AnonymousClass8SU r2, AbstractCollection abstractCollection, int i) {
        UserJid A022 = r1.A02(r2.A0v(i));
        if (A022 != null) {
            abstractCollection.add(A022);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[id: ");
        A0u.append(this.A09);
        A0u.append(" jid: ");
        return C165567td.A0X(this.A06, A0u);
    }
}
