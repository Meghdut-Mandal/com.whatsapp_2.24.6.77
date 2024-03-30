package X;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1BR  reason: invalid class name */
public final class AnonymousClass1BR {
    public final C19730wQ A00;
    public final C20050ww A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final C18820ts A05;
    public final C20810yC A06;
    public final AnonymousClass13E A07;
    public final C24121Be A08;
    public final C21080yd A09;
    public final AnonymousClass1B7 A0A;
    public final C20020wt A0B;
    public final C19700wN A0C;
    public final AnonymousClass17Y A0D;
    public final C21010yW A0E;
    public final C24131Bf A0F;

    public AnonymousClass1BR(C19700wN r18, AnonymousClass17Y r19, C19730wQ r20, C20050ww r21, C19970wo r22, C19630wG r23, C19420v0 r24, C18820ts r25, C20810yC r26, C21010yW r27, AnonymousClass13E r28, C24121Be r29, C21080yd r30, C24131Bf r31, AnonymousClass1B7 r32, C20020wt r33) {
        C19630wG r11 = r23;
        AnonymousClass00C.A0D(r11, 1);
        C19970wo r12 = r22;
        AnonymousClass00C.A0D(r12, 2);
        C20810yC r0 = r26;
        AnonymousClass00C.A0D(r0, 3);
        AnonymousClass17Y r15 = r19;
        AnonymousClass00C.A0D(r15, 4);
        C19700wN r16 = r18;
        AnonymousClass00C.A0D(r16, 5);
        C19730wQ r14 = r20;
        AnonymousClass00C.A0D(r14, 6);
        C20020wt r2 = r33;
        AnonymousClass00C.A0D(r2, 7);
        C20050ww r13 = r21;
        AnonymousClass00C.A0D(r13, 8);
        C21010yW r8 = r27;
        AnonymousClass00C.A0D(r8, 9);
        AnonymousClass13E r7 = r28;
        AnonymousClass00C.A0D(r7, 10);
        C18820ts r9 = r25;
        AnonymousClass00C.A0D(r9, 11);
        C21080yd r5 = r30;
        AnonymousClass00C.A0D(r5, 12);
        C19420v0 r10 = r24;
        AnonymousClass00C.A0D(r10, 13);
        C24121Be r6 = r29;
        AnonymousClass00C.A0D(r6, 14);
        C24131Bf r4 = r31;
        AnonymousClass00C.A0D(r4, 15);
        AnonymousClass1B7 r3 = r32;
        AnonymousClass00C.A0D(r3, 16);
        this.A03 = r11;
        this.A02 = r12;
        this.A06 = r0;
        this.A0D = r15;
        this.A0C = r16;
        this.A00 = r14;
        this.A0B = r2;
        this.A01 = r13;
        this.A0E = r8;
        this.A07 = r7;
        this.A05 = r9;
        this.A09 = r5;
        this.A04 = r10;
        this.A08 = r6;
        this.A0F = r4;
        this.A0A = r3;
    }

    public final AnonymousClass68B A02(C159687jl r7, String str) {
        AnonymousClass00C.A0D(str, 0);
        C24131Bf r3 = this.A0F;
        if (!r3.A02()) {
            Log.i("StickerPackNetworkProvider/getStickerPackById skipped due to backoff time");
        } else {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("https://static.whatsapp.net/sticker?id=");
                sb.append(str);
                sb.append("&lg=");
                sb.append(this.A05.A09());
                sb.append(this.A06.A09(6785));
                String A012 = this.A08.A01(sb.toString());
                AnonymousClass00C.A08(A012);
                C120225rA A002 = A00(r7, this, A012, (String) null);
                r3.A00();
                if (A002 != null) {
                    return (AnonymousClass68B) A002.A01.get(0);
                }
            } catch (AnonymousClass1AR e) {
                r3.A01();
                Log.e("StickerPackNetworkProvider/getStickerPackById failed", e);
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.5rA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.5rA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: X.5rA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r2v13, types: [X.5rA] */
    /* JADX WARNING: type inference failed for: r13v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        if (r0 != null) goto L_0x0146;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x013d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x0122=Splitter:B:47:0x0122, B:58:0x013d=Splitter:B:58:0x013d} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C120225rA A00(X.C159687jl r20, X.AnonymousClass1BR r21, java.lang.String r22, java.lang.String r23) {
        /*
            java.lang.String r3 = ", reason: "
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: "
            r5 = r21
            X.0wo r7 = r5.A02
            long r9 = X.C19970wo.A00(r7)
            r0 = 9
            r1 = 1
            r13 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.net.URL r0 = new java.net.URL     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r4 = r22
            r0.<init>(r4)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r6 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.AnonymousClass00C.A0E(r0, r6)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            X.0yd r6 = r5.A09     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            X.8qR r6 = r6.A02()     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r0.setSSLSocketFactory(r6)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            X.0wt r6 = r5.A0B     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r8 = r6.A02()     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r6 = "User-Agent"
            r0.setRequestProperty(r6, r8)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r6 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r6)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r6 = 30000(0x7530, float:4.2039E-41)
            r0.setReadTimeout(r6)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r6 = "GET"
            r0.setRequestMethod(r6)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            X.0yC r12 = r5.A06     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r14 = "sticker_store"
            java.lang.String r15 = "document"
            java.lang.String r16 = "manual"
            r17 = 0
            X.64M r11 = new X.64M     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r8 = r11.A00()     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            java.lang.String r6 = "X-FB-Request-Analytics-Tags"
            r0.setRequestProperty(r6, r8)     // Catch:{ EOFException -> 0x013c, IOException -> 0x0131, IllegalArgumentException -> 0x0120 }
            r8 = r23
            if (r23 == 0) goto L_0x0069
            java.lang.String r6 = "If-None-Match"
            r0.setRequestProperty(r6, r8)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
        L_0x0069:
            int r8 = r0.getResponseCode()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            long r18 = X.C19970wo.A00(r7)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            long r18 = r18 - r9
            java.net.URL r15 = r0.getURL()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            X.AnonymousClass00C.A08(r15)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            long r6 = (long) r8     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r14 = r5
            r16 = r6
            r14.A03(r15, r16, r18)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r6 = 200(0xc8, float:2.8E-43)
            if (r8 == r6) goto L_0x00e2
            r6 = 304(0x130, float:4.26E-43)
            if (r8 == r6) goto L_0x0146
            r6 = 404(0x194, float:5.66E-43)
            if (r8 != r6) goto L_0x009f
            r6 = r20
            if (r20 == 0) goto L_0x009f
            X.17Y r4 = r5.A0D     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r3 = 40
            X.1jA r2 = new X.1jA     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r2.<init>((java.lang.Object) r6, (int) r3)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.A0H(r2)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            goto L_0x0146
        L_0x009f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.<init>()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.append(r2)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.append(r8)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.append(r3)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.String r6 = r0.getResponseMessage()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.append(r6)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.String r6 = ", url: "
            r7.append(r6)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r7.append(r4)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.String r4 = r7.toString()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.<init>()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.append(r2)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.append(r8)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.append(r3)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.String r2 = r0.getResponseMessage()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r4.append(r2)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            java.lang.String r3 = r4.toString()     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            X.1AR r2 = new X.1AR     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r2.<init>(r3)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            throw r2     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
        L_0x00e2:
            java.lang.String r2 = "ETag"
            java.lang.String r6 = r0.getHeaderField(r2)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            X.0ww r3 = r5.A01     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
            X.5RE r4 = X.C132776Vf.A00(r3, r13, r2, r0)     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
            java.util.ArrayList r3 = A01(r4)     // Catch:{ all -> 0x0102 }
            r4.close()     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
            X.5rA r2 = new X.5rA     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r2.<init>(r6, r3)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r13 = r2
            goto L_0x0146
        L_0x0102:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r2 = move-exception
            X.C05600Qi.A00(r4, r3)     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
            throw r2     // Catch:{ IOException -> 0x0112, JSONException -> 0x0109 }
        L_0x0109:
            r4 = move-exception
            java.lang.String r3 = "StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data"
            X.1AR r2 = new X.1AR     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r2.<init>(r3, r4)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            throw r2     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
        L_0x0112:
            r4 = move-exception
            java.lang.String r3 = "StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json"
            X.1AR r2 = new X.1AR     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            r2.<init>(r3, r4)     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
            throw r2     // Catch:{ EOFException -> 0x013d, IOException -> 0x011d, IllegalArgumentException -> 0x011b }
        L_0x011b:
            r4 = move-exception
            goto L_0x0122
        L_0x011d:
            r2 = move-exception
            r13 = r0
            goto L_0x0132
        L_0x0120:
            r4 = move-exception
            r0 = r13
        L_0x0122:
            X.0wN r3 = r5.A0C     // Catch:{ all -> 0x014d }
            java.lang.String r2 = "StickerPackNetworkProvider/error fetching sticker pack json"
            r3.A0E(r2, r13, r1)     // Catch:{ all -> 0x014d }
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/IllegalArgumentException/error fetching sticker pack json"
            X.1AR r1 = new X.1AR     // Catch:{ all -> 0x014d }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x014d }
            throw r1     // Catch:{ all -> 0x014d }
        L_0x0131:
            r2 = move-exception
        L_0x0132:
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IOException/error fetching sticker pack json"
            X.1AR r0 = new X.1AR     // Catch:{ all -> 0x013a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            goto L_0x014f
        L_0x013c:
            r0 = r13
        L_0x013d:
            X.0wN r3 = r5.A0C     // Catch:{ all -> 0x014d }
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/EOFException"
            r3.A0E(r2, r13, r1)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0149
        L_0x0146:
            r0.disconnect()
        L_0x0149:
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x014d:
            r1 = move-exception
            r13 = r0
        L_0x014f:
            if (r13 == 0) goto L_0x0154
            r13.disconnect()
        L_0x0154:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BR.A00(X.7jl, X.1BR, java.lang.String, java.lang.String):X.5rA");
    }

    public static ArrayList A01(InputStream inputStream) {
        String A002 = AnonymousClass14X.A00(inputStream);
        C18740tg.A06(A002);
        JSONArray jSONArray = new JSONArray(A002);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            AnonymousClass65S r8 = new AnonymousClass65S();
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            boolean z = true;
            boolean z2 = false;
            if (jSONObject.optInt("lottie", 0) == 1) {
                z2 = true;
            }
            String str = (String) jSONObject.get("sticker-pack-id");
            if (jSONObject.has("stickers")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("stickers");
                ArrayList arrayList2 = new ArrayList(jSONArray2.length());
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    C135066c4 r1 = new C135066c4();
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    r1.A0E = jSONObject2.getString("file-hash");
                    r1.A00 = jSONObject2.getInt("file-size");
                    r1.A0H = jSONObject2.getString("url");
                    r1.A09 = jSONObject2.getString("enc-file-hash");
                    r1.A0C = jSONObject2.getString("media-key");
                    r1.A0D = jSONObject2.getString("mimetype");
                    r1.A02 = jSONObject2.getInt("height");
                    r1.A03 = jSONObject2.getInt("width");
                    r1.A07 = jSONObject2.getString("direct-path");
                    r1.A0B = jSONObject2.optString("sticker-hash-without-meta");
                    r1.A0N = z2;
                    JSONArray optJSONArray = jSONObject2.optJSONArray("emojis");
                    if (optJSONArray != null) {
                        ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            arrayList3.add(optJSONArray.getString(i3));
                        }
                        String join = TextUtils.join(" ", arrayList3);
                        AnonymousClass00C.A08(join);
                        r1.A08 = join;
                    }
                    r1.A0G = str;
                    arrayList2.add(r1);
                }
                r8.A0N = arrayList2;
            }
            r8.A0E = str;
            r8.A0G = (String) jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            r8.A0I = (String) jSONObject.get("publisher");
            r8.A03 = (String) jSONObject.get("description");
            r8.A0K = (String) jSONObject.get("tray-image-id");
            r8.A0L = (String) jSONObject.get("tray-image-preview");
            JSONArray jSONArray3 = jSONObject.getJSONArray("preview-image-ids");
            ArrayList arrayList4 = new ArrayList(jSONArray3.length());
            for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                arrayList4.add(jSONArray3.get(i4));
            }
            r8.A0M = arrayList4;
            r8.A01 = jSONObject.getLong("file-size");
            r8.A0F = jSONObject.getString("image-data-hash");
            if (jSONObject.optInt("animated", 0) != 1) {
                z = false;
            }
            r8.A0O = z;
            r8.A0U = z2;
            arrayList.add(r8.A00());
        }
        return arrayList;
    }

    public final void A03(URL url, long j, long j2) {
        int i;
        Set<String> parameterSet = new UrlQuerySanitizer(url.toString()).getParameterSet();
        AnonymousClass00C.A08(parameterSet);
        if (parameterSet.contains("cat")) {
            i = 0;
        } else if (parameterSet.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            i = 2;
        } else {
            i = 1;
            if (!parameterSet.contains("img")) {
                StringBuilder sb = new StringBuilder();
                sb.append("StickerPackNetworkProvider/log query type ");
                sb.append(-1);
                sb.append("is not supported: ");
                sb.append(url);
                Log.e(sb.toString());
                return;
            }
        }
        AnonymousClass2QS r1 = new AnonymousClass2QS();
        r1.A01 = Long.valueOf(j);
        r1.A03 = url.getQuery();
        r1.A00 = Integer.valueOf(i);
        r1.A02 = Long.valueOf(j2);
        this.A0E.Bly(r1);
    }
}
