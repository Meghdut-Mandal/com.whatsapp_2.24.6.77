package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.1vq  reason: invalid class name and case insensitive filesystem */
public final class C40621vq extends AnonymousClass0CZ {
    public int A00 = -1;
    public final C75643nZ A01;
    public final ArrayList A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C42161yN(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this);
    }

    public int A0J() {
        return this.A02.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r7, int r8) {
        /*
            r6 = this;
            X.1yN r7 = (X.C42161yN) r7
            r4 = 0
            X.AnonymousClass00C.A0D(r7, r4)
            java.util.ArrayList r1 = r6.A02
            int r0 = r7.A04()
            java.lang.Object r0 = r1.get(r0)
            X.34y r0 = (X.C597034y) r0
            int r5 = r0.A00
            int r0 = r7.A04()
            java.lang.Object r0 = r1.get(r0)
            X.34y r0 = (X.C597034y) r0
            boolean r0 = r0.A01
            r1 = -1
            if (r0 == 0) goto L_0x002d
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002d
            int r0 = r7.A04()
            r6.A00 = r0
        L_0x002d:
            android.view.View r2 = r7.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.setTag(r0)
            X.3YM r0 = new X.3YM
            r0.<init>(r6, r2, r7, r4)
            r2.setOnClickListener(r0)
            int r1 = r7.A04()
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r2.setSelected(r0)
            switch(r5) {
                case 0: goto L_0x008b;
                case 1: goto L_0x0087;
                case 2: goto L_0x0083;
                case 3: goto L_0x007f;
                case 4: goto L_0x007b;
                case 5: goto L_0x0077;
                case 6: goto L_0x0073;
                case 7: goto L_0x006f;
                default: goto L_0x004e;
            }
        L_0x004e:
            android.content.Context r3 = X.C36371kC.A0B(r2)
            android.widget.TextView r2 = r7.A00
            r0 = 2
            if (r5 != r0) goto L_0x006d
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168590(0x7f070d4e, float:1.7951486E38)
            int r1 = r1.getDimensionPixelSize(r0)
        L_0x0062:
            android.graphics.Typeface r0 = X.C54762tV.A00(r3, r5)
            r2.setTypeface(r0)
            r2.setPadding(r4, r1, r1, r4)
            return
        L_0x006d:
            r1 = 0
            goto L_0x0062
        L_0x006f:
            r1 = 2131886119(0x7f120027, float:1.9406808E38)
            goto L_0x008e
        L_0x0073:
            r1 = 2131886115(0x7f120023, float:1.94068E38)
            goto L_0x008e
        L_0x0077:
            r1 = 2131886113(0x7f120021, float:1.9406796E38)
            goto L_0x008e
        L_0x007b:
            r1 = 2131886114(0x7f120022, float:1.9406798E38)
            goto L_0x008e
        L_0x007f:
            r1 = 2131886116(0x7f120024, float:1.9406802E38)
            goto L_0x008e
        L_0x0083:
            r1 = 2131886118(0x7f120026, float:1.9406806E38)
            goto L_0x008e
        L_0x0087:
            r1 = 2131886112(0x7f120020, float:1.9406794E38)
            goto L_0x008e
        L_0x008b:
            r1 = 2131886117(0x7f120025, float:1.9406804E38)
        L_0x008e:
            android.content.Context r0 = r2.getContext()
            X.C36331k8.A0q(r0, r2, r1)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40621vq.BSE(X.0D3, int):void");
    }

    public C40621vq(C75643nZ r2, ArrayList arrayList) {
        this.A02 = arrayList;
        this.A01 = r2;
    }
}
