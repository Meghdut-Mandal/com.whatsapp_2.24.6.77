package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6a5  reason: invalid class name and case insensitive filesystem */
public final class C133846a5 implements Parcelable.ClassLoaderCreator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    /* renamed from: A00 */
    public C93994hT createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C157587dm r1;
        String str;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r1 = C137056fW.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>";
        } else if (readInt == 1) {
            r1 = C137076fY.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>";
        } else if (readInt == 2) {
            r1 = C137066fX.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>";
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unsupported MutableState policy ");
            A0u.append(readInt);
            throw AnonymousClass000.A0g(" was restored", A0u);
        }
        AnonymousClass00C.A0E(r1, str);
        return new C93994hT(r1, readValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C93994hT[i];
    }
}
