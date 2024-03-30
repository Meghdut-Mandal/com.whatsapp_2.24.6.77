package X;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.whatsapp.Me;
import com.whatsapp.registration.integritysignals.GpiaRegClient$calculateGpiaParameter$1;
import com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenBlocking$1;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3UV  reason: invalid class name */
public final class AnonymousClass3UV {
    public C64333No A00;
    public String A01;
    public final C20050ww A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C20830yE A05;
    public final C19420v0 A06;
    public final AnonymousClass13E A07;
    public final AnonymousClass33T A08;
    public final AnonymousClass3Sd A09;
    public final AnonymousClass1N4 A0A;
    public final C19730wQ A0B;
    public final C19600wD A0C;
    public final C19970wo A0D;
    public final C18820ts A0E;
    public final C21520zN A0F;
    public final C21010yW A0G;
    public final C65283Rl A0H;
    public final AnonymousClass9XW A0I;
    public final C29071Vf A0J;
    public final C140256lI A0K;
    public final AnonymousClass3AJ A0L;
    public final AnonymousClass6HH A0M;
    public final C21080yd A0N;
    public final C20020wt A0O;
    public final C19770wU A0P;
    public final C220812u A0Q;

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3OL A0C(X.AnonymousClass3DL r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, org.json.JSONObject r29, byte[] r30, boolean r31) {
        /*
            r23 = this;
            r8 = 0
            r14 = r25
            r15 = r26
            boolean r0 = X.C36341k9.A1a(r14, r15)
            r3 = 2
            r4 = r23
            boolean r1 = r4.A0I()
            if (r1 != 0) goto L_0x001a
            X.2op r1 = X.C52062op.FAIL_TO_INITIALIZE_WAMSYS
            X.3OL r0 = new X.3OL
            r0.<init>(r1, r8)
            return r0
        L_0x001a:
            r4.A0H(r0)
            byte[] r19 = r4.A0K(r14, r15)
            X.0wG r1 = r4.A04
            android.content.Context r7 = r1.A00
            X.0v0 r6 = r4.A06
            byte[] r2 = X.C133306Xt.A06(r7, r6, r15, r0)
            if (r2 != 0) goto L_0x0034
            byte[] r2 = X.C18750th.A0G()
            X.AnonymousClass00C.A08(r2)
        L_0x0034:
            byte[] r21 = X.C133306Xt.A06(r7, r6, r15, r3)
            r6.A29(r2)
            X.0yE r1 = r4.A05
            boolean r13 = r1.A0F()
            X.0yb r3 = r4.A03
            android.telephony.TelephonyManager r1 = r3.A0K()
            if (r1 == 0) goto L_0x00da
            int r1 = r1.getSimState()
        L_0x004d:
            java.lang.String r12 = java.lang.String.valueOf(r1)
            android.telephony.TelephonyManager r3 = r3.A0K()
            if (r3 == 0) goto L_0x00d8
            java.lang.String r5 = r3.getNetworkOperatorName()
        L_0x005b:
            java.lang.String r1 = ""
            if (r5 != 0) goto L_0x0060
            r5 = r1
        L_0x0060:
            if (r3 == 0) goto L_0x0068
            java.lang.String r11 = r3.getSimOperatorName()
            if (r11 != 0) goto L_0x0069
        L_0x0068:
            r11 = r1
        L_0x0069:
            r22 = r30
            if (r30 != 0) goto L_0x0072
            java.lang.String r1 = "RegistrationHttpManager/checkIfExists/null clientCapabilities"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0072:
            X.011[] r9 = new X.AnonymousClass011[r0]
            java.nio.charset.Charset r3 = X.AnonymousClass0S4.A05
            r0 = r27
            byte[] r1 = X.C36371kC.A1Z(r0, r3)
            java.lang.String r0 = "token"
            X.C36341k9.A1J(r0, r1, r9, r8)
            java.util.LinkedHashMap r0 = X.C000400e.A08(r9)
            if (r31 == 0) goto L_0x0092
            java.lang.String r1 = "poll_2fa"
            byte[] r8 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "context"
            r0.put(r1, r8)
        L_0x0092:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            X.AnonymousClass00C.A08(r1)
            java.lang.Integer r1 = X.AnonymousClass6HH.A00(r1)
            if (r1 == 0) goto L_0x00b9
            int r9 = r1.intValue()
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "RegistrationHttpManager/checkIfExists/tmobile_exp:"
            X.C36321k7.A1T(r1, r8, r9)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            byte[] r8 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "tmobile_exp"
            r0.put(r1, r8)
        L_0x00b9:
            r1 = r28
            byte[] r8 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "mistyped"
            r0.put(r1, r8)
            if (r29 == 0) goto L_0x00d3
            java.lang.String r1 = X.C36381kD.A0y(r29)
            byte[] r8 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "offline_ab"
            r0.put(r1, r8)
        L_0x00d3:
            org.json.JSONObject r10 = r24.A00()
            goto L_0x00dd
        L_0x00d8:
            r5 = 0
            goto L_0x005b
        L_0x00da:
            r1 = -1
            goto L_0x004d
        L_0x00dd:
            java.lang.String r9 = "was_activated_from_stub"
            java.lang.String r1 = "downloader_stub"
            r8 = 0
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r1, r8)     // Catch:{ JSONException -> 0x00f0 }
            java.lang.String r1 = "activated"
            boolean r1 = r7.getBoolean(r1, r8)     // Catch:{ JSONException -> 0x00f0 }
            r10.put(r9, r1)     // Catch:{ JSONException -> 0x00f0 }
            goto L_0x00f5
        L_0x00f0:
            java.lang.String r1 = "RegistrationHttpManager/Failed to add stub activation metric."
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x00f5:
            java.lang.String r1 = X.C36381kD.A0y(r10)
            byte[] r7 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "client_metrics"
            r0.put(r1, r7)
            if (r13 == 0) goto L_0x0203
            java.lang.String r1 = "1"
        L_0x0106:
            byte[] r7 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "read_phone_permission_granted"
            r0.put(r1, r7)
            byte[] r7 = X.C36371kC.A1Z(r12, r3)
            java.lang.String r1 = "sim_state"
            r0.put(r1, r7)
            byte[] r5 = X.C36371kC.A1Z(r5, r3)
            java.lang.String r1 = "network_operator_name"
            r0.put(r1, r5)
            byte[] r5 = X.C36371kC.A1Z(r11, r3)
            java.lang.String r1 = "sim_operator_name"
            r0.put(r1, r5)
            java.lang.String r1 = android.os.Build.DEVICE
            X.AnonymousClass00C.A09(r1)
            byte[] r5 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "device_name"
            r0.put(r1, r5)
            X.005 r8 = r6.A00
            android.content.SharedPreferences r5 = X.C36391kE.A0H(r8)
            java.lang.String r1 = "backup_token_retrieval_error"
            java.lang.String r5 = X.C36371kC.A0t(r5, r1)
            if (r5 == 0) goto L_0x0155
            int r1 = r5.length()
            if (r1 == 0) goto L_0x0155
            byte[] r5 = X.C36371kC.A1Z(r5, r3)
            java.lang.String r1 = "backup_token_error"
            r0.put(r1, r5)
        L_0x0155:
            android.content.SharedPreferences r7 = X.C36391kE.A0H(r8)
            java.lang.String r5 = "pref_autoconf_feo2_query_status"
            java.lang.String r1 = "did_not_query"
            java.lang.String r1 = r7.getString(r5, r1)
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            byte[] r5 = X.C36371kC.A1Z(r1, r3)
            java.lang.String r1 = "feo2_query_status"
            r0.put(r1, r5)
            A05(r4, r0)
            A08(r4, r0)
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r8)
            java.lang.String r5 = "language_selector_time_spent"
            long r9 = X.C36341k9.A0B(r1, r5)
            java.lang.String r10 = java.lang.String.valueOf(r9)
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r8)
            java.lang.String r7 = "language_selector_clicked_count"
            int r1 = X.C36371kC.A01(r1, r7)
            java.lang.String r9 = java.lang.String.valueOf(r1)
            byte[] r1 = X.C36371kC.A1Z(r10, r3)
            r0.put(r5, r1)
            byte[] r1 = X.C36371kC.A1Z(r9, r3)
            r0.put(r7, r1)
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)
            X.C36341k9.A0u(r1, r7)
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)
            X.C36341k9.A0u(r1, r5)
            A07(r4, r0)
            A04(r4, r0)
            A06(r4, r0)
            A03(r4, r0)
            r4.A0B(r0)
            A09(r4, r0)
            r7 = 0
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r6)
            java.lang.String r1 = "registration_push_notif_code"
            X.C36341k9.A0x(r5, r1, r7)
            android.content.SharedPreferences r5 = X.C36391kE.A0H(r8)
            java.lang.String r1 = "c2dm_reg_id"
            java.lang.String r5 = r5.getString(r1, r7)
            if (r5 == 0) goto L_0x01e5
            int r1 = r5.length()
            if (r1 == 0) goto L_0x01e5
            byte[] r3 = X.C36371kC.A1Z(r5, r3)
            java.lang.String r1 = "push_token"
            r0.put(r1, r3)
        L_0x01e5:
            X.3Sd r13 = r4.A09
            java.lang.String r1 = "exist_entrypoint"
            java.lang.String r16 = r4.A0G(r14, r1)
            java.util.List r17 = A02(r4)
            X.33T r12 = r4.A08
            X.2kv r11 = new X.2kv
            r18 = r0
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = X.AnonymousClass3PM.A00(r11)
            X.3OL r0 = (X.AnonymousClass3OL) r0
            return r0
        L_0x0203:
            java.lang.String r1 = "0"
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UV.A0C(X.3DL, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, byte[], boolean):X.3OL");
    }

    public C64363Nr A0D(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C36321k7.A0w(str, str2);
        if (!A0I()) {
            return new C64363Nr();
        }
        Log.i("RegistrationHttpManager/checkPreChatdABProps/wamsys/reg-onboard-abprop-request");
        LinkedHashMap A1G = C36431kI.A1G();
        String obj = Integer.valueOf(C52662py.RELEASE.value).toString();
        if (obj == null) {
            obj = "";
        }
        Charset charset = AnonymousClass0S4.A05;
        A1G.put("rc", C36371kC.A1Z(obj, charset));
        String A0t = C36371kC.A0t(C36341k9.A0E(this.A06), "pref_pre_chatd_ab_hash");
        if (A0t != null) {
            A1G.put("ab_hash", C36371kC.A1Z(A0t, charset));
        }
        return (C64363Nr) AnonymousClass3PM.A00(new C50392kq(this.A08, this.A09, str3, str4, A1G));
    }

    public AnonymousClass3BH A0E(AnonymousClass3DL r14, String str, String str2, String str3, String str4) {
        byte[] bArr;
        String str5 = str;
        String str6 = str2;
        boolean A1a = C36331k8.A1a(str, str6);
        if (!A0I()) {
            return new AnonymousClass3BH(C52052oo.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
        }
        int i = 1;
        A0H(A1a);
        byte[] A0K2 = A0K(str, str6);
        byte[] A0J2 = A0J("resetSecurityCode");
        LinkedHashMap A1G = C36431kI.A1G();
        String A0y = C36381kD.A0y(r14.A00());
        Charset charset = AnonymousClass0S4.A05;
        A1G.put("client_metrics", C36371kC.A1Z(A0y, charset));
        A03(this, A1G);
        String str7 = str4;
        if (str4 != null) {
            bArr = C36371kC.A1Z(str7, charset);
        } else {
            bArr = null;
        }
        String str8 = str3;
        if ("wipe".equals(str8)) {
            i = 2;
        } else if (!"email".equals(str8)) {
            i = 0;
        }
        return (AnonymousClass3BH) AnonymousClass3PM.A00(new C50462kx(this.A08, this.A09, (String) null, str5, str6, A0G(str, "security_entrypoint"), A02(this), A1G, bArr, A0K2, A0J2, i));
    }

    public AnonymousClass3BH A0F(AnonymousClass3DL r16, String str, String str2, String str3, AnonymousClass011 r20, AnonymousClass011 r21, AnonymousClass011 r22, AnonymousClass011 r23) {
        String str4 = str;
        String str5 = str2;
        boolean A1a = C36341k9.A1a(str4, str5);
        if (!A0I()) {
            return new AnonymousClass3BH(C52052oo.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
        }
        A0H(A1a);
        byte[] A0K2 = A0K(str4, str5);
        byte[] A0J2 = A0J("verifySecurityCode");
        LinkedHashMap A1G = C36431kI.A1G();
        AnonymousClass011 r0 = r20;
        if (r20 != null) {
            AnonymousClass011 r5 = r21;
            if (r21 != null) {
                AnonymousClass011 r4 = r22;
                if (r22 != null) {
                    AnonymousClass011 r3 = r23;
                    if (r23 != null) {
                        Object obj = r0.first;
                        Charset charset = AnonymousClass0S4.A05;
                        A1G.put(obj, C36371kC.A1Z((String) r0.second, charset));
                        A1G.put(r5.first, C36371kC.A1Z((String) r5.second, charset));
                        A1G.put(r4.first, C36371kC.A1Z((String) r4.second, charset));
                        A1G.put(r3.first, C36371kC.A1Z((String) r3.second, charset));
                    }
                }
            }
        }
        A1G.put("client_metrics", C36351kA.A1b(C36381kD.A0y(r16.A00())));
        A05(this, A1G);
        A08(this, A1G);
        A03(this, A1G);
        return (AnonymousClass3BH) AnonymousClass3PM.A00(new C50462kx(this.A08, this.A09, str3, str4, str5, A0G(str4, "security_entrypoint"), A02(this), A1G, (byte[]) null, A0K2, A0J2, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0 == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch     // Catch:{ InterruptedException -> 0x003e }
            r4.<init>(r0)     // Catch:{ InterruptedException -> 0x003e }
            X.12u r5 = r6.A0Q     // Catch:{ InterruptedException -> 0x003e }
            r3 = 0
            if (r7 == 0) goto L_0x000c
            r3 = r4
        L_0x000c:
            boolean r0 = r5.A01     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "blacknoise: not boostrapped for reg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x003e }
            if (r3 == 0) goto L_0x002e
            goto L_0x002b
        L_0x0018:
            X.0wU r2 = r5.A07     // Catch:{ InterruptedException -> 0x003e }
            r0 = 22
            X.1jE r1 = new X.1jE     // Catch:{ InterruptedException -> 0x003e }
            r1.<init>(r5, r3, r0)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r0 = "regtime_ka"
            boolean r0 = r2.Bp2(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            if (r3 == 0) goto L_0x002e
            if (r0 != 0) goto L_0x002e
        L_0x002b:
            r3.countDown()     // Catch:{ InterruptedException -> 0x003e }
        L_0x002e:
            if (r7 == 0) goto L_0x0044
            X.0zN r1 = r6.A0F     // Catch:{ InterruptedException -> 0x003e }
            r0 = 4696(0x1258, float:6.58E-42)
            long r1 = X.C36441kJ.A0B(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x003e }
            r4.await(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            return
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "blacknoise: bad reg time work"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UV.A0H(boolean):void");
    }

    public static final LinkedHashMap A01(AnonymousClass3UV r8, AnonymousClass2d1 r9, String str, int i) {
        String str2;
        String str3;
        String simOperatorName;
        TelephonyManager A0K2 = r8.A03.A0K();
        String str4 = null;
        if (A0K2 != null) {
            str2 = A0K2.getNetworkOperator();
        } else {
            str2 = null;
        }
        C65603St A002 = C65603St.A00(str2);
        if (A0K2 != null) {
            str3 = A0K2.getSimOperator();
        } else {
            str3 = null;
        }
        C65603St A003 = C65603St.A00(str3);
        if (A0K2 != null) {
            str4 = A0K2.getNetworkOperatorName();
        }
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        if (!(A0K2 == null || (simOperatorName = A0K2.getSimOperatorName()) == null)) {
            str5 = simOperatorName;
        }
        Log.i("RegistrationHttpManager/msys/verify");
        LinkedHashMap A1G = C36431kI.A1G();
        if (str != null) {
            A1G.put("mistyped", C36351kA.A1b(str));
        }
        String A0y = C36381kD.A0y(r9.A00());
        Charset charset = AnonymousClass0S4.A05;
        A1G.put("client_metrics", C36371kC.A1Z(A0y, charset));
        A1G.put("entered", C36371kC.A1Z(String.valueOf(i), charset));
        A0A(A002, A003, charset, A1G);
        A1G.put("network_operator_name", C36371kC.A1Z(str4, charset));
        A1G.put("sim_operator_name", C36371kC.A1Z(str5, charset));
        A03(r8, A1G);
        return A1G;
    }

    public static final List A02(AnonymousClass3UV r5) {
        C65283Rl r2 = r5.A0H;
        try {
            C65283Rl.A00(r2);
        } catch (IOException e) {
            Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.addAll(r2.A05);
        A0I2.addAll(r2.A06);
        A0I2.addAll(r2.A04);
        ArrayList A0J2 = C36321k7.A0J(A0I2);
        Iterator it = A0I2.iterator();
        while (it.hasNext()) {
            AnonymousClass38N r3 = (AnonymousClass38N) it.next();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(r3.A02);
            A0u.append(" ");
            A0u.append(r3.A01);
            A0u.append(" ");
            A0J2.add(AnonymousClass000.A0q(r3.A03, A0u));
        }
        return A0J2;
    }

    public static final void A04(AnonymousClass3UV r2, Map map) {
        if (r2.A0F.A0E(7999)) {
            map.put("db", C36351kA.A1b(String.valueOf(Settings.Global.getInt(r2.A04.A00.getContentResolver(), "adb_enabled", 0))));
        }
    }

    public static final void A05(AnonymousClass3UV r6, Map map) {
        String str = r6.A01;
        if (str == null) {
            str = new DecimalFormat("#.##").format(((double) AnonymousClass1K0.A02(r6.A03)) / ((double) 1073741824));
            r6.A01 = str;
            if (str == null) {
                throw C36381kD.A0l();
            }
        }
        map.put("device_ram", C36351kA.A1b(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r6 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r6 != null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass3UV r8, java.util.Map r9) {
        /*
            X.9XW r5 = r8.A0I
            X.00I r0 = r5.A00()
            r8 = 0
            if (r0 == 0) goto L_0x0081
            java.lang.Object r7 = r0.A00
            java.lang.String r7 = (java.lang.String) r7
        L_0x000d:
            X.00I r0 = r5.A00()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x0017:
            java.lang.Exception r6 = r5.A03
            if (r0 == 0) goto L_0x007d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        L_0x0028:
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            r1 = r8
            if (r7 == 0) goto L_0x003d
            r2 = 7500(0x1d4c, float:1.051E-41)
            r1 = 0
            int r0 = r7.length()
            if (r2 <= r0) goto L_0x0039
            r2 = r0
        L_0x0039:
            java.lang.String r1 = X.C36431kI.A16(r1, r2, r7)
        L_0x003d:
            java.lang.String r0 = "token"
            r3.put(r0, r1)
            if (r7 == 0) goto L_0x004c
            int r0 = r7.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x004c:
            java.lang.String r0 = "token_length"
            r3.put(r0, r8)
            java.lang.String r0 = "token_age"
            r3.put(r0, r4)
            if (r7 == 0) goto L_0x007a
            if (r6 == 0) goto L_0x006c
        L_0x005a:
            java.lang.String r1 = r6.toString()
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "error"
            r3.put(r0, r1)
        L_0x0065:
            X.8zI r1 = r5.A02
            java.lang.String r0 = "stage"
            r3.put(r0, r1)
        L_0x006c:
            java.lang.String r0 = X.C36381kD.A0y(r3)
            byte[] r1 = X.C36351kA.A1b(r0)
            java.lang.String r0 = "recaptcha"
            r9.put(r0, r1)
            return
        L_0x007a:
            if (r6 == 0) goto L_0x0065
            goto L_0x005a
        L_0x007d:
            r4 = r8
            goto L_0x0028
        L_0x007f:
            r0 = r8
            goto L_0x0017
        L_0x0081:
            r7 = r8
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UV.A06(X.3UV, java.util.Map):void");
    }

    public static final void A07(AnonymousClass3UV r8, Map map) {
        AnonymousClass3AJ r7 = r8.A0L;
        if (!r7.A03.A0E(3753)) {
            Log.w("GpiaRegClient: ABProp is not enabled, so returning without fetching token");
            return;
        }
        Boolean bool = C18750th.A03;
        GpiaRegClient$fetchTokenBlocking$1 gpiaRegClient$fetchTokenBlocking$1 = new GpiaRegClient$fetchTokenBlocking$1(r7, (C023509x) null);
        C008903u r5 = C008903u.A00;
        AnonymousClass3NS r0 = (AnonymousClass3NS) C110515an.A00(r5, gpiaRegClient$fetchTokenBlocking$1);
        if (r0 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            map.put("gpia", C36351kA.A1b((String) C110515an.A00(r5, new GpiaRegClient$calculateGpiaParameter$1(r7, r0.A01, (C023509x) null, r0.A00))));
            AnonymousClass135 r2 = new AnonymousClass135();
            r2.A00 = Long.valueOf(C36441kJ.A0A(currentTimeMillis));
            r2.A02 = "gpia-param-prepare";
            r8.A0G.Bly(r2);
        }
    }

    public static final void A08(AnonymousClass3UV r2, Map map) {
        Me A052 = r2.A0B.A05();
        if (A052 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A052.cc);
            map.put("old_phone_number", C36351kA.A1b(AnonymousClass000.A0q(A052.number, A0u)));
        }
    }

    public static final void A09(AnonymousClass3UV r3, Map map) {
        AnonymousClass61Z BFs = r3.A0K.BFs();
        String str = BFs.A01;
        if (!AnonymousClass14B.A0F(str)) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append('|');
            map.put("fid", C36351kA.A1b(C36411kG.A11(A0v, C36391kE.A0B(BFs.A00))));
        }
    }

    public static void A0A(C65603St r2, C65603St r3, Charset charset, AbstractMap abstractMap) {
        String str = r2.A00;
        AnonymousClass00C.A08(str);
        byte[] bytes = str.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        abstractMap.put("mcc", bytes);
        String str2 = r2.A01;
        AnonymousClass00C.A08(str2);
        byte[] bytes2 = str2.getBytes(charset);
        AnonymousClass00C.A08(bytes2);
        abstractMap.put("mnc", bytes2);
        String str3 = r3.A00;
        AnonymousClass00C.A08(str3);
        byte[] bytes3 = str3.getBytes(charset);
        AnonymousClass00C.A08(bytes3);
        abstractMap.put("sim_mcc", bytes3);
        String str4 = r3.A01;
        AnonymousClass00C.A08(str4);
        byte[] bytes4 = str4.getBytes(charset);
        AnonymousClass00C.A08(bytes4);
        abstractMap.put("sim_mnc", bytes4);
    }

    private final void A0B(Map map) {
        int i;
        int i2;
        C21520zN r2 = this.A0F;
        if (r2.A0E(4435)) {
            if (r2.A0E(4399)) {
                TelephonyManager A0K2 = this.A03.A0K();
                if (A0K2 == null) {
                    i2 = 2;
                } else {
                    i2 = 1;
                    if (A0K2.getSimState() == 1) {
                        i2 = 0;
                    }
                }
                map.put("sim_type", C36351kA.A1b(String.valueOf(i2)));
            }
            if (r2.A0E(4400)) {
                map.put("airplane_mode_type", C36351kA.A1b(String.valueOf(C19600wD.A02(this.A04.A00) ? 1 : 0)));
            }
            if (r2.A0E(4401)) {
                map.put("cellular_strength", C36351kA.A1b(String.valueOf(C55222uH.A00(this.A03))));
            }
            if (r2.A0E(4402) && this.A0C.A04() != null) {
                TelephonyManager A0K3 = this.A03.A0K();
                if (A0K3 != null) {
                    i = A0K3.isNetworkRoaming();
                } else {
                    i = 2;
                }
                map.put("roaming_type", C36351kA.A1b(String.valueOf(i)));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0G(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r4 = " failed"
            java.lang.String r3 = "RegistrationHttpManager/RegistrationHelper/getAdvertisingId at "
            r2 = 0
            java.lang.String r1 = "eu"
            X.1N4 r0 = r5.A0A     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            java.lang.String r0 = r0.A04(r6)     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            boolean r0 = r1.equals(r0)     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            if (r0 != 0) goto L_0x002b
            X.0wG r0 = r5.A04     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            android.content.Context r0 = r0.A00     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            X.61c r0 = X.AnonymousClass6OC.A00(r0)     // Catch:{ 0Iz | 0O8 | IOException -> 0x001c }
            goto L_0x002c
        L_0x001c:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r3, r7, r4, r0)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002b:
            r0 = r2
        L_0x002c:
            if (r0 == 0) goto L_0x0030
            java.lang.String r2 = r0.A00
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UV.A0G(java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean A0I() {
        String str = this.A0J.BFs().A01;
        C220812u r0 = this.A0Q;
        C19630wG r2 = this.A04;
        C20020wt r6 = this.A0O;
        C19770wU r7 = this.A0P;
        if (r0.A03(this.A02, r2, this.A06, this.A0E, this.A0N, r6, r7, str)) {
            return true;
        }
        Log.e("RegistrationHttpManager/ensureWamsysForRegBootstrapped/waMsysSetup.bootstrapForReg failed");
        return false;
    }

    public byte[] A0J(String str) {
        C19420v0 r2 = this.A06;
        byte[] A2X = r2.A2X();
        AnonymousClass00C.A08(A2X);
        if (A2X.length != 0) {
            return A2X;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegistrationHttpManager/");
        A0u.append(str);
        C36321k7.A1a(A0u, "/no backup token read from shared preferences, generate a new one");
        byte[] A0G2 = C18750th.A0G();
        AnonymousClass00C.A08(A0G2);
        r2.A29(A0G2);
        return A0G2;
    }

    public byte[] A0K(String str, String str2) {
        Context context = this.A04.A00;
        AnonymousClass00C.A08(context);
        String A002 = C55212uG.A00(C36321k7.A0D(str, str2));
        AnonymousClass00C.A08(A002);
        byte[] A0I2 = C18750th.A0I(context, A002);
        if (A0I2 != null) {
            return A0I2;
        }
        byte[] A0G2 = C18750th.A0G();
        C18750th.A0E(context, A002, A0G2);
        return A0G2;
    }

    public static final LinkedHashMap A00(AnonymousClass3UV r6, AnonymousClass2d2 r7, C65603St r8, C65603St r9, String str, String str2, String str3) {
        LinkedHashMap A1G = C36431kI.A1G();
        if (str2 != null) {
            A1G.put("mistyped", C36351kA.A1b(str2));
        }
        Charset charset = AnonymousClass0S4.A05;
        A1G.put("reason", C36371kC.A1Z(str, charset));
        if (str3 != null) {
            A1G.put("hasav", C36371kC.A1Z(str3, charset));
        }
        A1G.put("client_metrics", C36371kC.A1Z(C36381kD.A0y(r7.A00()), charset));
        A0A(r8, r9, charset, A1G);
        AnonymousClass005 r5 = r6.A06.A00;
        A1G.put("education_screen_displayed", C36371kC.A1Z(String.valueOf(C36391kE.A0H(r5).getBoolean("pref_flash_call_education_screen_displayed", false)), charset));
        A1G.put("prefer_sms_over_flash", C36371kC.A1Z(String.valueOf(C36391kE.A0H(r5).getBoolean("pref_prefer_sms_over_flash", false)), charset));
        A03(r6, A1G);
        r6.A0B(A1G);
        String A0t = C36371kC.A0t(C36391kE.A0H(r5), "registration_push_notif_code");
        if (!(A0t == null || A0t.length() == 0)) {
            A1G.put("push_code", C36371kC.A1Z(A0t, charset));
        }
        return A1G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r0.length() < 6) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass3UV r6, java.util.Map r7) {
        /*
            r7.size()
            X.0wD r0 = r6.A0C
            X.1M8 r0 = r0.A04()
            java.lang.Integer r0 = X.AnonymousClass1M9.A00(r0)
            if (r0 != 0) goto L_0x0091
            r0 = -1
        L_0x0010:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.nio.charset.Charset r2 = X.AnonymousClass0S4.A05
            byte[] r1 = X.C36371kC.A1Z(r0, r2)
            java.lang.String r0 = "network_radio_type"
            r7.put(r0, r1)
            X.0wG r5 = r6.A04
            X.0yb r1 = r6.A03
            X.0yE r0 = r6.A05
            java.lang.String r0 = X.AnonymousClass3SI.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0033
            int r3 = r0.length()
            r0 = 6
            r1 = 1
            if (r3 >= r0) goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            r0 = r3
            if (r1 == 0) goto L_0x003c
            r0 = r4
        L_0x003c:
            byte[] r1 = X.C36371kC.A1Z(r0, r2)
            java.lang.String r0 = "simnum"
            r7.put(r0, r1)
            android.content.Context r1 = r5.A00
            java.lang.Boolean r0 = X.C18750th.A03
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x005a
            r4 = r3
        L_0x005a:
            byte[] r1 = X.C36371kC.A1Z(r4, r2)
            java.lang.String r0 = "hasinrc"
            r7.put(r0, r1)
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = X.C36371kC.A1Z(r0, r2)
            java.lang.String r0 = "pid"
            r7.put(r0, r1)
            X.2py r0 = X.C52662py.RELEASE
            int r0 = r0.value
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = ""
        L_0x0084:
            byte[] r1 = X.C36371kC.A1Z(r0, r2)
            java.lang.String r0 = "rc"
            r7.put(r0, r1)
            r7.size()
            return
        L_0x0091:
            int r0 = r0.intValue()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UV.A03(X.3UV, java.util.Map):void");
    }

    public AnonymousClass3UV(AnonymousClass1N4 r27, C19730wQ r28, C20050ww r29, C19600wD r30, C21060yb r31, C19970wo r32, C19630wG r33, C20830yE r34, C19420v0 r35, C18820ts r36, C21520zN r37, C21010yW r38, C65283Rl r39, AnonymousClass13E r40, AnonymousClass9XW r41, C29071Vf r42, C140256lI r43, AnonymousClass3AJ r44, AnonymousClass6HH r45, C21080yd r46, C20020wt r47, C19770wU r48, AnonymousClass33T r49, C220812u r50, AnonymousClass3Sd r51) {
        C20020wt r15 = r47;
        C19770wU r5 = r48;
        C19970wo r20 = r32;
        C19630wG r19 = r33;
        C19730wQ r24 = r28;
        C36321k7.A1B(r20, r24, r15, r19, r5);
        C29071Vf r9 = r42;
        C220812u r3 = r50;
        C21010yW r14 = r38;
        AnonymousClass13E r11 = r40;
        C20050ww r23 = r29;
        C36321k7.A1C(r23, r14, r3, r9, r11);
        C140256lI r8 = r43;
        AnonymousClass00C.A0D(r8, 11);
        AnonymousClass3AJ r7 = r44;
        C21060yb r21 = r31;
        C18820ts r16 = r36;
        C21520zN r13 = r37;
        AnonymousClass1N4 r25 = r27;
        C36321k7.A1D(r7, r21, r16, r13, r25);
        C21080yd r6 = r46;
        AnonymousClass33T r4 = r49;
        C20830yE r18 = r34;
        C19420v0 r17 = r35;
        C65283Rl r12 = r39;
        C36321k7.A1E(r6, r18, r17, r4, r12);
        AnonymousClass9XW r10 = r41;
        AnonymousClass00C.A0D(r10, 22);
        C19600wD r22 = r30;
        AnonymousClass00C.A0D(r22, 23);
        AnonymousClass3Sd r2 = r51;
        AnonymousClass00C.A0D(r2, 25);
        this.A0D = r20;
        this.A0B = r24;
        this.A0O = r15;
        this.A04 = r19;
        this.A0P = r5;
        this.A02 = r23;
        this.A0G = r14;
        this.A0Q = r3;
        this.A0J = r9;
        this.A07 = r11;
        this.A0K = r8;
        this.A0L = r7;
        this.A03 = r21;
        this.A0E = r16;
        this.A0F = r13;
        this.A0A = r25;
        this.A0N = r6;
        this.A05 = r18;
        this.A06 = r17;
        this.A08 = r4;
        this.A0H = r12;
        this.A0I = r10;
        this.A0C = r22;
        this.A0M = r45;
        this.A09 = r2;
    }
}
