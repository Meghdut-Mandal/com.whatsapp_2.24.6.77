package X;

/* renamed from: X.666  reason: invalid class name */
public abstract class AnonymousClass666 {
    public int A00 = AnonymousClass6YQ.A00().A04();
    public AnonymousClass666 A01;

    public AnonymousClass666 A00() {
        if (this instanceof C94064ha) {
            return new C94064ha(((C94064ha) this).A01);
        }
        if (this instanceof C94054hZ) {
            return new C94054hZ(((C94054hZ) this).A00);
        }
        if (this instanceof C94044hY) {
            return new C94044hY(((C94044hY) this).A00);
        }
        if (this instanceof C94034hX) {
            return new C94034hX(((C94034hX) this).A00);
        }
        return new C94074hb();
    }

    public void A01(AnonymousClass666 r4) {
        if (this instanceof C94064ha) {
            C94064ha r2 = (C94064ha) this;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            C94064ha r42 = (C94064ha) r4;
            synchronized (C129546Hk.A00) {
                r2.A01 = r42.A01;
                r2.A00 = r42.A00;
            }
        } else if (this instanceof C94054hZ) {
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            ((C94054hZ) this).A00 = ((C94054hZ) r4).A00;
        } else if (this instanceof C94044hY) {
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            ((C94044hY) this).A00 = ((C94044hY) r4).A00;
        } else if (this instanceof C94034hX) {
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            ((C94034hX) this).A00 = ((C94034hX) r4).A00;
        } else {
            C94074hb r1 = (C94074hb) this;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            C94074hb r43 = (C94074hb) r4;
            r1.A03 = r43.A03;
            r1.A04 = r43.A04;
            r1.A00 = r43.A00;
        }
    }
}
