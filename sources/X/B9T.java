package X;

import android.text.TextUtils;
import java.util.ArrayList;

public class B9T implements C22968AzK {
    public Object A00;
    public Object A01;
    public final int A02;

    public B9T(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BfM(C202059ky r5, String str) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C207249un r3 = (C207249un) obj;
            C21328AHg aHg = (C21328AHg) this.A01;
            AnonymousClass8b7 r1 = (AnonymousClass8b7) r3.A08;
            if (str == null || str.length() == 0 || r1 == null) {
                throw AnonymousClass001.A0A("fun buildPrepData tokenId must not be null");
            }
            r1.A05 = str;
            aHg.A02 = str;
            aHg.A0A.A01().A04((C22935Ayl) null, r3);
            return;
        }
        C199019eZ r32 = (C199019eZ) obj;
        C207249un r2 = (C207249un) this.A01;
        AnonymousClass8b7 r12 = (AnonymousClass8b7) r2.A08;
        if (TextUtils.isEmpty(str) || r12 == null) {
            r32.A02.BVV((C175798b4) null, C202059ky.A00(), (ArrayList) null, false);
            return;
        }
        r12.A05 = str;
        AnonymousClass9YB.A01(r32.A01.A01(), r2, r32, 4);
    }
}
