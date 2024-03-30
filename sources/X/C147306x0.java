package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.6x0  reason: invalid class name and case insensitive filesystem */
public final class C147306x0 implements AnonymousClass4VC {
    public final C119095pE A00;

    public C147306x0(C119095pE r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean B08(String str) {
        return AnonymousClass000.A1V(this.A00.A01.get(str));
    }

    public void BJV(String str, String str2) {
        AnonymousClass6C8 r3 = (AnonymousClass6C8) this.A00.A01.get(str);
        Uri parse = Uri.parse(str2);
        AnonymousClass00C.A0B(parse);
        Object A002 = C54942to.A00(parse);
        if (A002 == null) {
            A002 = C000400e.A0D();
        }
        if (r3 != null) {
            AnonymousClass011[] r1 = new AnonymousClass011[2];
            C36341k9.A1J("deeplink", str2, r1, 0);
            C36341k9.A1J("parameters", A002, r1, 1);
            r3.A02("on_success", C000400e.A07(r1));
        }
    }

    public void BJW(String str, Map map) {
        AnonymousClass6C8 r2 = (AnonymousClass6C8) this.A00.A01.get(str);
        if (r2 != null) {
            r2.A02("on_success", C36391kE.A11("parameters", map));
        }
    }
}
