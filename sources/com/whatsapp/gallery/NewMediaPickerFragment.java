package com.whatsapp.gallery;

import X.AnonymousClass00C;
import X.AnonymousClass0CZ;
import X.AnonymousClass0V9;
import X.AnonymousClass2Ty;
import X.AnonymousClass3K8;
import X.AnonymousClass3Y2;
import X.AnonymousClass4V2;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C40801w8;
import X.C74153l9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Set;

public class NewMediaPickerFragment extends Hilt_NewMediaPickerFragment {
    public LayoutInflater A00;
    public View A01;
    public ViewGroup A02;
    public RecyclerView A03;
    public Menu A04;
    public final Set A05 = C36441kJ.A17();

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        this.A00 = layoutInflater;
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A02 = C36411kG.A0P(view, R.id.gallery_selected_container);
        AnonymousClass00C.A08(view.getContext());
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(view, R.id.gallery_selected_media);
        this.A03 = recyclerView;
        recyclerView.A0U = true;
        AnonymousClass3K8 r2 = this.A0K;
        if (r2 != null) {
            LayoutInflater layoutInflater = this.A00;
            if (layoutInflater == null) {
                throw C36331k8.A0d("inflater");
            }
            recyclerView.setAdapter(new C40801w8(layoutInflater, r2));
            LinearLayoutManager A0T = C36431kI.A0T();
            A0T.A1f(0);
            recyclerView.setLayoutManager(A0T);
        }
        View A0F = C36361kB.A0F(view, R.id.gallery_done_btn);
        this.A01 = A0F;
        AnonymousClass3Y2.A00(A0F, this, 14);
    }

    public boolean A1k(AnonymousClass4V2 r4, AnonymousClass2Ty r5) {
        Menu menu;
        Menu menu2;
        MenuItem item;
        if ((this.A09 instanceof C28981Uw) && !A1Z().A0E(5643)) {
            return false;
        }
        if (!A1i() && (menu = this.A04) != null && menu.size() > 0 && (menu2 = this.A04) != null && (item = menu2.getItem(0)) != null && item.getItemId() == R.id.menuitem_select_multiple) {
            A1m();
            A1b();
        }
        return super.A1k(r4, r5);
    }

    private final void A00() {
        ViewGroup viewGroup;
        if (this.A0L.A04().isEmpty()) {
            this.A05.clear();
        }
        Set set = this.A05;
        int A002 = C36351kA.A00(set.isEmpty() ^ true ? 1 : 0);
        ViewGroup viewGroup2 = this.A02;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != A002) && (viewGroup = this.A02) != null) {
            viewGroup.setVisibility(A002);
        }
        RecyclerView recyclerView = this.A03;
        AnonymousClass0CZ r0 = null;
        if (recyclerView != null) {
            r0 = recyclerView.A0G;
        }
        C36411kG.A1R(r0, set);
    }

    public void A1J() {
        super.A1J();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass0CZ) null);
        }
        this.A03 = null;
        this.A02 = null;
    }

    public void A1L() {
        super.A1L();
        A00();
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36321k7.A0w(menu, menuInflater);
        super.A1U(menu, menuInflater);
        this.A04 = menu;
    }

    public void A1l() {
        super.A1l();
        this.A05.clear();
        A00();
    }

    public void A1n(AnonymousClass4V2 r4) {
        ViewGroup viewGroup;
        AnonymousClass0V9 r0;
        int i;
        super.A1n(r4);
        boolean A1i = A1i();
        Set set = this.A05;
        if (A1i) {
            if (!set.remove(r4)) {
                if (!this.A0H && set.size() >= (i = this.A01) && !this.A0G) {
                    C36371kC.A1N(this, i);
                    this.A0G = true;
                }
                if (set.size() < this.A01) {
                    set.add(r4);
                }
            }
            int A002 = C36351kA.A00(set.isEmpty() ^ true ? 1 : 0);
            ViewGroup viewGroup2 = this.A02;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != A002) && (viewGroup = this.A02) != null) {
                viewGroup.setVisibility(A002);
            }
            RecyclerView recyclerView = this.A03;
            AnonymousClass0CZ r02 = null;
            if (recyclerView != null) {
                r02 = recyclerView.A0G;
            }
            C36411kG.A1R(r02, set);
            if (set.isEmpty()) {
                C74153l9 r03 = this.A0M;
                if (r03 == null) {
                    throw C36331k8.A0d("mediaTray");
                } else if (!r03.A00.A0E(4261) && (r0 = this.A04) != null) {
                    r0.A05();
                }
            }
        } else {
            set.add(r4);
        }
    }
}
