package X;

/* renamed from: X.4pw  reason: invalid class name and case insensitive filesystem */
public class C97584pw extends AnonymousClass65V {
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a9, code lost:
        if (r5.equals("reverse") == false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cd, code lost:
        if (r2.equals("radial") == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f1, code lost:
        if (r0 == false) goto L_0x0287;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A00(X.C1271967i r17, X.C140456lc r18, X.C140456lc r19) {
        /*
            r16 = this;
            r1 = r18
            int r3 = r1.A04
            r0 = 13761(0x35c1, float:1.9283E-41)
            r2 = r17
            if (r3 == r0) goto L_0x01ac
            r0 = 15775(0x3d9f, float:2.2105E-41)
            if (r3 == r0) goto L_0x0112
            r0 = 16526(0x408e, float:2.3158E-41)
            if (r3 == r0) goto L_0x001b
            r0 = r16
            r3 = r19
            android.graphics.drawable.Drawable r9 = super.A00(r2, r1, r3)
            return r9
        L_0x001b:
            java.lang.String r5 = "CDSShadowDrawableV2Utils"
            r8 = 0
            X.AnonymousClass00C.A0D(r2, r8)
            android.content.Context r7 = r2.A00
            X.AnonymousClass00C.A08(r7)
            r0 = 43
            java.lang.String r11 = "rectangle"
            java.lang.String r10 = X.C140456lc.A0P(r1, r11, r0)
            java.lang.Integer[] r9 = X.C112615eB.A00
            int r6 = r9.length
            r4 = 0
        L_0x0032:
            if (r4 >= r6) goto L_0x004b
            r3 = r9[r4]
            int r0 = r3.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0048
            r0 = r11
        L_0x003f:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x005a
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0048:
            java.lang.String r0 = "circle"
            goto L_0x003f
        L_0x004b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error finding Shape enum value for: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r3)
            X.AnonymousClass6RS.A01(r5, r0)
            java.lang.Integer r3 = X.C023109s.A00
        L_0x005a:
            java.lang.String r10 = X.C140456lc.A0O(r1)
            r6 = 1098907648(0x41800000, float:16.0)
            r15 = 0
            float r0 = X.C109525Xx.A00(r7, r6)     // Catch:{ 5R5 -> 0x0070 }
            if (r10 == 0) goto L_0x006b
            float r0 = X.AnonymousClass6Y7.A01(r10)     // Catch:{ 5R5 -> 0x0070 }
        L_0x006b:
            float r11 = java.lang.Math.max(r15, r0)     // Catch:{ 5R5 -> 0x0070 }
            goto L_0x0082
        L_0x0070:
            r9 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing shadow radius: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r4)
            X.AnonymousClass6RS.A00(r2, r5, r0, r9)
            float r11 = X.C109525Xx.A00(r7, r6)
        L_0x0082:
            r0 = 36
            int r14 = X.C140456lc.A02(r2, r1, r0)
            r0 = 41
            X.6lc r0 = r1.A0W(r0)
            if (r0 == 0) goto L_0x009e
            int r12 = X.AnonymousClass5Z8.A01(r2, r0, r8)
        L_0x0094:
            java.lang.Integer r0 = X.C023109s.A01
            if (r0 != r3) goto L_0x00a2
            X.4bU r9 = new X.4bU
            r9.<init>(r12, r14, r11)
            return r9
        L_0x009e:
            r12 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x0094
        L_0x00a2:
            java.lang.String r9 = X.C140456lc.A0J(r1)
            r8 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C109525Xx.A00(r7, r8)     // Catch:{ 5R5 -> 0x00b7 }
            if (r9 == 0) goto L_0x00b2
            float r0 = X.AnonymousClass6Y7.A01(r9)     // Catch:{ 5R5 -> 0x00b7 }
        L_0x00b2:
            float r10 = java.lang.Math.max(r15, r0)     // Catch:{ 5R5 -> 0x00b7 }
            goto L_0x00c9
        L_0x00b7:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing corner radius: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r9, r3)
            X.AnonymousClass6RS.A00(r2, r5, r0, r4)
            float r10 = X.C109525Xx.A00(r7, r8)
        L_0x00c9:
            java.lang.String r8 = X.C140456lc.A0L(r1)
            float r0 = X.C109525Xx.A00(r7, r6)     // Catch:{ 5R5 -> 0x00dc }
            if (r8 == 0) goto L_0x00d7
            float r0 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x00dc }
        L_0x00d7:
            float r13 = java.lang.Math.max(r15, r0)     // Catch:{ 5R5 -> 0x00dc }
            goto L_0x00eb
        L_0x00dc:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing horizontal offset: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r8, r3)
            X.AnonymousClass6RS.A00(r2, r5, r0, r4)
            r13 = 0
        L_0x00eb:
            java.lang.String r4 = X.C140456lc.A0M(r1)
            float r0 = X.C109525Xx.A00(r7, r6)     // Catch:{ 5R5 -> 0x00fe }
            if (r4 == 0) goto L_0x00f9
            float r0 = X.AnonymousClass6Y7.A01(r4)     // Catch:{ 5R5 -> 0x00fe }
        L_0x00f9:
            float r15 = java.lang.Math.max(r15, r0)     // Catch:{ 5R5 -> 0x00fe }
            goto L_0x010c
        L_0x00fe:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing vertical offset: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            X.AnonymousClass6RS.A00(r2, r5, r0, r3)
        L_0x010c:
            X.4bZ r9 = new X.4bZ
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0112:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r3 = 38
            java.lang.String r0 = "primary"
            java.lang.String r3 = X.C140456lc.A0P(r1, r0, r3)
            java.lang.String r0 = "circular"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x012e
            android.content.Context r0 = r2.A00
            X.4bg r9 = new X.4bg
            r9.<init>(r0, r2)
            return r9
        L_0x012e:
            java.lang.String r0 = "elevated"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0194
            java.lang.Integer r6 = X.C023109s.A0C
        L_0x0138:
            r0 = 36
            int r7 = X.C140456lc.A02(r2, r1, r0)
            r0 = 35
            java.util.List r0 = r1.A0d(r0)
            java.util.Iterator r3 = X.C90514aH.A14(r0)
            r8 = 0
        L_0x0149:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a2
            java.lang.String r1 = X.AnonymousClass001.A0C(r3)
            if (r1 == 0) goto L_0x0149
            int r0 = r1.hashCode()
            switch(r0) {
                case -1383228885: goto L_0x015d;
                case 96673: goto L_0x0168;
                case 115029: goto L_0x0173;
                case 3317767: goto L_0x017e;
                case 108511772: goto L_0x0189;
                default: goto L_0x015c;
            }
        L_0x015c:
            goto L_0x0149
        L_0x015d:
            java.lang.String r0 = "bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 8
            goto L_0x0149
        L_0x0168:
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 15
            goto L_0x0149
        L_0x0173:
            java.lang.String r0 = "top"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 1
            goto L_0x0149
        L_0x017e:
            java.lang.String r0 = "left"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 2
            goto L_0x0149
        L_0x0189:
            java.lang.String r0 = "right"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 4
            goto L_0x0149
        L_0x0194:
            java.lang.String r0 = "persistent"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x019f
            java.lang.Integer r6 = X.C023109s.A0G
            goto L_0x0138
        L_0x019f:
            java.lang.Integer r6 = X.C023109s.A00
            goto L_0x0138
        L_0x01a2:
            android.content.Context r4 = r2.A00
            X.4bm r9 = new X.4bm
            r3 = r9
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r9
        L_0x01ac:
            X.4bj r9 = new X.4bj
            r9.<init>()
            r0 = 41
            r8 = 0
            boolean r0 = r1.A0f(r0, r8)
            if (r0 == 0) goto L_0x0300
            X.4rN r4 = new X.4rN
            r4.<init>()
        L_0x01bf:
            boolean r0 = r4 instanceof X.C98404rN
            if (r0 == 0) goto L_0x01f0
            r0 = 38
            X.6lc r5 = r1.A0W(r0)
            r0 = 50
            X.6lc r7 = r1.A0W(r0)
            if (r5 == 0) goto L_0x01d3
            if (r7 != 0) goto L_0x01da
        L_0x01d3:
            java.lang.String r3 = "ShimmerDrawableUtils"
            java.lang.String r0 = "Base Color or highlight color were null for a Color highlight Shimmer Drawable"
            X.AnonymousClass6RS.A01(r3, r0)
        L_0x01da:
            if (r5 != 0) goto L_0x02fa
            r6 = 0
        L_0x01dd:
            X.5zE r5 = r4.A00
            int r3 = r5.A05
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r0
            r6 = r6 | r3
            r5.A05 = r6
            if (r7 != 0) goto L_0x02f4
            r0 = 0
        L_0x01ee:
            r5.A09 = r0
        L_0x01f0:
            r2 = 40
            r0 = 1
            boolean r0 = r1.A0f(r2, r0)
            X.5zE r3 = r4.A00
            r3.A0H = r0
            r2 = 36
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r1.A0S(r2, r0)
            r4.A02(r0)
            r0 = 49
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1.A0S(r0, r7)
            r4.A04(r0)
            r2 = 44
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r1.A0T(r2, r0)
            long r5 = (long) r0
            r4.A06(r5)
            r2 = 52
            r0 = -1
            int r0 = r1.A0T(r2, r0)
            r3.A0A = r0
            r0 = 53
            int r0 = r1.A0T(r0, r8)
            long r5 = (long) r0
            r4.A07(r5)
            r2 = 43
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A0S(r2, r0)
            r4.A03(r0)
            r0 = 46
            int r2 = r1.A0T(r0, r8)
            if (r2 < 0) goto L_0x0334
            r3.A08 = r2
            r0 = 45
            int r2 = r1.A0T(r0, r8)
            if (r2 < 0) goto L_0x0329
            r3.A07 = r2
            r0 = 51
            r5 = 0
            float r0 = r1.A0S(r0, r5)
            r4.A05(r0)
            r0 = 57
            float r2 = r1.A0S(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0318
            r3.A04 = r2
            r0 = 48
            float r2 = r1.A0S(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0307
            r3.A01 = r2
            r0 = 56
            float r0 = r1.A0S(r0, r5)
            r3.A03 = r0
            java.lang.String r2 = X.C140456lc.A0O(r1)
            if (r2 == 0) goto L_0x0287
            int r0 = r2.hashCode()
            switch(r0) {
                case -1118360059: goto L_0x02e2;
                case -1085344219: goto L_0x02ea;
                case -87315416: goto L_0x02da;
                default: goto L_0x0287;
            }
        L_0x0287:
            r2 = 0
        L_0x0288:
            r3.A06 = r2
            r0 = 54
            java.lang.Object r5 = X.C140456lc.A0I(r1, r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x02ab
            int r2 = r5.hashCode()
            r0 = 1097506319(0x416a9e0f, float:14.663589)
            if (r2 == r0) goto L_0x02ab
            r0 = 1099846370(0x418e52e2, float:17.79047)
            if (r2 != r0) goto L_0x02ab
            java.lang.String r0 = "reverse"
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L_0x02ac
        L_0x02ab:
            r2 = 1
        L_0x02ac:
            r3.A0B = r2
            r0 = 55
            java.lang.Object r2 = X.C140456lc.A0I(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02cf
            int r1 = r2.hashCode()
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r1 == r0) goto L_0x02cf
            r0 = -938579425(0xffffffffc80e6a1f, float:-145832.48)
            if (r1 != r0) goto L_0x02cf
            java.lang.String r0 = "radial"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x02d0
        L_0x02cf:
            r1 = 0
        L_0x02d0:
            r3.A0C = r1
            X.5zE r0 = r4.A01()
            r9.A02(r0)
            return r9
        L_0x02da:
            java.lang.String r0 = "right_to_left"
            boolean r0 = r2.equals(r0)
            r2 = 2
            goto L_0x02f1
        L_0x02e2:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)
            r2 = 1
            goto L_0x02f1
        L_0x02ea:
            java.lang.String r0 = "bottom_to_top"
            boolean r0 = r2.equals(r0)
            r2 = 3
        L_0x02f1:
            if (r0 != 0) goto L_0x0288
            goto L_0x0287
        L_0x02f4:
            int r0 = X.AnonymousClass5Z8.A01(r2, r7, r8)
            goto L_0x01ee
        L_0x02fa:
            int r6 = X.AnonymousClass5Z8.A01(r2, r5, r8)
            goto L_0x01dd
        L_0x0300:
            X.4rM r4 = new X.4rM
            r4.<init>()
            goto L_0x01bf
        L_0x0307:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Given invalid height ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r1)
            throw r0
        L_0x0318:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Given invalid width ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r1)
            throw r0
        L_0x0329:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Given invalid height: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0334:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Given invalid width: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97584pw.A00(X.67i, X.6lc, X.6lc):android.graphics.drawable.Drawable");
    }
}
