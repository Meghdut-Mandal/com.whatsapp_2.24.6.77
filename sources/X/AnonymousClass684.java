package X;

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.684  reason: invalid class name */
public class AnonymousClass684 {
    public Properties A00;
    public C124765yl A01;
    public AnonymousClass62L A02;
    public Context A03;
    public AnonymousClass67U A04;
    public Locale A05;
    public Map A06 = AnonymousClass001.A0J();
    public Properties A07;
    public Properties A08;
    public AnonymousClass66Z A09;
    public AnonymousClass672 A0A;

    public Properties A00(String str) {
        Properties properties = new Properties();
        try {
            properties.load(this.A03.getAssets().open(str));
            return properties;
        } catch (IOException e) {
            e.toString();
            return properties;
        }
    }

    public AnonymousClass672 A01() {
        AnonymousClass672 r3 = this.A0A;
        if (r3 != null) {
            return r3;
        }
        C124765yl r0 = this.A01;
        AnonymousClass67U r2 = r0.A00;
        this.A04 = r2;
        AnonymousClass672 r32 = new AnonymousClass672(r2, r0.A01, r0.A0A);
        this.A0A = r32;
        return r32;
    }

    public AnonymousClass684(Context context, C124765yl r8) {
        Locale locale;
        Map map;
        String language;
        StringBuilder A0v;
        String str;
        this.A01 = r8;
        this.A05 = r8.A02;
        this.A03 = context;
        this.A04 = r8.A00;
        this.A08 = A00("cl-app.properties");
        this.A07 = A00("validation.properties");
        this.A00 = A00("version.properties");
        Locale locale2 = this.A05;
        if (locale2 != null) {
            map = this.A06;
            language = locale2.getLanguage();
            A0v = AnonymousClass000.A0v("cl-messages_");
            locale = this.A05;
        } else {
            locale = new Locale("en_US");
            map = this.A06;
            language = locale.getLanguage();
            A0v = AnonymousClass000.A0v("cl-messages_");
        }
        map.put(language, A00(AnonymousClass000.A0p(locale.getLanguage(), ".properties", A0v)));
        this.A09 = r8.A0A;
        this.A02 = new AnonymousClass62L(this);
        if (r8.A00 != null && (str = r8.A01) != null) {
            this.A0A = new AnonymousClass672(this.A04, str, this.A09);
        }
    }
}
