package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.65E  reason: invalid class name */
public final class AnonymousClass65E {
    public AnonymousClass6IK A00;
    public final AnonymousClass6IB A01;
    public final C131536Pl A02;
    public final C1257561d A03;
    public final C121085sZ A04;
    public final C121085sZ A05;
    public final C131196Oc A06;
    public final AnonymousClass7fJ A07;
    public final String A08;
    public final List A09 = AnonymousClass001.A0I();
    public final Map A0A = AnonymousClass001.A0J();
    public final Map A0B;
    public final Set A0C;

    public AnonymousClass65E(AnonymousClass6IB r5, C131536Pl r6, C1257561d r7, C124105xb r8, AnonymousClass6IK r9, C131196Oc r10, AnonymousClass7fJ r11, String str) {
        this.A07 = r11;
        this.A00 = r9;
        this.A08 = str;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A06 = r10;
        if (r8 != null) {
            C121085sZ r1 = r8.A01;
            this.A05 = new C121085sZ(r1);
            this.A04 = r1;
            this.A0B = r8.A05;
            this.A0C = C36441kJ.A16();
            Iterator A0y = AnonymousClass000.A0y(r8.A04);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Object key = A11.getKey();
                if (!AnonymousClass5Z0.A00(A11.getValue(), r6.A07.get(key))) {
                    this.A0C.add(key);
                }
            }
            return;
        }
        this.A05 = new C121085sZ((C121085sZ) null);
        this.A04 = new C121085sZ((C121085sZ) null);
        this.A0B = Collections.emptyMap();
    }
}
