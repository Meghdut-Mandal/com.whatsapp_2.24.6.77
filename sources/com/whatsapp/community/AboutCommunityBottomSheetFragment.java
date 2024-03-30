package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass4ZG;
import X.C012005e;
import X.C16550pQ;
import X.C19740wR;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C28431Sq;
import X.C32681e1;
import X.C33511fU;
import X.C36331k8;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C39521sa;
import X.C48892iE;
import X.C58152zP;
import X.C65533Sl;
import X.C66933Xw;
import X.C80983wH;
import X.C80993wI;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class AboutCommunityBottomSheetFragment extends Hilt_AboutCommunityBottomSheetFragment implements C16550pQ {
    public C58152zP A00;
    public C28431Sq A01;
    public C21060yb A02;
    public C20810yC A03;
    public AnonymousClass147 A04;
    public C20380xT A05;
    public C32681e1 A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String string = A0b().getString("EXTRA_PARENT_GROUP_JID");
        try {
            C65533Sl r0 = AnonymousClass147.A01;
            AnonymousClass147 A042 = C65533Sl.A04(string);
            this.A04 = A042;
            C58152zP r1 = this.A00;
            AnonymousClass00C.A0D(r1, 1);
            C39521sa r02 = (C39521sa) AnonymousClass4ZG.A00(this, A042, r1, 1).A00(C39521sa.class);
            r02.A01.A00("community_home", r02.A00);
        } catch (C19740wR e) {
            throw new RuntimeException(e);
        }
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C66933Xw.A00(C012005e.A02(view, R.id.bottom_sheet_close_button), this, 30);
        C33511fU.A03(C36391kE.A0O(view, R.id.about_community_title));
        TextEmojiLabel A0O = C36401kF.A0O(view, R.id.about_community_description);
        if (this.A03.A0E(2356)) {
            A0O.setText(R.string.f12nameremoved);
        } else {
            String[] strArr = {this.A05.A03("570221114584995").toString()};
            SpannableString A012 = this.A06.A01(A0O.getContext(), C36401kF.A0q(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), new Runnable[]{C80983wH.A00}, new String[]{"learn-more"}, strArr);
            C36331k8.A16(A0O, this.A02);
            C36331k8.A1A(this.A03, A0O);
            A0O.setText(A012);
        }
        TextEmojiLabel A0O2 = C36401kF.A0O(view, R.id.additional_community_description);
        if (this.A03.A0E(2356)) {
            String[] strArr2 = {this.A05.A03("812356880201038").toString()};
            SpannableString A013 = this.A06.A01(A0O2.getContext(), C36401kF.A0q(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), new Runnable[]{C80993wI.A00}, new String[]{"learn-more"}, strArr2);
            C36331k8.A16(A0O2, this.A02);
            C36331k8.A1A(this.A03, A0O2);
            A0O2.setText(A013);
        } else {
            A0O2.setText(R.string.f12nameremoved);
        }
        C48892iE.A00(C012005e.A02(view, R.id.about_community_join_button), this, 42);
    }
}
