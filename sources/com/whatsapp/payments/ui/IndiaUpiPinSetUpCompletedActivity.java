package com.whatsapp.payments.ui;

import X.AnonymousClass07B;
import X.B7Z;
import X.C012005e;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C173858Tk;
import X.C175818b6;
import X.C175898bF;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C199849g7;
import X.C207249un;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class IndiaUpiPinSetUpCompletedActivity extends C179128jE {
    public C199849g7 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = C165607th.A0e(r2);
        }
    }

    public IndiaUpiPinSetUpCompletedActivity(int i) {
        this.A01 = false;
        B7Z.A00(this, 34);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.BOm(C36361kB.A0i(), C36371kC.A0n(), "pin_created", (String) null);
    }

    public void onCreate(Bundle bundle) {
        C175898bF r3;
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C207249un r5 = (C207249un) C173858Tk.A07(this);
        AnonymousClass07B A0F = C173858Tk.A0F(this);
        if (A0F != null) {
            C165577te.A10(A0F, R.string.f12nameremoved);
        }
        if (r5 == null || (r3 = r5.A08) == null) {
            Log.e("Screen called without valid account, finishing");
            finish();
            return;
        }
        C175818b6 r32 = (C175818b6) r3;
        View findViewById = findViewById(R.id.account_layout);
        C012005e.A02(findViewById, R.id.progress).setVisibility(8);
        C36351kA.A1A(findViewById, R.id.divider, 8);
        C36351kA.A1A(findViewById, R.id.radio_button, 8);
        C173858Tk.A0O(findViewById, r5);
        C36391kE.A0O(findViewById, R.id.account_number).setText(this.A00.A02(r5, false));
        C165607th.A1A(C36391kE.A0O(findViewById, R.id.account_name), C165577te.A0g(r32.A02));
        C36391kE.A0O(findViewById, R.id.account_type).setText(r32.A0B());
        if (getIntent().getBooleanExtra("on_settings_page", false)) {
            C36391kE.A0Q(this, R.id.continue_button).setText(R.string.f12nameremoved);
        }
        C36421kH.A13(findViewById(R.id.continue_button), this, 4);
        this.A0S.BOm(0, (Integer) null, "pin_created", (String) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0S.BOm(C36361kB.A0i(), C36371kC.A0n(), "pin_created", (String) null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinSetUpCompletedActivity() {
        this(0);
    }
}
