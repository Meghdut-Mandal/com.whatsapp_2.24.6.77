package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.4mJ  reason: invalid class name and case insensitive filesystem */
public class C95804mJ extends C02920Ck {
    public long A00 = 1;
    public final Map A01 = AnonymousClass001.A0J();

    public C95804mJ() {
        super(C162467od.A00(0));
        A0B(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r7, int r8) {
        /*
            r6 = this;
            X.4nf r7 = (X.C96644nf) r7
            java.lang.Object r4 = r6.A0L(r8)
            X.66F r4 = (X.AnonymousClass66F) r4
            android.view.View r5 = r7.A0H
            android.content.Context r1 = r5.getContext()
            r0 = 2131888983(0x7f120b57, float:1.9412617E38)
            java.lang.String r1 = r1.getString(r0)
            com.whatsapp.WaTextView r3 = r7.A01
            boolean r2 = r4.A01
            if (r2 != 0) goto L_0x0060
            boolean r0 = r4 instanceof X.C1025650r
            if (r0 == 0) goto L_0x0058
            r0 = r4
            X.50r r0 = (X.C1025650r) r0
            java.lang.String r0 = r0.A00
        L_0x0024:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0060
            android.content.Context r1 = r5.getContext()
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = X.C65103Qt.A01(r1, r0)
        L_0x0034:
            r3.setMaxWidth(r0)
            r0 = 30
            X.C36361kB.A18(r3, r4, r0)
            boolean r0 = r4 instanceof X.C1025650r
            if (r0 == 0) goto L_0x0051
            X.50r r4 = (X.C1025650r) r4
            java.lang.String r0 = r4.A00
        L_0x0044:
            r3.setText(r0)
            android.widget.ImageView r1 = r7.A00
            int r0 = X.C36381kD.A00(r2)
            r1.setVisibility(r0)
            return
        L_0x0051:
            X.50q r4 = (X.C1025550q) r4
            X.6BG r0 = r4.A00
            java.lang.String r0 = r0.A01
            goto L_0x0044
        L_0x0058:
            r0 = r4
            X.50q r0 = (X.C1025550q) r0
            X.6BG r0 = r0.A00
            java.lang.String r0 = r0.A01
            goto L_0x0024
        L_0x0060:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95804mJ.BSE(X.0D3, int):void");
    }

    public long A0E(int i) {
        String str;
        AnonymousClass66F r1 = (AnonymousClass66F) A0L(i);
        Map map = this.A01;
        if (r1 instanceof C1025650r) {
            str = ((C1025650r) r1).A00;
        } else {
            str = ((C1025550q) r1).A00.A00;
        }
        Number A0b = C90524aI.A0b(str, map);
        if (A0b == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A0b = Long.valueOf(j);
            map.put(str, A0b);
        }
        return A0b.longValue();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96644nf(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
    }
}
