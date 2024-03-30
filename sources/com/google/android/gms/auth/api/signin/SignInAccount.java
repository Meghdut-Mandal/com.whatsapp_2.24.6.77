package com.google.android.gms.auth.api.signin;

import X.AnonymousClass006;
import X.AnonymousClass0Z9;
import X.C08000a2;
import X.C10440eF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C08000a2();
    @Deprecated
    public final String A00;
    @Deprecated
    public final String A01;
    public final GoogleSignInAccount A02;

    public SignInAccount(GoogleSignInAccount googleSignInAccount, String str, String str2) {
        this.A02 = googleSignInAccount;
        AnonymousClass006.A05(str, "8.3 and 8.4 SDKs require non-null email");
        this.A00 = str;
        AnonymousClass006.A05(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A00, 4, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 7, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 8, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
