package com.google.android.gms.auth.api.signin;

import X.AnonymousClass0Z9;
import X.C07980a0;
import X.C10440eF;
import X.C10470eI;
import X.C15960oK;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends C10440eF implements ReflectedParcelable {
    public static C15960oK A0D = C10470eI.A00;
    public static final Parcelable.Creator CREATOR = new C07980a0();
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = new HashSet();
    public final int A0C;

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A07.equals(this.A07)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.A0A);
                        hashSet.addAll(googleSignInAccount.A0B);
                        HashSet hashSet2 = new HashSet(this.A0A);
                        hashSet2.addAll(this.A0B);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A07.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.A0A);
        hashSet.addAll(this.A0B);
        return hashCode + hashSet.hashCode();
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A0C = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A0C);
        boolean A062 = C10440eF.A06(parcel, this.A02);
        AnonymousClass0Z9.A0C(parcel, this.A03, 3, A062);
        AnonymousClass0Z9.A0C(parcel, this.A04, 4, A062);
        AnonymousClass0Z9.A0C(parcel, this.A05, 5, A062);
        AnonymousClass0Z9.A0B(parcel, this.A01, 6, i, A062);
        AnonymousClass0Z9.A0C(parcel, this.A06, 7, A062);
        AnonymousClass0Z9.A09(parcel, 8, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A07, 9, A062);
        AnonymousClass0Z9.A0E(parcel, this.A0A, 10, A062);
        AnonymousClass0Z9.A0C(parcel, this.A08, 11, A062);
        AnonymousClass0Z9.A0C(parcel, this.A09, 12, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
