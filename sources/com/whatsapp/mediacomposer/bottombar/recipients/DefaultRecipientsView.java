package com.whatsapp.mediacomposer.bottombar.recipients;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass1JZ;
import X.AnonymousClass1QZ;
import X.AnonymousClass38Y;
import X.AnonymousClass3AZ;
import X.AnonymousClass4OF;
import X.AnonymousClass4U9;
import X.C012005e;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18840tu;
import X.C224514j;
import X.C27851Qb;
import X.C27861Qc;
import X.C33521fV;
import X.C33541fX;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36441kJ;
import X.C48752hz;
import X.C75623nX;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public final class DefaultRecipientsView extends LinearLayout implements C18700tb {
    public int A00;
    public C18820ts A01;
    public AnonymousClass4OF A02;
    public AnonymousClass4U9 A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass38Y A08;
    public final HorizontalScrollView A09;
    public final ChipGroup A0A;
    public final TextEmojiLabel A0B;
    public final C33541fX A0C;

    public final void setRecipientsChips(List list, CharSequence charSequence) {
        AnonymousClass00C.A0D(list, 0);
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            chipGroup.removeAllViews();
            if (charSequence != null) {
                Chip A002 = A00(charSequence);
                A002.setChipIcon(AnonymousClass00E.A00(getContext(), R.drawable.ic_status_recipient));
                A002.setChipIconSizeResource(R.dimen.f7nameremoved);
                A002.setIconStartPaddingResource(R.dimen.f7nameremoved);
                A002.setTextStartPaddingResource(R.dimen.f7nameremoved);
                A002.setTag("status_chip");
                A002.setOnClickListener(this.A0C);
                chipGroup.addView(A002);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(it);
                Chip A003 = A00(charSequence);
                A003.setText(A0C2);
                A003.setOnClickListener(this.A0C);
                chipGroup.addView(A003);
            }
            if (this.A07) {
                AnonymousClass1JZ.A0A(this.A09, getWhatsAppLocale());
            }
        }
    }

    public final void setRecipientsListener$app_product_mediacomposer_mediacomposer_non_modified(AnonymousClass4U9 r6) {
        AnonymousClass00C.A0D(r6, 0);
        this.A03 = r6;
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            int childCount = chipGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                chipGroup.getChildAt(i).setOnClickListener(this.A0C);
            }
        }
    }

    public final void setRecipientsTooltipControllerFactory(AnonymousClass4OF r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4OF getRecipientsTooltipControllerFactory() {
        AnonymousClass4OF r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("recipientsTooltipControllerFactory");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public DefaultRecipientsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            C27861Qc.A0p((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    private final Chip A00(CharSequence charSequence) {
        View A0E = C36361kB.A0E(C36351kA.A0C(this), (ViewGroup) null, R.layout.f9nameremoved);
        AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) A0E;
        chip.setChipCornerRadiusResource(R.dimen.f7nameremoved);
        chip.setText(charSequence);
        C36331k8.A0r(getContext(), chip, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        chip.setChipBackgroundColorResource(this.A00);
        chip.setMinHeight(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        chip.setEnabled(this.A05);
        return chip;
    }

    public final void setRecipientsContentDescription(int i) {
        Resources resources = getResources();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, i);
        String quantityString = resources.getQuantityString(R.plurals.f10nameremoved, i, A0L);
        AnonymousClass00C.A08(quantityString);
        this.A09.setContentDescription(quantityString);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultRecipientsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A06) {
            this.A06 = true;
            C27861Qc.A0p((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A0C = new C48752hz(this, 30);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        AnonymousClass4OF recipientsTooltipControllerFactory = getRecipientsTooltipControllerFactory();
        AnonymousClass3AZ r5 = new AnonymousClass3AZ(context, getWhatsAppLocale(), this);
        C18800tq r1 = ((C75623nX) recipientsTooltipControllerFactory).A00.A01;
        this.A08 = new AnonymousClass38Y(r5, C18840tu.A00(r1.A9c), C18840tu.A00(r1.A2W), C18840tu.A00(r1.A9U));
        this.A0B = C36351kA.A0O(this, R.id.recipients_text);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C36361kB.A0G(this, R.id.recipients_scroller);
        this.A09 = horizontalScrollView;
        this.A0A = (ChipGroup) C012005e.A02(this, R.id.recipient_chips);
        C33521fV.A03(horizontalScrollView, R.string.f12nameremoved);
        this.A05 = true;
        this.A07 = true;
        this.A00 = C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
    }
}
