package X;

import android.content.Context;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.5MU  reason: invalid class name */
public class AnonymousClass5MU extends C132446Tt {
    public final long A00;
    public final C18820ts A01;
    public final AnonymousClass1D5 A02;
    public final Integer A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final List A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r1 instanceof java.util.List) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.ref.WeakReference r0 = r8.A05
            java.lang.Object r7 = r0.get()
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.ref.WeakReference r0 = r8.A04
            android.content.Context r6 = X.C36441kJ.A0G(r0)
            if (r7 == 0) goto L_0x004d
            java.lang.Object r1 = r7.getTag()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x004d
        L_0x001a:
            java.util.List r0 = r8.A06
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            long r4 = r9.longValue()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            long r4 = r8.A00
        L_0x002e:
            X.0ts r1 = r8.A01
            boolean r3 = r8.A07
            java.lang.Integer r0 = r8.A03
            java.lang.String r2 = X.C66013Ui.A0E(r1, r4)
            r1 = 1
            if (r0 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0044
            r0 = 2131890344(0x7f1210a8, float:1.9415377E38)
        L_0x0040:
            java.lang.String r2 = X.C36351kA.A0w(r6, r2, r1, r0)
        L_0x0044:
            r7.setText(r2)
        L_0x0047:
            return
        L_0x0048:
            int r0 = r0.intValue()
            goto L_0x0040
        L_0x004d:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MU.A0C(java.lang.Object):void");
    }

    public AnonymousClass5MU(Context context, TextView textView, C18820ts r4, AnonymousClass1D5 r5, Integer num, List list, long j, boolean z) {
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = list;
        this.A03 = num;
        this.A00 = j;
        this.A07 = z;
        this.A05 = AnonymousClass001.A0F(textView);
        this.A04 = AnonymousClass001.A0F(context);
    }
}
