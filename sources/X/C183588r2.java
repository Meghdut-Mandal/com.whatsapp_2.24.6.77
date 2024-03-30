package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8r2  reason: invalid class name and case insensitive filesystem */
public class C183588r2 extends C132446Tt {
    public final int A00;
    public final C24881Ed A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C24881Ed.A0C(this.A01, (AnonymousClass11F) null, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String A0G;
        C135086c7 A0D;
        Object obj2;
        List<C202319lY> list = (List) obj;
        WeakReference weakReference = this.A02;
        if (weakReference.get() != null) {
            HashMap hashMap = ((C167787yo) weakReference.get()).A06;
            hashMap.clear();
            for (C202319lY r0 : list) {
                C175708av r3 = r0.A0A;
                if (r3 != null) {
                    int i = r0.A02;
                    if (i == 405) {
                        A0G = r3.A0F();
                        A0D = r3.A0C();
                    } else if (i == 106 || i == 12) {
                        A0G = r3.A0G();
                        A0D = r3.A0D();
                    }
                    if (!TextUtils.isEmpty(A0G)) {
                        if (!C202349ld.A02(A0D)) {
                            obj2 = C165577te.A0g(A0D);
                        } else {
                            obj2 = A0G;
                        }
                        hashMap.put(A0G, obj2);
                    }
                }
            }
        }
    }

    public C183588r2(C24881Ed r2, C167787yo r3, int i) {
        this.A01 = r2;
        this.A02 = AnonymousClass001.A0F(r3);
        this.A00 = i;
    }
}
