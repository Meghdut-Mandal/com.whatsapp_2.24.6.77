package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Nf  reason: invalid class name and case insensitive filesystem */
public final class C64243Nf {
    public final AnonymousClass3P0 A00;
    public final String A01;
    public final AnonymousClass3EJ A02;

    public C64243Nf(AnonymousClass3P0 r2, AnonymousClass3EJ r3, String str) {
        AnonymousClass00C.A0D(str, 3);
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = str;
    }

    public static final List A00(C64243Nf r5, List list, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3EJ.A00(C36441kJ.A0h(it), r5.A02, A0I, false, z);
        }
        return A0I;
    }
}
