package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6j9  reason: invalid class name and case insensitive filesystem */
public class C139046j9 implements C23087B3x {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SparseArray A03;
    public final String A04;
    public final HashMap A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (!(obj instanceof C139046j9)) {
            return false;
        }
        C139046j9 r4 = (C139046j9) obj;
        String str = this.A04;
        String str2 = r4.A04;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A05.equals(r4.A05)) {
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            throw AnonymousClass001.A0A("equals");
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int A022 = C36401kF.A02(this.A05, C36341k9.A09(this.A04) * 31);
        if (TextUtils.isEmpty((CharSequence) null)) {
            return A022;
        }
        throw AnonymousClass001.A0A("hashCode");
    }

    public C139046j9(C123615wn r6) {
        String str = r6.A01;
        this.A04 = str;
        HashMap hashMap = r6.A02;
        HashMap hashMap2 = hashMap;
        this.A05 = hashMap == null ? AnonymousClass001.A0J() : hashMap;
        this.A08 = AnonymousClass001.A0J();
        this.A09 = AnonymousClass001.A0J();
        int i = r6.A00;
        this.A01 = i <= 0 ? 719983200 : i;
        int A092 = (C36341k9.A09(str) * 31) + C36411kG.A09(hashMap2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            synchronized (AnonymousClass6I5.class) {
                LruCache lruCache = AnonymousClass6I5.A00;
                Integer valueOf = Integer.valueOf(A092);
                Integer num = (Integer) lruCache.get(valueOf);
                A092 = num != null ? (num.intValue() + 1) * 31 : A092;
                lruCache.put(valueOf, Integer.valueOf(A092));
            }
            this.A00 = A092;
            this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
            this.A06 = r6.A03;
            this.A03 = new SparseArray();
            Map map = r6.A04;
            this.A07 = map == null ? AnonymousClass001.A0J() : map;
            this.A0A = r6.A05;
            return;
        }
        throw AnonymousClass001.A0A("hashCode");
    }
}
