package X;

import java.util.ArrayList;

/* renamed from: X.8vh  reason: invalid class name and case insensitive filesystem */
public class C186278vh extends AnonymousClass5PS {
    public Object A00;
    public Object A01;

    public static boolean A00(C203399nx r3, C203399nx r4, C186278vh r5, int i) {
        r5.A01 = C203539oF.A06(r4, new C23212B9u(r3, i), new String[0]);
        return false;
    }

    public C186278vh(C203399nx r4, C107535Pi r5) {
        C22993Azj[] azjArr = new C22993Azj[4];
        azjArr[A00(C90514aH.A0e(r4, r5), r4, this, 11)] = C21356AIi.A00;
        azjArr[1] = C21357AIj.A00;
        azjArr[2] = C21358AIk.A00;
        this.A00 = C203379ns.A06(r4, "IQErrorInternalServerError|IQErrorForbidden|IQErrorBadRequest|IQErrorNotAllowed", C165567td.A0d(C21359AIl.A00, azjArr, 3), C165607th.A1a());
        this.A00 = r4;
    }

    public C186278vh(C203399nx r4, AnonymousClass2lL r5, int i) {
        ArrayList A0d;
        String[] A1a;
        String str;
        C203399nx A0e = C90514aH.A0e(r4, r5);
        if (i != 0) {
            char A002 = A00(A0e, r4, this, 8);
            C22993Azj[] azjArr = new C22993Azj[2];
            azjArr[A002] = AIZ.A00;
            A0d = C165567td.A0c(C21348AIa.A00, azjArr);
            A1a = C165607th.A1a();
            str = "IQErrorFeatureNotImplemented|IQErrorInternalServerError";
        } else {
            C22993Azj[] azjArr2 = new C22993Azj[4];
            azjArr2[A00(A0e, r4, this, 7)] = AIV.A00;
            azjArr2[1] = AIW.A00;
            azjArr2[2] = AIX.A00;
            A0d = C165567td.A0d(AIY.A00, azjArr2, 3);
            A1a = C165607th.A1a();
            str = "IQErrorNotAcceptable|IQErrorBadRequest|IQErrorForbidden|IQErrorRateOverlimit";
        }
        this.A00 = C203379ns.A06(r4, str, A0d, A1a);
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00df, code lost:
        r2 = X.C165567td.A0d(r1, r2, 2);
        r1 = X.C165607th.A1a();
        r0 = "IQErrorBadRequest|IQErrorForbidden|IQErrorInternalServerError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ea, code lost:
        r10.A00 = X.C203379ns.A06(r11, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0141, code lost:
        X.AnonymousClass00C.A0D(r11, 0);
        r0 = X.C203539oF.A09(r3, r4, r5, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0177, code lost:
        r0 = X.C203539oF.A00(r11, new X.C23214B9w(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        r10.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        r10.A00 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        r2 = X.C165567td.A0d(r1, r2, 3);
        r1 = X.C165607th.A1a();
        r0 = "IQErrorInternalServerError|IQErrorForbidden|IQErrorBadRequest|IQErrorNotAllowed";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C186278vh(X.C203399nx r11, X.C35911jS r12, int r13) {
        /*
            r10 = this;
            r10.<init>()
            r3 = r11
            switch(r13) {
                case 2: goto L_0x0029;
                case 3: goto L_0x0007;
                case 4: goto L_0x0047;
                case 5: goto L_0x0007;
                case 6: goto L_0x0070;
                case 7: goto L_0x008e;
                case 8: goto L_0x00a7;
                case 9: goto L_0x0007;
                case 10: goto L_0x00c7;
                case 11: goto L_0x00f2;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0112;
                case 23: goto L_0x0121;
                case 24: goto L_0x014b;
                case 25: goto L_0x015a;
                case 26: goto L_0x0169;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            r1 = 22
            X.B9w r0 = new X.B9w
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r11, r0)
            r10.A00 = r0
            java.lang.String r0 = "notice"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.ASX r0 = X.ASX.A00
            java.lang.Object r0 = X.C203379ns.A02(r11, r0, r1)
        L_0x0024:
            r10.A01 = r0
        L_0x0026:
            r10.A00 = r11
            return
        L_0x0029:
            X.9nx r1 = X.C90514aH.A0e(r11, r12)
            r0 = 9
            boolean r1 = A00(r1, r11, r10, r0)
            r0 = 4
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.AIe r0 = X.C21352AIe.A00
            r2[r1] = r0
            X.AIf r1 = X.C21353AIf.A00
            r0 = 1
            r2[r0] = r1
            X.AIg r1 = X.C21354AIg.A00
            r0 = 2
            r2[r0] = r1
            X.AIh r1 = X.C21355AIh.A00
            goto L_0x0064
        L_0x0047:
            X.9nx r1 = X.C90514aH.A0e(r11, r12)
            r0 = 14
            boolean r1 = A00(r1, r11, r10, r0)
            r0 = 4
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.AIq r0 = X.C21364AIq.A00
            r2[r1] = r0
            X.AIr r1 = X.C21365AIr.A00
            r0 = 1
            r2[r0] = r1
            X.AIs r1 = X.C21366AIs.A00
            r0 = 2
            r2[r0] = r1
            X.AIt r1 = X.C21367AIt.A00
        L_0x0064:
            r0 = 3
            java.util.ArrayList r2 = X.C165567td.A0d(r1, r2, r0)
            java.lang.String[] r1 = X.C165607th.A1a()
            java.lang.String r0 = "IQErrorInternalServerError|IQErrorForbidden|IQErrorBadRequest|IQErrorNotAllowed"
            goto L_0x00ea
        L_0x0070:
            X.9nx r1 = X.C90514aH.A0e(r11, r12)
            r0 = 33
            boolean r2 = A00(r1, r11, r10, r0)
            r0 = 2
            X.Azj[] r1 = new X.C22993Azj[r0]
            X.ALT r0 = X.ALT.A00
            r1[r2] = r0
            X.ALU r0 = X.ALU.A00
            java.util.ArrayList r2 = X.C165567td.A0c(r0, r1)
            java.lang.String[] r1 = X.C165607th.A1a()
            java.lang.String r0 = "IQErrorBadRequest|IQErrorInternalServerError"
            goto L_0x00ea
        L_0x008e:
            X.9nx r1 = X.C90514aH.A0e(r11, r12)
            r0 = 35
            boolean r1 = A00(r1, r11, r10, r0)
            r0 = 3
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.ALX r0 = X.ALX.A00
            r2[r1] = r0
            X.ALY r1 = X.ALY.A00
            r0 = 1
            r2[r0] = r1
            X.ALZ r1 = X.ALZ.A00
            goto L_0x00df
        L_0x00a7:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            r1 = 36
            X.B9u r0 = new X.B9u
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r11, r0)
            r10.A00 = r0
            java.lang.String r1 = "users"
            java.lang.String r0 = "user"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            X.ALa r4 = X.C21426ALa.A00
            r6 = 1
            r8 = 256(0x100, double:1.265E-321)
            goto L_0x0141
        L_0x00c7:
            X.9nx r1 = X.C90514aH.A0e(r11, r12)
            r0 = 39
            boolean r1 = A00(r1, r11, r10, r0)
            r0 = 3
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.ALk r0 = X.C21436ALk.A00
            r2[r1] = r0
            X.ALl r1 = X.C21437ALl.A00
            r0 = 1
            r2[r0] = r1
            X.ALm r1 = X.C21438ALm.A00
        L_0x00df:
            r0 = 2
            java.util.ArrayList r2 = X.C165567td.A0d(r1, r2, r0)
            java.lang.String[] r1 = X.C165607th.A1a()
            java.lang.String r0 = "IQErrorBadRequest|IQErrorForbidden|IQErrorInternalServerError"
        L_0x00ea:
            java.lang.Object r0 = X.C203379ns.A06(r11, r0, r2, r1)
            r10.A00 = r0
            goto L_0x0026
        L_0x00f2:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            r1 = 40
            X.B9u r0 = new X.B9u
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r11, r0)
            r10.A00 = r0
            java.lang.String r1 = "integrator_list"
            java.lang.String r0 = "integrator"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            X.ALn r4 = X.C21439ALn.A00
            r6 = 0
            r8 = 999(0x3e7, double:4.936E-321)
            goto L_0x0141
        L_0x0112:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            X.ASR r0 = X.ASR.A00
            java.lang.Object r0 = X.C203539oF.A01(r11, r0)
            r10.A00 = r0
            r1 = 17
            goto L_0x0177
        L_0x0121:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            r1 = 18
            X.B9w r0 = new X.B9w
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r11, r0)
            r10.A00 = r0
            java.lang.String r0 = "notice"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            X.ASS r4 = X.ASS.A00
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0141:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            java.util.ArrayList r0 = X.C203539oF.A09(r3, r4, r5, r6, r8)
            goto L_0x0024
        L_0x014b:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            X.ASU r0 = X.ASU.A00
            java.lang.Object r0 = X.C203539oF.A01(r11, r0)
            r10.A00 = r0
            r1 = 19
            goto L_0x0177
        L_0x015a:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            X.ASV r0 = X.ASV.A00
            java.lang.Object r0 = X.C203539oF.A01(r11, r0)
            r10.A00 = r0
            r1 = 20
            goto L_0x0177
        L_0x0169:
            X.9nx r2 = X.C90514aH.A0e(r11, r12)
            X.ASW r0 = X.ASW.A00
            java.lang.Object r0 = X.C203539oF.A01(r11, r0)
            r10.A00 = r0
            r1 = 21
        L_0x0177:
            X.B9w r0 = new X.B9w
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r11, r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186278vh.<init>(X.9nx, X.1jS, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c3, code lost:
        r0 = X.C203379ns.A06(r12, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x010b, code lost:
        r11.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        X.C36321k7.A0w(r12, r0);
        r0 = r0.B15(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        r11.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        r11.A00 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C186278vh(X.C203399nx r12, X.C186018vH r13, int r14) {
        /*
            r11 = this;
            r11.<init>()
            r4 = r12
            switch(r14) {
                case 5: goto L_0x003d;
                case 13: goto L_0x005d;
                case 14: goto L_0x00a0;
                case 15: goto L_0x00c9;
                case 16: goto L_0x00e5;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.9nx r2 = X.C90514aH.A0e(r12, r13)
            java.lang.String r1 = "live_updates"
            java.lang.String r0 = "duration"
            java.lang.String[] r9 = new java.lang.String[]{r1, r0}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r0 = 30
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r0 = 600(0x258, double:2.964E-321)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r10 = 0
            r8 = 0
            X.9oF r3 = X.C203379ns.A00
            java.lang.Object r0 = r3.A0Z(r4, r5, r6, r7, r8, r9, r10)
            r11.A01 = r0
            r0 = 39
            X.B9v r0 = X.C23213B9v.A00(r2, r0)
        L_0x0031:
            X.C36321k7.A0w(r12, r0)
            java.lang.Object r0 = r0.B15(r12)
        L_0x0038:
            r11.A00 = r0
        L_0x003a:
            r11.A00 = r12
            return
        L_0x003d:
            X.9nx r2 = X.C90514aH.A0e(r12, r13)
            r0 = 23
            X.B9u r1 = new X.B9u
            r1.<init>(r2, r0)
            java.lang.String r0 = "account"
            java.lang.Object r0 = X.C203539oF.A03(r12, r1, r0)
            r11.A00 = r0
            r1 = 24
            X.B9u r0 = new X.B9u
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r12, r0)
            goto L_0x010b
        L_0x005d:
            X.9nx r0 = X.C90514aH.A0e(r12, r13)
            r3 = 2
            X.B9v r0 = X.C23213B9v.A00(r0, r3)
            r1 = 0
            java.lang.Object r0 = X.C203539oF.A02(r12, r0, r1)
            r11.A01 = r0
            r0 = 8
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.AO3 r0 = X.AO3.A00
            r2[r1] = r0
            X.AO4 r1 = X.AO4.A00
            r0 = 1
            r2[r0] = r1
            X.AO5 r0 = X.AO5.A00
            r2[r3] = r0
            X.AO6 r1 = X.AO6.A00
            r0 = 3
            r2[r0] = r1
            X.AO7 r1 = X.AO7.A00
            r0 = 4
            r2[r0] = r1
            X.AO8 r1 = X.AO8.A00
            r0 = 5
            r2[r0] = r1
            X.AO9 r1 = X.AO9.A00
            r0 = 6
            r2[r0] = r1
            X.AOA r1 = X.AOA.A00
            r0 = 7
            java.util.ArrayList r2 = X.C165567td.A0d(r1, r2, r0)
            java.lang.String[] r1 = X.C165607th.A1a()
            java.lang.String r0 = "IQErrorRateOverlimit|IQErrorPayloadTooLarge|IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorForbidden|IQErrorLocked|IQErrorFallbackClient"
            goto L_0x00c3
        L_0x00a0:
            X.9nx r1 = X.C90514aH.A0e(r12, r13)
            r0 = 6
            X.B9v r0 = X.C23213B9v.A00(r1, r0)
            r2 = 0
            java.lang.Object r0 = X.C203539oF.A02(r12, r0, r2)
            r11.A01 = r0
            r0 = 2
            X.Azj[] r1 = new X.C22993Azj[r0]
            X.AOo r0 = X.C21518AOo.A00
            r1[r2] = r0
            X.AOp r0 = X.C21519AOp.A00
            java.util.ArrayList r2 = X.C165567td.A0c(r0, r1)
            java.lang.String[] r1 = X.C165607th.A1a()
            java.lang.String r0 = "IQErrorBadRequest|IQErrorFeatureNotImplemented"
        L_0x00c3:
            java.lang.Object r0 = X.C203379ns.A06(r12, r0, r2, r1)
            goto L_0x0038
        L_0x00c9:
            X.9nx r3 = X.C90514aH.A0e(r12, r13)
            X.AP9 r2 = X.AP9.A00
            java.lang.String r1 = "message_updates"
            java.lang.String r0 = "messages"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.Object r0 = X.C203539oF.A06(r12, r2, r0)
            r11.A01 = r0
            r0 = 16
            X.B9v r0 = X.C23213B9v.A00(r3, r0)
            goto L_0x0031
        L_0x00e5:
            X.9nx r1 = X.C90514aH.A0e(r12, r13)
            r0 = 30
            X.B9v r0 = X.C23213B9v.A00(r1, r0)
            java.lang.Object r0 = X.C203539oF.A00(r12, r0)
            r11.A00 = r0
            java.lang.String r1 = "my_addons"
            java.lang.String r0 = "messages"
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}
            X.APO r5 = X.APO.A00
            r7 = 0
            r9 = 5000(0x1388, double:2.4703E-320)
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.util.ArrayList r0 = X.C203539oF.A09(r4, r5, r6, r7, r9)
        L_0x010b:
            r11.A01 = r0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186278vh.<init>(X.9nx, X.8vH, int):void");
    }

    public C186278vh(C203399nx r4, C186008vG r5, int i) {
        ArrayList A0d;
        String[] A1a;
        String str;
        C22993Azj[] azjArr;
        Object obj;
        C203399nx A0e = C90514aH.A0e(r4, r5);
        switch (i) {
            case 19:
                this.A01 = C203539oF.A02(r4, new C23214B9w(A0e, 11), 0);
                azjArr = new C22993Azj[4];
                azjArr[0] = ASA.A00;
                azjArr[1] = ASB.A00;
                azjArr[2] = ASC.A00;
                obj = ASD.A00;
                break;
            case 20:
                this.A01 = C203539oF.A02(r4, new C23214B9w(A0e, 13), 0);
                azjArr = new C22993Azj[4];
                azjArr[0] = ASE.A00;
                azjArr[1] = ASF.A00;
                azjArr[2] = ASG.A00;
                obj = ASH.A00;
                break;
            case 21:
                this.A01 = C203539oF.A02(r4, new C23214B9w(A0e, 15), 0);
                C22993Azj[] azjArr2 = new C22993Azj[8];
                azjArr2[0] = ASJ.A00;
                azjArr2[1] = ASK.A00;
                azjArr2[2] = ASL.A00;
                azjArr2[3] = ASM.A00;
                azjArr2[4] = ASN.A00;
                azjArr2[5] = ASO.A00;
                azjArr2[6] = ASP.A00;
                A0d = C165567td.A0d(ASQ.A00, azjArr2, 7);
                A1a = C165607th.A1a();
                str = "IQErrorBadRequest|IQErrorForbidden|IQErrorNotAcceptable|IQErrorRateOverlimit|IQErrorAlreadyExists|IQErrorInternalServerError|IQErrorUsernameNotAvaiable|IQErrorUsernameSetOverlimit";
                break;
            default:
                this.A01 = C203539oF.A02(r4, new C23214B9w(A0e, 24), 0);
                C22993Azj[] azjArr3 = new C22993Azj[6];
                azjArr3[0] = ASZ.A00;
                azjArr3[1] = C21608ASa.A00;
                azjArr3[2] = C21609ASb.A00;
                azjArr3[3] = C21610ASc.A00;
                azjArr3[4] = C21611ASd.A00;
                A0d = C165567td.A0d(C21612ASe.A00, azjArr3, 5);
                A1a = C165607th.A1a();
                str = "IQErrorBadRequest|IQErrorForbidden|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorRateOverlimit|IQErrorFeatureNotImplemented";
                break;
        }
        A0d = C165567td.A0d(obj, azjArr, 3);
        A1a = C165607th.A1a();
        str = "IQErrorItemNotFound|IQErrorForbidden|IQErrorRateOverlimit|IQErrorInternalServerError";
        this.A00 = C203379ns.A06(r4, str, A0d, A1a);
        this.A00 = r4;
    }

    public C186278vh(C203399nx r4, C50682lJ r5) {
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[A00(C90514aH.A0e(r4, r5), r4, this, 37)] = C21432ALg.A00;
        this.A00 = C203379ns.A06(r4, "IQErrorBadRequest|IQErrorInternalServerError", C165567td.A0c(C21433ALh.A00, azjArr), C165607th.A1a());
        this.A00 = r4;
    }

    public C186278vh(C203399nx r4, C185938v9 r5) {
        C23212B9u b9u = new C23212B9u(C90514aH.A0e(r4, r5), 42);
        char A1V = C36371kC.A1V(b9u);
        this.A01 = b9u.B15(r4);
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[A1V] = C21445ALt.A00;
        this.A00 = C203379ns.A06(r4, "IQErrorBadRequest|IQErrorRateOverlimit", C165567td.A0c(C21446ALu.A00, azjArr), C165607th.A1a());
        this.A00 = r4;
    }

    public C186278vh(C203399nx r5, C185958vB r6) {
        Object obj;
        C203399nx A0e = C90514aH.A0e(r5, r6);
        C21596ARo aRo = C21596ARo.A00;
        String[] strArr = {"aadhaar"};
        AnonymousClass00C.A0D(r5, 0);
        try {
            obj = C203539oF.A06(r5, aRo, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        this.A00 = obj;
        this.A01 = C203539oF.A00(r5, new C23214B9w(A0e, 2));
        this.A00 = r5;
    }
}
