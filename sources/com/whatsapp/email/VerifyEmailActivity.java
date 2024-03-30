package com.whatsapp.email;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DZ;
import X.AnonymousClass2X4;
import X.AnonymousClass3LN;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UY;
import X.AnonymousClass3Y0;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C194349Pi;
import X.C19650wI;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C51712oG;
import X.C65983Uf;
import X.C81113wU;
import X.C89334Wd;
import X.C90044Yw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmailActivity extends AnonymousClass155 {
    public int A00;
    public long A01;
    public CodeInputField A02;
    public TextEmojiLabel A03;
    public WaTextView A04;
    public C194349Pi A05;
    public AnonymousClass1DZ A06;
    public AnonymousClass190 A07;
    public C19650wI A08;
    public WDSButton A09;
    public String A0A;
    public ProgressBar A0B;
    public boolean A0C;

    public static final void A01(VerifyEmailActivity verifyEmailActivity) {
        AnonymousClass3SJ.A01(verifyEmailActivity, 3);
        AnonymousClass1DZ r3 = verifyEmailActivity.A06;
        if (r3 != null) {
            C18820ts r2 = verifyEmailActivity.A00;
            AnonymousClass00C.A07(r2);
            r3.A00(r2, new C51712oG(verifyEmailActivity, 0));
            return;
        }
        throw C36331k8.A0d("emailVerificationXmppMethods");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        r2.A0c(r0);
        r2.A0r(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        X.C39001qm.A0B(r2, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        return r2.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r5) {
        /*
            r4 = this;
            r3 = 0
            switch(r5) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0057;
                case 3: goto L_0x004f;
                case 4: goto L_0x003f;
                case 5: goto L_0x0074;
                case 6: goto L_0x0029;
                case 7: goto L_0x001a;
                case 8: goto L_0x0009;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r5)
            return r0
        L_0x0009:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889039(0x7f120b8f, float:1.941273E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 8
            goto L_0x00a7
        L_0x001a:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889037(0x7f120b8d, float:1.9412726E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 6
            goto L_0x00a7
        L_0x0029:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889056(0x7f120ba0, float:1.9412765E38)
            r2.A0d(r0)
            r0 = 2131889055(0x7f120b9f, float:1.9412763E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 10
            goto L_0x00a7
        L_0x003f:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889045(0x7f120b95, float:1.9412742E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 11
            goto L_0x00a7
        L_0x004f:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889068(0x7f120bac, float:1.941279E38)
            goto L_0x005e
        L_0x0057:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889071(0x7f120baf, float:1.9412795E38)
        L_0x005e:
            r2.A0c(r0)
            r2.A0r(r3)
            goto L_0x00aa
        L_0x0065:
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889034(0x7f120b8a, float:1.941272E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 7
            goto L_0x00a7
        L_0x0074:
            com.whatsapp.CodeInputField r2 = r4.A02
            java.lang.String r1 = "codeInputField"
            if (r2 != 0) goto L_0x007f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x007f:
            java.lang.String r0 = ""
            r2.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A02
            if (r0 != 0) goto L_0x008d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x008d:
            r0.setEnabled(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A09
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "verifyBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009b:
            r0.setEnabled(r3)
            X.1qm r2 = X.C39001qm.A00(r4)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 9
        L_0x00a7:
            X.C39001qm.A0B(r2, r4, r0, r1)
        L_0x00aa:
            X.0FM r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.VerifyEmailActivity.onCreateDialog(int):android.app.Dialog");
    }

    public static final void A07(VerifyEmailActivity verifyEmailActivity) {
        Intent A16;
        int i = verifyEmailActivity.A00;
        if (verifyEmailActivity.A07 != null) {
            if (i == 3) {
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(verifyEmailActivity.getPackageName(), "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity");
                A16 = A0D.addFlags(67108864);
            } else {
                A16 = AnonymousClass190.A16(verifyEmailActivity, verifyEmailActivity.A0A, i);
            }
            AnonymousClass00C.A0B(A16);
            verifyEmailActivity.A01.A06(verifyEmailActivity, A16);
            verifyEmailActivity.finish();
            return;
        }
        throw C36331k8.A0X();
    }

    public static final void A0F(VerifyEmailActivity verifyEmailActivity, Integer num, Long l) {
        int i;
        int i2;
        int i3;
        if (num != null) {
            int intValue = num.intValue();
            i = 1;
            if (intValue != 536) {
                i = 5;
                if (intValue != 403) {
                    if (intValue == 535) {
                        i2 = R.string.f12nameremoved;
                        i3 = 6;
                    } else if (intValue == 537) {
                        i2 = R.string.f12nameremoved;
                        i3 = 7;
                    } else if (intValue == 534) {
                        i2 = R.string.f12nameremoved;
                        i3 = 8;
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue > 0) {
                            verifyEmailActivity.BO6(C36391kE.A0v(verifyEmailActivity, AnonymousClass3UY.A0D(verifyEmailActivity.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass001.A0L(), 0, i2));
                            return;
                        }
                    }
                    AnonymousClass3SJ.A01(verifyEmailActivity, i3);
                    return;
                }
            }
            AnonymousClass3SJ.A01(verifyEmailActivity, i);
        }
        i = 4;
        AnonymousClass3SJ.A01(verifyEmailActivity, i);
    }

    public static final void A0G(VerifyEmailActivity verifyEmailActivity, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmailActivity.A09;
                if (wDSButton == null) {
                    throw C36331k8.A0d("verifyBtn");
                }
                wDSButton.setEnabled(false);
                C19650wI r4 = verifyEmailActivity.A08;
                if (r4 != null) {
                    r4.A00.postDelayed(new C81113wU((Object) verifyEmailActivity, 42), TimeUnit.SECONDS.toMillis(longValue));
                    return;
                }
                throw C36331k8.A0d("mainThreadHandler");
            }
        }
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A07 = C36351kA.A0h(A0B2);
            this.A08 = C36411kG.A0q(A0B2);
            this.A05 = C36411kG.A0f(r1);
            this.A06 = A0B2.A9B();
        }
    }

    public void onBackPressed() {
        C194349Pi r4 = this.A05;
        if (r4 != null) {
            C36401kF.A1G(r4, this.A0A, this.A00, 8, 7);
            A07(this);
            return;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public VerifyEmailActivity(int i) {
        this.A0C = false;
        C89334Wd.A00(this, 21);
    }

    public static final void A0H(VerifyEmailActivity verifyEmailActivity, String str) {
        if (str.length() != 6) {
            Log.e("VerifyEmailActivity/executeVerifyEmailOtpRequest/invalid otp length");
            verifyEmailActivity.BO5(R.string.f12nameremoved);
        }
        AnonymousClass3SJ.A01(verifyEmailActivity, 2);
        AnonymousClass1DZ r2 = verifyEmailActivity.A06;
        if (r2 != null) {
            r2.A03(new AnonymousClass2X4(verifyEmailActivity, 0), str);
            return;
        }
        throw C36331k8.A0d("emailVerificationXmppMethods");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        this.A09 = (WDSButton) C36361kB.A0G(this.A00, R.id.email_code_submit);
        this.A0B = (ProgressBar) C36361kB.A0G(this.A00, R.id.progress_bar_code_input_blocked);
        this.A02 = (CodeInputField) C36361kB.A0G(this.A00, R.id.verify_email_code_input);
        this.A04 = C36341k9.A0Q(this.A00, R.id.resend_code_text);
        this.A03 = C36351kA.A0O(this.A00, R.id.verify_email_description);
        WDSButton wDSButton = this.A09;
        if (wDSButton == null) {
            throw C36331k8.A0d("verifyBtn");
        }
        AnonymousClass3Y0.A01(wDSButton, this, 26);
        ProgressBar progressBar = this.A0B;
        if (progressBar == null) {
            throw C36331k8.A0d("progressBar");
        }
        progressBar.setProgress(100);
        this.A00 = C36431kI.A02(getIntent(), "entrypoint");
        String A0u = C36391kE.A0u(this);
        this.A0A = A0u;
        C194349Pi r0 = this.A05;
        if (r0 != null) {
            r0.A00(A0u, (String) null, this.A00, 8, 8, 3);
            setTitle(R.string.f12nameremoved);
            CodeInputField codeInputField = this.A02;
            if (codeInputField == null) {
                throw C36331k8.A0d("codeInputField");
            }
            codeInputField.A0F(new C90044Yw(this, 1), 6);
            CodeInputField codeInputField2 = this.A02;
            if (codeInputField2 == null) {
                throw C36331k8.A0d("codeInputField");
            }
            codeInputField2.setCode("");
            if (!C65983Uf.A0S(getResources())) {
                CodeInputField codeInputField3 = this.A02;
                if (codeInputField3 == null) {
                    throw C36331k8.A0d("codeInputField");
                }
                codeInputField3.A0C(false);
            }
            WaTextView waTextView = this.A04;
            if (waTextView == null) {
                throw C36331k8.A0d("resendCodeText");
            }
            waTextView.setClickable(true);
            WaTextView waTextView2 = this.A04;
            if (waTextView2 == null) {
                throw C36331k8.A0d("resendCodeText");
            }
            AnonymousClass3Y0.A01(waTextView2, this, 27);
            String stringExtra = getIntent().getStringExtra("email");
            TextEmojiLabel textEmojiLabel = this.A03;
            if (textEmojiLabel == null) {
                throw C36331k8.A0d("verifyEmailDescription");
            }
            C36331k8.A1A(this.A0D, textEmojiLabel);
            TextEmojiLabel textEmojiLabel2 = this.A03;
            if (textEmojiLabel2 == null) {
                throw C36331k8.A0d("verifyEmailDescription");
            }
            textEmojiLabel2.setText(AnonymousClass3LN.A01(new C81113wU((Object) this, 45), C36351kA.A0x(this, stringExtra, new Object[1], 0, R.string.f12nameremoved), "edit-email"));
            String stringExtra2 = getIntent().getStringExtra("email_otp");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                A01(this);
                return;
            }
            Log.i("VerifyEmailActivity/onCreate/verify email deeplink");
            A0H(this, stringExtra2);
            return;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public VerifyEmailActivity() {
        this(0);
    }
}
