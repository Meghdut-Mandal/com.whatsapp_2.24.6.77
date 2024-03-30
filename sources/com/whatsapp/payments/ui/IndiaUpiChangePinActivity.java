package com.whatsapp.payments.ui;

import X.AEA;
import X.AVX;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass3SJ;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C175898bF;
import X.C179108jC;
import X.C18800tq;
import X.C18830tt;
import X.C202059ky;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiChangePinActivity extends C179108jC {
    public ProgressBar A00;
    public TextView A01;
    public C175748az A02;
    public String A03;
    public boolean A04;
    public final C24611Dc A05;

    public void BZk(C202059ky r12, String str) {
        Integer num;
        C175898bF r0;
        C175748az r02;
        this.A0S.A06(this.A02, r12, 1);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (r02 = this.A02) != null && r02.A08 != null) {
            this.A03 = C173858Tk.A0J(this);
            this.A04.A01("upi-get-credential");
            C175748az r03 = this.A02;
            A4H((C175818b6) r03.A08, str2, r03.A0B, this.A03, C165577te.A0k(r03.A09), 2);
        } else if (r12 != null && !AEA.A02(this, "upi-list-keys", r12.A00, true)) {
            if (this.A04.A05("upi-list-keys")) {
                this.A0M.A0F();
                this.A05.A06(R.string.f12nameremoved, 1);
                this.A08.A02();
                return;
            }
            C24611Dc r3 = this.A05;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("IndiaUpiChangePinActivity: onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0u.append(num);
            A0u.append(" bankAccount: ");
            A0u.append(this.A02);
            A0u.append(" countrydata: ");
            C175748az r04 = this.A02;
            if (r04 != null) {
                r0 = r04.A08;
            } else {
                r0 = null;
            }
            A0u.append(r0);
            r3.A08("payment-settings", AnonymousClass000.A0q(" failed; ; showErrorAndFinish", A0u), (Throwable) null);
            A4D();
        }
    }

    public Dialog onCreateDialog(int i) {
        int i2;
        int i3;
        String str;
        int i4;
        this.A01.setVisibility(4);
        this.A00.setVisibility(4);
        int i5 = i;
        switch (i) {
            case 10:
                str = getString(R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                i4 = 43;
                break;
            case 11:
                str = getString(R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                i4 = 44;
                break;
            case 12:
                str = getString(R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                i4 = 45;
                break;
            case 13:
                this.A0M.A0G();
                str = getString(R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                i4 = 46;
                break;
            default:
                return super.onCreateDialog(i);
        }
        return A48(new AVX(this, i4), str, i5, i3, i2);
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
        }
    }

    public void BgO(C202059ky r5) {
        this.A0S.A06(this.A02, r5, 7);
        if (r5 == null) {
            this.A05.A06("onSetPin success; showSuccessAndFinish");
            A3w();
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = this.A0N.A04(this.A02);
            BO9(A0L, 0, R.string.f12nameremoved);
        } else if (!AEA.A02(this, "upi-change-mpin", r5.A00, true)) {
            int i = r5.A00;
            int i2 = 10;
            if (i != 11459) {
                i2 = 11;
                if (i != 11468) {
                    i2 = 12;
                    if (i != 11454) {
                        if (i == 11456 || i == 11471) {
                            i2 = 13;
                        } else {
                            this.A05.A06(" onSetPin failed; showErrorAndFinish");
                            A4D();
                            return;
                        }
                    }
                }
            }
            AnonymousClass3SJ.A01(this, i2);
        }
    }

    public IndiaUpiChangePinActivity(int i) {
        this.A04 = false;
        B7Z.A00(this, 8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q(C36401kF.A0o(this.A00.A00, R.string.f12nameremoved));
            supportActionBar.A0U(true);
        }
        this.A01 = C36391kE.A0Q(this, R.id.payments_upi_pin_setup_desc);
        this.A00 = (ProgressBar) findViewById(R.id.progress);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C175748az r0 = (C175748az) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = r0;
        if (r0 != null) {
            this.A02.A08 = (C175898bF) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    public void onResume() {
        super.onResume();
        C24611Dc r2 = this.A05;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onResume with states: ");
        C165567td.A17(r2, this.A04, A0u);
        if (!this.A04.A07.contains("upi-get-challenge") && this.A0M.A09().A00 == null) {
            this.A04.A01("upi-get-challenge");
            A4A();
        } else if (!this.A04.A07.contains("upi-get-challenge")) {
            A4E();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C175898bF r1;
        super.onSaveInstanceState(bundle);
        C175748az r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C175748az r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public IndiaUpiChangePinActivity() {
        this(0);
        this.A05 = C165587tf.A0X("IndiaUpiChangePinActivity");
    }
}
