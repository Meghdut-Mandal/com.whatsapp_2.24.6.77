package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.Date;

/* renamed from: X.4zm  reason: invalid class name and case insensitive filesystem */
public abstract class C102344zm extends AnonymousClass80I {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final AnonymousClass9ED A08;
    public final C159967kF A09;
    public final AnonymousClass1KP A0A;
    public final C18820ts A0B;
    public final UserJid A0C;
    public final Date A0D = new Date();
    public final FrameLayout A0E;
    public final C196089Xp A0F;

    public C102344zm(View view, AnonymousClass9ED r6, C196089Xp r7, C159967kF r8, AnonymousClass1KP r9, C18820ts r10, UserJid userJid) {
        super(view);
        this.A0B = r10;
        this.A0F = r7;
        this.A09 = r8;
        this.A0C = userJid;
        this.A08 = r6;
        this.A0A = r9;
        this.A0E = (FrameLayout) C36361kB.A0F(view, R.id.catalog_item_view);
        this.A03 = C36361kB.A0M(view, R.id.catalog_list_product_image);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C36361kB.A0F(view, R.id.catalog_list_product_title);
        this.A06 = textEmojiLabel;
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C36361kB.A0F(view, R.id.catalog_list_product_description);
        this.A05 = textEmojiLabel2;
        this.A07 = (TextEmojiLabel) C36361kB.A0F(view, R.id.catalog_list_product_variant_description);
        TextView A0F2 = C36351kA.A0F(view, R.id.catalog_list_product_price);
        this.A04 = A0F2;
        this.A02 = textEmojiLabel.getTextColors().getDefaultColor();
        this.A00 = textEmojiLabel2.getTextColors().getDefaultColor();
        this.A01 = A0F2.getTextColors().getDefaultColor();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r2 != true) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass8WQ r15) {
        /*
            r14 = this;
            int r4 = r14.A04()
            r3 = 0
            android.widget.FrameLayout r2 = r14.A0E
            if (r4 != 0) goto L_0x0209
            android.view.View r0 = r14.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167976(0x7f070ae8, float:1.795024E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r3, r0, r3, r3)
        L_0x0019:
            X.7kF r7 = r14.A09
            X.9up r1 = r7.BGG(r4)
            com.whatsapp.TextEmojiLabel r4 = r14.A06
            java.lang.String r0 = r1.A05
            r4.A0I(r0)
            X.9uZ r0 = r7.B94()
            r6 = 1
            if (r0 == 0) goto L_0x0032
            boolean r2 = r0.A0X
            r0 = 1
            if (r2 == r6) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r9 = 0
            r5 = 8
            if (r0 == 0) goto L_0x01ec
            r4.setSingleLine(r3)
            r0 = 2
            r4.setMaxLines(r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A05
            r0.setVisibility(r5)
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x01e9
            X.6bP r0 = r0.A01
            if (r0 == 0) goto L_0x01e9
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x01e9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r2.toUpperCase(r0)
            X.AnonymousClass00C.A08(r4)
        L_0x0059:
            X.1KP r2 = r14.A0A
            X.9uZ r0 = r7.B94()
            boolean r0 = r2.A02(r0)
            if (r0 != r6) goto L_0x01e6
            if (r4 == 0) goto L_0x01e6
            boolean r0 = X.AnonymousClass098.A06(r4)
            if (r0 != 0) goto L_0x01e6
            com.whatsapp.TextEmojiLabel r0 = r14.A07
        L_0x006f:
            r0.setVisibility(r3)
            r0.A0J(r4, r9, r3, r6)
        L_0x0075:
            X.1KP r4 = r14.A0A
            r2 = 1
            X.9uZ r0 = r7.B94()
            boolean r0 = r4.A02(r0)
            if (r0 != r6) goto L_0x019f
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x019f
            X.6bP r4 = r0.A01
            if (r4 == 0) goto L_0x019f
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x019f
            java.math.BigDecimal r12 = r4.A01
            if (r12 == 0) goto L_0x019f
            android.widget.TextView r7 = r14.A04
            r7.setVisibility(r3)
            X.6Tk r10 = r1.A04
            X.0ts r11 = r14.A0B
            java.util.Date r13 = r14.A0D
            android.content.Context r8 = r7.getContext()
            android.text.SpannableString r6 = X.AnonymousClass6W7.A01(r8, r9, r10, r11, r12, r13)
            android.content.Context r5 = r7.getContext()
            r4 = 2131893252(0x7f121c04, float:1.9421275E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C90514aH.A1Q(r6, r0, r3)
            X.C36341k9.A0s(r5, r7, r0, r4)
        L_0x00b4:
            com.whatsapp.jid.UserJid r4 = r14.A0C
            r5 = r14
            X.4ze r5 = (X.C102264ze) r5
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00d8
            X.1KP r3 = r5.A0A
            r2 = 1
            X.7kF r0 = r5.A09
            X.9uZ r0 = r0.B94()
            boolean r0 = r3.A02(r0)
            if (r0 != r2) goto L_0x0171
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x0171
            X.6bP r0 = r0.A01
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0171
        L_0x00d8:
            com.whatsapp.TextEmojiLabel r2 = r5.A06
            int r0 = r5.A02
            r2.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r2 = r5.A05
            int r0 = r5.A00
            r2.setTextColor(r0)
            android.widget.TextView r2 = r5.A04
            int r0 = r5.A01
            r2.setTextColor(r0)
            X.00T r6 = r5.A04
            java.lang.Object r2 = X.C36381kD.A0p(r6)
            android.view.View r2 = (android.view.View) r2
            X.7kF r7 = r5.A09
            boolean r0 = r7.B9S()
            int r0 = X.C36351kA.A00(r0)
            r2.setVisibility(r0)
            android.widget.ImageView r2 = r5.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            X.1KP r3 = r5.A0A
            r2 = 1
            X.9uZ r0 = r7.B94()
            boolean r0 = r3.A02(r0)
            if (r0 != r2) goto L_0x0169
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x0169
            X.6bP r0 = r0.A01
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0169
            java.lang.Object r2 = X.C36381kD.A0p(r6)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r2 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r2
            X.3DZ r0 = new X.3DZ
            r0.<init>(r1, r5, r4)
        L_0x012d:
            r2.A05 = r0
        L_0x012f:
            android.widget.ImageView r5 = r14.A03
            X.C53332r9.A00(r5)
            java.util.List r2 = r1.A07
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "ProductBaseViewHolder/bindViewInSection/no-product-images"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0141:
            java.util.List r2 = X.C007103b.A0V(r2)
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0168
            boolean r0 = X.C36401kF.A1a(r2)
            if (r0 == 0) goto L_0x0168
            X.9ED r0 = r14.A08
            X.9HG r8 = new X.9HG
            r8.<init>(r0, r4)
            X.9Xp r4 = r14.A0F
            java.lang.Object r6 = X.C007103b.A0L(r2)
            X.9tv r6 = (X.C206759tv) r6
            r11 = 2
            X.6pt r10 = X.C143046pt.A00
            r7 = 0
            r9 = r7
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
        L_0x0168:
            return
        L_0x0169:
            java.lang.Object r2 = X.C36381kD.A0p(r6)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r2 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r2
            r0 = 0
            goto L_0x012d
        L_0x0171:
            com.whatsapp.TextEmojiLabel r2 = r5.A06
            X.00T r3 = r5.A03
            int r0 = X.C36331k8.A02(r3)
            r2.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r2 = r5.A05
            int r0 = X.C36331k8.A02(r3)
            r2.setTextColor(r0)
            android.widget.TextView r2 = r5.A04
            int r0 = X.C36331k8.A02(r3)
            r2.setTextColor(r0)
            X.00T r0 = r5.A04
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            X.C90514aH.A1N(r0)
            android.widget.ImageView r2 = r5.A03
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r0)
            goto L_0x012f
        L_0x019f:
            java.math.BigDecimal r0 = r1.A06
            if (r0 == 0) goto L_0x01df
            X.6Tk r0 = r1.A04
            if (r0 == 0) goto L_0x01df
            android.widget.TextView r4 = r14.A04
            r4.setVisibility(r3)
            java.math.BigDecimal r9 = r1.A06
            X.6Tk r7 = r1.A04
            X.6bV r6 = r1.A02
            X.0ts r8 = r14.A0B
            java.util.Date r10 = r14.A0D
            android.content.Context r5 = r4.getContext()
            android.text.SpannableString r0 = X.AnonymousClass6W7.A01(r5, r6, r7, r8, r9, r10)
            android.text.SpannableStringBuilder r5 = X.C36441kJ.A0P(r0)
            int r0 = r1.A00
            if (r2 != r0) goto L_0x01da
            java.lang.String r0 = " • "
            android.text.SpannableStringBuilder r3 = r5.append(r0)
            android.content.Context r2 = r4.getContext()
            r0 = 2131892003(0x7f121723, float:1.9418742E38)
            java.lang.String r0 = r2.getString(r0)
            r3.append(r0)
        L_0x01da:
            r4.setText(r5)
            goto L_0x00b4
        L_0x01df:
            android.widget.TextView r0 = r14.A04
            r0.setVisibility(r5)
            goto L_0x00b4
        L_0x01e6:
            com.whatsapp.TextEmojiLabel r0 = r14.A07
            goto L_0x0204
        L_0x01e9:
            r4 = 0
            goto L_0x0059
        L_0x01ec:
            r4.setSingleLine(r6)
            com.whatsapp.TextEmojiLabel r0 = r14.A07
            r0.setVisibility(r5)
            java.lang.String r4 = r1.A0C
            if (r4 == 0) goto L_0x0202
            boolean r0 = X.AnonymousClass098.A06(r4)
            if (r0 != 0) goto L_0x0202
            com.whatsapp.TextEmojiLabel r0 = r14.A05
            goto L_0x006f
        L_0x0202:
            com.whatsapp.TextEmojiLabel r0 = r14.A05
        L_0x0204:
            r0.setVisibility(r5)
            goto L_0x0075
        L_0x0209:
            r2.setPadding(r3, r3, r3, r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102344zm.A0D(X.8WQ):void");
    }
}
