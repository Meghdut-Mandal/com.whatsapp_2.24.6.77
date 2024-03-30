package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.annotationprocessors.modelgen.iface.ModelgenUtils;

/* renamed from: X.6bt  reason: invalid class name and case insensitive filesystem */
public class C134956bt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(7);
    public final String A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134956bt) {
                C134956bt r5 = (C134956bt) obj;
                if (!ModelgenUtils.equal((Object) null, (Object) null) || !ModelgenUtils.equal((Object) null, (Object) null) || !ModelgenUtils.equal(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(1, (Object) null), (Object) null), this.A00), this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(0);
        parcel.writeInt(0);
        String str = this.A00;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C134956bt(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = AnonymousClass000.A1O(parcel.readInt());
    }

    public C134956bt(C118515oB r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }
}
