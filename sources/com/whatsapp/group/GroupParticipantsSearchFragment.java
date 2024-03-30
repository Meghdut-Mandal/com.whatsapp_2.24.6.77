package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass04H;
import X.AnonymousClass088;
import X.AnonymousClass1N2;
import X.AnonymousClass22g;
import X.AnonymousClass2E6;
import X.AnonymousClass3UF;
import X.C011504z;
import X.C012005e;
import X.C02380Ab;
import X.C18820ts;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C32251dE;
import X.C33511fU;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C36941lY;
import X.C38031nb;
import X.C39481sU;
import X.C39811tr;
import X.C48752hz;
import X.C53842ry;
import X.C589531r;
import X.C63813Ln;
import X.C66023Uj;
import X.C68073bI;
import X.C80293vA;
import X.C89214Vr;
import X.C89234Vt;
import X.C89594Xd;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.Objects;

public class GroupParticipantsSearchFragment extends Hilt_GroupParticipantsSearchFragment {
    public int A00 = 0;
    public AnonymousClass2E6 A01;
    public C21060yb A02;
    public C18820ts A03;
    public C20810yC A04;
    public C38031nb A05;
    public C39811tr A06;
    public C32251dE A07;
    public AnonymousClass1N2 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A1P(Bundle bundle) {
        C39481sU r3;
        View view;
        String string;
        this.A0Y = true;
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.A00 = bundle2.getInt("search_view_startup_mode");
            this.A09 = bundle2.getBoolean("enter_animated");
            this.A0B = bundle2.getBoolean("exit_animated");
            this.A0A = bundle2.getBoolean("enter_ime");
        }
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) A0i();
        View A0d = A0d();
        ListView listView = (ListView) C012005e.A02(A0d, 16908298);
        if (this.A05 == null) {
            this.A05 = new C38031nb(new C589531r(groupChatInfoActivity), groupChatInfoActivity);
        }
        C39811tr r2 = (C39811tr) C36441kJ.A0b(groupChatInfoActivity).A00(C39811tr.class);
        this.A06 = r2;
        int i = this.A00;
        if (i == 0) {
            r3 = r2.A0G;
        } else if (i == 1) {
            r3 = r2.A0H;
        } else {
            throw new AssertionError("Unreachable");
        }
        C02380Ab A0m = A0m();
        C38031nb r1 = this.A05;
        Objects.requireNonNull(r1);
        C66023Uj.A01(A0m, r3, r1, 9);
        C32251dE r0 = this.A07;
        AnonymousClass00C.A0D(r0, 0);
        C66023Uj.A01(A0m(), ((StatusesViewModel) new AnonymousClass04H(new C68073bI(r0, true), A0i()).A00(StatusesViewModel.class)).A04, this, 10);
        groupChatInfoActivity.registerForContextMenu(listView);
        C89594Xd.A00(listView, groupChatInfoActivity, 8);
        listView.setOnScrollListener(new C63813Ln(this));
        View findViewById = A0d.findViewById(R.id.search_holder);
        findViewById.setBackgroundResource(R.drawable.search_background);
        SearchView searchView = (SearchView) findViewById.findViewById(R.id.search_view);
        C36331k8.A0r(A1D(), C36391kE.A0P(searchView, R.id.search_src_text), C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
        searchView.setIconifiedByDefault(false);
        if (this.A09) {
            view = A00();
        } else {
            view = null;
        }
        if (view != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (view.getTop() - listView.getPaddingTop()), 0.0f);
            translateAnimation.setDuration(240);
            C89214Vr.A00(translateAnimation, this, searchView, 10);
            listView.startAnimation(translateAnimation);
        } else if (this.A0A) {
            searchView.A0E();
            this.A0A = false;
        } else {
            this.A08.A01(searchView);
        }
        searchView.setQueryHint(A0n(R.string.f12nameremoved));
        searchView.A06 = new C53842ry(this, 8);
        C36391kE.A0N(searchView, R.id.search_mag_icon).setImageDrawable(new C36941lY(AnonymousClass00E.A00(A1D(), R.drawable.ic_back), this));
        if (this.A09) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(240);
            findViewById.startAnimation(translateAnimation2);
        }
        this.A09 = false;
        ImageView A0N = C36391kE.A0N(findViewById, R.id.search_back);
        C36361kB.A13(AnonymousClass3UF.A06(C36341k9.A0G(this), C36341k9.A0G(this).getDrawable(R.drawable.ic_back), R.color.f6nameremoved), A0N, this.A03);
        C48752hz.A00(A0N, this, 9);
        Context A0a = A0a();
        if (this.A00 == 1 && (string = A0a.getString(R.string.f12nameremoved)) != null) {
            View inflate = View.inflate(A1D(), R.layout.f9nameremoved, (ViewGroup) null);
            TextView A0O = C36391kE.A0O(inflate, R.id.text);
            C33511fU.A03(A0O);
            A0O.setText(string);
            listView.addHeaderView(inflate, (Object) null, false);
        }
        C39811tr r9 = this.A06;
        if (this.A00 == 1) {
            Resources resources = groupChatInfoActivity.getResources();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 60, 0);
            SpannableStringBuilder A022 = r9.A0J.A02(groupChatInfoActivity, new C80293vA(r9, groupChatInfoActivity, 3), resources.getQuantityString(R.plurals.f10nameremoved, 60, objArr), "learn-more");
            View inflate2 = View.inflate(A1D(), R.layout.f9nameremoved, (ViewGroup) null);
            TextEmojiLabel A0O2 = C36401kF.A0O(inflate2, R.id.text);
            C36331k8.A16(A0O2, this.A02);
            C36331k8.A1A(this.A04, A0O2);
            A0O2.setText(A022);
            listView.addFooterView(inflate2, (Object) null, false);
        }
        if (this.A00 == 0) {
            C39811tr r12 = this.A06;
            if (r12.A07.A06(r12.A0D) == 3) {
                C39811tr r13 = this.A06;
                if (!r13.A09.A0D(r13.A0D)) {
                    View inflate3 = View.inflate(A1D(), R.layout.f9nameremoved, (ViewGroup) null);
                    TextEmojiLabel A0O3 = C36401kF.A0O(inflate3, R.id.text);
                    C36331k8.A16(A0O3, this.A02);
                    C36331k8.A1A(this.A04, A0O3);
                    A0O3.setText(R.string.f12nameremoved);
                    AnonymousClass088.A06(A0O3, R.style.f13nameremoved);
                    listView.addFooterView(inflate3, (Object) null, false);
                }
            }
        }
        listView.setAdapter(this.A05);
    }

    public void A1R(Bundle bundle) {
        bundle.putInt("search_view_startup_mode", this.A00);
        bundle.putBoolean("enter_animated", this.A09);
        bundle.putBoolean("exit_animated", this.A0B);
        bundle.putBoolean("enter_ime", this.A0A);
    }

    public void A1Z() {
        View view;
        View view2 = this.A0F;
        if (view2 != null) {
            boolean A1S = AnonymousClass000.A1S(A0l().A0I(), 1);
            if (this.A0B) {
                view = A00();
            } else {
                view = null;
            }
            View findViewById = view2.findViewById(R.id.search_holder);
            findViewById.setVisibility(8);
            this.A08.A01(C012005e.A02(findViewById, R.id.search_view));
            if (view != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(240);
                findViewById.startAnimation(alphaAnimation);
                View findViewById2 = view2.findViewById(16908298);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (view.getTop() - findViewById2.getPaddingTop()));
                translateAnimation.setDuration(240);
                C89234Vt.A00(translateAnimation, this, 12);
                findViewById2.startAnimation(translateAnimation);
            } else {
                A0l().A0W();
            }
            AnonymousClass2E6 r0 = this.A01;
            if (r0 != null && A1S) {
                C011504z.A06(r0, 1);
            }
        }
    }

    private View A00() {
        AnonymousClass22g r5 = (AnonymousClass22g) A0h();
        View view = null;
        if (r5 != null) {
            int childCount = r5.getListView().getChildCount();
            for (int i = 0; i < childCount && view == null; i++) {
                View childAt = r5.getListView().getChildAt(i);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
