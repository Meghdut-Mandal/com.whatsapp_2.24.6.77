package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import java.util.List;

/* renamed from: X.3vc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80573vc implements Runnable {
    public final /* synthetic */ GroupChatInfoActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C80573vc(GroupChatInfoActivity groupChatInfoActivity, String str, List list, boolean z, boolean z2) {
        this.A00 = groupChatInfoActivity;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
    }

    public final void run() {
        TextView textView;
        Resources resources;
        int i;
        GroupChatInfoActivity groupChatInfoActivity = this.A00;
        boolean z = this.A03;
        boolean z2 = this.A04;
        List list = this.A02;
        String str = this.A01;
        if (!z || (list.isEmpty() && !z2)) {
            groupChatInfoActivity.A03.setVisibility(8);
            return;
        }
        groupChatInfoActivity.A03.setVisibility(0);
        if (!z2) {
            textView = groupChatInfoActivity.A0D;
            resources = groupChatInfoActivity.getResources();
            i = R.plurals.f10nameremoved;
        } else if (list.isEmpty()) {
            groupChatInfoActivity.A0D.setText(R.string.f12nameremoved);
            return;
        } else if (list.size() == 1) {
            String A0G = groupChatInfoActivity.A0q.A0G(str);
            C36341k9.A0s(groupChatInfoActivity, groupChatInfoActivity.A0D, new Object[]{A0G}, R.string.f12nameremoved);
            return;
        } else {
            textView = groupChatInfoActivity.A0D;
            resources = groupChatInfoActivity.getResources();
            i = R.plurals.f10nameremoved;
        }
        int size = list.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, list.size(), 0);
        C36351kA.A16(resources, textView, objArr, i, size);
    }
}
