package X;

import android.widget.CompoundButton;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.3Zl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67343Zl implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C22820AwV A01;

    public /* synthetic */ C67343Zl(C22820AwV awV, int i) {
        this.A01 = awV;
        this.A00 = i;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C22820AwV awV = this.A01;
        int i = this.A00;
        B3n b3n = ((GroupPermissionsActivity) awV).A0B;
        if (b3n == null) {
            throw C36331k8.A0a();
        }
        b3n.Bwz(i, z);
    }
}
