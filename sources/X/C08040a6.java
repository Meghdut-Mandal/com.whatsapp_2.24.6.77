package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.0a6  reason: invalid class name and case insensitive filesystem */
public final class C08040a6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = AnonymousClass0ZA.A0L(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) AnonymousClass0ZA.A0K(parcel, CursorWindow.CREATOR, readInt);
            } else if (c == 3) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 4) {
                bundle = AnonymousClass0ZA.A04(parcel, readInt);
            } else if (c != 1000) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        DataHolder dataHolder = new DataHolder(bundle, cursorWindowArr, strArr, i, i2);
        dataHolder.A01 = AnonymousClass001.A07();
        int i3 = 0;
        while (true) {
            String[] strArr2 = dataHolder.A08;
            if (i3 >= strArr2.length) {
                break;
            }
            dataHolder.A01.putInt(strArr2[i3], i3);
            i3++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.A07;
        int length = cursorWindowArr2.length;
        dataHolder.A03 = new int[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            dataHolder.A03[i5] = i4;
            i4 += cursorWindowArr2[i5].getNumRows() - (i4 - cursorWindowArr2[i5].getStartPosition());
        }
        dataHolder.A00 = i4;
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
