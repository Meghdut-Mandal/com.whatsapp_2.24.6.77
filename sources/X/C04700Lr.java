package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Lr  reason: invalid class name and case insensitive filesystem */
public final class C04700Lr extends AnonymousClass0LH {
    public static final AnonymousClass008 A06;
    public static final Parcelable.Creator CREATOR = new C07810Zj();
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    public final Map A06() {
        return A06;
    }

    public final boolean A07(C04530Kz r2) {
        return true;
    }

    static {
        AnonymousClass008 r2 = new AnonymousClass008();
        A06 = r2;
        r2.put("registered", C04530Kz.A00("registered", 2));
        r2.put("in_progress", C04530Kz.A00("in_progress", 3));
        r2.put("success", C04530Kz.A00("success", 4));
        r2.put("failed", C04530Kz.A00("failed", 5));
        r2.put("escrowed", C04530Kz.A00("escrowed", 6));
    }

    public final Object A04(C04530Kz r4) {
        int i = r4.A03;
        switch (i) {
            case 1:
                return Integer.valueOf(this.A05);
            case 2:
                return this.A00;
            case 3:
                return this.A01;
            case 4:
                return this.A02;
            case 5:
                return this.A03;
            case 6:
                return this.A04;
            default:
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown SafeParcelable id=", AnonymousClass000.A0u(), i));
        }
    }

    public C04700Lr(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A05);
        AnonymousClass0Z9.A0D(parcel, this.A00, 2);
        AnonymousClass0Z9.A0D(parcel, this.A01, 3);
        AnonymousClass0Z9.A0D(parcel, this.A02, 4);
        AnonymousClass0Z9.A0D(parcel, this.A03, 5);
        AnonymousClass0Z9.A0D(parcel, this.A04, 6);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04700Lr() {
        this.A05 = 1;
    }
}
