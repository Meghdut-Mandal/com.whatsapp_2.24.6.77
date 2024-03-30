package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.9qG  reason: invalid class name and case insensitive filesystem */
public final class C204599qG implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        byte[] bArr = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        C170178Cg r7 = null;
        String str2 = null;
        String str3 = null;
        long j4 = -1;
        int i = 0;
        boolean z = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    j = AnonymousClass0ZA.A03(parcel2, readInt);
                    break;
                case 2:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 3:
                    bArr = AnonymousClass0ZA.A0I(parcel2, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) AnonymousClass0ZA.A06(parcel2, ParcelFileDescriptor.CREATOR, readInt);
                    break;
                case 5:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 6:
                    j4 = AnonymousClass0ZA.A03(parcel2, readInt);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) AnonymousClass0ZA.A06(parcel2, ParcelFileDescriptor.CREATOR, readInt);
                    break;
                case 8:
                    uri = (Uri) AnonymousClass0ZA.A06(parcel2, Uri.CREATOR, readInt);
                    break;
                case 9:
                    j2 = AnonymousClass0ZA.A03(parcel2, readInt);
                    break;
                case 10:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 11:
                    r7 = (C170178Cg) AnonymousClass0ZA.A06(parcel2, C170178Cg.CREATOR, readInt);
                    break;
                case 12:
                    j3 = AnonymousClass0ZA.A03(parcel2, readInt);
                    break;
                case 13:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 14:
                    str3 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new C170138Cc(uri, parcelFileDescriptor, parcelFileDescriptor2, r7, str, str2, str3, bArr, i, j, j4, j2, j3, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C170138Cc[i];
    }
}
