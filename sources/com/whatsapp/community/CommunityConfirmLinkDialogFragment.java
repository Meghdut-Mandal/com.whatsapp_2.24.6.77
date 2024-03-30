package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass4FK;
import X.AnonymousClass4HU;
import X.AnonymousClass4XL;
import X.C000800j;
import X.C001400p;
import X.C220412q;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C39001qm;
import X.C51432no;
import X.C88504Sy;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CommunityConfirmLinkDialogFragment extends Hilt_CommunityConfirmLinkDialogFragment {
    public C88504Sy A00;
    public AnonymousClass171 A01;
    public C220412q A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        if (context instanceof C88504Sy) {
            this.A00 = (C88504Sy) context;
            return;
        }
        throw AnonymousClass001.A09("NewCommunityConfirmLinkDialogFragment requires a Listener as it's host");
    }

    public CommunityConfirmLinkDialogFragment() {
        C000800j r2 = C000800j.NONE;
        this.A04 = C001400p.A00(r2, new AnonymousClass4FK(this));
        this.A03 = C001400p.A00(r2, new AnonymousClass4HU(this, C51432no.DIRECT_LINK));
    }

    public Dialog A1a(Bundle bundle) {
        String quantityString;
        C39001qm A05 = AnonymousClass3LW.A05(this);
        AnonymousClass00T r7 = this.A04;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = ((List) r7.getValue()).iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            C220412q r0 = this.A02;
            if (r0 != null) {
                String A0D = r0.A0D(A0a);
                if (A0D != null) {
                    A0I.add(A0D);
                }
            } else {
                throw C36331k8.A0d("chatsCache");
            }
        }
        int size = A0I.size();
        if (size == 1) {
            quantityString = C36391kE.A0v(A0a(), A0I.get(0), new Object[1], 0, R.string.f12nameremoved);
        } else if (size == 2) {
            Context A0a2 = A0a();
            Object[] objArr = new Object[2];
            C36341k9.A1Q(A0I, objArr);
            quantityString = A0a2.getString(R.string.f12nameremoved, objArr);
        } else {
            Resources A0G = C36341k9.A0G(this);
            if (size >= 3) {
                int A06 = C36421kH.A06(A0I, 2);
                Object[] objArr2 = new Object[3];
                C36341k9.A1Q(A0I, objArr2);
                AnonymousClass000.A1L(objArr2, C36421kH.A06(A0I, 2), 2);
                quantityString = A0G.getQuantityString(R.plurals.f10nameremoved, A06, objArr2);
            } else {
                quantityString = A0G.getQuantityString(R.plurals.f10nameremoved, ((List) r7.getValue()).size());
            }
        }
        AnonymousClass00C.A0A(quantityString);
        A05.setTitle(quantityString);
        View A0D2 = C36421kH.A0D(A1D(), R.layout.f9nameremoved);
        TextView A0P = C36391kE.A0P(A0D2, R.id.link_subgroup_to_community_disclaimer_added_members);
        Resources A0F = C36341k9.A0F(A0P);
        Object value = this.A03.getValue();
        C51432no r02 = C51432no.SUGGEST;
        int i = R.plurals.f10nameremoved;
        if (value == r02) {
            i = R.plurals.f10nameremoved;
        }
        A0P.setText(A0F.getQuantityText(i, ((List) r7.getValue()).size()));
        A05.setView(A0D2);
        A05.setNegativeButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 44));
        A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 45));
        return C36371kC.A0O(A05);
    }
}
