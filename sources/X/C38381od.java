package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.1od  reason: invalid class name and case insensitive filesystem */
public abstract class C38381od extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A0C() {
        if (!this.A01) {
            this.A01 = true;
            WebPagePreviewView webPagePreviewView = (WebPagePreviewView) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            webPagePreviewView.A0M = C36341k9.A0V(r1);
            webPagePreviewView.A0N = C36391kE.A0j(r1);
            webPagePreviewView.A0L = C36431kI.A0b(r1);
            webPagePreviewView.A0J = C36341k9.A0T(r1);
            webPagePreviewView.A0K = (C32731e6) r1.A6S.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38381od(Context context) {
        super(context);
        A0C();
    }

    public static void A00(View view, WebPagePreviewView webPagePreviewView, int i) {
        view.setVisibility(i);
        if (webPagePreviewView.A0M.A0E(2652)) {
            webPagePreviewView.A0C.setVisibility(i);
        }
    }

    public C38381od(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0C();
    }

    public C38381od(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0C();
    }
}
