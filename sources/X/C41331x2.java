package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.1x2  reason: invalid class name and case insensitive filesystem */
public final class C41331x2 extends AnonymousClass0D3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41331x2(View view, C20810yC r5, AnonymousClass13J r6, AnonymousClass005 r7) {
        super(view);
        C36321k7.A16(r5, r6, r7, 1);
        C33511fU.A03(C36391kE.A0O(view, R.id.create_group_call_title));
        C012005e.A02(view, R.id.subtitle).setSelected(true);
        C36401kF.A0G(view, R.id.icon).setImageResource(C222013h.A07 ? R.drawable.ic_action_new_call_filled_wds : R.drawable.ic_action_new_call);
        view.setOnClickListener(new C67113Yo((Object) r5, (Object) r7, (Object) view, 18));
        C34081gQ.A02(view);
    }
}
