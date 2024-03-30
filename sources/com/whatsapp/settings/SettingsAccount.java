package com.whatsapp.settings;

import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DY;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RU;
import X.AnonymousClass3PI;
import X.AnonymousClass3Y7;
import X.AnonymousClass3YC;
import X.C129036Er;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19550w8;
import X.C27111My;
import X.C32931eR;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C53222qy;
import X.C53232qz;
import X.C61633Cv;
import X.C63293Jm;
import X.C65983Uf;
import X.C89364Wg;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public class SettingsAccount extends AnonymousClass155 {
    public C19460v5 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public AnonymousClass1RU A03;
    public C129036Er A04;
    public AnonymousClass1DY A05;
    public C32931eR A06;
    public C63293Jm A07;
    public C61633Cv A08;
    public AnonymousClass3PI A09;
    public AnonymousClass1RJ A0A;
    public boolean A0B;
    public boolean A0C;

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = (C61633Cv) r1.ACA.get();
            this.A03 = C36351kA.A0R(r2);
            this.A07 = r1.A8y();
            this.A09 = C27111My.A3F(A0L);
            this.A05 = C18800tq.A99(r2);
            this.A01 = C36381kD.A0Q(r1.A9I);
            C19470v6 r0 = C19470v6.A00;
            this.A00 = r0;
            this.A02 = r0;
            this.A06 = C36431kI.A0g(r2);
            this.A04 = (C129036Er) A0L.A01.get();
        }
    }

    public SettingsAccount(int i) {
        this.A0C = false;
        C89364Wg.A00(this, 20);
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(getPackageName(), "com.whatsapp.settings.Settings");
            finishAndRemoveTask();
            startActivity(A0D);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        boolean A0E;
        DialogFragment A002;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0O(this);
        this.A0B = C36411kG.A1W(this.A0D);
        int A092 = C36391kE.A09(this, R.id.privacy_preference);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.security_preference);
        AnonymousClass3Y7.A00(settingsRowIconText, this, 10);
        View findViewById = findViewById(R.id.passkeys_preference);
        C63293Jm r1 = this.A07;
        if (!C19550w8.A05()) {
            A0E = false;
        } else {
            A0E = r1.A02.A0E(5060);
        }
        C36421kH.A0v(findViewById(R.id.passkeys_preference), A0E ? 1 : 0, 0, A092);
        AnonymousClass3Y7.A00(findViewById, this, 11);
        if (getIntent().getBooleanExtra("is_companion", false)) {
            AnonymousClass3Y7.A00(findViewById(R.id.log_out_preference), this, 12);
            C36341k9.A13(this, R.id.two_step_verification_preference, A092);
            C36341k9.A13(this, R.id.coex_onboarding_preference, A092);
            C36341k9.A13(this, R.id.change_number_preference, A092);
            C36341k9.A13(this, R.id.delete_account_preference, A092);
        } else {
            C36341k9.A13(this, R.id.log_out_preference, A092);
            if (this.A05.A00()) {
                SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) C36341k9.A0K(this, R.id.email_verification_preference);
                AnonymousClass3YC.A00(settingsRowIconText2, this, AnonymousClass190.A16(this, C36361kB.A0l(), 2), 7);
                if (this.A0B) {
                    settingsRowIconText2.setIcon((int) R.drawable.vec_email_unfilled);
                }
            }
            SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) findViewById(R.id.two_step_verification_preference);
            AnonymousClass3Y7.A00(settingsRowIconText3, this, 9);
            if (this.A0B) {
                settingsRowIconText3.setIcon((int) R.drawable.ic_settings_account_unfilled_two_step_verification);
            }
            C36341k9.A13(this, R.id.coex_onboarding_preference, A092);
            SettingsRowIconText settingsRowIconText4 = (SettingsRowIconText) findViewById(R.id.change_number_preference);
            if (this.A0B) {
                settingsRowIconText4.setIcon((int) R.drawable.ic_settings_account_unfilled_change_number);
            }
            AnonymousClass3Y7.A00(settingsRowIconText4, this, 15);
            SettingsRowIconText settingsRowIconText5 = (SettingsRowIconText) findViewById(R.id.delete_account_preference);
            if (this.A0B) {
                settingsRowIconText5.setIcon((int) R.drawable.ic_settings_account_unfilled_delete);
            }
            AnonymousClass3Y7.A00(settingsRowIconText5, this, 5);
            if (this.A03.A0B() && this.A03.A09.A0I() + 1 < 2) {
                SettingsRowIconText settingsRowIconText6 = (SettingsRowIconText) C36341k9.A0K(this, R.id.add_account);
                AnonymousClass3Y7.A00(settingsRowIconText6, this, 14);
                if (this.A0B) {
                    settingsRowIconText6.setIcon((int) R.drawable.vec_person_add_unfilled);
                }
            }
            if (this.A03.A0A()) {
                SettingsRowIconText settingsRowIconText7 = (SettingsRowIconText) C36341k9.A0K(this, R.id.remove_account);
                AnonymousClass3Y7.A00(settingsRowIconText7, this, 7);
                if (this.A0B) {
                    settingsRowIconText7.setIcon((int) R.drawable.vec_person_remove_unfilled);
                }
            }
            if (this.A0B) {
                settingsRowIconText.setIcon((int) R.drawable.ic_settings_account_unfilled_security);
            }
        }
        SettingsRowIconText settingsRowIconText8 = (SettingsRowIconText) findViewById(R.id.request_account_info_preference);
        AnonymousClass3Y7.A00(settingsRowIconText8, this, 13);
        if (this.A0B) {
            settingsRowIconText8.setIcon((int) R.drawable.ic_settings_account_unfilled_description);
        }
        this.A06.A00();
        this.A0A = C36351kA.A0r(this, R.id.share_maac_phase_2_view_stub);
        if (C65983Uf.A0U(this.A09, this.A0D)) {
            this.A0A.A03(0);
            AnonymousClass3Y7.A00(this.A0A.A01(), this, A092);
        }
        this.A09.A02(this.A00, "account", C36381kD.A0q(this));
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("account_switcher", false);
            boolean booleanExtra2 = intent.getBooleanExtra("account_switcher_add_account", false);
            this.A04.A00();
            int intExtra = intent.getIntExtra("source", 15);
            if (booleanExtra) {
                A002 = C53222qy.A00("settings_account", intExtra);
            } else if (booleanExtra2) {
                A002 = C53232qz.A00("settings_account", intExtra);
            } else {
                return;
            }
            Btm(A002);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (!C65983Uf.A0U(this.A09, this.A0D)) {
            this.A0A.A03(8);
        }
    }

    public SettingsAccount() {
        this(0);
    }
}
