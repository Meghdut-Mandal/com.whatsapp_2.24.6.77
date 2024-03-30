package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.List;

/* renamed from: X.9hj  reason: invalid class name and case insensitive filesystem */
public class C200619hj implements C22935Ayl {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C200619hj(C175798b4 r1, AnonymousClass9I8 r2, String str, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = str;
    }

    public final void BR0(List list) {
        boolean z;
        int i = this.A03;
        AnonymousClass9I8 r0 = (AnonymousClass9I8) this.A00;
        C175798b4 r2 = (C175798b4) this.A01;
        String str = this.A02;
        if (i != 0) {
            z = false;
        } else {
            z = true;
        }
        BrazilPayBloksActivity.A0F(r0.A00, r2, r0.A01, str, (List) null, z);
    }
}
