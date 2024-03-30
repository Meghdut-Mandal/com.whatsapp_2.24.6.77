package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6c2  reason: invalid class name and case insensitive filesystem */
public final class C135046c2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133896aA();
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Integer A07;

    public static void A00(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(number.intValue());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135046c2) {
                C135046c2 r5 = (C135046c2) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        A00(parcel, this.A03);
        A00(parcel, this.A01);
        parcel.writeString(this.A05);
        List list = this.A06;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0o = C90474aD.A0o(parcel, list);
            while (A0o.hasNext()) {
                parcel.writeValue(A0o.next());
            }
        }
        parcel.writeInt(this.A00);
        A00(parcel, this.A02);
        A00(parcel, this.A07);
    }

    public int hashCode() {
        return (((((((((((((C36341k9.A09(this.A04) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A09(this.A05)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A07);
    }

    public C135046c2(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list, int i) {
        this.A04 = str;
        this.A03 = num;
        this.A01 = num2;
        this.A05 = str2;
        this.A06 = list;
        this.A00 = i;
        this.A02 = num3;
        this.A07 = num4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageDialogState(dialogTag=");
        A0u.append(this.A04);
        A0u.append(", titleStringRes=");
        A0u.append(this.A03);
        A0u.append(", messageStringRes=");
        A0u.append(this.A01);
        A0u.append(", messageString=");
        A0u.append(this.A05);
        A0u.append(", messageResFormatArgs=");
        A0u.append(this.A06);
        A0u.append(", positiveActionStringRes=");
        A0u.append(this.A00);
        A0u.append(", negativeActionStringRes=");
        A0u.append(this.A02);
        A0u.append(", negativeActionColorRes=");
        return AnonymousClass000.A0m(this.A07, A0u);
    }

    public C135046c2() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) null, R.string.f12nameremoved);
    }
}
