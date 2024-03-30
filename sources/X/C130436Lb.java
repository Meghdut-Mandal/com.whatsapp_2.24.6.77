package X;

import android.content.SharedPreferences;
import com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Lb  reason: invalid class name and case insensitive filesystem */
public final class C130436Lb {
    public LinkedHashSet A00 = C36441kJ.A17();
    public AtomicBoolean A01 = C36431kI.A1H();
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final SharedPreferences A05;
    public final AnonymousClass040 A06;

    public static final void A00(C130436Lb r3) {
        if (!r3.A03 && r3.A02) {
            C36331k8.A1T(new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(r3, (C023509x) null), r3.A06);
            r3.A03 = true;
        }
    }

    public C130436Lb(SharedPreferences sharedPreferences, AnonymousClass040 r3, long j) {
        this.A05 = sharedPreferences;
        this.A06 = r3;
        this.A04 = j;
    }
}
