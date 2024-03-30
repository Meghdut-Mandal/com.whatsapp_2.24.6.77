package X;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment;

/* renamed from: X.6di  reason: invalid class name and case insensitive filesystem */
public class C136066di implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ MarketingOptOutReasonsFragment A00;

    public C136066di(MarketingOptOutReasonsFragment marketingOptOutReasonsFragment) {
        this.A00 = marketingOptOutReasonsFragment;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            MarketingOptOutReasonsFragment.A03((RadioButton) compoundButton, this.A00);
        }
    }
}
