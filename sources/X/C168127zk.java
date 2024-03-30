package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import java.util.List;

/* renamed from: X.7zk  reason: invalid class name and case insensitive filesystem */
public class C168127zk extends AnonymousClass0CZ {
    public final AnonymousClass9I9 A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiProfileDetailsActivity A02;

    public C168127zk(AnonymousClass9I9 r1, IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity, List list) {
        this.A02 = indiaUpiProfileDetailsActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public static void A00(C206719tr r1, AnonymousClass80N r2) {
        ImageView imageView;
        int i;
        String str = r1.A03;
        if (str.equals("numeric_id")) {
            imageView = r2.A01;
            i = R.drawable.ic_upi_custom_number;
        } else if (str.equals("mobile_number")) {
            imageView = r2.A01;
            i = R.drawable.ic_settings_phone;
        } else {
            return;
        }
        imageView.setImageResource(i);
    }

    private void A01(AnonymousClass80N r6) {
        r6.A0H.setEnabled(true);
        TextView textView = r6.A03;
        C36351kA.A15(this.A02.getResources(), textView, C224514j.A00(textView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public int A0J() {
        return this.A01.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r1.setText(r0);
        r5.A0H.setEnabled(false);
        r5.A01.setImageResource(com.whatsapp.R.drawable.ic_upi_number_loading);
        X.C36351kA.A15(r4.A02.getResources(), r2, com.whatsapp.R.color.f6nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r5, int r6) {
        /*
            r4 = this;
            X.80N r5 = (X.AnonymousClass80N) r5
            java.util.List r0 = r4.A01
            java.lang.Object r3 = r0.get(r6)
            X.9tr r3 = (X.C206719tr) r3
            android.widget.TextView r2 = r5.A03
            X.6c7 r0 = r3.A00
            java.lang.Object r0 = r0.A00
            X.C165607th.A1A(r2, r0)
            java.lang.String r1 = r3.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1422950650: goto L_0x0094;
                case -733902135: goto L_0x0069;
                case -591705762: goto L_0x005b;
                case 24665195: goto L_0x0047;
                case 681442075: goto L_0x0039;
                case 1073361059: goto L_0x002b;
                case 2076720286: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = "inactive_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r5.A02
            r0 = 2131895455(0x7f12249f, float:1.9425743E38)
            goto L_0x0076
        L_0x002b:
            java.lang.String r0 = "active_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r5.A02
            r0 = 2131895451(0x7f12249b, float:1.9425735E38)
            goto L_0x0076
        L_0x0039:
            java.lang.String r0 = "deregistered_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r5.A02
            r0 = 2131895461(0x7f1224a5, float:1.9425756E38)
            goto L_0x0076
        L_0x0047:
            java.lang.String r0 = "inactive"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            A00(r3, r5)
            r4.A01(r5)
            android.widget.TextView r1 = r5.A02
            r0 = 2131895458(0x7f1224a2, float:1.942575E38)
            goto L_0x00a7
        L_0x005b:
            java.lang.String r0 = "active_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r5.A02
            r0 = 2131895453(0x7f12249d, float:1.942574E38)
            goto L_0x0076
        L_0x0069:
            java.lang.String r0 = "available"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r5.A02
            r0 = 2131895460(0x7f1224a4, float:1.9425754E38)
        L_0x0076:
            r1.setText(r0)
            android.view.View r1 = r5.A0H
            r0 = 0
            r1.setEnabled(r0)
            android.widget.ImageView r1 = r5.A01
            r0 = 2131232872(0x7f080868, float:1.8081866E38)
            r1.setImageResource(r0)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = r4.A02
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36351kA.A15(r1, r2, r0)
            return
        L_0x0094:
            java.lang.String r0 = "active"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            A00(r3, r5)
            r4.A01(r5)
            android.widget.TextView r1 = r5.A02
            r0 = 2131895452(0x7f12249c, float:1.9425737E38)
        L_0x00a7:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168127zk.BSE(X.0D3, int):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        return new AnonymousClass80N(C36361kB.A0E(this.A02.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), this.A00);
    }
}
