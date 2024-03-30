package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.0tn  reason: invalid class name and case insensitive filesystem */
public class C18770tn extends Resources {
    public final Resources A00;
    public final Context A01;
    public final C18820ts A02;

    public static int A00(int i) {
        C222113i r0;
        if ((!C222013h.A07 && !C222013h.A08) || (r0 = C222013h.A01) == null) {
            return i;
        }
        Number number = (Number) ((Map) r0.A00.getValue()).get(Integer.valueOf(i));
        if (!C222013h.A07 || number == null) {
            return i;
        }
        return number.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x018d, code lost:
        if (r8 != null) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(int r7, android.content.res.Resources.Theme r8) {
        /*
            r6 = this;
            boolean r0 = X.C222013h.A09
            if (r0 == 0) goto L_0x0198
            X.341 r5 = X.C222013h.A00
            if (r5 == 0) goto L_0x0198
            android.content.Context r2 = r6.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 2131101114(0x7f0605ba, float:1.7814629E38)
            r1 = 2130969984(0x7f040580, float:1.7548665E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102007(0x7f060937, float:1.781644E38)
            r1 = 2130970390(0x7f040716, float:1.7549489E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101767(0x7f060847, float:1.7815953E38)
            r1 = 2130970225(0x7f040671, float:1.7549154E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131100348(0x7f0602bc, float:1.7813075E38)
            r1 = 2130969254(0x7f0402a6, float:1.7547185E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101765(0x7f060845, float:1.7815949E38)
            r1 = 2130970224(0x7f040670, float:1.7549152E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            r1 = 2130970398(0x7f04071e, float:1.7549505E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102012(0x7f06093c, float:1.781645E38)
            r1 = 2130970393(0x7f040719, float:1.7549495E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102010(0x7f06093a, float:1.7816446E38)
            r1 = 2130970392(0x7f040718, float:1.7549493E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131100379(0x7f0602db, float:1.7813138E38)
            r1 = 2130969286(0x7f0402c6, float:1.754725E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102021(0x7f060945, float:1.7816468E38)
            r1 = 2130970396(0x7f04071c, float:1.75495E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099674(0x7f06001a, float:1.7811708E38)
            r1 = 2130968579(0x7f040003, float:1.7545816E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101059(0x7f060583, float:1.7814517E38)
            r1 = 2130969809(0x7f0404d1, float:1.754831E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102642(0x7f060bb2, float:1.7817728E38)
            r1 = 2130971162(0x7f040a1a, float:1.7551055E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102641(0x7f060bb1, float:1.7817726E38)
            r1 = 2130971161(0x7f040a19, float:1.7551053E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102622(0x7f060b9e, float:1.7817687E38)
            r1 = 2130971156(0x7f040a14, float:1.7551042E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102637(0x7f060bad, float:1.7817718E38)
            r1 = 2130971158(0x7f040a16, float:1.7551046E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102638(0x7f060bae, float:1.781772E38)
            r1 = 2130971159(0x7f040a17, float:1.7551048E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102215(0x7f060a07, float:1.7816862E38)
            r1 = 2130970618(0x7f0407fa, float:1.7549951E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101073(0x7f060591, float:1.7814545E38)
            r1 = 2130969823(0x7f0404df, float:1.7548339E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101991(0x7f060927, float:1.7816407E38)
            if (r7 == r0) goto L_0x0149
            r0 = 2131099936(0x7f060120, float:1.781224E38)
            if (r7 == r0) goto L_0x0149
            r0 = 2131101971(0x7f060913, float:1.7816367E38)
            r1 = 2130970358(0x7f0406f6, float:1.7549424E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099715(0x7f060043, float:1.7811791E38)
            r1 = 2130968669(0x7f04005d, float:1.7545998E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102421(0x7f060ad5, float:1.781728E38)
            r1 = 2130971050(0x7f0409aa, float:1.7550827E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101072(0x7f060590, float:1.7814543E38)
            r1 = 2130969822(0x7f0404de, float:1.7548337E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101074(0x7f060592, float:1.7814547E38)
            r1 = 2130969824(0x7f0404e0, float:1.754834E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099904(0x7f060100, float:1.7812174E38)
            r1 = 2130968787(0x7f0400d3, float:1.7546238E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099903(0x7f0600ff, float:1.7812172E38)
            r1 = 2130968786(0x7f0400d2, float:1.7546235E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102460(0x7f060afc, float:1.7817359E38)
            r1 = 2130971074(0x7f0409c2, float:1.7550876E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101100(0x7f0605ac, float:1.78146E38)
            r1 = 2130969895(0x7f040527, float:1.7548485E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101873(0x7f0608b1, float:1.7816168E38)
            r1 = 2130970284(0x7f0406ac, float:1.7549274E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131100002(0x7f060162, float:1.7812373E38)
            r1 = 2130968876(0x7f04012c, float:1.7546418E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131100015(0x7f06016f, float:1.78124E38)
            r1 = 2130968884(0x7f040134, float:1.7546434E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102219(0x7f060a0b, float:1.781687E38)
            r1 = 2130970620(0x7f0407fc, float:1.7549955E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131101040(0x7f060570, float:1.7814478E38)
            r1 = 2130969775(0x7f0404af, float:1.7548241E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099934(0x7f06011e, float:1.7812235E38)
            r1 = 2130968815(0x7f0400ef, float:1.7546294E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131102027(0x7f06094b, float:1.781648E38)
            r1 = 2130970397(0x7f04071d, float:1.7549503E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131099927(0x7f060117, float:1.7812221E38)
            r1 = 2130968813(0x7f0400ed, float:1.754629E38)
            if (r7 == r0) goto L_0x014c
            r0 = 2131100905(0x7f0604e9, float:1.7814205E38)
            if (r7 != r0) goto L_0x0198
            r1 = 2130969683(0x7f040453, float:1.7548055E38)
            goto L_0x014c
        L_0x0149:
            r1 = 2130970364(0x7f0406fc, float:1.7549436E38)
        L_0x014c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0198 }
            if (r0 == 0) goto L_0x0198
            int r4 = r0.intValue()     // Catch:{ Exception -> 0x0198 }
            android.util.TypedValue r3 = new android.util.TypedValue     // Catch:{ Exception -> 0x0198 }
            r3.<init>()     // Catch:{ Exception -> 0x0198 }
            if (r8 != 0) goto L_0x018f
            android.content.res.Resources$Theme r0 = r5.A00     // Catch:{ Exception -> 0x0198 }
            if (r0 != 0) goto L_0x018b
            android.content.res.Resources r0 = r2.getResources()     // Catch:{ Exception -> 0x0198 }
            android.content.res.Resources$Theme r1 = r0.newTheme()     // Catch:{ Exception -> 0x0198 }
            android.content.res.Resources$Theme r0 = r2.getTheme()     // Catch:{ Exception -> 0x0198 }
            if (r0 == 0) goto L_0x0172
            r1.setTo(r0)     // Catch:{ Exception -> 0x0198 }
        L_0x0172:
            r5.A00 = r1     // Catch:{ Exception -> 0x0198 }
            r2 = 1
            if (r1 == 0) goto L_0x017d
            r0 = 2132083419(0x7f1502db, float:1.980698E38)
            r1.applyStyle(r0, r2)     // Catch:{ Exception -> 0x0198 }
        L_0x017d:
            boolean r0 = X.C222013h.A06     // Catch:{ Exception -> 0x0198 }
            if (r0 == 0) goto L_0x018b
            android.content.res.Resources$Theme r1 = r5.A00     // Catch:{ Exception -> 0x0198 }
            if (r1 == 0) goto L_0x018b
            r0 = 2132083421(0x7f1502dd, float:1.9806984E38)
            r1.applyStyle(r0, r2)     // Catch:{ Exception -> 0x0198 }
        L_0x018b:
            android.content.res.Resources$Theme r8 = r5.A00     // Catch:{ Exception -> 0x0198 }
            if (r8 == 0) goto L_0x0193
        L_0x018f:
            r0 = 1
            r8.resolveAttribute(r4, r3, r0)     // Catch:{ Exception -> 0x0198 }
        L_0x0193:
            int r0 = r3.resourceId     // Catch:{ Exception -> 0x0198 }
            if (r0 == 0) goto L_0x0198
            return r0
        L_0x0198:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18770tn.A01(int, android.content.res.Resources$Theme):int");
    }

    public static C18770tn A02(Context context, C18820ts r2) {
        if (context == null || r2 == null) {
            throw new NullPointerException("Context and/or Resources and/or WhatsAppLocale can't be null");
        } else if (context.getResources() instanceof C18770tn) {
            return (C18770tn) context.getResources();
        } else {
            return new C18770tn(context, r2);
        }
    }

    public XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    public int getColor(int i) {
        return this.A00.getColor(A01(i, (Resources.Theme) null));
    }

    public ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    public float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        return this.A00.getDrawable(A00(i));
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(A00(i), i2, theme);
    }

    public float getFloat(int i) {
        return this.A00.getFloat(i);
    }

    public Typeface getFont(int i) {
        return this.A00.getFont(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.A02.A0L(objArr, i, (long) i2);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.A02.A0E((long) i2, i);
    }

    public String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.A00.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.A02.A0B(i);
    }

    public String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.A02.A0B(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public C18770tn(Context context, C18820ts r5) {
        super(context.getResources().getAssets(), context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
        this.A01 = context;
        this.A00 = context.getResources();
        this.A02 = r5;
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.A00.getColor(A01(i, theme), theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.A00.getColorStateList(i, theme);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(A00(i), theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(A00(i), i2);
    }

    public String getQuantityString(int i, int i2) {
        return this.A02.A0E((long) i2, i);
    }

    public String getString(int i, Object... objArr) {
        return this.A02.A0D(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        String A0B;
        if (i == 0 || (A0B = this.A02.A0B(i)) == null) {
            return charSequence;
        }
        return A0B;
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }
}
