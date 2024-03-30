package X;

import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;

/* renamed from: X.3mD  reason: invalid class name and case insensitive filesystem */
public class C74813mD implements AnonymousClass4T9 {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BrazilPaymentSettingsFragment A01;

    public C74813mD(FrameLayout frameLayout, BrazilPaymentSettingsFragment brazilPaymentSettingsFragment) {
        this.A01 = brazilPaymentSettingsFragment;
        this.A00 = frameLayout;
    }

    public void BTd(C21667AUj aUj) {
        C202239lN r0 = this.A01.A0l;
        if (r0 != null) {
            r0.A05(aUj);
        }
    }

    public void BVu(C21667AUj aUj) {
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = this.A01;
        if (brazilPaymentSettingsFragment.A02.A0E(1724)) {
            C23075B3f b3f = brazilPaymentSettingsFragment.A0C;
            Integer A0i = C36361kB.A0i();
            b3f.BOZ(aUj, A0i, A0i, "payment_home", brazilPaymentSettingsFragment.A0u);
        }
        this.A00.setVisibility(8);
    }
}
