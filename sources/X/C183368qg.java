package X;

import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.8qg  reason: invalid class name and case insensitive filesystem */
public class C183368qg extends C33541fX {
    public final /* synthetic */ C33841g1 A00;
    public final /* synthetic */ boolean A01;

    public C183368qg(C33841g1 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void A02(View view) {
        Log.i("UserNoticeBanner/update/banner dismissed");
        if (!this.A01) {
            this.A00.A04.A0B();
        }
        C33841g1 r3 = this.A00;
        C29371Wj.A01(r3.A03, C36401kF.A0j());
        View view2 = r3.A00;
        C18740tg.A04(view2);
        view2.setVisibility(8);
        r3.A04.A0A();
        AnonymousClass004 r2 = r3.A05;
        if (r2.get() != null) {
            r3.A01.A02((AnonymousClass3KG) r2.get());
        }
    }
}
