package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.0a0  reason: invalid class name and case insensitive filesystem */
public final class C07980a0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 2:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 4:
                    str3 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 5:
                    str4 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) AnonymousClass0ZA.A06(parcel2, Uri.CREATOR, readInt);
                    break;
                case 7:
                    str5 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 8:
                    j = AnonymousClass0ZA.A03(parcel2, readInt);
                    break;
                case 9:
                    str6 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 10:
                    arrayList = AnonymousClass0ZA.A0B(parcel2, Scope.CREATOR, readInt);
                    break;
                case 11:
                    str7 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 12:
                    str8 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new GoogleSignInAccount(uri, str, str2, str3, str4, str5, str6, str7, str8, arrayList, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
