package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Kv  reason: invalid class name and case insensitive filesystem */
public final class C04490Kv extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08190aL();
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public C04490Kv(String str, Map map) {
        ArrayList A0I;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A0I = null;
        } else {
            A0I = AnonymousClass001.A0I();
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C = AnonymousClass001.A0C(A10);
                A0I.add(new C04500Kw((C04530Kz) map.get(A0C), A0C));
            }
        }
        this.A02 = A0I;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0E(parcel, this.A02, 3, C10440eF.A06(parcel, this.A01));
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04490Kv(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }
}
