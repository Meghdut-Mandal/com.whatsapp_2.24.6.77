package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.6fk  reason: invalid class name and case insensitive filesystem */
public final class C137196fk implements C160267kj, C158807iG {
    public final C161547n5 A00 = C93994hT.A00(C137076fY.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C160267kj A01;
    public final Set A02 = C36441kJ.A17();

    public boolean B2M(Object obj) {
        return this.A01.B2M(obj);
    }

    public Object B3V(String str) {
        return this.A01.B3V(str);
    }

    public C157607do BnI(String str, AnonymousClass00S r3) {
        return this.A01.BnI(str, r3);
    }

    public C137196fk(C160267kj r4, Map map) {
        this.A01 = new C137186fj(map, new C154077Qu(r4));
    }

    public Map Bla() {
        C158807iG r2 = (C158807iG) this.A00.getValue();
        if (r2 != null) {
            for (Object Bo0 : this.A02) {
                r2.Bo0(Bo0);
            }
        }
        return this.A01.Bla();
    }

    public void Bo0(Object obj) {
        C158807iG r0 = (C158807iG) this.A00.getValue();
        if (r0 != null) {
            r0.Bo0(obj);
            return;
        }
        throw AnonymousClass001.A08("null wrappedHolder");
    }

    public void Azk(C161337ma r3, Object obj, C009003v r5, int i) {
        r3.Bun(-697180401);
        C158807iG r1 = (C158807iG) this.A00.getValue();
        if (r1 != null) {
            r1.Azk(r3, obj, r5, (i & 112) | 520);
            C132846Vm.A02(r3, obj, new C154727Th(this, obj));
            C136976fO B6Z = r3.B6Z();
            if (B6Z != null) {
                B6Z.A06 = new C155967Yd(this, obj, r5, i);
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("null wrappedHolder");
    }
}
