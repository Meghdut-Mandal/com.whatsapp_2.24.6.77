package X;

/* renamed from: X.7tJ  reason: invalid class name and case insensitive filesystem */
public class C165367tJ implements C159487jR {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165367tJ(C132406Tm r1, C006302t r2, int i) {
        this.A02 = i;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWx(C1261662u r4, int i) {
        String str;
        int i2 = this.A02;
        ((C006302t) this.A01).invoke(new AnonymousClass519(i));
        C132406Tm r1 = (C132406Tm) this.A00;
        if (i2 != 0) {
            if (r1 != null) {
                str = "text_search_category_request_end";
            } else {
                return;
            }
        } else if (r1 != null) {
            str = "text_search_api_business_request_end";
        } else {
            return;
        }
        r1.A06(str);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i = this.A02;
        C124875yw r4 = (C124875yw) obj;
        AnonymousClass00C.A0D(r4, 0);
        ((C006302t) this.A01).invoke(new AnonymousClass51A(r4));
        C132406Tm r1 = (C132406Tm) this.A00;
        if (i != 0) {
            if (r1 != null) {
                str = "text_search_category_request_end";
            } else {
                return;
            }
        } else if (r1 != null) {
            str = "text_search_api_business_request_end";
        } else {
            return;
        }
        r1.A06(str);
    }
}
