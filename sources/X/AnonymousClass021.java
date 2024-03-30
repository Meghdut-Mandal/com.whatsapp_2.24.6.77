package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.021  reason: invalid class name */
public class AnonymousClass021 {
    public AnonymousClass04X A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();

    public AnonymousClass02E A00(String str) {
        C022909q r0 = (C022909q) this.A02.get(str);
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public AnonymousClass02E A01(String str) {
        AnonymousClass02E A0g;
        for (C022909q r0 : this.A02.values()) {
            if (r0 != null && (A0g = r0.A02.A0g(str)) != null) {
                return A0g;
            }
        }
        return null;
    }

    public ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public ArrayList A03() {
        AnonymousClass02E r0;
        ArrayList arrayList = new ArrayList();
        for (C022909q r02 : this.A02.values()) {
            if (r02 != null) {
                r0 = r02.A02;
            } else {
                r0 = null;
            }
            arrayList.add(r0);
        }
        return arrayList;
    }

    public List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A01;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A05(AnonymousClass02E r4) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(r4)) {
            synchronized (arrayList) {
                arrayList.add(r4);
            }
            r4.A0X = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(r4);
        throw new IllegalStateException(sb.toString());
    }

    public void A06(C022909q r4) {
        AnonymousClass02E r2 = r4.A02;
        String str = r2.A0W;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(r2.A0W, r4);
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(r2);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    public void A07(C022909q r5) {
        AnonymousClass02E r3 = r5.A02;
        if (r3.A0k) {
            this.A00.A0S(r3);
        }
        if (this.A02.put(r3.A0W, (Object) null) != null && AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
    }
}
