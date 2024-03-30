package com.whatsapp.registration.email;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass3LW;
import X.C18800tq;
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
import X.C39001qm;
import X.C39321ri;
import X.C62623Gw;
import X.C65983Uf;
import X.C67133Yq;
import X.C89364Wg;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class RegisterEmail extends AnonymousClass155 {
    public int A00;
    public WaEditText A01;
    public AnonymousClass1RU A02;
    public C194349Pi A03;
    public AnonymousClass1DZ A04;
    public C21520zN A05;
    public AnonymousClass190 A06;
    public C62623Gw A07;
    public AnonymousClass1X8 A08;
    public C19650wI A09;
    public AnonymousClass1RJ A0A;
    public WDSButton A0B;
    public WDSButton A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A0B = (WDSButton) C36361kB.A0G(this.A00, R.id.register_email_submit);
        this.A01 = (WaEditText) C36361kB.A0G(this.A00, R.id.register_email_text_input);
        this.A0C = (WDSButton) C36361kB.A0G(this.A00, R.id.register_email_skip);
        this.A0A = C36341k9.A0X(this.A00, R.id.invalid_email_sub_text_view_stub);
        C21520zN r0 = this.A05;
        if (r0 != null) {
            C65983Uf.A0O(this, r0, R.id.register_email_title_toolbar_text);
            WDSButton wDSButton = this.A0B;
            if (wDSButton == null) {
                throw C36331k8.A0d("nextButton");
            }
            C67133Yq.A00(wDSButton, this, 8);
            if (!C65983Uf.A0S(getResources())) {
                WaEditText waEditText = this.A01;
                if (waEditText == null) {
                    throw C36331k8.A0d("emailInput");
                }
                waEditText.A0C(false);
            }
            WaEditText waEditText2 = this.A01;
            if (waEditText2 == null) {
                throw C36331k8.A0d("emailInput");
            }
            waEditText2.addTextChangedListener(new C39321ri(this, 2));
            WDSButton wDSButton2 = this.A0C;
            if (wDSButton2 == null) {
                throw C36331k8.A0d("notNowButton");
            }
            C67133Yq.A00(wDSButton2, this, 9);
            AnonymousClass1RU r02 = this.A02;
            if (r02 != null) {
                boolean A0F2 = r02.A0F(false);
                this.A0H = A0F2;
                C65983Uf.A0M(this.A00, this, this.A00, R.id.register_email_title_toolbar, false, false, A0F2);
                this.A00 = getIntent().getIntExtra("entrypoint", 0);
                this.A0D = C36391kE.A0u(this);
                String A0f = this.A09.A0f();
                AnonymousClass00C.A08(A0f);
                this.A0E = A0f;
                String A0h = this.A09.A0h();
                AnonymousClass00C.A08(A0h);
                this.A0F = A0h;
                C194349Pi r4 = this.A03;
                if (r4 != null) {
                    C36401kF.A1G(r4, this.A0D, this.A00, 1, 8);
                    return;
                }
                throw C36331k8.A0d("emailVerificationLogger");
            }
            throw C36331k8.A0d("accountSwitcher");
        }
        throw C36331k8.A0d("abPreChatdProps");
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        int i2;
        int i3;
        if (i != 1) {
            if (i == 2) {
                r2 = AnonymousClass3LW.A00(this);
                r2.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 48;
            } else if (i != 3) {
                return super.onCreateDialog(i);
            } else {
                WaEditText waEditText = this.A01;
                if (waEditText == null) {
                    throw C36331k8.A0d("emailInput");
                }
                waEditText.setEnabled(false);
                WDSButton wDSButton = this.A0B;
                if (wDSButton == null) {
                    throw C36331k8.A0d("nextButton");
                }
                wDSButton.setEnabled(false);
                r2 = C39001qm.A00(this);
                i2 = R.string.f12nameremoved;
                i3 = 49;
            }
            C39001qm.A0D(r2, this, i3, i2);
        } else {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            r2.A0r(false);
        }
        return r2.create();
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C36351kA.A0h(r2);
            this.A05 = C36401kF.A0Y(r2);
            this.A02 = C36351kA.A0R(r2);
            this.A09 = C36411kG.A0q(r2);
            this.A07 = C27111My.A38(A0L);
            this.A08 = C36391kE.A0o(r2);
            this.A03 = C36411kG.A0f(r1);
            this.A04 = r2.A9B();
        }
    }

    public void onBackPressed() {
        if (this.A0H) {
            Log.i("RegisterEmail/onBackPressed/is adding new account");
            C65983Uf.A0G(this, this.A09, this.A0A);
        }
    }

    public RegisterEmail(int i) {
        this.A0G = false;
        C89364Wg.A00(this, 6);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C36401kF.A16(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1) {
            C62623Gw r3 = this.A07;
            if (r3 != null) {
                AnonymousClass1X8 r2 = this.A08;
                if (r2 != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("register-email +");
                    String str = this.A0E;
                    if (str == null) {
                        throw C36331k8.A0d("countryCode");
                    }
                    A0u.append(str);
                    String str2 = this.A0F;
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
            if (this.A06 != null) {
                C36361kB.A0t(this);
                return true;
            }
            throw C36331k8.A0X();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public RegisterEmail() {
        this(0);
    }
}
