package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.5BL  reason: invalid class name */
public class AnonymousClass5BL extends C1496572e {
    public final C158377gp A00;
    public final C18820ts A01;
    public final AnonymousClass1HA A02;

    public AnonymousClass5BL(Context context, C20690y0 r8, C18820ts r9, AnonymousClass1H2 r10, C158377gp r11, AnonymousClass4R0 r12, AnonymousClass1HA r13, String str) {
        super(context, r8, r10, r12, str);
        this.A01 = r9;
        this.A00 = r11;
        this.A02 = r13;
    }

    public void run() {
        AnonymousClass6VQ r1;
        File A0H = AnonymousClass1GW.A0H(this.A02, this.A04);
        if (A0H.exists()) {
            Context context = this.A01;
            AnonymousClass1H2 r3 = this.A03;
            r1 = AnonymousClass6VQ.A05.A01(context, this.A01, r3, this.A02, A0H);
        } else {
            r1 = null;
        }
        this.A00.BZz(r1);
    }
}
