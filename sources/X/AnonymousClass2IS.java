package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2IS  reason: invalid class name */
public abstract class AnonymousClass2IS extends C37541mm implements C87614Pm {
    public float A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03;
    public Pair A04;
    public View A05;
    public RelativeLayout A06;
    public C19700wN A07;
    public AnonymousClass1LI A08;
    public C195449Ui A09;
    public C65793Tm A0A;
    public C38501p4 A0B;
    public AnonymousClass3HC A0C;
    public C21060yb A0D;
    public C18820ts A0E;
    public C220412q A0F;
    public C20810yC A0G;
    public C77453qW A0H;
    public AnonymousClass2XH A0I;
    public C26341Ju A0J;
    public AnonymousClass3T1 A0K;
    public AnonymousClass1X7 A0L;
    public C28081Rg A0M;
    public boolean A0N = true;
    public boolean A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public Paint A0T;
    public Drawable A0U;
    public Drawable A0V;
    public C608939t A0W;
    public boolean A0X;
    public View A0Y;
    public boolean A0Z = false;
    public final int A0a;
    public final View A0b;
    public final C89004Uw A0c;
    public final C89014Ux A0d;
    public final int A0e;
    public final Rect A0f = AnonymousClass001.A06();
    public final AnonymousClass005 A0g;
    public final AnonymousClass005 A0h;
    public final Rect A0i = AnonymousClass001.A06();

    public void A1B() {
    }

    public boolean A1E() {
        return false;
    }

    public boolean A1F() {
        return false;
    }

    public boolean A1I() {
        return false;
    }

    public boolean A1J() {
        return false;
    }

    public boolean A1K() {
        return false;
    }

    public boolean A1L() {
        return false;
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return false;
    }

    public boolean A1O() {
        return false;
    }

    public abstract boolean A1P();

    public int getCapabilities() {
        return 3;
    }

    public abstract int getCenteredLayoutId();

    public abstract int getIncomingLayoutId();

    public int getMainChildMaxWidth() {
        return 0;
    }

    public abstract int getOutgoingLayoutId();

    public abstract int getUserNameInGroupLayoutOption();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private C608939t getOrCreateBubbleDrawState() {
        C608939t r2 = this.A0W;
        if (r2 != null) {
            return r2;
        }
        int i = this.A0a;
        Drawable A1A = A1A(i, this.A01, false);
        Rect A022 = this.A09.A02(i);
        Drawable A1A2 = A1A(i, this.A01, true);
        Rect A023 = this.A09.A02(i);
        View bubbleAnchorView = getBubbleAnchorView();
        Rect A062 = AnonymousClass001.A06();
        A062.left = 0;
        A062.top = 0;
        A062.right = bubbleAnchorView.getWidth();
        A062.bottom = bubbleAnchorView.getHeight();
        while (bubbleAnchorView != this && bubbleAnchorView != null) {
            A062.offset(bubbleAnchorView.getLeft(), bubbleAnchorView.getTop());
            bubbleAnchorView = (View) bubbleAnchorView.getParent();
        }
        C608939t r22 = new C608939t(A022, A023, A062, A1A, A1A2, i);
        this.A0W = r22;
        return r22;
    }

    public int A18() {
        C38501p4 r1 = this.A0B;
        if (r1 == null) {
            return 0;
        }
        if (r1.A02.getVisibility() != 0 && r1.A01.getVisibility() != 0) {
            return 0;
        }
        C38501p4 r3 = this.A0B;
        int measuredHeight = this.A0b.getMeasuredHeight();
        r3.setOrientation(1);
        C36331k8.A0x(r3);
        if (r3.getMeasuredHeight() > measuredHeight) {
            r3.setOrientation(0);
            C36331k8.A0x(r3);
        }
        C38501p4 r0 = this.A0B;
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(r0);
        return r0.getMeasuredWidth() + A0a2.leftMargin + A0a2.rightMargin;
    }

    public int A19(int i, int i2, int i3) {
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout == null || relativeLayout.getVisibility() == 8) {
            return 0;
        }
        C34081gQ.A06(this.A06, i, AnonymousClass000.A09(this), 0, i2, i3);
        return this.A06.getMeasuredHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r9 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r9 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A1A(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            X.9Ui r5 = r6.A09
            X.4Ux r0 = r6.A0d
            boolean r4 = r0.Bt4()
            r3 = 1
            if (r7 == r3) goto L_0x006f
            r2 = -1
            r1 = 3
            r0 = 2
            if (r7 == r0) goto L_0x003b
            if (r7 != r1) goto L_0x0057
            if (r8 == r2) goto L_0x002c
            if (r8 == r3) goto L_0x002c
            if (r8 == r0) goto L_0x001a
            if (r8 != r1) goto L_0x0057
        L_0x001a:
            if (r9 == 0) goto L_0x0038
        L_0x001c:
            X.004 r1 = r5.A0A
        L_0x001e:
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x002c:
            if (r9 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x001c
            X.004 r1 = r5.A09
            goto L_0x001e
        L_0x0033:
            if (r4 != 0) goto L_0x0038
            X.004 r1 = r5.A08
            goto L_0x001e
        L_0x0038:
            X.004 r1 = r5.A07
            goto L_0x001e
        L_0x003b:
            if (r8 == r2) goto L_0x0048
            if (r8 == r3) goto L_0x0048
            if (r8 == r0) goto L_0x0043
            if (r8 != r1) goto L_0x0057
        L_0x0043:
            if (r9 == 0) goto L_0x0054
        L_0x0045:
            X.004 r1 = r5.A06
            goto L_0x001e
        L_0x0048:
            if (r9 == 0) goto L_0x004f
            if (r4 != 0) goto L_0x0045
            X.004 r1 = r5.A05
            goto L_0x001e
        L_0x004f:
            if (r4 != 0) goto L_0x0054
            X.004 r1 = r5.A04
            goto L_0x001e
        L_0x0054:
            X.004 r1 = r5.A03
            goto L_0x001e
        L_0x0057:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unreachable code: direction="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; collapse="
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r8)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x006f:
            if (r9 == 0) goto L_0x0081
            X.004 r1 = r5.A02
        L_0x0073:
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.AnonymousClass00C.A0A(r0)
            return r0
        L_0x0081:
            X.004 r1 = r5.A01
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IS.A1A(int, int, boolean):android.graphics.drawable.Drawable");
    }

    public void A1D(C64933Qa r4) {
        C37621mw r2 = new C37621mw(this);
        r2.setDuration(2400);
        r2.setInterpolator(new AccelerateInterpolator());
        startAnimation(r2);
    }

    public boolean A1G() {
        return this.A0d.BMl();
    }

    public int getGlowContentBottom() {
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return this.A0P;
        }
        return this.A06.getBottom();
    }

    public C89014Ux getRowCustomizer() {
        C89004Uw r0 = this.A0c;
        if (r0 != null) {
            return r0.getConversationRowCustomizer();
        }
        return this.A0C.A09;
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Rect rect;
        int i;
        boolean A1Y;
        boolean z;
        int i2;
        int i3;
        int i4;
        View view;
        Canvas canvas2 = canvas;
        if (this.A0O) {
            if (this.A0V == null) {
                Drawable A002 = AnonymousClass0BT.A00(C36361kB.A09(this), getResources(), R.drawable.album_card_top);
                C18740tg.A06(A002);
                this.A0V = A002;
            }
            if (this.A0U == null) {
                Drawable A003 = AnonymousClass0BT.A00(C36361kB.A09(this), getResources(), R.drawable.album_card_bottom);
                C18740tg.A06(A003);
                this.A0U = A003;
            }
            this.A0V.setBounds(0, getPaddingTop() - this.A0V.getIntrinsicHeight(), getWidth(), getPaddingTop());
            this.A0V.draw(canvas2);
            this.A0U.setBounds(0, this.A0P, getWidth(), this.A0P + this.A0U.getIntrinsicHeight());
            this.A0U.draw(canvas2);
        } else {
            C608939t orCreateBubbleDrawState = getOrCreateBubbleDrawState();
            if (isPressed()) {
                drawable = orCreateBubbleDrawState.A05;
            } else {
                drawable = orCreateBubbleDrawState.A04;
            }
            if (isPressed()) {
                rect = orCreateBubbleDrawState.A03;
            } else {
                rect = orCreateBubbleDrawState.A02;
            }
            Rect rect2 = orCreateBubbleDrawState.A01;
            if (this.A00 > 0.0f) {
                int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
                int i5 = (A022 & 16777215) | (((int) (((float) (A022 >> 24)) * this.A00)) << 24);
                Paint paint = this.A0T;
                if (paint == null) {
                    paint = C36441kJ.A0L(1);
                    this.A0T = paint;
                }
                paint.setColor(i5);
                canvas2.drawRect(0.0f, (float) ((this.A0Q - rect.top) - getResources().getDimensionPixelSize(R.dimen.f7nameremoved)), C36441kJ.A01(this), (float) (getGlowContentBottom() + rect.bottom + Math.max(1, (int) (C36341k9.A00(getContext()) / 2.0f))), this.A0T);
            }
            if (isSelected() || (((view = this.A05) == null || view.getVisibility() != 0) && (isPressed() || isFocused()))) {
                C89014Ux r10 = this.A0d;
                if (r10.BtU()) {
                    canvas2.drawRect(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this), r10.BBz());
                }
            }
            AnonymousClass3T1 r11 = this.A0K;
            int i6 = r11.A0D;
            if (i6 == -1 || (!(i6 != 6 || (i4 = r11.A1I) == 8 || i4 == 90) || (i = r11.A1I) == 21 || i == 22 || i == 36)) {
                this.A0i.set(0, this.A0Q - rect.top, getWidth(), this.A0P + rect.bottom);
            } else {
                int i7 = orCreateBubbleDrawState.A00;
                if (i7 == 1) {
                    z = this.A0d.BtA();
                } else {
                    if (i7 == 3) {
                        A1Y = this.A0d.BNB();
                    } else {
                        A1Y = C36351kA.A1Y(this.A0E);
                    }
                    z = !A1Y;
                }
                Rect rect3 = this.A0i;
                int i8 = rect2.left;
                if (z) {
                    i2 = rect.right;
                } else {
                    i2 = rect.left;
                }
                int i9 = i8 - i2;
                int i10 = rect2.top - rect.top;
                int i11 = rect2.right;
                if (z) {
                    i3 = rect.left;
                } else {
                    i3 = rect.right;
                }
                rect3.set(i9, i10, i11 + i3, rect2.bottom + rect.bottom);
                View view2 = this.A0b;
                rect3.offset((int) view2.getTranslationX(), 0);
                if (this.A0N) {
                    drawable.setAlpha(getBubbleAlpha());
                    drawable.setDither(true);
                    drawable.setBounds(rect3);
                    if (z) {
                        canvas2.save();
                        canvas2.scale(-1.0f, 1.0f, rect3.exactCenterX(), 0.0f);
                        drawable.draw(canvas2);
                        canvas2.restore();
                    } else {
                        drawable.draw(canvas2);
                    }
                }
                if (this.A03 > 0) {
                    float translationX = ((float) ((int) view2.getTranslationX())) / ((float) (getWidth() / 6));
                    int min = Math.min((int) view2.getTranslationX(), getWidth() / 6);
                    int top = view2.getTop();
                    int bottom = view2.getBottom();
                    int A052 = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
                    Drawable drawable2 = (Drawable) this.A0h.get();
                    Drawable drawable3 = (Drawable) this.A0g.get();
                    Rect rect4 = this.A0f;
                    drawable3.getPadding(rect4);
                    int i12 = (top + bottom) / 2;
                    drawable3.setBounds(((min - drawable2.getIntrinsicWidth()) - A052) - rect4.right, (i12 - (drawable2.getIntrinsicHeight() / 2)) - A052, (min + A052) - rect4.right, (drawable2.getIntrinsicHeight() / 2) + i12 + A052);
                    drawable2.setBounds((min - drawable2.getIntrinsicWidth()) - rect4.right, i12 - (drawable2.getIntrinsicHeight() / 2), min - rect4.right, i12 + (drawable2.getIntrinsicHeight() / 2));
                    int min2 = (int) (Math.min(1.0f, 2.0f * translationX) * 255.0f);
                    drawable3.setAlpha(min2);
                    drawable2.setAlpha(min2);
                    drawable3.draw(canvas2);
                    drawable2.draw(canvas2);
                    C38501p4 r1 = this.A0B;
                    if (r1 != null) {
                        r1.setTranslationX(view2.getTranslationX());
                        r1.setAlpha(Math.max(0.0f, 1.0f - (translationX * 4.0f)));
                    }
                    if (this.A03 == 2) {
                        invalidate();
                    }
                }
            }
        }
        super.onDraw(canvas2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r4 = r17
            int r6 = r4.getPaddingTop()
            android.view.View r0 = r4.A0Y
            r2 = 8
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x003a
            android.view.View r0 = r4.A0Y
            android.view.ViewGroup$MarginLayoutParams r8 = X.AnonymousClass000.A0a(r0)
            int r0 = r8.topMargin
            int r6 = r6 + r0
            android.view.View r0 = r4.A0Y
            int r7 = r0.getMeasuredWidth()
            android.view.View r0 = r4.A0Y
            int r5 = r0.getMeasuredHeight()
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r7
            int r3 = r0 / 2
            android.view.View r1 = r4.A0Y
            int r7 = r7 + r3
            int r0 = r6 + r5
            r1.layout(r3, r6, r7, r0)
            int r0 = r8.bottomMargin
            int r5 = r5 + r0
            int r6 = r6 + r5
        L_0x003a:
            android.view.View r3 = r4.A0b
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0a(r3)
            int r0 = r1.topMargin
            int r6 = r6 + r0
            X.0ts r0 = r4.A0E
            boolean r12 = X.C36351kA.A1Y(r0)
            if (r12 == 0) goto L_0x025f
            int r10 = r1.leftMargin
            int r9 = r1.rightMargin
            int r1 = r4.getPaddingLeft()
            int r11 = r4.getPaddingRight()
        L_0x0057:
            boolean r0 = r4.A1G()
            r8 = 0
            if (r0 != 0) goto L_0x006d
            X.3T1 r7 = r4.A0K
            int r5 = r7.A0D
            r0 = 6
            if (r5 != r0) goto L_0x023e
            int r5 = r7.A1I
            if (r5 == r2) goto L_0x023e
            r0 = 90
            if (r5 == r0) goto L_0x023e
        L_0x006d:
            android.util.Pair r0 = r4.A04
            if (r0 == 0) goto L_0x0075
            int r8 = X.C36381kD.A03(r0)
        L_0x0075:
            int r1 = r4.getMeasuredWidth()
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            int r1 = r1 - r8
            int r1 = r1 / 2
        L_0x0081:
            android.util.Pair r0 = r4.A04
            if (r0 == 0) goto L_0x023b
            java.lang.Object r9 = r0.first
            android.view.View r9 = (android.view.View) r9
            int r8 = X.C36381kD.A03(r0)
            if (r9 == 0) goto L_0x00ac
            int r0 = r9.getVisibility()
            if (r0 == r2) goto L_0x00ac
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r9)
            int r7 = r0.leftMargin
            int r5 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            if (r12 == 0) goto L_0x0232
            int r0 = r1 + r7
        L_0x00a7:
            int r5 = r5 + r0
            int r2 = r2 + r6
            r9.layout(r0, r6, r5, r2)
        L_0x00ac:
            int r1 = r1 + r8
            if (r12 != 0) goto L_0x00ba
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 - r1
            int r0 = r3.getMeasuredWidth()
            int r1 = r2 - r0
        L_0x00ba:
            int r2 = r3.getMeasuredWidth()
            int r2 = r2 + r1
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 + r6
            r3.layout(r1, r6, r2, r0)
            r14 = 3
            int r0 = r4.getCapabilities()
            r0 = r0 & 3
            if (r0 == 0) goto L_0x0170
            X.4Uw r1 = r4.A0c
            if (r1 == 0) goto L_0x0170
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L_0x0170
            X.3Tm r2 = r4.A0A
            int r1 = r1.getContainerType()
            X.3T1 r0 = r4.getFMessage()
            boolean r0 = r2.A05(r0, r1)
            if (r0 == 0) goto L_0x0170
            X.3Tm r9 = r4.A0A
            android.widget.RelativeLayout r6 = r4.A06
            boolean r0 = r4.A1I()
            if (r0 != 0) goto L_0x00f3
            r14 = 5
        L_0x00f3:
            X.3T1 r1 = r4.getFMessage()
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            r13 = 3
            X.AnonymousClass00C.A0D(r1, r13)
            int r16 = r6.getMeasuredWidth()
            int r15 = r6.getMeasuredHeight()
            int r12 = r6.getMeasuredWidth()
            int r11 = X.C36411kG.A05(r6)
            android.view.View r10 = X.C36411kG.A0L(r4)
            int r7 = r10.getLeft()
            float r0 = r10.getY()
            int r5 = (int) r0
            X.2nn r0 = r4.getBubbleType()
            X.2nn r8 = X.C51422nn.FULL
            if (r0 == r8) goto L_0x0203
            r0 = 2131429394(0x7f0b0812, float:1.848046E38)
            android.view.View r2 = X.C36361kB.A0G(r4, r0)
            int r0 = r2.getLeft()
            int r7 = r7 + r0
            float r1 = (float) r5
            float r0 = r2.getY()
            float r1 = r1 + r0
            int r5 = (int) r1
            X.0ts r0 = r9.A00
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x0200
            int r0 = r2.getMeasuredWidth()
            int r7 = r7 + r0
            int r7 = r7 - r12
            int r7 = r7 - r11
        L_0x0146:
            int r0 = r2.getMeasuredHeight()
        L_0x014a:
            int r5 = r5 + r0
            X.2nn r2 = r4.getBubbleType()
            android.content.res.Resources r1 = X.C36441kJ.A0J(r6)
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            if (r2 != r8) goto L_0x015b
            r0 = 2131168379(0x7f070c7b, float:1.7951058E38)
        L_0x015b:
            int r0 = r1.getDimensionPixelOffset(r0)
            int r5 = r5 - r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r7, r5)
            int r5 = r0.x
            int r2 = r0.y
            int r1 = r5 + r16
            int r0 = r2 + r15
            r6.layout(r5, r2, r1, r0)
        L_0x0170:
            X.1p4 r0 = r4.A0B
            if (r0 == 0) goto L_0x01b6
            android.view.ViewGroup$MarginLayoutParams r9 = X.AnonymousClass000.A0a(r0)
            boolean r0 = X.C37541mm.A06(r4)
            if (r0 == 0) goto L_0x01f9
            X.4Ux r0 = r4.A0d
            boolean r2 = r0.BNB()
        L_0x0184:
            X.1p4 r0 = r4.A0B
            int r0 = r0.getMeasuredHeight()
            int r8 = r0 / 2
            int r1 = r3.getTop()
            int r0 = r3.getBottom()
            int r1 = r1 + r0
            int r7 = r1 / 2
            X.1p4 r6 = r4.A0B
            if (r2 == 0) goto L_0x01e1
            int r5 = r3.getLeft()
            X.1p4 r0 = r4.A0B
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            int r0 = r9.leftMargin
            int r5 = r5 - r0
            int r2 = r7 - r8
            int r1 = r3.getLeft()
            int r0 = r9.leftMargin
            int r1 = r1 - r0
        L_0x01b2:
            int r7 = r7 + r8
            r6.layout(r5, r2, r1, r7)
        L_0x01b6:
            X.2nn r1 = r4.getBubbleType()
            X.2nn r0 = X.C51422nn.NONE
            if (r1 == r0) goto L_0x01dc
            r0 = 2131428262(0x7f0b03a6, float:1.8478164E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x01dc
            int r1 = r3.getTop()
            int r0 = r0.getPaddingTop()
            int r1 = r1 + r0
        L_0x01d0:
            r4.A0Q = r1
            int r0 = r4.A17()
            r4.A0P = r0
            r0 = 0
            r4.A0W = r0
            return
        L_0x01dc:
            int r1 = r3.getTop()
            goto L_0x01d0
        L_0x01e1:
            int r5 = r3.getRight()
            int r0 = r9.leftMargin
            int r5 = r5 + r0
            int r2 = r7 - r8
            int r1 = r3.getRight()
            X.1p4 r0 = r4.A0B
            int r0 = r0.getMeasuredWidth()
            int r1 = r1 + r0
            int r0 = r9.leftMargin
            int r1 = r1 + r0
            goto L_0x01b2
        L_0x01f9:
            X.0ts r0 = r4.A0E
            boolean r2 = X.C36401kF.A1X(r0)
            goto L_0x0184
        L_0x0200:
            int r7 = r7 + r11
            goto L_0x0146
        L_0x0203:
            int r2 = r10.getMeasuredWidth()
            if (r14 == r13) goto L_0x0228
            X.4Ux r0 = r4.getRowCustomizer()
            boolean r0 = r0.BtB()
            if (r0 != 0) goto L_0x0228
            X.3Qa r0 = r1.A1J
            boolean r1 = r0.A02
            X.0ts r0 = r9.A00
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r1 != r0) goto L_0x0230
        L_0x021f:
            int r7 = r7 + r2
            int r7 = r7 - r12
            int r7 = r7 - r11
        L_0x0222:
            int r0 = r10.getMeasuredHeight()
            goto L_0x014a
        L_0x0228:
            X.0ts r0 = r9.A00
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x021f
        L_0x0230:
            int r7 = r7 + r11
            goto L_0x0222
        L_0x0232:
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r1
            int r0 = r0 - r7
            int r0 = r0 - r5
            goto L_0x00a7
        L_0x023b:
            r8 = 0
            goto L_0x00ac
        L_0x023e:
            X.3Qa r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x025c
            X.4Ux r0 = r4.A0d
            boolean r0 = r0.BLr()
            if (r0 == 0) goto L_0x0259
            int r1 = r4.getMeasuredWidth()
            int r1 = r1 - r11
            int r1 = r1 - r9
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            goto L_0x0081
        L_0x0259:
            int r1 = r1 + r9
            goto L_0x0081
        L_0x025c:
            int r1 = r1 + r10
            goto L_0x0081
        L_0x025f:
            int r10 = r1.rightMargin
            int r9 = r1.leftMargin
            int r1 = r4.getPaddingRight()
            int r11 = r4.getPaddingLeft()
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IS.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int size = View.MeasureSpec.getSize(i4);
        int A092 = AnonymousClass000.A09(this);
        int mainChildMaxWidth = getMainChildMaxWidth();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        View view = this.A0Y;
        int i5 = i2;
        if (!(view == null || view.getVisibility() == 8)) {
            int i6 = 0;
            if (this.A0d.BLr()) {
                i6 = A092;
            }
            C34081gQ.A06(this.A0Y, i4, i6, 0, i5, paddingTop);
            paddingTop += C37541mm.A00(this.A0Y);
        }
        int A19 = A19(i4, i5, paddingTop);
        if (A19 != 0) {
            paddingTop += A19 - getReactionsViewVerticalOverlap();
        }
        Pair pair = this.A04;
        boolean z = false;
        if (pair != null) {
            View view2 = (View) pair.first;
            i3 = C36381kD.A03(pair);
            if (!(view2 == null || view2.getVisibility() == 8)) {
                C34081gQ.A06(view2, i4, A092, 0, i5, paddingTop);
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(view2);
                if (i3 == view2.getMeasuredWidth() + A0a2.leftMargin + A0a2.rightMargin) {
                    z = true;
                }
                C18740tg.A0D(z, "Profile picture optimistic width should be same as measured");
            }
        } else {
            i3 = 0;
        }
        int i7 = A092 + i3;
        View view3 = this.A0b;
        ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(view3);
        C89014Ux r1 = this.A0d;
        int B8y = r1.B8y(getFMessage());
        int B8x = r1.B8x();
        int i8 = this.A0a;
        if (i8 == 2 || i8 != 3) {
            AnonymousClass1JZ.A03(view3, B8x, B8y);
        } else {
            AnonymousClass1JZ.A03(view3, B8y, B8x);
        }
        int i9 = i4;
        int i10 = i5;
        int i11 = paddingTop;
        C34081gQ.A06(view3, i9, i7, mainChildMaxWidth, i10, i11);
        int i12 = A0a3.leftMargin + A0a3.rightMargin;
        int A18 = A18();
        if (A18 > i12) {
            i7 += A18 - i12;
            C34081gQ.A06(view3, i9, i7, mainChildMaxWidth, i10, i11);
        }
        int A002 = paddingTop + C37541mm.A00(view3);
        ViewGroup.MarginLayoutParams A0a4 = AnonymousClass000.A0a(view3);
        int measuredWidth = i7 + view3.getMeasuredWidth() + A0a4.leftMargin + A0a4.rightMargin;
        if (Integer.MIN_VALUE == View.MeasureSpec.getMode(i4)) {
            setMeasuredDimension(measuredWidth, A002);
        } else {
            setMeasuredDimension(size, A002);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2IS(android.content.Context r15, X.C89004Uw r16, X.AnonymousClass3T1 r17) {
        /*
            r14 = this;
            r14.<init>(r15)
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r14.A0i = r0
            r0 = -1
            r14.A01 = r0
            r3 = 1
            r14.A0N = r3
            r2 = 0
            r14.A0Z = r2
            r14.A02 = r2
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r14.A0f = r0
            r0 = r16
            r14.A0c = r0
            r4 = r17
            r14.A0K = r4
            X.4Ux r0 = r14.getRowCustomizer()
            r14.A0d = r0
            boolean r0 = r14.A1G()
            r5 = 2
            if (r0 == 0) goto L_0x0258
            r1 = 1
        L_0x0030:
            r14.A0a = r1
            if (r1 == r3) goto L_0x0252
            if (r1 == r5) goto L_0x024c
            int r5 = r14.getOutgoingLayoutId()
        L_0x003a:
            android.content.Context r9 = r14.getContext()
            X.0yC r1 = r14.A0G
            X.AnonymousClass00C.A0D(r9, r2)
            X.AnonymousClass00C.A0D(r1, r3)
            r0 = 2131625992(0x7f0e0808, float:1.8879208E38)
            if (r5 != r0) goto L_0x0090
            r0 = 3783(0xec7, float:5.301E-42)
            int r1 = r1.A07(r0)
            if (r1 == r3) goto L_0x0056
            r0 = 2
            if (r1 != r0) goto L_0x022b
        L_0x0056:
            com.whatsapp.WaFrameLayout r7 = X.C63803Lm.A00(r9)
        L_0x005a:
            r14.addView(r7)
        L_0x005d:
            android.view.View r0 = r14.getChildAt(r2)
            r14.A0b = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r15)
            int r0 = r0.getScaledTouchSlop()
            double r4 = (double) r0
            r0 = 4610785298501913805(0x3ffccccccccccccd, double:1.8)
            double r4 = r4 * r0
            int r0 = (int) r4
            r14.A0e = r0
            X.3Tu r1 = new X.3Tu
            r1.<init>(r14, r3)
            r2 = 0
            X.AZ4 r0 = new X.AZ4
            r0.<init>(r2, r1)
            r14.A0h = r0
            r0 = 2
            X.3Tu r1 = new X.3Tu
            r1.<init>(r14, r0)
            X.AZ4 r0 = new X.AZ4
            r0.<init>(r2, r1)
            r14.A0g = r0
            return
        L_0x0090:
            r0 = 2131624708(0x7f0e0304, float:1.8876603E38)
            if (r5 != r0) goto L_0x022b
            r0 = 3783(0xec7, float:5.301E-42)
            int r1 = r1.A07(r0)
            if (r1 == r3) goto L_0x00a0
            r0 = 3
            if (r1 != r0) goto L_0x022b
        L_0x00a0:
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r13 = r1.getDisplayMetrics()
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r9)
            r0 = 2131431363(0x7f0b0fc3, float:1.8484453E38)
            r7.setId(r0)
            r6 = -2
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r6, r6)
            r7.setLayoutParams(r0)
            r0 = 19
            r7.setGravity(r0)
            r0 = 30
            float r0 = (float) r0
            int r0 = X.C36431kI.A03(r13, r0, r3)
            r7.setMinimumHeight(r0)
            r7.setOrientation(r3)
            android.view.ViewStub r4 = new android.view.ViewStub
            r4.<init>(r9)
            r0 = 2131429238(0x7f0b0776, float:1.8480143E38)
            r4.setId(r0)
            r5 = -1
            X.C36381kD.A1A(r4, r5, r6)
            r7.addView(r4)
            r4 = 2132083508(0x7f150334, float:1.980716E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r9, r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r0)
            r0 = 2131433098(0x7f0b168a, float:1.8487972E38)
            r4.setId(r0)
            X.C36381kD.A1A(r4, r5, r6)
            r0 = 8
            r4.setVisibility(r0)
            r7.addView(r4)
            android.view.ViewStub r4 = new android.view.ViewStub
            r4.<init>(r9)
            r0 = 2131434509(0x7f0b1c0d, float:1.8490834E38)
            r4.setId(r0)
            X.C36381kD.A1A(r4, r5, r6)
            r7.addView(r4)
            r4 = 2132084316(0x7f15065c, float:1.98088E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r9, r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r0)
            r0 = 2131435344(0x7f0b1f50, float:1.8492528E38)
            r4.setId(r0)
            r7.addView(r4)
            com.whatsapp.components.TextAndDateLayout r10 = new com.whatsapp.components.TextAndDateLayout
            r10.<init>(r9)
            r0 = 2131429252(0x7f0b0784, float:1.8480171E38)
            r10.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r6)
            r4 = 3
            r0.gravity = r4
            r10.setLayoutParams(r0)
            r0 = 2131168383(0x7f070c7f, float:1.7951066E38)
            int r11 = r1.getDimensionPixelSize(r0)
            int r8 = r1.getDimensionPixelSize(r0)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.setPadding(r11, r2, r8, r0)
            com.whatsapp.TextEmojiLabel r11 = new com.whatsapp.TextEmojiLabel
            r11.<init>(r9)
            r0 = 2131431735(0x7f0b1137, float:1.8485208E38)
            r11.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r6)
            r0.gravity = r4
            r11.setLayoutParams(r0)
            r0 = 2131166083(0x7f070383, float:1.7946401E38)
            int r12 = r1.getDimensionPixelSize(r0)
            r8 = 2
            float r8 = (float) r8
            int r8 = X.C36431kI.A03(r13, r8, r3)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 5
            float r0 = (float) r0
            int r0 = X.C36431kI.A03(r13, r0, r3)
            r11.setPadding(r12, r8, r1, r0)
            r0 = 2132084236(0x7f15060c, float:1.9808637E38)
            r11.setTextAppearance(r9, r0)
            r10.addView(r11)
            android.util.DisplayMetrics r11 = X.AnonymousClass000.A0X(r9)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r9)
            r0 = 2131429394(0x7f0b0812, float:1.848046E38)
            r8.setId(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r6, r6)
            r0 = 85
            r1.gravity = r0
            r8.setLayoutParams(r1)
            r0 = 16
            r8.setGravity(r0)
            r8.setOrientation(r2)
            r0 = 6
            float r0 = (float) r0
            int r1 = X.C36431kI.A03(r11, r0, r3)
            int r0 = X.C36431kI.A03(r11, r0, r3)
            r8.setPadding(r1, r2, r0, r2)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131432003(0x7f0b1243, float:1.8485751E38)
            r1.setId(r0)
            r1.setInflatedId(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r6, r6)
            r1.setLayoutParams(r0)
            r8.addView(r1)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131433655(0x7f0b18b7, float:1.8489102E38)
            r1.setId(r0)
            r1.setInflatedId(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r6, r6)
            r1.setLayoutParams(r0)
            r8.addView(r1)
            com.whatsapp.WaTextView r1 = new com.whatsapp.WaTextView
            r1.<init>(r9)
            r0 = 2132084234(0x7f15060a, float:1.9808633E38)
            r1.setTextAppearance(r9, r0)
            r0 = 2131429373(0x7f0b07fd, float:1.8480417E38)
            r1.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r6)
            r1.setLayoutParams(r0)
            float r0 = (float) r3
            int r0 = X.C36431kI.A03(r11, r0, r3)
            r1.setPadding(r2, r2, r2, r0)
            r8.addView(r1)
            r10.addView(r8)
            r7.addView(r10)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131428603(0x7f0b04fb, float:1.8478855E38)
            r1.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r6)
            r0.gravity = r4
            r1.setLayoutParams(r0)
            r7.addView(r1)
            goto L_0x005a
        L_0x022b:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)
            android.view.View r0 = r0.inflate(r5, r14, r3)
            if (r0 != 0) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "rootview for conversationRow is null, rightLayout="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            java.lang.String r1 = X.C36421kH.A0d(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x024c:
            int r5 = r14.getIncomingLayoutId()
            goto L_0x003a
        L_0x0252:
            int r5 = r14.getCenteredLayoutId()
            goto L_0x003a
        L_0x0258:
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            r1 = 2
            if (r0 == 0) goto L_0x0030
            r1 = 3
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IS.<init>(android.content.Context, X.4Uw, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r5.Btw() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r5.Bsx() == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C51422nn A0f(X.C89014Ux r5, X.AnonymousClass3T1 r6) {
        /*
            X.3T1 r0 = r6.A0S()
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1V(r0)
            X.3Qa r1 = r6.A1J
            X.11F r0 = r1.A00
            boolean r2 = X.AnonymousClass143.A0G(r0)
            boolean r1 = r1.A02
            X.3BG r0 = r6.A0V
            if (r0 != 0) goto L_0x0018
            r4 = 0
        L_0x0018:
            boolean r0 = r5.Btb()
            if (r0 == 0) goto L_0x0023
            if (r1 != 0) goto L_0x0023
        L_0x0020:
            X.2nn r0 = X.C51422nn.NONE
            return r0
        L_0x0023:
            boolean r0 = r6 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x0030
            if (r3 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0020
        L_0x002d:
            X.2nn r0 = X.C51422nn.CONTACT
            return r0
        L_0x0030:
            boolean r0 = r6 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0049
            if (r4 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0042
            boolean r0 = r5.Btw()
            if (r0 == 0) goto L_0x0020
        L_0x0042:
            boolean r0 = r5.Bsx()
            if (r0 != 0) goto L_0x0020
            goto L_0x002d
        L_0x0049:
            X.2nn r0 = X.C51422nn.FULL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IS.A0f(X.4Ux, X.3T1):X.2nn");
    }

    private boolean A0g(MotionEvent motionEvent) {
        this.A0S = (int) motionEvent.getX();
        boolean z = false;
        this.A0X = false;
        if (this.A03 == 2) {
            this.A03 = 1;
            post(C80223v3.A00(this, 49));
            invalidate();
            z = true;
        }
        View view = this.A0b;
        this.A0R = (int) view.getTranslationX();
        view.animate().cancel();
        return z;
    }

    private boolean A0h(MotionEvent motionEvent) {
        Object obj;
        int x = (int) motionEvent.getX();
        if (this.A03 != 1 && AnonymousClass000.A05(x, this.A0S) > this.A0e) {
            this.A03 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A03 != 1) {
            return false;
        }
        int A022 = AnonymousClass001.A02((this.A0R + x) - this.A0S, this.A0e, 0);
        float A023 = (float) AnonymousClass001.A02(A022, getWidth() / 6, 0);
        int min = Math.min(A022, getWidth() / 6);
        double d = (double) A023;
        int width = min + ((int) (d / (((0.75d * d) / ((double) (getWidth() / 6))) + 1.0d)));
        float f = (float) width;
        this.A0b.setTranslationX(f);
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout != null) {
            relativeLayout.setTranslationX(f);
        }
        Pair pair = this.A04;
        if (!(pair == null || (obj = pair.first) == null)) {
            ((View) obj).setTranslationX(f);
        }
        if (width > getWidth() / 6 && !this.A0X) {
            try {
                if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                    AnonymousClass3T3.A03(this.A0D);
                }
            } catch (Settings.SettingNotFoundException e) {
                Log.e("swipetoreply/vibrate", e);
            }
            this.A0X = true;
        }
        invalidate();
        return true;
    }

    public int A17() {
        View findViewById;
        if (getBubbleType() != C51422nn.NONE) {
            AnonymousClass3T1 r1 = this.A0K;
            if (r1.A0S() == null && r1.A0V == null && (findViewById = findViewById(R.id.bubble_header)) != null) {
                return this.A0b.getTop() + findViewById.getBottom();
            }
        }
        return this.A0b.getBottom();
    }

    public void A1C() {
        clearAnimation();
        this.A00 = 0.0f;
        invalidate();
    }

    public boolean A1H() {
        return C36361kB.A1a(getBubbleType(), C51422nn.FULL);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getBubbleAlpha() {
        if (getBubbleType() == C51422nn.NONE) {
            return 0;
        }
        return 255;
    }

    public View getBubbleAnchorView() {
        View findViewById;
        if (getBubbleType() != C51422nn.CONTACT || (findViewById = findViewById(R.id.bubble_header)) == null) {
            return this.A0b;
        }
        return findViewById;
    }

    public C51422nn getBubbleType() {
        return A0f(this.A0d, getFMessage());
    }

    public AnonymousClass3T1 getFMessage() {
        return this.A0K;
    }

    public View getMainView() {
        return this.A0b;
    }

    public int getReactionsViewVerticalOverlap() {
        C51422nn bubbleType = getBubbleType();
        C51422nn r2 = C51422nn.FULL;
        Resources resources = getResources();
        int i = R.dimen.f7nameremoved;
        if (bubbleType == r2) {
            i = R.dimen.f7nameremoved;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public int getUserNameViewId() {
        return R.id.name_in_group;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A0g2;
        if (A1P() && !this.A0Z) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                A0g2 = A0g(motionEvent);
            } else if (actionMasked == 2) {
                A0g2 = A0h(motionEvent);
            }
            if (A0g2) {
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.A02 = (int) motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.A1P()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r7.A0Z
            if (r0 != 0) goto L_0x0019
            int r1 = r8.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x00bc
            if (r1 == r3) goto L_0x002b
            r0 = 2
            if (r1 == r0) goto L_0x00c1
            r0 = 3
            if (r1 == r0) goto L_0x002b
        L_0x0019:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0026
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.A02 = r0
        L_0x0026:
            boolean r0 = super.onTouchEvent(r8)
            return r0
        L_0x002b:
            int r0 = r7.A03
            if (r0 != r3) goto L_0x0019
            r0 = 2
            r7.A03 = r0
            X.4Uw r4 = r7.A0c
            if (r4 == 0) goto L_0x0054
            android.view.View r0 = r7.A0b
            float r0 = r0.getTranslationX()
            int r1 = (int) r0
            int r0 = r7.getWidth()
            int r0 = r0 / 6
            if (r1 <= r0) goto L_0x0054
            X.3T1 r2 = r7.getFMessage()
            X.3qW r0 = r7.A0H
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x00a9
            r4.Bth(r2)
        L_0x0054:
            android.view.View r0 = r7.A0b
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r6 = 0
            android.view.ViewPropertyAnimator r4 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r5 = r4.setInterpolator(r0)
            r4 = 4
            X.4VL r0 = new X.4VL
            r0.<init>(r7, r4)
            r5.setListener(r0)
            android.widget.RelativeLayout r0 = r7.A06
            if (r0 == 0) goto L_0x008b
            android.view.ViewPropertyAnimator r0 = X.C36431kI.A0L(r0, r1)
            android.view.ViewPropertyAnimator r4 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
        L_0x008b:
            android.util.Pair r0 = r7.A04
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x00a5
            android.view.View r0 = (android.view.View) r0
            android.view.ViewPropertyAnimator r0 = X.C36431kI.A0L(r0, r1)
            android.view.ViewPropertyAnimator r1 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
        L_0x00a5:
            r7.invalidate()
            return r3
        L_0x00a9:
            boolean r1 = r4.BMm()
            boolean r0 = r4.BMS()
            r4.setQuotedMessage(r2)
            if (r1 == 0) goto L_0x0054
            r0 = r0 ^ 1
            r4.Bel(r2, r0)
            goto L_0x0054
        L_0x00bc:
            boolean r0 = r7.A0g(r8)
            goto L_0x00c5
        L_0x00c1:
            boolean r0 = r7.A0h(r8)
        L_0x00c5:
            if (r0 == 0) goto L_0x0019
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public void setDrawBubble(boolean z) {
        this.A0N = z;
    }

    public void setFMessage(AnonymousClass3T1 r1) {
        this.A0K = r1;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
