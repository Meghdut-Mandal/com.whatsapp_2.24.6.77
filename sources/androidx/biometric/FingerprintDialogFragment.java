package androidx.biometric;

import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass759;
import X.AnonymousClass93H;
import X.B83;
import X.BA6;
import X.C001700s;
import X.C167717yg;
import X.C193769Mu;
import X.C36341k9;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public TextView A02;
    public C167717yg A03;
    public ImageView A04;
    public final Handler A05 = C36341k9.A0H();
    public final Runnable A06 = new AnonymousClass759((Object) this, 5);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1h(int r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.A04
            if (r0 == 0) goto L_0x001b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x001b
            X.7yg r0 = r5.A03
            int r4 = r0.A01
            android.content.Context r3 = r5.A1D()
            if (r3 != 0) goto L_0x001c
            java.lang.String r1 = "FingerprintFragment"
            java.lang.String r0 = "Unable to get asset. Context is null."
            android.util.Log.w(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            r2 = 1
            if (r4 == 0) goto L_0x0052
            r0 = 2
            if (r4 != r2) goto L_0x0050
            r1 = 2131231643(0x7f08039b, float:1.8079373E38)
            if (r6 == r0) goto L_0x002d
            r0 = 3
            if (r6 != r0) goto L_0x001b
        L_0x002a:
            r1 = 2131231644(0x7f08039c, float:1.8079375E38)
        L_0x002d:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r3, r1)
            if (r1 == 0) goto L_0x001b
            android.widget.ImageView r0 = r5.A04
            r0.setImageDrawable(r1)
            if (r4 == 0) goto L_0x0048
            r0 = 2
            if (r4 != r2) goto L_0x004d
            if (r6 != r0) goto L_0x0048
        L_0x003f:
            boolean r0 = r1 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r0 == 0) goto L_0x0048
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            r1.start()
        L_0x0048:
            X.7yg r0 = r5.A03
            r0.A01 = r6
            return
        L_0x004d:
            if (r6 != r2) goto L_0x0048
            goto L_0x003f
        L_0x0050:
            if (r4 != r0) goto L_0x001b
        L_0x0052:
            if (r6 != r2) goto L_0x001b
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A1h(int):void");
    }

    private int A03(int i) {
        Context A1D = A1D();
        AnonymousClass01I A0h = A0h();
        if (A1D == null || A0h == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        A1D.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = A0h.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void A1K() {
        super.A1K();
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    public void A1L() {
        super.A1L();
        C167717yg r1 = this.A03;
        r1.A01 = 0;
        r1.A0T(1);
        this.A03.A0U(A0n(R.string.f12nameremoved));
    }

    public void A1Q(Bundle bundle) {
        int i;
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            C167717yg r0 = (C167717yg) C36441kJ.A0b(A0h).A00(C167717yg.class);
            this.A03 = r0;
            C001700s r1 = r0.A0C;
            if (r1 == null) {
                r1 = C36431kI.A0S();
                r0.A0C = r1;
            }
            BA6.A00(this, r1, 6);
            C167717yg r02 = this.A03;
            C001700s r12 = r02.A0B;
            if (r12 == null) {
                r12 = C36431kI.A0S();
                r02.A0B = r12;
            }
            BA6.A00(this, r12, 7);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = A03(AnonymousClass93H.A00());
        } else {
            Context A1D = A1D();
            i = 0;
            if (A1D != null) {
                i = AnonymousClass00F.A00(A1D, R.color.f6nameremoved);
            }
        }
        this.A00 = i;
        this.A01 = A03(16842808);
    }

    public Dialog A1a(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(A0a());
        C193769Mu r0 = this.A03.A06;
        if (r0 != null) {
            charSequence = r0.A03;
        } else {
            charSequence = null;
        }
        alertDialog$Builder.setTitle(charSequence);
        View inflate = LayoutInflater.from(alertDialog$Builder.getContext()).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        TextView A0P = C36391kE.A0P(inflate, R.id.fingerprint_subtitle);
        if (A0P != null) {
            C193769Mu r02 = this.A03.A06;
            if (r02 != null) {
                charSequence3 = r02.A02;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                A0P.setVisibility(8);
            } else {
                A0P.setVisibility(0);
                A0P.setText(charSequence3);
            }
        }
        TextView A0P2 = C36391kE.A0P(inflate, R.id.fingerprint_description);
        if (A0P2 != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                A0P2.setVisibility(8);
            } else {
                A0P2.setVisibility(0);
                A0P2.setText((CharSequence) null);
            }
        }
        this.A04 = C36391kE.A0N(inflate, R.id.fingerprint_icon);
        this.A02 = C36391kE.A0P(inflate, R.id.fingerprint_error);
        C167717yg r2 = this.A03;
        if ((r2.A0S() & 32768) != 0) {
            charSequence2 = A0n(R.string.f12nameremoved);
        } else {
            charSequence2 = r2.A0G;
            if (charSequence2 == null) {
                C193769Mu r03 = r2.A06;
                if (r03 != null) {
                    charSequence2 = r03.A01;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                } else {
                    charSequence2 = null;
                }
            }
        }
        alertDialog$Builder.A0Q(new B83(this, 0), charSequence2);
        alertDialog$Builder.setView(inflate);
        AnonymousClass0FM create = alertDialog$Builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C167717yg r2 = this.A03;
        C001700s r1 = r2.A0E;
        if (r1 == null) {
            r1 = C36431kI.A0S();
            r2.A0E = r1;
        }
        C167717yg.A01(r1, true);
    }
}
