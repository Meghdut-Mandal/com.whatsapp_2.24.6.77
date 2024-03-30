package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;

/* renamed from: X.2IO  reason: invalid class name */
public class AnonymousClass2IO extends AnonymousClass8ZU {
    public C20690y0 A00;
    public AnonymousClass36P A01;
    public AnonymousClass1SU A02;
    public C62683Hc A03;
    public C64763Pi A04;
    public AnonymousClass1D4 A05;
    public boolean A06;
    public final FrameLayout A07;
    public final ImageView A08;
    public final TextView A09;
    public final ConversationRowVideo$RowVideoView A0A = ((ConversationRowVideo$RowVideoView) C012005e.A02(this, R.id.thumb));
    public final C33541fX A0B = C48742hy.A00(this, 16);
    public final AnonymousClass1RJ A0C;
    public final View A0D;
    public final View A0E;
    public final FrameLayout A0F;
    public final TextView A0G = C36391kE.A0P(this, R.id.control_btn);
    public final TextView A0H;
    public final TextEmojiLabel A0I;
    public final C160527l9 A0J = new C53702rk(this, 9);
    public final AnonymousClass1RJ A0K;

    private void A0B() {
        FrameLayout frameLayout;
        TextView textView;
        View view;
        ImageView imageView;
        FrameLayout frameLayout2;
        C20500xf r1 = this.A1O;
        C181798o3 fMessage = getFMessage();
        if (fMessage != null && AnonymousClass3M3.A01(r1, fMessage.A1J.A00) && this.A0G.A0E(3182) && (frameLayout = (FrameLayout) findViewById(R.id.video_container)) != null && (textView = this.A09) != null && (view = this.A0D) != null && (imageView = this.A08) != null && (frameLayout2 = this.A07) != null) {
            frameLayout.setOnClickListener(this.A0B);
            AnonymousClass2IR.A0W(frameLayout, this);
            AnonymousClass17Y r6 = this.A0R;
            C62683Hc r11 = this.A03;
            this.A04 = new C64763Pi(view, frameLayout2, frameLayout, imageView, textView, r6, this, this.A0A, this.A0E, getFMessage(), r11);
        }
    }

    private void A0E(boolean z) {
        View view = this.A0D;
        AnonymousClass1RJ r5 = this.A0C;
        AnonymousClass1RJ r6 = this.A0K;
        TextView textView = this.A0G;
        AnonymousClass2IQ.A0Q(view, textView, r5, r6, true, !z, true, true);
        view.setVisibility(0);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0A;
        conversationRowVideo$RowVideoView.setVisibility(0);
        FrameLayout frameLayout = this.A0F;
        frameLayout.setVisibility(0);
        this.A09.setVisibility(8);
        conversationRowVideo$RowVideoView.setOnClickListener(this.A0B);
        C33541fX r0 = this.A08;
        textView.setOnClickListener(r0);
        r5.A05(r0);
        frameLayout.setOnClickListener(r0);
        C36331k8.A0q(conversationRowVideo$RowVideoView.getContext(), conversationRowVideo$RowVideoView, R.string.f12nameremoved);
        C011504z.A06(conversationRowVideo$RowVideoView, 1);
    }

    public void A1Y() {
        A0F(false);
        AnonymousClass2IR.A0d(this, false);
    }

    public boolean A2K() {
        return true;
    }

    public static void A0D(AnonymousClass2IO r8) {
        boolean Bt6 = r8.A0d.Bt6();
        boolean z = true;
        int i = 1;
        if (Bt6) {
            i = 3;
        }
        C181798o3 fMessage = r8.getFMessage();
        C64933Qa r3 = fMessage.A1J;
        AnonymousClass11F r2 = r3.A00;
        if ((r2 instanceof C28981Uw) && r8.A0G.A0E(7170)) {
            i = 6;
        }
        if (r8.getFMessage().A09 != 14) {
            z = false;
        }
        AnonymousClass3FI r1 = new AnonymousClass3FI(r8.getContext());
        r1.A0A = Bt6;
        C18740tg.A06(r2);
        r1.A05 = r2;
        r1.A06 = r3;
        r1.A03 = i;
        r1.A09 = AnonymousClass000.A1V(AnonymousClass3SS.A02(r8));
        r1.A08 = z;
        if (z) {
            r1.A04 = r8.getTempFMessageMediaInfo();
        }
        if (C203369nr.A08(fMessage)) {
            r1.A02 = C203369nr.A03(fMessage).intValue();
        }
        Intent A002 = r1.A00();
        Context context = r8.getContext();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r8.A0A;
        AnonymousClass3U9.A08(context, A002, conversationRowVideo$RowVideoView);
        AnonymousClass3CG.A01(r8.getContext(), r8.getContext(), A002, conversationRowVideo$RowVideoView, fMessage);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r5 <= 500) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(boolean r26) {
        /*
            r25 = this;
            r3 = r25
            X.8o3 r2 = r3.getFMessage()
            X.3Qj r7 = X.AnonymousClass2bU.A00(r2)
            r13 = r26
            if (r26 == 0) goto L_0x0025
            android.widget.TextView r1 = r3.A0G
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.setTag(r0)
            X.3Pi r1 = r3.A04
            if (r1 == 0) goto L_0x0022
            r0 = 1
            r1.A02(r0)
            r0 = 0
            r3.A04 = r0
        L_0x0022:
            r3.A0B()
        L_0x0025:
            android.widget.TextView r14 = r3.A09
            r6 = 8
            r14.setVisibility(r6)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r3.A0A
            boolean r0 = r3.A0O
            r1.setKeepRatio(r0)
            boolean r0 = r3.A0O
            r1.setInAlbum(r0)
            X.4Ux r4 = r3.A0d
            X.8o3 r0 = r3.getFMessage()
            boolean r0 = r4.BLu(r0)
            r1.setFullWidth(r0)
            X.2bU r0 = r3.getFMessage()
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0056
            int r5 = r0.length()
            r4 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            if (r5 > r4) goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            r1.setPortraitPreviewEnabled(r0)
            boolean r0 = X.C203369nr.A08(r2)
            r1.A08 = r0
            if (r0 == 0) goto L_0x007c
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131165665(0x7f0701e1, float:1.7945554E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r1.A01 = r0
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131165664(0x7f0701e0, float:1.7945551E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r1.A00 = r0
        L_0x007c:
            java.lang.String r0 = X.AnonymousClass3RL.A01(r2)
            X.C011004s.A08(r1, r0)
            X.C37541mm.A04(r3, r2)
            boolean r0 = r3.A0O
            r9 = 1
            if (r0 == 0) goto L_0x0214
            android.content.Context r0 = r3.getContext()
            int r4 = X.C65123Qv.A01(r0)
            int r0 = X.AnonymousClass1SV.A00(r2, r4)
            if (r0 > 0) goto L_0x009d
            int r0 = r4 * 9
            int r0 = r0 / 16
        L_0x009d:
            r1.A02(r4, r0, r9)
            android.widget.ImageView r12 = r3.A08
            X.1fX r4 = r3.A0B
            r12.setOnClickListener(r4)
            android.widget.FrameLayout r11 = r3.A07
            r11.setOnClickListener(r4)
            X.2bU r0 = r3.getFMessage()
            boolean r5 = X.C66013Ui.A0z(r0)
            r0 = 0
            if (r5 == 0) goto L_0x012f
            r3.A0E(r13)
        L_0x00ba:
            X.1RJ r4 = r3.A0C
            int r4 = r4.A00()
            if (r4 != r6) goto L_0x00c7
            android.widget.TextView r4 = r3.A0H
            r4.setVisibility(r6)
        L_0x00c7:
            r3.A1d()
            X.0wU r8 = r3.A21
            X.3vL r5 = new X.3vL
            r5.<init>(r3, r7, r2, r6)
            java.lang.String r4 = "frame_visibility_serial_worker"
            r8.Bp6(r5, r4)
            X.AnonymousClass2IR.A0W(r1, r3)
            X.3Qa r6 = r2.A1J
            boolean r4 = r6.A02
            r1.A0A = r4
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView.A01(r1)
            X.1SV r5 = r3.A1y
            X.C18740tg.A06(r5)
            boolean r4 = r3.A06
            if (r4 == 0) goto L_0x0129
            if (r26 != 0) goto L_0x0129
            X.7l9 r4 = r3.A0J
            r12 = 0
            r7 = r5
            r8 = r1
            r9 = r2
            r10 = r4
            r11 = r6
            r7.A0E(r8, r9, r10, r11, r12)
        L_0x00f8:
            r3.A06 = r0
            int r0 = r14.getVisibility()
            if (r0 != 0) goto L_0x0114
            X.0ts r5 = r3.A0E
            X.0wU r4 = r3.A21
            X.17Y r1 = r3.A0R
            X.3fF r0 = new X.3fF
            r0.<init>(r3)
            r6 = r14
            r7 = r1
            r8 = r0
            r9 = r5
            r10 = r2
            r11 = r4
            X.C53882s3.A00(r6, r7, r8, r9, r10, r11)
        L_0x0114:
            android.view.View r1 = r3.A0E
            com.whatsapp.TextEmojiLabel r0 = r3.A0I
            r3.A2G(r1, r0)
            r3.A2I(r2)
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0128
            r3.A20(r2)
            r3.A1z(r2)
        L_0x0128:
            return
        L_0x0129:
            X.7l9 r4 = r3.A0J
            r5.A0C(r1, r2, r4)
            goto L_0x00f8
        L_0x012f:
            boolean r5 = X.C37541mm.A09(r3)
            android.view.View r15 = r3.A0D
            if (r5 == 0) goto L_0x017d
            X.1RJ r10 = r3.A0C
            X.1RJ r8 = r3.A0K
            android.widget.TextView r5 = r3.A0G
            r20 = 0
            r22 = 1
            r21 = 1
            r19 = 0
            r16 = r5
            r17 = r10
            r18 = r8
            X.AnonymousClass2IQ.A0Q(r15, r16, r17, r18, r19, r20, r21, r22)
            r5.setVisibility(r6)
            r1.setVisibility(r0)
            r15.setVisibility(r6)
            r14.setVisibility(r0)
            r5.setOnClickListener(r4)
            r1.setOnClickListener(r4)
            android.widget.FrameLayout r4 = r3.A0F
            android.content.Context r11 = X.C36431kI.A0A(r4, r1, r6)
            r10 = 2131895644(0x7f12255c, float:1.9426127E38)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            X.0ts r5 = r3.A0E
            int r4 = r2.A0B
            java.lang.String r4 = X.AnonymousClass3UY.A03(r5, r4, r0)
            r8[r0] = r4
            X.C36371kC.A14(r11, r1, r8, r10)
            X.C011504z.A06(r1, r9)
            goto L_0x00ba
        L_0x017d:
            r15.setVisibility(r0)
            android.widget.TextView r8 = r3.A0G
            r8.setVisibility(r0)
            android.widget.FrameLayout r10 = r3.A0F
            r10.setVisibility(r0)
            X.1RJ r5 = r3.A0K
            r24 = r5
            r5.A03(r6)
            r14.setVisibility(r6)
            X.2bU r5 = r3.getFMessage()
            boolean r5 = X.C54732tQ.A00(r5)
            if (r5 != 0) goto L_0x01dc
            r5 = 2131893722(0x7f121dda, float:1.9422229E38)
            r9 = 2131893722(0x7f121dda, float:1.9422229E38)
            r8.setText(r5)
            android.content.Context r5 = r3.getContext()
            X.C36331k8.A0q(r5, r8, r9)
            r5 = 2131232898(0x7f080882, float:1.8081918E38)
            r8.setCompoundDrawablesWithIntrinsicBounds(r5, r0, r0, r0)
            X.1fX r5 = r3.A0A
            r8.setOnClickListener(r5)
            r10.setOnClickListener(r5)
            r1.setOnClickListener(r4)
            r4 = 0
            r1.setContentDescription(r4)
            r4 = 2
            X.C011504z.A06(r1, r4)
        L_0x01c7:
            r20 = r26 ^ 1
            X.1RJ r4 = r3.A0C
            r22 = 1
            r21 = 1
            r19 = 0
            r16 = r8
            r17 = r4
            r18 = r24
            X.AnonymousClass2IQ.A0Q(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00ba
        L_0x01dc:
            java.util.List r19 = java.util.Collections.singletonList(r2)
            long r4 = r2.A00
            r18 = 0
            r16 = r3
            r17 = r8
            r20 = r4
            r16.A1r(r17, r18, r19, r20)
            r4 = 2131232890(0x7f08087a, float:1.8081902E38)
            r8.setCompoundDrawablesWithIntrinsicBounds(r4, r0, r0, r0)
            X.1fX r4 = r3.A09
            r8.setOnClickListener(r4)
            r10.setOnClickListener(r4)
            X.1fX r4 = r3.A0B
            r1.setOnClickListener(r4)
            r12.setOnClickListener(r4)
            r11.setOnClickListener(r4)
            android.content.Context r5 = r1.getContext()
            r4 = 2131887288(0x7f1204b8, float:1.9409179E38)
            X.C36331k8.A0q(r5, r1, r4)
            X.C011504z.A06(r1, r9)
            goto L_0x01c7
        L_0x0214:
            int r4 = r7.A0A
            int r0 = r7.A06
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IO.A0F(boolean):void");
    }

    /* access modifiers changed from: private */
    public void setThumbnail(Drawable drawable) {
        this.A0A.setImageDrawable(drawable);
    }

    public boolean A1E() {
        AnonymousClass005 r2 = this.A25;
        return C66013Ui.A0X(this.A0j, getFMessage(), r2);
    }

    public boolean A1F() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, getFMessage(), this.A1o) || !this.A0d.BtS()) {
            return false;
        }
        return true;
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, getFMessage(), this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public void A1b() {
        C37541mm.A02(this.A0I);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        if (!(r2 instanceof AnonymousClass0p5)) {
            boolean A1W = C36371kC.A1W(r2, getFMessage());
            super.A22(r2, z);
            if (z || A1W) {
                A0F(A1W);
            }
        }
    }

    public C181798o3 getFMessage() {
        return (C181798o3) ((AnonymousClass2bU) this.A0K);
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        return C65023Qk.A01(this.A0A.A05);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C181798o3);
        super.setFMessage(r2);
    }

    public AnonymousClass2IO(Context context, C89004Uw r5, C181798o3 r6) {
        super(context, r5, r6);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.progress_bar);
        this.A0C = A0X;
        this.A09 = C36391kE.A0P(this, R.id.info);
        this.A07 = (FrameLayout) findViewById(R.id.play_frame);
        this.A08 = C36391kE.A0N(this, R.id.play_button);
        this.A0K = C36341k9.A0X(this, R.id.cancel_download);
        this.A0F = (FrameLayout) findViewById(R.id.invisible_press_surface);
        this.A0D = findViewById(R.id.control_frame);
        this.A0E = findViewById(R.id.text_and_date);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.caption);
        this.A0I = A0P;
        if (A0P != null) {
            C36331k8.A1A(this.A0G, A0P);
        }
        this.A0H = C36391kE.A0O(this, R.id.media_transfer_eta);
        A0X.A07(new AnonymousClass4ZP((Object) this, 5));
        A0B();
        A0F(true);
    }

    public int A1R(int i) {
        if (!AnonymousClass2bU.A02(getFMessage()) || (getFMessage() instanceof C181778o1)) {
            return super.A1R(i);
        }
        return 0;
    }

    public void A1Z() {
        C181798o3 fMessage = getFMessage();
        this.A06 = true;
        AnonymousClass1SV r0 = this.A1y;
        C18740tg.A06(r0);
        r0.A0E(this.A0A, fMessage, this.A0J, fMessage.A1J, false);
    }

    public void A1d() {
        C181798o3 fMessage = getFMessage();
        boolean A0E2 = this.A0G.A0E(1418);
        TextView textView = this.A0H;
        if (A0E2) {
            AnonymousClass3SU.A02((ViewGroup) null, textView, this.A01, (C18820ts) null, this.A04, fMessage);
        } else {
            textView.setVisibility(8);
        }
        C65013Qj r1 = getFMessage().A01;
        if (r1 != null && r1.A0f && !r1.A0d && this.A0C.A00() != 0) {
            A0E(false);
        }
        AnonymousClass1RJ r12 = this.A0C;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r12, AnonymousClass3SU.A01(r0, fMessage, r12));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1f() {
        /*
            r11 = this;
            super.A1f()
            X.0yE r0 = r11.A02
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.C37541mm.A0A(r11)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            X.8o3 r5 = r11.getFMessage()
            X.3Qj r4 = X.AnonymousClass2bU.A00(r5)
            int r0 = r4.A09
            r2 = 1
            r6 = 1
            if (r0 != r2) goto L_0x0025
            X.17Y r1 = r11.A0R
            r0 = 2131889808(0x7f120e90, float:1.941429E38)
            r1.A04(r0, r2)
            return
        L_0x0025:
            X.1SU r0 = r11.A02
            X.4xN r1 = r0.A00(r4)
            X.3Qa r3 = r5.A1J
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x0044
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            X.6Fc r0 = r1.A0q
            if (r0 == 0) goto L_0x003f
        L_0x003b:
            A0D(r11)
            return
        L_0x003f:
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0088
            return
        L_0x0044:
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0088
            boolean r0 = r4.A0U
            if (r0 != 0) goto L_0x0088
            java.lang.String r7 = r4.A0K
            r9 = 0
            if (r7 != 0) goto L_0x005e
            long r0 = r4.A0F
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0088
            long r0 = r4.A0G
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0088
        L_0x005e:
            long r0 = r4.A0F
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x006a
            long r0 = r4.A0G
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0076
        L_0x006a:
            X.0y0 r0 = r11.A00
            java.io.File r0 = X.AnonymousClass1GW.A0H(r0, r7)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0088
        L_0x0076:
            boolean r0 = X.C66013Ui.A0z(r5)
            r1 = 2131887532(0x7f1205ac, float:1.9409674E38)
            if (r0 == 0) goto L_0x0082
            r1 = 2131887533(0x7f1205ad, float:1.9409676E38)
        L_0x0082:
            X.17Y r0 = r11.A0R
            r0.A04(r1, r6)
            return
        L_0x0088:
            r1 = 0
            java.io.File r0 = r4.A0I
            if (r0 == 0) goto L_0x0095
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            boolean r1 = X.C36381kD.A1V(r0)
        L_0x0095:
            X.C37541mm.A03(r4, r5, r2)
            if (r1 != 0) goto L_0x003b
            java.lang.String r0 = "viewmessage/ no file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.AnonymousClass2IQ.A0R(r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IO.A1f():void");
    }

    public boolean A26() {
        return AnonymousClass2bU.A02(getFMessage());
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0A;
        if (conversationRowVideo$RowVideoView != null && conversationRowVideo$RowVideoView.A0B != (isPressed = isPressed())) {
            conversationRowVideo$RowVideoView.A0B = isPressed;
            ConversationRowVideo$RowVideoView.A01(conversationRowVideo$RowVideoView);
            conversationRowVideo$RowVideoView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        if ((getFMessage() instanceof C181778o1) || !AnonymousClass2bU.A02(getFMessage())) {
            return R.drawable.broadcast_status_icon;
        }
        return R.drawable.broadcast_status_icon_onmedia;
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C64763Pi r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C64763Pi r1 = this.A04;
        if (r1 != null) {
            r1.A02(true);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C64763Pi r1 = this.A04;
        if (r1 == null) {
            return;
        }
        if (z) {
            r1.A01();
        } else {
            r1.A02(false);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
