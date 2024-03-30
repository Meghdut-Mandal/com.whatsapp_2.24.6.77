package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0ZA  reason: invalid class name */
public abstract class AnonymousClass0ZA {
    public static int A01(Parcel parcel, int i) {
        A0F(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A02(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static long A03(Parcel parcel, int i) {
        A0F(parcel, i, 8);
        return parcel.readLong();
    }

    public static String A09(Parcel parcel, String str, int i, int i2, int i3) {
        if (i == i2) {
            return A08(parcel, i3);
        }
        A0D(parcel, i3);
        return str;
    }

    public static void A0E(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected size ");
            A0u.append(i2);
            A0u.append(" got ");
            A0u.append(i);
            A0u.append(" (0x");
            A0u.append(hexString);
            throw new C13160jP(parcel, AnonymousClass000.A0q(")", A0u));
        }
    }

    public static int A00(Parcel parcel) {
        int readInt = parcel.readInt();
        int A02 = A02(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int i = A02 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Size read is invalid start=");
            A0u.append(dataPosition);
            throw new C13160jP(parcel, AnonymousClass000.A0r(" end=", A0u, i));
        }
        throw new C13160jP(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static Bundle A04(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A02);
        return readBundle;
    }

    public static IBinder A05(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A02);
        return readStrongBinder;
    }

    public static Parcelable A06(Parcel parcel, Parcelable.Creator creator, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A02);
        return parcelable;
    }

    public static Float A07(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        if (A02 == 0) {
            return null;
        }
        A0E(parcel, A02, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static String A08(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A02);
        return readString;
    }

    public static ArrayList A0A(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A02);
        return createStringArrayList;
    }

    public static ArrayList A0B(Parcel parcel, Parcelable.Creator creator, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A02);
        return createTypedArrayList;
    }

    public static void A0C(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C13160jP(parcel, AnonymousClass000.A0r("Overread allowed size end=", AnonymousClass000.A0u(), i));
        }
    }

    public static void A0D(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A02(parcel, i));
    }

    public static void A0F(Parcel parcel, int i, int i2) {
        int A02 = A02(parcel, i);
        if (A02 != i2) {
            String hexString = Integer.toHexString(A02);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected size ");
            A0u.append(i2);
            A0u.append(" got ");
            A0u.append(A02);
            A0u.append(" (0x");
            A0u.append(hexString);
            throw new C13160jP(parcel, AnonymousClass000.A0q(")", A0u));
        }
    }

    public static boolean A0G(Parcel parcel, int i) {
        return AnonymousClass000.A1P(A01(parcel, i));
    }

    public static boolean A0H(Parcel parcel, boolean z) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 1) {
            return A0G(parcel, readInt);
        }
        A0D(parcel, readInt);
        return z;
    }

    public static byte[] A0I(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A02);
        return createByteArray;
    }

    public static int[] A0J(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A02);
        return createIntArray;
    }

    public static Object[] A0K(Parcel parcel, Parcelable.Creator creator, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A02);
        return createTypedArray;
    }

    public static String[] A0L(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A02);
        return createStringArray;
    }

    public static byte[][] A0M(Parcel parcel, int i) {
        int A02 = A02(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A02);
        return bArr;
    }
}
