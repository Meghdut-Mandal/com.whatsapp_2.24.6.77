package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreTransferSelectorActivity;
import java.util.List;

/* renamed from: X.4IW  reason: invalid class name */
public final class AnonymousClass4IW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ RestoreTransferSelectorActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IW(RestoreTransferSelectorActivity restoreTransferSelectorActivity) {
        super(1);
        this.this$0 = restoreTransferSelectorActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        int i;
        List A0h = C36421kH.A0h(obj);
        RestoreTransferSelectorActivity restoreTransferSelectorActivity = this.this$0;
        List list = restoreTransferSelectorActivity.A03;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) list.get(i2);
            int A06 = C36351kA.A06(A0h, i2);
            if (A06 == 0) {
                view2.setBackgroundResource(R.drawable.selector_item_bg);
                view = (View) list.get(i2);
                i = 3;
                C67143Yr.A00(view, restoreTransferSelectorActivity, i2, i);
            } else if (A06 == 1) {
                view2.setBackgroundResource(R.drawable.selector_item_bg_selected);
                view = (View) list.get(i2);
                i = 2;
                C67143Yr.A00(view, restoreTransferSelectorActivity, i2, i);
            } else if (A06 == 2) {
                view2.setBackgroundResource(R.drawable.selector_item_bg);
                view2.setAlpha(0.3f);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
