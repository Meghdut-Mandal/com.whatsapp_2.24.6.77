package X;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2IC  reason: invalid class name */
public class AnonymousClass2IC extends AnonymousClass8Z2 {
    public int A00 = 0;
    public MessageCommentsManager A01;
    public AnonymousClass3E2 A02;
    public C19720wP A03;
    public AnonymousClass1Y4 A04;
    public AnonymousClass1ST A05;
    public AnonymousClass3P3 A06;
    public AnonymousClass1D1 A07;
    public List A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public AnonymousClass31C A0B = new AnonymousClass31C(this);
    public final C160527l9 A0C = new C53702rk(this, 3);
    public final AnonymousClass1RJ A0D;
    public final ArrayList A0E;
    public final TextView A0F = C36391kE.A0P(this, R.id.more);
    public final C33541fX A0G = C48742hy.A00(this, 0);
    public final C33541fX A0H = C48742hy.A00(this, 2);
    public final C33541fX A0I = C48742hy.A00(this, 1);

    public void A1Y() {
        A0C(false);
        AnonymousClass2IR.A0d(this, false);
    }

    public int getMaxAlbumSize() {
        return 102;
    }

    public int getMinAlbumSize() {
        return 4;
    }

    public static Intent A0B(AnonymousClass2IC r6) {
        AnonymousClass11F r3;
        long[] jArr = new long[r6.A08.size()];
        for (int i = 0; i < r6.A08.size(); i++) {
            jArr[i] = C36411kG.A0n(r6.A08, i).A1N;
        }
        AnonymousClass3T1 r1 = r6.A0K;
        C64933Qa r0 = r1.A1J;
        AnonymousClass11F r4 = r0.A00;
        if (r0.A02) {
            r3 = null;
        } else if (!AnonymousClass143.A0G(r4) || (r3 = r1.A0J()) == null) {
            r3 = r4;
        }
        Context context = r6.getContext();
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity");
        A0D2.putExtra("message_ids", jArr);
        C36421kH.A0m(A0D2, r3);
        C36341k9.A0t(A0D2, r4);
        return A0D2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d2, code lost:
        if (r16 == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01de, code lost:
        if ((r2 instanceof X.C181788o2) != false) goto L_0x01e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(boolean r27) {
        /*
            r26 = this;
            r6 = r26
            java.util.List r0 = r6.A08
            if (r0 == 0) goto L_0x04b7
            if (r27 == 0) goto L_0x001a
            X.1RJ r1 = r6.A0D
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r1.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A02
            r0 = 0
            r1.setTag(r0)
        L_0x001a:
            java.util.List r0 = r6.A08
            int r1 = r0.size()
            java.util.ArrayList r10 = r6.A0E
            int r0 = r10.size()
            r7 = 1
            r5 = 0
            r16 = 0
            if (r1 <= r0) goto L_0x002e
            r16 = 1
        L_0x002e:
            r9 = 0
        L_0x002f:
            r8 = 4
            r4 = 3
            if (r9 >= r8) goto L_0x026c
            java.lang.Object r3 = r10.get(r9)
            X.3Rw r3 = (X.C65393Rw) r3
            java.util.List r0 = r6.A08
            java.lang.Object r2 = r0.get(r9)
            X.2bU r2 = (X.AnonymousClass2bU) r2
            boolean r0 = X.C65453Sc.A03(r2)
            r11 = 2
            if (r0 == 0) goto L_0x007b
            android.widget.ImageView r0 = r3.A00
            if (r0 != 0) goto L_0x007b
            X.2IC r0 = r3.A09
            android.widget.ImageView r12 = X.C36361kB.A0L(r0)
            r3.A00 = r12
            r1 = 2131890657(0x7f1211e1, float:1.9416012E38)
            int r0 = X.C36371kC.A02(r0)
            X.C65393Rw.A00(r12, r3, r1, r0)
            android.view.ViewGroup r12 = r3.A05
            android.widget.ImageView r1 = r3.A00
            android.view.View[] r13 = new android.view.View[r8]
            android.widget.ImageView r0 = r3.A02
            r13[r5] = r0
            r13[r7] = r1
            android.widget.ImageView r0 = r3.A01
            r13[r11] = r0
            r0 = 0
            r13[r4] = r0
            int r0 = X.C63773Lj.A00(r13, r7)
            r12.addView(r1, r0)
            r12.setClipChildren(r5)
        L_0x007b:
            boolean r0 = X.C65453Sc.A03(r2)
            r12 = 8
            if (r0 == 0) goto L_0x0263
            android.widget.ImageView r13 = r3.A00
            if (r13 == 0) goto L_0x0263
            X.2IC r0 = r3.A09
            android.content.Context r14 = r0.getContext()
            X.AnonymousClass00C.A0D(r14, r5)
            r1 = 2131233060(0x7f080924, float:1.8082247E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r14, r1, r0)
            r13.setImageDrawable(r0)
            android.widget.ImageView r0 = r3.A00
            r0.setVisibility(r5)
        L_0x00a2:
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x00d9
            android.widget.ImageView r0 = r3.A02
            if (r0 != 0) goto L_0x00d9
            X.2IC r0 = r3.A09
            android.widget.ImageView r13 = X.C36361kB.A0L(r0)
            r3.A02 = r13
            r1 = 2131894475(0x7f1220cb, float:1.9423756E38)
            int r0 = X.C36371kC.A02(r0)
            X.C65393Rw.A00(r13, r3, r1, r0)
            android.view.ViewGroup r13 = r3.A05
            android.widget.ImageView r1 = r3.A02
            android.view.View[] r14 = new android.view.View[r8]
            r14[r5] = r1
            android.widget.ImageView r0 = r3.A00
            r14[r7] = r0
            android.widget.ImageView r0 = r3.A01
            r14[r11] = r0
            r0 = 0
            r14[r4] = r0
            int r0 = X.C63773Lj.A00(r14, r5)
            r13.addView(r1, r0)
            r13.setClipChildren(r5)
        L_0x00d9:
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x025a
            android.widget.ImageView r13 = r3.A02
            if (r13 == 0) goto L_0x025a
            X.2IC r0 = r3.A09
            android.content.Context r14 = r0.getContext()
            X.AnonymousClass00C.A0D(r14, r5)
            r1 = 2131233199(0x7f0809af, float:1.8082529E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r14, r1, r0)
            r13.setImageDrawable(r0)
            android.widget.ImageView r0 = r3.A02
            r0.setVisibility(r5)
        L_0x00fc:
            X.5J2 r0 = r2.A1V
            if (r0 != 0) goto L_0x0256
            r1 = 0
        L_0x0101:
            android.widget.ImageView r0 = r3.A01
            if (r1 != r7) goto L_0x024f
            if (r0 != 0) goto L_0x0136
            X.2IC r0 = r3.A09
            android.widget.ImageView r12 = X.C36361kB.A0L(r0)
            r3.A01 = r12
            r1 = 2131893048(0x7f121b38, float:1.9420862E38)
            int r0 = X.C36371kC.A02(r0)
            X.C65393Rw.A00(r12, r3, r1, r0)
            android.view.ViewGroup r12 = r3.A05
            android.widget.ImageView r1 = r3.A01
            android.view.View[] r13 = new android.view.View[r8]
            android.widget.ImageView r0 = r3.A02
            r13[r5] = r0
            android.widget.ImageView r0 = r3.A00
            r13[r7] = r0
            r13[r11] = r1
            r0 = 0
            r13[r4] = r0
            int r0 = X.C63773Lj.A00(r13, r11)
            r12.addView(r1, r0)
            r12.setClipChildren(r5)
        L_0x0136:
            android.widget.ImageView r12 = r3.A01
            X.2IC r0 = r3.A09
            android.content.Context r11 = r0.getContext()
            X.AnonymousClass00C.A0D(r11, r5)
            r1 = 2131234374(0x7f080e46, float:1.8084912E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r11, r1, r0)
            r12.setImageDrawable(r0)
            android.widget.ImageView r0 = r3.A01
            r0.setVisibility(r5)
        L_0x0153:
            android.widget.TextView r1 = r3.A08
            X.2IC r12 = r3.A09
            X.0ts r11 = r12.A0E
            X.0wo r0 = r12.A19
            X.AnonymousClass3T1.A07(r1, r0, r11, r2)
            r0 = 2131231135(0x7f08019f, float:1.8078342E38)
            r12.A1q(r1, r2, r0)
            X.1SV r13 = r12.A1y
            android.widget.ImageView r11 = r3.A06
            X.7l9 r12 = r12.A0C
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "album-"
            r14.append(r0)
            X.3Qa r0 = r2.A1J
            java.lang.String r21 = X.AnonymousClass000.A0o(r0, r14)
            r22 = 100
            r23 = 0
            r24 = 0
            r25 = 1
            r19 = r12
            r20 = r13
            r18 = r2
            r17 = r11
            X.AnonymousClass1SV.A06(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r12 = r0.A02
            if (r12 == 0) goto L_0x01b6
            android.widget.ImageView r14 = r3.A07
            if (r14 == 0) goto L_0x01b6
            int r13 = r2.A0D
            r0 = 13
            int r0 = X.AnonymousClass3TJ.A00(r13, r0)
            boolean r15 = X.C36401kF.A1U(r0)
            r0 = 2131233176(0x7f080998, float:1.8082482E38)
            if (r15 != 0) goto L_0x01b3
            r0 = 5
            int r0 = X.AnonymousClass3TJ.A00(r13, r0)
            boolean r0 = X.C36401kF.A1U(r0)
            if (r0 == 0) goto L_0x0245
            r0 = 2131233183(0x7f08099f, float:1.8082496E38)
        L_0x01b3:
            r14.setImageResource(r0)
        L_0x01b6:
            java.lang.String r0 = X.AnonymousClass3RL.A01(r2)
            X.C011004s.A08(r11, r0)
            java.lang.String r0 = X.AnonymousClass3RL.A00(r2)
            X.C011004s.A08(r1, r0)
            android.widget.ImageView r1 = r3.A07
            if (r1 == 0) goto L_0x01cf
            java.lang.String r0 = X.AnonymousClass2IQ.A0N(r2)
            X.C011004s.A08(r1, r0)
        L_0x01cf:
            if (r9 != r4) goto L_0x01d4
            r4 = 1
            if (r16 != 0) goto L_0x01d5
        L_0x01d4:
            r4 = 0
        L_0x01d5:
            X.3Qj r1 = r2.A01
            boolean r0 = r2 instanceof X.C181798o3
            if (r0 != 0) goto L_0x01e0
            boolean r0 = r2 instanceof X.C181788o2
            r13 = 0
            if (r0 == 0) goto L_0x01e1
        L_0x01e0:
            r13 = 1
        L_0x01e1:
            boolean r8 = r2 instanceof X.C46882bp
            if (r4 != 0) goto L_0x020a
            if (r1 == 0) goto L_0x020a
            if (r8 == 0) goto L_0x01fc
            X.2IC r0 = r3.A09
            X.1D1 r11 = r0.A07
            int r4 = r1.A0A
            int r1 = r1.A06
            X.3IX r0 = new X.3IX
            r0.<init>(r4, r1)
            boolean r0 = r11.A03(r0, r5)
            if (r0 == 0) goto L_0x020a
        L_0x01fc:
            if (r13 == 0) goto L_0x020e
            X.2IC r0 = r3.A09
            X.1E2 r1 = r0.A1W
            X.0yC r0 = r0.A0G
            boolean r0 = X.AnonymousClass3T2.A00(r0, r1, r2)
            if (r0 != 0) goto L_0x020e
        L_0x020a:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x020e:
            boolean r0 = X.C66013Ui.A10(r2)
            if (r0 == 0) goto L_0x020a
            X.1RJ r4 = r3.A03
            if (r4 == 0) goto L_0x020a
            if (r8 == 0) goto L_0x022a
            X.2IC r0 = r3.A09
            X.1D1 r0 = r0.A07
            if (r12 == 0) goto L_0x023a
            X.0yC r1 = r0.A02
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = r1.A0E(r0)
        L_0x0228:
            if (r0 == 0) goto L_0x020a
        L_0x022a:
            X.2IC r0 = r3.A09
            X.0yC r1 = r0.A0G
            r0 = 4048(0xfd0, float:5.672E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x020a
            r4.A03(r5)
            goto L_0x020a
        L_0x023a:
            X.0yC r2 = r0.A02
            r1 = 3116(0xc2c, float:4.366E-42)
            X.0yV r0 = X.C21000yV.A01
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            goto L_0x0228
        L_0x0245:
            r0 = 2131233208(0x7f0809b8, float:1.8082547E38)
            if (r13 != r8) goto L_0x01b3
            r0 = 2131233179(0x7f08099b, float:1.8082488E38)
            goto L_0x01b3
        L_0x024f:
            if (r0 == 0) goto L_0x0153
            r0.setVisibility(r12)
            goto L_0x0153
        L_0x0256:
            int r1 = r0.A00
            goto L_0x0101
        L_0x025a:
            android.widget.ImageView r0 = r3.A02
            if (r0 == 0) goto L_0x00fc
            r0.setVisibility(r12)
            goto L_0x00fc
        L_0x0263:
            android.widget.ImageView r0 = r3.A00
            if (r0 == 0) goto L_0x00a2
            r0.setVisibility(r12)
            goto L_0x00a2
        L_0x026c:
            java.lang.Object r1 = r10.get(r4)
            X.3Rw r1 = (X.C65393Rw) r1
            r3 = 8
            android.widget.TextView r13 = r6.A0F
            if (r16 == 0) goto L_0x0497
            android.content.Context r12 = X.C36431kI.A0A(r13, r6, r5)
            r11 = 2131893096(0x7f121b68, float:1.9420959E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.util.List r0 = r6.A08
            int r2 = r0.size()
            int r0 = r10.size()
            int r2 = r2 - r0
            int r0 = r2 + 1
            X.AnonymousClass000.A1L(r9, r0, r5)
            X.C36341k9.A0s(r12, r13, r9, r11)
            android.widget.TextView r0 = r1.A08
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.A07
            if (r0 == 0) goto L_0x02a0
            r0.setVisibility(r3)
        L_0x02a0:
            java.util.List r0 = r6.A08
            int r8 = X.C36421kH.A06(r0, r8)
            android.widget.ImageView r2 = r1.A06
            r0 = 2131886353(0x7f120111, float:1.9407282E38)
            X.C33521fV.A03(r2, r0)
            X.0ts r1 = r6.A0E
            r0 = 2131755250(0x7f1000f2, float:1.9141374E38)
            java.lang.String r0 = X.C36331k8.A0g(r1, r8, r5, r0)
            r2.setContentDescription(r0)
        L_0x02ba:
            java.util.List r0 = r6.A08
            if (r0 == 0) goto L_0x031d
            java.util.Iterator r1 = r0.iterator()
        L_0x02c2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x031d
            X.2bU r0 = X.C36441kJ.A0r(r1)
            X.3Qj r0 = X.AnonymousClass2bU.A00(r0)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x02c2
            X.1RJ r2 = r6.A0D
            r2.A03(r5)
            r1 = r27 ^ 1
            android.view.View r0 = r2.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass2IQ.A0S(r0, r7, r1)
            android.view.View r0 = r2.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.1RJ r0 = r0.A04
            X.1fX r1 = r6.A0G
            r0.A05(r1)
            android.view.View r0 = r2.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.view.View r0 = r0.A00
            r0.setOnClickListener(r1)
            android.view.View r0 = r2.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.1RJ r0 = r0.A05
            r0.A05(r1)
        L_0x0307:
            r6.A1d()
            java.util.List r0 = r6.A08
            X.3T1 r0 = X.C36411kG.A0n(r0, r5)
            r6.A20(r0)
            java.util.List r0 = r6.A08
            X.3T1 r0 = X.C36411kG.A0n(r0, r5)
            r6.A1z(r0)
            return
        L_0x031d:
            java.util.List r0 = r6.A08
            if (r0 == 0) goto L_0x0486
            java.util.Iterator r2 = r0.iterator()
        L_0x0325:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0486
            X.2bU r0 = X.C36441kJ.A0r(r2)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r0)
            boolean r0 = A0D(r6, r0)
            if (r0 != 0) goto L_0x0325
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0325
            X.1RJ r3 = r6.A0D
            r3.A03(r5)
            r1 = r27 ^ 1
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass2IQ.A0S(r0, r5, r1)
            java.util.List r0 = r6.A08
            java.util.Iterator r10 = r0.iterator()
            r9 = 0
            r8 = 0
        L_0x0355:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0376
            X.2bU r2 = X.C36441kJ.A0r(r10)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0355
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0355
            boolean r0 = X.C54732tQ.A00(r2)
            if (r0 == 0) goto L_0x0373
            int r8 = r8 + 1
        L_0x0373:
            int r9 = r9 + 1
            goto L_0x0355
        L_0x0376:
            if (r9 == r8) goto L_0x03b8
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r7 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r7 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r7
            android.content.Context r1 = r6.getContext()
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            java.lang.String r0 = r1.getString(r0)
            X.1fX r3 = r6.A0I
            r2 = 2131231205(0x7f0801e5, float:1.8078484E38)
            X.AnonymousClass00C.A0D(r0, r5)
            X.AnonymousClass00C.A0D(r3, r4)
            android.widget.TextView r1 = r7.A02
            r1.setText(r0)
            r0 = 2132083138(0x7f1501c2, float:1.980641E38)
            X.AnonymousClass088.A06(r1, r0)
            android.widget.ImageView r0 = r7.A01
            r0.setImageResource(r2)
            android.view.View r0 = r7.A00
            r0.setOnClickListener(r3)
            goto L_0x0307
        L_0x03b8:
            r6.A00 = r5
            r6.A0A = r5
            r6.A09 = r5
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.List r0 = r6.A08
            java.util.Iterator r9 = r0.iterator()
            r10 = 0
        L_0x03ca:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0407
            X.2bU r8 = X.C36441kJ.A0r(r9)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r8)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x03ca
            boolean r0 = A0D(r6, r8)
            if (r0 != 0) goto L_0x03ca
            r2.add(r8)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            long r0 = r8.A00
            long r10 = r10 + r0
            boolean r1 = r6.A09
            int r8 = r8.A1I
            boolean r0 = X.AnonymousClass000.A1S(r8, r7)
            r1 = r1 | r0
            r6.A09 = r1
            boolean r1 = r6.A0A
            boolean r0 = X.AnonymousClass000.A1S(r8, r4)
            r0 = r0 | r1
            r6.A0A = r0
            goto L_0x03ca
        L_0x0407:
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r0.setTag(r2)
            android.view.View r9 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r9 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r9
            X.1fX r8 = r6.A0H
            java.lang.String r7 = ""
            r4 = 2131231153(0x7f0801b1, float:1.8078379E38)
            r0 = 3
            X.AnonymousClass00C.A0D(r8, r0)
            android.widget.TextView r1 = r9.A02
            r1.setText(r7)
            r0 = 2132083137(0x7f1501c1, float:1.9806408E38)
            X.AnonymousClass088.A06(r1, r0)
            android.widget.ImageView r0 = r9.A01
            r0.setImageResource(r4)
            android.view.View r0 = r9.A00
            r0.setOnClickListener(r8)
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r8 = 0
            r7 = r0
            r9 = r2
            r6.A1r(r7, r8, r9, r10)
            int r4 = r6.A00
            if (r4 != 0) goto L_0x0459
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0307
        L_0x0459:
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x0479
            X.0ts r2 = r6.A0E
            r1 = 2131755253(0x7f1000f5, float:1.914138E38)
        L_0x0462:
            java.lang.String r1 = X.C36331k8.A0g(r2, r4, r5, r1)
            android.view.View r0 = r3.A01()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass00C.A0D(r1, r5)
            android.widget.TextView r0 = r0.A03
            r0.setText(r1)
            r0.setVisibility(r5)
            goto L_0x0307
        L_0x0479:
            boolean r0 = r6.A0A
            X.0ts r2 = r6.A0E
            r1 = 2131755248(0x7f1000f0, float:1.914137E38)
            if (r0 != 0) goto L_0x0462
            r1 = 2131755250(0x7f1000f2, float:1.9141374E38)
            goto L_0x0462
        L_0x0486:
            X.1RJ r1 = r6.A0D
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0307
            android.view.View r0 = X.C36391kE.A0L(r1, r3)
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass2IQ.A0S(r0, r5, r5)
            goto L_0x0307
        L_0x0497:
            r13.setVisibility(r3)
            android.widget.TextView r0 = r1.A08
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r1.A07
            if (r0 == 0) goto L_0x04a6
            r0.setVisibility(r5)
        L_0x04a6:
            android.widget.ImageView r2 = r1.A06
            android.content.Context r1 = r6.getContext()
            r0 = 2131886352(0x7f120110, float:1.940728E38)
            X.C36331k8.A0q(r1, r2, r0)
            X.C33521fV.A01(r2)
            goto L_0x02ba
        L_0x04b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IC.A0C(boolean):void");
    }

    public void A1d() {
        List list = this.A08;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            int size = this.A08.size();
            Iterator it = this.A08.iterator();
            int i = 0;
            while (it.hasNext()) {
                AnonymousClass2bU A0r = C36441kJ.A0r(it);
                C65013Qj A002 = AnonymousClass2bU.A00(A0r);
                if (A002.A0f && !A002.A0d) {
                    int i2 = (int) A002.A0E;
                    AnonymousClass1Y4 r1 = this.A04;
                    C146506vi A042 = r1.A04(AnonymousClass1Y4.A00(r1, A0r));
                    if (A042 != null && A042.A03().A0M) {
                        i2 /= 2;
                        if (this.A04.A09(A0r)) {
                            i2 += 50;
                        }
                    }
                    i += i2;
                } else if (A002.A0V) {
                    i += 100;
                }
            }
            if (size != 0) {
                int i3 = i / size;
                if (!(i == 0 || i == 100)) {
                    z = false;
                }
                int A2D = A2D(i);
                AnonymousClass1RJ r12 = this.A0D;
                if (r12.A00 != null) {
                    ConversationRowMediaControlView conversationRowMediaControlView = (ConversationRowMediaControlView) r12.A01();
                    AnonymousClass1RJ r3 = conversationRowMediaControlView.A05;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    AnonymousClass000.A1C(conversationRowMediaControlView, A0u);
                    r3.A08(new AnonymousClass4ZN(i3, A2D, 0, z), AnonymousClass000.A0q("#updateProgress", A0u));
                }
            }
        }
    }

    public void A1x(AnonymousClass3T1 r3) {
        ArrayList arrayList = this.A0E;
        if (arrayList.size() > 0) {
            C65393Rw.A01((C65393Rw) C36441kJ.A12(arrayList));
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        super.A22(this.A0K, z);
        if (z) {
            A0C(false);
        }
    }

    public boolean A2C(C64933Qa r4) {
        List list = this.A08;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C36391kE.A0l(it).A1J.equals(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A2F(List list, boolean z) {
        boolean A1W = C36371kC.A1W(this.A0K, list.get(0));
        if (!z) {
            List list2 = this.A08;
            if (list2 != null && list2.size() == list.size()) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (this.A08.get(i) != list.get(i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        this.A08 = list;
        super.A22(C36411kG.A0n(list, 0), z);
        if (A1W || z) {
            A0C(A1W);
        }
    }

    public AnonymousClass2bU getFMessage() {
        return (AnonymousClass2bU) this.A0K;
    }

    public C63663Kx getMessageCommentInfo() {
        int i;
        List list = this.A08;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            MessageCommentsManager messageCommentsManager = this.A01;
            AnonymousClass00C.A0D(A0l, 0);
            messageCommentsManager.A04.Boy(new C35651j2(messageCommentsManager, A0l));
        }
        List list2 = this.A08;
        AnonymousClass00C.A0D(list2, 0);
        Iterator it2 = list2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C63663Kx A0P = C36391kE.A0l(it2).A0P();
            if (A0P != null) {
                i = A0P.A00();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return new AnonymousClass2bC((Long) null, (Long) null, i2);
    }

    public int getMessageCount() {
        return C36371kC.A06(this.A08);
    }

    public C88944Uq getMessageReactions() {
        AnonymousClass3T1 r0;
        boolean z;
        boolean z2;
        List list = this.A08;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C29601Xg r4 = this.A0a;
            if (C29591Xf.A00(A0l, 56)) {
                r4.A04.execute(new C35261iP(r4, A0l));
            } else {
                C29601Xg.A00(r4, A0l, (Runnable) null, 56, false, false);
            }
        }
        C19730wQ r9 = this.A0T;
        List list2 = this.A08;
        String[] strArr = C65753Ti.A03;
        if (list2.size() > 0 && (r0 = (AnonymousClass3T1) C36391kE.A0t(list2)) != null) {
            C64933Qa r1 = r0.A1J;
            AnonymousClass11F r10 = r1.A00;
            if (r10 instanceof C28981Uw) {
                C18740tg.A06(r1);
                C65313Ro r02 = C28981Uw.A03;
                C28981Uw r102 = (C28981Uw) r10;
                C18740tg.A06(r102);
                HashMap A0J = AnonymousClass001.A0J();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3T1 A0l2 = C36391kE.A0l(it2);
                    C88944Uq r12 = A0l2.A0J;
                    if (r12 instanceof C68973cl) {
                        Iterator B8O = ((C68973cl) r12).B8O();
                        while (B8O.hasNext()) {
                            AnonymousClass28g r5 = (AnonymousClass28g) B8O.next();
                            long j = 0;
                            String A032 = C65753Ti.A03(r5.A02);
                            C18740tg.A06(A032);
                            if (A0J.containsKey(A032)) {
                                Object obj = A0J.get(A032);
                                C18740tg.A06(obj);
                                AnonymousClass28g r03 = (AnonymousClass28g) obj;
                                j = r03.A00;
                                z = r03.A01;
                            } else {
                                z = false;
                            }
                            long j2 = j + r5.A00;
                            if (!z) {
                                z2 = false;
                                if (!r5.A01) {
                                    A0J.put(A032, new AnonymousClass28g(r9, r102, A032, j2, A0l2.A1N, z2));
                                }
                            }
                            z2 = true;
                            A0J.put(A032, new AnonymousClass28g(r9, r102, A032, j2, A0l2.A1N, z2));
                        }
                    }
                }
                return new C68973cl(C36441kJ.A15(A0J.values()));
            }
        }
        C68983cm r3 = new C68983cm(r9, Collections.emptyList());
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C88944Uq r04 = C36391kE.A0l(it3).A0J;
            if (r04 != null) {
                for (AnonymousClass2bM B0j : r04.B8Y()) {
                    r3.B0j(B0j);
                }
            }
        }
        return r3;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bU);
        this.A0K = r2;
    }

    public AnonymousClass2IC(Context context, C89004Uw r9, AnonymousClass2bU r10) {
        super(context, r9, r10);
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0E = A0I2;
        boolean z = false;
        A0I2.add(new C65393Rw(C012005e.A02(this, R.id.thumb_0), this, 0));
        A0I2.add(new C65393Rw(C012005e.A02(this, R.id.thumb_1), this, 1));
        A0I2.add(new C65393Rw(C012005e.A02(this, R.id.thumb_2), this, 2));
        A0I2.add(new C65393Rw(C012005e.A02(this, R.id.thumb_3), this, 3));
        C18740tg.A0D(4 == A0I2.size() ? true : z, "wrong number of views");
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.media_control);
        this.A0D = A0X;
        A0X.A07(new AnonymousClass4ZO(r10, this, 1));
        A0C(true);
    }

    public static boolean A0D(AnonymousClass2IC r4, AnonymousClass2bU r5) {
        C65013Qj A002 = AnonymousClass2bU.A00(r5);
        if (r5.A1I != 1) {
            return false;
        }
        AnonymousClass1D1 r1 = r4.A07;
        AnonymousClass00C.A0D(A002, 0);
        if (!r1.A02(A002, false) || !A002.A03()) {
            return false;
        }
        return true;
    }

    public void A1D(C64933Qa r4) {
        super.A1D(r4);
        List list = this.A08;
        if (list != null) {
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext() && !r4.equals(C36391kE.A0l(it).A1J)) {
                i++;
            }
            Intent A0B2 = A0B(this);
            if (AnonymousClass3U9.A00) {
                A0B2.putExtra("start_index", i);
            }
            C36371kC.A16(A0B2, this);
        }
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public ReactionsBottomSheetDialogFragment A1U(C88944Uq r4, AnonymousClass11F r5) {
        C18740tg.A06(r5);
        AnonymousClass31C r2 = this.A0B;
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
        reactionsBottomSheetDialogFragment.A0J = r5;
        reactionsBottomSheetDialogFragment.A07 = r4;
        reactionsBottomSheetDialogFragment.A0O = AnonymousClass000.A1V(r2);
        reactionsBottomSheetDialogFragment.A0D = r2;
        return reactionsBottomSheetDialogFragment;
    }

    public void A1W() {
        if (A25()) {
            AnonymousClass3T1 r0 = this.A0K;
            C89004Uw r2 = this.A0c;
            if (r2 != null) {
                r2.Bur(r0);
                r2.BsB(this.A08, true);
            }
        }
    }

    public void A1y(AnonymousClass3T1 r4) {
        C89004Uw r2;
        if (A25() && (r2 = this.A0c) != null) {
            boolean z = !r2.BMT(r4);
            r2.BsB(this.A08, z);
            this.A0v.setRowSelected(z);
        }
    }

    public List getAlbumMessages() {
        return this.A08;
    }

    public List getAllMessages() {
        return this.A08;
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        return AnonymousClass3R4.A02(this);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
    }

    public int getTopAttributeTextAnchorId() {
        return R.id.media_container;
    }
}
