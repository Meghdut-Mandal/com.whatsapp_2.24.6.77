package com.whatsapp.community.deactivate;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.C18740tg;
import X.C33511fU;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C65533Sl;
import X.C87154Nr;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class DeactivateCommunityConfirmationFragment extends Hilt_DeactivateCommunityConfirmationFragment {
    public C87154Nr A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        C18740tg.A06(context);
        this.A00 = (C87154Nr) context;
    }

    public void A1M() {
        super.A1M();
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass0FM) {
            Button button = ((AnonymousClass0FM) dialog).A00.A0H;
            C36331k8.A0r(button.getContext(), button, R.color.f6nameremoved);
        }
    }

    public Dialog A1a(Bundle bundle) {
        String A17 = C36431kI.A17(A0b(), "parent_group_jid");
        AnonymousClass00C.A08(A17);
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 A04 = C65533Sl.A04(A17);
        AnonymousClass16D r02 = this.A01;
        if (r02 != null) {
            AnonymousClass141 A0D = r02.A0D(A04);
            AnonymousClass01I A0i = A0i();
            View A0K = C36381kD.A0K(LayoutInflater.from(A0i), R.layout.f9nameremoved);
            Object[] objArr = new Object[1];
            AnonymousClass171 r03 = this.A02;
            if (r03 != null) {
                String A0x = C36351kA.A0x(A0i, r03.A0H(A0D), objArr, 0, R.string.f12nameremoved);
                Object[] objArr2 = new Object[1];
                AnonymousClass171 r04 = this.A02;
                if (r04 != null) {
                    Spanned fromHtml = Html.fromHtml(C36391kE.A0v(A0i, Html.escapeHtml(r04.A0H(A0D)), objArr2, 0, R.string.f12nameremoved));
                    AnonymousClass00C.A08(fromHtml);
                    TextEmojiLabel A0O = C36351kA.A0O(A0K, R.id.deactivate_community_confirm_dialog_title);
                    A0O.A0I(A0x);
                    C33511fU.A03(A0O);
                    C36401kF.A0O(A0K, R.id.deactivate_community_confirm_dialog_message).A0I(fromHtml);
                    C39001qm A002 = AnonymousClass3LW.A00(A0i);
                    A002.A0j(A0K);
                    A002.A0r(true);
                    C39001qm.A0E(A002, this, 2, R.string.f12nameremoved);
                    C39001qm.A0H(A002, this, 1, R.string.f12nameremoved);
                    return C36371kC.A0O(A002);
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0c();
        }
        throw C36331k8.A0Z();
    }
}
