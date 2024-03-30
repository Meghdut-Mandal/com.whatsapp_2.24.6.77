package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C16550pQ;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C36321k7;
import X.C36361kB;
import X.C36401kF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class BusinessAPINUXBottomSheet extends Hilt_BusinessAPINUXBottomSheet implements C16550pQ {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21060yb A02;
    public C20810yC A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C012005e.A0F(AnonymousClass00F.A04(A0a(), R.color.f6nameremoved), A0E);
        View A022 = C012005e.A02(A0E, R.id.btn_continue);
        TextEmojiLabel A0O = C36401kF.A0O(A0E, R.id.nux_privacy_policy);
        Uri parse = Uri.parse("https://faq.whatsapp.com/530309022405692/");
        C20810yC r10 = this.A03;
        AnonymousClass17Y r7 = this.A01;
        String string = A0E.getContext().getString(R.string.f12nameremoved);
        C24801Dv r6 = this.A00;
        C21060yb r9 = this.A02;
        AnonymousClass00C.A0D(parse, 0);
        C36321k7.A19(r10, r7, string, A0O);
        C36321k7.A10(r6, r9);
        AnonymousClass6YV.A0E(A0O.getContext(), parse, r6, r7, A0O, r9, r10, string, "learn-more");
        C36361kB.A18(C012005e.A02(A0E, R.id.nux_close_button), this, 24);
        C36361kB.A18(A022, this, 25);
        return A0E;
    }

    public void A1n(View view) {
        super.A1n(view);
        BottomSheetBehavior.A02(view).A0d(true);
    }
}
