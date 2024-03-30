package X;

import android.content.Context;

/* renamed from: X.4qI  reason: invalid class name and case insensitive filesystem */
public class C97804qI extends AnonymousClass75L {
    public long A00;
    public final C160307kn A01;

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bf, code lost:
        throw X.C90524aI.A0e("Exception while loading map config", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.AnonymousClass6TY.A07.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.e("MapConfig", "Unable to download config", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ce, code lost:
        if (r3 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0231, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r0.importance == 100) goto L_0x0035;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01c0 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c0 A[EDGE_INSN: B:54:0x01c0->B:55:? ?: BREAK  , PHI: r3 
      PHI: (r3v7 java.io.InputStream) = (r3v3 java.io.InputStream), (r3v3 java.io.InputStream), (r3v8 java.io.InputStream), (r3v9 java.io.InputStream), (r3v9 java.io.InputStream) binds: [B:19:0x0076, B:21:0x008b, B:51:0x01bb, B:22:?, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:54:0x01c0] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c6 A[ExcHandler: IOException (r2v8 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v6 java.io.InputStream) = (r3v3 java.io.InputStream), (r3v8 java.io.InputStream), (r3v9 java.io.InputStream) binds: [B:19:0x0076, B:51:0x01bb, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE], Splitter:B:19:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0231 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r30 = this;
            r6 = r30
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            java.lang.String r3 = X.AnonymousClass6UZ.A03
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "&country="
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r3, r1)
        L_0x0019:
            r0 = 512(0x200, float:7.175E-43)
            r3 = 0
            goto L_0x0076
        L_0x001d:
            X.7kn r3 = r6.A01
            if (r3 == 0) goto L_0x0019
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0035
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r1 = r0.importance
            r0 = 100
            if (r1 != r0) goto L_0x0019
        L_0x0035:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x004f
            android.content.Context r1 = X.AnonymousClass6UZ.A02
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0019
            android.content.Context r1 = X.AnonymousClass6UZ.A02
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0019
        L_0x004f:
            android.location.Location r3 = r3.BAd()
            if (r3 == 0) goto L_0x0019
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r2)
            java.lang.String r0 = "&latitude="
            r2.append(r0)
            double r0 = r3.getLatitude()
            r2.append(r0)
            java.lang.String r0 = "&longitude="
            r2.append(r0)
            double r0 = r3.getLongitude()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            goto L_0x0019
        L_0x0076:
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass6UZ.A0D     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            r1.append(r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass6UZ.A0C     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.net.URL r0 = X.C90524aI.A0j(r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            java.io.InputStream r3 = r0.openStream()     // Catch:{ IOException -> 0x01b8, Exception -> 0x01c0, all -> 0x0231 }
            r4 = 0
            r2 = 0
        L_0x0091:
            int r0 = r5.length     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            int r0 = r0 - r2
            int r1 = r3.read(r5, r2, r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            r0 = -1
            if (r1 == r0) goto L_0x00a9
            int r2 = r2 + r1
            int r0 = r5.length     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            if (r2 < r0) goto L_0x0091
            int r0 = r5.length     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            int r0 = r0 << 1
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            int r0 = r5.length     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            java.lang.System.arraycopy(r5, r4, r1, r4, r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            r5 = r1
            goto L_0x0091
        L_0x00a9:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            r0.<init>(r5, r4, r2)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            org.json.JSONObject r9 = r0.getJSONObject(r4)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0 }
            r3.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            if (r9 == 0) goto L_0x01d3
            java.lang.String r23 = "south"
            java.lang.String r22 = "east"
            java.lang.String r21 = "north"
            java.lang.String r20 = "west"
            java.lang.String r15 = "rectangles"
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            java.lang.String r0 = r0.A01
            java.lang.String r14 = "base_url"
            java.lang.String r24 = r9.optString(r14, r0)
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "static_base_url"
            java.lang.String r25 = r9.optString(r0, r1)
            java.lang.String r0 = "osm_config"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x013f }
            java.lang.String r0 = "zoom_threshold"
            int r16 = r1.getInt(r0)     // Catch:{ JSONException -> 0x013f }
            org.json.JSONArray r12 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x013f }
            int r8 = r12.length()     // Catch:{ JSONException -> 0x013f }
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]     // Catch:{ JSONException -> 0x013f }
            r19 = r0
            r7 = 1
            int r7 = r7 << r16
            r5 = 0
        L_0x00fb:
            if (r5 >= r8) goto L_0x014b
            org.json.JSONObject r4 = r12.getJSONObject(r5)     // Catch:{ JSONException -> 0x013f }
            double r2 = (double) r7     // Catch:{ JSONException -> 0x013f }
            r0 = r20
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x013f }
            double r10 = X.AnonymousClass6WY.A01(r0)     // Catch:{ JSONException -> 0x013f }
            double r0 = r2 * r10
            int r10 = (int) r0     // Catch:{ JSONException -> 0x013f }
            r0 = r21
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x013f }
            double r17 = X.AnonymousClass6WY.A00(r0)     // Catch:{ JSONException -> 0x013f }
            double r0 = r2 * r17
            int r11 = (int) r0     // Catch:{ JSONException -> 0x013f }
            r0 = r22
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x013f }
            double r17 = X.AnonymousClass6WY.A01(r0)     // Catch:{ JSONException -> 0x013f }
            double r0 = r2 * r17
            int r13 = (int) r0     // Catch:{ JSONException -> 0x013f }
            r0 = r23
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x013f }
            double r0 = X.AnonymousClass6WY.A00(r0)     // Catch:{ JSONException -> 0x013f }
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ JSONException -> 0x013f }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ JSONException -> 0x013f }
            r1.<init>(r10, r11, r13, r0)     // Catch:{ JSONException -> 0x013f }
            r19[r5] = r1     // Catch:{ JSONException -> 0x013f }
            int r5 = r5 + 1
            goto L_0x00fb
        L_0x013f:
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            int r0 = r0.A00
            r16 = r0
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            android.graphics.Rect[] r0 = r0.A04
            r19 = r0
        L_0x014b:
            java.lang.String r0 = "url_override_config"
            org.json.JSONArray r12 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x01f6 }
            int r7 = r12.length()     // Catch:{ JSONException -> 0x01f6 }
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x01f6 }
            X.6Ms[][] r5 = new X.C130866Ms[r7][]     // Catch:{ JSONException -> 0x01f6 }
            r4 = 0
        L_0x015a:
            if (r4 >= r7) goto L_0x01fe
            org.json.JSONObject r1 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x01f6 }
            java.lang.String r0 = r1.getString(r14)     // Catch:{ JSONException -> 0x01f6 }
            r10[r4] = r0     // Catch:{ JSONException -> 0x01f6 }
            org.json.JSONArray r11 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x01f6 }
            int r8 = r11.length()     // Catch:{ JSONException -> 0x01f6 }
            X.6Ms[] r0 = new X.C130866Ms[r8]     // Catch:{ JSONException -> 0x01f6 }
            r5[r4] = r0     // Catch:{ JSONException -> 0x01f6 }
            r3 = 0
        L_0x0173:
            if (r3 >= r8) goto L_0x01b5
            X.6Ms r2 = new X.6Ms     // Catch:{ JSONException -> 0x01f6 }
            r2.<init>()     // Catch:{ JSONException -> 0x01f6 }
            org.json.JSONObject r9 = r11.getJSONObject(r3)     // Catch:{ JSONException -> 0x01f6 }
            r0 = r20
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f6 }
            double r0 = X.AnonymousClass6WY.A01(r0)     // Catch:{ JSONException -> 0x01f6 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x01f6 }
            r0 = r21
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f6 }
            double r0 = X.AnonymousClass6WY.A00(r0)     // Catch:{ JSONException -> 0x01f6 }
            r2.A03 = r0     // Catch:{ JSONException -> 0x01f6 }
            r0 = r22
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f6 }
            double r0 = X.AnonymousClass6WY.A01(r0)     // Catch:{ JSONException -> 0x01f6 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x01f6 }
            r0 = r23
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f6 }
            double r0 = X.AnonymousClass6WY.A00(r0)     // Catch:{ JSONException -> 0x01f6 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x01f6 }
            r0 = r5[r4]     // Catch:{ JSONException -> 0x01f6 }
            r0[r3] = r2     // Catch:{ JSONException -> 0x01f6 }
            int r3 = r3 + 1
            goto L_0x0173
        L_0x01b5:
            int r4 = r4 + 1
            goto L_0x015a
        L_0x01b8:
            r1 = move-exception
            java.lang.String r0 = "Exception while loading map config"
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
            throw r0     // Catch:{ IOException -> 0x01c6, Exception -> 0x01c0, all -> 0x0231 }
        L_0x01c0:
            X.6TY r0 = X.AnonymousClass6TY.A07     // Catch:{ all -> 0x022a }
            r0.A03()     // Catch:{ all -> 0x022a }
            goto L_0x01ce
        L_0x01c6:
            r2 = move-exception
            java.lang.String r1 = "MapConfig"
            java.lang.String r0 = "Unable to download config"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x022a }
        L_0x01ce:
            if (r3 == 0) goto L_0x01d3
            r3.close()     // Catch:{ IOException -> 0x01d3 }
        L_0x01d3:
            long r2 = r6.A00
            r4 = 3
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x021d
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "MapConfigUpdateDispatchable"
            X.C133046Wl.A01(r6)
            r6.A02 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 + r2
            r6.A01 = r0
            X.5oA r0 = X.C133046Wl.A00()
            java.util.concurrent.BlockingQueue r0 = r0.A00
            r0.add(r6)
            return
        L_0x01f6:
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            java.lang.String[] r10 = r0.A05
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            X.6Ms[][] r5 = r0.A06
        L_0x01fe:
            X.5xY r23 = new X.5xY
            r26 = r19
            r27 = r10
            r28 = r5
            r29 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.AnonymousClass6UZ.A0B = r23
            long r0 = android.os.SystemClock.uptimeMillis()
            X.AnonymousClass6UZ.A00 = r0
            X.4q9 r1 = new X.4q9
            r1.<init>()
            android.os.Handler r0 = X.C133046Wl.A01
            r0.post(r1)
        L_0x021d:
            r0 = 0
            r6.A00 = r0
            r0 = 0
            X.AnonymousClass6UZ.A06 = r0
            java.util.concurrent.Semaphore r0 = X.AnonymousClass6UZ.A09
            r0.release()
            return
        L_0x022a:
            r0 = move-exception
            if (r3 == 0) goto L_0x0232
            r3.close()     // Catch:{ IOException -> 0x0232 }
            throw r0
        L_0x0231:
            r0 = move-exception
        L_0x0232:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97804qI.run():void");
    }

    public C97804qI(Context context) {
        C160307kn r1 = null;
        if (AnonymousClass6UZ.A03 == null) {
            try {
                C112705eK.A00(context);
                r1 = C112705eK.A00.B3h();
            } catch (AnonymousClass78J unused) {
                AnonymousClass6TY.A07.A03();
            }
        }
        this.A01 = r1;
    }
}
