package X;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: X.1nQ  reason: invalid class name and case insensitive filesystem */
public class C37921nQ extends BaseAdapter {
    public final C18820ts A00;
    public final int A01;
    public final Context A02;
    public final /* synthetic */ C65923Tz A03;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 != r4.A01) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r5 = 0
            if (r12 == 0) goto L_0x0011
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r1 = r12.getChildCount()
            X.3Tz r4 = r10.A03
            int r0 = X.C65923Tz.A0Z
            int r0 = r4.A01
            if (r1 == r0) goto L_0x003f
        L_0x0011:
            X.3Tz r4 = r10.A03
            int r0 = X.C65923Tz.A0Z
            android.content.Context r0 = r4.A0A
            X.1ml r12 = new X.1ml
            r12.<init>(r0, r10)
            r3 = 0
        L_0x001d:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x0038
            android.content.Context r0 = r10.A02
            X.1mW r2 = new X.1mW
            r2.<init>(r0, r4)
            int r1 = r4.A06
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            r12.addView(r2)
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0038:
            r12.setClickable(r5)
            r0 = 2
            X.C011504z.A06(r12, r0)
        L_0x003f:
            r3 = 0
        L_0x0040:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x00b5
            android.view.View r2 = r12.getChildAt(r3)
            X.1mW r2 = (X.C37501mW) r2
            int r8 = r4.A01
            int r8 = r8 * r11
            int r8 = r8 + r3
            X.3PU[] r9 = r4.A0Q
            int r7 = r10.A01
            r0 = r9[r7]
            int r0 = r0.A00()
            r6 = 0
            if (r8 >= r0) goto L_0x00a2
            r0 = r9[r7]
            X.0wg r1 = r4.A0N
            int[] r0 = r0.A01(r1, r8)
            r2.setEmoji(r0)
            r0 = 2131233671(0x7f080b87, float:1.8083486E38)
            r2.setBackgroundResource(r0)
            r0 = 1
            r2.setClickable(r0)
            android.view.View$OnClickListener r0 = r4.A0D
            r2.setOnClickListener(r0)
            r0 = r9[r7]
            int[] r1 = r0.A01(r1, r8)
            if (r1 == 0) goto L_0x008e
            boolean r0 = X.AnonymousClass3UO.A02(r1)
            if (r0 == 0) goto L_0x008e
            X.4Xa r1 = new X.4Xa
            r1.<init>(r10, r5)
        L_0x0088:
            r2.setOnLongClickListener(r1)
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x0040
        L_0x008e:
            boolean r0 = X.AnonymousClass3UO.A03(r1)
            if (r0 == 0) goto L_0x009b
            r0 = 1
            X.4Xa r1 = new X.4Xa
            r1.<init>(r10, r0)
            goto L_0x0088
        L_0x009b:
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L_0x008b
        L_0x00a2:
            r2.setEmoji(r6)
            r2.setBackground(r6)
            r2.setOnClickListener(r6)
            r2.setClickable(r5)
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L_0x008b
        L_0x00b5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37921nQ.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C37921nQ(Context context, C65923Tz r2, C18820ts r3, int i) {
        this.A03 = r2;
        this.A02 = context;
        this.A00 = r3;
        this.A01 = i;
    }

    public int getCount() {
        C65923Tz r6 = this.A03;
        int i = C65923Tz.A0Z;
        int i2 = 0;
        if (r6.A01 == 0) {
            return 0;
        }
        AnonymousClass3PU[] r4 = r6.A0Q;
        int i3 = this.A01;
        int A002 = r4[i3].A00();
        int i4 = r6.A01;
        int i5 = ((A002 + i4) - 1) / i4;
        if (r6.A0O && r4[i3].A00() > 0) {
            i2 = 1;
        }
        return i5 + i2;
    }
}
