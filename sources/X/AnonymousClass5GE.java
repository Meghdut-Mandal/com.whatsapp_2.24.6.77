package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5GE  reason: invalid class name */
public final class AnonymousClass5GE extends AnonymousClass6F2 implements C162097o1, C162107o2 {
    public C159627jf A00;
    public String A01;
    public final AnonymousClass17Y A02;
    public final C19630wG A03;
    public final AnonymousClass1EU A04;
    public final C19770wU A05;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01 = str;
    }

    public void B7N(Map map) {
        if (map == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(new AnonymousClass5WM(C36441kJ.A1A(getClass()), 1));
            C36321k7.A1Z(A0u, "/finish: result is null");
            this.A00 = null;
            return;
        }
        C159627jf r0 = this.A00;
        this.A00 = null;
        if (r0 != null) {
            r0.BiH(map);
        } else {
            Log.e("FcsNativeFlowNpciCommonLibraryResource/finish: callback is null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GE(AnonymousClass17Y r1, C19630wG r2, AnonymousClass1EU r3, C105705Fs r4, C19770wU r5) {
        super(r4);
        C36321k7.A1B(r1, r2, r5, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r5;
        this.A04 = r3;
    }
}
