package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0di  reason: invalid class name and case insensitive filesystem */
public final class C10110di implements C17370rB {
    public static final C10110di A01;
    public final Bundle A00;

    public /* synthetic */ C10110di(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10110di) {
                Bundle bundle = new Bundle(this.A00);
                Bundle bundle2 = new Bundle(((C10110di) obj).A00);
                if (bundle.size() == bundle2.size()) {
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        if (bundle2.containsKey(A0C)) {
                            if (!AnonymousClass0QM.A00(bundle.get(A0C), bundle2.get(A0C))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = new Bundle(this.A00);
        int size = bundle.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(bundle.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(bundle.get(str));
        }
        return AnonymousClass000.A0M(arrayList, AnonymousClass001.A0L(), 0);
    }

    static {
        Bundle A07 = AnonymousClass001.A07();
        if (!A07.containsKey("accountTypes")) {
            A07.putStringArrayList("accountTypes", new ArrayList(0));
        }
        A01 = new C10110di(A07);
    }
}
