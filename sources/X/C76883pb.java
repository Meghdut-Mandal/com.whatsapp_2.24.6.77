package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3pb  reason: invalid class name and case insensitive filesystem */
public class C76883pb implements C236119d {
    public final C593833s A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass17Z A02;

    private void A00() {
        AnonymousClass30V r5 = new AnonymousClass30V((List) null);
        C593833s r0 = this.A00;
        C69273dG r4 = r0.A00;
        r4.A0X.Bp3(new C1503374w(r4, r5, r0.A01, 36));
    }

    public void BVN(String str) {
        Log.e("GetCustomUrlsByJidProtocol/onDeliveryFailure");
        A00();
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("GetCustomUrlsByJidProtocol/onError");
        AnonymousClass3ME.A00(r2);
        A00();
    }

    public void BiM(C203399nx r7, String str) {
        C203399nx A0c;
        String A0e;
        Log.e("GetCustomUrlsByJidProtocol/onSuccess");
        C203399nx A0c2 = r7.A0c("custom_urls");
        if (A0c2 != null) {
            List A0j = A0c2.A0j("custom_url");
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A0j.iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                if (!(A0s == null || (A0c = A0s.A0c("path")) == null || (A0e = A0c.A0e()) == null || A0e.isEmpty())) {
                    A0I.add(A0e);
                }
            }
            AnonymousClass30V r5 = new AnonymousClass30V(A0I);
            C593833s r0 = this.A00;
            C69273dG r4 = r0.A00;
            r4.A0X.Bp3(new C1503374w(r4, r5, r0.A01, 36));
            return;
        }
        A00();
    }

    public C76883pb(C593833s r1, AnonymousClass17Z r2, AnonymousClass19A r3) {
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }
}
