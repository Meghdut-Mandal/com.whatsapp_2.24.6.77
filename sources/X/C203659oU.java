package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.9oU  reason: invalid class name and case insensitive filesystem */
public class C203659oU implements C22989Azf {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203659oU(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void BYC(int i) {
        int i2 = this.A02;
        AnonymousClass6C8 r1 = (AnonymousClass6C8) this.A01;
        if (i2 == 0 || i != 0) {
            C179158jJ.A0j(r1, (Map) null, i);
        } else {
            r1.A00("on_success");
        }
    }
}
