package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.Set;

/* renamed from: X.2I5  reason: invalid class name */
public class AnonymousClass2I5 extends AnonymousClass8ZQ {
    public AnonymousClass36P A00;
    public AnonymousClass1TA A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05 = findViewById(R.id.control_btn_holder);
    public final View A06;
    public final ViewGroup A07;
    public final FrameLayout A08;
    public final ImageView A09 = C36391kE.A0N(this, R.id.icon);
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final TextEmojiLabel A0G;
    public final WaImageView A0H = C36421kH.A0J(this, R.id.control_btn);
    public final C160527l9 A0I = new C53702rk(this, 1);
    public final AnonymousClass1RJ A0J;
    public final AnonymousClass1RJ A0K = C36341k9.A0Y(this, R.id.thumb_container);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        if (r1.A0G.A0E(6786) == false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B() {
        /*
            r17 = this;
            r1 = r17
            X.3T1 r9 = r1.A0K
            X.2bU r9 = (X.AnonymousClass2bU) r9
            X.2by r9 = (X.C46972by) r9
            android.widget.ImageView r4 = r1.A09
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MS.A00(r0, r9)
            r4.setImageDrawable(r0)
            java.lang.String r2 = r9.A1b()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x01fa
            android.content.Context r2 = r1.getContext()
            r0 = 2131895249(0x7f1223d1, float:1.9425326E38)
            java.lang.String r2 = r2.getString(r0)
        L_0x002a:
            com.whatsapp.TextEmojiLabel r0 = r1.A0G
            r0.setText(r2)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166083(0x7f070383, float:1.7946401E38)
            int r6 = r2.getDimensionPixelSize(r0)
            r0 = 2131429653(0x7f0b0915, float:1.8480985E38)
            android.view.View r5 = r1.findViewById(r0)
            java.lang.String r8 = r9.A05
            if (r8 == 0) goto L_0x0056
            boolean r0 = X.AnonymousClass1GX.A0b(r8)
            if (r0 == 0) goto L_0x0056
            X.0yC r2 = r1.A0G
            r0 = 6786(0x1a82, float:9.509E-42)
            boolean r0 = r2.A0E(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            boolean r0 = r9.A1Q()
            r3 = 0
            r14 = 0
            r2 = 8
            if (r0 == 0) goto L_0x01d8
            r4.setVisibility(r2)
            X.C36381kD.A19(r5, r14, r6)
            X.1RJ r6 = r1.A0K
            if (r7 == 0) goto L_0x01d3
            r6.A03(r14)
            boolean r5 = X.AnonymousClass1GX.A0c(r8)
            android.view.View r4 = r6.A01()
            r0 = 2131435124(0x7f0b1e74, float:1.8492081E38)
            android.view.View r4 = r4.findViewById(r0)
            int r0 = X.C36351kA.A00(r5)
            r4.setVisibility(r0)
            android.widget.ImageView r0 = r1.A0A
            r0.setVisibility(r2)
            r0.setTag(r3)
        L_0x008c:
            X.1SV r11 = r1.A1y
            if (r7 == 0) goto L_0x01cf
            android.view.View r4 = r6.A01()
            r0 = 2131434654(0x7f0b1c9e, float:1.8491128E38)
            android.view.View r8 = r4.findViewById(r0)
        L_0x009b:
            X.7l9 r10 = r1.A0I
            X.3Qa r12 = r9.A1J
            r13 = 480(0x1e0, float:6.73E-43)
            r16 = 1
            r15 = 0
            X.AnonymousClass1SV.A06(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00a7:
            java.lang.String r5 = r9.A01
            android.view.View r4 = r1.A06
            com.whatsapp.TextEmojiLabel r0 = r1.A0F
            r1.A2H(r4, r0, r5)
            X.2bU r0 = r1.getFMessage()
            boolean r0 = X.C66013Ui.A0z(r0)
            if (r0 == 0) goto L_0x0180
            android.view.View r0 = r1.A05
            r0.setVisibility(r14)
            com.whatsapp.WaImageView r5 = r1.A0H
            r0 = 2131233001(0x7f0808e9, float:1.8082127E38)
            r5.setImageResource(r0)
            X.1fX r0 = r1.A08
            r5.setOnClickListener(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            X.C33521fV.A03(r5, r0)
            X.3Qa r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x016f
            boolean r0 = r9.A1J()
            if (r0 != 0) goto L_0x016f
            android.content.Context r3 = r1.getContext()
            r0 = 2131894896(0x7f122270, float:1.942461E38)
            X.C36331k8.A0q(r3, r5, r0)
        L_0x00e8:
            android.view.View r5 = r1.A04
            X.1fX r0 = r1.A0B
        L_0x00ec:
            r5.setOnClickListener(r0)
        L_0x00ef:
            android.widget.TextView r0 = r1.A0E
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r1.A07
            r0.setVisibility(r14)
            r1.A1d()
            android.widget.TextView r6 = r1.A0B
            X.0ts r0 = r1.A0E
            long r3 = r9.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r0, r3)
            r6.setText(r0)
            int r0 = r9.A00
            android.widget.TextView r3 = r1.A0D
            if (r0 == 0) goto L_0x0166
            r3.setVisibility(r14)
            android.view.View r0 = r1.A03
            r0.setVisibility(r14)
            X.0ts r0 = r1.A0E
            java.lang.String r0 = X.C25561Gu.A01(r0, r9)
            r3.setText(r0)
        L_0x0120:
            java.lang.String r0 = r9.A05
            java.lang.String r2 = X.AnonymousClass1Ax.A02(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r9.A1b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = r9.A1b()
            java.lang.String r2 = X.AnonymousClass6YY.A07(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r0)
        L_0x014a:
            r0 = 10
            java.lang.String r0 = X.AnonymousClass14B.A0D(r2, r0)
            android.widget.TextView r2 = r1.A0C
            java.lang.CharSequence r0 = r1.A1V(r0)
            r2.setText(r0)
            X.AnonymousClass2IR.A0W(r5, r1)
            r1.A2I(r9)
            r1.A20(r9)
            r1.A1z(r9)
            return
        L_0x0166:
            r3.setVisibility(r2)
            android.view.View r0 = r1.A03
            r0.setVisibility(r2)
            goto L_0x0120
        L_0x016f:
            android.content.Context r4 = r1.getContext()
            r0 = 2131894895(0x7f12226f, float:1.9424608E38)
            X.C36331k8.A0q(r4, r5, r0)
            android.view.View r5 = r1.A04
            r5.setOnClickListener(r3)
            goto L_0x00ef
        L_0x0180:
            boolean r3 = X.C37541mm.A09(r1)
            com.whatsapp.WaImageView r4 = r1.A0H
            X.C33521fV.A01(r4)
            android.view.View r0 = r1.A05
            if (r3 == 0) goto L_0x0192
            r0.setVisibility(r2)
            goto L_0x00e8
        L_0x0192:
            r0.setVisibility(r14)
            X.2bU r0 = r1.getFMessage()
            boolean r0 = X.C54732tQ.A00(r0)
            if (r0 == 0) goto L_0x01b8
            r0 = 2131233006(0x7f0808ee, float:1.8082137E38)
            r4.setImageResource(r0)
            android.content.Context r3 = r1.getContext()
            r0 = 2131887288(0x7f1204b8, float:1.9409179E38)
            X.C36331k8.A0q(r3, r4, r0)
            X.1fX r0 = r1.A09
            r4.setOnClickListener(r0)
            android.view.View r5 = r1.A04
            goto L_0x00ec
        L_0x01b8:
            r0 = 2131233018(0x7f0808fa, float:1.8082162E38)
            r4.setImageResource(r0)
            android.content.Context r3 = r1.getContext()
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            X.C36331k8.A0q(r3, r4, r0)
            X.1fX r0 = r1.A0A
            r4.setOnClickListener(r0)
            goto L_0x00e8
        L_0x01cf:
            android.widget.ImageView r8 = r1.A0A
            goto L_0x009b
        L_0x01d3:
            r6.A03(r2)
            goto L_0x008c
        L_0x01d8:
            r4.setVisibility(r14)
            int r4 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r6, r4, r6, r0)
            X.1RJ r0 = r1.A0K
            r0.A03(r2)
            android.widget.ImageView r0 = r1.A0A
            r0.setTag(r3)
            r0.setVisibility(r2)
            android.view.View r0 = r1.A02
            r0.setVisibility(r2)
            goto L_0x00a7
        L_0x01fa:
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass14B.A0D(r2, r0)
            java.lang.CharSequence r2 = r1.A1V(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I5.A0B():void");
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, this.A0K, this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r10.A0G.A0E(6786) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z() {
        /*
            r10 = this;
            X.3T1 r0 = r10.A0K
            boolean r0 = r0.A1Q()
            if (r0 == 0) goto L_0x0061
            X.3T1 r0 = r10.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0021
            boolean r0 = X.AnonymousClass1GX.A0b(r2)
            if (r0 == 0) goto L_0x0021
            X.0yC r1 = r10.A0G
            r0 = 6786(0x1a82, float:9.509E-42)
            boolean r0 = r1.A0E(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            r4 = 8
            X.1RJ r3 = r10.A0K
            if (r5 == 0) goto L_0x0065
            r0 = 0
            r3.A03(r0)
            boolean r2 = X.AnonymousClass1GX.A0c(r2)
            android.view.View r1 = r3.A01()
            r0 = 2131435124(0x7f0b1e74, float:1.8492081E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x003e
            r4 = 0
        L_0x003e:
            r0.setVisibility(r4)
        L_0x0041:
            X.1SV r4 = r10.A1y
            X.C18740tg.A06(r4)
            X.3T1 r2 = r10.A0K
            if (r5 == 0) goto L_0x0062
            android.view.View r1 = r3.A01()
            r0 = 2131434654(0x7f0b1c9e, float:1.8491128E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0055:
            X.7l9 r3 = r10.A0I
            X.3Qa r5 = r2.A1J
            r7 = 0
            r6 = 480(0x1e0, float:6.73E-43)
            r9 = 1
            r8 = 0
            X.AnonymousClass1SV.A06(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0061:
            return
        L_0x0062:
            android.widget.ImageView r1 = r10.A0A
            goto L_0x0055
        L_0x0065:
            r3.A03(r4)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I5.A1Z():void");
    }

    public void A1b() {
        C37541mm.A02(this.A0F);
    }

    public void A1d() {
        AnonymousClass2bU r5 = (AnonymousClass2bU) this.A0K;
        TextView textView = this.A0E;
        AnonymousClass3SU.A02(this.A07, textView, this.A00, this.A0E, this.A04, r5);
        AnonymousClass1RJ r1 = this.A0J;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        AnonymousClass3SU.A01(r0, r5, r1);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        if (!(r2 instanceof AnonymousClass0p5)) {
            boolean A1W = C36371kC.A1W(r2, this.A0K);
            super.A22(r2, z);
            if (z || A1W) {
                A0B();
            }
        }
    }

    public C46972by getFMessage() {
        return (C46972by) ((AnonymousClass2bU) this.A0K);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46972by);
        super.setFMessage(r2);
    }

    public AnonymousClass2I5(Context context, C89004Uw r5, C46972by r6) {
        super(context, r5, r6);
        AnonymousClass1RJ A0Y = C36341k9.A0Y(this, R.id.progress_bar);
        this.A0J = A0Y;
        A0Y.A07(new AnonymousClass4ZP((Object) context, 2));
        this.A0G = C36401kF.A0P(this, R.id.title);
        this.A0E = C36391kE.A0O(this, R.id.media_transfer_eta);
        this.A07 = C36411kG.A0O(this, R.id.metadata_container);
        this.A04 = findViewById(R.id.content);
        this.A0D = C36391kE.A0P(this, R.id.info);
        this.A03 = findViewById(R.id.bullet_info);
        this.A0B = C36391kE.A0P(this, R.id.file_size);
        this.A0C = C36391kE.A0P(this, R.id.file_type);
        this.A0A = C36391kE.A0N(this, R.id.preview);
        this.A02 = findViewById(R.id.preview_separator);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.document_frame);
        this.A08 = frameLayout;
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.caption);
        this.A0F = A0P;
        if (A0P != null) {
            C36321k7.A0r(this.A0G, A0P);
        }
        this.A06 = findViewById(R.id.text_and_date);
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        A0B();
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public void A1Y() {
        A0B();
        AnonymousClass2IR.A0d(this, false);
    }

    public void A1f() {
        super.A1f();
        Activity A062 = C36361kB.A06(this);
        if (A062 instanceof C225314u) {
            AnonymousClass1X7 r7 = this.A0L;
            C18740tg.A06(r7);
            AnonymousClass17Y r3 = this.A0R;
            C18740tg.A06(r3);
            C19700wN r1 = this.A07;
            C18740tg.A06(r1);
            C19770wU r9 = this.A21;
            C18740tg.A06(r9);
            C24801Dv r0 = this.A0P;
            C18740tg.A06(r0);
            AnonymousClass1TA r5 = this.A01;
            C18740tg.A06(r5);
            C20830yE r4 = this.A02;
            C18740tg.A06(r4);
            int A002 = C53872s2.A00(r0, r1, (C225314u) A062, r3, r4, r5, (C46972by) ((AnonymousClass2bU) this.A0K), r7, this.A1z, r9);
            if (A002 == 2) {
                A2J();
            } else if (A002 == 4) {
                this.A0R.A04(R.string.f12nameremoved, 1);
            }
        }
    }

    public void A2H(View view, TextEmojiLabel textEmojiLabel, String str) {
        super.A2H(view, textEmojiLabel, str);
        if (TextUtils.isEmpty(str) && textEmojiLabel != null) {
            ViewGroup viewGroup = this.A07;
            viewGroup.setPadding(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, C36371kC.A03(this, R.dimen.f7nameremoved), 0);
            C36331k8.A0x(viewGroup);
            this.A0G.setTextColor(getSecondaryTextColor());
            View view2 = this.A06;
            if (view2 == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                AnonymousClass000.A0a(view2).bottomMargin = dimensionPixelSize;
                AnonymousClass000.A0a(view2).topMargin = dimensionPixelSize2;
                return;
            }
            AnonymousClass000.A0a(view2).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
