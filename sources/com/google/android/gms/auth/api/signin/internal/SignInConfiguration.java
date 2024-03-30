package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass006;
import X.AnonymousClass0Z9;
import X.C06370Ti;
import X.C07970Zz;
import X.C10440eF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C07970Zz();
    public final GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        C06370Ti r1 = new C06370Ti();
        r1.A00(this.A01);
        r1.A00(this.A00);
        return r1.A00;
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        AnonymousClass006.A03(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 5, i, C10440eF.A06(parcel, this.A01));
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
