package X;

import java.util.UUID;

/* renamed from: X.1Ae  reason: invalid class name and case insensitive filesystem */
public final class C23871Ae {
    public Integer A00;
    public String A01;
    public String A02;
    public Long A03;
    public final C19970wo A04;
    public final C21010yW A05;

    public C23871Ae(C19970wo r2, C21010yW r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A05 = r3;
        this.A04 = r2;
    }

    public final void A05(Integer num, String str, int i, boolean z) {
        Long l = null;
        if (i != 1) {
            Long l2 = this.A03;
            if (l2 != null) {
                l = Long.valueOf(System.currentTimeMillis() - l2.longValue());
            }
        } else {
            this.A03 = Long.valueOf(System.currentTimeMillis());
        }
        AnonymousClass2RW r1 = new AnonymousClass2RW();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A02;
        r1.A05 = this.A01;
        r1.A01 = num;
        r1.A04 = str;
        r1.A03 = l;
        r1.A00 = Boolean.valueOf(z);
        this.A05.Bly(r1);
    }

    public final void A00(int i) {
        Integer num = this.A00;
        if (num != null && num.intValue() == i) {
            this.A02 = null;
            this.A00 = null;
        }
    }

    public final void A01(int i) {
        if (this.A02 == null && this.A00 == null) {
            this.A02 = UUID.randomUUID().toString();
            this.A00 = Integer.valueOf(i);
        }
    }

    public final void A02(int i, String str, String str2) {
        AnonymousClass2PB r1 = new AnonymousClass2PB();
        r1.A01 = str2;
        r1.A02 = str;
        r1.A00 = Integer.valueOf(i);
        this.A05.Bly(r1);
    }

    public final void A03(Boolean bool, int i) {
        C45152Qg r1 = new C45152Qg();
        r1.A04 = this.A02;
        r1.A03 = this.A01;
        r1.A01 = this.A00;
        r1.A02 = Integer.valueOf(i);
        r1.A00 = bool;
        this.A05.Bly(r1);
    }

    public final void A04(Integer num, String str, int i, boolean z) {
        AnonymousClass2RW r1 = new AnonymousClass2RW();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A02;
        r1.A05 = this.A01;
        r1.A01 = num;
        r1.A04 = str;
        r1.A00 = Boolean.valueOf(z);
        this.A05.Bly(r1);
    }
}
