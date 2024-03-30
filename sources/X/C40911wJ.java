package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.1wJ  reason: invalid class name and case insensitive filesystem */
public final class C40911wJ extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();

    public void BSE(AnonymousClass0D3 r6, int i) {
        String A0t;
        AnonymousClass00C.A0D(r6, 0);
        if (r6 instanceof C41631xW) {
            Object obj = ((C62873Hw) this.A00.get(i)).A01;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.SuggestionView.UiState");
            AnonymousClass3K2 r1 = (AnonymousClass3K2) obj;
            AnonymousClass00C.A0D(r1, 0);
            ((C41631xW) r6).A00.A06(r1);
        } else if (r6 instanceof C42651zA) {
            Object obj2 = ((C62873Hw) this.A00.get(i)).A01;
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementAdapter.SuggestionsListData");
            C62883Hx r12 = (C62883Hx) obj2;
            int i2 = r12.A01;
            Integer valueOf = Integer.valueOf(r12.A00);
            C38131nl r2 = ((C42651zA) r6).A00;
            if (valueOf != null) {
                A0t = C36351kA.A0w(r2.getContext(), valueOf, 1, i2);
            } else {
                A0t = C36381kD.A0t(r2, i2);
            }
            r2.A01.setText(A0t);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C41631xW(new C39161rN(C36351kA.A09(viewGroup)));
        }
        if (i != 2) {
            return new C41381x7(viewGroup);
        }
        return C42651zA.A00(viewGroup);
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C62873Hw r0 = (C62873Hw) C007103b.A0P(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public long A0E(int i) {
        AnonymousClass3K2 r1;
        if (getItemViewType(i) != 1) {
            return -1;
        }
        Object obj = ((C62873Hw) this.A00.get(i)).A01;
        if (!(obj instanceof AnonymousClass3K2) || (r1 = (AnonymousClass3K2) obj) == null) {
            return -1;
        }
        return (long) r1.A02.hashCode();
    }
}
