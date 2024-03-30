package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.1wK  reason: invalid class name and case insensitive filesystem */
public final class C40921wK extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();

    public void BSE(AnonymousClass0D3 r6, int i) {
        AnonymousClass00C.A0D(r6, 0);
        if (r6 instanceof C41851xs) {
            Object obj = ((AnonymousClass3IS) this.A00.get(i)).A01;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.group.newgroup.AddParticipantButtonView.UiState");
            AnonymousClass3Y2.A00(((C41851xs) r6).A00, obj, 40);
        } else if (r6 instanceof C41861xt) {
            Object obj2 = ((AnonymousClass3IS) this.A00.get(i)).A01;
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.group.newgroup.GroupParticipantView.UiState");
            C63253Ji r4 = (C63253Ji) obj2;
            AnonymousClass00C.A0D(r4, 0);
            C38661pT r3 = ((C41861xt) r6).A00;
            AnonymousClass1RY r1 = r4.A00;
            AnonymousClass141 r2 = r4.A01;
            r1.A08(r3.A04, r2);
            r3.A05.setText(r3.getWaContactNames().A0H(r2));
            if (r4.A03) {
                AnonymousClass3Y2.A00(r3, r4, 41);
            } else {
                r3.A03.setVisibility(8);
            }
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C41851xs(new C38441or(C36351kA.A09(viewGroup)));
        }
        if (i != 2) {
            return new C41461xF(viewGroup);
        }
        return new C41861xt(new C38661pT(C36351kA.A09(viewGroup)));
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        AnonymousClass3IS r0 = (AnonymousClass3IS) C007103b.A0P(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public long A0E(int i) {
        AnonymousClass141 r1;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            return -1;
        }
        if (itemViewType != 2) {
            return -2;
        }
        Object obj = ((AnonymousClass3IS) this.A00.get(i)).A01;
        if (!(obj instanceof AnonymousClass141) || (r1 = (AnonymousClass141) obj) == null) {
            return -2;
        }
        return r1.A0I();
    }
}
