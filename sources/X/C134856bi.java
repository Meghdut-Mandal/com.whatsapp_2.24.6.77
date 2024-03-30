package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6bi  reason: invalid class name and case insensitive filesystem */
public final class C134856bi implements Parcelable {
    public static final AnonymousClass5SO A0B = AnonymousClass5SO.LARGE;
    public static final Parcelable.Creator CREATOR = new C134336as();
    public final C134636bM A00;
    public final C134636bM A01;
    public final C134816be A02;
    public final C134566bF A03;
    public final AnonymousClass5SO A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C134706bT[] A09;
    public final String A0A;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134856bi) {
                C134856bi r5 = (C134856bi) obj;
                if (!AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04.name());
        C134816be r0 = this.A02;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C134706bT[] r3 = this.A09;
        int length = r3.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            r3[i2].writeToParcel(parcel, i);
        }
        C134566bF r02 = this.A03;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i);
        }
        this.A00.writeToParcel(parcel, i);
        C134636bM r03 = this.A01;
        if (r03 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r03.writeToParcel(parcel, i);
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A0A, C36421kH.A04(this.A07));
        return C36351kA.A05(this.A00, (((((((((((C36351kA.A05(this.A04, A082) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A06)) * 31) + Arrays.hashCode(this.A09)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + C36411kG.A09(this.A01);
    }

    public C134856bi(C134636bM r2, C134636bM r3, C134816be r4, C134566bF r5, AnonymousClass5SO r6, String str, String str2, String str3, String str4, String str5, C134706bT[] r12) {
        C36321k7.A11(str, str2, r6);
        AnonymousClass00C.A0D(r12, 8);
        AnonymousClass00C.A0D(r2, 10);
        this.A07 = str;
        this.A0A = str2;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A09 = r12;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosurePrompt(name=");
        A0u.append(this.A07);
        A0u.append(", template=");
        A0u.append(this.A0A);
        A0u.append(", height=");
        A0u.append(this.A04);
        A0u.append(", headIcon=");
        A0u.append(this.A02);
        A0u.append(", title=");
        A0u.append(this.A08);
        A0u.append(", body=");
        A0u.append(this.A05);
        A0u.append(", footer=");
        A0u.append(this.A06);
        A0u.append(", bullets=");
        C90514aH.A1T(A0u, this.A09);
        A0u.append(", navBar=");
        A0u.append(this.A03);
        A0u.append(", primaryButton=");
        A0u.append(this.A00);
        A0u.append(", secondaryButton=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
