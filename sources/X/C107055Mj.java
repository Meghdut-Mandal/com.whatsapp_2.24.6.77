package X;

import android.graphics.Bitmap;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5Mj  reason: invalid class name and case insensitive filesystem */
public class C107055Mj extends C132446Tt {
    public final boolean A00;
    public final boolean A01 = true;
    public final /* synthetic */ CallGridViewModel A02;

    public C107055Mj(CallGridViewModel callGridViewModel, boolean z) {
        this.A02 = callGridViewModel;
        this.A00 = z;
    }

    /* renamed from: A0G */
    public void A0C(Bitmap bitmap) {
        if (!C36431kI.A1Y(this)) {
            if (this.A01) {
                C34831hi r2 = this.A02.A0g;
                r2.A0D(new C1278269u(((C1278269u) r2.A04()).A00, bitmap));
            }
            if (this.A00) {
                C123235wA r1 = this.A02.A0R;
                synchronized (r1) {
                    if (r1.A04) {
                        r1.A00 = bitmap;
                    }
                }
            }
        }
    }
}
