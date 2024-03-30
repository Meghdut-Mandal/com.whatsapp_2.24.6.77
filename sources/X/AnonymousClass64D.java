package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.64D  reason: invalid class name */
public class AnonymousClass64D {
    public SparseArray A00 = new SparseArray();
    public Map A01 = Collections.emptyMap();
    public Map A02 = Collections.emptyMap();
    public final Context A03;
    public final AnonymousClass6XK A04;
    public final AnonymousClass65A A05;

    public AnonymousClass6PY A00() {
        Context context = this.A03;
        Objects.requireNonNull(context);
        AnonymousClass6XK r3 = this.A04;
        Objects.requireNonNull(r3);
        Map map = this.A01;
        Map map2 = this.A02;
        AnonymousClass65A r4 = this.A05;
        Objects.requireNonNull(r4);
        return new AnonymousClass6PY(context, this.A00, r3, r4, map, map2);
    }

    public AnonymousClass64D(Context context, AnonymousClass6XK r3, AnonymousClass65A r4) {
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r4;
    }
}
