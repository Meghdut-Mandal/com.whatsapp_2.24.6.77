package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0Yh  reason: invalid class name */
public abstract class AnonymousClass0Yh {
    public static C06150Sm A03(Resources.Theme theme, TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        XmlPullParserException xmlPullParserException;
        if (A04(str, xmlPullParser)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C06150Sm((ColorStateList) null, (Shader) null, typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next != 2) {
                        if (next == 1) {
                            xmlPullParserException = new XmlPullParserException("No start tag found");
                            break;
                        }
                    } else {
                        String name = xml.getName();
                        if (name.equals("gradient")) {
                            return new C06150Sm((ColorStateList) null, AnonymousClass0VI.A01(theme, resources, asAttributeSet, xml), 0);
                        }
                        if (name.equals("selector")) {
                            ColorStateList A00 = C02480Am.A00(theme, resources, asAttributeSet, xml);
                            return new C06150Sm(A00, (Shader) null, A00.getDefaultColor());
                        }
                        xmlPullParserException = new XmlPullParserException(AnonymousClass000.A0p(": unsupported complex color tag ", name, AnonymousClass000.A0w(xml)));
                    }
                }
                throw xmlPullParserException;
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            }
        }
        return new C06150Sm((ColorStateList) null, (Shader) null, 0);
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static ColorStateList A01(Resources.Theme theme, TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!A04("tint", xmlPullParser)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to resolve attribute at index ");
            A0u.append(1);
            throw AnonymousClass001.A0E(AnonymousClass000.A0l(typedValue, ": ", A0u));
        } else if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        } else {
            Resources resources = typedArray.getResources();
            try {
                return C02480Am.A02(theme, resources, resources.getXml(typedArray.getResourceId(1, 0)));
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
    }

    public static TypedArray A02(Resources.Theme theme, Resources resources, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean A04(String str, XmlPullParser xmlPullParser) {
        return AnonymousClass000.A1V(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str));
    }
}
