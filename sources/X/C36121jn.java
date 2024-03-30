package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.1jn  reason: invalid class name and case insensitive filesystem */
public class C36121jn implements C226715i {
    public Object A00;
    public final int A01;

    public C36121jn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BQx() {
        String str;
        if (this.A01 != 0) {
            ((AnonymousClass14o) this.A00).A2M();
            return true;
        }
        HomeActivity homeActivity = (HomeActivity) this.A00;
        AnonymousClass11e r5 = homeActivity.A02;
        int i = homeActivity.A03;
        if (i == 300) {
            str = "status";
        } else if (i == 400) {
            str = "calls";
        } else if (i == 600) {
            str = "community";
        } else if (i != 700) {
            str = "chat";
        } else {
            str = "biz_tools";
        }
        if (r5.A03 != null) {
            if (C20800yB.A01(C21000yV.A02, r5.A0F, 1807)) {
                r5.A03.A0A("tabs", str, true);
            }
        }
        homeActivity.A02.A04();
        return false;
    }

    public /* synthetic */ void BS8() {
    }
}
