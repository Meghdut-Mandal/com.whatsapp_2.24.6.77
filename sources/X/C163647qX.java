package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.calling.header.ui.CallScreenDetailsLayout;
import com.whatsapp.calling.header.ui.CallScreenDetailsLayout$setupOnAttach$1;
import com.whatsapp.calling.header.ui.CallScreenHeaderView;
import java.util.List;

/* renamed from: X.7qX  reason: invalid class name and case insensitive filesystem */
public class C163647qX implements View.OnAttachStateChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163647qX(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static void A00(View view, int i) {
        view.addOnAttachStateChangeListener(new C163647qX(view, view, i));
    }

    public void onViewAttachedToWindow(View view) {
        switch (this.A02) {
            case 0:
            case 4:
                return;
            case 1:
                ((View) this.A00).removeOnAttachStateChangeListener(this);
                C93044fU.A04((C93044fU) this.A01);
                return;
            case 2:
                AnonymousClass52X r2 = (AnonymousClass52X) this.A00;
                C129066Eu r0 = r2.A05;
                if (r0 == null || !r0.A0L) {
                    ((View) this.A01).post(new C1501574e(this, 9));
                    return;
                }
                r2.A0B.set(0, 0, 0, 0);
                ((View) this.A01).getViewTreeObserver().addOnGlobalLayoutListener(r2.A0G);
                return;
            case 3:
                ((View) this.A00).removeOnAttachStateChangeListener(this);
                CallControlCard.A00((CallControlCard) this.A01);
                return;
            case 5:
                ((View) this.A00).removeOnAttachStateChangeListener(this);
                CallScreenDetailsLayout callScreenDetailsLayout = (CallScreenDetailsLayout) this.A01;
                AnonymousClass012 A002 = AnonymousClass0QD.A00(callScreenDetailsLayout);
                if (A002 != null) {
                    C36331k8.A1T(new CallScreenDetailsLayout$setupOnAttach$1(A002, callScreenDetailsLayout, (C023509x) null), C33311f5.A00(A002));
                }
                if (!C011304x.A02(callScreenDetailsLayout)) {
                    callScreenDetailsLayout.A06.A02();
                    return;
                } else {
                    A00(callScreenDetailsLayout, 4);
                    return;
                }
            default:
                ((View) this.A00).removeOnAttachStateChangeListener(this);
                CallScreenHeaderView.A02((CallScreenHeaderView) this.A01);
                return;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        switch (this.A02) {
            case 0:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                ((Recomposer) this.A00).A0C();
                return;
            case 2:
                AnonymousClass52X r2 = (AnonymousClass52X) this.A00;
                List list = AnonymousClass0D3.A0I;
                r2.A0E.setVisibility(8);
                ((View) this.A01).getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0G);
                return;
            case 4:
                ((View) this.A00).removeOnAttachStateChangeListener(this);
                ((CallScreenDetailsLayout) this.A01).A06.A02();
                return;
            default:
                return;
        }
    }
}
