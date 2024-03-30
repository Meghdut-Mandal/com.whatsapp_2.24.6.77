package X;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.4eB  reason: invalid class name and case insensitive filesystem */
public final class C92564eB extends AutofillManager.AutofillCallback {
    public static final C92564eB A00 = new C92564eB();

    public final void A00(C137326fx r2) {
        r2.A00().registerCallback(this);
    }

    public final void A01(C137326fx r2) {
        r2.A00().unregisterCallback(this);
    }

    public void onAutofillEvent(View view, int i, int i2) {
        String str;
        super.onAutofillEvent(view, i, i2);
        if (i2 == 1) {
            str = "Autofill popup was shown.";
        } else if (i2 == 2) {
            str = "Autofill popup was hidden.";
        } else if (i2 != 3) {
            str = "Unknown status event.";
        } else {
            str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        }
        Log.d("Autofill Status", str);
    }
}
