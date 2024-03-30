package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.0Ig  reason: invalid class name and case insensitive filesystem */
public class C03880Ig extends AnonymousClass0XJ {
    public int A00;
    public int A01;
    public int A02;
    public final Parcel A03;
    public final SparseIntArray A04;
    public final int A05;
    public final int A06;
    public final String A07;

    public C03880Ig(Parcel parcel) {
        this(parcel, new AnonymousClass008(), new AnonymousClass008(), new AnonymousClass008(), "", parcel.dataPosition(), parcel.dataSize());
    }

    public C03880Ig A03() {
        Parcel parcel = this.A03;
        int dataPosition = parcel.dataPosition();
        int i = this.A02;
        if (i == this.A06) {
            i = this.A05;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A07);
        return new C03880Ig(parcel, this.A00, this.A01, this.A02, AnonymousClass000.A0q("  ", A0u), dataPosition, i);
    }

    public void A05(int i) {
        int i2 = this.A00;
        if (i2 >= 0) {
            int i3 = this.A04.get(i2);
            Parcel parcel = this.A03;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.A00 = i;
        SparseIntArray sparseIntArray = this.A04;
        Parcel parcel2 = this.A03;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public boolean A09(int i) {
        while (true) {
            int i2 = this.A02;
            int i3 = this.A05;
            int i4 = this.A01;
            if (i2 < i3) {
                if (i4 == i) {
                    return true;
                }
                if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                Parcel parcel = this.A03;
                parcel.setDataPosition(i2);
                int readInt = parcel.readInt();
                this.A01 = parcel.readInt();
                this.A02 += readInt;
            } else if (i4 != i) {
                return false;
            } else {
                return true;
            }
        }
    }

    public C03880Ig(Parcel parcel, AnonymousClass008 r3, AnonymousClass008 r4, AnonymousClass008 r5, String str, int i, int i2) {
        super(r3, r4, r5);
        this.A04 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = parcel;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
