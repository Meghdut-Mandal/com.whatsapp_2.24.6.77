package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ty  reason: invalid class name and case insensitive filesystem */
public final class C206789ty implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205559rq();
    public final C206599tf A00;
    public final C206709tq A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206789ty) {
                C206789ty r5 = (C206789ty) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C206599tf r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C206709tq r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((((((((C36341k9.A09(this.A03) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A05)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C206789ty(C206599tf r1, C206709tq r2, Boolean bool, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessComplianceDetail(entityName=");
        A0u.append(this.A03);
        A0u.append(", entityType=");
        A0u.append(this.A04);
        A0u.append(", entityTypeCustom=");
        A0u.append(this.A05);
        A0u.append(", isRegistered=");
        A0u.append(this.A02);
        A0u.append(", businessCustomerCareDetails=");
        A0u.append(this.A00);
        A0u.append(", businessGrievanceOfficerDetails=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
