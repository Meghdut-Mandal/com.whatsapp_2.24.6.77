package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;

/* renamed from: X.7yy  reason: invalid class name and case insensitive filesystem */
public class C167817yy extends ListPreference {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SettingsJidNotificationFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167817yy(Context context, SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        super(context, (AttributeSet) null);
        this.A01 = settingsJidNotificationFragment;
        this.A00 = i;
    }

    public void A0G(AnonymousClass80G r4) {
        super.A0G(r4);
        View view = r4.A0H;
        TextView A0P = C36391kE.A0P(view, 16908310);
        TextView A0P2 = C36391kE.A0P(view, 16908304);
        int i = this.A00;
        A0P.setTextColor(i);
        A0P2.setTextColor(i);
        r4.A00 = true;
        r4.A01 = true;
    }
}
