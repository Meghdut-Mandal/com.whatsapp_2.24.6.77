package X;

import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.community.CommunityFragment;

/* renamed from: X.4Vg  reason: invalid class name and case insensitive filesystem */
public class C89104Vg extends C02740Bs {
    public Object A00;
    public final int A01;

    public C89104Vg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        if (this.A01 != 0) {
            super.A01();
        } else {
            A07();
        }
    }

    public void A02(int i, int i2) {
        if (this.A01 != 0) {
            super.A02(i, i2);
        } else {
            A07();
        }
    }

    public void A03(int i, int i2) {
        AnonymousClass1JL r2;
        int i3;
        if (this.A01 != 0) {
            CommunityFragment communityFragment = (CommunityFragment) this.A00;
            if (!communityFragment.isEmpty()) {
                r2 = communityFragment.A1Z();
                i3 = 600;
            } else {
                return;
            }
        } else {
            A07();
            CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
            if (!callsHistoryFragmentV2.isEmpty()) {
                r2 = callsHistoryFragmentV2.A0Y;
                i3 = 400;
            } else {
                return;
            }
        }
        r2.A02(i3, false);
    }

    public void A04(int i, int i2) {
        AnonymousClass1JL r2;
        int i3;
        int i4 = this.A01;
        Object obj = this.A00;
        if (i4 != 0) {
            CommunityFragment communityFragment = (CommunityFragment) obj;
            if (communityFragment.isEmpty()) {
                r2 = communityFragment.A1Z();
                i3 = 600;
            } else {
                return;
            }
        } else {
            CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) obj;
            if (callsHistoryFragmentV2.isEmpty()) {
                r2 = callsHistoryFragmentV2.A0Y;
                i3 = 400;
            } else {
                return;
            }
        }
        r2.A02(i3, true);
    }

    public void A05(int i, int i2, int i3) {
        if (this.A01 != 0) {
            super.A05(i, i2, i3);
        } else {
            A07();
        }
    }

    public void A07() {
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
        if (C36421kH.A1a(callsHistoryFragmentV2.A0F.A0T.A01) && callsHistoryFragmentV2.A0E.A0J() > 0) {
            callsHistoryFragmentV2.A04.A0h(0);
        }
    }
}
