package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass0CZ;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1LI;
import X.AnonymousClass1N2;
import X.AnonymousClass1RY;
import X.AnonymousClass2EJ;
import X.AnonymousClass3M5;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Y4;
import X.AnonymousClass4ID;
import X.AnonymousClass4MA;
import X.AnonymousClass4RE;
import X.C02800By;
import X.C18800tq;
import X.C18820ts;
import X.C20810yC;
import X.C220412q;
import X.C27731Pn;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36441kJ;
import X.C40961wO;
import X.C52172p0;
import X.C58302ze;
import X.C65993Ug;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;

public final class NewsletterSelectNewOwnerFragment extends Hilt_NewsletterSelectNewOwnerFragment implements AnonymousClass4RE {
    public RecyclerView A00;
    public C58302ze A01;
    public AnonymousClass1LI A02;
    public AnonymousClass16D A03;
    public AnonymousClass171 A04;
    public C27731Pn A05;
    public C18820ts A06;
    public C220412q A07;
    public C40961wO A08;
    public NewsletterInfoMembersListViewModel A09;
    public AnonymousClass2EJ A0A;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A0i;
        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
        AnonymousClass3MZ.A00(toolbar);
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        toolbar.setNavigationOnClickListener(new AnonymousClass3Y4(this, 21));
        this.A00 = C36441kJ.A0c(view2, R.id.pending_invites_recycler_view);
        AnonymousClass01I A0h = A0h();
        AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity2 = (NewsletterInfoActivity) A0h;
        C58302ze r4 = this.A01;
        if (r4 != null) {
            LayoutInflater A0c = A0c();
            AnonymousClass00C.A08(A0c);
            C27731Pn r3 = this.A05;
            if (r3 != null) {
                AnonymousClass1RY A052 = r3.A05(A0a(), "newsletter-new-owner-admins");
                C28981Uw A3v = newsletterInfoActivity2.A3v();
                C18800tq r1 = r4.A00.A02;
                C20810yC A0V = C36341k9.A0V(r1);
                C220412q A0a = C36351kA.A0a(r1);
                this.A08 = new C40961wO(A0c, C36361kB.A0S(r1), C36341k9.A0S(r1), A052, A0a, A0V, C36351kA.A0h(r1), A3v, newsletterInfoActivity2);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    C36341k9.A0z(recyclerView, recyclerView.getPaddingLeft(), recyclerView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                    recyclerView.getContext();
                    C36321k7.A0Q(recyclerView);
                    recyclerView.setAdapter(this.A08);
                }
                this.A0A = (AnonymousClass2EJ) C36441kJ.A0b(newsletterInfoActivity).A00(AnonymousClass2EJ.class);
                NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = (NewsletterInfoMembersListViewModel) C36441kJ.A0b(newsletterInfoActivity).A00(NewsletterInfoMembersListViewModel.class);
                this.A09 = newsletterInfoMembersListViewModel;
                if (newsletterInfoMembersListViewModel == null) {
                    throw C36331k8.A0d("newsletterInfoMembersListViewModel");
                }
                C65993Ug.A00(A0m(), newsletterInfoMembersListViewModel.A01, new AnonymousClass4MA(newsletterInfoActivity, this), 9);
                NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel2 = this.A09;
                if (newsletterInfoMembersListViewModel2 == null) {
                    throw C36331k8.A0d("newsletterInfoMembersListViewModel");
                }
                newsletterInfoMembersListViewModel2.A0S(C52172p0.FULL);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    AnonymousClass3M5.A01(recyclerView2, this, AnonymousClass4ID.A00, true);
                    return;
                }
                return;
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("newsletterAdminsListAdapterFactory");
    }

    public void A1J() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((C02800By) null);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((AnonymousClass0CZ) null);
        }
        this.A00 = null;
        this.A08 = null;
        super.A1J();
    }

    public void B75() {
        AnonymousClass3M5.A00(this.A00, this, (AnonymousClass1N2) null, true);
    }
}
