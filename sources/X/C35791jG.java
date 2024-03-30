package X;

/* renamed from: X.1jG  reason: invalid class name and case insensitive filesystem */
public class C35791jG extends C195819Wd {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35791jG(AnonymousClass9OL r2, AnonymousClass004 r3, AnonymousClass004 r4, AnonymousClass004 r5, AnonymousClass004 r6, AnonymousClass004 r7, AnonymousClass004 r8, int i) {
        super(r2);
        this.A06 = i;
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
                super(r2);
                this.A00 = r3;
                this.A04 = r4;
                this.A01 = r5;
                break;
            case 1:
                super(r2);
                this.A04 = r3;
                this.A01 = r4;
                this.A00 = r5;
                this.A03 = r6;
                this.A05 = r7;
                this.A02 = r8;
                return;
            case 13:
                super(r2);
                this.A00 = r3;
                this.A01 = r4;
                this.A02 = r5;
                this.A05 = r6;
                this.A03 = r7;
                this.A04 = r8;
                return;
            default:
                this.A00 = r3;
                this.A01 = r4;
                this.A04 = r5;
                break;
        }
        this.A02 = r6;
        this.A05 = r7;
        this.A03 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x04bf, code lost:
        r3.A08(new X.BAS(r4, 22), r5);
        r3.A08((X.AnonymousClass004) r6.A00, new X.C019308f(X.C17760rz.class));
        r3.A08((X.AnonymousClass004) r6.A04, new X.C019308f(X.C17740rx.class));
        r3.A08((X.AnonymousClass004) r6.A01, new X.C019308f(X.B6C.class));
        r3.A08((X.AnonymousClass004) r6.A03, new X.C019308f(X.AnonymousClass4VB.class));
        r3.A08((X.AnonymousClass004) r6.A02, new X.C019308f(X.AnonymousClass4VA.class));
        r1 = new X.C019308f(X.B6D.class);
        r0 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        r3.A08(new X.BAS(r5, 22), r1);
        r3.A08((X.AnonymousClass004) r6.A00, new X.C019308f(X.C17760rz.class));
        r3.A08((X.AnonymousClass004) r6.A04, new X.C019308f(X.C17740rx.class));
        r3.A08((X.AnonymousClass004) r6.A01, new X.C019308f(X.B6C.class));
        r3.A08((X.AnonymousClass004) r6.A02, new X.C019308f(X.AnonymousClass4VA.class));
        r3.A08((X.AnonymousClass004) r6.A05, new X.C019308f(X.B6D.class));
        r1 = new X.C019308f(X.AnonymousClass4VB.class);
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x008a, code lost:
        r3.A08((X.AnonymousClass004) r0, r1);
        r3.A05();
        r3.A00 = true;
        r2.A05();
        r2.A00 = true;
        A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x009d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r6 = this;
            int r0 = r6.A06
            X.8cy r2 = r6.A00()
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x00c8;
                case 2: goto L_0x014b;
                case 3: goto L_0x0175;
                case 4: goto L_0x019f;
                case 5: goto L_0x01c9;
                case 6: goto L_0x01f3;
                case 7: goto L_0x021d;
                case 8: goto L_0x0247;
                case 9: goto L_0x0271;
                case 10: goto L_0x029b;
                case 11: goto L_0x02c5;
                case 12: goto L_0x02ef;
                case 13: goto L_0x0319;
                case 14: goto L_0x039c;
                case 15: goto L_0x03c6;
                case 16: goto L_0x03f0;
                case 17: goto L_0x041a;
                case 18: goto L_0x0444;
                case 19: goto L_0x046e;
                case 20: goto L_0x0497;
                case 21: goto L_0x051a;
                case 22: goto L_0x0544;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2.A06()
            r0 = 94
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bP> r1 = X.AnonymousClass2bP.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47l r5 = X.C829347l.A00
        L_0x0031:
            r4 = 22
            X.BAS r0 = new X.BAS
            r0.<init>(r5, r4)
            r3.A08(r0, r1)
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A00
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A04
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A01
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VA> r0 = X.AnonymousClass4VA.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A02
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6D> r0 = X.B6D.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A05
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A03
        L_0x008a:
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            r3.A05()
            r0 = 1
            r3.A00 = r0
            r2.A05()
            r2.A00 = r0
            r6.A02(r2)
            return
        L_0x009e:
            r2.A06()
            r0 = 92
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bT> r1 = X.AnonymousClass2bT.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.46w r5 = X.AnonymousClass46w.A00
            goto L_0x0031
        L_0x00c8:
            r2.A06()
            r0 = 95
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2c1> r1 = X.AnonymousClass2c1.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = new X.08f
            r5.<init>(r0)
            X.46y r4 = X.AnonymousClass46y.A00
            r1 = 22
            X.BAS r0 = new X.BAS
            r0.<init>(r4, r1)
            r3.A08(r0, r5)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A04
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A01
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A00
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A03
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6D> r0 = X.B6D.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A05
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VA> r0 = X.AnonymousClass4VA.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A02
            goto L_0x008a
        L_0x014b:
            r2.A06()
            r0 = 37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bl> r1 = X.C46842bl.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.473 r5 = X.AnonymousClass473.A00
            goto L_0x0031
        L_0x0175:
            r2.A06()
            r0 = 44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bw> r1 = X.C46952bw.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.474 r5 = X.AnonymousClass474.A00
            goto L_0x0031
        L_0x019f:
            r2.A06()
            r0 = 49
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2cU> r1 = X.AnonymousClass2cU.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47G r5 = X.AnonymousClass47G.A00
            goto L_0x0031
        L_0x01c9:
            r2.A06()
            r0 = 63
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bk> r1 = X.C46832bk.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47H r5 = X.AnonymousClass47H.A00
            goto L_0x0031
        L_0x01f3:
            r2.A06()
            r0 = 57
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bo> r1 = X.C46872bo.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47I r5 = X.AnonymousClass47I.A00
            goto L_0x0031
        L_0x021d:
            r2.A06()
            r0 = 54
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.8mf> r1 = X.C180938mf.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.AeI r5 = X.C21947AeI.A00
            goto L_0x0031
        L_0x0247:
            r2.A06()
            r0 = 45
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.8mg> r1 = X.C180948mg.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.AeJ r5 = X.C21948AeJ.A00
            goto L_0x0031
        L_0x0271:
            r2.A06()
            r0 = 52
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.8mh> r1 = X.C180958mh.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.AeK r5 = X.C21949AeK.A00
            goto L_0x0031
        L_0x029b:
            r2.A06()
            r0 = 55
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bZ> r1 = X.AnonymousClass2bZ.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47J r5 = X.AnonymousClass47J.A00
            goto L_0x0031
        L_0x02c5:
            r2.A06()
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2cT> r1 = X.AnonymousClass2cT.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47K r5 = X.AnonymousClass47K.A00
            goto L_0x0031
        L_0x02ef:
            r2.A06()
            r0 = 85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2cB> r1 = X.AnonymousClass2cB.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47L r5 = X.AnonymousClass47L.A00
            goto L_0x0031
        L_0x0319:
            r2.A06()
            r0 = 97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2c6> r1 = X.AnonymousClass2c6.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.IN_DEVELOPMENT
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A00
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = new X.08f
            r5.<init>(r0)
            X.46s r4 = X.AnonymousClass46s.A00
            r1 = 22
            X.BAS r0 = new X.BAS
            r0.<init>(r4, r1)
            r3.A08(r0, r5)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A01
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VA> r0 = X.AnonymousClass4VA.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A02
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6D> r0 = X.B6D.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A05
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A03
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A04
            goto L_0x008a
        L_0x039c:
            r2.A06()
            r0 = 62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.8o1> r1 = X.C181778o1.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.7IN r5 = X.AnonymousClass7IN.A00
            goto L_0x0031
        L_0x03c6:
            r2.A06()
            r0 = 81
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2cY> r1 = X.AnonymousClass2cY.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.IN_DEVELOPMENT
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47R r5 = X.AnonymousClass47R.A00
            goto L_0x0031
        L_0x03f0:
            r2.A06()
            r0 = 72
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bN> r1 = X.AnonymousClass2bN.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47V r5 = X.AnonymousClass47V.A00
            goto L_0x0031
        L_0x041a:
            r2.A06()
            r0 = 73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bE> r1 = X.AnonymousClass2bE.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47W r5 = X.AnonymousClass47W.A00
            goto L_0x0031
        L_0x0444:
            r2.A06()
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2c2> r1 = X.AnonymousClass2c2.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47Y r5 = X.AnonymousClass47Y.A00
            goto L_0x0031
        L_0x046e:
            r2.A06()
            r0 = 96
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2c4> r1 = X.AnonymousClass2c4.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = new X.08f
            r5.<init>(r0)
            X.47Z r4 = X.AnonymousClass47Z.A00
            goto L_0x04bf
        L_0x0497:
            r2.A06()
            r0 = 98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2c3> r1 = X.AnonymousClass2c3.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = new X.08f
            r5.<init>(r0)
            X.47b r4 = X.C828347b.A00
        L_0x04bf:
            r1 = 22
            X.BAS r0 = new X.BAS
            r0.<init>(r4, r1)
            r3.A08(r0, r5)
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A00
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A04
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A01
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A03
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.4VA> r0 = X.AnonymousClass4VA.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A02
            X.004 r0 = (X.AnonymousClass004) r0
            r3.A08(r0, r1)
            java.lang.Class<X.B6D> r0 = X.B6D.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            java.lang.Object r0 = r6.A05
            goto L_0x008a
        L_0x051a:
            r2.A06()
            r0 = 66
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2bS> r1 = X.AnonymousClass2bS.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47c r5 = X.C828447c.A00
            goto L_0x0031
        L_0x0544:
            r2.A06()
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            java.lang.Class<X.2cV> r1 = X.AnonymousClass2cV.class
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r2.A00 = r0
            X.8cs r3 = r2.A08()
            r3.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.47g r5 = X.C828847g.A00
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35791jG.A01():void");
    }
}
