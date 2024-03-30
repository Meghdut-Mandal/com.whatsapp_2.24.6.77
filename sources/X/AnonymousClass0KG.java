package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0KG  reason: invalid class name */
public final class AnonymousClass0KG extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08180aK();
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public AnonymousClass0KG(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        HashMap A0J = AnonymousClass001.A0J();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C04490Kv r6 = (C04490Kv) arrayList.get(i2);
            String str2 = r6.A01;
            HashMap A0J2 = AnonymousClass001.A0J();
            ArrayList arrayList2 = r6.A02;
            AnonymousClass006.A01(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C04500Kw r0 = (C04500Kw) r6.A02.get(i3);
                A0J2.put(r0.A02, r0.A01);
            }
            A0J.put(str2, A0J2);
        }
        this.A02 = A0J;
        AnonymousClass006.A01(str);
        this.A01 = str;
        HashMap hashMap = this.A02;
        for (Object obj : hashMap.keySet()) {
            Map map = (Map) hashMap.get(obj);
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                ((C04530Kz) map.get(A10.next())).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        HashMap hashMap = this.A02;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A0u.append(A0C);
            A0u.append(":\n");
            Map map = (Map) hashMap.get(A0C);
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(A10);
                A0u.append("  ");
                A0u.append(A0C2);
                A0u.append(": ");
                A0u.append(map.get(A0C2));
            }
        }
        return A0u.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        ArrayList A0I = AnonymousClass001.A0I();
        HashMap hashMap = this.A02;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A0I.add(new C04490Kv(A0C, (Map) hashMap.get(A0C)));
        }
        AnonymousClass0Z9.A0E(parcel, A0I, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
