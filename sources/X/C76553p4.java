package X;

import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3p4  reason: invalid class name and case insensitive filesystem */
public final class C76553p4 implements C236119d {
    public final AnonymousClass19A A00;
    public final C593233m A01;

    public C76553p4(C593233m r2, AnonymousClass19A r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    public void BiM(C203399nx r5, String str) {
        Map map;
        AnonymousClass00C.A0D(r5, 1);
        C203399nx A0a = r5.A0a();
        AnonymousClass00C.A08(A0a);
        C203399nx.A0A(A0a, "privacy");
        C203399nx[] r0 = A0a.A02;
        if (r0 != null) {
            C12810ih A03 = C15060md.A03(AnonymousClass4NJ.A00, C15060md.A03(new AnonymousClass4L0(A0a), new C18650tV(new C15020mZ(0, r0.length - 1), 0)));
            LinkedHashMap A1G = C36431kI.A1G();
            C12380hx r2 = new C12380hx(A03);
            while (r2.hasNext()) {
                AnonymousClass011 r02 = (AnonymousClass011) r2.next();
                A1G.put(r02.first, r02.second);
            }
            map = C000400e.A0A(A1G);
        } else {
            map = C000400e.A0D();
        }
        C593233m r22 = this.A01;
        AnonymousClass3EB r1 = r22.A00;
        if (r1 != null) {
            r1.A00(3);
        }
        r22.A01.A03(map);
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("PrivacySettingsProtocolHelper/onError");
    }

    public void BVN(String str) {
        C36321k7.A1R("PrivacySettingsProtocolHelper/onDeliveryFailure iqId=", str, C36341k9.A0i(str));
    }
}
