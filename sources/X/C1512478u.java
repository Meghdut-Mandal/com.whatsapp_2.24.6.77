package X;

import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import java.util.ArrayList;

/* renamed from: X.78u  reason: invalid class name and case insensitive filesystem */
public class C1512478u extends ArrayList<C124725yh> {
    public final /* synthetic */ InCallBannerViewModel this$0;

    public C1512478u(InCallBannerViewModel inCallBannerViewModel) {
        this.this$0 = inCallBannerViewModel;
    }

    /* renamed from: A01 */
    public C124725yh set(C124725yh r5, int i) {
        if (i != 0) {
            return (C124725yh) super.set(i, r5);
        }
        C124725yh r3 = (C124725yh) super.set(0, r5);
        int i2 = r3.A01;
        if (i2 != r5.A01) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (i2 == 14) {
                inCallBannerViewModel.A0A.A0C((Object) null);
            }
        }
        return r3;
    }

    /* renamed from: A00 */
    public C124725yh remove(int i) {
        C124725yh r3 = (C124725yh) super.remove(i);
        if (i == 0) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (r3.A01 == 14) {
                inCallBannerViewModel.A0A.A0C((Object) null);
            }
        }
        return r3;
    }

    public void clear() {
        if (size() > 0) {
            super.clear();
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (((C124725yh) C36441kJ.A12(this)).A01 == 14) {
                inCallBannerViewModel.A0A.A0C((Object) null);
            }
        }
    }
}
