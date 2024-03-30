package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.6af  reason: invalid class name and case insensitive filesystem */
public final class C134206af implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        File A0S;
        File A0S2;
        AnonymousClass00C.A0D(parcel, 0);
        Class<C134866bj> cls = C134866bj.class;
        Uri uri = (Uri) C36411kG.A0H(parcel, cls);
        Integer num = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
        String readString = parcel.readString();
        if (readString == null) {
            A0S = null;
        } else {
            A0S = C90524aI.A0S(readString);
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        int readInt = parcel.readInt();
        String readString6 = parcel.readString();
        if (readString6 == null) {
            A0S2 = null;
        } else {
            A0S2 = C90524aI.A0S(readString6);
        }
        boolean booleanValue = C111805cs.A00(parcel).booleanValue();
        return new C134866bj((Point) C36411kG.A0H(parcel, cls), (Rect) C36411kG.A0H(parcel, cls), uri, A0S, A0S2, num, readString2, readString3, readString4, readString5, readInt, parcel.readInt(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134866bj[i];
    }
}
