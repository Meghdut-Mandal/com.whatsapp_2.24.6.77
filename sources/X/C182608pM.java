package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.8pM  reason: invalid class name and case insensitive filesystem */
public abstract class C182608pM extends C182688pU {
    public CharSequence A06(AnonymousClass141 r6, AnonymousClass3T1 r7) {
        Drawable A0D;
        String A00;
        Context context;
        int i;
        AnonymousClass11F r1;
        if ((r6 == null || (r1 = r6.A0H) == null || this.A01.A0M(r1)) && !r7.A1J.A02) {
            return "";
        }
        CharSequence A01 = C166417vl.A01(r6, r7, this);
        boolean z = this instanceof C182558pH;
        if (z) {
            A0D = AnonymousClass3R0.A00(getContext(), (C46812bi) r7);
        } else if (this instanceof C182538pF) {
            C46812bi r12 = (C46812bi) r7;
            AnonymousClass00C.A0D(r12, 0);
            A0D = AnonymousClass3R0.A00(getContext(), r12);
            AnonymousClass00C.A08(A0D);
        } else if (this instanceof C182568pI) {
            int i2 = R.drawable.ic_inline_live_location;
            if (r7 instanceof C46912bs) {
                i2 = R.drawable.msg_status_location;
            }
            A0D = C165587tf.A0D(getContext(), i2);
        } else {
            boolean z2 = this instanceof C182578pJ;
            Context context2 = getContext();
            if (z2) {
                A0D = C165587tf.A0D(context2, R.drawable.msg_status_contact);
            } else {
                A0D = C165587tf.A0D(context2, R.drawable.msg_status_audio);
            }
        }
        if (!z) {
            if (this instanceof C182538pF) {
                C46812bi r72 = (C46812bi) r7;
                AnonymousClass00C.A0D(r72, 0);
                A00 = AnonymousClass6XC.A00(this.A06, r72);
                AnonymousClass00C.A08(A00);
            } else {
                if (this instanceof C182568pI) {
                    A00 = getContext().getString(R.string.f12nameremoved);
                    if (r7 instanceof C46912bs) {
                        context = getContext();
                        i = R.string.f12nameremoved;
                    }
                } else if (this instanceof C182578pJ) {
                    context = getContext();
                    i = R.string.f12nameremoved;
                }
                A00 = context.getString(i);
            }
            return AnonymousClass3TZ.A04(A01, C165597tg.A0a(A0D, this.A01, A00));
        }
        A00 = AnonymousClass6XC.A00(this.A06, (C46812bi) r7);
        return AnonymousClass3TZ.A04(A01, C165597tg.A0a(A0D, this.A01, A00));
    }

    public C182608pM(Context context, C33301f4 r2) {
        super(context, r2);
    }
}
