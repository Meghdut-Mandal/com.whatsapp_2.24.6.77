package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.3Tm  reason: invalid class name and case insensitive filesystem */
public class C65793Tm {
    public final C18820ts A00;
    public final C20810yC A01;
    public final AnonymousClass1GQ A02;

    public static final void A03(RelativeLayout relativeLayout, C65793Tm r11, C63663Kx r12, Runnable runnable) {
        int A002;
        C65793Tm r6 = r11;
        if (C36401kF.A1Z(r11.A01)) {
            RelativeLayout relativeLayout2 = relativeLayout;
            View findViewById = relativeLayout.findViewById(R.id.replies_pill_container_key);
            if (!(findViewById instanceof FrameLayout)) {
                findViewById = null;
            }
            if (r12 == null || (A002 = r12.A00()) <= 0) {
                C36331k8.A0y(findViewById);
                return;
            }
            if (findViewById == null) {
                findViewById = r6.A00(relativeLayout2, runnable, R.id.replies_pill_container_key, R.id.replies_pill_text_key, R.id.replies_pill_arrow_key, R.drawable.ic_action_reply);
            }
            C36391kE.A0P(findViewById, R.id.replies_pill_text_key).setText(C36321k7.A0B(findViewById.getResources(), A002, 0, R.plurals.f10nameremoved));
            findViewById.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).addRule(17, R.id.reactions_bubble_layout);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r5.A1R(16) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6 != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (X.C64933Qa.A04(r5) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if ((r5 instanceof X.AnonymousClass2bS) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if ((r5 instanceof X.AnonymousClass2bO) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if ((r5 instanceof X.AnonymousClass2bI) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r4.A02.A00.A07(7234) != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r6 != 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r6 == 2) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass3T1 r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            X.AnonymousClass00C.A0D(r5, r3)
            if (r6 == 0) goto L_0x0009
            r0 = 2
            if (r6 != r0) goto L_0x0011
        L_0x0009:
            boolean r0 = A04(r5)
            if (r0 != 0) goto L_0x003e
            if (r6 == 0) goto L_0x0014
        L_0x0011:
            r0 = 2
            if (r6 != r0) goto L_0x003d
        L_0x0014:
            r0 = 16
            boolean r0 = r5.A1R(r0)
            if (r0 != 0) goto L_0x003e
            if (r6 != 0) goto L_0x003d
            boolean r0 = X.C64933Qa.A04(r5)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x003d
            boolean r0 = r5 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x003d
            boolean r0 = r5 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x003d
            X.1GQ r0 = r4.A02
            r2 = 0
            X.0yC r1 = r0.A00
            r0 = 7234(0x1c42, float:1.0137E-41)
            int r0 = r1.A07(r0)
            if (r0 != r2) goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65793Tm.A05(X.3T1, int):boolean");
    }

    public C65793Tm(C18820ts r1, C20810yC r2, AnonymousClass1GQ r3) {
        C36321k7.A11(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    private final FrameLayout A00(RelativeLayout relativeLayout, Runnable runnable, int i, int i2, int i3, int i4) {
        C100744vb r0;
        TextView textView;
        FrameLayout frameLayout = new FrameLayout(relativeLayout.getContext());
        frameLayout.setId(i);
        frameLayout.setMinimumHeight(frameLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = frameLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize3 = frameLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        View A0D = C36421kH.A0D(frameLayout.getContext(), R.layout.f9nameremoved);
        if ((A0D instanceof TextView) && (textView = (TextView) A0D) != null) {
            C36391kE.A1K(textView);
        }
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(C36431kI.A0A(A0D, relativeLayout, 4));
        textEmojiLabel.setId(i2);
        textEmojiLabel.setSingleLine(true);
        textEmojiLabel.setGravity(16);
        textEmojiLabel.setTextSize(0, C36441kJ.A00(textEmojiLabel.getResources(), R.dimen.f7nameremoved));
        textEmojiLabel.setTextColor(C015006m.A00(C36361kB.A09(textEmojiLabel), textEmojiLabel.getResources(), R.color.f6nameremoved));
        Context A0B = C36371kC.A0B(frameLayout);
        int currentTextColor = textEmojiLabel.getCurrentTextColor();
        WaImageView waImageView = new WaImageView(A0B);
        waImageView.setId(i3);
        C36411kG.A1D(waImageView);
        Drawable A002 = AnonymousClass0BT.A00(A0B.getTheme(), waImageView.getResources(), i4);
        if (A002 != null) {
            r0 = new C100744vb(AnonymousClass3UF.A08(A002.mutate(), currentTextColor), this.A00);
        } else {
            r0 = null;
        }
        waImageView.setImageDrawable(r0);
        C66963Xz.A00(frameLayout, runnable, 2);
        frameLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        frameLayout.setBackgroundResource(R.drawable.reaction_bubble_background);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        frameLayout.addView(A0D, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3);
        layoutParams2.gravity = 16;
        layoutParams2.gravity = 8388627;
        frameLayout.addView(waImageView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.gravity = 8388629;
        layoutParams3.setMarginStart(dimensionPixelSize3 + C36371kC.A03(frameLayout, R.dimen.f7nameremoved));
        frameLayout.addView(textEmojiLabel, layoutParams3);
        relativeLayout.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r6.A01.A0E(4653) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.widget.RelativeLayout r4, X.C88944Uq r5, X.C65793Tm r6, X.AnonymousClass3T1 r7, java.lang.Runnable r8, boolean r9) {
        /*
            r0 = 2131433149(0x7f0b16bd, float:1.8488076E38)
            android.view.View r3 = r4.findViewById(r0)
            boolean r0 = r3 instanceof X.C43512Ic
            if (r0 == 0) goto L_0x000f
            X.2Ic r3 = (X.C43512Ic) r3
            if (r3 != 0) goto L_0x002c
        L_0x000f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0051
            android.content.Context r0 = r4.getContext()
            X.2Ic r3 = new X.2Ic
            r3.<init>(r0)
            r0 = 1
            X.C66963Xz.A00(r3, r8, r0)
            r2 = 0
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r4.addView(r3, r2, r0)
        L_0x002c:
            boolean r0 = X.C64933Qa.A04(r7)
            if (r0 == 0) goto L_0x003d
            X.0yC r1 = r6.A01
            r0 = 4653(0x122d, float:6.52E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r3.A00(r5, r9, r0)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r1, r0)
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r0 = 20
            r1.addRule(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65793Tm.A01(android.widget.RelativeLayout, X.4Uq, X.3Tm, X.3T1, java.lang.Runnable, boolean):void");
    }

    public static final void A02(RelativeLayout relativeLayout, C65793Tm r12, C89014Ux r13, AnonymousClass3T1 r14, Runnable runnable, boolean z) {
        TextView textView;
        RelativeLayout relativeLayout2 = relativeLayout;
        View findViewById = relativeLayout.findViewById(R.id.newsletter_quick_forwarding_pill_container_key);
        String str = null;
        if (!(findViewById instanceof FrameLayout)) {
            findViewById = null;
        }
        if (C64933Qa.A04(r14) && z) {
            C65793Tm r6 = r12;
            if (r12.A02.A00.A07(7234) != 0) {
                if (findViewById == null) {
                    findViewById = r6.A00(relativeLayout2, runnable, R.id.newsletter_quick_forwarding_pill_container_key, R.id.newsletter_quick_forwarding_text_key, R.id.newsletter_quick_forwarding_arrow_key, R.drawable.ic_action_forward);
                }
                String A0s = C36381kD.A0s(relativeLayout2.getResources(), R.string.f12nameremoved);
                if (!A04(r14)) {
                    str = A0s;
                }
                View findViewById2 = findViewById.findViewById(R.id.newsletter_quick_forwarding_text_key);
                if ((findViewById2 instanceof TextEmojiLabel) && (textView = (TextView) findViewById2) != null) {
                    textView.setText(str);
                }
                findViewById.setVisibility(0);
                findViewById.setContentDescription(A0s);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (r13.Bsy()) {
                    layoutParams2.addRule(21);
                    layoutParams2.setMarginEnd(C36341k9.A0F(relativeLayout2).getDimensionPixelSize(R.dimen.f7nameremoved));
                    return;
                }
                layoutParams2.addRule(17, R.id.reactions_bubble_layout);
                return;
            }
        }
        C36331k8.A0y(findViewById);
    }

    public static final boolean A04(AnonymousClass3T1 r6) {
        Boolean bool;
        C88944Uq r0;
        if (!C64933Qa.A04(r6)) {
            return AnonymousClass000.A1S(r6.A08 & 1, 1);
        }
        if (r6 instanceof AnonymousClass2bO) {
            return false;
        }
        AnonymousClass3A4 A0Z = r6.A0Z();
        if (A0Z != null) {
            bool = Boolean.valueOf(AnonymousClass000.A1Q(((A0Z.A01 & 1) > 1 ? 1 : ((A0Z.A01 & 1) == 1 ? 0 : -1))));
        } else {
            bool = null;
        }
        if (!C36341k9.A1Z(bool) || (r0 = r6.A0J) == null || r0.BGT() <= 0) {
            return false;
        }
        return true;
    }
}
