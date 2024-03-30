package X;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5MQ  reason: invalid class name */
public class AnonymousClass5MQ extends C132446Tt {
    public int A00;
    public Location A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ C133586Zc A05;

    public AnonymousClass5MQ(Location location, C133586Zc r2, String str, int i, boolean z, boolean z2) {
        this.A05 = r2;
        this.A01 = location;
        this.A02 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:28|29|(1:31)|32|33|34|35|(1:37)|38|(3:40|41|(1:43))|44|45|(3:47|(12:50|51|52|(1:56)|57|(9:59|(1:61)|63|64|(3:66|(1:70)|71)|72|(3:76|(1:80)|81)|82|(3:86|(1:90)|91))|92|(2:94|(1:(2:96|(1:101)(3:157|100|102))(1:158)))|109|156|114|48)|154)(1:115)|116|117|118|(1:120)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029a, code lost:
        if (r12 != null) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x029c, code lost:
        r1 = r12.optJSONObject(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a2, code lost:
        if (r1 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a4, code lost:
        r0 = r1.optString("prefix");
        r10.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ac, code lost:
        if (r0 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ae, code lost:
        r10.A05 = X.AnonymousClass000.A0q("64.png", X.AnonymousClass000.A0v(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0209, code lost:
        if (r1.length() == 0) goto L_0x020b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0169 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ca A[Catch:{ JSONException -> 0x02c0, all -> 0x02fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f7 A[Catch:{ all -> 0x0303, JSONException -> 0x031c, IOException -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0070 A[EDGE_INSN: B:151:0x0070->B:13:0x0070 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0171 A[Catch:{ JSONException -> 0x02c0, all -> 0x02fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            r1 = r24
            X.6Zc r0 = r1.A05
            X.6LW r8 = r0.A1D
            android.location.Location r7 = r1.A01
            int r6 = r1.A00
            java.lang.String r5 = r1.A02
            X.5Sh r1 = r0.A0R
            X.5Sh r0 = X.C108135Sh.EVENT_MODE
            boolean r22 = X.C36371kC.A1W(r1, r0)
            if (r5 != 0) goto L_0x0018
            java.lang.String r5 = ""
        L_0x0018:
            java.util.ArrayList r14 = r8.A05
            java.util.Iterator r12 = r14.iterator()
        L_0x001e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r12.next()
            X.6c8 r4 = (X.C135096c8) r4
            java.lang.String r0 = r4.A0C
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x001e
            android.location.Location r0 = r4.A00()
            X.C18740tg.A06(r0)
            float r0 = r0.distanceTo(r7)
            double r0 = (double) r0
            int r11 = r4.A0A
            int r2 = r11 + r6
            double r2 = (double) r2
            r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r2 * r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r9
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x001e
            int r0 = X.AnonymousClass000.A05(r11, r6)
            double r0 = (double) r0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x001e
            java.util.List r0 = r4.A0D
            r0.size()
            r0 = 1
            r4.A06 = r0
            java.lang.String r0 = r8.A04
            r4.A05 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            int r0 = r0.getAndIncrement()
            r4.A00 = r0
            X.AnonymousClass6LW.A00(r4, r8)
        L_0x0070:
            X.C18740tg.A06(r4)
            java.lang.Integer r0 = r4.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x008b
            r14.add(r4)
            int r1 = r14.size()
            r0 = 12
            if (r1 <= r0) goto L_0x008b
            r0 = 0
            r14.remove(r0)
        L_0x008b:
            if (r22 == 0) goto L_0x035d
            java.util.List r6 = r4.A0D
            java.util.Iterator r5 = r6.iterator()
        L_0x0093:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0358
            java.lang.Object r3 = r5.next()
            com.whatsapp.location.PlaceInfo r3 = (com.whatsapp.location.PlaceInfo) r3
            android.location.Location r2 = r3.A0C
            if (r2 != 0) goto L_0x00b6
            java.lang.String r0 = ""
            android.location.Location r2 = new android.location.Location
            r2.<init>(r0)
            double r0 = r3.A01
            r2.setLatitude(r0)
            double r0 = r3.A02
            r2.setLongitude(r0)
            r3.A0C = r2
        L_0x00b6:
            float r0 = r2.distanceTo(r7)
            double r0 = (double) r0
            r3.A00 = r0
            goto L_0x0093
        L_0x00be:
            r21 = 1
            r2 = 0
        L_0x00c1:
            r10 = 3
            r20 = 4
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            X.6c8 r4 = new X.6c8     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r4.<init>(r7, r5, r6)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r3.<init>()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = X.AnonymousClass6JD.A0D     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r3.encodedPath(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r1 = X.AnonymousClass6JD.A0F     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "client_secret"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r1 = X.AnonymousClass6JD.A0E     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "client_id"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r1 = X.AnonymousClass6JD.A0G     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "v"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            double r0 = r7.getLatitude()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r9.append(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = ","
            r9.append(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            double r0 = r7.getLongitude()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r9.append(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r1 = r9.toString()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "ll"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r0 = 99999(0x1869f, float:1.40128E-40)
            int r0 = java.lang.Math.min(r6, r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "radius"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = "query"
            r3.appendQueryParameter(r0, r5)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
        L_0x0127:
            java.lang.String r1 = X.C90474aD.A0b(r3)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            X.13E r0 = r8.A03     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            X.6v1 r11 = r0.A05(r1)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.String r0 = "X-RateLimit-Limit"
            java.net.HttpURLConnection r3 = r11.A01     // Catch:{ all -> 0x02fe }
            java.lang.String r9 = r3.getHeaderField(r0)     // Catch:{ all -> 0x02fe }
            if (r9 == 0) goto L_0x0144
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Limit:"
            X.C36321k7.A1Q(r0, r9, r1)     // Catch:{ all -> 0x02fe }
        L_0x0144:
            java.lang.String r0 = "X-RateLimit-Remaining"
            java.lang.String r9 = r3.getHeaderField(r0)     // Catch:{ all -> 0x02fe }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Remaining:"
            X.C36321k7.A1Q(r0, r9, r1)     // Catch:{ all -> 0x02fe }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x02fe }
            if (r0 != 0) goto L_0x0169
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0169 }
            if (r0 != 0) goto L_0x0169
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0169 }
            r4.A02 = r0     // Catch:{ NumberFormatException -> 0x0169 }
            java.lang.String r0 = "error_out_of_quota"
            r4.A04 = r0     // Catch:{ NumberFormatException -> 0x0169 }
        L_0x0169:
            int r1 = r3.getResponseCode()     // Catch:{ all -> 0x02fe }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x02ca
            X.0ww r3 = r8.A01     // Catch:{ all -> 0x02fe }
            r1 = 0
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02fe }
            X.5RE r0 = r11.B8D(r3, r1, r0)     // Catch:{ all -> 0x02fe }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r0)     // Catch:{ all -> 0x02fe }
            java.util.List r0 = r4.A0D     // Catch:{ all -> 0x02fe }
            r23 = r0
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = "venues"
            org.json.JSONArray r17 = r1.getJSONArray(r0)     // Catch:{ all -> 0x02fe }
            r13 = 0
        L_0x0193:
            int r0 = r17.length()     // Catch:{ all -> 0x02fe }
            if (r13 >= r0) goto L_0x02e3
            r0 = r17
            org.json.JSONObject r12 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x02c0 }
            com.whatsapp.location.PlaceInfo r10 = new com.whatsapp.location.PlaceInfo     // Catch:{ JSONException -> 0x02c0 }
            r10.<init>()     // Catch:{ JSONException -> 0x02c0 }
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)     // Catch:{ JSONException -> 0x02c0 }
            r0 = 3
            r10.A03 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A06 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A08 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "id"
            java.lang.String r3 = r12.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A07 = r3     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = r10.A08     // Catch:{ JSONException -> 0x02c0 }
            r9 = 0
            if (r0 == 0) goto L_0x01ce
            int r0 = r0.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r0 != 0) goto L_0x01da
        L_0x01ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "https://foursquare.com/v/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ JSONException -> 0x02c0 }
            r10.A08 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x01da:
            java.lang.String r0 = "location"
            org.json.JSONObject r3 = r12.getJSONObject(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r3 == 0) goto L_0x0274
            java.lang.String r0 = "lat"
            double r0 = r3.optDouble(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A01 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "lng"
            double r0 = r3.optDouble(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A02 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "address"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
            r10.A09 = r0     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "city"
            java.lang.String r1 = r3.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r1 == 0) goto L_0x020b
            int r15 = r1.length()     // Catch:{ JSONException -> 0x02c0 }
            r0 = 0
            if (r15 != 0) goto L_0x020c
        L_0x020b:
            r0 = 1
        L_0x020c:
            java.lang.String r15 = ", "
            if (r0 != 0) goto L_0x0226
            java.lang.String r0 = r10.A04     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x0220
            int r16 = r0.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r16 == 0) goto L_0x0220
            java.lang.String r0 = X.C36321k7.A0D(r0, r15)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x0220:
            java.lang.String r0 = X.C36321k7.A0D(r0, r1)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x0226:
            java.lang.String r0 = "state"
            java.lang.String r1 = r3.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r1 == 0) goto L_0x024a
            int r0 = r1.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = r10.A04     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x0244
            int r16 = r0.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r16 == 0) goto L_0x0244
            java.lang.String r0 = X.C36321k7.A0D(r0, r15)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x0244:
            java.lang.String r0 = X.C36321k7.A0D(r0, r1)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x024a:
            java.lang.String r0 = "postalCode"
            java.lang.String r3 = r3.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r3 == 0) goto L_0x0274
            int r0 = r3.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x0274
            java.lang.String r1 = r10.A04     // Catch:{ JSONException -> 0x02c0 }
            if (r1 == 0) goto L_0x026e
            int r0 = r1.length()     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x026e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)     // Catch:{ JSONException -> 0x02c0 }
            r0 = 32
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r1     // Catch:{ JSONException -> 0x02c0 }
        L_0x026e:
            java.lang.String r0 = X.C36321k7.A0D(r1, r3)     // Catch:{ JSONException -> 0x02c0 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x0274:
            java.lang.String r0 = "categories"
            org.json.JSONArray r15 = r12.optJSONArray(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r15 == 0) goto L_0x02ba
            org.json.JSONObject r12 = r15.optJSONObject(r9)     // Catch:{ JSONException -> 0x02c0 }
            int r3 = r15.length()     // Catch:{ JSONException -> 0x02c0 }
        L_0x0284:
            if (r9 >= r3) goto L_0x029a
            org.json.JSONObject r1 = r15.optJSONObject(r9)     // Catch:{ JSONException -> 0x02c0 }
            if (r1 == 0) goto L_0x0295
            java.lang.String r0 = "primary"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x0295
            goto L_0x0298
        L_0x0295:
            int r9 = r9 + 1
            goto L_0x0284
        L_0x0298:
            r12 = r1
            goto L_0x029c
        L_0x029a:
            if (r12 == 0) goto L_0x02ba
        L_0x029c:
            java.lang.String r0 = "icon"
            org.json.JSONObject r1 = r12.optJSONObject(r0)     // Catch:{ JSONException -> 0x02c0 }
            if (r1 == 0) goto L_0x02ba
            java.lang.String r0 = "prefix"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x02c0 }
            r10.A05 = r0     // Catch:{ JSONException -> 0x02c0 }
            if (r0 == 0) goto L_0x02ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ JSONException -> 0x02c0 }
            java.lang.String r0 = "64.png"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ JSONException -> 0x02c0 }
            r10.A05 = r0     // Catch:{ JSONException -> 0x02c0 }
        L_0x02ba:
            r0 = r23
            r0.add(r10)     // Catch:{ JSONException -> 0x02c0 }
            goto L_0x02c6
        L_0x02c0:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/foursquare/json-exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02fe }
        L_0x02c6:
            int r13 = r13 + 1
            goto L_0x0193
        L_0x02ca:
            java.lang.Integer r0 = X.C36371kC.A0p()     // Catch:{ all -> 0x02fe }
            r4.A02 = r0     // Catch:{ all -> 0x02fe }
            int r0 = r3.getResponseCode()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02fe }
            r4.A04 = r3     // Catch:{ all -> 0x02fe }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02fe }
            java.lang.String r0 = "placelist/getplaces/foursquare/error-status:"
            X.C36321k7.A1P(r0, r3, r1)     // Catch:{ all -> 0x02fe }
        L_0x02e3:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02fe }
            long r0 = r0 - r18
            r4.A01 = r0     // Catch:{ all -> 0x02fe }
            java.util.List r0 = r4.A0D     // Catch:{ all -> 0x02fe }
            r0.size()     // Catch:{ all -> 0x02fe }
            r11.close()     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            java.lang.Integer r0 = r4.A02     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            if (r0 != 0) goto L_0x0331
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            r4.A02 = r0     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
            goto L_0x0331
        L_0x02fe:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0303 }
            goto L_0x0307
        L_0x0303:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
        L_0x0307:
            throw r1     // Catch:{ JSONException -> 0x031c, IOException -> 0x0308 }
        L_0x0308:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/io-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.6c8 r4 = new X.6c8
            r4.<init>(r7, r5, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r4.A02 = r0
            java.lang.String r0 = "error_communication"
            goto L_0x032f
        L_0x031c:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/json-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.6c8 r4 = new X.6c8
            r4.<init>(r7, r5, r6)
            java.lang.Integer r0 = X.C36371kC.A0p()
            r4.A02 = r0
            java.lang.String r0 = "error_json"
        L_0x032f:
            r4.A04 = r0
        L_0x0331:
            java.lang.String r0 = r8.A04
            r4.A05 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            int r0 = r0.getAndIncrement()
            r4.A00 = r0
            X.AnonymousClass6LW.A00(r4, r8)
            java.util.List r0 = r4.A0D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r0 = r4.A02
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x0070
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x0070
            goto L_0x00c1
        L_0x0358:
            X.762 r0 = X.AnonymousClass762.A00
            java.util.Collections.sort(r6, r0)
        L_0x035d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MQ.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C1264964g r1;
        C135096c8 r12 = (C135096c8) obj;
        if (!C36431kI.A1Y(this)) {
            C133586Zc r9 = this.A05;
            r9.A0W = r12;
            r9.A0M.setVisibility(8);
            r9.A0N.setVisibility(8);
            boolean z = false;
            if (r9.A0W.A0D.isEmpty()) {
                r9.A10.A06(R.string.f12nameremoved, 1);
                C36341k9.A13(r9.A0P, R.id.places_empty, 0);
            } else {
                C36341k9.A13(r9.A0P, R.id.places_empty, 8);
            }
            C133586Zc.A0A(r9);
            C133586Zc.A0C(r9);
            r9.A0N();
            if (this.A04 && !r9.A0W.A0D.isEmpty()) {
                ArrayList A0I = AnonymousClass001.A0I();
                for (PlaceInfo placeInfo : r9.A0W.A0D) {
                    A0I.add(C90524aI.A0F(placeInfo.A01, placeInfo.A02));
                }
                if (r9.A0W.A0D.size() <= 1) {
                    z = true;
                }
                AnonymousClass67D r122 = new AnonymousClass67D();
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    r122.A01((LatLng) it.next());
                }
                LatLngBounds A002 = r122.A00();
                LatLng latLng = A002.A00;
                double d = latLng.A00;
                LatLng latLng2 = A002.A01;
                double d2 = latLng2.A00;
                double d3 = latLng.A01;
                double d4 = latLng2.A01;
                double d5 = (d - d2) / 10.0d;
                double d6 = (d3 - d4) / 10.0d;
                r122.A01(C90524aI.A0F(d + d5, d3 + d6));
                r122.A01(C90524aI.A0F(d2 - d5, d4 - d6));
                LatLngBounds A003 = r122.A00();
                C162837pE r13 = (C162837pE) r9;
                if (r13.A02 != 0) {
                    LocationPicker2 locationPicker2 = (LocationPicker2) r13.A01;
                    C117345m7 r14 = locationPicker2.A0U;
                    if (r14 != null) {
                        Context context = locationPicker2.A00.getContext();
                        if (z) {
                            C129186Fs r11 = r14.A00;
                            LatLng latLng3 = A003.A01;
                            double d7 = latLng3.A00;
                            LatLng latLng4 = A003.A00;
                            double d8 = (d7 + latLng4.A00) / 2.0d;
                            double d9 = latLng4.A01;
                            double d10 = latLng3.A01;
                            if (d10 > d9) {
                                d9 += 360.0d;
                            }
                            r11.A09(AnonymousClass6UP.A02(C90524aI.A0F(d8, (d9 + d10) / 2.0d), 15.0f));
                        } else {
                            r14.A00.A09(AnonymousClass6UP.A03(A003, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
                        }
                    }
                } else {
                    LocationPicker locationPicker = (LocationPicker) r13.A01;
                    if (locationPicker.A03 != null) {
                        C135076c5 r3 = new C135076c5(C134976bv.A02(A003.A01), C134976bv.A02(A003.A00));
                        C139266jV r2 = locationPicker.A03;
                        if (z) {
                            r1 = C1264964g.A00(r3.A00(), 15.0f);
                        } else {
                            int dimensionPixelSize = locationPicker.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                            r1 = new C1264964g();
                            r1.A07 = r3;
                            r1.A05 = dimensionPixelSize;
                        }
                        r2.A08(r1);
                    }
                }
            }
            if (this.A03 && r9.A0e) {
                r9.A0e = false;
                r9.A0V(Float.valueOf(-0.5f), true);
            }
        }
    }
}
