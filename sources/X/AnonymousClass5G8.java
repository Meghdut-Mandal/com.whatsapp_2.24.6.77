package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5G8  reason: invalid class name */
public final class AnonymousClass5G8 extends AnonymousClass6F2 implements C162097o1 {
    public C159627jf A00;
    public final C19630wG A01;

    public void B7N(Map map) {
        C159627jf r1 = this.A00;
        if (r1 != null) {
            r1.BiH(map);
            this.A00 = null;
            return;
        }
        Log.e("native_upi_add_payment_method/finish: callback is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5G8(C19630wG r1, C105705Fs r2) {
        super(r2);
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
    }
}
