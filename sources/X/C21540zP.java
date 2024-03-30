package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.0zP  reason: invalid class name and case insensitive filesystem */
public class C21540zP {
    public static final C21550zQ A06 = new C21550zQ(0, 0, false, false);
    public final C20810yC A00;
    public final C21470zI A01;
    public volatile Boolean A02;
    public volatile Boolean A03;
    public volatile Long A04;
    public volatile ConcurrentHashMap A05;

    public boolean A03() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    boolean z = false;
                    if (C20800yB.A01(C21000yV.A02, this.A00, 212)) {
                        z = true;
                    }
                    this.A02 = Boolean.valueOf(z);
                }
            }
        }
        return this.A02.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
        if (r9.hasNext() == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        r8 = (long[]) r9.next();
        r7 = (int) r8[0];
        r6 = (int) r8[1];
        r11 = java.lang.Math.max(r8[2], 0);
        r13 = r8[3];
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        if (3 != r6) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r6 = java.lang.Integer.valueOf(r7);
        r2 = (X.C21550zQ) r5.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        if (r2 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0149, code lost:
        r3 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        if (r3 == r15) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014d, code lost:
        r2 = r4.A01;
        r1 = new java.lang.StringBuilder();
        r1.append("Failed to overwrite sampling for eventId:");
        r1.append(r7);
        r1.append(" base config sampling type: ");
        r1.append(r3);
        r1.append(" overwrite sampling type: ");
        r1.append(r15);
        r2.B6n(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        r0 = r2.A01;
        r11 = java.lang.Math.min(r11, r0);
        r2 = r2.A00;
        r13 = r13 | r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017f, code lost:
        if (r11 != r0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0181, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (r13 == r2) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0188, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018a, code lost:
        r5.put(r6, new X.C21550zQ(r11, r13, r15, r16));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21550zQ A00(X.C21540zP r16, int r17) {
        /*
            r4 = r16
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            if (r0 != 0) goto L_0x01c3
            monitor-enter(r4)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x01be
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x01c0 }
            r5.<init>()     // Catch:{ all -> 0x01c0 }
            X.0yC r3 = r4.A00     // Catch:{ Exception -> 0x01af }
            r0 = 226(0xe2, float:3.17E-43)
            org.json.JSONObject r0 = r3.A0A(r0)     // Catch:{ Exception -> 0x01af }
            java.lang.String r6 = "sampling"
            org.json.JSONArray r1 = r0.getJSONArray(r6)     // Catch:{ Exception -> 0x01af }
            int r0 = r1.length()     // Catch:{ Exception -> 0x01af }
            if (r0 != 0) goto L_0x005e
            r0 = 1716(0x6b4, float:2.405E-42)
            org.json.JSONObject r2 = r3.A0A(r0)     // Catch:{ Exception -> 0x01af }
            r0 = 1717(0x6b5, float:2.406E-42)
            org.json.JSONObject r1 = r3.A0A(r0)     // Catch:{ Exception -> 0x01af }
            org.json.JSONArray r0 = r2.getJSONArray(r6)     // Catch:{ Exception -> 0x01af }
            A02(r5, r0)     // Catch:{ Exception -> 0x01af }
            org.json.JSONArray r0 = r1.getJSONArray(r6)     // Catch:{ Exception -> 0x01af }
            A02(r5, r0)     // Catch:{ Exception -> 0x01af }
        L_0x003e:
            r1 = 3035(0xbdb, float:4.253E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x01af }
            boolean r0 = X.C20800yB.A01(r0, r3, r1)     // Catch:{ Exception -> 0x01af }
            if (r0 == 0) goto L_0x01bc
            r0 = 1199(0x4af, float:1.68E-42)
            java.lang.String r7 = r3.A09(r0)     // Catch:{ Exception -> 0x01af }
            if (r7 == 0) goto L_0x01bc
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x01af }
            r11.<init>()     // Catch:{ Exception -> 0x01af }
            r0 = 4
            long[] r10 = new long[r0]     // Catch:{ Exception -> 0x01af }
            r9 = 0
            r3 = 0
            r8 = 0
            r15 = 0
            r14 = 0
            goto L_0x0062
        L_0x005e:
            A02(r5, r1)     // Catch:{ Exception -> 0x01af }
            goto L_0x003e
        L_0x0062:
            int r12 = r7.length()     // Catch:{ Exception -> 0x0193 }
            if (r3 >= r12) goto L_0x0115
            char r6 = r7.charAt(r3)     // Catch:{ Exception -> 0x0193 }
            r0 = 91
            r1 = 0
            if (r6 != r0) goto L_0x0076
            java.util.Arrays.fill(r10, r1)     // Catch:{ Exception -> 0x0193 }
            goto L_0x00b0
        L_0x0076:
            r0 = 93
            if (r6 != r0) goto L_0x0088
            r0 = 2
            if (r8 >= r0) goto L_0x007e
            goto L_0x00cd
        L_0x007e:
            java.lang.Object r0 = r10.clone()     // Catch:{ Exception -> 0x0193 }
            long[] r0 = (long[]) r0     // Catch:{ Exception -> 0x0193 }
            r11.add(r0)     // Catch:{ Exception -> 0x0193 }
            goto L_0x00c9
        L_0x0088:
            r0 = 44
            if (r6 != r0) goto L_0x008f
            int r8 = r8 + 1
            goto L_0x00ca
        L_0x008f:
            boolean r0 = java.lang.Character.isDigit(r6)     // Catch:{ Exception -> 0x0193 }
            if (r0 == 0) goto L_0x00b4
            r12 = r10[r8]     // Catch:{ Exception -> 0x0193 }
            r0 = 10
            long r12 = r12 * r0
            r10[r8] = r12     // Catch:{ Exception -> 0x0193 }
            r12 = r10[r8]     // Catch:{ Exception -> 0x0193 }
            int r0 = java.lang.Character.getNumericValue(r6)     // Catch:{ Exception -> 0x0193 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0193 }
            long r12 = r12 + r0
            r10[r8] = r12     // Catch:{ Exception -> 0x0193 }
            if (r14 == 0) goto L_0x00ca
            r12 = r10[r8]     // Catch:{ Exception -> 0x0193 }
            r0 = -1
            long r12 = r12 * r0
            r10[r8] = r12     // Catch:{ Exception -> 0x0193 }
            goto L_0x00b2
        L_0x00b0:
            r8 = 0
            r15 = 1
        L_0x00b2:
            r14 = 0
            goto L_0x00ca
        L_0x00b4:
            r0 = 45
            if (r6 != r0) goto L_0x00c0
            r12 = r10[r8]     // Catch:{ Exception -> 0x0193 }
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            r14 = 1
            goto L_0x00ca
        L_0x00c0:
            boolean r0 = java.lang.Character.isWhitespace(r6)     // Catch:{ Exception -> 0x0193 }
            if (r0 != 0) goto L_0x00ca
            if (r15 == 0) goto L_0x00ca
            goto L_0x00f5
        L_0x00c9:
            r15 = 0
        L_0x00ca:
            int r3 = r3 + 1
            goto L_0x0062
        L_0x00cd:
            int r0 = r3 + -20
            int r6 = java.lang.Math.max(r9, r0)     // Catch:{ Exception -> 0x0193 }
            int r0 = r3 + 20
            int r3 = java.lang.Math.min(r12, r0)     // Catch:{ Exception -> 0x0193 }
            X.0zI r2 = r4.A01     // Catch:{ Exception -> 0x0193 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193 }
            r1.<init>()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "Failed to parse config, not enough argumentscheck config around: "
            r1.append(r0)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = r7.substring(r6, r3)     // Catch:{ Exception -> 0x0193 }
            r1.append(r0)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0193 }
            r2.B6n(r0)     // Catch:{ Exception -> 0x0193 }
            goto L_0x01bc
        L_0x00f5:
            X.0zI r2 = r4.A01     // Catch:{ Exception -> 0x0193 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193 }
            r1.<init>()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "Failed to parse overwrite config, wrong symbol: '"
            r1.append(r0)     // Catch:{ Exception -> 0x0193 }
            r1.append(r6)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "' at position: "
            r1.append(r0)     // Catch:{ Exception -> 0x0193 }
            r1.append(r3)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0193 }
            r2.B6n(r0)     // Catch:{ Exception -> 0x0193 }
            goto L_0x01bc
        L_0x0115:
            java.util.Iterator r9 = r11.iterator()     // Catch:{ Exception -> 0x01af }
        L_0x0119:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x01af }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r8 = r9.next()     // Catch:{ Exception -> 0x01af }
            long[] r8 = (long[]) r8     // Catch:{ Exception -> 0x01af }
            r0 = 0
            r0 = r8[r0]     // Catch:{ Exception -> 0x01af }
            int r7 = (int) r0     // Catch:{ Exception -> 0x01af }
            r0 = 1
            r0 = r8[r0]     // Catch:{ Exception -> 0x01af }
            int r6 = (int) r0     // Catch:{ Exception -> 0x01af }
            r0 = 2
            r2 = r8[r0]     // Catch:{ Exception -> 0x01af }
            r0 = 0
            long r11 = java.lang.Math.max(r2, r0)     // Catch:{ Exception -> 0x01af }
            r0 = 3
            r13 = r8[r0]     // Catch:{ Exception -> 0x01af }
            r15 = 0
            if (r0 != r6) goto L_0x013d
            r15 = 1
        L_0x013d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01af }
            java.lang.Object r2 = r5.get(r6)     // Catch:{ Exception -> 0x01af }
            X.0zQ r2 = (X.C21550zQ) r2     // Catch:{ Exception -> 0x01af }
            if (r2 == 0) goto L_0x0188
            boolean r3 = r2.A03     // Catch:{ Exception -> 0x01af }
            if (r3 == r15) goto L_0x0174
            X.0zI r2 = r4.A01     // Catch:{ Exception -> 0x01af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01af }
            r1.<init>()     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = "Failed to overwrite sampling for eventId:"
            r1.append(r0)     // Catch:{ Exception -> 0x01af }
            r1.append(r7)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = " base config sampling type: "
            r1.append(r0)     // Catch:{ Exception -> 0x01af }
            r1.append(r3)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = " overwrite sampling type: "
            r1.append(r0)     // Catch:{ Exception -> 0x01af }
            r1.append(r15)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01af }
            r2.B6n(r0)     // Catch:{ Exception -> 0x01af }
            goto L_0x0119
        L_0x0174:
            long r0 = r2.A01     // Catch:{ Exception -> 0x01af }
            long r11 = java.lang.Math.min(r11, r0)     // Catch:{ Exception -> 0x01af }
            long r2 = r2.A00     // Catch:{ Exception -> 0x01af }
            long r13 = r13 | r2
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0188
            r16 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0119
            goto L_0x018a
        L_0x0188:
            r16 = 1
        L_0x018a:
            X.0zQ r10 = new X.0zQ     // Catch:{ Exception -> 0x01af }
            r10.<init>(r11, r13, r15, r16)     // Catch:{ Exception -> 0x01af }
            r5.put(r6, r10)     // Catch:{ Exception -> 0x01af }
            goto L_0x0119
        L_0x0193:
            r3 = move-exception
            X.0zI r2 = r4.A01     // Catch:{ Exception -> 0x01af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01af }
            r1.<init>()     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = "Failed to parse overwrite config exception: "
            r1.append(r0)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = r3.getMessage()     // Catch:{ Exception -> 0x01af }
            r1.append(r0)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01af }
            r2.B6n(r0)     // Catch:{ Exception -> 0x01af }
            goto L_0x01bc
        L_0x01af:
            r0 = move-exception
            X.0zI r1 = r4.A01     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01c0 }
            r1.B6n(r0)     // Catch:{ all -> 0x01c0 }
            r5.clear()     // Catch:{ all -> 0x01c0 }
        L_0x01bc:
            r4.A05 = r5     // Catch:{ all -> 0x01c0 }
        L_0x01be:
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            goto L_0x01c3
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            throw r0
        L_0x01c3:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r2)
            X.0zQ r1 = (X.C21550zQ) r1
            if (r1 != 0) goto L_0x01e8
            int r0 = r17 >> 16
            java.util.concurrent.ConcurrentHashMap r1 = r4.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            X.0zQ r1 = (X.C21550zQ) r1
            if (r1 != 0) goto L_0x01e3
            X.0zQ r1 = A06
        L_0x01e3:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            r0.put(r2, r1)
        L_0x01e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21540zP.A00(X.0zP, int):X.0zQ");
    }

    public static void A01(C21540zP r3) {
        if (r3.A03 == null || r3.A04 == null) {
            synchronized (r3) {
                if (r3.A03 == null || r3.A04 == null) {
                    C20810yC r2 = r3.A00;
                    C21000yV r1 = C21000yV.A02;
                    r3.A03 = Boolean.valueOf(C20800yB.A01(r1, r2, 397));
                    r3.A04 = Long.valueOf((long) C20800yB.A00(r1, r2, 398));
                }
            }
        }
    }

    public static void A02(ConcurrentHashMap concurrentHashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                int i3 = jSONArray2.getInt(1);
                long max = Math.max(jSONArray2.getLong(2), 0);
                long optLong = jSONArray2.optLong(3);
                boolean z = false;
                if (3 == i3) {
                    z = true;
                }
                concurrentHashMap.put(Integer.valueOf(i2), new C21550zQ(max, optLong, z, false));
            }
        }
    }

    public C21540zP(C20810yC r1, C21470zI r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
