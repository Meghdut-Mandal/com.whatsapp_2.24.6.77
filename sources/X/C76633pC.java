package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.3pC  reason: invalid class name and case insensitive filesystem */
public class C76633pC implements C236119d {
    public final C35911jS A00;
    public final Runnable A01;
    public final /* synthetic */ AnonymousClass1MN A02;

    public C76633pC(AnonymousClass1MN r1, C35911jS r2, Runnable runnable) {
        this.A02 = r1;
        this.A01 = runnable;
        this.A00 = r2;
    }

    public void BiM(C203399nx r24, String str) {
        C35911jS r2 = this.A00;
        C203399nx r4 = r24;
        C203399nx.A0A(r4, "iq");
        C203399nx r11 = r2.A00;
        Class<String> cls = String.class;
        C203379ns.A03(r4, cls, -9007199254740991L, 9007199254740991L, "result", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
        C203379ns.A03(r4, cls, -9007199254740991L, 9007199254740991L, C203379ns.A03(r11, cls, -9007199254740991, 9007199254740991, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        C203399nx r16 = r4;
        C203379ns.A00(r4, Arrays.asList(new Class[]{Jid.class, UserJid.class}), new String[]{"from"});
        C36321k7.A1V("ClientPingManager/recv/onSuccess; timestamp=", AnonymousClass000.A0u(), ((Number) C203379ns.A03(r16, Long.class, -9007199254740991, 9007199254740991, (Object) null, new String[]{"t"}, false)).longValue());
        AnonymousClass1MN r42 = this.A02;
        r42.A07.post(new C35711j8(r42, 17));
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void BVN(String str) {
        C36321k7.A1Q("ClientPingManager/recv/onDeliveryFailure id=", str, AnonymousClass000.A0u());
    }

    public void BWw(C203399nx r5, String str) {
        C36321k7.A1Q("ClientPingManager/recv/onError id=", str, AnonymousClass000.A0u());
        AnonymousClass1MN r3 = this.A02;
        r3.A07.post(new C35711j8(r3, 17));
    }
}
