package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.9e5  reason: invalid class name and case insensitive filesystem */
public final class C198719e5 {
    public static final C198719e5 A02 = new C198719e5();
    public final C22804AwF A00;
    public final ConcurrentMap A01 = C90524aI.A0s();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.A3e} */
    /* JADX WARNING: type inference failed for: r2v10, types: [X.A3d] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014f, code lost:
        if (r1 == null) goto L_0x0155;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0213 A[EDGE_INSN: B:117:0x0213->B:111:0x0213 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.B3S A00(java.lang.Class r41) {
        /*
            r40 = this;
            java.lang.String r23 = "messageType"
            java.nio.charset.Charset r0 = X.C197079b6.A04
            r7 = r41
            r0 = r23
            java.util.Objects.requireNonNull(r7, r0)
            r0 = r40
            java.util.concurrent.ConcurrentMap r15 = r0.A01
            java.lang.Object r2 = r15.get(r7)
            X.B3S r2 = (X.B3S) r2
            if (r2 != 0) goto L_0x0242
            X.AwF r1 = r0.A00
            X.A3f r1 = (X.C21016A3f) r1
            java.lang.Class r0 = X.C203819ov.A03
            java.lang.Class<X.8DG> r2 = X.AnonymousClass8DG.class
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0036
            java.lang.Class r0 = X.C203819ov.A03
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0036:
            X.B0i r0 = r1.A00
            X.AwD r3 = r0.ByS(r7)
            r10 = r3
            X.A3W r10 = (X.A3W) r10
            X.9eo r6 = r10.A01
            int r4 = r6.A0I
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x0079
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 == 0) goto L_0x006c
            X.95P r3 = X.C203819ov.A02
            X.95O r1 = X.AnonymousClass9AQ.A00
        L_0x0052:
            X.B5x r0 = r10.A00
            X.A3d r2 = new X.A3d
            r2.<init>(r1, r0, r3)
        L_0x0059:
            r0 = r23
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "schema"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Object r0 = r15.putIfAbsent(r7, r2)
            X.B3S r0 = (X.B3S) r0
            if (r0 == 0) goto L_0x0242
            return r0
        L_0x006c:
            X.95P r3 = X.C203819ov.A00
            X.95O r1 = X.AnonymousClass9AQ.A01
            if (r1 != 0) goto L_0x0052
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0079:
            boolean r2 = r2.isAssignableFrom(r7)
            r1 = 1
            r5 = r4 & 1
            boolean r0 = X.AnonymousClass000.A1S(r5, r1)
            if (r2 == 0) goto L_0x01fb
            X.AwE r29 = X.AnonymousClass9AT.A01
            X.9ex r26 = X.C199239ex.A01
            X.95P r30 = X.C203819ov.A02
            if (r0 == 0) goto L_0x01f5
            X.95O r25 = X.AnonymousClass9AQ.A00
            X.AwC r27 = X.AnonymousClass9AS.A01
        L_0x0092:
            sun.misc.Unsafe r0 = X.C21015A3e.A0F
            boolean r0 = r3 instanceof X.A3W
            if (r0 == 0) goto L_0x0234
            if (r5 == r1) goto L_0x009b
            r1 = 2
        L_0x009b:
            r0 = 2
            r4 = 1
            boolean r39 = X.AnonymousClass000.A1S(r1, r0)
            int r0 = r6.A0M
            if (r0 != 0) goto L_0x01eb
            r0 = 0
            r14 = 0
            r16 = 0
        L_0x00a9:
            int r1 = r0 << 2
            int[] r3 = new int[r1]
            int r0 = r0 << 1
            java.lang.Object[] r13 = new java.lang.Object[r0]
            int r0 = r6.A0O
            r12 = 0
            if (r0 <= 0) goto L_0x01e7
            int[] r0 = new int[r0]
            r22 = r0
        L_0x00ba:
            int r0 = r6.A0Q
            if (r0 <= 0) goto L_0x00c0
            int[] r12 = new int[r0]
        L_0x00c0:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0213
            int r8 = r6.A01
            r2 = 0
            r21 = 0
            r20 = 0
        L_0x00cd:
            int r0 = r6.A0L
            if (r8 >= r0) goto L_0x00e3
            int r0 = r8 - r14
            int r0 = r0 << 2
            if (r2 >= r0) goto L_0x00e3
            r1 = 0
        L_0x00d8:
            int r9 = r2 + r1
            r0 = -1
            r3[r9] = r0
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0169
            goto L_0x00d8
        L_0x00e3:
            int r1 = r6.A03
            X.8yG r19 = X.C187648yG.A09
            r0 = r19
            int r0 = r0.id
            if (r1 <= r0) goto L_0x01a6
            int r0 = r6.A04
            int r8 = r0 << 1
            java.lang.Object[] r9 = r6.A0S
            r0 = r9[r8]
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x019a
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L_0x00fb:
            X.9Yh r8 = X.C203609oO.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            int r0 = r6.A04
            int r0 = r0 << 1
            int r17 = r0 + 1
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x018e
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0110:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            r9 = 0
        L_0x0116:
            int r0 = r6.A01
            r3[r2] = r0
            int r18 = r2 + 1
            int r1 = r6.A02
            r0 = r1 & 512(0x200, float:7.175E-43)
            r17 = 0
            if (r0 == 0) goto L_0x0126
            r17 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0126:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x012d
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012d:
            r17 = r17 | r1
            int r0 = r6.A03
            int r1 = r0 << 20
            r17 = r17 | r1
            r17 = r17 | r11
            r3[r18] = r17
            int r11 = r2 + 2
            int r1 = r9 << 20
            r1 = r1 | r8
            r3[r11] = r1
            java.lang.Object r1 = r6.A09
            if (r1 == 0) goto L_0x0182
            int r8 = r2 / 4
            int r8 = r8 << r4
            r13[r8] = r1
            java.lang.Object r1 = r6.A07
            if (r1 != 0) goto L_0x0151
            java.lang.Object r1 = r6.A08
            if (r1 == 0) goto L_0x0155
        L_0x0151:
            int r8 = r8 + 1
            r13[r8] = r1
        L_0x0155:
            int r1 = r19.ordinal()
            if (r0 != r1) goto L_0x016d
            int r0 = r21 + 1
            r22[r21] = r2
            r21 = r0
        L_0x0161:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0213
            int r8 = r6.A01
        L_0x0169:
            int r2 = r2 + 4
            goto L_0x00cd
        L_0x016d:
            r1 = 18
            if (r0 < r1) goto L_0x0161
            r1 = 49
            if (r0 > r1) goto L_0x0161
            int r8 = r20 + 1
            r1 = r3[r18]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            r12[r20] = r1
            r20 = r8
            goto L_0x0161
        L_0x0182:
            java.lang.Object r1 = r6.A07
            if (r1 != 0) goto L_0x018a
            java.lang.Object r1 = r6.A08
            if (r1 == 0) goto L_0x0155
        L_0x018a:
            int r8 = r2 / 4
            int r8 = r8 << r4
            goto L_0x0151
        L_0x018e:
            java.lang.Class r0 = r6.A06
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C199169eo.A00(r0, r1)
            r9[r17] = r1
            goto L_0x0110
        L_0x019a:
            java.lang.Class r1 = r6.A06
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = X.C199169eo.A00(r1, r0)
            r9[r8] = r0
            goto L_0x00fb
        L_0x01a6:
            java.lang.reflect.Field r0 = r6.A0A
            X.9Yh r8 = X.C203609oO.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            if (r5 != r4) goto L_0x01e3
            int r1 = r6.A03
            X.8yG r0 = X.C187648yG.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x01e3
            int r0 = r6.A0N
            int r17 = r0 << 1
            int r0 = r6.A05
            int r0 = r0 / 32
            int r17 = r17 + r0
            java.lang.Object[] r9 = r6.A0S
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01d8
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01cd:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            int r0 = r6.A05
            int r9 = r0 % 32
            goto L_0x0116
        L_0x01d8:
            java.lang.Class r0 = r6.A06
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C199169eo.A00(r0, r1)
            r9[r17] = r1
            goto L_0x01cd
        L_0x01e3:
            r9 = 0
            r8 = 0
            goto L_0x0116
        L_0x01e7:
            r22 = r12
            goto L_0x00ba
        L_0x01eb:
            int r14 = r6.A0J
            int r0 = r6.A0K
            r16 = r0
            int r0 = r6.A0P
            goto L_0x00a9
        L_0x01f5:
            r25 = 0
            X.AwC r27 = X.AnonymousClass9AS.A01
            goto L_0x0092
        L_0x01fb:
            X.AwE r29 = X.AnonymousClass9AT.A00
            X.9ex r26 = X.C199239ex.A00
            if (r0 == 0) goto L_0x020b
            X.95P r30 = X.C203819ov.A00
            X.95O r25 = X.AnonymousClass9AQ.A01
            if (r25 == 0) goto L_0x023b
            X.AwC r27 = X.AnonymousClass9AS.A00
            goto L_0x0092
        L_0x020b:
            X.95P r30 = X.C203819ov.A01
            r25 = 0
            X.AwC r27 = X.AnonymousClass9AS.A00
            goto L_0x0092
        L_0x0213:
            int r1 = r6.A0L
            X.B5x r0 = r10.A00
            int[] r4 = r6.A0R
            X.A3e r2 = new X.A3e
            r24 = r2
            r28 = r0
            r31 = r3
            r32 = r4
            r33 = r22
            r34 = r12
            r35 = r13
            r36 = r14
            r37 = r16
            r38 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x0059
        L_0x0234:
            java.lang.String r0 = "zzcf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x023b:
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0242:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198719e5.A00(java.lang.Class):X.B3S");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C198719e5() {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = X.C90524aI.A0s()
            r3.A01 = r0
            java.lang.String r0 = "com.google.protobuf.AndroidProto3SchemaFactory"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2 = 0
            r0 = r0[r2]
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0026 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0026 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0026 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0026 }
            X.AwF r0 = (X.C22804AwF) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x002b
        L_0x0026:
            X.A3f r0 = new X.A3f
            r0.<init>()
        L_0x002b:
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198719e5.<init>():void");
    }
}
