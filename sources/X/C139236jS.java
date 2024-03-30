package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.6jS  reason: invalid class name and case insensitive filesystem */
public class C139236jS implements AnonymousClass7eL {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity A01;

    public C139236jS(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A01 = groupChatLiveLocationsActivity;
        View A0E = C36361kB.A0E(groupChatLiveLocationsActivity.getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
        this.A00 = A0E;
        AnonymousClass04F.A05(A0E, 3);
    }

    public View BCf(C97634q1 r12) {
        int A002;
        AnonymousClass6PM A03;
        C63593Kq r9 = ((AnonymousClass6N8) r12.A0F).A02;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A01;
        AnonymousClass1LI r1 = groupChatLiveLocationsActivity.A07;
        View view = this.A00;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r1, R.id.name_in_group_tv);
        TextView A0P = C36391kE.A0P(view, R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        C19730wQ r0 = groupChatLiveLocationsActivity.A02;
        UserJid userJid = r9.A06;
        if (r0.A0M(userJid)) {
            A012.A01.setTextColor(C36351kA.A01(groupChatLiveLocationsActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
            A012.A02();
            findViewById.setVisibility(8);
        } else {
            AnonymousClass11F r13 = groupChatLiveLocationsActivity.A0N.A0I;
            C65533Sl r02 = AnonymousClass147.A01;
            AnonymousClass147 A032 = C65533Sl.A03(r13);
            if (A032 == null || (A03 = groupChatLiveLocationsActivity.A0J.A03(A032, userJid)) == null) {
                A002 = AnonymousClass00F.A00(groupChatLiveLocationsActivity, R.color.f6nameremoved);
            } else {
                A002 = C55772vA.A00(groupChatLiveLocationsActivity.getResources(), A03);
            }
            A012.A01.setTextColor(A002);
            A012.A05(groupChatLiveLocationsActivity.A0C.A0D(userJid));
            findViewById.setVisibility(0);
        }
        C33511fU.A03(A012.A01);
        String str = "";
        int i = r9.A03;
        if (i != -1) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, i, 0);
            str = AnonymousClass000.A0q(groupChatLiveLocationsActivity.A00.A0L(A0L, R.plurals.f10nameremoved, (long) i), A0v);
        }
        if (!TextUtils.isEmpty(str)) {
            A0P.setText(str);
            A0P.setVisibility(0);
            return view;
        }
        A0P.setVisibility(8);
        return view;
    }
}
