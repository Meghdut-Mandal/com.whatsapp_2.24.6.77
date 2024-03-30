package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.AmB  reason: case insensitive filesystem */
public final class C22410AmB extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22410AmB(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C36331k8.A0d("groupPermissionsLayout");
        }
        SwitchCompat switchCompat = groupPermissionsLayout.A04;
        if (switchCompat == null) {
            throw C36331k8.A0d("sendMessagesSwitch");
        }
        switchCompat.setChecked(A1X);
        SwitchCompat switchCompat2 = groupPermissionsLayout.A04;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("sendMessagesSwitch");
        }
        switchCompat2.jumpDrawablesToCurrentState();
        return AnonymousClass0AJ.A00;
    }
}
