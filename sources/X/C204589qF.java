package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: X.9qF  reason: invalid class name and case insensitive filesystem */
public final class C204589qF implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) AnonymousClass0ZA.A06(parcel, ParcelFileDescriptor.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        C170178Cg r2 = new C170178Cg(parcelFileDescriptor);
        ParcelFileDescriptor parcelFileDescriptor2 = r2.A00;
        if (parcelFileDescriptor2 != null) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor2));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                C170178Cg.A00(dataInputStream);
                r2.A01 = bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                C170178Cg.A00(dataInputStream);
                throw th;
            }
        }
        return r2;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C170178Cg[i];
    }
}
