package com.whatsapp.newsletter;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass1N2;
import X.AnonymousClass2EJ;
import X.AnonymousClass3M5;
import X.AnonymousClass3TE;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y4;
import X.AnonymousClass4RE;
import X.C011504z;
import X.C012005e;
import X.C18820ts;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C36891lT;
import X.C38021na;
import X.C52172p0;
import X.C53842ry;
import X.C63813Ln;
import X.C65993Ug;
import X.C85204Ge;
import X.C86264Kg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class NewsletterInfoMembersSearchFragment extends Hilt_NewsletterInfoMembersSearchFragment implements AnonymousClass4RE {
    public ListView A00;
    public WaTextView A01;
    public C21060yb A02;
    public C18820ts A03;
    public C20810yC A04;
    public NewsletterInfoMembersListViewModel A05;
    public AnonymousClass2EJ A06;
    public C38021na A07;
    public AnonymousClass1N2 A08;
    public boolean A09;
    public final int A0A = R.layout.f9nameremoved;
    public final AnonymousClass00T A0B = AnonymousClass3TE.A03(this, "enter_animated", false);
    public final AnonymousClass00T A0C = AnonymousClass3TE.A03(this, "exit_animated", false);
    public final AnonymousClass00T A0D = AnonymousClass3TE.A03(this, "is_over_max", false);
    public final AnonymousClass00T A0E = AnonymousClass3TE.A00(this, "footer_text");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1J() {
        this.A01 = null;
        this.A00 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A00 = (ListView) C012005e.A02(view, 16908298);
        this.A09 = A0b().getBoolean("enter_ime");
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A0i;
        View A0G = C36361kB.A0G(A0d(), R.id.search_holder);
        A0G.setBackgroundResource(R.drawable.search_background);
        this.A07 = newsletterInfoActivity.A3w();
        this.A06 = (AnonymousClass2EJ) C36441kJ.A0b(newsletterInfoActivity).A00(AnonymousClass2EJ.class);
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = (NewsletterInfoMembersListViewModel) C36441kJ.A0b(newsletterInfoActivity).A00(NewsletterInfoMembersListViewModel.class);
        this.A05 = newsletterInfoMembersListViewModel;
        if (newsletterInfoMembersListViewModel == null) {
            throw C36331k8.A0d("newsletterInfoMembersListViewModel");
        }
        C65993Ug.A00(A0m(), newsletterInfoMembersListViewModel.A01, new C86264Kg(this), 3);
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel2 = this.A05;
        if (newsletterInfoMembersListViewModel2 == null) {
            throw C36331k8.A0d("newsletterInfoMembersListViewModel");
        }
        newsletterInfoMembersListViewModel2.A0S(C52172p0.FULL);
        newsletterInfoActivity.registerForContextMenu(this.A00);
        ListView listView = this.A00;
        if (listView != null) {
            listView.setOnScrollListener(new C63813Ln((Object) this, 5));
        }
        ListView listView2 = this.A00;
        SearchView searchView = (SearchView) A0G.findViewById(R.id.search_view);
        C36331k8.A0r(A0a(), C36391kE.A0P(searchView, R.id.search_src_text), C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
        searchView.setIconifiedByDefault(false);
        if (listView2 != null) {
            AnonymousClass3M5.A01(listView2, this, new C85204Ge(searchView, this), C36331k8.A1b(this.A0B));
        }
        searchView.setQueryHint(A0n(R.string.f12nameremoved));
        searchView.A06 = new C53842ry(this, 10);
        View findViewById = searchView.findViewById(R.id.search_mag_icon);
        AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById).setImageDrawable(new C36891lT(AnonymousClass00E.A00(A0a(), R.drawable.ic_back)));
        if (C36331k8.A1b(this.A0B)) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation.setDuration(240);
            A0G.startAnimation(translateAnimation);
        }
        ImageView A0N = C36391kE.A0N(A0G, R.id.search_back);
        C18820ts r4 = this.A03;
        if (r4 != null) {
            C36361kB.A13(AnonymousClass3UF.A02(A0a(), R.drawable.ic_back, R.color.f6nameremoved), A0N, r4);
            AnonymousClass3Y4.A00(A0N, this, 15);
            ListView listView3 = this.A00;
            if (listView3 != null) {
                C38021na r0 = this.A07;
                if (r0 != null) {
                    listView3.setAdapter(r0);
                    View inflate = A0c().inflate(this.A0A, listView3, false);
                    C36361kB.A0G(inflate, R.id.unfollow_and_report_card).setVisibility(8);
                    FrameLayout A0O = C36431kI.A0O(C36431kI.A0A(C36361kB.A0G(inflate, R.id.list_bottom_shadow), inflate, 8), inflate);
                    C011504z.A06(A0O, 2);
                    listView3.addFooterView(A0O, (Object) null, false);
                    this.A01 = C36401kF.A0Q(inflate, R.id.newsletter_followers_footer_text);
                    A00(this, (String) null);
                    return;
                }
                throw C36331k8.A0Y();
            }
            return;
        }
        throw C36321k7.A09();
    }

    public static final void A00(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment, String str) {
        WaTextView waTextView;
        int i;
        if (C36331k8.A1b(newsletterInfoMembersSearchFragment.A0D)) {
            if (str == null || str.length() == 0) {
                waTextView = newsletterInfoMembersSearchFragment.A01;
                if (waTextView != null) {
                    i = R.string.f12nameremoved;
                } else {
                    return;
                }
            } else {
                waTextView = newsletterInfoMembersSearchFragment.A01;
                if (waTextView != null) {
                    i = R.string.f12nameremoved;
                } else {
                    return;
                }
            }
        } else if (str == null || str.length() == 0) {
            AnonymousClass00T r1 = newsletterInfoMembersSearchFragment.A0E;
            Object value = r1.getValue();
            waTextView = newsletterInfoMembersSearchFragment.A01;
            if (value != null) {
                if (waTextView != null) {
                    C36401kF.A1A(waTextView, r1);
                    return;
                }
                return;
            } else if (waTextView != null) {
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        } else {
            waTextView = newsletterInfoMembersSearchFragment.A01;
            if (waTextView != null) {
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        waTextView.setText(i);
    }

    public void B75() {
        ListView listView = this.A00;
        AnonymousClass1N2 r1 = this.A08;
        if (r1 != null) {
            AnonymousClass3M5.A00(listView, this, r1, C36331k8.A1b(this.A0C));
            return;
        }
        throw C36331k8.A0d("imeUtils");
    }
}
