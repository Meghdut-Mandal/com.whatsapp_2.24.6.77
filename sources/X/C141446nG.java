package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.6nG  reason: invalid class name and case insensitive filesystem */
public class C141446nG implements AnonymousClass7f1 {
    public final View A00;
    public final /* synthetic */ LocationPicker2 A01;

    public C141446nG(LocationPicker2 locationPicker2) {
        this.A01 = locationPicker2;
        this.A00 = C36361kB.A0E(locationPicker2.getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
    }

    public View BCg(C129116Fg r6) {
        View view = this.A00;
        TextView A0P = C36391kE.A0P(view, R.id.place_name);
        TextView A0P2 = C36391kE.A0P(view, R.id.place_address);
        if (r6.A01() instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) r6.A01();
            A0P.setText(placeInfo.A06);
            A0P2.setText(placeInfo.A09);
        }
        return view;
    }
}
