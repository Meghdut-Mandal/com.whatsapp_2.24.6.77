package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5rw  reason: invalid class name and case insensitive filesystem */
public final class C120705rw {
    public final C1496172a A00;
    public final AnonymousClass6WV A01;
    public final Set A02 = C36441kJ.A17();

    public C120705rw(AnonymousClass6WV r7, Map map) {
        this.A01 = r7;
        this.A00 = r7.A05;
        List A002 = AnonymousClass6WV.A00(r7, false, true);
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass6WV r2 = (AnonymousClass6WV) A002.get(i);
            if (C90484aE.A1Y(map, r2.A02)) {
                this.A02.add(Integer.valueOf(r2.A02));
            }
        }
    }
}
