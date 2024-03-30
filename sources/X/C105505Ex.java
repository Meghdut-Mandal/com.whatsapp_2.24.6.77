package X;

import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Ex  reason: invalid class name and case insensitive filesystem */
public final class C105505Ex extends C46482Xv {
    public final WaTextView A00;
    public final AnonymousClass5DV A01;
    public final View A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        LatLng latLng;
        boolean z;
        AnonymousClass5EJ r3 = (AnonymousClass5EJ) obj;
        int i = 0;
        AnonymousClass00C.A0D(r3, 0);
        WaTextView waTextView = this.A00;
        List list = r3.A02;
        if (list.size() <= 3) {
            i = 8;
        }
        waTextView.setVisibility(i);
        C36361kB.A17(waTextView, r3, 11);
        AnonymousClass5DV r2 = this.A01;
        List<C144416s9> A0a = C007103b.A0a(list, 3);
        ArrayList A0J = C36321k7.A0J(A0a);
        for (C144416s9 r13 : A0a) {
            AnonymousClass6QG r6 = r3.A00;
            if (!AnonymousClass00C.A0J(r6.A08, "country_default")) {
                Double d = r6.A03;
                AnonymousClass00C.A0B(d);
                double doubleValue = d.doubleValue();
                Double d2 = r6.A04;
                AnonymousClass00C.A0B(d2);
                latLng = C90484aE.A0S(d2, doubleValue);
            } else {
                latLng = null;
            }
            int A022 = r6.A02();
            if (r6.A06()) {
                z = true;
                if (r13.A02()) {
                    AnonymousClass5EL r8 = new AnonymousClass5EL(latLng, new C143646qt(r3, r13), C143686qx.A00, (C160947lq) null, r13, 11, A022, z, false);
                    r8.A05 = false;
                    A0J.add(r8);
                }
            }
            z = false;
            AnonymousClass5EL r82 = new AnonymousClass5EL(latLng, new C143646qt(r3, r13), C143686qx.A00, (C160947lq) null, r13, 11, A022, z, false);
            r82.A05 = false;
            A0J.add(r82);
        }
        r2.A0M(A0J);
    }

    public C105505Ex(View view, AnonymousClass5DV r3) {
        super(view);
        this.A02 = view;
        this.A01 = r3;
        this.A00 = C36341k9.A0Q(view, R.id.view_all_btn);
        C90504aG.A0J(view, R.id.business_list).setAdapter(r3);
    }
}
