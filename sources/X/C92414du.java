package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4du  reason: invalid class name and case insensitive filesystem */
public final class C92414du extends ViewGroup {
    public int A00 = -1;
    public View A01;
    public AnonymousClass6I4 A02;
    public C114515hN A03;
    public AnonymousClass7eE A04;
    public AnonymousClass6Xh A05;
    public List A06;
    public boolean A07 = true;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A = true;
    public AnonymousClass7eE[] A0B;
    public int A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = true;
    public final List A0G = new CopyOnWriteArrayList();
    public final C02440Ai A0H = new C02440Ai();
    public final boolean A0I = true;

    public C92414du(Context context) {
        super(context);
        C97544pr r2 = new C97544pr(this);
        if (this.A05 == null) {
            this.A05 = new AnonymousClass6Xh(getContext(), this, r2);
        }
    }

    public void A03(AnonymousClass7eE r10, int i, boolean z) {
        View view = this.A01;
        if (view != null) {
            this.A04 = r10;
            AnonymousClass757 r3 = new AnonymousClass757(view, this, i, 0, z);
            if (C011304x.A03(this)) {
                r3.run();
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C164767sL(this, viewTreeObserver, r3, 1));
        }
    }

    public void A04(AnonymousClass7eE[] r5, boolean z) {
        this.A0B = (AnonymousClass7eE[]) Arrays.copyOf(r5, r5.length);
        AnonymousClass7eE r2 = this.A04;
        if (r2 != null) {
            if (this.A01 == null) {
                this.A04 = null;
                r2 = null;
            } else {
                int height = getHeight();
                List emptyList = Collections.emptyList();
                View view = this.A01;
                r2 = A00(view, this, emptyList, this.A04.BG2(view, height), height);
                this.A04 = r2;
            }
        }
        if (z) {
            if (r2 == null) {
                List emptyList2 = Collections.emptyList();
                View view2 = this.A01;
                if (view2 != null && C011304x.A03(view2)) {
                    int height2 = getHeight();
                    r2 = A00(view2, this, emptyList2, height2 - view2.getTop(), height2);
                    if (r2 == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A03(r2, this.A00, false);
        }
    }

    public static AnonymousClass7eE A00(View view, C92414du r8, List list, int i, int i2) {
        int A052;
        AnonymousClass7eE[] r6 = r8.A0B;
        AnonymousClass7eE r5 = null;
        if (!(r6 == null || view == null)) {
            int i3 = Integer.MAX_VALUE;
            for (AnonymousClass7eE r1 : r6) {
                if (!list.contains(r1) && (A052 = AnonymousClass000.A05(r1.BG2(view, i2), i)) < i3) {
                    r5 = r1;
                    i3 = A052;
                }
            }
        }
        return r5;
    }

    public static void A01(AnonymousClass6Xh r6) {
        VelocityTracker velocityTracker = r6.A07;
        float f = r6.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = r6.A07.getXVelocity(r6.A02);
        float f2 = r6.A01;
        float abs = Math.abs(xVelocity);
        if (abs >= f2) {
            int i = (abs > f ? 1 : (abs == f ? 0 : -1));
        }
        float yVelocity = r6.A07.getYVelocity(r6.A02);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        AnonymousClass6Xh.A01(r6, f);
    }

    private boolean A02(int i, int i2) {
        int i3;
        View view = this.A01;
        if (getNestedScrollAxes() == 1) {
            if (i2 == 0 || ((float) (Math.abs(i) / Math.abs(i2))) > 0.7f) {
                return false;
            }
        } else if (view == null) {
            return false;
        } else {
            int height = getHeight();
            AnonymousClass7eE[] r1 = this.A0B;
            if (r1 == null || r1.length <= 0) {
                i3 = 0;
            } else {
                i3 = height - r1[0].BG2(view, height);
                int length = this.A0B.length;
                for (int i4 = 1; i4 < length; i4++) {
                    i3 = Math.min(i3, height - this.A0B[i4].BG2(view, height));
                }
            }
            if (view.getBottom() <= height || view.getTop() <= i3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r3.A09.isFinished() == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r6 = this;
            X.6Xh r3 = r6.A05
            int r0 = r3.A03
            r2 = 2
            if (r0 != r2) goto L_0x0057
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x005e
            android.widget.Scroller r0 = r3.A09
            boolean r5 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A09
            int r4 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r0 = r4 - r0
            if (r0 <= 0) goto L_0x005f
            int r0 = r3.A04
            int r4 = java.lang.Math.min(r4, r0)
        L_0x0027:
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r1 = r4 - r0
            if (r1 == 0) goto L_0x003d
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r1)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r1 = r3.A0H
            android.view.View r0 = r3.A08
            r1.A00(r0)
        L_0x003d:
            if (r5 == 0) goto L_0x0050
            int r0 = r3.A04
            if (r4 != r0) goto L_0x0057
            android.widget.Scroller r0 = r3.A09
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A09
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L_0x0057:
            int r0 = r3.A03
            if (r0 != r2) goto L_0x005e
            X.C011504z.A05(r6)
        L_0x005e:
            return
        L_0x005f:
            if (r0 >= 0) goto L_0x0027
            int r0 = r3.A04
            int r4 = java.lang.Math.max(r4, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92414du.computeScroll():void");
    }

    public int getNestedScrollAxes() {
        C02440Ai r0 = this.A0H;
        return r0.A01 | r0.A00;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View A062;
        if (this.A0A) {
            if (this.A0E || !this.A07) {
                return false;
            }
            AnonymousClass6Xh r3 = this.A05;
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                r3.A07();
            }
            VelocityTracker velocityTracker = r3.A07;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                r3.A07 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (r3.A0B == null || r3.A0C == null) {
                            AnonymousClass6Xh.A02(r3, motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerId(0));
                        }
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 0; i < pointerCount; i++) {
                            int pointerId = motionEvent.getPointerId(i);
                            if (((1 << pointerId) & r3.A05) != 0) {
                                motionEvent.getX(i);
                                float y = motionEvent.getY(i);
                                float[] fArr = r3.A0B;
                                float[] fArr2 = r3.A0C;
                                float f = y - fArr2[pointerId];
                                if (r3.A03 != 1) {
                                    View A063 = r3.A06((int) fArr[pointerId], (int) fArr2[pointerId]);
                                    if (A063 != null && ((C97544pr) r3.A0H).A00.getHeight() > 0 && Math.abs(f) > ((float) r3.A06) && r3.A0A(A063, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        AnonymousClass6Xh.A00(motionEvent, r3);
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId2 = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            AnonymousClass6Xh.A02(r3, x, y2, pointerId2);
                            if (r3.A03 == 2 && (A062 = r3.A06((int) x, (int) y2)) == r3.A08) {
                                r3.A0A(A062, pointerId2);
                            }
                        } else if (actionMasked == 6) {
                            AnonymousClass6Xh.A03(r3, motionEvent.getPointerId(actionIndex));
                        }
                    }
                }
                r3.A07();
            } else {
                float x2 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int pointerId3 = motionEvent.getPointerId(0);
                AnonymousClass6Xh.A02(r3, x2, y3, pointerId3);
                View A064 = r3.A06((int) x2, (int) y3);
                if (A064 == r3.A08 && r3.A03 == 2) {
                    r3.A0A(A064, pointerId3);
                }
            }
            if (r3.A03 == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        AnonymousClass7eE r1;
        View view = this.A01;
        if (view != null) {
            if (!this.A0F) {
                height = view.getTop();
            } else {
                height = getHeight();
            }
            int measuredHeight = view.getMeasuredHeight() + height;
            if (this.A0I) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, height, getWidth(), measuredHeight);
            boolean A1U = C36381kD.A1U(view.getMeasuredHeight(), this.A0C);
            this.A0C = view.getMeasuredHeight();
            if ((z || A1U) && (r1 = this.A04) != null) {
                A03(r1, this.A00, false);
            }
            List<C1267565j> list = this.A0G;
            if (!list.isEmpty()) {
                for (C1267565j A002 : list) {
                    A002.A00(view, getHeight());
                }
            }
            this.A0F = false;
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A07 || z) {
            return false;
        }
        AnonymousClass6Xh r4 = this.A05;
        View view2 = this.A01;
        r4.A08 = view2;
        r4.A0A = true;
        r4.A0H.A01(view2, -f2);
        r4.A0A = false;
        if (r4.A03 != 1) {
            return true;
        }
        r4.A09(0);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A07 || !A02((int) f, (int) f2)) {
            return false;
        }
        AnonymousClass6Xh r4 = this.A05;
        View view2 = this.A01;
        r4.A08 = view2;
        r4.A0A = true;
        r4.A0H.A01(view2, -f2);
        r4.A0A = false;
        if (r4.A03 != 1) {
            return true;
        }
        r4.A09(0);
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A07 && A02(i, i2)) {
            AnonymousClass6Xh r5 = this.A05;
            int i3 = -i;
            int i4 = -i2;
            View view2 = r5.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = r5.A08.getTop() + i4;
                AnonymousClass6Xh.A04(r5, i3, i4);
                View view3 = r5.A08;
                if (!(view3 == null || iArr == null)) {
                    iArr[0] = (left - view3.getLeft()) - i3;
                    iArr[1] = (top - r5.A08.getTop()) - i4;
                }
            }
            if (getNestedScrollAxes() == 1 && iArr[1] != 0) {
                iArr[0] = i;
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A07) {
            AnonymousClass6Xh r3 = this.A05;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = r3.A08;
            if (view2 != null) {
                view2.getLeft();
                r3.A08.getTop();
                AnonymousClass6Xh.A04(r3, i5, i6);
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0H.A01 = i;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0E) {
            z = true;
            this.A0E = true;
            AnonymousClass6Xh r2 = this.A05;
            View view3 = this.A01;
            if (r2.A07 == null) {
                r2.A07 = VelocityTracker.obtain();
            }
            r2.A09(1);
            r2.A08 = view3;
        }
        return z;
    }

    public void onStopNestedScroll(View view) {
        this.A0H.A01 = 0;
        this.A0E = false;
        AnonymousClass6Xh r2 = this.A05;
        r2.A08 = this.A01;
        if (r2.A03 != 2) {
            AnonymousClass6Xh.A01(r2, 0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r5.A02 == -1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r2 > ((float) r6.getBottom())) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bc, code lost:
        if (r1 != 3) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0A
            r7 = 1
            if (r0 == 0) goto L_0x01ec
            android.view.View r6 = r10.A01
            if (r6 != 0) goto L_0x000c
            boolean r0 = r10.A08
            return r0
        L_0x000c:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x007a
            X.6Xh r5 = r10.A05
            int r4 = r11.getActionMasked()
            int r1 = r11.getActionIndex()
            if (r4 != 0) goto L_0x001f
            r5.A07()
        L_0x001f:
            android.view.VelocityTracker r0 = r5.A07
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.A07 = r0
        L_0x0029:
            r0.addMovement(r11)
            r2 = 0
            if (r4 == 0) goto L_0x01d2
            if (r4 == r7) goto L_0x01c6
            r0 = 2
            r3 = -1
            if (r4 == r0) goto L_0x0132
            r0 = 3
            if (r4 == r0) goto L_0x0128
            r0 = 5
            if (r4 == r0) goto L_0x00eb
            r0 = 6
            if (r4 != r0) goto L_0x007a
            int r4 = r11.getPointerId(r1)
            int r0 = r5.A03
            if (r0 != r7) goto L_0x0077
            int r0 = r5.A02
            if (r4 != r0) goto L_0x0077
            int r8 = r11.getPointerCount()
        L_0x004e:
            if (r2 >= r8) goto L_0x0074
            int r9 = r11.getPointerId(r2)
            int r0 = r5.A02
            if (r9 == r0) goto L_0x00e7
            float r1 = r11.getX(r2)
            float r0 = r11.getY(r2)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r5.A06(r1, r0)
            android.view.View r0 = r5.A08
            if (r1 != r0) goto L_0x00e7
            boolean r0 = r5.A0A(r0, r9)
            if (r0 == 0) goto L_0x00e7
            int r0 = r5.A02
            if (r0 != r3) goto L_0x0077
        L_0x0074:
            A01(r5)
        L_0x0077:
            X.AnonymousClass6Xh.A03(r5, r4)
        L_0x007a:
            float r0 = r11.getX()
            int r2 = java.lang.Math.round(r0)
            float r0 = r11.getY()
            int r0 = java.lang.Math.round(r0)
            int r1 = r11.getActionMasked()
            float r3 = (float) r2
            float r2 = (float) r0
            int r0 = r6.getLeft()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            int r0 = r6.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b5
            int r0 = r6.getTop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            int r0 = r6.getBottom()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            r2 = 0
            if (r1 == 0) goto L_0x00e2
            if (r1 == r7) goto L_0x00c6
            r0 = 3
            if (r1 == r0) goto L_0x00df
        L_0x00be:
            if (r3 != 0) goto L_0x01ec
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x01ec
            r7 = 0
            return r7
        L_0x00c6:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            X.5hN r0 = r10.A03
            if (r0 == 0) goto L_0x00df
            X.4aa r1 = r0.A00
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00df
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x00df
            java.lang.Integer r0 = X.C023109s.A0C
            r1.A04(r0)
        L_0x00df:
            r10.A0D = r2
            goto L_0x00be
        L_0x00e2:
            r0 = r3 ^ 1
            r10.A0D = r0
            goto L_0x00be
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x004e
        L_0x00eb:
            int r4 = r11.getPointerId(r1)
            float r2 = r11.getX(r1)
            float r1 = r11.getY(r1)
            X.AnonymousClass6Xh.A02(r5, r2, r1, r4)
            int r0 = r5.A03
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x0109
            android.view.View r0 = r5.A06(r3, r2)
        L_0x0104:
            r5.A0A(r0, r4)
            goto L_0x007a
        L_0x0109:
            android.view.View r1 = r5.A08
            if (r1 == 0) goto L_0x007a
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x007a
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x007a
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x007a
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x007a
            android.view.View r0 = r5.A08
            goto L_0x0104
        L_0x0128:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x01cd
            r0 = 0
            X.AnonymousClass6Xh.A01(r5, r0)
            goto L_0x01cd
        L_0x0132:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x0163
            int r2 = r5.A02
            int r1 = r5.A05
            int r0 = r7 << r2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x007a
            int r0 = r11.findPointerIndex(r2)
            if (r0 == r3) goto L_0x007a
            float r1 = r11.getX(r0)
            float r3 = r11.getY(r0)
            float[] r0 = r5.A0D
            int r2 = r5.A02
            r0 = r0[r2]
            float r1 = r1 - r0
            int r1 = (int) r1
            float[] r0 = r5.A0E
            r0 = r0[r2]
            float r3 = r3 - r0
            int r0 = (int) r3
            X.AnonymousClass6Xh.A04(r5, r1, r0)
        L_0x015e:
            X.AnonymousClass6Xh.A00(r11, r5)
            goto L_0x007a
        L_0x0163:
            float[] r0 = r5.A0B
            if (r0 == 0) goto L_0x016b
            float[] r0 = r5.A0C
            if (r0 != 0) goto L_0x017a
        L_0x016b:
            float r3 = r11.getX()
            float r1 = r11.getY()
            int r0 = r11.getPointerId(r2)
            X.AnonymousClass6Xh.A02(r5, r3, r1, r0)
        L_0x017a:
            int r4 = r11.getPointerCount()
        L_0x017e:
            if (r2 >= r4) goto L_0x015e
            int r8 = r11.getPointerId(r2)
            int r1 = r5.A05
            int r0 = r7 << r8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01c3
            float r1 = r11.getX(r2)
            float r3 = r11.getY(r2)
            float[] r0 = r5.A0C
            r0 = r0[r8]
            float r9 = r3 - r0
            int r0 = r5.A03
            if (r0 == r7) goto L_0x015e
            int r1 = (int) r1
            int r0 = (int) r3
            android.view.View r3 = r5.A06(r1, r0)
            if (r3 == 0) goto L_0x01c3
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r0 = r5.A0H
            X.4pr r0 = (X.C97544pr) r0
            X.4du r0 = r0.A00
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x01c3
            float r1 = java.lang.Math.abs(r9)
            int r0 = r5.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c3
            boolean r0 = r5.A0A(r3, r8)
            if (r0 == 0) goto L_0x01c3
            goto L_0x015e
        L_0x01c3:
            int r2 = r2 + 1
            goto L_0x017e
        L_0x01c6:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x01cd
            A01(r5)
        L_0x01cd:
            r5.A07()
            goto L_0x007a
        L_0x01d2:
            float r4 = r11.getX()
            float r3 = r11.getY()
            int r2 = r11.getPointerId(r2)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r5.A06(r1, r0)
            X.AnonymousClass6Xh.A02(r5, r4, r3, r2)
            r5.A0A(r0, r2)
            goto L_0x007a
        L_0x01ec:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92414du.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setInteractable(boolean z) {
        this.A0A = z;
        if (!z) {
            this.A05.A07();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            if (this.A0C > 0) {
                view.setTop(getHeight() - this.A0C);
            }
            this.A0C = 0;
            super.addView(view, i, layoutParams);
            this.A01 = view;
            return;
        }
        throw AnonymousClass001.A09("BloksSlidingViewGroup only supports a single child");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A09) {
            View view = this.A01;
            if (this.A0B == null || view == null) {
                i3 = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (AnonymousClass7eE BG2 : this.A0B) {
                    i3 = Math.max(i3, BG2.BG2(view, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }
}
