package X;

import android.util.ArrayMap;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3tD  reason: invalid class name and case insensitive filesystem */
public final class C79123tD implements AnonymousClass4SC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C39671tD A01;

    public C79123tD(C39671tD r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BTp(View view, AnonymousClass3A6 r4) {
        if (view != null && view.getTag(R.id.loaded_image_url) != null) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(Integer.valueOf(this.A00), view);
            this.A01.A07.A0C(arrayMap);
        }
    }
}
