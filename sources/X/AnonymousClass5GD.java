package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5GD  reason: invalid class name */
public final class AnonymousClass5GD extends AnonymousClass6F2 implements C162097o1, C162107o2 {
    public C159627jf A00;
    public String A01;
    public final C131376Ou A02;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01 = str;
    }

    public void B7N(Map map) {
        Object obj;
        String str;
        if (map != null) {
            obj = map.get("result_code");
        } else {
            obj = null;
        }
        if (obj != null) {
            C159627jf r2 = this.A00;
            if (r2 == null) {
                throw C36331k8.A0d("resourceResultCallback");
            }
            if (obj.equals(C90494aF.A0U())) {
                str = "SUCCESS";
            } else {
                str = "DISMISSED";
            }
            r2.BiH(C36391kE.A11("result", str));
            return;
        }
        Log.e("NativeP2mLiteHppCheckoutResource/finish: resultCode can't be null");
        C159627jf r1 = this.A00;
        if (r1 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        r1.BXS(AnonymousClass6PH.A03, (Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GD(C105705Fs r1, C131376Ou r2) {
        super(r1);
        C36321k7.A0x(r2, r1);
        this.A02 = r2;
    }
}
