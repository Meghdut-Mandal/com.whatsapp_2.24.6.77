package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8gO  reason: invalid class name */
public class AnonymousClass8gO extends AnonymousClass9I1 {
    public static final Long A07 = 2L;
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass19A A02;
    public final C29221Vu A03;
    public final C29131Vl A04;
    public final C20810yC A05;
    public final C202269lR A06;

    public AnonymousClass8gO(Context context, AnonymousClass17Y r3, C20810yC r4, AnonymousClass19A r5, C202269lR r6, C29221Vu r7, C29121Vk r8, C29131Vl r9) {
        super(r6.A04, r8);
        this.A00 = context;
        this.A05 = r4;
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = r9;
        this.A06 = r6;
        this.A03 = r7;
    }

    public void A00(AnonymousClass16X r29, C135086c7 r30, C22962AzE azE, AnonymousClass8gJ r32, AF7 af7, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap hashMap) {
        String str8;
        AnonymousClass1AL[] A0k;
        Log.i("PAY: acceptCollect called");
        AnonymousClass19A r15 = this.A02;
        String A09 = r15.A09();
        Long l = null;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            str8 = this.A06.A06("MPIN", hashMap2, 5);
        } else {
            str8 = null;
        }
        C18740tg.A06(str8);
        if (this.A05.A0E(747)) {
            l = A07;
        }
        String A012 = this.A04.A01();
        String str9 = (String) C165577te.A0g(r30);
        C207119ua A022 = this.A01.A02(AnonymousClass16W.A05, r29);
        String valueOf = String.valueOf(A022.A01());
        String valueOf2 = String.valueOf(A022.A00);
        String str10 = ((AnonymousClass16V) A022.A01).A02;
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("money");
        if (C203539oF.A0P(valueOf, 1, 100, false)) {
            C36331k8.A1D(A0q, "value", valueOf);
        }
        if (C203539oF.A0P(valueOf2, 1, 100, false)) {
            C36331k8.A1D(A0q, "offset", valueOf2);
        }
        if (C203539oF.A0P(str10, 1, 100, false)) {
            C36331k8.A1D(A0q, "currency", str10);
        }
        C203399nx A0I = C165567td.A0I(A0q, A0X);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("amount");
        A0q2.A06(A0I);
        C203399nx A032 = A0q2.A03();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        if (C203539oF.A0Q(A09, 0, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-accept-collect");
        if (C203539oF.A0P(str8, 0, 1000, false)) {
            C36331k8.A1D(A0a, "mpin", str8);
        }
        C203539oF.A0G(A0a, A012, false);
        C203539oF.A0D(A0a, str6);
        String str11 = str;
        if (C203539oF.A0P(str11, 1, 1000, false)) {
            C36331k8.A1D(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str11);
        }
        String str12 = str2;
        if (str2 != null && C203539oF.A0S(str12, 0, true)) {
            C36331k8.A1D(A0a, "sender-vpa", str12);
        }
        String str13 = str3;
        if (str3 != null && C203539oF.A0S(str13, 0, true)) {
            C36331k8.A1D(A0a, "sender-vpa-id", str13);
        }
        if (str9 != null && C203539oF.A0Q(str9, 0, true)) {
            C36331k8.A1D(A0a, "upi-bank-info", str9);
        }
        String str14 = str4;
        if (str4 != null && C203539oF.A0S(str14, 0, true)) {
            C36331k8.A1D(A0a, "receiver-vpa", str14);
        }
        String str15 = str5;
        if (str5 != null && C203539oF.A0S(str15, 0, true)) {
            C36331k8.A1D(A0a, "receiver-vpa-id", str15);
        }
        String str16 = str7;
        if (str7 != null && C203539oF.A0S(str16, 0, true)) {
            C36331k8.A1D(A0a, "mandate-no", str16);
        }
        if (l != null && C203539oF.A0L(l, 1, 9007199254740991L, true)) {
            C36411kG.A1K(A0a, "version", l.longValue());
        }
        A0a.A05(A032);
        C203399nx A0I2 = C165567td.A0I(A0a, A0T);
        AnonymousClass9YX A042 = AnonymousClass9I1.A04(this, "upi-accept-collect");
        List A0I3 = AnonymousClass001.A0I();
        C203399nx A0b = A0I2.A0b(0);
        if (!(A0b == null || (A0k = A0b.A0k()) == null)) {
            C18740tg.A06(A0k);
            A0I3 = Arrays.asList(A0k);
        }
        r32.A00("U66", A0I3);
        AnonymousClass19A r1 = r15;
        r1.A0E(new B7M(this.A00, this.A01, this.A03, A042, azE, this, af7), A0I2, A09, 204, 0);
    }
}
