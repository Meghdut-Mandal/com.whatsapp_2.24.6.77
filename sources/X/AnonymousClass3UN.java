package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.3UN  reason: invalid class name */
public abstract class AnonymousClass3UN {
    public static final AnonymousClass00T A00 = C36431kI.A1I(AnonymousClass4IH.A00);
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 5, 6, 7, 8, 4};

    public static final int A02(AnonymousClass1DU r5, CharSequence charSequence) {
        C36331k8.A1I(r5, charSequence);
        int i = 0;
        int A03 = A03(charSequence, 0, charSequence.length());
        ArrayList A04 = r5.A04(charSequence.toString());
        if (A04 == null) {
            return A03;
        }
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            AnonymousClass00C.A0B(A0C);
            i += A0C.length() - C55812vE.A00(A0C).length();
        }
        return A03 - i;
    }

    public static final String A05(AnonymousClass1DU r7, AnonymousClass3T1 r8) {
        String A1Y;
        AnonymousClass00C.A0D(r7, 0);
        if (r8 instanceof AnonymousClass2cW) {
            return ((AnonymousClass2cW) r8).BGC();
        }
        if (r8 instanceof AnonymousClass2bV) {
            AnonymousClass2bV r1 = (AnonymousClass2bV) r8;
            if (!(r1.A1Y() == null || (A1Y = r1.A1Y()) == null)) {
                SpannableStringBuilder A0P = C36441kJ.A0P(A06(A1Y, 0, A1Y.length(), 10, 700).toString());
                r7.A06(A0P);
                URLSpan[] A1a = C36381kD.A1a(A0P, 0);
                AnonymousClass00C.A0B(A1a);
                for (URLSpan uRLSpan : A1a) {
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    AnonymousClass00C.A08(url);
                    A0P.replace(spanStart, spanEnd, C55812vE.A00(url));
                }
                return C36381kD.A0y(A0P);
            }
        }
        return r8.A0b();
    }

    public static final String A07(String str) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass2MA r4 = new AnonymousClass2MA(str);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 10) {
                i2 += 50;
            } else {
                i2++;
            }
            if (i2 > 700) {
                break;
            }
            r4.A00 = i;
            i += r4.A03(C1898996a.A00(r4, false), i);
        }
        return C36431kI.A16(0, i, str);
    }

    public static final int A00() {
        return A01[Math.abs(((Random) A00.getValue()).nextInt()) % 21];
    }

    public static final int A01(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = 19;
            if (i < 50) {
                return 24;
            }
            if (i < 150) {
                if (i2 >= 640) {
                    return i3;
                }
                return 16;
            } else if (i2 < 560) {
                return 14;
            } else {
                if (i2 < 640) {
                    return 16;
                }
            }
        } else if (i < 50) {
            return 32;
        } else {
            i3 = 16;
            if (i < 150) {
                return 24;
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0.A00 <= 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.C145166tS r4, int r5) {
        /*
            if (r4 == 0) goto L_0x0027
            android.graphics.Bitmap r0 = r4.A0B()
        L_0x0006:
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.36r r0 = r4.A05
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A00
            r2 = 1
            if (r0 > 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r0 = 250(0xfa, float:3.5E-43)
            boolean r1 = X.C36371kC.A1T(r5, r0)
            byte[] r0 = r4.A0R
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r2 != 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UN.A09(X.6tS, int):boolean");
    }

    public static final int A03(CharSequence charSequence, int i, int i2) {
        StringBuilder A0i = C36341k9.A0i(charSequence);
        while (i < i2) {
            if (charSequence.charAt(i) != 10) {
                A0i.append(charSequence.charAt(i));
            }
            i++;
        }
        return C63883Lu.A00(A0i.toString());
    }

    public static final Typeface A04(Context context, int i) {
        switch (i) {
            case 1:
                return Typeface.SERIF;
            case 2:
                Typeface typeface = AnonymousClass5Cl.A0J;
                if (typeface != null) {
                    return typeface;
                }
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/FacebookScriptWA-Regular.otf");
                AnonymousClass5Cl.A0J = createFromAsset;
                return createFromAsset;
            case 4:
                return Typeface.DEFAULT_BOLD;
            case 5:
                Typeface typeface2 = AnonymousClass5Cl.A0H;
                if (typeface2 != null) {
                    return typeface2;
                }
                Typeface createFromAsset2 = Typeface.createFromAsset(context.getAssets(), "fonts/MorningBreeze-Regular.ttf");
                AnonymousClass5Cl.A0H = createFromAsset2;
                return createFromAsset2;
            case 6:
                Typeface typeface3 = AnonymousClass5Cl.A0G;
                if (typeface3 != null) {
                    return typeface3;
                }
                Typeface createFromAsset3 = Typeface.createFromAsset(context.getAssets(), "fonts/Calistoga-Regular.ttf");
                AnonymousClass5Cl.A0G = createFromAsset3;
                return createFromAsset3;
            case 7:
                Typeface typeface4 = AnonymousClass5Cl.A0I;
                if (typeface4 != null) {
                    return typeface4;
                }
                Typeface createFromAsset4 = Typeface.createFromAsset(context.getAssets(), "fonts/Exo2-ExtraBold.ttf");
                AnonymousClass5Cl.A0I = createFromAsset4;
                return createFromAsset4;
            case 8:
                Typeface typeface5 = AnonymousClass5Cl.A0K;
                if (typeface5 != null) {
                    return typeface5;
                }
                Typeface createFromAsset5 = Typeface.createFromAsset(context.getAssets(), "fonts/CourierPrime-Bold.ttf");
                AnonymousClass5Cl.A0K = createFromAsset5;
                return createFromAsset5;
            default:
                return Typeface.SANS_SERIF;
        }
    }

    public static final String A06(CharSequence charSequence, int i, int i2, int i3, int i4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i5 = i; i5 < i2 && i3 >= 0 && i4 > 0; i5++) {
            A0u.append(charSequence.charAt(i5));
            if (charSequence.charAt(i5) == 10) {
                i3--;
            } else {
                i4--;
            }
        }
        if (A0u.length() > 0 && A0u.charAt(A0u.length() - 1) == 10 && charSequence.charAt(i) != 10 && i != i2 - 1) {
            A0u.deleteCharAt(A0u.length() - 1);
        }
        return C36381kD.A0y(A0u);
    }

    public static final void A08(Context context, View view) {
        int i;
        C36321k7.A0w(view, context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (((float) AnonymousClass000.A0X(context).widthPixels) > context.getResources().getDimension(R.dimen.f7nameremoved) + (((float) 2) * context.getResources().getDimension(R.dimen.f7nameremoved))) {
            i = C36441kJ.A05(context.getResources(), R.dimen.f7nameremoved);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
