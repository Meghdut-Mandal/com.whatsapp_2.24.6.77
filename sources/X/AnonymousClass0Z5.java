package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: X.0Z5  reason: invalid class name */
public class AnonymousClass0Z5 {
    public static final Interpolator A0L = new C18600tQ(0);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public boolean A07;
    public float[] A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public int A0F = -1;
    public VelocityTracker A0G;
    public OverScroller A0H;
    public final ViewGroup A0I;
    public final AnonymousClass0V6 A0J;
    public final Runnable A0K = new C11200ft(this);

    private boolean A08(View view, float f, float f2) {
        float f3;
        int i;
        if (view == null) {
            return false;
        }
        AnonymousClass0V6 r2 = this.A0J;
        boolean A1R = AnonymousClass000.A1R(r2.A01(view));
        boolean A1R2 = AnonymousClass000.A1R(r2.A02(view));
        if (A1R) {
            if (A1R2) {
                int i2 = this.A05;
                i = (((f * f) + (f2 * f2)) > ((float) (i2 * i2)) ? 1 : (((f * f) + (f2 * f2)) == ((float) (i2 * i2)) ? 0 : -1));
            } else {
                f3 = Math.abs(f);
                i = (f3 > ((float) this.A05) ? 1 : (f3 == ((float) this.A05) ? 0 : -1));
            }
        } else if (!A1R2) {
            return false;
        } else {
            f3 = Math.abs(f2);
            i = (f3 > ((float) this.A05) ? 1 : (f3 == ((float) this.A05) ? 0 : -1));
        }
        return i > 0;
    }

    public void A0A() {
        this.A0F = -1;
        float[] fArr = this.A08;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A09, 0.0f);
            Arrays.fill(this.A0A, 0.0f);
            Arrays.fill(this.A0B, 0.0f);
            Arrays.fill(this.A0E, 0);
            Arrays.fill(this.A0C, 0);
            Arrays.fill(this.A0D, 0);
            this.A04 = 0;
        }
        VelocityTracker velocityTracker = this.A0G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0G = null;
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float abs = (float) Math.abs(i);
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((abs / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private void A02() {
        VelocityTracker velocityTracker = this.A0G;
        float f = this.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.A0G.getXVelocity(this.A0F);
        float f2 = this.A01;
        float f3 = f;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity <= 0.0f) {
                f3 = -f;
            }
            xVelocity = f3;
        }
        float yVelocity = this.A0G.getYVelocity(this.A0F);
        float f4 = this.A01;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            yVelocity = 0.0f;
        } else if (abs2 > f) {
            if (yVelocity <= 0.0f) {
                f = -f;
            }
            yVelocity = f;
        }
        this.A07 = true;
        this.A0J.A06(this.A06, xVelocity, yVelocity);
        this.A07 = false;
        if (this.A02 == 1) {
            A0B(0);
        }
    }

    private void A03(int i) {
        float[] fArr = this.A08;
        if (fArr != null) {
            int i2 = this.A04;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.A09[i] = 0.0f;
                this.A0A[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0E[i] = 0;
                this.A0C[i] = 0;
                this.A0D[i] = 0;
                this.A04 = (~i3) & i2;
            }
        }
    }

    private void A04(int i, float f, float f2) {
        float[] fArr = this.A08;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A09;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0A;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0B;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0E;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0C;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0D;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A08 = fArr2;
            fArr = fArr2;
            this.A09 = fArr3;
            this.A0A = fArr4;
            this.A0B = fArr5;
            this.A0E = iArr;
            this.A0C = iArr2;
            this.A0D = iArr3;
        }
        this.A0A[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A09;
        this.A0B[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0E;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0I;
        int left = viewGroup.getLeft();
        int i5 = this.A03;
        int A1T = AnonymousClass000.A1T(i3, left + i5);
        if (i4 < viewGroup.getTop() + i5) {
            A1T |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            A1T |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            A1T |= 8;
        }
        iArr7[i] = A1T;
        this.A04 |= 1 << i;
    }

    private boolean A06(int i) {
        if (((1 << i) & this.A04) != 0) {
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Ignoring pointerId=");
        A0u.append(i);
        Log.e("ViewDragHelper", AnonymousClass000.A0q(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.", A0u));
        return false;
    }

    private boolean A07(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int i5 = i3;
        int i6 = i4;
        int left = this.A06.getLeft();
        int top = this.A06.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            this.A0H.abortAnimation();
            A0B(0);
            return false;
        }
        View view = this.A06;
        int i9 = (int) this.A01;
        int i10 = (int) this.A00;
        int i11 = i10;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            if (i3 <= 0) {
                i11 = -i10;
            }
            i5 = i11;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i9) {
            i6 = 0;
        } else if (abs2 > i10) {
            if (i4 <= 0) {
                i10 = -i10;
            }
            i6 = i10;
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i5 != 0) {
            f = (float) abs5;
            f2 = (float) i12;
        } else {
            f = (float) abs3;
            f2 = (float) i13;
        }
        float f3 = f / f2;
        float f4 = (float) abs6;
        float f5 = (float) i12;
        if (i6 == 0) {
            f4 = (float) abs4;
            f5 = (float) i13;
        }
        AnonymousClass0V6 r2 = this.A0J;
        int A002 = A00(i7, i5, r2.A01(view));
        OverScroller overScroller = this.A0H;
        overScroller.startScroll(left, top, i7, i8, (int) ((((float) A002) * f3) + (((float) A00(i8, i6, r2.A02(view))) * (f4 / f5))));
        A0B(2);
        return true;
    }

    public View A09(int i, int i2) {
        ViewGroup viewGroup = this.A0I;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.A0J.A00(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A0B(int i) {
        this.A0I.removeCallbacks(this.A0K);
        if (this.A02 != i) {
            this.A02 = i;
            this.A0J.A05(i);
            if (this.A02 == 0) {
                this.A06 = null;
            }
        }
    }

    public boolean A0E(int i, int i2) {
        if (this.A07) {
            return A07(i, i2, (int) this.A0G.getXVelocity(this.A0F), (int) this.A0G.getYVelocity(this.A0F));
        }
        throw AnonymousClass001.A09("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean A0G(View view, int i) {
        if (view == this.A06 && this.A0F == i) {
            return true;
        }
        if (view == null || !this.A0J.A09(view, i)) {
            return false;
        }
        this.A0F = i;
        A0D(view, i);
        return true;
    }

    public boolean A0H(View view, int i, int i2) {
        this.A06 = view;
        this.A0F = -1;
        boolean A072 = A07(i, i2, 0, 0);
        if (!A072 && this.A02 == 0 && this.A06 != null) {
            this.A06 = null;
        }
        return A072;
    }

    public boolean A0I(boolean z) {
        if (this.A02 == 2) {
            OverScroller overScroller = this.A0H;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A06.getLeft();
            int top = currY - this.A06.getTop();
            if (left != 0) {
                C012005e.A0P(this.A06, left);
            }
            if (top != 0) {
                C012005e.A0Q(this.A06, top);
            }
            if (!(left == 0 && top == 0)) {
                this.A0J.A08(this.A06, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            if (z) {
                this.A0I.post(this.A0K);
            } else {
                A0B(0);
            }
        }
        if (this.A02 == 2) {
            return true;
        }
        return false;
    }

    public AnonymousClass0Z5(Context context, ViewGroup viewGroup, AnonymousClass0V6 r6) {
        if (r6 != null) {
            this.A0I = viewGroup;
            this.A0J = r6;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A03 = (int) ((AnonymousClass000.A0X(context).density * 20.0f) + 0.5f);
            this.A05 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A0H = new OverScroller(context, A0L);
            return;
        }
        throw AnonymousClass001.A08("Callback may not be null");
    }

    public static AnonymousClass0Z5 A01(ViewGroup viewGroup, AnonymousClass0V6 r3) {
        return new AnonymousClass0Z5(viewGroup.getContext(), viewGroup, r3);
    }

    private void A05(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A06(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0A[pointerId] = x;
                this.A0B[pointerId] = y;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r10.A0F == -1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r2 = r11.getActionMasked()
            int r1 = r11.getActionIndex()
            if (r2 != 0) goto L_0x000d
            r10.A0A()
        L_0x000d:
            android.view.VelocityTracker r0 = r10.A0G
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.A0G = r0
        L_0x0017:
            r0.addMovement(r11)
            r5 = 0
            if (r2 == 0) goto L_0x0181
            r3 = 1
            if (r2 == r3) goto L_0x015e
            r0 = 2
            if (r2 == r0) goto L_0x00a9
            r0 = 3
            if (r2 == r0) goto L_0x0166
            r0 = 5
            if (r2 == r0) goto L_0x006d
            r0 = 6
            if (r2 != r0) goto L_0x0069
            int r4 = r11.getPointerId(r1)
            int r0 = r10.A02
            if (r0 != r3) goto L_0x0066
            int r0 = r10.A0F
            if (r4 != r0) goto L_0x0066
            int r6 = r11.getPointerCount()
        L_0x003c:
            r3 = -1
            if (r5 >= r6) goto L_0x0063
            int r2 = r11.getPointerId(r5)
            int r0 = r10.A0F
            if (r2 == r0) goto L_0x006a
            float r1 = r11.getX(r5)
            float r0 = r11.getY(r5)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r10.A09(r1, r0)
            android.view.View r0 = r10.A06
            if (r1 != r0) goto L_0x006a
            boolean r0 = r10.A0G(r0, r2)
            if (r0 == 0) goto L_0x006a
            int r0 = r10.A0F
            if (r0 != r3) goto L_0x0066
        L_0x0063:
            r10.A02()
        L_0x0066:
            r10.A03(r4)
        L_0x0069:
            return
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x006d:
            int r4 = r11.getPointerId(r1)
            float r2 = r11.getX(r1)
            float r1 = r11.getY(r1)
            r10.A04(r4, r2, r1)
            int r0 = r10.A02
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x008a
            android.view.View r0 = r10.A09(r3, r2)
        L_0x0086:
            r10.A0G(r0, r4)
            return
        L_0x008a:
            android.view.View r1 = r10.A06
            if (r1 == 0) goto L_0x0069
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x0069
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x0069
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x0069
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x0069
            android.view.View r0 = r10.A06
            goto L_0x0086
        L_0x00a9:
            int r0 = r10.A02
            if (r0 != r3) goto L_0x0120
            int r0 = r10.A0F
            boolean r0 = r10.A06(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r10.A0F
            int r0 = r11.findPointerIndex(r0)
            float r3 = r11.getX(r0)
            float r2 = r11.getY(r0)
            float[] r0 = r10.A0A
            int r1 = r10.A0F
            r0 = r0[r1]
            float r3 = r3 - r0
            int r4 = (int) r3
            float[] r0 = r10.A0B
            r0 = r0[r1]
            float r2 = r2 - r0
            int r3 = (int) r2
            android.view.View r0 = r10.A06
            int r6 = r0.getLeft()
            int r6 = r6 + r4
            android.view.View r0 = r10.A06
            int r7 = r0.getTop()
            int r7 = r7 + r3
            android.view.View r0 = r10.A06
            int r5 = r0.getLeft()
            android.view.View r0 = r10.A06
            int r2 = r0.getTop()
            if (r4 == 0) goto L_0x00fc
            X.0V6 r1 = r10.A0J
            android.view.View r0 = r10.A06
            int r6 = r1.A03(r0, r6, r4)
            android.view.View r1 = r10.A06
            int r0 = r6 - r5
            X.C012005e.A0P(r1, r0)
        L_0x00fc:
            if (r3 == 0) goto L_0x010d
            X.0V6 r1 = r10.A0J
            android.view.View r0 = r10.A06
            int r7 = r1.A04(r0, r7, r3)
            android.view.View r1 = r10.A06
            int r0 = r7 - r2
            X.C012005e.A0Q(r1, r0)
        L_0x010d:
            if (r4 != 0) goto L_0x0111
            if (r3 == 0) goto L_0x011c
        L_0x0111:
            int r8 = r6 - r5
            int r9 = r7 - r2
            X.0V6 r4 = r10.A0J
            android.view.View r5 = r10.A06
            r4.A08(r5, r6, r7, r8, r9)
        L_0x011c:
            r10.A05(r11)
            return
        L_0x0120:
            int r6 = r11.getPointerCount()
        L_0x0124:
            if (r5 >= r6) goto L_0x011c
            int r7 = r11.getPointerId(r5)
            boolean r0 = r10.A06(r7)
            if (r0 == 0) goto L_0x015b
            float r1 = r11.getX(r5)
            float r8 = r11.getY(r5)
            float[] r0 = r10.A08
            r0 = r0[r7]
            float r4 = r1 - r0
            float[] r0 = r10.A09
            r0 = r0[r7]
            float r2 = r8 - r0
            int r0 = r10.A02
            if (r0 == r3) goto L_0x011c
            int r1 = (int) r1
            int r0 = (int) r8
            android.view.View r1 = r10.A09(r1, r0)
            boolean r0 = r10.A08(r1, r4, r2)
            if (r0 == 0) goto L_0x015b
            boolean r0 = r10.A0G(r1, r7)
            if (r0 == 0) goto L_0x015b
            goto L_0x011c
        L_0x015b:
            int r5 = r5 + 1
            goto L_0x0124
        L_0x015e:
            int r0 = r10.A02
            if (r0 != r3) goto L_0x017d
            r10.A02()
            goto L_0x017d
        L_0x0166:
            int r0 = r10.A02
            if (r0 != r3) goto L_0x017d
            r2 = 0
            r10.A07 = r3
            X.0V6 r1 = r10.A0J
            android.view.View r0 = r10.A06
            r1.A06(r0, r2, r2)
            r10.A07 = r5
            int r0 = r10.A02
            if (r0 != r3) goto L_0x017d
            r10.A0B(r5)
        L_0x017d:
            r10.A0A()
            return
        L_0x0181:
            float r4 = r11.getX()
            float r3 = r11.getY()
            int r2 = r11.getPointerId(r5)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r10.A09(r1, r0)
            r10.A04(r2, r4, r3)
            r10.A0G(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z5.A0C(android.view.MotionEvent):void");
    }

    public void A0D(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent == viewGroup) {
            this.A06 = view;
            this.A0F = i;
            this.A0J.A07(view, i);
            A0B(1);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0u.append(viewGroup);
        throw AnonymousClass000.A0c(")", A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (r5 != r11) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r1 = r14.getActionMasked()
            int r2 = r14.getActionIndex()
            if (r1 != 0) goto L_0x000d
            r13.A0A()
        L_0x000d:
            android.view.VelocityTracker r0 = r13.A0G
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0G = r0
        L_0x0017:
            r0.addMovement(r14)
            r5 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00df
            if (r1 == r3) goto L_0x00da
            if (r1 == r5) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x00da
            r0 = 5
            if (r1 == r0) goto L_0x0039
            r0 = 6
            if (r1 != r0) goto L_0x0032
            int r0 = r14.getPointerId(r2)
            r13.A03(r0)
        L_0x0032:
            r4 = 0
        L_0x0033:
            int r0 = r13.A02
            if (r0 != r3) goto L_0x0038
            r4 = 1
        L_0x0038:
            return r4
        L_0x0039:
            int r4 = r14.getPointerId(r2)
            float r1 = r14.getX(r2)
            float r2 = r14.getY(r2)
            r13.A04(r4, r1, r2)
            int r0 = r13.A02
            if (r0 == 0) goto L_0x0032
            if (r0 != r5) goto L_0x0032
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r1 = r13.A09(r1, r0)
            android.view.View r0 = r13.A06
            if (r1 != r0) goto L_0x0032
            r13.A0G(r1, r4)
            goto L_0x0032
        L_0x005c:
            float[] r0 = r13.A08
            if (r0 == 0) goto L_0x0032
            float[] r0 = r13.A09
            if (r0 == 0) goto L_0x0032
            int r9 = r14.getPointerCount()
            r8 = 0
        L_0x0069:
            if (r8 >= r9) goto L_0x00c4
            int r10 = r14.getPointerId(r8)
            boolean r0 = r13.A06(r10)
            if (r0 == 0) goto L_0x00d7
            float r1 = r14.getX(r8)
            float r5 = r14.getY(r8)
            float[] r0 = r13.A08
            r0 = r0[r10]
            float r4 = r1 - r0
            float[] r0 = r13.A09
            r0 = r0[r10]
            float r2 = r5 - r0
            int r1 = (int) r1
            int r0 = (int) r5
            android.view.View r7 = r13.A09(r1, r0)
            if (r7 == 0) goto L_0x00c9
            boolean r0 = r13.A08(r7, r4, r2)
            if (r0 == 0) goto L_0x00c9
            r12 = 1
            int r11 = r7.getLeft()
            int r1 = (int) r4
            int r0 = r11 + r1
            X.0V6 r6 = r13.A0J
            int r5 = r6.A03(r7, r0, r1)
            int r4 = r7.getTop()
            int r1 = (int) r2
            int r0 = r4 + r1
            int r2 = r6.A04(r7, r0, r1)
            int r1 = r6.A01(r7)
            int r0 = r6.A02(r7)
            if (r1 == 0) goto L_0x00be
            if (r1 <= 0) goto L_0x00ca
            if (r5 != r11) goto L_0x00ca
        L_0x00be:
            if (r0 == 0) goto L_0x00c4
            if (r0 <= 0) goto L_0x00ca
            if (r2 != r4) goto L_0x00ca
        L_0x00c4:
            r13.A05(r14)
            goto L_0x0032
        L_0x00c9:
            r12 = 0
        L_0x00ca:
            int r0 = r13.A02
            if (r0 == r3) goto L_0x00c4
            if (r12 == 0) goto L_0x00d7
            boolean r0 = r13.A0G(r7, r10)
            if (r0 == 0) goto L_0x00d7
            goto L_0x00c4
        L_0x00d7:
            int r8 = r8 + 1
            goto L_0x0069
        L_0x00da:
            r13.A0A()
            goto L_0x0032
        L_0x00df:
            float r1 = r14.getX()
            float r0 = r14.getY()
            r4 = 0
            int r2 = r14.getPointerId(r4)
            r13.A04(r2, r1, r0)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r13.A09(r1, r0)
            android.view.View r0 = r13.A06
            if (r1 != r0) goto L_0x0033
            int r0 = r13.A02
            if (r0 != r5) goto L_0x0033
            r13.A0G(r1, r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z5.A0F(android.view.MotionEvent):boolean");
    }
}
