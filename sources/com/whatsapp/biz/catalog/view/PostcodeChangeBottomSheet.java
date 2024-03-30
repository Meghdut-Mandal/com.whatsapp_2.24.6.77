package com.whatsapp.biz.catalog.view;

import X.AnonymousClass14B;
import X.AnonymousClass17Y;
import X.AnonymousClass1N2;
import X.AnonymousClass3L0;
import X.BA2;
import X.BA6;
import X.C012005e;
import X.C115895jc;
import X.C16550pQ;
import X.C165617ti;
import X.C167767ym;
import X.C207829xB;
import X.C20810yC;
import X.C21060yb;
import X.C23026B0w;
import X.C32691e2;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import X.C90514aH;
import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

public class PostcodeChangeBottomSheet extends Hilt_PostcodeChangeBottomSheet implements C16550pQ {
    public C115895jc A00;
    public AnonymousClass17Y A01;
    public C32691e2 A02;
    public TextEmojiLabel A03;
    public WaEditText A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public C167767ym A08;
    public C21060yb A09;
    public C20810yC A0A;
    public UserJid A0B = null;
    public AnonymousClass1N2 A0C;
    public String A0D = "";
    public String A0E = "pincode";
    public LinearLayout A0F;
    public final C23026B0w A0G;
    public final boolean A0H;

    public static void A03(PostcodeChangeBottomSheet postcodeChangeBottomSheet) {
        C167767ym r3 = postcodeChangeBottomSheet.A08;
        if (r3 != null) {
            String str = postcodeChangeBottomSheet.A0D;
            String str2 = postcodeChangeBottomSheet.A0E;
            UserJid userJid = postcodeChangeBottomSheet.A0B;
            r3.A02 = C167767ym.A02(str);
            if (str2 == null) {
                str2 = "pincode";
            }
            r3.A03 = str2;
            r3.A00 = userJid;
            String str3 = null;
            if (userJid != null) {
                AnonymousClass3L0 A012 = r3.A07.A01(userJid);
                if (A012 != null) {
                    str3 = A012.A08;
                }
                if (AnonymousClass14B.A0F(str3)) {
                    str3 = r3.A08.A0H(r3.A06.A0D(userJid));
                }
            }
            r3.A01 = str3;
            C167767ym.A03(r3);
        }
    }

    public void A1H() {
        this.A0G.Bd7();
        super.A1H();
    }

    public void A1p() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            waEditText.clearFocus();
        }
        LinearLayout linearLayout = this.A0F;
        if (linearLayout != null && AnonymousClass1N2.A00(linearLayout)) {
            this.A0C.A01(this.A0F);
        }
        A1b();
    }

    public void A1q() {
        this.A03.setVisibility(8);
        this.A05.setVisibility(0);
        this.A04.getBackground().setColorFilter(C36341k9.A0G(this).getColor(R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP);
    }

    public PostcodeChangeBottomSheet(C23026B0w b0w, boolean z) {
        this.A0G = b0w;
        this.A0H = z;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        Dialog dialog = this.A02;
        if (!(!this.A0H || dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setSoftInputMode(21);
        }
        this.A0F = C90514aH.A0U(view, R.id.dc_postcode_bottom_sheet);
        this.A06 = C36401kF.A0Q(view, R.id.change_postcode_header);
        this.A07 = C36401kF.A0Q(view, R.id.change_postcode_message);
        this.A04 = (WaEditText) C012005e.A02(view, R.id.change_postcode_edit_text);
        this.A03 = C36401kF.A0O(view, R.id.change_postcode_privacy_message);
        this.A05 = C36401kF.A0Q(view, R.id.change_postcode_invalid_message);
        C36331k8.A1A(this.A0A, this.A03);
        C36331k8.A16(this.A03, this.A09);
        this.A03.setLinksClickable(true);
        this.A03.setFocusable(false);
        C167767ym r0 = (C167767ym) C165617ti.A0A(new C207829xB(this.A00), this).A00(C167767ym.class);
        this.A08 = r0;
        BA6.A00(this, r0.A04, 30);
        BA6.A00(this, this.A08.A0A, 31);
        A03(this);
        this.A04.addTextChangedListener(new BA2(this, 0));
        C36421kH.A10(C012005e.A02(view, R.id.postcode_button_cancel), this, 37);
        C36421kH.A10(C012005e.A02(view, R.id.postcode_button_enter), this, 38);
        if (A1o()) {
            view.setBackground((Drawable) null);
        }
    }
}
