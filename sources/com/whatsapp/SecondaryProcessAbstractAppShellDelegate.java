package com.whatsapp;

import X.AnonymousClass107;
import X.AnonymousClass10P;
import X.AnonymousClass10Q;
import X.AnonymousClass10R;
import X.C18740tg;
import X.C18790tp;
import X.C18800tq;
import X.C18810tr;
import X.C18830tt;
import X.C18840tu;
import X.C35621iz;
import android.content.Context;
import android.content.res.Configuration;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;

public class SecondaryProcessAbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_WHATSAPP_LIB_NAME = "whatsapp";
    public static final String TAG = "SecondaryProcessAbstractAppShellDelegate";
    public final Context appContext;

    public void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installAnrDetector(X.AnonymousClass10Q r4, X.AnonymousClass107 r5, X.AnonymousClass10R r6) {
        /*
            r3 = this;
            java.lang.String r2 = "whatsapp"
            java.lang.String r1 = "SecondaryProcessAbstractAppShellDelegate/installAnrDetector/exception"
            android.content.Context r0 = r3.appContext     // Catch:{ IOException -> 0x001d }
            X.AnonymousClass10B.A00(r0)     // Catch:{ IOException -> 0x001d }
            android.content.Context r0 = r3.appContext     // Catch:{  }
            boolean r0 = X.AnonymousClass101.A00(r0, r2)     // Catch:{  }
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r3.appContext     // Catch:{  }
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A01(r0, r2)     // Catch:{  }
        L_0x0016:
            r4.A00()
            com.whatsapp.wamsys.JniBridge.setDependencies(r6)
            return
        L_0x001d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SecondaryProcessAbstractAppShellDelegate.installAnrDetector(X.10Q, X.107, X.10R):void");
    }

    /* renamed from: lambda$onCreate$0$com-whatsapp-SecondaryProcessAbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m5lambda$onCreate$0$comwhatsappSecondaryProcessAbstractAppShellDelegate(C18790tp r8) {
        C18830tt r1 = ((C18800tq) r8).AfI.A00;
        installAnrDetector((AnonymousClass10Q) r1.A00.get(), new AnonymousClass107(), new AnonymousClass10R(C18840tu.A00(r1.A2R), C18840tu.A00(r1.A2Q), C18840tu.A00(r1.A2O), C18840tu.A00(r1.A2P)));
    }

    public void onCreate() {
        Log.i("SecondaryProcessAbstractAppShellDelegate/onCreate");
        C18790tp r3 = (C18790tp) C18810tr.A00(this.appContext, C18790tp.class);
        ((AnonymousClass10P) ((C18800tq) r3).AfI.A00.A3g.get()).A02(new C35621iz(this, r3, 10), "anr_detector_secondary_process");
        ConditionVariable conditionVariable = C18740tg.A00;
        C18740tg.A01 = false;
    }

    public SecondaryProcessAbstractAppShellDelegate(Context context) {
        this.appContext = context;
    }
}
