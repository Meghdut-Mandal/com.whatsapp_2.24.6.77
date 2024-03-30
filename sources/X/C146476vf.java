package X;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.6vf  reason: invalid class name and case insensitive filesystem */
public final class C146476vf implements C160107kT {
    public final C25721Hk A00 = C90524aI.A0I();
    public final C25721Hk A01 = C90524aI.A0I();
    public final C25721Hk A02 = C90524aI.A0I();
    public final Executor A03;

    public void BW4(long j) {
        this.A00.A04(Long.valueOf(j));
    }

    public void BW6(boolean z) {
        this.A01.A04(Boolean.valueOf(z));
    }

    public C146476vf(Executor executor) {
        this.A03 = executor;
    }

    public void BW7(C133136Wx r3, C129166Fp r4) {
        C36321k7.A0w(r3, r4);
        this.A02.A04(Pair.create(r3, r4));
    }
}
