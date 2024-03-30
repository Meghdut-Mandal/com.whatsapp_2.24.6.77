package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.8kO  reason: invalid class name and case insensitive filesystem */
public class C179598kO extends AnonymousClass80E {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final AnonymousClass1FR A03;

    public C179598kO(View view, AnonymousClass1FR r3) {
        super(view);
        this.A03 = r3;
        this.A02 = C36401kF.A0Q(view, R.id.status_text);
        this.A01 = C36401kF.A0Q(view, R.id.order_description);
        this.A00 = C012005e.A02(view, R.id.transaction_paid_label);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r2 = r5.getString(r0);
        r1 = com.whatsapp.R.drawable.vec_ic_local_shipping_24dp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r2 = r5.getString(r0);
        r1 = com.whatsapp.R.drawable.vec_ic_schedule_24dp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r2 = r5.getString(r0);
        r1 = com.whatsapp.R.drawable.vec_ic_baseline_done_24;
        r4 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r2 = r5.getString(r0);
        r1 = com.whatsapp.R.drawable.vec_ic_error_24dp;
        r4 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r1 = X.AnonymousClass0BT.A00((android.content.res.Resources.Theme) null, r5.getResources(), r1);
        java.util.Objects.requireNonNull(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        return new X.AnonymousClass9Ki(r1, r2, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9Ki A00(android.content.Context r5, X.AnonymousClass16U r6, X.AnonymousClass1FR r7, int r8) {
        /*
            r4 = 2131102153(0x7f0609c9, float:1.7816736E38)
            r3 = 0
            switch(r8) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0032;
                case 3: goto L_0x0036;
                case 4: goto L_0x003a;
                case 5: goto L_0x003e;
                case 6: goto L_0x0042;
                case 7: goto L_0x004d;
                case 8: goto L_0x005c;
                case 9: goto L_0x0067;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "OrderStatusMapper/mapStatus can not map order status "
            X.C36321k7.A1S(r0, r1, r8)
            r0 = 2131891904(0x7f1216c0, float:1.9418541E38)
        L_0x0013:
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131234116(0x7f080d44, float:1.8084389E38)
            r4 = 2131102107(0x7f06099b, float:1.7816643E38)
        L_0x001d:
            android.content.res.Resources r0 = r5.getResources()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0BT.A00(r3, r0, r1)
            java.util.Objects.requireNonNull(r1)
        L_0x0028:
            X.9Ki r0 = new X.9Ki
            r0.<init>(r1, r2, r4)
            return r0
        L_0x002e:
            r0 = 2131891896(0x7f1216b8, float:1.9418525E38)
            goto L_0x005f
        L_0x0032:
            r0 = 2131891900(0x7f1216bc, float:1.9418533E38)
            goto L_0x005f
        L_0x0036:
            r0 = 2131891888(0x7f1216b0, float:1.9418509E38)
            goto L_0x006a
        L_0x003a:
            r0 = 2131891886(0x7f1216ae, float:1.9418505E38)
            goto L_0x0013
        L_0x003e:
            r0 = 2131891892(0x7f1216b4, float:1.9418517E38)
            goto L_0x0045
        L_0x0042:
            r0 = 2131891902(0x7f1216be, float:1.9418537E38)
        L_0x0045:
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131234166(0x7f080d76, float:1.808449E38)
            goto L_0x001d
        L_0x004d:
            r0 = 2131891894(0x7f1216b6, float:1.941852E38)
            java.lang.String r2 = r5.getString(r0)
            r0 = 2131167774(0x7f070a1e, float:1.7949831E38)
            X.1lL r1 = r7.A0J(r5, r6, r4, r0)
            goto L_0x0028
        L_0x005c:
            r0 = 2131891898(0x7f1216ba, float:1.941853E38)
        L_0x005f:
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131234250(0x7f080dca, float:1.808466E38)
            goto L_0x001d
        L_0x0067:
            r0 = 2131891890(0x7f1216b2, float:1.9418513E38)
        L_0x006a:
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131234012(0x7f080cdc, float:1.8084178E38)
            r4 = 2131101817(0x7f060879, float:1.7816054E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179598kO.A00(android.content.Context, X.16U, X.1FR, int):X.9Ki");
    }
}
