package X;

import android.content.Context;

/* renamed from: X.6MN  reason: invalid class name */
public class AnonymousClass6MN {
    public Context A00;

    public AnonymousClass6MN(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.put("Latitude", "");
        r2.put("Longitude", "");
        r2.put("Provider", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject A00() {
        /*
            r10 = this;
            java.lang.String r9 = ""
            android.content.Context r1 = r10.A00
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            java.lang.String r0 = "location"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.location.LocationManager r4 = (android.location.LocationManager) r4
            java.util.List r3 = r4.getAllProviders()
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = r5.checkPermission(r0, r1)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = r5.checkPermission(r0, r1)
            org.json.JSONObject r8 = X.C36441kJ.A1B()
            java.lang.String r0 = "Latitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Longitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Provider"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
        L_0x003b:
            if (r2 == 0) goto L_0x003f
            if (r1 != 0) goto L_0x0087
        L_0x003f:
            int r2 = r3.size()     // Catch:{ Exception -> 0x0087 }
        L_0x0043:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0087
            java.lang.String r1 = X.C36401kF.A0s(r3, r2)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r0 = "network"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0087 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = X.C36401kF.A0s(r3, r2)     // Catch:{ Exception -> 0x0087 }
            android.location.Location r7 = r4.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x0087 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r6 = X.C36401kF.A0s(r3, r2)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r5 = "Provider"
            java.lang.String r4 = "Longitude"
            java.lang.String r3 = "Latitude"
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x0087 }
            double r0 = r7.getLatitude()     // Catch:{ Exception -> 0x007d }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x007d }
            double r0 = r7.getLongitude()     // Catch:{ Exception -> 0x007d }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x007d }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x007d }
            return r2
        L_0x007d:
            r2.put(r3, r9)     // Catch:{ JSONException -> 0x0086 }
            r2.put(r4, r9)     // Catch:{ JSONException -> 0x0086 }
            r2.put(r5, r9)     // Catch:{ JSONException -> 0x0086 }
        L_0x0086:
            return r2
        L_0x0087:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MN.A00():org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(130:0|1|2|3|4|5|6|7|8|9|(2:10|(2:12|(2:13|(3:15|(3:17|18|(1:193)(0))(1:192)|190)(1:191)))(2:189|20))|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|59|(2:61|62)(2:63|(1:65)(3:66|(1:69)|70))|73|74|75|(2:77|(2:79|(2:81|(1:83))(1:84))(1:85))(1:86)|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|122|123|124|125|126|129|130|131|(2:132|133)|136|137|138|139|(1:149)(2:143|(3:145|(2:148|146)|194))|(2:151|152)|153|155|156|(1:158)|159|160|161|162|(1:164)|165|166|167|168|169|170|171|172|173|174|175|176|(1:178)|179|180|181|184|185|186|188) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0221 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0235 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x024d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0261 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x030b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0378 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0109 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x012d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x013f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0151 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0201 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0211 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008f A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b8 A[Catch:{ Exception -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f0 A[Catch:{ Exception -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f3 A[SYNTHETIC, Splitter:B:151:0x02f3] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0303 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0373 A[Catch:{ Exception -> 0x0378 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03e3 A[Catch:{ JSONException -> 0x0428 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0189 A[Catch:{ Exception -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cd A[Catch:{ Exception -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01df A[Catch:{ Exception -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01() {
        /*
            r11 = this;
            org.json.JSONObject r5 = X.C36441kJ.A1B()
            java.lang.String r1 = "platform"
            java.lang.String r0 = "ANDROID"
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "deviceModel"
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "os"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "osName"
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "locale"
            android.content.Context r3 = r11.A00     // Catch:{ JSONException -> 0x0428 }
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r3)     // Catch:{ JSONException -> 0x0428 }
            java.util.Locale r0 = r0.locale     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "timeZone"
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = r0.getID()     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "advertisingId"
            java.lang.String r10 = ""
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r6 = "screenResolution"
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ JSONException -> 0x0428 }
            r4.<init>()     // Catch:{ JSONException -> 0x0428 }
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ JSONException -> 0x0428 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ JSONException -> 0x0428 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ JSONException -> 0x0428 }
            r0.getMetrics(r4)     // Catch:{ JSONException -> 0x0428 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "width"
            int r0 = r4.widthPixels     // Catch:{ Exception -> 0x0068 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "height"
            int r0 = r4.heightPixels     // Catch:{ Exception -> 0x0068 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            X.C90504aG.A1J(r2, r6, r5)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "deviceName"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "device_name"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r6 = "ipAddress"
            r4 = r10
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x00c5 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x00c5 }
        L_0x0089:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x00c5 }
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch:{ Exception -> 0x00c5 }
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch:{ Exception -> 0x00c5 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x00c5 }
        L_0x00a1:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x00c5 }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ Exception -> 0x00c5 }
            boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x00c5 }
            if (r0 != 0) goto L_0x00a1
            java.lang.String r4 = r1.getHostAddress()     // Catch:{ Exception -> 0x00c5 }
            r0 = 58
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x00c5 }
            boolean r0 = X.C36431kI.A1P(r0)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00c5
        L_0x00c4:
            r4 = r10
        L_0x00c5:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "latitude"
            org.json.JSONObject r1 = r11.A00()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "Latitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "longitude"
            org.json.JSONObject r1 = r11.A00()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "Longitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r4 = "deviceId"
            r2 = 0
            android.content.Context r0 = r3.getApplicationContext()     // Catch:{ Exception -> 0x00f7 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "subscriberId"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0109 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x0109 }
        L_0x0109:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "imie"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x011b }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "networkCountryISO"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x012d }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r0.getNetworkCountryIso()     // Catch:{ Exception -> 0x012d }
        L_0x012d:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "networkOperator"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x013f }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x013f }
            java.lang.String r1 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x013f }
        L_0x013f:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "networkOperatorName"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0151 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0151 }
            java.lang.String r1 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x0151 }
        L_0x0151:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "networkType"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0168 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0168 }
            int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0168 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0428 }
            goto L_0x016c
        L_0x0168:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0428 }
        L_0x016c:
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r6 = "phoneCount"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r4 = "phone"
            r7 = 1
            r0 = 23
            if (r1 < r0) goto L_0x0189
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x01b7 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x01b7 }
            int r7 = r0.getPhoneCount()     // Catch:{ Exception -> 0x01b7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bb
        L_0x0189:
            r0 = 22
            if (r1 < r0) goto L_0x019e
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r3)     // Catch:{ Exception -> 0x01b7 }
            java.util.List r0 = r0.getActiveSubscriptionInfoList()     // Catch:{ Exception -> 0x01b7 }
            int r7 = r0.size()     // Catch:{ Exception -> 0x01b7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bb
        L_0x019e:
            java.lang.Object r2 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x01b7 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x01b7 }
            r0 = 0
            java.lang.String r1 = r2.getDeviceId(r0)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = r2.getDeviceId(r7)     // Catch:{ Exception -> 0x01b7 }
            if (r1 == 0) goto L_0x01b2
            if (r0 == 0) goto L_0x01b2
            r7 = 2
        L_0x01b2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bb
        L_0x01b7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x0428 }
        L_0x01bb:
            r5.put(r6, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r6 = "phoneType"
            r2 = r10
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x01e1 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x01e1 }
            int r1 = r0.getPhoneType()     // Catch:{ Exception -> 0x01e1 }
            if (r1 == 0) goto L_0x01df
            r0 = 1
            if (r1 == r0) goto L_0x01dc
            r0 = 2
            if (r1 == r0) goto L_0x01d9
            r0 = 3
            if (r1 != r0) goto L_0x01e1
            java.lang.String r2 = "SIP"
            goto L_0x01e1
        L_0x01d9:
            java.lang.String r2 = "CDMA"
            goto L_0x01e1
        L_0x01dc:
            java.lang.String r2 = "GSM"
            goto L_0x01e1
        L_0x01df:
            java.lang.String r2 = "NONE"
        L_0x01e1:
            r5.put(r6, r2)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "simCountryISO"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x01f1 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r1 = r0.getSimCountryIso()     // Catch:{ Exception -> 0x01f1 }
        L_0x01f1:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "simOperator"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0201 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0201 }
            java.lang.String r1 = r0.getSimOperator()     // Catch:{ Exception -> 0x0201 }
        L_0x0201:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "simOperatorName"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0211 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0211 }
            java.lang.String r1 = r0.getSimOperatorName()     // Catch:{ Exception -> 0x0211 }
        L_0x0211:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "simSerialNumber"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0221 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0221 }
            java.lang.String r1 = r0.getSimSerialNumber()     // Catch:{ Exception -> 0x0221 }
        L_0x0221:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "simState"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0235 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0235 }
            int r0 = r0.getSimState()     // Catch:{ Exception -> 0x0235 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0235 }
        L_0x0235:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "isNetworkRoaming"
            java.lang.Boolean r1 = X.C36381kD.A0j()     // Catch:{ JSONException -> 0x0428 }
            r6 = r1
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x024d }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x024d }
            boolean r0 = r0.isNetworkRoaming()     // Catch:{ Exception -> 0x024d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x024d }
        L_0x024d:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "isSmsCapable"
            r1 = r6
            java.lang.Object r0 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0261 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0261 }
            boolean r0 = r0.isSmsCapable()     // Catch:{ Exception -> 0x0261 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0261 }
        L_0x0261:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "wifiMacAddress"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0277 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x0277 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x0277 }
            java.lang.String r0 = r0.getMacAddress()     // Catch:{ Exception -> 0x0277 }
            goto L_0x0278
        L_0x0277:
            r0 = 0
        L_0x0278:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "bssid"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x028e }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x028e }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x028e }
            goto L_0x028f
        L_0x028e:
            r0 = 0
        L_0x028f:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "ssid"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x02a5 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x02a5 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r0 = r0.getSSID()     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02a6
        L_0x02a5:
            r0 = 0
        L_0x02a6:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r9 = "bondedDevice"
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x02f7 }
            r8 = 0
            if (r1 == 0) goto L_0x02f0
            boolean r0 = r1.isEnabled()     // Catch:{ Exception -> 0x02f7 }
            if (r0 == 0) goto L_0x02f0
            java.util.Set r1 = r1.getBondedDevices()     // Catch:{ Exception -> 0x02f7 }
            org.json.JSONArray r7 = X.C90524aI.A0u()     // Catch:{ Exception -> 0x02f7 }
            int r0 = r1.size()     // Catch:{ Exception -> 0x02f7 }
            if (r0 <= 0) goto L_0x02f1
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x02f7 }
        L_0x02ca:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x02f7 }
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r2 = r4.next()     // Catch:{ Exception -> 0x02f7 }
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2     // Catch:{ Exception -> 0x02f7 }
            org.json.JSONObject r8 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r1 = "bluetoothName"
            java.lang.String r0 = r2.getName()     // Catch:{ Exception -> 0x02f7 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r1 = "bluetoothMacAddress"
            java.lang.String r0 = r2.getAddress()     // Catch:{ Exception -> 0x02f7 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x02f7 }
            r7.put(r8)     // Catch:{ Exception -> 0x02f7 }
            goto L_0x02ca
        L_0x02f0:
            r7 = r8
        L_0x02f1:
            if (r8 == 0) goto L_0x02f7
            java.lang.String r10 = r7.toString()     // Catch:{ JSONException -> 0x0428 }
        L_0x02f7:
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "bluetoothIsEnabled"
            r1 = r6
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x030b }
            if (r0 == 0) goto L_0x030b
            boolean r0 = r0.isEnabled()     // Catch:{ Exception -> 0x030b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x030b }
        L_0x030b:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "fingerprint"
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "hardware"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "id"
            java.lang.String r0 = android.os.Build.ID     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "product"
            java.lang.String r0 = android.os.Build.PRODUCT     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "radio"
            java.lang.String r0 = android.os.Build.RADIO     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "serial"
            java.lang.String r0 = android.os.Build.SERIAL     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "user"
            java.lang.String r0 = android.os.Build.USER     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "securityPatch"
            java.lang.String r0 = android.os.Build.VERSION.SECURITY_PATCH     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "androidID"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r4 = "isDataRoaming"
            r2 = 0
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = "data_roaming"
            int r1 = android.provider.Settings.Secure.getInt(r1, r0)     // Catch:{ Exception -> 0x0378 }
            r0 = 1
            if (r1 != r0) goto L_0x0374
            r2 = 1
        L_0x0374:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0378 }
        L_0x0378:
            r5.put(r4, r6)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "autoTime"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "auto_time"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            r6 = 1
            java.lang.String r4 = "1"
            boolean r0 = X.C36361kB.A1a(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "autoTimeZone"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "auto_time_zone"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            boolean r0 = X.C36361kB.A1a(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "developmentSettingsEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "development_settings_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            boolean r0 = X.C36361kB.A1a(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "httpProxy"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "http_proxy"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "networkPreference"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "network_preference"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r2 = "usbMassStorageEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r0 = "usb_mass_storage_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            if (r0 == r4) goto L_0x03e4
            r6 = 0
        L_0x03e4:
            r5.put(r2, r6)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "is24HoursFormat"
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r3)     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "isSafeMode"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0428 }
            boolean r0 = r0.isSafeMode()     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r1 = "systemAvailableFeature"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0428 }
            android.content.pm.FeatureInfo[] r0 = r0.getSystemAvailableFeatures()     // Catch:{ JSONException -> 0x0428 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r4 = "totalBytes"
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0423 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0423 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x0423 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0423 }
            long r2 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x0423 }
            long r0 = r0.getBlockCountLong()     // Catch:{ Exception -> 0x0423 }
            long r0 = r0 * r2
            goto L_0x0425
        L_0x0423:
            r0 = -1
        L_0x0425:
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0428 }
        L_0x0428:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MN.A01():java.lang.String");
    }
}
