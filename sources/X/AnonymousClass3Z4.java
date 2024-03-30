package X;

import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.3Z4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Z4 implements View.OnLongClickListener {
    public final /* synthetic */ GroupCallLogActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass3Z4(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A02 = z;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        return this.A00.A3i(this.A01, this.A02);
    }
}
