package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass3TE;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y2;
import X.AnonymousClass4GP;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C18820ts;
import X.C19770wU;
import X.C202859mm;
import X.C224514j;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36881lS;
import X.C40591vn;
import X.C48742hy;
import X.C49602jO;
import X.C53842ry;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class GroupChangedParticipantsBottomSheet extends Hilt_GroupChangedParticipantsBottomSheet {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public SearchView A03;
    public AnonymousClass1LI A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public AnonymousClass1RY A07;
    public C27731Pn A08;
    public C18820ts A09;
    public C40591vn A0A;
    public C19770wU A0B;
    public String A0C;
    public WaTextView A0D;
    public C49602jO A0E;
    public List A0F = AnonymousClass001.A0I();
    public final AnonymousClass00T A0G = C001400p.A00(C000800j.NONE, new AnonymousClass4GP(this));
    public final AnonymousClass00T A0H = AnonymousClass3TE.A01(this, "changed_participants_title");
    public final int A0I = R.layout.f9nameremoved;

    public static final void A05(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet, String str) {
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet2 = groupChangedParticipantsBottomSheet;
        String str2 = str;
        groupChangedParticipantsBottomSheet2.A0C = str;
        C36331k8.A1E(groupChangedParticipantsBottomSheet2.A0E);
        AnonymousClass171 r2 = groupChangedParticipantsBottomSheet2.A06;
        if (r2 != null) {
            C18820ts r3 = groupChangedParticipantsBottomSheet2.A09;
            if (r3 != null) {
                C49602jO r1 = new C49602jO(r2, r3, groupChangedParticipantsBottomSheet2, groupChangedParticipantsBottomSheet2, str2, groupChangedParticipantsBottomSheet2.A0F);
                groupChangedParticipantsBottomSheet2.A0E = r1;
                C19770wU r0 = groupChangedParticipantsBottomSheet2.A0B;
                if (r0 != null) {
                    C36331k8.A1F(r1, r0);
                    return;
                }
                throw C36321k7.A08();
            }
            throw C36321k7.A09();
        }
        throw C36331k8.A0c();
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        View view = this.A00;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("search", z);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        if (bundle != null && bundle.getBoolean("search")) {
            A03(this);
        }
        this.A02 = (LinearLayout) C012005e.A02(view, R.id.title_holder);
        View A022 = C012005e.A02(view, R.id.search_holder);
        this.A00 = A022;
        if (A022 != null) {
            A022.setBackgroundResource(R.drawable.search_background);
            this.A03 = (SearchView) C012005e.A02(A022, R.id.search_view);
        }
        SearchView searchView = this.A03;
        AnonymousClass00C.A0B(searchView);
        C36331k8.A0r(view.getContext(), C36341k9.A0M(searchView, R.id.search_src_text), C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        SearchView searchView2 = this.A03;
        if (searchView2 != null) {
            searchView2.setIconifiedByDefault(false);
        }
        SearchView searchView3 = this.A03;
        if (searchView3 != null) {
            searchView3.setQueryHint(A0n(R.string.f12nameremoved));
        }
        SearchView searchView4 = this.A03;
        AnonymousClass00C.A0B(searchView4);
        View A023 = C012005e.A02(searchView4, R.id.search_mag_icon);
        AnonymousClass00C.A0E(A023, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) A023).setImageDrawable(new C36881lS(AnonymousClass00E.A00(view.getContext(), R.drawable.ic_back)));
        SearchView searchView5 = this.A03;
        if (searchView5 != null) {
            searchView5.A06 = new C53842ry(this, 7);
        }
        View view2 = this.A00;
        AnonymousClass00C.A0B(view2);
        ImageView A0L = C36341k9.A0L(view2, R.id.search_back);
        C18820ts r2 = this.A09;
        if (r2 != null) {
            C36361kB.A13(AnonymousClass3UF.A02(view.getContext(), R.drawable.ic_back, R.color.f6nameremoved), A0L, r2);
            C48742hy.A01(A0L, this, 45);
            AnonymousClass3Y2.A00(C36361kB.A0G(view, R.id.search_btn), this, 27);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(view, R.id.changed_participants_list_bottom_sheet_recyclerview);
            C27731Pn r22 = this.A08;
            if (r22 != null) {
                this.A07 = r22.A05(view.getContext(), "group-participants-changed-activity");
                WaTextView A0Q = C36401kF.A0Q(view, R.id.changed_participants_title_id);
                this.A0D = A0Q;
                if (A0Q != null) {
                    C36401kF.A1A(A0Q, this.A0H);
                }
                WaTextView waTextView = this.A0D;
                if (waTextView != null) {
                    waTextView.setVisibility(0);
                }
                AnonymousClass00T r5 = this.A0G;
                if (((List) r5.getValue()).isEmpty()) {
                    Log.e("GroupChangedParticipantsActivity/empty changed participants jids");
                } else {
                    List list = this.A0F;
                    AnonymousClass16D r1 = this.A05;
                    if (r1 != null) {
                        list.addAll(r1.A0K((Collection) r5.getValue()).values());
                    } else {
                        throw C36331k8.A0Z();
                    }
                }
                Dialog dialog = this.A02;
                AnonymousClass00C.A0E(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                this.A01 = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet);
                C40591vn r23 = new C40591vn(this);
                this.A0A = r23;
                List list2 = this.A0F;
                AnonymousClass00C.A0D(list2, 0);
                r23.A01 = list2;
                C18820ts r0 = r23.A02.A09;
                if (r0 != null) {
                    ArrayList A032 = C202859mm.A03(r0, (String) null);
                    AnonymousClass00C.A08(A032);
                    r23.A00 = A032;
                    r23.A06();
                    C40591vn r02 = this.A0A;
                    if (r02 == null) {
                        throw C36331k8.A0Y();
                    }
                    recyclerView.setAdapter(r02);
                    return;
                }
                throw C36321k7.A09();
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36321k7.A09();
    }

    public static final void A03(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = groupChangedParticipantsBottomSheet.A0F;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            int i = layoutParams.height;
            FrameLayout frameLayout = groupChangedParticipantsBottomSheet.A01;
            if (!(frameLayout == null || (layoutParams2 = frameLayout.getLayoutParams()) == null)) {
                layoutParams2.height = i;
            }
        }
        SearchView searchView = groupChangedParticipantsBottomSheet.A03;
        if (searchView != null) {
            searchView.A0E();
        }
        C36331k8.A0y(groupChangedParticipantsBottomSheet.A02);
        View view2 = groupChangedParticipantsBottomSheet.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public void A1J() {
        super.A1J();
        this.A03 = null;
        this.A0D = null;
        this.A00 = null;
        this.A02 = null;
        AnonymousClass1RY r0 = this.A07;
        if (r0 != null) {
            r0.A02();
        }
        this.A07 = null;
        C36331k8.A1E(this.A0E);
    }

    public int A1i() {
        return this.A0I;
    }
}
