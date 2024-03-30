package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3SF  reason: invalid class name */
public class AnonymousClass3SF {
    public final Context A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass171 A02;
    public final C20810yC A03;
    public final C18820ts A04;
    public final C220412q A05;
    public final AnonymousClass005 A06 = C36431kI.A0x(C81913xq.A00);

    public void A05(AnonymousClass141 r9) {
        AnonymousClass171 r1 = this.A02;
        AnonymousClass141 r4 = r9;
        AnonymousClass34G A0C = r1.A0C(r9, -1);
        boolean A0A = A0A(r9);
        if (r9.A0C() && (r1.A0f(r9) || r9.A0F == null)) {
            A0A = r9.A0N();
        } else if (r9.A0E() && r9.A0N()) {
            A0A = true;
        }
        A04(A0C, r4, (List) null, -1, A0A);
    }

    public void A06(AnonymousClass141 r8) {
        A04(this.A02.A0C(r8, -1), r8, (List) null, -1, false);
    }

    public void A08(AnonymousClass141 r8, List list) {
        A04(this.A02.A0C(r8, -1), r8, list, -1, AnonymousClass000.A1P(A0A(r8) ? 1 : 0));
    }

    public static SpannableStringBuilder A00(AnonymousClass3SF r5, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder A042;
        C18820ts r4 = r5.A04;
        SpannableStringBuilder A043 = r4.A04(charSequence2);
        AUN aun = null;
        try {
            aun = ((C203559oI) r5.A06.get()).A0F(charSequence.toString(), (String) null);
        } catch (AnonymousClass172 unused) {
        }
        if (aun == null || !((C203559oI) r5.A06.get()).A0N(aun)) {
            A042 = r4.A04(charSequence);
        } else {
            A042 = C18820ts.A00(r4).A03.A03(AnonymousClass047.A04, charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A042).append(" ").append(A043);
        return spannableStringBuilder;
    }

    public void A02() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(R.string.f12nameremoved);
        textEmojiLabel.A0E();
    }

    public void A03(int i) {
        TextEmojiLabel textEmojiLabel;
        int A002;
        if (i != 0) {
            if (i == 1) {
                textEmojiLabel = this.A01;
                A002 = C55832vG.A00(this.A03);
            } else if (i == 2) {
                textEmojiLabel = this.A01;
                boolean A0E = this.A03.A0E(5276);
                A002 = R.drawable.ic_verified_large;
                if (A0E) {
                    A002 = R.drawable.ic_verified_blue_large;
                }
            } else if (i == 3) {
                textEmojiLabel = this.A01;
                boolean A0E2 = this.A03.A0E(5276);
                A002 = R.drawable.ic_verified;
                if (A0E2) {
                    A002 = R.drawable.ic_verified_blue_small;
                }
            } else {
                return;
            }
            textEmojiLabel.A0F(A002, R.dimen.f7nameremoved);
            return;
        }
        this.A01.A0E();
    }

    public void A04(AnonymousClass34G r5, AnonymousClass141 r6, List list, int i, boolean z) {
        TextEmojiLabel textEmojiLabel = this.A01;
        int i2 = 0;
        textEmojiLabel.A0J(r5.A01, list, 256, false);
        if (C52022ol.PUSH_NAME == r5.A00 && i == 7) {
            textEmojiLabel.setContentDescription(AnonymousClass171.A03(this.A02, r6, R.string.f12nameremoved));
        }
        if (z) {
            i2 = 1;
            if (i == 1) {
                i2 = 3;
            }
        }
        A03(i2);
    }

    public void A07(AnonymousClass141 r12, C65783Tl r13, List list, float f) {
        Context context = this.A00;
        String A0J = this.A02.A0J(r12);
        if (A0J == null) {
            A0J = "";
        }
        String string = context.getString(R.string.f12nameremoved);
        TextEmojiLabel textEmojiLabel = this.A01;
        float f2 = f;
        int i = 0;
        if (f == 1.0f) {
            i = 256;
        }
        CharSequence A0D = textEmojiLabel.A0D(r13, A0J, list, f2, i, false);
        SpannableStringBuilder A002 = A00(this, A0D, string);
        AnonymousClass3NB.A00(A002, A002);
        textEmojiLabel.A01 = new C68853cZ(A002, this, A0D, string);
        textEmojiLabel.setText(A002);
        A03(r12.A0O() ? 1 : 0);
    }

    public void A09(List list, CharSequence charSequence) {
        List list2 = list;
        CharSequence charSequence2 = charSequence;
        if (this instanceof AnonymousClass24G) {
            this.A01.A0H((C65783Tl) null, charSequence2, list2, 256, false);
        } else {
            this.A01.A0J(charSequence, list, 0, false);
        }
    }

    public boolean A0A(AnonymousClass141 r3) {
        C44072La r0;
        AnonymousClass11F r1 = r3.A0H;
        if (!(r1 instanceof C28981Uw) || (r0 = (C44072La) C36371kC.A0W(this.A05, r1)) == null) {
            return r3.A0O();
        }
        return r0.A0P();
    }

    public AnonymousClass3SF(Context context, TextEmojiLabel textEmojiLabel, AnonymousClass171 r4, C18820ts r5, C220412q r6, C20810yC r7) {
        C18740tg.A06(context);
        this.A00 = context;
        C18740tg.A04(textEmojiLabel);
        this.A01 = textEmojiLabel;
        C18740tg.A06(r4);
        this.A02 = r4;
        C18740tg.A06(r5);
        this.A04 = r5;
        this.A05 = r6;
        C18740tg.A06(r7);
        this.A03 = r7;
    }

    public static AnonymousClass3SF A01(View view, AnonymousClass1LI r3, int i) {
        return r3.B3q(view.getContext(), C36401kF.A0O(view, i));
    }
}
