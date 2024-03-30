package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6O0  reason: invalid class name */
public final class AnonymousClass6O0 {
    public AnonymousClass60V A00;
    public AnonymousClass17Y A01;
    public C19770wU A02;

    public static final ArrayList A00(Context context, AnonymousClass6O0 r3, String str, String str2) {
        if (str2.equals("active_account")) {
            return r3.A01(context, str);
        }
        if (str2.equals("inactive_logged_in_accounts")) {
            return r3.A02(context, str);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.addAll(r3.A01(context, str));
        A0I.addAll(r3.A02(context, str));
        return A0I;
    }

    public final ArrayList A01(Context context, String str) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            AnonymousClass60V r1 = this.A00;
            if (r1 != null) {
                List<AnonymousClass66Y> A012 = r1.A00("wa_android_bloks_native_auth", new C1510677x(), false).A01(context.getApplicationContext(), new AnonymousClass5Z3(str), false);
                AnonymousClass00C.A0B(A012);
                for (AnonymousClass66Y r0 : A012) {
                    AnonymousClass6TE r12 = r0.A01;
                    String str2 = r12.A02.A02;
                    String str3 = r12.A00;
                    HashMap A0J = AnonymousClass001.A0J();
                    A0J.put("user_id", str2);
                    A0J.put("auth_token", str3);
                    A0J.put("account_type", str);
                    A0J.put("app_source", str);
                    A0J.put("account_source", "active_account");
                    A0I.add(A0J);
                }
                return A0I;
            }
            throw C36331k8.A0d("ssoProviderRepositoryFactory");
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ all -> 0x01b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(android.content.Context r27, java.lang.String r28) {
        /*
            r26 = this;
            java.lang.String r4 = "wa_android_bloks_native_auth"
            r3 = 0
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "Facebook"
            r10 = r28
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.8zq r0 = X.C188598zq.A01
        L_0x0017:
            r2.add(r0)
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "Instagram"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0026
            X.8zq r0 = X.C188598zq.A04
            goto L_0x0017
        L_0x0026:
            r0 = r26
            X.60V r1 = r0.A00     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x01ab
            X.77w r0 = new X.77w     // Catch:{ all -> 0x01b2 }
            r0.<init>()     // Catch:{ all -> 0x01b2 }
            X.6NM r8 = r1.A00(r4, r0, r3)     // Catch:{ all -> 0x01b2 }
            android.content.Context r13 = r27.getApplicationContext()     // Catch:{ all -> 0x01b2 }
            X.7lr r7 = r8.A04     // Catch:{ all -> 0x01b2 }
            r7.Bh7()     // Catch:{ all -> 0x01b2 }
            r7.BRB(r2)     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r17 = r2.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x0049:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0172
            java.lang.Object r4 = r17.next()     // Catch:{ all -> 0x01b2 }
            X.8zq r4 = (X.C188598zq) r4     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01b2 }
            java.util.List r0 = X.C114175gm.A0A     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r2 = X.C90474aD.A0r(r0)     // Catch:{ all -> 0x01b2 }
        L_0x005f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01b2 }
            X.67e r1 = (X.C1271567e) r1     // Catch:{ all -> 0x01b2 }
            X.8zq r0 = r1.A04     // Catch:{ all -> 0x01b2 }
            if (r4 != r0) goto L_0x005f
            r3.add(r1)     // Catch:{ all -> 0x01b2 }
            goto L_0x005f
        L_0x0073:
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x0077:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r6 = r16.next()     // Catch:{ all -> 0x01b2 }
            X.67e r6 = (X.C1271567e) r6     // Catch:{ all -> 0x01b2 }
            r7.BRX(r6)     // Catch:{ all -> 0x01b2 }
            android.content.ContentProviderClient r1 = X.AnonymousClass6NM.A00(r13, r8, r6)     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x016c
            r7.Bh3(r6)     // Catch:{ all -> 0x01b2 }
            X.6S0 r5 = r8.A03     // Catch:{ RemoteException -> 0x0166 }
            X.8zq r4 = r6.A04     // Catch:{ RemoteException -> 0x0166 }
            X.8zq r0 = X.C188598zq.A04     // Catch:{ RemoteException -> 0x0166 }
            if (r4 != r0) goto L_0x00cc
            java.lang.Integer r11 = X.C023109s.A01     // Catch:{ RemoteException -> 0x0166 }
            android.database.Cursor r3 = X.AnonymousClass6S0.A00(r1, r6, r7)     // Catch:{ RemoteException -> 0x0166 }
            if (r3 == 0) goto L_0x00c6
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0166 }
            X.5nQ r0 = r5.A01     // Catch:{ RemoteException -> 0x0166 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0166 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ RemoteException -> 0x0166 }
            X.7kh r1 = (X.C160247kh) r1     // Catch:{ RemoteException -> 0x0166 }
            if (r1 == 0) goto L_0x00c6
        L_0x00af:
            boolean r0 = r3.moveToNext()     // Catch:{ 78U -> 0x00bf }
            if (r0 == 0) goto L_0x015b
            X.67s r0 = r1.Bw4(r3, r11)     // Catch:{ 78U -> 0x00bf }
            if (r0 == 0) goto L_0x00af
            r2.add(r0)     // Catch:{ 78U -> 0x00bf }
            goto L_0x00af
        L_0x00bf:
            r0 = move-exception
            r7.Bja(r6, r0)     // Catch:{ all -> 0x0156 }
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
        L_0x00c6:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0166 }
            goto L_0x015e
        L_0x00cc:
            android.database.Cursor r3 = X.AnonymousClass6S0.A00(r1, r6, r7)     // Catch:{ RemoteException -> 0x0166 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ RemoteException -> 0x0166 }
            if (r3 == 0) goto L_0x015e
            boolean r0 = r3.moveToNext()     // Catch:{ RemoteException -> 0x0166 }
            if (r0 == 0) goto L_0x015e
            r0 = 1
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0151 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0101
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0151 }
            r11.<init>(r0)     // Catch:{ JSONException -> 0x0151 }
            r1 = 0
        L_0x00ed:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x0151 }
            if (r1 >= r0) goto L_0x0101
            java.lang.Object r0 = r11.get(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0151 }
            r14.add(r0)     // Catch:{ JSONException -> 0x0151 }
            int r1 = r1 + 1
            goto L_0x00ed
        L_0x0101:
            java.util.Iterator r15 = r14.iterator()     // Catch:{ JSONException -> 0x0151 }
        L_0x0105:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = X.AnonymousClass001.A0C(r15)     // Catch:{ JSONException -> 0x0151 }
            org.json.JSONObject r11 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = "profile"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0151 }
            X.6Mh r14 = r5.A00     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "session_cookies"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0151 }
            java.util.ArrayList r23 = r14.A00(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "uid"
            java.lang.String r20 = r0.getString(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "access_token"
            java.lang.String r21 = r11.getString(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r22 = "FACEBOOK"
            java.util.Map r1 = X.AnonymousClass6S0.A02     // Catch:{ JSONException -> 0x0151 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ JSONException -> 0x0151 }
            X.5Tr r1 = (X.C108485Tr) r1     // Catch:{ JSONException -> 0x0151 }
            java.lang.Integer r19 = X.C023109s.A0C     // Catch:{ JSONException -> 0x0151 }
            X.791 r11 = new X.791     // Catch:{ JSONException -> 0x0151 }
            r11.<init>(r5, r0)     // Catch:{ JSONException -> 0x0151 }
            X.67s r0 = new X.67s     // Catch:{ JSONException -> 0x0151 }
            r18 = r0
            r24 = r11
            r25 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x0151 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x0105
        L_0x0151:
            r0 = move-exception
            r7.Bgy(r0, r6)     // Catch:{ all -> 0x0156 }
            goto L_0x015b
        L_0x0156:
            r0 = move-exception
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
            throw r0     // Catch:{ RemoteException -> 0x0166 }
        L_0x015b:
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
        L_0x015e:
            r12.addAll(r2)     // Catch:{ RemoteException -> 0x0166 }
            r7.Bh0(r6)     // Catch:{ RemoteException -> 0x0166 }
            goto L_0x0077
        L_0x0166:
            r0 = move-exception
            r7.Bgy(r0, r6)     // Catch:{ all -> 0x01b2 }
            goto L_0x0077
        L_0x016c:
            r0 = 0
            r7.Bh2(r0, r6)     // Catch:{ all -> 0x01b2 }
            goto L_0x0077
        L_0x0172:
            java.util.Iterator r5 = r12.iterator()
        L_0x0176:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r5.next()
            X.67s r0 = (X.C1272967s) r0
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = r0.A01
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "inactive_logged_in_accounts"
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "user_id"
            r1.put(r0, r4)
            java.lang.String r0 = "auth_token"
            r1.put(r0, r3)
            java.lang.String r0 = "account_type"
            r1.put(r0, r10)
            java.lang.String r0 = "app_source"
            r1.put(r0, r10)
            java.lang.String r0 = "account_source"
            r1.put(r0, r2)
            r9.add(r1)
            goto L_0x0176
        L_0x01ab:
            java.lang.String r0 = "ssoProviderRepositoryFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ all -> 0x01b2 }
            throw r0     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6O0.A02(android.content.Context, java.lang.String):java.util.ArrayList");
    }
}
