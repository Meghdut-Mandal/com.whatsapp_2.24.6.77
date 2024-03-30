package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.8qh  reason: invalid class name and case insensitive filesystem */
public class C183378qh extends C33541fX {
    public final /* synthetic */ C33841g1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public C183378qh(C33841g1 r1, String str, Map map, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = map;
    }

    public void A02(View view) {
        C33571fa r4;
        Log.i("UserNoticeBanner/update/banner tapped");
        boolean z = this.A03;
        C33841g1 r5 = this.A00;
        C29341Wg r0 = r5.A04;
        if (z) {
            r0.A0A();
            C33041ec r2 = r5.A02;
            r4 = r5.A01;
            r2.A01(r4.getContext(), true);
        } else {
            r0.A0B();
            C33041ec r3 = r5.A02;
            String str = this.A01;
            Map map = this.A02;
            r4 = r5.A01;
            r3.A00(r4.getContext(), str, map);
        }
        C29371Wj.A01(r5.A03, C36361kB.A0j());
        View view2 = r5.A00;
        C18740tg.A04(view2);
        view2.setVisibility(8);
        AnonymousClass004 r1 = r5.A05;
        if (r1.get() != null) {
            r4.A02((AnonymousClass3KG) r1.get());
        }
    }
}
