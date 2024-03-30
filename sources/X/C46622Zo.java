package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.2Zo  reason: invalid class name and case insensitive filesystem */
public abstract class C46622Zo extends AnonymousClass24W {
    public AnonymousClass1EV A00;
    public AnonymousClass1N6 A01;
    public PaymentSettingsFragment A02;
    public final C24611Dc A03 = C24611Dc.A00("PaymentSettingsActivity", "payment-settings", "COMMON");

    public void A2W() {
        this.A01.A03((AnonymousClass11F) null, 75);
    }

    public boolean A2f() {
        return this.A0D.A0E(7019);
    }

    public PaymentSettingsFragment A3i() {
        return new BrazilPaymentSettingsFragment();
    }

    public void onBackPressed() {
        C167677yY r1;
        PaymentSettingsFragment paymentSettingsFragment = this.A02;
        if (!(paymentSettingsFragment == null || (r1 = paymentSettingsFragment.A0m) == null)) {
            r1.A0W(paymentSettingsFragment.A0h);
        }
        if (isTaskRoot()) {
            Intent A032 = AnonymousClass190.A03(this);
            finishAndRemoveTask();
            startActivity(A032);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (this.A00.A03() || this.A00.A02()) {
            AnonymousClass07B supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                if (this instanceof BrazilPaymentSettingsActivity) {
                    AnonymousClass00C.A0D(this.A0D, 0);
                }
                supportActionBar.A0I(R.string.f12nameremoved);
                supportActionBar.A0U(true);
            }
            Intent intent = getIntent();
            this.A02 = A3i();
            if (bundle == null) {
                if (!(intent == null || intent.getExtras() == null)) {
                    Bundle bundle2 = new Bundle(intent.getExtras());
                    Bundle bundle3 = this.A02.A0A;
                    if (bundle3 != null) {
                        bundle2.putAll(bundle3);
                    }
                    this.A02.A17(bundle2);
                }
                AnonymousClass09Y A0O = C36341k9.A0O(this);
                A0O.A0E(this.A02, (String) null, R.id.payment_settings_fragment_container);
                A0O.A01();
                return;
            }
            return;
        }
        this.A03.A06("onCreate payment is not enabled; finish");
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PaymentSettingsFragment paymentSettingsFragment = this.A02;
        if (paymentSettingsFragment != null) {
            paymentSettingsFragment.A1o(intent);
        }
    }
}
