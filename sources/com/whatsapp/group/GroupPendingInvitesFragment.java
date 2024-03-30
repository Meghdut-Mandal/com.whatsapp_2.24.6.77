package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass171;
import X.AnonymousClass1LI;
import X.AnonymousClass1PB;
import X.AnonymousClass1RY;
import X.AnonymousClass3CG;
import X.C18800tq;
import X.C18820ts;
import X.C19740wR;
import X.C19970wo;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C39651t7;
import X.C40701vy;
import X.C58262za;
import X.C65533Sl;
import X.C66023Uj;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class GroupPendingInvitesFragment extends Hilt_GroupPendingInvitesFragment {
    public C58262za A00;
    public AnonymousClass1LI A01;
    public AnonymousClass171 A02;
    public C27731Pn A03;
    public C18820ts A04;
    public C39651t7 A05;
    public AnonymousClass147 A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        try {
            C65533Sl r0 = AnonymousClass147.A01;
            Bundle bundle2 = this.A0A;
            String str = null;
            if (bundle2 != null) {
                str = bundle2.getString("gid");
            }
            this.A06 = C65533Sl.A04(str);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(view, R.id.pending_invites_recycler_view);
            C58262za r2 = this.A00;
            if (r2 != null) {
                AnonymousClass147 r5 = this.A06;
                if (r5 == null) {
                    throw C36331k8.A0d("groupJid");
                }
                C19970wo A0V = C36351kA.A0V(r2.A00.A02);
                C18800tq r1 = r2.A00.A02;
                this.A05 = new C39651t7(C36341k9.A0R(r1), A0V, (AnonymousClass1PB) r1.A3r.get(), r5, C36341k9.A0Z(r1));
                Context A0a = A0a();
                AnonymousClass171 r8 = this.A02;
                if (r8 != null) {
                    C18820ts r10 = this.A04;
                    if (r10 != null) {
                        AnonymousClass3CG r7 = new AnonymousClass3CG(A0a());
                        C27731Pn r3 = this.A03;
                        if (r3 != null) {
                            AnonymousClass1RY A052 = r3.A05(A0a(), "group-pending-participants");
                            AnonymousClass1LI r6 = this.A01;
                            if (r6 != null) {
                                C40701vy r4 = new C40701vy(A0a, r6, r7, r8, A052, r10, 0);
                                r4.A03 = true;
                                r4.A06();
                                C39651t7 r12 = this.A05;
                                if (r12 == null) {
                                    throw C36331k8.A0a();
                                }
                                C66023Uj.A01(A0m(), r12.A00, r4, 11);
                                recyclerView.getContext();
                                C36321k7.A0Q(recyclerView);
                                recyclerView.setAdapter(r4);
                                return;
                            }
                            throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
                        }
                        throw C36331k8.A0d("contactPhotos");
                    }
                    throw C36321k7.A09();
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0d("pendingInvitesViewModelFactory");
        } catch (C19740wR e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C36341k9.A15(this);
        }
    }
}
