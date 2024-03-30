package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1RU;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UV;
import X.AnonymousClass3YH;
import X.AnonymousClass4UE;
import X.AnonymousClass4XO;
import X.C023109s;
import X.C05480Pw;
import X.C10810fG;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C19890wg;
import X.C199929gH;
import X.C203559oI;
import X.C21520zN;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C50112kE;
import X.C52082or;
import X.C65983Uf;
import X.C66713Xa;
import X.C81143wX;
import X.C89354Wf;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.provider.Telephony;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public final class SendSmsToWa extends AnonymousClass155 implements AnonymousClass4UE {
    public AnonymousClass1RU A00;
    public C19630wG A01;
    public C21520zN A02;
    public C19890wg A03;
    public AnonymousClass3UV A04;
    public C29501Ww A05;
    public C199929gH A06;
    public C50112kE A07;
    public int A08;
    public boolean A09;
    public boolean A0A;
    public final Runnable A0B;

    public void BKC(boolean z, String str) {
    }

    public void BTw(C52082or r5, C66713Xa r6, String str) {
        boolean A1a = C36341k9.A1a(str, r5);
        C36321k7.A1K(r5, "SendSmsToWa/onCodeEntrypointResponse/status=", AnonymousClass000.A0u());
        if (r5.ordinal() != 0) {
            A0H(this, 5000);
            return;
        }
        AnonymousClass3SJ.A00(this, A1a ? 1 : 0);
        AnonymousClass3SJ.A00(this, 2);
        C29501Ww r1 = this.A05;
        if (r1 != null) {
            C29501Ww.A02(r1, 4, A1a);
            Intent A0B2 = C36381kD.A0B(this);
            A0B2.putExtra("use_sms_retriever", A1a);
            A0B2.putExtra("request_code_method", str);
            A0B2.putExtra("request_code_status", 0);
            A0B2.putExtra("request_code_result", r6);
            A0B2.putExtra("code_verification_mode", 0);
            startActivity(A0B2);
            finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public void Bu4(boolean z, String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1RU r2 = this.A00;
        if (r2 != null) {
            boolean A0F = r2.A0F(getIntent().getBooleanExtra("changeNumber", false));
            this.A0A = A0F;
            C65983Uf.A0M(this.A00, this, this.A00, R.id.send_sms_to_wa_title_toolbar, false, false, A0F);
            C21520zN r0 = this.A02;
            if (r0 != null) {
                C65983Uf.A0O(this, r0, R.id.send_sms_to_wa_title_toolbar_text);
                C10810fG r3 = new C10810fG();
                String stringExtra = getIntent().getStringExtra("sendSmsNumber");
                r3.element = stringExtra;
                if (stringExtra == null || stringExtra.length() == 0) {
                    String A0t = C36371kC.A0t(A01(this), "send_sms_number");
                    r3.element = A0t;
                    if (A0t == null || A0t.length() == 0) {
                        A0G(this);
                    }
                } else {
                    C29501Ww r22 = this.A05;
                    if (r22 != null) {
                        C29501Ww.A02(r22, 22, true);
                        C36341k9.A0x(A01(this).edit(), "send_sms_number", (String) r3.element);
                    } else {
                        throw C36331k8.A0d("registrationManager");
                    }
                }
                AnonymousClass3YH.A00(C36361kB.A0G(this.A00, R.id.send_sms_to_wa_button), this, r3, 33);
                return;
            }
            throw C36331k8.A0d("abPreChatdProps");
        }
        throw C36331k8.A0d("accountSwitcher");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = R.string.f12nameremoved;
        if (i != 1) {
            if (i != 2) {
                return super.onCreateDialog(i);
            }
            i2 = R.string.f12nameremoved;
        }
        String string = getString(i2);
        ProgressDialog progressDialog = new ProgressDialog(this);
        C36331k8.A0p(progressDialog, string);
        return progressDialog;
    }

    public static final SharedPreferences A01(SendSmsToWa sendSmsToWa) {
        C19890wg r1 = sendSmsToWa.A03;
        if (r1 != null) {
            SharedPreferences A002 = r1.A00("send_sms_to_wa");
            AnonymousClass00C.A08(A002);
            return A002;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    private final String A07() {
        C18820ts r3 = this.A00;
        String A0E = C65983Uf.A0E(this.A09.A0f(), this.A09.A0h());
        String str = null;
        if (A0E != null) {
            str = A0E.replace(' ', 160);
            AnonymousClass00C.A08(str);
        }
        return r3.A0H(str);
    }

    private final void A0F() {
        Log.i("SendSmsToWa/stopExecutingRequestCodeTask");
        C36331k8.A1E(this.A07);
        this.A04.Bnx(this.A0B);
    }

    public static final void A0G(SendSmsToWa sendSmsToWa) {
        C29501Ww r1 = sendSmsToWa.A05;
        if (r1 != null) {
            C29501Ww.A02(r1, 4, true);
            Intent A0B2 = C36381kD.A0B(sendSmsToWa);
            A0B2.putExtra("return_to_phone_number", true);
            sendSmsToWa.startActivity(A0B2);
            sendSmsToWa.finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public static final void A0I(SendSmsToWa sendSmsToWa, String str) {
        String replace;
        Intent A0I = C36441kJ.A0I("android.intent.action.SENDTO");
        C36421kH.A0n(A0I, AnonymousClass000.A0p("smsto:", str, AnonymousClass000.A0u()));
        List<ResolveInfo> queryIntentActivities = sendSmsToWa.getPackageManager().queryIntentActivities(A0I, 0);
        AnonymousClass00C.A08(queryIntentActivities);
        if (C36401kF.A1a(queryIntentActivities)) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(sendSmsToWa);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A0I.setClassName(activityInfo.packageName, activityInfo.name);
            } else {
                A0I.setPackage(defaultSmsPackage);
            }
            A0I.putExtra("sms_body", sendSmsToWa.getString(R.string.f12nameremoved));
            C36331k8.A0w(A01(sendSmsToWa).edit(), "send_sms_intent_triggered", true);
            sendSmsToWa.startActivity(A0I);
            return;
        }
        Log.e("SendSmsToWa no sms activities");
        C39001qm A002 = AnonymousClass3LW.A00(sendSmsToWa);
        A002.A0d(R.string.f12nameremoved);
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = sendSmsToWa.A07();
        C18820ts r3 = sendSmsToWa.A00;
        String A0t = C36371kC.A0t(A01(sendSmsToWa), "send_sms_number");
        if (A0t == null) {
            Log.e("RegistrationUtils/prettyPrintPhoneNumber/fullPhoneNumber is null");
        } else {
            C203559oI A003 = C203559oI.A00();
            try {
                A0t = A003.A0J(A003.A0F(AnonymousClass000.A0p("+", A0t, AnonymousClass000.A0u()), "ZZ"), C023109s.A01);
                if (A0t != null) {
                    replace = A0t.replace(' ', 160);
                    AnonymousClass00C.A08(replace);
                    A002.A0p(C05480Pw.A00(C36391kE.A0v(sendSmsToWa, r3.A0H(replace), A0M, 1, R.string.f12nameremoved)));
                    A002.A0r(false);
                    A002.A0i(new AnonymousClass4XO(sendSmsToWa, 26), sendSmsToWa.getString(R.string.f12nameremoved));
                    C36341k9.A11(A002);
                }
            } catch (Exception e) {
                Log.e("RegistrationUtils/prettyPrintPhoneNumber/formatter-exception", e);
            }
        }
        replace = null;
        A002.A0p(C05480Pw.A00(C36391kE.A0v(sendSmsToWa, r3.A0H(replace), A0M, 1, R.string.f12nameremoved)));
        A002.A0r(false);
        A002.A0i(new AnonymousClass4XO(sendSmsToWa, 26), sendSmsToWa.getString(R.string.f12nameremoved));
        C36341k9.A11(A002);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A01 = C36351kA.A0W(A0B2);
            this.A02 = C36401kF.A0Y(A0B2);
            this.A00 = C36351kA.A0R(A0B2);
            this.A06 = (C199929gH) r1.A0I.get();
            this.A05 = C36401kF.A0d(A0B2);
            this.A04 = C36431kI.A0t(A0B2);
            this.A03 = C36351kA.A0m(A0B2);
        }
    }

    public void onBackPressed() {
        if (this.A0A) {
            Log.i("SendSmsToWa/onBackPressed/is adding new account");
            AnonymousClass1RU r2 = this.A00;
            if (r2 != null) {
                C65983Uf.A0F(this, r2, this.A09, this.A0A);
                return;
            }
            throw C36331k8.A0d("accountSwitcher");
        } else if (getIntent().getBooleanExtra("changeNumber", false)) {
            C29501Ww r22 = this.A05;
            if (r22 != null) {
                C29501Ww.A02(r22, 3, true);
                C29501Ww r0 = this.A05;
                if (r0 != null) {
                    if (!r0.A0F()) {
                        finish();
                    }
                    startActivity(AnonymousClass190.A00(this));
                    finish();
                    return;
                }
                throw C36331k8.A0d("registrationManager");
            }
            throw C36331k8.A0d("registrationManager");
        } else {
            super.onBackPressed();
        }
    }

    public SendSmsToWa(int i) {
        this.A09 = false;
        C89354Wf.A00(this, 46);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(com.whatsapp.registration.SendSmsToWa r10, long r11) {
        /*
            android.content.SharedPreferences r0 = A01(r10)
            java.lang.String r7 = "send_sms_intent_triggered"
            boolean r0 = X.C36371kC.A1U(r0, r7)
            r5 = 1
            if (r0 == 0) goto L_0x00f8
            android.content.SharedPreferences r0 = A01(r10)
            java.lang.String r6 = "first_resume_ts_after_trigger"
            r3 = 0
            long r8 = r0.getLong(r6, r3)
            r1 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "SendSmsToWa/first resume after send sms intent was triggered"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = X.C36431kI.A08(r10)
            android.content.SharedPreferences r2 = A01(r10)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            X.C36341k9.A0w(r2, r6, r0)
        L_0x0033:
            r10.A0F()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SendSmsToWa/executeRequestCodeTask/delay="
            X.C36321k7.A1V(r0, r1, r11)
            X.0wU r2 = r10.A04
            java.lang.Runnable r1 = r10.A0B
            java.lang.String r0 = "RequestCodeTask"
            r2.BpM(r1, r0, r11)
        L_0x0048:
            int r0 = r10.A08
            if (r5 == r0) goto L_0x0059
            r0 = 1
            X.AnonymousClass3SJ.A00(r10, r0)
            r0 = 2
            X.AnonymousClass3SJ.A00(r10, r0)
            X.AnonymousClass3SJ.A01(r10, r5)
            r10.A08 = r5
        L_0x0059:
            return
        L_0x005a:
            long r3 = X.C36431kI.A08(r10)
            long r3 = r3 - r8
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SendSmsToWa/timeElapsedSinceTriggerMs="
            X.C36321k7.A1V(r0, r8, r3)
            r8 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            r8 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r10.A0F()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SendSmsToWa/executeRequestCodeTask/delay="
            X.C36321k7.A1V(r0, r1, r11)
            X.0wU r2 = r10.A04
            java.lang.Runnable r1 = r10.A0B
            java.lang.String r0 = "RequestCodeTask"
            r2.BpM(r1, r0, r11)
            r5 = 2
            goto L_0x0048
        L_0x008c:
            java.lang.String r0 = "SendSmsToWa/time out reached for waiting for sms, showing try again dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass3SJ.A00(r10, r5)
            r0 = 2
            X.AnonymousClass3SJ.A00(r10, r0)
            r3 = 0
            android.content.SharedPreferences r0 = A01(r10)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36331k8.A0w(r0, r7, r3)
            android.content.SharedPreferences r0 = A01(r10)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36341k9.A0w(r0, r6, r1)
            X.1qm r3 = X.AnonymousClass3LW.A00(r10)
            r0 = 2131894046(0x7f121f1e, float:1.9422886E38)
            r3.A0d(r0)
            r4 = 2131894045(0x7f121f1d, float:1.9422884E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r0 = r10.A07()
            r1 = 0
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r2, r1, r4)
            android.text.Spanned r0 = X.C05480Pw.A00(r0)
            r3.A0p(r0)
            r3.A0r(r1)
            r0 = 2131895087(0x7f12232f, float:1.9424997E38)
            java.lang.String r2 = r10.getString(r0)
            r1 = 25
            X.4XO r0 = new X.4XO
            r0.<init>(r10, r1)
            r3.A0i(r0, r2)
            r0 = 2131896226(0x7f1227a2, float:1.9427307E38)
            java.lang.String r2 = r10.getString(r0)
            r0 = 24
            X.4XO r1 = new X.4XO
            r1.<init>(r10, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0R(r1, r2)
            X.C36341k9.A11(r3)
        L_0x00f8:
            r5 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.SendSmsToWa.A0H(com.whatsapp.registration.SendSmsToWa, long):void");
    }

    public void onDestroy() {
        super.onDestroy();
        A0F();
    }

    public void onResume() {
        super.onResume();
        A0F();
        A0H(this, 0);
    }

    public SendSmsToWa() {
        this(0);
        this.A0B = C81143wX.A00(this, 22);
    }
}
