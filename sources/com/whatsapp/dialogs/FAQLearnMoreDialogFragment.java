package com.whatsapp.dialogs;

import X.AnonymousClass0FM;
import X.AnonymousClass1H2;
import X.AnonymousClass3LW;
import X.AnonymousClass3UG;
import X.AnonymousClass4X9;
import X.C20380xT;
import X.C24801Dv;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class FAQLearnMoreDialogFragment extends Hilt_FAQLearnMoreDialogFragment {
    public C24801Dv A00;
    public AnonymousClass1H2 A01;
    public C20380xT A02;

    public static AnonymousClass0FM A05(Context context, C24801Dv r11, AnonymousClass1H2 r12, C20380xT r13, CharSequence charSequence, String str, String str2, String str3) {
        AnonymousClass4X9 r3 = new AnonymousClass4X9(context, r11, r13, str, str3, 0);
        C39001qm A002 = AnonymousClass3LW.A00(context);
        C39001qm.A09(A002, AnonymousClass3UG.A05(context, r12, charSequence));
        A002.A0g(r3, R.string.f12nameremoved);
        A002.setNegativeButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        String str4 = str2;
        if (str2 != null) {
            A002.setTitle(AnonymousClass3UG.A05(context, r12, str4));
        }
        return A002.create();
    }

    public Dialog A1a(Bundle bundle) {
        String A17;
        String str;
        A0b();
        String A172 = C36431kI.A17(A0b(), "faq_id");
        if (this.A0A.containsKey("message_string_res_id")) {
            A17 = A0n(this.A0A.getInt("message_string_res_id"));
        } else {
            A17 = C36431kI.A17(A0b(), "message_text");
        }
        String str2 = null;
        if (this.A0A.containsKey("title_string_res_id")) {
            str = A0n(this.A0A.getInt("title_string_res_id"));
        } else {
            str = null;
        }
        if (this.A0A.containsKey("faq_section_name")) {
            str2 = this.A0A.getString("faq_section_name");
        }
        return A05(A0a(), this.A00, this.A01, this.A02, A17, A172, str, str2);
    }
}
