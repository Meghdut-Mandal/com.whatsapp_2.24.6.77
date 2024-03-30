package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass005;
import X.AnonymousClass00T;
import X.AnonymousClass01z;
import X.AnonymousClass4HP;
import X.AnonymousClass7fJ;
import X.C100974wL;
import X.C12560iI;
import X.C163037pY;
import X.C163067pb;
import X.C163087pd;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C20810yC;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36441kJ;
import X.C84644Ea;
import X.C84654Eb;
import X.C90464aC;
import android.os.Bundle;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.wabloks.ui.WaBloksActivity;

public class BloksCDSBottomSheetActivity extends WaBloksActivity {
    public AnonymousClass005 A00;
    public AnonymousClass005 A01;
    public BiometricAuthPlugin A02;
    public boolean A03;
    public final AnonymousClass00T A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Y.add(new C163087pd(this, 3));
        this.A02.A00(getApplicationContext(), (AnonymousClass7fJ) this.A07.get(), this.A01);
        if (getIntent().getBooleanExtra("add_biometric_auth_extra", false)) {
            int intExtra = getIntent().getIntExtra("biometric_auth_title_res_extra", 0);
            C20810yC r9 = this.A0D;
            this.A02 = new BiometricAuthPlugin(this, this.A03, this.A05, this.A08, new C163067pb(this, 1), r9, intExtra, 0);
        }
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            C100974wL.A01(A0L, r2, r1, this);
            this.A01 = C18840tu.A00(r2.AAc);
            this.A00 = C18840tu.A00(r2.AAa);
        }
    }

    public BloksCDSBottomSheetActivity(int i) {
        this.A03 = false;
        C163037pY.A00(this, 13);
    }

    public void onResume() {
        super.onResume();
        this.A02.A00(getApplicationContext(), (AnonymousClass7fJ) this.A07.get(), this.A01);
    }

    public BloksCDSBottomSheetActivity() {
        this(0);
        this.A04 = new C12560iI(new C84654Eb(this), new C84644Ea(this), new AnonymousClass4HP(this), C36441kJ.A1A(BloksCDSBottomSheetViewModel.class));
    }
}
