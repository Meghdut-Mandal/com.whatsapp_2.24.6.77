package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass13I;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1CF;
import X.AnonymousClass1RU;
import X.AnonymousClass1VX;
import X.AnonymousClass1X8;
import X.AnonymousClass3BH;
import X.AnonymousClass3DY;
import X.AnonymousClass3LN;
import X.AnonymousClass3LW;
import X.AnonymousClass3M1;
import X.AnonymousClass3OU;
import X.AnonymousClass3TX;
import X.AnonymousClass3UV;
import X.AnonymousClass3UY;
import X.AnonymousClass3Y6;
import X.AnonymousClass4VR;
import X.AnonymousClass4XO;
import X.AnonymousClass4YH;
import X.C012005e;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19630wG;
import X.C19680wL;
import X.C19770wU;
import X.C20830yE;
import X.C21520zN;
import X.C23045B1q;
import X.C25271Fq;
import X.C27111My;
import X.C29011Uz;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C49622jQ;
import X.C50202kN;
import X.C62623Gw;
import X.C63543Kl;
import X.C65983Uf;
import X.C80483vT;
import X.C81143wX;
import X.C88034Rd;
import X.C89354Wf;
import X.C90044Yw;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public class VerifyTwoFactorAuth extends AnonymousClass155 implements C23045B1q, C88034Rd {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CountDownTimer A06;
    public ProgressBar A07;
    public TextView A08;
    public AnonymousClass0FM A09;
    public C19460v5 A0A;
    public AnonymousClass1VX A0B;
    public CodeInputField A0C;
    public AnonymousClass3DY A0D;
    public AnonymousClass1RU A0E;
    public C19630wG A0F;
    public C25271Fq A0G;
    public C20830yE A0H;
    public C21520zN A0I;
    public AnonymousClass1CF A0J;
    public AnonymousClass13I A0K;
    public C63543Kl A0L;
    public C62623Gw A0M;
    public AnonymousClass3UV A0N;
    public C29501Ww A0O;
    public AnonymousClass1X8 A0P;
    public C49622jQ A0Q;
    public AnonymousClass3TX A0R;
    public C50202kN A0S;
    public C29011Uz A0T;
    public AnonymousClass005 A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Handler A0f;
    public final C19680wL A0g;
    public final Runnable A0h;

    public class forgotPinDialog extends Hilt_VerifyTwoFactorAuth_forgotPinDialog {
        public Dialog A1a(Bundle bundle) {
            int millis;
            C18820ts r1;
            int i;
            Bundle bundle2 = this.A0A;
            int i2 = bundle2.getInt("wipeStatus");
            long j = bundle2.getLong("timeToWaitInMillis");
            C39001qm A02 = AnonymousClass3LW.A02(this);
            AnonymousClass155 r2 = (AnonymousClass155) A0h();
            if (r2 != null) {
                Log.i("VerifyTwoFactorAuth/forgotPinDialog/onCreateDialog");
                View A0K = C36381kD.A0K(LayoutInflater.from(A1D()), R.layout.f9nameremoved);
                TextView A0O = C36391kE.A0O(A0K, R.id.two_fa_help_dialog_text);
                TextView A0O2 = C36391kE.A0O(A0K, R.id.positive_button);
                View A022 = C012005e.A02(A0K, R.id.cancel_button);
                View A023 = C012005e.A02(A0K, R.id.reset_account_button);
                int A08 = C36441kJ.A08(r2);
                int i3 = R.string.f12nameremoved;
                if (A08 == 18) {
                    i3 = R.string.f12nameremoved;
                }
                A0O2.setText(i3);
                AnonymousClass3Y6.A00(A0O2, r2, 42);
                AnonymousClass3Y6.A00(A022, this, 41);
                if (i2 == 0) {
                    A0O.setText(R.string.f12nameremoved);
                } else if (i2 == 1) {
                    long millis2 = TimeUnit.DAYS.toMillis(1);
                    if (j > millis2) {
                        millis = (int) (j / millis2);
                        r1 = this.A01;
                        i = 3;
                    } else {
                        long millis3 = TimeUnit.HOURS.toMillis(1);
                        if (j > millis3) {
                            millis = (int) (j / millis3);
                            r1 = this.A01;
                            i = 2;
                        } else {
                            long millis4 = TimeUnit.MINUTES.toMillis(1);
                            if (j > millis4) {
                                millis = (int) (j / millis4);
                                r1 = this.A01;
                                i = 1;
                            } else {
                                millis = (int) (j / TimeUnit.SECONDS.toMillis(1));
                                r1 = this.A01;
                                i = 0;
                            }
                        }
                    }
                    C36381kD.A1E(A0O, this, new Object[]{AnonymousClass3UY.A03(r1, millis, i)}, R.string.f12nameremoved);
                } else if (i2 == 2 || i2 == 3) {
                    A0O.setText(R.string.f12nameremoved);
                    AnonymousClass3Y6.A00(A023, r2, 43);
                    A023.setVisibility(0);
                    C36341k9.A10(A0K, R.id.spacer, 0);
                }
                A02.setView(A0K);
            }
            return A02.create();
        }
    }

    public class resetAccountDialog extends Hilt_VerifyTwoFactorAuth_resetAccountDialog {
        public Dialog A1a(Bundle bundle) {
            int i;
            int i2 = this.A0A.getInt("wipeStatus");
            AnonymousClass01I A0h = A0h();
            C39001qm A00 = AnonymousClass3LW.A00(A0h);
            C39001qm.A03(new AnonymousClass4XO(A0h, 35), A00, R.string.f12nameremoved);
            if (i2 == 1 || i2 == 2) {
                i = R.string.f12nameremoved;
            } else {
                if (i2 == 3) {
                    i = R.string.f12nameremoved;
                }
                return A00.create();
            }
            A00.A0K(i);
            return A00.create();
        }
    }

    public static void A0G(VerifyTwoFactorAuth verifyTwoFactorAuth, String str, int i, boolean z) {
        VerifyTwoFactorAuth verifyTwoFactorAuth2 = verifyTwoFactorAuth;
        verifyTwoFactorAuth.A01 = i;
        verifyTwoFactorAuth.A0X = str;
        verifyTwoFactorAuth.A0a = z;
        int i2 = 33;
        if (i != 1) {
            i2 = 34;
            if (i != 2) {
                i2 = 31;
            }
        }
        verifyTwoFactorAuth.A00 = i2;
        C19770wU r2 = verifyTwoFactorAuth.A04;
        String str2 = verifyTwoFactorAuth.A0Y;
        String str3 = verifyTwoFactorAuth.A0V;
        String str4 = verifyTwoFactorAuth.A0W;
        AnonymousClass005 r7 = verifyTwoFactorAuth2.A0U;
        C19420v0 r4 = verifyTwoFactorAuth2.A09;
        AnonymousClass3UV r5 = verifyTwoFactorAuth2.A0N;
        C19460v5 r1 = verifyTwoFactorAuth2.A0A;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("getVNameCertForVerifyTwoFactorAuth");
        }
        C50202kN r3 = new C50202kN(r4, r5, verifyTwoFactorAuth2, r7, str2, str3, str4, str, i);
        verifyTwoFactorAuth2.A0S = r3;
        C36441kJ.A1E(r3, r2);
    }

    public void Bus() {
        A0I(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("VerifyTwoFactorAuth/onActivityResult/REQUEST_CODE_SMS_PERMISSIONS/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C36321k7.A1a(A0u, str);
            A0I(false);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A0F(VerifyTwoFactorAuth verifyTwoFactorAuth, long j) {
        CountDownTimer start;
        long j2 = j;
        VerifyTwoFactorAuth verifyTwoFactorAuth2 = verifyTwoFactorAuth;
        if (j < 1000) {
            C36341k9.A0u(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time");
            CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                start = null;
            } else {
                return;
            }
        } else {
            C36341k9.A0w(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time", C36431kI.A08(verifyTwoFactorAuth) + j);
            verifyTwoFactorAuth.A0C.A01(verifyTwoFactorAuth.A0C);
            verifyTwoFactorAuth.A0C.setEnabled(false);
            verifyTwoFactorAuth.A07.setProgress(0);
            verifyTwoFactorAuth.A08.setText(R.string.f12nameremoved);
            verifyTwoFactorAuth.A08.setVisibility(0);
            start = new AnonymousClass4VR(verifyTwoFactorAuth2, 1, j2, j).start();
        }
        verifyTwoFactorAuth2.A06 = start;
    }

    public static void A0H(VerifyTwoFactorAuth verifyTwoFactorAuth, boolean z) {
        C36331k8.A1E(verifyTwoFactorAuth.A0Q);
        if (z) {
            verifyTwoFactorAuth.A02 = -1;
            verifyTwoFactorAuth.A09.A1n(verifyTwoFactorAuth.A0Z, verifyTwoFactorAuth.A0Y, verifyTwoFactorAuth.A05, -1, verifyTwoFactorAuth.A04, verifyTwoFactorAuth.A03);
        }
        verifyTwoFactorAuth.A0f.removeCallbacks(verifyTwoFactorAuth.A0h);
    }

    private void A0I(boolean z) {
        Log.i("VerifyTwoFactorAuth/startOtpVerification");
        this.A0A.A01(19);
        this.A09.A1E(-1);
        AnonymousClass3OU r0 = AnonymousClass3OU.A00;
        A33(AnonymousClass190.A19(this, (String) null, -1, 0, 0, -1, -1, -1, -1, z, true, this.A0B.A02(), false, false), false);
        finish();
    }

    public void A2F() {
        if (!this.A0d) {
            this.A0d = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0F = C36351kA.A0W(r2);
            this.A0K = (AnonymousClass13I) r2.A4a.get();
            this.A0R = C36431kI.A0u(r1);
            this.A0D = C36361kB.A0Q(r2);
            this.A0J = C36361kB.A0b(r2);
            this.A0M = C27111My.A38(A0L2);
            this.A0B = (AnonymousClass1VX) r2.A1V.get();
            this.A0O = C36401kF.A0d(r2);
            this.A0H = C36351kA.A0X(r2);
            this.A0I = C36401kF.A0Y(r2);
            this.A0T = (C29011Uz) r1.A49.get();
            this.A0P = C36391kE.A0o(r2);
            this.A0G = C36391kE.A0d(r2);
            this.A0A = (C19460v5) r2.A5y.get();
            this.A0N = C36431kI.A0t(r2);
            this.A0E = C36351kA.A0R(r2);
            this.A0U = C18840tu.A00(r1.A4M);
        }
    }

    public void A3i(AnonymousClass3BH r12) {
        this.A0Z = r12.A0A;
        this.A0Y = r12.A09;
        this.A05 = r12.A02;
        this.A02 = r12.A01;
        this.A04 = r12.A00;
        long A082 = C36431kI.A08(this);
        this.A03 = A082;
        this.A09.A1n(this.A0Z, this.A0Y, this.A05, this.A02, this.A04, A082);
    }

    public void A3j(String str, String str2) {
        C19460v5 r1 = this.A0A;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("setVNameCertSetInRegistration");
        }
        this.A0O.A0D(this.A0V, this.A0W, str2);
        C29011Uz r4 = this.A0T;
        r4.A08.Bp1(new C80483vT(r4, str, (String) null, 5));
        this.A0R.A08("2fa", "successful");
        this.A0K.A00(false);
        if (this.A0L.A00) {
            C65983Uf.A0K(this, this.A0G, this.A0O, false);
        } else if (!this.A0c) {
            Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
            C29501Ww.A02(this.A0O, 2, true);
            A33(AnonymousClass190.A0A(this), true);
            return;
        } else {
            this.A0O.A0E();
        }
        finish();
    }

    public void BmG() {
        if (this.A0H.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            A0I(false);
            return;
        }
        Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        C65983Uf.A0N(this, 1);
    }

    public void BqU(boolean z) {
        this.A0C.setEnabled(z);
        ProgressBar progressBar = this.A07;
        int i = 0;
        if (z) {
            i = 100;
        }
        progressBar.setProgress(i);
    }

    public void onBackPressed() {
        if (this.A0E.A0F(this.A0c)) {
            Log.i("VerifyTwoFactorAuth/onBackPressed/is adding new account");
            C65983Uf.A0F(this, this.A0E, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        setTitle(R.string.f12nameremoved);
        this.A0L = new C63543Kl(this, this.A09);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getBooleanExtra("changenumber", false)) {
            this.A0c = true;
        }
        this.A0e = this.A0E.A0F(this.A0c);
        setContentView((int) R.layout.f9nameremoved);
        this.A0R.A04("2fa");
        this.A0A.A00();
        C65983Uf.A0M(this.A00, this, this.A00, R.id.title_toolbar, false, false, this.A0e);
        C65983Uf.A0O(this, this.A0I, R.id.title);
        this.A0C = (CodeInputField) C012005e.A02(this.A00, R.id.code);
        this.A07 = (ProgressBar) C012005e.A02(this.A00, R.id.progress_bar_code_input_blocked);
        this.A08 = C36391kE.A0O(this.A00, R.id.description_bottom);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, 6, 0);
        this.A0C.A0H(new C90044Yw(this, 3), new AnonymousClass3M1(this, 0), (String) null, getString(R.string.f12nameremoved, objArr), '*', '*', 6);
        this.A0C.setPasswordTransformationEnabled(true);
        BqU(true);
        View findViewById = findViewById(R.id.pin_text);
        View findViewById2 = findViewById(R.id.forgot_pin_text);
        View findViewById3 = findViewById(R.id.two_fa_lock_image);
        if (this.A0I.A0E(5732)) {
            findViewById3.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(0);
            AnonymousClass3Y6.A00(findViewById2, this, 40);
        } else {
            findViewById3.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        }
        this.A0V = this.A09.A0f();
        this.A0W = this.A09.A0h();
        this.A0Z = C36331k8.A06(this).getString("registration_wipe_type", (String) null);
        this.A0Y = C36331k8.A06(this).getString("registration_wipe_token", (String) null);
        this.A05 = C36331k8.A06(this).getLong("registration_wipe_wait", -1);
        this.A02 = C36331k8.A06(this).getLong("registration_wipe_expiry", -1);
        this.A04 = C36331k8.A06(this).getLong("registration_wipe_server_time", -1);
        this.A03 = this.A09.A0V("registration_wipe_info_timestamp");
        if (this.A02 > 0) {
            A0H(this, false);
            this.A0f.postDelayed(this.A0h, 0);
        }
        if (bundle != null && !bundle2.getBoolean("shouldShowTheForgetPinDialog", false)) {
            A3D("forgotPinDialogTag");
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 109) {
            C19770wU r12 = this.A04;
            return C65983Uf.A04(this, this.A0D, this.A07, this.A08, this.A0H, this.A0J, this.A0N, r12);
        } else if (i == 124) {
            return C65983Uf.A05(this, this.A0D, this.A00, this.A0J, new C81143wX(this, 27), this.A0V, this.A0W);
        } else if (i == 125) {
            return C65983Uf.A06(this, this.A0D, this.A0J, this.A0V, this.A0W);
        } else {
            switch (i) {
                case 31:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    C36331k8.A0p(progressDialog, getString(R.string.f12nameremoved));
                    return progressDialog;
                case 32:
                    C39001qm A002 = AnonymousClass3LW.A00(this);
                    A002.A0p(C36341k9.A0e(this, AnonymousClass001.A0L(), R.string.f12nameremoved, 0, R.string.f12nameremoved));
                    C39001qm.A0D(A002, this, 33, R.string.f12nameremoved);
                    return A002.create();
                case 33:
                    ProgressDialog progressDialog2 = new ProgressDialog(this);
                    C36331k8.A0p(progressDialog2, getString(R.string.f12nameremoved));
                    return progressDialog2;
                case 34:
                    ProgressDialog progressDialog3 = new ProgressDialog(this);
                    C36331k8.A0p(progressDialog3, getString(R.string.f12nameremoved));
                    return progressDialog3;
                default:
                    return super.onCreateDialog(i);
            }
        }
    }

    public void onDestroy() {
        C36331k8.A1E(this.A0S);
        A0H(this, false);
        CountDownTimer countDownTimer = this.A06;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A06 = null;
        }
        this.A0b = false;
        this.A07.unregisterObserver(this.A0g);
        this.A0M.A00();
        super.onDestroy();
    }

    public VerifyTwoFactorAuth(int i) {
        this.A0d = false;
        C89354Wf.A00(this, 48);
    }

    public static int A01(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        if (C36441kJ.A08(verifyTwoFactorAuth) == 18) {
            return 0;
        }
        if ((verifyTwoFactorAuth.A03 + (verifyTwoFactorAuth.A05 * 1000)) - C36431kI.A08(verifyTwoFactorAuth) <= 0) {
            String str = verifyTwoFactorAuth.A0Z;
            if ("offline".equals(str)) {
                return 2;
            }
            if ("full".equals(str)) {
                return 3;
            }
        }
        return 1;
    }

    public static void A07(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        int A012 = A01(verifyTwoFactorAuth);
        long A082 = (verifyTwoFactorAuth.A03 + (verifyTwoFactorAuth.A05 * 1000)) - C36431kI.A08(verifyTwoFactorAuth);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VerifyTwoFactorAuth/clickForgotPin/resetMode=");
        A0u.append(verifyTwoFactorAuth.A01);
        A0u.append("/wipeStatus=");
        A0u.append(A012);
        C36321k7.A1V("/timeToWaitInMillis=", A0u, A082);
        forgotPinDialog forgotpindialog = new forgotPinDialog();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("wipeStatus", A012);
        A072.putLong("timeToWaitInMillis", A082);
        forgotpindialog.A17(A072);
        verifyTwoFactorAuth.Btl(forgotpindialog, "forgotPinDialogTag");
    }

    public void A2x(int i) {
        if (i == R.string.f12nameremoved) {
            if (this.A0C.isEnabled()) {
                InputMethodManager A0N2 = this.A08.A0N();
                C18740tg.A06(A0N2);
                A0N2.toggleSoftInput(1, 0);
            }
        } else if (i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved) {
            this.A0O.A09();
            startActivity(AnonymousClass190.A0B(this));
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("register-2fa +");
        A0u.append(this.A0V);
        String A0q = AnonymousClass000.A0q(this.A0W, A0u);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0P.A02("verify-2fa");
            this.A0M.A01(this, this.A0P, A0q);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0O.A09();
            C36361kB.A0t(this);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A06 == null) {
            long j = getPreferences(0).getLong("code_retry_time", -1);
            if (j != -1) {
                A0F(this, j - C36431kI.A08(this));
            }
        }
        this.A0C.requestFocus();
        TextEmojiLabel A0I2 = C36421kH.A0I(this, R.id.description);
        C36321k7.A0m(this, A0I2);
        if (this.A0I.A0E(5732)) {
            A0I2.setText(R.string.f12nameremoved);
            return;
        }
        int A082 = C36441kJ.A08(this);
        int i = R.string.f12nameremoved;
        if (A082 == 18) {
            i = R.string.f12nameremoved;
        }
        A0I2.setText(AnonymousClass3LN.A01(new C81143wX(this, 28), getString(i), "forgot-pin"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("shouldShowTheForgetPinDialog", AnonymousClass000.A1V(getSupportFragmentManager().A0N("forgotPinDialogTag")));
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        if (this.A0b) {
            this.A0b = true;
            try {
                this.A07.registerObserver(this.A0g);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
        AnonymousClass0FM r0 = this.A09;
        if (r0 != null) {
            r0.dismiss();
            this.A09 = null;
        }
        this.A0b = true;
        this.A07.unregisterObserver(this.A0g);
    }

    public VerifyTwoFactorAuth() {
        this(0);
        this.A0e = false;
        this.A0f = C36341k9.A0H();
        this.A0h = new C81143wX(this, 29);
        this.A0g = new AnonymousClass4YH(this, 3);
    }
}
