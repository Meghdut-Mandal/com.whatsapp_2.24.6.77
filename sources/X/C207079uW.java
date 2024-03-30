package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9uW  reason: invalid class name and case insensitive filesystem */
public final class C207079uW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205659s0();
    public final int A00;
    public final int A01;
    public final C207119ua A02;
    public final C207119ua A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207079uW) {
                C207079uW r5 = (C207079uW) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public C203399nx A00() {
        ArrayList A0I = AnonymousClass001.A0I();
        C165587tf.A1N("max_count", A0I, this.A00);
        C165587tf.A1N("selected_count", A0I, this.A01);
        ArrayList A0I2 = AnonymousClass001.A0I();
        C207119ua r1 = this.A02;
        if (r1 != null) {
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[3];
            String A002 = C207119ua.A00(r1, r2);
            AnonymousClass00C.A08(A002);
            C36351kA.A1N("currency", A002, r2);
            C203399nx.A0B(C203399nx.A04("money", r2), "due_amount", A0I2, new AnonymousClass1AL[0]);
        }
        C207119ua r12 = this.A03;
        if (r12 != null) {
            AnonymousClass1AL[] r22 = new AnonymousClass1AL[3];
            String A003 = C207119ua.A00(r12, r22);
            AnonymousClass00C.A08(A003);
            C36351kA.A1N("currency", A003, r22);
            C203399nx.A0B(C203399nx.A04("money", r22), "interest", A0I2, new AnonymousClass1AL[0]);
        }
        return C203399nx.A05("installment", C165577te.A1a(A0I, 0), C165577te.A1b(A0I2, 0));
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03);
    }

    public C207079uW(C207119ua r1, C207119ua r2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InstallmentTransactionData(maxOrderInstallmentCount=");
        A0u.append(this.A00);
        A0u.append(", selectedCount=");
        A0u.append(this.A01);
        A0u.append(", dueAmount=");
        A0u.append(this.A02);
        A0u.append(", interest=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
