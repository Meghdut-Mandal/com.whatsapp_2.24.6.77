package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.6df  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136036df implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass01L A00;
    public final /* synthetic */ C133586Zc A01;

    public /* synthetic */ C136036df(AnonymousClass01L r1, C133586Zc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PlaceInfo placeInfo;
        C133586Zc r1 = this.A01;
        AnonymousClass01L r2 = this.A00;
        int headerViewsCount = i - r1.A0L.getHeaderViewsCount();
        if (!r1.A0d || headerViewsCount != -1) {
            C135096c8 r0 = r1.A0W;
            if (r0 != null && headerViewsCount < r0.A0D.size()) {
                placeInfo = (PlaceInfo) r1.A0W.A0D.get(headerViewsCount);
            } else {
                return;
            }
        } else if (r1.A0e || !r1.A1B.A05(r2)) {
            placeInfo = r1.A1C;
        } else {
            C133586Zc.A09(r1);
            return;
        }
        C133586Zc.A0E(r1, placeInfo);
    }
}
