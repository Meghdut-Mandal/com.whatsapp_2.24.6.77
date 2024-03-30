package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Lq  reason: invalid class name and case insensitive filesystem */
public final class C04690Lq extends AnonymousClass0LH {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new C07800Zi();
    public int A00;
    public C04700Lr A01;
    public ArrayList A02;
    public final int A03;
    public final Set A04;

    public final /* synthetic */ Map A06() {
        return A05;
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A05 = A0J;
        A0J.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, new C04530Kz(C04710Ls.class, PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, 11, 11, 2, true, true));
        A0J.put("progress", new C04530Kz(C04700Lr.class, "progress", 11, 11, 4, false, false));
    }

    public final Object A04(C04530Kz r4) {
        int i = r4.A03;
        if (i == 1) {
            return Integer.valueOf(this.A03);
        }
        if (i == 2) {
            return this.A02;
        }
        if (i == 4) {
            return this.A01;
        }
        throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown SafeParcelable id=", AnonymousClass000.A0u(), i));
    }

    public final boolean A07(C04530Kz r3) {
        return AnonymousClass000.A1Z(this.A04, r3.A03);
    }

    public C04690Lq(C04700Lr r1, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A02 = arrayList;
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        Set set = this.A04;
        if (AnonymousClass000.A1Z(set, 1)) {
            AnonymousClass0Z9.A08(parcel, 1, this.A03);
        }
        if (AnonymousClass000.A1Z(set, 2)) {
            AnonymousClass0Z9.A0E(parcel, this.A02, 2, true);
        }
        if (AnonymousClass000.A1Z(set, 3)) {
            AnonymousClass0Z9.A08(parcel, 3, this.A00);
        }
        if (AnonymousClass000.A1Z(set, 4)) {
            AnonymousClass0Z9.A0B(parcel, this.A01, 4, i, true);
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04690Lq() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }
}
