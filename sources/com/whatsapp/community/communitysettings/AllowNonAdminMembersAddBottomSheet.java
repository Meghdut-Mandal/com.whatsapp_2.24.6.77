package com.whatsapp.community.communitysettings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass4FR;
import X.AnonymousClass4XE;
import X.C000800j;
import X.C001400p;
import X.C20810yC;
import X.C36321k7;
import X.C36411kG;
import X.C36431kI;
import X.C53102qm;
import X.C53822rw;
import X.C833549b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminMembersAddBottomSheet extends Hilt_AllowNonAdminMembersAddBottomSheet {
    public RadioGroup A00;
    public C20810yC A01;
    public RadioButtonWithSubtitle A02;
    public RadioButtonWithSubtitle A03;
    public boolean A04;
    public WaTextView A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new C833549b(this));
    public final AnonymousClass00T A07 = C001400p.A00(C000800j.NONE, new AnonymousClass4FR(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        WaTextView A0Z = C36411kG.A0Z(inflate, R.id.non_admin_members_add_title);
        boolean A0E = A0Z.getAbProps().A0E(7608);
        int i2 = R.string.f12nameremoved;
        if (A0E) {
            i2 = R.string.f12nameremoved;
        }
        A0Z.setText(i2);
        this.A05 = A0Z;
        RadioButtonWithSubtitle radioButtonWithSubtitle = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_members_add_admin_only);
        C20810yC r0 = this.A01;
        if (r0 != null) {
            if (r0.A0E(7608)) {
                radioButtonWithSubtitle.setTitle(A0n(R.string.f12nameremoved));
                i = R.string.f12nameremoved;
            } else {
                radioButtonWithSubtitle.setTitle(A0n(R.string.f12nameremoved));
                i = R.string.f12nameremoved;
            }
            radioButtonWithSubtitle.setSubTitle(A0n(i));
            this.A02 = radioButtonWithSubtitle;
            RadioButtonWithSubtitle radioButtonWithSubtitle2 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_members_add_everyone);
            radioButtonWithSubtitle2.setTitle(A0n(R.string.f12nameremoved));
            radioButtonWithSubtitle2.setSubTitle(A0n(R.string.f12nameremoved));
            this.A03 = radioButtonWithSubtitle2;
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.allow_non_admin_add_members_radio_group);
            radioGroup.setOnCheckedChangeListener(new AnonymousClass4XE(radioGroup, this, 0));
            this.A00 = radioGroup;
            return inflate;
        }
        throw C36321k7.A07();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C53822rw.A01(A0m(), ((CommunitySettingsViewModel) this.A06.getValue()).A04, C53102qm.A02(this, 16), 49);
    }

    public void A1H() {
        super.A1H();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
    }
}
