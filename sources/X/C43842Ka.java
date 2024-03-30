package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.2Ka  reason: invalid class name and case insensitive filesystem */
public final class C43842Ka extends C38461ot implements C18700tb {
    public int A00;
    public AnimatorSet A01;
    public C19730wQ A02;
    public C21060yb A03;
    public C19970wo A04;
    public C18820ts A05;
    public C220412q A06;
    public C20810yC A07;
    public C25361Fz A08;
    public C19890wg A09;
    public C29721Xs A0A;
    public AnonymousClass13J A0B;
    public C19770wU A0C;
    public AnonymousClass1QZ A0D;
    public boolean A0E;
    public final ReactionsTrayViewModel A0F;
    public final int[] A0G;
    public final AnimatorSet A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43842Ka(android.content.Context r19, com.whatsapp.reactions.ReactionsTrayViewModel r20) {
        /*
            r18 = this;
            r7 = 1
            r0 = r19
            r2 = r20
            int r1 = X.C36361kB.A04(r0, r2, r7)
            r4 = r18
            r4.<init>(r0)
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x006a
            r4.A0E = r7
            java.lang.Object r0 = r4.generatedComponent()
            X.0tq r3 = X.C36391kE.A0W(r0)
            X.0wo r0 = X.C36351kA.A0V(r3)
            r4.A04 = r0
            X.0yC r0 = X.C36341k9.A0V(r3)
            r4.A07 = r0
            X.0wU r0 = X.C36341k9.A0Z(r3)
            r4.A0C = r0
            X.0wQ r0 = X.C36351kA.A0N(r3)
            r4.A02 = r0
            X.12q r0 = X.C36351kA.A0a(r3)
            r4.A06 = r0
            X.13J r0 = X.C36351kA.A0q(r3)
            r4.A0B = r0
            X.0yb r0 = X.C36351kA.A0U(r3)
            r4.A03 = r0
            X.0ts r0 = X.C36341k9.A0T(r3)
            r4.A05 = r0
            X.004 r0 = r3.AYY
            java.lang.Object r0 = r0.get()
            X.1Xs r0 = (X.C29721Xs) r0
            r4.A0A = r0
            X.0wg r0 = X.C36351kA.A0m(r3)
            r4.A09 = r0
            X.004 r0 = r3.ASg
            java.lang.Object r0 = r0.get()
            X.1Fz r0 = (X.C25361Fz) r0
            r4.A08 = r0
        L_0x006a:
            int r3 = com.whatsapp.reactions.ReactionsTrayViewModel.A0H
            int r0 = r3 + 1
            int[] r0 = new int[r0]
            r4.A0G = r0
            android.animation.AnimatorSet r0 = X.C36441kJ.A0C()
            r4.A0H = r0
            r4.A0F = r2
            r0 = 2131433164(0x7f0b16cc, float:1.8488106E38)
            r4.setId(r0)
            r2 = 0
            r4.setClipChildren(r2)
            android.widget.LinearLayout$LayoutParams r0 = X.C36371kC.A0N()
            r4.setLayoutParams(r0)
            r4.setOrientation(r2)
            android.content.Context r5 = r4.getContext()
            r2 = 2130970462(0x7f04075e, float:1.7549635E38)
            r0 = 2131102089(0x7f060989, float:1.7816606E38)
            int r8 = X.C224514j.A00(r5, r2, r0)
            r5 = 2131168063(0x7f070b3f, float:1.7950417E38)
            r6 = 2131168062(0x7f070b3e, float:1.7950415E38)
            r2 = 2131099852(0x7f0600cc, float:1.7812069E38)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            float r6 = r0.getDimension(r6)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            int r14 = X.C36441kJ.A05(r0, r5)
            int r11 = X.C36381kD.A05(r4, r2)
            int r2 = X.C36381kD.A05(r4, r8)
            r0 = 8
            float[] r8 = new float[r0]
            r13 = 0
            r8[r13] = r6
            r8[r7] = r6
            r8[r1] = r6
            r0 = 3
            r8[r0] = r6
            X.C36361kB.A1U(r8, r6)
            android.graphics.drawable.ShapeDrawable r6 = new android.graphics.drawable.ShapeDrawable
            r6.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r14, r14, r14, r14)
            r6.setPadding(r0)
            android.graphics.Paint r0 = r6.getPaint()
            r0.setColor(r2)
            android.graphics.Paint r10 = r6.getPaint()
            float r9 = (float) r14
            r2 = 1048576000(0x3e800000, float:0.25)
            float r2 = r2 * r9
            r0 = 0
            r10.setShadowLayer(r9, r0, r2, r11)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 >= r0) goto L_0x00fb
            android.graphics.Paint r0 = r6.getPaint()
            r4.setLayerType(r7, r0)
        L_0x00fb:
            r2 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r8, r2, r2)
            r6.setShape(r0)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r7]
            r0[r13] = r6
            android.graphics.drawable.LayerDrawable r12 = new android.graphics.drawable.LayerDrawable
            r12.<init>(r0)
            r16 = r14
            r17 = r14
            r15 = r14
            r12.setLayerInset(r13, r14, r15, r16, r17)
            r4.setBackground(r12)
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131168070(0x7f070b46, float:1.7950431E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = X.C36371kC.A03(r4, r5)
            int r2 = r2 + r0
            r4.A00 = r2
            r4.setPadding(r2, r2, r2, r2)
            com.whatsapp.reactions.ReactionsTrayViewModel r6 = r4.A0F
            X.1hi r0 = r6.A0D
            java.lang.Object r0 = r0.A04()
            X.3GR r0 = (X.AnonymousClass3GR) r0
            java.lang.String r11 = r0.A00
            java.util.List r0 = r6.A02
            int r10 = r0.size()
            r9 = 0
        L_0x0140:
            if (r9 >= r10) goto L_0x01a9
            java.util.List r0 = r6.A02
            java.lang.String r12 = X.C36401kF.A0s(r0, r9)
            boolean r5 = X.AnonymousClass000.A1R(r9)
            X.AnonymousClass00C.A0B(r12)
            android.content.Context r2 = r4.getContext()
            r0 = 2131625998(0x7f0e080e, float:1.887922E38)
            android.view.View r8 = X.C36421kH.A0D(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.reactions.ReactionEmojiTextView"
            X.AnonymousClass00C.A0E(r8, r0)
            com.whatsapp.TextEmojiLabel r8 = (com.whatsapp.TextEmojiLabel) r8
            r8.A0I(r12)
            boolean r0 = X.AnonymousClass00C.A0J(r12, r11)
            if (r0 == 0) goto L_0x016d
            r8.setSelected(r7)
        L_0x016d:
            boolean r2 = r8.isSelected()
            r0 = 2131886169(0x7f120059, float:1.940691E38)
            if (r2 == 0) goto L_0x0179
            r0 = 2131886170(0x7f12005a, float:1.9406911E38)
        L_0x0179:
            X.C33521fV.A03(r8, r0)
            r4.addView(r8)
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.AnonymousClass00C.A0E(r5, r0)
            r4.getWhatsAppLocale()
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131168064(0x7f070b40, float:1.795042E38)
            int r0 = r2.getDimensionPixelSize(r0)
            X.AnonymousClass1JZ.A03(r8, r0, r13)
            r8.setLayoutParams(r5)
        L_0x019e:
            r4.getSystemFeatures()
            r0 = 20
            X.C48742hy.A01(r8, r4, r0)
            int r9 = r9 + 1
            goto L_0x0140
        L_0x01a9:
            X.3T1 r0 = r6.A0G
            if (r0 == 0) goto L_0x01e3
            X.3T1 r0 = r6.A0G
            boolean r0 = X.C64933Qa.A04(r0)
            if (r0 == 0) goto L_0x01e3
            X.3T1 r0 = r6.A0G
            X.12q r5 = r6.A06
            X.0yC r2 = r6.A07
            X.AnonymousClass00C.A0D(r0, r13)
            X.AnonymousClass00C.A0D(r5, r7)
            X.AnonymousClass00C.A0D(r2, r1)
            X.3Qa r0 = r0.A1J
            X.11F r1 = r0.A00
            r0 = 4633(0x1219, float:6.492E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0220
            X.3Qp r2 = r5.A09(r1, r13)
            boolean r0 = r2 instanceof X.C44072La
            r1 = 0
            if (r0 == 0) goto L_0x01df
            X.2La r2 = (X.C44072La) r2
            if (r2 == 0) goto L_0x01df
            X.2pM r1 = r2.A0B
        L_0x01df:
            X.2pM r0 = X.C56702wk.A00
            if (r1 != r0) goto L_0x0220
        L_0x01e3:
            java.util.List r0 = r6.A02
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0220
            android.content.Context r1 = r4.getContext()
            r0 = 2131625996(0x7f0e080c, float:1.8879216E38)
            android.view.View.inflate(r1, r0, r4)
            r0 = 2131433156(0x7f0b16c4, float:1.848809E38)
            android.view.View r3 = r4.findViewById(r0)
            X.AnonymousClass00C.A0B(r3)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.AnonymousClass00C.A0E(r2, r0)
            r4.getWhatsAppLocale()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168064(0x7f070b40, float:1.795042E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.AnonymousClass1JZ.A03(r3, r0, r13)
            r3.setLayoutParams(r2)
            r0 = 4
            X.C66963Xz.A00(r3, r4, r0)
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43842Ka.<init>(android.content.Context, com.whatsapp.reactions.ReactionsTrayViewModel):void");
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setMessagePropertySubsystem(C25361Fz r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setReactionStatsManager(C29721Xs r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setSystemFeatures(AnonymousClass13J r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public void A02(int i, int i2, boolean z) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(120);
        C53562rW.A00(duration, this, 6);
        AnonymousClass4VL.A00(duration, this, 8);
        Interpolator interpolator = C65753Ti.A01;
        duration.setInterpolator(interpolator);
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{1.0f, 1.0f}).setDuration(120);
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        duration2.addUpdateListener(new C66183Uz(this, measuredHeight, measuredWidth, i4, i3, z2));
        duration2.setInterpolator(C56812wv.A00);
        AnonymousClass3V0 r10 = new AnonymousClass3V0(this, measuredWidth - measuredHeight, measuredHeight, measuredWidth, i4, i3, z2);
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.05f}).setDuration(150);
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{1.05f, 1.0f}).setDuration(70);
        duration3.addUpdateListener(r10);
        duration3.setInterpolator(interpolator);
        duration3.addListener(new C36451kK(this, z2));
        duration4.addUpdateListener(r10);
        duration4.setInterpolator(interpolator);
        AnimatorSet A0C2 = C36441kJ.A0C();
        A0C2.playSequentially(new Animator[]{duration3, duration4});
        AnimatorSet animatorSet = this.A0H;
        animatorSet.playTogether(new Animator[]{duration, duration2});
        animatorSet.playSequentially(C36441kJ.A1P(duration2, A0C2, 2));
        animatorSet.start();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C25361Fz getMessagePropertySubsystem() {
        C25361Fz r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messagePropertySubsystem");
    }

    public final C29721Xs getReactionStatsManager() {
        C29721Xs r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("reactionStatsManager");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final AnonymousClass13J getSystemFeatures() {
        AnonymousClass13J r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("systemFeatures");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public static final AnimatorSet A00(C43842Ka r7, ReactionEmojiTextView reactionEmojiTextView) {
        AnimatorSet A0C2 = C36441kJ.A0C();
        ObjectAnimator duration = ObjectAnimator.ofFloat(reactionEmojiTextView, "backgroundScale", new float[]{1.0f, 0.0f}).setDuration(100);
        AnonymousClass00C.A08(duration);
        duration.addListener(new AnonymousClass4VD(reactionEmojiTextView, 0.0f, 1));
        duration.setInterpolator(C65753Ti.A00);
        r7.getSystemFeatures();
        A0C2.play(duration);
        AnonymousClass4VL.A00(A0C2, reactionEmojiTextView, 9);
        return A0C2;
    }
}
