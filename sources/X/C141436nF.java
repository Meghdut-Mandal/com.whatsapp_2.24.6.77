package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.6nF  reason: invalid class name and case insensitive filesystem */
public class C141436nF implements AnonymousClass7f1 {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A01;

    public C141436nF(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A01 = groupChatLiveLocationsActivity2;
        View A0E = C36361kB.A0E(groupChatLiveLocationsActivity2.getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
        this.A00 = A0E;
        AnonymousClass04F.A05(A0E, 3);
    }

    public View BCg(C129116Fg r12) {
        int A002;
        AnonymousClass6PM A03;
        Object A012 = r12.A01();
        C18740tg.A06(A012);
        C63593Kq r9 = ((AnonymousClass6N8) A012).A02;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A01;
        AnonymousClass1LI r1 = groupChatLiveLocationsActivity2.A08;
        View view = this.A00;
        AnonymousClass3SF A013 = AnonymousClass3SF.A01(view, r1, R.id.name_in_group_tv);
        TextView A0P = C36391kE.A0P(view, R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        C19730wQ r0 = groupChatLiveLocationsActivity2.A02;
        UserJid userJid = r9.A06;
        if (r0.A0M(userJid)) {
            A013.A01.setTextColor(C36351kA.A01(groupChatLiveLocationsActivity2, R.attr.f4nameremoved, R.color.f6nameremoved));
            A013.A02();
            findViewById.setVisibility(8);
        } else {
            AnonymousClass11F r13 = groupChatLiveLocationsActivity2.A0O.A0I;
            C65533Sl r02 = AnonymousClass147.A01;
            AnonymousClass147 A032 = C65533Sl.A03(r13);
            if (A032 == null || (A03 = groupChatLiveLocationsActivity2.A0K.A03(A032, userJid)) == null) {
                A002 = AnonymousClass00F.A00(groupChatLiveLocationsActivity2, R.color.f6nameremoved);
            } else {
                A002 = C55772vA.A00(groupChatLiveLocationsActivity2.getResources(), A03);
            }
            A013.A01.setTextColor(A002);
            A013.A05(groupChatLiveLocationsActivity2.A0D.A0D(userJid));
            findViewById.setVisibility(0);
        }
        C33511fU.A03(A013.A01);
        String str = "";
        int i = r9.A03;
        if (i != -1) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, i, 0);
            str = AnonymousClass000.A0q(groupChatLiveLocationsActivity2.A00.A0L(A0L, R.plurals.f10nameremoved, (long) i), A0v);
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
