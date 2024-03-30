package X;

/* renamed from: X.3pN  reason: invalid class name and case insensitive filesystem */
public class C76743pN implements C236119d {
    public final /* synthetic */ AnonymousClass2VM A00;
    public final /* synthetic */ AnonymousClass2VM A01;
    public final /* synthetic */ C20510xg A02;
    public final /* synthetic */ AnonymousClass4RS A03;
    public final /* synthetic */ Runnable A04;

    public C76743pN(AnonymousClass2VM r1, AnonymousClass2VM r2, C20510xg r3, AnonymousClass4RS r4, Runnable runnable) {
        this.A02 = r3;
        this.A01 = r1;
        this.A03 = r4;
        this.A04 = runnable;
        this.A00 = r2;
    }

    public void BWw(C203399nx r3, String str) {
        this.A03.Bou(AnonymousClass3ME.A00(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        if (r7.size() != r10.size()) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r12, java.lang.String r13) {
        /*
            r11 = this;
            X.2VM r0 = r11.A01
            X.147 r0 = r0.A03
            X.39E r8 = new X.39E
            r8.<init>(r0)
            java.lang.Class<X.147> r1 = X.AnonymousClass147.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r4 = r12.A0X(r1, r0)
            if (r4 != 0) goto L_0x001b
            X.4RS r1 = r11.A03
            r0 = 800(0x320, float:1.121E-42)
            r1.Bou(r0)
        L_0x001a:
            return
        L_0x001b:
            X.0xg r2 = r11.A02
            X.0yC r1 = r2.A03
            java.lang.String r0 = "add"
            X.AnonymousClass3R9.A00(r1, r8, r12, r0)
            X.0xQ r3 = X.C36431kI.A0d(r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupmgr/onAddGroupParticipants/"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.util.Map r9 = r8.A04
            java.util.Set r0 = r9.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            r2.append(r0)
            r2.append(r1)
            java.util.Map r7 = r8.A02
            java.util.Set r0 = r7.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C36321k7.A1a(r2, r0)
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x0069
            r0 = 3001(0xbb9, float:4.205E-42)
            r3.A0T(r0, r7)
        L_0x0069:
            java.lang.Runnable r0 = r11.A04
            r0.run()
            X.2VM r5 = r11.A00
            boolean r0 = r5 instanceof X.AnonymousClass2V8
            if (r0 == 0) goto L_0x0128
            X.2V8 r5 = (X.AnonymousClass2V8) r5
            java.util.Map r0 = r8.A03
            X.AnonymousClass00C.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00eb
            X.3OK r2 = r5.A00
            X.17Y r1 = r2.A06
            r0 = 48
            X.C81193wc.A00(r1, r8, r2, r0)
        L_0x008c:
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r7)
        L_0x0090:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = X.C36351kA.A0u(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 421(0x1a5, float:5.9E-43)
            if (r0 == 0) goto L_0x0090
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0090
            X.3OK r2 = r5.A00
            X.17Y r1 = r2.A06
            r0 = 40
            X.3v5 r0 = X.C80243v5.A00(r2, r0)
            r1.A0H(r0)
        L_0x00b3:
            X.3OK r4 = r5.A00
            android.content.Context r0 = r4.A03
            java.lang.String r3 = X.C54452sy.A00(r0, r8)
            if (r3 == 0) goto L_0x00cf
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00cf
            X.17Y r2 = r4.A06
            r1 = 47
            X.751 r0 = new X.751
            r0.<init>(r1, r3, r4)
            r2.A0H(r0)
        L_0x00cf:
            java.util.Set r0 = r9.keySet()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001a
            X.02t r1 = r4.A0I
            java.util.Set r0 = r9.keySet()
            java.util.List r0 = X.C007103b.A0Y(r0)
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            r1.invoke(r0)
            return
        L_0x00eb:
            java.util.ArrayList r10 = r8.A01
            X.AnonymousClass00C.A07(r10)
            boolean r0 = X.C36411kG.A1a(r10)
            if (r0 == 0) goto L_0x008c
            X.3OK r1 = r5.A00
            X.0yC r0 = r1.A09
            boolean r0 = X.C36441kJ.A1L(r0)
            if (r0 == 0) goto L_0x008c
            X.14u r6 = r1.A05
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x008c
            android.content.Context r4 = r1.A03
            X.147 r3 = r8.A00
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x011d
            int r2 = r7.size()
            int r0 = r10.size()
            r1 = 1
            if (r2 == r0) goto L_0x011e
        L_0x011d:
            r1 = 0
        L_0x011e:
            r0 = 2
            android.content.Intent r0 = X.AnonymousClass190.A0g(r4, r3, r10, r0, r1)
            r6.startActivity(r0)
            goto L_0x008c
        L_0x0128:
            X.2V9 r5 = (X.AnonymousClass2V9) r5
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x013e
            java.util.Iterator r0 = X.AnonymousClass000.A10(r9)
            java.lang.Object r1 = r0.next()
            X.1Rs r0 = r5.A03
        L_0x013a:
            r0.A0C(r1)
            return
        L_0x013e:
            java.util.Map r1 = r8.A03
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0149
            X.1Rs r0 = r5.A02
            goto L_0x013a
        L_0x0149:
            r1 = r7
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x001a
            X.1Rs r0 = r5.A01
            goto L_0x013a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76743pN.BiM(X.9nx, java.lang.String):void");
    }

    public void BVN(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupIqResponseUtil/add-participants/delivery fail; groupId=");
        C36321k7.A1N(this.A01.A03, A0u);
    }
}
