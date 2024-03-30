package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4oL  reason: invalid class name and case insensitive filesystem */
public class C97064oL extends RecyclerView implements C02410Ae {
    public static final int[] A05;
    public C011705b A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03;
    public final C02440Ai A04 = new C02440Ai();

    public C97064oL(Context context) {
        super(context, (AttributeSet) null);
    }

    private void A06(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        nestedScrollBy(i, i2);
        this.A03 = true;
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0UE) it.next()).A03(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A11(A05, iArr2, 0, scrollX2, 0, scrollY2, i3);
    }

    public void BbQ(View view, int i, int i2, int i3, int i4, int i5) {
        A06((int[]) null, i3, i4, i5);
    }

    public void Bhs(View view, int i) {
        setIsScrollEnabled(true);
        C02440Ai r0 = this.A04;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A03 = false;
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass0UE) it.next()).A03(this, 0);
                }
            }
        }
    }

    public void A0v(AnonymousClass0UE r2) {
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            this.A01 = arrayList;
        }
        arrayList.add(r2);
        super.A0v(r2);
    }

    public void A0w(AnonymousClass0UE r2) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(r2);
        }
        super.A0w(r2);
    }

    public void BbP(View view, int[] iArr, int i, int i2, int i3) {
        A15(iArr, A05, i, i2, i3);
    }

    public void BbS(View view, View view2, int i, int i2) {
        C02440Ai r1 = this.A04;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public int getNestedScrollAxes() {
        C02440Ai r0 = this.A04;
        return r0.A01 | r0.A00;
    }

    public int getScrollState() {
        if (this.A03) {
            return 1;
        }
        return this.A08;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A02 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A02 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A02;
        if (z2 != z) {
            this.A02 = z;
            if (z2) {
                this.A00 = C012005e.A05(this);
            }
            if (this.A02) {
                C012005e.A0V(this, this.A00);
                this.A00 = null;
                return;
            }
            C012005e.A0V(this, new C97094oQ(this, this));
        }
    }

    static {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 0;
        A1O[1] = 0;
        A05 = A1O;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A13((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A03 = false;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean BhH(View view, View view2, int i, int i2) {
        return false;
    }

    public void BbR(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A06(iArr, i3, i4, i5);
    }
}
