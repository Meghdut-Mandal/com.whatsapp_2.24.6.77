package X;

import java.util.Locale;
import java.util.UUID;

/* renamed from: X.AGo  reason: case insensitive filesystem */
public final class C21310AGo implements C23035B1g {
    public /* bridge */ /* synthetic */ boolean BNb(Object obj) {
        try {
            UUID.fromString(C36431kI.A1D(Locale.ROOT, obj.toString()).toString());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ CharSequence BpE(Object obj) {
        return C36431kI.A1D(Locale.ROOT, obj.toString());
    }
}
