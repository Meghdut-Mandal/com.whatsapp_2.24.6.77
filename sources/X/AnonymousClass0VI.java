package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0VI  reason: invalid class name */
public abstract class AnonymousClass0VI {
    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        if (!AnonymousClass0Yh.A04(str, xmlPullParser)) {
            return 0.0f;
        }
        return typedArray.getFloat(i, 0.0f);
    }

    public static Shader A01(Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i;
        int color;
        int color2;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser2.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            Resources resources2 = resources;
            AttributeSet attributeSet2 = attributeSet;
            TypedArray A02 = AnonymousClass0Yh.A02(theme2, resources2, attributeSet2, C33531fW.A03);
            float A00 = A00(A02, "startX", xmlPullParser2, 8);
            float A002 = A00(A02, "startY", xmlPullParser2, 9);
            float A003 = A00(A02, "endX", xmlPullParser2, 10);
            float A004 = A00(A02, "endY", xmlPullParser2, 11);
            float A005 = A00(A02, "centerX", xmlPullParser2, 3);
            float A006 = A00(A02, "centerY", xmlPullParser2, 4);
            int i2 = 0;
            if (!AnonymousClass0Yh.A04(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, xmlPullParser2)) {
                i = 0;
            } else {
                i = A02.getInt(2, 0);
            }
            if (!AnonymousClass0Yh.A04("startColor", xmlPullParser2)) {
                color = 0;
            } else {
                color = A02.getColor(0, 0);
            }
            boolean A04 = AnonymousClass0Yh.A04("centerColor", xmlPullParser2);
            if (!AnonymousClass0Yh.A04("centerColor", xmlPullParser2)) {
                color2 = 0;
            } else {
                color2 = A02.getColor(7, 0);
            }
            int i3 = 0;
            if (AnonymousClass0Yh.A04("endColor", xmlPullParser2)) {
                i2 = A02.getColor(1, 0);
            }
            if (AnonymousClass0Yh.A04("tileMode", xmlPullParser2)) {
                i3 = A02.getInt(6, 0);
            }
            float A007 = A00(A02, "gradientRadius", xmlPullParser2, 5);
            A02.recycle();
            C07500Xy A022 = A02(theme2, resources2, attributeSet2, xmlPullParser2);
            if (A022 == null) {
                if (!A04) {
                    A022 = new C07500Xy(color, i2);
                }
            }
            if (i != 1) {
                int[] iArr = A022.A01;
                float[] fArr = A022.A00;
                if (i == 2) {
                    return new SweepGradient(A005, A006, iArr, fArr);
                }
                if (i3 == 1) {
                    tileMode2 = Shader.TileMode.REPEAT;
                } else if (i3 != 2) {
                    tileMode2 = Shader.TileMode.CLAMP;
                } else {
                    tileMode2 = Shader.TileMode.MIRROR;
                }
                return new LinearGradient(A00, A002, A003, A004, iArr, fArr, tileMode2);
            } else if (A007 > 0.0f) {
                int[] iArr2 = A022.A01;
                float[] fArr2 = A022.A00;
                if (i3 == 1) {
                    tileMode = Shader.TileMode.REPEAT;
                } else if (i3 != 2) {
                    tileMode = Shader.TileMode.CLAMP;
                } else {
                    tileMode = Shader.TileMode.MIRROR;
                }
                return new RadialGradient(A005, A006, A007, iArr2, fArr2, tileMode);
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(AnonymousClass000.A0p(": invalid gradient color tag ", name, AnonymousClass000.A0w(xmlPullParser2)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(X.AnonymousClass000.A0q(": <item> tag requires a 'color' attribute and a 'offset' attribute!", X.AnonymousClass000.A0w(r11)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C07500Xy A02(android.content.res.Resources.Theme r8, android.content.res.Resources r9, android.util.AttributeSet r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            int r0 = r11.getDepth()
            r7 = 1
            int r6 = r0 + 1
            r0 = 20
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L_0x0013:
            int r2 = r11.next()
            if (r2 == r7) goto L_0x006e
            int r1 = r11.getDepth()
            if (r1 >= r6) goto L_0x0022
            r0 = 3
            if (r2 == r0) goto L_0x006e
        L_0x0022:
            r0 = 2
            if (r2 != r0) goto L_0x0013
            if (r1 > r6) goto L_0x0013
            java.lang.String r1 = r11.getName()
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            int[] r0 = X.C33531fW.A04
            android.content.res.TypedArray r3 = X.AnonymousClass0Yh.A02(r8, r9, r10, r0)
            r0 = 0
            r2 = 0
            boolean r1 = r3.hasValue(r0)
            boolean r0 = r3.hasValue(r7)
            if (r1 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x005e
            int r1 = r3.getColor(r2, r2)
            r0 = 0
            float r0 = r3.getFloat(r7, r0)
            r3.recycle()
            X.AnonymousClass000.A1F(r4, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            goto L_0x0013
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0w(r11)
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x006e:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x007a
            X.0Xy r0 = new X.0Xy
            r0.<init>((java.util.List) r4, (java.util.List) r5)
            return r0
        L_0x007a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VI.A02(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):X.0Xy");
    }
}
