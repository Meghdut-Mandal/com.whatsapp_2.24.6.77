package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.6S8  reason: invalid class name */
public final class AnonymousClass6S8 {
    public Map A00 = AnonymousClass001.A0J();
    public final C19890wg A01;
    public final C19630wG A02;
    public volatile C1496071z A03;

    public static final C1496071z A00(AnonymousClass6S8 r4) {
        if (r4.A03 == null) {
            synchronized (r4) {
                if (r4.A03 == null) {
                    try {
                        r4.A03 = C1496071z.A01((C117715mi) null, C36441kJ.A0w(C90524aI.A0R(r4.A02), "bk_cache_dir"), 10485760);
                    } catch (IOException unused) {
                        Log.e("BkCacheSaveOnDiskHelper/getCache/unable to initialize disk cache for bk cache");
                    }
                }
            }
        }
        return r4.A03;
    }

    public static final void A01(AnonymousClass6S8 r3) {
        SharedPreferences A002 = r3.A01.A00("bloks");
        AnonymousClass00C.A08(A002);
        C36341k9.A0x(A002.edit(), "bk_cache_lookup_map", r3.A00.values().toString());
    }

    public AnonymousClass6S8(C19630wG r2, C19890wg r3) {
        C36321k7.A0x(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
