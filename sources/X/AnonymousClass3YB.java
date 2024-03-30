package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.3YB  reason: invalid class name */
public class AnonymousClass3YB implements View.OnClickListener {
    public Object A00;
    public String A01;
    public boolean A02;

    public final void onClick(View view) {
        GroupCallLogActivity groupCallLogActivity = (GroupCallLogActivity) this.A00;
        Uri parse = Uri.parse(AnonymousClass3UD.A05(this.A01, this.A02));
        AnonymousClass1ND r2 = groupCallLogActivity.A03;
        groupCallLogActivity.A01.A00();
        AnonymousClass3UL.A06(parse, groupCallLogActivity, groupCallLogActivity.A05, r2, 13);
    }

    public AnonymousClass3YB(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A01 = str;
        this.A02 = z;
    }
}
