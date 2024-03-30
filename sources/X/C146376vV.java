package X;

import android.os.Parcel;

/* renamed from: X.6vV  reason: invalid class name and case insensitive filesystem */
public class C146376vV implements C158347gm {
    public String B18(String str, Object obj) {
        throw AnonymousClass001.A0A("get");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw AnonymousClass001.A0A("equals");
    }

    public C146376vV(Parcel parcel) {
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        C18740tg.A06(readValue);
        parcel.readParcelable(((Class) readValue).getClassLoader());
        C18740tg.A06((Object) null);
    }

    public int hashCode() {
        return AnonymousClass000.A0K((Object) null, AnonymousClass001.A0L());
    }
}
