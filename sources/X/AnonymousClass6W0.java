package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6W0  reason: invalid class name */
public class AnonymousClass6W0 {
    public static List A02 = Arrays.asList(new String[]{"urn:xmpp:whatsapp:account", "w:pay"});
    public final AnonymousClass17Y A00;
    public final AnonymousClass19A A01;

    public static C203399nx A00(AnonymousClass6W0 r5, C119905qe r6, String str, Map map) {
        Map A15 = C90514aH.A15("properties", map);
        Map A152 = C90514aH.A15("children", map);
        if ("accept_pay".equals(str) && A15 != null && A15.containsKey("merchant")) {
            A15.containsKey("merchant-fees");
        }
        ArrayList A0I = AnonymousClass001.A0I();
        if (A15 != null && A15.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(A15);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                C36381kD.A1M(C90494aF.A0f(A11), C90514aH.A10(A11), A0I);
            }
        }
        return new C203399nx(str, (AnonymousClass1AL[]) A0I.toArray(new AnonymousClass1AL[0]), r5.A02(r6, A152));
    }

    public AnonymousClass6W0(AnonymousClass17Y r1, AnonymousClass19A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static HashMap A01(AnonymousClass6W0 r7, C203399nx r8) {
        HashMap A0J = AnonymousClass001.A0J();
        if (r8 != null) {
            HashMap A0J2 = AnonymousClass001.A0J();
            AnonymousClass1AL[] A0k = r8.A0k();
            if (A0k != null) {
                for (AnonymousClass1AL r0 : A0k) {
                    A0J2.put(r0.A02, r0.A03);
                }
            }
            A0J.put("properties", C129386Gs.A01(A0J2));
            HashMap A0J3 = AnonymousClass001.A0J();
            C203399nx[] r2 = r8.A02;
            if (r2 != null) {
                for (C203399nx r02 : r2) {
                    A0J3.put(r02.A00, A01(r7, r02));
                }
            }
            HashMap A0J4 = AnonymousClass001.A0J();
            Iterator A10 = C36371kC.A10(A0J3);
            while (A10.hasNext()) {
                C36411kG.A1T(A0J4, AnonymousClass000.A11(A10));
            }
            A0J.put("children", A0J4);
        }
        HashMap A0J5 = AnonymousClass001.A0J();
        Iterator A102 = C36371kC.A10(A0J);
        while (A102.hasNext()) {
            C36411kG.A1T(A0J5, AnonymousClass000.A11(A102));
        }
        return A0J5;
    }

    private C203399nx[] A02(C119905qe r5, Map map) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (map != null && map.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A0I.add(A00(this, r5, C90494aF.A0f(A11), (Map) A11.getValue()));
            }
        }
        return (C203399nx[]) A0I.toArray(new C203399nx[0]);
    }
}
