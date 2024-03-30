package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1JN  reason: invalid class name */
public final class AnonymousClass1JN {
    public final C21010yW A00;
    public final AnonymousClass1JE A01;
    public final C25791Hr A02;
    public final C20810yC A03;

    public AnonymousClass1JN(C25791Hr r2, C20810yC r3, C21010yW r4, AnonymousClass1JE r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r2, 4);
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static final void A00(AnonymousClass1JN r8, AnonymousClass3T1 r9, int i, int i2) {
        AnonymousClass3T1 r4 = r9;
        if (C54782tX.A00(r9)) {
            C25791Hr r2 = r8.A02;
            List singletonList = Collections.singletonList(r9);
            AnonymousClass00C.A08(singletonList);
            r2.A04(singletonList, 5);
            A01(r8, r4, Integer.valueOf(i2), (Long) null, i, 1, 2);
        }
    }

    public final void A02(AnonymousClass3T1 r8) {
        AnonymousClass3T1 r1 = r8;
        AnonymousClass00C.A0D(r8, 0);
        if (C54782tX.A00(r8)) {
            A01(this, r1, (Integer) null, (Long) null, 1, 1, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e0, code lost:
        if (r2.A05 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a7 A[Catch:{ 172 -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f6 A[SYNTHETIC, Splitter:B:75:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass1JN r11, X.AnonymousClass3T1 r12, java.lang.Integer r13, java.lang.Long r14, int r15, int r16, int r17) {
        /*
            int r1 = r12.A1I
            r0 = 55
            if (r1 == r0) goto L_0x00ed
            r0 = 57
            if (r1 == r0) goto L_0x00eb
            r0 = 85
            if (r1 == r0) goto L_0x00e9
            r0 = 62
            if (r1 == r0) goto L_0x00e7
            r0 = 63
            if (r1 == r0) goto L_0x00ef
            switch(r1) {
                case 25: goto L_0x00eb;
                case 26: goto L_0x00ef;
                case 27: goto L_0x00ed;
                case 28: goto L_0x00e7;
                case 29: goto L_0x00e5;
                case 30: goto L_0x00e9;
                default: goto L_0x0019;
            }
        L_0x0019:
            r3 = 0
        L_0x001a:
            boolean r1 = X.C203369nr.A09(r12)
            boolean r0 = X.C203369nr.A08(r12)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x00cb
            r10 = 0
        L_0x0026:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            boolean r5 = r12 instanceof X.C23043B1o
            if (r5 == 0) goto L_0x00b6
            r0 = r12
            X.B1o r0 = (X.C23043B1o) r0
            if (r0 == 0) goto L_0x00b6
            X.9uk r0 = r0.BA8()
            if (r0 == 0) goto L_0x00b6
            X.9uX r0 = r0.A04
            if (r0 == 0) goto L_0x00b6
            java.util.List r0 = r0.A03
        L_0x0040:
            int r1 = r0.size()
            java.lang.String r0 = "num_buttons"
            r4.put(r0, r1)
        L_0x0049:
            if (r13 == 0) goto L_0x0054
            int r1 = r13.intValue()
            java.lang.String r0 = "button_index"
            r4.put(r0, r1)
        L_0x0054:
            if (r14 == 0) goto L_0x005f
            long r0 = r14.longValue()
            java.lang.String r2 = "duration_ms"
            r4.put(r2, r0)
        L_0x005f:
            java.lang.Integer r0 = X.C203369nr.A03(r12)
            if (r0 == 0) goto L_0x006e
            int r1 = r0.intValue()
            java.lang.String r0 = "card_index"
            r4.put(r0, r1)
        L_0x006e:
            if (r5 == 0) goto L_0x0132
            r5 = r12
            X.B1o r5 = (X.C23043B1o) r5
            X.9uk r1 = r5.BA8()
            if (r1 == 0) goto L_0x0132
            boolean r0 = r1.A05()
            r2 = 1
            if (r0 == 0) goto L_0x0132
            X.9uX r0 = r1.A04
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.A00()
            if (r0 != r2) goto L_0x0132
            java.lang.String r1 = "feature_type"
            java.lang.String r0 = "offer"
            r4.put(r1, r0)
            X.9uk r1 = r5.BA8()
            if (r1 == 0) goto L_0x0132
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0132
            X.9uX r0 = r1.A04
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.A00()
            if (r0 != r2) goto L_0x0132
            X.9uk r0 = r5.BA8()
            X.9uX r5 = r0.A04
            java.lang.String r6 = "expiration_time"
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x0132
            goto L_0x00f6
        L_0x00b6:
            boolean r0 = r12 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0049
            r0 = r12
            X.4Uh r0 = (X.C88854Uh) r0
            if (r0 == 0) goto L_0x0049
            X.3F4 r0 = r0.BIE()
            if (r0 == 0) goto L_0x0049
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0049
            goto L_0x0040
        L_0x00cb:
            boolean r0 = r12 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x00e2
            r0 = r12
            X.B1o r0 = (X.C23043B1o) r0
            X.9uk r2 = r0.BA8()
            if (r2 == 0) goto L_0x00e2
            int r1 = r2.A00
            r0 = 6
            if (r1 != r0) goto L_0x00e2
            X.9u1 r0 = r2.A05
            r10 = 1
            if (r0 != 0) goto L_0x0026
        L_0x00e2:
            r10 = 2
            goto L_0x0026
        L_0x00e5:
            r0 = 5
            goto L_0x00f0
        L_0x00e7:
            r0 = 2
            goto L_0x00f0
        L_0x00e9:
            r0 = 3
            goto L_0x00f0
        L_0x00eb:
            r0 = 1
            goto L_0x00f0
        L_0x00ed:
            r0 = 0
            goto L_0x00f0
        L_0x00ef:
            r0 = 4
        L_0x00f0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x001a
        L_0x00f6:
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x0117 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0117 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0117 }
            java.lang.String r0 = "limited_time_offer"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0117 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ JSONException -> 0x0117 }
            boolean r0 = r1.has(r6)     // Catch:{ JSONException -> 0x0117 }
            if (r0 == 0) goto L_0x0132
            long r0 = r1.getLong(r6)     // Catch:{ JSONException -> 0x0117 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0117 }
            if (r2 == 0) goto L_0x0132
            goto L_0x012f
        L_0x0117:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "InteractiveMessageContent/getLTOExpirationTime/invalid json="
            r1.append(r0)
            java.lang.String r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x0132
        L_0x012f:
            r4.put(r6, r0)
        L_0x0132:
            X.3T1 r1 = X.C203369nr.A01(r12)
            boolean r0 = r1 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x0153
            X.B1o r1 = (X.C23043B1o) r1
            if (r1 == 0) goto L_0x0153
            X.9uk r0 = r1.BA8()
            if (r0 == 0) goto L_0x0153
            X.9tU r0 = r0.A02
            if (r0 == 0) goto L_0x0153
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.lang.String r0 = "num_cards"
            r4.put(r0, r1)
        L_0x0153:
            java.lang.String r7 = r4.toString()
            X.AnonymousClass00C.A08(r7)
            java.lang.String r6 = X.C203369nr.A05(r12)
            X.0yC r9 = r11.A03
            r1 = 6748(0x1a5c, float:9.456E-42)
            X.0yV r8 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r8, r9, r1)
            r5 = 0
            if (r0 == 0) goto L_0x0179
            X.3T1 r0 = X.C203369nr.A01(r12)
            X.3ur r0 = r0.A0b
            if (r0 == 0) goto L_0x0179
            int r0 = r0.hostStorage
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0179:
            boolean r0 = X.C20800yB.A01(r8, r9, r1)
            if (r0 == 0) goto L_0x01a7
            X.3T1 r0 = X.C203369nr.A01(r12)
            X.11F r0 = r0.A0J()
            java.lang.String r4 = "ZZ"
            if (r0 == 0) goto L_0x01c0
            X.9oI r2 = X.C203559oI.A00()
            java.lang.String r1 = X.AnonymousClass3U8.A07(r0)     // Catch:{ 172 -> 0x01a9 }
            r0 = 0
            X.AUN r2 = r2.A0F(r1, r0)     // Catch:{ 172 -> 0x01a9 }
            int r0 = r2.countryCode_     // Catch:{ 172 -> 0x01a9 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ 172 -> 0x01a9 }
            java.lang.String r0 = X.C203559oI.A02(r2)     // Catch:{ 172 -> 0x01a9 }
            java.lang.String r4 = X.AnonymousClass1M4.A01(r1, r0)     // Catch:{ 172 -> 0x01a9 }
            goto L_0x01c0
        L_0x01a7:
            r4 = 0
            goto L_0x01c0
        L_0x01a9:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "InteractiveMessageUtil/retrieveSenderCountryFromPhoneNumber: Couldn't parse the contact number: "
            r1.append(r0)
            java.lang.String r0 = r2.message
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01c0:
            r0 = 6816(0x1aa0, float:9.551E-42)
            boolean r0 = X.C20800yB.A01(r8, r9, r0)
            if (r0 == 0) goto L_0x0222
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.3T1 r0 = X.C203369nr.A01(r12)
            long r0 = r0.A0G
            long r0 = r2.toSeconds(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x01d8:
            r0 = 6837(0x1ab5, float:9.58E-42)
            boolean r0 = X.C20800yB.A01(r8, r9, r0)
            if (r0 == 0) goto L_0x0220
            X.3T1 r0 = X.C203369nr.A01(r12)
            X.3Qa r0 = r0.A1J
            int r0 = r0.hashCode()
            long r0 = (long) r0
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x01ef:
            X.2ST r1 = new X.2ST
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1.A02 = r0
            r1.A03 = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A05 = r0
            r1.A08 = r7
            r1.A0A = r6
            r1.A04 = r5
            r1.A09 = r4
            r1.A07 = r2
            r1.A06 = r8
            X.0yW r0 = r11.A00
            r0.Bly(r1)
            return
        L_0x0220:
            r8 = 0
            goto L_0x01ef
        L_0x0222:
            r2 = 0
            goto L_0x01d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JN.A01(X.1JN, X.3T1, java.lang.Integer, java.lang.Long, int, int, int):void");
    }

    public final void A03(Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r3 = (AnonymousClass3T1) it.next();
                if (C54782tX.A00(r3)) {
                    A01(this, r3, (Integer) null, (Long) null, 0, 2, 0);
                }
            }
        }
    }
}
