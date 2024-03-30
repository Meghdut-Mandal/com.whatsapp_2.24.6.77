package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.Objects;

/* renamed from: X.5Ok  reason: invalid class name and case insensitive filesystem */
public class C107385Ok extends C101084wy {
    public final C1272567o A00;

    public void A02(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        WaBloksActivity waBloksActivity = this.A03;
        C101084wy.A00(waBloksActivity, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("fds_on_back");
            String stringExtra2 = intent.getStringExtra("fds_on_back_params");
            String stringExtra3 = intent.getStringExtra("fds_button_style");
            C1272567o r1 = this.A00;
            Toolbar toolbar = this.A00;
            Objects.requireNonNull(waBloksActivity);
            r1.A01(waBloksActivity, toolbar, new C165237t6(waBloksActivity, 1), stringExtra, stringExtra2, stringExtra3);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public C107385Ok(C18820ts r1, WaBloksActivity waBloksActivity, C1272567o r3) {
        super(r1, waBloksActivity);
        this.A00 = r3;
    }

    public void A03(C158057fj r2) {
        this.A01 = C140456lc.A0K(r2.B7w());
        C101084wy.A00(this.A03, this);
    }
}
