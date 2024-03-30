package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass1NG;
import X.AnonymousClass1X4;
import X.AnonymousClass2bE;
import X.AnonymousClass3TE;
import X.AnonymousClass49E;
import X.AnonymousClass4FH;
import X.AnonymousClass4X2;
import X.C000800j;
import X.C001400p;
import X.C19970wo;
import X.C20810yC;
import X.C222813r;
import X.C223313w;
import X.C32681e1;
import X.C35621iz;
import X.C36331k8;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C53472rN;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public final class SharePhoneNumberBottomSheet extends Hilt_SharePhoneNumberBottomSheet {
    public AnonymousClass1NG A00;
    public C20810yC A01;
    public C32681e1 A02;
    public final AnonymousClass00T A03 = AnonymousClass3TE.A02(this, "arg_entry_point", 6);
    public final AnonymousClass00T A04 = C001400p.A00(C000800j.NONE, new AnonymousClass4FH(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass49E(this));

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 == 5) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r5 = 0
            X.AnonymousClass00C.A0D(r9, r5)
            super.A1S(r8, r9)
            android.widget.TextView r1 = r7.A02
            if (r1 == 0) goto L_0x0011
            r0 = 2131894350(0x7f12204e, float:1.9423502E38)
            r1.setText(r0)
        L_0x0011:
            android.widget.TextView r2 = r7.A05
            r4 = 5
            r6 = 4
            r3 = 3
            if (r2 == 0) goto L_0x002d
            X.00T r0 = r7.A03
            int r1 = X.C36331k8.A02(r0)
            if (r1 == r3) goto L_0x0027
            if (r1 == r6) goto L_0x0027
            r0 = 2131894349(0x7f12204d, float:1.94235E38)
            if (r1 != r4) goto L_0x002a
        L_0x0027:
            r0 = 2131894348(0x7f12204c, float:1.9423498E38)
        L_0x002a:
            r2.setText(r0)
        L_0x002d:
            android.widget.TextView r2 = r7.A04
            if (r2 == 0) goto L_0x0046
            X.00T r0 = r7.A03
            int r1 = X.C36331k8.A02(r0)
            if (r1 == r3) goto L_0x008e
            if (r1 == r6) goto L_0x008e
            r0 = 2131894345(0x7f122049, float:1.9423492E38)
            if (r1 == r4) goto L_0x0043
            r0 = 2131894347(0x7f12204b, float:1.9423496E38)
        L_0x0043:
            r2.setText(r0)
        L_0x0046:
            android.widget.TextView r1 = r7.A01
            if (r1 == 0) goto L_0x0050
            r0 = 2131894343(0x7f122047, float:1.9423488E38)
            r1.setText(r0)
        L_0x0050:
            android.widget.TextView r1 = r7.A03
            if (r1 == 0) goto L_0x005a
            r0 = 2131894344(0x7f122048, float:1.942349E38)
            r1.setText(r0)
        L_0x005a:
            X.00T r0 = r7.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.chatinfo.SharePhoneNumberViewModel r4 = (com.whatsapp.chatinfo.SharePhoneNumberViewModel) r4
            X.00T r0 = r7.A04
            com.whatsapp.jid.Jid r2 = X.C36441kJ.A0m(r0)
            X.00T r0 = r7.A03
            int r1 = X.C36331k8.A02(r0)
            X.AnonymousClass00C.A0D(r2, r5)
            X.00s r3 = r4.A00
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x007e
            X.1FX r0 = r4.A02
            X.13w r2 = (X.C223313w) r2
            r0.A00(r2, r6, r1, r5)
        L_0x007e:
            X.4In r2 = new X.4In
            r2.<init>(r7)
            r1 = 23
            X.2ub r0 = new X.2ub
            r0.<init>(r2, r1)
            r3.A08(r7, r0)
            return
        L_0x008e:
            r0 = 2131894346(0x7f12204a, float:1.9423494E38)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        AnonymousClass00C.A0D(view, 0);
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_negative)) {
            if (id == R.id.share_pn_cta_positive) {
                AnonymousClass01I A0h = A0h();
                AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type android.app.Activity");
                AnonymousClass1NG r2 = this.A00;
                if (r2 != null) {
                    C222813r r0 = UserJid.Companion;
                    AnonymousClass00T r1 = this.A04;
                    if (r2.A0O(C222813r.A00(C36441kJ.A0m(r1)))) {
                        A1c();
                        C36401kF.A0L(A0h).Btm(UnblockDialogFragment.A03(new C53472rN(A0h, new AnonymousClass4X2(A0h, this, 0), this, 1), A0n(R.string.f12nameremoved), 0, false));
                        return;
                    } else if (r1.getValue() instanceof C223313w) {
                        r1.getValue();
                        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
                        Jid A0m = C36441kJ.A0m(r1);
                        int A022 = C36331k8.A02(this.A03);
                        AnonymousClass00C.A0D(A0m, 0);
                        if (A0m instanceof C223313w) {
                            AnonymousClass1X4 r8 = sharePhoneNumberViewModel.A01;
                            C223313w r7 = (C223313w) A0m;
                            r8.A0X.A0h(new AnonymousClass2bE(C36411kG.A0o(r7, r8.A11), C19970wo.A00(r8.A0K)));
                            r8.A1J.Boy(new C35621iz(r8, r7, 18));
                            sharePhoneNumberViewModel.A02.A00(r7, 6, A022, false);
                        }
                    } else {
                        return;
                    }
                } else {
                    throw C36331k8.A0d("blockListManager");
                }
            } else {
                return;
            }
        }
        A1c();
    }

    public void A1J() {
        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
        Jid A0m = C36441kJ.A0m(this.A04);
        int A022 = C36331k8.A02(this.A03);
        AnonymousClass00C.A0D(A0m, 0);
        if (A0m instanceof C223313w) {
            sharePhoneNumberViewModel.A02.A00((C223313w) A0m, 5, A022, false);
        }
        super.A1J();
    }
}
