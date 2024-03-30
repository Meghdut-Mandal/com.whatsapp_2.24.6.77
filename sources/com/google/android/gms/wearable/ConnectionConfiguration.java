package com.google.android.gms.wearable;

import X.AnonymousClass000;
import X.AnonymousClass0QM;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C165567td;
import X.C205419rc;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C90484aE;
import X.C90524aI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ConnectionConfiguration extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C205419rc();
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public volatile String A08;
    public volatile boolean A09;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        C36331k8.A1V(objArr, this.A03);
        C36341k9.A1T(objArr, this.A04);
        objArr[4] = Boolean.valueOf(this.A07);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A02), objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            if (!AnonymousClass0QM.A00(this.A05, connectionConfiguration.A05) || !AnonymousClass0QM.A00(this.A06, connectionConfiguration.A06) || !AnonymousClass0QM.A00(Integer.valueOf(this.A03), Integer.valueOf(connectionConfiguration.A03)) || !AnonymousClass0QM.A00(Integer.valueOf(this.A04), Integer.valueOf(connectionConfiguration.A04)) || !AnonymousClass0QM.A00(Boolean.valueOf(this.A07), Boolean.valueOf(connectionConfiguration.A07)) || !AnonymousClass0QM.A00(Boolean.valueOf(this.A02), Boolean.valueOf(connectionConfiguration.A02))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder A0i = C90524aI.A0i("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A05);
        if (valueOf.length() != 0) {
            str = "Name=".concat(valueOf);
        } else {
            str = new String("Name=");
        }
        A0i.append(str);
        A0i.append(C90484aE.A0n(String.valueOf(this.A06), ", Address="));
        A0i.append(AnonymousClass000.A0r(", Type=", C90524aI.A0h(18), this.A03));
        A0i.append(AnonymousClass000.A0r(", Role=", C90524aI.A0h(18), this.A04));
        A0i.append(C36371kC.A0z(", Enabled=", C90524aI.A0h(15), this.A07));
        A0i.append(C36371kC.A0z(", IsConnected=", C90524aI.A0h(19), this.A09));
        A0i.append(C90484aE.A0n(String.valueOf(this.A08), ", PeerNodeId="));
        A0i.append(C36371kC.A0z(", BtlePriority=", C90524aI.A0h(20), this.A02));
        A0i.append(C90484aE.A0n(String.valueOf(this.A00), ", NodeId="));
        return C165567td.A0Y(C90484aE.A0n(String.valueOf(this.A01), ", PackageName="), A0i);
    }

    public ConnectionConfiguration(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = str3;
        this.A02 = z3;
        this.A00 = str4;
        this.A01 = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A062 = C10440eF.A06(parcel, this.A05);
        AnonymousClass0Z9.A0C(parcel, this.A06, 3, A062);
        AnonymousClass0Z9.A08(parcel, 4, this.A03);
        AnonymousClass0Z9.A08(parcel, 5, this.A04);
        AnonymousClass0Z9.A0A(parcel, 6, this.A07);
        AnonymousClass0Z9.A0A(parcel, 7, this.A09);
        AnonymousClass0Z9.A0C(parcel, this.A08, 8, A062);
        AnonymousClass0Z9.A0A(parcel, 9, this.A02);
        AnonymousClass0Z9.A0C(parcel, this.A00, 10, A062);
        AnonymousClass0Z9.A0C(parcel, this.A01, 11, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
