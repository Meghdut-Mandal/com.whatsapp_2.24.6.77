package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Er  reason: invalid class name and case insensitive filesystem */
public final class C129036Er {
    public final C19730wQ A00;
    public final AnonymousClass1RU A01;
    public final AnonymousClass6TO A02;
    public final AnonymousClass1Pp A03;
    public final C27761Ps A04;
    public final C19630wG A05;
    public final C18820ts A06;
    public final C19650wI A07;
    public final C19770wU A08;
    public final AnonymousClass17Y A09;
    public final C19420v0 A0A;

    public final void A02(AnonymousClass012 r18, C019408g r19) {
        Bitmap bitmap;
        AnonymousClass012 r6 = r18;
        AnonymousClass00C.A0D(r6, 0);
        C19420v0 r2 = this.A0A;
        if (C36341k9.A0E(r2).getBoolean("show_account_switching_toast", false)) {
            C18820ts r4 = this.A06;
            C19730wQ r5 = this.A00;
            r5.A0G();
            AnonymousClass142 r0 = r5.A0E;
            C18740tg.A06(r0);
            String A0H = r4.A0H(AnonymousClass3U8.A03(r0));
            Context context = this.A05.A00;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r5.A0G();
            AnonymousClass142 r13 = r5.A0E;
            if (r13 == null || (bitmap = this.A04.A07(context, r13, -1.0f, dimensionPixelSize, true)) == null) {
                bitmap = AnonymousClass1Pp.A01(context, this.A03, -1.0f, R.drawable.avatar_contact, dimensionPixelSize);
            }
            this.A09.A0H(new C1502774q(r6, r19, this, C36421kH.A0C(context, bitmap), A0H, 2));
            C36331k8.A18(r2, "show_account_switching_toast", false);
        }
    }

    public final void A03(AnonymousClass1RJ r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A00() == 0) {
            View A0L = C36391kE.A0L(r5, 8);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(320);
            A0L.startAnimation(alphaAnimation);
        }
    }

    public final void A00() {
        AnonymousClass6TO r6 = this.A02;
        C19420v0 r3 = r6.A06;
        int A012 = C36371kC.A01(C36341k9.A0E(r3), "add_account_source");
        if (A012 != 0) {
            AnonymousClass584 r1 = new AnonymousClass584();
            r1.A02 = Integer.valueOf(A012);
            r1.A01 = C36371kC.A0o();
            AnonymousClass584.A00(r6, r1);
            AnonymousClass6TO.A00(r6, r1);
            C36321k7.A0q(r3, "add_account_source", 0);
            return;
        }
        int i = r6.A01;
        if (i == 12) {
            AnonymousClass584 r12 = new AnonymousClass584();
            r12.A02 = Integer.valueOf(r6.A01);
            r12.A01 = 19;
            AnonymousClass584.A00(r6, r12);
            AnonymousClass6TO.A00(r6, r12);
        } else if (i != 0) {
            AnonymousClass584 r5 = new AnonymousClass584();
            r5.A02 = Integer.valueOf(r6.A01);
            AnonymousClass584.A00(r6, r5);
            if (r6.A04) {
                r5.A01 = C36401kF.A0h();
                r5.A05 = Long.valueOf(r6.A02);
                long j = r6.A03;
                if (j != 0) {
                    r5.A03 = C90494aF.A0V(j);
                }
            } else {
                r5.A01 = Integer.valueOf(r6.A00);
            }
            AnonymousClass6TO.A00(r6, r5);
        }
    }

    public C129036Er(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass1RU r4, AnonymousClass6TO r5, AnonymousClass1Pp r6, C27761Ps r7, C19630wG r8, C19420v0 r9, C18820ts r10, C19650wI r11, C19770wU r12) {
        C36321k7.A1B(r2, r3, r8, r12, r6);
        C36321k7.A1C(r10, r4, r11, r9, r5);
        AnonymousClass00C.A0D(r7, 11);
        this.A09 = r2;
        this.A00 = r3;
        this.A05 = r8;
        this.A08 = r12;
        this.A03 = r6;
        this.A06 = r10;
        this.A01 = r4;
        this.A07 = r11;
        this.A0A = r9;
        this.A02 = r5;
        this.A04 = r7;
    }

    public final void A01(Context context, TextEmojiLabel textEmojiLabel, int i) {
        boolean A1U = C90484aE.A1U(textEmojiLabel);
        int A012 = C14960mT.A01(C90464aC.A02(context, (float) i, A1U ? 1 : 0));
        if (C36341k9.A04(context) == A1U) {
            textEmojiLabel.setPadding(A012, 0, A012, 0);
            return;
        }
        C18820ts r2 = this.A06;
        int i2 = 0;
        if (C36401kF.A1X(r2)) {
            i2 = A012;
        }
        if (C36401kF.A1X(r2)) {
            A012 = 0;
        }
        textEmojiLabel.setPadding(i2, 0, A012, 0);
    }
}
