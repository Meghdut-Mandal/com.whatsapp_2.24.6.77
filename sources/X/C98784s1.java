package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.zzw;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4s1  reason: invalid class name and case insensitive filesystem */
public final class C98784s1 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204669qN();
    public AnonymousClass8C3 A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public static zzw A00(C07590Yl r4, List list) {
        C98784s1 r2 = new C98784s1((AnonymousClass8C3) null, list, false, false);
        C07180Wq r1 = new C07180Wq((AnonymousClass0OR) null);
        r1.A01 = new A3J(r2);
        r1.A00 = 2426;
        zzw A012 = C07590Yl.A01(r4, r1.A00(), 0);
        AnonymousClass00C.A08(A012);
        return A012;
    }

    public C98784s1(AnonymousClass8C3 r1, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = r1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0E(parcel, Collections.unmodifiableList(this.A01), 1, false);
        AnonymousClass0Z9.A0A(parcel, 2, this.A02);
        AnonymousClass0Z9.A0A(parcel, 3, this.A03);
        AnonymousClass0Z9.A0B(parcel, this.A00, 5, i, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
