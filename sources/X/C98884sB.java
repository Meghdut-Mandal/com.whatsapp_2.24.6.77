package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4sB  reason: invalid class name and case insensitive filesystem */
public final class C98884sB extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204759qW();
    public float A00 = 0.5f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.5f;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public float A06;
    public C115075iI A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D = false;

    public C98884sB(IBinder iBinder, LatLng latLng, String str, String str2, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2, boolean z3) {
        C115075iI r1;
        this.A08 = latLng;
        this.A09 = str;
        this.A0A = str2;
        if (iBinder == null) {
            r1 = null;
        } else {
            r1 = new C115075iI(AnonymousClass0MR.A01(iBinder));
        }
        this.A07 = r1;
        this.A00 = f;
        this.A01 = f2;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A08, 2, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A09, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A0A, 4, false);
        C115075iI r0 = this.A07;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.A00.asBinder();
        }
        AnonymousClass0Z9.A04(asBinder, parcel, 5);
        AnonymousClass0Z9.A06(parcel, this.A00, 6);
        AnonymousClass0Z9.A06(parcel, this.A01, 7);
        AnonymousClass0Z9.A0A(parcel, 8, this.A0B);
        AnonymousClass0Z9.A0A(parcel, 9, this.A0C);
        AnonymousClass0Z9.A0A(parcel, 10, this.A0D);
        AnonymousClass0Z9.A06(parcel, this.A02, 11);
        AnonymousClass0Z9.A06(parcel, this.A03, 12);
        AnonymousClass0Z9.A06(parcel, this.A04, 13);
        AnonymousClass0Z9.A06(parcel, this.A05, 14);
        AnonymousClass0Z9.A06(parcel, this.A06, 15);
        AnonymousClass0Z9.A07(parcel, A012);
    }

    public C98884sB() {
    }
}
