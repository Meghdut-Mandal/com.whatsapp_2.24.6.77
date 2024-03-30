package X;

/* renamed from: X.6fn  reason: invalid class name and case insensitive filesystem */
public abstract class C137226fn implements C159857k2 {
    public final AnonymousClass79W A00 = new AnonymousClass79W();

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r4) {
        /*
            r3 = this;
        L_0x0000:
            X.79W r2 = r3.A00
            int r1 = r2.get()
            r0 = r1 & r4
            if (r0 != 0) goto L_0x0012
            r0 = r1 | r4
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0000
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137226fn.A02(int):void");
    }

    public /* synthetic */ AnonymousClass666 BPp(AnonymousClass666 r4, AnonymousClass666 r5, AnonymousClass666 r6) {
        if (this instanceof C93994hT) {
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            if (((C93994hT) this).A01.B6k(((C94054hZ) r5).A00, ((C94054hZ) r6).A00)) {
                return r5;
            }
            return null;
        } else if (!(this instanceof C94024hW)) {
            return null;
        } else {
            AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            if (((C94044hY) r5).A00 == ((C94044hY) r6).A00) {
                return r5;
            }
            return null;
        }
    }
}
