package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6N8  reason: invalid class name */
public class AnonymousClass6N8 {
    public final int A00;
    public final int A01;
    public final C63593Kq A02;
    public final String A03;
    public final List A04;

    public LatLng A00() {
        List<C63593Kq> list = this.A04;
        double d = 0.0d;
        double d2 = 0.0d;
        for (C63593Kq r6 : list) {
            d += r6.A00;
            d2 += r6.A01;
        }
        return C90524aI.A0F(d / ((double) list.size()), d2 / ((double) list.size()));
    }

    public AnonymousClass6N8(AnonymousClass1P6 r6, List list, int i) {
        this.A04 = C36441kJ.A15(list);
        C63593Kq r0 = (C63593Kq) C36391kE.A0t(list);
        this.A02 = r0;
        this.A01 = C36401kF.A1U(((C19970wo.A00(r6.A04) - r0.A05) > 600000 ? 1 : ((C19970wo.A00(r6.A04) - r0.A05) == 600000 ? 0 : -1))) ? 1 : 0;
        this.A00 = i;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I.add(((C63593Kq) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", A0I);
    }

    public AnonymousClass6N8(C63593Kq r2, int i) {
        this.A04 = Collections.singletonList(r2);
        this.A02 = r2;
        this.A01 = 2;
        this.A00 = i;
        this.A03 = r2.A06.getRawString();
    }
}
