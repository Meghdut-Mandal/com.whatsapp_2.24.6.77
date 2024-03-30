package X;

import android.util.SparseArray;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6KW  reason: invalid class name */
public final class AnonymousClass6KW {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final C110055a3 A02;
    public final C110065a4 A03;

    public AnonymousClass6KW(C110055a3 r2, C110065a4 r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public static final C130836Mp A00(AnonymousClass6KW r5, C1271967i r6, int i) {
        String valueOf = String.valueOf(i);
        C130836Mp r0 = C130836Mp.A03;
        C121155sg r4 = new C121155sg(valueOf);
        Map map = (Map) r6.A01.get(R.id.bloks_host_viewpoint_impressions_map);
        if (map == null) {
            map = AnonymousClass001.A0J();
        }
        C120775s3 r1 = new C120775s3(new AnonymousClass5o1(r5, i), r6, new C1255360g(map));
        List list = r4.A01;
        if (list == null) {
            list = AnonymousClass001.A0I();
            r4.A01 = list;
        }
        list.add(r1);
        String str = r4.A02;
        List list2 = r4.A01;
        if (list2 == null) {
            list2 = Collections.emptyList();
        }
        return new C130836Mp(r4.A00, str, list2);
    }
}
