package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;

public class B7X implements C22966AzI {
    public Object A00;
    public final int A01;

    public B7X(IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel, int i) {
        this.A01 = i;
        this.A00 = indiaUpiMapperLinkViewModel;
    }

    public final void BeP(C206719tr r6, C202059ky r7) {
        C28201Rs r3;
        Object obj;
        C28201Rs r1;
        Object obj2;
        C179288js r2;
        int i = this.A01;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A00;
        if (i != 0) {
            if (r7 != null) {
                int i2 = r7.A00;
                if (i2 == 21176) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C179298jt.A00;
                } else {
                    C28201Rs r32 = indiaUpiMapperLinkViewModel.A05;
                    if (i2 == 21138) {
                        Application application = indiaUpiMapperLinkViewModel.A02;
                        r2 = new C179288js(i2, application.getString(R.string.f12nameremoved), application.getString(R.string.f12nameremoved));
                    } else {
                        r2 = new C179288js(i2, "", indiaUpiMapperLinkViewModel.A02.getString(R.string.f12nameremoved));
                    }
                    r32.A0C(r2);
                    return;
                }
            } else {
                C200169gl r0 = indiaUpiMapperLinkViewModel.A04;
                AnonymousClass00C.A0B(r6);
                r0.A04(r6);
                String str = r6.A02;
                if (str.equalsIgnoreCase("active_pending")) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C179318jv.A00;
                } else if (str.equalsIgnoreCase("active")) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C179308ju.A00;
                } else {
                    return;
                }
            }
            r1.A0C(obj2);
            return;
        }
        if (r7 != null) {
            r3 = indiaUpiMapperLinkViewModel.A05;
            obj = new C179288js(r7.A00, "", "");
        } else {
            C200169gl r02 = indiaUpiMapperLinkViewModel.A04;
            AnonymousClass00C.A0B(r6);
            r02.A04(r6);
            String str2 = r6.A02;
            if (str2.equalsIgnoreCase("active_pending")) {
                r3 = indiaUpiMapperLinkViewModel.A05;
                obj = C179318jv.A00;
            } else if (str2.equalsIgnoreCase("active")) {
                r3 = indiaUpiMapperLinkViewModel.A05;
                obj = C179308ju.A00;
            } else {
                return;
            }
        }
        r3.A0C(obj);
    }
}
