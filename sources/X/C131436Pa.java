package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Pa  reason: invalid class name and case insensitive filesystem */
public final class C131436Pa {
    public String A00;
    public final C116185kB A01;
    public final AnonymousClass1KK A02;
    public final C70943fy A03;
    public final C106735Ld A04;
    public final C143636qs A05;
    public final AnonymousClass6SP A06;
    public final C235718z A07;
    public final AnonymousClass185 A08;
    public final AnonymousClass171 A09;
    public final AnonymousClass1A6 A0A;
    public final AnonymousClass1A5 A0B;
    public final AnonymousClass1S0 A0C;
    public final C230116v A0D;
    public final AnonymousClass6DA A0E;
    public final C116845lI A0F;
    public final AnonymousClass6N5 A0G;
    public final C19970wo A0H;
    public final C20810yC A0I;
    public final C19770wU A0J;

    public final C110225aK A01(C02680Bk r21, String str, String str2) {
        AnonymousClass166 r1;
        String str3;
        String str4;
        AnonymousClass51h r5;
        C145946um r4 = new C145946um(this);
        C106735Ld r3 = this.A04;
        synchronized (r3) {
            r1 = r3.A01;
            str3 = str;
            AnonymousClass011 r6 = (AnonymousClass011) r1.get(str3);
            str4 = str2;
            if (r6 == null || !AnonymousClass00C.A0J(r6.first, str4)) {
                r5 = null;
            } else {
                r5 = (AnonymousClass51h) r6.second;
            }
        }
        if (r5 != null) {
            return new AnonymousClass51h(r5.A00, false, r5.A01);
        }
        AnonymousClass6Th r62 = this.A05.A02;
        if (r62.A00 == null) {
            r62.A00();
        }
        AnonymousClass6QG r12 = r62.A00;
        AnonymousClass00C.A08(r12);
        C116845lI r10 = this.A0F;
        String str5 = this.A00;
        AnonymousClass6DA r52 = this.A0E;
        String str6 = r52.A03;
        C128686Df r11 = new C128686Df(r12, str3, str5, str4, str6, r52.A02, r52.A02(), this.A0I.A0E(6973));
        C18800tq r7 = r10.A00.A00.A00;
        C20810yC A0V = C36341k9.A0V(r7);
        C20050ww A0U = C36381kD.A0U(r7);
        C20020wt A0X = C90504aG.A0X(r7);
        C19420v0 A0Y = C36351kA.A0Y(r7);
        AnonymousClass005 A0i = C90514aH.A0i(r7);
        C18830tt r53 = r7.A00;
        new AnonymousClass51i(A0U, r11, A0Y, A0V, C90484aE.A0Y(r7), A0X, A0i, r53.A0i, r53.A0j).Blp(r4);
        r21.A04();
        C110225aK r63 = r4.A00;
        if (r63 instanceof AnonymousClass51h) {
            AnonymousClass51h r64 = (AnonymousClass51h) r63;
            AnonymousClass00C.A0D(r64, 2);
            synchronized (r3) {
                r1.put(str3, C36441kJ.A19(str4, r64));
                for (AnonymousClass6E6 r2 : C007103b.A0W(r64.A00)) {
                    r3.A00.put(r2.A0A, r2);
                }
            }
        }
        return r4.A00;
    }

    public C131436Pa(C116185kB r20, AnonymousClass1KK r21, C70943fy r22, C106735Ld r23, AnonymousClass6DA r24, C143636qs r25, C116845lI r26, AnonymousClass6N5 r27, AnonymousClass6SP r28, C235718z r29, AnonymousClass185 r30, AnonymousClass171 r31, AnonymousClass1A6 r32, C19970wo r33, AnonymousClass1A5 r34, C20810yC r35, AnonymousClass32W r36, AnonymousClass1S0 r37, C230116v r38, C19770wU r39) {
        C19970wo r8 = r33;
        C20810yC r6 = r35;
        C19770wU r2 = r39;
        C235718z r12 = r29;
        AnonymousClass171 r10 = r31;
        C36321k7.A1B(r8, r6, r2, r10, r12);
        AnonymousClass32W r5 = r36;
        AnonymousClass185 r11 = r30;
        AnonymousClass1A6 r9 = r32;
        C36321k7.A13(r5, r11, r9);
        C230116v r3 = r38;
        AnonymousClass1KK r17 = r21;
        C36361kB.A1K(r3, r17);
        AnonymousClass1A5 r7 = r34;
        AnonymousClass1S0 r4 = r37;
        AnonymousClass6N5 r14 = r27;
        AnonymousClass6SP r13 = r28;
        C106735Ld r16 = r23;
        C36321k7.A1D(r16, r4, r7, r13, r14);
        AnonymousClass6DA r15 = r24;
        AnonymousClass00C.A0D(r15, 18);
        C116185kB r18 = r20;
        AnonymousClass00C.A0D(r18, 20);
        this.A0H = r8;
        this.A0I = r6;
        this.A0J = r2;
        this.A09 = r10;
        this.A07 = r12;
        this.A08 = r11;
        this.A0A = r9;
        this.A03 = r22;
        this.A0D = r3;
        this.A02 = r17;
        this.A04 = r16;
        this.A0C = r4;
        this.A0B = r7;
        this.A06 = r13;
        this.A0G = r14;
        this.A0F = r26;
        this.A0E = r15;
        this.A05 = r25;
        this.A01 = r18;
        String A002 = AnonymousClass3N5.A00(r5.A00);
        AnonymousClass00C.A08(A002);
        this.A00 = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C131436Pa r13) {
        /*
            X.6um r2 = new X.6um
            r2.<init>(r13)
            X.5kB r0 = r13.A01
            java.lang.String r10 = r13.A00
            X.0w7 r0 = r0.A00
            X.0tq r1 = r0.A00
            X.0yC r6 = X.C36341k9.A0V(r1)
            X.0ww r4 = X.C36381kD.A0U(r1)
            X.0wt r8 = X.C90504aG.A0X(r1)
            X.0v0 r5 = X.C36351kA.A0Y(r1)
            X.005 r9 = X.C90514aH.A0i(r1)
            X.0tt r0 = r1.A00
            X.004 r11 = r0.A0k
            X.004 r12 = r0.A0j
            X.1WF r7 = X.C90484aE.A0Y(r1)
            X.51j r3 = new X.51j
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3.Blp(r2)
            X.5aK r1 = r2.A00
            boolean r0 = r1 instanceof X.AnonymousClass51h
            if (r0 == 0) goto L_0x0114
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            X.51h r1 = (X.AnonymousClass51h) r1
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r3.next()
            X.6E6 r0 = (X.AnonymousClass6E6) r0
            java.lang.String r2 = r0.A07
            java.lang.String r1 = r0.A0A
            X.69p r0 = new X.69p
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x0045
        L_0x005e:
            X.6N5 r5 = r13.A0G
            java.lang.String r6 = "BusinessSearchPopularBusinessesManager/initPopularBusinesses/Failed!"
            r4 = 0
            long r1 = java.lang.System.currentTimeMillis()
            X.69q r0 = new X.69q
            r0.<init>(r7, r1)
            r5.A00 = r0
            r3 = 0
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03     // Catch:{ Exception -> 0x00f6 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ Exception -> 0x00f6 }
            r0.lock()     // Catch:{ Exception -> 0x00f6 }
            X.0wG r0 = r5.A02     // Catch:{ Exception -> 0x00f6 }
            java.io.File r1 = X.C90514aH.A0j(r0)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = "business_search"
            java.io.File r1 = X.C36441kJ.A0w(r1, r0)     // Catch:{ Exception -> 0x00f6 }
            X.C90474aD.A15(r1)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = "business_search_popular_businesses"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ Exception -> 0x00f6 }
            java.io.FileOutputStream r7 = X.C90524aI.A0W(r0)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x00ef }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ef }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x00ef }
            X.69q r12 = r5.A00     // Catch:{ all -> 0x00e8 }
            if (r12 == 0) goto L_0x00e1
            org.json.JSONObject r9 = X.C36441kJ.A1B()     // Catch:{ all -> 0x00e8 }
            org.json.JSONArray r11 = X.C90524aI.A0u()     // Catch:{ all -> 0x00e8 }
            java.util.List r0 = r12.A01     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x00aa:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x00e8 }
            X.69p r10 = (X.C1277769p) r10     // Catch:{ all -> 0x00e8 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = r10.A00     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "verified_name"
            r2.put(r0, r1)     // Catch:{ all -> 0x00e8 }
            r11.put(r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x00aa
        L_0x00cc:
            java.lang.String r0 = "popular_businesses"
            r9.put(r0, r11)     // Catch:{ all -> 0x00e8 }
            long r1 = r12.A00     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "last_updated"
            r9.put(r0, r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e1
            r8.write(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00e1:
            r8.close()     // Catch:{ all -> 0x00ef }
            r7.close()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010b
        L_0x00e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ Exception -> 0x00f6 }
            throw r0     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x0100 }
            X.0wN r0 = r5.A01     // Catch:{ all -> 0x0100 }
            r0.A0E(r6, r3, r4)     // Catch:{ all -> 0x0100 }
            goto L_0x010b
        L_0x0100:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r1
        L_0x010b:
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131436Pa.A00(X.6Pa):void");
    }

    public final C1277869q A02() {
        AnonymousClass6N5 r0 = this.A0G;
        C1277869q A002 = r0.A00();
        if (A002 != null) {
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - A002.A00) >= 1) {
                C1497172m.A00(this.A0J, this, 30);
            }
            return A002;
        }
        A00(this);
        return r0.A00();
    }

    public final void A03() {
        C143636qs r2 = this.A05;
        AnonymousClass6Th r0 = r2.A02;
        r0.A01.removeCallbacks(r0.A06);
        r2.A01.A00();
        this.A04.A09();
        this.A0G.A00 = null;
        List list = this.A06.A00;
        AnonymousClass00C.A07(list);
        synchronized (list) {
            list.clear();
        }
    }
}
