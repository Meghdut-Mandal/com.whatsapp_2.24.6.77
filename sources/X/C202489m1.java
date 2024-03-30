package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.9m1  reason: invalid class name and case insensitive filesystem */
public class C202489m1 {
    public static final HashMap A04 = AnonymousClass001.A0J();
    public static final Class[] A05 = {Context.class, AttributeSet.class};
    public AnonymousClass9XO A00;
    public String[] A01;
    public final Context A02;
    public final Object[] A03 = AnonymousClass001.A0M();

    public static Preference A00(AttributeSet attributeSet, C202489m1 r4, String str) {
        try {
            if (-1 == str.indexOf(46)) {
                return r4.A01(attributeSet, str, r4.A01);
            }
            return r4.A01(attributeSet, str, (String[]) null);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(attributeSet.getPositionDescription());
            InflateException inflateException = new InflateException(AnonymousClass000.A0p(": Error inflating class (not found)", str, A0u));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(attributeSet.getPositionDescription());
            InflateException inflateException2 = new InflateException(AnonymousClass000.A0p(": Error inflating class ", str, A0u2));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.AnonymousClass000.A1D(r10.getPositionDescription(), ": Error inflating class ", r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        throw new android.view.InflateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.AnonymousClass000.A1D(r10.getPositionDescription(), ": Error inflating class ", r11, r1);
        r0 = new android.view.InflateException(r1.toString());
        r0.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[ExcHandler: Exception (r2v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.preference.Preference A01(android.util.AttributeSet r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r9 = this;
            java.util.HashMap r8 = A04
            java.lang.Object r1 = r8.get(r11)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r3 = ": Error inflating class "
            r7 = 1
            if (r1 != 0) goto L_0x0056
            android.content.Context r0 = r9.A02     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            r5 = 0
            if (r12 == 0) goto L_0x0046
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            if (r4 == 0) goto L_0x0046
            r2 = 0
            r1 = 0
        L_0x001b:
            r0 = r12[r1]     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.String r0 = X.C36321k7.A0D(r0, r11)     // Catch:{ ClassNotFoundException -> 0x0026, Exception -> 0x0061 }
            java.lang.Class r1 = java.lang.Class.forName(r0, r5, r6)     // Catch:{ ClassNotFoundException -> 0x0026, Exception -> 0x0061 }
            goto L_0x002c
        L_0x0026:
            r2 = move-exception
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x0045
            goto L_0x001b
        L_0x002c:
            if (r1 != 0) goto L_0x004a
            if (r2 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.String r0 = r10.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            X.AnonymousClass000.A1D(r0, r3, r11, r1)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            android.view.InflateException r0 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
        L_0x0045:
            throw r2     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
        L_0x0046:
            java.lang.Class r1 = java.lang.Class.forName(r11, r5, r6)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
        L_0x004a:
            java.lang.Class[] r0 = A05     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            r1.setAccessible(r7)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            r8.put(r11, r1)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
        L_0x0056:
            java.lang.Object[] r0 = r9.A03     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            r0[r7] = r10     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0     // Catch:{ ClassNotFoundException -> 0x007a, Exception -> 0x0061 }
            return r0
        L_0x0061:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r10.getPositionDescription()
            X.AnonymousClass000.A1D(r0, r3, r11, r1)
            java.lang.String r1 = r1.toString()
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x007a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202489m1.A01(android.util.AttributeSet, java.lang.String, java.lang.String[]):androidx.preference.Preference");
    }

    public C202489m1(Context context, AnonymousClass9XO r6) {
        this.A02 = context;
        this.A00 = r6;
        String[] A1S = C36441kJ.A1S();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(Preference.class.getPackage().getName());
        A1S[0] = AnonymousClass000.A0q(".", A0u);
        A1S[1] = AnonymousClass000.A0p(SwitchPreference.class.getPackage().getName(), ".", AnonymousClass000.A0u());
        this.A01 = A1S;
    }

    public static void A02(AttributeSet attributeSet, Preference preference, C202489m1 r7, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else if (next == 1) {
                return;
            } else {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.A06 = Intent.parseIntent(r7.A02.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = r7.A02.getResources();
                        Bundle bundle = preference.A08;
                        if (bundle == null) {
                            bundle = AnonymousClass001.A07();
                            preference.A08 = bundle;
                        }
                        resources.parseBundleExtra("extra", attributeSet, bundle);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1) {
                                    if (next2 == 3 && xmlPullParser.getDepth() <= depth2) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e2);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference A002 = A00(attributeSet, r7, name);
                        ((PreferenceGroup) preference).A0U(A002);
                        A02(attributeSet, A002, r7, xmlPullParser);
                    }
                }
            }
        }
    }
}
