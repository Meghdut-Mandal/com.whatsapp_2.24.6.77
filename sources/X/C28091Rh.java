package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Rh  reason: invalid class name and case insensitive filesystem */
public class C28091Rh {
    public final List A00 = new ArrayList();
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final AnonymousClass16D A03;
    public final C220412q A04;
    public final AnonymousClass1LU A05;
    public final C20810yC A06;
    public final C28101Ri A07;
    public final Map A08 = new HashMap();

    public synchronized AnonymousClass4Q7 A01(C134786bb r3) {
        Map map;
        map = this.A08;
        if (map.isEmpty()) {
            A00(this);
        }
        return (AnonymousClass4Q7) map.get(Integer.valueOf(r3.A01));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r8.A00, 7769) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r8.A00, 6450) == false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C28091Rh r11) {
        /*
            java.util.List r7 = r11.A00
            r7.clear()
            X.1Ri r8 = r11.A07
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x001a
            X.0yC r2 = r8.A00
            X.0yV r1 = X.C21000yV.A01
            r0 = 6450(0x1932, float:9.038E-42)
            boolean r1 = X.C20800yB.A01(r1, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r3 = 4
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0032
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x00cd
            X.0yC r2 = r8.A00
            X.0yV r1 = X.C21000yV.A01
            r0 = 7769(0x1e59, float:1.0887E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00cd
        L_0x0032:
            r4 = 2131433592(0x7f0b1878, float:1.8488974E38)
            r2 = 2131889587(0x7f120db3, float:1.9413842E38)
            r1 = 2131233735(0x7f080bc7, float:1.8083616E38)
            X.6bb r0 = new X.6bb
            r0.<init>(r10, r4, r2, r1)
            r7.add(r0)
            r2 = 2131433652(0x7f0b18b4, float:1.8489096E38)
            r1 = 2131889597(0x7f120dbd, float:1.9413862E38)
            r0 = 2131233738(0x7f080bca, float:1.8083622E38)
            X.6bb r4 = new X.6bb
            r4.<init>(r9, r2, r1, r0)
        L_0x0051:
            r7.add(r4)
            X.0yC r5 = r11.A06
            r1 = 1608(0x648, float:2.253E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r5, r1)
            r6 = 2
            if (r0 != 0) goto L_0x0072
            r4 = 2131433676(0x7f0b18cc, float:1.8489144E38)
            r2 = 2131889600(0x7f120dc0, float:1.9413868E38)
            r1 = 2131233740(0x7f080bcc, float:1.8083626E38)
            X.6bb r0 = new X.6bb
            r0.<init>(r6, r4, r2, r1)
            r7.add(r0)
        L_0x0072:
            r7 = 3
            java.util.Map r4 = r11.A08
            r4.clear()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            X.16D r2 = r11.A03
            X.3fv r0 = new X.3fv
            r0.<init>(r2)
            r4.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.3fx r0 = new X.3fx
            r0.<init>(r2)
            r4.put(r1, r0)
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x00b0
            X.0yC r2 = r8.A00
            X.0yV r1 = X.C21000yV.A01
            r0 = 6450(0x1932, float:9.038E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00b0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            X.3fu r0 = new X.3fu
            r0.<init>()
            r4.put(r1, r0)
        L_0x00b0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            X.12q r2 = r11.A04
            X.1LU r1 = r11.A05
            X.3g0 r0 = new X.3g0
            r0.<init>(r2, r1, r5)
            r4.put(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            X.3fw r0 = new X.3fw
            r0.<init>(r2)
            r4.put(r1, r0)
            return
        L_0x00cd:
            r2 = 2131433611(0x7f0b188b, float:1.8489013E38)
            r1 = 2131889589(0x7f120db5, float:1.9413846E38)
            r0 = 2131233737(0x7f080bc9, float:1.808362E38)
            X.6bb r4 = new X.6bb
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28091Rh.A00(X.1Rh):void");
    }

    public C28091Rh(C19460v5 r2, C19460v5 r3, AnonymousClass16D r4, C220412q r5, AnonymousClass1LU r6, C20810yC r7, C28101Ri r8) {
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A05 = r6;
    }
}
