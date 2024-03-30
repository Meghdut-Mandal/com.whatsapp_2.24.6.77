package com.whatsapp.search.home;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass04H;
import X.AnonymousClass15R;
import X.AnonymousClass1MK;
import X.AnonymousClass1RC;
import X.AnonymousClass4WT;
import X.C19630wG;
import X.C36321k7;
import X.C36331k8;
import X.C36401kF;
import X.C39411sE;
import X.C39551sd;
import X.C67133Yq;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public final class HomeSearchFragment extends Hilt_HomeSearchFragment {
    public AnonymousClass1MK A00;
    public C19630wG A01;
    public C39551sd A02;
    public WDSConversationSearchView A03;
    public final AnonymousClass4WT A04 = new AnonymousClass4WT(this, 2);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C36321k7.A1K(this, "HomeSearchFragment/onCreateView ", C36401kF.A0t(layoutInflater, 0));
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(R.id.search_view);
        this.A03 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A0n(R.string.f12nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A03;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass4WT r1 = this.A04;
            AnonymousClass00C.A0D(r1, 0);
            wDSConversationSearchView2.A01.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A03;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A03) == null)) {
            toolbar.setNavigationOnClickListener(new C67133Yq((Object) this, 33));
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass1MK r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("voipCallState");
        } else if (!r0.A00()) {
            AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
        }
    }

    public void A1L() {
        super.A1L();
        AnonymousClass1MK r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("voipCallState");
        } else if (!r0.A00()) {
            AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
        }
    }

    public void A1Q(Bundle bundle) {
        AnonymousClass15R r2;
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        if ((A0h instanceof AnonymousClass15R) && (r2 = (AnonymousClass15R) A0h) != null && !r2.isFinishing()) {
            HomeActivity homeActivity = (HomeActivity) r2;
            this.A02 = (C39551sd) new AnonymousClass04H(new C39411sE(homeActivity, homeActivity.A0f), homeActivity).A00(C39551sd.class);
        }
    }
}
