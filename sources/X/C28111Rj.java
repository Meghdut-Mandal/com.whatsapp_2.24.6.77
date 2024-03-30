package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Random;

/* renamed from: X.1Rj  reason: invalid class name and case insensitive filesystem */
public class C28111Rj {
    public int A00 = 0;
    public long A01;
    public Runnable A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final C20810yC A04;
    public final AnonymousClass005 A05;
    public final Random A06 = new Random();
    public final C21010yW A07;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r7 != 118) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, int r23) {
        /*
            r19 = this;
            r4 = r19
            X.0yC r3 = r4.A04
            r0 = 1608(0x648, float:2.253E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r2, r3, r0)
            if (r0 == 0) goto L_0x0083
            X.2S2 r1 = new X.2S2
            r1.<init>()
            r8 = r20
            r1.A00 = r8
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            long r5 = r4.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.A04 = r0
            r0 = 97
            r6 = 17
            r5 = r21
            r7 = r23
            if (r7 == r0) goto L_0x0133
            r0 = 98
            if (r7 == r0) goto L_0x0084
            r0 = 100
            r6 = 16
            if (r7 == r0) goto L_0x0133
            r0 = 103(0x67, float:1.44E-43)
            r6 = 13
            if (r7 == r0) goto L_0x0133
            r0 = 105(0x69, float:1.47E-43)
            r6 = 12
            if (r7 == r0) goto L_0x0133
            r0 = 108(0x6c, float:1.51E-43)
            r6 = 14
            if (r7 == r0) goto L_0x0133
            r0 = 114(0x72, float:1.6E-43)
            r6 = 3
            if (r7 == r0) goto L_0x0133
            r0 = 117(0x75, float:1.64E-43)
            r6 = 2
            if (r7 == r0) goto L_0x0133
            r0 = 118(0x76, float:1.65E-43)
            r6 = 15
            if (r7 == r0) goto L_0x0133
        L_0x005c:
            r0 = 5957(0x1745, float:8.348E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)
            if (r0 == 0) goto L_0x007e
            r1.A02 = r5
            X.005 r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.6pB r0 = (X.C142626pB) r0
            X.6DA r2 = r0.A00
            java.lang.String r0 = r2.A01
            r1.A08 = r0
            java.lang.String r0 = r2.A01()
            r1.A05 = r0
            java.lang.String r0 = r2.A00
            r1.A07 = r0
        L_0x007e:
            X.0yW r0 = r4.A07
            r0.Blw(r1)
        L_0x0083:
            return
        L_0x0084:
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.005 r0 = r4.A05
            java.lang.Object r10 = r0.get()
            X.6pB r10 = (X.C142626pB) r10
            int r6 = r8.intValue()
            X.0yC r0 = r10.A01
            boolean r0 = X.AnonymousClass6TR.A01(r0)
            r17 = 1
            r13 = r22
            if (r0 == 0) goto L_0x00ed
            X.2RY r8 = new X.2RY
            r8.<init>()
            r7 = 2
            if (r6 == r7) goto L_0x010e
            r0 = 4
            if (r6 == r0) goto L_0x0109
            r0 = 5
            if (r6 == r0) goto L_0x0119
            r0 = 0
        L_0x00b3:
            r8.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r8.A01 = r0
            java.lang.Integer r0 = X.C142626pB.A00(r5)
            r8.A02 = r0
            X.C142626pB.A01(r10, r8)
            if (r22 == 0) goto L_0x00e8
            int r0 = r13.length()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            if (r9 == 0) goto L_0x00da
            java.lang.String r0 = "query_length"
            r7.put(r0, r9)
        L_0x00da:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r7)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00C.A08(r0)
            r8.A04 = r0
        L_0x00e8:
            X.0yW r0 = r10.A02
            r0.Bly(r8)
        L_0x00ed:
            r0 = 2
            r18 = 0
            if (r6 == r0) goto L_0x011e
            r0 = 5
            if (r6 != r0) goto L_0x005c
            java.lang.Integer r12 = X.C142626pB.A00(r5)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            r13 = 0
            r15 = r13
            r16 = r13
            r18 = 1
            r14 = r13
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x005c
        L_0x0109:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            goto L_0x00b3
        L_0x010e:
            r7 = 0
            if (r22 == 0) goto L_0x0119
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0119
            r7 = 10
        L_0x0119:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x00b3
        L_0x011e:
            if (r22 == 0) goto L_0x005c
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x005c
            r11 = 0
            r17 = 4
            r14 = r11
            r15 = r11
            r16 = r11
            r12 = r11
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x005c
        L_0x0133:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A01 = r0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28111Rj.A00(java.lang.Integer, java.lang.Integer, java.lang.String, int):void");
    }

    public C28111Rj(C20810yC r3, C21010yW r4, AnonymousClass005 r5) {
        this.A07 = r4;
        this.A04 = r3;
        this.A05 = r5;
    }
}
