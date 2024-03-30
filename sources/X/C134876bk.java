package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bk  reason: invalid class name and case insensitive filesystem */
public final class C134876bk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134416b0();
    public final int A00;
    public final C135086c7 A01;

    public C134876bk(C135086c7 r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public final Object A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        Number number = (Number) C131886Rd.A00.get();
        int i = this.A00;
        if (number == null || number.intValue() != i) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid policyId =");
            A0u.append(number);
            throw new C1511378j(AnonymousClass000.A0q(". All calls to unwrapSensitiveValueFor() should be enclosed within PolicyZone enclosure and specified with the same policyid that this object was wrapped with", A0u));
        }
        C117795mq r0 = (C117795mq) C36371kC.A0r(C113355fP.A00, i);
        if (r0 != null && r0.A00.contains(str)) {
            return this.A01.A00;
        }
        throw new C1511378j(AnonymousClass000.A0p("Purpose policy does not allow data to be extracted for purpose ", str, AnonymousClass000.A0u()));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.purpose.PurposeEnforcedObject<*>");
                C134876bk r5 = (C134876bk) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return "***";
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }
}
