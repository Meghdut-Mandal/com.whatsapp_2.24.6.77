package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5F0  reason: invalid class name */
public class AnonymousClass5F0 extends C46482Xv {
    public final TextEmojiLabel A00;
    public final C129006Eo A01;
    public final AnonymousClass6LH A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == r0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r15) {
        /*
            r14 = this;
            X.5Ds r15 = (X.C105195Ds) r15
            X.6Eo r0 = r14.A01
            X.6QG r0 = r0.A01()
            if (r0 == 0) goto L_0x0013
            java.lang.Integer r1 = r15.A01
            java.lang.Integer r0 = X.C023109s.A0C
            r3 = 2131886777(0x7f1202b9, float:1.9408142E38)
            if (r1 != r0) goto L_0x0016
        L_0x0013:
            r3 = 2131886776(0x7f1202b8, float:1.940814E38)
        L_0x0016:
            com.whatsapp.TextEmojiLabel r12 = r14.A00
            X.6LH r2 = r14.A02
            android.view.View r1 = r14.A0H
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = r0.getString(r3)
            X.C129426Gw.A01(r12, r2, r0)
            android.content.Context r11 = r1.getContext()
            java.lang.CharSequence r0 = r12.getText()
            android.view.View$OnClickListener r13 = r15.A00
            java.lang.String r10 = "clear-search-location"
            android.text.SpannableStringBuilder r9 = X.C36441kJ.A0P(r0)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r8 = 0
            java.lang.Object[] r7 = r9.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x007d
            int r6 = r7.length
        L_0x0047:
            if (r8 >= r6) goto L_0x007a
            r5 = r7[r8]
            java.lang.String r0 = r5.getURL()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0077
            int r4 = r9.getSpanStart(r5)
            int r3 = r9.getSpanEnd(r5)
            int r2 = r9.getSpanFlags(r5)
            X.7ox r0 = new X.7ox
            r0.<init>((android.content.Context) r11, (android.view.View.OnClickListener) r13)
            r9.setSpan(r0, r4, r3, r2)
            r1 = 2132083087(0x7f15018f, float:1.9806306E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r11, r1)
            r9.setSpan(r0, r4, r3, r2)
            r9.removeSpan(r5)
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x0047
        L_0x007a:
            r12.setText(r9)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5F0.A0C(java.lang.Object):void");
    }

    public AnonymousClass5F0(View view, C129006Eo r3, AnonymousClass6LH r4) {
        super(view);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = C36401kF.A0O(view, R.id.privacy_description);
    }
}
