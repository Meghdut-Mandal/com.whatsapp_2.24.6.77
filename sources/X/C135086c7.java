package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6c7  reason: invalid class name and case insensitive filesystem */
public class C135086c7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(23);
    public Object A00;
    public final C158347gm A01;
    public final Class A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C135086c7 r5 = (C135086c7) obj;
            if (!this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || !C1901797e.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(this.A00, objArr, 3);
    }

    public static Object A00(C135086c7 r0) {
        Object obj = r0.A00;
        C18740tg.A06(obj);
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static String A01(C135086c7 r1) {
        Object obj = r1.A00;
        C18740tg.A06(obj);
        return String.valueOf(((Number) obj).longValue());
    }

    public boolean A02() {
        boolean isEmpty;
        Object obj = this.A00;
        if (obj == null) {
            return true;
        }
        Objects.requireNonNull(obj, "can't run empty check on null value");
        Class<String> cls = this.A02;
        if (cls == String.class) {
            isEmpty = ((String) obj).isEmpty();
        } else if (cls.isArray()) {
            if (Array.getLength(obj) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Collection) {
            isEmpty = ((Collection) obj).isEmpty();
        } else if (obj instanceof Map) {
            isEmpty = ((Map) obj).isEmpty();
        } else {
            throw AnonymousClass001.A0E("empty check not implemented for class type");
        }
        if (isEmpty) {
            return true;
        }
        return false;
    }

    public String toString() {
        String B18 = this.A01.B18(this.A03, this.A00);
        if (B18 == null) {
            return "null";
        }
        return B18;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A03);
        C158347gm r1 = this.A01;
        if (r1 instanceof C146356vT) {
            i2 = 1;
        } else if (r1 instanceof C146366vU) {
            i2 = 2;
        } else if (r1 instanceof C146376vV) {
            parcel.writeInt(3);
            throw AnonymousClass001.A0A("getClass");
        } else {
            throw C90524aI.A0Y("[PrivacyPolicy] Unknown executor written to parcel");
        }
        parcel.writeInt(i2);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A00);
    }

    public C135086c7(C158347gm r2, Object obj, String str) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = obj.getClass();
        this.A00 = obj;
    }

    public C135086c7(C158347gm r1, Class cls, Object obj, String str) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = cls;
        this.A00 = obj;
    }

    public C135086c7(Parcel parcel) {
        C158347gm A002;
        this.A03 = C90514aH.A0u(parcel);
        int readInt = parcel.readInt();
        if (readInt == 1) {
            A002 = C146356vT.A00();
        } else if (readInt == 2) {
            A002 = new C146366vU();
        } else if (readInt == 3) {
            A002 = new C146376vV(parcel);
        } else {
            throw C90524aI.A0Y("[PrivacyPolicy] Unknown executor read from parcel");
        }
        this.A01 = A002;
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        C18740tg.A06(readValue);
        Class cls = (Class) readValue;
        this.A02 = cls;
        this.A00 = parcel.readValue(cls.getClassLoader());
    }
}
