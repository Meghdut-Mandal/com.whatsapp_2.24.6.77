package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6fh  reason: invalid class name and case insensitive filesystem */
public final class C137166fh implements C157607do {
    public final /* synthetic */ C137186fj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass00S A02;

    public C137166fh(C137186fj r1, String str, AnonymousClass00S r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public void BwK() {
        Map map = this.A00.A00;
        String str = this.A01;
        List list = (List) map.remove(str);
        if (list != null) {
            list.remove(this.A02);
            if (C36401kF.A1a(list)) {
                map.put(str, list);
            }
        }
    }
}
