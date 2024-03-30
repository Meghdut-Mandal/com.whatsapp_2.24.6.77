package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2uv  reason: invalid class name and case insensitive filesystem */
public abstract class C55622uv {
    public static final C64893Pv A00(C203399nx r7) {
        Long l;
        C203399nx A0c = r7.A0c("tos");
        if (A0c == null) {
            return new C64893Pv(C023409w.A00, 864000000);
        }
        try {
            String A0x = C36391kE.A0x(A0c, "refresh");
            if (A0x == null) {
                A0x = "";
            }
            l = Long.valueOf(TimeUnit.SECONDS.toMillis(Long.parseLong(A0x)));
        } catch (Throwable th) {
            l = new AnonymousClass03N(th);
        }
        if (l instanceof AnonymousClass03N) {
            l = 864000000L;
        }
        long A09 = C36431kI.A09(l);
        List A0j = A0c.A0j("notice");
        ArrayList A13 = C36411kG.A13(A0j);
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            AnonymousClass00C.A0B(A0s);
            String A0i = A0s.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            if (A0i != null && !AnonymousClass098.A06(A0i)) {
                String A0i2 = A0s.A0i("state", (String) null);
                int i = 1;
                if (A0i2 != null && !AnonymousClass098.A06(A0i2) && !Boolean.parseBoolean(A0i2)) {
                    i = 2;
                }
                A13.add(new C63003Ij(A0i, i));
            }
        }
        return new C64893Pv(A13, A09);
    }
}
