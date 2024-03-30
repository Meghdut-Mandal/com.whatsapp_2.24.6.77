package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0LA  reason: invalid class name */
public final class AnonymousClass0LA extends C10440eF implements C15950oJ {
    public static final Parcelable.Creator CREATOR = new C08140aG();
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public AnonymousClass0LA(ArrayList arrayList, int i) {
        this.A00 = i;
        this.A02 = AnonymousClass001.A0J();
        this.A01 = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C04480Ku r0 = (C04480Ku) arrayList.get(i2);
            String str = r0.A02;
            int i3 = r0.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        ArrayList A0I = AnonymousClass001.A0I();
        HashMap hashMap = this.A02;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A0I.add(new C04480Ku(A0C, AnonymousClass000.A0I(hashMap.get(A0C))));
        }
        AnonymousClass0Z9.A0E(parcel, A0I, 2, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass0LA() {
        this.A00 = 1;
        this.A02 = AnonymousClass001.A0J();
        this.A01 = new SparseArray();
    }
}
