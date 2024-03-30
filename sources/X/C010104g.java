package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.04g  reason: invalid class name and case insensitive filesystem */
public final class C010104g extends AnonymousClass04Z {
    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList arrayList = new ArrayList(r4);
                for (int i2 : intArrayExtra) {
                    boolean z = false;
                    if (i2 == 0) {
                        z = true;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                List A0C = AnonymousClass02R.A0C(stringArrayExtra);
                AnonymousClass00C.A0D(A0C, 0);
                Iterator it = A0C.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AnonymousClass03U.A06(A0C, 10), AnonymousClass03U.A06(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new AnonymousClass011(it.next(), it2.next()));
                }
                return C000400e.A09(arrayList2);
            }
        }
        C000500f r1 = C000500f.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        AnonymousClass00C.A0D(strArr, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        AnonymousClass00C.A08(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0SE A01(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        AnonymousClass00C.A0D(strArr, 1);
        int length = strArr.length;
        int i = 0;
        if (length == 0) {
            C000500f r1 = C000500f.A00;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return new AnonymousClass0SE(r1);
        }
        int i2 = 0;
        while (AnonymousClass00F.A01(context, strArr[i2]) == 0) {
            i2++;
            if (i2 >= length) {
                int A02 = C000300d.A02(length);
                if (A02 < 16) {
                    A02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
                do {
                    linkedHashMap.put(strArr[i], true);
                    i++;
                } while (i < length);
                return new AnonymousClass0SE(linkedHashMap);
            }
        }
        return null;
    }
}
