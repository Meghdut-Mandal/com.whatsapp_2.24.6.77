package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity;

/* renamed from: X.8hf  reason: invalid class name and case insensitive filesystem */
public abstract class C178828hf extends C178978iK implements C22961AzD {
    public AnonymousClass16T A00;
    public AnonymousClass9YX A01;
    public AnonymousClass8gE A02;

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C202269lR r5 = this.A0L;
        this.A01 = r5.A04;
        AnonymousClass17Y r2 = this.A05;
        AnonymousClass19A r4 = this.A0H;
        AnonymousClass1EU r8 = this.A0P;
        this.A02 = new AnonymousClass8gE(this, r2, this.A00, r4, r5, this.A0K, this.A0M, r8, this);
        onConfigurationChanged(AnonymousClass000.A0U(this));
        AF7 af7 = this.A0S;
        Integer A0m = C36381kD.A0m();
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        af7.BOm(A0m, (Integer) null, str, this.A0e);
    }

    public void A48(C175818b6 r4) {
        Intent A0H = C36441kJ.A0H(this, IndiaUpiSimVerificationActivity.class);
        A42(A0H);
        A0H.putExtra("extra_in_setup", true);
        A0H.putExtra("extra_selected_bank", r4);
        A0H.putExtra("extra_referral_screen", this.A0e);
        startActivity(A0H);
        finish();
    }

    public void Bdq(C202059ky r4) {
        if (!AEA.A02(this, "upi-get-psp-routing-and-list-keys", r4.A00, false)) {
            C24611Dc r2 = this.A0p;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onPspRoutingAndListKeysError: ");
            A0u.append(r4);
            C165567td.A18(r2, "; showGenericError", A0u);
            A47();
        }
    }

    public void onBackPressed() {
        String str;
        AF7 af7 = this.A0S;
        Integer A0i = C36361kB.A0i();
        Integer A0n = C36371kC.A0n();
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        af7.BOm(A0i, A0n, str, this.A0e);
        super.onBackPressed();
    }

    public void A47() {
        Bnv();
        C202939my.A00(this, (DialogInterface.OnDismissListener) null, getString(R.string.f12nameremoved)).show();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() == 16908332) {
            AF7 af7 = this.A0S;
            Integer A0i = C36361kB.A0i();
            Integer A0n = C36371kC.A0n();
            if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
                str = "notify_verification_prompt";
            } else {
                str = "notify_verification_screen";
            }
            af7.BOm(A0i, A0n, str, this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStop() {
        super.onStop();
        if (isFinishing()) {
            this.A02.A00 = null;
        }
    }
}
