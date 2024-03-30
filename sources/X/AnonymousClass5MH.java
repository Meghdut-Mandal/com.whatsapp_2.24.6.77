package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.5MH  reason: invalid class name */
public class AnonymousClass5MH extends C132446Tt {
    public final View A00;
    public final C20690y0 A01;
    public final C117685mf A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Intent intent = (Intent) obj;
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = this.A02.A00;
        if (intent == null || intent.resolveActivity(indiaUpiMyQrFragment.A0i().getPackageManager()) == null) {
            indiaUpiMyQrFragment.A02.A06(R.string.f12nameremoved, 1);
            return;
        }
        indiaUpiMyQrFragment.startActivityForResult(intent, 1006);
        indiaUpiMyQrFragment.A00.setDrawingCacheEnabled(false);
    }

    public AnonymousClass5MH(Context context, View view, C20690y0 r4, C117685mf r5) {
        this.A03 = AnonymousClass001.A0F(context);
        this.A00 = view;
        this.A01 = r4;
        this.A02 = r5;
    }
}
