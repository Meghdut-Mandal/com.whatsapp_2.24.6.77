package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6Sc  reason: invalid class name and case insensitive filesystem */
public final class C132096Sc {
    public static final C132096Sc A00 = new C132096Sc();
    public static final AtomicReference A01 = new AtomicReference(AnonymousClass5S6.DEBUG);
    public static final Map A02 = AnonymousClass001.A0J();
    public static final Set A03 = C36441kJ.A17();
    public static final AtomicInteger A04 = C90484aE.A0v();

    public final synchronized Set A01() {
        return A03;
    }

    public static final void A00() {
        C132096Sc r1 = A00;
        if (C90514aH.A1a(r1.A01())) {
            Set A012 = r1.A01();
            if (!(A012 instanceof Collection) || !A012.isEmpty()) {
                Iterator it = A012.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("getEvents");
                }
            }
        }
    }
}
