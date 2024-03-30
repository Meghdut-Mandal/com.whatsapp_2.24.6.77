package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.3Zg  reason: invalid class name and case insensitive filesystem */
public class C67293Zg implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ MessageDetailsActivity A03;
    public final /* synthetic */ boolean A04;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C67293Zg(Drawable drawable, ViewGroup viewGroup, MessageDetailsActivity messageDetailsActivity, int i, boolean z) {
        this.A03 = messageDetailsActivity;
        this.A01 = drawable;
        this.A04 = z;
        this.A02 = viewGroup;
        this.A00 = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ViewGroup viewGroup;
        MessageDetailsActivity messageDetailsActivity = this.A03;
        float f = 0.0f;
        if (messageDetailsActivity.A02.getFirstVisiblePosition() > 0) {
            this.A01.setAlpha(255);
        } else {
            View childAt = messageDetailsActivity.A02.getChildAt(0);
            if (childAt == null) {
                this.A01.setAlpha(0);
            } else {
                int i4 = -childAt.getTop();
                this.A01.setAlpha(Math.min(255, (i4 * 255) / Math.min(this.A00, childAt.getHeight())));
                if (!this.A04) {
                    viewGroup = this.A02;
                    f = (float) (i4 / 2);
                    viewGroup.setTranslationY(f);
                }
                return;
            }
        }
        if (!this.A04) {
            viewGroup = this.A02;
            viewGroup.setTranslationY(f);
        }
    }
}
