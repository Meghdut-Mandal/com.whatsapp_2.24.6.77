package X;

/* renamed from: X.5Lu  reason: invalid class name and case insensitive filesystem */
public class C106905Lu extends C132446Tt {
    public final /* synthetic */ C92684eN A00;

    public C106905Lu(C92684eN r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0230, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0234, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0134 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d4 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022f A[ExcHandler: IOException | JSONException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f A[Catch:{ all -> 0x022a, IOException | JSONException -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cc A[Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.4eN r0 = r10.A00     // Catch:{ IOException | JSONException -> 0x022f }
            com.whatsapp.profile.WebImagePicker r0 = r0.A02     // Catch:{ IOException | JSONException -> 0x022f }
            X.9Nw r2 = r0.A0C     // Catch:{ IOException | JSONException -> 0x022f }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ IOException | JSONException -> 0x022f }
            r2.A03 = r0     // Catch:{ IOException | JSONException -> 0x022f }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | JSONException -> 0x022f }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = X.AnonymousClass6JD.A02     // Catch:{ IOException | JSONException -> 0x022f }
            r4.encodedPath(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = X.AnonymousClass6JD.A05     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "SafeSearch"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = X.AnonymousClass6JD.A03     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "appid"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = X.AnonymousClass6JD.A04     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "aspect"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = r2.A02     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "q"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = r0.getLanguage()     // Catch:{ IOException | JSONException -> 0x022f }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r3 = r0.getCountry()     // Catch:{ IOException | JSONException -> 0x022f }
            boolean r0 = r3.isEmpty()     // Catch:{ IOException | JSONException -> 0x022f }
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x0056:
            java.util.List r0 = r2.A07     // Catch:{ IOException | JSONException -> 0x022f }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException | JSONException -> 0x022f }
            if (r0 != 0) goto L_0x0060
            java.lang.String r1 = "en-US"
        L_0x0060:
            java.lang.String r0 = "mkt"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = r2.A00     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "offset"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            r0 = 50
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "count"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r9 = X.C90474aD.A0b(r4)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r1 = X.C18750th.A04(r9)     // Catch:{ IOException | JSONException -> 0x022f }
            java.io.File r0 = r2.A06     // Catch:{ IOException | JSONException -> 0x022f }
            java.io.File r8 = X.C36441kJ.A0w(r0, r1)     // Catch:{ IOException | JSONException -> 0x022f }
            boolean r0 = r8.exists()     // Catch:{ IOException | JSONException -> 0x022f }
            r5 = 0
            if (r0 == 0) goto L_0x00d5
            long r6 = r8.lastModified()     // Catch:{ IOException | JSONException -> 0x022f }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 + r0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            java.io.FileInputStream r4 = X.C90524aI.A0U(r8)     // Catch:{ IOException | ClassNotFoundException -> 0x00d0, IOException | JSONException -> 0x022f }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x00c6 }
            r0.<init>(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r0.readObject()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bc }
            r0.close()     // Catch:{ all -> 0x00b9 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x00b6, IOException | JSONException -> 0x022f }
            goto L_0x011d
        L_0x00b6:
            r0 = move-exception
            r5 = r3
            goto L_0x00d1
        L_0x00b9:
            r1 = move-exception
            r5 = r3
            goto L_0x00c7
        L_0x00bc:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
        L_0x00c7:
            r4.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x00d0, IOException | JSONException -> 0x022f }
        L_0x00cf:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x00d0, IOException | JSONException -> 0x022f }
        L_0x00d0:
            r0 = move-exception
        L_0x00d1:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException | JSONException -> 0x022f }
            goto L_0x011c
        L_0x00d5:
            r8.delete()     // Catch:{ IOException | JSONException -> 0x022f }
            X.13E r0 = r2.A05     // Catch:{ IOException | JSONException -> 0x022f }
            X.6v1 r4 = r0.A05(r9)     // Catch:{ IOException | JSONException -> 0x022f }
            java.net.HttpURLConnection r0 = r4.A01     // Catch:{ all -> 0x0225 }
            int r3 = r0.getResponseCode()     // Catch:{ all -> 0x0225 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L_0x0216
            X.0ww r1 = r2.A04     // Catch:{ all -> 0x0225 }
            java.lang.Integer r0 = X.C36431kI.A14()     // Catch:{ all -> 0x0225 }
            X.5RE r3 = r4.B8D(r1, r5, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r5 = X.AnonymousClass14X.A00(r3)     // Catch:{ all -> 0x020c }
            java.io.FileOutputStream r1 = X.C90524aI.A0W(r8)     // Catch:{ IOException -> 0x0110 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0110 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0110 }
            r0.writeObject(r5)     // Catch:{ all -> 0x0106 }
            r0.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0116
        L_0x0106:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x010b }
            goto L_0x010f
        L_0x010b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0110 }
        L_0x010f:
            throw r1     // Catch:{ IOException -> 0x0110 }
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = "WebImageSearcher/next"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x020c }
        L_0x0116:
            r3.close()     // Catch:{ all -> 0x0225 }
            r4.close()     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x011c:
            r3 = r5
        L_0x011d:
            if (r3 == 0) goto L_0x0209
            org.json.JSONObject r1 = X.C36441kJ.A1C(r3)     // Catch:{ IOException | JSONException -> 0x022f }
            r5 = 0
            r4 = 0
            java.lang.String r0 = "value"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0134, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "totalEstimatedMatches"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0134, IOException | JSONException -> 0x022f }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0134, IOException | JSONException -> 0x022f }
            goto L_0x0136
        L_0x0134:
            r2.A01 = r5     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x0136:
            if (r4 == 0) goto L_0x0209
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = "results.length() = "
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x022f }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = ", total:"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = r2.A01     // Catch:{ IOException | JSONException -> 0x022f }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x0152:
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x022f }
            if (r5 >= r0) goto L_0x01ee
            X.67w r3 = new X.67w     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.<init>()     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "contentUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A05 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "hostPageUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A06 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "contentSize"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            int r0 = r1.nextInt()     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A02 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r1 = r1.next()     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "KB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            if (r0 == 0) goto L_0x01bb
            int r0 = r3.A02     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            int r1 = r0 * 1000
        L_0x0192:
            r3.A02 = r1     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
        L_0x0194:
            java.lang.String r0 = "width"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A03 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "height"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A01 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A07 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r3.A04 = r0     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            java.lang.String r0 = "accentColor"
            java.lang.String r1 = r6.optString(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            goto L_0x01ca
        L_0x01bb:
            java.lang.String r0 = "MB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            if (r0 == 0) goto L_0x0194
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r0
            goto L_0x0192
        L_0x01ca:
            if (r1 == 0) goto L_0x01d4
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x01d4 }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x01d4 }
        L_0x01d4:
            int r0 = r3.A03     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto L_0x01ea
            int r0 = r3.A01     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            if (r0 < r1) goto L_0x01ea
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r0 = 512000(0x7d000, float:7.17465E-40)
            if (r1 > r0) goto L_0x01ea
            java.util.ArrayList r0 = r2.A03     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
            r0.add(r3)     // Catch:{ JSONException -> 0x01ea, IOException | JSONException -> 0x022f }
        L_0x01ea:
            int r5 = r5 + 1
            goto L_0x0152
        L_0x01ee:
            int r1 = r2.A00     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x022f }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | JSONException -> 0x022f }
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x022f }
            int r0 = r0.size()     // Catch:{ IOException | JSONException -> 0x022f }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x022f }
            java.lang.String r0 = " images"
            X.C36321k7.A1a(r1, r0)     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x0209:
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x022f }
            return r0
        L_0x020c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0211 }
            goto L_0x0224
        L_0x0211:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0225 }
            goto L_0x0224
        L_0x0216:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "Communication failed, status="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x0225 }
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x0225 }
        L_0x0224:
            throw r1     // Catch:{ all -> 0x0225 }
        L_0x0225:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x022a }
            goto L_0x022e
        L_0x022a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x022e:
            throw r1     // Catch:{ IOException | JSONException -> 0x022f }
        L_0x022f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106905Lu.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r6.A0J.size() >= 100) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List r9 = (java.util.List) r9
            X.4eN r5 = r8.A00
            com.whatsapp.profile.WebImagePicker r6 = r5.A02
            android.widget.ProgressBar r0 = r6.A06
            r7 = 8
            r0.setVisibility(r7)
            X.9Nw r0 = r6.A0C
            int r1 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.C90474aD.A1T(r1, r0)
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0026
            java.util.ArrayList r0 = r6.A0J
            int r3 = r0.size()
            r0 = 100
            r2 = 1
            if (r3 < r0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r5.A01 = r2
            android.view.View r0 = r6.A04
            if (r2 == 0) goto L_0x006f
            r0.setVisibility(r7)
            android.view.View r0 = r6.A05
            r0.setVisibility(r4)
        L_0x0035:
            r0 = 0
            r5.A00 = r0
            if (r9 == 0) goto L_0x0042
            java.util.ArrayList r0 = r6.A0J
            r9.removeAll(r0)
            r0.addAll(r9)
        L_0x0042:
            java.util.ArrayList r0 = r6.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005c
            android.widget.ListView r0 = r6.getListView()
            android.view.View r3 = r0.getEmptyView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r9 != 0) goto L_0x0060
            r0 = 2131893044(0x7f121b34, float:1.9420853E38)
            r3.setText(r0)
        L_0x005c:
            r5.notifyDataSetChanged()
            return
        L_0x0060:
            r2 = 2131893034(0x7f121b2a, float:1.9420833E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.9Nw r0 = r6.A0C
            java.lang.String r0 = r0.A02
            r1[r4] = r0
            X.C36341k9.A0s(r6, r3, r1, r2)
            goto L_0x005c
        L_0x006f:
            r0.setVisibility(r4)
            android.view.View r0 = r6.A05
            r0.setVisibility(r7)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106905Lu.A0C(java.lang.Object):void");
    }
}
