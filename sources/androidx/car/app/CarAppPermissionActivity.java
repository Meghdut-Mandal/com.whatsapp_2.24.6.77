package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass01G;
import X.AnonymousClass0YW;
import X.C010104g;
import X.C165357tI;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;

public class CarAppPermissionActivity extends AnonymousClass01G {
    public void onCreate(Bundle bundle) {
        String action;
        int i;
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            if (bundle2 != null) {
                i = bundle2.getInt("androidx.car.app.theme");
            } else {
                i = 0;
            }
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                createConfigurationContext.setTheme(i);
            }
            int identifier = createConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = createConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected intent action for CarAppPermissionActivity: ");
            if (intent == null) {
                action = "null Intent";
            } else {
                action = intent.getAction();
            }
            Log.e("CarApp", AnonymousClass000.A0q(action, A0u));
        } else {
            Bundle extras = intent.getExtras();
            IOnRequestPermissionsListener asInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
            String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
            if (asInterface == null || stringArray == null) {
                Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            } else {
                BnD(new C165357tI(this, asInterface, 0), new C010104g()).A01((AnonymousClass0YW) null, stringArray);
                return;
            }
        }
        finish();
    }
}
