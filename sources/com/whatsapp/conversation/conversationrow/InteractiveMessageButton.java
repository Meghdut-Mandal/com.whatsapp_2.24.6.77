package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass16S;
import X.AnonymousClass185;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1QZ;
import X.AnonymousClass1X4;
import X.AnonymousClass39O;
import X.AnonymousClass3FX;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C19730wQ;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Set;

public class InteractiveMessageButton extends FrameLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass185 A02;
    public AnonymousClass3FX A03;
    public C18820ts A04;
    public AnonymousClass16S A05;
    public C20810yC A06;
    public AnonymousClass1EV A07;
    public AnonymousClass39O A08;
    public AnonymousClass1FR A09;
    public AnonymousClass005 A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;
    public final TextEmojiLabel A0D;
    public final InteractiveButtonsRowContentLayout A0E;
    public final Set A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c9, code lost:
        if (r1 <= 1) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0313, code lost:
        r14 = r2.A09.A0c(r1, r4);
        r12 = r2.A05.A05(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0323, code lost:
        if (X.C36381kD.A1Z(r14, 0) == false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x032f, code lost:
        if (r2.A07.A02.A0E(7102) == false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0331, code lost:
        r13 = getContext().getString(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033c, code lost:
        if (r12 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033e, code lost:
        r10 = r12.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0340, code lost:
        if (r10 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0342, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0349, code lost:
        if (android.text.TextUtils.equals(r10, "active") == false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034b, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x034c, code lost:
        X.C165577te.A15(new X.C23150B7k(r4, r2, 8), r13, r8, -1, r12);
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x035c, code lost:
        if (X.C36381kD.A1Z(r14, 6) == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0368, code lost:
        if (r2.A07.A02.A0E(7101) == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x036a, code lost:
        r12 = r12 + 1;
        X.C165577te.A15(new X.C23150B7k(r4, r2, 9), getContext().getString(com.whatsapp.R.string.f12nameremoved), r8, com.whatsapp.R.drawable.ic_action_copy, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0388, code lost:
        if (r14.size() <= r12) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038a, code lost:
        if (r12 <= 0) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038c, code lost:
        r10 = r2.A07.A02.A0E(7238);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0399, code lost:
        if (r10 == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x039b, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x039e, code lost:
        X.C165577te.A15(new X.C23150B7k(r4, r2, 4), X.C36381kD.A0t(r2, r0), r8, -1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03af, code lost:
        if (r14.size() != 0) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03bb, code lost:
        if (r2.A07.A02.A0E(7238) == false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03bd, code lost:
        r9 = getContext().getString(com.whatsapp.R.string.f12nameremoved);
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ca, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03fa, code lost:
        if (r12 <= 0) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0507, code lost:
        if (r12 == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0629, code lost:
        if (r1 != 6) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x062b, code lost:
        r15.setMessageText(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x062e, code lost:
        if (r6 == null) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0697, code lost:
        if (r6 != null) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bb, code lost:
        if (X.C207199ui.A00(r5.A01) == 4) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04c2 A[SYNTHETIC, Splitter:B:198:0x04c2] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x066a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass01z r23, X.AnonymousClass2IR r24, X.C89004Uw r25, X.AnonymousClass3T1 r26) {
        /*
            r22 = this;
            r4 = r26
            boolean r0 = r4 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x00bd
            r2 = r22
            com.whatsapp.TextEmojiLabel r5 = r2.A0D
            r0 = 8
            r5.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r3 = r2.A0E
            r3.setVisibility(r0)
            r11 = r4
            X.B1o r11 = (X.C23043B1o) r11
            X.9uk r6 = r11.BA8()
            r15 = r24
            if (r6 == 0) goto L_0x0605
            X.9ui r0 = r6.A01
            if (r0 == 0) goto L_0x00be
            int r1 = r6.A00
            r0 = 3
            if (r1 != r0) goto L_0x00be
            boolean r0 = X.C207219uk.A01(r6)
            if (r0 == 0) goto L_0x016f
            r8 = 0
            r3.setVisibility(r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            android.content.Context r1 = r2.getContext()
            r0 = 2131893324(0x7f121c4c, float:1.9421421E38)
            java.lang.String r9 = r1.getString(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131891027(0x7f121353, float:1.9416762E38)
            java.lang.String r6 = r1.getString(r0)
            r10 = 0
            X.0yC r0 = r2.A06
            int r0 = X.C165587tf.A05(r0)
            boolean r5 = X.AnonymousClass000.A1P(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887882(0x7f12070a, float:1.9410384E38)
            if (r5 == 0) goto L_0x0063
            r0 = 2131887881(0x7f120709, float:1.9410382E38)
        L_0x0063:
            java.lang.String r12 = r1.getString(r0)
            r1 = 2
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r1)
            r5 = -1
            X.C165577te.A15(r0, r12, r7, r5, r8)
            X.9uk r0 = r11.BA8()
            if (r0 == 0) goto L_0x0097
            X.9ui r1 = r0.A01
            if (r1 == 0) goto L_0x0097
            X.1FR r0 = r2.A09
            boolean r0 = r0.A0g(r10, r1)
            if (r0 == 0) goto L_0x0097
            android.content.Context r1 = r2.getContext()
            r0 = 2131887883(0x7f12070b, float:1.9410386E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 3
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r1)
            X.C165577te.A15(r0, r10, r7, r5, r8)
        L_0x0097:
            X.185 r1 = r2.A02
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x00b6
            X.B7l r0 = new X.B7l
            r0.<init>(r2, r4, r9, r8)
            X.C165577te.A15(r0, r9, r7, r5, r8)
            r1 = 1
            X.B7l r0 = new X.B7l
            r0.<init>(r2, r4, r6, r1)
            X.C165577te.A15(r0, r6, r7, r5, r8)
        L_0x00b6:
            int r0 = r7.size()
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r15, r3, r7, r0)
        L_0x00bd:
            return
        L_0x00be:
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x00c7
            r0 = 9
            if (r1 != r0) goto L_0x0605
        L_0x00c7:
            X.9uX r7 = r6.A04
            if (r7 == 0) goto L_0x00bd
            java.util.List r0 = r7.A03
            java.util.Iterator r10 = r0.iterator()
        L_0x00d1:
            boolean r0 = r10.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x015f
            java.lang.Object r1 = r10.next()
            X.9tc r1 = (X.C206569tc) r1
            X.005 r0 = r2.A0A
            java.lang.Object r9 = r0.get()
            X.1am r9 = (X.C30791am) r9
            X.9uL r8 = r1.A01
            java.lang.String r5 = r8.A00
            java.lang.String r1 = r8.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.1ao r0 = r9.A01
            X.9Yd r1 = r0.A00(r5, r1)
            if (r1 == 0) goto L_0x00d1
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r1.A06(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d1
        L_0x0106:
            r0 = 0
            r3.setVisibility(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r9 = 0
        L_0x010f:
            X.9uX r0 = r6.A04
            java.util.List r0 = r0.A03
            int r1 = r0.size()
            X.9uX r0 = r6.A04
            if (r9 >= r1) goto L_0x0530
            java.util.List r0 = r0.A03
            java.lang.Object r10 = r0.get(r9)
            X.9tc r10 = (X.C206569tc) r10
            X.005 r0 = r2.A0A
            java.lang.Object r11 = r0.get()
            X.1am r11 = (X.C30791am) r11
            X.9uL r7 = r10.A01
            java.lang.String r5 = r7.A00
            java.lang.String r1 = r7.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.1ao r0 = r11.A01
            X.9Yd r1 = r0.A00(r5, r1)
            if (r1 == 0) goto L_0x015c
            if (r9 != 0) goto L_0x0142
            r0 = 1
            r3.A03 = r0
        L_0x0142:
            android.content.Context r0 = r2.getContext()
            java.lang.String r7 = r1.A06(r0, r7)
            boolean r5 = r10.A00
            if (r7 != 0) goto L_0x0150
            java.lang.String r7 = ""
        L_0x0150:
            int r1 = r1.A03()
            X.3fK r0 = new X.3fK
            r0.<init>(r2, r4, r6, r5)
            X.C165577te.A15(r0, r7, r8, r1, r5)
        L_0x015c:
            int r9 = r9 + 1
            goto L_0x010f
        L_0x015f:
            int r1 = r7.A01
            r0 = 2
            if (r1 != r0) goto L_0x00bd
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x00bd
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != r5) goto L_0x00bd
            goto L_0x0106
        L_0x016f:
            X.9ui r1 = r6.A01
            r0 = 0
            r3.setVisibility(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            X.3Qa r7 = r4.A1J
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x01f9
            X.1FR r0 = r2.A09
            X.1EV r0 = r0.A08
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x01f9
            X.1FR r6 = r2.A09
            X.0wQ r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r5 = X.C36441kJ.A0n(r0)
            X.1EV r0 = r6.A08
            int r0 = r0.A05(r5)
            r6 = 1
            if (r0 != r6) goto L_0x01f9
            X.1FR r0 = r2.A09
            X.11F r5 = r7.A00
            X.1EV r0 = r0.A08
            int r0 = r0.A05(r5)
            if (r0 != r6) goto L_0x01f9
            r3.A03 = r6
            X.9uP r5 = r1.A09
            java.lang.String r0 = r5.A01
            int r1 = X.C207199ui.A00(r0)
            r0 = 3
            if (r1 == r0) goto L_0x01bd
            java.lang.String r0 = r5.A01
            int r5 = X.C207199ui.A00(r0)
            r1 = 4
            r0 = 1
            if (r5 != r1) goto L_0x01be
        L_0x01bd:
            r0 = 0
        L_0x01be:
            r7 = 0
            r6 = -1
            if (r0 == 0) goto L_0x01d7
            android.content.Context r1 = r2.getContext()
            r0 = 2131895262(0x7f1223de, float:1.9425352E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 10
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r1)
            X.C165577te.A15(r0, r5, r8, r6, r7)
        L_0x01d7:
            android.content.Context r1 = r2.getContext()
            r0 = 2131895683(0x7f122583, float:1.9426206E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 11
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r1)
            X.37x r2 = new X.37x
            r2.<init>(r0, r5, r6, r7)
        L_0x01ee:
            r8.add(r2)
        L_0x01f1:
            int r0 = r8.size()
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r15, r3, r8, r0)
            return
        L_0x01f9:
            X.185 r0 = r2.A02
            X.11F r9 = r7.A00
            r5 = r9
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r13 = r0.A04(r5)
            r10 = 1
            r3.A03 = r10
            java.lang.String r0 = r1.A05
            java.lang.String r11 = "pending_buyer_confirmation"
            boolean r0 = r11.equals(r0)
            r7 = -1
            r6 = 0
            if (r0 == 0) goto L_0x02d9
            X.1EV r0 = r2.A07
            X.0yC r12 = r0.A02
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x03cc
            android.content.Context r5 = r2.getContext()
            X.1FR r12 = r2.A09
            X.3FX r2 = r2.A03
            X.C36321k7.A16(r5, r12, r2, r10)
            java.lang.String r0 = r1.A05
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01f1
            if (r13 != 0) goto L_0x0244
            r0 = 2131887887(0x7f12070f, float:1.9410394E38)
            java.lang.String r11 = r5.getString(r0)
            r9 = 2
            X.B7i r0 = new X.B7i
            r0.<init>(r5, r2, r4, r9)
            X.C165577te.A15(r0, r11, r8, r7, r6)
        L_0x0244:
            java.util.HashSet r12 = r12.A0c(r1, r4)
            r0 = 2131887884(0x7f12070c, float:1.9410388E38)
            java.lang.String r11 = r5.getString(r0)
            r9 = 4
            X.B7i r0 = new X.B7i
            r0.<init>(r5, r2, r4, r9)
            X.37x r9 = new X.37x
            r9.<init>(r0, r11, r7, r6)
            java.lang.String r1 = r1.A04
            if (r1 == 0) goto L_0x01f1
            int r11 = r1.hashCode()
            r0 = 111007(0x1b19f, float:1.55554E-40)
            if (r11 == r0) goto L_0x028d
            r0 = 576234453(0x2258a3d5, float:2.936019E-18)
            if (r11 == r0) goto L_0x02b8
            r0 = 951117504(0x38b0e6c0, float:8.4353145E-5)
            if (r11 != r0) goto L_0x01f1
            java.lang.String r0 = "confirm"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f1
            r0 = 2131887881(0x7f120709, float:1.9410382E38)
            java.lang.String r9 = r5.getString(r0)
            r1 = 3
            X.B7i r0 = new X.B7i
            r0.<init>(r5, r2, r4, r1)
        L_0x0286:
            X.37x r2 = new X.37x
            r2.<init>(r0, r9, r7, r6)
            goto L_0x01ee
        L_0x028d:
            java.lang.String r0 = "pix"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f1
            int r0 = r12.size()
            if (r0 != r10) goto L_0x02a0
            r8.add(r9)
            goto L_0x01f1
        L_0x02a0:
            int r0 = r12.size()
            if (r0 <= r10) goto L_0x01f1
            if (r13 == 0) goto L_0x02ab
            r8.add(r9)
        L_0x02ab:
            r0 = 2131887888(0x7f120710, float:1.9410396E38)
            java.lang.String r9 = r5.getString(r0)
            X.B7i r0 = new X.B7i
            r0.<init>(r5, r2, r4, r10)
            goto L_0x0286
        L_0x02b8:
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f1
            if (r13 != 0) goto L_0x02cb
            int r1 = r12.size()
            r0 = 2131887888(0x7f120710, float:1.9410396E38)
            if (r1 > r10) goto L_0x02ce
        L_0x02cb:
            r0 = 2131887890(0x7f120712, float:1.94104E38)
        L_0x02ce:
            java.lang.String r9 = r5.getString(r0)
            X.B7i r1 = new X.B7i
            r1.<init>(r5, r2, r4, r6)
            goto L_0x03f3
        L_0x02d9:
            java.lang.String r0 = r1.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03fe
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03fe
            java.util.List r0 = r1.A0L
            if (r0 == 0) goto L_0x03fe
            java.util.Iterator r13 = r0.iterator()
        L_0x02f1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03fe
            java.lang.Object r10 = r13.next()
            X.9uC r10 = (X.C206909uC) r10
            X.B5M r12 = r10.A00
            if (r12 == 0) goto L_0x02f1
            boolean r0 = r12 instanceof X.C21331AHj
            if (r0 != 0) goto L_0x0313
            java.lang.String r10 = r10.A01
            java.lang.String r0 = "pix_dynamic_code"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02f1
            boolean r0 = r12 instanceof X.C21335AHn
            if (r0 == 0) goto L_0x02f1
        L_0x0313:
            X.1FR r0 = r2.A09
            java.util.HashSet r14 = r0.A0c(r1, r4)
            X.16S r0 = r2.A05
            X.8ax r12 = r0.A05(r5)
            boolean r0 = X.C36381kD.A1Z(r14, r6)
            if (r0 == 0) goto L_0x03ca
            X.1EV r0 = r2.A07
            X.0yC r10 = r0.A02
            r0 = 7102(0x1bbe, float:9.952E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x03ca
            android.content.Context r10 = r2.getContext()
            r0 = 2131887877(0x7f120705, float:1.9410373E38)
            java.lang.String r13 = r10.getString(r0)
            if (r12 == 0) goto L_0x034b
            java.lang.String r10 = r12.A05
            if (r10 == 0) goto L_0x034b
            java.lang.String r0 = "active"
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            r12 = 1
            if (r0 == 0) goto L_0x034c
        L_0x034b:
            r12 = 0
        L_0x034c:
            r10 = 8
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r10)
            X.C165577te.A15(r0, r13, r8, r7, r12)
            r12 = 1
        L_0x0357:
            r0 = 6
            boolean r0 = X.C36381kD.A1Z(r14, r0)
            if (r0 == 0) goto L_0x0384
            X.1EV r0 = r2.A07
            X.0yC r10 = r0.A02
            r0 = 7101(0x1bbd, float:9.95E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x0384
            int r12 = r12 + 1
            android.content.Context r10 = r2.getContext()
            r0 = 2131887884(0x7f12070c, float:1.9410388E38)
            java.lang.String r13 = r10.getString(r0)
            r0 = 9
            X.B7k r10 = new X.B7k
            r10.<init>(r4, r2, r0)
            r0 = 2131231788(0x7f08042c, float:1.8079667E38)
            X.C165577te.A15(r10, r13, r8, r0, r6)
        L_0x0384:
            int r0 = r14.size()
            if (r0 <= r12) goto L_0x03ab
            if (r12 <= 0) goto L_0x03ab
            X.1EV r0 = r2.A07
            X.0yC r10 = r0.A02
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r10 = r10.A0E(r0)
            r0 = 2131887871(0x7f1206ff, float:1.9410361E38)
            if (r10 == 0) goto L_0x039e
            r0 = 2131887888(0x7f120710, float:1.9410396E38)
        L_0x039e:
            java.lang.String r13 = X.C36381kD.A0t(r2, r0)
            r10 = 4
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r10)
            X.C165577te.A15(r0, r13, r8, r7, r6)
        L_0x03ab:
            int r0 = r14.size()
            if (r0 != 0) goto L_0x03fa
            X.1EV r0 = r2.A07
            X.0yC r10 = r0.A02
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x03fa
            android.content.Context r1 = r2.getContext()
            r0 = 2131887889(0x7f120711, float:1.9410398E38)
            java.lang.String r9 = r1.getString(r0)
            r0 = 5
            goto L_0x03ee
        L_0x03ca:
            r12 = 0
            goto L_0x0357
        L_0x03cc:
            if (r13 != 0) goto L_0x03fe
            android.content.Context r1 = r2.getContext()
            r0 = 2131887885(0x7f12070d, float:1.941039E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 6
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r1)
            X.C165577te.A15(r0, r5, r8, r7, r6)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887886(0x7f12070e, float:1.9410392E38)
            java.lang.String r9 = r1.getString(r0)
            r0 = 7
        L_0x03ee:
            X.B7k r1 = new X.B7k
            r1.<init>(r4, r2, r0)
        L_0x03f3:
            X.37x r2 = new X.37x
            r2.<init>(r1, r9, r7, r6)
            goto L_0x01ee
        L_0x03fa:
            if (r12 <= 0) goto L_0x03fe
            goto L_0x01f1
        L_0x03fe:
            X.39O r0 = r2.A08
            X.0yC r6 = r0.A01
            r0 = 1107(0x453, float:1.551E-42)
            r6.A0E(r0)
            java.util.Set r6 = r2.A0F
            X.9uP r10 = r1.A09
            java.lang.String r0 = r10.A01
            int r0 = X.C207199ui.A00(r0)
            boolean r0 = X.AnonymousClass000.A1Z(r6, r0)
            if (r0 != 0) goto L_0x0442
            android.content.Context r5 = r2.getContext()
            r0 = 2131887881(0x7f120709, float:1.9410382E38)
            java.lang.String r11 = r5.getString(r0)
        L_0x0422:
            X.0yC r0 = r2.A06
            boolean r12 = X.AnonymousClass1FR.A0B(r0, r1)
            r7 = -1
            r6 = 0
            if (r12 != 0) goto L_0x0436
            r5 = 12
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r5)
            X.C165577te.A15(r0, r11, r8, r7, r6)
        L_0x0436:
            X.0yC r5 = r2.A06
            r0 = 1600(0x640, float:2.242E-42)
            java.lang.String r0 = r5.A09(r0)
            if (r0 == 0) goto L_0x04d7
            goto L_0x04c2
        L_0x0442:
            X.185 r0 = r2.A02
            boolean r13 = r0.A04(r5)
            X.1FR r7 = r2.A09
            com.whatsapp.jid.UserJid r6 = X.C36401kF.A0b(r9)
            X.0wQ r12 = r7.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r12)
            java.lang.String r0 = X.AnonymousClass3U8.A07(r0)
            java.lang.String r5 = X.AnonymousClass3SI.A02(r0)
            if (r5 == 0) goto L_0x04b5
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r12)
            boolean r0 = r7.A0j(r0, r6, r5)
            if (r0 == 0) goto L_0x04b5
            int r5 = r7.A0D(r6)
            r0 = 2
            if (r5 != r0) goto L_0x04b5
            X.1FR r0 = r2.A09
            boolean r0 = r0.A0k(r1)
            if (r0 != 0) goto L_0x0481
            if (r13 == 0) goto L_0x0489
            java.lang.String r0 = r1.A05
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0489
        L_0x0481:
            r6 = 2131887881(0x7f120709, float:1.9410382E38)
        L_0x0484:
            java.lang.String r11 = X.C36381kD.A0t(r2, r6)
            goto L_0x0422
        L_0x0489:
            X.0yC r5 = r2.A06
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r6 = r5.A0A(r0)
            java.lang.String r5 = "updated_order_cta"
            boolean r0 = r6.has(r5)
            if (r0 == 0) goto L_0x04b1
            int r5 = r6.getInt(r5)     // Catch:{ JSONException -> 0x04ab }
            r0 = 1
            if (r5 == r0) goto L_0x04a7
            r0 = 2
            r6 = 2131887870(0x7f1206fe, float:1.941036E38)
            if (r5 == r0) goto L_0x0484
            goto L_0x04b1
        L_0x04a7:
            r6 = 2131887869(0x7f1206fd, float:1.9410357E38)
            goto L_0x0484
        L_0x04ab:
            r5 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_cta"
            com.whatsapp.util.Log.e(r0, r5)
        L_0x04b1:
            r6 = 2131887868(0x7f1206fc, float:1.9410355E38)
            goto L_0x0484
        L_0x04b5:
            r6 = 2131887882(0x7f12070a, float:1.9410384E38)
            X.1FR r0 = r2.A09
            X.1EV r0 = r0.A08
            X.1De r0 = r0.A04
            r0.A02()
            goto L_0x0484
        L_0x04c2:
            org.json.JSONObject r5 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x04cd }
            java.lang.String r0 = "allowed_product_type"
            java.lang.String r11 = r5.getString(r0)     // Catch:{ JSONException -> 0x04cd }
            goto L_0x04d9
        L_0x04cd:
            r11 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "OrderDetailsQuickPayConfig/init failed to parse config json: "
            X.C36321k7.A1W(r0, r5, r11)
        L_0x04d7:
            java.lang.String r11 = "none"
        L_0x04d9:
            java.lang.String r5 = r1.A0H
            java.lang.String r0 = "any"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04eb
            boolean r0 = r11.equals(r5)
            if (r0 != 0) goto L_0x04eb
            if (r12 == 0) goto L_0x01f1
        L_0x04eb:
            r5 = 1
            if (r9 == 0) goto L_0x052e
            X.1FR r0 = r2.A09
            X.1EU r0 = r0.A09
            X.B66 r0 = r0.A05()
            boolean r0 = r0.BMa()
            if (r0 == 0) goto L_0x052e
            r9 = 1
            X.1FR r0 = r2.A09
            X.8z2 r1 = r0.A0I(r1)
            X.8z2 r0 = X.C188098z2.TOS_NONE
            if (r1 == r0) goto L_0x0509
            if (r12 == 0) goto L_0x01f1
        L_0x0509:
            android.content.Context r1 = r2.getContext()
            r0 = 2131887879(0x7f120707, float:1.9410378E38)
            if (r9 == 0) goto L_0x0515
            r0 = 2131887876(0x7f120704, float:1.9410371E38)
        L_0x0515:
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r10.A01
            int r0 = X.C207199ui.A00(r0)
            if (r0 == r5) goto L_0x0522
            r6 = 1
        L_0x0522:
            X.B7k r0 = new X.B7k
            r0.<init>(r4, r2, r5)
            X.37x r2 = new X.37x
            r2.<init>(r0, r1, r7, r6)
            goto L_0x01ee
        L_0x052e:
            r9 = 0
            goto L_0x0509
        L_0x0530:
            java.lang.String r7 = r0.A02
            if (r7 == 0) goto L_0x0549
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0549
            org.json.JSONObject r10 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x053f }
            goto L_0x054d
        L_0x053f:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "InteractiveMessageButton/parseNfmMessageParamsJson/invalid json="
            X.C90464aC.A1L(r0, r7, r1, r5)
        L_0x0549:
            org.json.JSONObject r10 = X.C36441kJ.A1B()
        L_0x054d:
            java.lang.String r0 = "type"
            java.lang.String r9 = r10.optString(r0)
            X.005 r0 = r2.A0A
            java.lang.Object r5 = r0.get()
            X.1am r5 = (X.C30791am) r5
            X.9uX r0 = r6.A04
            java.lang.String r1 = r0.A02
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            X.1ao r0 = r5.A01
            X.9Yd r1 = r0.A00(r9, r1)
            r5 = 0
            if (r1 == 0) goto L_0x058c
            android.content.Context r0 = r2.getContext()
            java.lang.String r11 = r1.A06(r0, r5)
            X.9uX r0 = r6.A04
            X.9tV r0 = r0.A00
            if (r0 == 0) goto L_0x0602
            boolean r9 = r0.A00
        L_0x057c:
            if (r11 != 0) goto L_0x0580
            java.lang.String r11 = ""
        L_0x0580:
            int r1 = r1.A03()
            X.3fK r0 = new X.3fK
            r0.<init>(r2, r4, r6, r9)
            X.C165577te.A15(r0, r11, r8, r1, r9)
        L_0x058c:
            int r0 = r8.size()
            X.37y r4 = new X.37y
            r4.<init>(r10, r0)
            int r1 = r4.A00
            r0 = 1
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x05a4
            int r1 = r1 + -1
        L_0x05a4:
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r15, r3, r8, r1)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x05fe
            com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet r6 = new com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet
            r6.<init>()
            X.393 r0 = new X.393
            r9 = r0
            r10 = r15
            r11 = r3
            r12 = r6
            r13 = r4
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r6.A01 = r0
            java.lang.String r4 = r4.A01
            if (r4 != 0) goto L_0x05ce
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131893921(0x7f121ea1, float:1.9422632E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x05ce:
            r1 = 2131232304(0x7f080630, float:1.8080713E38)
            X.B7k r0 = new X.B7k
            r8 = r23
            r0.<init>(r8, r6, r7)
            X.37x r6 = new X.37x
            r6.<init>(r0, r4, r1, r7)
            android.widget.LinearLayout r4 = r3.A05
            android.content.Context r1 = r3.getContext()
            r0 = 2131100213(0x7f060235, float:1.7812801E38)
            android.content.res.ColorStateList r13 = X.AnonymousClass00F.A04(r1, r0)
            r18 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r14 = r13
            r17 = r3
            r16 = r6
            android.view.View r0 = com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.addView(r0)
        L_0x05fe:
            r2.setOnClickListener(r5)
            return
        L_0x0602:
            r9 = 0
            goto L_0x057c
        L_0x0605:
            r1 = 0
            r5.setVisibility(r1)
            if (r25 == 0) goto L_0x069a
            boolean r0 = r25.Btp()
            if (r0 == 0) goto L_0x069a
            r2.setVisibility(r1)
            if (r6 == 0) goto L_0x0695
            java.lang.String r0 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0695
            java.lang.String r3 = r6.A08
        L_0x0620:
            int r1 = r6.A00
            r0 = 2
            if (r1 == r0) goto L_0x0686
            r0 = 4
            if (r1 == r0) goto L_0x067f
            r0 = 6
            if (r1 == r0) goto L_0x0686
        L_0x062b:
            r15.setMessageText(r3, r5, r4)
            if (r6 == 0) goto L_0x066e
        L_0x0630:
            int r1 = r6.A00
            r0 = 2
            if (r1 == r0) goto L_0x066a
            r0 = 4
            if (r1 == r0) goto L_0x066a
            r0 = 6
            if (r1 == r0) goto L_0x066a
            r0 = 3
            if (r1 != r0) goto L_0x066e
            r5.A0E()
            android.content.res.Resources r1 = X.C36341k9.A0F(r2)
            r0 = 2131167415(0x7f0708b7, float:1.7949103E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMinimumHeight(r0)
        L_0x064f:
            X.C33521fV.A02(r2)
            r1 = 37
            X.3YF r0 = new X.3YF
            r0.<init>(r2, r4, r1)
            r2.setOnClickListener(r0)
            r0 = 1
            r2.setLongClickable(r0)
            r1 = 7
            X.7oc r0 = new X.7oc
            r0.<init>(r2, r1)
            X.C012005e.A0V(r2, r0)
            return
        L_0x066a:
            r5.A0E()
            goto L_0x064f
        L_0x066e:
            X.0ts r3 = r2.A04
            android.content.Context r1 = r2.getContext()
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
            X.4vb r0 = X.C91364bt.A00(r1, r3, r0)
            r5.A0G(r0)
            goto L_0x064f
        L_0x067f:
            r0 = 2131894371(0x7f122063, float:1.9423545E38)
            r5.setText(r0)
            goto L_0x0630
        L_0x0686:
            android.content.Context r1 = r2.getContext()
            r0 = 2131893242(0x7f121bfa, float:1.9421255E38)
            java.lang.String r0 = r1.getString(r0)
            r15.setMessageText(r0, r5, r4)
            goto L_0x0630
        L_0x0695:
            java.lang.String r3 = ""
            if (r6 == 0) goto L_0x062b
            goto L_0x0620
        L_0x069a:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageButton.A00(X.01z, X.2IR, X.4Uw, X.3T1):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc.A0j((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1J(numArr, 1);
        AnonymousClass000.A1L(numArr, 7, 1);
        this.A0F = C36421kH.A0g(numArr);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A0D = C36401kF.A0O(this, R.id.button_content);
        this.A0E = (InteractiveButtonsRowContentLayout) C012005e.A02(this, R.id.buttons_row);
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc.A0j((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public InteractiveMessageButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
