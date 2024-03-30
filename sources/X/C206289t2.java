package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9t2  reason: invalid class name and case insensitive filesystem */
public class C206289t2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(37);
    public final C202319lY A00;

    public int describeContents() {
        return 0;
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        C202319lY r3 = this.A00;
        parcel.writeInt(r3.A03);
        parcel.writeInt(r3.A02);
        parcel.writeLong(r3.A06);
        parcel.writeString(r3.A0I);
        AnonymousClass16X r0 = r3.A08;
        if (r0 != null) {
            i2 = r0.A00.scale();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        AnonymousClass16X r02 = r3.A08;
        if (r02 != null) {
            str = r02.A00.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(r3.A0K);
        UserJid userJid = r3.A0E;
        if (userJid == null) {
            str2 = null;
        } else {
            str2 = userJid.getRawString();
        }
        parcel.writeString(str2);
        UserJid userJid2 = r3.A0D;
        if (userJid2 == null) {
            str3 = null;
        } else {
            str3 = userJid2.getRawString();
        }
        parcel.writeString(str3);
        parcel.writeString(r3.A0L);
        parcel.writeString(r3.A0H);
        parcel.writeString(r3.A0J);
        parcel.writeString(r3.A0F);
        ArrayList arrayList = r3.A0N;
        if (arrayList != null) {
            ArrayList A0v = C36401kF.A0v(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0v.add(new C206329t8((AnonymousClass9K8) it.next()));
            }
            parcel.writeList(A0v);
        } else {
            parcel.writeList((List) null);
        }
        parcel.writeString(AnonymousClass143.A03(r3.A0C));
        int i3 = 1;
        parcel.writeInt(AnonymousClass000.A1P(r3.A0Q ? 1 : 0) ? 1 : 0);
        parcel.writeLong(r3.A05);
        parcel.writeString(r3.A0M);
        parcel.writeString(r3.A0G);
        parcel.writeInt(r3.A04);
        if (!r3.A0P) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeParcelable(r3.A0B, 0);
        parcel.writeInt(r3.A00);
        byte[] bArr = r3.A0R;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(r3.A0R);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(r3.A01);
        parcel.writeParcelable(r3.A0A, 0);
        AnonymousClass16U r1 = r3.A07;
        AnonymousClass16U[] r03 = AnonymousClass16T.A01;
        r1.writeToParcel(parcel, i);
    }

    public C206289t2(C202319lY r1) {
        this.A00 = r1;
    }
}
