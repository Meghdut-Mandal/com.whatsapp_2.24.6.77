package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.8Yv  reason: invalid class name and case insensitive filesystem */
public class C174888Yv extends AnonymousClass2IR {
    public C61223Ba A00;
    public AnonymousClass1EV A01;
    public AnonymousClass39O A02;
    public C199969gL A03;
    public C81303wn A04;
    public boolean A05;
    public final TextEmojiLabel A06;
    public final WaFrameLayout A07;
    public final ThumbnailButton A08 = ((ThumbnailButton) findViewById(R.id.thumb));
    public final TextEmojiLabel A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final AnonymousClass1RJ A0C;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        if (r2 == 3) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B() {
        /*
            r5 = this;
            X.3T1 r4 = r5.A0K
            X.2bw r4 = (X.C46952bw) r4
            r5.setThumbnail(r4)
            com.whatsapp.WaTextView r2 = r5.A0B
            X.0ts r0 = r5.A0E
            java.lang.String r1 = X.C65853Ts.A03(r0, r4)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r1, r0)
            android.content.Context r1 = r5.getContext()
            X.0ts r0 = r5.A0E
            java.lang.String r1 = X.C65853Ts.A02(r1, r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 == 0) goto L_0x006d
            com.whatsapp.WaTextView r1 = r5.A0A
            r0 = 8
            r1.setVisibility(r0)
        L_0x002c:
            com.whatsapp.TextEmojiLabel r3 = r5.A06
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r5.getOrderMessageBtnTextForBuyer()
        L_0x0038:
            r3.setText(r0)
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0044
            com.whatsapp.TextEmojiLabel r0 = r5.A09
            r5.setMessageText(r1, r0, r4)
        L_0x0044:
            X.39O r0 = r5.A02
            X.0yC r1 = r0.A01
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0067
            X.1RJ r0 = r5.A0C
            r0.A03(r2)
            int r2 = r4.A02
            r0 = 2
            if (r2 == r0) goto L_0x005e
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            r3.setEnabled(r1)
            com.whatsapp.WaFrameLayout r0 = r5.A07
            r0.setEnabled(r1)
        L_0x0067:
            return
        L_0x0068:
            java.lang.String r0 = r5.getOrderMessageBtnTextForSeller()
            goto L_0x0038
        L_0x006d:
            com.whatsapp.WaTextView r0 = r5.A0A
            X.C175108Zr.A0t(r0, r5, r1)
            r0.setVisibility(r2)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174888Yv.A0B():void");
    }

    private String getOrderMessageBtnTextForBuyer() {
        boolean A0E = this.A02.A01.A0E(4893);
        Context context = getContext();
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        return context.getString(i);
    }

    private String getOrderMessageBtnTextForSeller() {
        boolean A0E = this.A02.A01.A0E(4893);
        Context context = getContext();
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        return context.getString(i);
    }

    public void A16() {
        if (!this.A05) {
            this.A05 = true;
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
            this.A00 = C165607th.A0V(r2);
            this.A02 = C27111My.A2t(A0m);
            this.A01 = C36371kC.A0h(r4);
            this.A03 = (C199969gL) r4.AUu.get();
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public C46952bw getFMessage() {
        return (C46952bw) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46952bw);
        this.A0K = r2;
    }

    public C174888Yv(Context context, C89004Uw r8, C46952bw r9) {
        super(context, r8, r9);
        A16();
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.message_text);
        this.A09 = A0P;
        C36321k7.A0r(this.A0G, A0P);
        TextEmojiLabel A0P2 = C36401kF.A0P(this, R.id.order_message_btn);
        this.A06 = A0P2;
        this.A0B = C36411kG.A0Z(this, R.id.order_title);
        this.A0A = C36411kG.A0Z(this, R.id.order_subtitle);
        WaFrameLayout waFrameLayout = (WaFrameLayout) findViewById(R.id.order_message_preview);
        this.A07 = waFrameLayout;
        this.A0C = C36341k9.A0Y(this, R.id.order_via_catalog_header);
        Activity A002 = C18860tw.A00(context);
        if (A002 instanceof AnonymousClass012) {
            Resources resources = context.getResources();
            C81303wn r0 = new C81303wn(C36441kJ.A05(resources, R.dimen.f7nameremoved), C36441kJ.A05(resources, R.dimen.f7nameremoved));
            this.A04 = r0;
            BA7.A01((AnonymousClass012) A002, (C001600r) r0.A02, this, 44);
        }
        C48812i6 r02 = new C48812i6(context, this, 46);
        A0P2.setOnClickListener(r02);
        waFrameLayout.setOnClickListener(r02);
        A0B();
    }

    private void setThumbnail(C46952bw r3) {
        C81303wn r1;
        if (r3.A0V() != null && r3.A1Q() && (r1 = this.A04) != null) {
            synchronized (r1) {
                r1.A03 = r3;
            }
            this.A21.Boy(r1);
        }
    }

    public void A1Y() {
        A0B();
        super.A1Y();
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
}
