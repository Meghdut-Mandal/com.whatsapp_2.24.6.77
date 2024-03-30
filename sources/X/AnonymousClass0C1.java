package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.0C1  reason: invalid class name */
public class AnonymousClass0C1 implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final /* synthetic */ RecyclerView A06;

    public AnonymousClass0C1(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1B;
        this.A02 = interpolator;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        C011504z.A07(recyclerView, this);
    }

    public void A01(Interpolator interpolator, int i, int i2, int i3) {
        int height;
        int i4;
        Interpolator interpolator2 = interpolator;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i6);
            int abs2 = Math.abs(i7);
            boolean z = false;
            if (abs > abs2) {
                z = true;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = this.A06;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            float f = (float) height;
            float f2 = (float) (height / 2);
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            i5 = Math.min(i4, 2000);
        }
        if (interpolator == null) {
            interpolator2 = RecyclerView.A1B;
        }
        if (this.A02 != interpolator2) {
            this.A02 = interpolator2;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator2);
        }
        this.A01 = 0;
        this.A00 = 0;
        this.A06.setScrollState(2);
        this.A03.startScroll(0, 0, i6, i7, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A00();
    }

    public void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.A06;
        if (recyclerView.A0I == null) {
            recyclerView.removeCallbacks(this);
            this.A03.abortAnimation();
            return;
        }
        this.A05 = false;
        this.A04 = true;
        recyclerView.A0U();
        OverScroller overScroller = this.A03;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.A00;
            int i5 = currY - this.A01;
            this.A00 = currX;
            this.A01 = currY;
            int[] iArr = recyclerView.A0s;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.A15(iArr, (int[]) null, i4, i5, 1)) {
                i4 -= iArr[0];
                i5 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.A0k(i4, i5);
            }
            if (recyclerView.A0G != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.A0q(i4, iArr, i5);
                i = iArr[0];
                i2 = iArr[1];
                i4 -= i;
                i5 -= i2;
                AnonymousClass0V2 r6 = recyclerView.A0I.A06;
                if (r6 != null && !r6.A04 && r6.A05) {
                    int A002 = recyclerView.A0y.A00();
                    if (A002 == 0) {
                        r6.A01();
                    } else if (r6.A00 >= A002) {
                        r6.A00 = A002 - 1;
                        r6.A04(i, i2);
                    } else {
                        r6.A04(i, i2);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!recyclerView.A12.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            recyclerView.A11((int[]) null, iArr, i, i2, i4, i5, 1);
            int i6 = i4 - iArr[0];
            int i7 = i5 - iArr[1];
            if (!(i == 0 && i2 == 0)) {
                recyclerView.A0m(i, i2);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = false;
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            }
            boolean z3 = false;
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z3 = true;
            }
            if (overScroller.isFinished() || ((z2 || i6 != 0) && (z3 || i7 != 0))) {
                z = true;
            } else {
                z = false;
            }
            AnonymousClass0V2 r0 = recyclerView.A0I.A06;
            if ((r0 == null || !r0.A04) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = 0;
                        if (i6 > 0) {
                            i3 = currVelocity;
                        }
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i3 < 0) {
                        recyclerView.A0Y();
                        if (recyclerView.A0A.isFinished()) {
                            recyclerView.A0A.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView.A0Z();
                        if (recyclerView.A0B.isFinished()) {
                            recyclerView.A0B.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A0a();
                        if (recyclerView.A0C.isFinished()) {
                            recyclerView.A0C.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.A0X();
                        if (recyclerView.A09.isFinished()) {
                            recyclerView.A09.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i3 == 0 && currVelocity == 0)) {
                        C011504z.A05(recyclerView);
                    }
                }
                AnonymousClass0C3 r4 = recyclerView.A0F;
                int[] iArr2 = r4.A03;
                if (iArr2 != null) {
                    Arrays.fill(iArr2, -1);
                }
                r4.A00 = 0;
            } else {
                A00();
                AnonymousClass0CO r7 = recyclerView.A00;
                if (r7 != null) {
                    if (recyclerView.A0V && r7.A01 == 0) {
                        r7.A01 = System.nanoTime();
                        recyclerView.post(r7);
                    }
                    AnonymousClass0C3 r02 = recyclerView.A0F;
                    r02.A01 = i;
                    r02.A02 = i2;
                }
            }
        }
        AnonymousClass0V2 r1 = recyclerView.A0I.A06;
        if (r1 != null && r1.A04) {
            r1.A04(0, 0);
        }
        this.A04 = false;
        if (this.A05) {
            recyclerView.removeCallbacks(this);
            C011504z.A07(recyclerView, this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0j(1);
    }
}
