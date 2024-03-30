package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5sU  reason: invalid class name and case insensitive filesystem */
public class C121035sU {
    public AnonymousClass65W A00;
    public int A01 = 0;
    public final List A02 = AnonymousClass001.A0I();

    public C121035sU(AnonymousClass5TE r3, AnonymousClass6QD r4, AnonymousClass65W r5) {
        List A0n = C90524aI.A0n(r3, r4.A01);
        if (A0n != null) {
            Iterator it = A0n.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("getMediaEffect");
            }
        }
        Collections.sort(this.A02, C1504775k.A00);
        this.A00 = r5;
    }
}
