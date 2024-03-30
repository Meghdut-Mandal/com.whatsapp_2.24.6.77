package X;

import android.app.Activity;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.Map;

/* renamed from: X.73l  reason: invalid class name and case insensitive filesystem */
public class C1499673l implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public C1499673l(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A05 = z;
    }

    public final void run() {
        AnonymousClass02E A0N;
        if (this.A06 != 0) {
            String str = this.A04;
            Activity activity = (Activity) this.A00;
            AnonymousClass71G r5 = (AnonymousClass71G) this.A01;
            C594233w r4 = (C594233w) this.A02;
            Map map = (Map) this.A03;
            boolean z = this.A05;
            if (AnonymousClass00C.A0J(str, "error")) {
                AnonymousClass00C.A0E(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                AnonymousClass02E A0N2 = ((AnonymousClass01I) activity).getSupportFragmentManager().A0N("extensions_bottom_sheet_container");
                if (!(A0N2 == null || (A0N = A0N2.A0k().A0N("BK_FRAGMENT")) == null)) {
                    ((WaBkExtensionsLayoutViewModel) C36441kJ.A0b(A0N).A00(WaBkExtensionsLayoutViewModel.class)).A0V((AnonymousClass2Uv) null, (String) null, (String) null, "extensions-fetch-catalog-error", z);
                }
            }
            r5.A01.A00(r4, "fetch_catalog").A02(str, map);
            return;
        }
        AnonymousClass71G r6 = (AnonymousClass71G) this.A00;
        String str2 = this.A04;
        boolean z2 = this.A05;
        AnonymousClass00C.A0D(str2, 2);
        r6.A00.A00((C199899gC) this.A01, str2).Blp(new C145976up((Activity) this.A02, (C594233w) this.A03, r6, z2));
    }
}
