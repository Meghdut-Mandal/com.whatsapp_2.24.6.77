package com.whatsapp.calling.header.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass0QD;
import X.AnonymousClass141;
import X.AnonymousClass1LI;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3SF;
import X.AnonymousClass6BH;
import X.AnonymousClass7QC;
import X.AnonymousClass7QD;
import X.C011304x;
import X.C023509x;
import X.C124795yo;
import X.C135456cj;
import X.C163647qX;
import X.C18700tb;
import X.C27851Qb;
import X.C27861Qc;
import X.C33311f5;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C61243Bc;
import X.C90474aD;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class CallScreenHeaderView extends ConstraintLayout implements C18700tb {
    public AnonymousClass1LI A00;
    public C124795yo A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final TextEmojiLabel A04;
    public final WaTextView A05;
    public final AnonymousClass3SF A06;
    public final AnonymousClass1RJ A07;
    public final AnonymousClass1RJ A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A09 = C36431kI.A1I(AnonymousClass7QC.A00);
        this.A0A = C36431kI.A1I(AnonymousClass7QD.A00);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        TextEmojiLabel A0O = C36351kA.A0O(this, R.id.title);
        this.A04 = A0O;
        this.A05 = C36341k9.A0Q(this, R.id.subtitle);
        this.A07 = C36341k9.A0X(this, R.id.minimize_btn_stub);
        this.A08 = C36341k9.A0X(this, R.id.participants_btn_stub);
        this.A06 = getTextEmojiLabelControllerFactory().B3q(getContext(), A0O);
        if (C011304x.A02(this)) {
            A02(this);
        } else {
            C163647qX.A00(this, 8);
        }
    }

    public static final void setupOnAttach$lambda$2(CallScreenHeaderView callScreenHeaderView, View view) {
        AnonymousClass00C.A0D(callScreenHeaderView, 0);
        C36341k9.A16(callScreenHeaderView.getCallHeaderStateHolder().A04, 1);
    }

    public static final void setupOnAttach$lambda$3(CallScreenHeaderView callScreenHeaderView, View view) {
        AnonymousClass00C.A0D(callScreenHeaderView, 0);
        C124795yo callHeaderStateHolder = callScreenHeaderView.getCallHeaderStateHolder();
        C36341k9.A16(callHeaderStateHolder.A04, callHeaderStateHolder.A03.A00);
    }

    public final void setCallHeaderStateHolder(C124795yo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setTextEmojiLabelControllerFactory(AnonymousClass1LI r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public static final void A02(CallScreenHeaderView callScreenHeaderView) {
        callScreenHeaderView.A07.A05(new C135456cj(callScreenHeaderView, 11));
        callScreenHeaderView.A08.A05(new C135456cj(callScreenHeaderView, 12));
        AnonymousClass012 A002 = AnonymousClass0QD.A00(callScreenHeaderView);
        if (A002 != null) {
            C36331k8.A1T(new CallScreenHeaderView$setupOnAttach$3(A002, callScreenHeaderView, (C023509x) null), C33311f5.A00(A002));
        }
    }

    private final AlphaAnimation getFadeInAnimation() {
        return (AlphaAnimation) this.A09.getValue();
    }

    private final AlphaAnimation getFadeOutAnimation() {
        return (AlphaAnimation) this.A0A.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r1 = r0.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSubtitle(X.AnonymousClass6BI r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0069
            com.whatsapp.WaTextView r3 = r7.A05
            X.3Bc r0 = r8.A01
            java.lang.CharSequence r0 = X.C90474aD.A0V(r3, r0)
            r3.setText(r0)
            java.lang.Integer r0 = r8.A02
            r2 = 0
            if (r0 == 0) goto L_0x007c
            int r1 = r0.intValue()
            android.content.Context r6 = r3.getContext()
            r5 = 2131103013(0x7f060d25, float:1.781848E38)
            r0 = 2131169071(0x7f070f2f, float:1.7952462E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00E.A00(r6, r1)
            if (r4 == 0) goto L_0x007c
            android.content.res.Resources r1 = r6.getResources()
            int r0 = X.C36361kB.A02(r6, r0)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass3UF.A07(r1, r4, r0)
            android.content.res.Resources r0 = r6.getResources()
            int r0 = r0.getColor(r5)
            X.AnonymousClass076.A06(r4, r0)
            if (r4 == 0) goto L_0x007d
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x004a:
            r3.setCompoundDrawablePadding(r0)
            r3.setCompoundDrawablesWithIntrinsicBounds(r4, r2, r2, r2)
            int r1 = r8.A00
            r0 = 3
            if (r1 != r0) goto L_0x006a
            android.view.animation.AlphaAnimation r0 = r7.getFadeInAnimation()
            boolean r0 = r0.hasStarted()
            if (r0 != 0) goto L_0x0066
            android.view.animation.AlphaAnimation r2 = r7.getFadeInAnimation()
        L_0x0063:
            r2.start()
        L_0x0066:
            r3.setAnimation(r2)
        L_0x0069:
            return
        L_0x006a:
            r0 = 2
            if (r1 != r0) goto L_0x0066
            android.view.animation.AlphaAnimation r0 = r7.getFadeOutAnimation()
            boolean r0 = r0.hasStarted()
            if (r0 != 0) goto L_0x0066
            android.view.animation.AlphaAnimation r2 = r7.getFadeOutAnimation()
            goto L_0x0063
        L_0x007c:
            r4 = r2
        L_0x007d:
            r0 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.ui.CallScreenHeaderView.setSubtitle(X.6BI):void");
    }

    /* access modifiers changed from: private */
    public final void setTitle(C61243Bc r4, C61243Bc r5) {
        CharSequence charSequence;
        if (r4 != null) {
            TextEmojiLabel textEmojiLabel = this.A04;
            textEmojiLabel.setVisibility(0);
            AnonymousClass3SF r0 = this.A06;
            r0.A01.setText(C90474aD.A0V(this, r4));
            if (r5 != null) {
                charSequence = C90474aD.A0V(this, r5);
            } else {
                charSequence = null;
            }
            textEmojiLabel.setContentDescription(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r5 != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupButton(X.AnonymousClass6BH r5, X.AnonymousClass1RJ r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x004c
            android.view.View r1 = r6.A01()
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            int r0 = r5.A00
            r1.setIcon((int) r0)
            android.view.View r1 = r6.A01()
            boolean r0 = r5.A02
            r1.setEnabled(r0)
            r0 = 0
        L_0x0017:
            r6.A03(r0)
            int r0 = r6.A00()
            if (r0 != 0) goto L_0x0047
            android.view.View r3 = r6.A01()
            r2 = 0
            if (r5 == 0) goto L_0x0048
            X.69z r0 = r5.A01
            X.3Bc r0 = r0.A01
            java.lang.CharSequence r0 = X.C90474aD.A0V(r4, r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = r0.toString()
        L_0x0035:
            X.69z r0 = r5.A01
            X.3Bc r0 = r0.A00
            java.lang.CharSequence r0 = X.C90474aD.A0V(r4, r0)
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = r0.toString()
        L_0x0043:
            r0 = 1
            X.AnonymousClass3UE.A07(r3, r1, r2, r0)
        L_0x0047:
            return
        L_0x0048:
            r1 = r2
            if (r5 == 0) goto L_0x0043
            goto L_0x0035
        L_0x004c:
            r0 = 8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.ui.CallScreenHeaderView.setupButton(X.6BH, X.1RJ):void");
    }

    /* access modifiers changed from: private */
    public final void setupButtons(AnonymousClass6BH r2, AnonymousClass6BH r3) {
        setupButton(r2, this.A07);
        setupButton(r3, this.A08);
    }

    public static /* synthetic */ void setupButtons$default(CallScreenHeaderView callScreenHeaderView, AnonymousClass6BH r3, AnonymousClass6BH r4, int i, Object obj) {
        if ((i & 1) != 0) {
            r3 = null;
        }
        if ((i & 2) != 0) {
            r4 = null;
        }
        callScreenHeaderView.setupButtons(r3, r4);
    }

    public void A06() {
        if (!this.A03) {
            this.A03 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A01 = (C124795yo) r1.A0L.A0I.get();
            this.A00 = C36361kB.A0S(r1.A0M);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C124795yo getCallHeaderStateHolder() {
        C124795yo r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callHeaderStateHolder");
    }

    public final AnonymousClass1LI getTextEmojiLabelControllerFactory() {
        AnonymousClass1LI r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("textEmojiLabelControllerFactory");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(this);
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            Resources resources = getResources();
            if (identifier <= 0) {
                identifier = R.dimen.f7nameremoved;
            }
            A0K.topMargin = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, resources.getDimensionPixelSize(identifier));
            setLayoutParams(A0K);
        }
    }

    public CallScreenHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A06();
    }

    /* access modifiers changed from: private */
    public final void setTitle(AnonymousClass141 r3, C61243Bc r4) {
        CharSequence charSequence;
        if (r3 != null) {
            TextEmojiLabel textEmojiLabel = this.A04;
            textEmojiLabel.setVisibility(0);
            this.A06.A05(r3);
            if (r4 != null) {
                charSequence = C90474aD.A0V(this, r4);
            } else {
                charSequence = null;
            }
            textEmojiLabel.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A09 = C36431kI.A1I(AnonymousClass7QC.A00);
        this.A0A = C36431kI.A1I(AnonymousClass7QD.A00);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        TextEmojiLabel A0O = C36351kA.A0O(this, R.id.title);
        this.A04 = A0O;
        this.A05 = C36341k9.A0Q(this, R.id.subtitle);
        this.A07 = C36341k9.A0X(this, R.id.minimize_btn_stub);
        this.A08 = C36341k9.A0X(this, R.id.participants_btn_stub);
        this.A06 = getTextEmojiLabelControllerFactory().B3q(getContext(), A0O);
        if (C011304x.A02(this)) {
            A02(this);
        } else {
            C163647qX.A00(this, 7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A09 = C36431kI.A1I(AnonymousClass7QC.A00);
        this.A0A = C36431kI.A1I(AnonymousClass7QD.A00);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        TextEmojiLabel A0O = C36351kA.A0O(this, R.id.title);
        this.A04 = A0O;
        this.A05 = C36341k9.A0Q(this, R.id.subtitle);
        this.A07 = C36341k9.A0X(this, R.id.minimize_btn_stub);
        this.A08 = C36341k9.A0X(this, R.id.participants_btn_stub);
        this.A06 = getTextEmojiLabelControllerFactory().B3q(getContext(), A0O);
        if (C011304x.A02(this)) {
            A02(this);
        } else {
            C163647qX.A00(this, 6);
        }
    }
}
