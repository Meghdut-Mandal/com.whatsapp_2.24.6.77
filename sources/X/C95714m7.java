package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.polls.PollCreatorActivity;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4m7  reason: invalid class name and case insensitive filesystem */
public class C95714m7 extends C03790Hs {
    public final /* synthetic */ PollCreatorActivity A00;

    public void A03(AnonymousClass0D3 r4, int i) {
        if (i == 2) {
            if (r4 != null) {
                this.A00.A02.hideSoftInputFromWindow(r4.A0H.getWindowToken(), 0);
            }
        } else if (i == 0) {
            this.A00.A0C.A0U(true);
        }
    }

    public C95714m7(PollCreatorActivity pollCreatorActivity) {
        this.A00 = pollCreatorActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (((X.AnonymousClass5HF) r1.get(r2)).A00.isEmpty() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass0D3 r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass5HD
            r3 = 0
            if (r0 == 0) goto L_0x0027
            int r0 = r5.A04()
            int r2 = r0 + -2
            com.whatsapp.polls.PollCreatorActivity r0 = r4.A00
            com.whatsapp.polls.PollCreatorViewModel r0 = r0.A0C
            if (r2 < 0) goto L_0x0028
            java.util.List r1 = r0.A0D
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0028
            java.lang.Object r0 = r1.get(r2)
            X.5HF r0 = (X.AnonymousClass5HF) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return r3
        L_0x0028:
            int r3 = super.A01(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95714m7.A01(X.0D3, androidx.recyclerview.widget.RecyclerView):int");
    }

    public boolean A07(AnonymousClass0D3 r3, AnonymousClass0D3 r4, RecyclerView recyclerView) {
        if (!(r4 instanceof AnonymousClass5HC) || !(r4 instanceof AnonymousClass5HB)) {
            return true;
        }
        return false;
    }

    public boolean A08(AnonymousClass0D3 r8, AnonymousClass0D3 r9, RecyclerView recyclerView) {
        int A04 = r8.A04() - 2;
        int A042 = r9.A04() - 2;
        PollCreatorActivity pollCreatorActivity = this.A00;
        PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0C;
        if (A04 == A042 || A04 < 0) {
            return false;
        }
        List list = pollCreatorViewModel.A0D;
        if (A04 >= list.size() || A042 < 0 || A042 >= list.size()) {
            return false;
        }
        if (list.size() > 0 && ((AnonymousClass5HF) list.get(C36421kH.A06(list, 1))).A00.isEmpty() && (A04 == C36421kH.A06(list, 1) || A042 == C36421kH.A06(list, 1))) {
            return false;
        }
        ArrayList A15 = C36441kJ.A15(list);
        Collections.swap(A15, A04, A042);
        list.clear();
        list.addAll(A15);
        PollCreatorViewModel.A01(pollCreatorViewModel);
        pollCreatorActivity.A0B.A02 = true;
        pollCreatorActivity.A01.vibrate(3);
        return true;
    }
}
