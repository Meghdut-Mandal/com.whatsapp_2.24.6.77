package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hT  reason: invalid class name and case insensitive filesystem */
public final class C93994hT extends C137226fn implements Parcelable, C161487mz {
    public static final Parcelable.Creator CREATOR = new C133846a5();
    public C94054hZ A00;
    public final C157587dm A01;

    public int describeContents() {
        return 0;
    }

    public void BmD(AnonymousClass666 r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (C94054hZ) r2;
    }

    public Object getValue() {
        return ((C94054hZ) AnonymousClass6YQ.A06(this, this.A00)).A00;
    }

    public void setValue(Object obj) {
        Snapshot A002;
        C94054hZ r3 = (C94054hZ) AnonymousClass6YQ.A07(this.A00);
        if (!this.A01.B6k(r3.A00, obj)) {
            C94054hZ r0 = this.A00;
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                ((C94054hZ) AnonymousClass6YQ.A03(A002, this, r0, r3)).A00 = obj;
            }
            AnonymousClass6YQ.A0F(A002, this);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutableState(value=");
        A0u.append(((C94054hZ) AnonymousClass6YQ.A07(this.A00)).A00);
        return C90464aC.A0W(this, ")@", A0u);
    }

    public C93994hT(C157587dm r2, Object obj) {
        this.A01 = r2;
        this.A00 = new C94054hZ(obj);
    }

    public static C93994hT A00(C157587dm r1, Object obj, String str) {
        AnonymousClass00C.A0E(r1, str);
        AnonymousClass00T r0 = C113525fg.A01;
        return new C93994hT(r1, obj);
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    public C157587dm BG0() {
        return this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C157587dm r2 = this.A01;
        C137056fW r1 = C137056fW.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        if (AnonymousClass00C.A0J(r2, r1)) {
            i2 = 0;
        } else {
            C137076fY r12 = C137076fY.A00;
            AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (AnonymousClass00C.A0J(r2, r12)) {
                i2 = 1;
            } else {
                C137066fX r13 = C137066fX.A00;
                AnonymousClass00C.A0E(r13, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                if (AnonymousClass00C.A0J(r2, r13)) {
                    i2 = 2;
                } else {
                    throw AnonymousClass001.A09("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
            }
        }
        parcel.writeInt(i2);
    }
}
