package com.whatsapp.ephemeral;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass17Z;
import X.AnonymousClass3LW;
import X.AnonymousClass3TD;
import X.C012005e;
import X.C20810yC;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C39001qm;
import X.C89654Xj;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ChangeEphemeralSettingsDialog extends Hilt_ChangeEphemeralSettingsDialog {
    public AnonymousClass17Z A00;

    public static void A03(AnonymousClass01z r3, int i, int i2) {
        ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog = new ChangeEphemeralSettingsDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("from_settings", i);
        A07.putInt("entry_point", i2);
        changeEphemeralSettingsDialog.A17(A07);
        changeEphemeralSettingsDialog.A1f(r3, "group_ephemeral_settings_dialog");
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        View inflate = C36381kD.A0J(this).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        RadioGroup radioGroup = (RadioGroup) C012005e.A02(inflate, R.id.disappearing_messages_settings_dialog_radio_group);
        TextView A0O = C36391kE.A0O(inflate, R.id.disappearing_messages_settings_dialog_title);
        int i2 = A0b().getInt("from_settings", 0);
        int i3 = A0b().getInt("entry_point", 0);
        C20810yC r1 = this.A02;
        if (i3 == 2) {
            AnonymousClass3TD.A03(radioGroup, r1, i2, true, true);
            i = R.string.f12nameremoved;
        } else {
            AnonymousClass3TD.A03(radioGroup, r1, i2, false, false);
            i = R.string.f12nameremoved;
        }
        A0O.setText(i);
        for (int i4 = 0; i4 < radioGroup.getChildCount(); i4++) {
            View childAt = radioGroup.getChildAt(i4);
            if (childAt instanceof RadioButton) {
                ((TextView) childAt).setTextSize(0, C36341k9.A0G(this).getDimension(R.dimen.f7nameremoved));
            }
        }
        radioGroup.setOnCheckedChangeListener(new C89654Xj(this, 2));
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0j(inflate);
        return A04.create();
    }
}
