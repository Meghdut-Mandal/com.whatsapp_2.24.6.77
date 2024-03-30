package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.1Bf  reason: invalid class name and case insensitive filesystem */
public final class C24131Bf {
    public final C19600wD A00;
    public final C19970wo A01;
    public final C19420v0 A02;

    public C24131Bf(C19600wD r2, C19970wo r3, C19420v0 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final void A00() {
        C19420v0 r4 = this.A02;
        C19420v0.A00(r4).putInt("sticker_store_backoff_attempt", 0).apply();
        C19420v0.A00(r4).putLong("sticker_store_backoff_time", 0).apply();
        C19420v0.A00(r4).putLong("sticker_store_last_fetch_time", System.currentTimeMillis()).apply();
        Log.i("StickerRequestBackoffManager/clearAttempts");
    }

    public final void A01() {
        C19420v0 r8 = this.A02;
        int i = ((SharedPreferences) r8.A00.get()).getInt("sticker_store_backoff_attempt", 0) + 1;
        C24111Bd r4 = new C24111Bd(1, 720);
        r4.A03((long) i);
        long A012 = r4.A01();
        long currentTimeMillis = (60 * A012 * 1000) + System.currentTimeMillis();
        C19420v0.A00(r8).putInt("sticker_store_backoff_attempt", i).apply();
        C19420v0.A00(r8).putLong("sticker_store_backoff_time", currentTimeMillis).apply();
        StringBuilder sb = new StringBuilder();
        sb.append("StickerRequestBackoffManager/incrementAttempt/Backing off for ");
        sb.append(A012);
        sb.append(" minutes.");
        Log.e(sb.toString());
    }

    public final boolean A02() {
        if (((SharedPreferences) this.A02.A00.get()).getLong("sticker_store_backoff_time", 0) >= System.currentTimeMillis() || !this.A00.A09()) {
            return false;
        }
        return true;
    }
}
