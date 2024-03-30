package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.SpannableStringBuilder;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0ts  reason: invalid class name and case insensitive filesystem */
public class C18820ts {
    public static final boolean A0B;
    public Context A00;
    public C26611Kv A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final C19630wG A07;
    public final C19900wh A08;
    public final Set A09 = new HashSet();
    public final Object A0A = new Object();

    public String A0F(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return A0B(resourceId);
        }
        return null;
    }

    public String[] A0Q(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = A0B(iArr[i]);
        }
        return strArr;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        }
        A0B = z;
    }

    public static C26611Kv A00(C18820ts r5) {
        C26611Kv r0;
        synchronized (r5.A0A) {
            if (r5.A01 == null) {
                ConditionVariable conditionVariable = C18740tg.A00;
                C224214g r3 = new C224214g("WhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
                r5.A01 = new C26611Kv(r5.A00, r5.A04);
                r3.A01();
            }
            r0 = r5.A01;
        }
        return r0;
    }

    public static void A02(C18820ts r2) {
        synchronized (r2.A0A) {
            r2.A01 = null;
        }
        r2.A03 = null;
        r2.A02 = null;
        C20040wv.A00 = null;
        C20040wv.A01 = null;
        C20040wv.A02 = null;
    }

    public static void A03(C18820ts r3) {
        Context baseContext;
        Context baseContext2;
        if (!r3.A00.getResources().getConfiguration().locale.equals(r3.A04)) {
            if (A0B) {
                Context context = r3.A07.A00;
                while ((context instanceof ContextWrapper) && (baseContext2 = ((ContextWrapper) context).getBaseContext()) != null) {
                    context = baseContext2;
                }
                r3.A00 = context;
                Resources resources = context.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.locale = r3.A04;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } else {
                Configuration configuration2 = new Configuration();
                configuration2.setLocale(r3.A04);
                Context context2 = r3.A07.A00;
                while ((context2 instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context2).getBaseContext()) != null) {
                    context2 = baseContext;
                }
                r3.A00 = context2.createConfigurationContext(configuration2);
            }
            A02(r3);
        }
    }

    public String A05() {
        String country = A01(this.A00).getCountry();
        String[] strArr = C26621Kw.A04;
        if (country != null && C26621Kw.A03.matcher(country).matches()) {
            return country;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("verifynumber/requestcode/invalid-country '");
        sb.append(country);
        sb.append("'");
        Log.i(sb.toString());
        return "ZZ";
    }

    public String A06() {
        String language = A01(this.A00).getLanguage();
        String[] strArr = C26621Kw.A04;
        if (language != null && C26621Kw.A02.matcher(language).matches()) {
            return language;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("verifynumber/requestcode/invalid-language '");
        sb.append(language);
        sb.append("'");
        Log.i(sb.toString());
        return "zz";
    }

    public String A07() {
        StringBuilder sb = new StringBuilder();
        sb.append(A06());
        sb.append("_");
        sb.append(A05());
        return sb.toString();
    }

    public String A09() {
        Locale A012 = A01(this.A00);
        String[] strArr = C26621Kw.A04;
        return A012.toLanguageTag();
    }

    public String A0C(int i, Object... objArr) {
        return String.format(A01(this.A00), A0A(i), objArr);
    }

    public String A0D(int i, Object... objArr) {
        return String.format(A01(this.A00), A0B(i), objArr);
    }

    public String A0I(String str, Object[] objArr, int i) {
        String str2;
        Locale A012 = A01(this.A00);
        C26611Kv A002 = A00(this);
        int i2 = 1;
        if (A002.A07) {
            if (!str.equals("1")) {
                i2 = 2;
            }
            str2 = this.A00.getResources().getQuantityString(i, i2);
        } else {
            C221713d r3 = A002.A05;
            AnonymousClass1MB r2 = r3.A00;
            str2 = null;
            if (r2 != null) {
                int i3 = i - R.plurals.f10nameremoved;
                if (Integer.valueOf(i3) != null) {
                    str2 = r2.A00(r3.A01, str, i3);
                }
            }
            if (str2 == null) {
                try {
                    i2 = (int) Double.parseDouble(str);
                } catch (NumberFormatException unused) {
                }
                str2 = this.A00.getResources().getQuantityString(i, i2);
            }
        }
        return String.format(A012, str2, objArr);
    }

    public String A0J(Map map) {
        String languageTag;
        Locale A012 = A01(this.A00);
        AnonymousClass00C.A0D(A012, 0);
        String languageTag2 = A012.toLanguageTag();
        Map map2 = C190789Ah.A00;
        if (map2.containsKey(languageTag2)) {
            languageTag = (String) map2.get(languageTag2);
        } else {
            languageTag = A012.toLanguageTag();
            Set set = C190789Ah.A01;
            if (!set.contains(languageTag)) {
                List A013 = C221713d.A01(A012, false);
                AnonymousClass00C.A08(A013);
                if (!A013.isEmpty()) {
                    languageTag = (String) A013.get(0);
                    if (!set.contains(languageTag)) {
                        String language = Locale.forLanguageTag(languageTag).getLanguage();
                        if (!(language == null || language.length() == 0)) {
                            if (language.equals("in")) {
                                language = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                            } else if (language.equals("iw")) {
                                language = "he";
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object next : set) {
                                String str = (String) next;
                                AnonymousClass00C.A0D(str, 0);
                                if (str.startsWith(language)) {
                                    arrayList.add(next);
                                }
                            }
                            if (!arrayList.isEmpty() && arrayList.size() == 1) {
                                languageTag = (String) arrayList.get(0);
                            }
                        }
                    }
                }
                languageTag = null;
            }
            AnonymousClass00C.A0B(languageTag2);
            map2.put(languageTag2, languageTag);
        }
        if (languageTag != null) {
            String replace = languageTag.replace("-", "_");
            if (map == null || !map.containsKey(replace)) {
                return replace;
            }
            String str2 = (String) map.get(replace);
            if (str2 != null) {
                return str2;
            }
        }
        return "en_US";
    }

    public String A0K(Object[] objArr, int i, long j) {
        return String.format(A01(this.A00), A00(this).A04.A02(Long.valueOf(j), i), objArr);
    }

    public String A0L(Object[] objArr, int i, long j) {
        return String.format(A01(this.A00), A0E(j, i), objArr);
    }

    public void A0O() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A03(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078 A[LOOP:0: B:9:0x0072->B:11:0x0078, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "whatsapplocale/saveandapplylanguage/language to save: "
            r1.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "device default"
        L_0x0012:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0082
            java.util.Locale r1 = r3.A05
            java.lang.String[] r0 = X.C26621Kw.A04
            java.lang.String r0 = r1.toLanguageTag()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0082
            X.0wh r0 = r3.A08
            android.content.SharedPreferences r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forced_language"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)
            r0.apply()
            r0 = 1
            r3.A06 = r0
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r4)
        L_0x0048:
            r3.A04 = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "whatsapplocale/saveandapplylanguage/setting language "
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.getDisplayLanguage(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Locale r0 = r3.A04
            java.util.Locale.setDefault(r0)
            A03(r3)
            java.util.Set r0 = r3.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0072:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r1.next()
            X.0ws r0 = (X.C20010ws) r0
            r0.BaC()
            goto L_0x0072
        L_0x0082:
            X.0wh r0 = r3.A08
            android.content.SharedPreferences r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forced_language"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            r0 = 0
            r3.A06 = r0
            java.util.Locale r2 = r3.A05
            goto L_0x0048
        L_0x0099:
            r0 = r4
            goto L_0x0012
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820ts.A0P(java.lang.String):void");
    }

    public C18820ts(C19630wG r3, C19900wh r4) {
        Context baseContext;
        this.A07 = r3;
        this.A08 = r4;
        Context context = r3.A00;
        while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.A00 = context;
        Locale A012 = A01(context);
        this.A05 = A012;
        this.A04 = A012;
        C20040wv.A00 = null;
        C20040wv.A01 = null;
        C20040wv.A02 = null;
    }

    public static Locale A01(Context context) {
        return C20030wu.A00(context.getResources().getConfiguration());
    }

    public SpannableStringBuilder A04(CharSequence charSequence) {
        AnonymousClass046 r1 = A00(this).A03;
        return r1.A03(r1.A00, charSequence);
    }

    public String A08() {
        String str = "ZZ";
        if (!A05().equalsIgnoreCase(str)) {
            return A07();
        }
        String A062 = A06();
        boolean A022 = C19550w8.A02();
        HashMap hashMap = AnonymousClass9BF.A04;
        if (A022) {
            str = (String) hashMap.getOrDefault(A062, str);
        } else {
            String str2 = (String) hashMap.get(A062);
            if (str2 != null) {
                str = str2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A062);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    public String A0A(int i) {
        AnonymousClass1MB r0 = A00(this).A04.A00;
        if (r0 != null) {
            return AnonymousClass1MA.A01(r0, i);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = (r6 - com.whatsapp.R.string.f12nameremoved) + 426;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B(int r6) {
        /*
            r5 = this;
            X.1Kv r1 = A00(r5)
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0039
            X.13d r0 = r1.A05
            X.1MB r4 = r0.A00
            if (r4 == 0) goto L_0x0039
            r1 = 2131886080(0x7f120000, float:1.9406729E38)
            if (r6 < r1) goto L_0x0039
            r0 = 2131896235(0x7f1227ab, float:1.9427326E38)
            if (r6 > r0) goto L_0x0039
            int r0 = r6 - r1
            int r3 = r0 + 426
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x0039
            java.util.concurrent.ConcurrentHashMap r1 = r4.A01
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0038
            X.1MC r0 = r4.A00
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0039
            r1.put(r2, r0)
        L_0x0038:
            return r0
        L_0x0039:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820ts.A0B(int):java.lang.String");
    }

    public String A0E(long j, int i) {
        String A002;
        C26611Kv A003 = A00(this);
        if (A003.A07) {
            int i2 = 2;
            if (j == 1) {
                i2 = 1;
            }
            return this.A00.getResources().getQuantityString(i, i2);
        }
        C221713d r4 = A003.A05;
        Long valueOf = Long.valueOf(j);
        AnonymousClass1MB r2 = r4.A00;
        if (r2 != null && i >= R.plurals.f10nameremoved && i <= R.plurals.f10nameremoved) {
            int i3 = i - R.plurals.f10nameremoved;
            if (!(Integer.valueOf(i3) == null || (A002 = r2.A00(r4.A01, valueOf, i3)) == null)) {
                return A002;
            }
        }
        return this.A00.getResources().getQuantityString(i, (int) j);
    }

    public String A0G(String str) {
        AnonymousClass046 r1 = A00(this).A03;
        AnonymousClass048 r0 = r1.A00;
        if (str == null) {
            return null;
        }
        return r1.A03(r0, str).toString();
    }

    public String A0H(String str) {
        AnonymousClass046 r1 = A00(this).A03;
        AnonymousClass048 r0 = AnonymousClass047.A04;
        if (str == null) {
            return null;
        }
        return r1.A03(r0, str).toString();
    }

    public NumberFormat A0M() {
        return (NumberFormat) A00(this).A01.clone();
    }

    public NumberFormat A0N() {
        return (NumberFormat) A00(this).A02.clone();
    }
}
