package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.R;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.util.List;

/* renamed from: X.4Vd  reason: invalid class name and case insensitive filesystem */
public class C89074Vd extends C011705b {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89074Vd(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A0d(View view, int i) {
        if (2 - this.A02 == 0 && i == 256) {
            AnonymousClass5NI r1 = (AnonymousClass5NI) this.A01;
            if (!r1.A0A()) {
                r1.A03();
            }
            r1.A09(3000);
            return;
        }
        super.A0d(view, i);
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        if (3 - this.A02 != 0) {
            super.A0i(view, accessibilityEvent);
            return;
        }
        super.A0i(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            C36411kG.A1O(this.A01);
            VerifyPhoneNumber.A1B((VerifyPhoneNumber) this.A00);
        }
    }

    public void A0k(View view, C07650Ys r5) {
        String str;
        int i;
        Context context;
        switch (this.A02) {
            case 0:
                super.A0k(view, r5);
                r5.A0L(false);
                r5.A02.setLongClickable(false);
                r5.A0B(AnonymousClass0Yd.A08);
                Context context2 = ((View) this.A00).getContext();
                boolean z = ((C39821ts) this.A01).A01.A05;
                int i2 = R.string.f12nameremoved;
                if (z) {
                    i2 = R.string.f12nameremoved;
                }
                r5.A0D(context2.getString(i2));
                return;
            case 1:
                super.A0k(view, r5);
                str = ((C604537x) this.A01).A02;
                break;
            case 3:
                super.A0k(view, r5);
                AnonymousClass0Yd r0 = AnonymousClass0Yd.A08;
                context = (Context) this.A00;
                i = R.string.f12nameremoved;
                break;
            case 4:
                super.A0k((View) this.A01, r5);
                AnonymousClass0Yd r02 = AnonymousClass0Yd.A08;
                C42491yu r1 = (C42491yu) this.A00;
                List list = AnonymousClass0D3.A0I;
                context = r1.A07;
                i = r1.A00;
                break;
            default:
                super.A0k(view, r5);
                return;
        }
        str = context.getString(i);
        r5.A0A(new AnonymousClass0Yd(16, (CharSequence) str));
    }
}
