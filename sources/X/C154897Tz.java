package X;

import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.account.remove.RemoveAccountActivity;
import java.util.List;

/* renamed from: X.7Tz  reason: invalid class name and case insensitive filesystem */
public final class C154897Tz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WaTextView $removeAccountLinkedDevicesInfoTextView;
    public final /* synthetic */ RemoveAccountActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154897Tz(WaTextView waTextView, RemoveAccountActivity removeAccountActivity) {
        super(1);
        this.$removeAccountLinkedDevicesInfoTextView = waTextView;
        this.this$0 = removeAccountActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            this.$removeAccountLinkedDevicesInfoTextView.setVisibility(0);
            RemoveAccountActivity removeAccountActivity = this.this$0;
            RemoveAccountActivity.A07(this.$removeAccountLinkedDevicesInfoTextView, removeAccountActivity, C36361kB.A0m(removeAccountActivity, R.string.f12nameremoved));
        }
        return AnonymousClass0AJ.A00;
    }
}
