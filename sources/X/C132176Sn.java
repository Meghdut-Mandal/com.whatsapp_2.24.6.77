package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: X.6Sn  reason: invalid class name and case insensitive filesystem */
public final class C132176Sn {
    public int A00 = 0;
    public Bundle A01;
    public final Intent A02 = C36441kJ.A0I("android.intent.action.VIEW");
    public final AnonymousClass5Vp A03 = new AnonymousClass5Vp();

    public static void A01(Bundle bundle) {
        bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
    }

    public C114225gs A02() {
        Intent intent = this.A02;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A07 = AnonymousClass001.A07();
            A01(A07);
            intent.putExtras(A07);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        C114215gr r0 = new C114215gr((Integer) null);
        Bundle A072 = AnonymousClass001.A07();
        Integer num = r0.A00;
        if (num != null) {
            A072.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(A072);
        Bundle bundle = this.A01;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.A00);
        if (Build.VERSION.SDK_INT >= 24) {
            A00();
        }
        return new C114225gs(intent);
    }

    private void A00() {
        Bundle A07;
        String A002 = C108955Vq.A00();
        if (!TextUtils.isEmpty(A002)) {
            Intent intent = this.A02;
            if (intent.hasExtra("com.android.browser.headers")) {
                A07 = intent.getBundleExtra("com.android.browser.headers");
            } else {
                A07 = AnonymousClass001.A07();
            }
            if (!A07.containsKey("Accept-Language")) {
                A07.putString("Accept-Language", A002);
                intent.putExtra("com.android.browser.headers", A07);
            }
        }
    }
}
