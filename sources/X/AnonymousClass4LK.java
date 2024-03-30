package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import java.util.List;

/* renamed from: X.4LK  reason: invalid class name */
public final class AnonymousClass4LK extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StatusSeeAllActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LK(StatusSeeAllActivity statusSeeAllActivity) {
        super(1);
        this.this$0 = statusSeeAllActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C63423Jz r9 = (C63423Jz) obj;
        TextView textView = this.this$0.A01;
        if (textView == null) {
            throw C36331k8.A0d("emptyText");
        }
        int i = 8;
        textView.setVisibility(C36351kA.A00(r9.A03 ? 1 : 0));
        StatusSeeAllActivity statusSeeAllActivity = this.this$0;
        TextView textView2 = statusSeeAllActivity.A01;
        if (textView2 == null) {
            throw C36331k8.A0d("emptyText");
        }
        int i2 = r9.A00;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = r9.A01;
        C36341k9.A0s(statusSeeAllActivity, textView2, A0L, i2);
        WaTextView waTextView = this.this$0.A05;
        if (waTextView == null) {
            throw C36331k8.A0d("seeAllText");
        }
        boolean z = r9.A04;
        if (z) {
            i = 0;
        }
        waTextView.setVisibility(i);
        StatusSeeAllActivity statusSeeAllActivity2 = this.this$0;
        ViewGroup viewGroup = statusSeeAllActivity2.A00;
        if (z) {
            if (viewGroup == null) {
                throw C36331k8.A0d("emptyTextContainer");
            }
            C67103Yn.A00(viewGroup, statusSeeAllActivity2, 16);
        } else if (viewGroup == null) {
            throw C36331k8.A0d("emptyTextContainer");
        } else {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
        StatusSeeAllAdapter statusSeeAllAdapter = this.this$0.A08;
        if (statusSeeAllAdapter == null) {
            throw C36331k8.A0Y();
        }
        List list = r9.A02;
        C36351kA.A1H(statusSeeAllAdapter.A00);
        AnonymousClass2L6 r2 = new AnonymousClass2L6(statusSeeAllAdapter.A01, list);
        AnonymousClass4YW.A00(r2, (C33301f4) statusSeeAllAdapter.A06.getValue(), statusSeeAllAdapter, list, 2);
        statusSeeAllAdapter.A00 = r2;
        return AnonymousClass0AJ.A00;
    }
}
