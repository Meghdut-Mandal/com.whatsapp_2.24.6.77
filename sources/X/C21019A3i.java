package X;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.A3i  reason: case insensitive filesystem */
public final class C21019A3i implements C22805AwG {
    public Object A00 = null;
    public HashMap A01 = null;
    public final HashMap A02 = new HashMap(16, 1.0f);
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final HashMap A04 = new HashMap(16, 1.0f);
    public final HashMap A05 = new HashMap(16, 1.0f);
    public final HashMap A06 = new HashMap(16, 1.0f);

    public static final void A00(ContentResolver contentResolver, C21019A3i a3i) {
        if (a3i.A01 == null) {
            a3i.A03.set(false);
            a3i.A01 = new HashMap(16, 1.0f);
            a3i.A00 = C36441kJ.A11();
            contentResolver.registerContentObserver(AnonymousClass9B1.A00, true, new C165707u1(a3i));
        } else if (a3i.A03.getAndSet(false)) {
            a3i.A01.clear();
            a3i.A02.clear();
            a3i.A04.clear();
            a3i.A05.clear();
            a3i.A06.clear();
            a3i.A00 = C36441kJ.A11();
        }
    }
}
