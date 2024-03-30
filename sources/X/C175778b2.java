package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.8b2  reason: invalid class name and case insensitive filesystem */
public final class C175778b2 extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(39);
    public long A00;
    public AnonymousClass16X A01;
    public final LinkedHashSet A02;

    public int describeContents() {
        return 0;
    }

    public void A0F(C202159l8 r5, BigDecimal bigDecimal) {
        AnonymousClass16U r1;
        if (bigDecimal != null) {
            LinkedHashSet linkedHashSet = r5.A05;
            LinkedHashSet linkedHashSet2 = this.A02;
            if (linkedHashSet2 != null) {
                Iterator it = linkedHashSet2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r1 = (AnonymousClass16U) it.next();
                    if (linkedHashSet.contains(r1)) {
                        break;
                    }
                }
                this.A01 = new AnonymousClass16X(bigDecimal, ((AnonymousClass16V) r1).A01);
            }
            r1 = AnonymousClass16W.A06;
            this.A01 = new AnonymousClass16X(bigDecimal, ((AnonymousClass16V) r1).A01);
        }
    }

    public C175778b2(C202159l8 r1, LinkedHashSet linkedHashSet, int i, int i2) {
        this.A02 = linkedHashSet;
        C18740tg.A06(r1);
        this.A07 = r1;
        A0C(i);
        A0B(i2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ WALLET: ");
        A0u.append(super.toString());
        A0u.append(" balance: ");
        A0u.append(this.A01);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01.toString());
        LinkedHashSet linkedHashSet = this.A02;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass16U[] r0 = AnonymousClass16T.A01;
            ((AnonymousClass16U) it.next()).writeToParcel(parcel, i);
        }
    }

    public C175778b2(Parcel parcel) {
        A0D(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = C36441kJ.A17();
        for (int i = 0; i < readInt; i++) {
            this.A02.add(AnonymousClass16T.A00(parcel));
        }
        A0F(this.A07, C165617ti.A0b(readString));
    }
}
