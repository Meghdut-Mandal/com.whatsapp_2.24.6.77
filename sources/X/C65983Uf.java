package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.3Uf  reason: invalid class name and case insensitive filesystem */
public abstract class C65983Uf {
    public static String A00 = "";

    public static int A00(String str, String str2) {
        int length;
        int length2;
        if (str == null || str2 == null || (length = str.length()) < 6 || (length2 = str2.length()) < 6) {
            return -1;
        }
        int i = length - 6;
        int i2 = length2 - 6;
        int i3 = 0;
        int i4 = 0;
        do {
            if (str.charAt(i + i3) != str2.charAt(i2 + i3)) {
                i4++;
            }
            i3++;
        } while (i3 < 6);
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r4.A05 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0FM A03(X.C24801Dv r21, X.C225314u r22, X.AnonymousClass17Y r23, X.AnonymousClass3DY r24, X.C18820ts r25, X.AnonymousClass1CF r26, X.AnonymousClass3XC r27, java.lang.Runnable r28, java.lang.String r29, java.lang.String r30) {
        /*
            r3 = 0
            r4 = r27
            if (r27 == 0) goto L_0x00bb
            java.lang.String r0 = r4.A04
        L_0x0007:
            int r8 = X.C55192uE.A00(r0)
            r7 = 0
            if (r27 == 0) goto L_0x0013
            boolean r0 = r4.A05
            r9 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r9 = 0
        L_0x0014:
            r10 = r28
            boolean r6 = X.AnonymousClass000.A1V(r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegistrationUtils/createSMBUsersIsBannedViewPolicyDialog/ban cancelable="
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r6)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5 = r25
            r14 = r29
            r15 = r30
            java.lang.String r2 = A0D(r5, r14, r15)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r11 = r22
            X.C36351kA.A14(r11, r1, r8)
            android.text.SpannableString r2 = X.C36391kE.A0K(r1, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r11)
            r0 = 2131625538(0x7f0e0642, float:1.8878287E38)
            android.view.View r1 = r1.inflate(r0, r3)
            X.1qm r3 = X.C39001qm.A01(r11, r2)
            r3.A0j(r1)
            r3.A0r(r6)
            r0 = 2131428380(0x7f0b041c, float:1.8478403E38)
            android.widget.TextView r6 = X.C36391kE.A0O(r1, r0)
            r0 = 2131428378(0x7f0b041a, float:1.8478399E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r1, r0)
            r0 = 2131428379(0x7f0b041b, float:1.84784E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r1, r0)
            r6.setVisibility(r7)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r6.setText(r0)
            r2.setVisibility(r7)
            r0 = 2131893475(0x7f121ce3, float:1.9421728E38)
            r2.setText(r0)
            r1.setVisibility(r7)
            r0 = 2131893476(0x7f121ce4, float:1.942173E38)
            if (r9 == 0) goto L_0x008a
            r0 = 2131896442(0x7f12287a, float:1.9427745E38)
        L_0x008a:
            r1.setText(r0)
            r0 = 32
            X.AnonymousClass3YH.A00(r6, r11, r10, r0)
            r22 = 4
            X.3YY r0 = new X.3YY
            r19 = r21
            r21 = r23
            r18 = r5
            r20 = r11
            r17 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.setOnClickListener(r0)
            r16 = 0
            X.3Yb r9 = new X.3Yb
            r12 = r24
            r13 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.setOnClickListener(r9)
            X.0FM r0 = r3.create()
            return r0
        L_0x00bb:
            r0 = r3
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65983Uf.A03(X.1Dv, X.14u, X.17Y, X.3DY, X.0ts, X.1CF, X.3XC, java.lang.Runnable, java.lang.String, java.lang.String):X.0FM");
    }

    public static AnonymousClass0FM A05(C225314u r11, AnonymousClass3DY r12, C18820ts r13, AnonymousClass1CF r14, Runnable runnable, String str, String str2) {
        boolean A1V = AnonymousClass000.A1V(runnable);
        Log.w(C36371kC.A0z("RegistrationUtils/createUserIsBannedDialog/ban cancelable=", AnonymousClass000.A0u(), A1V));
        String str3 = str;
        String str4 = str2;
        String A0D = A0D(r13, str3, str4);
        StringBuilder A0v = AnonymousClass000.A0v(A0D);
        A0v.append("\n\n");
        C36351kA.A14(r11, A0v, R.string.f12nameremoved);
        C39001qm A01 = C39001qm.A01(r11, C36391kE.A0K(A0v, A0D));
        A01.A0r(A1V);
        String string = r11.getString(R.string.f12nameremoved);
        A01.A00.A0Q(new C89714Xp(runnable, r11, 22), string);
        String string2 = r11.getString(R.string.f12nameremoved);
        A01.A0i(new AnonymousClass3VJ(r11, r12, r14, runnable, str3, str4), string2);
        return A01.create();
    }

    public static long A01(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.w((Throwable) e);
            }
        }
        return j;
    }

    public static AnonymousClass0FM A02(Context context) {
        Log.i("RegistrationUtils/createVerificationCompleteDialog");
        if (C24801Dv.A00(context).isFinishing()) {
            return null;
        }
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0j(View.inflate(context, R.layout.f9nameremoved, (ViewGroup) null));
        return A002.create();
    }

    public static AnonymousClass0FM A04(C225314u r5, AnonymousClass3DY r6, C19600wD r7, C21060yb r8, C20830yE r9, AnonymousClass1CF r10, AnonymousClass3UV r11, C19770wU r12) {
        Log.i("RegistrationUtils/createCannotConnectDialog");
        C39001qm A002 = AnonymousClass3LW.A00(r5);
        C39001qm.A02(r5, A002, R.string.f12nameremoved);
        A002.A0i(new AnonymousClass3VN(r5, r6, r7, r8, r9, r10, r11, r12), r5.getString(R.string.f12nameremoved));
        String string = r5.getString(R.string.f12nameremoved);
        A002.A00.A0Q(new AnonymousClass4XO(r5, 21), string);
        A002.A0e(AnonymousClass3V3.A00);
        return A002.create();
    }

    public static AnonymousClass0FM A06(C225314u r10, AnonymousClass3DY r11, AnonymousClass1CF r12, String str, String str2) {
        Log.w("RegistrationUtils/createUnderageAccountBannedDialog/underage-ban cancelable=");
        C39001qm A002 = AnonymousClass3LW.A00(r10);
        A002.A0q(r10.getString(R.string.f12nameremoved));
        C39001qm.A02(r10, A002, R.string.f12nameremoved);
        A002.A0r(false);
        A002.A0i(new AnonymousClass4XO(r10, 22), r10.getString(R.string.f12nameremoved));
        String string = r10.getString(R.string.f12nameremoved);
        AnonymousClass1CF r5 = r12;
        A002.A00.A0R(new AnonymousClass4X9(r5, r11, r10, str, str2, 1), string);
        return A002.create();
    }

    public static String A0A(AnonymousClass1N4 r3, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = r3.A03(Integer.parseInt(str), replaceAll);
        } catch (IOException e) {
            Log.e("RegistrationUtils/prettyPrintFromSim/number/trim/error", e);
            str3 = null;
        }
        if (str3 != null) {
            return A0E(str, C36431kI.A1B(str, replaceAll));
        }
        return replaceAll;
    }

    public static String A0C(C19420v0 r1, C21520zN r2) {
        if (r2 == null || r1 == null || !r2.A0E(7440)) {
            return null;
        }
        return C36341k9.A0E(r1).getString("app_install_source", "unknown|unknown");
    }

    public static String A0E(String str, String str2) {
        String str3;
        if (str == null || str2 == null) {
            Log.e("RegistrationUtils/prettyPrintFullPhoneNumber/cc-or-phnum-is-null");
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("+");
        A0u.append(str);
        String A0p = AnonymousClass000.A0p(" ", str2, A0u);
        C203559oI A002 = C203559oI.A00();
        try {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            AnonymousClass000.A1D("+", str, str2, A0u2);
            return A002.A0J(A002.A0F(A0u2.toString(), "ZZ"), C023109s.A01);
        } catch (Exception e) {
            e = e;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-exception";
            Log.e(str3, e);
            return A0p;
        } catch (ExceptionInInitializerError e2) {
            e = e2;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-init-exception";
            Log.e(str3, e);
            return A0p;
        }
    }

    public static void A0H(Activity activity, C19420v0 r7, C19900wh r8, Runnable runnable, String str) {
        Log.i("RegistrationUtils/showLoginFailedDialog");
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0r(false);
        A002.A0d(R.string.f12nameremoved);
        A002.A0p(C05480Pw.A00(C36391kE.A0v(activity, r7.A0d(), AnonymousClass001.A0L(), 0, R.string.f12nameremoved)));
        C39001qm.A0D(A002, runnable, 19, R.string.f12nameremoved);
        A002.A0f(new AnonymousClass3VG(activity, r7, r8, runnable, str), R.string.f12nameremoved);
        A002.A0b();
    }

    public static void A0J(Context context, C25271Fq r10, int i) {
        Log.i("RegistrationUtils/notifyNotVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0v = C36391kE.A0v(context, context.getString(R.string.f12nameremoved), new Object[1], 0, R.string.f12nameremoved);
        String string = context.getString(R.string.f12nameremoved);
        String string2 = context.getString(R.string.f12nameremoved);
        Intent A0H = C36441kJ.A0H(context, context.getClass());
        if (i != -1) {
            A0H.putExtra("com.whatsapp.verifynumber.dialog", i);
        }
        A0H.addFlags(536870912);
        PendingIntent A03 = C65743Th.A03(context, A0H, 0);
        C07700Yy A02 = C20600xp.A02(context);
        A02.A0M = "critical_app_alerts@1";
        A02.A0G(A0v);
        A02.A09(currentTimeMillis);
        A02.A06(3);
        C36361kB.A1B(A02, string, string2, true);
        A02.A0D = A03;
        C36361kB.A1A(A02);
        r10.A02(1, A02.A05());
    }

    public static void A0K(Context context, C25271Fq r10, C29501Ww r11, boolean z) {
        Intent A0A;
        Log.i("RegistrationUtils/notifyVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0v = C36391kE.A0v(context, context.getString(R.string.f12nameremoved), new Object[1], 0, R.string.f12nameremoved);
        String string = context.getString(R.string.f12nameremoved);
        String string2 = context.getString(R.string.f12nameremoved);
        if (z) {
            A0A = AnonymousClass190.A09(context);
        } else {
            A0A = AnonymousClass190.A0A(context);
            C29501Ww.A02(r11, 2, true);
        }
        PendingIntent A002 = C65743Th.A00(context, 1, A0A, 0);
        C07700Yy A0F = C36421kH.A0F(context);
        A0F.A0G(A0v);
        A0F.A09(currentTimeMillis);
        A0F.A06(3);
        C36361kB.A1B(A0F, string, string2, true);
        A0F.A0D = A002;
        C36361kB.A1A(A0F);
        r10.A02(1, A0F.A05());
    }

    public static void A0N(C225314u r2, int i) {
        AnonymousClass3FM r1 = new AnonymousClass3FM(r2);
        r1.A01 = R.drawable.permission_sms;
        AnonymousClass3FM.A01(r1, "android.permission.RECEIVE_SMS");
        r1.A02 = R.string.f12nameremoved;
        r1.A06 = true;
        r2.BuO(r1.A02(), i);
    }

    public static void A0O(AnonymousClass155 r2, C21520zN r3, int i) {
        if (r3.A0E(6290)) {
            C36331k8.A0r(r2, C36401kF.A0H(r2, i), R.color.f6nameremoved);
        }
    }

    public static void A0P(C19630wG r3, C19420v0 r4, C21520zN r5, AnonymousClass4TZ r6) {
        if (r5.A0E(6320)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) r3.A00.getSystemService("connectivity");
            NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
            if (C19550w8.A03()) {
                connectivityManager.requestNetwork(build, new C37011lf(r4, r6), 15000);
                return;
            } else {
                Log.i("RegistrationUtils/maybeExecuteRequestOnCellular/Less than SDK 26");
                r4.A1Y("silent_auth_sdk_under_26");
            }
        }
        r6.Bjl();
    }

    public static void A0Q(C19420v0 r1, String str) {
        A00 = str;
        C36341k9.A0x(C19420v0.A00(r1), "registration_failure_reason", str);
    }

    public static boolean A0R(int i) {
        Boolean bool = C18750th.A03;
        return AnonymousClass000.A1O(i);
    }

    public static AnonymousClass0FM A07(C225314u r6, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        View A0K = C36381kD.A0K(LayoutInflater.from(r6), R.layout.f9nameremoved);
        C39001qm A002 = AnonymousClass3LW.A00(r6);
        A002.A0c(R.string.f12nameremoved);
        A002.A0j(A0K);
        A002.A0r(false);
        TextView A0O = C36391kE.A0O(A0K, R.id.button3);
        TextView A0O2 = C36391kE.A0O(A0K, R.id.button1);
        TextView A0O3 = C36391kE.A0O(A0K, R.id.button2);
        A0O.setVisibility(0);
        A0O.setText(R.string.f12nameremoved);
        AnonymousClass3YH.A00(A0O, r6, runnable, 28);
        A0O3.setVisibility(0);
        A0O3.setText(R.string.f12nameremoved);
        C36331k8.A0r(r6, A0O3, R.color.f6nameremoved);
        AnonymousClass3YH.A00(A0O3, r6, runnable3, 29);
        A0O2.setVisibility(0);
        A0O2.setText(R.string.f12nameremoved);
        AnonymousClass3YH.A00(A0O2, r6, runnable2, 30);
        return A002.create();
    }

    public static AnonymousClass2d2 A08(C19420v0 r3, C21520zN r4) {
        int A01 = C36371kC.A01(C36341k9.A0E(r3), "reg_attempts_generate_code") + 1;
        C36321k7.A0q(r3, "reg_attempts_generate_code", A01);
        return new AnonymousClass2d2(A01, A0C(r3, r4));
    }

    public static CharSequence A09(AnonymousClass155 r7, C18820ts r8, String str, int i, long j, boolean z) {
        if (j > 3600000) {
            Spanned fromHtml = Html.fromHtml(C36321k7.A0B(r7.getResources(), (int) Math.ceil(((double) j) / 3600000.0d), 0, i));
            String obj = fromHtml.toString();
            SpannableString A0O = C36441kJ.A0O(obj);
            for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
                A0O.setSpan(new StyleSpan(1), fromHtml.getSpanStart(obj2), fromHtml.getSpanEnd(obj2), 18);
            }
            return A0O;
        }
        Locale A0x = C36401kF.A0x(r8);
        if (z) {
            Object[] A1Q = C36441kJ.A1Q();
            A1Q[0] = str;
            A1Q[1] = "  ";
            A1Q[2] = AnonymousClass3UY.A07(r8, C36391kE.A0B(j));
            return String.format(A0x, "%s%s%s", A1Q);
        }
        return Html.fromHtml(String.format(A0x, str, new Object[]{AnonymousClass3UY.A07(r8, C36391kE.A0B(j))}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r5.equals(r4) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0B(X.AnonymousClass1N4 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto L_0x004e
            int r1 = r12.length()
            int r0 = r11.length()
            if (r1 < r0) goto L_0x004e
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r12.replaceAll(r1, r0)
            java.lang.String r1 = r10.replaceAll(r1, r0)
            java.lang.String r6 = X.AnonymousClass3U2.A02(r9, r11, r1)
            java.lang.String r4 = X.AnonymousClass3U2.A02(r9, r11, r5)
            java.lang.String r7 = X.C36321k7.A0D(r11, r6)
            int r0 = A00(r6, r4)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.AnonymousClass3U2.A05(r5, r6, r4, r11)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r1.endsWith(r4)
            if (r0 == 0) goto L_0x004f
            int r1 = X.AnonymousClass3U2.A00(r9, r11, r4)
            r0 = 5
            if (r1 != r0) goto L_0x004f
        L_0x004e:
            return r8
        L_0x004f:
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x005a
            boolean r0 = r5.equals(r4)
            r1 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r0 = A0T(r9, r5, r11, r7, r3)
            if (r0 == 0) goto L_0x0062
            return r5
        L_0x0062:
            if (r1 == 0) goto L_0x006b
            boolean r0 = A0T(r9, r4, r11, r7, r3)
            if (r0 == 0) goto L_0x006b
            return r4
        L_0x006b:
            boolean r0 = A0T(r9, r5, r11, r6, r2)
            if (r0 == 0) goto L_0x007a
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r11, r5)
        L_0x0075:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x007a:
            if (r1 == 0) goto L_0x004e
            boolean r0 = A0T(r9, r4, r11, r6, r2)
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r11, r4)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65983Uf.A0B(X.1N4, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A0D(C18820ts r1, String str, String str2) {
        return r1.A0H(A0E(str, str2));
    }

    public static void A0F(Activity activity, AnonymousClass1RU r3, C19420v0 r4, C19900wh r5) {
        if (!TextUtils.isEmpty(r4.A0d())) {
            A0H(activity, r4, r5, (Runnable) null, (String) null);
            return;
        }
        Log.i("AccountSwitcher/abandonAddAccount");
        r3.A06(activity, (String) null, true);
    }

    public static void A0G(Activity activity, C19420v0 r4, C19900wh r5) {
        if (!TextUtils.isEmpty(r4.A0d())) {
            A0H(activity, r4, r5, (Runnable) null, (String) null);
            return;
        }
        A0I(activity, (Runnable) null, (String) null, r5.A01(), r4.A0I());
    }

    public static void A0I(Activity activity, Runnable runnable, String str, String str2, int i) {
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0r(false);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        C39001qm.A0D(A002, runnable, 18, R.string.f12nameremoved);
        A002.A0f(new AnonymousClass3VF(activity, runnable, str, str2, i), R.string.f12nameremoved);
        A002.A0b();
    }

    public static void A0L(Context context, C25271Fq r6, String str, String str2, String str3) {
        PendingIntent A002 = C65743Th.A00(context, 1, AnonymousClass190.A09(context), 0);
        C07700Yy A02 = C20600xp.A02(context);
        A02.A0M = "critical_app_alerts@1";
        A02.A0G(str);
        A02.A09(System.currentTimeMillis());
        A02.A06(3);
        C36361kB.A1B(A02, str2, str3, true);
        C36341k9.A14(A02, str3);
        A02.A0D = A002;
        C36361kB.A1A(A02);
        r6.A02(1, A02.A05());
    }

    public static void A0M(View view, C225314u r4, C18820ts r5, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        Toolbar toolbar = (Toolbar) C012005e.A02(view, i);
        toolbar.setVisibility(0);
        AnonymousClass07B A0Q = C36431kI.A0Q(r4, toolbar);
        if (A0Q != null) {
            A0Q.A0U(z);
            A0Q.A0X(false);
        }
        if (z3) {
            toolbar.setNavigationIcon((Drawable) new C100744vb(AnonymousClass3UF.A06(r4.getResources(), r4.getResources().getDrawable(R.drawable.ic_close), R.color.f6nameremoved), r5));
            toolbar.setNavigationOnClickListener(new AnonymousClass3Y6(r4, 27));
            i2 = R.string.f12nameremoved;
        } else if (z2) {
            AnonymousClass3UF.A0C(r4, toolbar, r5);
            toolbar.setNavigationOnClickListener(new AnonymousClass3Y6(r4, 28));
            i2 = R.string.f12nameremoved;
        } else {
            return;
        }
        toolbar.setNavigationContentDescription(i2);
    }

    public static boolean A0S(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C36431kI.A1P(((((float) displayMetrics.heightPixels) / displayMetrics.density) > 500.0f ? 1 : ((((float) displayMetrics.heightPixels) / displayMetrics.density) == 500.0f ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0T(X.AnonymousClass1N4 r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r0 != 0) goto L_0x0055
            int r1 = r9.length()
            int r4 = r10.length()
            if (r1 < r4) goto L_0x0055
            r3 = 1
            int r6 = r11.length()
            int r0 = X.AnonymousClass000.A05(r6, r1)
            r5 = 0
            if (r0 != r3) goto L_0x005c
            r2 = r9
            if (r6 >= r1) goto L_0x0021
            r2 = r11
        L_0x0021:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x0028
            r11 = r9
        L_0x0028:
            int r0 = r2.length()
            if (r5 >= r0) goto L_0x007c
            char r1 = r2.charAt(r5)
            char r0 = r11.charAt(r5)
            if (r1 == r0) goto L_0x0059
            int r0 = r5 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r2.substring(r5)
        L_0x0042:
            boolean r0 = r1.equals(r0)
        L_0x0046:
            if (r12 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0055
            java.lang.String r9 = r9.substring(r4)
        L_0x004e:
            int r0 = X.AnonymousClass3U2.A00(r8, r10, r9)
            if (r0 != r3) goto L_0x0055
            r7 = 1
        L_0x0055:
            return r7
        L_0x0056:
            if (r0 == 0) goto L_0x0055
            goto L_0x004e
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x005c:
            if (r0 != 0) goto L_0x007e
            r2 = 0
        L_0x005f:
            if (r2 >= r6) goto L_0x007e
            char r1 = r11.charAt(r2)
            char r0 = r9.charAt(r2)
            if (r1 == r0) goto L_0x0079
            int r6 = r6 - r3
            if (r2 == r6) goto L_0x007c
            int r0 = r2 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r9.substring(r0)
            goto L_0x0042
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x007c:
            r0 = 1
            goto L_0x0046
        L_0x007e:
            r0 = 0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65983Uf.A0T(X.1N4, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public static boolean A0U(C19420v0 r3, C20810yC r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegistrationUtils/isMAACPhase2Enabled/autoconfType=");
        A0u.append(r3.A06());
        A0u.append("/autoconf_phase_2_enabled = ");
        C36331k8.A1S(A0u, r4.A0E(4667));
        if (r3.A06() < 2 || !r4.A0E(4667)) {
            return false;
        }
        return true;
    }

    public static boolean A0V(C19420v0 r7, boolean z) {
        int A06 = r7.A06();
        AnonymousClass005 r3 = r7.A00;
        int i = C36391kE.A0H(r3).getInt("autoconf_cf_type", -1);
        boolean A1S = AnonymousClass000.A1S(C36391kE.A0H(r3).getInt("pref_autoconf_verification_status", -1), 1);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegistrationUtils/shouldCreateAutoconfVerifier/autoconfType=");
        A0u.append(A06);
        A0u.append("/autoconfCfType=");
        A0u.append(i);
        A0u.append("/isSimPresent=");
        A0u.append(z);
        A0u.append("/registeredWithAutoConf=");
        A0u.append(A1S);
        C36321k7.A1X("/bypassSimCheck=", A0u, false);
        if (A06 < 1 || A1S) {
            return false;
        }
        if (z || i == 1) {
            return true;
        }
        return false;
    }

    public static byte[] A0W(String str) {
        try {
            UUID fromString = UUID.fromString(str);
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(fromString.getMostSignificantBits());
            allocate.putLong(fromString.getLeastSignificantBits());
            return allocate.array();
        } catch (IllegalArgumentException unused) {
            C36321k7.A1P("RegistrationUtils/getBytesFromUUIDString/invalid-input ", str, AnonymousClass000.A0u());
            return new byte[0];
        }
    }
}
