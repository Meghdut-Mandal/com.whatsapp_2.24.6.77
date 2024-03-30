package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass1N3;
import X.AnonymousClass4J5;
import X.C16550pQ;
import X.C20810yC;
import X.C32681e1;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36411kG;
import X.C39851tw;
import X.C48912iG;
import X.C53822rw;
import X.C66933Xw;
import X.C81003wJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class NewCommunityAdminBottomSheetFragment extends Hilt_NewCommunityAdminBottomSheetFragment implements C16550pQ {
    public AnonymousClass1N3 A00;
    public C39851tw A01;
    public C20810yC A02;
    public C32681e1 A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        AnonymousClass147 r1 = (AnonymousClass147) A0b().getParcelable("parent_group_jid");
        if (r1 != null) {
            C39851tw r0 = this.A01;
            if (r0 != null) {
                r0.A00 = r1;
                return C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
            }
            throw C36331k8.A0a();
        }
        Log.e("NewCommunityAdminBottomSheetFragment/onCreateView parent jid was null");
        A1b();
        return null;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C66933Xw.A00(C36361kB.A0G(view, R.id.bottom_sheet_close_button), this, 42);
        C33511fU.A03(C36341k9.A0M(view, R.id.newCommunityAdminNux_title));
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.newCommunityAdminNux_description);
        C20810yC r0 = this.A02;
        if (r0 != null) {
            C36331k8.A1A(r0, A0O);
            C32681e1 r6 = this.A03;
            if (r6 != null) {
                Context A1D = A1D();
                String A0q = C36401kF.A0q(this, "learn-more", new Object[1], 0, R.string.f12nameremoved);
                String[] strArr = {"learn-more"};
                String[] strArr2 = new String[1];
                AnonymousClass1N3 r1 = this.A00;
                if (r1 != null) {
                    strArr2[0] = r1.A00("https://www.whatsapp.com/communities/learning").toString();
                    A0O.setText(r6.A01(A1D, A0q, new Runnable[]{C81003wJ.A00}, strArr, strArr2));
                    C48912iG.A00(C36361kB.A0G(view, R.id.newCommunityAdminNux_continueButton), this, 8);
                    C48912iG.A00(C36361kB.A0G(view, R.id.newCommunityAdminNux_removeAsAdminButton), this, 9);
                    return;
                }
                throw C36331k8.A0d("waLinkFactory");
            }
            throw C36331k8.A0b();
        }
        throw C36321k7.A07();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C39851tw r0 = this.A01;
        if (r0 != null) {
            C53822rw.A01(this, r0.A01, new AnonymousClass4J5(this), 29);
            return;
        }
        throw C36331k8.A0a();
    }
}
