package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hU  reason: invalid class name and case insensitive filesystem */
public final class C94004hU extends C137226fn implements Parcelable, C161487mz, C161497n0 {
    public static final Parcelable.Creator CREATOR = new C163937r0(1);
    public C94034hX A00;

    public int describeContents() {
        return 0;
    }

    public C157587dm BG0() {
        C137076fY r1 = C137076fY.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public AnonymousClass666 BPp(AnonymousClass666 r5, AnonymousClass666 r6, AnonymousClass666 r7) {
        AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        AnonymousClass00C.A0E(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        float f = ((C94034hX) r6).A00;
        float f2 = ((C94034hX) r7).A00;
        if ((Build.VERSION.SDK_INT >= 23 || (!C90474aD.A1T(Float.floatToRawIntBits(f) & Integer.MAX_VALUE, 2139095040) && !C90474aD.A1T(Float.floatToRawIntBits(f2) & Integer.MAX_VALUE, 2139095040))) && f == f2) {
            return r6;
        }
        return null;
    }

    public void BmD(AnonymousClass666 r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.A00 = (C94034hX) r2;
    }

    public void Bqu(float f) {
        Snapshot A002;
        C94034hX r3 = (C94034hX) AnonymousClass6YQ.A07(this.A00);
        float f2 = r3.A00;
        if ((Build.VERSION.SDK_INT < 23 && (C90474aD.A1T(Float.floatToRawIntBits(f2) & Integer.MAX_VALUE, 2139095040) || C90474aD.A1T(Float.floatToRawIntBits(f) & Integer.MAX_VALUE, 2139095040))) || f2 != f) {
            C94034hX r0 = this.A00;
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                ((C94034hX) AnonymousClass6YQ.A03(A002, this, r0, r3)).A00 = f;
            }
            AnonymousClass6YQ.A0F(A002, this);
        }
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(((C94034hX) AnonymousClass6YQ.A06(this, this.A00)).A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutableFloatState(value=");
        A0u.append(((C94034hX) AnonymousClass6YQ.A07(this.A00)).A00);
        return C90464aC.A0W(this, ")@", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((C94034hX) AnonymousClass6YQ.A06(this, this.A00)).A00);
    }

    public C94004hU(float f) {
        this.A00 = new C94034hX(f);
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        Bqu(C36441kJ.A03(obj));
    }
}
