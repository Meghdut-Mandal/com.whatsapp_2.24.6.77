package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.0LT  reason: invalid class name */
public class AnonymousClass0LT extends AnonymousClass0K0 {
    public static final Parcelable.Creator CREATOR = new C08510ar();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1J(objArr, Arrays.hashCode(this.A00));
        AnonymousClass000.A1K(objArr, Arrays.hashCode(this.A01));
        objArr[2] = Integer.valueOf(Arrays.hashCode(this.A02));
        objArr[3] = Integer.valueOf(Arrays.hashCode(this.A03));
        return AnonymousClass000.A0M(Integer.valueOf(Arrays.hashCode(this.A04)), objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0LT) {
            AnonymousClass0LT r4 = (AnonymousClass0LT) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01) || !Arrays.equals(this.A02, r4.A02) || !Arrays.equals(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0LT(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AnonymousClass006.A01(bArr);
        this.A00 = bArr;
        AnonymousClass006.A01(bArr2);
        this.A01 = bArr2;
        AnonymousClass006.A01(bArr3);
        this.A02 = bArr3;
        AnonymousClass006.A01(bArr4);
        this.A03 = bArr4;
        this.A04 = bArr5;
    }

    public String toString() {
        AnonymousClass0UO r2 = new AnonymousClass0UO(getClass().getSimpleName());
        AnonymousClass0X2 r3 = AnonymousClass0X2.A00;
        byte[] bArr = this.A00;
        r2.A00(r3.A00(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.A01;
        r2.A00(r3.A00(bArr2, bArr2.length), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        byte[] bArr3 = this.A02;
        r2.A00(r3.A00(bArr3, bArr3.length), PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA);
        byte[] bArr4 = this.A03;
        r2.A00(r3.A00(bArr4, bArr4.length), PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        byte[] bArr5 = this.A04;
        if (bArr5 != null) {
            r2.A00(r3.A00(bArr5, bArr5.length), PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE);
        }
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A00, 2, false);
        AnonymousClass0Z9.A0F(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A0F(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A0F(parcel, this.A03, 5, false);
        AnonymousClass0Z9.A0F(parcel, this.A04, 6, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
