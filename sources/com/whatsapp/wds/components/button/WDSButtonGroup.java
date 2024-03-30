package com.whatsapp.wds.components.button;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass5SR;
import X.C05250Oz;
import X.C12380hx;
import X.C15060md;
import X.C155817Xn;
import X.C16970qV;
import X.C18660tW;
import X.C18700tb;
import X.C18820ts;
import X.C27991Qq;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import X.C90524aI;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

public final class WDSButtonGroup extends ViewGroup implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public AnonymousClass5SR A03;
    public AnonymousClass5SR A04;
    public final List A05;

    public final void setOrientationMode(AnonymousClass5SR r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A04, r2);
        this.A04 = r2;
        if (A1W) {
            requestLayout();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list = this.A05;
        list.clear();
        C12380hx r1 = new C12380hx(C15060md.A02(C155817Xn.A00, new C18660tW(this, 0)));
        while (r1.hasNext()) {
            list.add(r1.next());
        }
        int size = list.size();
        if (size <= 2) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (size == 1) {
                ((View) list.remove(0)).layout(0, 0, i5, i6);
            } else if (size == 2) {
                View view = (View) list.remove(0);
                View view2 = (View) list.remove(0);
                if (this.A03 == AnonymousClass5SR.VERTICAL) {
                    int i7 = i6 / 2;
                    view.layout(0, 0, i5, i7);
                    view2.layout(0, i7, i5, i6);
                    return;
                }
                int i8 = i5 / 2;
                C18820ts r0 = this.A00;
                if (r0 == null || C36351kA.A1Y(r0)) {
                    view.layout(0, 0, i8, i6);
                    view2.layout(i8, 0, i5, i6);
                    return;
                }
                view.layout(i8, 0, i5, i6);
                view2.layout(0, 0, i8, i6);
            }
        } else {
            throw AnonymousClass001.A09("WDSButtonGroup should not have more than 2 visible children!");
        }
    }

    public WDSButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
    }

    public static final int A00(C16970qV r2) {
        Iterator it = r2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw C36371kC.A0s();
            }
        }
        return i;
    }

    public final AnonymousClass5SR getOrientationMode() {
        return this.A04;
    }

    public final C18820ts getWhatsAppLocale() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if ((r9 * 2) > r5) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r12)
            int r5 = android.view.View.MeasureSpec.getSize(r12)
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            int r7 = android.view.View.MeasureSpec.getSize(r13)
            r3 = 0
            X.0tW r1 = new X.0tW
            r1.<init>(r11, r3)
            X.7Xo r0 = X.C155827Xo.A00
            X.0ih r6 = X.C15060md.A02(r0, r1)
            int r0 = A00(r6)
            r9 = 0
            r2 = 2
            r4 = 0
            if (r0 > r2) goto L_0x00f5
            X.5SR r0 = r11.A04
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0037
            if (r1 == r2) goto L_0x0066
            r0 = 1
            if (r1 == r0) goto L_0x0074
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0037:
            X.0hx r3 = new X.0hx
            r3.<init>(r6)
            r2 = 0
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r12, r13)
            int r0 = r1.getMeasuredWidth()
            int r9 = java.lang.Math.max(r9, r0)
            r1.getMeasuredHeight()
            int r0 = r1.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r0)
            goto L_0x003d
        L_0x0060:
            if (r10 == 0) goto L_0x0074
            int r0 = r9 * 2
            if (r0 <= r5) goto L_0x0074
        L_0x0066:
            X.5SR r0 = X.AnonymousClass5SR.VERTICAL
        L_0x0068:
            r11.A03 = r0
            int r0 = A00(r6)
            if (r0 != 0) goto L_0x0077
            super.onMeasure(r12, r13)
            return
        L_0x0074:
            X.5SR r0 = X.AnonymousClass5SR.HORIZONTAL
            goto L_0x0068
        L_0x0077:
            X.5SR r1 = r11.A03
            X.5SR r0 = X.AnonymousClass5SR.HORIZONTAL
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00b0
            int r0 = A00(r6)
            int r10 = r5 / r0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            r9 = r13
        L_0x008a:
            X.0hx r8 = new X.0hx
            r8.<init>(r6)
            r7 = 0
        L_0x0090:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r1 = r8.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r3, r9)
            int r0 = r1.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r1.getMeasuredState()
            int r7 = android.view.View.combineMeasuredStates(r7, r0)
            goto L_0x0090
        L_0x00b0:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            int r0 = A00(r6)
            int r7 = r7 / r0
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r10 = r5
            goto L_0x008a
        L_0x00bf:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            X.0hx r1 = new X.0hx
            r1.<init>(r6)
        L_0x00cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.measure(r3, r2)
            goto L_0x00cc
        L_0x00dc:
            X.5SR r1 = r11.A03
            X.5SR r0 = X.AnonymousClass5SR.VERTICAL
            if (r1 != r0) goto L_0x00e7
            int r0 = A00(r6)
            int r4 = r4 * r0
        L_0x00e7:
            int r1 = android.view.View.resolveSizeAndState(r5, r12, r7)
            int r0 = r7 << 16
            int r0 = android.view.View.resolveSizeAndState(r4, r13, r0)
            r11.setMeasuredDimension(r1, r0)
            return
        L_0x00f5:
            java.lang.String r0 = "WDSButtonGroup should not have more than 2 visible children!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButtonGroup.onMeasure(int, int):void");
    }

    public final void setWhatsAppLocale(C18820ts r1) {
        this.A00 = r1;
    }

    public /* synthetic */ WDSButtonGroup(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        AnonymousClass5SR r4 = AnonymousClass5SR.AUTO;
        this.A04 = r4;
        this.A03 = AnonymousClass5SR.HORIZONTAL;
        this.A05 = C90524aI.A0l();
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A05;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(0, -1);
            AnonymousClass5SR[] values = AnonymousClass5SR.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r4 = values[i];
                }
            }
            setOrientationMode(r4);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }
}
