package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0A2;
import X.AnonymousClass0FM;
import X.AnonymousClass155;
import X.AnonymousClass1RJ;
import X.AnonymousClass4FT;
import X.C000800j;
import X.C001400p;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C02800By;
import X.C109325Xd;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C27111My;
import X.C28431Sq;
import X.C32681e1;
import X.C33311f5;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C40911wJ;
import X.C55712v4;
import X.C57052xb;
import X.C66933Xw;
import X.C833849e;
import X.C833949f;
import X.C834049g;
import X.C834149h;
import X.C834249i;
import X.C834349j;
import X.C834449k;
import X.C834549l;
import X.C834649m;
import X.C89324Wc;
import X.C99304t3;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class MemberSuggestedGroupsManagementActivity extends AnonymousClass155 {
    public AnonymousClass0FM A00;
    public C99304t3 A01;
    public C57052xb A02;
    public C28431Sq A03;
    public C32681e1 A04;
    public boolean A05 = false;
    public final C40911wJ A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;

    public static final void A01(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, int i) {
        ((AnonymousClass1RJ) memberSuggestedGroupsManagementActivity.A0A.getValue()).A03(i);
        C36361kB.A0I(memberSuggestedGroupsManagementActivity.A08).setVisibility(i);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A03 = C36391kE.A0b(r2);
            this.A04 = C36351kA.A0p(r1);
            this.A02 = (C57052xb) A0L.A0n.get();
        }
    }

    public MemberSuggestedGroupsManagementActivity() {
        super(R.layout.f9nameremoved);
        C89324Wc.A00(this, 16);
        this.A0F = C36431kI.A1I(new C834549l(this));
        this.A07 = C36431kI.A1I(new C833849e(this));
        this.A06 = new C40911wJ();
        this.A0A = C36431kI.A1I(new C834149h(this));
        this.A09 = C36431kI.A1I(new C834049g(this));
        this.A08 = C36431kI.A1I(new C833949f(this));
        this.A0D = C36431kI.A1I(new C834449k(this));
        this.A0C = C36431kI.A1I(new C834349j(this));
        this.A0B = C36431kI.A1I(new C834249i(this));
        this.A0G = C36431kI.A1I(new C834649m(this));
        this.A0E = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4FT(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
        MemberSuggestedGroupsManagementActivity$setupLoading$1$1 memberSuggestedGroupsManagementActivity$setupLoading$1$1 = new MemberSuggestedGroupsManagementActivity$setupLoading$1$1((FrameLayout) this.A00.findViewById(R.id.overall_progress_spinner), this, (C023509x) null);
        C008903u r2 = C008903u.A00;
        Integer num = C023109s.A00;
        AnonymousClass0A2.A02(num, r2, memberSuggestedGroupsManagementActivity$setupLoading$1$1, A002);
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.member_suggested_groups_management_toolbar);
        AnonymousClass00C.A0B(toolbar);
        C18820ts r1 = this.A00;
        AnonymousClass00C.A07(r1);
        C55712v4.A00(this, toolbar, r1, "");
        AnonymousClass0A2.A02(num, r2, new MemberSuggestedGroupsManagementActivity$setupToolbar$1$1(toolbar, this, (C023509x) null), C33311f5.A00(this));
        WaTextView A0Z = C36411kG.A0Z(this.A00, R.id.member_suggested_groups_management_disclaimer);
        AnonymousClass0A2.A02(num, r2, new MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1(A0Z, this, (C023509x) null), C33311f5.A00(this));
        RecyclerView recyclerView = (RecyclerView) this.A0F.getValue();
        recyclerView.setAdapter(this.A06);
        recyclerView.getContext();
        C36321k7.A0Q(recyclerView);
        recyclerView.setItemAnimator((C02800By) null);
        AnonymousClass0A2.A02(num, r2, new MemberSuggestedGroupsManagementActivity$setupRecyclerView$1$1(this, (C023509x) null), C33311f5.A00(this));
        AnonymousClass0A2.A02(num, r2, new MemberSuggestedGroupsManagementActivity$setupButtons$1(this, (C023509x) null), C33311f5.A00(this));
        C66933Xw.A00(this.A00.findViewById(R.id.member_suggested_groups_management_reject_all), this, 48);
        C66933Xw.A00(this.A00.findViewById(R.id.member_suggested_groups_management_approve_all), this, 49);
        AnonymousClass0A2.A02(num, r2, new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this, (C023509x) null), C33311f5.A00(this));
        C33311f5.A00(this).A00(new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this, (C023509x) null));
        MemberSuggestedGroupsManagementViewModel A0T = C36401kF.A0T(this);
        AnonymousClass0A2.A02(num, A0T.A09, new MemberSuggestedGroupsManagementViewModel$initialize$1(A0T, (C023509x) null), C109325Xd.A00(A0T));
    }
}
