package com.google.android.gms.nearby.messages.internal;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C165587tf;
import X.C204809qb;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Locale;

public final class ClientAppContext extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C204809qb();
    public final int A00;
    @Deprecated
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof ClientAppContext) {
                    ClientAppContext clientAppContext = (ClientAppContext) obj;
                    String str = this.A02;
                    String str2 = clientAppContext.A02;
                    if (TextUtils.isEmpty(str)) {
                        equals = TextUtils.isEmpty(str2);
                    } else {
                        equals = str.equals(str2);
                    }
                    if (equals) {
                        String str3 = this.A03;
                        String str4 = clientAppContext.A03;
                        if (TextUtils.isEmpty(str3)) {
                            equals2 = TextUtils.isEmpty(str4);
                        } else {
                            equals2 = str3.equals(str4);
                        }
                        if (equals2 && this.A05 == clientAppContext.A05) {
                            String str5 = this.A04;
                            String str6 = clientAppContext.A04;
                            if (TextUtils.isEmpty(str5)) {
                                equals3 = TextUtils.isEmpty(str6);
                            } else {
                                equals3 = str5.equals(str6);
                            }
                            if (!equals3 || this.A01 != clientAppContext.A01) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1Z = C36431kI.A1Z(this.A02, 5);
        A1Z[1] = this.A03;
        C165587tf.A1X(A1Z, this.A05);
        A1Z[3] = this.A04;
        C36341k9.A1U(A1Z, this.A01);
        return Arrays.hashCode(A1Z);
    }

    public final String toString() {
        String str = this.A02;
        Locale locale = Locale.US;
        Object[] A1Z = C36431kI.A1Z(str, 5);
        A1Z[1] = this.A03;
        C165587tf.A1X(A1Z, this.A05);
        A1Z[3] = this.A04;
        C36341k9.A1U(A1Z, this.A01);
        return String.format(locale, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", A1Z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, i2);
        boolean A06 = C10440eF.A06(parcel, this.A02);
        AnonymousClass0Z9.A0C(parcel, this.A03, 3, A06);
        AnonymousClass0Z9.A0A(parcel, 4, this.A05);
        AnonymousClass0Z9.A08(parcel, 5, this.A01);
        AnonymousClass0Z9.A0C(parcel, this.A04, 6, A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public ClientAppContext(String str, String str2, String str3, int i, int i2, boolean z) {
        this.A00 = i;
        AnonymousClass006.A01(str);
        this.A02 = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Locale locale = Locale.US;
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(str2, "0p:", A0M);
            Log.w("NearbyMessages", String.format(locale, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", A0M));
            str2 = "0p:".concat(str2);
        }
        this.A03 = str2;
        this.A05 = z;
        this.A01 = i2;
        this.A04 = str3;
    }
}
