package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.9XO  reason: invalid class name */
public class AnonymousClass9XO {
    public long A00 = 0;
    public SharedPreferences.Editor A01;
    public SharedPreferences A02;
    public C22762AvX A03;
    public C22763AvY A04;
    public C22850Awz A05;
    public PreferenceScreen A06;
    public String A07;
    public boolean A08;
    public Context A09;

    /* JADX INFO: finally extract failed */
    public PreferenceScreen A02(Context context, PreferenceScreen preferenceScreen, int i) {
        InflateException inflateException;
        int next;
        PreferenceGroup preferenceGroup;
        this.A08 = true;
        C202489m1 r6 = new C202489m1(context, this);
        Context context2 = r6.A02;
        XmlResourceParser xml = context2.getResources().getXml(i);
        try {
            Object[] objArr = r6.A03;
            synchronized (objArr) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                objArr[0] = context2;
                do {
                    try {
                        next = xml.next();
                        if (next == 2) {
                            preferenceGroup = (PreferenceGroup) C202489m1.A00(asAttributeSet, r6, xml.getName());
                            if (preferenceScreen == null) {
                                preferenceGroup.A0F(r6.A00);
                            } else {
                                preferenceGroup = preferenceScreen;
                            }
                            C202489m1.A02(asAttributeSet, preferenceGroup, r6, xml);
                        }
                    } catch (InflateException e) {
                        throw e;
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        inflateException = new InflateException(e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    } catch (IOException e3) {
                        e = e3;
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append(xml.getPositionDescription());
                        inflateException = new InflateException(C36331k8.A0i(": ", A0u, e));
                        inflateException.initCause(e);
                        throw inflateException;
                    }
                } while (next != 1);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(xml.getPositionDescription());
                throw new InflateException(AnonymousClass000.A0q(": No start tag found!", A0u2));
            }
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroup;
            preferenceScreen2.A0F(this);
            SharedPreferences.Editor editor = this.A01;
            if (editor != null) {
                editor.apply();
            }
            this.A08 = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public SharedPreferences.Editor A00() {
        if (!this.A08) {
            return A01().edit();
        }
        SharedPreferences.Editor editor = this.A01;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = A01().edit();
        this.A01 = edit;
        return edit;
    }

    public SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A02;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.A09.getSharedPreferences(this.A07, 0);
        this.A02 = sharedPreferences2;
        return sharedPreferences2;
    }

    public AnonymousClass9XO(Context context) {
        this.A09 = context;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(context.getPackageName());
        this.A07 = AnonymousClass000.A0q("_preferences", A0u);
        this.A02 = null;
    }
}
