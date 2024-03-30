package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass2ZN;
import X.AnonymousClass3MR;
import X.B7Z;
import X.C012005e;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C173858Tk;
import X.C175818b6;
import X.C178558gj;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C199849g7;
import X.C202349ld;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C90504aG;
import android.content.Intent;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiBankAccountAddedLandingActivity extends C179128jE {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass2ZN A04;
    public C199849g7 A05;
    public WDSButton A06;
    public WDSButton A07;
    public boolean A08;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0135, code lost:
        r0 = r15.A0l;
        r4 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0139, code lost:
        if (r0 == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0144, code lost:
        if (r15.A0N.A05(r15.A0A) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0148, code lost:
        if (r15.A03 != 1) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0152, code lost:
        if (java.lang.Boolean.FALSE.equals(r4.A00) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0156, code lost:
        r1 = r15.A01;
        r4 = r4.A00;
        X.C18740tg.A06(r4);
        r2 = X.AnonymousClass000.A1X(r4);
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0164, code lost:
        if (r2 == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0166, code lost:
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing_mpin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0169, code lost:
        r1.setImageResource(r0);
        r1 = r15.A03;
        X.C18740tg.A06(r4);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0174, code lost:
        if (r2 == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0176, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0179, code lost:
        X.C173858Tk.A0Q(r1, r15, r0);
        r15.A06.setText(com.whatsapp.R.string.f12nameremoved);
        r15.A07.setText(com.whatsapp.R.string.f12nameremoved);
        X.C207359uy.A00(r15.A06, r15, 0);
        X.C207359uy.A00(r15.A07, r15, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0198, code lost:
        A10(r15.A01);
        r15.A03.setText(com.whatsapp.R.string.f12nameremoved);
        r2 = r15.A02;
        r1 = X.C165577te.A1Z(r4);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01ae, code lost:
        if (r1 == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01b0, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01b3, code lost:
        r2.setText(r0);
        r2 = X.C173858Tk.A0H(r15.A06, r15, com.whatsapp.R.string.f12nameremoved);
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0276, code lost:
        r0 = new X.C207349ux(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x027d, code lost:
        r2 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0288, code lost:
        if (r15.A0N.A05(r15.A0A) == false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x028c, code lost:
        if (r15.A03 != 1) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0296, code lost:
        if (java.lang.Boolean.FALSE.equals(r2.A00) == false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0298, code lost:
        A10(r15.A01);
        r15.A03.setText(com.whatsapp.R.string.f12nameremoved);
        r15.A02.setText(com.whatsapp.R.string.f12nameremoved);
        r0 = r15.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02af, code lost:
        if (r0 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02b1, code lost:
        r0 = r0.A08;
        X.C18740tg.A06(r0);
        A11((X.C175818b6) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02bb, code lost:
        r15.A06.setText(com.whatsapp.R.string.f12nameremoved);
        r15.A07.setVisibility(8);
        X.C36391kE.A1I(r15.A06, r15, 45);
        r15.A00.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d8, code lost:
        r1 = r15.A01;
        r4 = r2.A00;
        X.C18740tg.A06(r4);
        r2 = X.AnonymousClass000.A1X(r4);
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02e6, code lost:
        if (r2 == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02e8, code lost:
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing_mpin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02eb, code lost:
        r1.setImageResource(r0);
        r1 = r15.A03;
        X.C18740tg.A06(r4);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02f6, code lost:
        if (r2 == false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02f8, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02fb, code lost:
        X.C173858Tk.A0Q(r1, r15, r0);
        r2 = X.C173858Tk.A0H(r15.A06, r15, com.whatsapp.R.string.f12nameremoved);
        r1 = 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0349, code lost:
        r0 = new X.C207359uy(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x034e, code lost:
        r2.setOnClickListener(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r6 = r15
            r0 = r16
            super.onCreate(r0)
            X.C165567td.A0j(r15)
            r0 = 2131625182(0x7f0e04de, float:1.8877565E38)
            r15.setContentView((int) r0)
            X.07B r2 = X.C173858Tk.A0F(r15)
            r1 = 1
            if (r2 == 0) goto L_0x0023
            r0 = 2131892327(0x7f121867, float:1.94194E38)
            java.lang.String r0 = r15.getString(r0)
            r2.A0Q(r0)
            r2.A0U(r1)
        L_0x0023:
            java.lang.String r13 = X.C165597tg.A0j(r15)
            X.AF7 r7 = r15.A0S
            r0 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r10 = 0
            java.lang.String r11 = r15.A0b
            X.8gj r8 = A0z(r15)
            java.lang.String r12 = "registration_complete"
            r7.A08(r8, r9, r10, r11, r12, r13)
            r2 = 2131430756(0x7f0b0d64, float:1.8483222E38)
            android.widget.ImageView r2 = X.C36411kG.A0Q(r15, r2)
            r15.A01 = r2
            r2 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.widget.TextView r2 = X.C36391kE.A0Q(r15, r2)
            r15.A03 = r2
            r2 = 2131429494(0x7f0b0876, float:1.8480662E38)
            android.widget.TextView r2 = X.C36391kE.A0Q(r15, r2)
            r15.A02 = r2
            r2 = 2131432894(0x7f0b15be, float:1.8487558E38)
            android.view.View r2 = r15.findViewById(r2)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r15.A06 = r2
            r2 = 2131433699(0x7f0b18e3, float:1.8489191E38)
            android.view.View r2 = r15.findViewById(r2)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r15.A07 = r2
            r2 = 2131430881(0x7f0b0de1, float:1.8483475E38)
            android.view.View r3 = r15.findViewById(r2)
            r2 = 2131432145(0x7f0b12d1, float:1.848604E38)
            android.view.View r4 = r15.findViewById(r2)
            r15.A00 = r4
            X.0yC r12 = r15.A0D
            X.17Y r9 = r15.A05
            X.1Dv r8 = r15.A01
            X.0yb r11 = r15.A08
            r2 = 2131432144(0x7f0b12d0, float:1.8486037E38)
            com.whatsapp.TextEmojiLabel r10 = X.C36401kF.A0O(r4, r2)
            r2 = 2131892339(0x7f121873, float:1.9419423E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r14 = "learn-more"
            java.lang.String r13 = X.C36391kE.A0v(r15, r14, r1, r0, r2)
            java.lang.String r1 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            android.net.Uri r7 = android.net.Uri.parse(r1)
            X.AnonymousClass6YV.A0E(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r15.A00
            r1.setVisibility(r0)
            android.view.View r1 = r15.A00
            r0 = 2131432146(0x7f0b12d2, float:1.8486041E38)
            X.C36351kA.A19(r1, r0)
            X.8az r0 = r15.A0A
            if (r0 == 0) goto L_0x0384
            X.8bF r0 = r0.A08
            if (r0 == 0) goto L_0x0384
            int r1 = r15.A00
            r0 = 20
            if (r1 != r0) goto L_0x0353
            r0 = 2131890437(0x7f121105, float:1.9415566E38)
            java.lang.String r1 = r15.getString(r0)
        L_0x00c0:
            r0 = 0
            r3.setVisibility(r0)
            r0 = 2131430882(0x7f0b0de2, float:1.8483478E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r3, r0)
            r0.setText(r1)
        L_0x00ce:
            X.8az r0 = r15.A0A
            X.8bF r3 = r0.A08
            X.8b6 r3 = (X.C175818b6) r3
            X.9k4 r1 = r15.A0N
            java.lang.String r0 = r3.A0A
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x012a
            android.widget.TextView r1 = r15.A03
            r0 = 2131895306(0x7f12240a, float:1.9425441E38)
            r1.setText(r0)
            android.widget.TextView r1 = r15.A02
            r0 = 2131895304(0x7f122408, float:1.9425437E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.C173858Tk.A0H(r1, r15, r0)
            r0 = 6
            X.C207359uy.A00(r1, r15, r0)
            r0 = 2131432145(0x7f0b12d1, float:1.848604E38)
            android.view.View r1 = r15.findViewById(r0)
            X.0yC r12 = r15.A0D
            X.17Y r9 = r15.A05
            X.1Dv r8 = r15.A01
            X.0yb r11 = r15.A08
            r0 = 2131432144(0x7f0b12d0, float:1.8486037E38)
            com.whatsapp.TextEmojiLabel r10 = X.C36401kF.A0O(r1, r0)
            r0 = 2131895305(0x7f122409, float:1.942544E38)
            java.lang.String r13 = X.C36321k7.A0A(r15, r14, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/797709544841009"
            android.net.Uri r7 = android.net.Uri.parse(r0)
            X.AnonymousClass6YV.A0E(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0121:
            r15.A11(r3)
            X.2ZN r0 = r15.A04
            r0.A00()
            return
        L_0x012a:
            int r0 = r15.A02
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x01c2;
                case 2: goto L_0x0208;
                case 3: goto L_0x0247;
                case 4: goto L_0x0247;
                case 5: goto L_0x0135;
                case 6: goto L_0x0247;
                case 7: goto L_0x012f;
                case 8: goto L_0x0247;
                case 9: goto L_0x0247;
                case 10: goto L_0x0247;
                case 11: goto L_0x0247;
                case 12: goto L_0x012f;
                case 13: goto L_0x012f;
                case 14: goto L_0x030b;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0121
        L_0x0130:
            java.lang.String r0 = "Wrong onboarding type 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0135:
            boolean r0 = r15.A0l
            X.6c7 r4 = r3.A04
            if (r0 == 0) goto L_0x0198
            X.9k4 r1 = r15.A0N
            X.8az r0 = r15.A0A
            boolean r0 = r1.A05(r0)
            r5 = 1
            if (r0 == 0) goto L_0x0156
            int r0 = r15.A03
            if (r0 != r5) goto L_0x0156
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0156
            goto L_0x0298
        L_0x0156:
            android.widget.ImageView r1 = r15.A01
            java.lang.Object r4 = r4.A00
            X.C18740tg.A06(r4)
            boolean r2 = X.AnonymousClass000.A1X(r4)
            r0 = 2131232366(0x7f08066e, float:1.808084E38)
            if (r2 == 0) goto L_0x0169
            r0 = 2131232367(0x7f08066f, float:1.8080841E38)
        L_0x0169:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r15.A03
            X.C18740tg.A06(r4)
            r0 = 2131886675(0x7f120253, float:1.9407936E38)
            if (r2 == 0) goto L_0x0179
            r0 = 2131886674(0x7f120252, float:1.9407934E38)
        L_0x0179:
            X.C173858Tk.A0Q(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886668(0x7f12024c, float:1.9407921E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A07
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 0
            X.C207359uy.A00(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r15.A07
            X.C207359uy.A00(r0, r15, r5)
            goto L_0x0121
        L_0x0198:
            android.widget.ImageView r0 = r15.A01
            r15.A10(r0)
            android.widget.TextView r1 = r15.A03
            r0 = 2131886676(0x7f120254, float:1.9407938E38)
            r1.setText(r0)
            android.widget.TextView r2 = r15.A02
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131886672(0x7f120250, float:1.940793E38)
            if (r1 == 0) goto L_0x01b3
            r0 = 2131886671(0x7f12024f, float:1.9407927E38)
        L_0x01b3:
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            com.whatsapp.wds.components.button.WDSButton r2 = X.C173858Tk.A0H(r1, r15, r0)
            r1 = 3
            goto L_0x0349
        L_0x01c2:
            int r1 = r15.A00
            r0 = 20
            if (r1 == r0) goto L_0x027d
            X.6c7 r4 = r3.A04
            android.widget.ImageView r2 = r15.A01
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131232366(0x7f08066e, float:1.808084E38)
            if (r1 == 0) goto L_0x01d8
            r0 = 2131232367(0x7f08066f, float:1.8080841E38)
        L_0x01d8:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r15.A03
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131886675(0x7f120253, float:1.9407936E38)
            if (r1 == 0) goto L_0x01e9
            r0 = 2131886674(0x7f120252, float:1.9407934E38)
        L_0x01e9:
            X.C173858Tk.A0Q(r2, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886668(0x7f12024c, float:1.9407921E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A07
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 48
            X.C36391kE.A1I(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r15.A07
            r1 = 49
            goto L_0x0276
        L_0x0208:
            X.6c7 r4 = r3.A04
            android.widget.ImageView r2 = r15.A01
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131232366(0x7f08066e, float:1.808084E38)
            if (r1 == 0) goto L_0x0218
            r0 = 2131232367(0x7f08066f, float:1.8080841E38)
        L_0x0218:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r15.A03
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131886675(0x7f120253, float:1.9407936E38)
            if (r1 == 0) goto L_0x0229
            r0 = 2131886674(0x7f120252, float:1.9407934E38)
        L_0x0229:
            X.C173858Tk.A0Q(r2, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A07
            r0 = 2131886668(0x7f12024c, float:1.9407921E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 5
            X.C207359uy.A00(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r15.A07
            r1 = 4
            goto L_0x0349
        L_0x0247:
            boolean r0 = r15.A0l
            if (r0 != 0) goto L_0x027d
            X.6c7 r4 = r3.A04
            android.widget.ImageView r0 = r15.A01
            r15.A10(r0)
            android.widget.TextView r1 = r15.A03
            r0 = 2131886676(0x7f120254, float:1.9407938E38)
            r1.setText(r0)
            android.widget.TextView r2 = r15.A02
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131886672(0x7f120250, float:1.940793E38)
            if (r1 == 0) goto L_0x0268
            r0 = 2131886671(0x7f12024f, float:1.9407927E38)
        L_0x0268:
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
            com.whatsapp.wds.components.button.WDSButton r2 = X.C173858Tk.A0H(r1, r15, r0)
            r1 = 47
        L_0x0276:
            X.9ux r0 = new X.9ux
            r0.<init>(r15, r1)
            goto L_0x034e
        L_0x027d:
            X.6c7 r2 = r3.A04
            X.9k4 r1 = r15.A0N
            X.8az r0 = r15.A0A
            boolean r0 = r1.A05(r0)
            r1 = 1
            if (r0 == 0) goto L_0x02d8
            int r0 = r15.A03
            if (r0 != r1) goto L_0x02d8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02d8
        L_0x0298:
            android.widget.ImageView r0 = r15.A01
            r15.A10(r0)
            android.widget.TextView r1 = r15.A03
            r0 = 2131886676(0x7f120254, float:1.9407938E38)
            r1.setText(r0)
            android.widget.TextView r1 = r15.A02
            r0 = 2131886669(0x7f12024d, float:1.9407923E38)
            r1.setText(r0)
            X.8az r0 = r15.A0A
            if (r0 == 0) goto L_0x02bb
            X.8bF r0 = r0.A08
            X.C18740tg.A06(r0)
            X.8b6 r0 = (X.C175818b6) r0
            r15.A11(r0)
        L_0x02bb:
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r15.A07
            r2 = 8
            r0.setVisibility(r2)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 45
            X.C36391kE.A1I(r1, r15, r0)
            android.view.View r0 = r15.A00
            r0.setVisibility(r2)
            goto L_0x0121
        L_0x02d8:
            android.widget.ImageView r1 = r15.A01
            java.lang.Object r4 = r2.A00
            X.C18740tg.A06(r4)
            boolean r2 = X.AnonymousClass000.A1X(r4)
            r0 = 2131232366(0x7f08066e, float:1.808084E38)
            if (r2 == 0) goto L_0x02eb
            r0 = 2131232367(0x7f08066f, float:1.8080841E38)
        L_0x02eb:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r15.A03
            X.C18740tg.A06(r4)
            r0 = 2131886675(0x7f120253, float:1.9407936E38)
            if (r2 == 0) goto L_0x02fb
            r0 = 2131886674(0x7f120252, float:1.9407934E38)
        L_0x02fb:
            X.C173858Tk.A0Q(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A06
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            com.whatsapp.wds.components.button.WDSButton r2 = X.C173858Tk.A0H(r1, r15, r0)
            r1 = 46
            goto L_0x0276
        L_0x030b:
            X.6c7 r4 = r3.A04
            android.widget.ImageView r2 = r15.A01
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131232366(0x7f08066e, float:1.808084E38)
            if (r1 == 0) goto L_0x031b
            r0 = 2131232367(0x7f08066f, float:1.8080841E38)
        L_0x031b:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r15.A03
            boolean r1 = X.C165577te.A1Z(r4)
            r0 = 2131886675(0x7f120253, float:1.9407936E38)
            if (r1 == 0) goto L_0x032c
            r0 = 2131886674(0x7f120252, float:1.9407934E38)
        L_0x032c:
            X.C173858Tk.A0Q(r2, r15, r0)
            android.content.Intent r2 = r15.getIntent()
            r1 = 0
            java.lang.String r0 = "extra_scan_qr_onboarding_only"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            r1 = 2131887154(0x7f120432, float:1.9408907E38)
            if (r0 == 0) goto L_0x0342
            r1 = 2131888924(0x7f120b1c, float:1.9412497E38)
        L_0x0342:
            com.whatsapp.wds.components.button.WDSButton r0 = r15.A06
            com.whatsapp.wds.components.button.WDSButton r2 = X.C173858Tk.A0H(r0, r15, r1)
            r1 = 2
        L_0x0349:
            X.9uy r0 = new X.9uy
            r0.<init>(r15, r1)
        L_0x034e:
            r2.setOnClickListener(r0)
            goto L_0x0121
        L_0x0353:
            X.6c7 r0 = r15.A0F
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x037d
            X.1FR r1 = r15.A0W
            com.whatsapp.jid.UserJid r0 = r15.A0G
            boolean r0 = r1.A0i(r0)
            if (r0 == 0) goto L_0x037d
            r4 = 2131886677(0x7f120255, float:1.940794E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            X.6c7 r0 = r15.A0F
            X.C18740tg.A06(r0)
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
            java.lang.String r1 = X.C36391kE.A0v(r15, r0, r2, r1, r4)
            goto L_0x00c0
        L_0x037d:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x00ce
        L_0x0384:
            java.lang.String r0 = "Screen called without valid account, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r15.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.onCreate(android.os.Bundle):void");
    }

    public static C178558gj A0z(IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity) {
        if (C202349ld.A02(indiaUpiBankAccountAddedLandingActivity.A0F) || !indiaUpiBankAccountAddedLandingActivity.A0W.A0i(indiaUpiBankAccountAddedLandingActivity.A0G)) {
            return null;
        }
        return C178558gj.A00();
    }

    public static void A12(IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity) {
        Intent A0H = C36441kJ.A0H(indiaUpiBankAccountAddedLandingActivity, IndiaUpiContactPicker.class);
        A0H.putExtra("for_payments", true);
        indiaUpiBankAccountAddedLandingActivity.startActivity(A0H);
        indiaUpiBankAccountAddedLandingActivity.finish();
    }

    public static void A13(IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity) {
        Class cls;
        if (indiaUpiBankAccountAddedLandingActivity.A0E != null || !C202349ld.A03(indiaUpiBankAccountAddedLandingActivity.A0I)) {
            if (AnonymousClass3MR.A00(indiaUpiBankAccountAddedLandingActivity.A0D)) {
                cls = IndiaUpiSendPaymentActivityBottomSheet.class;
            } else {
                cls = IndiaUpiSendPaymentActivity.class;
            }
            Intent A0H = C36441kJ.A0H(indiaUpiBankAccountAddedLandingActivity, cls);
            indiaUpiBankAccountAddedLandingActivity.A42(A0H);
            indiaUpiBankAccountAddedLandingActivity.startActivity(A0H);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("openPaymentActivity, jid and vpa is null, payment entry type = ");
            A0u.append(indiaUpiBankAccountAddedLandingActivity.A02);
            C90504aG.A1G(A0u);
        }
        indiaUpiBankAccountAddedLandingActivity.finish();
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A05 = C165607th.A0e(r2);
            this.A04 = (AnonymousClass2ZN) r2.AVK.get();
        }
    }

    public void A47() {
        C173858Tk.A0u(this.A0S, this, C36361kB.A0i(), C36371kC.A0p());
    }

    public void A48() {
        C173858Tk.A0u(this.A0S, this, C36361kB.A0i(), 47);
    }

    public IndiaUpiBankAccountAddedLandingActivity(int i) {
        this.A08 = false;
        B7Z.A00(this, 1);
    }

    private void A10(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int applyDimension = (int) TypedValue.applyDimension(1, 64.0f, AnonymousClass000.A0X(this));
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.ic_hero_bank_added);
    }

    private void A11(C175818b6 r6) {
        View findViewById = findViewById(R.id.account_layout);
        C012005e.A02(findViewById, R.id.progress).setVisibility(8);
        C36351kA.A1A(findViewById, R.id.divider, 8);
        C36351kA.A1A(findViewById, R.id.radio_button, 8);
        C173858Tk.A0O(findViewById, this.A0A);
        C36391kE.A0O(findViewById, R.id.account_number).setText(this.A05.A02(this.A0A, false));
        C165607th.A1A(C36391kE.A0O(findViewById, R.id.account_name), C165577te.A0g(r6.A02));
        C36391kE.A0O(findViewById, R.id.account_type).setText(r6.A0B());
        if (!(!"OD_UNSECURED".equals(r6.A0A))) {
            TextView A0Q = C36391kE.A0Q(this, R.id.overdraft_description);
            A0Q.setVisibility(0);
            A0Q.setText(R.string.f12nameremoved);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C173858Tk.A0u(this.A0S, this, C36361kB.A0i(), C36371kC.A0n());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C173858Tk.A0u(this.A0S, this, C36361kB.A0i(), C36371kC.A0n());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiBankAccountAddedLandingActivity() {
        this(0);
    }
}
