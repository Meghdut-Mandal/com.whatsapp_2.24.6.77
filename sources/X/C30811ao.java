package X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ao  reason: invalid class name and case insensitive filesystem */
public final class C30811ao {
    public final AnonymousClass005 A00;

    public final C196209Yd A00(String str, String str2) {
        Object obj;
        List asList = Arrays.asList(new String[]{"galaxy_message", "messageless_flow"});
        AnonymousClass00C.A08(asList);
        if (!C007103b.A0j(asList, str)) {
            Object obj2 = this.A00.get();
            AnonymousClass00C.A08(obj2);
            obj = ((Map) obj2).get(str);
        } else {
            String A002 = AnonymousClass6H1.A00(C131866Qy.A01(str2));
            if (A002 == null || A002.equals("1")) {
                obj = ((Map) this.A00.get()).get("galaxy_message");
            } else {
                obj = ((Map) this.A00.get()).get("extensions_message_v2");
            }
        }
        return (C196209Yd) obj;
    }

    public C30811ao(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}
