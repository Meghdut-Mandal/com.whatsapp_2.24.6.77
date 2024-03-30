package X;

import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;

public class B98 implements C88014Rb {
    public Object A00;
    public final int A01;

    public B98(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public PasskeyFacade B40(C61943Ec r9) {
        C61943Ec r6 = r9;
        switch (this.A01) {
            case 0:
                B98 b98 = this;
                PasskeyAndroidApiImpl A8w = C18830tt.A8v(((C27121Mz) b98.A00).A01.A00);
                C63293Jm A8z = ((C27121Mz) b98.A00).A01.A00.A8y();
                return new PasskeyFacade((C19420v0) ((C27121Mz) b98.A00).A01.A9G.get(), A8w, A8z, r6, (PasskeyServerApiImpl) ((C27121Mz) b98.A00).A01.A00.A57.get());
            case 1:
                B98 b982 = this;
                PasskeyAndroidApiImpl A8w2 = C18830tt.A8v(((AnonymousClass1U2) b982.A00).A00.A00);
                C63293Jm A8z2 = ((AnonymousClass1U2) b982.A00).A00.A00.A8y();
                return new PasskeyFacade((C19420v0) ((AnonymousClass1U2) b982.A00).A00.A9G.get(), A8w2, A8z2, r6, (PasskeyServerApiImpl) ((AnonymousClass1U2) b982.A00).A00.A00.A57.get());
            default:
                return null;
        }
    }
}
