package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.1yR  reason: invalid class name and case insensitive filesystem */
public class C42201yR extends AnonymousClass0D3 {
    public final WaTextView A00;
    public final SettingsRowIconText A01;
    public final String A02;

    public C42201yR(View view, String str) {
        super(view);
        this.A01 = (SettingsRowIconText) C012005e.A02(view, R.id.storage_usage_save_space_row);
        this.A00 = C36401kF.A0Q(view, R.id.settings_row_subtext);
        this.A02 = str;
    }
}
