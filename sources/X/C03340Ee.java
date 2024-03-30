package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0Ee  reason: invalid class name and case insensitive filesystem */
public class C03340Ee extends BaseAdapter {
    public C016307a A00;
    public boolean A01;
    public int A02 = -1;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r5 == r1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r4 = 0
            if (r8 != 0) goto L_0x000b
            android.view.LayoutInflater r1 = r6.A04
            int r0 = r6.A03
            android.view.View r8 = r1.inflate(r0, r9, r4)
        L_0x000b:
            X.07z r0 = r6.getItem(r7)
            int r5 = r0.getGroupId()
            int r0 = r7 + -1
            if (r0 < 0) goto L_0x0044
            X.07z r0 = r6.getItem(r0)
            int r1 = r0.getGroupId()
        L_0x001f:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.07a r0 = r6.A00
            boolean r0 = r0.A0G()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            r0 = 1
            if (r5 != r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.setGroupDividerEnabled(r0)
            r1 = r8
            X.080 r1 = (X.AnonymousClass080) r1
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x003c
            r3.setForceShowIcon(r2)
        L_0x003c:
            X.07z r0 = r6.getItem(r7)
            r1.BKf(r0, r4)
            return r8
        L_0x0044:
            r1 = r5
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03340Ee.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: A00 */
    public C018707z getItem(int i) {
        ArrayList A042;
        boolean z = this.A05;
        C016307a r0 = this.A00;
        if (z) {
            r0.A05();
            A042 = r0.A08;
        } else {
            A042 = r0.A04();
        }
        int i2 = this.A02;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C018707z) A042.get(i);
    }

    public void A01() {
        C016307a r0 = this.A00;
        C018707z r4 = r0.A04;
        if (r4 != null) {
            r0.A05();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r4) {
                    this.A02 = i;
                    return;
                }
            }
        }
        this.A02 = -1;
    }

    public int getCount() {
        ArrayList A042;
        boolean z = this.A05;
        C016307a r0 = this.A00;
        if (z) {
            r0.A05();
            A042 = r0.A08;
        } else {
            A042 = r0.A04();
        }
        int i = this.A02;
        int size = A042.size();
        if (i >= 0) {
            return size - 1;
        }
        return size;
    }

    public C03340Ee(LayoutInflater layoutInflater, C016307a r3, int i, boolean z) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A00 = r3;
        this.A03 = i;
        A01();
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
