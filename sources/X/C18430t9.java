package X;

import android.content.res.Configuration;
import java.util.Iterator;

/* renamed from: X.0t9  reason: invalid class name and case insensitive filesystem */
public class C18430t9 implements AnonymousClass026 {
    public Object A00;
    public final int A01;

    public C18430t9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass0WP r4 = (AnonymousClass0WP) obj;
                if (r4 == null) {
                    r4 = new AnonymousClass0WP(-3);
                }
                ((C06450Tq) this.A00).A00(r4);
                return;
            case 1:
                ((AnonymousClass01I) this.A00).A1u();
                return;
            case 2:
                ((AnonymousClass01I) this.A00).A1t();
                return;
            case 3:
                AnonymousClass01z r1 = (AnonymousClass01z) this.A00;
                Configuration configuration = (Configuration) obj;
                if (AnonymousClass01z.A0G(r1)) {
                    for (AnonymousClass02E r0 : r1.A0T.A04()) {
                        if (r0 != null) {
                            r0.onConfigurationChanged(configuration);
                        }
                    }
                    return;
                }
                return;
            case 6:
                AnonymousClass01z r2 = (AnonymousClass01z) this.A00;
                Number number = (Number) obj;
                if (AnonymousClass01z.A0G(r2) && number.intValue() == 80) {
                    for (AnonymousClass02E r02 : r2.A0T.A04()) {
                        if (r02 != null) {
                            r02.onLowMemory();
                        }
                    }
                    return;
                }
                return;
            default:
                AnonymousClass01z r12 = (AnonymousClass01z) this.A00;
                if (AnonymousClass01z.A0G(r12)) {
                    Iterator it = r12.A0T.A04().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
        }
    }
}
