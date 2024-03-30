package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass12O;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1LI;
import X.AnonymousClass2YS;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Y4;
import X.C000800j;
import X.C001400p;
import X.C18820ts;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36401kF;
import X.C36441kJ;
import X.C40991wR;
import X.C61433Bw;
import X.C85254Gj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NewsletterInvitedAdminsFragment extends Hilt_NewsletterInvitedAdminsFragment {
    public C61433Bw A00;
    public AnonymousClass1LI A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C27731Pn A04;
    public C18820ts A05;
    public AnonymousClass12O A06;
    public C40991wR A07;
    public final AnonymousClass00T A08 = C001400p.A00(C000800j.NONE, new C85254Gj(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        AnonymousClass3MZ.A00(toolbar);
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        toolbar.setNavigationOnClickListener(new AnonymousClass3Y4(this, 19));
        RecyclerView A0c = C36441kJ.A0c(view, R.id.pending_invites_recycler_view);
        C61433Bw r6 = this.A00;
        if (r6 != null) {
            AnonymousClass01I A0h = A0h();
            AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
            NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A0h;
            LayoutInflater A0c2 = A0c();
            AnonymousClass00C.A08(A0c2);
            C27731Pn r2 = this.A04;
            if (r2 != null) {
                this.A07 = r6.A00(A0c2, r2.A05(A0a(), "newsletter-invited-admins"), newsletterInfoActivity, true);
                List list = (List) this.A08.getValue();
                ArrayList A0J = C36321k7.A0J(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F A0a = C36401kF.A0a(it);
                    AnonymousClass16D r0 = this.A02;
                    if (r0 != null) {
                        A0J.add(new AnonymousClass2YS(r0.A0D(A0a)));
                    } else {
                        throw C36331k8.A0Z();
                    }
                }
                C40991wR r02 = this.A07;
                if (r02 == null) {
                    throw C36331k8.A0d("newsletterInvitedAdminsListAdapter");
                }
                r02.A0L(A0J);
                A0c.getContext();
                C36321k7.A0Q(A0c);
                C40991wR r03 = this.A07;
                if (r03 == null) {
                    throw C36331k8.A0d("newsletterInvitedAdminsListAdapter");
                }
                A0c.setAdapter(r03);
                return;
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("newsletterInvitedAdminsListAdapterFactory");
    }
}
