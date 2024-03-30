package com.whatsapp.base;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass1RC;
import X.AnonymousClass4WT;
import X.C135426cg;
import X.C39591sn;
import X.C88354Sj;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class WDSSearchViewFragment extends WaFragment {
    public WDSConversationSearchView A00;
    public C39591sn A01;
    public final AnonymousClass4WT A02 = new AnonymousClass4WT(this, 0);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        Toolbar toolbar;
        AnonymousClass00C.A0D(view, 0);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) view.findViewById(R.id.search_view);
        this.A00 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A0n(R.string.f12nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (!(wDSConversationSearchView2 == null || (toolbar = wDSConversationSearchView2.A03) == null)) {
            toolbar.setNavigationOnClickListener(new C135426cg(this, 29));
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A00;
        if (wDSConversationSearchView3 != null) {
            AnonymousClass4WT r1 = this.A02;
            AnonymousClass00C.A0D(r1, 0);
            wDSConversationSearchView3.A01.addTextChangedListener(r1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
    }

    public void A1L() {
        super.A1L();
        AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
    }

    public void A1Q(Bundle bundle) {
        C88354Sj r1;
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        if ((A0h instanceof C88354Sj) && (r1 = (C88354Sj) A0h) != null && !r1.isFinishing()) {
            this.A01 = r1.BH4();
        }
    }

    public void A1Z() {
        Window window;
        AnonymousClass01I A0h = A0h();
        if (!(A0h == null || (window = A0h.getWindow()) == null)) {
            AnonymousClass1RC.A09(window, false);
        }
        C39591sn r0 = this.A01;
        if (r0 != null) {
            r0.A00.A0D("");
        }
        WDSConversationSearchView wDSConversationSearchView = this.A00;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.A00();
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass4WT r1 = this.A02;
            AnonymousClass00C.A0D(r1, 0);
            wDSConversationSearchView2.A01.removeTextChangedListener(r1);
        }
    }
}
