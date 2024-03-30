package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.0Ab  reason: invalid class name and case insensitive filesystem */
public class C02380Ab implements AnonymousClass015, AnonymousClass016, AnonymousClass017 {
    public AnonymousClass01N A00 = null;
    public AnonymousClass01T A01 = null;
    public AnonymousClass04G A02;
    public final AnonymousClass02E A03;
    public final AnonymousClass04J A04;

    public void A00() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass01N(this);
            AnonymousClass01T r0 = new AnonymousClass01T(this);
            this.A01 = r0;
            r0.A00();
        }
    }

    public AnonymousClass04K BAv() {
        AnonymousClass02E r4 = this.A03;
        Context applicationContext = r4.A0a().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                applicationContext = null;
                break;
            }
        }
        AnonymousClass04L r3 = new AnonymousClass04L();
        if (applicationContext != null) {
            r3.A00.put(AnonymousClass04O.A02, applicationContext);
        }
        C003401n r0 = C003301m.A01;
        Map map = r3.A00;
        map.put(r0, r4);
        map.put(C003301m.A02, this);
        Bundle bundle = r4.A0A;
        if (bundle != null) {
            map.put(C003301m.A00, bundle);
        }
        return r3;
    }

    public AnonymousClass04G BAw() {
        AnonymousClass02E r3 = this.A03;
        AnonymousClass04G BAw = r3.BAw();
        if (BAw.equals(r3.A00)) {
            BAw = this.A02;
            if (BAw == null) {
                Application application = null;
                Context context = r3.A0a().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                BAw = new AnonymousClass08W(application, r3.A0A, r3);
            }
            return BAw;
        }
        this.A02 = BAw;
        return BAw;
    }

    public C02380Ab(AnonymousClass02E r2, AnonymousClass04J r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public AnonymousClass01U BGx() {
        A00();
        return this.A01.A01;
    }

    public AnonymousClass04J BJ7() {
        A00();
        return this.A04;
    }

    public AnonymousClass01M getLifecycle() {
        A00();
        return this.A00;
    }
}
