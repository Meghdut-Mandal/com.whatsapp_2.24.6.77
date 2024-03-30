package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass3LW;
import X.AnonymousClass3QK;
import X.AnonymousClass4XI;
import X.AnonymousClass4XL;
import X.AnonymousClass4ZG;
import X.C18740tg;
import X.C19770wU;
import X.C20380xT;
import X.C24801Dv;
import X.C32651dy;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C39971uO;
import X.C56982xT;
import X.C81323wp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CommunityExitDialogFragment extends Hilt_CommunityExitDialogFragment {
    public C24801Dv A00;
    public C56982xT A01;
    public AnonymousClass171 A02;
    public AnonymousClass17X A03;
    public AnonymousClass147 A04;
    public C32651dy A05;
    public C20380xT A06;
    public C32681e1 A07;
    public C19770wU A08;

    public static CommunityExitDialogFragment A03(AnonymousClass147 r4, Collection collection) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("parent_jid", r4.getRawString());
        ArrayList A14 = C36441kJ.A14(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3QK.A00(A14, it);
        }
        A072.putStringArrayList("subgroup_jids", AnonymousClass143.A07(A14));
        CommunityExitDialogFragment communityExitDialogFragment = new CommunityExitDialogFragment();
        communityExitDialogFragment.A17(A072);
        return communityExitDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        DialogInterface.OnClickListener r1;
        AnonymousClass147 A062 = AnonymousClass147.A01.A06(A0b().getString("parent_jid"));
        C18740tg.A06(A062);
        this.A04 = A062;
        ArrayList A1F = C36431kI.A1F(A0b(), AnonymousClass147.class, "subgroup_jids");
        C39001qm A052 = AnonymousClass3LW.A05(this);
        if (this.A03.A0I(this.A04)) {
            A052.A0Z(A0n(R.string.f12nameremoved));
            A052.setNegativeButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 47));
            i = R.string.f12nameremoved;
            r1 = AnonymousClass4XL.A00(this, 48);
        } else {
            C39971uO r5 = (C39971uO) AnonymousClass4ZG.A00(A0i(), this.A04, this.A01, 2).A00(C39971uO.class);
            String A0U = this.A02.A0U(this.A04);
            int i2 = R.string.f12nameremoved;
            if (A0U == null) {
                i2 = R.string.f12nameremoved;
            }
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = A0U;
            String A0q = C36401kF.A0q(this, "learn-more", A0M, 1, i2);
            View A0D = C36421kH.A0D(A1D(), R.layout.f9nameremoved);
            TextView A0O = C36391kE.A0O(A0D, R.id.dialog_text_message);
            A0O.setText(this.A07.A02(A0O.getContext(), new C81323wp((Object) this, 25), A0q, "learn-more"));
            C36331k8.A10(A0O, this.A02);
            A052.setView(A0D);
            Resources A0G = C36341k9.A0G(this);
            int size = A1F.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, A1F.size(), 0);
            A052.setTitle(A0G.getQuantityString(R.plurals.f10nameremoved, size, objArr));
            A052.setNegativeButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 46));
            i = R.string.f12nameremoved;
            r1 = new AnonymousClass4XI(A1F, r5, this, 4);
        }
        A052.setPositiveButton(i, r1);
        return A052.create();
    }
}
