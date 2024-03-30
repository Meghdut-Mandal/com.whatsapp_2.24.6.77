package com.whatsapp.conversation;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass1MK;
import X.AnonymousClass1RC;
import X.AnonymousClass3GV;
import X.AnonymousClass4AO;
import X.AnonymousClass4AP;
import X.AnonymousClass4WT;
import X.C19630wG;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36401kF;
import X.C36431kI;
import X.C66953Xy;
import X.C89384Wi;
import X.C89574Xb;
import X.C89674Xl;
import X.C93154fy;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.Calendar;

public final class ConversationSearchFragment extends Hilt_ConversationSearchFragment {
    public DatePickerDialog.OnDateSetListener A00;
    public AnonymousClass1MK A01;
    public ConversationSearchViewModel A02;
    public C19630wG A03;
    public C20810yC A04;
    public WDSConversationSearchView A05;
    public boolean A06;
    public final AnonymousClass4WT A07 = new AnonymousClass4WT(this, 1);
    public final AnonymousClass00T A08 = C36431kI.A1I(new AnonymousClass4AO(this));
    public final AnonymousClass00T A09 = C36431kI.A1I(new AnonymousClass4AP(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C36321k7.A1K(this, "CallsSearchFragment/onCreateView ", C36401kF.A0t(layoutInflater, 0));
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(R.id.search_view);
        this.A05 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A0n(R.string.f12nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A05;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass4WT r1 = this.A07;
            AnonymousClass00C.A0D(r1, 0);
            wDSConversationSearchView2.A01.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A05;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A03) == null)) {
            toolbar.setNavigationOnClickListener(new C66953Xy(this, 2));
        }
        WDSConversationSearchView wDSConversationSearchView4 = this.A05;
        if (wDSConversationSearchView4 != null) {
            C89574Xb.A00(wDSConversationSearchView4, this, 3);
        }
        WDSConversationSearchView wDSConversationSearchView5 = this.A05;
        if (wDSConversationSearchView5 != null) {
            Toolbar toolbar2 = wDSConversationSearchView5.A03;
            toolbar2.A0G(R.menu.f11nameremoved);
            Menu menu = toolbar2.getMenu();
            AnonymousClass00C.A08(menu);
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                AnonymousClass3GV r12 = wDSConversationSearchView5.A07;
                if (r12 == null) {
                    throw C36331k8.A0d("style");
                }
                item.setIcon(r12.A00(item.getIcon()));
            }
            AnonymousClass3GV r13 = wDSConversationSearchView5.A07;
            if (r13 == null) {
                throw C36331k8.A0d("style");
            }
            toolbar2.setOverflowIcon(r13.A00(toolbar2.getOverflowIcon()));
        }
        WDSConversationSearchView wDSConversationSearchView6 = this.A05;
        if (wDSConversationSearchView6 != null) {
            wDSConversationSearchView6.A01();
        }
        WDSConversationSearchView wDSConversationSearchView7 = this.A05;
        if (wDSConversationSearchView7 != null) {
            wDSConversationSearchView7.setOnSearchByDateListener(new C66953Xy(this, 1));
        }
        WDSConversationSearchView wDSConversationSearchView8 = this.A05;
        if (wDSConversationSearchView8 != null) {
            Toolbar toolbar3 = wDSConversationSearchView8.A03;
            if (toolbar3 != null) {
                toolbar3.A0C = new C89674Xl(this, 1);
            }
            EditText editText = wDSConversationSearchView8.A01;
            if (editText != null) {
                C89384Wi.A00(editText, this, 2);
            }
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass1MK r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("voipCallState");
        } else if (!r0.A00()) {
            AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
        }
    }

    public void A1L() {
        super.A1L();
        AnonymousClass1MK r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("voipCallState");
        } else if (!r0.A00()) {
            AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
        }
    }

    public final void A1Z() {
        Calendar instance = Calendar.getInstance();
        AnonymousClass00C.A08(instance);
        AnonymousClass00T r4 = this.A08;
        ((C93154fy) r4.getValue()).A01.updateDate(instance.get(1), instance.get(2), instance.get(5));
        ((Dialog) r4.getValue()).show();
    }
}
