package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.909  reason: invalid class name */
public enum AnonymousClass909 implements Parcelable {
    GREEN(1),
    YELLOW(2),
    RED(3);
    
    public static final SparseArray A00 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int mValue;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = new SparseArray();
        for (AnonymousClass909 r2 : values()) {
            A00.put(r2.mValue, r2);
        }
        CREATOR = C23179B8n.A00(47);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    /* access modifiers changed from: public */
    AnonymousClass909(int i) {
        this.mValue = i;
    }
}
