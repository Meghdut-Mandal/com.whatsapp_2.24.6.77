package com.whatsapp.calling.callrating;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01z;
import X.AnonymousClass5TF;
import X.C012005e;
import X.C1278469w;
import X.C152337Kc;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C90524aI;
import X.C95284kV;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;
import java.util.Iterator;

public final class UserProblemsFragment extends WaFragment {
    public int A00 = -1;
    public ViewPager A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new C152337Kc(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass00T r6 = this.A02;
        C36341k9.A16(C90524aI.A0L(r6).A09, AnonymousClass5TF.USER_PROBLEMS.titleRes);
        ViewPager viewPager = (ViewPager) C012005e.A02(view, R.id.user_problems_view_pager);
        viewPager.getLayoutParams().height = (int) (((double) C36341k9.A0G(this).getDisplayMetrics().heightPixels) * 0.5d);
        AnonymousClass01z A0k = A0k();
        AnonymousClass00C.A08(A0k);
        ArrayList arrayList = C90524aI.A0L(r6).A0D;
        ArrayList A0J = C36321k7.A0J(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0J.add(C36361kB.A0m(view.getContext(), ((C1278469w) it.next()).A00.titleResId));
        }
        viewPager.setAdapter(new C95284kV(A0k, A0J));
        this.A01 = viewPager;
        ((TabLayout) C012005e.A02(view, R.id.tab_layout)).setupWithViewPager(this.A01);
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A00 != configuration.orientation) {
            ViewPager viewPager = this.A01;
            if (viewPager != null) {
                viewPager.getLayoutParams().height = (int) (((double) C36341k9.A0G(this).getDisplayMetrics().heightPixels) * 0.5d);
                viewPager.requestLayout();
            }
            this.A00 = configuration.orientation;
        }
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
    }
}
