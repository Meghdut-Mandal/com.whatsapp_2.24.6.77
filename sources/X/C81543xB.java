package X;

import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashSet;

/* renamed from: X.3xB  reason: invalid class name and case insensitive filesystem */
public final class C81543xB implements Comparator {
    public final C19730wQ A00;
    public final Collator A01;
    public final /* synthetic */ C601736t A02;
    public final /* synthetic */ HashSet A03;

    public C81543xB(C19730wQ r2, AnonymousClass171 r3, C601736t r4, HashSet hashSet) {
        this.A02 = r4;
        this.A03 = hashSet;
        this.A00 = r2;
        this.A01 = r3.A0Z();
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass3IQ r7 = (AnonymousClass3IQ) obj;
        AnonymousClass3IQ r8 = (AnonymousClass3IQ) obj2;
        C36321k7.A0w(r7, r8);
        C19730wQ r1 = this.A02.A01;
        AnonymousClass141 r5 = r7.A01;
        if (!C36361kB.A1X(r1, r5)) {
            AnonymousClass141 r4 = r8.A01;
            if (!C36361kB.A1X(r1, r4)) {
                HashSet hashSet = this.A03;
                Class<UserJid> cls = UserJid.class;
                boolean A0j = C007103b.A0j(hashSet, r5.A06(cls));
                boolean A0j2 = C007103b.A0j(hashSet, r4.A06(cls));
                if (A0j) {
                    if (!A0j2) {
                        return -1;
                    }
                } else if (A0j2) {
                    return 1;
                }
            }
        }
        C19730wQ r2 = this.A00;
        boolean A1X = C36361kB.A1X(r2, r5);
        if (A1X == C36361kB.A1X(r2, r8.A01)) {
            return C81783xZ.A00(r7.A00, r8.A00, this.A01);
        } else if (A1X) {
            return -1;
        } else {
            return 1;
        }
    }
}
