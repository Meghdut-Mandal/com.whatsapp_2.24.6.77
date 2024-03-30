package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Xh  reason: invalid class name */
public class AnonymousClass6Xh {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public Scroller A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public final Runnable A0I = new AnonymousClass759((Object) this, 29);

    public static void A01(AnonymousClass6Xh r3, float f) {
        r3.A0A = true;
        r3.A0H.A01(r3.A08, f);
        r3.A0A = false;
        if (r3.A03 == 1) {
            r3.A09(0);
        }
    }

    public void A07() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public static void A02(AnonymousClass6Xh r7, float f, float f2, int i) {
        float[] fArr = r7.A0B;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = r7.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = r7.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = r7.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            r7.A0B = fArr2;
            fArr = fArr2;
            r7.A0C = fArr3;
            r7.A0D = fArr4;
            r7.A0E = fArr5;
        }
        r7.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = r7.A0C;
        r7.A0E[i] = f2;
        fArr9[i] = f2;
        r7.A05 |= 1 << i;
    }

    public static void A03(AnonymousClass6Xh r3, int i) {
        float[] fArr = r3.A0B;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            r3.A0C[i] = 0.0f;
            r3.A0D[i] = 0.0f;
            r3.A0E[i] = 0.0f;
            r3.A05 = (~(1 << i)) & r3.A05;
        }
    }

    public static void A04(AnonymousClass6Xh r13, int i, int i2) {
        int BG2;
        int BG22;
        int left = r13.A08.getLeft();
        int top = r13.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = r13.A0H;
        View view = r13.A08;
        C92414du r2 = ((C97544pr) viewDragHelper$Callback).A00;
        if (r2.A02 != null) {
            i2 = (int) (((float) i2) * 0.15f);
        }
        int i3 = top + i2;
        if (i != 0) {
            view.offsetLeftAndRight(-left);
        }
        if (i2 != 0) {
            View view2 = r13.A08;
            if (r2.A0B != null) {
                int height = r2.getHeight();
                AnonymousClass7eE r4 = null;
                AnonymousClass7eE r3 = null;
                for (AnonymousClass7eE r22 : r2.A0B) {
                    if (r4 == null) {
                        r4 = r22;
                    } else {
                        int BG23 = r22.BG2(view2, height);
                        if (BG23 >= r3.BG2(view2, height)) {
                            if (BG23 > r4.BG2(view2, height)) {
                                r4 = r22;
                            }
                        }
                    }
                    r3 = r22;
                }
                if (r4 == null) {
                    BG2 = i3;
                } else {
                    BG2 = r4.BG2(view2, height);
                }
                if (r3 == null) {
                    BG22 = i3;
                } else {
                    BG22 = r3.BG2(view2, height);
                }
                i3 = height - Math.max(BG22, Math.min(BG2, height - i3));
            }
            r13.A08.offsetTopAndBottom(i3 - top);
        }
        if (i != 0 || i2 != 0) {
            viewDragHelper$Callback.A00(r13.A08);
        }
    }

    public static boolean A05(AnonymousClass6Xh r14, int i, int i2, int i3) {
        int i4;
        int min;
        int i5 = i3;
        int left = r14.A08.getLeft();
        int top = r14.A08.getTop();
        int i6 = -left;
        int i7 = i - top;
        if (i6 == 0 && i7 == 0) {
            r14.A09.abortAnimation();
            r14.A09(0);
            return false;
        }
        if (i3 < 0) {
            int i8 = (int) r14.A01;
            int i9 = (int) r14.A00;
            int abs = Math.abs(i2);
            if (abs < i8) {
                i2 = 0;
            } else if (abs > i9) {
                if (i2 <= 0) {
                    i9 = -i9;
                }
                i2 = i9;
            }
            int abs2 = Math.abs(i6);
            int abs3 = Math.abs(i7);
            int i10 = abs2 + abs3;
            float f = 1.0f;
            if (i2 == 0) {
                f = ((float) abs3) / ((float) i10);
            }
            int height = ((C97544pr) r14.A0H).A00.getHeight();
            int width = r14.A0G.getWidth();
            if (i7 == 0) {
                min = 0;
            } else {
                float f2 = (float) abs3;
                float f3 = (float) (width / 2);
                float sin = f3 + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, f2 / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f3);
                int abs4 = Math.abs(i2);
                if (abs4 > 0) {
                    i4 = C90514aH.A06(Math.abs(sin / ((float) abs4)), 1000.0f) * 4;
                } else {
                    i4 = (int) (((f2 / ((float) height)) + 1.0f) * 256.0f);
                }
                min = Math.min(i4, 600);
            }
            i5 = (int) (((float) min) * f);
        }
        r14.A09.startScroll(left, top, i6, i7, i5);
        r14.A04 = top + i7;
        r14.A09(2);
        return true;
    }

    public View A06(int i, int i2) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A08() {
        Scroller scroller = this.A09;
        Scroller scroller2 = this.A0F;
        if (scroller != scroller2) {
            A07();
            if (this.A03 == 2) {
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A09.abortAnimation();
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A0H.A00(this.A08);
            }
            A09(0);
            this.A09 = scroller2;
        }
    }

    public void A09(int i) {
        AnonymousClass7eE r2;
        if (this.A03 != i) {
            this.A03 = i;
            C92414du r5 = ((C97544pr) this.A0H).A00;
            View view = r5.A01;
            if (view != null && C011304x.A03(view)) {
                List<C1267565j> list = r5.A0G;
                if (!list.isEmpty()) {
                    if (i == 0) {
                        List emptyList = Collections.emptyList();
                        View view2 = r5.A01;
                        if (view2 == null || !C011304x.A03(view2)) {
                            r2 = null;
                        } else {
                            int height = r5.getHeight();
                            r2 = C92414du.A00(view2, r5, emptyList, height - view2.getTop(), height);
                        }
                        r5.A04 = r2;
                        for (C1267565j A012 : list) {
                            A012.A01(r2);
                        }
                        this.A08 = null;
                    }
                    return;
                }
            }
            if (i != 0) {
                return;
            }
            this.A08 = null;
        }
    }

    public boolean A0A(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0G;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            A09(1);
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0u.append(viewGroup);
        throw AnonymousClass000.A0c(")", A0u);
    }

    public AnonymousClass6Xh(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A09 = scroller;
        this.A0F = scroller;
    }

    public static void A00(MotionEvent motionEvent, AnonymousClass6Xh r7) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & r7.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                r7.A0D[pointerId] = x;
                r7.A0E[pointerId] = y;
            }
        }
    }
}
