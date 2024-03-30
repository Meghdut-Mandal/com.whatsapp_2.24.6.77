package X;

import android.text.format.Time;
import com.whatsapp.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7yh  reason: invalid class name and case insensitive filesystem */
public final class C167727yh extends AnonymousClass04R {
    public AnonymousClass141 A00;
    public C187848yd A01 = C187848yd.BY_SOURCE;
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final AnonymousClass1LV A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass171 A07;
    public final C19970wo A08;
    public final C220412q A09;
    public final AnonymousClass1PF A0A;
    public final AnonymousClass17X A0B;
    public final C21010yW A0C;
    public final AnonymousClass39D A0D;
    public final AnonymousClass147 A0E;
    public final C28201Rs A0F = C36441kJ.A0t();
    public final C28201Rs A0G = C36441kJ.A0t();
    public final C28201Rs A0H = C36441kJ.A0t();
    public final C28201Rs A0I = C36441kJ.A0t();
    public final C19770wU A0J;
    public final List A0K = AnonymousClass001.A0I();

    public static final void A01(ACW acw, C167727yh r6, boolean z) {
        AnonymousClass2R9 r2 = new AnonymousClass2R9();
        C188508zh r0 = acw.A04;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            int i = 5;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 6;
                } else {
                    return;
                }
            }
            r2.A01 = Integer.valueOf(i);
            r2.A03 = C90504aG.A0h(C19970wo.A00(r6.A08), acw.A01);
            r2.A02 = C36441kJ.A0y(acw.A00);
            r2.A00 = Boolean.valueOf(z);
            AnonymousClass147 r1 = r6.A0E;
            C65533Sl r02 = AnonymousClass147.A01;
            if (C65533Sl.A05(r1.user)) {
                r2.A04 = r1.getRawString();
            }
            r6.A0C.Bly(r2);
        }
    }

    public static final void A02(C187848yd r12, C167727yh r13) {
        C001700s r1;
        int i;
        boolean z;
        int i2;
        Object[] objArr;
        r13.A01 = r12;
        AnonymousClass141 r0 = r13.A00;
        if (r0 == null || !r0.A12) {
            r1 = r13.A03;
            i = R.string.f12nameremoved;
        } else {
            List<ACW> list = r13.A0K;
            if (list.isEmpty()) {
                r1 = r13.A03;
                i = R.string.f12nameremoved;
            } else {
                if (r12.ordinal() != 1) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    A0I2.add(ACX.A00);
                    Integer num = null;
                    for (ACW acw : list) {
                        long j = acw.A05.A00;
                        Time time = new Time();
                        time.set(j);
                        int i3 = (int) ((j + (time.gmtoff * 1000)) / 86400000);
                        if (num != null) {
                            if (num.intValue() != i3) {
                                A0I2.add(ACY.A00);
                            } else {
                                A0I2.add(acw);
                                num = Integer.valueOf(i3);
                            }
                        }
                        A0I2.add(new ACT(j));
                        A0I2.add(acw);
                        num = Integer.valueOf(i3);
                    }
                    r13.A02.A0C(A0I2);
                } else {
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    ArrayList A0I4 = AnonymousClass001.A0I();
                    ArrayList A0I5 = AnonymousClass001.A0I();
                    ArrayList A0I6 = AnonymousClass001.A0I();
                    ArrayList A0I7 = AnonymousClass001.A0I();
                    AnonymousClass147 A022 = r13.A05.A02(r13.A0E);
                    String A0D2 = r13.A09.A0D(A022);
                    for (ACW acw2 : list) {
                        AnonymousClass3K1 r3 = acw2.A05;
                        String str = r3.A05;
                        if (AnonymousClass00C.A0J(str, "non_admin_add")) {
                            A0I6.add(acw2);
                        } else if (acw2.A07.A0B()) {
                            A0I3.add(acw2);
                        } else if (AnonymousClass00C.A0J(str, "linked_group_join")) {
                            AnonymousClass147 r02 = r3.A02;
                            if (r02 == null || AnonymousClass00C.A0J(A022, r02)) {
                                A0I4.add(acw2);
                            } else {
                                A0I5.add(acw2);
                            }
                        } else {
                            A0I7.add(acw2);
                        }
                    }
                    ArrayList A0I8 = AnonymousClass001.A0I();
                    A03(A0I8, A0I3, new Object[0], R.string.f12nameremoved);
                    A03(A0I8, A0I6, new Object[0], R.string.f12nameremoved);
                    if (A0D2 == null || A0D2.length() <= 0) {
                        i2 = R.string.f12nameremoved;
                        objArr = new Object[0];
                    } else {
                        i2 = R.string.f12nameremoved;
                        objArr = new Object[]{A0D2};
                    }
                    A03(A0I8, A0I4, objArr, i2);
                    A03(A0I8, A0I5, new Object[0], R.string.f12nameremoved);
                    A03(A0I8, A0I7, new Object[0], R.string.f12nameremoved);
                    C001700s r6 = r13.A02;
                    ArrayList A0I9 = AnonymousClass001.A0I();
                    A0I9.add(ACX.A00);
                    Iterator it = A0I8.iterator();
                    boolean z2 = true;
                    while (it.hasNext()) {
                        C195599Vb r2 = (C195599Vb) it.next();
                        List list2 = r2.A01;
                        if (C36401kF.A1a(list2)) {
                            if (!z2) {
                                A0I9.add(ACY.A00);
                            }
                            A0I9.add(r2.A00);
                            A0I9.addAll(list2);
                            z2 = false;
                        }
                    }
                    r6.A0C(A0I9);
                }
                r1 = r13.A0I;
                z = true;
                r1.A0C(z);
            }
        }
        z = Integer.valueOf(i);
        r1.A0C(z);
    }

    public static void A03(AbstractCollection abstractCollection, List list, Object[] objArr, int i) {
        abstractCollection.add(new C195599Vb(new ACU(objArr, i), list));
    }

    public C167727yh(AnonymousClass1LV r4, AnonymousClass16D r5, AnonymousClass171 r6, C19970wo r7, C220412q r8, AnonymousClass1PF r9, AnonymousClass17X r10, C21010yW r11, AnonymousClass39D r12, AnonymousClass147 r13, C19770wU r14) {
        C36321k7.A19(r7, r14, r8, r11);
        C36321k7.A1C(r5, r4, r6, r10, r9);
        this.A0E = r13;
        this.A08 = r7;
        this.A0J = r14;
        this.A09 = r8;
        this.A0C = r11;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A0B = r10;
        this.A0A = r9;
        this.A0D = r12;
        this.A0J.Boy(new C80253v6(this, 5));
        AnonymousClass2R9 r2 = new AnonymousClass2R9();
        r2.A01 = C36361kB.A0j();
        r2.A00 = C36371kC.A0m();
        r2.A03 = C36411kG.A0t();
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 r1 = this.A0E;
        if (C65533Sl.A05(r1.user)) {
            r2.A04 = r1.getRawString();
        }
        this.A0C.Bly(r2);
    }
}
