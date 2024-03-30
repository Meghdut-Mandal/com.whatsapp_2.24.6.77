package X;

import android.content.Context;
import java.util.ArrayList;

public class B7H extends AIB {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7H(Context context, C29221Vu r2, C19640wH r3, Object obj, int i) {
        super(context, r2, r3);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05(C202059ky r9) {
        C202059ky r4 = r9;
        switch (this.A01) {
            case 0:
                C36321k7.A1K(r9, "PAY: BrazilAddCardAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g5) this.A00).A0G.A00((C175798b4) null, r4, (ArrayList) null, false, false);
                return;
            case 1:
                C36321k7.A1K(r9, "PAY: BrazilDeviceBindingAction onRequestError: ", AnonymousClass000.A0u());
                ((C199019eZ) this.A00).A02.BVV((C175798b4) null, r9, (ArrayList) null, false);
                return;
            case 2:
                C36321k7.A1K(r9, "PAY: BrazilDeviceBindingAction onRequestError: ", AnonymousClass000.A0u());
                ((C195129Sp) this.A00).A06.A00((C193879Ng) null);
                return;
            case 3:
                AnonymousClass9O6 r0 = (AnonymousClass9O6) this.A00;
                r0.A06.A00(C202059ky.A00(), r0.A07);
                return;
            case 4:
                C36321k7.A1J(r9, "PAY: BrazilMerchantLinkAction request error: ", AnonymousClass000.A0u());
                ((AnonymousClass9O7) this.A00).A06.A00((C175768b1) null, r9);
                return;
            case 5:
                C36321k7.A1J(r9, "PAY: BrazilMerchantPreLinkAction request error: ", AnonymousClass000.A0u());
                ((AnonymousClass8g4) this.A00).A06.A00(r9, (AnonymousClass9NH) null);
                return;
            case 6:
                C36321k7.A1J(r9, "PAY: BrazilRetokenizeCardAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g2) this.A00).A09.A00((C175798b4) null, r9, (ArrayList) null, false);
                return;
            case 7:
                ((AnonymousClass8g3) this.A00).A07.A00(C202059ky.A00());
                return;
            case 8:
                C36321k7.A1K(r9, "PAY: BrazilVerifyCardOTPSendAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g7) this.A00).A04.A00((C175798b4) null, r9);
                return;
            case 9:
                C36321k7.A1K(r9, "PAY: BrazilVerifyCardSendAuthCodeAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g6) this.A00).A02.A00(r9);
                return;
            default:
                AnonymousClass9SK r3 = (AnonymousClass9SK) this.A00;
                C165567td.A16(r3.A01, r9, "onRequestError: ", AnonymousClass000.A0u());
                r3.A00.BfM(r9, (String) null);
                return;
        }
    }

    public void A06(C202059ky r9) {
        C202059ky r4 = r9;
        switch (this.A01) {
            case 0:
                C36321k7.A1K(r9, "PAY: BrazilAddCardAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g5) this.A00).A0G.A00((C175798b4) null, r4, (ArrayList) null, false, false);
                return;
            case 1:
                C36321k7.A1K(r9, "PAY: BrazilDeviceBindingAction onResponseError: ", AnonymousClass000.A0u());
                ((C199019eZ) this.A00).A02.BVV((C175798b4) null, r9, (ArrayList) null, false);
                return;
            case 2:
                C36321k7.A1K(r9, "PAY: BrazilDeviceBindingAction onResponseError: ", AnonymousClass000.A0u());
                ((C195129Sp) this.A00).A06.A00((C193879Ng) null);
                return;
            case 3:
                AnonymousClass9O6 r0 = (AnonymousClass9O6) this.A00;
                r0.A06.A00(C202059ky.A00(), r0.A07);
                return;
            case 4:
                C36321k7.A1J(r9, "PAY: BrazilMerchantLinkAction response error: ", AnonymousClass000.A0u());
                ((AnonymousClass9O7) this.A00).A06.A00((C175768b1) null, r9);
                return;
            case 5:
                C36321k7.A1J(r9, "PAY: BrazilMerchantPreLinkAction response error: ", AnonymousClass000.A0u());
                ((AnonymousClass8g4) this.A00).A06.A00(r9, (AnonymousClass9NH) null);
                return;
            case 6:
                C36321k7.A1J(r9, "PAY: BrazilRetokenizeCardAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g2) this.A00).A09.A00((C175798b4) null, r9, (ArrayList) null, false);
                return;
            case 7:
                ((AnonymousClass8g3) this.A00).A07.A00(C202059ky.A00());
                return;
            case 8:
                C36321k7.A1K(r9, "PAY: BrazilVerifyCardOTPSendAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g7) this.A00).A04.A00((C175798b4) null, r9);
                return;
            case 9:
                C36321k7.A1K(r9, "PAY: BrazilVerifyCardSendAuthCodeAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass8g6) this.A00).A02.A00(r9);
                return;
            default:
                AnonymousClass9SK r3 = (AnonymousClass9SK) this.A00;
                C165567td.A16(r3.A01, r9, "onResponseError: ", AnonymousClass000.A0u());
                r3.A00.BfM(r9, (String) null);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.8g5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.8g2} */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0316, code lost:
        X.AnonymousClass9YB.A01(r2, r5, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0319, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0351, code lost:
        r2.A04(new X.C1898595w(r5, r6, r8, r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0359, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x00f6;
                case 2: goto L_0x0154;
                case 3: goto L_0x01c2;
                case 4: goto L_0x025b;
                case 5: goto L_0x02aa;
                case 6: goto L_0x02c9;
                case 7: goto L_0x0024;
                case 8: goto L_0x037d;
                case 9: goto L_0x03ba;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.9nx r3 = X.C203399nx.A03(r11)
            r2 = 0
            java.lang.Object r0 = r10.A00
            X.9SK r0 = (X.AnonymousClass9SK) r0
            X.AzK r1 = r0.A00
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r3.A0i(r0, r2)
            r1.BfM(r2, r0)
            return
        L_0x001c:
            X.9ky r0 = X.C202059ky.A00()
            r1.BfM(r0, r2)
            return
        L_0x0024:
            java.lang.String r0 = "account"
            X.9nx r5 = r11.A0d(r0)     // Catch:{ 19b -> 0x005f }
            X.9ky r1 = X.C202059ky.A01(r5)     // Catch:{ 19b -> 0x005f }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r0 = r10.A00     // Catch:{ 19b -> 0x005f }
            X.8g3 r0 = (X.AnonymousClass8g3) r0     // Catch:{ 19b -> 0x005f }
            X.9Pw r0 = r0.A07     // Catch:{ 19b -> 0x005f }
            r0.A00(r1)     // Catch:{ 19b -> 0x005f }
            return
        L_0x003a:
            X.8bC r4 = new X.8bC     // Catch:{ 19b -> 0x005f }
            r4.<init>()     // Catch:{ 19b -> 0x005f }
            java.lang.Object r3 = r10.A00     // Catch:{ 19b -> 0x005f }
            X.8g3 r3 = (X.AnonymousClass8g3) r3     // Catch:{ 19b -> 0x005f }
            X.16T r2 = r3.A03     // Catch:{ 19b -> 0x005f }
            r1 = 0
            java.lang.String r0 = "merchant"
            X.9nx r0 = r5.A0d(r0)     // Catch:{ 19b -> 0x005f }
            r4.A04(r2, r0, r1)     // Catch:{ 19b -> 0x005f }
            X.9un r2 = r4.A07()     // Catch:{ 19b -> 0x005f }
            X.1EU r0 = r3.A06     // Catch:{ 19b -> 0x005f }
            X.9YB r1 = r0.A01()     // Catch:{ 19b -> 0x005f }
            r0 = 10
            X.AnonymousClass9YB.A01(r1, r2, r10, r0)     // Catch:{ 19b -> 0x005f }
            return
        L_0x005f:
            java.lang.String r0 = "PAY: BrazilMerchantRegAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.A00
            X.8g3 r0 = (X.AnonymousClass8g3) r0
            X.9Pw r1 = r0.A07
            X.9ky r0 = X.C202059ky.A00()
            r1.A00(r0)
            return
        L_0x0072:
            X.9nx r3 = X.C203399nx.A03(r11)
            if (r3 == 0) goto L_0x00e4
            java.lang.String r0 = "card"
            X.9nx r1 = r3.A0c(r0)
            if (r1 == 0) goto L_0x00e4
            X.8b7 r2 = new X.8b7
            r2.<init>()
            java.lang.Object r6 = r10.A00
            X.8g5 r6 = (X.AnonymousClass8g5) r6
            X.16T r0 = r6.A07
            X.9un r5 = X.C175898bF.A02(r0, r2, r1)
            X.9j5 r1 = r6.A0F
            r0 = 0
            X.C201219j5.A01(r0, r5, r1)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x00a2
            X.1EU r0 = r6.A0C
            X.9YB r2 = r0.A01()
            r0 = 1
            goto L_0x0316
        L_0x00a2:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r2.A06
            X.1EU r0 = r6.A0C
            X.9YB r2 = r0.A01()
            if (r1 == 0) goto L_0x00b3
            r0 = 2
            goto L_0x0316
        L_0x00b3:
            r0 = 3
            goto L_0x0316
        L_0x00b6:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "verify-method-list"
            X.9nx r4 = r3.A0c(r0)
            if (r4 == 0) goto L_0x00db
            X.9nx[] r0 = r4.A02
            if (r0 == 0) goto L_0x00db
            int r3 = r0.length
            if (r3 <= 0) goto L_0x00db
            r2 = 0
        L_0x00ca:
            X.9nx r1 = r4.A0b(r2)
            X.AUm r0 = new X.AUm
            r0.<init>(r1)
            r8.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00db
            goto L_0x00ca
        L_0x00db:
            X.1EU r0 = r6.A0C
            X.9YB r2 = r0.A01()
            r1 = 0
            goto L_0x0351
        L_0x00e4:
            java.lang.Object r0 = r10.A00
            X.8g5 r0 = (X.AnonymousClass8g5) r0
            X.9Qs r0 = r0.A0G
            r1 = 0
            r4 = 0
            X.9ky r2 = X.C202059ky.A00()
            r5 = 0
            r3 = r1
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x00f6:
            X.9nx r2 = X.C203399nx.A03(r11)
            r8 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0146
            java.lang.String r0 = "card"
            X.9nx r1 = r2.A0c(r0)
            if (r1 == 0) goto L_0x0146
            X.8b7 r9 = new X.8b7
            r9.<init>()
            java.lang.Object r7 = r10.A00
            X.9eZ r7 = (X.C199019eZ) r7
            X.16T r0 = r7.A00
            r9.A04(r0, r1, r8)
            X.9un r5 = r9.A07()
            X.8b4 r5 = (X.C175798b4) r5
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "verify-method-list"
            X.9nx r3 = r2.A0c(r0)
            if (r3 == 0) goto L_0x013e
            X.9nx[] r0 = r3.A02
            if (r0 == 0) goto L_0x013e
            int r2 = r0.length
            if (r2 <= 0) goto L_0x013e
        L_0x012d:
            X.9nx r1 = r3.A0b(r8)
            X.AUm r0 = new X.AUm
            r0.<init>(r1)
            r4.add(r0)
            int r8 = r8 + 1
            if (r8 >= r2) goto L_0x013e
            goto L_0x012d
        L_0x013e:
            X.AzB r1 = r7.A02
            boolean r0 = r9.A0a
            r1.BVV(r5, r6, r4, r0)
            return
        L_0x0146:
            java.lang.Object r0 = r10.A00
            X.9eZ r0 = (X.C199019eZ) r0
            X.AzB r1 = r0.A02
            X.9ky r0 = X.C202059ky.A00()
            r1.BVV(r6, r0, r6, r8)
            return
        L_0x0154:
            X.9nx r1 = X.C203399nx.A03(r11)
            r7 = 0
            if (r1 == 0) goto L_0x01b3
            java.lang.String r0 = "elo"
            X.9nx r3 = r1.A0c(r0)
            if (r3 == 0) goto L_0x01b3
            java.lang.String r0 = "challenge_id"
            java.lang.String r2 = r3.A0i(r0, r7)
            r1 = 5
            java.lang.String r0 = "1"
            X.9Ng r6 = new X.9Ng
            r6.<init>(r1, r0, r2, r7)
            java.lang.String r0 = "ciphered_wallet_secret"
            java.lang.String r1 = r3.A0i(r0, r7)
            java.lang.Object r5 = r10.A00
            X.9Sp r5 = (X.C195129Sp) r5
            X.6VM r0 = r5.A02
            X.1Db r4 = r0.A01
            android.content.SharedPreferences r0 = r4.A03()
            java.lang.String r3 = "payment_trusted_device_elo_wallet_store"
            java.lang.String r0 = r0.getString(r3, r7)
            r2 = 0
            if (r0 == 0) goto L_0x0191
            org.json.JSONObject r2 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x019b }
            goto L_0x0195
        L_0x0191:
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x019b }
        L_0x0195:
            java.lang.String r0 = "wallet_secret"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x019b }
            goto L_0x01a2
        L_0x019b:
            X.1Dc r1 = r4.A02
            java.lang.String r0 = "Failed to updated the wallet_secret"
            r1.A06(r0)
        L_0x01a2:
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r4)
            java.lang.String r0 = r2.toString()
            X.C36341k9.A0x(r1, r3, r0)
            X.9Pn r0 = r5.A06
            r0.A00(r6)
            return
        L_0x01b3:
            java.lang.Object r0 = r10.A00
            X.9Sp r0 = (X.C195129Sp) r0
            X.9Pn r1 = r0.A06
            X.9ky r0 = new X.9ky
            r0.<init>()
            r1.A00(r7)
            return
        L_0x01c2:
            X.9nx r1 = X.C203399nx.A03(r11)
            if (r1 == 0) goto L_0x024b
            java.lang.String r0 = "image"
            X.9nx r1 = r1.A0c(r0)
            if (r1 == 0) goto L_0x024b
            java.lang.Object r0 = r10.A00
            X.9O6 r0 = (X.AnonymousClass9O6) r0
            X.9Rx r6 = r0.A06
            java.lang.String r0 = "credential-id"
            r4 = 0
            java.lang.String r8 = r1.A0i(r0, r4)
            java.lang.String r0 = "image-content-id"
            r1.A0i(r0, r4)
            java.lang.String r0 = "image-url"
            java.lang.String r7 = r1.A0i(r0, r4)
            java.lang.String r0 = "image-label-color"
            java.lang.String r5 = r1.A0i(r0, r4)
            X.9un r3 = r6.A01
            java.lang.String r2 = r3.A0A
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0239
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0211
            X.8b7 r0 = r6.A02
            r0.A0E = r7
            android.widget.ImageView r1 = r6.A00
            X.9j5 r0 = r6.A03
            X.5Gc r0 = r0.A01
            if (r1 == 0) goto L_0x0227
            X.6CW r0 = r0.A00()
            r0.A01(r1, r7)
        L_0x0211:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x021b
            X.8b7 r0 = r6.A02
            r0.A0D = r5
        L_0x021b:
            X.9j5 r0 = r6.A03
            X.1EU r0 = r0.A00
            X.9YB r0 = r0.A01()
            r0.A04(r4, r3)
            return
        L_0x0227:
            X.6CW r1 = r0.A00()
            int r0 = r1.A01
            X.5LT r2 = new X.5LT
            r2.<init>(r7, r0, r0)
            X.6Po r1 = r1.A02
            r0 = 0
            r1.A01(r2, r0)
            goto L_0x0211
        L_0x0239:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: fetchCardArtImageContentDetails credentialIds don't match; request: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " response: "
            X.C36321k7.A1R(r0, r8, r1)
            return
        L_0x024b:
            java.lang.Object r0 = r10.A00
            X.9O6 r0 = (X.AnonymousClass9O6) r0
            X.9Rx r2 = r0.A06
            java.lang.String r1 = r0.A07
            X.9ky r0 = X.C202059ky.A00()
            r2.A00(r0, r1)
            return
        L_0x025b:
            r3 = 0
            java.lang.String r0 = "account"
            X.9nx r6 = r11.A0d(r0)     // Catch:{ 19b -> 0x0296 }
            X.9ky r1 = X.C202059ky.A01(r6)     // Catch:{ 19b -> 0x0296 }
            if (r1 == 0) goto L_0x0272
            java.lang.Object r0 = r10.A00     // Catch:{ 19b -> 0x0296 }
            X.9O7 r0 = (X.AnonymousClass9O7) r0     // Catch:{ 19b -> 0x0296 }
            X.9Pu r0 = r0.A06     // Catch:{ 19b -> 0x0296 }
            r0.A00(r3, r1)     // Catch:{ 19b -> 0x0296 }
            return
        L_0x0272:
            X.8bC r5 = new X.8bC     // Catch:{ 19b -> 0x0296 }
            r5.<init>()     // Catch:{ 19b -> 0x0296 }
            java.lang.Object r4 = r10.A00     // Catch:{ 19b -> 0x0296 }
            X.9O7 r4 = (X.AnonymousClass9O7) r4     // Catch:{ 19b -> 0x0296 }
            X.16T r2 = r4.A02     // Catch:{ 19b -> 0x0296 }
            r1 = 0
            java.lang.String r0 = "merchant"
            X.9nx r0 = r6.A0d(r0)     // Catch:{ 19b -> 0x0296 }
            r5.A04(r2, r0, r1)     // Catch:{ 19b -> 0x0296 }
            X.9un r2 = r5.A07()     // Catch:{ 19b -> 0x0296 }
            X.1EU r0 = r4.A05     // Catch:{ 19b -> 0x0296 }
            X.9YB r1 = r0.A01()     // Catch:{ 19b -> 0x0296 }
            r0 = 7
            X.AnonymousClass9YB.A01(r1, r2, r10, r0)     // Catch:{ 19b -> 0x0296 }
            return
        L_0x0296:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Object r0 = r10.A00
            X.9O7 r0 = (X.AnonymousClass9O7) r0
            X.9Pu r1 = r0.A06
            X.9ky r0 = X.C202059ky.A00()
            r1.A00(r3, r0)
            return
        L_0x02aa:
            X.9nx r0 = X.C203399nx.A03(r11)
            X.C18740tg.A06(r0)
            X.9NH r3 = new X.9NH
            r3.<init>(r0)
            X.9ky r2 = r3.A00
            r1 = 0
            java.lang.Object r0 = r10.A00
            X.8g4 r0 = (X.AnonymousClass8g4) r0
            X.9Pv r0 = r0.A06
            if (r2 != 0) goto L_0x02c5
            r0.A00(r1, r3)
            return
        L_0x02c5:
            r0.A00(r2, r1)
            return
        L_0x02c9:
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess: "
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9nx r7 = X.C203399nx.A03(r11)
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L_0x036f
            r1 = r7
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r7.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x035a
            java.lang.String r0 = "token"
            X.9nx r1 = r7.A0c(r0)
            if (r1 != 0) goto L_0x035a
            java.lang.String r0 = "card"
            X.9nx r2 = r7.A0c(r0)
            if (r2 == 0) goto L_0x036f
            X.8b7 r1 = new X.8b7
            r1.<init>()
            java.lang.Object r6 = r10.A00
            X.8g2 r6 = (X.AnonymousClass8g2) r6
            X.16T r0 = r6.A04
            r1.A04(r0, r2, r4)
            X.9un r5 = r1.A07()
            X.9j5 r0 = r6.A08
            X.C201219j5.A01(r3, r5, r0)
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x031a
            X.1EU r0 = r6.A07
            X.9YB r2 = r0.A01()
            r0 = 8
        L_0x0316:
            X.AnonymousClass9YB.A01(r2, r5, r10, r0)
            return
        L_0x031a:
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0341
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "verify-method-list"
            X.9nx r0 = r7.A0c(r0)
            if (r0 == 0) goto L_0x034a
            X.9nx[] r4 = r0.A02
            if (r4 == 0) goto L_0x034a
            int r3 = r4.length
            if (r3 <= 0) goto L_0x034a
            r2 = 0
        L_0x0332:
            r1 = r4[r2]
            X.AUm r0 = new X.AUm
            r0.<init>(r1)
            r8.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x034a
            goto L_0x0332
        L_0x0341:
            X.1EU r0 = r6.A07
            X.9YB r2 = r0.A01()
            r0 = 9
            goto L_0x0316
        L_0x034a:
            X.1EU r0 = r6.A07
            X.9YB r2 = r0.A01()
            r1 = 1
        L_0x0351:
            X.95w r0 = new X.95w
            r0.<init>(r5, r6, r8, r1)
            r2.A04(r0, r5)
            return
        L_0x035a:
            X.9ky r2 = new X.9ky
            r2.<init>((X.C203399nx) r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess error:"
            X.C36321k7.A1J(r2, r0, r1)
            java.lang.Object r0 = r10.A00
            X.8g2 r0 = (X.AnonymousClass8g2) r0
            X.9Qt r0 = r0.A09
            goto L_0x0379
        L_0x036f:
            java.lang.Object r0 = r10.A00
            X.8g2 r0 = (X.AnonymousClass8g2) r0
            X.9Qt r0 = r0.A09
            X.9ky r2 = X.C202059ky.A00()
        L_0x0379:
            r0.A00(r3, r2, r3, r4)
            return
        L_0x037d:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9nx r1 = X.C203399nx.A03(r11)
            if (r1 == 0) goto L_0x03ab
            java.lang.String r0 = "card"
            X.9nx r3 = r1.A0c(r0)
            if (r3 == 0) goto L_0x03ab
            X.8b7 r2 = new X.8b7
            r2.<init>()
            java.lang.Object r1 = r10.A00
            X.8g7 r1 = (X.AnonymousClass8g7) r1
            X.16T r0 = r1.A01
            X.9un r2 = X.C175898bF.A02(r0, r2, r3)
            X.1EU r0 = r1.A07
            X.9YB r1 = r0.A01()
            r0 = 11
            X.AnonymousClass9YB.A01(r1, r2, r10, r0)
            return
        L_0x03ab:
            java.lang.Object r0 = r10.A00
            X.8g7 r0 = (X.AnonymousClass8g7) r0
            X.9RZ r2 = r0.A04
            r1 = 0
            X.9ky r0 = X.C202059ky.A00()
            r2.A00(r1, r0)
            return
        L_0x03ba:
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9nx r1 = X.C203399nx.A03(r11)
            if (r1 == 0) goto L_0x03e7
            java.lang.String r0 = "card"
            X.9nx r3 = r1.A0c(r0)
            if (r3 == 0) goto L_0x03e7
            X.8b7 r2 = new X.8b7
            r2.<init>()
            java.lang.Object r1 = r10.A00
            X.8g6 r1 = (X.AnonymousClass8g6) r1
            X.16T r0 = r1.A00
            X.9un r2 = X.C175898bF.A02(r0, r2, r3)
            X.1EU r0 = r1.A07
            X.9YB r1 = r0.A01()
            r0 = 12
            X.AnonymousClass9YB.A01(r1, r2, r10, r0)
        L_0x03e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction onResponseSuccess: "
            X.C36321k7.A1K(r11, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7H.A07(X.9nx):void");
    }
}
