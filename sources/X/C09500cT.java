package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0cT  reason: invalid class name and case insensitive filesystem */
public class C09500cT implements C16630pp {
    public Drawable B4Y(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        Context context2 = context;
        try {
            Resources resources = context.getResources();
            XmlPullParser xmlPullParser2 = xmlPullParser;
            String name = xmlPullParser.getName();
            if (name.equals("animated-selector")) {
                AnonymousClass0FS r2 = new AnonymousClass0FS((Resources) null, (AnonymousClass0FR) null);
                r2.A05(context2, theme, resources, attributeSet, xmlPullParser2);
                return r2;
            }
            throw new XmlPullParserException(AnonymousClass000.A0p(": invalid animated-selector tag ", name, AnonymousClass000.A0w(xmlPullParser)));
        } catch (Exception e) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
            return null;
        }
    }
}
