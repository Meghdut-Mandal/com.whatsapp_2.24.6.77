package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hW  reason: invalid class name and case insensitive filesystem */
public final class C94024hW extends C137226fn implements C161507n1, Parcelable, C161487mz {
    public static final Parcelable.Creator CREATOR = new C163937r0(2);
    public C94044hY A00;

    public int describeContents() {
        return 0;
    }

    public int BCn() {
        return ((C94044hY) AnonymousClass6YQ.A06(this, this.A00)).A00;
    }

    public C157587dm BG0() {
        C137076fY r1 = C137076fY.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public void BmD(AnonymousClass666 r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (C94044hY) r2;
    }

    public void Br4(int i) {
        Snapshot A002;
        C94044hY r3 = (C94044hY) AnonymousClass6YQ.A07(this.A00);
        if (r3.A00 != i) {
            C94044hY r0 = this.A00;
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                ((C94044hY) AnonymousClass6YQ.A03(A002, this, r0, r3)).A00 = i;
            }
            AnonymousClass6YQ.A0F(A002, this);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutableIntState(value=");
        A0u.append(((C94044hY) AnonymousClass6YQ.A07(this.A00)).A00);
        return C90464aC.A0W(this, ")@", A0u);
    }

    public C94024hW(int i) {
        this.A00 = new C94044hY(i);
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(BCn());
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        Br4(AnonymousClass000.A0I(obj));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(BCn());
    }
}
