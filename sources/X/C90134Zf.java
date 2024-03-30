package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import com.whatsapp.R;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4Zf  reason: invalid class name and case insensitive filesystem */
public class C90134Zf implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C90134Zf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onGlobalLayout() {
        View view;
        if (this.A04 != 0) {
            ConversationListView conversationListView = (ConversationListView) this.A00;
            if (AnonymousClass1N2.A00((View) this.A01)) {
                C36351kA.A1C(conversationListView, this);
                conversationListView.A07();
                C88974Ut r0 = (C88974Ut) this.A03;
                if (r0 != null && r0.BCi() && (view = (View) this.A02) != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass2E6 r6 = (AnonymousClass2E6) this.A00;
        Adapter adapter = (Adapter) this.A01;
        View view2 = (View) this.A02;
        View view3 = (View) this.A03;
        if (r6.A0I.isLayoutRequested()) {
            return;
        }
        if (r6.getHeight() >= r6.getWidth() && !r6.A0T) {
            int A06 = C36441kJ.A06(r6.getResources(), R.dimen.f7nameremoved, Math.max(r6.getMeasuredHeight() - ((((r6.A0E.getMeasuredHeight() - r6.getMeasuredWidth()) + (adapter.getCount() * r6.getResources().getDimensionPixelSize(R.dimen.f7nameremoved))) + view2.getMeasuredHeight()) + r6.A08(r6.A0D.getMeasuredWidth())), 0));
            if (view3.getPaddingBottom() != A06) {
                view3.setPadding(0, 0, 0, A06);
            }
        } else if (view3.getPaddingBottom() != 0) {
            view3.setPadding(0, 0, 0, 0);
        }
    }
}
