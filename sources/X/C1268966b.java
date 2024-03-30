package X;

import java.util.Map;

/* renamed from: X.66b  reason: invalid class name and case insensitive filesystem */
public final class C1268966b {
    public final C158807iG A00;
    public final AnonymousClass00S A01;
    public final Map A02 = C36431kI.A1G();

    public final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C122965vi r0 = (C122965vi) this.A02.get(obj);
        if (r0 != null) {
            return r0.A02;
        }
        C159827jz r2 = (C159827jz) this.A01.invoke();
        int BCd = ((C136776ey) r2).A02.BCd(obj);
        if (BCd != -1) {
            return r2.BA9(BCd);
        }
        return null;
    }

    public final C009003v A01(Object obj, Object obj2, int i) {
        Map map = this.A02;
        C122965vi r4 = (C122965vi) map.get(obj);
        if (r4 == null || r4.A00 != i || !AnonymousClass00C.A0J(r4.A02, obj2)) {
            r4 = new C122965vi(this, obj, obj2, i);
            map.put(obj, r4);
        }
        C009003v r3 = r4.A01;
        if (r3 != null) {
            return r3;
        }
        C1509977p r32 = new C1509977p(1403994769, new AnonymousClass7YD(r4, r4.A04), true);
        r4.A01 = r32;
        return r32;
    }

    public C1268966b(C158807iG r2, AnonymousClass00S r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
