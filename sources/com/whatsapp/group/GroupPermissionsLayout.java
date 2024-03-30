package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass1N3;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C20810yC;
import X.C22820AwV;
import X.C24801Dv;
import X.C26341Ju;
import X.C27851Qb;
import X.C27861Qc;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C48752hz;
import X.C67343Zl;
import X.C80253v6;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class GroupPermissionsLayout extends LinearLayout implements C18700tb {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public SwitchCompat A04;
    public C24801Dv A05;
    public ListItemWithLeftIcon A06;
    public ListItemWithLeftIcon A07;
    public ListItemWithLeftIcon A08;
    public ListItemWithLeftIcon A09;
    public ListItemWithLeftIcon A0A;
    public ListItemWithLeftIcon A0B;
    public ListItemWithLeftIcon A0C;
    public AnonymousClass1N3 A0D;
    public WaTextView A0E;
    public C18820ts A0F;
    public C20810yC A0G;
    public C26341Ju A0H;
    public C32681e1 A0I;
    public AnonymousClass1QZ A0J;
    public boolean A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A00();
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0G = r2;
    }

    public final void setActivityUtils(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setClickEventListener(C22820AwV awV) {
        AnonymousClass00C.A0D(awV, 0);
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C36331k8.A0d("editGroupInfoSwitch");
        }
        switchCompat.setOnCheckedChangeListener(new C67343Zl(awV, 1));
        SwitchCompat switchCompat2 = this.A04;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("sendMessagesSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(new C67343Zl(awV, 2));
        SwitchCompat switchCompat3 = this.A01;
        if (switchCompat3 == null) {
            throw C36331k8.A0d("memberAddModeSwitch");
        }
        switchCompat3.setOnCheckedChangeListener(new C67343Zl(awV, 4));
        SwitchCompat switchCompat4 = this.A02;
        if (switchCompat4 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSwitch");
        }
        switchCompat4.setOnCheckedChangeListener(new C67343Zl(awV, 3));
        SwitchCompat switchCompat5 = this.A03;
        if (switchCompat5 == null) {
            throw C36331k8.A0d("reportToAdminSwitch");
        }
        switchCompat5.setOnCheckedChangeListener(new C67343Zl(awV, 5));
        ListItemWithLeftIcon listItemWithLeftIcon = this.A08;
        if (listItemWithLeftIcon == null) {
            throw C36331k8.A0d("manageHistoryView");
        }
        C48752hz.A00(listItemWithLeftIcon, awV, 11);
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0I = r2;
    }

    public final void setPinInChatExperimentUtils(C26341Ju r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0H = r2;
    }

    public final void setWaLinkFactory(AnonymousClass1N3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0D = r2;
    }

    public final void setWaLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0F = r2;
    }

    public void A00() {
        if (!this.A0K) {
            this.A0K = true;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            setAbProps(C36341k9.A0V(r1));
            setLinkifier(C36351kA.A0p(r1.A00));
            setWaLocale(C36341k9.A0T(r1));
            setActivityUtils(C36351kA.A0J(r1));
            setWaLinkFactory(C36391kE.A0X(r1));
            setPinInChatExperimentUtils(r1.AHt());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0J;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C24801Dv getActivityUtils() {
        C24801Dv r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }

    public final C26341Ju getPinInChatExperimentUtils() {
        C26341Ju r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pinInChatExperimentUtils");
    }

    public final AnonymousClass1N3 getWaLinkFactory() {
        AnonymousClass1N3 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waLinkFactory");
    }

    public final C18820ts getWaLocale() {
        C18820ts r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waLocale");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A0C = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.restricted_mode_layout);
        Property property = SwitchCompat.A0b;
        WDSSwitch wDSSwitch = new WDSSwitch(C36371kC.A0B(this), (AttributeSet) null, 0, 6, (C05250Oz) null);
        this.A00 = wDSSwitch;
        wDSSwitch.setId(R.id.edit_group_settings_switch);
        ListItemWithLeftIcon listItemWithLeftIcon = this.A0C;
        if (listItemWithLeftIcon == null) {
            throw C36331k8.A0d("restrictGroupPermissions");
        }
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C36331k8.A0d("editGroupInfoSwitch");
        }
        listItemWithLeftIcon.A07(switchCompat);
        this.A06 = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.announcement_group_layout);
        WDSSwitch wDSSwitch2 = new WDSSwitch(C36371kC.A0B(this), (AttributeSet) null, 0, 6, (C05250Oz) null);
        this.A04 = wDSSwitch2;
        wDSSwitch2.setId(R.id.send_messages_switch);
        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A06;
        if (listItemWithLeftIcon2 == null) {
            throw C36331k8.A0d("announcementGroupSetting");
        }
        SwitchCompat switchCompat2 = this.A04;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("sendMessagesSwitch");
        }
        listItemWithLeftIcon2.A07(switchCompat2);
        this.A09 = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.member_add_mode_layout);
        WDSSwitch wDSSwitch3 = new WDSSwitch(C36371kC.A0B(this), (AttributeSet) null, 0, 6, (C05250Oz) null);
        this.A01 = wDSSwitch3;
        wDSSwitch3.setId(R.id.member_add_mode_switch);
        ListItemWithLeftIcon listItemWithLeftIcon3 = this.A09;
        if (listItemWithLeftIcon3 == null) {
            throw C36331k8.A0d("memberAddModeSetting");
        }
        SwitchCompat switchCompat3 = this.A01;
        if (switchCompat3 == null) {
            throw C36331k8.A0d("memberAddModeSwitch");
        }
        listItemWithLeftIcon3.A07(switchCompat3);
        this.A0A = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.require_membership_approval);
        WDSSwitch wDSSwitch4 = new WDSSwitch(C36371kC.A0B(this), (AttributeSet) null, 0, 6, (C05250Oz) null);
        this.A02 = wDSSwitch4;
        wDSSwitch4.setId(R.id.group_require_membership_approval_switch);
        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A0A;
        if (listItemWithLeftIcon4 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSetting");
        }
        SwitchCompat switchCompat4 = this.A02;
        if (switchCompat4 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSwitch");
        }
        listItemWithLeftIcon4.A07(switchCompat4);
        ListItemWithLeftIcon listItemWithLeftIcon5 = this.A0A;
        if (listItemWithLeftIcon5 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSetting");
        }
        C32681e1 linkifier = getLinkifier();
        ListItemWithLeftIcon listItemWithLeftIcon6 = this.A0A;
        if (listItemWithLeftIcon6 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSetting");
        }
        Context context = listItemWithLeftIcon6.getContext();
        String string = getContext().getString(R.string.f12nameremoved);
        ListItemWithLeftIcon listItemWithLeftIcon7 = this.A0A;
        if (listItemWithLeftIcon7 == null) {
            throw C36331k8.A0d("membershipApprovalRequiredSetting");
        }
        listItemWithLeftIcon5.A06(linkifier.A03(context, new C80253v6(this, 6), string, "", C36341k9.A05(listItemWithLeftIcon7.getContext())), true);
        this.A0B = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.report_to_admin_row);
        WDSSwitch wDSSwitch5 = new WDSSwitch(C36371kC.A0B(this), (AttributeSet) null, 0, 6, (C05250Oz) null);
        this.A03 = wDSSwitch5;
        wDSSwitch5.setId(R.id.group_report_to_admin_switch);
        ListItemWithLeftIcon listItemWithLeftIcon8 = this.A0B;
        if (listItemWithLeftIcon8 == null) {
            throw C36331k8.A0d("reportToAdminSetting");
        }
        SwitchCompat switchCompat5 = this.A03;
        if (switchCompat5 == null) {
            throw C36331k8.A0d("reportToAdminSwitch");
        }
        listItemWithLeftIcon8.A07(switchCompat5);
        View findViewById = findViewById(R.id.admins_can_section_title);
        AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type android.view.View");
        findViewById.setVisibility(0);
        this.A07 = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.manage_admins);
        this.A0E = C36351kA.A0Q(this, R.id.general_section_title);
        this.A08 = (ListItemWithLeftIcon) C36361kB.A0F(this, R.id.manage_history);
        boolean A0E2 = getAbProps().A0E(3088);
        int i = R.string.f12nameremoved;
        if (A0E2) {
            i = R.string.f12nameremoved;
        }
        ListItemWithLeftIcon listItemWithLeftIcon9 = this.A0C;
        if (listItemWithLeftIcon9 == null) {
            throw C36331k8.A0d("restrictGroupPermissions");
        }
        listItemWithLeftIcon9.setDescription((CharSequence) C36381kD.A0t(this, i));
    }

    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A00();
    }
}
