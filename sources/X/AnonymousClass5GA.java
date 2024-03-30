package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5GA  reason: invalid class name */
public final class AnonymousClass5GA extends AnonymousClass6F2 implements C162097o1 {
    public C159627jf A00;
    public final C19630wG A01;

    public void B7N(Map map) {
        C159627jf r0 = this.A00;
        if (r0 != null) {
            r0.BiH(map);
        } else {
            Log.e("native_upi_reset_pin/finish: callback is null");
        }
        this.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GA(C19630wG r1, C105705Fs r2) {
        super(r2);
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
    }
}
