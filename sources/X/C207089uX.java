package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.9uX  reason: invalid class name and case insensitive filesystem */
public final class C207089uX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206079sg();
    public C206499tV A00;
    public final int A01;
    public final String A02;
    public final List A03;
    public final List A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C207089uX(List list) {
        this((C206499tV) null, "{}", list, (List) null, 0);
        AnonymousClass00C.A0D(list, 1);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207089uX) {
                C207089uX r5 = (C207089uX) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        Iterator A0o = C90474aD.A0o(parcel, this.A03);
        while (A0o.hasNext()) {
            ((C206569tc) A0o.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0o2 = C90474aD.A0o(parcel, list);
            while (A0o2.hasNext()) {
                parcel.writeParcelable((Parcelable) A0o2.next(), i);
            }
        }
        C206499tV r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r0.writeToParcel(parcel, i);
    }

    public final boolean A00() {
        String str = this.A02;
        if (str != null && AnonymousClass098.A06(str)) {
            return false;
        }
        try {
            return C36441kJ.A1C(str).has("limited_time_offer");
        } catch (JSONException e) {
            C90464aC.A1L("InteractiveMessageContent/isLimitedTimeOffer/invalid json=", str, AnonymousClass000.A0u(), e);
            return false;
        }
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A03, this.A01 * 31) + C36341k9.A09(this.A02)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeFlowContent(contentOfNfmSubtype=");
        A0u.append(this.A01);
        A0u.append(", buttons=");
        A0u.append(this.A03);
        A0u.append(", messageParamsJson=");
        A0u.append(this.A02);
        A0u.append(", formElements=");
        A0u.append(this.A04);
        A0u.append(", formState=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C207089uX(C206499tV r1, String str, List list, List list2, int i) {
        this.A01 = i;
        this.A03 = list;
        this.A02 = str;
        this.A04 = list2;
        this.A00 = r1;
    }
}
