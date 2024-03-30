package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import java.util.List;

/* renamed from: X.9k9  reason: invalid class name and case insensitive filesystem */
public final class C201709k9 {
    public final AnonymousClass171 A00;
    public final C27731Pn A01;
    public final C20440xZ A02;
    public final C19630wG A03;
    public final AnonymousClass1H2 A04;
    public final C20810yC A05;
    public final C19770wU A06;
    public final AnonymousClass1LI A07;
    public final C64723Pe A08;
    public final AnonymousClass1Pp A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass3CR A0B;
    public final C21060yb A0C;
    public final C18820ts A0D;
    public final AnonymousClass17X A0E;
    public final C29931Yo A0F;
    public final AnonymousClass1FR A0G;
    public final C23981Ap A0H;
    public final AnonymousClass1HA A0I;
    public final AnonymousClass1SV A0J;

    public static void A00(View view, TextView textView, C201709k9 r7, CharSequence charSequence) {
        textView.setText(AnonymousClass3UG.A02(view.getContext(), textView.getPaint(), new C74243lI(1, 512), r7.A04, charSequence));
    }

    public static void A02(View view, C201709k9 r3, AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(view, 1);
        r3.A0G(view, r4, false);
    }

    public void A04(View view) {
        AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
        A002.A0A.setVisibility(0);
        A002.A00.setVisibility(0);
        TextEmojiLabel textEmojiLabel = A002.A09;
        textEmojiLabel.setVisibility(8);
        textEmojiLabel.setMaxLines(3);
        A002.A07.setVisibility(8);
        A002.A02.setVisibility(8);
        A002.A0B.setVisibility(8);
        A002.A01.setVisibility(8);
        A002.A06.setVisibility(8);
        A002.A03.setVisibility(8);
        A002.A05.setVisibility(8);
        A002.A08.setVisibility(8);
        A002.A04.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.view.View r11, X.AnonymousClass1RY r12, X.AnonymousClass3T1 r13, X.AnonymousClass3JO r14) {
        /*
            r10 = this;
            r5 = 0
            boolean r4 = X.C36341k9.A1a(r13, r11)
            X.9XV r0 = X.AnonymousClass96O.A00(r11)
            com.whatsapp.TextEmojiLabel r3 = r0.A09
            r10.A04(r11)
            boolean r2 = r13 instanceof X.AnonymousClass2c5
            if (r2 == 0) goto L_0x02c3
            r10.A08(r11, r13)
        L_0x0015:
            X.9lY r6 = r13.A0M
            if (r6 == 0) goto L_0x0290
            boolean r0 = X.C203419nz.A06(r6)
            if (r0 != 0) goto L_0x0290
            int r1 = r6.A03
            r0 = 5
            if (r1 == r0) goto L_0x0290
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x0290
            int r1 = r6.A01
            r0 = 4
            if (r1 == r0) goto L_0x0290
            r10.A0C(r11, r13)
        L_0x0030:
            if (r2 == 0) goto L_0x0036
            r10.A07(r11, r13)
        L_0x0035:
            return
        L_0x0036:
            boolean r6 = r13 instanceof X.C46852bm
            if (r6 == 0) goto L_0x0251
            r10.A0D(r11, r13)
        L_0x003d:
            boolean r0 = r13 instanceof X.C46962bx
            if (r0 != 0) goto L_0x0035
            android.content.Context r1 = r11.getContext()
            android.text.TextPaint r2 = X.C165577te.A0J(r3, r1)
            boolean r0 = r13 instanceof X.C46892bq
            if (r0 == 0) goto L_0x0058
            r0 = 2131895720(0x7f1225a8, float:1.942628E38)
            java.lang.CharSequence r0 = X.C20440xZ.A00(r1, r2, r0)
        L_0x0054:
            r10.A0H(r11, r14, r0)
            return
        L_0x0058:
            boolean r0 = r13 instanceof X.C47012ca
            if (r0 == 0) goto L_0x0064
            r0 = 2131895739(0x7f1225bb, float:1.942632E38)
            java.lang.CharSequence r0 = X.C20440xZ.A00(r1, r2, r0)
            goto L_0x0054
        L_0x0064:
            boolean r0 = r13 instanceof X.C46802bh
            if (r0 == 0) goto L_0x0070
            r0 = 2131895697(0x7f122591, float:1.9426234E38)
            java.lang.CharSequence r0 = X.C20440xZ.A00(r1, r2, r0)
            goto L_0x0054
        L_0x0070:
            boolean r0 = r13 instanceof X.AnonymousClass2cX
            if (r0 == 0) goto L_0x007c
            r0 = 2131895730(0x7f1225b2, float:1.9426301E38)
            java.lang.CharSequence r0 = X.C20440xZ.A00(r1, r2, r0)
            goto L_0x0054
        L_0x007c:
            boolean r0 = r13 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0087
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0K(r1, r2, r13)
            goto L_0x0054
        L_0x0087:
            boolean r0 = r13 instanceof X.AnonymousClass2cT
            if (r0 == 0) goto L_0x0092
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0C(r1, r2, r13)
            goto L_0x0054
        L_0x0092:
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x009d
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0L(r1, r2, r13)
            goto L_0x0054
        L_0x009d:
            boolean r0 = r13 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x00bc
            X.0xZ r3 = r10.A02
            r2 = r13
            X.2bI r2 = (X.AnonymousClass2bI) r2
            if (r2 == 0) goto L_0x00b0
            X.1T1 r0 = r3.A00
            java.lang.String r2 = r0.A0O(r2, r5)
            if (r2 != 0) goto L_0x00b2
        L_0x00b0:
            java.lang.String r2 = ""
        L_0x00b2:
            X.1Sj r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01(r1, r13, r2)
            X.AnonymousClass00C.A08(r0)
            goto L_0x0054
        L_0x00bc:
            if (r6 == 0) goto L_0x00c5
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0H(r1, r2, r13)
            goto L_0x0054
        L_0x00c5:
            boolean r0 = r13 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x00d0
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0B(r1, r2, r13)
            goto L_0x0054
        L_0x00d0:
            boolean r0 = r13 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x00dc
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A09(r1, r2, r13)
            goto L_0x0054
        L_0x00dc:
            boolean r0 = r13 instanceof X.C46952bw
            if (r0 == 0) goto L_0x00e8
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0F(r1, r2, r13)
            goto L_0x0054
        L_0x00e8:
            boolean r0 = r13 instanceof X.C46882bp
            if (r0 == 0) goto L_0x00f4
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0A(r1, r2, r13)
            goto L_0x0054
        L_0x00f4:
            boolean r0 = r13 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0100
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A02(r1, r2, r13)
            goto L_0x0054
        L_0x0100:
            boolean r0 = r13 instanceof X.C181788o2
            if (r0 == 0) goto L_0x010c
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A08(r1, r2, r13)
            goto L_0x0054
        L_0x010c:
            boolean r0 = r13 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0118
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0M(r1, r2, r13)
            goto L_0x0054
        L_0x0118:
            boolean r0 = r13 instanceof X.C46972by
            if (r0 == 0) goto L_0x0124
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A06(r1, r2, r13)
            goto L_0x0054
        L_0x0124:
            boolean r0 = r13 instanceof X.AnonymousClass2bX
            if (r0 == 0) goto L_0x0130
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A05(r1, r2, r13)
            goto L_0x0054
        L_0x0130:
            boolean r0 = r13 instanceof X.AnonymousClass2bW
            if (r0 == 0) goto L_0x013c
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A04(r1, r2, r13)
            goto L_0x0054
        L_0x013c:
            boolean r0 = r13 instanceof X.C46912bs
            if (r0 == 0) goto L_0x0148
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0J(r1, r2, r13)
            goto L_0x0054
        L_0x0148:
            boolean r0 = r13 instanceof X.C46902br
            if (r0 == 0) goto L_0x0154
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0D(r1, r2, r13)
            goto L_0x0054
        L_0x0154:
            boolean r0 = r13 instanceof X.AnonymousClass5J5
            if (r0 == 0) goto L_0x0167
            X.0xZ r0 = r10.A02
            X.0wG r0 = r0.A03
            android.content.Context r1 = r0.A00
            r0 = 2131888494(0x7f12096e, float:1.9411625E38)
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
            goto L_0x0054
        L_0x0167:
            boolean r0 = X.C203359nq.A0C(r13)
            if (r0 == 0) goto L_0x017c
            X.0xZ r0 = r10.A02
            X.0wG r0 = r0.A03
            android.content.Context r1 = r0.A00
            r0 = 2131888475(0x7f12095b, float:1.9411586E38)
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
            goto L_0x0054
        L_0x017c:
            boolean r0 = r13 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x01a7
            X.0xZ r1 = r10.A02
            X.3Qa r3 = r13.A1J
            X.11F r0 = r3.A00
            boolean r2 = r0 instanceof X.C28981Uw
            X.0wG r0 = r1.A03
            android.content.Context r1 = r0.A00
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x019e
            r0 = 2131893744(0x7f121df0, float:1.9422273E38)
            if (r2 == 0) goto L_0x0198
            r0 = 2131893745(0x7f121df1, float:1.9422275E38)
        L_0x0198:
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
            goto L_0x0054
        L_0x019e:
            r0 = 2131893742(0x7f121dee, float:1.942227E38)
            if (r2 == 0) goto L_0x0198
            r0 = 2131893743(0x7f121def, float:1.9422271E38)
            goto L_0x0198
        L_0x01a7:
            boolean r0 = r13 instanceof X.AnonymousClass2bR
            if (r0 == 0) goto L_0x01b3
            X.0xZ r0 = r10.A02
            java.lang.String r0 = r0.A0N(r1, r13)
            goto L_0x0054
        L_0x01b3:
            boolean r0 = r13 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x01bf
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0G(r1, r2, r13)
            goto L_0x0054
        L_0x01bf:
            boolean r0 = r13 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x01cb
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0I(r1, r2, r13)
            goto L_0x0054
        L_0x01cb:
            boolean r0 = r13 instanceof X.AnonymousClass2bN
            if (r0 == 0) goto L_0x0220
            X.0xZ r6 = r10.A02
            r9 = 2
            X.3Qa r7 = r13.A1J
            X.11F r3 = r7.A00
            if (r3 == 0) goto L_0x021e
            X.16D r0 = r6.A01
            X.141 r3 = r0.A08(r3)
            if (r3 == 0) goto L_0x021e
            X.171 r0 = r6.A02
            java.lang.String r8 = r0.A0N(r3)
        L_0x01e6:
            boolean r0 = r7.A02
            X.0wG r7 = r6.A03
            if (r0 == 0) goto L_0x020e
            r3 = 2131893134(0x7f121b8e, float:1.9421036E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r8
            java.lang.String r0 = r7.A02(r3, r0)
        L_0x01f7:
            X.AnonymousClass00C.A0B(r0)
            android.text.Spanned r3 = android.text.Html.fromHtml(r0)
            r0 = 2131232590(0x7f08074e, float:1.8081294E38)
            android.graphics.drawable.Drawable r0 = X.C165587tf.A0D(r1, r0)
            java.lang.CharSequence r0 = X.C37351mE.A02(r2, r0, r3)
            X.AnonymousClass00C.A08(r0)
            goto L_0x0054
        L_0x020e:
            r6 = 2131893133(0x7f121b8d, float:1.9421034E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r5] = r8
            java.lang.String r0 = ""
            r3[r4] = r0
            java.lang.String r0 = r7.A02(r6, r3)
            goto L_0x01f7
        L_0x021e:
            r8 = 0
            goto L_0x01e6
        L_0x0220:
            boolean r0 = r13 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x022c
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A03(r1, r2, r13)
            goto L_0x0054
        L_0x022c:
            boolean r0 = r13 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0238
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A07(r1, r2, r13)
            goto L_0x0054
        L_0x0238:
            boolean r0 = r13 instanceof X.AnonymousClass2bP
            if (r0 == 0) goto L_0x0244
            X.0xZ r0 = r10.A02
            java.lang.CharSequence r0 = r0.A0E(r1, r2, r13)
            goto L_0x0054
        L_0x0244:
            X.0wG r0 = r10.A03
            android.content.Context r1 = r0.A00
            r0 = 2131888490(0x7f12096a, float:1.9411617E38)
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
            goto L_0x0054
        L_0x0251:
            boolean r0 = r13 instanceof X.C46952bw
            if (r0 == 0) goto L_0x025a
            r10.A0A(r11, r13)
            goto L_0x003d
        L_0x025a:
            boolean r0 = r13 instanceof X.C180938mf
            if (r0 == 0) goto L_0x0263
            r10.A09(r11, r13)
            goto L_0x003d
        L_0x0263:
            boolean r0 = r13 instanceof X.C46962bx
            if (r0 == 0) goto L_0x026c
            r10.A0E(r11, r13)
            goto L_0x003d
        L_0x026c:
            boolean r0 = r13 instanceof X.AnonymousClass2bX
            if (r0 == 0) goto L_0x003d
            X.0yC r1 = r10.A05
            r0 = 7448(0x1d18, float:1.0437E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x028b
            X.1Pn r2 = r10.A01
            android.content.Context r1 = r11.getContext()
            java.lang.String r0 = "message-reply-contact"
            X.1RY r0 = r2.A04(r1, r0)
            A01(r11, r0, r10, r13)
            goto L_0x003d
        L_0x028b:
            A01(r11, r12, r10, r13)
            goto L_0x003d
        L_0x0290:
            boolean r0 = r13 instanceof X.AnonymousClass2bR
            if (r0 == 0) goto L_0x0299
            r10.A0B(r11, r13)
            goto L_0x0030
        L_0x0299:
            boolean r0 = r13 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x02a5
            r10.A0G(r11, r13, r4)
            r10.A05(r11)
            goto L_0x0030
        L_0x02a5:
            boolean r0 = r13 instanceof X.C46882bp
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r13 instanceof X.C46852bm
            if (r0 == 0) goto L_0x02be
        L_0x02ad:
            boolean r0 = r13 instanceof X.C47002cZ
            if (r0 != 0) goto L_0x02be
            boolean r0 = r13 instanceof X.C46902br
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13 instanceof X.C46962bx
            if (r0 != 0) goto L_0x0030
            r10.A0G(r11, r13, r5)
            goto L_0x0030
        L_0x02be:
            r10.A0G(r11, r13, r4)
            goto L_0x0030
        L_0x02c3:
            r10.A0F(r11, r13, r14)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201709k9.A06(android.view.View, X.1RY, X.3T1, X.3JO):void");
    }

    public void A07(View view, AnonymousClass3T1 r6) {
        if (r6 instanceof AnonymousClass2c5) {
            AnonymousClass16D r1 = this.A0A;
            AnonymousClass11F r0 = r6.A1J.A00;
            if (r0 == null) {
                throw C36381kD.A0l();
            } else if (!A03(r1.A0D(r0))) {
                AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
                String str = ((AnonymousClass2c5) r6).A00;
                if (str == null || str.length() == 0) {
                    view.setVisibility(8);
                    return;
                }
                TextEmojiLabel textEmojiLabel = A002.A08;
                textEmojiLabel.A0I(str);
                textEmojiLabel.setVisibility(0);
                view.setVisibility(0);
            }
        }
    }

    public void A08(View view, AnonymousClass3T1 r10) {
        int A002;
        if (r10 instanceof AnonymousClass2c5) {
            Context context = view.getContext();
            AnonymousClass9XV A003 = AnonymousClass96O.A00(view);
            AnonymousClass1LI r4 = this.A07;
            TextEmojiLabel textEmojiLabel = A003.A0A;
            AnonymousClass3SF B3q = r4.B3q(textEmojiLabel.getContext(), textEmojiLabel);
            C64933Qa r42 = r10.A1J;
            if (r42.A02) {
                AnonymousClass00C.A0B(context);
                A002 = AnonymousClass00F.A00(context, C36381kD.A02(context));
                B3q.A02();
            } else {
                A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
                B3q.A01.A0E();
                B3q.A09((List) null, this.A03.A00.getString(R.string.f12nameremoved));
            }
            AnonymousClass00C.A0B(context);
            int A052 = C018107s.A05(AnonymousClass00F.A00(context, R.color.f6nameremoved), A002);
            B3q.A01.setTextColor(A052);
            AnonymousClass16D r1 = this.A0A;
            AnonymousClass11F r0 = r42.A00;
            if (r0 != null) {
                AnonymousClass141 A0D2 = r1.A0D(r0);
                if (A03(A0D2)) {
                    TextView textView = A003.A05;
                    textView.setVisibility(0);
                    textView.setTextColor(A052);
                    TextEmojiLabel textEmojiLabel2 = A003.A08;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.setTextColor(A052);
                    textEmojiLabel2.A0I(this.A00.A0H(A0D2));
                }
                C36341k9.A0q(context, A003.A00, R.color.f6nameremoved);
                return;
            }
            throw C36381kD.A0l();
        }
    }

    public void A09(View view, AnonymousClass3T1 r11) {
        C207199ui r7;
        String A062;
        if ((r11 instanceof AnonymousClass2bZ) && r11.A1I == 54) {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            A002.A09.setMaxLines(1);
            C207219uk r0 = ((AnonymousClass2bZ) r11).A00;
            if (r0 != null && (r7 = r0.A01) != null) {
                if (r7.A0N != null) {
                    ImageView imageView = A002.A02;
                    imageView.getLayoutParams().width = imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    imageView.getLayoutParams().height = imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                TextEmojiLabel textEmojiLabel = A002.A07;
                textEmojiLabel.setVisibility(0);
                Context context = view.getContext();
                Object[] A0M = AnonymousClass001.A0M();
                AnonymousClass000.A1L(A0M, r7.A09.A00(), 0);
                AnonymousClass1FR r02 = this.A0G;
                boolean A0l = r02.A0l(r7);
                C18820ts r03 = r02.A05;
                if (A0l) {
                    A062 = C207199ui.A01(r03, r7);
                } else {
                    A062 = r7.A06(r03);
                }
                A0M[1] = A062;
                C36341k9.A0s(context, textEmojiLabel, A0M, R.string.f12nameremoved);
            }
        }
    }

    public void A0A(View view, AnonymousClass3T1 r9) {
        String str;
        if ((r9 instanceof C46952bw) && (str = ((C46952bw) r9).A06) != null && str.length() != 0) {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            TextEmojiLabel textEmojiLabel = A002.A09;
            TextEmojiLabel textEmojiLabel2 = A002.A07;
            ImageView imageView = A002.A02;
            textEmojiLabel.setMaxLines(1);
            textEmojiLabel2.setVisibility(0);
            A00(view, textEmojiLabel2, this, str);
            imageView.getLayoutParams().width = imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            imageView.getLayoutParams().height = imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
    }

    public void A0B(View view, AnonymousClass3T1 r9) {
        if (r9 instanceof AnonymousClass2bR) {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            Context context = view.getContext();
            SpannableStringBuilder A0F2 = this.A0G.A0F(context, ((AnonymousClass2bR) r9).A00);
            if (A0F2 != null && A0F2.length() != 0) {
                SpannableStringBuilder A0P = C36441kJ.A0P(A0F2);
                AnonymousClass00C.A0B(context);
                A0P.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(context, C36381kD.A02(context))), 0, A0F2.length(), 0);
                TextView textView = A002.A06;
                textView.setText(A0P);
                textView.setVisibility(0);
                A002.A01.setVisibility(0);
            }
        }
    }

    public void A0C(View view, AnonymousClass3T1 r10) {
        C202319lY r7 = r10.A0M;
        if (r7 != null) {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            Context context = view.getContext();
            TextView textView = A002.A06;
            View view2 = A002.A01;
            ImageView imageView = A002.A03;
            view2.setVisibility(0);
            textView.setVisibility(0);
            C18820ts r5 = this.A0D;
            AnonymousClass16X r1 = r7.A08;
            if (r1 != null) {
                textView.setText(AnonymousClass9Zb.A00(context, r5, r7.A03(), r1));
                C20810yC r12 = this.A05;
                if (r12.A0E(605) || r12.A0E(629)) {
                    C135106c9 A052 = r7.A05();
                    if (A052 != null) {
                        imageView.setVisibility(0);
                        this.A0F.A02(imageView, textView, A052);
                        return;
                    }
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                    C36321k7.A0M(context, textView, R.attr.f4nameremoved, R.color.f6nameremoved);
                    textView.setTextSize(20.0f);
                    return;
                }
                return;
            }
            throw C36381kD.A0l();
        }
    }

    public void A0D(View view, AnonymousClass3T1 r8) {
        if (r8 instanceof C46852bm) {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            TextEmojiLabel textEmojiLabel = A002.A09;
            SpannableString A003 = this.A08.A00((C46852bm) r8);
            textEmojiLabel.setMaxLines(1);
            if (A003 != null && A003.length() != 0) {
                TextEmojiLabel textEmojiLabel2 = A002.A07;
                textEmojiLabel2.setVisibility(0);
                A00(view, textEmojiLabel2, this, A003);
            }
        }
    }

    public void A0E(View view, AnonymousClass3T1 r8) {
        AnonymousClass3S2 A012;
        AnonymousClass1XQ[] r0;
        StickerView stickerView = AnonymousClass96O.A00(view).A0B;
        stickerView.setVisibility(0);
        C23981Ap r2 = this.A0H;
        C135066c4 A002 = r2.A00((C46962bx) r8);
        String str = A002.A0A;
        if (!(str == null || (A012 = r2.A01(A002.A01(), str)) == null || (r0 = A012.A0D) == null)) {
            A002.A08 = C55532um.A00(r0);
        }
        stickerView.setContentDescription(AnonymousClass3RT.A00(stickerView.getContext(), A002));
        AnonymousClass1HA r22 = this.A0I;
        int dimensionPixelSize = C36341k9.A0F(stickerView).getDimensionPixelSize(R.dimen.f7nameremoved);
        stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        C148946zg r3 = new C148946zg(A002, r22, stickerView, dimensionPixelSize);
        AnonymousClass1SV r23 = this.A0J;
        StringBuilder A0u = AnonymousClass000.A0u();
        C165577te.A1F(r8, "quoted-", A0u);
        AnonymousClass1SV.A05(stickerView, r8, r3, r23, A0u.toString());
    }

    public void A0F(View view, AnonymousClass3T1 r21, AnonymousClass3JO r22) {
        C188218zE r14;
        int i;
        int i2;
        int A002;
        int i3;
        C52022ol r1;
        AnonymousClass16D r12;
        AnonymousClass11F r0;
        int i4;
        Context context;
        int i5;
        View view2 = view;
        Context context2 = view2.getContext();
        AnonymousClass9XV A003 = AnonymousClass96O.A00(view2);
        AnonymousClass1LI r2 = this.A07;
        TextEmojiLabel textEmojiLabel = A003.A0A;
        AnonymousClass3SF B3q = r2.B3q(textEmojiLabel.getContext(), textEmojiLabel);
        AnonymousClass3JO r122 = r22;
        AnonymousClass11F r3 = r122.A00;
        AnonymousClass3T1 r13 = r21;
        C64933Qa r23 = r13.A1J;
        AnonymousClass11F r15 = r23.A00;
        if ((r15 instanceof C28981Uw) || (r3 instanceof C28981Uw)) {
            r14 = C188218zE.NEWSLETTER;
        } else if (r15 instanceof C177528dw) {
            r14 = C188218zE.STATUS;
        } else {
            if (AnonymousClass143.A0G(r15)) {
                if (!AnonymousClass00C.A0J(r15, r3)) {
                    r14 = C188218zE.CROSS_GROUP;
                } else if (!r23.A02) {
                    r14 = C188218zE.SAME_GROUP;
                }
            } else if (!r23.A02) {
                r14 = C188218zE.INDIVIDUAL;
            }
            r14 = C188218zE.FROM_ME;
        }
        if (r14 == C188218zE.FROM_ME || r14 == C188218zE.SAME_GROUP || r14 == C188218zE.INDIVIDUAL || r14 == C188218zE.NEWSLETTER) {
            int ordinal = r14.ordinal();
            if (ordinal == 0) {
                AnonymousClass00C.A0B(context2);
                i = AnonymousClass00F.A00(context2, C36381kD.A02(context2));
                B3q.A02();
            } else if (ordinal != 2) {
                if (ordinal == 1) {
                    r12 = this.A0A;
                    r0 = r13.A0L();
                    if (r0 == null) {
                        r0 = r3;
                        if (r3 == null) {
                            throw AnonymousClass001.A09("Required value was null.");
                        }
                    }
                } else if (ordinal != 5) {
                    r12 = this.A0A;
                    r0 = r13.A0L();
                    if (r0 == null) {
                        r0 = r3;
                        if (r3 == null) {
                            throw AnonymousClass001.A09("Required value was null.");
                        }
                    }
                } else {
                    AnonymousClass16D r02 = this.A0A;
                    if (r3 != null) {
                        AnonymousClass141 A0D2 = r02.A0D(r3);
                        AnonymousClass00C.A0B(context2);
                        i = AnonymousClass00F.A00(context2, C36381kD.A02(context2));
                        B3q.A06(A0D2);
                        A003.A05.setVisibility(8);
                        A003.A08.setVisibility(8);
                    } else {
                        throw AnonymousClass001.A09("Required value was null.");
                    }
                }
                AnonymousClass141 A0D3 = r12.A0D(r0);
                i = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
                B3q.A05(A0D3);
            } else {
                AnonymousClass11F A0J2 = r13.A0J();
                if (A0J2 != null) {
                    UserJid userJid = (UserJid) A0J2;
                    AnonymousClass141 A0D4 = this.A0A.A0D(userJid);
                    AnonymousClass17X r24 = this.A0E;
                    AnonymousClass00C.A0E(r15, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                    AnonymousClass6PM A032 = r24.A03((AnonymousClass144) r15, userJid);
                    if (A032 != null) {
                        A002 = C55772vA.A00(view2.getResources(), A032);
                    } else {
                        A002 = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
                    }
                    if (r122.A02) {
                        i3 = this.A00.A07(A0D4, r3);
                    } else {
                        i3 = 1;
                    }
                    AnonymousClass34G A0C2 = this.A00.A0C(A0D4, i3);
                    AnonymousClass3SF r132 = B3q;
                    AnonymousClass34G r142 = A0C2;
                    AnonymousClass141 r152 = A0D4;
                    r132.A04(r142, r152, (List) null, i3, A0D4.A0O());
                    if (7 == i3 && C52022ol.PUSH_NAME == (r1 = A0C2.A00)) {
                        AnonymousClass3CR r03 = this.A0B;
                        TextEmojiLabel textEmojiLabel2 = A003.A08;
                        r03.A00(textEmojiLabel2, r1, A0D4, i3);
                        ((C38511p5) C36361kB.A0G(view2, R.id.quoted_title_frame)).A00 = true;
                        AnonymousClass088.A06(textEmojiLabel2, R.style.f13nameremoved);
                        textEmojiLabel2.setPadding(context2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0, 0);
                        i2 = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
                    }
                } else {
                    throw AnonymousClass001.A09("Required value was null.");
                }
            }
            i2 = i;
        } else {
            if (r23.A02) {
                AnonymousClass00C.A0B(context2);
                i = AnonymousClass00F.A00(context2, C36381kD.A02(context2));
                B3q.A02();
            } else {
                if (r14.ordinal() == 3) {
                    AnonymousClass17X r32 = this.A0E;
                    AnonymousClass00C.A0E(r15, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                    AnonymousClass144 r25 = (AnonymousClass144) r15;
                    AnonymousClass11F A0J3 = r13.A0J();
                    if (A0J3 != null) {
                        AnonymousClass6PM A033 = r32.A03(r25, (UserJid) A0J3);
                        if (A033 != null) {
                            i = C55772vA.A00(view2.getResources(), A033);
                        } else {
                            i4 = R.color.f6nameremoved;
                            i = AnonymousClass00F.A00(context2, i4);
                        }
                    } else {
                        throw AnonymousClass001.A09("Required value was null.");
                    }
                } else {
                    i4 = R.color.f6nameremoved;
                    i = AnonymousClass00F.A00(context2, i4);
                }
                AnonymousClass16D r33 = this.A0A;
                AnonymousClass11F A0J4 = r13.A0J();
                if (A0J4 != null) {
                    B3q.A05(r33.A0D(A0J4));
                } else {
                    throw AnonymousClass001.A09("Required value was null.");
                }
            }
            i2 = i;
            A003.A05.setVisibility(0);
            TextEmojiLabel textEmojiLabel3 = A003.A08;
            textEmojiLabel3.setVisibility(0);
            AnonymousClass16D r04 = this.A0A;
            if (r15 != null) {
                AnonymousClass141 A0D5 = r04.A0D(r15);
                String A0H2 = this.A00.A0H(A0D5);
                int ordinal2 = r14.ordinal();
                if (ordinal2 != 3) {
                    if (ordinal2 == 4) {
                        context = this.A03.A00;
                        i5 = R.string.f12nameremoved;
                    }
                } else if (A03(A0D5)) {
                    textEmojiLabel3.A0I(A0H2);
                } else {
                    context = this.A03.A00;
                    i5 = R.string.f12nameremoved;
                }
                textEmojiLabel3.A0I(context.getString(i5));
            } else {
                throw AnonymousClass001.A09("Required value was null.");
            }
        }
        AnonymousClass00C.A0B(context2);
        int A052 = C018107s.A05(AnonymousClass00F.A00(context2, R.color.f6nameremoved), i);
        B3q.A01.setTextColor(A052);
        A003.A05.setTextColor(A052);
        A003.A08.setTextColor(C018107s.A05(AnonymousClass00F.A00(context2, R.color.f6nameremoved), i2));
        A003.A00.setBackgroundColor(i);
    }

    public void A0G(View view, AnonymousClass3T1 r13, boolean z) {
        C63683Kz A0V;
        C207199ui r0;
        C207009uP r02;
        String str;
        AnonymousClass3T1 r3 = r13;
        ImageView imageView = AnonymousClass96O.A00(view).A02;
        AnonymousClass1SV r5 = this.A0J;
        C148936zf r4 = new C148936zf(imageView, r5);
        if (!this.A05.A0E(7581) || !(r13 instanceof C180938mf) || !((A0V = r13.A0V()) == null || A0V.A02() == null)) {
            StringBuilder A0v = AnonymousClass000.A0v("quoted-");
            C64933Qa r03 = r13.A1J;
            if (z) {
                AnonymousClass1SV.A06(imageView, r3, r4, r5, AnonymousClass000.A0o(r03, A0v), 100, false, true, true);
            } else {
                AnonymousClass1SV.A05(imageView, r13, r4, r5, AnonymousClass000.A0o(r03, A0v));
            }
        } else {
            AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
            C207219uk r04 = ((AnonymousClass2bZ) r3).A00;
            if (r04 != null && (r0 = r04.A01) != null && (r02 = r0.A09) != null) {
                List list = r02.A09;
                if (!list.isEmpty() && (str = ((C206959uJ) C007103b.A0L(list)).A00) != null) {
                    this.A06.Box(new C49122ib(A002.A02, str), new String[0]);
                }
            }
        }
    }

    public void A0H(View view, AnonymousClass3JO r7, CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 3);
        AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
        Context A0B2 = C36371kC.A0B(view);
        TextEmojiLabel textEmojiLabel = A002.A09;
        TextEmojiLabel textEmojiLabel2 = A002.A07;
        boolean z = r7.A01;
        int i = R.color.f6nameremoved;
        if (z) {
            i = R.color.f6nameremoved;
        }
        int A003 = AnonymousClass00F.A00(A0B2, i);
        textEmojiLabel.setTextColor(A003);
        textEmojiLabel2.setTextColor(A003);
        textEmojiLabel.setVisibility(0);
        A00(view, textEmojiLabel, this, charSequence);
    }

    public C201709k9(AnonymousClass1LI r22, C64723Pe r23, AnonymousClass1Pp r24, AnonymousClass16D r25, AnonymousClass171 r26, C27731Pn r27, AnonymousClass3CR r28, C20440xZ r29, C21060yb r30, C19630wG r31, C18820ts r32, AnonymousClass17X r33, AnonymousClass1H2 r34, C20810yC r35, C29931Yo r36, AnonymousClass1FR r37, C23981Ap r38, AnonymousClass1HA r39, AnonymousClass1SV r40, C19770wU r41) {
        C19770wU r2 = r41;
        C19630wG r15 = r31;
        AnonymousClass1H2 r9 = r34;
        C20810yC r8 = r35;
        C64723Pe r19 = r23;
        C36321k7.A1B(r8, r15, r2, r9, r19);
        AnonymousClass1FR r6 = r37;
        C23981Ap r5 = r38;
        AnonymousClass1Pp r18 = r24;
        AnonymousClass16D r17 = r25;
        C27731Pn r14 = r27;
        C36321k7.A1C(r14, r6, r18, r17, r5);
        C21060yb r12 = r30;
        C18820ts r11 = r32;
        AnonymousClass171 r16 = r26;
        C36321k7.A15(r12, r16, r11);
        AnonymousClass1HA r4 = r39;
        AnonymousClass1SV r3 = r40;
        C36361kB.A1L(r3, r4);
        AnonymousClass17X r10 = r33;
        C20440xZ r13 = r29;
        C165607th.A1J(r13, 16, r10);
        C29931Yo r7 = r36;
        AnonymousClass00C.A0D(r7, 19);
        AnonymousClass1LI r20 = r22;
        AnonymousClass00C.A0D(r20, 20);
        this.A05 = r8;
        this.A03 = r15;
        this.A06 = r2;
        this.A04 = r9;
        this.A08 = r19;
        this.A01 = r14;
        this.A0G = r6;
        this.A09 = r18;
        this.A0A = r17;
        this.A0H = r5;
        this.A0C = r12;
        this.A00 = r16;
        this.A0D = r11;
        this.A0J = r3;
        this.A0I = r4;
        this.A02 = r13;
        this.A0E = r10;
        this.A0B = r28;
        this.A0F = r7;
        this.A07 = r20;
    }

    public static final void A01(View view, AnonymousClass1RY r7, C201709k9 r8, AnonymousClass3T1 r9) {
        if (r9 instanceof AnonymousClass2bX) {
            ImageView imageView = AnonymousClass96O.A00(view).A04;
            imageView.setVisibility(0);
            r8.A09.A06(imageView, R.drawable.avatar_contact);
            AnonymousClass363 A032 = new C65033Ql(r8.A0A, r8.A0C, r8.A03, r8.A0D).A03((AnonymousClass2bX) r9);
            if (A032 != null) {
                AnonymousClass1RY r4 = r7;
                if (r7 != null) {
                    C65643Sx r72 = A032.A01;
                    int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    C27731Pn r0 = r4.A06;
                    r4.A07(imageView, new C70133ee(r0.A02, (AnonymousClass141) null, r0.A0B, r0.A0C), r72, 0.0f, dimensionPixelSize);
                }
            }
        }
    }

    private final boolean A03(AnonymousClass141 r5) {
        String A0H2 = this.A00.A0H(r5);
        if (A0H2 == null || A0H2.length() == 0 || A0H2.equals(this.A03.A00.getString(R.string.f12nameremoved))) {
            return false;
        }
        return true;
    }

    public void A05(View view) {
        AnonymousClass9XV A002 = AnonymousClass96O.A00(view);
        Context context = view.getContext();
        ImageView imageView = A002.A02;
        if (imageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int A012 = C65103Qt.A01(context, 4.0f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(A012, A012, A012, A012);
            imageView.setLayoutParams(marginLayoutParams);
        }
        C34081gQ.A01(imageView);
    }
}
