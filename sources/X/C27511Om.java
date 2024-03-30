package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.1Om  reason: invalid class name and case insensitive filesystem */
public class C27511Om {
    public C131586Pq A00 = null;
    public Map A01;
    public Set A02;
    public final AnonymousClass1O6 A03;

    public synchronized void A01() {
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    public synchronized void A02(C131586Pq r3, Runnable runnable, long j) {
        this.A02.add(r3);
        this.A01.put(r3, new AnonymousClass34F(runnable, j));
        A00(this);
    }

    public static void A00(C27511Om r5) {
        AnonymousClass1O6 r4;
        SharedPreferences.Editor editor;
        Set<C131586Pq> set;
        try {
            C131586Pq r0 = r5.A00;
            if (r0 == null || !r0.A03()) {
                r4 = r5.A03;
                AnonymousClass1O6.A00(r4).edit().remove("current_running_sync").apply();
            } else {
                r4 = r5.A03;
                AnonymousClass1O6.A00(r4).edit().putString("current_running_sync", r5.A00.A01()).apply();
            }
        } catch (JSONException unused) {
            r4 = r5.A03;
            AnonymousClass1O6.A00(r4).edit().remove("current_running_sync").apply();
        }
        if (!r5.A02.isEmpty()) {
            HashSet hashSet = new HashSet();
            synchronized (r5) {
                set = r5.A02;
            }
            for (C131586Pq r1 : set) {
                try {
                    if (r1.A03()) {
                        hashSet.add(r1.A01());
                    }
                } catch (JSONException unused2) {
                }
            }
            if (!hashSet.isEmpty()) {
                editor = AnonymousClass1O6.A00(r4).edit().putStringSet("queued_running_sync_set", hashSet);
                editor.apply();
            }
        }
        editor = AnonymousClass1O6.A00(r4).edit().remove("queued_running_sync_set");
        editor.apply();
    }

    public C27511Om(AnonymousClass1O6 r2) {
        this.A03 = r2;
        A01();
    }
}
