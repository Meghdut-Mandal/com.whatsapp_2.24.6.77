package X;

import java.util.Comparator;

/* renamed from: X.1XO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1XO implements Comparator {
    public static final /* synthetic */ AnonymousClass1XO A00 = new AnonymousClass1XO();

    public final int compare(Object obj, Object obj2) {
        C88794Ub r8 = (C88794Ub) obj;
        C88794Ub r9 = (C88794Ub) obj2;
        float BJE = r8.BJE();
        float BJE2 = r9.BJE();
        if (((double) Math.abs(BJE - BJE2)) < 0.001d) {
            return Long.compare(r9.B8H(), r8.B8H());
        }
        return Float.compare(BJE2, BJE);
    }
}
