package X;

/* renamed from: X.8vg  reason: invalid class name and case insensitive filesystem */
public class C186268vg extends AnonymousClass5PS {
    public Object A00;

    public C186268vg(C203399nx r4, C185928v8 r5) {
        C23212B9u b9u = new C23212B9u(C90514aH.A0e(r4, r5), 16);
        AnonymousClass00C.A0D(b9u, 1);
        this.A00 = b9u.B15(r4);
        this.A00 = r4;
    }

    public C186268vg(C203399nx r4, C186008vG r5, int i) {
        int i2;
        C203399nx A0e = C90514aH.A0e(r4, r5);
        switch (i) {
            case 12:
                i2 = 4;
                break;
            case 13:
                i2 = 7;
                break;
            case 14:
                i2 = 9;
                break;
            case 15:
                i2 = 12;
                break;
            default:
                i2 = 16;
                break;
        }
        this.A00 = C203539oF.A00(r4, new C23214B9w(A0e, i2));
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0110, code lost:
        r4 = X.C165567td.A0d(X.C23213B9v.A00(r4, r0), r2, 4);
        r1 = new java.lang.String[r3];
        r0 = "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x011d, code lost:
        r0 = X.C203379ns.A06(r6, r0, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = X.C203539oF.A00(r6, X.C23213B9v.A00(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r5.A00 = r0;
        r5.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C186268vg(X.C203399nx r6, X.C186018vH r7, int r8) {
        /*
            r5 = this;
            r5.<init>()
            switch(r8) {
                case 1: goto L_0x0019;
                case 2: goto L_0x0006;
                case 3: goto L_0x0006;
                case 4: goto L_0x0029;
                case 5: goto L_0x002f;
                case 6: goto L_0x005e;
                case 7: goto L_0x0065;
                case 8: goto L_0x00a9;
                case 9: goto L_0x00db;
                case 10: goto L_0x00e3;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.9nx r1 = X.C90514aH.A0e(r6, r7)
            r0 = 38
        L_0x000c:
            X.B9v r0 = X.C23213B9v.A00(r1, r0)
            java.lang.Object r0 = X.C203539oF.A00(r6, r0)
        L_0x0014:
            r5.A00 = r0
            r5.A00 = r6
            return
        L_0x0019:
            X.9nx r2 = X.C90514aH.A0e(r6, r7)
            r1 = 22
            X.B9u r0 = new X.B9u
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C203539oF.A00(r6, r0)
            goto L_0x0014
        L_0x0029:
            X.9nx r1 = X.C90514aH.A0e(r6, r7)
            r0 = 3
            goto L_0x000c
        L_0x002f:
            X.9nx r4 = X.C90514aH.A0e(r6, r7)
            r0 = 5
            X.Azj[] r2 = new X.C22993Azj[r0]
            r0 = 10
            X.B9v r0 = X.C23213B9v.A00(r4, r0)
            r3 = 0
            r2[r3] = r0
            r0 = 11
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 1
            r2[r0] = r1
            r0 = 12
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 2
            r2[r0] = r1
            r0 = 13
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 3
            r2[r0] = r1
            r0 = 14
            goto L_0x0110
        L_0x005e:
            X.9nx r1 = X.C90514aH.A0e(r6, r7)
            r0 = 15
            goto L_0x000c
        L_0x0065:
            X.9nx r4 = X.C90514aH.A0e(r6, r7)
            r0 = 6
            X.Azj[] r3 = new X.C22993Azj[r0]
            r0 = 17
            X.B9v r0 = X.C23213B9v.A00(r4, r0)
            r2 = 0
            r3[r2] = r0
            r0 = 18
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 1
            r3[r0] = r1
            r0 = 19
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 2
            r3[r0] = r1
            r0 = 20
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 3
            r3[r0] = r1
            r0 = 21
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 4
            r3[r0] = r1
            r0 = 22
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 5
            java.util.ArrayList r4 = X.C165567td.A0d(r1, r3, r0)
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse|NotAllowedIQErrorResponse"
            goto L_0x011d
        L_0x00a9:
            X.9nx r4 = X.C90514aH.A0e(r6, r7)
            r0 = 4
            X.Azj[] r3 = new X.C22993Azj[r0]
            r0 = 25
            X.B9v r0 = X.C23213B9v.A00(r4, r0)
            r2 = 0
            r3[r2] = r0
            r0 = 26
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 1
            r3[r0] = r1
            r0 = 27
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 2
            r3[r0] = r1
            r0 = 28
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 3
            java.util.ArrayList r4 = X.C165567td.A0d(r1, r3, r0)
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "BadRequestIQErrorResponse|UnauthorizedIQErrorResponse|ItemNotFoundIQErrorResponse|RateLimitedIQErrorResponse"
            goto L_0x011d
        L_0x00db:
            X.9nx r1 = X.C90514aH.A0e(r6, r7)
            r0 = 29
            goto L_0x000c
        L_0x00e3:
            X.9nx r4 = X.C90514aH.A0e(r6, r7)
            r0 = 5
            X.Azj[] r2 = new X.C22993Azj[r0]
            r0 = 33
            X.B9v r0 = X.C23213B9v.A00(r4, r0)
            r3 = 0
            r2[r3] = r0
            r0 = 34
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 1
            r2[r0] = r1
            r0 = 35
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 2
            r2[r0] = r1
            r0 = 36
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 3
            r2[r0] = r1
            r0 = 37
        L_0x0110:
            X.B9v r1 = X.C23213B9v.A00(r4, r0)
            r0 = 4
            java.util.ArrayList r4 = X.C165567td.A0d(r1, r2, r0)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse"
        L_0x011d:
            java.lang.Object r0 = X.C203379ns.A06(r6, r0, r4, r1)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186268vg.<init>(X.9nx, X.8vH, int):void");
    }

    public C186268vg(C203399nx r4, C50682lJ r5) {
        this.A00 = C203539oF.A00(r4, new C23212B9u(C90514aH.A0e(r4, r5), 38));
        this.A00 = r4;
    }

    public C186268vg(C203399nx r4, C185938v9 r5) {
        C23212B9u b9u = new C23212B9u(C90514aH.A0e(r4, r5), 43);
        AnonymousClass00C.A0D(b9u, 1);
        this.A00 = b9u.B15(r4);
        this.A00 = r4;
    }
}
