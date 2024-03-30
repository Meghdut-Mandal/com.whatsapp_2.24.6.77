package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6gg  reason: invalid class name and case insensitive filesystem */
public final class C137766gg implements C161717nM, C161707nL {
    public final /* synthetic */ C136906fE A00;
    public final /* synthetic */ C137816gm A01;

    public boolean BMI() {
        return this.A01.BMI();
    }

    public C160287kl BO0(Map map, C006302t r3, int i, int i2) {
        return this.A01.BO0(map, r3, i, i2);
    }

    public C137766gg(C136906fE r2) {
        this.A00 = r2;
        this.A01 = r2.A08;
    }

    public float BAy() {
        return this.A01.A00;
    }

    public float BC0() {
        return this.A01.A01;
    }

    public int Bor(float f) {
        return AnonymousClass6QY.A01(this.A01, f);
    }

    public List BvD(Object obj, C009003v r9) {
        C136906fE r6 = this.A00;
        C137846gp r0 = (C137846gp) r6.A0C.get(obj);
        if (r0 != null) {
            return r0.A0P.A0G.A0F();
        }
        C1506776e r2 = r6.A06;
        int i = r2.A00;
        int i2 = r6.A01;
        if (i >= i2) {
            if (i == i2) {
                r2.A0D(obj);
            } else {
                r2.A01[i2] = obj;
            }
            r6.A01++;
            HashMap hashMap = r6.A0B;
            if (!hashMap.containsKey(obj)) {
                r6.A0D.put(obj, r6.A03(obj, r9));
                C137846gp r22 = r6.A09;
                if (r22.A0P.A05 == C023109s.A0C) {
                    r22.A0U(true);
                } else {
                    r22.A0W(true, true);
                }
            }
            C137846gp r02 = (C137846gp) hashMap.get(obj);
            if (r02 == null) {
                return C023409w.A00;
            }
            List A0F = r02.A0P.A0G.A0F();
            int size = A0F.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C94734ih) A0F.get(i3)).A0O.A08 = true;
            }
            return A0F;
        }
        throw AnonymousClass001.A08("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    public float Bvh(long j) {
        return AnonymousClass6GH.A00(this.A01, j);
    }

    public float Bvi(float f) {
        return f / this.A01.A00;
    }

    public float Bvp(long j) {
        return AnonymousClass6QY.A00(this.A01, j);
    }

    public float Bvq(float f) {
        return f * this.A01.A00;
    }

    public long Bvs(long j) {
        return AnonymousClass6QY.A02(this.A01, j);
    }

    public long Bvt(float f) {
        C137816gm r1 = this.A01;
        return AnonymousClass6GH.A01(r1, f / r1.A00);
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A01.A02;
    }
}
