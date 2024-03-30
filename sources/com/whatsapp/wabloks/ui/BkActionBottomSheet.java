package com.whatsapp.wabloks.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass60P;
import X.AnonymousClass6EW;
import X.AnonymousClass6S9;
import X.C131376Ou;
import X.C131616Pt;
import X.C140456lc;
import X.C149086zu;
import X.C158057fj;
import X.C162977pS;
import X.C36381kD;
import X.C36391kE;
import X.C48902iF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;
import java.util.Map;

public class BkActionBottomSheet extends Hilt_BkActionBottomSheet {
    public AnonymousClass60P A00;
    public C131376Ou A01;
    public AnonymousClass005 A02;
    public Map A03;
    public AnonymousClass6EW A04;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass6EW A012 = this.A01.A01(A0a());
        this.A04 = A012;
        AnonymousClass6EW.A00(A012, C149086zu.class, this, 16);
        Bundle A0b = A0b();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        TextView A0P = C36391kE.A0P(viewGroup2, R.id.bloks_action_sheet_title);
        TextView A0P2 = C36391kE.A0P(viewGroup2, R.id.bloks_action_sheet_description);
        String string = A0b.getString("action_sheet_title", "");
        String string2 = A0b.getString("action_sheet_message", "");
        if (!TextUtils.isEmpty(string)) {
            A0P.setVisibility(0);
            A0P.setText(A0b.getString("action_sheet_title"));
        }
        if (!TextUtils.isEmpty(string2)) {
            A0P2.setVisibility(0);
            A0P2.setText(A0b.getString("action_sheet_message"));
        }
        if (A0b.getBoolean("action_sheet_has_buttons")) {
            boolean z = A0b.getBoolean("action_sheet_has_buttons", false);
            String string3 = A0b.getString("action_sheet_buttons", "");
            if (z) {
                AnonymousClass00C.A0D(string3, 0);
                List<C158057fj> list = (List) ((C131616Pt) this.A02.get()).A01(new C162977pS(string3, 0), "action_sheet_buttons");
                if (list != null) {
                    for (C158057fj r2 : list) {
                        TextView textView = (TextView) layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
                        textView.setText(C140456lc.A0K(r2.B7w()));
                        C48902iF.A00(textView, this, r2, 39);
                        viewGroup2.addView(textView);
                    }
                }
            }
            A1b();
        }
        return viewGroup2;
    }

    public static BkActionBottomSheet A03(C131616Pt r5, String str, String str2, List list) {
        Bundle A07 = AnonymousClass001.A07();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("action_sheet_buttons");
        String A10 = C36381kD.A10(A0u, list.hashCode());
        A07.putString("action_sheet_buttons", A10);
        A07.putString("action_sheet_title", str);
        A07.putString("action_sheet_message", str2);
        A07.putBoolean("action_sheet_has_buttons", true);
        AnonymousClass00C.A0D(A10, 0);
        r5.A02(new C162977pS(A10, 0), new AnonymousClass6S9(list), "action_sheet_buttons");
        BkActionBottomSheet bkActionBottomSheet = new BkActionBottomSheet();
        bkActionBottomSheet.A17(A07);
        return bkActionBottomSheet;
    }
}
