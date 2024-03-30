package X;

import android.view.View;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.21F  reason: invalid class name */
public class AnonymousClass21F extends C06570Uc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupAdminPickerActivity A01;

    public void A03(View view, int i) {
        if (i == 4) {
            C36351kA.A11(this.A01);
        }
    }

    public AnonymousClass21F(GroupAdminPickerActivity groupAdminPickerActivity, int i) {
        this.A01 = groupAdminPickerActivity;
        this.A00 = i;
    }

    public void A02(View view, float f) {
        int i = ((int) (f * 127.0f)) << 24;
        GroupAdminPickerActivity groupAdminPickerActivity = this.A01;
        groupAdminPickerActivity.A00.setColor(i);
        groupAdminPickerActivity.getWindow().setStatusBarColor(C018107s.A03(1.0f, this.A00, i));
    }
}
