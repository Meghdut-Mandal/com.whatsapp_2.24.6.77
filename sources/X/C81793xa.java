package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3xa  reason: invalid class name and case insensitive filesystem */
public class C81793xa implements Comparator {
    public HashMap A00;
    public final AnonymousClass38I[] A01;

    private synchronized HashMap A01() {
        HashMap hashMap;
        hashMap = this.A00;
        if (hashMap == null) {
            hashMap = AnonymousClass001.A0J();
            AnonymousClass38I[] r5 = this.A01;
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                for (Object A1K : (List) r5[i2].A03.get()) {
                    C36341k9.A1K(A1K, hashMap, i);
                    i++;
                }
            }
            this.A00 = hashMap;
        }
        return hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((AnonymousClass1XQ) obj) - A00((AnonymousClass1XQ) obj2);
    }

    public C81793xa(AnonymousClass38I[] r1) {
        this.A01 = r1;
    }

    private int A00(AnonymousClass1XQ r3) {
        if (A01().containsKey(r3)) {
            return AnonymousClass000.A0I(A01().get(r3));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ");
        C36321k7.A1Z(A0u, r3.toString());
        return 0;
    }
}
