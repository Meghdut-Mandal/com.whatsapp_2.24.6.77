package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4ze  reason: invalid class name and case insensitive filesystem */
public final class C102264ze extends C102344zm {
    public final C19730wQ A00;
    public final AnonymousClass4PF A01;
    public final AnonymousClass4PG A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102264ze(View view, C19730wQ r12, AnonymousClass9ED r13, C196089Xp r14, C159967kF r15, AnonymousClass4PF r16, AnonymousClass1KP r17, AnonymousClass4PG r18, C88374Sl r19, C18820ts r20, UserJid userJid) {
        super(view, r13, r14, r15, r17, r20, userJid);
        AnonymousClass00C.A0D(view, 3);
        this.A00 = r12;
        this.A01 = r16;
        this.A02 = r18;
        this.A03 = C36431kI.A1I(new C152177Jm(view));
        this.A04 = C36431kI.A1I(new C153417Og(view, r15, this, r19));
        C48892iE.A00(view, this, 2);
    }

    public void A0D(AnonymousClass8WQ r6) {
        AnonymousClass00C.A0D(r6, 0);
        super.A0D(r6);
        C207269up r1 = r6.A01;
        AnonymousClass00C.A07(r1);
        ((QuantitySelector) C36381kD.A0p(this.A04)).A04(r6.A00, r1.A09);
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r1) {
        A0D((AnonymousClass8WQ) r1);
    }

    public final void A0E() {
        QuantitySelector quantitySelector = (QuantitySelector) C36381kD.A0p(this.A04);
        if (quantitySelector.A0C) {
            quantitySelector.A0E.removeCallbacksAndMessages((Object) null);
            ValueAnimator valueAnimator = quantitySelector.A02;
            if (valueAnimator != null) {
                valueAnimator.end();
                quantitySelector.A02.removeAllUpdateListeners();
                quantitySelector.A0B = false;
            }
            quantitySelector.A0A = C023109s.A00;
            quantitySelector.A04(quantitySelector.A01, quantitySelector.A00);
        }
    }
}
