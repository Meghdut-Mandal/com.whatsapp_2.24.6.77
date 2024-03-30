package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.8Zw  reason: invalid class name and case insensitive filesystem */
public class C175158Zw extends AnonymousClass3BX {
    public WaImageView A00;
    public final Resources A01;
    public final C18820ts A02;
    public final C20810yC A03;
    public final AnonymousClass1EV A04;
    public final AnonymousClass1FR A05;
    public final C160527l9 A06 = new C203209nX(this, 2);
    public final AnonymousClass1SV A07;
    public final C19770wU A08;

    public static WaImageView A00(Context context, ImageView.ScaleType scaleType, int i) {
        WaImageView waImageView = new WaImageView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
        layoutParams.setMargins(0, 0, dimensionPixelSize3, 0);
        waImageView.setLayoutParams(layoutParams);
        waImageView.setScaleType(scaleType);
        waImageView.setBackground(AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), R.drawable.logo_gray_border));
        waImageView.setImageDrawable(AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), i));
        return waImageView;
    }

    public C175158Zw(C19630wG r3, C18820ts r4, C20810yC r5, AnonymousClass1EV r6, AnonymousClass1FR r7, AnonymousClass1SV r8, C19770wU r9) {
        this.A03 = r5;
        this.A08 = r9;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = C36421kH.A0B(r3);
        this.A07 = r8;
        this.A04 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017c A[SYNTHETIC, Splitter:B:53:0x017c] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd A[SYNTHETIC, Splitter:B:72:0x01dd] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.widget.FrameLayout r14, X.AnonymousClass2IR r15, X.AnonymousClass3T1 r16, X.C207219uk r17) {
        /*
            r13 = this;
            r14.removeAllViews()
            r6 = r17
            java.lang.String r1 = r6.A02()
            java.lang.String r0 = "payment_method"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02af
            java.lang.String r1 = r6.A02()
            java.lang.String r0 = "payment_status"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02af
            android.content.Context r0 = r14.getContext()
            X.8U8 r7 = new X.8U8
            r7.<init>(r0)
            r14.addView(r7)
            X.9ui r10 = r6.A01
            X.C18740tg.A06(r10)
            android.content.res.Resources r5 = r13.A01
            X.0yC r1 = r13.A03
            r4 = 0
            int r2 = X.C165587tf.A05(r1)
            r0 = 1
            if (r2 == r0) goto L_0x0177
            r0 = 2
            if (r2 == r0) goto L_0x0172
            r0 = 3
            r3 = 2131887875(0x7f120703, float:1.941037E38)
            if (r2 == r0) goto L_0x0046
            r3 = 2131887872(0x7f120700, float:1.9410363E38)
        L_0x0046:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r10.A0F
            java.lang.String r2 = X.C36411kG.A0w(r5, r0, r2, r4, r3)
            com.whatsapp.TextEmojiLabel r0 = r7.A05
            r0.setText(r2)
            java.lang.String r2 = r10.A05
            java.lang.String r0 = "captured"
            boolean r8 = r0.equals(r2)
            X.1EV r5 = r13.A04
            java.lang.String r2 = r10.A0E
            java.util.List r0 = r10.A0L
            boolean r0 = r5.A0J(r2, r0)
            r2 = 8
            if (r0 != 0) goto L_0x007b
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x007b
            X.0yC r3 = r5.A02
            r0 = 3771(0xebb, float:5.284E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x016b
        L_0x007b:
            if (r8 == 0) goto L_0x016b
            X.1RJ r0 = r7.A09
            X.C36411kG.A1L(r0, r4)
        L_0x0082:
            X.0ts r9 = r13.A02
            java.lang.String r0 = r10.A06(r9)
            com.whatsapp.TextEmojiLabel r8 = r7.A03
            X.C175108Zr.A0t(r8, r15, r0)
            X.1FR r3 = r13.A05
            boolean r0 = r3.A0l(r10)
            if (r0 == 0) goto L_0x0158
            java.lang.String r9 = X.C207199ui.A01(r9, r10)
            com.whatsapp.TextEmojiLabel r0 = r7.A02
            X.C175108Zr.A0t(r0, r15, r9)
            r0.setVisibility(r4)
            r8.A0C()
            X.AnonymousClass97F.A00(r8)
        L_0x00a7:
            android.view.View r0 = r7.A00
            r0.setVisibility(r4)
            java.lang.String r8 = r10.A0C
            X.0yC r9 = r5.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r9.A0E(r0)
            r5 = 8
            if (r0 != 0) goto L_0x014f
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 != 0) goto L_0x014f
        L_0x00c2:
            com.whatsapp.TextEmojiLabel r0 = r7.A01
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x00cc
            r0.setText(r8)
        L_0x00cc:
            X.9uP r8 = r10.A09
            java.lang.String r5 = r8.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0103
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 != 0) goto L_0x00e8
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0103
        L_0x00e8:
            com.whatsapp.TextEmojiLabel r0 = r7.A06
            r0.setVisibility(r2)
        L_0x00ed:
            com.whatsapp.TextEmojiLabel r0 = r7.A04
            r0.setVisibility(r2)
        L_0x00f2:
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r11 = r1.A0A(r0)
            java.lang.String r8 = "updated_order_bubble_subtext"
            boolean r0 = r11.has(r8)
            r5 = r16
            if (r0 == 0) goto L_0x0189
            goto L_0x017c
        L_0x0103:
            com.whatsapp.TextEmojiLabel r5 = r7.A06
            java.lang.String r0 = r10.A0G
            X.C175108Zr.A0t(r5, r15, r0)
            java.util.List r12 = r8.A09
            int r0 = r8.A00()
            if (r0 == 0) goto L_0x00ed
            X.C18740tg.A06(r12)
            int r5 = r12.size()
            r0 = 1
            if (r5 != r0) goto L_0x013a
            android.content.Context r11 = r14.getContext()
            r8 = 2131887878(0x7f120706, float:1.9410376E38)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object r0 = r12.get(r4)
            X.9uJ r0 = (X.C206959uJ) r0
            int r0 = r0.A01
            X.AnonymousClass000.A1L(r5, r0, r4)
            java.lang.String r5 = r11.getString(r8, r5)
        L_0x0134:
            com.whatsapp.TextEmojiLabel r0 = r7.A04
            X.C175108Zr.A0t(r0, r15, r5)
            goto L_0x00f2
        L_0x013a:
            int r11 = r8.A00()
            android.content.res.Resources r8 = X.C36341k9.A0F(r14)
            r5 = 2131755387(0x7f10017b, float:1.9141652E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.AnonymousClass000.A1L(r0, r11, r4)
            java.lang.String r5 = r8.getQuantityString(r5, r11, r0)
            goto L_0x0134
        L_0x014f:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00c2
            r5 = 0
            goto L_0x00c2
        L_0x0158:
            com.whatsapp.TextEmojiLabel r0 = r7.A02
            r0.setVisibility(r2)
            X.C33511fU.A03(r8)
            int r0 = r8.getPaintFlags()
            r0 = r0 & -17
            r8.setPaintFlags(r0)
            goto L_0x00a7
        L_0x016b:
            X.1RJ r0 = r7.A09
            X.C36411kG.A1L(r0, r2)
            goto L_0x0082
        L_0x0172:
            r3 = 2131887874(0x7f120702, float:1.9410367E38)
            goto L_0x0046
        L_0x0177:
            r3 = 2131887873(0x7f120701, float:1.9410365E38)
            goto L_0x0046
        L_0x017c:
            int r0 = r11.getInt(r8)     // Catch:{ JSONException -> 0x0183 }
            if (r0 == 0) goto L_0x0189
            goto L_0x01be
        L_0x0183:
            r8 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_bubble_subtext"
            com.whatsapp.util.Log.e(r0, r8)
        L_0x0189:
            X.9u5 r0 = r10.A04()
            if (r0 == 0) goto L_0x01b8
            X.9u5 r0 = r10.A04()
            int r8 = r0.A00
            r0 = 1
            if (r8 <= r0) goto L_0x01b8
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01b8
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01b8
            X.1RJ r0 = r7.A0A
            X.C36411kG.A1L(r0, r4)
            android.view.View r1 = r0.A01()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891930(0x7f1216da, float:1.9418594E38)
            r1.setText(r0)
            goto L_0x01cf
        L_0x01b8:
            X.1RJ r0 = r7.A0A
            X.C36411kG.A1L(r0, r2)
            goto L_0x01cf
        L_0x01be:
            X.1RJ r8 = r7.A0A
            android.view.View r1 = r8.A01()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891931(0x7f1216db, float:1.9418596E38)
            r1.setText(r0)
            X.C36411kG.A1L(r8, r4)
        L_0x01cf:
            java.lang.String r8 = "pay_with_logos_enabled"
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r1 = r9.A0A(r0)
            boolean r0 = r1.has(r8)
            if (r0 == 0) goto L_0x0264
            int r1 = r1.getInt(r8)     // Catch:{ JSONException -> 0x01e5 }
            r0 = 1
            if (r1 != r0) goto L_0x0264
            goto L_0x01f0
        L_0x01e5:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#"
            X.C90464aC.A1L(r0, r8, r1, r3)
            goto L_0x0264
        L_0x01f0:
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0264
            boolean r0 = r3.A0k(r10)
            if (r0 != 0) goto L_0x0264
            X.1RJ r8 = r7.A08
            android.view.View r1 = r8.A01()
            r0 = 2131434604(0x7f0b1c6c, float:1.8491027E38)
            android.view.ViewGroup r9 = X.C36411kG.A0P(r1, r0)
            java.util.HashSet r10 = r3.A0c(r10, r5)
            r0 = 6
            boolean r0 = X.C36381kD.A1Z(r10, r0)
            if (r0 == 0) goto L_0x0231
            android.content.Context r3 = r7.getContext()
            r1 = 2131233502(0x7f080ade, float:1.8083143E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            com.whatsapp.WaImageView r0 = A00(r3, r0, r1)
            r9.addView(r0)
            android.view.View r0 = r8.A01()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0231
            X.C36411kG.A1L(r8, r4)
        L_0x0231:
            boolean r0 = X.C36381kD.A1Z(r10, r4)
            if (r0 == 0) goto L_0x0264
            android.content.Context r3 = r7.getContext()
            r1 = 2131231029(0x7f080135, float:1.8078127E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.whatsapp.WaImageView r0 = A00(r3, r0, r1)
            r9.addView(r0)
            android.content.Context r3 = r7.getContext()
            r1 = 2131231026(0x7f080132, float:1.8078121E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            com.whatsapp.WaImageView r0 = A00(r3, r0, r1)
            r9.addView(r0)
            android.view.View r0 = r8.A01()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0264
            X.C36411kG.A1L(r8, r4)
        L_0x0264:
            com.whatsapp.WaImageView r0 = r7.A07
            r13.A00 = r0
            r3 = 0
            X.9ui r0 = r6.A01
            if (r0 == 0) goto L_0x027f
            X.9uP r0 = r0.A09
            java.util.List r1 = r0.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x027f
            java.lang.Object r0 = r1.get(r4)
            X.9uJ r0 = (X.C206959uJ) r0
            java.lang.String r3 = r0.A00
        L_0x027f:
            X.3Kz r1 = r5.A0V()
            if (r1 == 0) goto L_0x029b
            byte[] r0 = r1.A02()
            if (r0 == 0) goto L_0x029b
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x029b
            X.1SV r2 = r13.A07
            com.whatsapp.WaImageView r1 = r13.A00
            X.7l9 r0 = r13.A06
            r2.A0C(r1, r5, r0)
            return
        L_0x029b:
            com.whatsapp.WaImageView r0 = r13.A00
            if (r3 == 0) goto L_0x02ac
            X.5M1 r2 = new X.5M1
            r2.<init>(r0, r3)
            X.0wU r1 = r13.A08
            java.lang.String[] r0 = new java.lang.String[r4]
            r1.Box(r2, r0)
            return
        L_0x02ac:
            r0.setVisibility(r2)
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175158Zw.A01(android.widget.FrameLayout, X.2IR, X.3T1, X.9uk):void");
    }
}
