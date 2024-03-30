package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0By  reason: invalid class name and case insensitive filesystem */
public abstract class C02800By {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public AnonymousClass0C5 A04 = null;
    public ArrayList A05 = new ArrayList();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(AnonymousClass0D3 r1);

    public abstract boolean A0D();

    public boolean A0E(AnonymousClass0D3 r3, List list) {
        if (!((C02810Bz) this).A00 || (r3.A00 & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void A05() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("onAnimationsFinished");
        } else {
            arrayList.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass0D3 r8) {
        /*
            r7 = this;
            X.0C5 r2 = r7.A04
            if (r2 == 0) goto L_0x0054
            X.0C6 r2 = (X.AnonymousClass0C6) r2
            r0 = 1
            r8.A08(r0)
            X.0D3 r0 = r8.A09
            r1 = 0
            if (r0 == 0) goto L_0x0015
            X.0D3 r0 = r8.A0A
            if (r0 != 0) goto L_0x0015
            r8.A09 = r1
        L_0x0015:
            r8.A0A = r1
            int r0 = r8.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r4 = r2.A00
            android.view.View r3 = r8.A0H
            r4.A0d()
            X.0CI r6 = r4.A0E
            X.0CG r0 = r6.A01
            X.0CH r0 = (X.AnonymousClass0CH) r0
            androidx.recyclerview.widget.RecyclerView r5 = r0.A00
            int r2 = r5.indexOfChild(r3)
            r0 = -1
            if (r2 != r0) goto L_0x0055
            X.AnonymousClass0CI.A02(r3, r6)
        L_0x0036:
            r2 = 1
            X.0D3 r1 = androidx.recyclerview.widget.RecyclerView.A04(r3)
            X.0Bu r0 = r4.A0x
            r0.A0A(r1)
            r0.A09(r1)
        L_0x0043:
            r0 = r2 ^ 1
            r4.A10(r0)
            if (r2 != 0) goto L_0x0054
            int r0 = r8.A00
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r4.removeDetachedView(r3, r0)
        L_0x0054:
            return
        L_0x0055:
            X.0CJ r1 = r6.A00
            boolean r0 = r1.A06(r2)
            if (r0 == 0) goto L_0x0073
            r1.A07(r2)
            X.AnonymousClass0CI.A02(r3, r6)
            android.view.View r0 = r5.getChildAt(r2)
            if (r0 == 0) goto L_0x006f
            r5.A0r(r0)
            r0.clearAnimation()
        L_0x006f:
            r5.removeViewAt(r2)
            goto L_0x0036
        L_0x0073:
            r2 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02800By.A06(X.0D3):void");
    }

    public long A07() {
        return this.A01;
    }

    public long A08() {
        return this.A02;
    }

    public long A09() {
        return this.A03;
    }
}
