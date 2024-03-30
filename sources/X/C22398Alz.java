package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;
import java.util.List;

/* renamed from: X.Alz  reason: case insensitive filesystem */
public final class C22398Alz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22398Alz(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C36331k8.A0d("groupPermissionsLayout");
        }
        ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A07;
        if (listItemWithLeftIcon == null) {
            throw C36331k8.A0d("manageAdminsView");
        }
        listItemWithLeftIcon.setDescription((CharSequence) C55782vB.A00(groupPermissionsLayout.getWaLocale(), list, true));
        ListItemWithLeftIcon listItemWithLeftIcon2 = groupPermissionsLayout.A07;
        if (listItemWithLeftIcon2 == null) {
            throw C36331k8.A0d("manageAdminsView");
        }
        TextView textView = (TextView) C36361kB.A0F(listItemWithLeftIcon2, R.id.list_item_description);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return AnonymousClass0AJ.A00;
    }
}
