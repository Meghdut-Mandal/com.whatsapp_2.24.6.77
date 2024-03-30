package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass0FM;
import X.AnonymousClass7e6;
import X.C36341k9;
import X.C36361kB;
import X.C90524aI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.fragment.app.DialogFragment;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public void A1j(AlertDialog$Builder alertDialog$Builder) {
    }

    public void A1k(boolean z) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = (EditTextPreferenceDialogFragmentCompat) this;
        if (z) {
            String A0n = C36361kB.A0n(editTextPreferenceDialogFragmentCompat.A00);
            EditTextPreference editTextPreference = (EditTextPreference) editTextPreferenceDialogFragmentCompat.A1h();
            editTextPreference.A0R(A0n);
            editTextPreference.A0S(A0n);
        }
    }

    public DialogPreference A1h() {
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((AnonymousClass7e6) AnonymousClass02E.A02(this, true)).B7M(this.A0A.getString("key"));
        this.A03 = dialogPreference2;
        return dialogPreference2;
    }

    public void A1Q(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.A1Q(bundle);
        AnonymousClass02E A022 = AnonymousClass02E.A02(this, true);
        if (A022 instanceof AnonymousClass7e6) {
            AnonymousClass7e6 r2 = (AnonymousClass7e6) A022;
            String string = this.A0A.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) r2.B7M(string);
                this.A03 = dialogPreference;
                this.A05 = dialogPreference.A03;
                this.A07 = dialogPreference.A05;
                this.A06 = dialogPreference.A04;
                this.A04 = dialogPreference.A02;
                this.A00 = dialogPreference.A00;
                Drawable drawable = dialogPreference.A01;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                } else {
                    Bitmap A09 = C90524aI.A09(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    Canvas A0A = C90524aI.A0A(A09);
                    drawable.setBounds(0, 0, A0A.getWidth(), A0A.getHeight());
                    drawable.draw(A0A);
                    bitmapDrawable = new BitmapDrawable(C36341k9.A0G(this), A09);
                }
                this.A02 = bitmapDrawable;
                return;
            }
            this.A05 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.A07 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A06 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.A04 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.A00 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.A02 = new BitmapDrawable(C36341k9.A0G(this), bitmap);
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Target fragment must implement TargetFragment interface");
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public Dialog A1a(Bundle bundle) {
        View inflate;
        AnonymousClass01I A0h = A0h();
        this.A01 = -2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(A0h);
        alertDialog$Builder.setTitle(this.A05);
        alertDialog$Builder.A00.A0B = this.A02;
        alertDialog$Builder.A0S(this, this.A07);
        alertDialog$Builder.A0Q(this, this.A06);
        int i = this.A00;
        if (i == 0 || (inflate = A0c().inflate(i, (ViewGroup) null)) == null) {
            alertDialog$Builder.A0Z(this.A04);
        } else {
            A1i(inflate);
            alertDialog$Builder.setView(inflate);
        }
        A1j(alertDialog$Builder);
        AnonymousClass0FM create = alertDialog$Builder.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public void A1i(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        A1k(AnonymousClass000.A1S(this.A01, -1));
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }
}
