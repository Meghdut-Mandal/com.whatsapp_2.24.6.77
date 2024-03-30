package com.whatsapp.email;

import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3Y0;
import X.C18800tq;
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
import X.C39001qm;
import X.C39321ri;
import X.C65983Uf;
import X.C89334Wd;
import X.C90034Yv;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class UpdateEmailActivity extends AnonymousClass155 {
    public int A00;
    public int A01;
    public WaEditText A02;
    public C194349Pi A03;
    public AnonymousClass1DZ A04;
    public AnonymousClass190 A05;
    public C19650wI A06;
    public AnonymousClass1RJ A07;
    public WDSButton A08;
    public String A09;
    public View A0A;
    public AnonymousClass1RJ A0B;
    public boolean A0C;

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        int i2;
        int i3;
        if (i == 1) {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            r2.A0r(false);
        } else if (i != 2) {
            if (i == 3) {
                r2 = AnonymousClass3LW.A00(this);
                r2.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 3;
            } else if (i != 4) {
                return super.onCreateDialog(i);
            } else {
                WaEditText waEditText = this.A02;
                if (waEditText == null) {
                    throw C36331k8.A0d("emailInput");
                }
                waEditText.setEnabled(false);
                WDSButton wDSButton = this.A08;
                if (wDSButton == null) {
                    throw C36331k8.A0d("nextButton");
                }
                wDSButton.setEnabled(false);
                r2 = C39001qm.A00(this);
                i2 = R.string.f12nameremoved;
                i3 = 5;
            }
            C39001qm.A0B(r2, this, i3, i2);
        } else {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0d(R.string.f12nameremoved);
            r2.A0c(R.string.f12nameremoved);
            C39001qm.A0B(r2, this, 4, R.string.f12nameremoved);
            C39001qm.A0G(r2, this, 2, R.string.f12nameremoved);
        }
        return r2.create();
    }

    public static final int A01(UpdateEmailActivity updateEmailActivity) {
        int i = updateEmailActivity.A01;
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return 1;
        }
        return 2;
    }

    public static final void A07(UpdateEmailActivity updateEmailActivity) {
        AnonymousClass1RJ r0 = updateEmailActivity.A07;
        if (r0 == null) {
            throw C36331k8.A0d("invalidEmailViewStub");
        }
        View A012 = r0.A01();
        AnonymousClass00C.A08(A012);
        ((TextView) A012).setText(R.string.f12nameremoved);
        AnonymousClass1RJ r1 = updateEmailActivity.A07;
        if (r1 == null) {
            throw C36331k8.A0d("invalidEmailViewStub");
        }
        r1.A03(0);
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A05 = C36351kA.A0h(A0B2);
            this.A06 = C36411kG.A0q(A0B2);
            this.A03 = C36411kG.A0f(r1);
            this.A04 = A0B2.A9B();
        }
    }

    public final C194349Pi A3i() {
        C194349Pi r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 == 1 && menu != null) {
            menu.add(0, 1, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public UpdateEmailActivity(int i) {
        this.A0C = false;
        C89334Wd.A00(this, 20);
    }

    public static final void A0F(UpdateEmailActivity updateEmailActivity, String str) {
        if (str.length() > 0) {
            if (!C36361kB.A1Z(str, Patterns.EMAIL_ADDRESS)) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/invalid email");
                updateEmailActivity.A3i().A00(updateEmailActivity.A09, "INVALID_EMAIL", updateEmailActivity.A00, A01(updateEmailActivity), 2, 2);
                A07(updateEmailActivity);
                return;
            } else if (str.equals(updateEmailActivity.A09.A0i()) && updateEmailActivity.A01 != 2) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/same email");
                updateEmailActivity.A3i().A00(updateEmailActivity.A09, "SAME_EMAIL", updateEmailActivity.A00, A01(updateEmailActivity), 2, 2);
                AnonymousClass1RJ r0 = updateEmailActivity.A07;
                if (r0 == null) {
                    throw C36331k8.A0d("invalidEmailViewStub");
                }
                View A012 = r0.A01();
                AnonymousClass00C.A08(A012);
                ((TextView) A012).setText(R.string.f12nameremoved);
                AnonymousClass1RJ r1 = updateEmailActivity.A07;
                if (r1 == null) {
                    throw C36331k8.A0d("invalidEmailViewStub");
                }
                r1.A03(0);
                return;
            }
        }
        AnonymousClass3SJ.A01(updateEmailActivity, 1);
        AnonymousClass1DZ r2 = updateEmailActivity.A04;
        if (r2 != null) {
            r2.A02(new C90034Yv(0, str, updateEmailActivity), str);
            return;
        }
        throw C36331k8.A0d("emailVerificationXmppMethods");
    }

    public void onBackPressed() {
        Intent A16;
        A3i().A00(this.A09, (String) null, this.A00, A01(this), 7, 3);
        int i = this.A00;
        if (this.A05 != null) {
            if (i == 3) {
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(getPackageName(), "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity");
                A16 = A0D.addFlags(67108864);
            } else {
                A16 = AnonymousClass190.A16(this, this.A09, i);
            }
            AnonymousClass00C.A0B(A16);
            this.A01.A06(this, A16);
            finish();
            return;
        }
        throw C36331k8.A0X();
    }

    public void onCreate(Bundle bundle) {
        int i;
        String A0i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0P(this);
        this.A08 = (WDSButton) C36361kB.A0G(this.A00, R.id.update_email_submit);
        this.A02 = (WaEditText) C36361kB.A0G(this.A00, R.id.update_email_text_input);
        this.A0A = C36361kB.A0G(this.A00, R.id.update_email_layout);
        this.A07 = C36341k9.A0X(this.A00, R.id.invalid_email_sub_text_view_stub);
        this.A0B = C36341k9.A0X(this.A00, R.id.update_email_shimmer_view_stub);
        this.A01 = getIntent().getIntExtra("state", 0);
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        this.A09 = C36391kE.A0u(this);
        C36401kF.A1G(A3i(), this.A09, this.A00, A01(this), 8);
        int i2 = this.A01;
        if (i2 != 1) {
            i = R.string.f12nameremoved;
            if (i2 != 2) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
        }
        setTitle(i);
        if (!(this.A01 == 0 || (A0i = this.A09.A0i()) == null || A0i.length() == 0)) {
            WaEditText waEditText = this.A02;
            if (waEditText == null) {
                throw C36331k8.A0d("emailInput");
            }
            waEditText.setText(this.A09.A0i());
            WDSButton wDSButton = this.A08;
            if (wDSButton == null) {
                throw C36331k8.A0d("nextButton");
            }
            wDSButton.setEnabled(true);
        }
        if (!C65983Uf.A0S(getResources())) {
            WaEditText waEditText2 = this.A02;
            if (waEditText2 == null) {
                throw C36331k8.A0d("emailInput");
            }
            waEditText2.A0C(false);
        }
        WaEditText waEditText3 = this.A02;
        if (waEditText3 == null) {
            throw C36331k8.A0d("emailInput");
        }
        waEditText3.addTextChangedListener(new C39321ri(this, 0));
        WDSButton wDSButton2 = this.A08;
        if (wDSButton2 == null) {
            throw C36331k8.A0d("nextButton");
        }
        AnonymousClass3Y0.A01(wDSButton2, this, 25);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1) {
            AnonymousClass3SJ.A01(this, 2);
            return true;
        } else if (A062 != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public UpdateEmailActivity() {
        this(0);
    }
}
