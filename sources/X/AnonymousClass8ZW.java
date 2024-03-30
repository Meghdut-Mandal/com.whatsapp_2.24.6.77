package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.8ZW  reason: invalid class name */
public final class AnonymousClass8ZW extends AnonymousClass2IQ {
    public boolean A00;
    public final TextView A01;
    public final ConversationRowVideo$RowVideoView A02 = ((ConversationRowVideo$RowVideoView) C012005e.A02(this, R.id.thumb));
    public final View A03;
    public final View A04;
    public final TextView A05 = C36391kE.A0P(this, R.id.control_btn);
    public final TextEmojiLabel A06;
    public final C160527l9 A07 = new C53702rk(this, 4);
    public final AnonymousClass1RJ A08;
    public final AnonymousClass1RJ A09;

    public void A1Y() {
        A0B(false);
        super.A1Y();
    }

    public boolean A2K() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r7 <= 500) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            X.3T1 r2 = r0.A0K
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r8 = r2.A01
            X.C18740tg.A06(r8)
            if (r21 == 0) goto L_0x0016
            android.widget.TextView r3 = r0.A05
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r3.setTag(r1)
        L_0x0016:
            android.widget.TextView r4 = r0.A01
            r5 = 8
            r4.setVisibility(r5)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r0.A02
            boolean r3 = r0.A0O
            r1.setKeepRatio(r3)
            boolean r3 = r0.A0O
            r1.setInAlbum(r3)
            X.4Ux r6 = r0.A0d
            X.3T1 r3 = r0.A0K
            boolean r3 = r6.BLu(r3)
            r1.setFullWidth(r3)
            X.2bU r3 = r0.getFMessage()
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x0045
            int r7 = r3.length()
            r6 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            if (r7 > r6) goto L_0x0046
        L_0x0045:
            r3 = 1
        L_0x0046:
            r1.setPortraitPreviewEnabled(r3)
            java.lang.String r3 = X.AnonymousClass3RL.A01(r2)
            X.C011004s.A08(r1, r3)
            android.widget.TextView r6 = r0.A0G
            java.lang.String r3 = X.AnonymousClass3RL.A00(r2)
            X.C011004s.A08(r6, r3)
            X.1RJ r3 = r0.A20
            if (r3 == 0) goto L_0x0071
            android.view.View r7 = r3.A01()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "view-count-transition-"
            X.C165577te.A1F(r2, r3, r6)
            java.lang.String r3 = r6.toString()
            X.C011004s.A08(r7, r3)
        L_0x0071:
            android.widget.ImageView r6 = r0.A0C
            if (r6 == 0) goto L_0x007c
            java.lang.String r3 = X.AnonymousClass2IQ.A0N(r2)
            X.C011004s.A08(r6, r3)
        L_0x007c:
            boolean r3 = r0.A0O
            r13 = 1
            if (r3 == 0) goto L_0x0096
            android.content.Context r3 = r0.getContext()
            int r6 = X.C65123Qv.A01(r3)
            int r3 = X.AnonymousClass1SV.A00(r2, r6)
            if (r3 > 0) goto L_0x0093
            int r3 = r6 * 9
            int r3 = r3 / 16
        L_0x0093:
            r1.A02(r6, r3, r13)
        L_0x0096:
            X.2bU r3 = r0.getFMessage()
            boolean r6 = X.C66013Ui.A0z(r3)
            r3 = 0
            if (r6 == 0) goto L_0x016a
            r14 = r21 ^ 1
            android.view.View r9 = r0.A03
            X.1RJ r11 = r0.A09
            X.1RJ r12 = r0.A08
            android.widget.TextView r10 = r0.A05
            X.AnonymousClass2IQ.A0P(r9, r10, r11, r12, r13, r14)
            r1.setVisibility(r3)
            android.content.Context r6 = r0.getContext()
            r5 = 2131895661(0x7f12256d, float:1.9426161E38)
            X.C36331k8.A0q(r6, r1, r5)
            r5 = 0
            r1.setOnClickListener(r5)
            X.1fX r5 = r0.A08
            r10.setOnClickListener(r5)
            r11.A05(r5)
        L_0x00c7:
            r0.A1d()
            android.view.View$OnLongClickListener r5 = r0.A2W
            r1.setOnLongClickListener(r5)
            android.content.Context r5 = r0.getContext()
            X.C18740tg.A06(r5)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass3SN.A00(r5)
            r1.A04 = r5
            X.1SV r6 = r0.A1y
            X.7l9 r5 = r0.A07
            r6.A0C(r1, r2, r5)
            int r1 = r2.A0B
            if (r1 != 0) goto L_0x00ef
            java.io.File r1 = r8.A0I
            int r1 = X.AnonymousClass1GW.A04(r1)
            r2.A0B = r1
        L_0x00ef:
            int r1 = r2.A0B
            X.0ts r7 = r0.A0E
            if (r1 == 0) goto L_0x0163
            int r1 = r2.A0B
            long r5 = (long) r1
            java.lang.String r1 = X.AnonymousClass3UY.A07(r7, r5)
        L_0x00fc:
            r4.setText(r1)
            r4.setVisibility(r3)
            X.3T1 r6 = r0.A0K
            X.1E2 r5 = r0.A1W
            X.0yC r1 = r0.A0G
            boolean r1 = X.AnonymousClass3T2.A00(r1, r5, r6)
            r8 = 2131233139(0x7f080973, float:1.8082407E38)
            if (r1 == 0) goto L_0x0114
            r8 = 2131232362(0x7f08066a, float:1.8080831E38)
        L_0x0114:
            android.content.res.Resources r7 = r0.getResources()
            X.3T1 r6 = r0.A0K
            X.1E2 r5 = r0.A1W
            X.0yC r1 = r0.A0G
            boolean r5 = X.AnonymousClass3T2.A00(r1, r5, r6)
            r1 = 2131166139(0x7f0703bb, float:1.7946515E38)
            if (r5 == 0) goto L_0x012a
            r1 = 2131166077(0x7f07037d, float:1.794639E38)
        L_0x012a:
            int r7 = r7.getDimensionPixelSize(r1)
            int r6 = r4.getPaddingTop()
            int r5 = r4.getPaddingRight()
            int r1 = r4.getPaddingBottom()
            r4.setPadding(r7, r6, r5, r1)
            X.0ts r1 = r0.A0E
            boolean r1 = X.C36351kA.A1Y(r1)
            if (r1 == 0) goto L_0x0156
            r4.setCompoundDrawablesWithIntrinsicBounds(r8, r3, r3, r3)
        L_0x0148:
            android.view.View r3 = r0.A04
            com.whatsapp.TextEmojiLabel r1 = r0.A06
            r0.A2G(r3, r1)
            r0.A20(r2)
            r0.A1z(r2)
            return
        L_0x0156:
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00E.A00(r1, r8)
            r1 = 0
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r3, r1)
            goto L_0x0148
        L_0x0163:
            long r5 = r2.A00
            java.lang.String r1 = X.AnonymousClass3TF.A02(r7, r5)
            goto L_0x00fc
        L_0x016a:
            boolean r6 = X.C37541mm.A09(r0)
            if (r6 == 0) goto L_0x01c8
            r1.setVisibility(r3)
            android.view.View r14 = r0.A03
            X.1RJ r7 = r0.A09
            X.1RJ r6 = r0.A08
            android.widget.TextView r15 = r0.A05
            r19 = 0
            r18 = 0
            r16 = r7
            r17 = r6
            X.AnonymousClass2IQ.A0P(r14, r15, r16, r17, r18, r19)
            r15.setVisibility(r5)
            android.view.View r7 = X.C36391kE.A0L(r6, r3)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5 = 2131232895(0x7f08087f, float:1.8081912E38)
            r7.setImageResource(r5)
            android.view.View r9 = r6.A01()
            android.content.Context r7 = r0.getContext()
            r5 = 2131893093(0x7f121b65, float:1.9420953E38)
            X.C36331k8.A0q(r7, r9, r5)
            android.content.Context r11 = r0.getContext()
            r10 = 2131895644(0x7f12255c, float:1.9426127E38)
            java.lang.Object[] r9 = new java.lang.Object[r13]
            X.0ts r7 = r0.A0E
            int r5 = r2.A0B
            java.lang.String r5 = X.AnonymousClass3UY.A03(r7, r5, r3)
            java.lang.String r5 = X.C36391kE.A0v(r11, r5, r9, r3, r10)
            r1.setContentDescription(r5)
            X.1fX r5 = r0.A0B
            r6.A05(r5)
            r15.setOnClickListener(r5)
            r1.setOnClickListener(r5)
            goto L_0x00c7
        L_0x01c8:
            android.widget.TextView r10 = r0.A05
            java.util.List r12 = java.util.Collections.singletonList(r2)
            long r6 = r2.A00
            r11 = 0
            r9 = r0
            r13 = r6
            r9.A1r(r10, r11, r12, r13)
            r6 = 2131231152(0x7f0801b0, float:1.8078377E38)
            r10.setCompoundDrawablesWithIntrinsicBounds(r6, r3, r3, r3)
            X.1fX r6 = r0.A09
            r10.setOnClickListener(r6)
            r1.setOnClickListener(r6)
            android.content.Context r7 = r0.getContext()
            r6 = 2131887288(0x7f1204b8, float:1.9409179E38)
            X.C36331k8.A0q(r7, r1, r6)
            r10.setVisibility(r3)
            X.1RJ r12 = r0.A08
            r12.A03(r5)
            r14 = r21 ^ 1
            android.view.View r9 = r0.A03
            X.1RJ r11 = r0.A09
            r13 = 0
            X.AnonymousClass2IQ.A0P(r9, r10, r11, r12, r13, r14)
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ZW.A0B(boolean):void");
    }

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
        }
    }

    public boolean A1E() {
        AnonymousClass005 r2 = this.A25;
        return C66013Ui.A0X(this.A0j, this.A0K, r2);
    }

    public int A1R(int i) {
        if (!TextUtils.isEmpty(((AnonymousClass2bU) this.A0K).A1a())) {
            return super.A1R(i);
        }
        return 0;
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A09;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r2, AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2));
    }

    public void A1f() {
        if (this.A02 != null) {
            if (!RequestPermissionActivity.A0B.A0J(getContext(), this.A02)) {
                return;
            }
        }
        AnonymousClass2bU r5 = (AnonymousClass2bU) this.A0K;
        C65013Qj r3 = r5.A01;
        C18740tg.A06(r3);
        if (r3.A0V) {
            int i = 1;
            if (r3.A09 == 1) {
                this.A0R.A04(R.string.f12nameremoved, 1);
                return;
            }
            boolean z = false;
            File file = r3.A0I;
            if (file != null) {
                z = C90524aI.A0S(Uri.fromFile(file).getPath()).exists();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("viewmessage/ from_me:");
            C64933Qa r4 = r5.A1J;
            A0u.append(r4.A02);
            A0u.append(" type:");
            A0u.append(r5.A1I);
            A0u.append(" url:");
            A0u.append(AnonymousClass6H5.A00(r5.A07));
            A0u.append(" file:");
            A0u.append(r3.A0I);
            A0u.append(" progress:");
            A0u.append(r3.A0E);
            A0u.append(" transferred:");
            A0u.append(r3.A0V);
            A0u.append(" transferring:");
            A0u.append(r3.A0f);
            A0u.append(" fileSize:");
            A0u.append(r3.A0C);
            A0u.append(" media_size:");
            A0u.append(r5.A00);
            A0u.append(" timestamp:");
            C36351kA.A1S(A0u, r5.A0I);
            if (!z) {
                Log.w("viewmessage/ no file");
                if (A2J()) {
                    return;
                }
                if (this.A0d.Bt6()) {
                    C225314u r1 = (C225314u) C18860tw.A01(getContext(), C225314u.class);
                    if (r1 != null) {
                        this.A0L.A03(r1);
                        return;
                    }
                    return;
                }
                getContext().startActivity(AnonymousClass190.A0X(getContext(), r4.A00, r4.hashCode()));
                return;
            }
            boolean Bt6 = this.A0d.Bt6();
            if (Bt6) {
                i = 3;
            }
            AnonymousClass11F r2 = r4.A00;
            if ((r2 instanceof C28981Uw) && this.A0G.A0E(7170)) {
                i = 6;
            }
            AnonymousClass3FI r12 = new AnonymousClass3FI(getContext());
            r12.A0A = Bt6;
            C18740tg.A06(r2);
            r12.A05 = r2;
            r12.A06 = r4;
            r12.A03 = i;
            r12.A09 = AnonymousClass000.A1V(AnonymousClass3SS.A01(getContext()));
            Intent A002 = r12.A00();
            Context context = getContext();
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A02;
            AnonymousClass3U9.A08(context, A002, conversationRowVideo$RowVideoView);
            AnonymousClass3U9.A09(getContext(), A002, conversationRowVideo$RowVideoView, new AnonymousClass3CG(getContext()), AnonymousClass3RL.A01(r5));
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B(A1W);
        }
    }

    public boolean A26() {
        return TextUtils.isEmpty(((AnonymousClass2bU) this.A0K).A1a());
    }

    public C181798o3 getFMessage() {
        return (C181798o3) ((AnonymousClass2bU) this.A0K);
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(this.A0K)) {
            return 0;
        }
        return AnonymousClass3R4.A01(getContext(), 72);
    }

    public int getOutgoingLayoutId() {
        throw AnonymousClass001.A09("this row type does not support outgoing messages");
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C181798o3);
        super.setFMessage(r2);
    }

    public AnonymousClass8ZW(Context context, C89004Uw r5, C181798o3 r6) {
        super(context, r5, r6);
        A16();
        AnonymousClass1RJ A0Y = C36341k9.A0Y(this, R.id.progress_bar);
        this.A09 = A0Y;
        this.A01 = C36391kE.A0P(this, R.id.info);
        this.A08 = C36341k9.A0Y(this, R.id.cancel_download);
        this.A03 = findViewById(R.id.control_frame);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.caption);
        this.A06 = A0P;
        C36331k8.A1A(this.A0G, A0P);
        this.A04 = findViewById(R.id.text_and_date);
        A0Y.A07(C79433ti.A00);
        A0B(true);
    }

    public boolean A1F() {
        if (!C37541mm.A09(this) || !this.A0d.BtS()) {
            return false;
        }
        return true;
    }

    public boolean A1K() {
        if (!C37541mm.A09(this) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
