package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.75k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1504775k implements Comparator {
    public static final /* synthetic */ C1504775k A00 = new C1504775k();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass6F3 r7 = (AnonymousClass6F3) obj;
        AnonymousClass6F3 r8 = (AnonymousClass6F3) obj2;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return Long.compare(timeUnit.convert(r7.A01, r7.A02), timeUnit.convert(r8.A01, r8.A02));
    }
}
