package X;

import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.5MN  reason: invalid class name */
public class AnonymousClass5MN extends C132446Tt {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final AnonymousClass1GX A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A04.get();
        if (indiaUpiQrTabActivity != null && !indiaUpiQrTabActivity.BLh()) {
            Uri uri = this.A02;
            if (obj == null) {
                indiaUpiQrTabActivity.Bnv();
                indiaUpiQrTabActivity.A05.A06(R.string.f12nameremoved, 0);
                return;
            }
            C36391kE.A1Q(new C50232kQ(uri, indiaUpiQrTabActivity.A0G, indiaUpiQrTabActivity.A0B), indiaUpiQrTabActivity.A04);
        }
    }

    public AnonymousClass5MN(Uri uri, IndiaUpiQrTabActivity indiaUpiQrTabActivity, AnonymousClass1GX r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass001.A0F(indiaUpiQrTabActivity);
    }
}
