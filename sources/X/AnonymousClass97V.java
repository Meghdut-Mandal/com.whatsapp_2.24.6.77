package X;

import android.content.Context;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.97V  reason: invalid class name */
public abstract class AnonymousClass97V {
    public static final void A00(C19630wG r3, C19420v0 r4, C23045B1q b1q, boolean z) {
        C36321k7.A0x(r4, r3);
        Boolean bool = C18750th.A03;
        Context context = r3.A00;
        if (C34201gc.A00(context) == 0) {
            zzw A04 = new AnonymousClass0JK(context).A04();
            AnonymousClass00C.A08(A04);
            A04.addOnSuccessListener(new C1903297y(new C22493AnW(r4, b1q, z), 4));
            A04.addOnFailureListener(new A4G(r4, b1q, z));
            return;
        }
        b1q.BmG();
    }
}
