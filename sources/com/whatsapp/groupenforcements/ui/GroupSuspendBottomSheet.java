package com.whatsapp.groupenforcements.ui;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass147;
import X.AnonymousClass3Y3;
import X.AnonymousClass3YD;
import X.C012005e;
import X.C128376Ca;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C50902mp;
import X.C50932ms;
import X.C61793Dl;
import X.C80293vA;
import X.C80403vL;
import X.C87894Qo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class GroupSuspendBottomSheet extends Hilt_GroupSuspendBottomSheet {
    public C21060yb A00;
    public C20810yC A01;
    public C87894Qo A02;
    public C61793Dl A03;
    public C32681e1 A04;

    public static GroupSuspendBottomSheet A03(C87894Qo r3, AnonymousClass147 r4, boolean z, boolean z2) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("hasMe", z);
        A07.putBoolean("isMeAdmin", z2);
        A07.putString("suspendedEntityId", r4.getRawString());
        GroupSuspendBottomSheet groupSuspendBottomSheet = new GroupSuspendBottomSheet();
        groupSuspendBottomSheet.A17(A07);
        groupSuspendBottomSheet.A02 = r3;
        return groupSuspendBottomSheet;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        AnonymousClass01I A0i = A0i();
        Bundle A0b = A0b();
        AnonymousClass147 A06 = AnonymousClass147.A01.A06(A0b.getString("suspendedEntityId"));
        boolean z = A0b.getBoolean("hasMe");
        boolean z2 = A0b.getBoolean("isMeAdmin");
        ((WDSProfilePhoto) C012005e.A02(A0E, R.id.group_suspend_bottomsheet_profile_photo)).setProfileBadge(new C50932ms(new C128376Ca(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved), new C50902mp(R.color.f6nameremoved, R.color.f6nameremoved), R.drawable.ic_spam_block));
        TextView A0O = C36391kE.A0O(A0E, R.id.group_suspend_bottomsheet_learn_more);
        A0O.setText(this.A04.A02(A0O.getContext(), new C80293vA(this, A0i, 12), C36401kF.A0q(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more"));
        C36331k8.A10(A0O, this.A01);
        C36371kC.A1I(A0O, this.A00);
        if (z2 && z) {
            TextView A0O2 = C36391kE.A0O(A0E, R.id.group_suspend_bottomsheet_support);
            A0O2.setVisibility(0);
            A0O2.setText(this.A04.A02(A0O2.getContext(), new C80403vL(this, A0i, A06, 43), C36401kF.A0q(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more"));
            C36331k8.A10(A0O2, this.A01);
            C36371kC.A1I(A0O2, this.A00);
        }
        C36391kE.A0O(A0E, R.id.group_suspend_bottomsheet_messaging_info).setText(R.string.f12nameremoved);
        AnonymousClass3YD.A00(C012005e.A02(A0E, R.id.group_suspend_bottomsheet_delete_group_button), this, 10, z);
        AnonymousClass3Y3.A00(C012005e.A02(A0E, R.id.group_suspend_bottomsheet_see_group_button), this, 1);
        return A0E;
    }
}
