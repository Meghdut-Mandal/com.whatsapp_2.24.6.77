package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.3x4  reason: invalid class name and case insensitive filesystem */
public class C81473x4 implements Comparator {
    public Set A00;
    public final C81783xZ A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass350 r7 = (AnonymousClass350) obj;
        AnonymousClass350 r8 = (AnonymousClass350) obj2;
        int i = r7.A00;
        if (i != 32) {
            int i2 = r8.A00;
            if (i2 == 32 || i == 4 || i == 8) {
                return -1;
            }
            if (!(i2 == 4 || i2 == 8)) {
                AnonymousClass141 r3 = (AnonymousClass141) r7.A01;
                AnonymousClass141 r4 = (AnonymousClass141) r8.A01;
                if (r3.A0G() == r4.A0G()) {
                    Set set = this.A00;
                    C18740tg.A06(set);
                    Class<UserJid> cls = UserJid.class;
                    if (!set.contains(r3.A06(cls)) || !this.A00.contains(r4.A06(cls))) {
                        if (this.A00.contains(r3.A06(cls))) {
                            return -1;
                        }
                        if (this.A00.contains(r4.A06(cls))) {
                            return 1;
                        }
                    }
                    return this.A01.compare(r3, r4);
                } else if (r3.A0G()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 1;
    }

    public C81473x4(C19730wQ r2, AnonymousClass171 r3, int i) {
        this.A01 = new C81783xZ(r2, r3, i);
    }
}
