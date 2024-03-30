package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.AnonymousClass52X;
import X.C001700s;
import X.C1028152a;
import X.C113155f5;
import X.C122375uk;
import X.C124545yN;
import X.C129066Eu;
import X.C135796dH;
import X.C143916rK;
import X.C143926rL;
import X.C157237cd;
import X.C157247ce;
import X.C18700tb;
import X.C18740tg;
import X.C18820ts;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36441kJ;
import X.C90524aI;
import X.C96104mn;
import X.C97034oI;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;

public class PipViewContainer extends FrameLayout implements C18700tb {
    public ValueAnimator A00;
    public Point A01;
    public Pair A02;
    public C96104mn A03;
    public C97034oI A04;
    public C157247ce A05;
    public C124545yN A06;
    public C18820ts A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public boolean A0A;
    public final boolean A0B;
    public final int A0C;
    public final int A0D;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public static C122375uk A00(Point point, Point point2, PipViewContainer pipViewContainer, C124545yN r9) {
        int dimensionPixelSize;
        int i = pipViewContainer.A0C;
        int i2 = r9.A04 + i;
        if (r9.A01 == 0) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = pipViewContainer.getResources().getDimensionPixelSize(r9.A01);
        }
        return new C122375uk(i, (point.x - point2.x) - i, i2, (((point.y - point2.y) - i) - r9.A02) - dimensionPixelSize);
    }

    public static void A01(PipViewContainer pipViewContainer) {
        int i;
        float f;
        float f2;
        Point point;
        int i2;
        int i3;
        int i4;
        C124545yN r10 = pipViewContainer.A06;
        if (r10 != null) {
            Point point2 = pipViewContainer.A01;
            if (point2 == null) {
                point = new Point(0, 0);
            } else {
                int i5 = r10.A05;
                if (i5 <= 0 || (i = r10.A03) <= 0) {
                    i5 = point2.x;
                    r10.A05 = i5;
                    i = point2.y;
                    r10.A03 = i;
                }
                int min = Math.min(i5, i);
                int max = Math.max(i5, i);
                int i6 = point2.x;
                int i7 = point2.y;
                int min2 = Math.min(i6, i7);
                int max2 = Math.max(i6, i7);
                int i8 = i6;
                if (i5 < i) {
                    i8 = i7;
                }
                if (i5 >= i) {
                    i6 = i7;
                }
                float f3 = (float) max2;
                float f4 = (float) min2;
                int i9 = (f3 > (2.5f * f4) ? 1 : (f3 == (2.5f * f4) ? 0 : -1));
                float f5 = r10.A00;
                if (i9 > 0) {
                    f = f5 * f3;
                    f2 = (float) max;
                } else {
                    f = f5 * f4;
                    f2 = (float) min;
                }
                float f6 = (float) min;
                float f7 = (float) max;
                float A002 = C90524aI.A00(((float) i8) * 0.5f, f7, C90524aI.A00(((float) i6) * 0.5f, f6, f / f2));
                int i10 = (int) (f6 * A002);
                int i11 = (int) (f7 * A002);
                if (i5 >= i) {
                    point = new Point(i11, i10);
                }
            }
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(pipViewContainer);
            int i12 = point.x;
            A0a.width = i12;
            int i13 = point.y;
            A0a.height = i13;
            Point point3 = pipViewContainer.A01;
            boolean z = false;
            if (point3 != null) {
                C124545yN r1 = pipViewContainer.A06;
                if (r1.A06) {
                    int i14 = pipViewContainer.A0D;
                    i2 = (point3.x - i12) - i14;
                    i4 = (point3.y - i13) - i14;
                    i3 = 0;
                } else {
                    C122375uk A003 = A00(point3, point, pipViewContainer, r1);
                    C124545yN r12 = pipViewContainer.A06;
                    if (r12.A08) {
                        i2 = A003.A00;
                        i3 = A003.A02;
                    } else {
                        i2 = A003.A02;
                        i3 = A003.A00;
                    }
                    if (r12.A07) {
                        i4 = A003.A01;
                    } else {
                        i4 = A003.A03;
                    }
                }
                A0a.setMargins(i2, i4, i3, 0);
            }
            pipViewContainer.setLayoutParams(A0a);
            if (A0a.height < A0a.width) {
                z = true;
            }
            if (z != pipViewContainer.A0A) {
                pipViewContainer.A0A = z;
                C97034oI r0 = pipViewContainer.A04;
                if (r0 != null) {
                    A03(pipViewContainer, r0.A05);
                }
            }
        }
    }

    public static void A02(PipViewContainer pipViewContainer) {
        C157247ce r1;
        Pair pair = pipViewContainer.A02;
        if (pair != null && (r1 = pipViewContainer.A05) != null) {
            boolean A1X = AnonymousClass000.A1X(pair.first);
            boolean A1X2 = AnonymousClass000.A1X(pair.second);
            CallGridViewModel callGridViewModel = ((C143926rL) r1).A00.A07;
            C18740tg.A06(callGridViewModel);
            C001700s r2 = callGridViewModel.A0O;
            C124545yN r12 = (C124545yN) C90524aI.A0c(r2);
            if (!(r12.A08 == A1X && r12.A07 == A1X2)) {
                r12.A07 = A1X2;
                r12.A08 = A1X;
                r2.A0D(r12);
            }
            pipViewContainer.A02 = null;
        }
    }

    public static void A03(PipViewContainer pipViewContainer, C129066Eu r4) {
        int i;
        C97034oI r1 = pipViewContainer.A04;
        if (r1 != null && r1.A0A()) {
            r1.A0B();
        }
        pipViewContainer.A04 = null;
        pipViewContainer.removeAllViews();
        C96104mn r2 = pipViewContainer.A03;
        boolean z = pipViewContainer.A0A;
        if (!r4.A0K || r4.A0A) {
            i = 7;
            if (z) {
                i = 8;
            }
        } else {
            i = 1;
        }
        C97034oI r12 = (C97034oI) r2.A05(pipViewContainer, i);
        pipViewContainer.A04 = r12;
        if (r12 instanceof AnonymousClass52X) {
            ((AnonymousClass52X) r12).A0I();
        }
        pipViewContainer.addView(pipViewContainer.A04.A0H, new ViewGroup.LayoutParams(-1, -1));
        pipViewContainer.A04.A0H(r4);
        C97034oI r13 = pipViewContainer.A04;
        if (r13 instanceof C1028152a) {
            r13.A0D(9);
        }
    }

    public static void A04(PipViewContainer pipViewContainer, boolean z) {
        C157237cd r0;
        C157247ce r02 = pipViewContainer.A05;
        if (r02 != null && (r0 = ((C143926rL) r02).A00.A04) != null) {
            VoipActivityV2 voipActivityV2 = ((C143916rK) r0).A00;
            voipActivityV2.A1w = z;
            if (z && voipActivityV2.A1a != null) {
                VoipActivityV2.A13(voipActivityV2);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public Rect getGlobalVisibleRect() {
        C97034oI r2 = this.A04;
        Rect A062 = AnonymousClass001.A06();
        if (r2 != null && r2.A0A()) {
            r2.A0H.getGlobalVisibleRect(A062);
        }
        return A062;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A07 = C36341k9.A0T(r1.A0M);
            this.A03 = (C96104mn) r1.A0L.A3c.get();
        }
        this.A0C = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0B = AnonymousClass000.A1Q(C113155f5.A00 ? 1 : 0);
        setOnTouchListener(new C135796dH(this));
    }

    public boolean getIsLandscapeVideo() {
        return this.A0A;
    }

    public C97034oI getPipViewHolder() {
        return this.A04;
    }

    public void setPipListener(C157247ce r1) {
        this.A05 = r1;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PipViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
