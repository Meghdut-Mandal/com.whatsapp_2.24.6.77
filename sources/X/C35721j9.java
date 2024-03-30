package X;

/* renamed from: X.1j9  reason: invalid class name and case insensitive filesystem */
public class C35721j9 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35721j9(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.0yO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.0yR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.0yO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.0yO} */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04e7, code lost:
        if (r1 != 4) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x05fa, code lost:
        r2.A0H(new X.C35721j9(r5, r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0602, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x061d, code lost:
        r0.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0620, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x088a, code lost:
        r2.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x088d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024b, code lost:
        r7 = r5.A00;
        r14 = r7.A02;
        r6 = (X.C25781Hq) r14.get();
        r5 = r7.A00;
        r6.A00 = android.os.SystemClock.uptimeMillis();
        r11 = r6.A03;
        r1 = r11.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0266, code lost:
        if (r1 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x026c, code lost:
        if (r1.getPhoneType() != 1) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026e, code lost:
        r9 = r1.getNetworkOperator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0272, code lost:
        if (r9 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0274, code lost:
        r1 = r9.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0279, code lost:
        if (r1 < 5) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027c, code lost:
        if (r1 > 6) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027e, code lost:
        r0 = r9.substring(0, 3);
        r1 = r9.substring(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r0 = java.lang.Integer.valueOf(r0);
        r13 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028f, code lost:
        if (r0 == null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0292, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0293, code lost:
        com.whatsapp.util.Log.w("error parsing mcc/mnc", r1);
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r12 = java.lang.Long.valueOf((long) r0.intValue());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x050c A[LOOP:7: B:137:0x0506->B:139:0x050c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x055a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r4 = r19
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x020f;
                case 2: goto L_0x022f;
                case 3: goto L_0x0582;
                case 4: goto L_0x05bd;
                case 5: goto L_0x0613;
                case 6: goto L_0x0015;
                case 7: goto L_0x05c8;
                case 8: goto L_0x0037;
                case 9: goto L_0x05d8;
                case 10: goto L_0x0059;
                case 11: goto L_0x05eb;
                case 12: goto L_0x007b;
                case 13: goto L_0x0603;
                case 14: goto L_0x0613;
                case 15: goto L_0x0613;
                case 16: goto L_0x0621;
                case 17: goto L_0x00a1;
                case 18: goto L_0x00a1;
                case 19: goto L_0x0633;
                case 20: goto L_0x0641;
                case 21: goto L_0x064d;
                case 22: goto L_0x00be;
                case 23: goto L_0x0676;
                case 24: goto L_0x0684;
                case 25: goto L_0x0711;
                case 26: goto L_0x00e0;
                case 27: goto L_0x0116;
                case 28: goto L_0x0116;
                case 29: goto L_0x0116;
                case 30: goto L_0x0116;
                case 31: goto L_0x0727;
                case 32: goto L_0x0007;
                case 33: goto L_0x0737;
                case 34: goto L_0x0798;
                case 35: goto L_0x0192;
                case 36: goto L_0x01ae;
                case 37: goto L_0x07aa;
                case 38: goto L_0x07aa;
                case 39: goto L_0x0007;
                case 40: goto L_0x07c3;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x083b;
                case 46: goto L_0x0849;
                case 47: goto L_0x01d6;
                case 48: goto L_0x0855;
                case 49: goto L_0x0868;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            X.1P5 r0 = (X.AnonymousClass1P5) r0
            java.lang.Object r1 = r4.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Cf r0 = r0.A0H
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r2 = r4.A01
            X.147 r2 = (X.AnonymousClass147) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A03(r2)
            goto L_0x0027
        L_0x0037:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r2 = r4.A01
            X.147 r2 = (X.AnonymousClass147) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A05(r2)
            goto L_0x0049
        L_0x0059:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r2 = r4.A01
            X.147 r2 = (X.AnonymousClass147) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A04(r2)
            goto L_0x006b
        L_0x007b:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1Lo r1 = r0.A0l
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Iterable r0 = r1.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0091:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A02(r2)
            goto L_0x0091
        L_0x00a1:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r4 = r4.A01
            java.util.List r4 = (java.util.List) r4
            X.0xY r1 = r0.A0F
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0014
            r4.size()
            X.5Tu r3 = X.C108515Tu.A05
            X.6NS r2 = X.AnonymousClass6NS.A0H
            r5 = 1
            r6 = 0
            r1.A03(r2, r3, r4, r5, r6)
            return
        L_0x00be:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r2 = r4.A01
            X.147 r2 = (X.AnonymousClass147) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A02(r2)
            goto L_0x00d0
        L_0x00e0:
            java.lang.Object r6 = r4.A00
            X.0xg r6 = (X.C20510xg) r6
            java.lang.Object r5 = r4.A01
            X.147 r5 = (X.AnonymousClass147) r5
            X.005 r0 = r6.A0C
            java.lang.Object r0 = r0.get()
            X.17r r0 = (X.C232317r) r0
            X.6X6 r4 = r0.A0C(r5)
            java.util.Map r0 = r4.A08
            int r3 = r0.size()
            X.0yC r2 = r6.A03
            r1 = 3749(0xea5, float:5.253E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            if (r3 > r0) goto L_0x0014
            java.lang.String r3 = r4.A0E()
            r2 = 3
            java.lang.String r1 = "prefetch"
            X.3S5 r0 = new X.3S5
            r0.<init>(r1, r2, r3)
            r6.A09(r0, r5)
            return
        L_0x0116:
            java.lang.Object r7 = r4.A00
            X.1RN r7 = (X.AnonymousClass1RN) r7
            java.lang.Object r4 = r4.A01
            X.1RT r4 = (X.AnonymousClass1RT) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncLayoutInflaterImpl"
            r3 = 0
            X.C18740tg.A00()
            X.1RO r0 = r4.A04
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r0)
            java.lang.Object r0 = r6.get()     // Catch:{ RuntimeException -> 0x0167 }
            boolean r0 = r0 instanceof X.AnonymousClass1RO     // Catch:{ RuntimeException -> 0x0167 }
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r6.get()     // Catch:{ RuntimeException -> 0x0167 }
            X.AnonymousClass00C.A0E(r0, r5)     // Catch:{ RuntimeException -> 0x0167 }
            X.1RO r0 = (X.AnonymousClass1RO) r0     // Catch:{ RuntimeException -> 0x0167 }
            X.00T r0 = r0.A01     // Catch:{ RuntimeException -> 0x0167 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ RuntimeException -> 0x0167 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ RuntimeException -> 0x0167 }
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2     // Catch:{ RuntimeException -> 0x0167 }
            int r1 = r4.A00     // Catch:{ RuntimeException -> 0x0167 }
            android.view.ViewGroup r0 = r4.A02     // Catch:{ RuntimeException -> 0x0167 }
            android.view.View r2 = r2.inflate(r1, r0, r3)     // Catch:{ RuntimeException -> 0x0167 }
            r4.A01 = r2     // Catch:{ RuntimeException -> 0x0167 }
            boolean r0 = r4.A06     // Catch:{ RuntimeException -> 0x0167 }
            if (r0 == 0) goto L_0x016d
            if (r2 == 0) goto L_0x016d
            java.util.HashMap r1 = r7.A01     // Catch:{ RuntimeException -> 0x0167 }
            int r0 = r4.A00     // Catch:{ RuntimeException -> 0x0167 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x0167 }
            r1.put(r0, r2)     // Catch:{ RuntimeException -> 0x0167 }
            goto L_0x016d
        L_0x0167:
            r1 = move-exception
            java.lang.String r0 = "Failed to inflate resource in the background! Retrying on the UI thread"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x016d:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0014
            java.lang.Object r0 = r6.get()
            boolean r0 = r0 instanceof X.AnonymousClass1RO
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r6.get()
            X.AnonymousClass00C.A0E(r0, r5)
            X.1RO r0 = (X.AnonymousClass1RO) r0
            X.00T r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
            r0.sendToTarget()
            return
        L_0x0192:
            java.lang.Object r2 = r4.A00
            X.1P5 r2 = (X.AnonymousClass1P5) r2
            java.lang.Object r0 = r4.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x019e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.11F r0 = (X.AnonymousClass11F) r0
            r2.A0V(r0)
            goto L_0x019e
        L_0x01ae:
            java.lang.Object r3 = r4.A00
            X.1P5 r3 = (X.AnonymousClass1P5) r3
            java.lang.Object r0 = r4.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x01ba:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            if (r1 != 0) goto L_0x01ce
            java.lang.String r0 = "LocationSharingManager/ContactObserver/found jid == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01ba
        L_0x01ce:
            r3.A0V(r1)
            r0 = 0
            X.AnonymousClass1P5.A08(r1, r0, r3)
            goto L_0x01ba
        L_0x01d6:
            java.lang.Object r3 = r4.A00
            X.1D0 r3 = (X.AnonymousClass1D0) r3
            java.lang.Object r2 = r4.A01
            X.6vi r2 = (X.C146506vi) r2
            r0 = 1
            r2.A04 = r0
            X.1GV r1 = r3.A0B
            X.65P r0 = r2.A03()
            X.1Gl r0 = r0.A08
            r1.A02(r2, r0)
            X.1GN r1 = r3.A0D
            r1.A08(r2)
            X.6vh r0 = r2.A02
            if (r0 == 0) goto L_0x0014
            r1.A08(r0)
            return
        L_0x01f9:
            java.lang.Object r5 = r4.A00
            X.1Kq r5 = (X.C26561Kq) r5
            java.lang.Object r3 = r4.A01
            X.1Kr r0 = r5.A00
            X.5AV r2 = r0.A00()
            r1 = 1
            X.6jd r0 = new X.6jd
            r0.<init>(r3, r5, r1)
            r2.Blp(r0)
            return
        L_0x020f:
            java.lang.Object r8 = r4.A00
            X.0yR r8 = (X.C20960yR) r8
            java.lang.Object r5 = r4.A01
            X.14Z r5 = (X.AnonymousClass14Z) r5
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            java.util.concurrent.CountDownLatch r10 = r8.A01
            long r3 = r10.getCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = "Multiple calls to initializeCommonAttributes"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x022f:
            java.lang.Object r8 = r4.A00
            X.0yO r8 = (X.C20930yO) r8
            java.lang.Object r5 = r4.A01
            X.14Z r5 = (X.AnonymousClass14Z) r5
            java.util.concurrent.CountDownLatch r10 = r8.A03
            long r3 = r10.getCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = "Multiple calls to initializeCommonAttributes"
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
        L_0x024b:
            X.14Y r7 = r5.A00
            X.005 r14 = r7.A02
            java.lang.Object r6 = r14.get()
            X.1Hq r6 = (X.C25781Hq) r6
            X.0yC r5 = r7.A00
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A00 = r0
            X.0yb r11 = r6.A03
            android.telephony.TelephonyManager r1 = r11.A0K()
            r4 = 1
            r3 = 3
            r2 = 0
            if (r1 == 0) goto L_0x02c3
            int r0 = r1.getPhoneType()
            if (r0 != r4) goto L_0x02c3
            java.lang.String r9 = r1.getNetworkOperator()
            if (r9 == 0) goto L_0x02c3
            int r1 = r9.length()
            r0 = 5
            if (r1 < r0) goto L_0x02c3
            r0 = 6
            if (r1 > r0) goto L_0x02c3
            r0 = 0
            java.lang.String r0 = r9.substring(r0, r3)
            java.lang.String r1 = r9.substring(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0292 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0292 }
            if (r0 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0292:
            r1 = move-exception
            java.lang.String r0 = "error parsing mcc/mnc"
            com.whatsapp.util.Log.w(r0, r1)
            r13 = r2
        L_0x0299:
            r12 = r2
            goto L_0x02a4
        L_0x029b:
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x02a4:
            r9 = 0
            r1 = 5
            r8.BqE(r12, r1, r9)
            r8.BqE(r12, r1, r4)
            r8.BqE(r12, r1, r3)
            r0 = 2
            r8.BqE(r12, r1, r0)
            if (r13 != 0) goto L_0x03e1
            r1 = r2
        L_0x02b6:
            r8.BqE(r1, r3, r9)
            r8.BqE(r1, r3, r4)
            r8.BqE(r1, r3, r3)
            r0 = 2
            r8.BqE(r1, r3, r0)
        L_0x02c3:
            r9 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r0 = 11
            r8.BqE(r13, r0, r12)
            r8.BqE(r13, r0, r4)
            r8.BqE(r13, r0, r3)
            r8.BqE(r13, r0, r9)
            java.lang.String r1 = "2.24.6.77"
            java.util.Objects.requireNonNull(r1)
            r0 = 17
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0 = 15
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 13
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            X.1Hv r0 = r6.A06
            X.1Jy r0 = r0.A00()
            int r15 = r0.ordinal()
            r1 = 4
            if (r15 == r3) goto L_0x0336
            if (r15 == r9) goto L_0x03de
            if (r15 == r4) goto L_0x03db
            r0 = 4
            r1 = 5
            if (r15 == r0) goto L_0x0336
            r1 = 0
        L_0x0336:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 14507(0x38ab, float:2.0329E-41)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            int r0 = X.C26391Jz.A00(r11)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 655(0x28f, float:9.18E-43)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            long r15 = X.AnonymousClass1K0.A02(r11)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r15 = r15 / r0
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            r0 = 689(0x2b1, float:9.65E-43)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            X.0wg r0 = r6.A09
            int r0 = X.AnonymousClass1K2.A02(r11, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2617(0xa39, float:3.667E-42)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            java.lang.String r1 = android.os.Build.DEVICE
            r0 = 495(0x1ef, float:6.94E-43)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0 = 287(0x11f, float:4.02E-43)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            java.lang.String r1 = android.os.Build.MODEL
            r0 = 289(0x121, float:4.05E-43)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r0 = 21
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1657(0x679, float:2.322E-42)
            r8.BqE(r1, r0, r12)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            r0 = 1659(0x67b, float:2.325E-42)
            r8.BqE(r13, r0, r12)
            r8.BqE(r13, r0, r4)
            X.0zM r1 = r6.A07
            monitor-enter(r1)
            goto L_0x03ec
        L_0x03db:
            r1 = 1
            goto L_0x0336
        L_0x03de:
            r1 = 3
            goto L_0x0336
        L_0x03e1:
            int r0 = r13.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x02b6
        L_0x03ec:
            android.content.SharedPreferences r11 = r1.A00     // Catch:{ all -> 0x057f }
            java.lang.String r0 = "ab_props:sys:config_key"
            java.lang.String r11 = r11.getString(r0, r2)     // Catch:{ all -> 0x057f }
            monitor-exit(r1)
            r0 = 4473(0x1179, float:6.268E-42)
            r8.BqE(r11, r0, r12)
            r8.BqE(r11, r0, r4)
            X.0wG r0 = r6.A04
            android.content.Context r12 = r0.A00
            long r17 = X.C26651Kz.A00(r12)
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0434
            java.lang.String r13 = r12.getPackageName()     // Catch:{ Exception -> 0x042d }
            android.content.pm.PackageManager r0 = r12.getPackageManager()     // Catch:{ Exception -> 0x042d }
            android.content.pm.Signature r15 = X.C132916Vu.A00(r0, r13)     // Catch:{ Exception -> 0x042d }
            X.005 r0 = r6.A0A     // Catch:{ Exception -> 0x042d }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x042d }
            X.1Vg r11 = (X.C29081Vg) r11     // Catch:{ Exception -> 0x042d }
            byte[] r0 = r15.toByteArray()     // Catch:{ Exception -> 0x042d }
            boolean r0 = r11.A00(r13, r0)     // Catch:{ Exception -> 0x042d }
            if (r0 == 0) goto L_0x042a
            goto L_0x0432
        L_0x042a:
            r17 = 1
            goto L_0x0434
        L_0x042d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0434
        L_0x0432:
            r17 = 0
        L_0x0434:
            java.lang.Long r13 = java.lang.Long.valueOf(r17)
            r11 = 0
            r0 = 6251(0x186b, float:8.76E-42)
            r8.BqE(r13, r0, r11)
            r8.BqE(r13, r0, r4)
            r8.BqE(r13, r0, r3)
            r8.BqE(r13, r0, r9)
            android.content.pm.PackageManager r13 = r12.getPackageManager()
            java.lang.String r0 = r12.getPackageName()
            java.lang.String r13 = r13.getInstallerPackageName(r0)
            if (r13 != 0) goto L_0x053c
            r13 = 0
        L_0x0456:
            r0 = 10255(0x280f, float:1.437E-41)
            r8.BqE(r13, r0, r11)
            r8.BqE(r13, r0, r4)
            java.lang.String r1 = r1.A01()
            r0 = 5029(0x13a5, float:7.047E-42)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            X.1Lw r0 = X.C25961Ii.A02(r12)
            if (r0 == 0) goto L_0x0485
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 12017(0x2ef1, float:1.684E-41)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
        L_0x0485:
            X.0wQ r12 = r6.A02
            boolean r0 = r12.A0L()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 12027(0x2efb, float:1.6853E-41)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
            X.0v0 r13 = r6.A05
            int r0 = r13.A0I()
            long r0 = (long) r0
            r15 = 1
            long r0 = r0 + r15
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 15265(0x3ba1, float:2.1391E-41)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
            r0 = 3664(0xe50, float:5.134E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r5, r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            r0 = 13293(0x33ed, float:1.8627E-41)
            r8.BqE(r15, r0, r11)
            r8.BqE(r15, r0, r4)
            r8.BqE(r15, r0, r3)
            r8.BqE(r15, r0, r9)
            X.005 r0 = r13.A00
            java.lang.Object r13 = r0.get()
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13
            java.lang.String r0 = "voip_call_ab_test_bucket"
            java.lang.String r0 = r13.getString(r0, r2)
            X.AnonymousClass1M3.A01(r8, r0)
            r0 = 5120(0x1400, float:7.175E-42)
            int r1 = X.C20800yB.A00(r1, r5, r0)
            if (r1 == 0) goto L_0x052d
            if (r1 == r4) goto L_0x0519
            if (r1 == r9) goto L_0x051c
            if (r1 == r3) goto L_0x0516
            r0 = 4
            if (r1 == r0) goto L_0x0519
        L_0x04e9:
            r12.A0G()
            com.whatsapp.Me r0 = r12.A00
            if (r0 == 0) goto L_0x0500
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r1 = X.AnonymousClass1M4.A01(r1, r0)
            r0 = 6833(0x1ab1, float:9.575E-42)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
        L_0x0500:
            java.util.Set r0 = r6.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x0506:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0548
            java.lang.Object r0 = r1.next()
            X.0ye r0 = (X.C21090ye) r0
            r0.BXs(r8)
            goto L_0x0506
        L_0x0516:
            java.lang.String r1 = "androidwametatest-ps"
            goto L_0x051e
        L_0x0519:
            java.lang.String r1 = "androidwametatest"
            goto L_0x051e
        L_0x051c:
            java.lang.String r1 = "androidwametatest-fs"
        L_0x051e:
            r0 = 15881(0x3e09, float:2.2254E-41)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
            r8.BqE(r1, r0, r3)
            r8.BqE(r1, r0, r9)
            goto L_0x04e9
        L_0x052d:
            r0 = 15881(0x3e09, float:2.2254E-41)
            r8.BqE(r2, r0, r11)
            r8.BqE(r2, r0, r4)
            r8.BqE(r2, r0, r3)
            r8.BqE(r2, r0, r9)
            goto L_0x04e9
        L_0x053c:
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            goto L_0x0456
        L_0x0548:
            X.005 r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.1M6 r0 = (X.AnonymousClass1M6) r0
            android.net.NetworkInfo r0 = r0.A01()
            X.1M8 r2 = X.AnonymousClass1M7.A00(r0)
            if (r2 == 0) goto L_0x057b
            r14.get()
            boolean r1 = r2.A06
            r0 = 0
            if (r1 == 0) goto L_0x0563
            r0 = 1
        L_0x0563:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 23
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
            java.lang.Integer r1 = X.AnonymousClass1M9.A00(r2)
            r0 = 105(0x69, float:1.47E-43)
            r8.BqE(r1, r0, r11)
            r8.BqE(r1, r0, r4)
        L_0x057b:
            r10.countDown()
            return
        L_0x057f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0582:
            java.lang.Object r5 = r4.A00
            X.1Fp r5 = (X.C25261Fp) r5
            java.lang.Object r3 = r4.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.2Ri r2 = new X.2Ri
            r2.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.A05 = r0
            X.0wo r0 = r5.A00
            long r0 = X.C19970wo.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            if (r3 == 0) goto L_0x05b7
            r2.A03 = r3
        L_0x05b7:
            X.0yW r0 = r5.A01
            r0.Bly(r2)
            return
        L_0x05bd:
            java.lang.Object r0 = r4.A00
            X.1Oo r0 = (X.C27531Oo) r0
            java.lang.Object r1 = r4.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r0.A02
            goto L_0x061d
        L_0x05c8:
            java.lang.Object r5 = r4.A00
            X.0xQ r5 = (X.C20350xQ) r5
            java.lang.Object r3 = r4.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.C20350xQ.A0D(r5, r3)
            X.17Y r2 = r5.A04
            r1 = 8
            goto L_0x05fa
        L_0x05d8:
            java.lang.Object r2 = r4.A00
            X.0xQ r2 = (X.C20350xQ) r2
            java.lang.Object r1 = r4.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.1PF r0 = r2.A0R
            r0.A01(r1)
            X.1Nq r0 = r2.A0Y
            r0.A00(r1)
            return
        L_0x05eb:
            java.lang.Object r5 = r4.A00
            X.0xQ r5 = (X.C20350xQ) r5
            java.lang.Object r3 = r4.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.C20350xQ.A0D(r5, r3)
            X.17Y r2 = r5.A04
            r1 = 10
        L_0x05fa:
            X.1j9 r0 = new X.1j9
            r0.<init>(r5, r3, r1)
            r2.A0H(r0)
            return
        L_0x0603:
            java.lang.Object r1 = r4.A00
            X.0xQ r1 = (X.C20350xQ) r1
            java.lang.Object r0 = r4.A01
            X.17z r1 = r1.A0j
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A00(r0)
            return
        L_0x0613:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r1 = r4.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r0.A0g
        L_0x061d:
            r0.A02(r1)
            return
        L_0x0621:
            java.lang.Object r1 = r4.A00
            X.0xQ r1 = (X.C20350xQ) r1
            java.lang.Object r0 = r4.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1Op r1 = r1.A0g
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            r1.A02(r0)
            return
        L_0x0633:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r1 = r4.A01
            java.util.Set r1 = (java.util.Set) r1
            X.17z r0 = r0.A0j
            r0.A00(r1)
            return
        L_0x0641:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r1 = r4.A01
            java.util.Set r0 = r0.A15
            r0.remove(r1)
            return
        L_0x064d:
            java.lang.Object r5 = r4.A00
            X.0xQ r5 = (X.C20350xQ) r5
            java.lang.Object r3 = r4.A01
            X.144 r3 = (X.AnonymousClass144) r3
            X.0wQ r0 = r5.A05
            X.13w r2 = r0.A08()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            X.C18740tg.A06(r0)
            r1.add(r0)
            if (r2 == 0) goto L_0x0670
            r1.add(r2)
        L_0x0670:
            X.17X r0 = r5.A0U
            r0.A08(r3, r1)
            return
        L_0x0676:
            java.lang.Object r0 = r4.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r1 = r4.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.1PF r0 = r0.A0R
            r0.A01(r1)
            return
        L_0x0684:
            java.lang.Object r5 = r4.A00
            X.0xg r5 = (X.C20510xg) r5
            java.lang.Object r11 = r4.A01
            X.2VM r11 = (X.AnonymousClass2VM) r11
            X.12O r3 = r5.A02
            java.util.List r9 = r11.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            int r0 = r9.size()
            X.AcK r4 = X.C21891AcK.create(r0)
            java.util.Iterator r2 = r9.iterator()
        L_0x06a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06d4
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x06c0
            r0 = r1
            X.13w r0 = (X.C223313w) r0
            com.whatsapp.jid.PhoneUserJid r0 = r3.A0A(r0)
            if (r0 == 0) goto L_0x06a0
            X.AnonymousClass00C.A0B(r4)
            r4.put(r0, r1)
            goto L_0x06a0
        L_0x06c0:
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x06a0
            r0 = r1
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.13w r0 = r3.A09(r0)
            if (r0 == 0) goto L_0x06a0
            X.AnonymousClass00C.A0B(r4)
            r4.put(r1, r0)
            goto L_0x06a0
        L_0x06d4:
            X.AnonymousClass00C.A0B(r4)
            X.147 r6 = r11.A03
            X.C18740tg.A06(r9)
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x0706
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupIqResponseUtil/add-participants/timeout; groupId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; participants="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = 0
        L_0x06fd:
            r10 = 15
            java.lang.String r8 = "add"
            r11 = 0
            X.C20510xg.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0706:
            X.3pN r7 = new X.3pN
            r14 = r11
            r15 = r11
            r10 = r7
            r12 = r11
            r13 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x06fd
        L_0x0711:
            java.lang.Object r0 = r4.A00
            X.0xg r0 = (X.C20510xg) r0
            java.lang.Object r2 = r4.A01
            X.23D r2 = (X.AnonymousClass23D) r2
            X.005 r0 = r0.A0B
            java.lang.Object r1 = r0.get()
            X.1dy r1 = (X.C32651dy) r1
            X.147 r0 = r2.A03
            r1.A00(r0)
            return
        L_0x0727:
            java.lang.Object r0 = r4.A00
            X.1VE r0 = (X.AnonymousClass1VE) r0
            java.lang.Object r1 = r4.A01
            X.4Qr r1 = (X.C87914Qr) r1
            java.util.HashSet r0 = r0.A02()
            r1.B72(r0)
            return
        L_0x0737:
            java.lang.Object r5 = r4.A00
            X.1P5 r5 = (X.AnonymousClass1P5) r5
            java.lang.Object r4 = r4.A01
            X.3Kq r4 = (X.C63593Kq) r4
            X.1P6 r1 = r5.A0I
            r0 = 0
            X.8SX r6 = r1.A02(r4, r0)
            X.0wo r0 = r5.A0D
            long r2 = X.C19970wo.A00(r0)
            long r0 = r4.A05
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r0 = 0
            long r3 = java.lang.Math.max(r0, r2)
            X.189 r0 = r5.A0F     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            boolean r0 = r0.A0X()     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            if (r0 == 0) goto L_0x0770
            X.1PA r2 = r5.A0L     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            X.630 r1 = X.AnonymousClass1P5.A01(r5, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            X.1P7 r0 = r5.A0J     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            java.lang.String r0 = r0.A01()     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            r2.A03(r1, r0, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            return
        L_0x0770:
            X.187 r2 = r5.A0G     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            r0 = 8
            X.7qi r1 = new X.7qi     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            r1.<init>(r5, r6, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            java.lang.Object r2 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            X.630 r2 = (X.AnonymousClass630) r2     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            X.1PA r1 = r5.A0L     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            X.1P7 r0 = r5.A0J     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            java.lang.String r0 = r0.A01()     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            r1.A03(r2, r0, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0791 }
            return
        L_0x0791:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0798:
            java.lang.Object r1 = r4.A00
            X.1P5 r1 = (X.AnonymousClass1P5) r1
            java.lang.Object r0 = r4.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1Cf r1 = r1.A0H
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            r1.A02(r0)
            return
        L_0x07aa:
            java.lang.Object r0 = r4.A00
            X.1P5 r0 = (X.AnonymousClass1P5) r0
            java.lang.Object r3 = r4.A01
            X.6EZ r3 = (X.AnonymousClass6EZ) r3
            X.189 r2 = r0.A0F
            X.8dv r0 = X.C177518dv.A00
            java.lang.String r1 = r0.getRawString()
            X.6EU r0 = new X.6EU
            r0.<init>(r3, r1)
            r2.A0V(r0)
            return
        L_0x07c3:
            java.lang.Object r6 = r4.A00
            X.1P5 r6 = (X.AnonymousClass1P5) r6
            java.lang.Object r5 = r4.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r2 = r6.A0R
            monitor-enter(r2)
            java.util.Map r0 = X.AnonymousClass1P5.A06(r6)     // Catch:{ all -> 0x0838 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0838 }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x0838 }
            if (r0 == 0) goto L_0x07ed
            X.3Qa r1 = r0.A02     // Catch:{ all -> 0x0838 }
            X.005 r0 = r6.A0N     // Catch:{ all -> 0x0838 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0838 }
            X.0xM r0 = (X.C20310xM) r0     // Catch:{ all -> 0x0838 }
            boolean r0 = r0.A11(r1)     // Catch:{ all -> 0x0838 }
            if (r0 == 0) goto L_0x07ed
            r6.A0V(r5)     // Catch:{ all -> 0x0838 }
        L_0x07ed:
            monitor-exit(r2)     // Catch:{ all -> 0x0838 }
            java.lang.Object r4 = r6.A0Q
            monitor-enter(r4)
            java.util.Map r1 = X.AnonymousClass1P5.A05(r6)     // Catch:{ all -> 0x0835 }
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x0835 }
            if (r0 == 0) goto L_0x0833
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x0835 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0835 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0835 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0835 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0835 }
            r0.<init>(r1)     // Catch:{ all -> 0x0835 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0835 }
        L_0x0811:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0835 }
            if (r0 == 0) goto L_0x0833
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0835 }
            X.375 r2 = (X.AnonymousClass375) r2     // Catch:{ all -> 0x0835 }
            X.3Qa r1 = r2.A02     // Catch:{ all -> 0x0835 }
            X.005 r0 = r6.A0N     // Catch:{ all -> 0x0835 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0835 }
            X.0xM r0 = (X.C20310xM) r0     // Catch:{ all -> 0x0835 }
            boolean r0 = r0.A11(r1)     // Catch:{ all -> 0x0835 }
            if (r0 == 0) goto L_0x0811
            com.whatsapp.jid.UserJid r0 = r2.A01     // Catch:{ all -> 0x0835 }
            X.AnonymousClass1P5.A08(r5, r0, r6)     // Catch:{ all -> 0x0835 }
            goto L_0x0811
        L_0x0833:
            monitor-exit(r4)     // Catch:{ all -> 0x0835 }
            return
        L_0x0835:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0835 }
            throw r1
        L_0x0838:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0838 }
            throw r1
        L_0x083b:
            java.lang.Object r0 = r4.A00
            X.1D0 r0 = (X.AnonymousClass1D0) r0
            java.lang.Object r1 = r4.A01
            X.5z2 r1 = (X.C124935z2) r1
            X.1DE r0 = r0.A07
            r0.A05(r1)
            return
        L_0x0849:
            java.lang.Object r1 = r4.A00
            X.1D0 r1 = (X.AnonymousClass1D0) r1
            java.lang.Object r0 = r4.A01
            X.6vi r0 = (X.C146506vi) r0
            r1.A0C(r0)
            return
        L_0x0855:
            java.lang.Object r1 = r4.A00
            X.1Y4 r1 = (X.AnonymousClass1Y4) r1
            java.lang.Object r0 = r4.A01
            X.3SC r0 = (X.AnonymousClass3SC) r0
            X.16J r2 = r1.A06
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            java.util.List r1 = X.C007103b.A0Y(r0)
            r0 = 12
            goto L_0x088a
        L_0x0868:
            java.lang.Object r5 = r4.A00
            X.1Y4 r5 = (X.AnonymousClass1Y4) r5
            java.lang.Object r4 = r4.A01
            X.3SC r4 = (X.AnonymousClass3SC) r4
            X.1Y6 r3 = r5.A0D
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 9
            X.7sX r0 = new X.7sX
            r0.<init>(r3, r1)
            X.AnonymousClass1Y6.A00(r0, r4, r2)
            X.16J r2 = r5.A06
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r4.A02
            r0 = -1
        L_0x088a:
            r2.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35721j9.run():void");
    }

    public C35721j9(AnonymousClass1D0 r2, C146506vi r3) {
        this.A02 = 47;
        this.A00 = r2;
        this.A01 = r3;
    }
}
