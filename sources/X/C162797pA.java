package X;

import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.search.SearchFragment;
import java.util.Set;

/* renamed from: X.7pA  reason: invalid class name and case insensitive filesystem */
public class C162797pA extends C24511Cs {
    public Object A00;
    public final int A01;

    public C162797pA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A04(AnonymousClass147 r4) {
        if (this.A01 != 0) {
            super.A04(r4);
        } else {
            ((UpcomingActivityViewModel) this.A00).A04.Bp1(new C1501574e(this, 24));
        }
    }

    public void A05(AnonymousClass147 r4) {
        if (this.A01 != 0) {
            super.A05(r4);
        } else {
            ((UpcomingActivityViewModel) this.A00).A04.Bp1(new C1501574e(this, 25));
        }
    }

    public void A06(Set set) {
        switch (this.A01) {
            case 1:
                ((C142466ov) this.A00).A0K.A06();
                return;
            case 2:
                C96154ms r3 = ((SearchFragment) this.A00).A1c;
                if (r3 != null) {
                    int i = 0;
                    while (true) {
                        C1512578v r1 = r3.A0O;
                        if (i < r1.size()) {
                            if (set.contains(((C132056Ry) r1.get(i)).A01)) {
                                r3.A07(i);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.A06(set);
                return;
        }
    }
}
