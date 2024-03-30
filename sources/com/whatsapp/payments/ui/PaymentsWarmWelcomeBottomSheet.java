package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.AnonymousClass6ZA;
import X.AnonymousClass9v3;
import X.B94;
import X.C012005e;
import X.C178648gs;
import X.C19630wG;
import X.C20810yC;
import X.C21060yb;
import X.C22984Aza;
import X.C22985Azb;
import X.C23075B3f;
import X.C24801Dv;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class PaymentsWarmWelcomeBottomSheet extends Hilt_PaymentsWarmWelcomeBottomSheet {
    public C23075B3f A00;
    public C22984Aza A01;
    public C22985Azb A02;
    public final AnonymousClass6ZA A03 = new AnonymousClass6ZA();

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        C20810yC r5;
        AnonymousClass17Y r4;
        C24801Dv r3;
        C21060yb r2;
        String str;
        String A022;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        if (A0b().containsKey("bundle_key_title")) {
            C36391kE.A0O(view2, R.id.payments_warm_welcome_bottom_sheet_title).setText(A0b().getInt("bundle_key_title"));
        }
        String string = A0b().getString("referral_screen");
        String string2 = A0b().getString("bundle_screen_name");
        ImageView A0G = C36401kF.A0G(view2, R.id.payments_warm_welcome_bottom_sheet_image);
        int i = 8;
        if (A0b().containsKey("bundle_key_image")) {
            A0G.setImageResource(A0b().getInt("bundle_key_image"));
        } else {
            A0G.setVisibility(8);
        }
        if (A0b().containsKey("bundle_key_headline")) {
            C36391kE.A0O(view2, R.id.payments_warm_welcome_bottom_sheet_textview_headline).setText(A0b().getInt("bundle_key_headline"));
        }
        TextEmojiLabel A0O = C36351kA.A0O(view2, R.id.payments_warm_welcome_bottom_sheet_textview_body);
        if (A0b().containsKey("bundle_key_body")) {
            A0O.setText(A0b().getInt("bundle_key_body"));
        }
        C22985Azb azb = this.A02;
        if (azb != null) {
            B94 b94 = (B94) azb;
            int i2 = b94.A01;
            Context context = A0O.getContext();
            if (i2 != 0) {
                AnonymousClass155 r14 = (AnonymousClass155) b94.A00;
                r5 = r14.A0D;
                r4 = r14.A05;
                r3 = r14.A01;
                r2 = r14.A08;
                str = "learn-more";
                A022 = C36391kE.A0v(r14, str, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            } else {
                C178648gs r0 = (C178648gs) b94.A00;
                r5 = r0.A0B;
                r4 = r0.A02;
                r3 = r0.A01;
                r2 = r0.A07;
                C19630wG r142 = r0.A04;
                Object[] A0L = AnonymousClass001.A0L();
                str = "learn-more";
                A0L[0] = str;
                A022 = r142.A02(R.string.f12nameremoved, A0L);
            }
            C21060yb r20 = r2;
            TextEmojiLabel textEmojiLabel = A0O;
            AnonymousClass17Y r18 = r4;
            C24801Dv r17 = r3;
            AnonymousClass6YV.A0E(context, Uri.parse("https://faq.whatsapp.com/1516690435411169/?cms_platform=android&country=BR"), r17, r18, textEmojiLabel, r20, r5, A022, str);
        }
        View A023 = C012005e.A02(view2, R.id.payments_warm_welcome_bottom_sheet_header_group);
        if (this.A02 == null) {
            i = 0;
        }
        A023.setVisibility(i);
        C012005e.A02(view2, R.id.payments_warm_welcome_bottom_sheet_textview_button_primary).setOnClickListener(new AnonymousClass9v3(this, string2, string));
        C36421kH.A13(C012005e.A02(view2, R.id.payments_warm_welcome_bottom_sheet_close_image), this, 43);
        C23075B3f b3f = this.A00;
        if (b3f != null) {
            if (string2 == null) {
                string2 = "";
            }
            b3f.BOm(0, (Integer) null, string2, string);
            return;
        }
        throw C36331k8.A0d("paymentUIEventLogger");
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        this.A03.onDismiss(dialogInterface);
    }
}
