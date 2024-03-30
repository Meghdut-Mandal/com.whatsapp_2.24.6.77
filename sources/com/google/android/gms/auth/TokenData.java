package com.google.android.gms.auth;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0QM;
import X.AnonymousClass0Z9;
import X.C08010a3;
import X.C10440eF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public class TokenData extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C08010a3();
    public final int A00;
    public final String A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = Boolean.valueOf(this.A05);
        objArr[3] = Boolean.valueOf(this.A06);
        objArr[4] = this.A04;
        return AnonymousClass000.A0M(this.A03, objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (!TextUtils.equals(this.A01, tokenData.A01) || !AnonymousClass0QM.A00(this.A02, tokenData.A02) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !AnonymousClass0QM.A00(this.A04, tokenData.A04) || !AnonymousClass0QM.A00(this.A03, tokenData.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        AnonymousClass006.A03(str);
        this.A01 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        boolean A062 = C10440eF.A06(parcel, this.A01);
        Long l = this.A02;
        if (l != null) {
            parcel.writeInt(524291);
            parcel.writeLong(l.longValue());
        }
        AnonymousClass0Z9.A0A(parcel, 4, this.A05);
        AnonymousClass0Z9.A0A(parcel, 5, this.A06);
        AnonymousClass0Z9.A0D(parcel, this.A04, 6);
        AnonymousClass0Z9.A0C(parcel, this.A03, 7, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
