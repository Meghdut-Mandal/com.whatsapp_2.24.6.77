package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.6d6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135686d6 implements View.OnLongClickListener {
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C135686d6(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        this.A00 = indiaUpiPaymentSettingsFragment;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A00;
        String str = this.A01;
        ClipboardManager A09 = indiaUpiPaymentSettingsFragment.A08.A09();
        if (A09 != null) {
            try {
                A09.setPrimaryClip(ClipData.newPlainText(str, str));
                indiaUpiPaymentSettingsFragment.A0D.A0E(indiaUpiPaymentSettingsFragment.A0n(R.string.f12nameremoved), 1);
                return true;
            } catch (NullPointerException | SecurityException e) {
                Log.e("indiaupi/clipboard/", e);
            }
        }
        return true;
    }
}
