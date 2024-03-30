package com.whatsapp.registration.email;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DZ;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass3LN;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UY;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C194349Pi;
import X.C19650wI;
import X.C21520zN;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C51712oG;
import X.C62623Gw;
import X.C65983Uf;
import X.C67133Yq;
import X.C81143wX;
import X.C89364Wg;
import X.C90044Yw;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmail extends AnonymousClass155 {
    public int A00;
    public long A01;
    public CodeInputField A02;
    public TextEmojiLabel A03;
    public WaTextView A04;
    public AnonymousClass1RU A05;
    public C194349Pi A06;
    public AnonymousClass1DZ A07;
    public C21520zN A08;
    public AnonymousClass190 A09;
    public C62623Gw A0A;
    public AnonymousClass1X8 A0B;
    public C19650wI A0C;
    public WDSButton A0D;
    public WDSButton A0E;
    public String A0F;
    public ProgressBar A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;

    public static final void A01(VerifyEmail verifyEmail) {
        AnonymousClass3SJ.A01(verifyEmail, 3);
        AnonymousClass1DZ r3 = verifyEmail.A07;
        if (r3 != null) {
            C18820ts r2 = verifyEmail.A00;
            AnonymousClass00C.A07(r2);
            r3.A00(r2, new C51712oG(verifyEmail, 1));
            return;
        }
        throw C36331k8.A0d("emailVerificationXmppMethods");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A0D = (WDSButton) C36361kB.A0G(this.A00, R.id.verify_email_submit);
        this.A0G = (ProgressBar) C36361kB.A0G(this.A00, R.id.progress_bar_code_input_blocked);
        this.A0E = (WDSButton) C36361kB.A0G(this.A00, R.id.verify_email_skip);
        this.A02 = (CodeInputField) C36361kB.A0G(this.A00, R.id.verify_email_code_input);
        this.A04 = C36341k9.A0Q(this.A00, R.id.resend_code_text);
        this.A03 = C36351kA.A0O(this.A00, R.id.verify_email_description);
        C21520zN r0 = this.A08;
        if (r0 != null) {
            C65983Uf.A0O(this, r0, R.id.verify_email_title_toolbar_text);
            WDSButton wDSButton = this.A0D;
            if (wDSButton == null) {
                throw C36331k8.A0d("nextButton");
            }
            C67133Yq.A00(wDSButton, this, 11);
            ProgressBar progressBar = this.A0G;
            if (progressBar == null) {
                throw C36331k8.A0d("progressBar");
            }
            progressBar.setProgress(100);
            WDSButton wDSButton2 = this.A0E;
            if (wDSButton2 == null) {
                throw C36331k8.A0d("notNowButton");
            }
            C67133Yq.A00(wDSButton2, this, 12);
            CodeInputField codeInputField = this.A02;
            if (codeInputField == null) {
                throw C36331k8.A0d("codeInputField");
            }
            codeInputField.A0F(new C90044Yw(this, 4), 6);
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
            C67133Yq.A00(waTextView2, this, 10);
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
            String A0A2 = C36321k7.A0A(this, stringExtra, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0A2);
            textEmojiLabel2.setText(AnonymousClass3LN.A01(C81143wX.A00(this, 42), A0A2, "edit-email"));
            AnonymousClass1RU r02 = this.A05;
            if (r02 != null) {
                boolean A0F2 = r02.A0F(false);
                this.A0K = A0F2;
                C65983Uf.A0M(this.A00, this, this.A00, R.id.verify_email_title_toolbar, false, false, A0F2);
                this.A00 = getIntent().getIntExtra("entrypoint", 0);
                this.A0F = C36391kE.A0u(this);
                String A0f = this.A09.A0f();
                AnonymousClass00C.A08(A0f);
                this.A0H = A0f;
                String A0h = this.A09.A0h();
                AnonymousClass00C.A08(A0h);
                this.A0I = A0h;
                A3i().A00(this.A0F, (String) null, this.A00, 8, 8, 3);
                if (bundle == null) {
                    A01(this);
                    return;
                }
                return;
            }
            throw C36331k8.A0d("accountSwitcher");
        }
        throw C36331k8.A0d("abPreChatdProps");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r3.A0c(r0);
        r3.A0r(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        r0 = new X.AnonymousClass4XP(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r3.A0h(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        return r3.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r6) {
        /*
            r5 = this;
            r4 = 0
            switch(r6) {
                case 1: goto L_0x0061;
                case 2: goto L_0x0053;
                case 3: goto L_0x004b;
                case 4: goto L_0x003c;
                case 5: goto L_0x0075;
                case 6: goto L_0x0027;
                case 7: goto L_0x0018;
                case 8: goto L_0x0009;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r6)
            return r0
        L_0x0009:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889039(0x7f120b8f, float:1.941273E38)
            r3.A0c(r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 2
            goto L_0x006f
        L_0x0018:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889037(0x7f120b8d, float:1.9412726E38)
            r3.A0c(r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 3
            goto L_0x006f
        L_0x0027:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889056(0x7f120ba0, float:1.9412765E38)
            r3.A0d(r0)
            r0 = 2131889055(0x7f120b9f, float:1.9412763E38)
            r3.A0c(r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 4
            goto L_0x006f
        L_0x003c:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889045(0x7f120b95, float:1.9412742E38)
            r3.A0c(r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 1
            goto L_0x006f
        L_0x004b:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889068(0x7f120bac, float:1.941279E38)
            goto L_0x005a
        L_0x0053:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889071(0x7f120baf, float:1.9412795E38)
        L_0x005a:
            r3.A0c(r0)
            r3.A0r(r4)
            goto L_0x00ae
        L_0x0061:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889034(0x7f120b8a, float:1.941272E38)
            r3.A0c(r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 5
        L_0x006f:
            X.4XP r0 = new X.4XP
            r0.<init>(r5, r1)
            goto L_0x00ab
        L_0x0075:
            com.whatsapp.CodeInputField r2 = r5.A02
            java.lang.String r1 = "codeInputField"
            if (r2 != 0) goto L_0x0080
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0080:
            java.lang.String r0 = ""
            r2.setCode(r0)
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 != 0) goto L_0x008e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x008e:
            r0.setEnabled(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0D
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009c:
            r0.setEnabled(r4)
            X.1qm r3 = X.C39001qm.A00(r5)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.4XP r0 = new X.4XP
            r0.<init>(r5, r4)
        L_0x00ab:
            r3.A0h(r0, r2)
        L_0x00ae:
            X.0FM r0 = r3.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.email.VerifyEmail.onCreateDialog(int):android.app.Dialog");
    }

    public static final void A07(VerifyEmail verifyEmail, Integer num, Long l) {
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
                            verifyEmail.BO6(C36391kE.A0v(verifyEmail, AnonymousClass3UY.A0D(verifyEmail.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass001.A0L(), 0, i2));
                            return;
                        }
                    }
                    AnonymousClass3SJ.A01(verifyEmail, i3);
                    return;
                }
            }
            AnonymousClass3SJ.A01(verifyEmail, i);
        }
        i = 4;
        AnonymousClass3SJ.A01(verifyEmail, i);
    }

    public static final void A0F(VerifyEmail verifyEmail, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmail.A0D;
                if (wDSButton == null) {
                    throw C36331k8.A0d("nextButton");
                }
                wDSButton.setEnabled(false);
                C19650wI A3j = verifyEmail.A3j();
                A3j.A00.postDelayed(C81143wX.A00(verifyEmail, 44), TimeUnit.SECONDS.toMillis(longValue));
            }
        }
    }

    public void A2F() {
        if (!this.A0J) {
            this.A0J = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A09 = C36351kA.A0h(r2);
            this.A08 = C36401kF.A0Y(r2);
            this.A05 = C36351kA.A0R(r2);
            this.A0C = C36411kG.A0q(r2);
            this.A0A = C27111My.A38(A0L);
            this.A0B = C36391kE.A0o(r2);
            this.A06 = C36411kG.A0f(r1);
            this.A07 = r2.A9B();
        }
    }

    public final C194349Pi A3i() {
        C194349Pi r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public final C19650wI A3j() {
        C19650wI r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }

    public void onBackPressed() {
        if (this.A0K) {
            Log.i("VerifyEmail/onBackPressed/is adding new account");
            C65983Uf.A0G(this, this.A09, this.A0A);
        }
    }

    public VerifyEmail(int i) {
        this.A0J = false;
        C89364Wg.A00(this, 7);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C36401kF.A16(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1) {
            C62623Gw r3 = this.A0A;
            if (r3 != null) {
                AnonymousClass1X8 r2 = this.A0B;
                if (r2 != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("verify-email +");
                    String str = this.A0H;
                    if (str == null) {
                        throw C36331k8.A0d("countryCode");
                    }
                    A0u.append(str);
                    String str2 = this.A0I;
                    if (str2 == null) {
                        throw C36331k8.A0d("phoneNumber");
                    }
                    r3.A01(this, r2, AnonymousClass000.A0q(str2, A0u));
                } else {
                    throw C36331k8.A0d("verificationFlowState");
                }
            } else {
                throw C36331k8.A0d("registrationHelper");
            }
        } else if (A062 == 2) {
            if (this.A09 != null) {
                C36361kB.A0t(this);
                return true;
            }
            throw C36331k8.A0X();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public VerifyEmail() {
        this(0);
    }
}
