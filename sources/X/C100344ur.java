package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: X.4ur  reason: invalid class name and case insensitive filesystem */
public class C100344ur extends C98174r0 {
    public /* bridge */ /* synthetic */ Object A0F(View view, C1271967i r15, C140456lc r16, Object obj) {
        int i;
        int i2;
        int i3;
        GradientDrawable gradientDrawable;
        SeekBar seekBar = (SeekBar) view;
        C1271967i r9 = r15;
        C140456lc r10 = r16;
        C124975z6 r8 = (C124975z6) C133266Xn.A05(r15, r10);
        if (r8 != null) {
            seekBar.setIndeterminate(false);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setEnabled(r10.A0f(50, true));
            seekBar.setMax(Integer.MAX_VALUE);
            seekBar.setProgress(r8.A01);
            if (r10.A05.indexOfKey(40) >= 0) {
                seekBar.setProgress((int) (r10.A0S(40, 0.0f) * 2.14748365E9f));
            } else if (!r8.A0E) {
                seekBar.setProgress(r8.A0F);
                r8.A0E = true;
            }
            C160377ku A0X = r10.A0X(38);
            C160377ku A0X2 = r10.A0X(42);
            C160377ku A0X3 = r10.A0X(41);
            if (r8.A08 == null) {
                r8.A08 = seekBar.getThumb();
                LayerDrawable layerDrawable = (LayerDrawable) seekBar.getProgressDrawable();
                if (layerDrawable != null) {
                    GradientDrawable A00 = AnonymousClass6RJ.A00(layerDrawable.findDrawableByLayerId(16908288));
                    GradientDrawable A002 = AnonymousClass6RJ.A00(layerDrawable.findDrawableByLayerId(16908301));
                    GradientDrawable A003 = AnonymousClass6RJ.A00(layerDrawable.findDrawableByLayerId(16908303));
                    if (A00 == null || A002 == null || A003 == null) {
                        throw AnonymousClass001.A09("Track is not using the default Drawable");
                    }
                    r8.A09 = A00;
                    r8.A0A = A002;
                    r8.A0B = A003;
                    Context context = r15.A00;
                    DisplayMetrics A0X4 = AnonymousClass000.A0X(context);
                    Resources.Theme theme = context.getTheme();
                    r8.A03 = (int) ((float) C90514aH.A06((float) 18, ((float) A0X4.densityDpi) / 160.0f));
                    r8.A02 = C90484aE.A09(theme, 16843818, -16776961);
                    r8.A05 = (int) ((float) C90514aH.A06((float) 2, ((float) A0X4.densityDpi) / 160.0f));
                    r8.A04 = C90484aE.A09(theme, 16843818, -16776961);
                    r8.A06 = C90484aE.A09(theme, 16843817, -7829368);
                    int i4 = r8.A03;
                    int i5 = r8.A02;
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(1);
                    gradientDrawable2.setSize(i4, i4);
                    gradientDrawable2.setColor(i5);
                    seekBar.setThumb(gradientDrawable2);
                    seekBar.setThumbOffset(0);
                    AnonymousClass6RJ.A01(r8, r8.A05);
                    int i6 = r8.A04;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    GradientDrawable gradientDrawable3 = r8.A0A;
                    if (gradientDrawable3 != null) {
                        C90514aH.A1H(mode, gradientDrawable3, i6);
                    }
                    int i7 = r8.A06;
                    GradientDrawable gradientDrawable4 = r8.A09;
                    if (gradientDrawable4 != null) {
                        C90514aH.A1H(mode, gradientDrawable4, i7);
                    }
                } else {
                    throw AnonymousClass001.A09("Track drawable is null");
                }
            }
            C140456lc A0W = r10.A0W(43);
            if (A0W != null) {
                i = AnonymousClass5Z8.A01(r15, A0W, 0);
            } else {
                i = r8.A04;
            }
            C140456lc A0W2 = r10.A0W(48);
            if (A0W2 != null) {
                i2 = AnonymousClass5Z8.A01(r15, A0W2, 0);
            } else {
                i2 = r8.A06;
            }
            int i8 = r8.A05;
            try {
                String str = (String) C140456lc.A0I(r10, 46);
                float f = (float) i8;
                if (str != null) {
                    f = AnonymousClass6Y7.A01(str);
                }
                i8 = (int) f;
            } catch (AnonymousClass5R5 unused) {
                AnonymousClass6RS.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider track height");
            }
            if (i8 != r8.A05) {
                AnonymousClass6RJ.A01(r8, i8);
            }
            if (i != r8.A04) {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC;
                GradientDrawable gradientDrawable5 = r8.A0A;
                if (gradientDrawable5 != null) {
                    C90514aH.A1H(mode2, gradientDrawable5, i);
                }
            }
            if (i2 != r8.A06) {
                PorterDuff.Mode mode3 = PorterDuff.Mode.SRC;
                GradientDrawable gradientDrawable6 = r8.A09;
                if (gradientDrawable6 != null) {
                    C90514aH.A1H(mode3, gradientDrawable6, i2);
                }
            }
            int i9 = r8.A03;
            try {
                String str2 = (String) C140456lc.A0I(r10, 45);
                float f2 = (float) i9;
                if (str2 != null) {
                    f2 = AnonymousClass6Y7.A01(str2);
                }
                i9 = (int) f2;
            } catch (AnonymousClass5R5 unused2) {
                AnonymousClass6RS.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider thumb diameter");
            }
            C140456lc A0W3 = r10.A0W(44);
            if (A0W3 != null) {
                i3 = AnonymousClass5Z8.A01(r15, A0W3, 0);
            } else {
                i3 = r8.A02;
            }
            if (i9 != r8.A00) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(i9, i9);
            } else {
                gradientDrawable = (GradientDrawable) seekBar.getThumb();
            }
            gradientDrawable.setColor(i3);
            seekBar.setThumb(gradientDrawable);
            seekBar.setThumbOffset(0);
            r8.A00 = i9;
            seekBar.setSplitTrack(false);
            seekBar.setPadding(0, 0, 0, 0);
            seekBar.refreshDrawableState();
            if (A0X == null && A0X2 == null && A0X3 == null) {
                r8.A0D = null;
                r8.A0C = null;
                return null;
            }
            r8.A0D = r10;
            r8.A0C = r15;
            seekBar.setOnSeekBarChangeListener(new C136156dr(this, r8, r9, r10, A0X2, A0X3));
            return null;
        }
        throw C90514aH.A0s("SliderController is null even though a controller is defined");
    }

    public /* bridge */ /* synthetic */ void A0H(View view, C1271967i r6, C140456lc r7, Object obj, Object obj2) {
        SeekBar seekBar = (SeekBar) view;
        C124975z6 r3 = (C124975z6) C133266Xn.A05(r6, r7);
        if (r3 != null) {
            AnonymousClass6RJ.A00.removeMessages(0, r3);
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            r3.A01 = seekBar.getProgress();
            seekBar.setProgress(0);
            seekBar.setEnabled(true);
            GradientDrawable gradientDrawable = r3.A09;
            if (!(gradientDrawable == null || r3.A0A == null || r3.A0B == null)) {
                gradientDrawable.clearColorFilter();
                r3.A0A.clearColorFilter();
                r3.A0B.clearColorFilter();
            }
            AnonymousClass6RJ.A01(r3, r3.A05);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setMax(0);
            return;
        }
        throw C90514aH.A0s("SliderController is null even though a controller is defined");
    }

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        return new SeekBar(context);
    }

    public C100344ur(C1271967i r1, C140456lc r2) {
        super(r1, r2);
    }
}
