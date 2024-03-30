package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Sj  reason: invalid class name */
public class AnonymousClass6Sj {
    public final C19630wG A00;
    public final C21010yW A01;
    public final C19700wN A02;

    public static boolean A01(Context context, File file, String str, String str2, Map map) {
        try {
            File A04 = AnonymousClass6YY.A04(file, C36441kJ.A0w(context.getCacheDir(), "crash_upload"), file.getName());
            StringBuilder A0v = AnonymousClass000.A0v(str2);
            if (A04 == null) {
                C36341k9.A1O(A0v, "/compress/empty; exit");
                return false;
            }
            C36321k7.A1a(A0v, C90514aH.A0x(A04, "/upload/attachment file: ", A0v));
            map.put(str, A04.getPath());
            return true;
        } catch (IOException e) {
            C36351kA.A1P("/compress/fail; exit", AnonymousClass000.A0v(str2), e);
            return false;
        }
    }

    public static void A00(Context context, String str, String str2, Map map, Map map2) {
        if (str != null && map.containsKey(str)) {
            A01(context, (File) map.get(str), "tombstone", str2, map2);
        }
    }

    public void A02(HashSet hashSet, Map map, boolean z) {
        this.A02.A0F(hashSet, map, z, false, false, false);
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            C90464aC.A18(C90524aI.A0S(AnonymousClass001.A0C(A0z)));
        }
    }

    public AnonymousClass6Sj(C19700wN r1, C19630wG r2, C21010yW r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
