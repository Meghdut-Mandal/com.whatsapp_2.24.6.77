package com.whatsapp.wds.components.topbar;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass04F;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass13J;
import X.AnonymousClass4XW;
import X.C011304x;
import X.C05250Oz;
import X.C18820ts;
import X.C20810yC;
import X.C222013h;
import X.C27881Qe;
import X.C27901Qh;
import X.C27921Qj;
import X.C27941Ql;
import X.C27951Qm;
import X.C27961Qn;
import X.C27971Qo;
import X.C27981Qp;
import X.C27991Qq;
import X.C28001Qr;
import X.C56022vb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.ViewOutlineProvider;
import com.whatsapp.R;

public final class WDSToolbar extends C27881Qe {
    public int A00;
    public ColorStateList A01;
    public C27941Ql A02;
    public C20810yC A03;
    public AnonymousClass13J A04;
    public C27981Qp A05;
    public C27951Qm A06;
    public C28001Qr A07;
    public C27901Qh A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSToolbar(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public void A0I(Context context, int i) {
    }

    public void A0J(Context context, int i) {
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        AnonymousClass00C.A0D(canvas, 0);
        super.onDraw(canvas);
        if (this.A06 == C27951Qm.VISIBLE) {
            canvas2.drawLine(0.0f, ((float) getHeight()) - getDividerHeight(), (float) getWidth(), (float) getHeight(), getDividerPaint());
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
    }

    public final void setDividerVisibility(C27951Qm r2) {
        AnonymousClass00C.A0D(r2, 0);
        if (C222013h.A05 && this.A06 != r2) {
            this.A06 = r2;
            invalidate();
        }
    }

    public void setNavigationIconTint(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r1 != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setViewState(X.C27901Qh r4) {
        /*
            r3 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r3.A08 = r4
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0055
            X.1Qr r2 = r4.A00
            r0 = 0
            if (r2 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r3.A09 = r0
            if (r2 == 0) goto L_0x0039
            android.content.Context r1 = r3.getContext()
            X.AnonymousClass00C.A08(r1)
            int r0 = r2.A00
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            r3.A00 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            X.AnonymousClass00C.A08(r0)
            r3.A01 = r0
            X.1Qp r0 = r2.A01
            r3.A05 = r0
            super.setTitleTextColor((int) r1)
            super.setSubtitleTextColor((int) r1)
            super.setNavigationIconTint(r1)
        L_0x0039:
            android.content.Context r2 = r3.getContext()
            X.1Qh r0 = r3.A08
            java.lang.CharSequence r0 = r0.A01
            if (r0 == 0) goto L_0x004c
            boolean r1 = X.AnonymousClass098.A06(r0)
            r0 = 2132084303(0x7f15064f, float:1.9808773E38)
            if (r1 == 0) goto L_0x004f
        L_0x004c:
            r0 = 2132084301(0x7f15064d, float:1.9808769E38)
        L_0x004f:
            super.A0J(r2, r0)
            r3.invalidate()
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.topbar.WDSToolbar.setViewState(X.1Qh):void");
    }

    private final float getDividerHeight() {
        return ((Number) this.A0C.getValue()).floatValue();
    }

    private final Paint getDividerPaint() {
        return (Paint) this.A0D.getValue();
    }

    public final void A0K() {
        C28001Qr r0 = this.A08.A00;
        if (r0 != null) {
            Context context = getContext();
            AnonymousClass00C.A08(context);
            super.setTitleTextColor(AnonymousClass00F.A00(context, r0.A00));
        }
    }

    public final void A0L() {
        setViewState(C27901Qh.A04.A00(this));
    }

    public Drawable getBackground() {
        if (!this.A0B) {
            return C27921Qj.A00;
        }
        return super.getBackground();
    }

    public final void setIconSet(C28001Qr r2) {
        if (!AnonymousClass00C.A0J(this.A07, r2)) {
            this.A07 = r2;
            A0L();
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        if (drawable != null && this.A09) {
            ColorStateList colorStateList = this.A01;
            AnonymousClass00C.A0D(colorStateList, 1);
            drawable = AnonymousClass08I.A01(drawable.mutate());
            AnonymousClass00C.A08(drawable);
            AnonymousClass08I.A04(drawable);
            AnonymousClass076.A01(colorStateList, drawable);
        }
        super.setOverflowIcon(drawable);
    }

    public void setSubtitleTextColor(int i) {
        if (!this.A09) {
            super.setSubtitleTextColor(i);
        }
    }

    public void setTitleTextColor(int i) {
        if (!this.A09) {
            super.setTitleTextColor(i);
        }
    }

    public final void A0M(int i) {
        super.setTitleTextColor(AnonymousClass00F.A00(getContext(), i));
    }

    public final C20810yC getAbProps() {
        return this.A03;
    }

    public final C27941Ql getBidiToolbarDelegate() {
        return this.A02;
    }

    public final C27951Qm getDividerVisibility() {
        return this.A06;
    }

    public final C28001Qr getIconSet() {
        return this.A07;
    }

    public Menu getMenu() {
        Menu menu = super.getMenu();
        if (!this.A0A) {
            this.A0A = true;
            if (!C011304x.A03(this) || isLayoutRequested()) {
                addOnLayoutChangeListener(new AnonymousClass4XW(this, 2));
            } else {
                setOverflowIcon(getOverflowIcon());
            }
        }
        AnonymousClass00C.A0B(menu);
        return menu;
    }

    public final AnonymousClass13J getSystemFeatures() {
        return this.A04;
    }

    public final C27901Qh getViewState() {
        return this.A08;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0A && this.A09) {
            C56022vb.A00(this.A01, getMenu(), this.A05, this.A00);
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A0L();
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        A0L();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0L();
    }

    public void setSubtitle(int i) {
        super.setSubtitle(i);
        A0L();
    }

    public final void setAbProps(C20810yC r1) {
        this.A03 = r1;
    }

    public final void setBidiToolbarDelegate(C27941Ql r1) {
        this.A02 = r1;
    }

    public final void setSystemFeatures(AnonymousClass13J r1) {
        this.A04 = r1;
    }

    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        A0L();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        context.getTheme().applyStyle(R.style.f13nameremoved, true);
        this.A08 = C27901Qh.A04.A00(this);
        this.A06 = C27951Qm.GONE;
        this.A0C = new AnonymousClass00U(new C27961Qn(this));
        this.A0D = new AnonymousClass00U(new C27971Qo(context));
        int A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A00 = A002;
        ColorStateList valueOf = ColorStateList.valueOf(A002);
        AnonymousClass00C.A08(valueOf);
        this.A01 = valueOf;
        this.A05 = C27981Qp.FILLED;
        this.A0B = true;
        C27941Ql r1 = this.A02;
        if (r1 != null && !isInEditMode()) {
            AnonymousClass04F.A05(this, C18820ts.A00(r1.A00).A06 ? 1 : 0);
        }
        super.setContentInsetStartWithNavigation(0);
        super.A0I(context, R.style.f13nameremoved);
        if (attributeSet != null) {
            Context context2 = getContext();
            AnonymousClass00C.A08(context2);
            int[] iArr = C27991Qq.A0F;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (C222013h.A05) {
                AnonymousClass00C.A0D(obtainStyledAttributes, 0);
                C27951Qm r3 = C27951Qm.VISIBLE;
                C27951Qm[] values = C27951Qm.values();
                int i = obtainStyledAttributes.getInt(0, 0);
                if (i >= 0) {
                    AnonymousClass00C.A0D(values, 0);
                    if (i <= values.length - 1) {
                        r3 = values[i];
                    }
                }
                setDividerVisibility(r3);
            }
            obtainStyledAttributes.recycle();
        }
        setOutlineProvider((ViewOutlineProvider) null);
        A0L();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSToolbar(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
