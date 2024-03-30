package X;

import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.7ov  reason: invalid class name and case insensitive filesystem */
public class C162647ov extends C67243Zb {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162647ov(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        switch (this.A02) {
            case 0:
                C1262062y r1 = (C1262062y) this.A00;
                r1.A00(C36441kJ.A02(r1.A01));
                ((C67243Zb) this.A01).onAnimationEnd(animation);
                return;
            case 1:
                C90514aH.A1N(this.A01);
                return;
            case 2:
                ((View) this.A01).clearAnimation();
                AnonymousClass6YP r12 = (AnonymousClass6YP) this.A00;
                View view = r12.A0X;
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                AnonymousClass2ZP r13 = r12.A13;
                Log.i("voicenote/voicenotepreviewcancelled");
                Iterator A0s = C36361kB.A0s(r13);
                while (A0s.hasNext()) {
                    ((AnonymousClass3L3) A0s.next()).A02();
                }
                view.requestFocus();
                return;
            default:
                AnonymousClass6YP r2 = ((C100694vR) this.A00).A04;
                if (r2.A0H == null) {
                    ((View) this.A01).setVisibility(0);
                    AnonymousClass2ZP r14 = r2.A13;
                    Log.e("voicenote/voicenotecancelled");
                    Iterator A0s2 = C36361kB.A0s(r14);
                    while (A0s2.hasNext()) {
                        ((AnonymousClass3L3) A0s2.next()).A00();
                    }
                    return;
                }
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A02) {
            case 0:
                ((C67243Zb) this.A01).onAnimationStart(animation);
                return;
            case 2:
                ((View) this.A01).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
