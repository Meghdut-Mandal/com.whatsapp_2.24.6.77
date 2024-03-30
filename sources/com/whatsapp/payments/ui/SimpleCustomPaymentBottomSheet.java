package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass1FR;
import X.AnonymousClass1RJ;
import X.AnonymousClass3QI;
import X.C202159l8;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C48752hz;
import X.C48762i0;
import X.C65723Tf;
import X.C89254Vv;
import X.C90464aC;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

public abstract class SimpleCustomPaymentBottomSheet extends Hilt_SimpleCustomPaymentBottomSheet {
    public View A1p() {
        int i;
        if (this instanceof PaymentCustomInstructionsBottomSheet) {
            PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this;
            View inflate = LayoutInflater.from(paymentCustomInstructionsBottomSheet.A0a()).inflate(R.layout.f9nameremoved, new FrameLayout(paymentCustomInstructionsBottomSheet.A0a()));
            View findViewById = inflate.findViewById(R.id.close);
            TextView A0P = C36391kE.A0P(inflate, R.id.payment_instruction_header);
            TextView A0P2 = C36391kE.A0P(inflate, R.id.payment_instruction_title);
            TextEmojiLabel A0P3 = C36401kF.A0P(inflate, R.id.payment_instruction_description);
            AnonymousClass1FR r3 = paymentCustomInstructionsBottomSheet.A07;
            PhoneUserJid A0n = C36441kJ.A0n(paymentCustomInstructionsBottomSheet.A00);
            UserJid A0b = C36401kF.A0b(paymentCustomInstructionsBottomSheet.A03);
            C202159l8 r0 = C202159l8.A0E;
            if (r3.A0j(A0n, A0b, "55")) {
                A0P.setText(C36401kF.A0q(paymentCustomInstructionsBottomSheet, paymentCustomInstructionsBottomSheet.A08, new Object[1], 0, R.string.f12nameremoved));
            } else {
                A0P.setVisibility(8);
                A0P2.setText(R.string.f12nameremoved);
            }
            SpannableStringBuilder A0P4 = C36441kJ.A0P(paymentCustomInstructionsBottomSheet.A09);
            Linkify.addLinks(A0P4, 1);
            URLSpan[] A1a = C36381kD.A1a(A0P4, 0);
            SpannableStringBuilder A0P5 = C36441kJ.A0P(A0P4);
            for (URLSpan uRLSpan : A1a) {
                int spanStart = A0P5.getSpanStart(uRLSpan);
                int spanEnd = A0P5.getSpanEnd(uRLSpan);
                int spanFlags = A0P5.getSpanFlags(uRLSpan);
                A0P5.removeSpan(uRLSpan);
                A0P5.setSpan(new C89254Vv(paymentCustomInstructionsBottomSheet.A1D(), uRLSpan, paymentCustomInstructionsBottomSheet, C36381kD.A01(paymentCustomInstructionsBottomSheet.A1D())), spanStart, spanEnd, spanFlags);
            }
            C36331k8.A1A(paymentCustomInstructionsBottomSheet.A02, A0P3);
            A0P3.setText(A0P5);
            C48762i0.A00(findViewById, paymentCustomInstructionsBottomSheet, 4);
            if (paymentCustomInstructionsBottomSheet.A1o()) {
                ((ViewGroup) inflate).getChildAt(0).setBackground((Drawable) null);
            }
            if (paymentCustomInstructionsBottomSheet.A0B && !TextUtils.isEmpty(paymentCustomInstructionsBottomSheet.A0A)) {
                AnonymousClass1RJ A0Y = C36341k9.A0Y(inflate, R.id.hidden_payment_instruction_total_amount_view_stub);
                C36391kE.A0P(A0Y.A01(), R.id.total_amount).setText(paymentCustomInstructionsBottomSheet.A0A);
                A0Y.A03(0);
            }
            return inflate;
        } else if (this instanceof BrazilPixBottomSheet) {
            BrazilPixBottomSheet brazilPixBottomSheet = (BrazilPixBottomSheet) this;
            View inflate2 = LayoutInflater.from(brazilPixBottomSheet.A0a()).inflate(R.layout.f9nameremoved, new FrameLayout(brazilPixBottomSheet.A0a()));
            brazilPixBottomSheet.A00 = (CoordinatorLayout) inflate2.findViewById(R.id.pix_bottom_sheet_coordinator);
            View findViewById2 = inflate2.findViewById(R.id.close);
            C36391kE.A0P(inflate2, R.id.merchant_name).setText(brazilPixBottomSheet.A0A);
            C36391kE.A0P(inflate2, R.id.pix_key_value).setText(brazilPixBottomSheet.A0C);
            C36391kE.A0P(inflate2, R.id.total_amount).setText(brazilPixBottomSheet.A0E);
            TextView A0P6 = C36391kE.A0P(inflate2, R.id.instruction_text);
            if (BrazilPixBottomSheet.A07(brazilPixBottomSheet)) {
                boolean A0E = brazilPixBottomSheet.A1r().A0E(7569);
                i = R.string.f12nameremoved;
                if (A0E) {
                    A0P6.setText(R.string.f12nameremoved);
                    Context A1D = brazilPixBottomSheet.A1D();
                    AnonymousClass00C.A0E(A1D, "null cannot be cast to non-null type android.content.Context");
                    float applyDimension = TypedValue.applyDimension(1, 16.0f, C36341k9.A0G(brazilPixBottomSheet).getDisplayMetrics());
                    float applyDimension2 = TypedValue.applyDimension(1, 8.0f, C36341k9.A0G(brazilPixBottomSheet).getDisplayMetrics());
                    CoordinatorLayout coordinatorLayout = brazilPixBottomSheet.A00;
                    AnonymousClass00C.A0E(coordinatorLayout, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
                    int i2 = (int) applyDimension2;
                    coordinatorLayout.setPadding(i2, (int) (applyDimension + applyDimension2), i2, 0);
                    TextView A0P7 = C36391kE.A0P(inflate2, R.id.instruction_text);
                    A0P7.setPadding(0, 0, 0, 0);
                    C65723Tf.A02(A0P7, new AnonymousClass3QI(0, i2, 0, i2));
                    inflate2.findViewById(R.id.close).setVisibility(8);
                    C36341k9.A10(inflate2, R.id.lock, 8);
                    TextView A0P8 = C36391kE.A0P(inflate2, R.id.payment_title);
                    Context A1D2 = brazilPixBottomSheet.A1D();
                    CharSequence charSequence = null;
                    if (A1D2 != null) {
                        charSequence = A1D2.getText(R.string.f12nameremoved);
                    }
                    A0P8.setText(charSequence);
                    A0P8.setTextSize(24.0f);
                    View findViewById3 = inflate2.findViewById(R.id.merchant_icon_bg);
                    findViewById3.setPadding(0, 0, 0, 0);
                    findViewById3.setBackground((Drawable) null);
                    A0P7.setGravity(17);
                    View findViewById4 = inflate2.findViewById(R.id.merchant_info_wrapper);
                    AnonymousClass00C.A0E(A1D, "null cannot be cast to non-null type android.content.Context");
                    int A00 = AnonymousClass00F.A00(A1D, R.color.f6nameremoved);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(C90464aC.A02(brazilPixBottomSheet.A0a(), 16.0f, 1));
                    gradientDrawable.setColor(A00);
                    findViewById4.setBackground(gradientDrawable);
                    int i3 = (int) applyDimension;
                    int i4 = (int) (applyDimension2 + (applyDimension2 / ((float) 2)));
                    findViewById4.setPadding(i3, i4, i3, i4);
                    C65723Tf.A02(findViewById4, new AnonymousClass3QI(i3, i3, i3, i3));
                }
                A0P6.setText(i);
            } else {
                i = R.string.f12nameremoved;
                A0P6.setText(i);
            }
            C48752hz.A00(findViewById2, brazilPixBottomSheet, 45);
            return inflate2;
        } else {
            View inflate3 = LayoutInflater.from(A0a()).inflate(R.layout.f9nameremoved, new FrameLayout(A0a()));
            AnonymousClass00C.A08(inflate3);
            C36351kA.A0F(inflate3, R.id.title).setText(R.string.f12nameremoved);
            return inflate3;
        }
    }

    public String A1q() {
        Resources A0G;
        int i;
        Resources A0G2;
        int i2;
        if (this instanceof PaymentCustomInstructionsBottomSheet) {
            PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this;
            if (paymentCustomInstructionsBottomSheet.A0B) {
                return null;
            }
            AnonymousClass1FR r3 = paymentCustomInstructionsBottomSheet.A07;
            PhoneUserJid A0n = C36441kJ.A0n(paymentCustomInstructionsBottomSheet.A00);
            UserJid A0b = C36401kF.A0b(paymentCustomInstructionsBottomSheet.A03);
            C202159l8 r0 = C202159l8.A0E;
            if (!r3.A0j(A0n, A0b, "55")) {
                A0G2 = C36341k9.A0G(paymentCustomInstructionsBottomSheet);
                i2 = R.string.f12nameremoved;
            } else {
                boolean A0F = paymentCustomInstructionsBottomSheet.A05.A0F();
                A0G2 = C36341k9.A0G(paymentCustomInstructionsBottomSheet);
                i2 = R.string.f12nameremoved;
                if (A0F) {
                    i2 = R.string.f12nameremoved;
                }
            }
            return A0G2.getString(i2);
        } else if (!(this instanceof BrazilPixBottomSheet)) {
            return C36341k9.A0G(this).getString(R.string.f12nameremoved);
        } else {
            BrazilPixBottomSheet brazilPixBottomSheet = (BrazilPixBottomSheet) this;
            if (!BrazilPixBottomSheet.A07(brazilPixBottomSheet)) {
                A0G = C36341k9.A0G(brazilPixBottomSheet);
                i = R.string.f12nameremoved;
            } else if (!brazilPixBottomSheet.A1r().A0E(7569)) {
                return "";
            } else {
                A0G = C36341k9.A0G(brazilPixBottomSheet);
                i = R.string.f12nameremoved;
            }
            return C36381kD.A0s(A0G, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r9, android.view.LayoutInflater r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r0 = 2131626216(0x7f0e08e8, float:1.8879662E38)
            r5 = 0
            android.view.View r4 = r10.inflate(r0, r11, r5)
            java.lang.String r6 = r8.A1q()
            r1 = r8
            boolean r2 = r8 instanceof com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet
            if (r2 != 0) goto L_0x0020
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.BrazilPixBottomSheet
            if (r0 == 0) goto L_0x0020
            com.whatsapp.payments.ui.BrazilPixBottomSheet r1 = (com.whatsapp.payments.ui.BrazilPixBottomSheet) r1
            boolean r0 = com.whatsapp.payments.ui.BrazilPixBottomSheet.A07(r1)
            r7 = 2131231788(0x7f08042c, float:1.8079667E38)
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r7 = 0
        L_0x0021:
            r1 = r8
            if (r2 == 0) goto L_0x0064
            com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet r1 = (com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r1
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x005d
            r3 = 0
        L_0x002b:
            r2 = 0
            android.view.View r1 = r8.A1p()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x004f
            if (r3 == 0) goto L_0x004f
            r0 = 2131432894(0x7f0b15be, float:1.8487558E38)
            android.view.View r0 = r4.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r0.setText(r6)
            r0.setOnClickListener(r3)
            r0.setVisibility(r5)
            if (r7 == 0) goto L_0x004f
            r0.setIcon((int) r7)
        L_0x004f:
            android.text.TextUtils.isEmpty(r2)
            r0 = 2131434920(0x7f0b1da8, float:1.8491668E38)
            android.view.ViewGroup r0 = X.C36411kG.A0P(r4, r0)
            r0.addView(r1)
            return r4
        L_0x005d:
            r0 = 5
            X.9v0 r3 = new X.9v0
            r3.<init>(r1, r0)
            goto L_0x002b
        L_0x0064:
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.BrazilPixBottomSheet
            if (r0 == 0) goto L_0x0070
            r0 = 20
        L_0x006a:
            X.9ux r3 = new X.9ux
            r3.<init>(r8, r0)
            goto L_0x002b
        L_0x0070:
            r0 = 12
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.SimpleCustomPaymentBottomSheet.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
