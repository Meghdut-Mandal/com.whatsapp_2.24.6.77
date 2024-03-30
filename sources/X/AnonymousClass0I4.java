package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.0I4  reason: invalid class name */
public class AnonymousClass0I4 extends C02910Cj implements C17060qe {
    public int A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07 = 0;
    public int A08 = -1;
    public int A09;
    public long A0A;
    public Rect A0B;
    public VelocityTracker A0C;
    public View A0D = null;
    public C06360Th A0E;
    public AnonymousClass0XI A0F;
    public AnonymousClass0EF A0G;
    public AnonymousClass0D3 A0H = null;
    public RecyclerView A0I;
    public List A0J;
    public List A0K = AnonymousClass001.A0I();
    public List A0L;
    public float A0M;
    public float A0N;
    public final Runnable A0O = new C11250fy(this);
    public final List A0P = AnonymousClass001.A0I();
    public final C17220qv A0Q = new C09960dR(this);
    public final float[] A0R = new float[2];

    public void BTV(View view) {
    }

    private int A00(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = 4;
        if (this.A01 > 0.0f) {
            i3 = 8;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A08 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A08);
            float yVelocity = this.A0C.getYVelocity(this.A08);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.A0N && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.A0I.getWidth()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A01) <= width) {
            return 0;
        }
        return i3;
    }

    private int A01(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = 1;
        if (this.A02 > 0.0f) {
            i3 = 2;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A08 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A08);
            float yVelocity = this.A0C.getYVelocity(this.A08);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.A0N && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.A0I.getHeight()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A02) <= height) {
            return 0;
        }
        return i3;
    }

    private void A02(float[] fArr) {
        float translationX;
        float translationY;
        if ((this.A00 & 12) != 0) {
            translationX = (this.A05 + this.A01) - ((float) this.A0H.A0H.getLeft());
        } else {
            translationX = this.A0H.A0H.getTranslationX();
        }
        fArr[0] = translationX;
        if ((this.A00 & 3) != 0) {
            translationY = (this.A06 + this.A02) - ((float) this.A0H.A0H.getTop());
        } else {
            translationY = this.A0H.A0H.getTranslationY();
        }
        fArr[1] = translationY;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r14, RecyclerView recyclerView) {
        float f;
        float f2;
        float A002;
        float A003;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AnonymousClass0D3 r6 = this.A0H;
        List list = this.A0K;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0ZB r1 = (AnonymousClass0ZB) list.get(i);
            float f3 = r1.A06;
            float f4 = r1.A08;
            if (f3 == f4) {
                A002 = r1.A0C.A0H.getTranslationX();
            } else {
                A002 = AnonymousClass001.A00(f4, f3, r1.A00);
            }
            r1.A01 = A002;
            float f5 = r1.A07;
            float f6 = r1.A09;
            if (f5 == f6) {
                A003 = r1.A0C.A0H.getTranslationY();
            } else {
                A003 = AnonymousClass001.A00(f6, f5, r1.A00);
            }
            r1.A02 = A003;
            int save = canvas.save();
            AnonymousClass0D3 r0 = r1.A0C;
            float f7 = r1.A01;
            float f8 = r1.A02;
            View view = r0.A0H;
            view.setTranslationX(f7);
            view.setTranslationY(f8);
            canvas.restoreToCount(save);
        }
        if (r6 != null) {
            int save2 = canvas.save();
            View view2 = r6.A0H;
            if (view2.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(C011004s.A00(view2));
                int childCount = recyclerView.getChildCount();
                float f9 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view2) {
                        float A004 = C011004s.A00(childAt);
                        if (A004 > f9) {
                            f9 = A004;
                        }
                    }
                }
                C011004s.A05(view2, f9 + 1.0f);
                view2.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view2.setTranslationX(f);
            view2.setTranslationY(f2);
            canvas.restoreToCount(save2);
        }
    }

    public void A04(Canvas canvas, AnonymousClass0C4 r8, RecyclerView recyclerView) {
        if (this.A0H != null) {
            A02(this.A0R);
        }
        AnonymousClass0D3 r5 = this.A0H;
        List list = this.A0K;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            list.get(i);
            canvas.restoreToCount(canvas.save());
        }
        if (r5 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AnonymousClass0ZB r1 = (AnonymousClass0ZB) list.get(i2);
            if (r1.A05 && !r1.A03) {
                list.remove(i2);
            } else if (!r1.A05) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void A07(MotionEvent motionEvent, int i, int i2) {
        View A062;
        AnonymousClass0D3 A0S;
        int A002;
        int i3;
        if (this.A0H == null && i == 2 && this.A07 != 2) {
            AnonymousClass0XI r4 = this.A0F;
            if (r4.A05()) {
                RecyclerView recyclerView = this.A0I;
                if (recyclerView.getScrollState() != 1) {
                    AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
                    int i4 = this.A08;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.A03);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.A04);
                        float f = (float) this.A09;
                        if (abs < f && abs2 < f) {
                            return;
                        }
                        if (abs > abs2 && layoutManager.A1N()) {
                            return;
                        }
                        if ((abs2 <= abs || !layoutManager.A1O()) && (A062 = A06(motionEvent)) != null && (A0S = this.A0I.A0S(A062)) != null && (A002 = (r4.A00(A0S, this.A0I) & 65280) >> 8) != 0) {
                            float x = motionEvent.getX(i2);
                            float y = motionEvent.getY(i2);
                            float f2 = x - this.A03;
                            float f3 = y - this.A04;
                            float abs3 = Math.abs(f2);
                            float abs4 = Math.abs(f3);
                            float f4 = (float) this.A09;
                            if (abs3 >= f4 || abs4 >= f4) {
                                if (abs3 > abs4) {
                                    if (f2 >= 0.0f || (A002 & 4) != 0) {
                                        if (f2 > 0.0f) {
                                            i3 = A002 & 8;
                                        }
                                        this.A02 = 0.0f;
                                        this.A01 = 0.0f;
                                        this.A08 = motionEvent.getPointerId(0);
                                        A0B(A0S, 1);
                                    }
                                    return;
                                } else if (f3 >= 0.0f || (A002 & 1) != 0) {
                                    if (f3 > 0.0f) {
                                        i3 = A002 & 2;
                                    }
                                    this.A02 = 0.0f;
                                    this.A01 = 0.0f;
                                    this.A08 = motionEvent.getPointerId(0);
                                    A0B(A0S, 1);
                                } else {
                                    return;
                                }
                                if (i3 == 0) {
                                    return;
                                }
                                this.A02 = 0.0f;
                                this.A01 = 0.0f;
                                this.A08 = motionEvent.getPointerId(0);
                                A0B(A0S, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A09(AnonymousClass0D3 r21) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (!this.A0I.isLayoutRequested() && this.A07 == 2) {
            int i4 = (int) (this.A05 + this.A01);
            int i5 = (int) (this.A06 + this.A02);
            AnonymousClass0D3 r19 = r21;
            View view = r19.A0H;
            if (((float) AnonymousClass000.A05(i5, view.getTop())) >= ((float) view.getHeight()) * 0.5f || ((float) AnonymousClass000.A05(i4, view.getLeft())) >= ((float) view.getWidth()) * 0.5f) {
                List list = this.A0L;
                if (list == null) {
                    this.A0L = AnonymousClass001.A0I();
                    this.A0J = AnonymousClass001.A0I();
                } else {
                    list.clear();
                    this.A0J.clear();
                }
                int round = Math.round(this.A05 + this.A01);
                int round2 = Math.round(this.A06 + this.A02);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                AnonymousClass0CP layoutManager = this.A0I.getLayoutManager();
                int A0L2 = layoutManager.A0L();
                for (int i8 = 0; i8 < A0L2; i8++) {
                    View A0R2 = layoutManager.A0R(i8);
                    if (A0R2 != view && A0R2.getBottom() >= round2 && A0R2.getTop() <= height && A0R2.getRight() >= round && A0R2.getLeft() <= width) {
                        AnonymousClass0D3 A0S = this.A0I.A0S(A0R2);
                        if (this.A0F.A07(this.A0H, A0S, this.A0I)) {
                            int A052 = AnonymousClass000.A05(i6, (A0R2.getLeft() + A0R2.getRight()) / 2);
                            int A053 = AnonymousClass000.A05(i7, (A0R2.getTop() + A0R2.getBottom()) / 2);
                            int i9 = (A052 * A052) + (A053 * A053);
                            int size = this.A0L.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < size && i9 > AnonymousClass000.A0I(this.A0J.get(i10))) {
                                i11++;
                                i10++;
                            }
                            this.A0L.add(i11, A0S);
                            this.A0J.add(i11, Integer.valueOf(i9));
                        }
                    }
                }
                List list2 = this.A0L;
                if (list2.size() != 0) {
                    int width2 = i4 + view.getWidth();
                    int height2 = i5 + view.getHeight();
                    int left2 = i4 - view.getLeft();
                    int top = i5 - view.getTop();
                    int size2 = list2.size();
                    AnonymousClass0D3 r6 = null;
                    int i12 = -1;
                    for (int i13 = 0; i13 < size2; i13++) {
                        AnonymousClass0D3 r7 = (AnonymousClass0D3) list2.get(i13);
                        if (left2 <= 0 ? !(left2 >= 0 || (left = r7.A0H.getLeft() - i4) <= 0 || r7.A0H.getLeft() >= view.getLeft()) : !((left = r7.A0H.getRight() - width2) >= 0 || r7.A0H.getRight() <= view.getRight())) {
                            int abs = Math.abs(left);
                            if (abs > i12) {
                                r6 = r7;
                                i12 = abs;
                            }
                        }
                        if (top >= 0 ? !(top <= 0 || (bottom = r7.A0H.getBottom() - height2) >= 0 || r7.A0H.getBottom() <= view.getBottom()) : !((bottom = r7.A0H.getTop() - i5) <= 0 || r7.A0H.getTop() >= view.getTop())) {
                            int abs2 = Math.abs(bottom);
                            if (abs2 > i12) {
                                r6 = r7;
                                i12 = abs2;
                            }
                        }
                    }
                    if (r6 == null) {
                        this.A0L.clear();
                        this.A0J.clear();
                        return;
                    }
                    int A042 = r6.A04();
                    r19.A04();
                    if (this.A0F.A08(r19, r6, this.A0I)) {
                        RecyclerView recyclerView = this.A0I;
                        AnonymousClass0CP layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof AnonymousClass0CR) {
                            View view2 = r6.A0H;
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((AnonymousClass0CR) layoutManager2);
                            linearLayoutManager.A1M("Cannot drop a view during a scroll or layout calculation");
                            linearLayoutManager.A1e();
                            LinearLayoutManager.A0E(linearLayoutManager);
                            int A022 = AnonymousClass0CP.A02(view);
                            int A023 = AnonymousClass0CP.A02(view2);
                            char c = 65535;
                            if (A022 < A023) {
                                c = 1;
                            }
                            boolean z = linearLayoutManager.A09;
                            AnonymousClass0CY r0 = linearLayoutManager.A05;
                            if (z) {
                                if (c == 1) {
                                    linearLayoutManager.A1g(A023, r0.A02() - (linearLayoutManager.A05.A09(view2) + linearLayoutManager.A05.A07(view)));
                                    return;
                                } else {
                                    i2 = r0.A02();
                                    i3 = linearLayoutManager.A05.A06(view2);
                                }
                            } else if (c == 65535) {
                                i = r0.A09(view2);
                                linearLayoutManager.A1g(A023, i);
                                return;
                            } else {
                                i2 = r0.A06(view2);
                                i3 = linearLayoutManager.A05.A07(view);
                            }
                            i = i2 - i3;
                            linearLayoutManager.A1g(A023, i);
                            return;
                        }
                        if (layoutManager2.A1N()) {
                            View view3 = r6.A0H;
                            if (view3.getLeft() - AnonymousClass0D2.A00(view3).left <= recyclerView.getPaddingLeft()) {
                                recyclerView.A0h(A042);
                            }
                            if (view3.getRight() + AnonymousClass0D2.A00(view3).right >= AnonymousClass000.A0B(recyclerView)) {
                                recyclerView.A0h(A042);
                            }
                        }
                        if (layoutManager2.A1O()) {
                            View view4 = r6.A0H;
                            if (view4.getTop() - AnonymousClass0D2.A00(view4).top <= recyclerView.getPaddingTop()) {
                                recyclerView.A0h(A042);
                            }
                            if (view4.getBottom() + AnonymousClass0D2.A00(view4).bottom >= AnonymousClass000.A0A(recyclerView)) {
                                recyclerView.A0h(A042);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0A(AnonymousClass0D3 r4) {
        String str;
        if (!AnonymousClass000.A1P(this.A0F.A00(r4, this.A0I) & 16711680)) {
            str = "Start drag has been called but dragging is not enabled";
        } else if (r4.A0H.getParent() != this.A0I) {
            str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
        } else {
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.A0C = VelocityTracker.obtain();
            this.A02 = 0.0f;
            this.A01 = 0.0f;
            A0B(r4, 2);
            return;
        }
        Log.e("ItemTouchHelper", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r1 > 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        if (r1 > 0) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass0D3 r27, int r28) {
        /*
            r26 = this;
            r5 = r26
            X.0D3 r0 = r5.A0H
            r7 = r27
            r6 = r28
            if (r7 != r0) goto L_0x000f
            int r0 = r5.A07
            if (r6 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r5.A0A = r0
            int r11 = r5.A07
            r4 = 1
            r5.A0C(r7, r4)
            r5.A07 = r6
            r3 = 2
            if (r6 != r3) goto L_0x0024
            if (r27 == 0) goto L_0x01ba
            android.view.View r0 = r7.A0H
            r5.A0D = r0
        L_0x0024:
            int r0 = r28 * 8
            r10 = 8
            int r0 = r0 + 8
            int r0 = r4 << r0
            int r15 = r0 + -1
            X.0D3 r8 = r5.A0H
            r2 = 0
            if (r8 == 0) goto L_0x00eb
            android.view.View r0 = r8.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01a8
            if (r11 == r3) goto L_0x01a5
            int r0 = r5.A07
            if (r0 == r3) goto L_0x01a5
            X.0XI r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r14 = r1.A01(r8, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r13 = X.AnonymousClass04F.A01(r0)
            r12 = r14
            r9 = 3158064(0x303030, float:4.42539E-39)
            r1 = r14 & r9
            if (r1 == 0) goto L_0x0067
            int r0 = ~r1
            r12 = r14 & r0
            if (r13 == 0) goto L_0x0064
            int r1 = r1 >> 1
            r0 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r0 = r0 & r1
            r12 = r12 | r0
            r1 = r1 & r9
        L_0x0064:
            int r0 = r1 >> 2
            r12 = r12 | r0
        L_0x0067:
            r0 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r0
            int r9 = r12 >> 8
            if (r9 == 0) goto L_0x01a5
            r14 = r14 & r0
            int r12 = r14 >> 8
            float r0 = r5.A01
            float r1 = java.lang.Math.abs(r0)
            float r0 = r5.A02
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0178
            int r1 = r5.A00(r9)
            if (r1 > 0) goto L_0x0184
            int r1 = r5.A01(r9)
            if (r1 <= 0) goto L_0x01a5
        L_0x008e:
            android.view.VelocityTracker r0 = r5.A0C
            if (r0 == 0) goto L_0x0098
            r0.recycle()
            r0 = 0
            r5.A0C = r0
        L_0x0098:
            r0 = 4
            if (r1 == r4) goto L_0x0165
            if (r1 == r3) goto L_0x0165
            if (r1 == r0) goto L_0x0154
            if (r1 == r10) goto L_0x0154
            r0 = 16
            if (r1 == r0) goto L_0x0154
            r0 = 32
            if (r1 == r0) goto L_0x0154
            r22 = 0
        L_0x00ab:
            r23 = 0
        L_0x00ad:
            if (r11 != r3) goto L_0x014e
            r0 = 8
        L_0x00b1:
            float[] r9 = r5.A0R
            r5.A02(r9)
            r20 = r9[r2]
            r21 = r9[r4]
            X.0ZB r9 = new X.0ZB
            r18 = r8
            r24 = r11
            r25 = r1
            r19 = r8
            r17 = r5
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.recyclerview.widget.RecyclerView r1 = r5.A0I
            X.0By r1 = r1.A0H
            if (r1 != 0) goto L_0x0142
            if (r0 != r10) goto L_0x013f
            r0 = 200(0xc8, double:9.9E-322)
        L_0x00d5:
            android.animation.ValueAnimator r8 = r9.A0B
            r8.setDuration(r0)
            java.util.List r0 = r5.A0K
            r0.add(r9)
            X.0D3 r0 = r9.A0C
            r0.A08(r2)
            r8.start()
            r2 = 1
        L_0x00e8:
            r0 = 0
            r5.A0H = r0
        L_0x00eb:
            if (r27 == 0) goto L_0x0115
            X.0XI r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r1 = r1.A00(r7, r0)
            r1 = r1 & r15
            int r0 = r5.A07
            int r0 = r0 * 8
            int r1 = r1 >> r0
            r5.A00 = r1
            android.view.View r1 = r7.A0H
            int r0 = r1.getLeft()
            float r0 = (float) r0
            r5.A05 = r0
            int r0 = r1.getTop()
            float r0 = (float) r0
            r5.A06 = r0
            r5.A0H = r7
            if (r6 != r3) goto L_0x0115
            r0 = 0
            r1.performHapticFeedback(r0)
        L_0x0115:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0126
            X.0D3 r0 = r5.A0H
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0126:
            if (r2 != 0) goto L_0x0130
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            X.0CP r0 = r0.getLayoutManager()
            r0.A0C = r4
        L_0x0130:
            X.0XI r2 = r5.A0F
            X.0D3 r1 = r5.A0H
            int r0 = r5.A07
            r2.A03(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r0.invalidate()
            return
        L_0x013f:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x00d5
        L_0x0142:
            if (r0 != r10) goto L_0x0149
            long r0 = r1.A08()
            goto L_0x00d5
        L_0x0149:
            long r0 = r1.A09()
            goto L_0x00d5
        L_0x014e:
            r0 = 4
            if (r1 <= 0) goto L_0x00b1
            r0 = 2
            goto L_0x00b1
        L_0x0154:
            float r0 = r5.A01
            float r22 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r22 = r22 * r0
            goto L_0x00ab
        L_0x0165:
            float r0 = r5.A02
            float r23 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r23 = r23 * r0
            r22 = 0
            goto L_0x00ad
        L_0x0178:
            int r1 = r5.A01(r9)
            if (r1 > 0) goto L_0x008e
            int r1 = r5.A00(r9)
            if (r1 <= 0) goto L_0x01a5
        L_0x0184:
            r12 = r12 & r1
            if (r12 != 0) goto L_0x008e
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r13 = X.AnonymousClass04F.A01(r0)
            r12 = 789516(0xc0c0c, float:1.106348E-39)
            r9 = r1 & r12
            if (r9 == 0) goto L_0x008e
            int r0 = ~r9
            r1 = r1 & r0
            if (r13 == 0) goto L_0x01a0
            int r9 = r9 << 1
            r0 = -789517(0xfffffffffff3f3f3, float:NaN)
            r0 = r0 & r9
            r1 = r1 | r0
            r9 = r9 & r12
        L_0x01a0:
            int r0 = r9 << 2
            r1 = r1 | r0
            goto L_0x008e
        L_0x01a5:
            r1 = 0
            goto L_0x008e
        L_0x01a8:
            android.view.View r1 = r8.A0H
            android.view.View r0 = r5.A0D
            if (r1 != r0) goto L_0x01b1
            r0 = 0
            r5.A0D = r0
        L_0x01b1:
            X.0XI r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r1.A04(r8, r0)
            goto L_0x00e8
        L_0x01ba:
            java.lang.String r0 = "Must pass a ViewHolder when dragging"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0I4.A0B(X.0D3, int):void");
    }

    public void A0C(AnonymousClass0D3 r5, boolean z) {
        AnonymousClass0ZB r1;
        List list = this.A0K;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                r1 = (AnonymousClass0ZB) list.get(size);
            } else {
                return;
            }
        } while (r1.A0C != r5);
        r1.A04 |= z;
        if (!r1.A05) {
            r1.A0B.cancel();
        }
        list.remove(size);
    }

    public void A0D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0I;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0u(this);
                RecyclerView recyclerView3 = this.A0I;
                C17220qv r1 = this.A0Q;
                recyclerView3.A13.remove(r1);
                if (recyclerView3.A0K == r1) {
                    recyclerView3.A0K = null;
                }
                List list = this.A0I.A0P;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0K;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.A0F.A04(((AnonymousClass0ZB) list2.get(0)).A0C, this.A0I);
                }
                list2.clear();
                this.A0D = null;
                VelocityTracker velocityTracker = this.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0C = null;
                }
                AnonymousClass0EF r2 = this.A0G;
                if (r2 != null) {
                    r2.A00 = false;
                    this.A0G = null;
                }
                if (this.A0E != null) {
                    this.A0E = null;
                }
            }
            this.A0I = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A0N = resources.getDimension(R.dimen.f7nameremoved);
                this.A0M = resources.getDimension(R.dimen.f7nameremoved);
                this.A09 = ViewConfiguration.get(this.A0I.getContext()).getScaledTouchSlop();
                this.A0I.A0t(this);
                RecyclerView recyclerView4 = this.A0I;
                recyclerView4.A13.add(this.A0Q);
                List list3 = recyclerView4.A0P;
                if (list3 == null) {
                    list3 = AnonymousClass001.A0I();
                    recyclerView4.A0P = list3;
                }
                list3.add(this);
                this.A0G = new AnonymousClass0EF(this);
                this.A0E = new C06360Th(this.A0I.getContext(), this.A0G);
            }
        }
    }

    public void BTW(View view) {
        if (view == this.A0D) {
            this.A0D = null;
        }
        AnonymousClass0D3 A0S = this.A0I.A0S(view);
        if (A0S != null) {
            AnonymousClass0D3 r0 = this.A0H;
            if (r0 == null || A0S != r0) {
                A0C(A0S, false);
                if (this.A0P.remove(A0S.A0H)) {
                    this.A0F.A04(A0S, this.A0I);
                    return;
                }
                return;
            }
            A0B((AnonymousClass0D3) null, 0);
        }
    }

    public AnonymousClass0I4(AnonymousClass0XI r3) {
        this.A0F = r3;
    }

    public View A06(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AnonymousClass0D3 r0 = this.A0H;
        if (r0 != null) {
            View view = r0.A0H;
            float f = this.A05 + this.A01;
            float f2 = this.A06 + this.A02;
            if (x >= f && x <= f + ((float) view.getWidth()) && y >= f2 && y <= f2 + ((float) view.getHeight())) {
                return view;
            }
        }
        List list = this.A0K;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A0I.A0O(x, y);
            }
            AnonymousClass0ZB r1 = (AnonymousClass0ZB) list.get(size);
            View view2 = r1.A0C.A0H;
            float f3 = r1.A01;
            float f4 = r1.A02;
            if (x >= f3 && x <= f3 + ((float) view2.getWidth()) && y >= f4 && y <= f4 + ((float) view2.getHeight())) {
                return view2;
            }
        }
    }

    public void A08(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A03;
        this.A01 = f;
        float f2 = y - this.A04;
        this.A02 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A01 = f;
        }
        if ((i & 8) == 0) {
            this.A01 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A02 = f2;
        }
        if ((i & 2) == 0) {
            this.A02 = Math.min(0.0f, f2);
        }
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r3, RecyclerView recyclerView) {
        rect.setEmpty();
    }
}
