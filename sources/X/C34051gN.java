package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1gN  reason: invalid class name and case insensitive filesystem */
public class C34051gN {
    public Set A00;
    public final C19420v0 A01;
    public final C24381Cf A02;
    public final C19930wk A03;
    public final AnonymousClass1HO A04;

    public static void A00(C34051gN r5) {
        HashSet hashSet;
        synchronized (r5) {
            if (r5.A00 == null) {
                long j = ((SharedPreferences) r5.A01.A00.get()).getLong("first_unseen_joinable_call", 0);
                if (j > 0) {
                    hashSet = new HashSet(r5.A04.A05());
                } else {
                    hashSet = new HashSet();
                }
                r5.A00 = hashSet;
                StringBuilder sb = new StringBuilder();
                sb.append("UnseenJoinableCallsBadge/init count:");
                sb.append(hashSet.size());
                sb.append(" timestamp:");
                sb.append(j);
                Log.i(sb.toString());
            }
        }
    }

    public C34051gN(C19420v0 r3, C24381Cf r4, AnonymousClass1HO r5, C19770wU r6) {
        this.A01 = r3;
        this.A04 = r5;
        this.A02 = r4;
        this.A03 = new C19930wk(r6, false);
    }
}
