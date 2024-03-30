package X;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.1wn  reason: invalid class name and case insensitive filesystem */
public class C41181wn extends C02910Cj {
    public final /* synthetic */ ConversationsFragment A00;

    public C41181wn(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r7, RecyclerView recyclerView) {
        super.A05(rect, view, r7, recyclerView);
        if (RecyclerView.A00(view) != 0) {
            ConversationsFragment conversationsFragment = this.A00;
            boolean A1Y = C36351kA.A1Y(conversationsFragment.A1i);
            int applyDimension = (int) TypedValue.applyDimension(1, 6.0f, C36341k9.A0G(conversationsFragment).getDisplayMetrics());
            if (A1Y) {
                rect.left = applyDimension;
            } else {
                rect.right = applyDimension;
            }
        }
    }
}
