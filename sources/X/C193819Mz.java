package X;

import android.content.Context;
import java.util.Objects;

/* renamed from: X.9Mz  reason: invalid class name and case insensitive filesystem */
public class C193819Mz {
    public final Context A00;
    public final C1903998f A01;
    public final AnonymousClass98g A02;
    public final C1893893n A03;
    public final C1904098h A04;
    public final C22866AxL A05;

    public C193819Mz(AnonymousClass9J7 r3) {
        C1903998f r0;
        AnonymousClass98g r02;
        C1904098h r03;
        this.A00 = r3.A02;
        if (r3.A01 == null) {
            r3.A01 = new C203799ot(this, 0);
        }
        Objects.requireNonNull("image_cache");
        C22866AxL axL = r3.A01;
        Objects.requireNonNull(axL);
        this.A05 = axL;
        C1893893n r04 = r3.A00;
        Objects.requireNonNull(r04);
        this.A03 = r04;
        synchronized (C1903998f.class) {
            r0 = C1903998f.A00;
            if (r0 == null) {
                r0 = new C1903998f();
                C1903998f.A00 = r0;
            }
        }
        this.A01 = r0;
        synchronized (AnonymousClass98g.class) {
            r02 = AnonymousClass98g.A00;
            if (r02 == null) {
                r02 = new AnonymousClass98g();
                AnonymousClass98g.A00 = r02;
            }
        }
        this.A02 = r02;
        synchronized (C1904098h.class) {
            r03 = C1904098h.A00;
            if (r03 == null) {
                r03 = new C1904098h();
                C1904098h.A00 = r03;
            }
        }
        this.A04 = r03;
    }
}
