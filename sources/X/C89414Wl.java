package X;

import com.whatsapp.R;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.instrumentation.ui.InstrumentationAuthActivity;

/* renamed from: X.4Wl  reason: invalid class name and case insensitive filesystem */
public class C89414Wl implements AnonymousClass4QP {
    public Object A00;
    public final int A01;

    public C89414Wl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRa(int i) {
        switch (this.A01) {
            case 0:
                EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) this.A00;
                if (i == -1 || i == 4) {
                    encryptionKeyInputFragment.A04.A0X(6);
                    encryptionKeyInputFragment.A04.A0Z(true);
                    return;
                }
                return;
            case 1:
                ((AnonymousClass3H6) this.A00).A01(i);
                return;
            case 2:
                BiometricAuthPlugin.A00((BiometricAuthPlugin) this.A00, i);
                return;
            default:
                InstrumentationAuthActivity instrumentationAuthActivity = (InstrumentationAuthActivity) this.A00;
                if (i == -1 || i == 4) {
                    AnonymousClass09Y A0O = C36341k9.A0O(instrumentationAuthActivity);
                    A0O.A0B(instrumentationAuthActivity.A05, R.id.fragment_container);
                    A0O.A0J((String) null);
                    A0O.A01();
                    return;
                }
                return;
        }
    }
}
