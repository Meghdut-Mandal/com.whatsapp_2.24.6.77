package com.google.android.gms.maps;

import X.AnonymousClass0UM;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C204789qZ;
import X.C90504aG;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C204789qZ();
    public int A00 = -1;
    public CameraPosition A01;
    public LatLngBounds A02 = null;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Float A0B = null;
    public Float A0C = null;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;

    public static Boolean A01(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static byte A00(Boolean bool) {
        if (bool != null) {
            return C90504aG.A1T(bool.booleanValue() ? 1 : 0) ? (byte) 1 : 0;
        }
        return -1;
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(Integer.valueOf(this.A00), "MapType");
        r2.A00(this.A09, "LiteMode");
        r2.A00(this.A01, "Camera");
        r2.A00(this.A04, "CompassEnabled");
        r2.A00(this.A03, "ZoomControlsEnabled");
        r2.A00(this.A05, "ScrollGesturesEnabled");
        r2.A00(this.A06, "ZoomGesturesEnabled");
        r2.A00(this.A07, "TiltGesturesEnabled");
        r2.A00(this.A08, "RotateGesturesEnabled");
        r2.A00(this.A0G, "ScrollGesturesEnabledDuringRotateOrZoom");
        r2.A00(this.A0A, "MapToolbarEnabled");
        r2.A00(this.A0F, "AmbientEnabled");
        r2.A00(this.A0B, "MinZoomPreference");
        r2.A00(this.A0C, "MaxZoomPreference");
        r2.A00(this.A02, "LatLngBoundsForCameraTarget");
        r2.A00(this.A0D, "ZOrderOnTop");
        r2.A00(this.A0E, "UseViewLifecycleInFragment");
        return r2.toString();
    }

    public GoogleMapOptions(CameraPosition cameraPosition, LatLngBounds latLngBounds, Float f, Float f2, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, int i) {
        this.A0D = A01(b);
        this.A0E = A01(b2);
        this.A00 = i;
        this.A01 = cameraPosition;
        this.A03 = A01(b3);
        this.A04 = A01(b4);
        this.A05 = A01(b5);
        this.A06 = A01(b6);
        this.A07 = A01(b7);
        this.A08 = A01(b8);
        this.A09 = A01(b9);
        this.A0A = A01(b10);
        this.A0F = A01(b11);
        this.A0B = f;
        this.A0C = f2;
        this.A02 = latLngBounds;
        this.A0G = A01(b12);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A05(parcel, A00(this.A0D), 2);
        AnonymousClass0Z9.A05(parcel, A00(this.A0E), 3);
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 5, i, false);
        AnonymousClass0Z9.A05(parcel, A00(this.A03), 6);
        AnonymousClass0Z9.A05(parcel, A00(this.A04), 7);
        AnonymousClass0Z9.A05(parcel, A00(this.A05), 8);
        AnonymousClass0Z9.A05(parcel, A00(this.A06), 9);
        AnonymousClass0Z9.A05(parcel, A00(this.A07), 10);
        AnonymousClass0Z9.A05(parcel, A00(this.A08), 11);
        AnonymousClass0Z9.A05(parcel, A00(this.A09), 12);
        AnonymousClass0Z9.A05(parcel, A00(this.A0A), 14);
        AnonymousClass0Z9.A05(parcel, A00(this.A0F), 15);
        Float f = this.A0B;
        if (f != null) {
            parcel.writeInt(262160);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A0C;
        if (f2 != null) {
            parcel.writeInt(262161);
            parcel.writeFloat(f2.floatValue());
        }
        AnonymousClass0Z9.A0B(parcel, this.A02, 18, i, false);
        AnonymousClass0Z9.A05(parcel, A00(this.A0G), 19);
        AnonymousClass0Z9.A07(parcel, A012);
    }

    public GoogleMapOptions() {
    }
}
