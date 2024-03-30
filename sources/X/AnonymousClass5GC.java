package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5GC  reason: invalid class name */
public final class AnonymousClass5GC extends AnonymousClass6F2 implements C162097o1, C162107o2 {
    public C159627jf A00;
    public String A01;
    public final C131376Ou A02;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01 = str;
    }

    public void B7N(Map map) {
        Object obj;
        Object obj2;
        if (map != null) {
            obj = map.get("account_compliance_status");
        } else {
            obj = null;
        }
        if (map != null) {
            obj2 = map.get("last_screen");
        } else {
            obj2 = null;
        }
        if (obj != null) {
            C159627jf r2 = this.A00;
            if (r2 == null) {
                throw C36331k8.A0d("resourceResultCallback");
            }
            AnonymousClass011[] r1 = new AnonymousClass011[2];
            C36341k9.A1J("account_compliance_status", obj, r1, 0);
            C36341k9.A1J("last_screen", obj2, r1, 1);
            r2.BiH(C000400e.A07(r1));
            return;
        }
        Log.e("NativeP2mLiteDoComplianceResource/finish: resultComplianceStatus can't be null");
        C159627jf r12 = this.A00;
        if (r12 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        r12.BXS(AnonymousClass6PH.A03, (Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GC(C105705Fs r1, C131376Ou r2) {
        super(r1);
        C36321k7.A0x(r2, r1);
        this.A02 = r2;
    }
}
