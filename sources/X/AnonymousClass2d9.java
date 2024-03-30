package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.2d9  reason: invalid class name */
public abstract class AnonymousClass2d9 extends AnonymousClass24S implements AnonymousClass4UD {
    public C19460v5 A00;
    public AnonymousClass1VX A01;
    public AnonymousClass1N4 A02;
    public C21360z5 A03;
    public AnonymousClass3DY A04;
    public C33771fu A05;
    public AnonymousClass1RU A06;
    public C33751fs A07;
    public C19630wG A08;
    public C20830yE A09;
    public C62603Gu A0A;
    public C21520zN A0B;
    public C21510zM A0C;
    public C21010yW A0D;
    public AnonymousClass6OK A0E;
    public AnonymousClass1CF A0F;
    public AnonymousClass13I A0G;
    public C63543Kl A0H;
    public AnonymousClass3UV A0I;
    public C29501Ww A0J;
    public AnonymousClass37L A0K;
    public C199929gH A0L;
    public C62043En A0M;
    public AnonymousClass3TX A0N;
    public AnonymousClass3AK A0O;
    public ExistViewModel A0P;
    public BanReportViewModel A0Q;
    public AnonymousClass1M4 A0R;
    public C32681e1 A0S;
    public AnonymousClass005 A0T;

    public static long A0r(String str) {
        return (C65983Uf.A01(str, 0) * 1000) + System.currentTimeMillis();
    }

    public static AnonymousClass3XC A0s(AnonymousClass2d9 r0) {
        return (AnonymousClass3XC) r0.A0P.A01.A04();
    }

    private void A0t() {
        String str;
        this.A04.Boy(new C81153wY((Object) this, 0));
        if (C65983Uf.A0V(this.A09, false)) {
            Log.i("EnterPhoneNumber/attempt to create autoconf verifier");
            C19770wU r2 = this.A04;
            String A0G2 = AnonymousClass24S.A0G(this);
            String A0H2 = AnonymousClass24S.A0H(this);
            if (this.A09.A06() == 3) {
                str = "2";
            } else {
                str = "1";
            }
            C36441kJ.A1E(new C49752jd(this.A09, this.A0I, this.A0L, A0G2, A0H2, str, false), r2);
            return;
        }
        Log.i("EnterPhoneNumber/should not create autoconf verifier");
    }

    private void A0u(AnonymousClass3OL r17) {
        int A012;
        Log.i("EnterPhoneNumber/new-installation");
        C65983Uf.A0Q(this.A09, C65983Uf.A00);
        A3k(15);
        A3i();
        AnonymousClass3OL r2 = r17;
        C18740tg.A06(r2);
        ExistViewModel existViewModel = this.A0P;
        C36341k9.A18(existViewModel.A0A, r2.A0P);
        String str = r2.A0K;
        String str2 = r2.A0L;
        String str3 = r2.A0M;
        String str4 = r2.A0F;
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            registerPhone.A04 = (C65983Uf.A01(str, 0) * 1000) + System.currentTimeMillis();
            registerPhone.A05 = A0r(str2);
            registerPhone.A06 = A0r(str3);
            registerPhone.A02 = A0r(str4);
            registerPhone.A09.A1l(AnonymousClass24S.A0G(registerPhone), AnonymousClass24S.A0H(registerPhone));
            C19460v5 r1 = registerPhone.A0C;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("smbSaveBusinessNameForRegistration");
            } else if (registerPhone.A0H.A00) {
            } else {
                if (AnonymousClass3D0.A00(registerPhone.A0a).A01 && registerPhone.A0f) {
                    registerPhone.A0f = false;
                    Log.i("RegisterPhone/createNumberConfirmationDialog/ok");
                    if (AnonymousClass24S.A01(registerPhone) == 2) {
                        RegisterPhone.A0m(registerPhone);
                    } else {
                        RegisterPhone.A0o(registerPhone, false);
                    }
                } else if (AnonymousClass24S.A0F(registerPhone) != null || !registerPhone.A0B.A0E(7556) || !RegisterPhone.A0q(registerPhone)) {
                    AnonymousClass3SJ.A01(registerPhone, 21);
                } else {
                    RegisterPhone.A0p(registerPhone, true);
                }
            }
        } else {
            ChangeNumber changeNumber = (ChangeNumber) this;
            C29341Wg r0 = changeNumber.A0F;
            r0.A09();
            C29341Wg.A03(r0);
            changeNumber.A0D.A00();
            changeNumber.A0C.A0G(false, 14);
            changeNumber.A02.A0D();
            C36441kJ.A0w(changeNumber.getFilesDir(), "me").delete();
            changeNumber.A0J.A0D(AnonymousClass24S.A0G(changeNumber), AnonymousClass24S.A0H(changeNumber), (String) null);
            int A013 = AnonymousClass24S.A01(changeNumber);
            boolean z = true;
            if (!(A013 == 1 || A013 == 3)) {
                z = false;
            }
            C29501Ww r12 = changeNumber.A0J;
            int i = 4;
            if (z) {
                i = 15;
            }
            C29501Ww.A02(r12, i, true);
            changeNumber.A03 = (C65983Uf.A01(str, 0) * 1000) + System.currentTimeMillis();
            changeNumber.A04 = A0r(str2);
            changeNumber.A05 = A0r(str3);
            changeNumber.A02 = A0r(str4);
            if (!((AnonymousClass24S.A0F(changeNumber) != null && changeNumber.A0B.A0E(4031)) || (A012 = AnonymousClass24S.A01(changeNumber)) == 1 || A012 == 3 || C36361kB.A03(changeNumber.A0P.A06) == 1)) {
                if (C55252uK.A00(changeNumber.A08, changeNumber.A0B, C36361kB.A03(changeNumber.A0P.A07))) {
                    changeNumber.A33(AnonymousClass190.A0K(changeNumber, C36361kB.A03(changeNumber.A0P.A07), changeNumber.A03, changeNumber.A04, true), true);
                    return;
                } else if (changeNumber.A09.A02("android.permission.RECEIVE_SMS") != 0) {
                    AnonymousClass97V.A00(changeNumber.A08, changeNumber.A09, changeNumber, false);
                    return;
                }
            }
            ChangeNumber.A0h(changeNumber, false);
        }
    }

    public void A3i() {
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            registerPhone.A03 = C36431kI.A08(registerPhone);
            return;
        }
        ((ChangeNumber) this).A0M.run();
    }

    public void A3k(int i) {
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            C36341k9.A16(registerPhone.A0P.A0F, i);
            SharedPreferences.Editor edit = registerPhone.getPreferences(0).edit();
            edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", C36361kB.A03(registerPhone.A0P.A0F));
            if (!edit.commit()) {
                Log.w("RegisterPhone/savestate/commit failed");
            }
        }
    }

    public void A3l(String str, String str2, String str3) {
        Log.i("EnterPhoneNumber/registrationHasBeenVerified");
        this.A0J.A0D(str, str2, str3);
        A0t();
        this.A0G.A00(false);
    }

    public boolean A3m(String str, String str2, boolean z) {
        if (this.A06.A0A()) {
            String A052 = this.A06.A05(str, str2);
            if (!TextUtils.isEmpty(A052)) {
                C39001qm A002 = AnonymousClass3LW.A00(this);
                A002.A0p(AnonymousClass14B.A01(this, new Object[]{C65983Uf.A0D(this.A00, str, str2)}, R.string.f12nameremoved));
                A002.A0m(this, new C67803ar(this, A052, z), R.string.f12nameremoved);
                A002.A0l(this, (AnonymousClass04S) null, R.string.f12nameremoved);
                C36341k9.A11(A002);
                return true;
            }
        }
        return false;
    }

    public void BKB() {
        AnonymousClass3SJ.A00(this, 9);
        if (this instanceof RegisterPhone) {
            ((RegisterPhone) this).A0V = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BX8(X.AnonymousClass3OL r24, java.lang.String r25, java.lang.String r26, int r27, long r28) {
        /*
            r23 = this;
            r11 = r23
            r11.A3j()
            r6 = 21
            r12 = 0
            r7 = 3
            r3 = 1
            r0 = r24
            r8 = r27
            if (r24 == 0) goto L_0x00c4
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            int r5 = r0.A07
            X.00s r4 = r4.A0G
            X.C36341k9.A16(r4, r5)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            java.lang.String r5 = r0.A0J
            X.00s r4 = r4.A0C
            r4.A0D(r5)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            int r5 = r0.A03
            X.00s r4 = r4.A07
            X.C36341k9.A16(r4, r5)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            java.lang.String r5 = r0.A0G
            X.00s r4 = r4.A08
            r4.A0D(r5)
            X.0v0 r4 = r11.A09
            java.lang.String r9 = r0.A0E
            android.content.SharedPreferences$Editor r5 = X.C36331k8.A05(r4)
            java.lang.String r4 = "email_address"
            X.C36341k9.A0x(r5, r4, r9)
            int r9 = r0.A02
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            X.00s r4 = r4.A06
            X.C36341k9.A16(r4, r9)
            X.0v0 r4 = r11.A09
            android.content.SharedPreferences$Editor r5 = X.C36331k8.A05(r4)
            java.lang.String r4 = "pref_email_otp_eligibility"
            X.C36341k9.A0v(r5, r4, r9)
            if (r9 != r3) goto L_0x04ce
            X.0v0 r5 = r11.A09
            java.lang.String r4 = "email_otp_eligible"
        L_0x005b:
            r5.A1Q(r4)
        L_0x005e:
            int r4 = X.AnonymousClass24S.A01(r11)
            if (r4 == r3) goto L_0x04c5
            if (r4 == r7) goto L_0x04c5
            int r4 = r0.A07
            if (r4 != 0) goto L_0x006f
            X.0v0 r4 = r11.A09
            r4.A1a(r12)
        L_0x006f:
            X.0v0 r5 = r11.A09
            int r4 = X.AnonymousClass24S.A01(r11)
            boolean r9 = X.AnonymousClass000.A1S(r4, r7)
            android.content.SharedPreferences$Editor r5 = X.C36331k8.A05(r5)
            java.lang.String r4 = "pref_wa_old_for_uc"
            X.C36331k8.A0w(r5, r4, r9)
            int r5 = r0.A04
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            X.00s r4 = r4.A0E
            X.C36341k9.A16(r4, r5)
            if (r5 != r3) goto L_0x0094
            X.0v0 r5 = r11.A09
            java.lang.String r4 = "silent_auth_eligible"
            r5.A1Y(r4)
        L_0x0094:
            X.0v0 r4 = r11.A09
            int r9 = r0.A00
            android.content.SharedPreferences$Editor r5 = X.C36331k8.A05(r4)
            java.lang.String r4 = "autoconf_cf_type"
            X.C36341k9.A0v(r5, r4, r9)
            X.0v0 r5 = r11.A09
            if (r8 != r6) goto L_0x04c2
            java.lang.String r4 = "captcha_eligible"
        L_0x00a7:
            r5.A1P(r4)
            int r9 = r0.A06
            if (r9 <= 0) goto L_0x00b7
            android.content.SharedPreferences$Editor r5 = X.C36421kH.A0A(r11)
            java.lang.String r4 = "registration_voice_code_length"
            X.C36341k9.A0v(r5, r4, r9)
        L_0x00b7:
            int r9 = r0.A05
            if (r9 <= 0) goto L_0x00c4
            android.content.SharedPreferences$Editor r5 = X.C36421kH.A0A(r11)
            java.lang.String r4 = "registration_sms_code_length"
            X.C36341k9.A0v(r5, r4, r9)
        L_0x00c4:
            r10 = 4
            if (r8 == r10) goto L_0x04b1
            if (r8 == r7) goto L_0x04fa
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            X.00s r4 = r4.A02
            r4.A0D(r12)
            r5 = r25
            r4 = r26
            if (r8 != r3) goto L_0x011a
            java.lang.String r1 = "EnterPhoneNumber/reinstalled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r11.A3i()
            X.C18740tg.A06(r0)
            X.1Ww r2 = r11.A0J
            java.lang.String r1 = r0.A0U
            r2.A0D(r5, r4, r1)
            X.0v0 r2 = r11.A09
            boolean r1 = r0.A0X
            r2.A1w(r1)
            X.0v0 r2 = r11.A09
            boolean r1 = r0.A0W
            r2.A1v(r1)
            X.0v0 r2 = r11.A09
            boolean r1 = r0.A0V
            r2.A1r(r1)
            boolean r1 = r11.isFinishing()
            if (r1 != 0) goto L_0x0119
            X.3En r2 = r11.A0M
            r15 = 8
            X.3vV r1 = new X.3vV
            r10 = r1
            r12 = r0
            r13 = r5
            r14 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            X.3wP r0 = X.C81063wP.A00
            X.0FM r0 = r2.A00(r11, r1, r0)
            r0.show()
        L_0x0119:
            return
        L_0x011a:
            r15 = 2
            if (r8 != r15) goto L_0x0121
            r11.A0u(r0)
            return
        L_0x0121:
            r9 = 22
            if (r8 != r9) goto L_0x0130
            java.lang.String r0 = "EnterPhoneNumber/onExistCheckResponse/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.17Y r0 = r11.A05
            X.C55232uI.A00(r0)
            return
        L_0x0130:
            r9 = 5
            if (r8 != r9) goto L_0x0189
            java.lang.String r1 = "EnterPhoneNumber/blocked"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            if (r24 == 0) goto L_0x014f
            X.3XC r2 = r0.A0B
            if (r2 == 0) goto L_0x014f
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r1 = r11.A0P
            X.00s r1 = r1.A01
            r1.A0D(r2)
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = r11.A0Q
            X.3XC r1 = A0s(r11)
            java.lang.String r1 = r1.A01
            r2.A00 = r1
        L_0x014f:
            X.AnonymousClass24S.A0O(r11, r5, r4)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r11.A0P
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "+"
            r2.append(r1)
            X.00s r1 = r4.A03
            java.lang.Object r1 = r1.A04()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass24S.A0H(r11)
            java.lang.String r2 = X.AnonymousClass000.A0q(r1, r2)
            X.00s r1 = r4.A02
            r1.A0D(r2)
            if (r24 == 0) goto L_0x03da
            X.3KJ r1 = r0.A0C
            if (r1 == 0) goto L_0x0350
            X.C18740tg.A06(r0)
            android.content.Intent r0 = X.AnonymousClass190.A0y(r11, r1)
            r11.startActivity(r0)
        L_0x0185:
            r11.finish()
            return
        L_0x0189:
            if (r8 == r10) goto L_0x04b1
            if (r8 == r7) goto L_0x04fa
            r9 = 6
            if (r8 != r9) goto L_0x01b9
            java.lang.String r0 = "EnterPhoneNumber/phone-number-too-long"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3AK r4 = r11.A0O
            android.widget.TextView r0 = r4.A04
            if (r0 != 0) goto L_0x01b4
            X.1M4 r2 = r11.A0R
            X.0ts r1 = r11.A00
            java.lang.String r0 = r4.A06
            java.lang.String r0 = r2.A03(r1, r0)
        L_0x01a5:
            X.3Kl r4 = r11.A0H
            r2 = 2131893390(0x7f121c8e, float:1.9421555E38)
        L_0x01aa:
            java.lang.Object[] r1 = X.C36431kI.A1Z(r0, r3)
        L_0x01ae:
            java.lang.String r0 = r11.getString(r2, r1)
            goto L_0x0511
        L_0x01b4:
            java.lang.String r0 = X.C36371kC.A0u(r0)
            goto L_0x01a5
        L_0x01b9:
            r9 = 7
            if (r8 != r9) goto L_0x01dc
            java.lang.String r0 = "EnterPhoneNumber/phone-number-too-short"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3AK r4 = r11.A0O
            android.widget.TextView r0 = r4.A04
            if (r0 != 0) goto L_0x01d7
            X.1M4 r2 = r11.A0R
            X.0ts r1 = r11.A00
            java.lang.String r0 = r4.A06
            java.lang.String r0 = r2.A03(r1, r0)
        L_0x01d1:
            X.3Kl r4 = r11.A0H
            r2 = 2131893391(0x7f121c8f, float:1.9421557E38)
            goto L_0x01aa
        L_0x01d7:
            java.lang.String r0 = X.C36371kC.A0u(r0)
            goto L_0x01d1
        L_0x01dc:
            r9 = 8
            if (r8 != r9) goto L_0x0230
            java.lang.String r0 = "EnterPhoneNumber/phone-number-bad-format"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3AK r3 = r11.A0O
            android.widget.TextView r0 = r3.A04
            if (r0 != 0) goto L_0x022b
            X.1M4 r2 = r11.A0R
            X.0ts r1 = r11.A00
            java.lang.String r0 = r3.A06
            java.lang.String r3 = r2.A03(r1, r0)
        L_0x01f5:
            X.0ts r2 = r11.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "+"
            r1.append(r0)
            X.3AK r0 = r11.A0O
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            r1.append(r0)
            java.lang.String r0 = X.C19430v1.A09
            r1.append(r0)
            X.3AK r0 = r11.A0O
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.String r0 = r2.A0H(r0)
            X.3Kl r4 = r11.A0H
            r2 = 2131893387(0x7f121c8b, float:1.942155E38)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            X.C36341k9.A1I(r0, r3, r1)
            goto L_0x01ae
        L_0x022b:
            java.lang.String r3 = X.C36371kC.A0u(r0)
            goto L_0x01f5
        L_0x0230:
            r9 = 9
            if (r8 != r9) goto L_0x0276
            java.lang.String r1 = "EnterPhoneNumber/temporarily-unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.A0I
            if (r0 != 0) goto L_0x0249
            X.3Kl r1 = r11.A0H
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
        L_0x0245:
            r1.A02(r0)
            return
        L_0x0249:
            long r2 = X.C36411kG.A0B(r0)     // Catch:{ NumberFormatException -> 0x0270 }
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r11.A0P     // Catch:{ NumberFormatException -> 0x0270 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x0270 }
            long r4 = r4 + r2
            X.00s r1 = r0.A0B     // Catch:{ NumberFormatException -> 0x0270 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0270 }
            r1.A0D(r0)     // Catch:{ NumberFormatException -> 0x0270 }
            X.1Ww r0 = r11.A0J     // Catch:{ NumberFormatException -> 0x0270 }
            r0.A0C(r2)     // Catch:{ NumberFormatException -> 0x0270 }
            X.3Kl r1 = r11.A0H     // Catch:{ NumberFormatException -> 0x0270 }
            r0 = 2131893445(0x7f121cc5, float:1.9421667E38)
            java.lang.String r0 = X.AnonymousClass3UY.A01(r11, r0, r2)     // Catch:{ NumberFormatException -> 0x0270 }
            r1.A03(r0)     // Catch:{ NumberFormatException -> 0x0270 }
            goto L_0x04d6
        L_0x0270:
            X.3Kl r1 = r11.A0H
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
            goto L_0x0245
        L_0x0276:
            r9 = 12
            if (r8 != r9) goto L_0x0292
            X.C18740tg.A06(r0)
            X.3KE r2 = r0.A0D
            java.lang.String r0 = "EnterPhoneNumber/old-version"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x047a
            X.0z5 r0 = r11.A03
            r0.A01 = r3
            X.3Kl r1 = r11.A0H
            r0 = 114(0x72, float:1.6E-43)
            r1.A01(r0)
            return
        L_0x0292:
            r9 = 14
            if (r8 == r9) goto L_0x04d8
            r9 = 15
            if (r8 == r9) goto L_0x04d8
            r9 = 11
            if (r8 != r9) goto L_0x02e7
            java.lang.String r0 = "EnterPhoneNumber/too-recent"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r6 = "EnterPhoneNumber/too-recent/time-not-int"
            r3 = 0
            int r0 = (r28 > r3 ? 1 : (r28 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x02dd
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r28 * r3
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r11.A0P     // Catch:{ NumberFormatException -> 0x02d2 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x02d2 }
            long r4 = r4 + r1
            X.00s r3 = r0.A0B     // Catch:{ NumberFormatException -> 0x02d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x02d2 }
            r3.A0D(r0)     // Catch:{ NumberFormatException -> 0x02d2 }
            X.1Ww r0 = r11.A0J     // Catch:{ NumberFormatException -> 0x02d2 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x02d2 }
            X.3Kl r3 = r11.A0H     // Catch:{ NumberFormatException -> 0x02d2 }
            r0 = 2131893447(0x7f121cc7, float:1.942167E38)
            java.lang.String r0 = X.AnonymousClass3UY.A01(r11, r0, r1)     // Catch:{ NumberFormatException -> 0x02d2 }
            r3.A03(r0)     // Catch:{ NumberFormatException -> 0x02d2 }
            goto L_0x04d7
        L_0x02d2:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
            X.3Kl r1 = r11.A0H
            r0 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x0245
        L_0x02dd:
            com.whatsapp.util.Log.w((java.lang.String) r6)
            X.3Kl r1 = r11.A0H
            r0 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x0245
        L_0x02e7:
            r1 = 16
            if (r8 != r1) goto L_0x049b
            java.lang.String r1 = "EnterPhoneNumber/onStatusNeedsTwoFa"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r11.A3i()
            X.C18740tg.A06(r0)
            X.0v0 r12 = r11.A09
            java.lang.String r13 = r0.A0O
            java.lang.String r14 = r0.A0N
            long r15 = r0.A0A
            long r21 = X.C36431kI.A08(r11)
            r17 = -1
            r19 = -1
            r12.A1n(r13, r14, r15, r17, r19, r21)
            X.AnonymousClass24S.A0O(r11, r5, r4)
            X.0v0 r4 = r11.A09
            java.lang.String r2 = X.AnonymousClass24S.A0G(r11)
            java.lang.String r1 = X.AnonymousClass24S.A0H(r11)
            r4.A1l(r2, r1)
            r11.A0t()
            X.3TX r4 = r11.A0N
            java.lang.String r2 = "enter_number"
            java.lang.String r1 = "successful"
            r4.A08(r2, r1)
            java.lang.String r2 = r0.A0H
            java.lang.String r1 = "sms"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x034c
            long r1 = r0.A0A
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x034c
            X.1Ww r1 = r11.A0J
            r0 = 18
        L_0x0339:
            X.C29501Ww.A02(r1, r0, r3)
            X.1VX r0 = r11.A01
            boolean r0 = r0.A02()
            android.content.Intent r1 = X.AnonymousClass190.A1R(r11, r0)
            r0 = 0
            r11.A33(r1, r0)
            goto L_0x0185
        L_0x034c:
            X.1Ww r1 = r11.A0J
            r0 = 7
            goto L_0x0339
        L_0x0350:
            boolean r1 = r11 instanceof com.whatsapp.registration.phonenumberentry.RegisterPhone
            if (r1 == 0) goto L_0x03da
            r9 = r11
            com.whatsapp.registration.phonenumberentry.RegisterPhone r9 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r9
            java.lang.String r1 = "RegisterPhone/isWfBanFlowAllowedForUnderageUser"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.005 r1 = r9.A0Z
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x03da
            X.0zN r2 = r9.A0B
            r1 = 5356(0x14ec, float:7.505E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x03da
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r1 = r9.A0P
            X.00s r1 = r1.A01
            java.lang.Object r1 = r1.A04()
            if (r1 == 0) goto L_0x03da
            X.3XC r1 = A0s(r9)
            java.lang.String r1 = r1.A03
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03da
            X.3XC r1 = A0s(r9)
            java.lang.String r2 = r1.A03
            java.lang.String r1 = "u13_checkpoint"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x03da
            java.lang.String r0 = "EnterPhoneNumber/onStatusUserBlocked wfac ban"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "RegisterPhone/startWfBanFlowForUnderageUser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ww r0 = r9.A0J
            X.C29501Ww.A02(r0, r6, r3)
            X.005 r0 = r9.A0Z
            java.lang.Object r0 = r0.get()
            X.C18740tg.A06(r0)
            X.3XC r0 = A0s(r9)
            java.lang.String r10 = r0.A01
            X.3XC r0 = A0s(r9)
            java.lang.String r11 = r0.A03
            X.3XC r0 = A0s(r9)
            int r14 = r0.A00
            r13 = 14
            android.content.Intent r2 = X.C64703Pc.A00(r9, r10, r11, r12, r13, r14, r15)
            X.005 r0 = r9.A0Z
            java.lang.Object r1 = r0.get()
            X.3Pc r1 = (X.C64703Pc) r1
            X.3XC r0 = A0s(r9)
            int r0 = r0.A00
            r1.A02(r15, r0)
            r9.startActivity(r2)
            r9.finish()
            return
        L_0x03da:
            boolean r1 = r11 instanceof com.whatsapp.registration.phonenumberentry.RegisterPhone
            if (r1 == 0) goto L_0x0460
            r4 = r11
            com.whatsapp.registration.phonenumberentry.RegisterPhone r4 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r4
            if (r24 == 0) goto L_0x0460
            X.3KW r2 = r4.A0W
            X.3XC r1 = r0.A0B
            boolean r0 = r0.A0Q
            boolean r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x0460
            java.lang.String r0 = "EnterPhoneNumber/onStatusUserBlocked starting ban appeal flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0P
            X.00s r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x044f
            X.3XC r0 = A0s(r4)
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x044f
            X.3XC r0 = A0s(r4)
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x044f
            X.3XC r0 = A0s(r4)
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)
            if (r0 == 0) goto L_0x044f
            java.lang.String r0 = "RegisterPhone/startBanAppealFlowForBlockedUser verified number, launching ban appeal screen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ww r1 = r4.A0J
            r0 = 10
            X.C29501Ww.A02(r1, r0, r3)
            X.3XC r0 = A0s(r4)
            boolean r2 = r0.A05
            X.3XC r0 = A0s(r4)
            java.lang.String r0 = r0.A04
            int r1 = java.lang.Integer.parseInt(r0)
            X.3XC r0 = A0s(r4)
            java.lang.String r0 = r0.A01
            android.content.Intent r0 = X.AnonymousClass190.A1A(r4, r0, r1, r15, r2)
            r4.startActivity(r0)
            r4.finish()
            return
        L_0x044f:
            X.3Kl r0 = r4.A0H
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0119
            r4.A0i = r3
            java.lang.String r0 = "RegisterPhone/startBanAppealFlowForBlockedUser unverified number, launching verify-sms flow first"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass3SJ.A01(r4, r6)
            return
        L_0x0460:
            r2 = 124(0x7c, float:1.74E-43)
            X.3Kl r0 = r11.A0H
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0119
            android.content.SharedPreferences r1 = X.C36331k8.A06(r11)
            java.lang.String r0 = "underage_account_banned"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 == 0) goto L_0x0476
            r2 = 125(0x7d, float:1.75E-43)
        L_0x0476:
            X.AnonymousClass3SJ.A01(r11, r2)
            return
        L_0x047a:
            boolean r0 = X.AnonymousClass3SJ.A04(r11)
            if (r0 != 0) goto L_0x0119
            X.0wo r14 = r11.A07
            X.0yb r13 = r11.A08
            X.0ts r15 = r11.A00
            X.0yC r1 = r11.A0D
            X.1e1 r0 = r11.A0S
            X.1Dv r12 = r11.A01
            X.224 r10 = new X.224
            r16 = r1
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r10.show()
            return
        L_0x049b:
            r1 = 20
            if (r8 != r1) goto L_0x04a3
            r11.A0v(r0, r3)
            return
        L_0x04a3:
            r1 = 19
            if (r8 != r1) goto L_0x04ab
            r11.A0v(r0, r15)
            return
        L_0x04ab:
            if (r8 != r6) goto L_0x0119
            r11.A0v(r0, r7)
            return
        L_0x04b1:
            java.lang.String r0 = "EnterPhoneNumber/error-unspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Kl r0 = r11.A0H
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0119
            r0 = 109(0x6d, float:1.53E-43)
            X.AnonymousClass3SJ.A01(r11, r0)
            return
        L_0x04c2:
            r4 = r12
            goto L_0x00a7
        L_0x04c5:
            X.0v0 r5 = r11.A09
            java.lang.String r4 = "wa_old_eligible"
            r5.A1a(r4)
            goto L_0x006f
        L_0x04ce:
            if (r9 != 0) goto L_0x005e
            X.0v0 r5 = r11.A09
            java.lang.String r4 = "email_otp_not_eligible"
            goto L_0x005b
        L_0x04d6:
            return
        L_0x04d7:
            return
        L_0x04d8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EnterPhoneNumber"
            r1.append(r0)
            r0 = 14
            if (r8 != r0) goto L_0x04f7
            java.lang.String r0 = "/bad-token"
        L_0x04e7:
            X.C36321k7.A1a(r1, r0)
            r0 = 2131893435(0x7f121cbb, float:1.9421646E38)
            java.lang.String r1 = r11.getString(r0)
            X.3Kl r0 = r11.A0H
            r0.A03(r1)
            return
        L_0x04f7:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x04e7
        L_0x04fa:
            java.lang.String r0 = "EnterPhoneNumber/error-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Kl r4 = r11.A0H
            r2 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r0 = X.C36381kD.A0r(r11, r0, r1, r2)
        L_0x0511:
            r4.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2d9.BX8(X.3OL, java.lang.String, java.lang.String, int, long):void");
    }

    public void Bu0() {
        AnonymousClass3SJ.A01(this, 9);
    }

    public Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog;
        int i2;
        int i3 = i;
        if (i3 == 9) {
            String string = getString(R.string.f12nameremoved);
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            C36331k8.A0p(progressDialog2, string);
            return progressDialog2;
        } else if (i3 == 22) {
            Log.w("EnterPhoneNumber/dialog/unrecoverable-error");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("register-phone2 +");
            A0u.append(AnonymousClass24S.A0G(this));
            String A0q = AnonymousClass000.A0q(AnonymousClass24S.A0H(this), A0u);
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            A002.A0h(new C89614Xf(4, A0q, this), R.string.f12nameremoved);
            A002.A0f(new AnonymousClass4XP(this, 7), R.string.f12nameremoved);
            return A002.create();
        } else if (i3 == 109) {
            C19770wU r0 = this.A04;
            return C65983Uf.A04(this, this.A04, this.A07, this.A08, this.A09, this.A0F, this.A0I, r0);
        } else if (i3 != 114) {
            switch (i) {
                case 124:
                    return C65983Uf.A05(this, this.A04, this.A00, this.A0F, (Runnable) null, AnonymousClass24S.A0G(this), AnonymousClass24S.A0H(this));
                case 125:
                    return C65983Uf.A06(this, this.A04, this.A0F, AnonymousClass24S.A0G(this), AnonymousClass24S.A0H(this));
                case 126:
                    AnonymousClass3DY r11 = this.A04;
                    C18820ts r12 = this.A00;
                    AnonymousClass1CF r13 = this.A0F;
                    String A0G2 = AnonymousClass24S.A0G(this);
                    String A0H2 = AnonymousClass24S.A0H(this);
                    return C65983Uf.A03(this.A01, this, this.A05, r11, r12, r13, A0s(this), (Runnable) null, A0G2, A0H2);
                case 127:
                    progressDialog = new ProgressDialog(this);
                    i2 = R.string.f12nameremoved;
                    break;
                case 128:
                    return C65983Uf.A07(this, (Runnable) null, new C81153wY((Object) this, 2), new C81153wY((Object) this, 1));
                case 129:
                    progressDialog = new ProgressDialog(this);
                    i2 = R.string.f12nameremoved;
                    break;
                case 130:
                    C18820ts r4 = this.A00;
                    String A0G3 = AnonymousClass24S.A0G(this);
                    String A0H3 = AnonymousClass24S.A0H(this);
                    C81153wY r5 = new C81153wY((Object) this, 3);
                    int A003 = C55192uE.A00(A0s(this).A04);
                    String A0D2 = C65983Uf.A0D(r4, A0G3, A0H3);
                    StringBuilder A0v = AnonymousClass000.A0v(A0D2);
                    A0v.append("\n\n");
                    C36351kA.A14(this, A0v, A003);
                    SpannableString A0K2 = C36391kE.A0K(A0v, A0D2);
                    View inflate = LayoutInflater.from(this).inflate(R.layout.f9nameremoved, (ViewGroup) null);
                    C39001qm A012 = C39001qm.A01(this, A0K2);
                    A012.A0j(inflate);
                    A012.A0r(false);
                    TextView A0O2 = C36391kE.A0O(inflate, R.id.button3);
                    TextView A0O3 = C36391kE.A0O(inflate, R.id.button1);
                    TextView A0O4 = C36391kE.A0O(inflate, R.id.button2);
                    A0O2.setVisibility(0);
                    A0O2.setText(R.string.f12nameremoved);
                    A0O3.setVisibility(0);
                    A0O3.setText(R.string.f12nameremoved);
                    A0O4.setVisibility(0);
                    A0O4.setText(R.string.f12nameremoved);
                    AnonymousClass3YH.A00(A0O2, this, (Object) null, 31);
                    AnonymousClass3Y6.A00(A0O3, this, 26);
                    AnonymousClass3YM.A00(A0O4, this, r5, (Object) null, 23);
                    return A012.create();
                default:
                    return super.onCreateDialog(i3);
            }
            C36391kE.A17(progressDialog, this, i2);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else {
            C19970wo r15 = this.A07;
            C20810yC r2 = this.A0D;
            C33771fu r122 = this.A05;
            C21010yW r1 = this.A0D;
            C21360z5 r112 = this.A03;
            AnonymousClass225 r8 = new AnonymousClass225(this, this.A01, r112, r122, this.A07, this.A08, r15, this.A00, r2, r1);
            AnonymousClass4XV.A00(r8, this, 2);
            return r8;
        }
    }

    private void A0v(AnonymousClass3OL r3, int i) {
        C36321k7.A1T("EnterPhoneNumber/onStatusNeedsAccountDefenceVerification accountDefenceFlowTypeToStart=", AnonymousClass000.A0u(), i);
        C36341k9.A18(this.A0P.A0D, true);
        C36341k9.A16(this.A0P.A00, i);
        A0u(r3);
    }

    public void A3j() {
        if (!C36371kC.A1U(C36331k8.A06(this), "is_ita_broadcasted") && this.A0B.A0E(5864)) {
            AnonymousClass39P r2 = (AnonymousClass39P) this.A0T.get();
            C36391kE.A1S(r2.A04, r2, this, 37);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        this.A09.A1O((String) null);
        this.A09.A1Q((String) null);
        this.A09.A1T((String) null);
        this.A09.A1W((String) null);
        this.A09.A1a((String) null);
        this.A09.A1P((String) null);
        this.A09.A1Y((String) null);
        C36341k9.A0v(C36331k8.A05(this.A09), "pref_autoconf_verification_status", -1);
        this.A09.A27(false);
        C36331k8.A0w(C36331k8.A05(this.A09), "pref_flash_call_education_screen_displayed", false);
        this.A09.A21(false);
        this.A0H = new C63543Kl(this, this.A09);
        AnonymousClass04H A0b = C36441kJ.A0b(this);
        this.A0P = (ExistViewModel) A0b.A00(ExistViewModel.class);
        BanReportViewModel banReportViewModel = (BanReportViewModel) A0b.A00(BanReportViewModel.class);
        this.A0Q = banReportViewModel;
        C65973Ue.A00(this, banReportViewModel.A01, 25);
        C65973Ue.A00(this, this.A0Q.A02, 24);
    }

    public void onPause() {
        super.onPause();
        C63543Kl r1 = this.A0H;
        r1.A00 = true;
        C65983Uf.A0Q(r1.A03, C65983Uf.A00);
    }

    public void onResume() {
        super.onResume();
        this.A0H.A00();
    }
}
