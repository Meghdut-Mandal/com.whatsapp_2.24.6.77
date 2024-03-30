package X;

/* renamed from: X.73N  reason: invalid class name */
public class AnonymousClass73N implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass73N(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.5H1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.5H6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: X.5H1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: X.5H1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: X.5H1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: X.5H1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: X.5H1} */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05e5, code lost:
        if (r0 != null) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0774, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0775, code lost:
        com.whatsapp.util.Log.e("voicenote/startvoicenote/startfailed", r1);
        r5.A0O = r5.A1D;
        X.C1498172w.A00(r4, r5, r3, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0782, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        if (r0 != null) goto L_0x05e8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r41 = this;
            r0 = r41
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x022c;
                case 1: goto L_0x0bdf;
                case 2: goto L_0x0bc9;
                case 3: goto L_0x0baf;
                case 4: goto L_0x0212;
                case 5: goto L_0x0b7d;
                case 6: goto L_0x0b62;
                case 7: goto L_0x0a84;
                case 8: goto L_0x09f5;
                case 9: goto L_0x07b7;
                case 10: goto L_0x0789;
                case 11: goto L_0x01e0;
                case 12: goto L_0x0187;
                case 13: goto L_0x0715;
                case 14: goto L_0x0604;
                case 15: goto L_0x010e;
                case 16: goto L_0x00b9;
                case 17: goto L_0x05ec;
                case 18: goto L_0x0066;
                case 19: goto L_0x058a;
                case 20: goto L_0x04d9;
                case 21: goto L_0x04c2;
                case 22: goto L_0x04a8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A00
            X.67d r1 = (X.C1271467d) r1
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.A02
            X.2bV r5 = (X.AnonymousClass2bV) r5
            java.lang.Object r4 = r0.A03
            X.8Hw r4 = (X.C170888Hw) r4
            X.005 r0 = r1.A03
            java.lang.Object r2 = r0.get()
            X.632 r2 = (X.AnonymousClass632) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            boolean r1 = r3 instanceof android.app.Application
            r0 = 0
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = "Application context was passed in for burning"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x002e:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "XFamilyTextStatusBurningManager/text status burning failed for message: "
            r3.append(r2)
            long r0 = r5.A1N
            java.lang.String r1 = X.C36411kG.A11(r3, r0)
            r0 = 0
            X.AnonymousClass1UT.A01(r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r2)
            long r0 = r5.A1N
            java.lang.String r0 = X.C36411kG.A11(r2, r0)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            r4.A05(r0)
        L_0x0052:
            return
        L_0x0053:
            X.0xW r1 = r2.A01
            X.1ok r0 = X.C55452ue.A00(r3, r0, r5)
            java.io.File r0 = r1.A00(r5, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x05e8
            goto L_0x002e
        L_0x0066:
            java.lang.Object r5 = r0.A00
            java.lang.Object r2 = r0.A01
            X.7fl r2 = (X.C158077fl) r2
            java.lang.Object r1 = r0.A02
            X.5tz r1 = (X.C121955tz) r1
            java.lang.Object r4 = r0.A03
            X.5PE r4 = (X.AnonymousClass5PE) r4
            r3 = 1
            X.AnonymousClass00C.A0D(r2, r3)
            X.7ku r0 = r2.B7y()
            X.AnonymousClass6JI.A01(r0, r5)
            int r1 = r1.A00
            if (r1 == 0) goto L_0x00af
            if (r1 == r3) goto L_0x00b2
            r0 = 3
            if (r1 != r0) goto L_0x0052
            r0 = 2
            X.5Tq[] r2 = new X.C108475Tq[r0]
            r1 = 0
            X.5Tq r0 = X.C108475Tq.FACEBOOK
            r2[r1] = r0
            X.5Tq r0 = X.C108475Tq.INSTAGRAM
            java.util.List r2 = X.C90524aI.A0p(r0, r2, r3)
        L_0x0096:
            X.AnonymousClass00C.A08(r2)
            X.2ZJ r0 = r4.A02
            java.util.Iterator r1 = X.C90474aD.A0p(r0)
        L_0x009f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()
            X.4SW r0 = (X.AnonymousClass4SW) r0
            r0.Bjr(r2)
            goto L_0x009f
        L_0x00af:
            X.5Tq r0 = X.C108475Tq.FACEBOOK
            goto L_0x00b4
        L_0x00b2:
            X.5Tq r0 = X.C108475Tq.INSTAGRAM
        L_0x00b4:
            java.util.List r2 = java.util.Collections.singletonList(r0)
            goto L_0x0096
        L_0x00b9:
            java.lang.Object r1 = r0.A00
            X.67o r1 = (X.C1272567o) r1
            java.lang.Object r5 = r0.A01
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r0.A03
            X.4vb r0 = r1.A00()
            if (r5 == 0) goto L_0x00e7
            r5.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            java.lang.String r1 = r1.A02
            java.lang.String r0 = "CLOSE"
            boolean r1 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = 2131896334(0x7f12280e, float:1.9427526E38)
            if (r1 == 0) goto L_0x00e0
            r0 = 2131896407(0x7f122857, float:1.9427674E38)
        L_0x00e0:
            java.lang.CharSequence r0 = r2.getText(r0)
            r5.setNavigationContentDescription((java.lang.CharSequence) r0)
        L_0x00e7:
            android.content.res.Resources r3 = r2.getResources()
            if (r3 == 0) goto L_0x010b
            if (r5 == 0) goto L_0x0052
            android.content.Context r2 = r5.getContext()
            r1 = 2130971132(0x7f0409fc, float:1.7550994E38)
            r0 = 2131102537(0x7f060b49, float:1.7817515E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            X.C36391kE.A1C(r3, r5, r0)
        L_0x0100:
            r1 = 28
            X.6cl r0 = new X.6cl
            r0.<init>(r4, r1)
            r5.setNavigationOnClickListener(r0)
            return
        L_0x010b:
            if (r5 == 0) goto L_0x0052
            goto L_0x0100
        L_0x010e:
            java.lang.Object r7 = r0.A00
            X.5sX r7 = (X.C121065sX) r7
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            X.7fl r1 = (X.C158077fl) r1
            java.lang.Object r0 = r0.A03
            X.7fl r0 = (X.C158077fl) r0
            X.4vP r3 = X.C142326oh.A03(r2)
            java.util.Map r2 = java.util.Collections.emptyMap()
            X.7ku r1 = r1.B7y()
            X.7ku r0 = r0.B7y()
            r6 = 0
            if (r1 != 0) goto L_0x0181
            r5 = r6
        L_0x0130:
            if (r0 == 0) goto L_0x0137
            X.6KA r6 = new X.6KA
            r6.<init>((X.C100674vP) r3, (X.C160377ku) r0)
        L_0x0137:
            X.67i r4 = r3.A00
            if (r4 != 0) goto L_0x0143
            java.lang.String r1 = "BloksAsyncAction"
            java.lang.String r0 = "Async action executed with a null Context"
        L_0x013f:
            X.AnonymousClass6RS.A01(r1, r0)
            return
        L_0x0143:
            X.4vP r3 = X.C131756Qk.A00(r7, r4, r2)
            X.7ku r2 = r7.A01
            r1 = 0
            if (r2 == 0) goto L_0x016d
            X.68b r0 = X.C1273868b.A00()
            X.6MO r0 = X.C1273868b.A05(r0, r4, r1)
            java.lang.Object r0 = X.AnonymousClass6JI.A00(r3, r0, r2)
            if (r5 == 0) goto L_0x0052
            X.68b r1 = X.C1273868b.A02(r0)
            r0 = 1
            X.6MO r2 = X.C1273868b.A05(r1, r4, r0)
            X.7ku r1 = r5.A01
            X.4vP r0 = r5.A00
        L_0x0167:
            if (r0 == 0) goto L_0x017c
            X.AnonymousClass6JI.A00(r0, r2, r1)
            return
        L_0x016d:
            if (r6 == 0) goto L_0x0052
            X.68b r0 = X.C1273868b.A00()
            X.6MO r2 = X.C1273868b.A05(r0, r4, r1)
            X.7ku r1 = r6.A01
            X.4vP r0 = r6.A00
            goto L_0x0167
        L_0x017c:
            java.lang.String r1 = "BloksCallback"
            java.lang.String r0 = "An attempt to invoke an invalid callback"
            goto L_0x013f
        L_0x0181:
            X.6KA r5 = new X.6KA
            r5.<init>((X.C100674vP) r3, (X.C160377ku) r1)
            goto L_0x0130
        L_0x0187:
            java.lang.Object r1 = r0.A03
            X.5n5 r1 = (X.C117945n5) r1
            X.6YP r6 = r1.A00
            X.6Tw r1 = r6.A0G
            if (r1 == 0) goto L_0x0052
            int r5 = r1.A02()
            X.6Tw r1 = r6.A0G
            int r2 = r1.A03()
            X.6Tw r1 = r6.A0G
            boolean r4 = r1.A0D()
            java.lang.Object r3 = r0.A00
            X.7hs r3 = (X.C158667hs) r3
            java.lang.Boolean r1 = X.C36381kD.A0j()
            r3.B2H(r1)
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r3 = r0.A02
            android.os.Handler r3 = (android.os.Handler) r3
            r1 = 16
            r3.postDelayed(r0, r1)
        L_0x01b7:
            java.lang.Object r1 = r0.A01
            X.7hs r1 = (X.C158667hs) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.B2H(r0)
            return
        L_0x01c3:
            if (r5 != r2) goto L_0x01b7
            X.6Tw r1 = r6.A0G
            r1.A09()
            X.6Tw r1 = r6.A0G
            if (r1 == 0) goto L_0x01d8
            r1.A05()     // Catch:{ IOException | IllegalStateException -> 0x01d2 }
            goto L_0x01d8
        L_0x01d2:
            r2 = move-exception
            java.lang.String r1 = "VoiceNoteDraftSeekRunnable/ error preparing audio player for voice note preview "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x01d8:
            java.lang.Boolean r1 = X.C36371kC.A0m()
            r3.B2H(r1)
            goto L_0x01b7
        L_0x01e0:
            java.lang.Object r2 = r0.A00
            X.005 r2 = (X.AnonymousClass005) r2
            java.lang.Object r1 = r0.A02
            X.0wQ r1 = (X.C19730wQ) r1
            java.lang.Object r3 = r0.A03
            X.0yN r3 = (X.C20920yN) r3
            java.lang.Object r0 = r2.get()
            X.6sg r0 = (X.C144706sg) r0
            r0.BV2()
            r1.A0G()
            com.whatsapp.Me r0 = r1.A00
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r2 = X.AnonymousClass1M4.A01(r1, r0)
            X.AnonymousClass00C.A08(r2)
            r1 = 6833(0x1ab1, float:9.575E-42)
            r0 = 3
            r3.BqE(r2, r1, r0)
            r0 = 2
            r3.BqE(r2, r1, r0)
            return
        L_0x0212:
            java.lang.Object r4 = r0.A00
            X.8j0 r4 = (X.C179068j0) r4
            java.lang.Object r3 = r0.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            java.lang.Object r2 = r0.A02
            X.9ua r2 = (X.C207119ua) r2
            java.lang.Object r1 = r0.A03
            X.9un r1 = (X.C207249un) r1
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0052
            r4.A4m(r1, r2, r3)
            return
        L_0x022c:
            java.lang.Object r3 = r0.A00
            X.653 r3 = (X.AnonymousClass653) r3
            java.lang.Object r1 = r0.A01
            X.6VT r1 = (X.AnonymousClass6VT) r1
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r7 = r0.A03
            X.6Tg r7 = (X.C132366Tg) r7
            r2 = 1
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0052
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0052
            X.00s r0 = r1.A02
            r40 = r0
            java.lang.Object r0 = r40.A04()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = X.AnonymousClass143.A0N(r0)
            java.lang.Object r0 = r40.A04()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r5 = X.AnonymousClass143.A0M(r0)
            java.util.ArrayList r6 = X.C36321k7.A0J(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0265:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r4.next()
            android.net.Uri r0 = (android.net.Uri) r0
            X.6QO r0 = r7.A03(r0)
            r6.add(r0)
            goto L_0x0265
        L_0x0279:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r6.iterator()
        L_0x0281:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x029e
            java.lang.Object r6 = r7.next()
            r4 = r6
            X.6QO r4 = (X.AnonymousClass6QO) r4
            X.1Gn r0 = r3.A06
            int r4 = X.AnonymousClass6QO.A00(r4, r0)
            if (r4 == r2) goto L_0x029a
            r0 = 42
            if (r4 != r0) goto L_0x0281
        L_0x029a:
            r8.add(r6)
            goto L_0x0281
        L_0x029e:
            java.util.Iterator r16 = r8.iterator()
        L_0x02a2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r4 = r16.next()
            X.6QO r4 = (X.AnonymousClass6QO) r4
            X.AnonymousClass00C.A0B(r4)
            java.util.List r9 = X.C36401kF.A0w(r40)
            java.io.File r0 = r4.A08()
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            X.AnonymousClass1GX.A0X(r0, r4)
            android.net.Uri r29 = r0.build()
            X.1D0 r0 = r3.A07
            java.lang.Integer r4 = r4.A09()
            if (r4 == 0) goto L_0x0bf6
            int r8 = r4.intValue()
            X.0yC r7 = r3.A05
            r13 = 1
            r6 = 0
            if (r9 == 0) goto L_0x04a5
            int r4 = r9.size()
            if (r4 != r2) goto L_0x04a5
            java.lang.Object r4 = r9.get(r6)
            boolean r4 = r4 instanceof com.whatsapp.jid.PhoneUserJid
            if (r4 == 0) goto L_0x04a5
            X.0yV r6 = X.C21000yV.A01
            r4 = 1539(0x603, float:2.157E-42)
            boolean r4 = X.C20800yB.A01(r6, r7, r4)
            if (r4 == 0) goto L_0x04a5
        L_0x02f2:
            X.3Ot r7 = new X.3Ot
            r7.<init>(r2, r1, r5)
            X.1D1 r6 = r0.A0C
            r4 = 0
            X.63a r31 = r6.A00(r4, r8, r1)
            r6 = 0
            X.1Gl r33 = X.AnonymousClass6Y1.A01(r4, r8, r6)
            r34 = r4
            r35 = r4
            r36 = 0
            r38 = 1
            r39 = 1
            r30 = r4
            r32 = r7
            r37 = r1
            X.3Rg r9 = X.C65233Rg.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.1D5 r12 = r0.A06
            X.1DE r11 = r12.A0H
            java.lang.String r7 = X.C36361kB.A0l()
            X.5z2 r19 = r11.A02(r7, r6)
            X.0wo r8 = r12.A06
            X.0wU r7 = r12.A0O
            X.6Wa r10 = new X.6Wa
            r22 = 1
            r17 = r10
            r18 = r8
            r20 = r11
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            monitor-enter(r10)
            r10.A0D = r2     // Catch:{ all -> 0x0bf3 }
            monitor-exit(r10)
            X.0yC r11 = r12.A0A
            r7 = 4
            X.AnonymousClass00C.A0D(r11, r7)
            X.5z9 r7 = r9.A01
            X.7jL r21 = X.AnonymousClass1D0.A00(r7)
            X.6vi r8 = new X.6vi
            r20 = r8
            r22 = r11
            r23 = r19
            r24 = r10
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25)
            X.5z2 r7 = r8.A0M
            java.lang.String r12 = r7.A0D
            X.AnonymousClass00C.A0D(r12, r6)
            X.1Hk r6 = r8.A0B
            r6.A04(r12)
            if (r13 == 0) goto L_0x0383
            X.1Ff r7 = r0.A09
            X.65P r6 = r9.A02
            X.1Gl r6 = r6.A08
            boolean r6 = r7.A02(r6, r2)
            if (r6 != 0) goto L_0x0383
            X.0yC r7 = r0.A03
            r6 = 3926(0xf56, float:5.501E-42)
            boolean r6 = r7.A0E(r6)
            if (r6 == 0) goto L_0x0383
            java.lang.String r6 = "express-optimistic"
            r8.A0X = r6
            X.6Wa r7 = r8.A0N
            r6 = 4
            r7.A08(r6)
        L_0x0383:
            X.1GV r11 = r0.A0B
            X.65P r6 = r8.A03()
            X.0yW r14 = r11.A02
            X.0yC r13 = r11.A01
            X.3Rg r7 = r8.A0O
            int r9 = r7.A00
            int r7 = r8.A01()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            X.6Tv r10 = new X.6Tv
            r10.<init>(r13, r14, r7, r9)
            X.58x r7 = r10.A02
            java.util.UUID r9 = java.util.UUID.fromString(r12)
            long r14 = r9.getMostSignificantBits()
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = r14 & r12
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r7.A0N = r9
            X.58v r7 = r10.A01
            r7.A0E = r9
            X.5yE r9 = new X.5yE
            r9.<init>(r10)
            X.1Gl r13 = r6.A08
            X.1Gl r12 = X.C25471Gl.A0D
            if (r13 == r12) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0l
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0J
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0b
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A08
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A09
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0T
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0G
            if (r13 == r7) goto L_0x045d
            X.1Gl r7 = X.C25471Gl.A0H
            if (r13 == r7) goto L_0x045d
            boolean r4 = X.AnonymousClass6Y1.A07(r13)
            if (r4 == 0) goto L_0x02a2
            java.io.File r4 = r6.A0A
            r24 = r4
            java.lang.String r4 = r6.A0E
            r26 = r4
            java.lang.String r4 = r6.A0C
            r27 = r4
            X.3S2 r4 = r6.A09
            r23 = r4
            java.lang.String r4 = r6.A0D
            r17 = r4
            X.7gr r15 = r9.A06
            X.5mB r12 = r9.A05
            X.7gs r7 = r9.A07
            java.io.File r13 = r6.A00()
            boolean r4 = r6.A0J
            if (r4 == 0) goto L_0x045a
            java.lang.String r14 = ".was"
        L_0x040d:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r4 = X.C36361kB.A0l()
            java.lang.String r4 = X.AnonymousClass000.A0p(r4, r14, r6)
            java.io.File r25 = X.AnonymousClass1GV.A00(r11, r13, r4)
            X.5BW r6 = new X.5BW
            r18 = r10
            r19 = r8
            r20 = r12
            r21 = r15
            r22 = r7
            r28 = r17
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1Gk r7 = r11.A05
            X.1Gl r4 = X.C25471Gl.A0d
            r7.A00(r6, r4)
        L_0x0437:
            X.6Wa r6 = r8.A0N
            X.6Tv r4 = r9.A00
            r6.A0A(r4)
            X.AnonymousClass1D0.A01(r0, r8, r9)
            r6 = 3
            X.7si r4 = new X.7si
            r4.<init>(r8, r0, r6)
            java.util.concurrent.Executor r0 = r0.A0G
            r8.A06(r4, r0)
            android.net.Uri r4 = X.AnonymousClass1GX.A0U(r29)
            java.util.Map r0 = r3.A09
            X.AnonymousClass00C.A0B(r4)
            r0.put(r4, r8)
            goto L_0x02a2
        L_0x045a:
            java.lang.String r14 = ".webp"
            goto L_0x040d
        L_0x045d:
            java.lang.String r7 = r6.A0E
            r25 = r7
            X.C18740tg.A06(r25)
            X.7gr r7 = r9.A06
            r21 = r7
            X.7gs r15 = r9.A07
            java.io.File r14 = r6.A00()
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.util.UUID r7 = java.util.UUID.randomUUID()
            X.C36351kA.A1K(r7, r13)
            java.lang.String r7 = ".jpg"
            java.lang.String r7 = X.AnonymousClass000.A0q(r7, r13)
            java.io.File r24 = X.AnonymousClass1GV.A00(r11, r14, r7)
            X.63a r13 = r6.A07
            X.C18740tg.A06(r13)
            boolean r7 = r6.A0H
            X.5BV r6 = new X.5BV
            r26 = 0
            r17 = r6
            r18 = r10
            r19 = r8
            r20 = r4
            r22 = r15
            r23 = r13
            r27 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.1Gk r4 = r11.A05
            r4.A00(r6, r12)
            goto L_0x0437
        L_0x04a5:
            r13 = 0
            goto L_0x02f2
        L_0x04a8:
            java.lang.Object r5 = r0.A00
            X.6V7 r5 = (X.AnonymousClass6V7) r5
            java.lang.Object r4 = r0.A01
            X.6Bn r4 = (X.C128256Bn) r4
            java.lang.Object r3 = r0.A02
            X.6Dl r3 = (X.C128746Dl) r3
            java.lang.Object r2 = r0.A03
            X.6EF r2 = (X.AnonymousClass6EF) r2
            java.lang.String r1 = "XFamilyCrosspostRequestSessionManager/CrosspostRunnable executed"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass6V7.A01(r2, r5, r4, r3)
            return
        L_0x04c2:
            java.lang.Object r2 = r0.A00
            X.6V7 r2 = (X.AnonymousClass6V7) r2
            java.lang.Object r3 = r0.A01
            java.lang.Object r4 = r0.A02
            java.lang.Object r5 = r0.A03
            X.0wU r0 = r2.A01
            r6 = 22
            X.73N r1 = new X.73N
            r1.<init>(r2, r3, r4, r5, r6)
            r0.Boy(r1)
            return
        L_0x04d9:
            java.lang.Object r1 = r0.A00
            X.5xy r1 = (X.C124325xy) r1
            java.lang.Object r2 = r0.A01
            java.lang.Object r8 = r0.A02
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.Object r0 = r0.A03
            X.3GB r0 = (X.AnonymousClass3GB) r0
            X.C36321k7.A0y(r2, r0)
            X.5rd r7 = r1.A04
            X.637 r5 = new X.637
            r5.<init>(r8, r1, r0)
            r6 = 0
            r4 = 2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Native Auth initiated by "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            X.AnonymousClass00C.A0D(r0, r6)
            X.60V r2 = r7.A00     // Catch:{ Exception -> 0x0585 }
            X.77w r1 = new X.77w     // Catch:{ Exception -> 0x0585 }
            r1.<init>()     // Catch:{ Exception -> 0x0585 }
            java.lang.String r0 = "wa_android_xfamily_native_auth"
            X.6NM r3 = r2.A00(r0, r1, r6)     // Catch:{ Exception -> 0x0585 }
            android.content.Context r2 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0585 }
            r1 = 3
            X.5Z3 r0 = new X.5Z3     // Catch:{ Exception -> 0x0585 }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x0585 }
            java.util.List r1 = r3.A01(r2, r0, r6)     // Catch:{ Exception -> 0x0585 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ Exception -> 0x0585 }
            boolean r0 = X.C36401kF.A1a(r1)     // Catch:{ Exception -> 0x0585 }
            if (r0 == 0) goto L_0x057b
            java.lang.String r3 = "XFamilyFbAccessToken"
            X.6vT r2 = X.C146356vT.A00()     // Catch:{ Exception -> 0x0585 }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ Exception -> 0x0585 }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ Exception -> 0x0585 }
            X.6TE r0 = r0.A01     // Catch:{ Exception -> 0x0585 }
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x0585 }
            X.6c7 r0 = new X.6c7     // Catch:{ Exception -> 0x0585 }
            r0.<init>(r2, r1, r3)     // Catch:{ Exception -> 0x0585 }
            X.6bk r2 = new X.6bk     // Catch:{ Exception -> 0x0585 }
            r2.<init>(r0, r4)     // Catch:{ Exception -> 0x0585 }
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Finished fetching data from FB app"
            X.AnonymousClass00C.A0D(r0, r6)     // Catch:{ Exception -> 0x0585 }
            X.6JV r1 = r7.A01     // Catch:{ Exception -> 0x0585 }
            X.7OL r0 = new X.7OL     // Catch:{ Exception -> 0x0585 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0585 }
            java.lang.Object r4 = X.C131886Rd.A00(r0, r4)     // Catch:{ Exception -> 0x0585 }
            X.6bU r4 = (X.C134716bU) r4     // Catch:{ Exception -> 0x0585 }
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Finished fetching profile data from FB"
            X.AnonymousClass00C.A0D(r0, r6)     // Catch:{ Exception -> 0x0585 }
            if (r4 != 0) goto L_0x055e
            java.lang.String r0 = "fbUserEntity is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x0585 }
            goto L_0x0581
        L_0x055e:
            X.3GB r0 = r5.A02     // Catch:{ Exception -> 0x0585 }
            r0.A00()     // Catch:{ Exception -> 0x0585 }
            android.app.Activity r3 = r5.A01     // Catch:{ Exception -> 0x0585 }
            android.content.Intent r2 = X.C36431kI.A0D()     // Catch:{ Exception -> 0x0585 }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ Exception -> 0x0585 }
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity"
            r2.setClassName(r1, r0)     // Catch:{ Exception -> 0x0585 }
            java.lang.String r0 = "fb_app_user_entity_as_parcel"
            r2.putExtra(r0, r4)     // Catch:{ Exception -> 0x0585 }
            r3.startActivity(r2)     // Catch:{ Exception -> 0x0585 }
            return
        L_0x057b:
            java.lang.String r0 = "sso list is empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x0585 }
        L_0x0581:
            r5.A00(r0)     // Catch:{ Exception -> 0x0585 }
            return
        L_0x0585:
            r0 = move-exception
            r5.A00(r0)
            return
        L_0x058a:
            java.lang.Object r1 = r0.A00
            X.67T r1 = (X.AnonymousClass67T) r1
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.A02
            X.2bV r5 = (X.AnonymousClass2bV) r5
            java.lang.Object r4 = r0.A03
            X.8Hw r4 = (X.C170888Hw) r4
            X.005 r0 = r1.A02
            java.lang.Object r1 = r0.get()
            X.5mx r1 = (X.C117865mx) r1
            boolean r0 = r3 instanceof android.app.Application
            r2 = 0
            if (r0 == 0) goto L_0x05d1
            java.lang.String r1 = "Application context was passed in for burning"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x05ad:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "CrosspostTextStatusBurningManager/text status burning failed for message: "
            r3.append(r2)
            long r0 = r5.A1N
            java.lang.String r0 = X.C36411kG.A11(r3, r0)
            X.AnonymousClass3TI.A00(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r2)
            long r0 = r5.A1N
            java.lang.String r0 = X.C36411kG.A11(r2, r0)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            r4.A05(r0)
            return
        L_0x05d1:
            X.0xW r1 = r1.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.1ok r0 = X.C55452ue.A00(r3, r2, r5)
            java.io.File r0 = r1.A00(r5, r0)
            if (r0 == 0) goto L_0x05ad
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x05e8
            goto L_0x05ad
        L_0x05e8:
            r4.A04(r0)
            return
        L_0x05ec:
            java.lang.Object r2 = r0.A00
            java.lang.Object r4 = r0.A01
            X.7jS r4 = (X.C159497jS) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r1 = r0.A03
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            r5 = 1
            X.7tZ r0 = new X.7tZ
            r0.<init>(r1, r2, r3, r4, r5)
            r4.Blp(r0)
            return
        L_0x0604:
            java.lang.Object r10 = r0.A00
            X.6YP r10 = (X.AnonymousClass6YP) r10
            java.lang.Object r11 = r0.A01
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r9 = r0.A02
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r0 = r0.A03
            r24 = r0
            X.3L2 r8 = r10.A0u
            com.whatsapp.audioRecording.AudioRecordFactory r0 = r10.A0i
            r19 = r0
            com.whatsapp.audioRecording.OpusRecorderFactory r0 = r10.A0j
            r20 = r0
            X.70k r0 = r10.A12
            r23 = r0
            X.0wN r14 = r10.A0f
            long r3 = X.AnonymousClass1GW.A06(r11)
            X.0wo r13 = r8.A03
            X.0yC r12 = r8.A05
            X.17Y r7 = r8.A01
            X.3DT r6 = r8.A06
            X.1Cb r5 = r8.A02
            X.0y0 r1 = r8.A00
            boolean r2 = X.C36331k8.A1a(r13, r12)
            X.C36321k7.A12(r7, r6, r5)
            r0 = 6
            X.AnonymousClass00C.A0D(r1, r0)
            r15 = r19
            r0 = r20
            X.C36391kE.A1U(r15, r0)
            r0 = r23
            X.C36341k9.A1G(r0, r14)
            X.6Q9 r15 = new X.6Q9
            r16 = r14
            r17 = r1
            r18 = r7
            r21 = r13
            r22 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r1 = r11.getName()
            if (r1 != 0) goto L_0x0695
            r0 = 0
        L_0x0662:
            r6 = 0
            r12 = 2
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x06f0
            r15.A01 = r0
            X.00T r7 = r15.A09
            java.lang.Object r7 = r7.getValue()
            com.whatsapp.util.OpusRecorder r7 = (com.whatsapp.util.OpusRecorder) r7
            r7.setInitialVariablesForResume(r0, r3)
            X.00T r0 = r15.A08
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            boolean r0 = X.AnonymousClass6YY.A0N(r5, r11, r0)
            if (r0 == 0) goto L_0x06f0
            if (r9 == 0) goto L_0x06dd
            X.00T r1 = r15.A0A
            java.lang.Object r0 = r1.getValue()
            java.io.File r0 = (java.io.File) r0
            boolean r0 = X.AnonymousClass6YY.A0N(r5, r9, r0)
            if (r0 == 0) goto L_0x06dd
            goto L_0x06cb
        L_0x0695:
            X.32S r6 = r6.A00
            java.lang.String r0 = "@"
            java.lang.String[] r1 = r1.split(r0)
            r0 = 0
            r13 = r1[r0]
            X.1DD r0 = r6.A00
            X.1M0 r6 = r0.get()
            X.14e r12 = r6.A02     // Catch:{ all -> 0x070b }
            java.lang.String r7 = "SELECT chat_jid, page_number FROM draft_voice_note_metadata WHERE chat_jid=?"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x070b }
            r0 = 0
            r1[r0] = r13     // Catch:{ all -> 0x070b }
            java.lang.String r0 = "DraftVoiceNoteMetadataDataStore/get"
            android.database.Cursor r7 = r12.A09(r7, r0, r1)     // Catch:{ all -> 0x070b }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x06ff }
            if (r0 == 0) goto L_0x06c2
            java.lang.String r0 = "page_number"
            long r0 = X.C36351kA.A07(r7, r0)     // Catch:{ all -> 0x06ff }
            goto L_0x06c4
        L_0x06c2:
            r0 = 0
        L_0x06c4:
            r7.close()     // Catch:{ all -> 0x070b }
            r6.close()
            goto L_0x0662
        L_0x06cb:
            java.lang.Object r1 = r1.getValue()     // Catch:{ FileNotFoundException -> 0x06d9 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ FileNotFoundException -> 0x06d9 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x06d9 }
            r0.<init>(r1, r2)     // Catch:{ FileNotFoundException -> 0x06d9 }
            r15.A0G = r0     // Catch:{ FileNotFoundException -> 0x06d9 }
            goto L_0x06dd
        L_0x06d9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x06dd:
            r15.A04()     // Catch:{ Exception -> 0x06e1 }
            goto L_0x06e8
        L_0x06e1:
            r2 = 0
            r0 = 0
            r8.A01(r15, r0, r2)
            goto L_0x06f0
        L_0x06e8:
            r6 = r15
            java.io.File r0 = r15.A03()
            X.AnonymousClass6YP.A0C(r10, r0)
        L_0x06f0:
            X.17Y r3 = r10.A0h
            r2 = 21
            X.737 r1 = new X.737
            r0 = r24
            r1.<init>(r10, r6, r0, r2)
            r3.A0H(r1)
            return
        L_0x06ff:
            r1 = move-exception
            if (r7 == 0) goto L_0x070a
            r7.close()     // Catch:{ all -> 0x0706 }
            goto L_0x070a
        L_0x0706:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x070b }
        L_0x070a:
            throw r1     // Catch:{ all -> 0x070b }
        L_0x070b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0710 }
            throw r1
        L_0x0710:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0715:
            java.lang.Object r5 = r0.A00
            X.6YP r5 = (X.AnonymousClass6YP) r5
            java.lang.Object r4 = r0.A02
            X.17Y r4 = (X.AnonymousClass17Y) r4
            java.lang.Object r3 = r0.A03
            X.6Q9 r6 = r5.A0H
            if (r6 == 0) goto L_0x0783
            java.lang.String r0 = "voicenote/startvoicenote/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A1B
            int r0 = r1.get()
            if (r0 == 0) goto L_0x073a
            android.media.SoundPool r2 = X.AnonymousClass6YP.A1b
            int r1 = r1.get()
            r0 = 0
            r2.setVolume(r1, r0, r0)
        L_0x073a:
            X.AnonymousClass6YP.A09(r5)     // Catch:{ Exception -> 0x0774 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0774 }
            r5.A07 = r1     // Catch:{ Exception -> 0x0774 }
            X.6QH r0 = r5.A0v     // Catch:{ Exception -> 0x0774 }
            r0.A02 = r1     // Catch:{ Exception -> 0x0774 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0774 }
            r5.A06 = r0     // Catch:{ Exception -> 0x0774 }
            r0 = 0
            r5.A05 = r0     // Catch:{ Exception -> 0x0774 }
            android.os.Handler r1 = r5.A0W     // Catch:{ Exception -> 0x0774 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ Exception -> 0x0774 }
            X.5VT r2 = r5.A0e     // Catch:{ Exception -> 0x0774 }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ Exception -> 0x0774 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0774 }
            r0.start()     // Catch:{ Exception -> 0x0774 }
            X.4cR r1 = new X.4cR     // Catch:{ Exception -> 0x0774 }
            r1.<init>(r0, r2, r6)     // Catch:{ Exception -> 0x0774 }
            r5.A0E = r1     // Catch:{ Exception -> 0x0774 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0774 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ all -> 0x0771 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0774 }
            return
        L_0x0771:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0774 }
            throw r0     // Catch:{ Exception -> 0x0774 }
        L_0x0774:
            r1 = move-exception
            java.lang.String r0 = "voicenote/startvoicenote/startfailed"
            com.whatsapp.util.Log.e(r0, r1)
            boolean r0 = r5.A1D
            r5.A0O = r0
            r0 = 7
            X.C1498172w.A00(r4, r5, r3, r0)
            return
        L_0x0783:
            java.lang.String r0 = "voicenote/startvoicenote/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0789:
            java.lang.Object r5 = r0.A00
            X.6TW r5 = (X.AnonymousClass6TW) r5
            java.lang.Object r4 = r0.A01
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            java.lang.Object r3 = r0.A02
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            if (r5 == 0) goto L_0x07b3
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r5.A00
            int r1 = X.AnonymousClass00F.A00(r2, r0)
            int r0 = r5.A01
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A04(r2, r4, r0)
            X.AnonymousClass00C.A08(r0)
            X.4bi r4 = new X.4bi
            r4.<init>(r0, r1)
        L_0x07b3:
            r3.setImageDrawable(r4)
            return
        L_0x07b7:
            java.lang.Object r3 = r0.A00
            X.7yi r3 = (X.C167737yi) r3
            java.lang.Object r5 = r0.A01
            X.8b1 r5 = (X.C175768b1) r5
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            r3.A01 = r5
            r3.A05 = r1
            r3.A06 = r0
            X.00s r4 = r3.A00
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.8bF r5 = r5.A08
            X.8bE r5 = (X.C175888bE) r5
            if (r5 == 0) goto L_0x0823
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x092d
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x092d
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0823
            X.5H5 r6 = new X.5H5
            r6.<init>()
            r0 = 2131231895(0x7f080497, float:1.8079884E38)
            r6.A00 = r0
            r0 = 2131101901(0x7f0608cd, float:1.7816225E38)
            r6.A01 = r0
            X.0wG r0 = r3.A0C
            android.content.Context r1 = r0.A00
            r0 = 2131891006(0x7f12133e, float:1.941672E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A04 = r0
            r0 = 2131891007(0x7f12133f, float:1.9416722E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A03 = r0
            r0 = 0
            X.3YH r1 = new X.3YH
            r1.<init>(r3, r5, r0)
        L_0x081e:
            r6.A02 = r1
            r2.add(r6)
        L_0x0823:
            java.util.List r0 = r3.A05
            if (r0 == 0) goto L_0x095b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x095b
            X.0wG r0 = r3.A0C
            android.content.Context r6 = r0.A00
            r0 = 2131892206(0x7f1217ee, float:1.9419154E38)
            java.lang.String r1 = r6.getString(r0)
            X.5H0 r0 = new X.5H0
            r0.<init>(r1)
            r2.add(r0)
            java.util.List r0 = r3.A05
            java.util.Iterator r9 = r0.iterator()
        L_0x0846:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x095b
            java.lang.Object r8 = r9.next()
            X.9un r8 = (X.C207249un) r8
            boolean r0 = r8 instanceof X.C175748az
            if (r0 == 0) goto L_0x0906
            X.8bF r1 = r8.A08
            X.8b5 r1 = (X.C175808b5) r1
            X.5H6 r7 = new X.5H6
            r7.<init>()
            if (r1 == 0) goto L_0x08b3
            byte[] r0 = r1.A09
            r7.A09 = r0
            X.6c7 r0 = r1.A01
            r7.A03 = r0
            int r5 = r1.A00
            r1 = 1
            if (r5 == r1) goto L_0x08e4
            r0 = 2
            if (r5 != r0) goto L_0x08b3
            X.8b1 r0 = r3.A01
            X.8bF r5 = r0.A08
            X.8bE r5 = (X.C175888bE) r5
            int r0 = r5.A01
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r7.A08 = r1
            r7.A07 = r1
            if (r0 == 0) goto L_0x08b7
            r0 = 2131891008(0x7f121340, float:1.9416724E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131232884(0x7f080874, float:1.808189E38)
            r7.A00 = r0
            r0 = 2131101902(0x7f0608ce, float:1.7816227E38)
            r7.A01 = r0
            r0 = 2131891009(0x7f121341, float:1.9416726E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            r0 = 2131891011(0x7f121343, float:1.941673E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A05 = r0
            r0 = 48
            X.9v5 r1 = new X.9v5
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r5, (int) r0)
        L_0x08b1:
            r7.A02 = r1
        L_0x08b3:
            r2.add(r7)
            goto L_0x0846
        L_0x08b7:
            r0 = 2131891005(0x7f12133d, float:1.9416718E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131231895(0x7f080497, float:1.8079884E38)
            r7.A00 = r0
            r0 = 2131101901(0x7f0608cd, float:1.7816225E38)
            r7.A01 = r0
            r0 = 2131891006(0x7f12133e, float:1.941672E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            r0 = 2131891007(0x7f12133f, float:1.9416722E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A05 = r0
            r0 = 24
            X.9v0 r1 = new X.9v0
            r1.<init>(r3, r0)
            goto L_0x08b1
        L_0x08e4:
            r7.A08 = r1
            r0 = 0
            r7.A07 = r0
            r0 = 2131891012(0x7f121344, float:1.9416732E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131232383(0x7f08067f, float:1.8080874E38)
            r7.A00 = r0
            r0 = 2131102603(0x7f060b8b, float:1.7817649E38)
            r7.A01 = r0
            r0 = 2131891013(0x7f121345, float:1.9416734E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            goto L_0x08b3
        L_0x0906:
            boolean r0 = r8 instanceof X.C175798b4
            if (r0 == 0) goto L_0x0846
            X.5H1 r7 = new X.5H1
            r7.<init>()
            r5 = 2131892207(0x7f1217ef, float:1.9419156E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            X.6c7 r0 = r8.A09
            X.C18740tg.A06(r0)
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.C203449o2.A04(r0)
            java.lang.String r0 = X.C36381kD.A0r(r6, r0, r1, r5)
            r7.A00 = r0
            goto L_0x08b3
        L_0x092d:
            X.5H5 r6 = new X.5H5
            r6.<init>()
            r0 = 2131232884(0x7f080874, float:1.808189E38)
            r6.A00 = r0
            r0 = 2131101902(0x7f0608ce, float:1.7816227E38)
            r6.A01 = r0
            X.0wG r0 = r3.A0C
            android.content.Context r1 = r0.A00
            r0 = 2131891010(0x7f121342, float:1.9416728E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A04 = r0
            r0 = 2131891004(0x7f12133c, float:1.9416716E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A03 = r0
            r0 = 49
            X.9v5 r1 = new X.9v5
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r5, (int) r0)
            goto L_0x081e
        L_0x095b:
            java.util.List r0 = r3.A05
            if (r0 == 0) goto L_0x096f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x096f
            r1 = 103(0x67, float:1.44E-43)
            X.5Gy r0 = new X.5Gy
            r0.<init>(r1)
            r2.add(r0)
        L_0x096f:
            X.0wG r0 = r3.A0C
            android.content.Context r6 = r0.A00
            r0 = 2131892208(0x7f1217f0, float:1.9419158E38)
            java.lang.String r1 = r6.getString(r0)
            X.5H0 r0 = new X.5H0
            r0.<init>(r1)
            r2.add(r0)
            X.5H4 r5 = new X.5H4
            r5.<init>()
            r0 = 2131892591(0x7f12196f, float:1.9419935E38)
            java.lang.String r0 = r6.getString(r0)
            r5.A02 = r0
            r0 = 2131892466(0x7f1218f2, float:1.9419681E38)
            java.lang.String r0 = r6.getString(r0)
            r5.A01 = r0
            r1 = 27
            X.9v0 r0 = new X.9v0
            r0.<init>(r3, r1)
            r5.A00 = r0
            java.util.List r1 = r5.A03
            java.util.List r0 = r3.A06
            r1.addAll(r0)
            r2.add(r5)
            r1 = 103(0x67, float:1.44E-43)
            X.5Gy r0 = new X.5Gy
            r0.<init>(r1)
            r2.add(r0)
            X.5H3 r5 = new X.5H3
            r5.<init>()
            r0 = 2131232546(0x7f080722, float:1.8081204E38)
            r5.A00 = r0
            r0 = 2131887125(0x7f120415, float:1.9408848E38)
            r5.A02 = r0
            r1 = 25
            X.9v0 r0 = new X.9v0
            r0.<init>(r3, r1)
            r5.A03 = r0
            r2.add(r5)
            X.5H3 r5 = new X.5H3
            r5.<init>()
            r0 = 2131232364(0x7f08066c, float:1.8080835E38)
            r5.A00 = r0
            r0 = 2131102603(0x7f060b8b, float:1.7817649E38)
            r5.A01 = r0
            r0 = 2131896979(0x7f122a93, float:1.9428835E38)
            r5.A02 = r0
            r1 = 26
            X.9v0 r0 = new X.9v0
            r0.<init>(r3, r1)
            r5.A03 = r0
            r2.add(r5)
            r4.A0D(r2)
            return
        L_0x09f5:
            java.lang.Object r3 = r0.A00
            X.8lb r3 = (X.C180338lb) r3
            java.lang.Object r2 = r0.A01
            X.9lY r2 = (X.C202319lY) r2
            java.lang.Object r1 = r0.A02
            X.8bI r1 = (X.C175928bI) r1
            java.lang.Object r0 = r0.A03
            X.B3f r0 = (X.C23075B3f) r0
            X.5Fh r5 = r3.A07
            java.lang.String r13 = r2.A0K
            java.lang.String r2 = r1.A0J
            X.6Jr r7 = new X.6Jr
            r7.<init>(r0, r3)
            X.1Vk r9 = r5.A03
            X.19A r0 = r9.A06
            java.lang.String r12 = r0.A09()
            X.6QB r1 = X.C36421kH.A0T()
            java.lang.String r3 = "type"
            java.lang.String r0 = "set"
            X.C36331k8.A1D(r1, r3, r0)
            X.C36341k9.A1C(r1)
            java.lang.String r3 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.C36331k8.A1D(r1, r3, r0)
            X.C36331k8.A1C(r1, r12)
            java.lang.String r0 = "account"
            X.6QB r0 = X.C36441kJ.A0q(r0)
            java.lang.String r4 = "action"
            java.lang.String r3 = "upi-raise-complaint"
            X.C36331k8.A1D(r0, r4, r3)
            r14 = 1
            r16 = 100
            r18 = 0
            boolean r3 = X.C203539oF.A0P(r13, r14, r16, r18)
            if (r3 == 0) goto L_0x0a4e
            java.lang.String r3 = "transaction-id"
            X.C36331k8.A1D(r0, r3, r13)
        L_0x0a4e:
            r13 = r2
            boolean r3 = X.C203539oF.A0P(r13, r14, r16, r18)
            if (r3 == 0) goto L_0x0a5a
            java.lang.String r3 = "device-id"
            X.C36331k8.A1D(r0, r3, r2)
        L_0x0a5a:
            X.C36361kB.A1H(r0, r1)
            X.9nx r11 = r1.A03()
            X.1EU r1 = r5.A04
            java.lang.String r0 = "UPI"
            X.AF8 r0 = r1.A04(r0)
            X.C18740tg.A06(r0)
            X.B3f r6 = r0.BBn()
            X.0wG r0 = r5.A01
            android.content.Context r3 = r0.A00
            X.17Y r8 = r5.A00
            X.1Vu r4 = r5.A02
            X.5Ff r2 = new X.5Ff
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13 = 0
            r10 = r2
            r9.A0G(r10, r11, r12, r13)
            return
        L_0x0a84:
            java.lang.Object r5 = r0.A00
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r5 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r5
            java.lang.Object r8 = r0.A01
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A03
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.0wG r0 = r5.A01
            android.content.Context r7 = r0.A00
            r0 = 2131895386(0x7f12245a, float:1.9425604E38)
            java.lang.String r0 = r7.getString(r0)
            X.5Gw r2 = new X.5Gw
            r2.<init>(r0)
            r0 = 2131895390(0x7f12245e, float:1.9425612E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A00 = r0
            r4.add(r2)
            X.5Gx r3 = new X.5Gx
            r3.<init>()
            r3.A01 = r5
            r0 = 2131895385(0x7f122459, float:1.9425602E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A02 = r0
            r0 = 2131895389(0x7f12245d, float:1.942561E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A03 = r0
            r2 = 30
            X.9v0 r0 = new X.9v0
            r0.<init>(r5, r2)
            r3.A00 = r0
            r3.A05 = r8
            r4.add(r3)
            r0 = 102(0x66, float:1.43E-43)
            X.5Gy r3 = new X.5Gy
            r3.<init>(r0)
            X.5Gx r2 = new X.5Gx
            r2.<init>()
            r2.A01 = r5
            r0 = 2131895388(0x7f12245c, float:1.9425608E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A04 = r0
            r0 = 2131895387(0x7f12245b, float:1.9425606E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A02 = r0
            r0 = 2131895389(0x7f12245d, float:1.942561E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A03 = r0
            r2.A05 = r1
            r1 = 31
            X.9v0 r0 = new X.9v0
            r0.<init>(r5, r1)
            r2.A00 = r0
            r4.add(r3)
            r4.add(r2)
            r4.add(r3)
            r0 = 102(0x66, float:1.43E-43)
            X.5Gy r3 = new X.5Gy
            r3.<init>(r0)
            X.5Gx r2 = new X.5Gx
            r2.<init>()
            r2.A01 = r5
            r0 = 2131895384(0x7f122458, float:1.94256E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A04 = r0
            r0 = 2131895383(0x7f122457, float:1.9425597E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A02 = r0
            r0 = 2131895389(0x7f12245d, float:1.942561E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A03 = r0
            r2.A05 = r6
            r1 = 29
            X.9v0 r0 = new X.9v0
            r0.<init>(r5, r1)
            r2.A00 = r0
            r4.add(r2)
            r4.add(r3)
            r1 = 1007(0x3ef, float:1.411E-42)
            X.5Gz r0 = new X.5Gz
            r0.<init>(r1)
            r4.add(r0)
            X.00s r0 = r5.A00
            r0.A0D(r4)
            return
        L_0x0b62:
            java.lang.Object r1 = r0.A00
            X.9nh r1 = (X.C203269nh) r1
            java.lang.Object r4 = r0.A01
            X.2bU r4 = (X.AnonymousClass2bU) r4
            java.lang.Object r3 = r0.A02
            X.5vK r3 = (X.C122725vK) r3
            java.lang.Object r2 = r0.A03
            X.B6K r2 = (X.B6K) r2
            X.1X4 r1 = r1.A01
            X.6vi r0 = r3.A02
            r1.A0S(r0, r4)
            r2.B7P()
            return
        L_0x0b7d:
            java.lang.Object r4 = r0.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r4 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r4
            java.lang.Object r6 = r0.A01
            X.8yt r6 = (X.C188008yt) r6
            java.lang.Object r7 = r0.A02
            X.9Oo r7 = (X.C194219Oo) r7
            java.lang.Object r3 = r0.A03
            X.2bZ r3 = (X.AnonymousClass2bZ) r3
            X.AGg r0 = r4.A3j()
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r5 = r0.A05
            X.AGg r0 = r4.A3j()
            java.lang.String r8 = r0.A08
            r10 = 4
            r9 = 0
            X.9SC r2 = r5.A00(r6, r7, r8, r9, r10)
            X.AGg r0 = r4.A3j()
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r1 = r0.A05
            int r0 = r7.A00
            boolean r0 = r1.A03(r2, r7, r0)
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0H(r4, r3, r0)
            return
        L_0x0baf:
            java.lang.Object r4 = r0.A00
            X.8j0 r4 = (X.C179068j0) r4
            java.lang.Object r3 = r0.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            java.lang.Object r2 = r0.A02
            X.8b0 r2 = (X.C175758b0) r2
            java.lang.Object r1 = r0.A03
            X.9ua r1 = (X.C207119ua) r1
            if (r3 != 0) goto L_0x0bc5
            r0 = 0
            r4.A4p(r0)
        L_0x0bc5:
            r4.A4l(r2, r1, r3)
            return
        L_0x0bc9:
            java.lang.Object r4 = r0.A00
            X.AAF r4 = (X.AAF) r4
            java.lang.Object r3 = r0.A01
            X.9Na r3 = (X.C193829Na) r3
            java.lang.Object r2 = r0.A02
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.Object r1 = r0.A03
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1OD r0 = r4.A0K
            r0.A0A(r3, r2, r1)
            return
        L_0x0bdf:
            java.lang.Object r3 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r1 = r0.A02
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.Object r0 = r0.A03
            X.174 r0 = (X.AnonymousClass174) r0
            com.whatsapp.mediaview.MediaViewFragment.A0B(r2, r3, r0, r1)
            return
        L_0x0bf3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0bf6:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73N.run():void");
    }
}
