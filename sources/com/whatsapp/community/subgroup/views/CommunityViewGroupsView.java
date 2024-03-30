package com.whatsapp.community.subgroup.views;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01L;
import X.AnonymousClass01z;
import X.AnonymousClass147;
import X.AnonymousClass1QZ;
import X.AnonymousClass3YE;
import X.C006302t;
import X.C05250Oz;
import X.C18700tb;
import X.C24801Dv;
import X.C27851Qb;
import X.C27861Qc;
import X.C28431Sq;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C40051uf;
import X.C53592rZ;
import X.C81813xf;
import X.C86694Lx;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;

public final class CommunityViewGroupsView extends FrameLayout implements C18700tb {
    public C24801Dv A00;
    public C28431Sq A01;
    public AnonymousClass147 A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public final ListItemWithLeftIcon A05;
    public final View A06;
    public final C40051uf A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setViewGroupsCount$lambda$1(C006302t r1, Object obj) {
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj);
    }

    public final void setActivityUtils$app_product_community_community_non_modified(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator$app_product_community_community_non_modified(C28431Sq r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final void setViewClickListener(AnonymousClass01L r3) {
        AnonymousClass3YE.A00(this.A05, this, r3, 30);
    }

    private final void setViewGroupsCount(AnonymousClass01L r4) {
        C53592rZ.A01(r4, this.A07.A0o, new C86694Lx(r4, this), 10);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C24801Dv getActivityUtils$app_product_community_community_non_modified() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final C28431Sq getCommunityNavigator$app_product_community_community_non_modified() {
        C28431Sq r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityNavigator");
    }

    public static final void setViewClickListener$lambda$0(CommunityViewGroupsView communityViewGroupsView, AnonymousClass01L r8, View view) {
        C36321k7.A0w(communityViewGroupsView, r8);
        C28431Sq communityNavigator$app_product_community_community_non_modified = communityViewGroupsView.getCommunityNavigator$app_product_community_community_non_modified();
        AnonymousClass147 r5 = communityViewGroupsView.A02;
        if (r5 == null) {
            throw C36331k8.A0d("parentJid");
        }
        AnonymousClass01z supportFragmentManager = r8.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        AnonymousClass147 r0 = communityViewGroupsView.A02;
        if (r0 == null) {
            throw C36331k8.A0d("parentJid");
        }
        CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = new CommunityNewSubgroupSwitcherBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("community_jid", r0.getRawString());
        communityNewSubgroupSwitcherBottomSheet.A17(A072);
        communityNavigator$app_product_community_community_non_modified.Bu8(supportFragmentManager, r5, new C81813xf(communityNewSubgroupSwitcherBottomSheet));
    }

    public CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            C27861Qc.A0h((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public /* synthetic */ CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A04) {
            this.A04 = true;
            C27861Qc.A0h((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        AnonymousClass01L r2 = (AnonymousClass01L) C24801Dv.A01(context, AnonymousClass01L.class);
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A06 = inflate;
        this.A05 = (ListItemWithLeftIcon) C36361kB.A0G(inflate, R.id.community_view_groups_button);
        this.A07 = (C40051uf) C36441kJ.A0b(r2).A00(C40051uf.class);
        setViewGroupsCount(r2);
        setViewClickListener(r2);
    }
}
