package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6W8  reason: invalid class name */
public class AnonymousClass6W8 {
    public boolean A00;
    public final C125295ze A01;
    public final Map A02 = AnonymousClass001.A0J();
    public final Map A03 = AnonymousClass001.A0J();
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();

    public static List A00(AnonymousClass679 r4, AnonymousClass6W8 r5) {
        try {
            return A01(r4, r5.A05, r5.A04);
        } catch (IllegalStateException e) {
            r5.A01.A00("InternalStateManager", "Failed to remove internal load", e, false);
            return AnonymousClass001.A0I();
        }
    }

    public static void A02(AnonymousClass679 r4, AnonymousClass6W8 r5) {
        if (r5.A05.put(r4, AnonymousClass001.A0I()) != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("InternalLoadRequest already in mInternalToExternalMap: ");
            r5.A01.A00("InternalStateManager", "Internal load request added to InternalStateManager multiple times", AnonymousClass000.A0g(r4.A03.A01.A0A, A0u), false);
        }
    }

    public static void A03(AnonymousClass679 r4, AnonymousClass6W8 r5) {
        Map map = r5.A03;
        String str = r4.A03.A01.A0A;
        if (map.remove(str) != r4) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("InternalLoadRequest not in mAssetIdToInternalLoadRequestMap: ");
            r5.A01.A00("InternalStateManager", "internal request not found", AnonymousClass000.A0g(str, A0u), false);
        }
    }

    public List A04(AnonymousClass682 r6) {
        try {
            return A01(r6, this.A04, this.A05);
        } catch (IllegalStateException e) {
            this.A01.A00("InternalStateManager", "Failed to remove external load request", e, false);
            return AnonymousClass001.A0I();
        }
    }

    public AnonymousClass6W8(C125295ze r2) {
        this.A01 = r2;
    }

    public static List A01(Object obj, Map map, Map map2) {
        List list = (List) map.remove(obj);
        if (list != null) {
            for (Object next : list) {
                if (!C90524aI.A0o(next, map2).remove(obj)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Value was not in map: ");
                    A0u.append(next);
                    throw AnonymousClass000.A0f(map2, " ", A0u);
                }
            }
            return list;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Key was not in map: ");
        A0u2.append(obj);
        throw AnonymousClass000.A0f(map, " ", A0u2);
    }
}
