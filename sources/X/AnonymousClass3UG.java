package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.3UG  reason: invalid class name */
public abstract class AnonymousClass3UG {
    public static boolean A00;

    public static CharSequence A02(Context context, Paint paint, AnonymousClass4T6 r9, AnonymousClass1H2 r10, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SpannableStringBuilder A002 = A00(context, paint, r9, r10, charSequence2, 1.0f);
        int BDX = r9.BDX();
        if (BDX != 0) {
            if (A002 == null) {
                A002 = C36441kJ.A0P(charSequence);
            }
            SpannableStringBuilder delete = A002.delete(BDX + (Character.charCount(Character.codePointAt(charSequence, BDX - 1)) - 1), A002.length());
            delete.append("…");
            return delete;
        } else if (A002 != null) {
            return A002;
        } else {
            return charSequence2;
        }
    }

    public static CharSequence A03(Context context, Paint paint, AnonymousClass1H2 r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (AnonymousClass4T6) null, r8, charSequence2, 1.0f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static CharSequence A04(Context context, Paint paint, AnonymousClass1H2 r7, CharSequence charSequence, float f) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (AnonymousClass4T6) null, r7, charSequence2, f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static String A06(int[] iArr) {
        StringBuilder sb = new StringBuilder(r3);
        for (int chars : iArr) {
            sb.append(Character.toChars(chars));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder A00(Context context, Paint paint, AnonymousClass4T6 r5, AnonymousClass1H2 r6, CharSequence charSequence, float f) {
        C595034e r0;
        if (paint == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            Paint A0K = C36441kJ.A0K();
            A0K.setTextSize((float) dimensionPixelSize);
            r0 = new C595034e(A0K, 1.0f);
        } else {
            r0 = new C595034e(paint, f);
        }
        return A01(context, r5, r0, r6, charSequence);
    }

    public static SpannableStringBuilder A01(Context context, AnonymousClass4T6 r18, C595034e r19, AnonymousClass1H2 r20, CharSequence charSequence) {
        boolean Bin;
        float f;
        Object imageSpan;
        CharSequence charSequence2 = charSequence;
        AnonymousClass2MA r10 = new AnonymousClass2MA(charSequence2);
        int length = charSequence2.length();
        Paint A0K = C36441kJ.A0K();
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                r10.A00 = i;
                long A002 = C1898996a.A00(r10, false);
                int A03 = r10.A03(A002, i);
                AnonymousClass4T6 r2 = r18;
                if (A002 != -1) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence2);
                    }
                    Context context2 = context;
                    BitmapDrawable A05 = r20.A05(context2.getResources(), r10, A002);
                    if (A05 != null) {
                        int i3 = i2 + A03;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i2, i3);
                        C595034e r14 = r19;
                        Paint paint = r14.A01;
                        Paint.FontMetricsInt A003 = AnonymousClass3RV.A00(paint);
                        if (A003 != null) {
                            int textSize = (int) ((r14.A00 * paint.getTextSize() * 1.1f) + 0.5f);
                            A05.setBounds(0, 0, textSize, textSize);
                            imageSpan = new C48952iK(context2, A003, A05, subSequence);
                        } else {
                            if (paint.getFontMetrics() != null) {
                                f = (r14.A00 * paint.getTextSize() * 1.1f) + 0.5f;
                            } else {
                                f = AnonymousClass000.A0X(context2).scaledDensity * 22.0f;
                            }
                            int i4 = (int) f;
                            A05.setBounds(0, 0, i4, i4);
                            imageSpan = new ImageSpan(A05, 0);
                        }
                        spannableStringBuilder.setSpan(imageSpan, i2, i3, 33);
                        if (r18 != null) {
                            Bin = r2.Bin(i, true);
                        } else {
                            continue;
                        }
                    } else if (!C06850Vi.A00(A0K, charSequence2.subSequence(i, i + A03).toString())) {
                        spannableStringBuilder.setSpan(new C37381mH(), i2, i2 + A03, 33);
                    }
                    i2 += A03;
                    i += A03;
                } else if (r18 != null) {
                    Bin = r2.Bin(i, false);
                } else {
                    continue;
                    i2 += A03;
                    i += A03;
                }
                if (!Bin) {
                    break;
                }
                i2 += A03;
                i += A03;
            } else if (charSequence2 instanceof SpannableStringBuilder) {
                return (SpannableStringBuilder) charSequence2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence A05(Context context, AnonymousClass1H2 r4, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        Paint A0K = C36441kJ.A0K();
        A0K.setTextSize((float) dimensionPixelSize);
        SpannableStringBuilder A01 = A01(context, (AnonymousClass4T6) null, new C595034e(A0K, 1.0f), r4, charSequence);
        if (A01 != null) {
            return A01;
        }
        return charSequence;
    }

    public static void A07(Context context, Paint paint, Editable editable, AnonymousClass1H2 r14, float f) {
        BitmapDrawable A05;
        Object imageSpan;
        Paint.FontMetricsInt A002;
        if (!A00) {
            A00 = true;
            String obj = editable.toString();
            int length = obj.length();
            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, length, ImageSpan.class)) {
                if (!(imageSpan2.getDrawable() instanceof AnonymousClass0NO)) {
                    editable.removeSpan(imageSpan2);
                }
            }
            AnonymousClass2MA r3 = new AnonymousClass2MA(obj);
            int i = 0;
            while (i < length) {
                r3.A00 = i;
                long A003 = C1898996a.A00(r3, false);
                int A03 = r3.A03(A003, i);
                if (!(A003 == -1 || (A05 = r14.A05(context.getResources(), r3, A003)) == null)) {
                    if (paint == null || (A002 = AnonymousClass3RV.A00(paint)) == null) {
                        A05.setBounds(0, 0, (int) (AnonymousClass000.A0X(context).scaledDensity * 22.0f), (int) (AnonymousClass000.A0X(context).scaledDensity * 22.0f));
                        imageSpan = new ImageSpan(A05, 0);
                    } else {
                        int textSize = (int) ((paint.getTextSize() * f) + 0.5f);
                        A05.setBounds(0, 0, textSize, textSize);
                        imageSpan = new C48952iK(context, A002, A05, obj.substring(i, i + A03));
                    }
                    editable.setSpan(imageSpan, i, i + A03, 33);
                }
                i += A03;
            }
            A00 = false;
        }
    }

    public static void A08(EditText editText, int[] iArr, int i) {
        int max = Math.max(0, editText.getSelectionStart());
        int max2 = Math.max(0, editText.getSelectionEnd());
        if (max > max2) {
            int i2 = max2;
            max2 = max;
            max = i2;
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(C36361kB.A0n(editText));
            sb.replace(max, max2, A06(iArr));
            if (C63883Lu.A00(sb) > i) {
                return;
            }
        }
        editText.getText().replace(max, max2, A06(iArr));
        int i3 = 0;
        for (int charCount : iArr) {
            i3 += Character.charCount(charCount);
        }
        if (max <= editText.length() - i3) {
            editText.setSelection(max + i3);
        }
    }
}
