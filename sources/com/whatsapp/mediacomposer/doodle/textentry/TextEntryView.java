package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1H2;
import X.AnonymousClass1QZ;
import X.AnonymousClass3A1;
import X.AnonymousClass3PW;
import X.AnonymousClass3YG;
import X.AnonymousClass3Z7;
import X.AnonymousClass4WL;
import X.C012005e;
import X.C1502074j;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C40621vq;
import X.C597034y;
import X.C75633nY;
import X.C75643nZ;
import X.C75653na;
import X.C89384Wi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public final class TextEntryView extends RelativeLayout implements C18700tb {
    public WaTextView A00;
    public C18820ts A01;
    public AnonymousClass1H2 A02;
    public DoodleEditText A03;
    public TextToolColorPicker A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public RecyclerView A07;
    public WaImageView A08;
    public WaImageView A09;
    public C75643nZ A0A;
    public WDSButton A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void A00(TextEntryView textEntryView, int i) {
        int i2;
        if (i != 1) {
            i2 = R.drawable.text_align_right;
            if (i != 2) {
                i2 = R.drawable.text_align_center;
            }
        } else {
            i2 = R.drawable.text_align_left;
        }
        WaImageView waImageView = textEntryView.A08;
        if (waImageView == null) {
            throw C36331k8.A0d("alignmentButton");
        }
        C36321k7.A0L(textEntryView.getContext(), waImageView, textEntryView.getWhatsAppLocale(), i2);
    }

    public static final void A01(TextEntryView textEntryView, int i) {
        int i2 = R.drawable.text_change_bg;
        if (i == 1) {
            i2 = R.drawable.text_change_bg_non_active;
        }
        WaImageView waImageView = textEntryView.A09;
        if (waImageView == null) {
            throw C36331k8.A0d("backgroundPickerButton");
        }
        C36321k7.A0L(textEntryView.getContext(), waImageView, textEntryView.getWhatsAppLocale(), i2);
    }

    public final void A02(C75643nZ r8, AnonymousClass3A1 r9) {
        AnonymousClass00C.A0D(r9, 0);
        DoodleEditText doodleEditText = (DoodleEditText) C36361kB.A0G(this, R.id.text);
        doodleEditText.setupBackgroundSpan(r9.A04);
        AnonymousClass3PW r2 = r9.A05;
        doodleEditText.setBackgroundStyle(r2.A02);
        doodleEditText.A0F(r2.A03);
        doodleEditText.setFontStyle(r9.A01);
        doodleEditText.A0E(r9.A03);
        int length = r9.A04.length();
        doodleEditText.setSelection(length, length);
        C89384Wi.A00(doodleEditText, r8, 6);
        doodleEditText.A00 = new C75633nY(r8, this);
        doodleEditText.addTextChangedListener(new AnonymousClass4WL(doodleEditText, r8, this));
        this.A03 = doodleEditText;
        WDSButton wDSButton = (WDSButton) C36361kB.A0G(this, R.id.done);
        AnonymousClass3YG.A00(wDSButton, r8, this, 43);
        this.A0B = wDSButton;
        AnonymousClass3Z7 r4 = new AnonymousClass3Z7();
        AnonymousClass3YG.A00(C012005e.A02(this, R.id.main), r8, this, 44);
        C012005e.A02(this, R.id.main).setOnTouchListener(r4);
        DoodleEditText doodleEditText2 = this.A03;
        if (doodleEditText2 == null) {
            throw C36331k8.A0d("doodleEditText");
        }
        doodleEditText2.postDelayed(new C1502074j(r8, this, 0), 500);
        DoodleEditText doodleEditText3 = this.A03;
        if (doodleEditText3 == null) {
            throw C36331k8.A0d("doodleEditText");
        }
        doodleEditText3.A0C(false);
        this.A0A = r8;
        this.A07 = (RecyclerView) C36361kB.A0G(this, R.id.text_recycler_view);
        setUpFontPicker(r9.A01);
        WaImageView waImageView = (WaImageView) C36361kB.A0G(this, R.id.align_button);
        this.A08 = waImageView;
        if (waImageView == null) {
            throw C36331k8.A0d("alignmentButton");
        }
        AnonymousClass3YG.A00(waImageView, this, r8, 46);
        A00(this, r9.A03);
        WaImageView waImageView2 = (WaImageView) C36361kB.A0G(this, R.id.change_bg_button);
        this.A09 = waImageView2;
        if (waImageView2 == null) {
            throw C36331k8.A0d("backgroundPickerButton");
        }
        AnonymousClass3YG.A00(waImageView2, this, r8, 45);
        A01(this, r2.A02);
        TextToolColorPicker textToolColorPicker = (TextToolColorPicker) C36361kB.A0G(this, R.id.text_tool_color_picker);
        this.A04 = textToolColorPicker;
        if (textToolColorPicker == null) {
            throw C36331k8.A0d("textToolColorPicker");
        }
        textToolColorPicker.A04 = new C75653na(r9, this);
        this.A00 = C36341k9.A0Q(this, R.id.text_holder);
    }

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setEntryTextSize(float f) {
        DoodleEditText doodleEditText = this.A03;
        if (doodleEditText == null) {
            throw C36331k8.A0d("doodleEditText");
        }
        doodleEditText.setTextSize(f);
    }

    private final void setUpFontPicker(int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        int[] iArr = {0, 3, 2, 4, 5, 6, 7, 1};
        int i2 = 0;
        int i3 = 0;
        do {
            int i4 = iArr[i2];
            A0I.add(new C597034y(i4, AnonymousClass000.A1S(i4, i)));
            if (i4 == i) {
                i3 = A0I.size() - 1;
            }
            i2++;
        } while (i2 < 8);
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            throw C36331k8.A0d("textRecyclerView");
        }
        C75643nZ r1 = this.A0A;
        if (r1 == null) {
            throw C36331k8.A0d("listener");
        }
        recyclerView.setAdapter(new C40621vq(r1, A0I));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 == null) {
            throw C36331k8.A0d("textRecyclerView");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        linearLayoutManager.A17(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36351kA.A0e(A0W);
            this.A01 = C36341k9.A0T(A0W);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
