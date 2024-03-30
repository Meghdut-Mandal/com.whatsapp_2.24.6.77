package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Lt  reason: invalid class name and case insensitive filesystem */
public final class C04720Lt extends AnonymousClass0LH {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new C07830Zl();
    public int A00;
    public PendingIntent A01;
    public AnonymousClass0KA A02;
    public String A03;
    public byte[] A04;
    public final int A05;
    public final Set A06;

    public final /* synthetic */ Map A06() {
        return A07;
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A07 = A0J;
        A0J.put("accountType", new C04530Kz((Class) null, "accountType", 7, 7, 2, false, false));
        A0J.put("status", new C04530Kz((Class) null, "status", 0, 0, 3, false, false));
        A0J.put("transferBytes", new C04530Kz((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public final Object A04(C04530Kz r4) {
        int i = r4.A03;
        if (i == 1) {
            return Integer.valueOf(this.A05);
        }
        if (i == 2) {
            return this.A03;
        }
        if (i == 3) {
            return Integer.valueOf(this.A00);
        }
        if (i == 4) {
            return this.A04;
        }
        throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown SafeParcelable id=", AnonymousClass000.A0u(), i));
    }

    public final boolean A07(C04530Kz r3) {
        return AnonymousClass000.A1Z(this.A06, r3.A03);
    }

    public C04720Lt(PendingIntent pendingIntent, AnonymousClass0KA r2, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = bArr;
        this.A01 = pendingIntent;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        Set set = this.A06;
        if (AnonymousClass000.A1Z(set, 1)) {
            AnonymousClass0Z9.A08(parcel, 1, this.A05);
        }
        if (AnonymousClass000.A1Z(set, 2)) {
            AnonymousClass0Z9.A0C(parcel, this.A03, 2, true);
        }
        if (AnonymousClass000.A1Z(set, 3)) {
            AnonymousClass0Z9.A08(parcel, 3, this.A00);
        }
        if (AnonymousClass000.A1Z(set, 4)) {
            AnonymousClass0Z9.A0F(parcel, this.A04, 4, true);
        }
        if (AnonymousClass000.A1Z(set, 5)) {
            AnonymousClass0Z9.A0B(parcel, this.A01, 5, i, true);
        }
        if (AnonymousClass000.A1Z(set, 6)) {
            AnonymousClass0Z9.A0B(parcel, this.A02, 6, i, true);
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04720Lt() {
        this.A06 = new C000000a(3);
        this.A05 = 1;
    }
}
