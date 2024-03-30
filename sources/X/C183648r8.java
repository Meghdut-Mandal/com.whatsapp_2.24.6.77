package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8r8  reason: invalid class name and case insensitive filesystem */
public class C183648r8 extends C132446Tt {
    public final AnonymousClass1EU A00;
    public final C24611Dc A01;
    public final AnonymousClass9FH A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        AnonymousClass1EU r6 = this.A00;
        ArrayList A09 = C165617ti.A0O(r6).A09();
        AnonymousClass9FH r0 = this.A02;
        if (r0 != null) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = r0.A00;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                C207249un A0S = C165607th.A0S(it);
                if (!indiaUpiBankAccountDetailsActivity.A07.A06(A0S)) {
                    A0I.add(A0S);
                }
            }
            A09 = A0I;
        }
        C24611Dc r2 = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1N("#methods=", A0u, A09);
        C165607th.A1E(r2, A0u);
        if (A09.size() > 1) {
            i = 201;
        } else {
            AnonymousClass1EU.A00(r6);
            i = 200;
            if (r6.A05.A0S(1).size() > 0) {
                i = 202;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        AnonymousClass9FR r0 = (AnonymousClass9FR) this.A03.get();
        if (r0 != null) {
            AnonymousClass3SJ.A01(r0.A00, number.intValue());
        }
    }

    public C183648r8(AnonymousClass1EU r2, C24611Dc r3, AnonymousClass9FH r4, AnonymousClass9FR r5) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = AnonymousClass001.A0F(r5);
    }
}
