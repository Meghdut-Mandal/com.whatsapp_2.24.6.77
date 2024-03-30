package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass088;
import X.C33521fV;
import X.C36391kE;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class PnhBottomSheet extends RoundedBottomSheetDialogFragment implements View.OnClickListener {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r4, android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            if (r0 != 0) goto L_0x001a
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet
            if (r0 == 0) goto L_0x0025
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = (com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet) r1
            boolean r1 = r1.A04
        L_0x0015:
            r0 = 2131626208(0x7f0e08e0, float:1.8879646E38)
            if (r1 == 0) goto L_0x001d
        L_0x001a:
            r0 = 2131625844(0x7f0e0774, float:1.8878907E38)
        L_0x001d:
            android.view.View r0 = r5.inflate(r0, r6, r2)
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x0025:
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.PnhBottomSheet.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A00 = view.findViewById(R.id.share_pn_close_button);
        this.A05 = C36391kE.A0P(view, R.id.share_pn_title);
        this.A04 = C36391kE.A0P(view, R.id.share_pn_text);
        this.A01 = C36391kE.A0P(view, R.id.share_pn_cta_negative);
        this.A03 = C36391kE.A0P(view, R.id.share_pn_cta_positive);
        TextView A0P = C36391kE.A0P(view, R.id.share_pn_own_number);
        A0P.setTextDirection(3);
        AnonymousClass088.A07(A0P, 8, 24, 2, 2);
        this.A02 = A0P;
        View view2 = this.A00;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.A05;
        AnonymousClass00C.A0E(textView3, "null cannot be cast to non-null type android.view.View");
        C33521fV.A07(textView3, true);
    }

    public void A1J() {
        super.A1J();
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
