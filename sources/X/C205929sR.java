package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9sR  reason: invalid class name and case insensitive filesystem */
public final class C205929sR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        Parcel parcel2 = parcel;
        String A0g = C36341k9.A0g(parcel2);
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        boolean A1P = AnonymousClass000.A1P(parcel2.readByte());
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence != null) {
            spannableString = (SpannableString) charSequence;
        } else {
            spannableString = null;
        }
        C195719Vr r5 = new C195719Vr(spannableString, A1P);
        int readInt = parcel2.readInt();
        boolean A1P2 = AnonymousClass000.A1P(parcel2.readByte());
        CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence2 != null) {
            spannableString2 = (SpannableString) charSequence2;
        } else {
            spannableString2 = null;
        }
        C195699Vp r3 = new C195699Vp(spannableString2, A1P2);
        boolean A1P3 = AnonymousClass000.A1P(parcel2.readByte());
        CharSequence charSequence3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence3 != null) {
            spannableString3 = (SpannableString) charSequence3;
        } else {
            spannableString3 = null;
        }
        return new C206369tH(r3, new C195709Vq(spannableString3, A1P3), r5, A0g, readString, readString2, readString3, readString4, readString5, readString6, createStringArrayList, readInt, AnonymousClass000.A1P(parcel2.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206369tH[i];
    }
}
