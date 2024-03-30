package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C173858Tk;
import X.C175748az;
import X.C179008it;
import X.C207279uq;
import X.C24611Dc;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C67203Yx;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiAadhaarCardVerificationActivity extends C179008it {
    public EditText A00;
    public EditText A01;
    public C175748az A02;
    public C135086c7 A03;
    public WDSButton A04;
    public String A05;
    public String A06;
    public final C24611Dc A07 = C165607th.A0b("IndiaUpiAadhaarCardVerificationActivity");

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("aadhaarNumberInst")) {
            this.A03 = (C135086c7) bundle.getParcelable("aadhaarNumberInst");
        }
        if (bundle.containsKey("otpTransactionIdInst")) {
            this.A05 = bundle.getString("otpTransactionIdInst");
        }
        if (bundle.containsKey("otpTransactionTsInst")) {
            this.A06 = bundle.getString("otpTransactionTsInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        C135086c7 r1 = this.A03;
        if (r1 != null) {
            bundle.putParcelable("aadhaarNumberInst", r1);
        }
        String str = this.A05;
        if (str != null) {
            bundle.putString("otpTransactionIdInst", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            bundle.putString("otpTransactionTsInst", str2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A0j(this);
        setContentView((int) R.layout.f9nameremoved);
        A3y(R.drawable.ic_back, R.id.scroll_view);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C165577te.A10(supportActionBar, R.string.f12nameremoved);
        }
        C175748az r0 = (C175748az) C173858Tk.A07(this);
        if (r0 != null) {
            this.A02 = r0;
        }
        WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.verify_button);
        this.A04 = wDSButton;
        if (wDSButton == null) {
            throw C36331k8.A0d("confirmButton");
        }
        C36391kE.A1I(wDSButton, this, 40);
        this.A00 = (EditText) C36361kB.A0H(this, R.id.aadhaar_number_part1);
        EditText editText = (EditText) C36361kB.A0H(this, R.id.aadhaar_number_part2);
        this.A01 = editText;
        EditText editText2 = this.A00;
        if (editText2 == null) {
            throw C36331k8.A0d("aadhaarNumber1");
        } else if (editText == null) {
            throw C36331k8.A0d("aadhaarNumber2");
        } else {
            editText2.addTextChangedListener(new C207279uq(editText, this, 4));
            EditText editText3 = this.A00;
            if (editText3 == null) {
                throw C36331k8.A0d("aadhaarNumber1");
            }
            EditText editText4 = this.A01;
            if (editText4 == null) {
                throw C36331k8.A0d("aadhaarNumber2");
            }
            editText3.setOnKeyListener(new C67203Yx((EditText) null, editText4));
            EditText editText5 = this.A01;
            if (editText5 == null) {
                throw C36331k8.A0d("aadhaarNumber2");
            }
            editText5.addTextChangedListener(new C207279uq(editText5, this, 2));
            EditText editText6 = this.A01;
            if (editText6 == null) {
                throw C36331k8.A0d("aadhaarNumber2");
            }
            EditText editText7 = this.A00;
            if (editText7 == null) {
                throw C36331k8.A0d("aadhaarNumber1");
            }
            editText6.setOnKeyListener(new C67203Yx(editText7, (EditText) null));
            EditText editText8 = this.A00;
            if (editText8 == null) {
                throw C36331k8.A0d("aadhaarNumber1");
            }
            editText8.requestFocus();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != R.id.menuitem_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        A41(R.string.f12nameremoved, "enter_aadhaar_number", "payments:enter-card");
        return true;
    }
}
