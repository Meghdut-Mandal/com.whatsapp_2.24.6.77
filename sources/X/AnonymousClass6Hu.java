package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* renamed from: X.6Hu  reason: invalid class name */
public abstract class AnonymousClass6Hu {
    public static final Class[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r2 == r1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.lang.Object r6) {
        /*
            boolean r0 = r6 instanceof X.C161487mz
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003a
            X.7mz r6 = (X.C161487mz) r6
            X.7dm r2 = r6.BG0()
            X.6fW r1 = X.C137056fW.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r2 == r1) goto L_0x002f
            X.7dm r2 = r6.BG0()
            X.6fY r1 = X.C137076fY.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r2 == r1) goto L_0x002f
            X.7dm r2 = r6.BG0()
            X.6fX r1 = X.C137066fX.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r2 != r1) goto L_0x0042
        L_0x002f:
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L_0x0039
            boolean r5 = A00(r0)
        L_0x0039:
            return r5
        L_0x003a:
            boolean r0 = r6 instanceof X.AnonymousClass00P
            if (r0 == 0) goto L_0x0043
            boolean r0 = r6 instanceof java.io.Serializable
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.Class[] r3 = A00
            r2 = 7
            r1 = 0
        L_0x0047:
            r0 = r3[r1]
            boolean r0 = r0.isInstance(r6)
            if (r0 != 0) goto L_0x0039
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0042
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Hu.A00(java.lang.Object):boolean");
    }
}
