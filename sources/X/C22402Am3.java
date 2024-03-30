package X;

import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.Am3  reason: case insensitive filesystem */
public final class C22402Am3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22402Am3(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C36331k8.A0d("groupPermissionsLayout");
        }
        int A00 = C36351kA.A00(A1X ? 1 : 0);
        ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A06;
        if (listItemWithLeftIcon == null) {
            throw C36331k8.A0d("announcementGroupSetting");
        }
        listItemWithLeftIcon.setVisibility(A00);
        return AnonymousClass0AJ.A00;
    }
}
