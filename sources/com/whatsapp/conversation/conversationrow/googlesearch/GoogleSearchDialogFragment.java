package com.whatsapp.conversation.conversationrow.googlesearch;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass17Y;
import X.AnonymousClass2bV;
import X.AnonymousClass3LW;
import X.AnonymousClass3T1;
import X.C163297py;
import X.C18740tg;
import X.C19770wU;
import X.C20050ww;
import X.C21010yW;
import X.C21100yf;
import X.C225314u;
import X.C24801Dv;
import X.C39001qm;
import X.C46882bp;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class GoogleSearchDialogFragment extends Hilt_GoogleSearchDialogFragment {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21100yf A02;
    public C20050ww A03;
    public C21010yW A04;
    public C19770wU A05;

    public static void A03(C225314u r4, C21100yf r5, AnonymousClass3T1 r6) {
        if (!(r6 instanceof C46882bp) && (r6 instanceof AnonymousClass2bV) && r5.A09(C21100yf.A0q)) {
            String A0b = r6.A0b();
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("search_query_type", 0);
            A07.putString("search_query_text", A0b);
            GoogleSearchDialogFragment googleSearchDialogFragment = new GoogleSearchDialogFragment();
            googleSearchDialogFragment.A17(A07);
            r4.Btm(googleSearchDialogFragment);
        }
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (!(C24801Dv.A00(context) instanceof C225314u)) {
            C18740tg.A0D(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
        }
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        C163297py r1 = new C163297py(this, 24);
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.setPositiveButton(R.string.f12nameremoved, r1);
        A002.setNegativeButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        A002.A0K(R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
