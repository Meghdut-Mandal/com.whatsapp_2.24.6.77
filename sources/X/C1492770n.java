package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.70n  reason: invalid class name and case insensitive filesystem */
public final class C1492770n implements C159737jq {
    public final /* synthetic */ C159737jq A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;

    public void BjT(C46812bi r6, String str) {
        AnonymousClass00C.A0D(str, 1);
        Map map = this.A03;
        map.put(this.A01, str);
        int size = map.size();
        List list = this.A02;
        if (size == list.size()) {
            this.A00.BjT(r6, C007103b.A0Q("\n\n", "", "", list, new AnonymousClass7TW(map)));
        }
    }

    public C1492770n(C159737jq r1, String str, List list, Map map) {
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
        this.A00 = r1;
    }

    public void BjS(C46812bi r2, C108145Si r3) {
        this.A00.BjS(r2, r3);
    }
}
