package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1QZ;
import X.AnonymousClass2IR;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C36331k8;
import X.C36441kJ;
import X.C604537x;
import X.C65413Ry;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class InteractiveButtonsRowContentLayout extends LinearLayout implements C18700tb {
    public C65413Ry A00;
    public C18820ts A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public boolean A04;
    public final LinearLayout A05;
    public final LinearLayout.LayoutParams A06;
    public final LinearLayout.LayoutParams A07;

    public InteractiveButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0083 A[LOOP:1: B:8:0x0081->B:9:0x0083, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass2IR r13, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r14, java.util.List r15, int r16) {
        /*
            r4 = r15
            int r0 = r15.size()
            r1 = r16
            int r3 = java.lang.Math.min(r0, r1)
            int r7 = r15.size()
            r12 = r14
            android.util.DisplayMetrics r1 = X.C36361kB.A0B(r14)
            r14 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r14, r0, r1)
            int r6 = (int) r0
            android.content.Context r1 = r12.getContext()
            r0 = 2132083398(0x7f1502c6, float:1.9806937E38)
            X.02b r5 = new X.02b
            r5.<init>((android.content.Context) r1, (int) r0)
            r10 = r13
            if (r7 <= r14) goto L_0x00a2
            java.util.Iterator r9 = r15.iterator()
        L_0x002f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r9.next()
            X.37x r1 = (X.C604537x) r1
            r0 = 0
            com.whatsapp.TextEmojiLabel r8 = new com.whatsapp.TextEmojiLabel
            r8.<init>(r5, r0)
            float r0 = r13.getTextFontSize()
            r8.setTextSize(r0)
            java.lang.String r0 = r1.A02
            r8.setText(r0)
            r8.setDrawingCacheEnabled(r14)
            r2 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r8.measure(r0, r0)
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            r8.layout(r2, r2, r1, r0)
            int r2 = r8.getMeasuredWidth()
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131166070(0x7f070376, float:1.7946375E38)
            int r1 = X.C36441kJ.A05(r1, r0)
            int r1 = r1 / r7
            int r0 = r6 * r7
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x002f
        L_0x0078:
            android.widget.LinearLayout r2 = r12.A05
            r2.setOrientation(r14)
            r2.removeAllViews()
            r13 = 0
        L_0x0081:
            if (r13 >= r3) goto L_0x00b0
            java.lang.Object r11 = r4.get(r13)
            X.37x r11 = (X.C604537x) r11
            r15 = 1
            r16 = 0
            android.content.Context r1 = r12.getContext()
            r0 = 2131100213(0x7f060235, float:1.7812801E38)
            android.content.res.ColorStateList r8 = X.AnonymousClass00F.A04(r1, r0)
            r9 = r8
            android.view.View r0 = A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.addView(r0)
            int r13 = r13 + 1
            goto L_0x0081
        L_0x00a2:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x00ae
            int r1 = r15.size()
            r0 = 2
            if (r1 < r0) goto L_0x00ae
            goto L_0x0078
        L_0x00ae:
            r14 = 0
            goto L_0x0078
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(X.2IR, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout, java.util.List, int):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (android.text.TextUtils.isEmpty(r8.A01) != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View A00(android.content.res.ColorStateList r9, android.content.res.ColorStateList r10, X.AnonymousClass2IR r11, X.C604537x r12, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r13, int r14, boolean r15, boolean r16, boolean r17) {
        /*
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r13)
            r0 = 2131625283(0x7f0e0543, float:1.887777E38)
            r6 = 0
            android.view.View r5 = r1.inflate(r0, r13, r6)
            r0 = 2131428412(0x7f0b043c, float:1.8478468E38)
            android.view.View r4 = X.C012005e.A02(r5, r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 2131428389(0x7f0b0425, float:1.8478421E38)
            android.view.View r3 = X.C012005e.A02(r5, r0)
            r0 = 2131428391(0x7f0b0427, float:1.8478425E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36401kF.A0O(r5, r0)
            r1 = 2131428397(0x7f0b042d, float:1.8478437E38)
            android.view.View r2 = X.C012005e.A02(r5, r1)
            r1 = 2131428398(0x7f0b042e, float:1.847844E38)
            android.view.View r1 = X.C012005e.A02(r5, r1)
            if (r17 == 0) goto L_0x003e
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            boolean r7 = r7 instanceof android.widget.FrameLayout.LayoutParams
            if (r7 == 0) goto L_0x003e
            r13.setButtonTextLeftAligned(r0)
        L_0x003e:
            r13.setButtonText(r12, r0, r11, r9)
            int r8 = r12.A00
            r7 = -1
            if (r8 == r7) goto L_0x0063
            android.content.Context r7 = r13.getContext()
            android.graphics.drawable.Drawable r7 = X.AnonymousClass00E.A00(r7, r8)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass08I.A01(r7)
            android.graphics.drawable.Drawable r9 = r7.mutate()
            X.AnonymousClass076.A01(r10, r9)
            X.0ts r8 = r13.A01
            X.4vb r7 = new X.4vb
            r7.<init>(r9, r8)
            r0.A0G(r7)
        L_0x0063:
            r0.measure(r6, r6)
            boolean r0 = r12.A03
            r7 = 1
            if (r0 == 0) goto L_0x00d0
            r3.setClickable(r6)
        L_0x006e:
            X.3Ry r8 = r13.A00
            if (r8 == 0) goto L_0x0086
            if (r14 != 0) goto L_0x0086
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00bb
            X.381 r8 = r8.A03
            java.lang.Long r0 = r8.A00
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0086:
            java.lang.String r0 = r12.A02
            r3.setContentDescription(r0)
            X.C33521fV.A02(r3)
            r3.setLongClickable(r7)
            X.4Vd r0 = new X.4Vd
            r0.<init>(r12, r13, r7)
            X.C012005e.A0V(r3, r0)
            if (r15 == 0) goto L_0x00ab
            r4.setOrientation(r7)
            android.widget.LinearLayout$LayoutParams r0 = r13.A07
            r4.setLayoutParams(r0)
            if (r14 <= 0) goto L_0x00aa
            if (r16 == 0) goto L_0x00aa
            r2.setVisibility(r6)
        L_0x00aa:
            return r5
        L_0x00ab:
            r4.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r0 = r13.A06
            r4.setLayoutParams(r0)
            if (r14 <= 0) goto L_0x00aa
            if (r16 == 0) goto L_0x00aa
            r1.setVisibility(r6)
            return r5
        L_0x00bb:
            X.3Ry r8 = r13.A00
            X.31F r0 = new X.31F
            r0.<init>(r3)
            r8.A01 = r0
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0086
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0086
        L_0x00d0:
            r3.setClickable(r7)
            r0 = 9
            X.C67143Yr.A00(r3, r12, r14, r0)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A00(android.content.res.ColorStateList, android.content.res.ColorStateList, X.2IR, X.37x, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout, int, boolean, boolean, boolean):android.view.View");
    }

    private void setButtonText(C604537x r2, TextEmojiLabel textEmojiLabel, AnonymousClass2IR r4, ColorStateList colorStateList) {
        textEmojiLabel.setTextSize(r4.getTextFontSize());
        textEmojiLabel.setText(r2.A02);
        textEmojiLabel.setSelected(r2.A03);
        if (colorStateList != null) {
            textEmojiLabel.setTextColor(colorStateList);
        }
    }

    private void setButtonTextLeftAligned(TextEmojiLabel textEmojiLabel) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textEmojiLabel.getLayoutParams();
        layoutParams.gravity = 19;
        textEmojiLabel.setLayoutParams(layoutParams);
        textEmojiLabel.setGravity(19);
    }

    public void setDisplayButtonsInVertical(boolean z) {
        this.A03 = z;
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A01 = C36331k8.A0C(generatedComponent());
        }
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A01 = C36331k8.A0C(generatedComponent());
        }
        this.A06 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A07 = new LinearLayout.LayoutParams(-1, -2);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A05 = (LinearLayout) C012005e.A02(this, R.id.buttons_container);
    }
}
