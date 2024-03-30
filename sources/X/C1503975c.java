package X;

import java.util.Comparator;

/* renamed from: X.75c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1503975c implements Comparator {
    public static final /* synthetic */ C1503975c A00 = new C1503975c();

    public final int compare(Object obj, Object obj2) {
        C94734ih r4 = ((C137846gp) obj).A0P.A0G;
        float f = r4.A02;
        C94734ih r2 = ((C137846gp) obj2).A0P.A0G;
        float f2 = r2.A02;
        if (f == f2) {
            return AnonymousClass00C.A00(r4.A03, r2.A03);
        }
        return Float.compare(f, f2);
    }
}
