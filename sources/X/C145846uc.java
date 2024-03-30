package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6uc  reason: invalid class name and case insensitive filesystem */
public class C145846uc implements C159487jR {
    public final List A00;
    public final /* synthetic */ C145896uh A01;

    public C145846uc(C145896uh r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public void BWx(C1261662u r3, int i) {
        C159297j8 r1 = this.A01.A07;
        if (r1 != null) {
            r1.BSN(i, this.A00);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        C159297j8 r0 = this.A01.A07;
        if (r0 != null) {
            r0.BSO(map);
        }
    }
}
