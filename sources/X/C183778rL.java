package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* renamed from: X.8rL  reason: invalid class name and case insensitive filesystem */
public class C183778rL extends C132446Tt {
    public final int A00;
    public final C25251Fo A01;
    public final AnonymousClass1YK A02;
    public final AnonymousClass1EU A03;
    public final C193889Nh A04;
    public final C19770wU A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B;

    public C183778rL(AnonymousClass155 r4, C25251Fo r5, AnonymousClass1YK r6, AnonymousClass1EU r7, C193889Nh r8, C19770wU r9, WeakReference weakReference, WeakReference weakReference2, boolean z, boolean z2) {
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = AnonymousClass001.A0F(r4);
        this.A0B = z;
        this.A09 = z2;
        this.A00 = 3;
        this.A07 = weakReference;
        this.A08 = weakReference2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C193199Kf r8 = (C193199Kf) obj;
        synchronized (this) {
            AnonymousClass155 r3 = (AnonymousClass155) this.A06.get();
            C22988Aze aze = (C22988Aze) this.A07.get();
            C23039B1k b1k = (C23039B1k) this.A08.get();
            if (r3 != null) {
                r3.Bnv();
                if (aze != null) {
                    List list = r8.A00;
                    aze.Bwm(list);
                    if (this.A09) {
                        ArrayList A0I = AnonymousClass001.A0I();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C207249un A0S = C165607th.A0S(it);
                            if (!TextUtils.isEmpty(A0S.A0A)) {
                                A0I.add(A0S.A0A);
                            }
                        }
                        C19770wU r2 = this.A05;
                        AnonymousClass1YK r1 = this.A02;
                        Objects.requireNonNull(r1);
                        AVY.A00(r2, r1, 41);
                    }
                }
                if (this.A0B && b1k != null) {
                    List list2 = r8.A02;
                    b1k.Bx7(list2);
                    List list3 = r8.A01;
                    b1k.Bww(list3);
                    if (this.A09) {
                        A00(list2);
                        A00(list3);
                    }
                }
                r3.invalidateOptionsMenu();
            }
        }
    }

    private void A00(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C202319lY r1 = (C202319lY) it.next();
            if (!TextUtils.isEmpty(r1.A0K)) {
                A0I.add(r1.A0K);
            }
        }
        C36391kE.A1S(this.A05, this, A0I, 7);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        if (this.A0B) {
            C193889Nh r2 = this.A04;
            r2.A04 = true;
            AnonymousClass1EU r0 = this.A03;
            AnonymousClass1EU.A00(r0);
            C24881Ed r1 = r0.A05;
            A0I2 = r1.A0Q(r2);
            AnonymousClass1EU.A00(r0);
            A0I3 = r1.A0P(this.A00);
        }
        if (this.A0A) {
            A0I = C165617ti.A0O(this.A03).A09();
        }
        return new C193199Kf(A0I, A0I2, A0I3);
    }
}
