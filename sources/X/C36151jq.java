package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;

/* renamed from: X.1jq  reason: invalid class name and case insensitive filesystem */
public class C36151jq implements C34871hm {
    public Object A00;
    public final int A01;

    public C36151jq(CallsHistoryFragmentV2 callsHistoryFragmentV2, int i) {
        this.A01 = i;
        this.A00 = callsHistoryFragmentV2;
    }

    public final void BZ9(View view) {
        ViewGroup viewGroup;
        CallsHistoryFragmentV2 callsHistoryFragmentV2;
        switch (this.A01) {
            case 0:
                callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                TextView textView = (TextView) C012005e.A02(view, R.id.welcome_calls_message);
                String string = callsHistoryFragmentV2.A0i().getString(R.string.f12nameremoved);
                Context A0a = callsHistoryFragmentV2.A0a();
                int A002 = C20800yB.A00(C21000yV.A02, callsHistoryFragmentV2.A0W, 5370);
                int i = R.drawable.ic_new_call_tip;
                if (A002 == 1) {
                    i = R.drawable.vec_ic_action_add_rounded;
                }
                textView.setText(C37351mE.A01(textView.getPaint(), AnonymousClass3UF.A02(A0a, i, R.color.f6nameremoved), string, "%s"));
                viewGroup = view;
                break;
            case 1:
                callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                ViewGroup viewGroup2 = (ViewGroup) view;
                EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(callsHistoryFragmentV2.A1D());
                emptyTellAFriendView.setId(R.id.calls_history_empty_tell_a_friend_view);
                View A02 = C012005e.A02(emptyTellAFriendView, R.id.container);
                A02.setPadding(A02.getPaddingLeft(), 0, A02.getPaddingRight(), 0);
                viewGroup2.addView(emptyTellAFriendView);
                emptyTellAFriendView.setInviteButtonClickListener(new C35161iF((Object) callsHistoryFragmentV2, 27));
                callsHistoryFragmentV2.A0r = C222013h.A05;
                viewGroup = viewGroup2;
                break;
            case 2:
                View A022 = C012005e.A02(view, R.id.search_no_matches);
                int dimensionPixelSize = A022.getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                A022.setPadding(A022.getPaddingLeft(), dimensionPixelSize, A022.getPaddingRight(), dimensionPixelSize);
                return;
            default:
                CallsHistoryFragmentV2 callsHistoryFragmentV22 = (CallsHistoryFragmentV2) this.A00;
                C012005e.A02(view, R.id.button_open_permission_settings).setOnClickListener(new C35121iB(callsHistoryFragmentV22, 0));
                CallsHistoryFragmentV2.A05(C012005e.A02(view, R.id.empty_contacts_permissions_needed_layout), callsHistoryFragmentV22);
                return;
        }
        CallsHistoryFragmentV2.A05(viewGroup, callsHistoryFragmentV2);
    }
}
