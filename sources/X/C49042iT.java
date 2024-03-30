package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2iT  reason: invalid class name and case insensitive filesystem */
public class C49042iT extends C132446Tt {
    public final /* synthetic */ GroupMembersSelector A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (obj != null) {
            GroupMembersSelector groupMembersSelector = this.A00;
            View A0K = C36381kD.A0K(LayoutInflater.from(groupMembersSelector), R.layout.f9nameremoved);
            C39001qm A002 = AnonymousClass3LW.A00(groupMembersSelector);
            A002.A0d(R.string.f12nameremoved);
            C39001qm.A02(groupMembersSelector, A002, R.string.f12nameremoved);
            A002.A0j(A0K);
            AnonymousClass0FM create = A002.create();
            TextView A0O = C36391kE.A0O(A0K, R.id.button1);
            TextView A0O2 = C36391kE.A0O(A0K, R.id.button2);
            TextView A0O3 = C36391kE.A0O(A0K, R.id.button3);
            A0O.setText(R.string.f12nameremoved);
            C67113Yo.A00(A0O, this, obj, create, 45);
            A0O2.setText(R.string.f12nameremoved);
            AnonymousClass3Y2.A00(A0O2, this, 36);
            A0O3.setText(R.string.f12nameremoved);
            AnonymousClass3Y2.A00(A0O3, create, 35);
            A0O3.setVisibility(0);
            create.show();
            return;
        }
        GroupMembersSelector.A0x(this.A00, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49042iT(GroupMembersSelector groupMembersSelector) {
        super(groupMembersSelector, true);
        this.A00 = groupMembersSelector;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        GroupMembersSelector groupMembersSelector = this.A00;
        AnonymousClass17X r2 = groupMembersSelector.A03;
        AnonymousClass142 A0V = C36431kI.A0V(groupMembersSelector);
        Objects.requireNonNull(A0V);
        UserJid userJid = (UserJid) A0V.A0H;
        Objects.requireNonNull(userJid);
        Iterator it = r2.A07.A0F(userJid).iterator();
        while (it.hasNext()) {
            AnonymousClass144 r5 = (AnonymousClass144) it.next();
            if ((r5 instanceof AnonymousClass147) && C36421kH.A1Y(groupMembersSelector.A09.A0D(r5))) {
                AnonymousClass6X6 A0C = groupMembersSelector.A04.A0C(r5);
                int size = A0C.A08.size();
                List list = groupMembersSelector.A0c;
                if (size == list.size() + 1) {
                    C20760y7 A05 = A0C.A05();
                    int i = 0;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (A05.contains(C36371kC.A0d(it2))) {
                            i++;
                        }
                    }
                    if (i == list.size()) {
                        return r5;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
