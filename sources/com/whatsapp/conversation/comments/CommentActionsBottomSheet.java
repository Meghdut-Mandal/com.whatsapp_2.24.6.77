package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass12O;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17V;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1AW;
import X.AnonymousClass1CF;
import X.AnonymousClass1DW;
import X.AnonymousClass1EL;
import X.AnonymousClass1EO;
import X.AnonymousClass1H2;
import X.AnonymousClass1X4;
import X.AnonymousClass3O0;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass3YF;
import X.AnonymousClass4AV;
import X.C005502l;
import X.C18820ts;
import X.C19420v0;
import X.C19460v5;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C220412q;
import X.C222813r;
import X.C235618y;
import X.C236419g;
import X.C25791Hr;
import X.C28371Sj;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C64933Qa;
import X.C66953Xy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class CommentActionsBottomSheet extends Hilt_CommentActionsBottomSheet {
    public C19460v5 A00;
    public AnonymousClass17Y A01;
    public ListItemWithLeftIcon A02;
    public ListItemWithLeftIcon A03;
    public ListItemWithLeftIcon A04;
    public ListItemWithLeftIcon A05;
    public C19730wQ A06;
    public AnonymousClass1X4 A07;
    public C25791Hr A08;
    public AnonymousClass16D A09;
    public AnonymousClass185 A0A;
    public AnonymousClass171 A0B;
    public C235618y A0C;
    public C21060yb A0D;
    public C19970wo A0E;
    public C19420v0 A0F;
    public C18820ts A0G;
    public C220412q A0H;
    public AnonymousClass17X A0I;
    public AnonymousClass12O A0J;
    public C236419g A0K;
    public AnonymousClass1DW A0L;
    public AnonymousClass1H2 A0M;
    public C20810yC A0N;
    public C21010yW A0O;
    public AnonymousClass17V A0P;
    public AnonymousClass1EL A0Q;
    public AnonymousClass1CF A0R;
    public C28371Sj A0S;
    public AnonymousClass3O0 A0T;
    public C19890wg A0U;
    public AnonymousClass3T1 A0V;
    public AnonymousClass1AW A0W;
    public AnonymousClass1EO A0X;
    public AnonymousClass1A1 A0Y;
    public C19770wU A0Z;
    public C005502l A0a;
    public C005502l A0b;
    public final AnonymousClass00T A0c = C36431kI.A1I(new AnonymousClass4AV(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        C64933Qa A032;
        ListItemWithLeftIcon listItemWithLeftIcon;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (!(bundle2 == null || (A032 = AnonymousClass3UJ.A03(bundle2, "")) == null)) {
            AnonymousClass1A1 r0 = this.A0Y;
            if (r0 != null) {
                AnonymousClass3T1 A033 = r0.A03(A032);
                if (A033 != null) {
                    this.A0V = A033;
                    this.A05 = (ListItemWithLeftIcon) view.findViewById(R.id.view_security_code_btn);
                    this.A04 = (ListItemWithLeftIcon) view.findViewById(R.id.report_comment_btn);
                    this.A03 = (ListItemWithLeftIcon) view.findViewById(R.id.delete_comment_btn);
                    this.A02 = (ListItemWithLeftIcon) view.findViewById(R.id.copy_comment_btn);
                    AnonymousClass3T1 r02 = this.A0V;
                    if (r02 == null) {
                        throw C36331k8.A0d("message");
                    }
                    boolean z = r02.A1J.A02;
                    ListItemWithLeftIcon listItemWithLeftIcon2 = this.A05;
                    if (z) {
                        C36331k8.A0y(listItemWithLeftIcon2);
                    } else {
                        C36361kB.A14(listItemWithLeftIcon2);
                        C222813r r03 = UserJid.Companion;
                        AnonymousClass3T1 r04 = this.A0V;
                        if (r04 == null) {
                            throw C36331k8.A0d("message");
                        }
                        UserJid A002 = C222813r.A00(r04.A0J());
                        if (!(A002 == null || (listItemWithLeftIcon = this.A05) == null)) {
                            AnonymousClass3YF.A00(listItemWithLeftIcon, this, A002, 6);
                        }
                    }
                    AnonymousClass3T1 r05 = this.A0V;
                    if (r05 == null) {
                        throw C36331k8.A0d("message");
                    }
                    boolean z2 = r05.A1J.A02;
                    ListItemWithLeftIcon listItemWithLeftIcon3 = this.A04;
                    if (z2) {
                        C36331k8.A0y(listItemWithLeftIcon3);
                    } else {
                        C36361kB.A14(listItemWithLeftIcon3);
                        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A04;
                        if (listItemWithLeftIcon4 != null) {
                            C66953Xy.A00(listItemWithLeftIcon4, this, 20);
                        }
                    }
                    ListItemWithLeftIcon listItemWithLeftIcon5 = this.A03;
                    if (listItemWithLeftIcon5 != null) {
                        C66953Xy.A00(listItemWithLeftIcon5, this, 19);
                    }
                    ListItemWithLeftIcon listItemWithLeftIcon6 = this.A02;
                    if (listItemWithLeftIcon6 != null) {
                        C66953Xy.A00(listItemWithLeftIcon6, this, 21);
                        return;
                    }
                    return;
                }
            } else {
                throw C36331k8.A0d("fMessageDatabase");
            }
        }
        A1b();
    }

    public void A1H() {
        super.A1H();
        ListItemWithLeftIcon listItemWithLeftIcon = this.A03;
        if (listItemWithLeftIcon != null) {
            listItemWithLeftIcon.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
    }
}
