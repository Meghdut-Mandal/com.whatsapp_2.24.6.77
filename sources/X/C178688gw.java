package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8gw  reason: invalid class name and case insensitive filesystem */
public class C178688gw extends AnonymousClass6F2 {
    public C159627jf A00;
    public final AnonymousClass17Y A01;
    public final C19630wG A02;
    public final AnonymousClass6VM A03;
    public final C29221Vu A04;
    public final C29121Vk A05;
    public final C200049gU A06;

    public void A07(C128786Dp r14, C159627jf r15, AnonymousClass6PH r16, Map map) {
        String str;
        Map map2 = map;
        C36341k9.A1E(map2, 0, r15);
        this.A00 = r15;
        Object obj = map2.get("data_value");
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        String A0m = C90484aE.A0m("data_type", map2);
        String A0m2 = C90484aE.A0m("key_scope", map2);
        String A0m3 = C90484aE.A0m("provider_name", map2);
        String A1A = C36431kI.A1A("network", map2);
        AnonymousClass00C.A0D(A0m2, 0);
        Context context = this.A02.A00;
        AnonymousClass00C.A08(context);
        AnonymousClass17Y r8 = this.A01;
        C29121Vk r10 = this.A05;
        C29221Vu r9 = this.A04;
        C200049gU r11 = this.A06;
        AnonymousClass9SR r6 = new AnonymousClass9SR(context, r8, r9, r10, r11, A0m2);
        if (AnonymousClass00C.A0J(A0m, "OTP")) {
            if (A1A != null) {
                str = C165607th.A0v(Locale.ROOT, A1A);
            } else {
                str = null;
            }
            if (!AnonymousClass00C.A0J(str, "VISA")) {
                AnonymousClass011[] r1 = new AnonymousClass011[1];
                C36341k9.A1J("data", str2, r1, 0);
                r15.BiH(C000400e.A08(r1));
                return;
            }
        }
        Log.i("PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync");
        AF3 A012 = r11.A01(A0m3, A0m2);
        C21257AEn aEn = new C21257AEn(this, A0m, str2);
        if (A012 == null) {
            r6.A00(aEn, A0m3);
        } else {
            aEn.Bdm(A012);
        }
    }

    public static final void A00(C178688gw r4, int i) {
        C159627jf r42 = r4.A00;
        if (r42 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        r42.BXS(new AnonymousClass6PH(Integer.valueOf(i), "ProviderKeyNetworkError", (String) null), (Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178688gw(AnonymousClass17Y r1, C19630wG r2, AnonymousClass6VM r3, C29221Vu r4, C29121Vk r5, C200049gU r6, C105705Fs r7) {
        super(r7);
        C36321k7.A1B(r1, r2, r5, r3, r4);
        C36321k7.A10(r6, r7);
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
    }

    public String A06() {
        return "payment_encrypt_with_public_key";
    }
}
