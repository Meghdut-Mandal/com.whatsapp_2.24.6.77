package X;

import android.os.Parcel;

/* renamed from: X.16T  reason: invalid class name */
public class AnonymousClass16T {
    public static final AnonymousClass16U[] A01 = {AnonymousClass16W.A06, AnonymousClass16W.A05, AnonymousClass16W.A04};
    public final AnonymousClass16Y A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:27|28|29|30|31|32|33|36|37|58|38|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass16U A01(java.lang.String r20) {
        /*
            r19 = this;
            r2 = r20
            if (r20 == 0) goto L_0x0115
            X.16U[] r5 = A01
            r4 = 3
            r3 = 0
        L_0x0008:
            r1 = r5[r3]
            r0 = r1
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r0 = r0.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0008
            r0 = r19
            X.16Y r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.A01     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0106
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            r1.A00 = r0     // Catch:{ all -> 0x0112 }
            X.0wG r0 = r1.A02     // Catch:{ all -> 0x0112 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "currency_metadata.json"
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00d9 }
            r6.<init>()     // Catch:{ Exception -> 0x00d9 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00d9 }
            java.io.InputStream r5 = r0.open(r3)     // Catch:{ Exception -> 0x00d9 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00d9 }
        L_0x0041:
            int r3 = r5.read(r4)     // Catch:{ Exception -> 0x00d9 }
            r0 = -1
            if (r3 == r0) goto L_0x004d
            r0 = 0
            r6.write(r4, r0, r3)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x0041
        L_0x004d:
            r6.close()     // Catch:{ Exception -> 0x00d9 }
            r5.close()     // Catch:{ Exception -> 0x00d9 }
            byte[] r3 = r6.toByteArray()     // Catch:{ Exception -> 0x00d9 }
            if (r3 == 0) goto L_0x0103
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0112 }
            r0.<init>(r3)     // Catch:{ all -> 0x0112 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d7 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "fiat_currencies"
            org.json.JSONArray r4 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r7 = "@"
            r3 = 0
        L_0x006c:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x00d7 }
            if (r3 >= r0) goto L_0x0103
            org.json.JSONObject r5 = r4.getJSONObject(r3)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "code"
            java.lang.String r9 = r5.getString(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "icon"
            java.lang.String r11 = r5.getString(r0)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r0 = "requestIcon"
            java.lang.String r12 = r5.getString(r0)     // Catch:{ JSONException -> 0x008a }
            goto L_0x00a4
        L_0x0089:
            r11 = r7
        L_0x008a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d7 }
            r6.<init>()     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/loadFiatCurrencies: No IconText for "
            r6.append(r0)     // Catch:{ JSONException -> 0x00d7 }
            r6.append(r9)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = " and using default icon"
            r6.append(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x00d7 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x00d7 }
            r12 = r7
        L_0x00a4:
            java.math.BigDecimal r0 = X.AnonymousClass16W.A07     // Catch:{ JSONException -> 0x00d7 }
            r15 = 0
            java.lang.String r0 = "symbol"
            java.lang.String r10 = r5.getString(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "offset"
            int r16 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "displayExponent"
            int r17 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = "weight"
            int r18 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00d7 }
            r5 = 10000000(0x989680, double:4.9406565E-317)
            java.math.BigDecimal r13 = java.math.BigDecimal.valueOf(r5)     // Catch:{ JSONException -> 0x00d7 }
            java.math.BigDecimal r14 = X.AnonymousClass16W.A07     // Catch:{ JSONException -> 0x00d7 }
            X.16W r8 = new X.16W     // Catch:{ JSONException -> 0x00d7 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x00d7 }
            java.util.Map r5 = r1.A00     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r0 = r8.A02     // Catch:{ JSONException -> 0x00d7 }
            r5.put(r0, r8)     // Catch:{ JSONException -> 0x00d7 }
            int r3 = r3 + 1
            goto L_0x006c
        L_0x00d7:
            r4 = move-exception
            goto L_0x00ef
        L_0x00d9:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r3.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/getAssetFileAsByte"
            r3.append(r0)     // Catch:{ all -> 0x0112 }
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0112 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0103
        L_0x00ef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r3.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/load"
            r3.append(r0)     // Catch:{ all -> 0x0112 }
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0112 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0112 }
        L_0x0103:
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x0112 }
        L_0x0106:
            monitor-exit(r1)
            java.util.Map r0 = r1.A00
            java.lang.Object r0 = r0.get(r2)
            X.16U r0 = (X.AnonymousClass16U) r0
            if (r0 == 0) goto L_0x0115
            return r0
        L_0x0112:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0115:
            X.16U r0 = X.AnonymousClass16W.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16T.A01(java.lang.String):X.16U");
    }

    public AnonymousClass16T(AnonymousClass16Y r1) {
        this.A00 = r1;
    }

    public static AnonymousClass16U A00(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return AnonymousClass16W.A06;
        }
        return new AnonymousClass16W(parcel);
    }
}
