package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass0BN;
import X.AnonymousClass147;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass3UQ;
import X.B9H;
import X.BA8;
import X.BAC;
import X.C165617ti;
import X.C167727yh;
import X.C168097zh;
import X.C187848yd;
import X.C191609Dq;
import X.C19740wR;
import X.C20810yC;
import X.C21060yb;
import X.C22396Alx;
import X.C22397Aly;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C65533Sl;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class GroupMembershipApprovalRequestsFragment extends Hilt_GroupMembershipApprovalRequestsFragment {
    public C191609Dq A00;
    public AnonymousClass17Y A01;
    public AnonymousClass171 A02;
    public C21060yb A03;
    public C20810yC A04;
    public C168097zh A05;
    public C167727yh A06;
    public AnonymousClass147 A07;
    public C32681e1 A08;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        AnonymousClass00C.A0D(view, 0);
        ViewStub viewStub = (ViewStub) C36361kB.A0F(view, R.id.no_pending_requests_view_stub);
        viewStub.setLayoutResource(R.layout.f9nameremoved);
        View inflate = viewStub.inflate();
        AnonymousClass00C.A08(inflate);
        TextEmojiLabel A0R = C36361kB.A0R(inflate, R.id.no_pending_requests_view_description);
        C36331k8.A1A(A0R.getAbProps(), A0R);
        Rect rect = AnonymousClass0BN.A0A;
        C21060yb r0 = this.A03;
        if (r0 != null) {
            C36331k8.A16(A0R, r0);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(view, R.id.pending_requests_recycler_view);
            recyclerView.getContext();
            C36351kA.A1F(recyclerView, 1);
            recyclerView.setAdapter(A1Y());
            try {
                C65533Sl r02 = AnonymousClass147.A01;
                Bundle bundle2 = this.A0A;
                if (bundle2 != null) {
                    str = bundle2.getString("gid");
                } else {
                    str = null;
                }
                this.A07 = C65533Sl.A04(str);
                C168097zh A1Y = A1Y();
                AnonymousClass147 r03 = this.A07;
                if (r03 != null) {
                    A1Y.A00 = r03;
                    this.A06 = (C167727yh) C165617ti.A0A(new B9H(this, 0), A0i()).A00(C167727yh.class);
                    A1Y().A02 = new C22396Alx(this);
                    A1Y().A03 = new C22397Aly(this);
                    C167727yh r04 = this.A06;
                    if (r04 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    r04.A02.A08(A0m(), new BAC(this, recyclerView, inflate, 1));
                    C167727yh r05 = this.A06;
                    if (r05 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    r05.A03.A08(A0m(), new AnonymousClass3UQ(this, inflate, A0R, recyclerView, 2));
                    C167727yh r06 = this.A06;
                    if (r06 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    BA8.A01(A0m(), r06.A04, this, 1);
                    C167727yh r07 = this.A06;
                    if (r07 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    BA8.A01(A0m(), r07.A0H, this, 4);
                    C167727yh r08 = this.A06;
                    if (r08 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    BA8.A01(A0m(), r08.A0G, this, 5);
                    C167727yh r09 = this.A06;
                    if (r09 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    BA8.A01(A0m(), r09.A0I, this, 3);
                    C167727yh r010 = this.A06;
                    if (r010 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    BA8.A01(A0m(), r010.A0F, this, 2);
                    return;
                }
                throw C36331k8.A0d("groupJid");
            } catch (C19740wR e) {
                Log.e("GroupPendingParticipants started with invalid jid ", e);
                C36341k9.A15(this);
            }
        } else {
            throw C36331k8.A0d("systemServices");
        }
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36331k8.A1I(menu, menuInflater);
        C167727yh r0 = this.A06;
        if (r0 == null) {
            throw C36331k8.A0a();
        }
        C187848yd r3 = r0.A01;
        C187848yd r2 = C187848yd.BY_SOURCE;
        int i = R.id.menu_sort_by_source;
        int i2 = R.string.f12nameremoved;
        if (r3 == r2) {
            i = R.id.menu_sort_by_time;
            i2 = R.string.f12nameremoved;
        }
        menu.add(0, i, 0, i2).setShowAsAction(0);
    }

    public final C168097zh A1Y() {
        C168097zh r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("membershipApprovalRequestsAdapter");
    }

    public boolean A1X(MenuItem menuItem) {
        C167727yh r1;
        C187848yd r0;
        int A062 = C36341k9.A06(menuItem);
        if (A062 == R.id.menu_sort_by_source) {
            r1 = this.A06;
            if (r1 == null) {
                throw C36331k8.A0d("viewModel");
            }
            r0 = C187848yd.BY_SOURCE;
        } else if (A062 != R.id.menu_sort_by_time) {
            return false;
        } else {
            r1 = this.A06;
            if (r1 == null) {
                throw C36331k8.A0d("viewModel");
            }
            r0 = C187848yd.BY_TIME;
        }
        C167727yh.A02(r0, r1);
        return false;
    }
}
