package com.whatsapp.community.communitysettings;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0BN;
import X.AnonymousClass1LV;
import X.AnonymousClass1T4;
import X.AnonymousClass4FS;
import X.AnonymousClass4XE;
import X.C000800j;
import X.C001400p;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C36331k8;
import X.C36401kF;
import X.C36431kI;
import X.C53102qm;
import X.C53592rZ;
import X.C833649c;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminSubgroupCreationBottomSheet extends Hilt_AllowNonAdminSubgroupCreationBottomSheet {
    public RadioGroup A00;
    public TextEmojiLabel A01;
    public AnonymousClass1T4 A02;
    public AnonymousClass1LV A03;
    public C21060yb A04;
    public C20810yC A05;
    public RadioButtonWithSubtitle A06;
    public RadioButtonWithSubtitle A07;
    public C20380xT A08;
    public C32681e1 A09;
    public boolean A0A;
    public final AnonymousClass00T A0B = C36431kI.A1I(new C833649c(this));
    public final AnonymousClass00T A0C = C001400p.A00(C000800j.NONE, new AnonymousClass4FS(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A06 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_subgroup_creation_admin);
        this.A07 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_subgroup_creation_everyone);
        this.A01 = C36401kF.A0P(inflate, R.id.non_admin_subgroup_creation_subtext);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new AnonymousClass4XE(radioGroup, this, 1));
        this.A00 = radioGroup;
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            C32681e1 r6 = this.A09;
            if (r6 != null) {
                Context context = textEmojiLabel.getContext();
                Object[] A0L = AnonymousClass001.A0L();
                C20380xT r1 = this.A08;
                if (r1 != null) {
                    textEmojiLabel.setText(r6.A00(context, C36401kF.A0q(this, r1.A02("205306122327447"), A0L, 0, R.string.f12nameremoved)));
                    C36331k8.A10(textEmojiLabel, textEmojiLabel.getAbProps());
                    Rect rect = AnonymousClass0BN.A0A;
                    C21060yb r0 = this.A04;
                    if (r0 != null) {
                        C36331k8.A16(textEmojiLabel, r0);
                    } else {
                        throw C36331k8.A0W();
                    }
                } else {
                    throw C36331k8.A0d("faqLinkFactory");
                }
            } else {
                throw C36331k8.A0b();
            }
        }
        AnonymousClass1T4 r02 = this.A02;
        if (r02 != null) {
            if (r02.A00.A0E(4184) && (radioButtonWithSubtitle = this.A06) != null) {
                radioButtonWithSubtitle.setSubTitle(A0n(R.string.f12nameremoved));
            }
            C53592rZ.A01(A0m(), ((CommunitySettingsViewModel) this.A0B.getValue()).A0A, C53102qm.A02(this, 17), 0);
            return;
        }
        throw C36331k8.A0d("communityABPropsManager");
    }

    public void A1H() {
        super.A1H();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A06 = null;
        this.A07 = null;
        this.A01 = null;
    }
}
