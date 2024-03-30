package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.C11340g9;
import X.C36341k9;
import X.C36391kE;
import X.C90514aH;
import X.C99274t0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Locale;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public boolean isChecked() {
        return this.A03.isChecked();
    }

    public void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        editText.setVisibility(C90514aH.A0A(z ? 1 : 0));
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new C11340g9(editText));
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    public void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.f9nameremoved, this, false);
        this.A03 = chip;
        chip.A06 = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.f9nameremoved, this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0B;
        this.A02 = editText;
        editText.setVisibility(4);
        C99274t0 r0 = new C99274t0(this);
        this.A00 = r0;
        editText.addTextChangedListener(r0);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(C36341k9.A0F(this).getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        this.A01 = C36391kE.A0P(this, R.id.material_label);
        editText.setId(AnonymousClass04F.A00());
        AnonymousClass04F.A04(this.A01, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String A00(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            Locale locale = chipTextInputComboView.getResources().getConfiguration().locale;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, Integer.parseInt(String.valueOf(charSequence)), 0);
            return String.format(locale, "%02d", A0L);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(C36341k9.A0F(this).getConfiguration().getLocales());
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }
}
