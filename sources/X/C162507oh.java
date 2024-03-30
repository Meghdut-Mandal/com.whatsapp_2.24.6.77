package X;

import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.7oh  reason: invalid class name and case insensitive filesystem */
public class C162507oh extends C02740Bs {
    public Object A00;
    public final int A01;

    public C162507oh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        switch (this.A01) {
            case 1:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
                stickyHeadersRecyclerView.A01 = -1;
                stickyHeadersRecyclerView.A00 = -1;
                return;
            case 2:
                ((AnonymousClass0CZ) this.A00).A06();
                return;
            default:
                super.A01();
                return;
        }
    }

    public void A02(int i, int i2) {
        if (this.A01 != 0) {
            super.A02(i, i2);
        } else {
            C96354nC.A00((C96354nC) this.A00, i, i2);
        }
    }

    public void A03(int i, int i2) {
        if (this.A01 != 0) {
            super.A03(i, i2);
        } else {
            C96354nC.A00((C96354nC) this.A00, i, i2);
        }
    }

    public void A04(int i, int i2) {
        if (this.A01 != 0) {
            super.A04(i, i2);
        } else {
            C96354nC.A00((C96354nC) this.A00, i, i2);
        }
    }

    public void A05(int i, int i2, int i3) {
        if (this.A01 != 0) {
            super.A05(i, i2, i3);
            return;
        }
        C96354nC r0 = (C96354nC) this.A00;
        C96354nC.A00(r0, i, i3);
        C96354nC.A00(r0, i2, i3);
    }
}
