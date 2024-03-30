package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0L0  reason: invalid class name */
public final class AnonymousClass0L0 extends C10440eF {
    public static final AnonymousClass0L0 A04 = new AnonymousClass0L0(0);
    public static final Parcelable.Creator CREATOR = new C08210aN();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public AnonymousClass0L0(int i, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i);
    }

    public AnonymousClass0L0(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public boolean A00() {
        return (this.A01 == 0 || this.A02 == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass0L0) {
                AnonymousClass0L0 r5 = (AnonymousClass0L0) obj;
                if (this.A01 != r5.A01 || !AnonymousClass0QM.A00(this.A02, r5.A02) || !AnonymousClass0QM.A00(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1J(objArr, this.A01);
        objArr[1] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 2);
    }

    public String toString() {
        String str;
        AnonymousClass0UM r3 = new AnonymousClass0UM(this);
        int i = this.A01;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case 22:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case 23:
                            str = "API_DISABLED";
                            break;
                        case 24:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("UNKNOWN_ERROR_CODE(");
                            A0u.append(i);
                            str = AnonymousClass000.A0q(")", A0u);
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        r3.A00(str, "statusCode");
        r3.A00(this.A02, "resolution");
        r3.A00(this.A03, "message");
        return r3.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A03, 4, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass0L0(int i) {
        this((PendingIntent) null, (String) null, 1, i);
    }
}
