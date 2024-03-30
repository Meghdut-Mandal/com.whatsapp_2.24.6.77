package com.whatsapp.authentication;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0BQ;
import X.AnonymousClass1QZ;
import X.AnonymousClass3BV;
import X.C05250Oz;
import X.C1496972k;
import X.C18700tb;
import X.C21060yb;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C89164Vm;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class FingerprintView extends LinearLayout implements C18700tb {
    public AnonymousClass3BV A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final TextView A03;
    public final AnonymousClass0BQ A04;
    public final AnonymousClass0BQ A05;
    public final ImageView A06;
    public final AnonymousClass0BQ A07;
    public final AnonymousClass0BQ A08;
    public final Runnable A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FingerprintView(Context context) {
        this(context, (AttributeSet) null, 0, R.style.f13nameremoved);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A02(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        setError(charSequence.toString());
        ImageView imageView = this.A06;
        imageView.removeCallbacks(this.A09);
        Drawable drawable = imageView.getDrawable();
        AnonymousClass0BQ r1 = this.A07;
        if (!AnonymousClass00C.A0J(drawable, r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
            r1.A08(new C89164Vm(this, 0));
        }
    }

    public final void A03(String str) {
        AnonymousClass00C.A0D(str, 0);
        setError(str);
        ImageView imageView = this.A06;
        Drawable drawable = imageView.getDrawable();
        AnonymousClass0BQ r1 = this.A07;
        if (!AnonymousClass00C.A0J(drawable, r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
        }
        Runnable runnable = this.A09;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public final void A01() {
        C36391kE.A1K(this.A03);
        ImageView imageView = this.A06;
        imageView.removeCallbacks(this.A09);
        AnonymousClass0BQ r2 = this.A08;
        imageView.setImageDrawable(r2);
        r2.start();
        r2.A08(new C89164Vm(this, 1));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public static final void A00(AnonymousClass0BQ r4, FingerprintView fingerprintView) {
        String A0m = C36361kB.A0m(fingerprintView.getContext(), R.string.f12nameremoved);
        if (fingerprintView.getContext() != null) {
            TextView textView = fingerprintView.A03;
            textView.setText(A0m);
            C36331k8.A0r(fingerprintView.getContext(), textView, R.color.f6nameremoved);
            textView.announceForAccessibility(A0m);
        }
        fingerprintView.A06.setImageDrawable(r4);
        r4.start();
    }

    private final void setError(String str) {
        if (getContext() != null) {
            TextView textView = this.A03;
            textView.setText(str);
            C36331k8.A0r(getContext(), textView, R.color.f6nameremoved);
            textView.announceForAccessibility(str);
        }
    }

    public final void setListener(AnonymousClass3BV r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FingerprintView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f13nameremoved);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FingerprintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        setOrientation(1);
        LayoutInflater layoutInflater = (LayoutInflater) C21060yb.A02(context, "layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.f9nameremoved, this, true);
            this.A03 = C36351kA.A0F(this, R.id.fingerprint_prompt);
            ImageView A0M = C36361kB.A0M(this, R.id.fingerprint_icon);
            this.A06 = A0M;
            AnonymousClass0BQ A032 = AnonymousClass0BQ.A03(contextThemeWrapper, R.drawable.vec_fingerprint_icon);
            if (A032 != null) {
                this.A05 = A032;
                A0M.setImageDrawable(A032);
                A032.start();
                AnonymousClass0BQ A033 = AnonymousClass0BQ.A03(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_success);
                if (A033 != null) {
                    this.A08 = A033;
                    AnonymousClass0BQ A034 = AnonymousClass0BQ.A03(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_error);
                    if (A034 != null) {
                        this.A07 = A034;
                        AnonymousClass0BQ A035 = AnonymousClass0BQ.A03(contextThemeWrapper, R.drawable.vec_error_to_fingerprint_icon);
                        if (A035 != null) {
                            this.A04 = A035;
                            this.A09 = new C1496972k(this, 33);
                            return;
                        }
                        throw AnonymousClass001.A09("Required value was null.");
                    }
                    throw AnonymousClass001.A09("Required value was null.");
                }
                throw AnonymousClass001.A09("Required value was null.");
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        throw AnonymousClass001.A09("Required value was null.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.f13nameremoved);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FingerprintView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C05250Oz r9) {
        this(context, C36381kD.A0I(attributeSet, i3), C36391kE.A01(i3, i), (i3 & 8) != 0 ? R.style.f13nameremoved : i2);
    }
}
