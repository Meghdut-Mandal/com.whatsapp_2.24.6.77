package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.6PS  reason: invalid class name */
public class AnonymousClass6PS {
    public HashMap A00;
    public boolean A01 = false;
    public final C19630wG A02;
    public final C24601Db A03;
    public final AnonymousClass1EV A04;
    public final C111225bw A05;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:57|58|59|60|61|62|(4:64|65|66|(3:68|69|70))|78|79|105) */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00fb, code lost:
        if (r5.isEmpty() == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00fd, code lost:
        r5 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x00f7 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088 A[Catch:{ JSONException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7 A[EDGE_INSN: B:84:0x00f7->B:85:? ?: BREAK  
    EDGE_INSN: B:83:0x00f4->B:84:0x00f7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass6PS r15) {
        /*
            boolean r0 = r15.A01
            r3 = 1
            if (r0 == 0) goto L_0x000d
            java.util.HashMap r0 = r15.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013e
        L_0x000d:
            java.lang.String r1 = "payments_error_map.json"
            monitor-enter(r15)
            X.0wG r0 = r15.A02     // Catch:{ all -> 0x012d }
            java.io.File r0 = X.C90514aH.A0j(r0)     // Catch:{ all -> 0x012d }
            java.io.File r1 = X.C36441kJ.A0w(r0, r1)     // Catch:{ all -> 0x012d }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x012d }
            if (r0 != 0) goto L_0x0021
            r1 = 0
        L_0x0021:
            monitor-exit(r15)
            if (r1 != 0) goto L_0x002b
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/ file name is empty"
        L_0x0026:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x002b:
            java.io.FileInputStream r0 = X.C90524aI.A0U(r1)     // Catch:{ FileNotFoundException -> 0x0030 }
            goto L_0x003c
        L_0x0030:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: ErrorMapMetadata/getMessage/ FileNotFoundException: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            goto L_0x0026
        L_0x003c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.io.BufferedReader r2 = X.C90484aE.A0b(r0)     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0064 }
        L_0x0044:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004e
            r4.append(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0044
        L_0x004e:
            r2.close()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0064 }
            goto L_0x006e
        L_0x0052:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0064 }
        L_0x005b:
            throw r1     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0064 }
        L_0x005c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/FileNotFoundException: "
            goto L_0x006b
        L_0x0064:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/IOException: "
        L_0x006b:
            X.C36321k7.A1J(r2, r0, r1)
        L_0x006e:
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r7 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0120 }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x0130 }
            r15.A00 = r0     // Catch:{ JSONException -> 0x0130 }
            r15.A01 = r3     // Catch:{ JSONException -> 0x0130 }
            java.util.Iterator r14 = r7.keys()     // Catch:{ JSONException -> 0x0130 }
        L_0x0082:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0130 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r14.next()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r6 = r0.toString()     // Catch:{ JSONException -> 0x0130 }
            r8 = 0
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "actions"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x00ff }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x00ff }
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ Exception | JSONException -> 0x00f7 }
            r10 = 0
        L_0x00a4:
            int r0 = r12.length()     // Catch:{ Exception | JSONException -> 0x00f7 }
            if (r10 >= r0) goto L_0x00f4
            r13 = 0
            org.json.JSONObject r1 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x00ec, Exception | JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x00f1
            java.lang.String r0 = "type"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x00e1, Exception | JSONException -> 0x00f7 }
            java.lang.String r0 = "name"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x00df, Exception | JSONException -> 0x00f7 }
            if (r9 == 0) goto L_0x00e3
            java.lang.String r0 = "FAQ"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x00e3, Exception | JSONException -> 0x00f7 }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "faq_data"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00d4, Exception | JSONException -> 0x00f7 }
            java.lang.String r0 = "faq_article_id"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ JSONException -> 0x00d4, Exception | JSONException -> 0x00f7 }
            goto L_0x00e3
        L_0x00d4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x00e3, Exception | JSONException -> 0x00f7 }
            java.lang.String r0 = "PAY/ ErrorMapObject/ No article_id present. Exception: "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ JSONException -> 0x00e3, Exception | JSONException -> 0x00f7 }
            goto L_0x00e3
        L_0x00df:
            r4 = r8
            goto L_0x00e3
        L_0x00e1:
            r9 = r8
            r4 = r8
        L_0x00e3:
            X.66t r0 = new X.66t     // Catch:{ Exception | JSONException -> 0x00f7 }
            r0.<init>(r9, r4, r13)     // Catch:{ Exception | JSONException -> 0x00f7 }
            r11.add(r0)     // Catch:{ Exception | JSONException -> 0x00f7 }
            goto L_0x00f1
        L_0x00ec:
            java.lang.String r0 = "PAY/ ErrorMapObject/ Action not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception | JSONException -> 0x00f7 }
        L_0x00f1:
            int r10 = r10 + 1
            goto L_0x00a4
        L_0x00f4:
            r5.addAll(r11)     // Catch:{ Exception | JSONException -> 0x00f7 }
        L_0x00f7:
            boolean r0 = r5.isEmpty()     // Catch:{ JSONException -> 0x0130 }
            if (r0 == 0) goto L_0x0100
            r5 = r8
            goto L_0x0100
        L_0x00ff:
            r5 = r8
        L_0x0100:
            java.util.HashMap r4 = r15.A00     // Catch:{ JSONException -> 0x0130 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r0 = "error_title"
            java.lang.String r2 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x0130 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0130 }
            X.5tk r0 = new X.5tk     // Catch:{ JSONException -> 0x0130 }
            r0.<init>(r2, r1, r5)     // Catch:{ JSONException -> 0x0130 }
            r4.put(r6, r0)     // Catch:{ JSONException -> 0x0130 }
            goto L_0x0082
        L_0x0120:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/JSONException: "
            X.C36321k7.A1J(r2, r0, r1)
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/ JSONObject is null"
            goto L_0x013b
        L_0x012d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0130:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/JSONException: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
        L_0x013b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x013e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PS.A00(X.6PS):boolean");
    }

    public String A01(int i) {
        if (this.A04.A02.A0E(698)) {
            return A03(String.valueOf(i));
        }
        return null;
    }

    public String A02(Bundle bundle, String str) {
        String A032;
        if (bundle == null || !this.A04.A02.A0E(698) || (A032 = A03(String.valueOf(bundle.getInt("error_code")))) == null) {
            return str;
        }
        return A032;
    }

    public AnonymousClass6PS(C19630wG r2, C24601Db r3, AnonymousClass1EV r4, C111225bw r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public String A03(String str) {
        if (A00(this)) {
            if (this.A00.containsKey(str)) {
                C121805tk r0 = (C121805tk) this.A00.get(str);
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                C36321k7.A1P("PAY: ErrorMapMetadata/getMessage/Error code not found. Error code: ", str, AnonymousClass000.A0u());
            }
        }
        return null;
    }
}
