package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Km  reason: invalid class name and case insensitive filesystem */
public final class C04400Km extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07850Zn();
    public final int A00;
    public final C04390Kl A01;
    public final AnonymousClass0KV A02;
    public final C04290Kb A03;
    public final AnonymousClass0KH A04;
    public final String A05;
    public final boolean A06;

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A04;
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A05;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A06), objArr, 5);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04400Km) {
            C04400Km r4 = (C04400Km) obj;
            if (!AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A05, r4.A05) || this.A06 != r4.A06 || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04400Km(C04390Kl r3, AnonymousClass0KV r4, C04290Kb r5, AnonymousClass0KH r6, String str, int i, boolean z) {
        AnonymousClass006.A01(r6);
        this.A04 = r6;
        AnonymousClass006.A01(r3);
        this.A01 = r3;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        if (r5 == null) {
            new AnonymousClass0QG();
            r5 = new C04290Kb((byte[]) null, (String) null, false);
        }
        this.A03 = r5;
        if (r4 == null) {
            new AnonymousClass0QF();
            r4 = new AnonymousClass0KV(false, (String) null);
        }
        this.A02 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A04, 1, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A05, 3, false);
        AnonymousClass0Z9.A0A(parcel, 4, this.A06);
        AnonymousClass0Z9.A08(parcel, 5, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A03, 6, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 7, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
