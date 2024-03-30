package X;

import android.graphics.Paint;
import android.graphics.RectF;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public class C88554Td implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public static void A01(MediaProgressRing mediaProgressRing) {
        mediaProgressRing.A05 = false;
        mediaProgressRing.A02 = new C88554Td(mediaProgressRing, 35);
        mediaProgressRing.A00 = new Paint();
        mediaProgressRing.A01 = new RectF();
    }

    public C88554Td(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C88554Td(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x038c, code lost:
        r0.A0D(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x038f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e0, code lost:
        if (X.AnonymousClass3SX.A01(r2.A0U, r2.A0A, r2.A0I) == null) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0501, code lost:
        com.whatsapp.conversation.conversationrow.MediaTimeDisplay.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0504, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x000b;
                case 8: goto L_0x0363;
                case 9: goto L_0x0370;
                case 10: goto L_0x03b3;
                case 11: goto L_0x042d;
                case 12: goto L_0x0457;
                case 17: goto L_0x045d;
                case 18: goto L_0x048e;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00be;
                case 25: goto L_0x0496;
                case 26: goto L_0x04b1;
                case 27: goto L_0x00cc;
                case 30: goto L_0x04ca;
                case 31: goto L_0x0206;
                case 32: goto L_0x0248;
                case 33: goto L_0x025d;
                case 34: goto L_0x04d2;
                case 35: goto L_0x04de;
                case 36: goto L_0x04ec;
                case 37: goto L_0x04f7;
                case 38: goto L_0x027a;
                case 48: goto L_0x032e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.C36331k8.A1J(r0, r13)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r4 = r12.A00
            X.3FP r4 = (X.AnonymousClass3FP) r4
            X.2bU r13 = (X.AnonymousClass2bU) r13
            java.lang.String r5 = r13.A1a()
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x001f
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x000a
        L_0x001f:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.A0I
            if (r0 != 0) goto L_0x002d
            X.3Jw r0 = r13.A0W()
            if (r0 == 0) goto L_0x000a
        L_0x002d:
            X.1hi r1 = r4.A0E
            r0 = r3 ^ 1
            X.C36341k9.A18(r1, r0)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x000a
            android.view.ViewGroup r1 = r4.A04
            r2 = 0
            r1.setVisibility(r2)
            X.3Jw r0 = r13.A0W()
            if (r0 == 0) goto L_0x0053
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            r1.setEnabled(r2)
            r0 = 8
            r1.setVisibility(r0)
        L_0x0053:
            if (r3 != 0) goto L_0x008a
            com.whatsapp.TextEmojiLabel r7 = r4.A06
            android.content.Context r3 = r4.A02
            android.text.TextPaint r6 = r7.getPaint()
            X.C36331k8.A1I(r3, r6)
            boolean r0 = r13 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0098
            r2 = 2131233240(0x7f0809d8, float:1.8082612E38)
            r0 = 2131888481(0x7f120961, float:1.9411599E38)
        L_0x006a:
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r3, r2, r0)
            java.lang.CharSequence r0 = X.C37351mE.A02(r6, r0, r1)
            X.AnonymousClass00C.A08(r0)
            r7.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r4.A05
            X.1Sj r0 = r4.A09
            java.lang.CharSequence r0 = r0.A01(r3, r13, r5)
            r1.setText(r0)
        L_0x008a:
            X.1SV r3 = r4.A0D
            com.whatsapp.WaImageView r2 = r4.A08
            r1 = 0
            X.2rk r0 = new X.2rk
            r0.<init>(r4, r1)
            r3.A0C(r2, r13, r0)
            return
        L_0x0098:
            boolean r0 = r13 instanceof X.C181798o3
            if (r0 == 0) goto L_0x00a3
            r2 = 2131233278(0x7f0809fe, float:1.8082689E38)
            r0 = 2131888491(0x7f12096b, float:1.9411619E38)
            goto L_0x006a
        L_0x00a3:
            boolean r0 = r13 instanceof X.C181788o2
            if (r0 == 0) goto L_0x0505
            r2 = 2131233234(0x7f0809d2, float:1.80826E38)
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            goto L_0x006a
        L_0x00ae:
            java.lang.Object r1 = r12.A00
            X.2HF r1 = (X.AnonymousClass2HF) r1
            X.3Ib r13 = (X.C62923Ib) r13
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x000a
            X.AnonymousClass2HF.A00(r1, r13)
            return
        L_0x00be:
            java.lang.Object r0 = r12.A00
            X.3uz r0 = (X.C80183uz) r0
            X.3T1 r13 = (X.AnonymousClass3T1) r13
            if (r13 == 0) goto L_0x000a
            X.4V7 r0 = r0.A01
            r0.BpS(r13)
            return
        L_0x00cc:
            java.lang.Object r1 = r12.A00
            X.2IR r1 = (X.AnonymousClass2IR) r1
            X.39v r13 = (X.C609139v) r13
            if (r13 == 0) goto L_0x000a
            int r4 = r13.A01
            r3 = 8
            r2 = 0
            if (r4 == 0) goto L_0x050c
            r6 = 1
            if (r4 == r6) goto L_0x01c3
            r0 = 2
            if (r4 != r0) goto L_0x000a
            X.4Ux r0 = r1.A0d
            boolean r0 = r0.Btx()
            if (r0 == 0) goto L_0x0188
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            android.view.View r3 = r1.findViewById(r0)
        L_0x00f0:
            r4 = 0
            android.content.Context r8 = X.C36431kI.A0A(r3, r1, r4)
            r7 = 2131893258(0x7f121c0a, float:1.9421287E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r0 = r13.A04
            r5[r4] = r0
            X.C36371kC.A14(r8, r3, r5, r7)
            X.3T1 r0 = r1.getFMessage()
            com.whatsapp.jid.UserJid r0 = r0.A0L()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x0182
            r3.setOnClickListener(r2)
        L_0x0112:
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x017a
            r5 = r3
            android.widget.ImageView r5 = (android.widget.ImageView) r5
        L_0x0119:
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0178
            r0 = 2131430658(0x7f0b0d02, float:1.8483023E38)
            android.widget.TextView r6 = X.C36391kE.A0P(r3, r0)
        L_0x0124:
            android.graphics.Bitmap r0 = r13.A02
            if (r0 == 0) goto L_0x0139
            r5.setBackground(r2)
            r5.setImageBitmap(r0)
        L_0x012e:
            if (r6 == 0) goto L_0x000a
            r0 = 8
            r6.setVisibility(r0)
            r5.setVisibility(r4)
            return
        L_0x0139:
            if (r6 == 0) goto L_0x015f
            java.lang.String r7 = r13.A05
            if (r7 == 0) goto L_0x015f
            X.0yC r3 = r1.A0G
            X.0yV r2 = X.C21000yV.A01
            r0 = 3261(0xcbd, float:4.57E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)
            if (r0 == 0) goto L_0x015f
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x0158
            int r0 = r13.A00
            r1.setColor(r0)
        L_0x0158:
            r6.setText(r7)
            X.C36381kD.A1B(r6, r5)
            return
        L_0x015f:
            X.1Pr r3 = r1.A1L
            int r2 = r13.A00
            X.3c0 r1 = X.C68503c0.A00
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            android.graphics.drawable.Drawable r0 = X.C36371kC.A0F(r0, r1, r3)
            r5.setBackground(r0)
            r0 = 2131231034(0x7f08013a, float:1.8078138E38)
            r5.setImageResource(r0)
            goto L_0x012e
        L_0x0178:
            r6 = r2
            goto L_0x0124
        L_0x017a:
            r0 = 2131430659(0x7f0b0d03, float:1.8483025E38)
            android.widget.ImageView r5 = X.C36391kE.A0N(r3, r0)
            goto L_0x0119
        L_0x0182:
            r0 = 35
            X.C48912iG.A00(r3, r1, r0)
            goto L_0x0112
        L_0x0188:
            android.util.Pair r0 = r1.A04
            if (r0 == 0) goto L_0x0194
            java.lang.Object r3 = r0.first
            if (r3 == 0) goto L_0x0194
            android.view.View r3 = (android.view.View) r3
            goto L_0x00f0
        L_0x0194:
            X.0yC r4 = r1.A0G
            X.0yV r3 = X.C21000yV.A01
            r0 = 3261(0xcbd, float:4.57E-42)
            boolean r5 = X.C20800yB.A01(r3, r4, r0)
            r4 = 0
            android.view.LayoutInflater r3 = X.C36351kA.A0C(r1)
            r0 = 2131625123(0x7f0e04a3, float:1.8877445E38)
            if (r5 == 0) goto L_0x01ab
            r0 = 2131625124(0x7f0e04a4, float:1.8877447E38)
        L_0x01ab:
            android.view.View r3 = r3.inflate(r0, r1, r4)
            r1.addView(r3)
            X.AnonymousClass2IR.A0W(r3, r1)
            int r0 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            r1.A04 = r0
            goto L_0x00f0
        L_0x01c3:
            X.4Ux r0 = r1.A0d
            boolean r0 = r0.Btx()
            if (r0 == 0) goto L_0x01f1
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x01d2:
            if (r1 == 0) goto L_0x000a
            r1.setVisibility(r3)
            r1.setOnClickListener(r2)
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x01e9
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L_0x01e0:
            if (r1 == 0) goto L_0x000a
            r1.setBackground(r2)
            r1.setImageDrawable(r2)
            return
        L_0x01e9:
            r0 = 2131430659(0x7f0b0d03, float:1.8483025E38)
            android.widget.ImageView r1 = X.C36391kE.A0N(r1, r0)
            goto L_0x01e0
        L_0x01f1:
            android.util.Pair r0 = r1.A04
            if (r0 != 0) goto L_0x0201
            int r0 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            r1.A04 = r0
        L_0x0201:
            java.lang.Object r1 = r0.first
            android.view.View r1 = (android.view.View) r1
            goto L_0x01d2
        L_0x0206:
            java.lang.Object r2 = r12.A00
            X.3fI r2 = (X.C70523fI) r2
            X.3Gh r13 = (X.C62473Gh) r13
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r2.A0N
            if (r0 == 0) goto L_0x000a
            X.00s r0 = r0.A01
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x021e
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x000a
        L_0x021e:
            if (r13 == 0) goto L_0x052b
            java.util.HashMap r1 = r13.A03
            int r0 = r1.size()
            if (r0 == 0) goto L_0x052b
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0240
            X.4Uv r0 = r2.A0M
            boolean r0 = r0.BMu()
            if (r0 == 0) goto L_0x0240
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r2.A0u
            X.C18740tg.A06(r1)
            r0 = 0
            r1.A0S(r0)
        L_0x0240:
            X.0V9 r0 = r2.A00
            if (r0 == 0) goto L_0x000a
            r0.A06()
            return
        L_0x0248:
            java.lang.Object r1 = r12.A00
            X.3fI r1 = (X.C70523fI) r1
            boolean r0 = X.AnonymousClass000.A1X(r13)
            if (r0 == 0) goto L_0x000a
            X.155 r1 = X.C70523fI.A00(r1)
            r0 = 2131891343(0x7f12148f, float:1.9417403E38)
            r1.BO5(r0)
            return
        L_0x025d:
            java.lang.Object r1 = r12.A00
            X.3fI r1 = (X.C70523fI) r1
            int r0 = X.AnonymousClass000.A0I(r13)
            if (r0 != 0) goto L_0x000a
            X.0V9 r0 = r1.A00
            if (r0 == 0) goto L_0x0271
            r0.A05()
            r0 = 0
            r1.A00 = r0
        L_0x0271:
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r1.A0u
            if (r1 == 0) goto L_0x000a
            r0 = 0
            r1.A0S(r0)
            return
        L_0x027a:
            java.lang.Object r3 = r12.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r3
            int r1 = X.AnonymousClass000.A0I(r13)
            X.1nW r0 = r3.A0B
            if (r1 != 0) goto L_0x028a
            r0.notifyDataSetChanged()
            return
        L_0x028a:
            r0.notifyDataSetChanged()
            r6 = 2
            if (r1 != r6) goto L_0x052f
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r3.A0A
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            X.3Gh r0 = (X.C62473Gh) r0
            if (r0 == 0) goto L_0x000a
            java.util.Collection r0 = r0.A01()
            if (r0 == 0) goto L_0x000a
            X.3T1 r0 = X.C36421kH.A0S(r0)
            if (r0 == 0) goto L_0x000a
            X.3Qa r4 = r0.A1J
            android.widget.ListView r0 = r3.A02
            int r2 = r0.getChildCount()
            r1 = 0
        L_0x02b1:
            if (r1 >= r2) goto L_0x000a
            android.widget.ListView r0 = r3.A02
            android.view.View r5 = r0.getChildAt(r1)
            boolean r0 = r5 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x032b
            X.2IR r5 = (X.AnonymousClass2IR) r5
            boolean r0 = r5.A2C(r4)
            if (r0 == 0) goto L_0x032b
            android.view.View r1 = r5.A0b
            androidx.appcompat.widget.Toolbar r0 = r3.A03
            if (r1 == 0) goto L_0x0329
            if (r0 == 0) goto L_0x0329
            int[] r2 = new int[r6]
            r1.getLocationInWindow(r2)
            int[] r1 = new int[r6]
            r0.getLocationInWindow(r1)
            r0 = 1
            r8 = r2[r0]
            r0 = r1[r0]
            int r8 = r8 - r0
        L_0x02dd:
            android.view.View r1 = r3.A01
            X.0ts r0 = r3.A00
            int r9 = X.C34081gQ.A00(r1, r0)
            int r1 = X.AnonymousClass04F.A03(r5)
            int r0 = X.AnonymousClass04F.A02(r5)
            android.os.Bundle r7 = X.AnonymousClass001.A07()
            r5.A1k(r7)
            r10 = 0
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r1, r10, r0, r10)
            X.3fI r0 = r3.A00
            X.3HC r0 = r0.A0P
            X.4Ux r1 = r0.A01
            X.AnonymousClass00C.A0D(r1, r10)
            java.util.Map r0 = r0.A0F
            java.lang.Object r0 = r0.get(r1)
            int r11 = X.C36381kD.A07(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.selection.SingleSelectedMessageActivity"
            android.content.Intent r5 = r2.setClassName(r1, r0)
            X.AnonymousClass3UJ.A00(r5, r4)
            X.AnonymousClass190.A1U(r5, r6, r7, r8, r9, r10, r11)
            X.1Dv r1 = r3.A01
            r0 = 906(0x38a, float:1.27E-42)
            r1.A09(r3, r5, r0)
            return
        L_0x0329:
            r8 = 0
            goto L_0x02dd
        L_0x032b:
            int r1 = r1 + 1
            goto L_0x02b1
        L_0x032e:
            java.lang.Object r2 = r12.A00
            X.2JG r2 = (X.AnonymousClass2JG) r2
            int r1 = X.AnonymousClass000.A0I(r13)
            X.4V4 r0 = r2.A05
            r0.notifyDataSetChanged()
            if (r1 == 0) goto L_0x000a
            X.1H2 r9 = r2.A0C
            X.3fI r0 = r2.A00
            X.16D r3 = r0.A0C
            X.171 r4 = r0.A0F
            X.0ts r8 = r2.A00
            X.3C3 r0 = r2.A02
            X.2JQ r6 = r0.A00(r2)
            X.3PH r5 = new X.3PH
            r5.<init>()
            X.2Jj r7 = r2.A09
            r11 = 1
            X.4W7 r1 = new X.4W7
            r10 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.0V9 r0 = r2.But(r1)
            r2.setSelectionActionMode(r0)
            return
        L_0x0363:
            java.lang.Object r2 = r12.A00
            X.1sL r2 = (X.C39451sL) r2
            X.00s r1 = r2.A03
            r0 = 0
            X.C36341k9.A18(r1, r0)
            X.08S r0 = r2.A00
            goto L_0x038c
        L_0x0370:
            java.lang.Object r3 = r12.A00
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r3 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r3
            java.util.List r13 = (java.util.List) r13
            r1 = 0
            r2 = 1
            X.AnonymousClass00C.A0D(r13, r2)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0390
            X.00s r1 = r3.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0387:
            r1.A0C(r0)
            X.08S r0 = r3.A08
        L_0x038c:
            r0.A0D(r13)
            return
        L_0x0390:
            java.lang.Object r0 = r13.get(r1)
            boolean r0 = r0 instanceof X.C70203el
            if (r0 == 0) goto L_0x03a0
            X.00s r1 = r3.A0D
            r0 = 3
        L_0x039b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0387
        L_0x03a0:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x03af
            X.00s r1 = r3.A0A
            java.lang.Object r0 = r1.A04()
            if (r0 != 0) goto L_0x03af
            X.C36341k9.A18(r1, r2)
        L_0x03af:
            X.00s r1 = r3.A0D
            r0 = 2
            goto L_0x039b
        L_0x03b3:
            java.lang.Object r2 = r12.A00
            X.2Gx r2 = (X.C43322Gx) r2
            X.2sF r13 = (X.C54002sF) r13
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            r2.A0H = r13
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x03c8
            r2.A0B()
        L_0x03c8:
            r7 = 5000(0x1388, double:2.4703E-320)
            X.0yC r1 = r2.A0d
            r0 = 6172(0x181c, float:8.649E-42)
            boolean r0 = r1.A0E(r0)
            r3 = 1
            if (r0 == 0) goto L_0x03e2
            X.141 r4 = r2.A0I
            X.0wo r1 = r2.A0A
            X.01L r0 = r2.A0U
            java.lang.String r1 = X.AnonymousClass3SX.A01(r0, r1, r4)
            r0 = 1
            if (r1 != 0) goto L_0x03e3
        L_0x03e2:
            r0 = 0
        L_0x03e3:
            r2.A04 = r0
            X.141 r0 = r2.A0I
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x03f1
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x040a
        L_0x03f1:
            r0 = 20
            X.3v3 r0 = X.C80223v3.A00(r2, r0)
            r2.A03 = r0
            android.os.Handler r1 = X.C36341k9.A0H()
            r2.A01 = r1
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0405
            r7 = 2500(0x9c4, double:1.235E-320)
        L_0x0405:
            java.lang.Runnable r0 = r2.A03
            r1.postDelayed(r0, r7)
        L_0x040a:
            X.3Qf r4 = r2.A09
            X.141 r5 = r2.A0I
            boolean r9 = r2.A04
            X.11F r6 = r2.A0e
            r4.A04(r5, r6, r7, r9)
            X.1CF r1 = r2.A0C
            X.141 r0 = r2.A0I
            X.11F r0 = r0.A0H
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0425
            X.141 r0 = r2.A0I
            r0.A0i = r3
        L_0x0425:
            X.0wU r1 = r2.A0f
            r0 = 18
            X.C80223v3.A02(r1, r2, r0)
            return
        L_0x042d:
            java.lang.Object r5 = r12.A00
            com.whatsapp.conversation.CustomStickerConfirmationDialog r5 = (com.whatsapp.conversation.CustomStickerConfirmationDialog) r5
            X.00T r0 = r5.A03
            java.lang.Object r4 = r0.getValue()
            X.1uB r4 = (X.C39901uB) r4
            X.00T r0 = r5.A02
            X.11F r3 = X.C36421kH.A0O(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 1
            r4.A00 = r0
            X.040 r2 = X.C109325Xd.A00(r4)
            r1 = 0
            com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1 r0 = new com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1
            r0.<init>(r4, r3, r1)
            X.C36331k8.A1T(r0, r2)
            r5.A1b()
            return
        L_0x0457:
            java.lang.Object r0 = r12.A00
            X.C36431kI.A1N(r0)
            return
        L_0x045d:
            java.lang.Object r2 = r12.A00
            X.2Gw r2 = (X.AnonymousClass2Gw) r2
            X.2sF r13 = (X.C54002sF) r13
            long r0 = java.lang.System.currentTimeMillis()
            r2.A01 = r0
            r2.A0H = r13
            r2.A0B()
            r6 = 5000(0x1388, double:2.4703E-320)
            X.3Qf r3 = r2.A09
            X.141 r4 = r2.A0I
            r8 = 0
            X.11F r5 = r2.A0e
            r3.A04(r4, r5, r6, r8)
            r0 = 35
            X.3v3 r0 = X.C80223v3.A00(r2, r0)
            r2.A04 = r0
            android.os.Handler r1 = X.C36341k9.A0H()
            r2.A02 = r1
            java.lang.Runnable r0 = r2.A04
            r1.postDelayed(r0, r6)
            return
        L_0x048e:
            java.lang.Object r0 = r12.A00
            X.2H2 r0 = (X.AnonymousClass2H2) r0
            X.AnonymousClass2H2.A07(r0)
            return
        L_0x0496:
            java.lang.Object r1 = r12.A00
            X.2HF r1 = (X.AnonymousClass2HF) r1
            X.3T1 r13 = (X.AnonymousClass3T1) r13
            r0 = 0
            if (r13 != 0) goto L_0x04a3
            r1.A0A(r0)
            return
        L_0x04a3:
            boolean r0 = r1.A0C()
            if (r0 != 0) goto L_0x04ad
            r1.A08()
            return
        L_0x04ad:
            X.AnonymousClass2HF.A01(r1, r13)
            return
        L_0x04b1:
            java.lang.Object r2 = r12.A00
            X.14u r2 = (X.C225314u) r2
            X.0wn r13 = (X.C19960wn) r13
            java.lang.Object r0 = r13.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment r1 = new com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C36331k8.A07(r0)
            X.C36381kD.A17(r0, r1, r2)
            return
        L_0x04ca:
            java.lang.Object r0 = r12.A00
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            return
        L_0x04d2:
            java.lang.Object r1 = r12.A00
            X.4Uv r1 = (X.C88994Uv) r1
            int r0 = X.AnonymousClass000.A0I(r13)
            r1.Be8(r0)
            return
        L_0x04de:
            java.lang.Object r1 = r12.A00
            com.whatsapp.conversation.conversationrow.MediaProgressRing r1 = (com.whatsapp.conversation.conversationrow.MediaProgressRing) r1
            boolean r0 = X.AnonymousClass000.A1X(r13)
            r1.A05 = r0
            r1.invalidate()
            return
        L_0x04ec:
            java.lang.Object r1 = r12.A00
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r1 = (com.whatsapp.conversation.conversationrow.MediaTimeDisplay) r1
            boolean r0 = X.AnonymousClass000.A1X(r13)
            r1.A06 = r0
            goto L_0x0501
        L_0x04f7:
            java.lang.Object r1 = r12.A00
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r1 = (com.whatsapp.conversation.conversationrow.MediaTimeDisplay) r1
            int r0 = X.AnonymousClass000.A0I(r13)
            r1.A00 = r0
        L_0x0501:
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay.A01(r1)
            return
        L_0x0505:
            java.lang.String r0 = "Unexpected message type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x050c:
            X.4Ux r0 = r1.A0d
            boolean r0 = r0.Btx()
            if (r0 == 0) goto L_0x051b
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            X.C36341k9.A10(r1, r0, r3)
            return
        L_0x051b:
            android.util.Pair r0 = r1.A04
            if (r0 == 0) goto L_0x0528
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x0528
            android.view.View r0 = (android.view.View) r0
            r1.removeView(r0)
        L_0x0528:
            r1.A04 = r2
            return
        L_0x052b:
            r2.B7Q()
            return
        L_0x052f:
            X.3fY r0 = r3.A0F
            X.0V9 r0 = r3.But(r0)
            r3.setSelectionActionMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88554Td.BTH(java.lang.Object):void");
    }
}
