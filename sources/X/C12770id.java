package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.0id  reason: invalid class name and case insensitive filesystem */
public final class C12770id implements C16970qV {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ C16970qV A01;

    public C12770id(Comparator comparator, C16970qV r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public Iterator iterator() {
        C16970qV<Object> r0 = this.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object add : r0) {
            A0I.add(add);
        }
        AnonymousClass03X.A08(A0I, this.A00);
        return A0I.iterator();
    }
}
