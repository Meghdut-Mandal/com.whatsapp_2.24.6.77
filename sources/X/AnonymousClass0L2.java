package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.0L2  reason: invalid class name */
public final class AnonymousClass0L2 extends C10440eF implements C16780q5 {
    public static final Parcelable.Creator CREATOR = new C08660b6();
    public final String A00;
    public final List A01;

    public final Status BHx() {
        if (this.A00 != null) {
            return Status.A09;
        }
        return Status.A05;
    }

    public AnonymousClass0L2(String str, List list) {
        this.A01 = list;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0D(parcel, this.A01, 1);
        AnonymousClass0Z9.A0C(parcel, this.A00, 2, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
