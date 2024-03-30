package com.facebook.rendercore;

import X.AnonymousClass00C;
import X.AnonymousClass5YV;
import X.AnonymousClass6Y3;
import X.AnonymousClass7cH;
import X.C05250Oz;
import X.C123055vr;
import X.C123655wr;
import X.C1263963t;
import X.C133146Wy;
import X.C36381kD;
import X.C36441kJ;
import X.C90514aH;
import X.C98134qw;
import android.content.Context;
import android.util.AttributeSet;

public class RootHostView extends C98134qw {
    public static final int[] A01 = C36441kJ.A1O();
    public final C1263963t A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r0 = X.AnonymousClass5YU.A00((int) r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            X.63t r7 = r9.A00
            long r1 = X.AnonymousClass5YT.A00(r10, r11)
            int[] r6 = A01
            r5 = 1
            X.AnonymousClass00C.A0D(r6, r5)
            int r0 = X.C90514aH.A0D(r1)
            X.6F0 r0 = X.AnonymousClass5YU.A00(r0)
            int r8 = r0.A02(r1)
            int r0 = r0.A04(r1)
            boolean r0 = X.AnonymousClass000.A1S(r8, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0040
            int r0 = (int) r1
            X.6F0 r0 = X.AnonymousClass5YU.A00(r0)
            int r3 = r0.A01(r1)
            int r0 = r0.A03(r1)
            if (r3 != r0) goto L_0x0040
            r7.A02 = r5
            r6[r4] = r8
            r6[r5] = r3
        L_0x0038:
            r1 = r6[r4]
            r0 = r6[r5]
            r9.setMeasuredDimension(r1, r0)
            return
        L_0x0040:
            X.6Wy r0 = r7.A00
            if (r0 == 0) goto L_0x004a
            r0.A05(r6, r1)
            r7.A02 = r4
            goto L_0x0038
        L_0x004a:
            super.onMeasure(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.RootHostView.onMeasure(int, int):void");
    }

    public void setRenderState(C133146Wy r4) {
        C123055vr r1;
        C1263963t r2 = this.A00;
        if (!AnonymousClass00C.A0J(r2.A00, r4)) {
            C133146Wy r12 = r2.A00;
            if (r12 != null) {
                r12.A01 = null;
            }
            r2.A00 = r4;
            if (r4 != null) {
                C1263963t r0 = r4.A01;
                if (r0 == null || r0.equals(r2)) {
                    r4.A01 = r2;
                    r1 = r4.A00;
                } else {
                    throw C90514aH.A0s("Must detach from previous host listener first");
                }
            } else {
                r1 = null;
            }
            if (!AnonymousClass00C.A0J(r2.A01, r1)) {
                if (r1 == null) {
                    r2.A04.A0D();
                }
                r2.A01 = r1;
                r2.A03.requestLayout();
            }
        }
    }

    public void setRenderTreeUpdateListener(AnonymousClass7cH r4) {
        AnonymousClass6Y3 r2 = this.A00.A04;
        C123655wr r1 = r2.A00;
        if (r1 == null) {
            r1 = new C123655wr(r2, r2.A05);
        }
        r1.A00 = r4;
        r2.A00 = r1;
    }

    public final C1263963t getRootHostDelegate() {
        return this.A00;
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        C1263963t r0 = this.A00;
        AnonymousClass5YV.A00(r0.A03, r0.A04);
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        C1263963t r0 = this.A00;
        AnonymousClass5YV.A00(r0.A03, r0.A04);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00.A04.A0B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.A04.A0C();
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        C1263963t r0 = this.A00;
        AnonymousClass5YV.A00(r0.A03, r0.A04);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C1263963t r0 = this.A00;
        AnonymousClass5YV.A00(r0.A03, r0.A04);
    }

    public /* synthetic */ RootHostView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A00 = new C1263963t(this);
    }
}
