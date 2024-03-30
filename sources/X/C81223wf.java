package X;

import com.whatsapp.registration.ChangeNumberOverview;

/* renamed from: X.3wf  reason: invalid class name and case insensitive filesystem */
public class C81223wf implements Runnable {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C81223wf(ChangeNumberOverview changeNumberOverview, boolean z, boolean z2) {
        this.A03 = 2;
        this.A00 = changeNumberOverview;
        this.A01 = z;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x00b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r13.A00
            com.whatsapp.registration.ChangeNumberOverview r7 = (com.whatsapp.registration.ChangeNumberOverview) r7
            boolean r1 = r13.A01
            boolean r0 = r13.A02
            if (r1 == 0) goto L_0x0012
            r12 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r12 = 0
        L_0x0013:
            X.0yC r1 = r7.A0D
            r0 = 6367(0x18df, float:8.922E-42)
            r1.A0E(r0)
            r0 = 2131428729(0x7f0b0579, float:1.847911E38)
            android.widget.TextView r9 = X.C36391kE.A0Q(r7, r0)
            r0 = 2131428735(0x7f0b057f, float:1.8479123E38)
            android.widget.TextView r8 = X.C36391kE.A0Q(r7, r0)
            r0 = 2131428734(0x7f0b057e, float:1.847912E38)
            android.widget.TextView r6 = X.C36391kE.A0Q(r7, r0)
            r0 = 2131428728(0x7f0b0578, float:1.8479109E38)
            android.view.View r11 = r7.findViewById(r0)
            r0 = 2131428727(0x7f0b0577, float:1.8479107E38)
            android.view.View r10 = r7.findViewById(r0)
            r0 = 2131428731(0x7f0b057b, float:1.8479115E38)
            android.view.View r5 = r7.findViewById(r0)
            r0 = 2131428730(0x7f0b057a, float:1.8479113E38)
            android.view.View r4 = r7.findViewById(r0)
            r0 = 2131428733(0x7f0b057d, float:1.8479119E38)
            android.view.View r3 = r7.findViewById(r0)
            r0 = 2131428732(0x7f0b057c, float:1.8479117E38)
            android.view.View r2 = r7.findViewById(r0)
            r1 = 8
            X.C36361kB.A15(r11, r10, r5, r1)
            r4.setVisibility(r1)
            if (r12 == 0) goto L_0x0080
            r0 = 2131887678(0x7f12063e, float:1.940997E38)
            r9.setText(r0)
            r0 = 2131887681(0x7f120641, float:1.9409976E38)
            r8.setText(r0)
            r0 = 2131887679(0x7f12063f, float:1.9409972E38)
        L_0x0072:
            r6.setText(r0)
            X.1eR r0 = r7.A02
            if (r0 == 0) goto L_0x00ae
            r3.setVisibility(r1)
            r2.setVisibility(r1)
        L_0x007f:
            return
        L_0x0080:
            r0 = 2131887674(0x7f12063a, float:1.9409962E38)
            r9.setText(r0)
            r0 = 2131887687(0x7f120647, float:1.9409988E38)
            r8.setText(r0)
            r0 = 2131887685(0x7f120645, float:1.9409984E38)
            goto L_0x0072
        L_0x0090:
            java.lang.Object r0 = r13.A00
            X.A2e r0 = (X.C20990A2e) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x009a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r3.next()
            X.7m6 r2 = (X.C161067m6) r2
            boolean r1 = r13.A02
            boolean r0 = r13.A01
            r2.BkX(r1, r0)
            goto L_0x009a
        L_0x00ae:
            java.lang.String r0 = "interopRolloutManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b5:
            java.lang.Object r2 = r13.A00
            X.6VN r2 = (X.AnonymousClass6VN) r2
            boolean r1 = r13.A01
            boolean r0 = r13.A02
            r2.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81223wf.run():void");
    }

    public C81223wf(Object obj, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A01 = z2;
    }
}
