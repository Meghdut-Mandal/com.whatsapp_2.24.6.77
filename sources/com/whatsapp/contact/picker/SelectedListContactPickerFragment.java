package com.whatsapp.contact.picker;

import X.AnonymousClass00C;
import X.AnonymousClass141;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C40741w2;
import X.C42741zP;
import X.C66053Um;
import X.C66103Ur;
import X.C89124Vi;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class SelectedListContactPickerFragment extends ContactPickerFragment {
    public RelativeLayout A00;
    public RecyclerView A01;
    public C40741w2 A02;
    public ValueAnimator A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub A0M;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A1G = super.A1G(bundle, layoutInflater, viewGroup);
        if (!(this instanceof VoipContactPickerFragment) || C36331k8.A1b(((VoipContactPickerFragment) this).A06)) {
            RecyclerView recyclerView = null;
            if (!(A1G == null || (A0M = C36431kI.A0M(A1G, R.id.selected_contacts_list_stub)) == null)) {
                View inflate = A0M.inflate();
                AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                this.A00 = relativeLayout;
                if (relativeLayout != null) {
                    recyclerView = C36441kJ.A0c(relativeLayout, R.id.selected_items);
                }
                this.A01 = recyclerView;
                A00(A1G, true);
            }
        }
        return A1G;
    }

    public void A1q(View view, AnonymousClass141 r4) {
        AnonymousClass00C.A0D(view, 1);
        super.A1q(view, r4);
        if (!(this instanceof VoipContactPickerFragment) || C36331k8.A1b(((VoipContactPickerFragment) this).A06)) {
            A25().A0L(r4);
        }
    }

    public void A1r(View view, AnonymousClass141 r4) {
        AnonymousClass00C.A0D(view, 1);
        super.A1r(view, r4);
        if (!(this instanceof VoipContactPickerFragment) || C36331k8.A1b(((VoipContactPickerFragment) this).A06)) {
            C40741w2 A25 = A25();
            List list = A25.A00;
            list.add(r4);
            A25.A08(C36431kI.A07(list));
            RelativeLayout relativeLayout = this.A00;
            if (relativeLayout != null && relativeLayout.getVisibility() == 8) {
                A05(this, 0, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
            }
            A1l();
        }
    }

    private final void A00(View view, boolean z) {
        List list;
        Map map = this.A3o;
        AnonymousClass00C.A07(map);
        boolean z2 = true;
        int i = 0;
        if (!(!map.isEmpty()) && (!z || (list = this.A2n) == null || !C36401kF.A1a(list))) {
            z2 = false;
        }
        RelativeLayout relativeLayout = this.A00;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(C36381kD.A09(z2));
        }
        if (z2) {
            i = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        ListView listView = this.A0D;
        if (listView == null) {
            listView = (ListView) C36361kB.A0G(view, 16908298);
        }
        A03(listView, this, i);
        if (this.A02 == null) {
            this.A02 = new C40741w2(this);
        }
        if (A25().A00.isEmpty()) {
            A25().A00.addAll(map.values());
        }
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setPadding(0, recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            recyclerView.A0t(new C89124Vi(recyclerView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0));
            recyclerView.getContext();
            SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
            smoothScrollLinearLayoutManager.A1f(0);
            recyclerView.setLayoutManager(smoothScrollLinearLayoutManager);
            recyclerView.setAdapter(A25());
            recyclerView.setItemAnimator(new C42741zP());
        }
    }

    public static final void A05(SelectedListContactPickerFragment selectedListContactPickerFragment, int i, int i2) {
        ValueAnimator valueAnimator;
        RecyclerView recyclerView = selectedListContactPickerFragment.A01;
        if (recyclerView != null) {
            recyclerView.clearAnimation();
        }
        ValueAnimator valueAnimator2 = selectedListContactPickerFragment.A03;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = selectedListContactPickerFragment.A03) == null)) {
            valueAnimator.end();
        }
        int[] A1O = C36441kJ.A1O();
        A1O[0] = i;
        A1O[1] = i2;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        ofInt.addUpdateListener(new C66103Ur(selectedListContactPickerFragment));
        ofInt.addListener(new C66053Um(selectedListContactPickerFragment));
        ofInt.setDuration(240);
        ofInt.start();
        selectedListContactPickerFragment.A03 = ofInt;
    }

    public final C40741w2 A25() {
        C40741w2 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("selectedContactsAdapter");
    }

    public static final void A03(ListView listView, SelectedListContactPickerFragment selectedListContactPickerFragment, int i) {
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        listView.setLayoutParams(marginLayoutParams);
        RelativeLayout relativeLayout = selectedListContactPickerFragment.A00;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.height = i;
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    public void A1f() {
        super.A1f();
        if (!(this instanceof VoipContactPickerFragment) || C36331k8.A1b(((VoipContactPickerFragment) this).A06)) {
            ListView listView = this.A0D;
            AnonymousClass00C.A07(listView);
            A00(listView, false);
            ListView listView2 = this.A0D;
            if (listView2 != null) {
                listView2.setFastScrollAlwaysVisible(false);
                listView2.setFastScrollEnabled(false);
            }
        }
    }
}
