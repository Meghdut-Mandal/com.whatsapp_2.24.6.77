package com.airbnb.lottie;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6TF;
import X.AnonymousClass759;
import X.AnonymousClass7eC;
import X.AnonymousClass81G;
import X.AnonymousClass92Z;
import X.AnonymousClass93V;
import X.AnonymousClass98N;
import X.AnonymousClass9L1;
import X.AnonymousClass9R3;
import X.AnonymousClass9Y2;
import X.B4R;
import X.B8W;
import X.B8Y;
import X.B8Z;
import X.C013105r;
import X.C165597tg;
import X.C165647tl;
import X.C165727u3;
import X.C165737u4;
import X.C166307vV;
import X.C187718yQ;
import X.C187768yV;
import X.C188158z8;
import X.C193779Mv;
import X.C197949ce;
import X.C199409fG;
import X.C201629k0;
import X.C203529oE;
import X.C208239xu;
import X.C208249xv;
import X.C208269xx;
import X.C21727AYe;
import X.C22771Avh;
import X.C36361kB;
import X.C36441kJ;
import X.C90524aI;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class LottieAnimationView extends AppCompatImageView {
    public static final AnonymousClass7eC A0E = C208269xx.A00;
    public int A00 = 0;
    public AnonymousClass9Y2 A01;
    public AnonymousClass7eC A02;
    public boolean A03 = true;
    public int A04;
    public AnonymousClass6TF A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final C165737u4 A09 = new C165737u4();
    public final Set A0A = C36441kJ.A16();
    public final Set A0B = C36441kJ.A16();
    public final AnonymousClass7eC A0C = new C208249xv(this);
    public final AnonymousClass7eC A0D = new C208239xu(this);

    public void A03() {
        this.A07 = false;
        this.A09.A06();
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C203529oE.A07(new AnonymousClass759((Object) inputStream, 22), str, new B8Z(1, str, inputStream)));
    }

    private void A00() {
        AnonymousClass6TF r2 = this.A05;
        if (r2 != null) {
            AnonymousClass7eC r1 = this.A0C;
            synchronized (r2) {
                r2.A02.remove(r1);
            }
            AnonymousClass6TF r22 = this.A05;
            AnonymousClass7eC r12 = this.A0D;
            synchronized (r22) {
                r22.A01.remove(r12);
            }
        }
    }

    private void setCompositionTask(AnonymousClass6TF r3) {
        this.A0B.add(C188158z8.SET_ANIMATION);
        this.A01 = null;
        this.A09.A05();
        A00();
        r3.A02(this.A0C);
        r3.A01(this.A0D);
        this.A05 = r3;
    }

    public void A02() {
        this.A0B.add(C188158z8.PLAY_OPTION);
        C165737u4 r1 = this.A09;
        r1.A0c.clear();
        r1.A0b.cancel();
        C165597tg.A18(r1);
    }

    public void A04() {
        this.A0B.add(C188158z8.PLAY_OPTION);
        this.A09.A07();
    }

    public void A05(Animator.AnimatorListener animatorListener) {
        this.A09.A0b.addListener(animatorListener);
    }

    public C187718yQ getAsyncUpdates() {
        return this.A09.A0C;
    }

    public boolean getAsyncUpdatesEnabled() {
        return C36361kB.A1a(this.A09.A0C, C187718yQ.ENABLED);
    }

    public boolean getClipToCompositionBounds() {
        return this.A09.A0P;
    }

    public long getDuration() {
        AnonymousClass9Y2 r0 = this.A01;
        if (r0 != null) {
            return (long) r0.A01();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.A09.A0b.A00;
    }

    public String getImageAssetsFolder() {
        return this.A09.A0N;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.A09.A0U;
    }

    public float getMaxFrame() {
        return this.A09.A0b.A01();
    }

    public float getMinFrame() {
        return this.A09.A0b.A02();
    }

    public AnonymousClass9L1 getPerformanceTracker() {
        AnonymousClass9Y2 r0 = this.A09.A0F;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public float getProgress() {
        return this.A09.A0b.A00();
    }

    public C187768yV getRenderMode() {
        if (this.A09.A0Z) {
            return C187768yV.SOFTWARE;
        }
        return C187768yV.HARDWARE;
    }

    public int getRepeatCount() {
        return this.A09.A0b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A09.A0b.getRepeatMode();
    }

    public float getSpeed() {
        return this.A09.A0b.A04;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C166307vV)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C166307vV r4 = (C166307vV) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        this.A06 = r4.A04;
        Set set = this.A0B;
        C188158z8 r1 = C188158z8.SET_ANIMATION;
        if (!set.contains(r1) && !TextUtils.isEmpty(this.A06)) {
            setAnimation(this.A06);
        }
        this.A04 = r4.A01;
        if (!set.contains(r1) && (i = this.A04) != 0) {
            setAnimation(i);
        }
        if (!set.contains(C188158z8.SET_PROGRESS)) {
            this.A09.A0B(r4.A00);
        }
        if (!set.contains(C188158z8.PLAY_OPTION) && r4.A06) {
            A04();
        }
        if (!set.contains(C188158z8.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(r4.A05);
        }
        if (!set.contains(C188158z8.SET_REPEAT_MODE)) {
            setRepeatMode(r4.A03);
        }
        if (!set.contains(C188158z8.SET_REPEAT_COUNT)) {
            setRepeatCount(r4.A02);
        }
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.A09.A0S = z;
    }

    public void setAsyncUpdates(C187718yQ r2) {
        this.A09.A0C = r2;
    }

    public void setClipToCompositionBounds(boolean z) {
        C165737u4 r1 = this.A09;
        if (z != r1.A0P) {
            r1.A0P = z;
            AnonymousClass81G r0 = r1.A0K;
            if (r0 != null) {
                r0.A01 = z;
            }
            r1.invalidateSelf();
        }
    }

    public void setComposition(AnonymousClass9Y2 r4) {
        boolean z;
        C165737u4 r2 = this.A09;
        r2.setCallback(this);
        this.A01 = r4;
        this.A08 = true;
        boolean A0K = r2.A0K(r4);
        this.A08 = false;
        if (getDrawable() == r2) {
            if (!A0K) {
                return;
            }
        } else if (!A0K) {
            C165647tl r0 = r2.A0b;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A07;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(r2);
            if (z) {
                r2.A08();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (AnonymousClass9R3 A002 : this.A0A) {
            A002.A00();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C165737u4 r3 = this.A09;
        r3.A0M = str;
        if (r3.getCallback() != null) {
            C193779Mv r2 = r3.A0I;
            if (r2 == null) {
                r2 = new C193779Mv(r3.getCallback(), r3.A0D);
                r3.A0I = r2;
                String str2 = r3.A0M;
                if (str2 != null) {
                    r2.A01 = str2;
                }
            }
            r2.A01 = str;
        }
    }

    public void setFontAssetDelegate(AnonymousClass93V r2) {
        C165737u4 r0 = this.A09;
        r0.A0D = r2;
        C193779Mv r02 = r0.A0I;
        if (r02 != null) {
            r02.A00 = r2;
        }
    }

    public void setFontMap(Map map) {
        C165737u4 r1 = this.A09;
        if (map != r1.A0O) {
            r1.A0O = map;
            r1.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.A09.A0C(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.A09.A0R = z;
    }

    public void setImageAssetDelegate(C22771Avh avh) {
        C165737u4 r0 = this.A09;
        r0.A0E = avh;
        C197949ce r02 = r0.A0J;
        if (r02 != null) {
            r02.A00 = avh;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A09.A0N = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.A09.A0U = z;
    }

    public void setMaxFrame(int i) {
        this.A09.A0D(i);
    }

    public void setMaxProgress(float f) {
        this.A09.A09(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.A09.A0I(str);
    }

    public void setMinFrame(int i) {
        this.A09.A0E(i);
    }

    public void setMinProgress(float f) {
        this.A09.A0A(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C165737u4 r1 = this.A09;
        if (r1.A0V != z) {
            r1.A0V = z;
            AnonymousClass81G r0 = r1.A0K;
            if (r0 != null) {
                r0.A0E(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C165737u4 r0 = this.A09;
        r0.A0W = z;
        AnonymousClass9Y2 r02 = r0.A0F;
        if (r02 != null) {
            r02.A0D.A00 = z;
        }
    }

    public void setProgress(float f) {
        this.A0B.add(C188158z8.SET_PROGRESS);
        this.A09.A0B(f);
    }

    public void setRenderMode(C187768yV r2) {
        C165737u4 r0 = this.A09;
        r0.A0G = r2;
        C165737u4.A04(r0);
    }

    public void setRepeatCount(int i) {
        this.A0B.add(C188158z8.SET_REPEAT_COUNT);
        this.A09.A0b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.A0B.add(C188158z8.SET_REPEAT_MODE);
        this.A09.A0b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.A09.A0X = z;
    }

    public void setSpeed(float f) {
        this.A09.A0b.A04 = f;
    }

    public void setTextDelegate(AnonymousClass92Z r2) {
        this.A09.A0H = r2;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.A09.A0b.A08 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = (X.C165737u4) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0013
            X.7u4 r0 = r2.A09
            if (r3 != r0) goto L_0x0017
            X.7tl r0 = r0.A0b
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0017
            r2.A03()
        L_0x0013:
            super.unscheduleDrawable(r3)
            return
        L_0x0017:
            boolean r0 = r3 instanceof X.C165737u4
            if (r0 == 0) goto L_0x0013
            r1 = r3
            X.7u4 r1 = (X.C165737u4) r1
            X.7tl r0 = r1.A0b
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0013
            r1.A06()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet, R.attr.f4nameremoved);
    }

    private void A01(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass98N.A00, i, 0);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(13);
        boolean hasValue2 = obtainStyledAttributes.hasValue(8);
        boolean hasValue3 = obtainStyledAttributes.hasValue(18);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(13, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw AnonymousClass001.A08("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(8);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(18)) != null) {
            setAnimationFromUrl(string);
        }
        this.A00 = obtainStyledAttributes.getResourceId(7, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A07 = true;
        }
        if (obtainStyledAttributes.getBoolean(11, false)) {
            this.A09.A0b.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatMode(obtainStyledAttributes.getInt(16, 1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatCount(obtainStyledAttributes.getInt(15, -1));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setSpeed(obtainStyledAttributes.getFloat(17, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(3, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(5));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(10));
        boolean hasValue4 = obtainStyledAttributes.hasValue(12);
        float f = obtainStyledAttributes.getFloat(12, 0.0f);
        if (hasValue4) {
            this.A0B.add(C188158z8.SET_PROGRESS);
        }
        C165737u4 r4 = this.A09;
        r4.A0B(f);
        boolean z2 = obtainStyledAttributes.getBoolean(6, false);
        if (r4.A0Q != z2) {
            r4.A0Q = z2;
            if (r4.A0F != null) {
                C165737u4.A03(r4);
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            r4.A0G(new C201629k0("**"), new C199409fG(new C165727u3(C013105r.A00(getContext(), obtainStyledAttributes.getResourceId(4, -1)).getDefaultColor())), B4R.A01);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            int i2 = obtainStyledAttributes.getInt(14, 0);
            if (i2 >= C187768yV.values().length) {
                i2 = 0;
            }
            setRenderMode(C187768yV.values()[i2]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            if (i3 >= C187768yV.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(C187718yQ.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(9, false));
        if (obtainStyledAttributes.hasValue(19)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(19, false));
        }
        obtainStyledAttributes.recycle();
        if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        r4.A0Y = Boolean.valueOf(z).booleanValue();
    }

    public AnonymousClass9Y2 getComposition() {
        return this.A01;
    }

    public void invalidate() {
        C187768yV r1;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C165737u4) {
            if (((C165737u4) drawable).A0Z) {
                r1 = C187768yV.SOFTWARE;
            } else {
                r1 = C187768yV.HARDWARE;
            }
            if (r1 == C187768yV.SOFTWARE) {
                this.A09.invalidateSelf();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C165737u4 r0 = this.A09;
        if (drawable2 == r0) {
            super.invalidateDrawable(r0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.A07) {
            this.A09.A07();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r1 == X.C023109s.A0C) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.7vV r5 = new X.7vV
            r5.<init>((android.os.Parcelable) r0)
            java.lang.String r0 = r6.A06
            r5.A04 = r0
            int r0 = r6.A04
            r5.A01 = r0
            X.7u4 r4 = r6.A09
            X.7tl r3 = r4.A0b
            float r0 = r3.A00()
            r5.A00 = r0
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L_0x0036
            boolean r2 = r3.A07
        L_0x0023:
            r5.A06 = r2
            java.lang.String r0 = r4.A0N
            r5.A05 = r0
            int r0 = r3.getRepeatMode()
            r5.A03 = r0
            int r0 = r3.getRepeatCount()
            r5.A02 = r0
            return r5
        L_0x0036:
            java.lang.Integer r1 = r4.A0L
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 == r0) goto L_0x0041
            java.lang.Integer r0 = X.C023109s.A0C
            r2 = 0
            if (r1 != r0) goto L_0x0023
        L_0x0041:
            r2 = 1
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(C90524aI.A0P(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(C203529oE.A07((Runnable) null, str2, new B8W(getContext(), str, str2, 1)));
    }

    public void setImageBitmap(Bitmap bitmap) {
        A00();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        A00();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        A00();
        super.setImageResource(i);
    }

    public void setCacheComposition(boolean z) {
        this.A03 = z;
    }

    public void setFailureListener(AnonymousClass7eC r1) {
        this.A02 = r1;
    }

    public void setFallbackResource(int i) {
        this.A00 = i;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet, i);
    }

    public void setAnimation(String str) {
        Callable b8w;
        boolean z;
        AnonymousClass6TF A072;
        this.A06 = str;
        this.A04 = 0;
        if (isInEditMode()) {
            Executor executor = AnonymousClass6TF.A04;
            b8w = new B8Z(0, str, this);
            z = true;
        } else {
            boolean z2 = this.A03;
            Context context = getContext();
            if (z2) {
                String A0p = AnonymousClass000.A0p("asset_", str, AnonymousClass000.A0u());
                A072 = C203529oE.A07((Runnable) null, A0p, new B8W(context.getApplicationContext(), str, A0p, 0));
                setCompositionTask(A072);
            }
            b8w = new B8W(context.getApplicationContext(), str, (String) null, 0);
            z = false;
        }
        A072 = new AnonymousClass6TF(b8w, z);
        setCompositionTask(A072);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        AnonymousClass6TF r2;
        boolean z = this.A03;
        Context context = getContext();
        if (z) {
            String A0p = AnonymousClass000.A0p("url_", str, AnonymousClass000.A0u());
            r2 = C203529oE.A07((Runnable) null, A0p, new B8W(context, str, A0p, 1));
        } else {
            r2 = new AnonymousClass6TF(new B8W(context, str, (String) null, 1), false);
        }
        setCompositionTask(r2);
    }

    public void setMaxFrame(String str) {
        this.A09.A0H(str);
    }

    public void setMinFrame(String str) {
        this.A09.A0J(str);
    }

    public LottieAnimationView(Context context) {
        super(context, (AttributeSet) null);
        A01((AttributeSet) null, R.attr.f4nameremoved);
    }

    public void setAnimation(int i) {
        Callable aYe;
        boolean z;
        AnonymousClass6TF A062;
        this.A04 = i;
        this.A06 = null;
        if (isInEditMode()) {
            Executor executor = AnonymousClass6TF.A04;
            aYe = new B8Y(this, i, 0);
            z = true;
        } else {
            boolean z2 = this.A03;
            Context context = getContext();
            if (z2) {
                A062 = C203529oE.A06(context, i);
                setCompositionTask(A062);
            }
            aYe = new C21727AYe(context.getApplicationContext(), (String) null, AnonymousClass001.A0F(context), i);
            z = false;
        }
        A062 = new AnonymousClass6TF(aYe, z);
        setCompositionTask(A062);
    }
}
