package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.6jT  reason: invalid class name and case insensitive filesystem */
public class C139246jT implements AnonymousClass7eL {
    public final View A00;
    public final /* synthetic */ LocationPicker A01;

    public C139246jT(LocationPicker locationPicker) {
        this.A01 = locationPicker;
        this.A00 = C36361kB.A0E(locationPicker.getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
    }

    public View BCf(C97634q1 r6) {
        View view = this.A00;
        TextView A0P = C36391kE.A0P(view, R.id.place_name);
        TextView A0P2 = C36391kE.A0P(view, R.id.place_address);
        Object obj = r6.A0F;
        if (obj instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) obj;
            A0P.setText(placeInfo.A06);
            A0P2.setText(placeInfo.A09);
        }
        return view;
    }
}
