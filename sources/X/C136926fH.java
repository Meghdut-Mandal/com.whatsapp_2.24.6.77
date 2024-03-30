package X;

import java.util.Map;

/* renamed from: X.6fH  reason: invalid class name and case insensitive filesystem */
public final class C136926fH implements C157577dl {
    public final /* synthetic */ AnonymousClass63D A00;
    public final /* synthetic */ C137156fg A01;
    public final /* synthetic */ Object A02;

    public C136926fH(AnonymousClass63D r1, C137156fg r2, Object obj) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = obj;
    }

    public void dispose() {
        AnonymousClass63D r5 = this.A00;
        C137156fg r4 = this.A01;
        Map map = r4.A02;
        if (r5.A00) {
            Map Bla = r5.A01.Bla();
            boolean isEmpty = Bla.isEmpty();
            Object obj = r5.A02;
            if (isEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, Bla);
            }
        }
        r4.A01.remove(this.A02);
    }
}
