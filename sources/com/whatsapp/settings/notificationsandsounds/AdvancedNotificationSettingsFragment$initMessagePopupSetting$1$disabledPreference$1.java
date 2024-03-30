package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass00C;
import X.AnonymousClass80G;
import X.C100834vr;
import X.C36391kE;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;

public final class AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 extends ListPreference {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AdvancedNotificationSettingsFragment A01;

    public void A0G(AnonymousClass80G r4) {
        AnonymousClass00C.A0D(r4, 0);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1(C100834vr r2, AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment, int i) {
        super(r2, (AttributeSet) null);
        this.A01 = advancedNotificationSettingsFragment;
        this.A00 = i;
    }
}
