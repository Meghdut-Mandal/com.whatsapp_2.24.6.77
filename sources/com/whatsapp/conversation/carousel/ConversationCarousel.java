package com.whatsapp.conversation.carousel;

import X.AnonymousClass00C;
import X.AnonymousClass0CP;
import X.AnonymousClass0CZ;
import X.AnonymousClass0I9;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C41221wr;
import X.C95754mE;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class ConversationCarousel extends RecyclerView implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setLayoutManager(AnonymousClass0CP r2, AnonymousClass0I9 r3) {
        AnonymousClass00C.A0D(r2, 0);
        setLayoutManager(r2);
        if (r3 != null) {
            r3.A07(this);
        }
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void A17(int i) {
        int i2;
        LinearLayoutManager linearLayoutManager;
        AnonymousClass0CZ r0 = this.A0G;
        int i3 = 0;
        if (r0 != null) {
            i2 = r0.A0J();
        } else {
            i2 = 0;
        }
        if (i >= 0 && i < i2) {
            if (i != 0) {
                i3 = -C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            AnonymousClass0CP layoutManager = getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.A1g(i, i3);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void A16() {
        getContext();
        setLayoutManager(new LinearLayoutManager(0), new C95754mE(getWhatsAppLocale()));
    }

    public final int getCurrentPosition() {
        AnonymousClass0CP layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        AnonymousClass00C.A0E(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).A1T();
    }

    public /* synthetic */ ConversationCarousel(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        setClipToPadding(false);
        setClipChildren(false);
        if (C36401kF.A1X(getWhatsAppLocale())) {
            setLayoutDirection(1);
        }
        A0t(new C41221wr(getWhatsAppLocale(), context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
