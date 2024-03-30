package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass3UW;
import X.C177128dF;
import X.C18800tq;
import X.C19740wR;
import X.C19770wU;
import X.C27291Nq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C39611sv;
import X.C58282zc;
import X.C65533Sl;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class NonAdminGJRFragment extends Hilt_NonAdminGJRFragment {
    public C58282zc A00;
    public C177128dF A01;
    public C39611sv A02;
    public AnonymousClass147 A03;

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
            AnonymousClass147 A04 = C65533Sl.A04(str);
            this.A03 = A04;
            C58282zc r1 = this.A00;
            if (r1 != null) {
                C19770wU A0Z = C36341k9.A0Z(r1.A00.A02);
                C18800tq r02 = r1.A00.A02;
                this.A02 = new C39611sv(C36341k9.A0R(r02), (C27291Nq) r02.A5p.get(), A04, A0Z);
                C177128dF r12 = this.A01;
                if (r12 != null) {
                    AnonymousClass147 r03 = this.A03;
                    if (r03 == null) {
                        throw C36331k8.A0d("groupJid");
                    }
                    r12.A00 = r03;
                    RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(view, R.id.pending_requests_recycler_view);
                    recyclerView.getContext();
                    C36321k7.A0Q(recyclerView);
                    C177128dF r04 = this.A01;
                    if (r04 != null) {
                        recyclerView.setAdapter(r04);
                        C39611sv r05 = this.A02;
                        if (r05 == null) {
                            throw C36331k8.A0a();
                        }
                        AnonymousClass3UW.A00(A0m(), r05.A00, this, recyclerView, 23);
                        return;
                    }
                    throw C36331k8.A0d("nonAdminGJRAdapter");
                }
                throw C36331k8.A0d("nonAdminGJRAdapter");
            }
            throw C36331k8.A0d("nonAdminGJRViewModelFactory");
        } catch (C19740wR e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C36341k9.A15(this);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A10(false);
    }
}
