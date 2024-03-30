package com.whatsapp.businessapisearch.viewmodel;

import X.AnonymousClass08X;
import X.C121345sz;
import X.C28201Rs;
import X.C36341k9;
import X.C36441kJ;
import android.app.Application;
import android.content.SharedPreferences;

public class BusinessApiSearchActivityViewModel extends AnonymousClass08X {
    public final C121345sz A00;
    public final C28201Rs A01;

    public BusinessApiSearchActivityViewModel(Application application, C121345sz r6) {
        super(application);
        SharedPreferences sharedPreferences;
        C28201Rs A0t = C36441kJ.A0t();
        this.A01 = A0t;
        this.A00 = r6;
        if (r6.A01.A0E(2760)) {
            synchronized (r6) {
                sharedPreferences = r6.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r6.A02.A00("com.whatsapp_business_api");
                    r6.A00 = sharedPreferences;
                }
            }
            if (sharedPreferences.getBoolean("arg_should_show_nux", true)) {
                C36341k9.A17(A0t, 1);
            }
        }
    }
}
