package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6NO  reason: invalid class name */
public final class AnonymousClass6NO {
    public int A00;
    public C134746bX A01 = C109895Zn.A00();
    public C134606bJ A02;
    public final TextView A03;
    public final AnonymousClass01z A04;
    public final C157987fc A05;
    public final C18820ts A06;
    public final AnonymousClass012 A07;
    public final C129366Gq A08;

    public AnonymousClass6NO(TextView textView, AnonymousClass01z r3, AnonymousClass012 r4, C129366Gq r5, C157987fc r6, C18820ts r7) {
        AnonymousClass00C.A0D(textView, 1);
        AnonymousClass00C.A0D(r7, 6);
        this.A03 = textView;
        this.A07 = r4;
        this.A04 = r3;
        this.A05 = r6;
        this.A08 = r5;
        this.A06 = r7;
    }

    public final void A01(C134606bJ r11, C134746bX r12, int i, boolean z) {
        C134746bX r6 = r12;
        this.A01 = r12;
        if (i < 0 || i >= r12.A01.size()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onTextOptionsReady: provided selectedItem=");
            A0u.append(i);
            C36321k7.A1Z(A0u, " is outside of data bounds.");
            i = 0;
        }
        this.A00 = i;
        C134606bJ r7 = r11;
        this.A02 = r11;
        A00(this);
        boolean A1T = C90474aD.A1T(this.A01.A01.size(), 15);
        TextView textView = this.A03;
        if (A1T) {
            textView.setVisibility(0);
            this.A04.A0l(new C138386hm(r11, this, r12), this.A07, "text.option.selection.request.key");
            textView.setOnClickListener(new C135536cr(this, r6, r7, 0, z));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
        this.A04.A0m("text.option.selection.request.key");
    }

    public static final void A00(AnonymousClass6NO r7) {
        String str;
        Boolean bool = null;
        if (!r7.A01.A01.isEmpty()) {
            C134746bX r3 = r7.A01;
            C134656bO A002 = C129376Gr.A00(C129376Gr.A01(r3, r7.A00), r7.A02, r3.A02);
            if (A002 != null) {
                bool = Boolean.valueOf(A002.A02);
            }
            C102234zX r0 = (C102234zX) C007103b.A0P(r7.A01.A01, r7.A00);
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = "";
            }
            boolean A1X = C36371kC.A1X(bool, true);
            TextView textView = r7.A03;
            Context context = textView.getContext();
            if (A1X) {
                C36331k8.A0r(context, textView, C36391kE.A04(textView.getContext()));
                textView.setText(str);
                return;
            }
            C36331k8.A0r(context, textView, R.color.f6nameremoved);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C18820ts r2 = r7.A06;
            if (C36401kF.A1X(r2)) {
                spannableStringBuilder.append(8207);
            }
            spannableStringBuilder.append(AnonymousClass1JZ.A02(str));
            Context A0B = C36371kC.A0B(textView);
            spannableStringBuilder.append(AnonymousClass1JZ.A01(r2, " • "));
            spannableStringBuilder.append(A0B.getString(R.string.f12nameremoved));
            int A0C = AnonymousClass099.A0C(spannableStringBuilder, str, 0, false);
            if (A0C <= 0) {
                A0C = 0;
            }
            spannableStringBuilder.setSpan(new StrikethroughSpan(), A0C, str.length() + A0C, 33);
            textView.setText(new SpannedString(spannableStringBuilder));
            return;
        }
        r7.A03.setText((CharSequence) null);
    }
}
