package X;

/* renamed from: X.6NM  reason: invalid class name */
public class AnonymousClass6NM {
    public final C20810yC A00;
    public final C120265rE A01;
    public final String A02;
    public final AnonymousClass6S0 A03;
    public final C160957lr A04;
    public final boolean A05;
    public final C21060yb A06;
    public final AnonymousClass6OK A07;

    public AnonymousClass6NM(C21060yb r3, C19630wG r4, C20810yC r5, AnonymousClass6OK r6, String str, C160957lr r8, boolean z) {
        this.A03 = new AnonymousClass6S0(r4.A00);
        this.A04 = r8;
        this.A00 = r5;
        this.A07 = r6;
        this.A06 = r3;
        this.A02 = str;
        this.A05 = z;
        this.A01 = new C120265rE(r3, r4, new AnonymousClass5N9());
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[Catch:{ SecurityException -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[Catch:{ SecurityException -> 0x00b6 }, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ContentProviderClient A00(android.content.Context r6, X.AnonymousClass6NM r7, X.C1271567e r8) {
        /*
            java.lang.String r4 = "app_not_installed"
            r5 = 0
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ SecurityException -> 0x00b6 }
            if (r3 == 0) goto L_0x0031
            java.util.HashMap r2 = X.AnonymousClass001.A0J()     // Catch:{ SecurityException -> 0x00b6 }
            java.lang.String r1 = r8.A02     // Catch:{ NameNotFoundException -> 0x0023 }
            r0 = 0
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0023 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "app_disabled"
            r2.put(r4, r0)     // Catch:{ NameNotFoundException -> 0x0023 }
            X.7lr r0 = r7.A04     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.Bh2(r2, r8)     // Catch:{ NameNotFoundException -> 0x0023 }
            return r5
        L_0x0023:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ SecurityException -> 0x00b6 }
            r2.put(r4, r0)     // Catch:{ SecurityException -> 0x00b6 }
            X.7lr r0 = r7.A04     // Catch:{ SecurityException -> 0x00b6 }
            r0.Bh2(r2, r8)     // Catch:{ SecurityException -> 0x00b6 }
            return r5
        L_0x0031:
            android.net.Uri r3 = r8.A00     // Catch:{ SecurityException -> 0x00b6 }
            java.lang.String r4 = r7.A02     // Catch:{ SecurityException -> 0x00b6 }
            java.lang.Boolean r0 = X.C18750th.A01     // Catch:{ SecurityException -> 0x00b6 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x00b6 }
            if (r0 != 0) goto L_0x007d
            boolean r0 = r7.A05     // Catch:{ SecurityException -> 0x00b6 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = "{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}"
        L_0x0043:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ SecurityException -> 0x00b6 }
            if (r0 != 0) goto L_0x007d
            goto L_0x0053
        L_0x004a:
            X.0yC r1 = r7.A00     // Catch:{ SecurityException -> 0x00b6 }
            r0 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r1 = r1.A09(r0)     // Catch:{ SecurityException -> 0x00b6 }
            goto L_0x0043
        L_0x0053:
            X.C18740tg.A06(r1)     // Catch:{ JSONException -> 0x0079 }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r0 = "access_library"
            org.json.JSONArray r2 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0079 }
            r1 = 0
        L_0x0061:
            int r0 = r2.length()     // Catch:{ SecurityException -> 0x00b6 }
            if (r1 >= r0) goto L_0x007d
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0072 }
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ JSONException -> 0x0072 }
            if (r0 == 0) goto L_0x0076
            goto L_0x007f
        L_0x0072:
            r0 = move-exception
            X.C18740tg.A0A(r0)     // Catch:{ SecurityException -> 0x00b6 }
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x0061
        L_0x0079:
            r0 = move-exception
            X.C18740tg.A0A(r0)     // Catch:{ SecurityException -> 0x00b6 }
        L_0x007d:
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            if (r0 == 0) goto L_0x00b4
            X.5rE r2 = r7.A01     // Catch:{ SecurityException -> 0x00b6 }
            java.lang.String r3 = r3.getAuthority()     // Catch:{ SecurityException -> 0x00b6 }
            if (r3 == 0) goto L_0x00b4
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ SecurityException -> 0x00b6 }
            if (r1 == 0) goto L_0x00b4
            r0 = 0
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r3, r0)     // Catch:{ SecurityException -> 0x00b6 }
            if (r0 == 0) goto L_0x00b4
            X.1VG r1 = r2.A01     // Catch:{ SecurityException -> 0x00b6 }
            java.lang.String r0 = r0.packageName     // Catch:{ SecurityException -> 0x00b6 }
            r1.A02(r0)     // Catch:{ SecurityException -> 0x00b6 }
            X.0yb r0 = r2.A00     // Catch:{ SecurityException -> 0x00b6 }
            X.0ya r0 = r0.A0O()     // Catch:{ SecurityException -> 0x00b6 }
            android.content.ContentResolver r2 = X.C21050ya.A00(r0)     // Catch:{ SecurityException -> 0x00b6 }
            X.0yZ r1 = r0.A01     // Catch:{ SecurityException -> 0x00b6 }
            X.2oR r0 = X.C51822oR.ACQUIRE_CONTENT_PROVIDER_CLIENT     // Catch:{ SecurityException -> 0x00b6 }
            r1.A00(r0, r3)     // Catch:{ SecurityException -> 0x00b6 }
            android.content.ContentProviderClient r0 = r2.acquireUnstableContentProviderClient(r3)     // Catch:{ SecurityException -> 0x00b6 }
            return r0
        L_0x00b4:
            r0 = 0
            return r0
        L_0x00b6:
            X.7lr r0 = r7.A04
            r0.Bh1(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NM.A00(android.content.Context, X.6NM, X.67e):android.content.ContentProviderClient");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1 A[Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0128 A[Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(android.content.Context r12, java.util.Set r13, boolean r14) {
        /*
            r11 = this;
            X.7lr r3 = r11.A04
            r3.Bh7()
            java.util.ArrayList r0 = X.C36441kJ.A15(r13)
            r3.BRB(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            if (r14 == 0) goto L_0x0034
            java.util.List r0 = X.C114175gm.A0B
            java.util.Iterator r4 = X.C90474aD.A0r(r0)
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            X.67e r1 = (X.C1271567e) r1
            X.8zq r0 = r1.A04
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x001c
            r5.add(r1)
            goto L_0x001c
        L_0x0034:
            java.util.List r0 = X.C114175gm.A0C
            java.util.Iterator r4 = X.C90474aD.A0r(r0)
        L_0x003a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            X.67e r1 = (X.C1271567e) r1
            X.8zq r0 = r1.A04
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x003a
            r5.add(r1)
            goto L_0x003a
        L_0x0052:
            java.util.Iterator r10 = r5.iterator()
        L_0x0056:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r4 = r10.next()
            X.67e r4 = (X.C1271567e) r4
            r3.BRX(r4)
            if (r14 == 0) goto L_0x00d5
            android.content.ContentProviderClient r5 = A00(r12, r11, r4)
            if (r5 == 0) goto L_0x014e
            r3.Bh3(r4)
            X.6S0 r0 = r11.A03     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            android.database.Cursor r7 = X.AnonymousClass6S0.A00(r5, r4, r3)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r7 == 0) goto L_0x00b3
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.5nQ r0 = r0.A01     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.8zq r9 = r4.A04     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            java.lang.Object r6 = r0.get(r9)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.7kh r6 = (X.C160247kh) r6     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r6 == 0) goto L_0x00b3
        L_0x008a:
            boolean r0 = r7.moveToNext()     // Catch:{ 78U -> 0x00ac }
            if (r0 == 0) goto L_0x00b8
            X.8zq r0 = X.C188598zq.A01     // Catch:{ 78U -> 0x00ac }
            if (r9 == r0) goto L_0x009d
            X.8zq r0 = X.C188598zq.A05     // Catch:{ 78U -> 0x00ac }
            if (r9 == r0) goto L_0x009d
            X.6TE r1 = r6.Bw2(r7)     // Catch:{ 78U -> 0x00ac }
            goto L_0x00a1
        L_0x009d:
            X.6TE r1 = r6.Bw3(r7)     // Catch:{ 78U -> 0x00ac }
        L_0x00a1:
            if (r1 == 0) goto L_0x008a
            X.66Y r0 = new X.66Y     // Catch:{ 78U -> 0x00ac }
            r0.<init>(r4, r1)     // Catch:{ 78U -> 0x00ac }
            r8.add(r0)     // Catch:{ 78U -> 0x00ac }
            goto L_0x008a
        L_0x00ac:
            r0 = move-exception
            r3.Bja(r4, r0)     // Catch:{ all -> 0x0112 }
            r7.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
        L_0x00b3:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x00bb
        L_0x00b8:
            r7.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
        L_0x00bb:
            boolean r0 = r8.isEmpty()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            r2.addAll(r8)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            r3.Bh0(r4)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            r0 = 24
            if (r1 < r0) goto L_0x00d1
            r5.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0056
        L_0x00d1:
            r5.release()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0056
        L_0x00d5:
            android.content.ContentProviderClient r6 = A00(r12, r11, r4)
            if (r6 == 0) goto L_0x014e
            r3.Bh3(r4)
            X.6S0 r0 = r11.A03     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            android.database.Cursor r7 = X.AnonymousClass6S0.A00(r6, r4, r3)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r7 == 0) goto L_0x011a
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.5nQ r0 = r0.A01     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.8zq r1 = r4.A04     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            java.lang.Object r5 = r0.get(r1)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            X.7kh r5 = (X.C160247kh) r5     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r5 == 0) goto L_0x011a
        L_0x00f8:
            boolean r0 = r7.moveToNext()     // Catch:{ 78U -> 0x010d }
            if (r0 == 0) goto L_0x011f
            X.6TE r1 = r5.Bw2(r7)     // Catch:{ 78U -> 0x010d }
            if (r1 == 0) goto L_0x00f8
            X.66Y r0 = new X.66Y     // Catch:{ 78U -> 0x010d }
            r0.<init>(r4, r1)     // Catch:{ 78U -> 0x010d }
            r8.add(r0)     // Catch:{ 78U -> 0x010d }
            goto L_0x00f8
        L_0x010d:
            r0 = move-exception
            r3.Bja(r4, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0117
        L_0x0112:
            r0 = move-exception
            r7.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            throw r0     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
        L_0x0117:
            r7.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
        L_0x011a:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0122
        L_0x011f:
            r7.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
        L_0x0122:
            boolean r0 = r8.isEmpty()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            r2.addAll(r8)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            r3.Bh0(r4)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            r0 = 24
            if (r1 < r0) goto L_0x0139
            r6.close()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0056
        L_0x0139:
            r6.release()     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0056
        L_0x013e:
            r3.Bgz(r4)     // Catch:{ RemoteException -> 0x0148, SecurityException -> 0x0143 }
            goto L_0x0056
        L_0x0143:
            r3.Bh1(r4)
            goto L_0x0056
        L_0x0148:
            r0 = move-exception
            r3.Bgy(r0, r4)
            goto L_0x0056
        L_0x014e:
            r0 = 0
            r3.Bh2(r0, r4)
            goto L_0x0056
        L_0x0154:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NM.A01(android.content.Context, java.util.Set, boolean):java.util.List");
    }
}
