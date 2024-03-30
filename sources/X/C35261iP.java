package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1iP  reason: invalid class name and case insensitive filesystem */
public class C35261iP implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35261iP(AnonymousClass1H3 r2, C131636Pw r3, int i) {
        this.A03 = 25;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0914, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0917, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0aed, code lost:
        if (r10 != null) goto L_0x099d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016e, code lost:
        if (r1.A01((com.whatsapp.jid.UserJid) r2) == false) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0ac0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:486:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:151:0x03a9=Splitter:B:151:0x03a9, B:163:0x040d=Splitter:B:163:0x040d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r3 = r27
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0b3f;
                case 1: goto L_0x0b0d;
                case 2: goto L_0x0970;
                case 3: goto L_0x095a;
                case 4: goto L_0x0918;
                case 5: goto L_0x0918;
                case 6: goto L_0x08e2;
                case 7: goto L_0x08bd;
                case 8: goto L_0x0878;
                case 9: goto L_0x085a;
                case 10: goto L_0x07d3;
                case 11: goto L_0x07ad;
                case 12: goto L_0x0777;
                case 13: goto L_0x0610;
                case 14: goto L_0x05d6;
                case 15: goto L_0x05be;
                case 16: goto L_0x0598;
                case 17: goto L_0x0588;
                case 18: goto L_0x0539;
                case 19: goto L_0x052b;
                case 20: goto L_0x04cc;
                case 21: goto L_0x04af;
                case 22: goto L_0x04a1;
                case 23: goto L_0x0485;
                case 24: goto L_0x0485;
                case 25: goto L_0x046d;
                case 26: goto L_0x043e;
                case 27: goto L_0x036d;
                case 28: goto L_0x035f;
                case 29: goto L_0x0351;
                case 30: goto L_0x02fd;
                case 31: goto L_0x02d0;
                case 32: goto L_0x0249;
                case 33: goto L_0x0230;
                case 34: goto L_0x0218;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0208;
                case 38: goto L_0x01f9;
                case 39: goto L_0x01eb;
                case 40: goto L_0x0051;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r3.A01
            X.1bU r5 = (X.C31231bU) r5
            java.lang.Object r4 = r3.A02
            X.9uj r4 = (X.C207209uj) r4
            int r2 = r3.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "prekey count running low; remainingPreKeys="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "appending additional prekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18I r0 = r5.A05
            X.79X r2 = r0.A07()
            X.189 r1 = r5.A03     // Catch:{ all -> 0x004a }
            boolean r0 = r1.A0Y()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "no unsent prekeys; generating some new ones"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004a }
            r1.A0N()     // Catch:{ all -> 0x004a }
        L_0x0040:
            X.0xL r0 = r5.A00     // Catch:{ all -> 0x004a }
            r0.A07()     // Catch:{ all -> 0x004a }
            r5.A05(r4)     // Catch:{ all -> 0x004a }
            goto L_0x0b07
        L_0x004a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0b06
            r2.close()     // Catch:{ all -> 0x0b02 }
            throw r1
        L_0x0051:
            java.lang.Object r4 = r3.A01
            X.1Rg r4 = (X.C28081Rg) r4
            java.lang.Object r5 = r3.A02
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            int r9 = r3.A00
            X.2Sy r3 = new X.2Sy
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.A07 = r0
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.3Qa r0 = r5.A1J
            X.11F r2 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r2)
            if (r0 == 0) goto L_0x01d3
            r1 = 2
        L_0x0075:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A09 = r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.0wo r0 = r4.A07
            long r0 = X.C19970wo.A00(r0)
            long r6 = r5.A0G
            long r0 = r0 - r6
            long r0 = r8.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
            int r6 = r5.A1I
            r0 = 11
            r1 = 1
            if (r6 == r0) goto L_0x009d
            r0 = 31
            r1 = 2
            if (r6 == r0) goto L_0x009d
            r1 = 0
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A0A = r0
            X.1DT r6 = r4.A03
            int r0 = X.AnonymousClass3UK.A05(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
            X.1DW r7 = r4.A0C
            X.1AW r1 = r4.A0H
            X.1EO r0 = r4.A0I
            int r0 = X.C55802vD.A00(r7, r5, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            r8 = 1
            if (r9 != r8) goto L_0x00d5
            boolean r0 = r5 instanceof X.AnonymousClass2c2
            if (r0 == 0) goto L_0x00d5
            r0 = r5
            X.2c2 r0 = (X.AnonymousClass2c2) r0
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x01d0;
                case 2: goto L_0x01cd;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01c7;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01c1;
                case 7: goto L_0x01be;
                case 8: goto L_0x01ba;
                case 9: goto L_0x01b6;
                case 10: goto L_0x01b2;
                case 11: goto L_0x01ae;
                case 12: goto L_0x01aa;
                case 13: goto L_0x01a6;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
        L_0x00d5:
            X.17X r0 = r4.A0A
            java.util.HashSet r1 = r0.A05(r2)
            java.lang.Integer r0 = r3.A05
            boolean r0 = r6.A0V(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.12q r0 = r4.A09
            X.AnonymousClass00C.A0D(r0, r8)
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r2)
            r3.A0B = r0
            X.0wN r0 = r4.A01
            java.util.Set r0 = X.AnonymousClass143.A09(r0, r1)
            int r0 = r0.size()
            int r7 = r1.size()
            if (r0 <= 0) goto L_0x0111
            long r0 = (long) r0
            r9 = 32
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x010b
            r0 = 32
        L_0x010b:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0D = r0
        L_0x0111:
            if (r7 <= 0) goto L_0x012c
            long r0 = (long) r7
            r9 = 32
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x011c
            r0 = 32
        L_0x011c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0C = r0
            int r0 = X.AnonymousClass3UK.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
        L_0x012c:
            if (r2 == 0) goto L_0x0177
            java.lang.String r6 = X.AnonymousClass3UK.A07(r5)
            if (r6 == 0) goto L_0x0145
            X.17V r1 = r4.A0F
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            byte[] r0 = r1.A05(r0)
            java.lang.String r0 = X.AnonymousClass17V.A00(r0, r6)
            r3.A0F = r0
        L_0x0145:
            X.0yC r6 = r4.A0D
            r0 = 6500(0x1964, float:9.108E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x0177
            r0 = 7285(0x1c75, float:1.0208E-41)
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x0177
            r0 = 7283(0x1c73, float:1.0206E-41)
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x0177
            X.0xV r1 = r4.A0B
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0170
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r1 = r1.A01(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
        L_0x0177:
            X.0v0 r0 = r4.A08
            long r6 = r0.A0Q()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x018a
            long r1 = r5.A0I
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x018a
            r8 = 0
        L_0x018a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A02 = r0
            com.whatsapp.jid.DeviceJid r1 = r5.A1T
            if (r1 != 0) goto L_0x019d
            r5.A0f()
        L_0x0197:
            X.0yW r0 = r4.A0E
            r0.Blv(r3)
            return
        L_0x019d:
            X.0wQ r0 = r4.A02
            java.lang.Integer r0 = X.C203229nZ.A05(r0, r1)
            r3.A04 = r0
            goto L_0x0197
        L_0x01a6:
            r0 = 13
            goto L_0x00cf
        L_0x01aa:
            r0 = 12
            goto L_0x00cf
        L_0x01ae:
            r0 = 11
            goto L_0x00cf
        L_0x01b2:
            r0 = 10
            goto L_0x00cf
        L_0x01b6:
            r0 = 9
            goto L_0x00cf
        L_0x01ba:
            r0 = 8
            goto L_0x00cf
        L_0x01be:
            r0 = 3
            goto L_0x00cf
        L_0x01c1:
            r0 = 7
            goto L_0x00cf
        L_0x01c4:
            r0 = 2
            goto L_0x00cf
        L_0x01c7:
            r0 = 6
            goto L_0x00cf
        L_0x01ca:
            r0 = 5
            goto L_0x00cf
        L_0x01cd:
            r0 = 4
            goto L_0x00cf
        L_0x01d0:
            r0 = 1
            goto L_0x00cf
        L_0x01d3:
            boolean r0 = r2 instanceof X.C177528dw
            if (r0 == 0) goto L_0x01da
            r1 = 3
            goto L_0x0075
        L_0x01da:
            boolean r0 = r2 instanceof X.C177538dx
            if (r0 == 0) goto L_0x01e1
            r1 = 4
            goto L_0x0075
        L_0x01e1:
            boolean r0 = X.AnonymousClass143.A0H(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0075
            r1 = 6
            goto L_0x0075
        L_0x01eb:
            java.lang.Object r2 = r3.A01
            X.1N6 r2 = (X.AnonymousClass1N6) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            X.11F r0 = (X.AnonymousClass11F) r0
            X.AnonymousClass1N6.A00(r0, r2, r1)
            return
        L_0x01f9:
            java.lang.Object r4 = r3.A01
            X.1Rj r4 = (X.C28111Rj) r4
            java.lang.Object r2 = r3.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r3.A00
            r0 = 0
            r4.A00(r2, r0, r0, r1)
            return
        L_0x0208:
            java.lang.Object r0 = r3.A01
            X.1bW r0 = (X.C31251bW) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            X.4On r1 = (X.C87374On) r1
            X.1bz r0 = r0.A0F
            r0.A00(r1, r2)
            return
        L_0x0218:
            java.lang.Object r0 = r3.A01
            X.1ZF r0 = (X.AnonymousClass1ZF) r0
            int r1 = r3.A00
            java.lang.Object r3 = r3.A02
            java.util.List r3 = (java.util.List) r3
            X.1ZE r0 = r0.A00
            X.1Z6 r2 = r0.A00(r1)
            if (r2 == 0) goto L_0x0b0c
            r1 = 1
            r0 = 0
            r2.BJZ(r3, r1, r0)
            return
        L_0x0230:
            java.lang.Object r0 = r3.A01
            X.1TF r0 = (X.AnonymousClass1TF) r0
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            int r8 = r3.A00
            X.1J1 r0 = r0.A02
            r7 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 0
            r5 = r3
            r6 = r3
            r4 = r3
            X.AnonymousClass1J1.A02(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0249:
            java.lang.Object r6 = r3.A01
            X.1bB r6 = (X.C31041bB) r6
            java.lang.Object r7 = r3.A02
            X.3Qa r7 = (X.C64933Qa) r7
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            X.11F r4 = r7.A00
            boolean r0 = r4 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x02c8
            r8 = r4
            X.1Uw r8 = (X.C28981Uw) r8
            if (r8 == 0) goto L_0x02c8
            X.1SQ r1 = r6.A02
            X.1A1 r0 = r1.A08
            X.3T1 r5 = r0.A03(r7)
            if (r5 != 0) goto L_0x0283
            X.1Jd r0 = r1.A05
            X.2bM r5 = r0.A0A(r7)
            if (r5 != 0) goto L_0x0283
            X.1A1 r3 = r6.A05
            r2 = 0
            java.lang.String r1 = r7.A01
            X.3Qa r0 = new X.3Qa
            r0.<init>(r4, r1, r2)
            X.3T1 r5 = r3.A03(r0)
            if (r5 != 0) goto L_0x0283
            return
        L_0x0283:
            r0 = 21
            r5.A0n(r0)
            boolean r0 = r5 instanceof X.AnonymousClass2bM
            if (r0 == 0) goto L_0x02ba
            X.1Jd r4 = r6.A00
            r3 = r5
            X.2bM r3 = (X.AnonymousClass2bM) r3
            X.0x8 r2 = r4.A0I
            X.3Qa r0 = r3.A1J
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 7
            r2.A09(r1, r0)
            X.C26171Jd.A05(r4, r3)
        L_0x02a0:
            boolean r0 = r5 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x02c2
            X.ADi r9 = new X.ADi
            r9.<init>(r6, r5)
            X.1TZ r7 = r6.A03
            r12 = 1
            long r0 = r5.A1O
            long r0 = r0 + r12
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r11 = 0
            r14 = 0
            r7.A01(r8, r9, r10, r11, r12, r14)
            return
        L_0x02ba:
            X.1A1 r1 = r6.A05
            r0 = 23
            r1.A05(r5, r0)
            goto L_0x02a0
        L_0x02c2:
            X.1SP r0 = r6.A04
            r0.A00(r5)
            return
        L_0x02c8:
            java.lang.String r1 = "NewsletterJid expected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02d0:
            java.lang.Object r0 = r3.A01
            X.1Zi r0 = (X.C30131Zi) r0
            java.lang.Object r5 = r3.A02
            X.11F r5 = (X.AnonymousClass11F) r5
            int r2 = r3.A00
            X.1Ja r4 = r0.A0D
            X.12q r1 = r4.A02
            r0 = 0
            X.3Qp r3 = r1.A09(r5, r0)
            X.2La r3 = (X.C44072La) r3
            if (r3 == 0) goto L_0x0b0c
            r3.A00 = r2
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "admin_count"
            r2.put(r0, r1)
            X.C26141Ja.A01(r2, r3, r4)
            return
        L_0x02fd:
            java.lang.Object r2 = r3.A01
            X.1WP r2 = (X.AnonymousClass1WP) r2
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            r6 = 4
            java.util.Iterator r3 = r0.iterator()
        L_0x030a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b0c
            java.lang.Object r1 = r3.next()
            X.3Qa r1 = (X.C64933Qa) r1
            X.1A1 r0 = r2.A0n
            X.3T1 r5 = r0.A03(r1)
            if (r5 != 0) goto L_0x0326
            X.1Jd r0 = r2.A0S
            X.2bM r5 = r0.A0A(r1)
            if (r5 == 0) goto L_0x030a
        L_0x0326:
            X.1FN r1 = r2.A0R
            X.3Qa r0 = r5.A1J
            java.util.HashSet r1 = r1.A00(r0)
            boolean r0 = r5 instanceof X.AnonymousClass2bM
            if (r0 == 0) goto L_0x0348
            r7 = 1
        L_0x0333:
            X.1DT r4 = r2.A07
            X.0wN r0 = r2.A03
            java.util.Set r0 = X.AnonymousClass143.A09(r0, r1)
            int r8 = r0.size()
            int r9 = r1.size()
            r10 = 0
            r4.A0N(r5, r6, r7, r8, r9, r10)
            goto L_0x030a
        L_0x0348:
            X.0xM r0 = r2.A0O
            X.1FT r0 = r0.A0k
            int r7 = r0.A01(r5)
            goto L_0x0333
        L_0x0351:
            java.lang.Object r2 = r3.A01
            X.1Xk r2 = (X.C29641Xk) r2
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            int r0 = r3.A00
            X.C29641Xk.A00(r2, r1, r0)
            return
        L_0x035f:
            java.lang.Object r2 = r3.A01
            X.16J r2 = (X.AnonymousClass16J) r2
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            int r0 = r3.A00
            r2.A05(r1, r0)
            return
        L_0x036d:
            java.lang.Object r4 = r3.A01
            X.0yX r4 = (X.C21020yX) r4
            java.lang.Object r1 = r3.A02
            X.0yK r1 = (X.C20890yK) r1
            int r6 = r3.A00
            int r0 = r1.bufferChannel
            r7 = 2
            java.lang.Object r5 = r1.clone()
            X.0yK r5 = (X.C20890yK) r5
            if (r0 != r7) goto L_0x03d4
            boolean r0 = X.C21020yX.A0C(r4)
            if (r0 == 0) goto L_0x0b0c
            boolean r0 = r4.A0W
            if (r0 != 0) goto L_0x03a9
            X.0v0 r0 = r4.A0H
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "private_stats_id"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            X.0yI r1 = r4.A0K
            java.util.ArrayList r0 = X.AnonymousClass1M3.A00()
            r1.A06(r2, r0)
            r0 = 1
            r4.A0W = r0
        L_0x03a9:
            X.0yO r3 = r4.A0L     // Catch:{ IllegalArgumentException -> 0x0438 }
            X.0yI r1 = r4.A0K     // Catch:{ IllegalArgumentException -> 0x0438 }
            int r0 = r5.psId     // Catch:{ IllegalArgumentException -> 0x0438 }
            java.lang.String r2 = r1.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 3
            r3.BqE(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r3.BqE(r2, r1, r7)     // Catch:{ IllegalArgumentException -> 0x0438 }
            X.1E5 r0 = r4.A06
            r0.A02(r5, r6)
            X.1E5 r1 = r4.A06
            int r0 = r5.psId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r0)
            X.C21020yX.A06(r4)
            return
        L_0x03d4:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x03e6
            java.util.concurrent.CountDownLatch r0 = r4.A0Q
            X.C21020yX.A0A(r4, r0)
            X.0yO r1 = r4.A0L
            r0 = 3
            r1.A00(r0)
            r0 = 1
            r4.A0B = r0
        L_0x03e6:
            X.1C9 r0 = r4.A02
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0b0c
            boolean r0 = r4.A0W
            if (r0 != 0) goto L_0x040d
            X.0v0 r0 = r4.A0H
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "private_stats_id"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            X.0yI r1 = r4.A0K
            java.util.ArrayList r0 = X.AnonymousClass1M3.A00()
            r1.A06(r2, r0)
            r0 = 1
            r4.A0W = r0
        L_0x040d:
            X.0yO r3 = r4.A0L     // Catch:{ IllegalArgumentException -> 0x0438 }
            X.0yI r1 = r4.A0K     // Catch:{ IllegalArgumentException -> 0x0438 }
            int r0 = r5.psId     // Catch:{ IllegalArgumentException -> 0x0438 }
            java.lang.String r2 = r1.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 3
            r3.BqE(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0438 }
            r3.BqE(r2, r1, r7)     // Catch:{ IllegalArgumentException -> 0x0438 }
            X.1E5 r0 = r4.A05
            r0.A02(r5, r6)
            X.1E5 r1 = r4.A05
            int r0 = r5.psId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r0)
            X.C21020yX.A05(r4)
            return
        L_0x0438:
            java.lang.String r0 = "invalid ps-id key"
            X.C21020yX.A09(r4, r0)
            return
        L_0x043e:
            java.lang.Object r4 = r3.A01
            X.0yX r4 = (X.C21020yX) r4
            java.lang.Object r1 = r3.A02
            X.0yK r1 = (X.C20890yK) r1
            int r3 = r3.A00
            int r2 = r1.bufferChannel
            r0 = 1
            java.lang.Object r1 = r1.clone()
            X.0yK r1 = (X.C20890yK) r1
            if (r2 != r0) goto L_0x0468
            boolean r0 = X.C21020yX.A0D(r4)
            if (r0 == 0) goto L_0x0b0c
            X.1E5 r0 = r4.A07
            r0.A02(r1, r3)
            X.1E5 r1 = r4.A07
            r0 = 0
            r1.A03(r0)
            X.C21020yX.A07(r4)
            return
        L_0x0468:
            r0 = 0
            X.C21020yX.A03(r1, r4, r3, r0)
            return
        L_0x046d:
            java.lang.Object r8 = r3.A01
            X.1H3 r8 = (X.AnonymousClass1H3) r8
            java.lang.Object r7 = r3.A02
            X.6Pw r7 = (X.C131636Pw) r7
            int r6 = r3.A00
            r5 = 0
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1Bd r0 = new X.1Bd
            r0.<init>(r1, r3)
            X.AnonymousClass1H3.A01(r8, r7, r0, r5, r6)
            return
        L_0x0485:
            java.lang.Object r0 = r3.A01
            X.0xN r0 = (X.C20320xN) r0
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r3 = r3.A00
            X.005 r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.1OD r2 = (X.AnonymousClass1OD) r2
            r1 = 406(0x196, float:5.69E-43)
            r0 = 0
            if (r3 != r1) goto L_0x049d
            r0 = 1
        L_0x049d:
            r2.A0B(r4, r0)
            return
        L_0x04a1:
            java.lang.Object r2 = r3.A01
            X.1DQ r2 = (X.AnonymousClass1DQ) r2
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            int r0 = r3.A00
            X.AnonymousClass1DQ.A00(r2, r1, r0)
            return
        L_0x04af:
            java.lang.Object r1 = r3.A01
            X.0xM r1 = (X.C20310xM) r1
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r3 = r3.A00
            X.1A1 r0 = r1.A1B
            r0.A05(r4, r3)
            X.1DQ r0 = r1.A0T
            android.os.Handler r2 = r0.A02
            r1 = 2
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r3, r0, r4)
            r0.sendToTarget()
            return
        L_0x04cc:
            java.lang.Object r2 = r3.A01
            X.0xM r2 = (X.C20310xM) r2
            java.lang.Object r6 = r3.A02
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            int r4 = r3.A00
            X.3Qa r3 = r6.A1J
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0507
            boolean r0 = r6.A1Y
            if (r0 != 0) goto L_0x0507
            long r18 = android.os.SystemClock.uptimeMillis()
            X.1DT r5 = r2.A08
            r9 = 0
            int r15 = r6.A0B
            r7 = 0
            long r0 = r6.A1S
            long r16 = r18 - r0
            long r0 = r6.A1d
            long r18 = r18 - r0
            r8 = 4
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r20 = r18
            r5.A0Q(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r23, r24, r25, r26)
        L_0x0507:
            X.34U r0 = r2.A0Q(r6, r4)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0b0c
            X.1Cf r0 = r2.A0K
            X.11F r2 = r3.A00
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x051b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b0c
            java.lang.Object r0 = r1.next()
            X.1Ct r0 = (X.C24521Ct) r0
            r0.BUf(r2)
            goto L_0x051b
        L_0x052b:
            java.lang.Object r2 = r3.A01
            X.0xM r2 = (X.C20310xM) r2
            java.lang.Object r1 = r3.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r3.A00
            r2.A0v(r1, r0)
            return
        L_0x0539:
            java.lang.Object r0 = r3.A01
            X.0xM r0 = (X.C20310xM) r0
            java.lang.Object r6 = r3.A02
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            int r3 = r3.A00
            X.1FT r0 = r0.A0k
            X.12P r0 = r0.A00
            X.1M0 r5 = r0.A05()
            X.AnonymousClass1FT.A00(r6)     // Catch:{ all -> 0x0583 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0583 }
            r4.<init>()     // Catch:{ all -> 0x0583 }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A1N     // Catch:{ all -> 0x0583 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0583 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0583 }
            java.lang.String r1 = "send_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0583 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0583 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0583 }
            java.lang.String r2 = "message_send_count"
            r1 = 5
            java.lang.String r0 = "INSERT_MESSAGE_SEND_COUNT_SQL"
            long r3 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0583 }
            long r1 = r6.A1N     // Catch:{ all -> 0x0583 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x057a
            r1 = 1
        L_0x057a:
            java.lang.String r0 = "SendCountMessageStore/insertOrUpdateSendCount/inserted row should have same row_id"
            X.C18740tg.A0F(r1, r0)     // Catch:{ all -> 0x0583 }
            r5.close()
            return
        L_0x0583:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0b02 }
            throw r1
        L_0x0588:
            java.lang.Object r0 = r3.A01
            X.0xM r0 = (X.C20310xM) r0
            java.lang.Object r2 = r3.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            int r1 = r3.A00
            X.16J r0 = r0.A0Z
            r0.A04(r2, r1)
            return
        L_0x0598:
            java.lang.Object r0 = r3.A01
            X.12t r0 = (X.C220712t) r0
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r3 = r3.A00
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.1CR r2 = r0.A0U
            java.lang.String r0 = r1.getRawString()
            X.3LI r1 = X.AnonymousClass1CR.A02(r2, r0)
            int r0 = r1.A04
            if (r3 == r0) goto L_0x0b0c
            r1.A04 = r3
            X.AnonymousClass1CR.A06(r1, r2)
            return
        L_0x05be:
            java.lang.Object r0 = r3.A01
            X.1CY r0 = (X.AnonymousClass1CY) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.1CZ r0 = r0.A00
            java.util.Map r0 = r0.A00
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0b0c
            r1.run()
            return
        L_0x05d6:
            java.lang.Object r6 = r3.A01
            X.1ci r6 = (X.C31951ci) r6
            java.lang.Object r0 = r3.A02
            java.util.Set r0 = (java.util.Set) r0
            int r5 = r3.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x05e4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x05fe
            java.lang.Object r3 = r4.next()
            X.11F r3 = (X.AnonymousClass11F) r3
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0N
            X.1fH r2 = r0.A1S
            X.0wo r0 = r0.A1f
            long r0 = X.C19970wo.A00(r0)
            r2.A01(r3, r0)
            goto L_0x05e4
        L_0x05fe:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0N
            X.17Y r2 = r0.A0d
            r0 = 1
            r1 = 2131893051(0x7f121b3b, float:1.9420868E38)
            if (r5 != r0) goto L_0x060b
            r1 = 2131893052(0x7f121b3c, float:1.942087E38)
        L_0x060b:
            r0 = 0
            r2.A07(r1, r0)
            return
        L_0x0610:
            java.lang.Object r2 = r3.A01
            X.1NM r2 = (X.AnonymousClass1NM) r2
            java.lang.Object r0 = r3.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r1 = r3.A00
            r2.A07()
            android.content.SharedPreferences r7 = X.AnonymousClass1NM.A00(r2)
            java.lang.String r6 = r0.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r5 = "_notification"
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r7.getString(r2, r0)
            java.lang.String r4 = ","
            java.lang.String[] r2 = r0.split(r4)
            r0 = 0
            java.lang.Long r18 = X.C202339lc.A04(r2, r0)
            r0 = 1
            java.lang.Long r17 = X.C202339lc.A04(r2, r0)
            r0 = 2
            java.lang.Long r16 = X.C202339lc.A04(r2, r0)
            r0 = 3
            java.lang.Long r15 = X.C202339lc.A04(r2, r0)
            r0 = 4
            java.lang.Long r14 = X.C202339lc.A04(r2, r0)
            r0 = 5
            java.lang.Long r13 = X.C202339lc.A04(r2, r0)
            r0 = 6
            java.lang.Long r12 = X.C202339lc.A04(r2, r0)
            r0 = 7
            java.lang.Long r11 = X.C202339lc.A04(r2, r0)
            r0 = 8
            java.lang.Long r10 = X.C202339lc.A04(r2, r0)
            r0 = 9
            java.lang.Long r9 = X.C202339lc.A04(r2, r0)
            r0 = 10
            java.lang.Long r8 = X.C202339lc.A04(r2, r0)
            switch(r1) {
                case 0: goto L_0x0765;
                case 1: goto L_0x0753;
                case 2: goto L_0x0741;
                case 3: goto L_0x072f;
                case 4: goto L_0x071d;
                case 5: goto L_0x070b;
                case 6: goto L_0x06fa;
                case 7: goto L_0x06e9;
                case 8: goto L_0x068a;
                case 9: goto L_0x06d8;
                default: goto L_0x067f;
            }
        L_0x067f:
            r2 = 1
            if (r8 != 0) goto L_0x06d3
            r0 = 0
        L_0x0685:
            long r0 = r0 + r2
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x068a:
            android.content.SharedPreferences$Editor r1 = r7.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            r0 = 11
            java.lang.Long[] r3 = new java.lang.Long[r0]
            r0 = 0
            r3[r0] = r18
            r0 = 1
            r3[r0] = r17
            r0 = 2
            r3[r0] = r16
            r0 = 3
            r3[r0] = r15
            r0 = 4
            r3[r0] = r14
            r0 = 5
            r3[r0] = r13
            r0 = 6
            r3[r0] = r12
            r0 = 7
            r3[r0] = r11
            r0 = 8
            r3[r0] = r10
            r0 = 9
            r3[r0] = r9
            r0 = 10
            r3[r0] = r8
            java.util.List r0 = java.util.Arrays.asList(r3)
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            goto L_0x0914
        L_0x06d3:
            long r0 = r8.longValue()
            goto L_0x0685
        L_0x06d8:
            r2 = 1
            if (r9 != 0) goto L_0x06e4
            r0 = 0
        L_0x06de:
            long r0 = r0 + r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x06e4:
            long r0 = r9.longValue()
            goto L_0x06de
        L_0x06e9:
            r2 = 1
            if (r11 != 0) goto L_0x06f5
            r0 = 0
        L_0x06ef:
            long r0 = r0 + r2
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x06f5:
            long r0 = r11.longValue()
            goto L_0x06ef
        L_0x06fa:
            r2 = 1
            if (r12 != 0) goto L_0x0706
            r0 = 0
        L_0x0700:
            long r0 = r0 + r2
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x0706:
            long r0 = r12.longValue()
            goto L_0x0700
        L_0x070b:
            r2 = 1
            if (r13 != 0) goto L_0x0718
            r0 = 0
        L_0x0711:
            long r0 = r0 + r2
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x0718:
            long r0 = r13.longValue()
            goto L_0x0711
        L_0x071d:
            r2 = 1
            if (r14 != 0) goto L_0x072a
            r0 = 0
        L_0x0723:
            long r0 = r0 + r2
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x072a:
            long r0 = r14.longValue()
            goto L_0x0723
        L_0x072f:
            r2 = 1
            if (r15 != 0) goto L_0x073c
            r0 = 0
        L_0x0735:
            long r0 = r0 + r2
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x073c:
            long r0 = r15.longValue()
            goto L_0x0735
        L_0x0741:
            r2 = 1
            if (r16 != 0) goto L_0x074e
            r0 = 0
        L_0x0747:
            long r0 = r0 + r2
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x074e:
            long r0 = r16.longValue()
            goto L_0x0747
        L_0x0753:
            r2 = 1
            if (r17 != 0) goto L_0x0760
            r0 = 0
        L_0x0759:
            long r0 = r0 + r2
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x0760:
            long r0 = r17.longValue()
            goto L_0x0759
        L_0x0765:
            r2 = 1
            if (r18 != 0) goto L_0x0772
            r0 = 0
        L_0x076b:
            long r0 = r0 + r2
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            goto L_0x068a
        L_0x0772:
            long r0 = r18.longValue()
            goto L_0x076b
        L_0x0777:
            java.lang.Object r2 = r3.A01
            X.1NM r2 = (X.AnonymousClass1NM) r2
            java.lang.Object r0 = r3.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r1 = r3.A00
            r2.A07()
            android.content.SharedPreferences r6 = X.AnonymousClass1NM.A00(r2)
            java.lang.String r5 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r6.getString(r5, r0)
            X.9fc r4 = X.C199619fc.A00(r0)
            java.lang.Long r0 = r4.A0q
            long r2 = (long) r1
            if (r0 != 0) goto L_0x07a8
            r0 = 0
        L_0x079d:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0q = r0
            X.AnonymousClass1NM.A02(r6, r4, r5)
            return
        L_0x07a8:
            long r0 = r0.longValue()
            goto L_0x079d
        L_0x07ad:
            java.lang.Object r1 = r3.A01
            X.1NM r1 = (X.AnonymousClass1NM) r1
            java.lang.Object r0 = r3.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r3 = r3.A00
            r1.A07()
            android.content.SharedPreferences r2 = X.AnonymousClass1NM.A00(r1)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r2.getString(r1, r0)
            X.9fc r0 = X.C199619fc.A00(r0)
            r0.A01(r3)
            X.AnonymousClass1NM.A02(r2, r0, r1)
            return
        L_0x07d3:
            java.lang.Object r0 = r3.A01
            X.1NM r0 = (X.AnonymousClass1NM) r0
            java.lang.Object r10 = r3.A02
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            r0.A07()
            android.content.SharedPreferences r11 = X.AnonymousClass1NM.A00(r0)
            java.lang.String r1 = r10.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r9 = "_businessTools"
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "null,null,null,null"
            java.lang.String r0 = r11.getString(r1, r0)
            java.lang.String r5 = ","
            java.lang.String[] r1 = r0.split(r5)
            r0 = 0
            java.lang.Long r12 = X.C202339lc.A04(r1, r0)
            r0 = 1
            java.lang.Long r8 = X.C202339lc.A04(r1, r0)
            r0 = 2
            java.lang.Long r7 = X.C202339lc.A04(r1, r0)
            r6 = 3
            java.lang.Long r1 = X.C202339lc.A04(r1, r6)
            r0 = 1
            long r2 = (long) r0
            if (r1 != 0) goto L_0x0855
            r0 = 0
        L_0x081d:
            long r0 = r0 + r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            android.content.SharedPreferences$Editor r3 = r11.edit()
            java.lang.String r1 = r10.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r2 = r0.toString()
            r0 = 4
            java.lang.Long[] r1 = new java.lang.Long[r0]
            r0 = 0
            r1[r0] = r12
            r0 = 1
            r1[r0] = r8
            r0 = 2
            r1[r0] = r7
            r1[r6] = r4
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r5, r0)
            android.content.SharedPreferences$Editor r0 = r3.putString(r2, r0)
            goto L_0x0914
        L_0x0855:
            long r0 = r1.longValue()
            goto L_0x081d
        L_0x085a:
            java.lang.Object r0 = r3.A01
            X.1Nr r0 = (X.C27301Nr) r0
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            int r3 = r3.A00
            X.164 r2 = r0.A00
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.whatsapp.jobqueue.job.SyncDevicesJob r0 = new com.whatsapp.jobqueue.job.SyncDevicesJob
            r0.<init>(r1, r3)
            r2.A01(r0)
            return
        L_0x0878:
            java.lang.Object r5 = r3.A01
            X.1Sq r5 = (X.C28431Sq) r5
            int r4 = r3.A00
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            r6 = 2
            X.1Sk r7 = r5.A05
            X.1Sm r0 = r5.A04
            int r2 = r0.BEP(r3)
            X.17X r0 = r5.A08
            X.17r r0 = r0.A07
            X.6X6 r0 = r0.A0C(r3)
            java.util.Map r0 = r0.A08
            int r0 = r0.size()
            long r0 = (long) r0
            r7.A06(r4, r0, r2)
            r0 = 3
            if (r4 == r0) goto L_0x08b0
            r0 = 4
            if (r4 == r0) goto L_0x08aa
            r0 = 5
            if (r4 == r0) goto L_0x08b0
            r0 = 6
            if (r4 == r0) goto L_0x08b0
            return
        L_0x08aa:
            X.1LV r0 = r5.A03
            r0.A08(r6)
            return
        L_0x08b0:
            X.1LV r2 = r5.A03
            X.147 r1 = r2.A02(r3)
            if (r1 == 0) goto L_0x0b0c
            r0 = 1
            r2.A0A(r1, r0)
            return
        L_0x08bd:
            java.lang.Object r5 = r3.A01
            X.1Sq r5 = (X.C28431Sq) r5
            int r4 = r3.A00
            java.lang.Object r1 = r3.A02
            X.147 r1 = (X.AnonymousClass147) r1
            X.1Sk r3 = r5.A05
            X.1Sm r0 = r5.A04
            int r2 = r0.BEP(r1)
            X.17X r0 = r5.A08
            X.17r r0 = r0.A07
            X.6X6 r0 = r0.A0C(r1)
            java.util.Map r0 = r0.A08
            int r0 = r0.size()
            long r0 = (long) r0
            r3.A05(r4, r0, r2)
            return
        L_0x08e2:
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r3.A02
            X.1Pa r3 = (X.C27631Pa) r3
            int r2 = X.C34681hT.A00(r0)
            if (r2 <= 0) goto L_0x0b0c
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "end_call_tone_duration_ms"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            java.lang.String r2 = "2.24.6.77"
            java.util.Objects.requireNonNull(r2)
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "end_call_tone_duration_last_cached_app_version"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x0914:
            r0.apply()
            return
        L_0x0918:
            java.lang.Object r0 = r3.A01
            X.1hS r0 = (X.C34671hS) r0
            java.lang.Object r6 = r3.A02
            X.3KV r6 = (X.AnonymousClass3KV) r6
            int r2 = r3.A00
            X.1hN r0 = r0.A00
            X.1ha r1 = r0.A07
            if (r2 == 0) goto L_0x092f
            r0 = 1
            if (r2 == r0) goto L_0x094c
            r0 = 2
            if (r2 == r0) goto L_0x094c
            return
        L_0x092f:
            if (r6 == 0) goto L_0x094c
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r5 = r1.A00
            X.6rM r0 = r5.A04
            if (r0 == 0) goto L_0x093f
            long r3 = r0.A00
            long r1 = r6.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0942
        L_0x093f:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A06(r5, r6)
        L_0x0942:
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A05(r5)
            return
        L_0x094c:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r1.A00
            X.1hN r1 = r0.A0M
            r1.A02()
            r0 = 1
            if (r2 != r0) goto L_0x0b0c
            r1.A01()
            return
        L_0x095a:
            java.lang.Object r1 = r3.A01
            X.1Xg r1 = (X.C29601Xg) r1
            java.lang.Object r2 = r3.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            r3 = 0
            r4 = 56
            X.1Xf r0 = r1.A00
            boolean r5 = r0.A01(r2, r4)
            r6 = 0
            X.C29601Xg.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x0970:
            java.lang.Object r1 = r3.A01
            X.1Xg r1 = (X.C29601Xg) r1
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r6 = r3.A00
            r0 = 56
            if (r6 == r0) goto L_0x098a
            r0 = 68
            if (r6 == r0) goto L_0x098a
            r0 = 93
            if (r6 == r0) goto L_0x098a
            r0 = 67
            if (r6 != r0) goto L_0x0b0c
        L_0x098a:
            X.1Jd r5 = r1.A03
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0 = 56
            if (r6 != r0) goto L_0x0a9a
            X.4Uq r0 = r4.A0J
            if (r0 == 0) goto L_0x0ab4
            java.util.Collection r10 = r0.B8Y()
        L_0x099d:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r7 = r10.iterator()
        L_0x09a6:
            boolean r0 = r7.hasNext()
            r9 = 17
            if (r0 == 0) goto L_0x09ca
            java.lang.Object r1 = r7.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.0wQ r0 = r5.A01
            boolean r0 = X.C66013Ui.A0R(r0, r1)
            if (r0 != 0) goto L_0x09a6
            int r0 = r1.A0D
            if (r0 == r9) goto L_0x09a6
            long r0 = r1.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
            goto L_0x09a6
        L_0x09ca:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0a77
            java.lang.String[] r2 = X.C65733Tg.A04(r2)
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            X.12P r0 = r5.A0C
            X.1M0 r7 = r0.get()
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0afd }
        L_0x09ea:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0afd }
            if (r0 == 0) goto L_0x0a54
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0afd }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x0afd }
            int r12 = r11.length     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = X.AnonymousClass3TN.A01     // Catch:{ all -> 0x0afd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0afd }
            r2.<init>()     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "SELECT _id FROM message_add_on WHERE "
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "status = "
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            r2.append(r9)     // Catch:{ all -> 0x0afd }
            java.lang.String r1 = " AND "
            r2.append(r1)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "from_me = 0"
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            r2.append(r1)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "_id IN "
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r12)     // Catch:{ all -> 0x0afd }
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            r2.append(r1)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)"
            r2.append(r0)     // Catch:{ all -> 0x0afd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0afd }
            X.14e r1 = r7.A02     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "MessageAddOnStore/ensureMessageAddOnStatusesUpToDate"
            android.database.Cursor r11 = r1.A09(r2, r0, r11)     // Catch:{ all -> 0x0afd }
            java.lang.String r0 = "_id"
            int r2 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0af1 }
        L_0x0a3e:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0af1 }
            if (r0 == 0) goto L_0x0a50
            long r0 = r11.getLong(r2)     // Catch:{ all -> 0x0af1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0af1 }
            r8.add(r0)     // Catch:{ all -> 0x0af1 }
            goto L_0x0a3e
        L_0x0a50:
            r11.close()     // Catch:{ all -> 0x0afd }
            goto L_0x09ea
        L_0x0a54:
            r7.close()
            java.util.Iterator r7 = r10.iterator()
        L_0x0a5b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0a77
            java.lang.Object r2 = r7.next()
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            long r0 = r2.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0a5b
            r2.A0n(r9)
            goto L_0x0a5b
        L_0x0a77:
            java.util.Iterator r2 = r10.iterator()
        L_0x0a7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ab4
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.0wQ r0 = r5.A01
            boolean r0 = X.C66013Ui.A0R(r0, r1)
            if (r0 != 0) goto L_0x0a7b
            int r0 = r1.A0D
            if (r0 == r9) goto L_0x0a7b
            r3.add(r1)
            r1.A0n(r9)
            goto L_0x0a7b
        L_0x0a9a:
            r0 = 68
            if (r6 != r0) goto L_0x0ae0
            X.2bc r2 = r4.A1U
            if (r2 == 0) goto L_0x0ab4
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0ab4
            int r1 = r2.A0D
            r0 = 17
            if (r1 == r0) goto L_0x0ab4
            r3.add(r2)
            r2.A0n(r0)
        L_0x0ab4:
            long r2 = X.C26171Jd.A02(r5, r3)
            X.3Qa r0 = r4.A1J
            X.11F r4 = r0.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0b0c
            if (r4 == 0) goto L_0x0b0c
            java.util.List r1 = X.C65733Tg.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0ad3
            X.163 r0 = r5.A05
            r0.A0J(r4, r2)
        L_0x0ad3:
            X.1TM r0 = r5.A0X
            if (r0 == 0) goto L_0x0b0c
            X.1TM r0 = r5.A0X
            X.1Si r1 = r0.A00
            r0 = 0
            r1.A0D(r4, r0)
            return
        L_0x0ae0:
            r0 = 67
            if (r6 != r0) goto L_0x0ab4
            boolean r0 = r4 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x0ab4
            r0 = r4
            X.2bS r0 = (X.AnonymousClass2bS) r0
            java.util.List r10 = r0.A04
            if (r10 == 0) goto L_0x0ab4
            goto L_0x099d
        L_0x0af1:
            r1 = move-exception
            if (r11 == 0) goto L_0x0afc
            r11.close()     // Catch:{ all -> 0x0af8 }
            goto L_0x0afc
        L_0x0af8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0afd }
        L_0x0afc:
            throw r1     // Catch:{ all -> 0x0afd }
        L_0x0afd:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0b02 }
            throw r1
        L_0x0b02:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0b06:
            throw r1
        L_0x0b07:
            if (r2 == 0) goto L_0x0b0c
            r2.close()
        L_0x0b0c:
            return
        L_0x0b0d:
            java.lang.Object r6 = r3.A01
            X.1X4 r6 = (X.AnonymousClass1X4) r6
            int r1 = r3.A00
            java.lang.Object r5 = r3.A02
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            X.1Dw r4 = r6.A0t
            r3 = 2
            if (r1 == r3) goto L_0x0b3d
            r0 = 3
            if (r1 == r0) goto L_0x0b28
            r0 = 4
            if (r1 == r0) goto L_0x0b3b
            r0 = 10
            r3 = 7
            if (r1 == r0) goto L_0x0b28
            r3 = 0
        L_0x0b28:
            int r2 = r5.A1I
            int r1 = r5.A09
            r0 = 0
            int r1 = X.AnonymousClass6UH.A01(r2, r1, r0)
            X.1E3 r0 = r6.A0R
            X.3KT r0 = r0.A01(r5)
            r4.A04(r0, r3, r1)
            return
        L_0x0b3b:
            r3 = 3
            goto L_0x0b28
        L_0x0b3d:
            r3 = 1
            goto L_0x0b28
        L_0x0b3f:
            java.lang.Object r2 = r3.A01
            X.17Y r2 = (X.AnonymousClass17Y) r2
            java.lang.Object r1 = r3.A02
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r3.A00
            r2.A0E(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35261iP.run():void");
    }

    public C35261iP(C31251bW r2, C87374On r3) {
        this.A03 = 37;
        this.A01 = r2;
        this.A00 = 11231;
        this.A02 = r3;
    }

    public C35261iP(AnonymousClass1WP r2, List list) {
        this.A03 = 30;
        this.A01 = r2;
        this.A02 = list;
        this.A00 = 4;
    }

    public C35261iP(C29601Xg r2, AnonymousClass3T1 r3) {
        this.A03 = 3;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 56;
    }

    public C35261iP(Context context, C27631Pa r3) {
        this.A03 = 6;
        this.A01 = context;
        this.A00 = R.raw.end_call_m4;
        this.A02 = r3;
    }

    public C35261iP(AnonymousClass1NM r2, AnonymousClass11F r3, int i, int i2) {
        this.A03 = i2;
        if (10 - i2 != 0) {
            this.A01 = r2;
            this.A02 = r3;
            this.A00 = i;
            return;
        }
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 3;
    }

    public C35261iP(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }
}
