package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3xD  reason: invalid class name and case insensitive filesystem */
public class C81563xD implements Comparator {
    public final AnonymousClass171 A00;
    public final Collator A01;
    public final Map A02 = AnonymousClass001.A0J();

    public String A01(AnonymousClass141 r5) {
        if (r5 == null) {
            return null;
        }
        String str = r5.A0W;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (r5.A0H == null) {
            return null;
        }
        Map map = this.A02;
        Class<UserJid> cls = UserJid.class;
        String A1A = C36431kI.A1A(r5.A06(cls), map);
        if (A1A != null) {
            return A1A;
        }
        String A0H = this.A00.A0H(r5);
        map.put(r5.A06(cls), A0H);
        return A0H;
    }

    public C81563xD(AnonymousClass171 r3, C18820ts r4) {
        this.A00 = r3;
        Collator A0p = C36361kB.A0p(r4);
        this.A01 = A0p;
        A0p.setDecomposition(1);
    }

    /* renamed from: A00 */
    public int compare(AnonymousClass141 r7, AnonymousClass141 r8) {
        String A012 = A01(r7);
        String A013 = A01(r8);
        if (A012 == null && A013 == null) {
            return 0;
        }
        if (A012 != null) {
            if (A013 != null) {
                int compare = this.A01.compare(A012, A013);
                if (compare != 0) {
                    return compare;
                }
                AnonymousClass11F r1 = r7.A0H;
                if (r1 == null && r8.A0H == null) {
                    return 0;
                }
                if (r1 != null) {
                    AnonymousClass11F r0 = r8.A0H;
                    if (r0 != null) {
                        return r1.compareTo((Jid) r0);
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
