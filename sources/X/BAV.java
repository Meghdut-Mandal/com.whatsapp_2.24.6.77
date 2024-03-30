package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class BAV implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public BAV(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj3;
        this.A02 = obj;
    }

    public void BVN(String str) {
        switch (this.A03) {
            case 0:
                AnonymousClass00C.A0D(str, 0);
                Log.e("GetGroupProfilePicturesProtocolHelper/delivery-error");
                C52802qC r0 = new C52802qC(str);
                AnonymousClass00C.A0D(r0, 0);
                C36351kA.A1T(r0, (C023509x) this.A00);
                return;
            case 1:
                C36341k9.A17(((AnonymousClass9II) this.A01).A00.A01, 2);
                C165577te.A1M("BrazilPixKeySettingViewModel", "removePixKey/handleDeliveryFailure");
                C165577te.A1M("BrazilPaymentAccountActions", "removePixKey/onDeliveryFailure triggered");
                return;
            default:
                Log.i("marketing_disclosure/GetMMDisclosureAcceptanceRequest delivery fail");
                AnonymousClass9IP r02 = (AnonymousClass9IP) this.A00;
                C30921az r2 = r02.A01;
                C30921az.A00(r2, new C22246Aj7(r02.A00, r2));
                return;
        }
    }

    public void BWw(C203399nx r7, String str) {
        switch (this.A03) {
            case 0:
                char A1a = C36341k9.A1a(str, r7);
                try {
                    C203539oF.A0A(C90514aH.A0e(r7, (C186018vH) this.A01), r7, 45);
                    C22993Azj[] azjArr = new C22993Azj[6];
                    azjArr[0] = AMN.A00;
                    azjArr[A1a] = AMO.A00;
                    azjArr[2] = AMP.A00;
                    azjArr[3] = AMQ.A00;
                    azjArr[4] = AMR.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("GetGroupProfilePicturesProtocolHelper/Fetching group photos failed: ");
                    long longValue = ((C23009Azz) C203379ns.A06(r7, "IQErrorItemNotFound|IQErrorForbidden|IQErrorNotAllowed|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorFallbackClient", C165567td.A0d(AMS.A00, azjArr, 5), C165607th.A1a())).B9o().longValue();
                    A0u.append(longValue);
                    C90504aG.A1G(A0u);
                    C52862qI r0 = new C52862qI(str, (int) longValue);
                    AnonymousClass00C.A0D(r0, 0);
                    C36351kA.A1T(r0, (AnonymousClass0AP) this.A00);
                    return;
                } catch (Exception e) {
                    C36321k7.A1J(e, "GetGroupProfilePicturesProtocolHelper/", AnonymousClass000.A0u());
                    C36351kA.A1T(e, (C023509x) this.A00);
                    return;
                }
            case 1:
                A00((AnonymousClass9II) this.A01, r7, (C186018vH) this.A02);
                C165577te.A1M("BrazilPaymentAccountActions", "removePixKey/onError triggered");
                return;
            default:
                C36321k7.A1S("marketing_disclosure/GetMMDisclosureAcceptanceRequest/", AnonymousClass000.A0u(), C165597tg.A05(r7));
                AnonymousClass9IP r02 = (AnonymousClass9IP) this.A00;
                C30921az r2 = r02.A01;
                C30921az.A00(r2, new C22246Aj7(r02.A00, r2));
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0136, code lost:
        X.C36321k7.A1Z(r7, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r20, java.lang.String r21) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A03
            r7 = r20
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0082;
                default: goto L_0x0009;
            }
        L_0x0009:
            r6 = 1
            X.AnonymousClass00C.A0D(r7, r6)
            java.lang.Object r2 = r3.A01
            X.1jS r2 = (X.C35911jS) r2
            r1 = 23
            X.8vh r0 = new X.8vh
            r0.<init>((X.C203399nx) r7, (X.C35911jS) r2, (int) r1)
            java.lang.Object r0 = r0.A01
            java.util.Iterator r8 = X.C90514aH.A13(r0)
        L_0x001e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r7 = r8.next()
            X.8sC r7 = (X.C184288sC) r7
            java.lang.Object r0 = r7.A00
            X.8t3 r0 = (X.C184818t3) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r4 = 20231028(0x134b374, double:9.995456E-317)
            if (r0 == 0) goto L_0x001e
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r7.A01
            long r4 = X.C165587tf.A0B(r0)
            java.lang.Object r3 = r3.A00
            X.9IP r3 = (X.AnonymousClass9IP) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            X.1az r2 = r3.A01
            X.1b6 r0 = r2.A08
            if (r1 != 0) goto L_0x0055
            r4 = 0
        L_0x0055:
            r0.A00(r4, r6)
            X.11F r1 = r3.A00
            r2.A03(r1)
            X.Aj8 r0 = new X.Aj8
            r0.<init>(r1, r2)
            X.C30921az.A00(r2, r0)
            return
        L_0x0066:
            java.lang.Object r5 = r3.A00
            X.9IP r5 = (X.AnonymousClass9IP) r5
            r4 = 0
            X.1az r3 = r5.A01
            X.1b6 r2 = r3.A08
            r0 = 0
            r2.A00(r0, r4)
            X.11F r1 = r5.A00
            r3.A03(r1)
            X.Aj8 r0 = new X.Aj8
            r0.<init>(r1, r3)
            X.C30921az.A00(r3, r0)
            return
        L_0x0082:
            java.lang.Object r1 = r3.A02
            X.8vH r1 = (X.C186018vH) r1
            java.lang.Object r0 = r3.A01
            X.9II r0 = (X.AnonymousClass9II) r0
            A00(r0, r7, r1)
            return
        L_0x008e:
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.Object r2 = r3.A01     // Catch:{ Exception -> 0x01d4 }
            X.8vH r2 = (X.C186018vH) r2     // Catch:{ Exception -> 0x01d4 }
            X.9nx r6 = X.C90514aH.A0e(r7, r2)     // Catch:{ Exception -> 0x01d4 }
            r4 = 46
            X.B9u r2 = new X.B9u     // Catch:{ Exception -> 0x01d4 }
            r2.<init>(r6, r4)     // Catch:{ Exception -> 0x01d4 }
            X.C203539oF.A0C(r7, r2)     // Catch:{ Exception -> 0x01d4 }
            X.AMT r4 = X.AMT.A00     // Catch:{ Exception -> 0x01d4 }
            r2 = 1
            X.AnonymousClass00C.A0D(r4, r2)     // Catch:{ Exception -> 0x01d4 }
            java.lang.Object r2 = r4.B15(r7)     // Catch:{ Exception -> 0x01d4 }
            X.8rq r2 = (X.C184068rq) r2     // Catch:{ Exception -> 0x01d4 }
            java.lang.Object r2 = r2.A00     // Catch:{ Exception -> 0x01d4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x01d4 }
            java.util.Iterator r10 = X.C90514aH.A14(r2)     // Catch:{ Exception -> 0x01d4 }
        L_0x00c0:
            boolean r2 = r10.hasNext()     // Catch:{ Exception -> 0x01d4 }
            if (r2 == 0) goto L_0x01c2
            java.lang.Object r2 = r10.next()     // Catch:{ Exception -> 0x01d4 }
            X.8t3 r2 = (X.C184818t3) r2     // Catch:{ Exception -> 0x01d4 }
            java.lang.Object r2 = r2.A01     // Catch:{ Exception -> 0x01d4 }
            X.Awn r2 = (X.C22838Awn) r2     // Catch:{ Exception -> 0x01d4 }
            X.5nK r2 = (X.C118095nK) r2     // Catch:{ Exception -> 0x01d4 }
            X.9nx r9 = r2.A00     // Catch:{ Exception -> 0x01d4 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "sub_group_jid"
            r14 = 0
            java.lang.String r4 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            if (r4 == 0) goto L_0x00c0
            X.3Sl r2 = X.AnonymousClass147.A01     // Catch:{ Exception -> 0x01d4 }
            X.147 r12 = X.C65533Sl.A04(r4)     // Catch:{ Exception -> 0x01d4 }
            X.0fG r4 = new X.0fG     // Catch:{ Exception -> 0x01d4 }
            r4.<init>()     // Catch:{ Exception -> 0x01d4 }
            X.0fG r6 = new X.0fG     // Catch:{ Exception -> 0x01d4 }
            r6.<init>()     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "status"
            java.lang.String r7 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            r15 = 0
            if (r7 == 0) goto L_0x0147
            java.lang.String r2 = "304"
            boolean r2 = r7.equals(r2)     // Catch:{ Exception -> 0x01d4 }
            if (r2 != 0) goto L_0x00c0
            X.8tx r2 = new X.8tx     // Catch:{ 19b -> 0x013a }
            r2.<init>(r9)     // Catch:{ 19b -> 0x013a }
            X.8rs r2 = r2.A00     // Catch:{ 19b -> 0x013a }
            if (r2 == 0) goto L_0x0144
            X.9bw r7 = new X.9bw     // Catch:{ 19b -> 0x013a }
            r7.<init>(r4, r6)     // Catch:{ 19b -> 0x013a }
            int r2 = r2.A00     // Catch:{ 19b -> 0x013a }
            switch(r2) {
                case 0: goto L_0x012b;
                case 1: goto L_0x011f;
                case 2: goto L_0x0144;
                default: goto L_0x0114;
            }     // Catch:{ 19b -> 0x013a }
        L_0x0114:
            X.0fG r2 = r7.A00     // Catch:{ 19b -> 0x013a }
            r2.element = r14     // Catch:{ 19b -> 0x013a }
            X.0fG r7 = r7.A01     // Catch:{ 19b -> 0x013a }
            java.lang.String r2 = "preview"
            r7.element = r2     // Catch:{ 19b -> 0x013a }
            goto L_0x0144
        L_0x011f:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x013a }
            java.lang.String r2 = "GetGroupProfilePicturesProtocolHelper/Fetching group photos partially failed: "
            r7.append(r2)     // Catch:{ 19b -> 0x013a }
            java.lang.String r2 = "500"
            goto L_0x0136
        L_0x012b:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x013a }
            java.lang.String r2 = "GetGroupProfilePicturesProtocolHelper/Fetching group photos partially failed: "
            r7.append(r2)     // Catch:{ 19b -> 0x013a }
            java.lang.String r2 = "405"
        L_0x0136:
            X.C36321k7.A1Z(r7, r2)     // Catch:{ 19b -> 0x013a }
            goto L_0x0144
        L_0x013a:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "GetGroupProfilePicturesProtocolHelper/"
            X.C36321k7.A1J(r8, r2, r7)     // Catch:{ Exception -> 0x01d4 }
        L_0x0144:
            r7 = r14
            r13 = r14
            goto L_0x0180
        L_0x0147:
            java.lang.String r2 = "id"
            java.lang.String r2 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            r4.element = r2     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "type"
            java.lang.String r2 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            r6.element = r2     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "url"
            java.lang.String r8 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r2 = "direct_path"
            java.lang.String r13 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
            java.lang.Object r2 = r3.A02     // Catch:{ Exception -> 0x01d4 }
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper r2 = (com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper) r2     // Catch:{ Exception -> 0x01d4 }
            X.0yC r7 = r2.A00     // Catch:{ Exception -> 0x01d4 }
            r2 = 4406(0x1136, float:6.174E-42)
            boolean r2 = r7.A0E(r2)     // Catch:{ Exception -> 0x01d4 }
            if (r2 == 0) goto L_0x0177
            java.lang.String r2 = "hash"
            java.lang.String r14 = r9.A0i(r2, r14)     // Catch:{ Exception -> 0x01d4 }
        L_0x0177:
            if (r8 == 0) goto L_0x017e
            java.net.URL r15 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a9 }
            r15.<init>(r8)     // Catch:{ MalformedURLException -> 0x01a9 }
        L_0x017e:
            byte[] r7 = r9.A01     // Catch:{ Exception -> 0x01d4 }
        L_0x0180:
            java.lang.Object r2 = r4.element     // Catch:{ NumberFormatException -> 0x01b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x01b0 }
            if (r2 == 0) goto L_0x01a6
            int r17 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01b0 }
        L_0x018a:
            java.lang.Object r6 = r6.element     // Catch:{ NumberFormatException -> 0x01b0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01b0 }
            if (r6 == 0) goto L_0x00c0
            java.lang.String r2 = "preview"
            boolean r2 = r2.equals(r6)     // Catch:{ NumberFormatException -> 0x01b0 }
            int r18 = X.C36371kC.A00(r2)
            X.5xp r11 = new X.5xp     // Catch:{ NumberFormatException -> 0x01b0 }
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ NumberFormatException -> 0x01b0 }
            r5.add(r11)     // Catch:{ NumberFormatException -> 0x01b0 }
            goto L_0x00c0
        L_0x01a6:
            r17 = -1
            goto L_0x018a
        L_0x01a9:
            java.lang.String r0 = "handleGroupPicture/Malformed picture url"
            X.19b r0 = X.C165617ti.A0Q(r0)     // Catch:{ Exception -> 0x01d4 }
            goto L_0x01c1
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r0 = "Malformed photo id="
            r1.append(r0)     // Catch:{ Exception -> 0x01d4 }
            java.lang.Object r0 = r4.element     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01d4 }
            X.19b r0 = X.C165577te.A0X(r0, r1)     // Catch:{ Exception -> 0x01d4 }
        L_0x01c1:
            throw r0     // Catch:{ Exception -> 0x01d4 }
        L_0x01c2:
            java.lang.Object r4 = r3.A00     // Catch:{ Exception -> 0x01d4 }
            X.0AP r4 = (X.AnonymousClass0AP) r4     // Catch:{ Exception -> 0x01d4 }
            X.3Hv r2 = new X.3Hv     // Catch:{ Exception -> 0x01d4 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x01d4 }
            X.0AK r0 = new X.0AK     // Catch:{ Exception -> 0x01d4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01d4 }
            r4.resumeWith(r0)     // Catch:{ Exception -> 0x01d4 }
            return
        L_0x01d4:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            X.09x r0 = (X.C023509x) r0
            X.C36351kA.A1T(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.BiM(X.9nx, java.lang.String):void");
    }

    public static void A00(AnonymousClass9II r5, C203399nx r6, C186018vH r7) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            new C186278vh(r6, r7, 5);
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = r5.A00;
            C36421kH.A1H(brazilPixKeySettingViewModel.A07, brazilPixKeySettingViewModel, r5.A01, 12);
        } catch (C235919b e) {
            C165567td.A1R("RemoveCustomPaymentMethodResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                new C186268vg(r6, r7, 1);
                C36341k9.A17(r5.A00.A01, 2);
                C165577te.A1M("BrazilPixKeySettingViewModel", "removePixKey/handle::RemoveCustomPaymentMethodResponseError");
            } catch (C235919b e2) {
                throw C165567td.A0H("RemoveCustomPaymentMethodResponseError: ", AnonymousClass000.A0u(), e2, A0I);
            }
        }
    }
}
