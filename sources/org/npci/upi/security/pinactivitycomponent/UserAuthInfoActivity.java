package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass01L;
import X.C135486cm;
import android.os.Bundle;
import com.whatsapp.R;

public class UserAuthInfoActivity extends AnonymousClass01L {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        findViewById(R.id.settings_button).setOnClickListener(new C135486cm(this, 1));
        findViewById(R.id.image_back).setOnClickListener(new C135486cm(this, 2));
    }
}
