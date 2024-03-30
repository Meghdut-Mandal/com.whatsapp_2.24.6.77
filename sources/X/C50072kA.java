package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
public class C50072kA extends C132446Tt {
    public WeakReference A00;
    public Map A01;
    public final Bundle A02;
    public final AnonymousClass3DY A03;
    public final C19600wD A04;
    public final C21060yb A05;
    public final C20830yE A06;
    public final AnonymousClass3XH A07;
    public final AnonymousClass1CF A08;
    public final AnonymousClass3UV A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C50072kA(Bundle bundle, C225314u r3, AnonymousClass3DY r4, C19600wD r5, C21060yb r6, C20830yE r7, AnonymousClass3XH r8, AnonymousClass1CF r9, AnonymousClass3UV r10, String str, boolean z, boolean z2, boolean z3) {
        super(r3, true);
        this.A00 = AnonymousClass001.A0F(r3);
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A04 = r5;
        this.A06 = r7;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = str;
        this.A02 = bundle;
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0126, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.A00
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x012f
            r11 = -1
            r3 = 0
            X.3UV r5 = r12.A09     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            java.util.LinkedHashMap r7 = X.C36431kI.A1G()     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            java.lang.String r1 = X.AnonymousClass6JD.A0H     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.13E r0 = r5.A07     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.6v1 r4 = r0.A05(r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.AnonymousClass00C.A08(r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            java.net.HttpURLConnection r0 = r4.A01     // Catch:{ all -> 0x0124 }
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x0124 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "RegistrationHttpManager/serverstatus/error status="
            X.C36321k7.A1S(r0, r1, r2)     // Catch:{ all -> 0x0124 }
            goto L_0x00b9
        L_0x0033:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0124 }
            X.0ww r1 = r5.A02     // Catch:{ all -> 0x0124 }
            r10 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0124 }
            X.5RE r5 = r4.B8D(r1, r3, r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x0115 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0115 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0115 }
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r0]     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r0 = r2.read(r1)     // Catch:{ all -> 0x010e }
            r6 = 0
            if (r0 < 0) goto L_0x0058
            r8.append(r1, r6, r0)     // Catch:{ all -> 0x010e }
            goto L_0x004d
        L_0x0058:
            java.lang.String r0 = X.C36381kD.A0y(r8)     // Catch:{ all -> 0x010e }
            r2.close()     // Catch:{ all -> 0x0115 }
            r5.close()     // Catch:{ all -> 0x0124 }
            org.json.JSONObject r5 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x010c }
            java.util.Iterator r9 = r5.keys()     // Catch:{ JSONException -> 0x010c }
        L_0x006a:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x010c }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r8 = X.AnonymousClass001.A0C(r9)     // Catch:{ JSONException -> 0x010c }
            org.json.JSONObject r1 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x010c }
            java.lang.String r0 = "available"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x010c }
            java.lang.String r0 = "false"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ JSONException -> 0x010c }
            if (r0 == 0) goto L_0x0091
            X.AnonymousClass00C.A0B(r8)     // Catch:{ JSONException -> 0x010c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ JSONException -> 0x010c }
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x010c }
            goto L_0x006a
        L_0x0091:
            java.lang.String r0 = "true"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ JSONException -> 0x010c }
            if (r0 == 0) goto L_0x00a4
            X.AnonymousClass00C.A0B(r8)     // Catch:{ JSONException -> 0x010c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x010c }
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x010c }
            goto L_0x006a
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x010c }
            java.lang.String r0 = "RegistrationHttpManager/serverstatus/error "
            r1.append(r0)     // Catch:{ JSONException -> 0x010c }
            r1.append(r8)     // Catch:{ JSONException -> 0x010c }
            r0 = 61
            r1.append(r0)     // Catch:{ JSONException -> 0x010c }
            X.C36321k7.A1Z(r1, r2)     // Catch:{ JSONException -> 0x010c }
            goto L_0x006a
        L_0x00b9:
            r4.close()     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            r12.A01 = r7     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            boolean r0 = r12.A0C     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            if (r0 != 0) goto L_0x012f
            X.0yb r0 = r12.A05     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            X.0ya r0 = X.C36431kI.A0z(r0)     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            android.content.ContentResolver r1 = r0.A00     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            java.lang.String r0 = "wifi_sleep_policy"
            int r1 = android.provider.Settings.System.getInt(r1, r0)     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            if (r1 == 0) goto L_0x00de
            r0 = 1
            if (r1 == r0) goto L_0x00db
            r0 = 2
            if (r1 == r0) goto L_0x00e1
            java.lang.String r2 = "unknown"
            goto L_0x00e3
        L_0x00db:
            java.lang.String r2 = "never-while-plugged"
            goto L_0x00e3
        L_0x00de:
            java.lang.String r2 = "default"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r2 = "never"
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            java.lang.String r0 = "about/wifisleep/"
            X.C36321k7.A1Q(r0, r2, r1)     // Catch:{ SettingNotFoundException -> 0x00f1, Exception -> 0x00ed }
            goto L_0x00f7
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "about/wifisleep/error "
            goto L_0x00f4
        L_0x00f1:
            r1 = move-exception
            java.lang.String r0 = "about/wifisleep/not-found"
        L_0x00f4:
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
        L_0x00f7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            java.lang.String r0 = "about/contacts/count "
            r2.append(r0)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.0yb r1 = r12.A05     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.0yE r0 = r12.A06     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            java.lang.Integer r0 = X.C63723Ld.A00(r1, r0)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            X.C36321k7.A1N(r0, r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            goto L_0x012f
        L_0x010c:
            r2 = move-exception
            goto L_0x011c
        L_0x010e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0115 }
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0123
        L_0x011c:
            java.lang.String r0 = "error parsing json"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0124 }
        L_0x0123:
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
            throw r0     // Catch:{ IOException -> 0x0131, Exception -> 0x012b }
        L_0x012b:
            r1 = move-exception
            java.lang.String r0 = "checksystemstatus/error "
            goto L_0x0134
        L_0x012f:
            r11 = 0
            goto L_0x0139
        L_0x0131:
            r1 = move-exception
            java.lang.String r0 = "checksystemstatus/ioerror "
        L_0x0134:
            com.whatsapp.util.Log.w(r0, r1)
            r12.A01 = r3
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50072kA.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A00);
        if (A0W != null) {
            A0W.Bu1(R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Intent intent;
        String str;
        C225314u A0W = C36411kG.A0W(this.A00);
        if (A0W != null && !A0W.BLh()) {
            A0W.Bnv();
            int i = null;
            if (!this.A04.A09()) {
                Log.i("checksystemstatus/no-connectivity");
                A0W.A3C((Integer) null, Integer.valueOf(R.string.f12nameremoved), (Integer) null, Collections.singletonList(A0W.getString(R.string.f12nameremoved)));
                return;
            }
            Map map = this.A01;
            if (map == null || map.size() == 0) {
                Log.i("checksystemstatus/no-server-status");
                if (this.A0C) {
                    A0W.A3C((Integer) null, Integer.valueOf(R.string.f12nameremoved), (Integer) null, (List) null);
                    return;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                boolean z = this.A0B;
                if (z) {
                    str = "chat";
                } else {
                    str = "reg";
                }
                A0u.append(str);
                String A0q = AnonymousClass000.A0q("-unknown", A0u);
                if (z) {
                    i = 1;
                }
                AnonymousClass3DY r9 = this.A03;
                boolean A002 = this.A08.A00();
                intent = r9.A01(A0W, this.A02, this.A07, i, this.A0A, A0q, (ArrayList) null, (ArrayList) null, A002);
            } else {
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator A10 = AnonymousClass000.A10(this.A01);
                boolean z2 = true;
                boolean z3 = true;
                while (A10.hasNext()) {
                    Object next = A10.next();
                    if ("version".equals(next)) {
                        Object obj2 = this.A01.get(next);
                        C18740tg.A06(obj2);
                        z3 = AnonymousClass000.A1X(obj2);
                    } else {
                        boolean equals = "email".equals(next);
                        Object obj3 = this.A01.get(next);
                        C18740tg.A06(obj3);
                        if (equals) {
                            z2 = AnonymousClass000.A1X(obj3);
                        } else if (!AnonymousClass000.A1X(obj3)) {
                            A0I.add(next);
                        }
                    }
                }
                if (A0I.size() != 0 || !z3 || this.A0C) {
                    String str2 = this.A0A;
                    if (this.A0B) {
                        i = 1;
                    }
                    boolean z4 = this.A0C;
                    Bundle bundle = this.A02;
                    intent = C36431kI.A0D().setClassName(A0W.getPackageName(), "com.whatsapp.systemstatus.SystemStatusActivity");
                    intent.putExtra("com.whatsapp.SystemStatusActivity.from", str2);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.email", z2);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.version", z3);
                    intent.putStringArrayListExtra("com.whatsapp.SystemStatusActivity.serverfeaturesunavailable", A0I);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.statusonly", z4);
                    if (i != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.type", i);
                    }
                    if (bundle != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle", bundle);
                    }
                } else {
                    if (this.A0B) {
                        i = 1;
                    }
                    AnonymousClass3DY r92 = this.A03;
                    boolean A003 = this.A08.A00();
                    intent = r92.A01(A0W, this.A02, this.A07, i, this.A0A, (String) null, (ArrayList) null, (ArrayList) null, A003);
                }
            }
            A0W.A33(intent, this.A0D);
        }
    }
}
