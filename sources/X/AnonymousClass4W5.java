package X;

import android.animation.TimeInterpolator;
import android.view.View;
import java.util.List;

/* renamed from: X.4W5  reason: invalid class name */
public class AnonymousClass4W5 extends C67713aM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4W5(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void BR7(View view) {
        C42741zP r2;
        AnonymousClass0D3 r1;
        List list;
        switch (this.A03) {
            case 0:
                ((AnonymousClass0V7) this.A01).A09((C17190qs) null);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                r2 = (C42741zP) this.A00;
                r1 = (AnonymousClass0D3) this.A02;
                r2.A06(r1);
                TimeInterpolator timeInterpolator = C42741zP.A0B;
                list = r2.A06;
                break;
            case 1:
                ((AnonymousClass0V7) this.A01).A09((C17190qs) null);
                r2 = (C42741zP) this.A00;
                r1 = (AnonymousClass0D3) this.A02;
                r2.A06(r1);
                TimeInterpolator timeInterpolator2 = C42741zP.A0B;
                list = r2.A00;
                break;
            default:
                ((AnonymousClass0V7) this.A02).A09((C17190qs) null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C42741zP r3 = (C42741zP) this.A00;
                C62003Ei r22 = (C62003Ei) this.A01;
                r3.A06(r22.A05);
                TimeInterpolator timeInterpolator3 = C42741zP.A0B;
                C36391kE.A1M(r3, r22.A05, r3.A02);
                return;
        }
        C36391kE.A1M(r2, r1, list);
    }

    public void BR9(View view) {
    }
}
