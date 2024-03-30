package X;

import java.util.List;

/* renamed from: X.4Yo  reason: invalid class name and case insensitive filesystem */
public class C89964Yo implements C226715i {
    public Object A00;
    public final int A01;

    public C89964Yo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BQx() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C605338f r1 = (C605338f) obj;
            C18740tg.A01();
            if (r1.A01) {
                return true;
            }
            r1.A01 = true;
            List<AnonymousClass3DJ> list = r1.A03;
            for (AnonymousClass3DJ A002 : list) {
                A002.A00();
            }
            list.clear();
            return true;
        }
        C87004Nc r12 = (C87004Nc) obj;
        AnonymousClass00C.A0D(r12, 0);
        ((C43472Ht) r12).A04.A1v();
        return true;
    }

    public /* synthetic */ void BS8() {
    }
}
