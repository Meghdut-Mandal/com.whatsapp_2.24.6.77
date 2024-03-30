package X;

import android.os.StrictMode;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.9hA  reason: invalid class name and case insensitive filesystem */
public abstract class C200329hA {
    public static long A00(Map map, boolean z) {
        String A0s;
        if (map == null) {
            return -1;
        }
        List A01 = A01("Content-Range", map, z);
        if (A01 == null || A01.isEmpty()) {
            List A012 = A01("Content-Length", map, z);
            if (A012 == null || A012.isEmpty()) {
                return -1;
            }
            A0s = C36401kF.A0s(A012, 0);
        } else {
            String A0s2 = C36401kF.A0s(A01, 0);
            A0s = C165607th.A0o(A0s2.lastIndexOf(47), A0s2).trim();
        }
        return Long.parseLong(A0s);
    }

    public static List A01(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (!z || !map.containsKey(C90514aH.A0y(str))) {
                return null;
            }
            str = C90514aH.A0y(str);
        }
        return C90524aI.A0o(str, map);
    }

    /* JADX INFO: finally extract failed */
    public static void A02(C202189lD r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("video_uid=");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            String A0o = AnonymousClass000.A0o(randomUUID, A0u);
            if (A0o != null) {
                r3.A05.A0N.put("x-fb-qpl-ec", A0o);
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
