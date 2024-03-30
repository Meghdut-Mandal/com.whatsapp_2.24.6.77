package X;

import android.database.Cursor;

/* renamed from: X.1G3  reason: invalid class name */
public final class AnonymousClass1G3 {
    public final AnonymousClass12P A00;

    public AnonymousClass1G3(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final Cursor A00(C26901Ly r4, C52132ow r5, long j) {
        Cursor A09 = ((AnonymousClass1M0) r4).A02.A09(C56332w7.A00, "SELECT_ALL_PARENT_ASSOCIATION_FOR_PARENT_MESSAGE_AND_ASSOCIATION_TYPE_QUERY_ID", new String[]{String.valueOf(j), String.valueOf(r5.value)});
        AnonymousClass00C.A08(A09);
        return A09;
    }
}
