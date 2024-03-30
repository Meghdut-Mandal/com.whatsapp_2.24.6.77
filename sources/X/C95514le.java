package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4le  reason: invalid class name and case insensitive filesystem */
public class C95514le extends AnonymousClass04R implements C160517l8 {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final Map A03 = C36431kI.A1G();

    public boolean A0S(int i) {
        Number A0z = C36441kJ.A0z(this.A01);
        if (A0z == null || A0z.intValue() != i) {
            return false;
        }
        return true;
    }

    public void Bc5(AnonymousClass68B r4) {
        Map map = this.A03;
        String str = r4.A0F;
        C001600r r1 = (C001600r) map.get(str);
        if (r1 != null && r1.A04() != null) {
            r1.A0D(new C119835qX(r4, str));
        }
    }

    public void Bc6(List list) {
        Map map = this.A03;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass68B A0g = C90514aH.A0g(it);
            String str = A0g.A0F;
            map.put(str, C36441kJ.A0Z(new C119835qX(A0g, str)));
        }
        C36341k9.A16(this.A01, 2);
    }

    public void Bc7() {
        C36341k9.A16(this.A01, 3);
    }

    public void Bc8(String str) {
        C001600r r2 = (C001600r) this.A03.get(str);
        if (r2 != null && r2.A04() != null) {
            r2.A0D(new C119835qX((AnonymousClass68B) null, str));
        }
    }
}
