package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8V9  reason: invalid class name */
public final class AnonymousClass8V9 extends AID {
    public C195919Wu A00;
    public C23042B1n A01;
    public final AnonymousClass17Y A02;
    public final C193029Jo A03;
    public final C20810yC A04;
    public final C199349fA A05;
    public final AnonymousClass19A A06;
    public final AnonymousClass3L6 A07;
    public final C63273Jk A08;
    public final C192079Fp A09;

    public final void A03(C195919Wu r7, C23042B1n b1n) {
        C203399nx r0;
        AnonymousClass00C.A0D(b1n, 1);
        this.A01 = b1n;
        String A092 = this.A06.A09();
        this.A07.A02("cart_view_tag");
        C63273Jk r1 = this.A08;
        UserJid userJid = r7.A03;
        r1.A00(userJid, A092, 253);
        C199349fA r3 = this.A05;
        C192079Fp r2 = this.A09;
        C22252AjD ajD = new C22252AjD(r7, this, A092);
        C22253AjE ajE = new C22253AjE(r7, this, A092);
        if (r2 != null) {
            C592133b r12 = (C592133b) ajD.invoke();
            AnonymousClass00C.A0D(r12, 1);
            r2.A00.put(A092, r12);
            r0 = r12.A00;
            AnonymousClass00C.A0B(r0);
        } else {
            r0 = (C203399nx) ajE.invoke();
        }
        r3.A01(this, r0, A092, 253);
        C36321k7.A1K(userJid, "RefreshCartProtocol/sendRefreshCartRequest/biz_jid=", AnonymousClass000.A0u());
    }

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A07.A01("cart_view_tag");
        C192079Fp r0 = this.A09;
        if (r0 != null) {
            r0.A00.remove(str);
        }
        this.A08.A01(str);
        this.A02.A0H(new C1497072l(this, 41));
        Log.i("RefreshCartProtocol/onDeliveryFailure");
        this.A00 = null;
    }

    public void BVm(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        C195919Wu r2 = this.A00;
        if (r2 == null) {
            Log.e("RefreshCartProtocol/onDirectConnectionSucceeded/directConnectionRequestToRetry is null");
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C165607th.A0r(userJid, "RefreshCartProtocol/onDirectConnectionSucceeded/jid=", A0u));
        C23042B1n b1n = this.A01;
        if (b1n != null) {
            A03(r2, b1n);
            return;
        }
        throw C36381kD.A0l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.6bP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.math.BigDecimal} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r39, java.lang.String r40) {
        /*
            r38 = this;
            r6 = r39
            r4 = r40
            X.C36321k7.A0w(r4, r6)
            r0 = r38
            X.3L6 r2 = r0.A07
            java.lang.String r1 = "cart_view_tag"
            r2.A01(r1)
            X.9Fp r3 = r0.A09
            if (r3 == 0) goto L_0x02e4
            java.util.concurrent.ConcurrentHashMap r1 = r3.A00
            java.lang.Object r2 = r1.get(r4)
            X.33b r2 = (X.C592133b) r2
        L_0x001c:
            X.3Jk r1 = r0.A08
            r1.A02(r4)
            if (r2 == 0) goto L_0x02ee
            if (r3 == 0) goto L_0x002a
            java.util.concurrent.ConcurrentHashMap r1 = r3.A00
            r1.remove(r4)
        L_0x002a:
            X.9Jo r4 = r0.A03
            r5 = 0
            r3 = 1
            X.9nx r2 = X.C90514aH.A0e(r6, r2)
            r1 = 26
            X.C203539oF.A0A(r2, r6, r1)
            r1 = 2
            X.Azj[] r2 = new X.C22993Azj[r1]
            X.AK1 r1 = X.AK1.A00
            r2[r5] = r1
            X.AK2 r1 = X.AK2.A00
            java.util.ArrayList r3 = X.C165567td.A0d(r1, r2, r3)
            java.lang.String r5 = "cart"
            java.lang.String r1 = "price"
            java.lang.String[] r2 = new java.lang.String[]{r5, r1}
            java.lang.String r1 = "PriceDetailsProvided|PriceDetailsNotProvided"
            java.lang.Object r3 = X.C203379ns.A06(r6, r1, r3, r2)
            X.Azr r3 = (X.C23001Azr) r3
            java.lang.String r1 = "product"
            java.lang.String[] r8 = new java.lang.String[]{r5, r1}
            X.AK3 r7 = X.AK3.A00
            r9 = 1
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.ArrayList r14 = X.C203539oF.A09(r6, r7, r8, r9, r11)
            X.9P0 r2 = r4.A01
            r1 = 1
            X.6Tk[] r9 = new X.C132386Tk[r1]
            r13 = 0
            r6 = 0
            r9[r13] = r6
            java.math.BigDecimal[] r8 = new java.math.BigDecimal[r1]
            r8[r13] = r6
            java.math.BigDecimal[] r7 = new java.math.BigDecimal[r1]
            r7[r13] = r6
            X.9eJ r12 = new X.9eJ
            r12.<init>(r2, r9, r8, r7)
            boolean r1 = r3 instanceof X.C185098tb
            if (r1 == 0) goto L_0x00c1
            X.8tb r3 = (X.C185098tb) r3
            X.8rj r1 = r3.A00
            if (r1 == 0) goto L_0x02e1
            java.lang.String r2 = r1.A00
            boolean r1 = X.AnonymousClass14B.A0F(r2)
            if (r1 != 0) goto L_0x02e1
            X.6Tk r5 = new X.6Tk
            r5.<init>(r2)
        L_0x0094:
            X.6Tk[] r1 = r12.A01
            r1[r13] = r5
            X.8rn r1 = r3.A02
            java.math.BigDecimal[] r11 = r12.A03
            r10 = 0
            if (r1 == 0) goto L_0x02de
            if (r5 == 0) goto L_0x02de
            java.lang.Object r1 = r1.A00
            long r1 = X.C36431kI.A09(r1)
            java.math.BigDecimal r1 = X.C129676Ia.A00(r5, r1)
        L_0x00ab:
            r11[r13] = r1
            X.8rn r1 = r3.A01
            java.math.BigDecimal[] r3 = r12.A02
            if (r1 == 0) goto L_0x00bf
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r1 = r1.A00
            long r1 = X.C36431kI.A09(r1)
            java.math.BigDecimal r10 = X.C129676Ia.A00(r5, r1)
        L_0x00bf:
            r3[r13] = r10
        L_0x00c1:
            r3 = r9[r13]
            if (r3 == 0) goto L_0x00d2
            r2 = r8[r13]
            if (r2 == 0) goto L_0x00d2
            r1 = r7[r13]
            if (r1 == 0) goto L_0x00d2
            X.9Ju r6 = new X.9Ju
            r6.<init>(r3, r1, r2)
        L_0x00d2:
            X.1cO r5 = r4.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r18 = r14.iterator()
        L_0x00dc:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x02e7
            java.lang.Object r3 = r18.next()
            X.8sA r3 = (X.C184268sA) r3
            X.9OJ r7 = new X.9OJ
            r7.<init>()
            r1 = 0
            r7.A00 = r1
            r1 = 1
            r7.A0A = r1
            java.lang.Object r1 = r3.A00
            X.8rn r1 = (X.C184038rn) r1
            if (r1 == 0) goto L_0x02da
            java.lang.Object r1 = r1.A00
            long r1 = X.C36431kI.A09(r1)
        L_0x00ff:
            r7.A01 = r1
            java.lang.Object r2 = r3.A01
            X.Azs r2 = (X.C23002Azs) r2
            X.9HP r1 = new X.9HP
            r1.<init>(r7, r5)
            r2.Azt(r1)
            java.lang.Object r11 = r3.A02
            X.8sG r11 = (X.C184328sG) r11
            X.6Tk r10 = r7.A05
            if (r11 != 0) goto L_0x0162
            r1 = 0
        L_0x0116:
            r7.A04 = r1
            java.lang.String r12 = r7.A06
            java.lang.String r11 = r7.A07
            if (r12 == 0) goto L_0x00dc
            if (r11 == 0) goto L_0x00dc
            java.math.BigDecimal r15 = r7.A08
            X.6Tk r14 = r7.A05
            r20 = 0
            java.util.List r1 = r7.A09
            java.util.ArrayList r32 = X.C90504aG.A0u(r1)
            X.9tw r13 = r7.A02
            X.6bV r10 = r7.A03
            int r9 = r7.A00
            boolean r8 = r7.A0A
            long r1 = r7.A01
            X.6bW r7 = r7.A04
            X.9up r3 = new X.9up
            r28 = r20
            r29 = r20
            r30 = r20
            r37 = 0
            r19 = r3
            r21 = r13
            r22 = r10
            r23 = r7
            r24 = r14
            r25 = r12
            r26 = r11
            r27 = r20
            r31 = r15
            r33 = r9
            r34 = r1
            r36 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37)
            r4.add(r3)
            goto L_0x00dc
        L_0x0162:
            java.lang.Object r1 = r11.A04
            X.8rn r1 = (X.C184038rn) r1
            r9 = 0
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01e3
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r17 = r1.iterator()
        L_0x0177:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r17.next()
            X.1jN r1 = (X.C35861jN) r1
            java.lang.String r13 = r1.A01
            X.AnonymousClass00C.A08(r13)
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r12 = X.C36411kG.A13(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x0194:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x01d9
            java.lang.Object r1 = r16.next()
            X.1jN r1 = (X.C35861jN) r1
            java.lang.String r8 = r1.A01
            X.AnonymousClass00C.A08(r8)
            java.lang.Object r1 = r1.A00
            X.8sJ r1 = (X.C184358sJ) r1
            if (r1 != 0) goto L_0x01b4
            X.4zX r2 = new X.4zX
            r2.<init>(r8)
        L_0x01b0:
            r12.add(r2)
            goto L_0x0194
        L_0x01b4:
            java.lang.String r14 = r1.A03
            java.lang.String r3 = r1.A04
            java.lang.String r2 = r1.A05
            java.lang.Object r15 = r1.A02
            int r23 = X.AnonymousClass000.A0I(r15)
            java.lang.Object r1 = r1.A00
            int r24 = X.AnonymousClass000.A0I(r1)
            X.9tv r1 = new X.9tv
            r19 = r1
            r20 = r14
            r21 = r3
            r22 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            X.4zY r2 = new X.4zY
            r2.<init>(r1, r8)
            goto L_0x01b0
        L_0x01d9:
            X.6b5 r1 = X.C31831cS.A00(r13, r12)
            if (r1 == 0) goto L_0x0177
            r9.add(r1)
            goto L_0x0177
        L_0x01e3:
            java.lang.Object r1 = r11.A00
            X.8rn r1 = (X.C184038rn) r1
            r12 = 0
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r1.A00
            X.8rn r1 = (X.C184038rn) r1
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0254
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            java.util.Iterator r16 = r1.iterator()
        L_0x01fe:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x024f
            java.lang.Object r3 = r16.next()
            X.8tJ r3 = (X.C184978tJ) r3
            X.8rj r1 = r3.A00
            if (r1 == 0) goto L_0x01fe
            java.lang.String r14 = r1.A00
            if (r14 == 0) goto L_0x01fe
            java.lang.String r2 = r3.A01
            java.lang.String r1 = "true"
            boolean r12 = X.AnonymousClass00C.A0J(r2, r1)
            java.util.List r1 = r3.A02
            X.AnonymousClass00C.A08(r1)
            java.util.ArrayList r8 = X.C36321k7.A0J(r1)
            java.util.Iterator r15 = r1.iterator()
        L_0x0227:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0246
            java.lang.Object r1 = r15.next()
            X.1jO r1 = (X.C35871jO) r1
            java.lang.String r3 = r1.A00
            X.AnonymousClass00C.A08(r3)
            java.lang.String r2 = r1.A01
            X.AnonymousClass00C.A08(r2)
            X.6bJ r1 = new X.6bJ
            r1.<init>(r3, r2)
            r8.add(r1)
            goto L_0x0227
        L_0x0246:
            X.6bO r1 = new X.6bO
            r1.<init>(r14, r8, r12)
            r13.add(r1)
            goto L_0x01fe
        L_0x024f:
            X.6bD r12 = new X.6bD
            r12.<init>(r13)
        L_0x0254:
            java.lang.Object r13 = r11.A01
            X.8sA r13 = (X.C184268sA) r13
            r2 = 0
            if (r13 == 0) goto L_0x029f
            java.lang.Object r1 = r13.A00
            X.8rj r1 = (X.C183998rj) r1
            if (r1 == 0) goto L_0x0281
            java.lang.String r8 = r1.A00
        L_0x0263:
            java.lang.Object r1 = r13.A02
            X.8se r1 = (X.C184568se) r1
            r3 = 1
            if (r1 == 0) goto L_0x027f
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x027f
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 != r3) goto L_0x027f
        L_0x0274:
            java.lang.Object r1 = r13.A01
            X.8rj r1 = (X.C183998rj) r1
            if (r1 == 0) goto L_0x0299
            java.lang.String r13 = r1.A00
            if (r13 == 0) goto L_0x0299
            goto L_0x0283
        L_0x027f:
            r3 = 0
            goto L_0x0274
        L_0x0281:
            r8 = r2
            goto L_0x0263
        L_0x0283:
            X.0fN r1 = X.AnonymousClass0RV.A00     // Catch:{ NumberFormatException -> 0x0299 }
            boolean r1 = r1.A03(r13)     // Catch:{ NumberFormatException -> 0x0299 }
            if (r1 == 0) goto L_0x0299
            java.math.BigDecimal r1 = X.C165617ti.A0b(r13)     // Catch:{ NumberFormatException -> 0x0299 }
            if (r10 == 0) goto L_0x0299
            long r1 = r1.longValue()
            java.math.BigDecimal r2 = X.C129676Ia.A00(r10, r1)
        L_0x0299:
            X.6bP r1 = new X.6bP
            r1.<init>(r8, r2, r3)
            r2 = r1
        L_0x029f:
            java.lang.Object r1 = r11.A03
            X.8rn r1 = (X.C184038rn) r1
            if (r1 == 0) goto L_0x02d2
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x02d2
            java.util.ArrayList r11 = X.C36321k7.A0J(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x02b3:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x02d3
            java.lang.Object r1 = r10.next()
            X.1jO r1 = (X.C35871jO) r1
            java.lang.String r8 = r1.A00
            X.AnonymousClass00C.A08(r8)
            java.lang.String r3 = r1.A01
            X.AnonymousClass00C.A08(r3)
            X.6bJ r1 = new X.6bJ
            r1.<init>(r8, r3)
            r11.add(r1)
            goto L_0x02b3
        L_0x02d2:
            r11 = 0
        L_0x02d3:
            X.6bW r1 = new X.6bW
            r1.<init>(r12, r2, r9, r11)
            goto L_0x0116
        L_0x02da:
            r1 = 99
            goto L_0x00ff
        L_0x02de:
            r1 = r6
            goto L_0x00ab
        L_0x02e1:
            r5 = 0
            goto L_0x0094
        L_0x02e4:
            r2 = 0
            goto L_0x001c
        L_0x02e7:
            X.9VQ r5 = new X.9VQ
            r5.<init>(r6, r4)
            goto L_0x037a
        L_0x02ee:
            X.9Jo r3 = r0.A03
            java.lang.String r1 = "cart"
            X.9nx r2 = r6.A0c(r1)
            if (r2 == 0) goto L_0x0367
            java.lang.String r1 = "product"
            java.util.List r4 = r2.A0j(r1)
            java.util.ArrayList r1 = X.C36411kG.A13(r4)
            java.util.Iterator r7 = r4.iterator()
        L_0x0306:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0369
            X.9nx r6 = X.C36431kI.A0s(r7)
            X.1cO r4 = r3.A00
            X.9up r8 = r4.A03(r6)
            if (r8 != 0) goto L_0x034d
            java.lang.String r4 = "id"
            X.9nx r5 = r6.A0c(r4)
            java.lang.String r4 = "status"
            X.9nx r4 = r6.A0c(r4)
            r9 = 0
            if (r5 != 0) goto L_0x0362
            r14 = r9
        L_0x0328:
            if (r4 != 0) goto L_0x0351
            r10 = r9
        L_0x032b:
            if (r14 == 0) goto L_0x0306
            java.util.ArrayList r21 = X.AnonymousClass001.A0I()
            java.lang.String r15 = ""
            r22 = 0
            r23 = 99
            r25 = 1
            r12 = r9
            r13 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r26 = 0
            X.9up r8 = new X.9up
            r11 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
        L_0x034d:
            r1.add(r8)
            goto L_0x0306
        L_0x0351:
            r19 = 3
            r20 = 0
            X.9tw r10 = new X.9tw
            r17 = r9
            r18 = r9
            r15 = r10
            r16 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x032b
        L_0x0362:
            java.lang.String r14 = r5.A0e()
            goto L_0x0328
        L_0x0367:
            r5 = 0
            goto L_0x037a
        L_0x0369:
            X.9P0 r4 = r3.A01
            java.lang.String r3 = "price"
            X.9nx r2 = r2.A0c(r3)
            X.9Ju r2 = r4.A00(r2)
            X.9VQ r5 = new X.9VQ
            r5.<init>(r2, r1)
        L_0x037a:
            r1 = 0
            r0.A00 = r1
            X.17Y r3 = r0.A02
            r2 = 29
            X.AVa r1 = new X.AVa
            r1.<init>(r0, r5, r2)
            r3.A0H(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8V9.BiM(X.9nx, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8V9(AnonymousClass17Y r2, AnonymousClass1KK r3, C193029Jo r4, C20810yC r5, C199349fA r6, AnonymousClass19A r7, AnonymousClass3L6 r8, C63273Jk r9) {
        super(r3);
        C192079Fp r0;
        C36321k7.A18(r3, r2, r8, r7);
        C36321k7.A13(r6, r9, r5);
        this.A02 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A04 = r5;
        if (r5.A0E(6503)) {
            r0 = new C192079Fp();
        } else {
            r0 = null;
        }
        this.A09 = r0;
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0i = C36341k9.A0i(userJid);
        C36321k7.A1Z(A0i, C165607th.A0r(userJid, "RefreshCartProtocol/onDirectConnectionError/jid=", A0i));
        this.A02.A0H(new C1497072l(this, 42));
        this.A00 = null;
    }

    public void BWw(C203399nx r5, String str) {
        C36321k7.A0w(str, r5);
        this.A07.A01("cart_view_tag");
        this.A08.A01(str);
        C192079Fp r0 = this.A09;
        if (r0 != null) {
            r0.A00.remove(str);
        }
        Pair A012 = AnonymousClass3ME.A01(r5);
        C195919Wu r02 = this.A00;
        if (!(r02 == null || A012 == null)) {
            UserJid userJid = r02.A03;
            Object obj = A012.first;
            AnonymousClass00C.A07(obj);
            if (A02(userJid, AnonymousClass000.A0I(obj))) {
                return;
            }
        }
        this.A00 = null;
        this.A02.A0H(new AVa(A012, this, 28));
    }
}
