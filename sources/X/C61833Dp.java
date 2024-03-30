package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3Dp  reason: invalid class name and case insensitive filesystem */
public final class C61833Dp {
    public final C21060yb A00;
    public final C20810yC A01;
    public final C32681e1 A02;

    public C61833Dp(C21060yb r1, C20810yC r2, C32681e1 r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A00(Context context, C188208zD r10) {
        int i;
        int i2;
        Object r5;
        String str;
        int i3;
        DialogInterface.OnClickListener onClickListener;
        switch (r10.ordinal()) {
            case 0:
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                r5 = new C85334Gr(context, this);
                break;
            case 1:
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                r5 = new C85344Gs(context, this);
                break;
            case 2:
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                r5 = new C84324Cu(context);
                str = "https://support.google.com/android/answer/9079129?hl=en";
                break;
            case 3:
                str = null;
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                r5 = null;
                break;
            case 4:
                return;
            default:
                r5 = null;
                str = "https://faq.whatsapp.com/5064231857013976";
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                break;
        }
        str = "https://support.google.com/googleplay/answer/9037938?hl=en";
        AnonymousClass21S A002 = AnonymousClass21S.A00(context);
        if (A002.A01) {
            A002.A00 = R.drawable.ic_warning_wds;
        } else {
            A002.A00.A01 = R.drawable.ic_warning_wds;
        }
        A002.A0e(i);
        if (str == null) {
            A002.A0d(i2);
        } else {
            C32681e1 r4 = this.A02;
            Context context2 = A002.getContext();
            A002.A0h(r4.A02(context2, new C1503274v(7, str, A002), context2.getString(i2), "passkeys_learn_more_uri"));
        }
        if (r5 != null) {
            A002.A0f(C66393Vu.A00, R.string.f12nameremoved);
            i3 = R.string.f12nameremoved;
            onClickListener = new AnonymousClass4XN(r5, 44);
        } else {
            i3 = R.string.f12nameremoved;
            onClickListener = C66383Vt.A00;
        }
        A002.A0g(onClickListener, i3);
        AnonymousClass0FM A0b = A002.A0b();
        TextView textView = (TextView) A0b.findViewById(16908299);
        if (textView != null) {
            C36331k8.A10(textView, this.A01);
            C36371kC.A1I(textView, this.A00);
        }
        A0b.show();
    }
}
