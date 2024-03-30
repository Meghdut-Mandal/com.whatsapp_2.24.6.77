package X;

import android.util.Pair;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3oz  reason: invalid class name and case insensitive filesystem */
public class C76513oz implements C236119d {
    public final AnonymousClass19A A00;
    public final AnonymousClass36F A01;

    public void BVN(String str) {
        Log.w("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq onDeliveryFailure");
        AnonymousClass36F r1 = this.A01;
        C31611c6 r0 = r1.A00;
        String str2 = r1.A02;
        String str3 = r1.A01;
        Iterator A0s = C36361kB.A0s(r0);
        while (A0s.hasNext()) {
            AnonymousClass3N1 r3 = (AnonymousClass3N1) A0s.next();
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r3.A00;
            linkedDevicesEnterCodeActivity.A04.A01(9, str2, str3);
            linkedDevicesEnterCodeActivity.runOnUiThread(new C81093wS((Object) r3, 45));
        }
    }

    public void BiM(C203399nx r9, String str) {
        AnonymousClass36F r0 = this.A01;
        C31611c6 r7 = r0.A00;
        String str2 = r0.A02;
        String str3 = r0.A01;
        Iterator A0s = C36361kB.A0s(r7);
        while (A0s.hasNext()) {
            AnonymousClass3N1 r3 = (AnonymousClass3N1) A0s.next();
            r3.A00.runOnUiThread(new C80393vK(r3, str2, str3, 5));
        }
        r7.A02.A01(4, str2, str3);
    }

    public C76513oz(AnonymousClass36F r1, AnonymousClass19A r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public void BWw(C203399nx r7, String str) {
        Pair A012 = AnonymousClass3ME.A01(r7);
        if (A012 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq error code=");
            A0u.append(A012.first);
            A0u.append("; text=");
            C36321k7.A1Z(A0u, (String) A012.second);
            AnonymousClass36F r2 = this.A01;
            Number number = (Number) A012.first;
            C31611c6 r4 = r2.A00;
            Map map = r4.A00;
            String str2 = r2.A02;
            map.remove(str2);
            C31631c8 r1 = r4.A01;
            String str3 = r2.A01;
            r1.A00(5, str2, str3);
            if (number == null || number.intValue() != 400) {
                C31611c6.A01(r4, str2, str3);
                return;
            }
            r4.A02.A00(18);
            C31611c6.A00(r4);
            return;
        }
        Log.e("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq unknown code");
        AnonymousClass36F r12 = this.A01;
        C31611c6 r42 = r12.A00;
        Map map2 = r42.A00;
        String str4 = r12.A02;
        map2.remove(str4);
        C31631c8 r22 = r42.A01;
        String str5 = r12.A01;
        r22.A00(5, str4, str5);
        C31611c6.A01(r42, str4, str5);
    }
}
