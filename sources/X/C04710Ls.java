package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ls  reason: invalid class name and case insensitive filesystem */
public final class C04710Ls extends AnonymousClass0LH {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new C07820Zk();
    public C04720Lt A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    public final /* synthetic */ Map A06() {
        return A06;
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A06 = A0J;
        A0J.put("authenticatorInfo", new C04530Kz(C04720Lt.class, "authenticatorInfo", 11, 11, 2, false, false));
        A0J.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, new C04530Kz((Class) null, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, 7, 7, 3, false, false));
        A0J.put("package", new C04530Kz((Class) null, "package", 7, 7, 4, false, false));
    }

    public final Object A04(C04530Kz r4) {
        int i = r4.A03;
        if (i == 1) {
            return Integer.valueOf(this.A04);
        }
        if (i == 2) {
            return this.A00;
        }
        if (i == 3) {
            return this.A01;
        }
        if (i == 4) {
            return this.A02;
        }
        throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown SafeParcelable id=", AnonymousClass000.A0u(), i));
    }

    public final boolean A07(C04530Kz r3) {
        return AnonymousClass000.A1Z(this.A05, r3.A03);
    }

    public C04710Ls(C04720Lt r1, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        Set set = this.A05;
        if (AnonymousClass000.A1Z(set, 1)) {
            AnonymousClass0Z9.A08(parcel, 1, this.A04);
        }
        if (AnonymousClass000.A1Z(set, 2)) {
            AnonymousClass0Z9.A0B(parcel, this.A00, 2, i, true);
        }
        if (AnonymousClass000.A1Z(set, 3)) {
            AnonymousClass0Z9.A0C(parcel, this.A01, 3, true);
        }
        if (AnonymousClass000.A1Z(set, 4)) {
            AnonymousClass0Z9.A0C(parcel, this.A02, 4, true);
        }
        if (AnonymousClass000.A1Z(set, 5)) {
            AnonymousClass0Z9.A0C(parcel, this.A03, 5, true);
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04710Ls() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
