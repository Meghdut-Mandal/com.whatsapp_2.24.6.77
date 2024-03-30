package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6gm  reason: invalid class name and case insensitive filesystem */
public final class C137816gm implements C161707nL {
    public float A00;
    public float A01;
    public AnonymousClass5RW A02 = AnonymousClass5RW.Rtl;
    public final /* synthetic */ C136906fE A03;

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvh(long j) {
        return AnonymousClass6GH.A00(this, j);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    public C137816gm(C136906fE r2) {
        this.A03 = r2;
    }

    public boolean BMI() {
        Integer num = this.A03.A09.A0P.A05;
        if (num == C023109s.A0G || num == C023109s.A01) {
            return true;
        }
        return false;
    }

    public C160287kl BO0(Map map, C006302t r9, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new C137736gd(this, this.A03, map, r9, i3, i4);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Size(");
        A0u.append(i);
        A0u.append(" x ");
        A0u.append(i2);
        throw AnonymousClass000.A0g(") is out of range. Each dimension must be between 0 and 16777215.", A0u);
    }

    public List BvD(Object obj, C009003v r11) {
        C137846gp r3;
        C136906fE r6 = this.A03;
        r6.A04();
        C137846gp r7 = r6.A09;
        Integer num = r7.A0P.A05;
        Integer num2 = C023109s.A00;
        if (num == num2 || num == C023109s.A0C || num == C023109s.A01 || num == C023109s.A0G) {
            HashMap hashMap = r6.A0C;
            Object obj2 = hashMap.get(obj);
            C137846gp r32 = obj2;
            if (obj2 == null) {
                C137846gp r33 = (C137846gp) r6.A0B.remove(obj);
                if (r33 != null) {
                    int i = r6.A02;
                    if (i > 0) {
                        r6.A02 = i - 1;
                        r3 = r33;
                    } else {
                        throw AnonymousClass001.A09("Check failed.");
                    }
                } else {
                    C137846gp A002 = C136906fE.A00(r6, obj);
                    r3 = A002;
                    if (A002 == null) {
                        int i2 = r6.A00;
                        C137846gp r34 = new C137846gp(true, C112475dx.A00.addAndGet(1));
                        r7.A0F = true;
                        r7.A0S(r34, i2);
                        r7.A0F = false;
                        r3 = r34;
                    }
                }
                hashMap.put(obj, r3);
                r32 = r3;
            }
            C137846gp r35 = (C137846gp) r32;
            C1506776e r2 = r7.A0Q.A00;
            if (C007103b.A0P(r2.A05(), r6.A00) != r35) {
                int indexOf = r2.A05().indexOf(r35);
                int i3 = r6.A00;
                if (indexOf < i3) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Key \"");
                    A0u.append(obj);
                    throw AnonymousClass000.A0c("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.", A0u);
                } else if (i3 != indexOf) {
                    r7.A0F = true;
                    r7.A0R(indexOf, i3, 1);
                    r7.A0F = false;
                }
            }
            r6.A00++;
            C136906fE.A01(r6, r35, obj, r11);
            if (num == num2 || num == C023109s.A0C) {
                return r35.A0P.A0G.A0F();
            }
            return r35.A0D();
        }
        throw AnonymousClass001.A09("subcompose can only be used inside the measure or layout blocks");
    }

    public /* synthetic */ float Bvi(float f) {
        return f / this.A00;
    }

    public /* synthetic */ float Bvq(float f) {
        return f * this.A00;
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6GH.A01(this, f / this.A00);
    }

    public float BAy() {
        return this.A00;
    }

    public float BC0() {
        return this.A01;
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A02;
    }
}
