package X;

import java.util.HashSet;

/* renamed from: X.0Cn  reason: invalid class name and case insensitive filesystem */
public abstract class C02950Cn {
    public final C02680Bk A00;
    public final AnonymousClass0Bl A01;

    public void A01() {
        AnonymousClass0Bl r2 = this.A01;
        C02680Bk r0 = this.A00;
        HashSet hashSet = r2.A05;
        if (hashSet.remove(r0) && hashSet.isEmpty()) {
            r2.A02();
        }
    }

    public boolean A02() {
        AnonymousClass0Bl r1 = this.A01;
        Integer A012 = C02670Bj.A01(r1.A04.A0F);
        Integer num = r1.A00;
        if (A012 == num) {
            return true;
        }
        Integer num2 = C023109s.A01;
        if (A012 == num2 || num == num2) {
            return false;
        }
        return true;
    }

    public C02950Cn(C02680Bk r1, AnonymousClass0Bl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
