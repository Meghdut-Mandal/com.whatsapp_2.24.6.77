package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.2Gc  reason: invalid class name */
public class AnonymousClass2Gc extends C37871nL {
    public C011705b A00;
    public C011705b A01;
    public List A02 = AnonymousClass001.A0I();
    public boolean A03 = false;
    public final WfalManager A04;
    public final ContactPickerFragment A05;
    public final C19970wo A06;
    public final C20810yC A07;
    public final AnonymousClass1NN A08;
    public final C26371Jx A09;
    public final AnonymousClass1EM A0A;
    public final C28781Ua A0B;
    public final AnonymousClass005 A0C;

    public static void A00(Context context, AnonymousClass3BE r3) {
        TextEmojiLabel textEmojiLabel = r3.A0D;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.A0C();
        C36331k8.A0r(context, textEmojiLabel, R.color.f6nameremoved);
        r3.A07.setVisibility(8);
        r3.A03.setVisibility(8);
        r3.A0B.setVisibility(8);
        r3.A0C.setVisibility(8);
        r3.A0A.setVisibility(8);
        r3.A09.setVisibility(8);
    }

    public static void A01(ImageView imageView, AnonymousClass2Gc r5, AnonymousClass141 r6) {
        AnonymousClass11F r3 = r6.A0H;
        StringBuilder A0f = C36421kH.A0f(r3);
        A0f.append(ContactPicker.class.getName());
        String A0q = AnonymousClass000.A0q(r3.getRawString(), A0f);
        C011004s.A08(imageView, A0q);
        C64713Pd r1 = new C64713Pd((View) imageView, r3, (Integer) null);
        r1.A04 = A0q;
        r1.A02(r5.A05.A0h());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r2 == null) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.C87564Ph r7, X.AnonymousClass3BE r8, X.AnonymousClass141 r9) {
        /*
            r6 = this;
            com.whatsapp.contact.picker.ContactPickerFragment r5 = r6.A05
            boolean r0 = r7 instanceof X.C70233eo
            if (r0 == 0) goto L_0x004b
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r9.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = ""
        L_0x0018:
            X.0yC r0 = r6.A07
            boolean r0 = X.C36431kI.A1X(r0)
            com.whatsapp.TextEmojiLabel r1 = r8.A0D
            if (r0 == 0) goto L_0x00a1
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x00a7
            r1.A0I(r2)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 1
            r1.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            return
        L_0x0039:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "~ "
            r1.append(r0)
            java.lang.String r0 = r9.A0K()
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0018
        L_0x004b:
            X.11F r1 = r9.A0H
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0082
            X.12q r0 = r5.A1N
            X.3Qp r1 = X.C36371kC.A0W(r0, r1)
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x0082
            long r2 = r1.A07
            int r1 = (int) r2
            X.3Ov r0 = r5.A1x
            int r4 = X.C64633Ov.A00(r0, r1)
            java.lang.String r3 = r0.A01(r4)
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            android.content.res.Resources r2 = X.C36341k9.A0G(r5)
            r1 = 2131755235(0x7f1000e3, float:1.9141344E38)
            java.lang.Object[] r0 = X.C36431kI.A1Z(r3, r0)
            java.lang.String r2 = r2.getQuantityString(r1, r4, r0)
            goto L_0x0018
        L_0x0082:
            X.0yC r0 = r5.A1g
            boolean r0 = X.C36431kI.A1X(r0)
            if (r0 == 0) goto L_0x0095
            X.0wo r1 = r5.A1A
            android.content.Context r0 = r5.A1D()
            java.lang.String r2 = X.AnonymousClass3SX.A01(r0, r1, r9)
            goto L_0x0018
        L_0x0095:
            java.lang.String r0 = r9.A0X
            java.lang.String r2 = "  "
            if (r0 == 0) goto L_0x0018
            java.lang.String r2 = X.C36321k7.A0D(r0, r2)
            goto L_0x0018
        L_0x00a1:
            r1.A0I(r2)
            r0 = 0
            if (r2 != 0) goto L_0x00a9
        L_0x00a7:
            r0 = 8
        L_0x00a9:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gc.A02(X.4Ph, X.3BE, X.141):void");
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0552, code lost:
        if (X.C36391kE.A1X(r8.A1g) == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x055c, code lost:
        if (r13.A09 == false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x066b, code lost:
        if (r7.A11 == false) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0778, code lost:
        if (r5 != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0919, code lost:
        if (r8.A30 != false) goto L_0x091b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0b7d, code lost:
        if (r4.A3A != false) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02de, code lost:
        if (r8.A3A != false) goto L_0x02e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x041b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r36, android.view.View r37, android.view.ViewGroup r38) {
        /*
            r35 = this;
            r2 = r37
            r3 = r35
            java.util.List r0 = r3.A02
            r1 = r36
            java.lang.Object r17 = r0.get(r1)
            r0 = r17
            X.4Ph r0 = (X.C87564Ph) r0
            r17 = r0
            boolean r1 = r0 instanceof X.C70213em
            r0 = 0
            r6 = r38
            if (r1 == 0) goto L_0x0046
            if (r37 != 0) goto L_0x002c
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            android.view.LayoutInflater r2 = r1.A0c()
            r1 = 2131625384(0x7f0e05a8, float:1.8877974E38)
            android.view.View r2 = r2.inflate(r1, r6, r0)
            r1 = 2
            X.C011504z.A06(r2, r1)
        L_0x002c:
            android.widget.TextView r4 = X.C36351kA.A0E(r2)
            X.C33511fU.A03(r4)
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            boolean r1 = r1.A35
            if (r1 == 0) goto L_0x003c
            r4.setSingleLine(r0)
        L_0x003c:
            r0 = r17
            X.3em r0 = (X.C70213em) r0
            java.lang.String r0 = r0.A00
            r4.setText(r0)
        L_0x0045:
            return r2
        L_0x0046:
            r1 = r17
            boolean r1 = r1 instanceof X.C70223en
            if (r1 == 0) goto L_0x006f
            if (r37 != 0) goto L_0x0062
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            android.view.LayoutInflater r2 = r1.A0c()
            r1 = 2131625379(0x7f0e05a3, float:1.8877964E38)
            android.view.View r2 = r2.inflate(r1, r6, r0)
            android.widget.TextView r0 = X.C36351kA.A0E(r2)
            X.C33511fU.A03(r0)
        L_0x0062:
            r1 = 34
            X.3YE r4 = new X.3YE
            r0 = r17
            r4.<init>(r3, r0, r1)
        L_0x006b:
            r2.setOnClickListener(r4)
            return r2
        L_0x006f:
            r1 = r17
            boolean r1 = r1 instanceof X.C70163eh
            if (r1 == 0) goto L_0x00b4
            if (r37 != 0) goto L_0x0088
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            android.view.LayoutInflater r2 = r1.A0c()
            r1 = 2131625378(0x7f0e05a2, float:1.8877962E38)
            android.view.View r2 = r2.inflate(r1, r6, r0)
            r1 = 2
            X.C011504z.A06(r2, r1)
        L_0x0088:
            com.whatsapp.contact.picker.ContactPickerFragment r6 = r3.A05
            X.19y r1 = r6.A1e
            android.content.SharedPreferences r4 = X.C238119y.A00(r1)
            java.lang.String r1 = "disappearing_mode_duration_for_chat_picker_int"
            int r5 = r4.getInt(r1, r0)
            r1 = 2131429991(0x7f0b0a67, float:1.848167E38)
            android.view.View r4 = r2.findViewById(r1)
            com.whatsapp.settings.SettingsRowIconText r4 = (com.whatsapp.settings.SettingsRowIconText) r4
            X.01I r1 = r6.A0h()
            if (r1 == 0) goto L_0x00ae
            if (r4 == 0) goto L_0x00ae
            java.lang.String r0 = X.AnonymousClass3TD.A01(r1, r5, r0, r0)
            r4.setSubText(r0)
        L_0x00ae:
            r0 = 8
            X.C67143Yr.A00(r2, r3, r5, r0)
            return r2
        L_0x00b4:
            r1 = r17
            boolean r1 = r1 instanceof X.C70173ei
            if (r1 == 0) goto L_0x00cf
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            android.view.LayoutInflater r2 = r1.A0c()
            r1 = 2131625381(0x7f0e05a5, float:1.8877968E38)
            android.view.View r2 = r2.inflate(r1, r6, r0)
            r0 = 36
            X.3Xx r4 = new X.3Xx
            r4.<init>(r3, r0)
            goto L_0x006b
        L_0x00cf:
            r1 = r17
            boolean r1 = r1 instanceof X.C70193ek
            if (r1 == 0) goto L_0x00fc
            if (r37 != 0) goto L_0x0045
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A05
            android.view.LayoutInflater r2 = r1.A0c()
            r1 = 2131624489(0x7f0e0229, float:1.887616E38)
            android.view.View r2 = r2.inflate(r1, r6, r0)
            X.C34081gQ.A02(r2)
            r0 = 2131431793(0x7f0b1171, float:1.8485325E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r2, r0)
            X.C33511fU.A03(r0)
            r1 = 37
            X.2i6 r4 = new X.2i6
            r0 = r17
            r4.<init>(r0, r3, r1)
            goto L_0x006b
        L_0x00fc:
            r5 = 1
            if (r37 == 0) goto L_0x0b57
            java.lang.Object r1 = r2.getTag()
            boolean r1 = r1 instanceof X.AnonymousClass3BE
            if (r1 == 0) goto L_0x0b57
            java.lang.Object r1 = r2.getTag()
            X.3BE r1 = (X.AnonymousClass3BE) r1
        L_0x010d:
            r2.setClickable(r0)
            r2.setLongClickable(r0)
            android.widget.ImageView r4 = r1.A05
            r29 = r4
            r10 = 8
            r4.setVisibility(r10)
            android.view.View r6 = r1.A00
            r6.setVisibility(r10)
            android.widget.TextView r4 = r1.A0A
            r28 = r4
            r4.setVisibility(r10)
            r4 = r17
            boolean r4 = r4 instanceof X.C70203el
            r9 = 0
            if (r4 == 0) goto L_0x01ba
            r6 = r17
            X.3el r6 = (X.C70203el) r6
            r4 = 2
            X.C011504z.A06(r2, r4)
            r2.setBackgroundResource(r0)
            r4 = r28
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r4 = r1.A0D
            r4.setVisibility(r10)
            android.widget.ImageView r5 = r1.A06
            r4 = 4
            r5.setVisibility(r4)
            X.3SF r4 = r1.A0E
            com.whatsapp.TextEmojiLabel r7 = r4.A01
            r7.A0C()
            java.lang.String r4 = r6.A00
            r7.setText(r4)
            com.whatsapp.contact.picker.ContactPickerFragment r8 = r3.A05
            android.content.Context r6 = r8.A1D()
            r4 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36331k8.A0r(r6, r7, r4)
            com.whatsapp.components.SelectionCheckView r4 = r1.A0F
            r4.A04(r0, r0)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A09
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A0B
            r4.setVisibility(r10)
            android.view.View r4 = r1.A02
            r4.setOnClickListener(r9)
            r5.setOnClickListener(r9)
            r4.setClickable(r0)
            r5.setClickable(r0)
        L_0x018e:
            boolean r4 = r8 instanceof com.whatsapp.payments.ui.IndiaPaymentMerchantContactPickerFragment
            if (r4 == 0) goto L_0x01b0
            X.141 r4 = r17.getContact()
            if (r4 == 0) goto L_0x01b4
            X.141 r4 = r17.getContact()
            boolean r4 = r4.A0N()
            if (r4 == 0) goto L_0x01b4
            X.0yC r3 = r3.A07
            int r3 = X.C55832vG.A00(r3)
            android.widget.ImageView r1 = r1.A01
            r1.setImageResource(r3)
            r1.setVisibility(r0)
        L_0x01b0:
            X.C012005e.A0V(r2, r9)
            return r2
        L_0x01b4:
            android.widget.ImageView r0 = r1.A01
            r0.setVisibility(r10)
            goto L_0x01b0
        L_0x01ba:
            r4 = r17
            boolean r4 = r4 instanceof X.C70253eq
            X.C011504z.A06(r2, r5)
            com.whatsapp.contact.picker.ContactPickerFragment r8 = r3.A05
            if (r4 == 0) goto L_0x0264
            X.01I r12 = r8.A0h()
            X.3SF r4 = r1.A0E
            com.whatsapp.TextEmojiLabel r6 = r4.A01
            X.C33511fU.A03(r6)
            r7 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r4 = 2131101134(0x7f0605ce, float:1.781467E38)
            X.C36321k7.A0M(r12, r6, r7, r4)
            com.whatsapp.TextEmojiLabel r7 = r1.A0D
            r7.A0C()
            r4 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r12, r7, r4)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A0B
            r4.setVisibility(r10)
            r4 = r28
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A09
            r4.setVisibility(r10)
            r4 = 2131886368(0x7f120120, float:1.9407313E38)
            r6.setText(r4)
            r6.A0E()
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r0)
            X.C36391kE.A1K(r4)
            r4 = 2131231773(0x7f08041d, float:1.8079636E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00E.A00(r12, r4)
            android.graphics.drawable.Drawable r11 = X.AnonymousClass08I.A01(r4)
            r6 = 2130970396(0x7f04071c, float:1.75495E38)
            r4 = 2131102021(0x7f060945, float:1.7816468E38)
            int r4 = X.C36351kA.A01(r12, r6, r4)
            X.AnonymousClass076.A06(r11, r4)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r0)
            r4.setImageDrawable(r11)
            r4.setFocusable(r0)
            r4.setClickable(r0)
            r4.setBackground(r9)
            r4.setBackground(r9)
            android.widget.ImageView r6 = r1.A06
            r4 = 2131231320(0x7f080258, float:1.8078718E38)
            r6.setImageResource(r4)
            r4 = 2131886367(0x7f12011f, float:1.940731E38)
            r7.setText(r4)
            boolean r4 = r8.A23()
            if (r4 != 0) goto L_0x024c
            r2.setPadding(r0, r0, r0, r0)
        L_0x024c:
            boolean r4 = r3.A03
            if (r4 != 0) goto L_0x018e
            r3.A03 = r5
            X.0v5 r5 = r8.A0I
            boolean r4 = r5.A05()
            if (r4 == 0) goto L_0x018e
            r5.A02()
            java.lang.String r0 = "logEntrypointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0264:
            X.01I r11 = r8.A0h()
            X.141 r7 = r17.getContact()
            X.C18740tg.A06(r7)
            android.widget.ImageView r12 = r1.A06
            r12.setVisibility(r0)
            r12.setEnabled(r5)
            boolean r4 = r8.A23()
            if (r4 != 0) goto L_0x0285
            android.widget.ImageView r5 = r1.A07
            r4 = 2131233671(0x7f080b87, float:1.8083486E38)
            X.C36371kC.A13(r11, r5, r4)
        L_0x0285:
            X.3SF r4 = r1.A0E
            r21 = r4
            r5 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r4 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r5 = X.C36351kA.A01(r11, r5, r4)
            r4 = r21
            com.whatsapp.TextEmojiLabel r4 = r4.A01
            r27 = r4
            r4.setTextColor(r5)
            X.0V9 r4 = r8.A0E
            if (r4 != 0) goto L_0x0b47
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C177528dw
            if (r4 != 0) goto L_0x0b47
            boolean r4 = r8.A36
            if (r4 != 0) goto L_0x02ae
            boolean r4 = r8.A31
            if (r4 == 0) goto L_0x0b47
        L_0x02ae:
            r5 = 12
            X.2iI r4 = new X.2iI
            r4.<init>(r7, r3, r12, r5)
            android.view.View r5 = r1.A02
            r5.setOnClickListener(r4)
            r12.setOnClickListener(r4)
            X.171 r4 = r8.A0p
            java.lang.String r4 = r4.A0H(r7)
            r12.setContentDescription(r4)
        L_0x02c6:
            r4 = r17
            boolean r4 = r4 instanceof X.C43272Fy
            r20 = r4
            if (r4 == 0) goto L_0x0a6a
            r4 = r17
            X.2Fy r4 = (X.C43272Fy) r4
            r18 = r4
            boolean r4 = r8.A36
            r14 = r4
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x02e0
            boolean r4 = r8.A3A
            r13 = 0
            if (r4 == 0) goto L_0x02e1
        L_0x02e0:
            r13 = 1
        L_0x02e1:
            r4 = r18
            java.util.List r4 = r4.A00
            r16 = r4
            int r6 = r16.size()
            r4 = 1
            if (r6 <= r4) goto L_0x0a63
            android.content.Context r6 = r8.A1D()
            X.0ts r4 = r8.A1D
            java.lang.String r6 = X.AnonymousClass171.A02(r6, r4, r7)
            r4 = r28
            r4.setText(r6)
            r6 = 2131100165(0x7f060205, float:1.7812704E38)
            X.C36331k8.A0r(r11, r4, r6)
            r4.setVisibility(r0)
        L_0x0306:
            android.widget.LinearLayout r4 = r1.A08
            r4.setVisibility(r0)
            android.widget.TextView r4 = r1.A0B
            r15 = r4
            r4.setVisibility(r0)
            r4.setClickable(r0)
            r4.setFocusable(r0)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            if (r14 != 0) goto L_0x0330
            if (r13 == 0) goto L_0x0a55
            X.0yC r4 = r3.A07
            r6 = 6741(0x1a55, float:9.446E-42)
            int r4 = r4.A07(r6)
            r6 = 1
            if (r4 != r6) goto L_0x0a55
        L_0x0330:
            com.whatsapp.TextEmojiLabel r4 = r1.A0D
            r4.setVisibility(r10)
            r4 = r28
            r4.setVisibility(r10)
            int r4 = r16.size()
            r13 = 1
            r6 = 37
            if (r4 <= r13) goto L_0x0a5c
            r4 = 27
            X.3Yo r13 = new X.3Yo
            r6 = r18
            r13.<init>((java.lang.Object) r3, (java.lang.Object) r7, (java.lang.Object) r6, (int) r4)
        L_0x034c:
            r15.setOnClickListener(r13)
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            X.C33511fU.A03(r15)
        L_0x0357:
            r4 = r17
            boolean r4 = r4 instanceof X.C70233eo
            if (r4 == 0) goto L_0x0375
            X.141 r4 = r17.getContact()
            X.C18740tg.A06(r4)
            boolean r4 = r4.A0C()
            if (r4 == 0) goto L_0x0375
            r4 = r28
            r4.setVisibility(r0)
            r6 = 2131890674(0x7f1211f2, float:1.9416046E38)
            r4.setText(r6)
        L_0x0375:
            X.C33511fU.A03(r27)
            X.1RY r4 = r8.A0r
            if (r4 == 0) goto L_0x037f
            r4.A0B(r12, r7, r0)
        L_0x037f:
            com.whatsapp.TextEmojiLabel r6 = r1.A0D
            X.11F r4 = r7.A0H
            r6.setTag(r4)
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C177528dw
            if (r4 == 0) goto L_0x0526
            r5 = 2131891208(0x7f121408, float:1.941713E38)
            r4 = r27
            r4.setText(r5)
            r27.A0E()
            android.widget.TextView r4 = r1.A0C
            X.C36391kE.A1K(r4)
            android.widget.ImageView r13 = r1.A07
            r13.setVisibility(r0)
            r4 = 2131232508(0x7f0806fc, float:1.8081127E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00E.A00(r11, r4)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass08I.A01(r4)
            r5 = 2130970396(0x7f04071c, float:1.75495E38)
            r4 = 2131102021(0x7f060945, float:1.7816468E38)
            int r4 = X.C36351kA.A01(r11, r5, r4)
            X.AnonymousClass076.A06(r14, r4)
            r13.setImageDrawable(r14)
            r4 = 2131896773(0x7f1229c5, float:1.9428417E38)
            X.C36421kH.A0z(r13, r8, r4)
            r4 = 37
            X.C66943Xx.A00(r13, r3, r4)
            r13.setFocusable(r0)
            X.3XT r13 = r8.A1W
            int r5 = r13.A00
            if (r5 == 0) goto L_0x0509
            r4 = 1
            if (r5 == r4) goto L_0x050d
            r4 = 2
            if (r5 != r4) goto L_0x0c9b
            java.util.List r4 = r13.A02
            int r13 = r4.size()
            if (r13 == 0) goto L_0x0509
            X.0ts r4 = r8.A1D
            r15 = r4
            r16 = 2131755315(0x7f100133, float:1.9141506E38)
        L_0x03e4:
            long r4 = (long) r13
            r18 = r4
            java.lang.Object[] r14 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1L(r14, r13, r0)
            r4 = r18
            r13 = r16
            java.lang.String r14 = r15.A0L(r14, r13, r4)
        L_0x03f6:
            X.3XT r4 = r8.A1W
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0412
            X.1Ua r4 = r3.A0B
            boolean r4 = r4.A00()
            if (r4 == 0) goto L_0x0412
            android.content.Context r5 = r8.A0a()
            r4 = 2131101132(0x7f0605cc, float:1.7814665E38)
            r13 = 2131167390(0x7f07089e, float:1.7949052E38)
            android.text.SpannableStringBuilder r14 = X.AnonymousClass6Y4.A00(r5, r14, r13, r4)
        L_0x0412:
            r6.setText(r14)
            boolean r4 = r8.A23()
            if (r4 != 0) goto L_0x041e
            r2.setPadding(r0, r0, r0, r0)
        L_0x041e:
            r8.A0A = r2
        L_0x0420:
            java.util.Map r4 = r8.A3o
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r4)
            java.lang.Class<X.11F> r5 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r4 = r7.A06(r5)
            boolean r13 = r13.containsKey(r4)
            boolean r4 = r8 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r4 == 0) goto L_0x0441
            r4 = r8
            com.whatsapp.contact.picker.VoipContactPickerFragment r4 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r4
            X.00T r4 = r4.A06
            boolean r4 = X.C36331k8.A1b(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x044a
        L_0x0441:
            if (r13 == 0) goto L_0x0506
            int r4 = X.C36391kE.A08(r2)
        L_0x0447:
            r2.setBackgroundResource(r4)
        L_0x044a:
            java.util.Set r4 = r8.A3q
            r14 = r4
            com.whatsapp.jid.Jid r4 = r7.A06(r5)
            boolean r14 = r14.remove(r4)
            com.whatsapp.components.SelectionCheckView r4 = r1.A0F
            r15 = r4
            if (r14 == 0) goto L_0x0501
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            X.3ZV r14 = new X.3ZV
            r14.<init>(r3, r1, r13)
            r4.addOnPreDrawListener(r14)
        L_0x0466:
            boolean r4 = r8.A33
            if (r4 == 0) goto L_0x04b4
            java.util.Set r4 = r8.A3p
            java.util.Set r13 = java.util.Collections.unmodifiableSet(r4)
            com.whatsapp.jid.Jid r4 = r7.A06(r5)
            boolean r4 = r13.contains(r4)
            if (r4 == 0) goto L_0x04b4
            android.widget.LinearLayout r4 = r1.A08
            r4.setVisibility(r10)
            r4 = r28
            r4.setVisibility(r10)
            boolean r4 = r8.A22()
            if (r4 != 0) goto L_0x0493
            r6.setVisibility(r0)
            r4 = 2131888239(0x7f12086f, float:1.9411108E38)
            r6.setText(r4)
        L_0x0493:
            r4 = 2131101126(0x7f0605c6, float:1.7814653E38)
            int r11 = X.AnonymousClass00F.A00(r11, r4)
            r6.A0B()
            r6.setTextColor(r11)
            r4 = r27
            r4.setTextColor(r11)
            android.widget.TextView r4 = r1.A0C
            r4.setTextColor(r11)
            r12.setEnabled(r0)
            r4 = 1
            r2.setClickable(r4)
            r2.setLongClickable(r4)
        L_0x04b4:
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x04c0
            boolean r4 = r8.A38
            if (r4 != 0) goto L_0x04c0
            boolean r4 = r8.A3A
            if (r4 == 0) goto L_0x04e7
        L_0x04c0:
            android.widget.ImageView r6 = r1.A04
            if (r6 == 0) goto L_0x04e7
            X.12q r12 = r8.A1N
            X.16D r11 = r8.A0j
            X.11F r4 = X.C36441kJ.A0k(r7, r5)
            int r5 = X.AnonymousClass3TD.A00(r11, r12, r4)
            r4 = 8
            if (r5 <= 0) goto L_0x04d5
            r4 = 0
        L_0x04d5:
            r6.setVisibility(r4)
            X.0ts r4 = r8.A1D
            java.lang.String r4 = X.AnonymousClass3TD.A02(r4, r5)
            r6.setContentDescription(r4)
            r4 = 2131232159(0x7f08059f, float:1.808042E38)
            r6.setImageResource(r4)
        L_0x04e7:
            boolean r4 = r8.A3B
            if (r4 == 0) goto L_0x018e
            X.141 r4 = r17.getContact()
            if (r4 == 0) goto L_0x018e
            r17.getContact()
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            X.13r r4 = com.whatsapp.jid.UserJid.Companion
            r5 = 1
            r15.setEnabled(r5)
            goto L_0x018e
        L_0x0501:
            r4.A04(r13, r0)
            goto L_0x0466
        L_0x0506:
            r4 = 0
            goto L_0x0447
        L_0x0509:
            r4 = 2131894050(0x7f121f22, float:1.9422894E38)
            goto L_0x0518
        L_0x050d:
            java.util.List r4 = r13.A01
            int r13 = r4.size()
            if (r13 != 0) goto L_0x051e
            r4 = 2131891591(0x7f121587, float:1.9417906E38)
        L_0x0518:
            java.lang.String r14 = r8.A0n(r4)
            goto L_0x03f6
        L_0x051e:
            X.0ts r4 = r8.A1D
            r15 = r4
            r16 = 2131755316(0x7f100134, float:1.9141508E38)
            goto L_0x03e4
        L_0x0526:
            android.content.res.Resources r4 = X.C36341k9.A0G(r8)
            r13 = 2131166971(0x7f0706fb, float:1.7948202E38)
            int r4 = r4.getDimensionPixelSize(r13)
            r2.setPadding(r0, r0, r4, r0)
            X.3L0 r13 = r7.A0E
            X.0wQ r4 = r8.A0R
            boolean r4 = X.C36361kB.A1X(r4, r7)
            if (r4 == 0) goto L_0x0554
            boolean r4 = r8.A36
            if (r4 != 0) goto L_0x054a
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x054a
            boolean r4 = r8.A3A
            if (r4 == 0) goto L_0x0554
        L_0x054a:
            X.0yC r4 = r8.A1g
            boolean r4 = X.C36391kE.A1X(r4)
            r19 = 1
            if (r4 != 0) goto L_0x0556
        L_0x0554:
            r19 = 0
        L_0x0556:
            if (r13 == 0) goto L_0x055e
            boolean r4 = r13.A09
            r18 = 1
            if (r4 != 0) goto L_0x0560
        L_0x055e:
            r18 = 0
        L_0x0560:
            if (r19 == 0) goto L_0x0782
            java.util.ArrayList r4 = r8.A2i
            if (r4 != 0) goto L_0x077c
            r16 = 0
        L_0x0568:
            r13 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r15 = r13
            r14 = r4
            r13 = r21
            r4 = r16
            r13.A07(r7, r15, r4, r14)
        L_0x0574:
            boolean r4 = r7.A0G()
            if (r4 != 0) goto L_0x059a
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C177618e5
            if (r4 != 0) goto L_0x059a
            boolean r4 = r8.A35
            if (r4 == 0) goto L_0x07b4
            boolean r4 = r7.A0G()
            if (r4 != 0) goto L_0x07b4
            com.whatsapp.jid.UserJid r13 = X.C36391kE.A0i(r7)
            if (r13 == 0) goto L_0x059a
            X.1Jx r4 = r3.A09
            boolean r4 = r4.A01(r13)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x07b4
        L_0x059a:
            boolean r4 = r8.A35
            r19 = 0
            if (r4 == 0) goto L_0x05be
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C177618e5
            if (r4 != 0) goto L_0x05bc
            boolean r4 = r7.A0G()
            if (r4 != 0) goto L_0x0703
            com.whatsapp.jid.UserJid r5 = X.C36391kE.A0i(r7)
            if (r5 == 0) goto L_0x05bc
            X.1Jx r4 = r3.A09
            boolean r4 = r4.A01(r5)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0703
        L_0x05bc:
            r19 = 1
        L_0x05be:
            java.lang.String r15 = ""
            r5 = 1
            if (r19 == 0) goto L_0x061d
            r4 = 2131888607(0x7f1209df, float:1.9411854E38)
            r12.setEnabled(r0)
            r2.setClickable(r5)
            r2.setLongClickable(r5)
            r6.setText(r4)
            r6.setSingleLine(r0)
            r6.A0B()
            android.view.ViewGroup$LayoutParams r9 = r12.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9
            r4 = 49
            r9.gravity = r4
            android.content.res.Resources r4 = r11.getResources()
            r5 = 2131166311(0x7f070467, float:1.7946864E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r9.topMargin = r4
            r12.setLayoutParams(r9)
            int r5 = X.C36361kB.A02(r11, r5)
            r4 = r27
            r4.setPadding(r0, r5, r0, r0)
            r4 = 2131101126(0x7f0605c6, float:1.7814653E38)
        L_0x05fe:
            int r5 = X.AnonymousClass00F.A00(r11, r4)
            r4 = r27
            r4.setTextColor(r5)
            X.05b r9 = r3.A00
            if (r9 != 0) goto L_0x0613
            r4 = 6
            X.4Vc r9 = new X.4Vc
            r9.<init>(r3, r4)
            r3.A00 = r9
        L_0x0613:
            android.widget.TextView r5 = r1.A0C
            r5.setText(r15)
            r2.setLongClickable(r0)
            goto L_0x0420
        L_0x061d:
            boolean r4 = r8.A3A
            if (r4 != 0) goto L_0x062d
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x062d
            boolean r4 = r8.A38
            if (r4 != 0) goto L_0x062d
            boolean r4 = r8.A39
            if (r4 == 0) goto L_0x06c1
        L_0x062d:
            boolean r4 = r7.A0G()
            if (r4 == 0) goto L_0x06c1
            X.17X r4 = r8.A1Q
            r16 = r4
            java.lang.Class<com.whatsapp.jid.GroupJid> r14 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r13 = r7.A06(r14)
            com.whatsapp.jid.GroupJid r13 = (com.whatsapp.jid.GroupJid) r13
            r4 = r16
            boolean r4 = r4.A0C(r13)
            if (r4 == 0) goto L_0x066d
            X.1EM r4 = r3.A0A
            r16 = r4
            java.lang.Class<X.147> r4 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r13 = X.C36381kD.A0e(r7, r4)
            X.11F r13 = (X.AnonymousClass11F) r13
            r4 = r16
            boolean r4 = r4.A04(r7, r13)
            if (r4 != 0) goto L_0x066d
            X.0yf r4 = r8.A0T
            X.0yi r13 = X.C21100yf.A0x
            boolean r4 = r4.A09(r13)
            if (r4 == 0) goto L_0x06c1
            boolean r4 = r8.A2s
            if (r4 == 0) goto L_0x06c1
            boolean r4 = r7.A11
            if (r4 == 0) goto L_0x06c1
        L_0x066d:
            X.17X r9 = r8.A1Q
            com.whatsapp.jid.Jid r4 = r7.A06(r14)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            boolean r4 = r9.A0C(r4)
            if (r4 != 0) goto L_0x069c
            boolean r4 = r7.A0i
            r9 = 2131891659(0x7f1215cb, float:1.9418044E38)
            if (r4 == 0) goto L_0x0685
            r9 = 2131887536(0x7f1205b0, float:1.9409682E38)
        L_0x0685:
            r12.setEnabled(r0)
            r2.setClickable(r5)
            r2.setLongClickable(r5)
            r6.setText(r9)
            r6.A0B()
            r4 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.C36331k8.A0r(r11, r6, r4)
            goto L_0x05fe
        L_0x069c:
            boolean r4 = r8.A2s
            if (r4 == 0) goto L_0x06b2
            boolean r4 = r7.A11
            if (r4 == 0) goto L_0x06b2
            X.0yf r9 = r8.A0T
            X.0yi r4 = X.C21100yf.A0x
            boolean r4 = r9.A09(r4)
            if (r4 == 0) goto L_0x06b2
            r9 = 2131891598(0x7f12158e, float:1.941792E38)
            goto L_0x0685
        L_0x06b2:
            X.1EL r4 = r8.A1n
            boolean r4 = r4.A01(r7)
            r9 = 2131891817(0x7f121669, float:1.9418365E38)
            if (r4 == 0) goto L_0x0685
            r9 = 2131894757(0x7f1221e5, float:1.9424328E38)
            goto L_0x0685
        L_0x06c1:
            X.171 r13 = r8.A0p
            java.lang.Class<X.144> r4 = X.AnonymousClass144.class
            com.whatsapp.jid.Jid r5 = r7.A06(r4)
            java.util.concurrent.ConcurrentHashMap r4 = r13.A08
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x06f2
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C177618e5
            if (r4 == 0) goto L_0x06f0
            boolean r4 = X.C36421kH.A1Y(r7)
            if (r4 == 0) goto L_0x06f0
            java.util.ArrayList r4 = r8.A2i
            if (r4 == 0) goto L_0x06f0
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
        L_0x06eb:
            r6.A0J(r5, r4, r0, r0)
            goto L_0x0613
        L_0x06f0:
            r4 = 0
            goto L_0x06eb
        L_0x06f2:
            r6.setText(r15)
            X.0wU r13 = r8.A2L
            X.171 r5 = r8.A0p
            X.2im r4 = new X.2im
            r4.<init>(r6, r5, r7)
            X.C36391kE.A1Q(r4, r13)
            goto L_0x0613
        L_0x0703:
            X.1NN r4 = r3.A08
            r20 = r4
            java.lang.Class<X.147> r18 = X.AnonymousClass147.class
            r4 = r18
            com.whatsapp.jid.Jid r16 = X.C36381kD.A0e(r7, r4)
            r4 = r16
            X.147 r4 = (X.AnonymousClass147) r4
            r16 = r4
            r4 = r20
            X.17X r5 = r4.A02
            r4 = r16
            X.0y7 r4 = X.C36381kD.A0R(r5, r4)
            X.14x r15 = r4.iterator()
            r14 = 0
        L_0x0724:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x0746
            java.lang.Object r13 = r15.next()
            X.6PM r13 = (X.AnonymousClass6PM) r13
            r4 = r20
            X.185 r4 = r4.A00
            r5 = r4
            com.whatsapp.jid.UserJid r4 = r13.A03
            boolean r4 = r5.A04(r4)
            if (r4 == 0) goto L_0x0743
            int r13 = r13.A01
            r5 = 2
            r4 = 1
            if (r13 == r5) goto L_0x0744
        L_0x0743:
            r4 = 0
        L_0x0744:
            r14 = r14 | r4
            goto L_0x0724
        L_0x0746:
            r13 = r20
            r4 = r16
            boolean r4 = r13.A01(r7, r4, r14)
            r14 = r4 ^ 1
            X.17X r5 = r8.A1Q
            java.lang.Class<com.whatsapp.jid.GroupJid> r4 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r4 = r7.A06(r4)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            boolean r4 = r5.A0C(r4)
            r13 = r4 ^ 1
            X.1EM r5 = r3.A0A
            r4 = r18
            com.whatsapp.jid.Jid r4 = X.C36381kD.A0e(r7, r4)
            X.11F r4 = (X.AnonymousClass11F) r4
            boolean r5 = r5.A04(r7, r4)
            boolean r4 = r7.A0G()
            if (r4 == 0) goto L_0x05be
            if (r14 != 0) goto L_0x05bc
            if (r13 != 0) goto L_0x05bc
            if (r5 == 0) goto L_0x05be
            goto L_0x05bc
        L_0x077c:
            java.util.List r16 = java.util.Collections.unmodifiableList(r4)
            goto L_0x0568
        L_0x0782:
            boolean r13 = X.C36431kI.A1W(r7)
            java.util.ArrayList r4 = r8.A2i
            if (r4 != 0) goto L_0x07a8
            r14 = 0
        L_0x078b:
            if (r13 == 0) goto L_0x07ad
            r4 = r21
            X.171 r4 = r4.A02
            r13 = r4
            r4 = 6
            X.34G r22 = r13.A0C(r7, r4)
            r4 = r21
            boolean r26 = r4.A0A(r7)
            r25 = 6
            r23 = r7
            r24 = r14
            r21.A04(r22, r23, r24, r25, r26)
            goto L_0x0574
        L_0x07a8:
            java.util.List r14 = java.util.Collections.unmodifiableList(r4)
            goto L_0x078b
        L_0x07ad:
            r13 = r21
            r13.A08(r7, r14)
            goto L_0x0574
        L_0x07b4:
            if (r20 == 0) goto L_0x07c9
            X.11F r4 = X.C36351kA.A0j(r7)
            java.lang.String r4 = X.AnonymousClass3U8.A04(r4)
            r6.setText(r4)
            r2.setLongClickable(r0)
            r2.setClickable(r0)
            goto L_0x0420
        L_0x07c9:
            X.11F r4 = r7.A0H
            boolean r4 = r4 instanceof X.C28981Uw
            if (r4 == 0) goto L_0x0828
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            java.util.HashSet r4 = r8.A3l
            java.util.Iterator r13 = r4.iterator()
        L_0x07da:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0821
            X.1Tc r5 = r8.A1w
            int r4 = X.C36341k9.A0A(r13)
            boolean r4 = r5.A03(r4)
            if (r4 != 0) goto L_0x07da
            boolean r4 = r8.A3A
            if (r4 != 0) goto L_0x07f8
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x07f8
            boolean r4 = r8.A38
            if (r4 == 0) goto L_0x0821
        L_0x07f8:
            r4 = 1
            r2.setClickable(r4)
            r2.setLongClickable(r0)
            r4 = 2131891443(0x7f1214f3, float:1.9417606E38)
            r6.setText(r4)
            r6.A0B()
            r5 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.C36331k8.A0r(r11, r6, r5)
            r4 = r27
            X.C36331k8.A0r(r11, r4, r5)
            X.05b r9 = r3.A00
            if (r9 != 0) goto L_0x0420
            r4 = 6
            X.4Vc r9 = new X.4Vc
            r9.<init>(r3, r4)
            r3.A00 = r9
            goto L_0x0420
        L_0x0821:
            r4 = r17
            r3.A02(r4, r1, r7)
            goto L_0x0420
        L_0x0828:
            X.1NG r4 = r8.A0Z
            boolean r4 = X.C36331k8.A1Y(r4, r7)
            if (r4 == 0) goto L_0x0883
            r6.setVisibility(r0)
            r4 = 2131101126(0x7f0605c6, float:1.7814653E38)
            int r9 = X.AnonymousClass00F.A00(r11, r4)
            r4 = 2131894892(0x7f12226c, float:1.9424602E38)
            r6.setText(r4)
            r6.setTextColor(r9)
            r6.A0B()
            r4 = r27
            r4.setTextColor(r9)
            r4 = 1056964608(0x3f000000, float:0.5)
            r12.setAlpha(r4)
            r4 = 0
            r5.setOnClickListener(r4)
            r12.setOnClickListener(r4)
            r5.setClickable(r0)
            r12.setClickable(r0)
            X.05b r9 = r3.A01
            if (r9 != 0) goto L_0x0869
            r4 = 5
            X.4Vc r9 = new X.4Vc
            r9.<init>(r3, r4)
            r3.A01 = r9
        L_0x0869:
            boolean r4 = r8 instanceof com.whatsapp.payments.ui.PaymentContactPickerFragment
            if (r4 == 0) goto L_0x0a2f
            r4 = r8
            com.whatsapp.payments.ui.PaymentContactPickerFragment r4 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r4
            X.6O3 r13 = r4.A04
            if (r13 == 0) goto L_0x0a2f
            X.0wo r4 = r4.A1A
            long r4 = X.C36371kC.A09(r4)
            int r5 = r13.A00(r4)
            r4 = 1
            if (r5 != r4) goto L_0x0a2f
            goto L_0x0420
        L_0x0883:
            boolean r13 = r8 instanceof com.whatsapp.payments.ui.PaymentContactPickerFragment
            if (r13 == 0) goto L_0x08e5
            r14 = r8
            com.whatsapp.payments.ui.PaymentContactPickerFragment r14 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r14
            X.1EV r4 = r14.A02
            r5 = r4
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0l(r7)
            int r5 = r5.A06(r4)
            r15 = 0
            r4 = 2
            if (r5 == r4) goto L_0x08a0
            r4 = 2131888243(0x7f120873, float:1.9411116E38)
            java.lang.String r15 = r14.A0n(r4)
        L_0x08a0:
            boolean r4 = android.text.TextUtils.isEmpty(r15)
            if (r4 != 0) goto L_0x08e7
            if (r13 == 0) goto L_0x08e3
            r13 = r8
            com.whatsapp.payments.ui.PaymentContactPickerFragment r13 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r13
            X.1EV r5 = r13.A02
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0l(r7)
            int r9 = r5.A06(r4)
            r5 = 2
            r4 = 0
            if (r9 == r5) goto L_0x08c0
            r4 = 2131888243(0x7f120873, float:1.9411116E38)
            java.lang.String r4 = r13.A0n(r4)
        L_0x08c0:
            r6.setText(r4)
            r6.setVisibility(r0)
            r5 = 2131101126(0x7f0605c6, float:1.7814653E38)
            r4 = r27
            X.C36331k8.A0r(r11, r4, r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r4)
            r2.setLongClickable(r0)
            X.05b r9 = r3.A00
            if (r9 != 0) goto L_0x0869
            r4 = 6
            X.4Vc r9 = new X.4Vc
            r9.<init>(r3, r4)
            r3.A00 = r9
            goto L_0x0869
        L_0x08e3:
            r4 = 0
            goto L_0x08c0
        L_0x08e5:
            r15 = 0
            goto L_0x08a0
        L_0x08e7:
            r4 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r4)
            if (r19 == 0) goto L_0x0900
            r4 = 2131891082(0x7f12138a, float:1.9416874E38)
        L_0x08f1:
            java.lang.String r4 = r11.getString(r4)
            r6.A0I(r4)
            r6.setVisibility(r0)
        L_0x08fb:
            r2.setLongClickable(r0)
            goto L_0x0869
        L_0x0900:
            if (r18 == 0) goto L_0x0906
            r4 = 2131887016(0x7f1203a8, float:1.9408627E38)
            goto L_0x08f1
        L_0x0906:
            boolean r4 = r8.A1z()
            if (r4 != 0) goto L_0x091b
            if (r13 != 0) goto L_0x0916
            boolean r4 = r8 instanceof com.whatsapp.payments.ui.IndiaPaymentMerchantContactPickerFragment
            if (r4 != 0) goto L_0x0916
            boolean r4 = r8.A36
            if (r4 != 0) goto L_0x091b
        L_0x0916:
            boolean r5 = r8.A30
            r4 = 0
            if (r5 == 0) goto L_0x091c
        L_0x091b:
            r4 = 1
        L_0x091c:
            r20 = 8
            if (r4 == 0) goto L_0x0954
            java.lang.String r4 = r7.A0X
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0954
            X.0yC r4 = r3.A07
            boolean r4 = X.C36431kI.A1X(r4)
            if (r4 == 0) goto L_0x0950
            X.0wo r5 = r3.A06
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = X.AnonymousClass3SX.A01(r4, r5, r7)
            boolean r4 = X.AnonymousClass14B.A0F(r5)
            if (r4 != 0) goto L_0x0950
            r6.A0I(r5)
            r6.setVisibility(r0)
            r4 = 1
            r6.setMaxLines(r4)
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r4)
            goto L_0x08fb
        L_0x0950:
            r6.setVisibility(r10)
            goto L_0x08fb
        L_0x0954:
            if (r13 == 0) goto L_0x09ce
            r5 = r8
            com.whatsapp.payments.ui.PaymentContactPickerFragment r5 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r5
            com.whatsapp.jid.UserJid r19 = X.C36351kA.A0l(r7)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r4 = r5.A06
            r18 = r4
            if (r4 == 0) goto L_0x09ce
            java.util.Map r4 = r5.A08
            r22 = r4
            r4 = r18
            X.1YQ r4 = r4.A06
            X.6O3 r15 = r4.A01()
            r4 = r18
            X.1EU r4 = r4.A05
            X.B66 r4 = r4.A05()
            X.9Yc r16 = r4.BFZ()
            if (r16 == 0) goto L_0x09ce
            r4 = r16
            X.0yC r4 = r4.A07
            r21 = r4
            r4 = 979(0x3d3, float:1.372E-42)
            r5 = r4
            r4 = r21
            boolean r4 = r4.A0E(r5)
            if (r4 != 0) goto L_0x09ce
            r5 = r18
            r4 = r16
            boolean r4 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A02(r4, r15, r5)
            if (r4 == 0) goto L_0x09ce
            r5 = r22
            r4 = r19
            java.lang.Object r14 = r5.get(r4)
            r4 = r14
            X.8ax r4 = (X.C175728ax) r4
            r14 = r4
            r4 = 842(0x34a, float:1.18E-42)
            r5 = r4
            r4 = r21
            boolean r4 = r4.A0E(r5)
            if (r4 == 0) goto L_0x09ce
            X.9dE r4 = r15.A01
            if (r4 == 0) goto L_0x09ce
            r15 = r14
            r14 = r19
            r5 = r16
            int r5 = r5.A02(r15, r14, r4)
            r4 = 1
            if (r5 != r4) goto L_0x09ce
            r6.setVisibility(r10)
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            r4 = r29
            r4.setVisibility(r0)
            goto L_0x08fb
        L_0x09ce:
            boolean r4 = r8.A22()
            if (r4 == 0) goto L_0x0a28
            if (r13 == 0) goto L_0x0a14
            r14 = r8
            com.whatsapp.payments.ui.PaymentContactPickerFragment r14 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r14
            boolean r4 = r14 instanceof com.whatsapp.payments.ui.IndiaUpiContactPickerFragment
            if (r4 == 0) goto L_0x0a08
            X.0yC r5 = r14.A1g
            r4 = 3619(0xe23, float:5.071E-42)
            boolean r4 = r5.A0E(r4)
            r13 = 0
            if (r4 != 0) goto L_0x09f6
            int r5 = r14.A25(r7)
            r4 = 2
            if (r5 != r4) goto L_0x09f6
            r4 = 2131892167(0x7f1217c7, float:1.9419075E38)
        L_0x09f2:
            java.lang.String r13 = r14.A0n(r4)
        L_0x09f6:
            r6.setText(r13)
            boolean r4 = android.text.TextUtils.isEmpty(r13)
            if (r4 != 0) goto L_0x0a01
            r20 = 0
        L_0x0a01:
            r4 = r20
            r6.setVisibility(r4)
            goto L_0x08fb
        L_0x0a08:
            int r5 = r14.A25(r7)
            r13 = 0
            r4 = 2
            if (r5 != r4) goto L_0x09f6
            r4 = 2131892462(0x7f1218ee, float:1.9419673E38)
            goto L_0x09f2
        L_0x0a14:
            boolean r4 = r8 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r4 == 0) goto L_0x0a26
            r4 = r8
            com.whatsapp.contact.picker.VoipContactPickerFragment r4 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r4
            X.00T r4 = r4.A06
            boolean r5 = X.C36331k8.A1b(r4)
            java.lang.String r4 = "Status message should not be overridden when multiselect is disabled"
            X.C18740tg.A0D(r5, r4)
        L_0x0a26:
            r13 = 0
            goto L_0x09f6
        L_0x0a28:
            r4 = r17
            r3.A02(r4, r1, r7)
            goto L_0x08fb
        L_0x0a2f:
            boolean r4 = r8.A34
            if (r4 != 0) goto L_0x0a37
            boolean r4 = r8.A3A
            if (r4 == 0) goto L_0x0a42
        L_0x0a37:
            X.0yC r5 = r3.A07
            r4 = 6741(0x1a55, float:9.446E-42)
            int r5 = r5.A07(r4)
            r4 = 1
            if (r5 == r4) goto L_0x0420
        L_0x0a42:
            android.content.Context r5 = r8.A1D()
            X.0ts r4 = r8.A1D
            java.lang.String r5 = X.AnonymousClass171.A02(r5, r4, r7)
            if (r5 == 0) goto L_0x0420
            android.widget.TextView r4 = r1.A0C
            r4.setText(r5)
            goto L_0x0420
        L_0x0a55:
            com.whatsapp.TextEmojiLabel r4 = r1.A0D
            r4.setVisibility(r0)
            r6 = 38
        L_0x0a5c:
            X.3YE r13 = new X.3YE
            r13.<init>(r3, r7, r6)
            goto L_0x034c
        L_0x0a63:
            r4 = r28
            r4.setVisibility(r10)
            goto L_0x0306
        L_0x0a6a:
            boolean r4 = r8.A31
            if (r4 == 0) goto L_0x0acf
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A0B
            r4.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r13 = r1.A0D
            r13.A0C()
            r4 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r11, r13, r4)
            X.05b r6 = r3.A00
            if (r6 != 0) goto L_0x0a8f
            r4 = 6
            X.4Vc r6 = new X.4Vc
            r6.<init>(r3, r4)
            r3.A00 = r6
        L_0x0a8f:
            X.1NG r4 = r8.A0Z
            boolean r4 = X.C36331k8.A1Y(r4, r7)
            if (r4 == 0) goto L_0x0ab2
            r4 = r28
            r4.setVisibility(r10)
            r13.setVisibility(r0)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r10)
            r4.setOnClickListener(r9)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            r4.setOnClickListener(r9)
        L_0x0aaf:
            r9 = r6
            goto L_0x0357
        L_0x0ab2:
            android.widget.ImageView r9 = r1.A07
            r9.setVisibility(r0)
            r4 = 35
            X.AnonymousClass3YE.A00(r9, r3, r7, r4)
            android.widget.ImageView r9 = r1.A03
            r9.setVisibility(r0)
            r4 = 36
            X.AnonymousClass3YE.A00(r9, r3, r7, r4)
            r13.setVisibility(r10)
            r4 = r28
            r4.setVisibility(r10)
            goto L_0x0aaf
        L_0x0acf:
            boolean r4 = r8.A33
            if (r4 == 0) goto L_0x0af8
            android.widget.TextView r4 = r1.A0C
            r4.setVisibility(r10)
            android.widget.LinearLayout r4 = r1.A08
            r4.setVisibility(r0)
            android.widget.TextView r4 = r1.A0B
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r4 = r1.A0D
            r4.setVisibility(r10)
            r4 = r28
            r4.setVisibility(r10)
            goto L_0x0357
        L_0x0af8:
            boolean r4 = r8.A36
            if (r4 == 0) goto L_0x0b0a
            A00(r11, r1)
            r4 = r17
            boolean r4 = r4 instanceof X.C70233eo
            if (r4 == 0) goto L_0x0357
            r6.setVisibility(r0)
            goto L_0x0357
        L_0x0b0a:
            boolean r4 = r8.A32
            if (r4 == 0) goto L_0x0b13
            A00(r11, r1)
            goto L_0x0357
        L_0x0b13:
            com.whatsapp.TextEmojiLabel r6 = r1.A0D
            r6.setVisibility(r0)
            r6.A0C()
            r4 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r11, r6, r4)
            android.widget.ImageView r4 = r1.A07
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r1.A03
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A0B
            r4.setVisibility(r10)
            android.widget.TextView r6 = r1.A0C
            r6.setVisibility(r0)
            r4 = 2131100165(0x7f060205, float:1.7812704E38)
            X.C36331k8.A0r(r11, r6, r4)
            r4 = r28
            r4.setVisibility(r10)
            android.widget.TextView r4 = r1.A09
            r4.setVisibility(r10)
            goto L_0x0357
        L_0x0b47:
            android.view.View r5 = r1.A02
            r5.setOnClickListener(r9)
            r12.setOnClickListener(r9)
            r5.setClickable(r0)
            r12.setClickable(r0)
            goto L_0x02c6
        L_0x0b57:
            com.whatsapp.contact.picker.ContactPickerFragment r4 = r3.A05
            android.view.LayoutInflater r7 = r4.A0c()
            boolean r1 = r4 instanceof com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment
            if (r1 == 0) goto L_0x0c8d
            r1 = r4
            com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment r1 = (com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment) r1
            int r2 = r1.A00
            r1 = 2
            boolean r1 = X.AnonymousClass000.A1S(r2, r1)
            if (r1 == 0) goto L_0x0c8d
            r2 = 2131624492(0x7f0e022c, float:1.8876165E38)
        L_0x0b70:
            android.view.View r2 = r7.inflate(r2, r6, r0)
            boolean r7 = r4.A36
            boolean r1 = r4.A34
            if (r1 != 0) goto L_0x0b7f
            boolean r1 = r4.A3A
            r6 = 0
            if (r1 == 0) goto L_0x0b80
        L_0x0b7f:
            r6 = 1
        L_0x0b80:
            r1 = 2131429133(0x7f0b070d, float:1.847993E38)
            com.whatsapp.TextEmojiLabel r9 = X.C36401kF.A0O(r2, r1)
            if (r6 == 0) goto L_0x0b8c
            r9.setMaxLines(r5)
        L_0x0b8c:
            if (r7 != 0) goto L_0x0b9a
            if (r6 == 0) goto L_0x0c88
            X.0yC r6 = r3.A07
            r1 = 6741(0x1a55, float:9.446E-42)
            int r1 = r6.A07(r1)
            if (r1 != r5) goto L_0x0c88
        L_0x0b9a:
            r1 = 2131430994(0x7f0b0e52, float:1.8483705E38)
        L_0x0b9d:
            android.widget.TextView r6 = X.C36391kE.A0O(r2, r1)
            boolean r1 = r6 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r1 == 0) goto L_0x0bc0
            X.0yC r7 = r3.A07
            r1 = 6739(0x1a53, float:9.443E-42)
            int r1 = r7.A07(r1)
            if (r1 != r5) goto L_0x0bc0
            r7 = r6
            com.whatsapp.wds.components.button.WDSButton r7 = (com.whatsapp.wds.components.button.WDSButton) r7
            X.1Qp r1 = X.C27981Qp.OUTLINE
            r7.setVariant(r1)
            X.1gk r1 = X.C34271gk.SMALL
            r7.setSize(r1)
            r1 = 0
            r6.setLetterSpacing(r1)
        L_0x0bc0:
            r1 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.widget.ImageView r21 = X.C36401kF.A0G(r2, r1)
            r1 = 2131429128(0x7f0b0708, float:1.847992E38)
            android.widget.ImageView r22 = X.C36401kF.A0G(r2, r1)
            r1 = 2131429111(0x7f0b06f7, float:1.8479885E38)
            android.view.View r19 = X.C012005e.A02(r2, r1)
            X.1LI r7 = r4.A0W
            r1 = 2131429130(0x7f0b070a, float:1.8479924E38)
            X.3SF r33 = X.AnonymousClass3SF.A01(r2, r7, r1)
            r1 = 2131429131(0x7f0b070b, float:1.8479926E38)
            android.widget.TextView r28 = X.C36391kE.A0O(r2, r1)
            r1 = 2131429126(0x7f0b0706, float:1.8479916E38)
            android.widget.ImageView r23 = X.C36401kF.A0G(r2, r1)
            r1 = 2131429127(0x7f0b0707, float:1.8479918E38)
            android.widget.ImageView r24 = X.C36401kF.A0G(r2, r1)
            r1 = 2131427657(0x7f0b0149, float:1.8476936E38)
            android.widget.TextView r29 = X.C36391kE.A0O(r2, r1)
            r1 = 2131433816(0x7f0b1958, float:1.8489428E38)
            android.view.View r8 = X.C012005e.A02(r2, r1)
            com.whatsapp.components.SelectionCheckView r8 = (com.whatsapp.components.SelectionCheckView) r8
            r1 = 2131429129(0x7f0b0709, float:1.8479922E38)
            android.widget.ImageView r25 = X.C36401kF.A0G(r2, r1)
            r1 = 2131428530(0x7f0b04b2, float:1.8478707E38)
            android.widget.TextView r30 = X.C36391kE.A0O(r2, r1)
            r1 = 2131428420(0x7f0b0444, float:1.8478484E38)
            android.view.View r7 = X.C012005e.A02(r2, r1)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = 2131430880(0x7f0b0de0, float:1.8483473E38)
            android.widget.ImageView r26 = X.C36401kF.A0G(r2, r1)
            r1 = 2131428763(0x7f0b059b, float:1.847918E38)
            android.view.View r20 = X.C012005e.A02(r2, r1)
            X.3BE r1 = new X.3BE
            r18 = r1
            r27 = r7
            r31 = r6
            r32 = r9
            r34 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2.setTag(r1)
            boolean r6 = r4.A31
            if (r6 == 0) goto L_0x0c7e
            X.0ts r9 = r4.A1D
            r6 = 2131428420(0x7f0b0444, float:1.8478484E38)
            android.view.View r8 = r2.findViewById(r6)
            android.content.res.Resources r7 = X.C36341k9.A0G(r4)
            r6 = 2131165918(0x7f0702de, float:1.7946067E38)
            int r6 = r7.getDimensionPixelSize(r6)
            X.AnonymousClass1JZ.A05(r8, r9, r0, r6)
            android.widget.ImageView r9 = r1.A07
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            android.content.res.Resources r6 = X.C36341k9.A0G(r4)
            r8 = 2131165927(0x7f0702e7, float:1.7946085E38)
            int r6 = r6.getDimensionPixelSize(r8)
            r7.width = r6
            r9.setLayoutParams(r7)
            android.widget.ImageView r7 = r1.A03
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            android.content.res.Resources r4 = X.C36341k9.A0G(r4)
            int r4 = r4.getDimensionPixelSize(r8)
            r6.width = r4
            r7.setLayoutParams(r6)
        L_0x0c7e:
            android.widget.ImageView r6 = r1.A06
            r4 = 2131886162(0x7f120052, float:1.9406895E38)
            X.C33521fV.A03(r6, r4)
            goto L_0x010d
        L_0x0c88:
            r1 = 2131430993(0x7f0b0e51, float:1.8483703E38)
            goto L_0x0b9d
        L_0x0c8d:
            boolean r1 = r4.A23()
            r2 = 2131624491(0x7f0e022b, float:1.8876163E38)
            if (r1 == 0) goto L_0x0b70
            r2 = 2131624493(0x7f0e022d, float:1.8876167E38)
            goto L_0x0b70
        L_0x0c9b:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public AnonymousClass2Gc(WfalManager wfalManager, ContactPickerFragment contactPickerFragment, C19970wo r4, C20810yC r5, AnonymousClass1NN r6, C26371Jx r7, AnonymousClass1EM r8, C28781Ua r9, AnonymousClass005 r10) {
        this.A05 = contactPickerFragment;
        this.A06 = r4;
        this.A07 = r5;
        this.A0B = r9;
        this.A0A = r8;
        this.A08 = r6;
        this.A04 = wfalManager;
        this.A0C = r10;
        this.A09 = r7;
    }
}
