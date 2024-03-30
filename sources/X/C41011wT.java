package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1wT  reason: invalid class name and case insensitive filesystem */
public class C41011wT extends AnonymousClass0CZ {
    public List A00;
    public final /* synthetic */ GroupCallLogActivity A01;

    public C41011wT(GroupCallLogActivity groupCallLogActivity) {
        this.A01 = groupCallLogActivity;
    }

    public static void A00(C41011wT r3, AnonymousClass11F r4) {
        int i = 0;
        for (C107255Nf r0 : r3.A00) {
            if (r0.A00.equals(r4)) {
                r3.A01.A02.A07(i);
                return;
            }
            i++;
        }
    }

    public int A0J() {
        return this.A00.size();
    }

    public void BSE(AnonymousClass0D3 r6, int i) {
        C42321yd r62 = (C42321yd) r6;
        UserJid userJid = ((C107255Nf) this.A00.get(i)).A00;
        GroupCallLogActivity groupCallLogActivity = this.A01;
        AnonymousClass141 A0D = groupCallLogActivity.A07.A0D(userJid);
        AnonymousClass1RY r2 = groupCallLogActivity.A0B;
        List list = AnonymousClass0D3.A0I;
        ImageView imageView = r62.A02;
        r2.A08(imageView, A0D);
        C67113Yo.A00(imageView, this, A0D, r62, 15);
        r62.A04.A05(A0D);
        C107265Nh r0 = groupCallLogActivity.A0H;
        if (r0 != null && !r0.A04.A03 && i == 0) {
            TextView textView = r62.A03;
            textView.setVisibility(0);
            C36351kA.A15(groupCallLogActivity.getResources(), textView, R.color.f6nameremoved);
            textView.setText(R.string.f12nameremoved);
        }
        C48812i6.A00(r62.A01, A0D, this, 20);
        C48812i6.A00(r62.A00, A0D, this, 21);
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42321yd(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A01);
    }
}
