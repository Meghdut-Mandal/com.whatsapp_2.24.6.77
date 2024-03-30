package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6rT  reason: invalid class name and case insensitive filesystem */
public final class C144006rT implements C159397jI {
    public final AnonymousClass16D A00;
    public final Collection A01;

    public C144006rT(AnonymousClass16D r2, Collection collection) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = collection;
    }

    private final C1278569x A00() {
        ArrayList A0I = AnonymousClass001.A0I();
        C229516p.A0G(this.A00.A05, A0I, 2, false, true, false);
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = C36391kE.A0f(it).A0H;
            if (r1 != null && !this.A01.contains(r1)) {
                A0I2.add(r1);
            }
        }
        return new C1278569x(this, A0I2);
    }

    public C1278569x BOH() {
        return A00();
    }

    public C1278569x BOI() {
        return A00();
    }
}
