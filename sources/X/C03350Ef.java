package X;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: X.0Ef  reason: invalid class name and case insensitive filesystem */
public class C03350Ef extends BaseAdapter {
    public static final int A03 = AnonymousClass0YR.A02((Calendar) null).getMaximum(4);
    public static final int A04 = ((AnonymousClass0YR.A02((Calendar) null).getMaximum(5) + AnonymousClass0YR.A02((Calendar) null).getMaximum(7)) - 1);
    public AnonymousClass0TV A00;
    public final C08720bD A01;
    public final C10940fT A02;

    public boolean hasStableIds() {
        return true;
    }

    public int A00() {
        C10940fT r4 = this.A02;
        int i = this.A01.A01;
        Calendar calendar = r4.A05;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + r4.A02;
        }
        return i3;
    }

    public long getItemId(int i) {
        return (long) (i / this.A02.A02);
    }

    public C03350Ef(C08720bD r2, C10940fT r3) {
        this.A02 = r3;
        this.A01 = r2;
        throw AnonymousClass001.A0A("getSelectedDays");
    }

    /* renamed from: A01 */
    public Long getItem(int i) {
        if (i < A00()) {
            return null;
        }
        int A002 = A00();
        C10940fT r1 = this.A02;
        if (i > (A002 + r1.A01) - 1) {
            return null;
        }
        Calendar A012 = AnonymousClass0YR.A01(r1.A05);
        A012.set(5, (i - A00()) + 1);
        return Long.valueOf(A012.getTimeInMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r1 = r10.getContext()
            X.0TV r0 = r7.A00
            if (r0 != 0) goto L_0x000f
            X.0TV r0 = new X.0TV
            r0.<init>(r1)
            r7.A00 = r0
        L_0x000f:
            r5 = r9
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 0
            if (r9 != 0) goto L_0x0026
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625544(0x7f0e0648, float:1.8878299E38)
            android.view.View r5 = r1.inflate(r0, r10, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x0026:
            int r0 = r7.A00()
            int r2 = r8 - r0
            if (r2 < 0) goto L_0x005f
            X.0fT r1 = r7.A02
            int r0 = r1.A01
            if (r2 >= r0) goto L_0x005f
            r4 = 1
            int r3 = r2 + 1
            r5.setTag(r1)
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r2 = r0.locale
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1L(r1, r3, r6)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r5.setText(r0)
            r5.setVisibility(r6)
            r5.setEnabled(r4)
        L_0x0058:
            java.lang.Long r0 = r7.getItem(r8)
            if (r0 != 0) goto L_0x0068
            return r5
        L_0x005f:
            r0 = 8
            r5.setVisibility(r0)
            r5.setEnabled(r6)
            goto L_0x0058
        L_0x0068:
            r5.getContext()
            java.util.Calendar r0 = X.AnonymousClass0YR.A00()
            r0.getTimeInMillis()
            java.lang.String r0 = "getSelectedRanges"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03350Ef.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return A04;
    }
}
