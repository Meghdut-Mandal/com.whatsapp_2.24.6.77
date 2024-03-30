package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;
import java.util.ArrayList;

/* renamed from: X.7tG  reason: invalid class name and case insensitive filesystem */
public class C165337tG implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        X.C24441Cl.A00(r10, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0268, code lost:
        r3.BpM(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWw(X.C203399nx r10, java.lang.String r11) {
        /*
            r9 = this;
            r5 = r9
            int r0 = r9.A03
            r4 = r10
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0036;
                case 2: goto L_0x0043;
                case 3: goto L_0x0060;
                case 4: goto L_0x0069;
                case 5: goto L_0x00b7;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x000f;
                case 11: goto L_0x000f;
                case 12: goto L_0x00d8;
                case 13: goto L_0x0122;
                case 14: goto L_0x0172;
                case 15: goto L_0x0213;
                case 16: goto L_0x0270;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r9.A01
            X.6yW r0 = (X.C148226yW) r0
        L_0x000b:
            X.C24441Cl.A00(r10, r0, r11)
            return
        L_0x000f:
            java.lang.Object r0 = r9.A01
            X.7hQ r0 = (X.AnonymousClass7hQ) r0
            goto L_0x000b
        L_0x0014:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Bloks: IQRequestHelper/sendIQRequest onError: "
            java.lang.String r0 = X.C90494aF.A0c(r10, r0, r1)
            X.C36321k7.A1Z(r1, r0)
            java.lang.Object r0 = r9.A00
            X.6W0 r0 = (X.AnonymousClass6W0) r0
            X.17Y r0 = r0.A00
            java.lang.Object r6 = r9.A02
            java.lang.Object r7 = r9.A01
            r8 = 14
            X.74x r3 = new X.74x
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            r0.Bp3(r3)
            return
        L_0x0036:
            java.lang.Object r1 = r9.A01
            X.777 r1 = (X.AnonymousClass777) r1
            X.5V6 r0 = new X.5V6
            r0.<init>(r10, r11)
            r1.BVM(r0)
            return
        L_0x0043:
            int r2 = X.AnonymousClass3ME.A00(r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSubscriptionSendMethods/unsubscribe/onError; iqId="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", error="
            X.C36321k7.A1T(r0, r1, r2)
            java.lang.Object r0 = r9.A01
            X.4RS r0 = (X.AnonymousClass4RS) r0
            r0.Bou(r2)
            return
        L_0x0060:
            java.lang.Object r1 = r9.A00
            X.00r r1 = (X.C001600r) r1
            r0 = 0
            X.C36341k9.A19(r1, r0)
            return
        L_0x0069:
            android.util.Pair r2 = X.AnonymousClass3ME.A01(r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError "
            X.C36321k7.A1J(r2, r0, r1)
            if (r2 == 0) goto L_0x0085
            int r1 = X.C36381kD.A04(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0085
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0085:
            java.lang.Object r4 = r9.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            androidx.work.WorkerParameters r0 = r4.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x00ae
            java.lang.Object r3 = r9.A02
            int[] r3 = (int[]) r3
            r2 = 440(0x1b8, float:6.17E-43)
            X.1ZE r1 = r4.A02
            r0 = 2
            X.1Z6 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00a2
            r0.BVo(r3, r2)
        L_0x00a2:
            java.lang.Object r1 = r9.A01
            X.0UQ r1 = (X.AnonymousClass0UQ) r1
            X.4ow r0 = X.C97334ow.A00()
        L_0x00aa:
            r1.A00(r0)
            return
        L_0x00ae:
            java.lang.Object r1 = r9.A01
            X.0UQ r1 = (X.AnonymousClass0UQ) r1
            X.4ov r0 = X.C97324ov.A00()
            goto L_0x00aa
        L_0x00b7:
            X.C36321k7.A0w(r11, r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AvatarUserRequestHelper/onError: "
            r1.append(r0)
            X.5V6 r0 = new X.5V6
            r0.<init>(r10, r11)
            X.C36331k8.A1P(r0, r1)
            java.lang.Object r1 = r9.A01
            X.02t r1 = (X.C006302t) r1
            X.5V6 r0 = new X.5V6
            r0.<init>(r10, r11)
            r1.invoke(r0)
            return
        L_0x00d8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onError; iq="
            X.C36321k7.A1Q(r0, r11, r1)
            int r4 = X.AnonymousClass3ME.A00(r10)
            java.lang.Object r2 = r9.A00
            X.65C r2 = (X.AnonymousClass65C) r2
            java.lang.Object r3 = r9.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert-error jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " errorCode="
            X.C36321k7.A1T(r0, r1, r4)
            X.005 r0 = r2.A01
            java.lang.Object r2 = r0.get()
            X.185 r2 = (X.AnonymousClass185) r2
            java.util.Map r1 = r2.A07
            java.lang.Long r0 = X.C90484aE.A0g()
            r1.put(r3, r0)
            X.18w r1 = r2.A03
            X.60u r0 = new X.60u
            r0.<init>(r3)
            r1.A00()
            java.lang.Object r1 = r9.A02
            X.8Hw r1 = (X.C170888Hw) r1
            r0 = 0
            r1.A04(r0)
            return
        L_0x0122:
            X.C36321k7.A0w(r11, r10)
            int r4 = X.AnonymousClass3ME.A00(r10)
            java.lang.Object r3 = r9.A01
            X.5qE r3 = (X.C119655qE) r3
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = r3.A00
            java.lang.StringBuilder r0 = X.C90464aC.A0k(r0)
            java.lang.String r2 = r0.toString()
            r0 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r4 == r0) goto L_0x016c
            java.lang.String r0 = "error in response while running get status privacy job"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ; code="
            X.C36321k7.A1S(r0, r1, r4)
        L_0x014c:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A01
            r0.set(r4)
            java.lang.Object r1 = r9.A00
            X.8Hw r1 = (X.C170888Hw) r1
            r0 = 0
            r1.A04(r0)
            java.lang.Object r0 = r9.A02
            X.6Ki r0 = (X.C130256Ki) r0
            X.0ze r3 = r0.A03
            int r2 = r11.hashCode()
            r1 = 154475307(0x9351b2b, float:2.1799857E-33)
            r0 = 87
            r3.markerEnd(r1, r2, r0)
            return
        L_0x016c:
            java.lang.String r0 = "get status privacy job response is 'no settings found on server'"
            X.C36321k7.A1Q(r0, r2, r1)
            goto L_0x014c
        L_0x0172:
            X.C36321k7.A0w(r11, r10)
            int r1 = X.AnonymousClass3ME.A00(r10)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onError code="
            X.C36321k7.A1S(r0, r2, r1)
            java.lang.Object r2 = r9.A02
            X.6Kk r2 = (X.C130266Kk) r2
            X.5V6 r3 = new X.5V6
            r3.<init>(r10, r11)
            java.lang.Object r4 = r9.A00
            X.5rQ r4 = (X.C120385rQ) r4
            java.lang.Object r6 = r9.A01
            X.6Ee r6 = (X.C128936Ee) r6
            r0 = 27
            X.737 r5 = new X.737
            r5.<init>(r2, r4, r6, r0)
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0201
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0204
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x01f2
            r0 = 488(0x1e8, float:6.84E-43)
            if (r1 == r0) goto L_0x0201
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0204
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 == r0) goto L_0x0204
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0204
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0201
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x01f2
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0201
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 == r0) goto L_0x0201
            r0 = 481(0x1e1, float:6.74E-43)
            if (r1 == r0) goto L_0x01f2
            switch(r1) {
                case 483: goto L_0x0201;
                case 484: goto L_0x0201;
                case 485: goto L_0x01ce;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            return
        L_0x01ce:
            X.005 r0 = r2.A02
            java.lang.Object r1 = r0.get()
            X.1UC r1 = (X.AnonymousClass1UC) r1
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0A(r0)
            X.005 r0 = r2.A01
            java.lang.Object r2 = r0.get()
            X.6KN r2 = (X.AnonymousClass6KN) r2
            X.71a r1 = new X.71a
            r1.<init>(r6, r3, r4, r5)
            X.6Ee r0 = X.C128936Ee.A00()
            X.AnonymousClass6KN.A00(r0, r1, r2)
            return
        L_0x01f2:
            java.lang.Long r0 = r6.A01()
            if (r0 == 0) goto L_0x0209
            X.0wU r3 = r2.A00
            long r1 = r0.longValue()
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/retryWithBackoff"
            goto L_0x0268
        L_0x0201:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: Unexpected Error received from Bloks Integrity check  IQ"
            goto L_0x0206
        L_0x0204:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: Unrecoverable error from Bloks Integrity check IQ"
        L_0x0206:
            X.AnonymousClass3TI.A00(r0)
        L_0x0209:
            X.62G r0 = r4.A00
            X.6Dj r0 = r0.A01
            X.67W r0 = r0.A01
            r0.A00(r3)
            return
        L_0x0213:
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            java.lang.String r0 = "ForceSuspendStateIqHelper/sendData:onError"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r4 = X.AnonymousClass3ME.A00(r10)
            java.lang.Object r3 = r9.A02
            X.6KN r3 = (X.AnonymousClass6KN) r3
            java.lang.Object r2 = r9.A00
            X.7jx r2 = (X.C159807jx) r2
            java.lang.Object r1 = r9.A01
            X.6Ee r1 = (X.C128936Ee) r1
            r0 = 29
            X.737 r5 = new X.737
            r5.<init>(r3, r2, r1, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x026c
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x026c
            r0 = 408(0x198, float:5.72E-43)
            if (r4 == r0) goto L_0x025a
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 == r0) goto L_0x025a
            r0 = 481(0x1e1, float:6.74E-43)
            if (r4 == r0) goto L_0x0250
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 == r0) goto L_0x025a
            r0 = 503(0x1f7, float:7.05E-43)
            if (r4 == r0) goto L_0x026c
            return
        L_0x0250:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x026c
            r5.run()
            return
        L_0x025a:
            java.lang.Long r0 = r1.A01()
            if (r0 == 0) goto L_0x026c
            X.0wU r3 = r3.A01
            long r1 = r0.longValue()
            java.lang.String r0 = "ForceSuspendStateIqHelper/retryWithBackoff"
        L_0x0268:
            r3.BpM(r5, r0, r1)
            return
        L_0x026c:
            r2.BXH()
            return
        L_0x0270:
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            java.lang.Object r1 = r9.A01     // Catch:{ 19b -> 0x0280 }
            X.8vG r1 = (X.C186008vG) r1     // Catch:{ 19b -> 0x0280 }
            java.lang.Object r0 = r9.A02     // Catch:{ 19b -> 0x0280 }
            X.5nO r0 = (X.C118135nO) r0     // Catch:{ 19b -> 0x0280 }
            A00(r10, r1, r0)     // Catch:{ 19b -> 0x0280 }
            return
        L_0x0280:
            r1 = move-exception
            java.lang.Object r0 = r9.A00
            X.62J r0 = (X.AnonymousClass62J) r0
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165337tG.BWw(X.9nx, java.lang.String):void");
    }

    public C165337tG(C186008vG r2, AnonymousClass62J r3) {
        this.A03 = 16;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = new C118135nO(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        X.C36321k7.A1P(r0, r6, r1);
        r3 = (X.C148226yW) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        X.C36321k7.A1P(r0, r6, r1);
        r3 = (X.C148226yW) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r3.BWq("delivery failure", 3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        r3.BWq("delivery failure", 3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVN(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x002e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0045;
                case 4: goto L_0x004e;
                case 5: goto L_0x0085;
                case 6: goto L_0x0092;
                case 7: goto L_0x0099;
                case 8: goto L_0x00a7;
                case 9: goto L_0x00ae;
                case 10: goto L_0x00c3;
                case 11: goto L_0x00d1;
                case 12: goto L_0x00e6;
                case 13: goto L_0x00fd;
                case 14: goto L_0x0120;
                case 15: goto L_0x014b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r1 = r5.A00
            X.62J r1 = (X.AnonymousClass62J) r1
            X.2qD r0 = new X.2qD
            r0.<init>(r6)
            r1.A00(r0)
            return
        L_0x0016:
            java.lang.String r0 = "Bloks: IQRequestHelper/sendIQRequest onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.6W0 r0 = (X.AnonymousClass6W0) r0
            X.17Y r3 = r0.A00
            java.lang.Object r2 = r5.A01
            r1 = 41
            X.AVW r0 = new X.AVW
            r0.<init>(r2, r1)
            r3.Bp3(r0)
            return
        L_0x002e:
            java.lang.Object r1 = r5.A01
            X.777 r1 = (X.AnonymousClass777) r1
            X.2qD r0 = new X.2qD
            r0.<init>(r6)
            r1.BVM(r0)
            return
        L_0x003b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSubscriptionSendMethods/unsubscribe/onDeliveryFailure; iqId="
            X.C36321k7.A1Q(r0, r6, r1)
            return
        L_0x0045:
            java.lang.Object r1 = r5.A00
            X.00r r1 = (X.C001600r) r1
            r0 = 0
            X.C36341k9.A19(r1, r0)
            return
        L_0x004e:
            java.lang.String r0 = "disclosuregetstagebyidsworker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r4 = r5.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            androidx.work.WorkerParameters r0 = r4.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x007c
            java.lang.Object r3 = r5.A02
            int[] r3 = (int[]) r3
            r2 = 440(0x1b8, float:6.17E-43)
            X.1ZE r1 = r4.A02
            r0 = 2
            X.1Z6 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0070
            r0.BVo(r3, r2)
        L_0x0070:
            java.lang.Object r1 = r5.A01
            X.0UQ r1 = (X.AnonymousClass0UQ) r1
            X.4ow r0 = X.C97334ow.A00()
        L_0x0078:
            r1.A00(r0)
            return
        L_0x007c:
            java.lang.Object r1 = r5.A01
            X.0UQ r1 = (X.AnonymousClass0UQ) r1
            X.4ov r0 = X.C97324ov.A00()
            goto L_0x0078
        L_0x0085:
            java.lang.String r0 = "AvatarUserRequestHelper/onDeliveryFailure: Network Failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.7kO r0 = (X.C160057kO) r0
            r0.BVK()
            return
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitRegIq/onDeliveryFailure id="
            goto L_0x009f
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendFinishRegIq/onDeliveryFailure id="
        L_0x009f:
            X.C36321k7.A1P(r0, r6, r1)
            java.lang.Object r3 = r5.A01
            X.6yW r3 = (X.C148226yW) r3
            goto L_0x00bb
        L_0x00a7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitLoginIq/onDeliveryFailure id="
            goto L_0x00b4
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess/onDeliveryFailure id="
        L_0x00b4:
            X.C36321k7.A1P(r0, r6, r1)
            java.lang.Object r3 = r5.A01
            X.6yW r3 = (X.C148226yW) r3
        L_0x00bb:
            java.lang.String r2 = "delivery failure"
            r1 = 3
            r0 = -1
            r3.BWq(r2, r1, r0)
            return
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq/onDeliveryFailure id="
            X.C36321k7.A1P(r0, r6, r1)
            java.lang.Object r3 = r5.A01
            X.7hQ r3 = (X.AnonymousClass7hQ) r3
            goto L_0x00de
        L_0x00d1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/onDeliveryFailure id="
            X.C36321k7.A1P(r0, r6, r1)
            java.lang.Object r3 = r5.A01
            X.7hQ r3 = (X.AnonymousClass7hQ) r3
        L_0x00de:
            java.lang.String r2 = "delivery failure"
            r1 = 3
            r0 = -1
            r3.BWq(r2, r1, r0)
            return
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onDeliveryFailure; iq="
            X.C36321k7.A1Q(r0, r6, r1)
            java.lang.Object r2 = r5.A02
            X.8Hw r2 = (X.C170888Hw) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Delivery failure: iq="
            X.C36321k7.A0R(r2, r0, r6, r1)
            return
        L_0x00fd:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r2 = r5.A00
            X.8Hw r2 = (X.C170888Hw) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed deliver: iq="
            X.C36321k7.A0R(r2, r0, r6, r1)
            java.lang.Object r0 = r5.A02
            X.6Ki r0 = (X.C130256Ki) r0
            X.0ze r3 = r0.A03
            int r2 = r6.hashCode()
            r1 = 154475307(0x9351b2b, float:2.1799857E-33)
            r0 = 3
            r3.markerEnd(r1, r2, r0)
            return
        L_0x0120:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.5rQ r0 = (X.C120385rQ) r0
            X.2qD r1 = new X.2qD
            r1.<init>(r6)
            X.62G r0 = r0.A00
            X.6Dj r0 = r0.A01
            X.67W r4 = r0.A01
            X.5vX r3 = r4.A03
            r3.A02 = r1
            r0 = 7
            r3.A00 = r0
            X.6Pn r2 = r4.A02
            java.lang.String r1 = r1.getLocalizedMessage()
            X.7ke r0 = r4.A04
            r2.A02(r3, r0, r1)
            return
        L_0x014b:
            java.lang.String r0 = "ForceSuspendStateIqHelper/sendData:onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.7jx r0 = (X.C159807jx) r0
            r0.BXH()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165337tG.BVN(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.7o4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.7o3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: X.7o4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: X.7o4} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:42|43|44|45|46|47|(2:49|50)(2:51|(2:53|54)(2:55|(2:57|58)(2:59|(2:61|62)(5:63|253|68|69|70))))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x01ca */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d1 A[Catch:{ 19b -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e0 A[Catch:{ 19b -> 0x0266 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r27, java.lang.String r28) {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.A03
            r14 = r27
            r3 = r28
            switch(r1) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0037;
                case 2: goto L_0x0051;
                case 3: goto L_0x0060;
                case 4: goto L_0x009f;
                case 5: goto L_0x0117;
                case 6: goto L_0x0123;
                case 7: goto L_0x0273;
                case 8: goto L_0x02e6;
                case 9: goto L_0x0474;
                case 10: goto L_0x04ec;
                case 11: goto L_0x0533;
                case 12: goto L_0x0583;
                case 13: goto L_0x0667;
                case 14: goto L_0x079f;
                case 15: goto L_0x0882;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 1
            X.AnonymousClass00C.A0D(r14, r1)
            java.lang.Object r2 = r0.A01     // Catch:{ 19b -> 0x001b }
            X.8vG r2 = (X.C186008vG) r2     // Catch:{ 19b -> 0x001b }
            java.lang.Object r1 = r0.A02     // Catch:{ 19b -> 0x001b }
            X.5nO r1 = (X.C118135nO) r1     // Catch:{ 19b -> 0x001b }
            A00(r14, r2, r1)     // Catch:{ 19b -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            java.lang.Object r0 = r0.A00
            X.62J r0 = (X.AnonymousClass62J) r0
            r0.A00(r1)
            return
        L_0x0024:
            java.lang.Object r1 = r0.A00
            X.6W0 r1 = (X.AnonymousClass6W0) r1
            X.17Y r4 = r1.A00
            java.lang.Object r3 = r0.A01
            r2 = 48
            X.74w r1 = new X.74w
            r1.<init>(r0, r3, r14, r2)
            r4.Bp3(r1)
            return
        L_0x0037:
            java.lang.Object r1 = r0.A00
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r1 = (com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob) r1
            X.1DM r4 = r1.A00
            com.whatsapp.jid.UserJid r3 = r1.A01
            java.lang.Object r1 = r0.A02
            long r1 = X.C36431kI.A09(r1)
            r4.A0B(r3, r1)
            java.lang.Object r1 = r0.A01
            X.777 r1 = (X.AnonymousClass777) r1
            r0 = 0
            r1.BVO(r0)
            return
        L_0x0051:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "LocationSubscriptionSendMethods/unsubscribe/onSuccess; iqId="
            X.C36321k7.A1Q(r1, r3, r2)
            java.lang.Object r0 = r0.A02
            X.C36411kG.A1O(r0)
            return
        L_0x0060:
            r4 = 1
            X.AnonymousClass00C.A0D(r14, r4)
            java.lang.String r1 = "privacy"
            X.9nx r2 = r14.A0d(r1)
            java.lang.String r1 = "category"
            X.9nx r2 = r2.A0d(r1)
            java.lang.String r1 = "dhash"
            java.lang.String r3 = X.C36391kE.A0x(r2, r1)
            if (r3 == 0) goto L_0x008f
            java.lang.Object r2 = r0.A02
            X.6FH r2 = (X.AnonymousClass6FH) r2
            java.lang.Object r1 = r0.A01
            java.util.Set r1 = (java.util.Set) r1
            r2.A05(r3, r1, r4)
            java.lang.Object r1 = r0.A00
            X.00r r1 = (X.C001600r) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x008b:
            r1.A0C(r0)
            return
        L_0x008f:
            java.lang.Object r1 = r0.A02
            X.6FH r1 = (X.AnonymousClass6FH) r1
            r1.A01()
            java.lang.Object r1 = r0.A00
            X.00r r1 = (X.C001600r) r1
            java.lang.Boolean r0 = X.C36381kD.A0j()
            goto L_0x008b
        L_0x009f:
            java.lang.Object r4 = r0.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            java.lang.String r1 = "notice"
            java.util.List r1 = r14.A0j(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r1.iterator()
        L_0x00b1:
            boolean r1 = r7.hasNext()
            r14 = 2
            r5 = 1
            if (r1 == 0) goto L_0x00fa
            X.9nx r6 = X.C36431kI.A0s(r7)
            java.lang.String r1 = "id"
            int r9 = r6.A0R(r1)
            java.lang.String r1 = "stage"
            int r10 = r6.A0R(r1)
            java.lang.String r1 = "t"
            long r1 = r6.A0U(r1)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r1
            java.lang.String r1 = "version"
            int r11 = r6.A0S(r1, r5)
            java.lang.String r1 = "type"
            int r1 = r6.A0S(r1, r14)
            if (r1 != r14) goto L_0x00f0
            r1 = -1
            if (r10 <= r1) goto L_0x00f0
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r10 >= r1) goto L_0x00f0
            X.3Su r8 = new X.3Su
            r8.<init>(r9, r10, r11, r12, r14)
            r3.add(r8)
            goto L_0x00b1
        L_0x00f0:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "disclosuregetstagebyidsworker/parseusernoticemetadatalist not valid PDFN metadata id = "
            X.C36321k7.A1U(r1, r2, r9)
            goto L_0x00b1
        L_0x00fa:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x010b
            X.1ZE r1 = r4.A02
            X.1Z6 r1 = r1.A00(r14)
            if (r1 == 0) goto L_0x010b
            r1.BJZ(r3, r5, r5)
        L_0x010b:
            java.lang.Object r1 = r0.A01
            X.0UQ r1 = (X.AnonymousClass0UQ) r1
            X.4ox r0 = X.C97344ox.A00()
            r1.A00(r0)
            return
        L_0x0117:
            r1 = 1
            X.AnonymousClass00C.A0D(r14, r1)
            java.lang.Object r0 = r0.A02
            X.02t r0 = (X.C006302t) r0
            r0.invoke(r14)
            return
        L_0x0123:
            java.lang.Object r4 = r0.A02
            X.33b r4 = (X.C592133b) r4
            java.lang.Object r0 = r0.A01
            X.4xp r0 = (X.C101514xp) r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess id="
            X.C36321k7.A1Q(r1, r3, r2)
            r9 = -1
            r18 = 0
            X.9nx r10 = X.C90514aH.A0e(r14, r4)     // Catch:{ 19b -> 0x0266 }
            java.lang.String r2 = "hk_pub"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r19 = new java.lang.String[]{r2, r1}     // Catch:{ 19b -> 0x0266 }
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.Long r16 = X.C90474aD.A0Y()     // Catch:{ 19b -> 0x0266 }
            r4 = 1024(0x400, double:5.06E-321)
            java.lang.Long r17 = java.lang.Long.valueOf(r4)     // Catch:{ 19b -> 0x0266 }
            r7 = 0
            r20 = 0
            java.lang.Object r2 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0266 }
            byte[] r2 = (byte[]) r2     // Catch:{ 19b -> 0x0266 }
            java.lang.String r4 = "hk_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r4, r1}     // Catch:{ 19b -> 0x0266 }
            r4 = 384(0x180, double:1.897E-321)
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ 19b -> 0x0266 }
            r17 = r16
            java.lang.Object r5 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0266 }
            byte[] r5 = (byte[]) r5     // Catch:{ 19b -> 0x0266 }
            java.lang.String r4 = "ok_pub"
            java.lang.String[] r24 = new java.lang.String[]{r4, r1}     // Catch:{ 19b -> 0x0266 }
            r11 = 32
            java.lang.Long r21 = java.lang.Long.valueOf(r11)     // Catch:{ 19b -> 0x0266 }
            r25 = 0
            r19 = r14
            r20 = r15
            r22 = r21
            r23 = r18
            java.lang.Object r4 = X.C203379ns.A03(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 19b -> 0x0266 }
            byte[] r4 = (byte[]) r4     // Catch:{ 19b -> 0x0266 }
            java.lang.String r6 = "ok_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r6, r1}     // Catch:{ 19b -> 0x0266 }
            r20 = 0
            java.lang.Object r6 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0266 }
            byte[] r6 = (byte[]) r6     // Catch:{ 19b -> 0x0266 }
            java.lang.String r8 = "ed_pub"
            java.lang.String[] r24 = new java.lang.String[]{r8, r1}     // Catch:{ 19b -> 0x0266 }
            r19 = r14
            r20 = r15
            java.lang.Object r8 = X.C203379ns.A03(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 19b -> 0x0266 }
            byte[] r8 = (byte[]) r8     // Catch:{ 19b -> 0x0266 }
            java.lang.String r11 = "ed_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r11, r1}     // Catch:{ 19b -> 0x0266 }
            r20 = 0
            java.lang.Object r12 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0266 }
            byte[] r12 = (byte[]) r12     // Catch:{ 19b -> 0x0266 }
            r11 = 10
            X.7sk r13 = new X.7sk     // Catch:{ 19b -> 0x0266 }
            r13.<init>(r10, r11)     // Catch:{ 19b -> 0x0266 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ 19b -> 0x0266 }
            X.C203539oF.A06(r14, r13, r1)     // Catch:{ 19b -> 0x0266 }
            X.6yS r10 = X.C148186yS.A00     // Catch:{ 19b -> 0x0266 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ 19b -> 0x0266 }
            X.AnonymousClass00C.A0D(r14, r7)     // Catch:{ 19b -> 0x0266 }
            X.C203539oF.A06(r14, r10, r1)     // Catch:{ 19b -> 0x01ca }
        L_0x01ca:
            boolean r1 = X.C132936Vw.A01(r2, r5)     // Catch:{ 19b -> 0x0266 }
            r5 = 2
            if (r1 != 0) goto L_0x01e0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/hk_pub cannot be verified with hk_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "hk_pub cannot be verified with hk_key_signature"
            r0.BWq(r1, r5, r9)     // Catch:{ 19b -> 0x0266 }
            return
        L_0x01e0:
            boolean r1 = X.C132936Vw.A01(r4, r6)     // Catch:{ 19b -> 0x0266 }
            if (r1 != 0) goto L_0x01f5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/ok_pub cannot be verified with ok_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "ok_pub cannot be verified with ok_key_signature"
            r0.BWq(r1, r5, r9)     // Catch:{ 19b -> 0x0266 }
            return
        L_0x01f5:
            boolean r1 = X.C132936Vw.A01(r8, r12)     // Catch:{ 19b -> 0x0266 }
            if (r1 != 0) goto L_0x020a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/ed_pub cannot be verified with ed_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = "ed_pub cannot be verified with ed_key_signature"
            r0.BWq(r1, r5, r9)     // Catch:{ 19b -> 0x0266 }
            return
        L_0x020a:
            X.1Cm r1 = r0.A00     // Catch:{ 19b -> 0x0266 }
            r1.A01()     // Catch:{ 19b -> 0x0266 }
            java.lang.String r1 = r0.A0C     // Catch:{ 19b -> 0x0266 }
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r11, r1, r4)     // Catch:{ 19b -> 0x0266 }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ 19b -> 0x0266 }
            X.5ma r6 = new X.5ma     // Catch:{ 19b -> 0x0266 }
            r6.<init>(r1)     // Catch:{ 19b -> 0x0266 }
            com.facebook.simplejni.NativeHolder r3 = r6.A00     // Catch:{ 19b -> 0x0266 }
            r1 = 30
            java.lang.Object r3 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r1, r3)     // Catch:{ 19b -> 0x0266 }
            com.facebook.simplejni.NativeHolder r3 = (com.facebook.simplejni.NativeHolder) r3     // Catch:{ 19b -> 0x0266 }
            X.5mZ r1 = new X.5mZ     // Catch:{ 19b -> 0x0266 }
            r1.<init>(r3)     // Catch:{ 19b -> 0x0266 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 19b -> 0x0266 }
            com.facebook.simplejni.NativeHolder r10 = r1.A00     // Catch:{ 19b -> 0x0266 }
            r1 = 100
            long r3 = (long) r1     // Catch:{ 19b -> 0x0266 }
            r1 = 1
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r1, r3, r10)     // Catch:{ 19b -> 0x0266 }
            int r1 = (int) r3     // Catch:{ 19b -> 0x0266 }
            r5 = 1
            if (r1 == 0) goto L_0x0245
            X.5kk r1 = r0.A08     // Catch:{ 19b -> 0x0266 }
            r2 = 4
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r1.A00     // Catch:{ 19b -> 0x0266 }
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A01(r1, r2)     // Catch:{ 19b -> 0x0266 }
            return
        L_0x0245:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 19b -> 0x0266 }
            r1 = 101(0x65, float:1.42E-43)
            long r3 = (long) r1     // Catch:{ 19b -> 0x0266 }
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r7, r3, r10)     // Catch:{ 19b -> 0x0266 }
            byte[] r1 = (byte[]) r1     // Catch:{ 19b -> 0x0266 }
            java.lang.Object r3 = r0.A0B     // Catch:{ 19b -> 0x0266 }
            monitor-enter(r3)     // Catch:{ 19b -> 0x0266 }
            r0.A01 = r6     // Catch:{ all -> 0x0263 }
            r0.A05 = r2     // Catch:{ all -> 0x0263 }
            r0.A03 = r8     // Catch:{ all -> 0x0263 }
            r0.A06 = r1     // Catch:{ all -> 0x0263 }
            r0.A00 = r5     // Catch:{ all -> 0x0263 }
            monitor-exit(r3)     // Catch:{ all -> 0x0263 }
            r0.A02()     // Catch:{ 19b -> 0x0266 }
            return
        L_0x0263:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0263 }
            throw r1     // Catch:{ 19b -> 0x0266 }
        L_0x0266:
            r2 = move-exception
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r1, r2)
            r2 = 1
            java.lang.String r1 = "invalid server response"
            r0.BWq(r1, r2, r9)
            return
        L_0x0273:
            java.lang.Object r6 = r0.A02
            X.33b r6 = (X.C592133b) r6
            java.lang.Object r5 = r0.A01
            X.4xp r5 = (X.C101514xp) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess id="
            X.C36321k7.A1Q(r0, r3, r1)
            r4 = -1
            r2 = 1
            X.9nx r1 = X.C90514aH.A0e(r14, r6)     // Catch:{ 19b -> 0x02da }
            r0 = 8
            X.C165017sk.A00(r1, r14, r0)     // Catch:{ 19b -> 0x02da }
            java.lang.String r0 = "success"
            java.lang.String[] r16 = new java.lang.String[]{r0}     // Catch:{ 19b -> 0x02da }
            X.6yO r15 = X.C148146yO.A00     // Catch:{ 19b -> 0x02da }
            r17 = 1
            r19 = 1
            X.C203379ns.A0C(r14, r15, r16, r17, r19)     // Catch:{ 19b -> 0x02da }
            X.9nx r0 = r14.A0c(r0)     // Catch:{ 19b -> 0x02da }
            if (r0 != 0) goto L_0x02b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x02da }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess was empty id="
            X.C36321k7.A1P(r0, r3, r1)     // Catch:{ 19b -> 0x02da }
            java.lang.String r0 = "success was empty"
            r5.BWq(r0, r2, r4)     // Catch:{ 19b -> 0x02da }
            return
        L_0x02b3:
            X.1Cm r0 = r5.A00     // Catch:{ 19b -> 0x02da }
            r0.A01()     // Catch:{ 19b -> 0x02da }
            X.0v0 r6 = r5.A09     // Catch:{ 19b -> 0x02da }
            r6.A1z(r2)     // Catch:{ 19b -> 0x02da }
            r3 = 0
            r6.A20(r3)     // Catch:{ 19b -> 0x02da }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)     // Catch:{ 19b -> 0x02da }
            java.lang.String r0 = "encrypted_backup_fleet_migration_state"
            X.C36341k9.A0v(r1, r0, r3)     // Catch:{ 19b -> 0x02da }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)     // Catch:{ 19b -> 0x02da }
            java.lang.String r0 = "encrypted_backup_show_forced_reg_after_logout"
            X.C36331k8.A0w(r1, r0, r3)     // Catch:{ 19b -> 0x02da }
            X.0wU r1 = r5.A01     // Catch:{ 19b -> 0x02da }
            r0 = 3
            X.C1497072l.A00(r1, r5, r0)     // Catch:{ 19b -> 0x02da }
            return
        L_0x02da:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "invalid server response"
            r5.BWq(r0, r2, r4)
            return
        L_0x02e6:
            java.lang.Object r4 = r0.A02
            X.33b r4 = (X.C592133b) r4
            java.lang.Object r0 = r0.A01
            X.4xo r0 = (X.C101504xo) r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess id="
            X.C36321k7.A1Q(r1, r3, r2)
            r11 = -1
            r18 = 0
            X.9nx r6 = X.C90514aH.A0e(r14, r4)     // Catch:{ 19b -> 0x0467 }
            java.lang.String r2 = "hk_pub"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r19 = new java.lang.String[]{r2, r1}     // Catch:{ 19b -> 0x0467 }
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.Long r16 = X.C90474aD.A0Y()     // Catch:{ 19b -> 0x0467 }
            r4 = 1024(0x400, double:5.06E-321)
            java.lang.Long r17 = java.lang.Long.valueOf(r4)     // Catch:{ 19b -> 0x0467 }
            r5 = 0
            r20 = 0
            java.lang.Object r10 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0467 }
            byte[] r10 = (byte[]) r10     // Catch:{ 19b -> 0x0467 }
            java.lang.String r2 = "hk_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r2, r1}     // Catch:{ 19b -> 0x0467 }
            r7 = 384(0x180, double:1.897E-321)
            java.lang.Long r16 = java.lang.Long.valueOf(r7)     // Catch:{ 19b -> 0x0467 }
            r17 = r16
            java.lang.Object r9 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0467 }
            byte[] r9 = (byte[]) r9     // Catch:{ 19b -> 0x0467 }
            java.lang.String r2 = "ok_pub"
            java.lang.String[] r24 = new java.lang.String[]{r2, r1}     // Catch:{ 19b -> 0x0467 }
            r7 = 32
            java.lang.Long r21 = java.lang.Long.valueOf(r7)     // Catch:{ 19b -> 0x0467 }
            r25 = 0
            r19 = r14
            r20 = r15
            r22 = r21
            r23 = r18
            java.lang.Object r2 = X.C203379ns.A03(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 19b -> 0x0467 }
            byte[] r2 = (byte[]) r2     // Catch:{ 19b -> 0x0467 }
            java.lang.String r4 = "ok_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r4, r1}     // Catch:{ 19b -> 0x0467 }
            r20 = 0
            java.lang.Object r8 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0467 }
            byte[] r8 = (byte[]) r8     // Catch:{ 19b -> 0x0467 }
            java.lang.String r4 = "ed_pub"
            java.lang.String[] r24 = new java.lang.String[]{r4, r1}     // Catch:{ 19b -> 0x0467 }
            r19 = r14
            r20 = r15
            java.lang.Object r4 = X.C203379ns.A03(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 19b -> 0x0467 }
            byte[] r4 = (byte[]) r4     // Catch:{ 19b -> 0x0467 }
            java.lang.String r7 = "ed_key_signature"
            java.lang.String[] r19 = new java.lang.String[]{r7, r1}     // Catch:{ 19b -> 0x0467 }
            r20 = 0
            java.lang.Object r1 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0467 }
            byte[] r1 = (byte[]) r1     // Catch:{ 19b -> 0x0467 }
            java.lang.String r12 = "count"
            java.lang.String r7 = "value"
            java.lang.String[] r19 = new java.lang.String[]{r12, r7}     // Catch:{ 19b -> 0x0467 }
            java.lang.Class<java.lang.Long> r15 = java.lang.Long.class
            java.lang.Long r16 = X.C36411kG.A0t()     // Catch:{ 19b -> 0x0467 }
            r12 = 128(0x80, double:6.32E-322)
            java.lang.Long r17 = java.lang.Long.valueOf(r12)     // Catch:{ 19b -> 0x0467 }
            java.lang.Object r12 = X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 19b -> 0x0467 }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ 19b -> 0x0467 }
            r13 = 9
            X.7sk r7 = new X.7sk     // Catch:{ 19b -> 0x0467 }
            r7.<init>(r6, r13)     // Catch:{ 19b -> 0x0467 }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 19b -> 0x0467 }
            X.C203539oF.A06(r14, r7, r6)     // Catch:{ 19b -> 0x0467 }
            X.6yP r7 = X.C148156yP.A00     // Catch:{ 19b -> 0x0467 }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 19b -> 0x0467 }
            X.C203539oF.A06(r14, r7, r6)     // Catch:{ 19b -> 0x0467 }
            X.6yQ r7 = X.C148166yQ.A00     // Catch:{ 19b -> 0x0467 }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 19b -> 0x0467 }
            X.AnonymousClass00C.A0D(r14, r5)     // Catch:{ 19b -> 0x0467 }
            X.C203539oF.A06(r14, r7, r6)     // Catch:{ 19b -> 0x03ae }
        L_0x03ae:
            java.lang.String r6 = "backoff"
            java.lang.String[] r7 = new java.lang.String[]{r6}     // Catch:{ 19b -> 0x0467 }
            X.6yR r6 = X.C148176yR.A00     // Catch:{ 19b -> 0x0467 }
            X.C203379ns.A02(r14, r6, r7)     // Catch:{ 19b -> 0x0467 }
            long r6 = r12.longValue()     // Catch:{ 19b -> 0x0467 }
            boolean r12 = X.C132936Vw.A01(r2, r8)     // Catch:{ 19b -> 0x0467 }
            r8 = 2
            if (r12 != 0) goto L_0x03d3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/ok_pub cannot be verified with ok_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "ok_pub cannot be verified with ok_key_signature"
            r0.BWq(r1, r8, r11)     // Catch:{ 19b -> 0x0467 }
            return
        L_0x03d3:
            boolean r9 = X.C132936Vw.A01(r10, r9)     // Catch:{ 19b -> 0x0467 }
            if (r9 != 0) goto L_0x03e8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/hk_pub cannot be verified with hk_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "hk_pub cannot be verified with hk_key_signature"
            r0.BWq(r1, r8, r11)     // Catch:{ 19b -> 0x0467 }
            return
        L_0x03e8:
            boolean r1 = X.C132936Vw.A01(r4, r1)     // Catch:{ 19b -> 0x0467 }
            if (r1 != 0) goto L_0x03fd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/ed_pub cannot be verified with ed_key_signature id="
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "ed_pub cannot be verified with ed_key_signature"
            r0.BWq(r1, r8, r11)     // Catch:{ 19b -> 0x0467 }
            return
        L_0x03fd:
            int r3 = (int) r6     // Catch:{ 19b -> 0x0467 }
            X.1Cm r1 = r0.A00     // Catch:{ 19b -> 0x0467 }
            r1.A01()     // Catch:{ 19b -> 0x0467 }
            java.lang.String r6 = r0.A0C     // Catch:{ 19b -> 0x0467 }
            r1 = 11
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r1, r6, r2)     // Catch:{ 19b -> 0x0467 }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ 19b -> 0x0467 }
            X.5mX r7 = new X.5mX     // Catch:{ 19b -> 0x0467 }
            r7.<init>(r1)     // Catch:{ 19b -> 0x0467 }
            com.facebook.simplejni.NativeHolder r2 = r7.A00     // Catch:{ 19b -> 0x0467 }
            r1 = 31
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r1, r2)     // Catch:{ 19b -> 0x0467 }
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2     // Catch:{ 19b -> 0x0467 }
            X.5mW r1 = new X.5mW     // Catch:{ 19b -> 0x0467 }
            r1.<init>(r2)     // Catch:{ 19b -> 0x0467 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 19b -> 0x0467 }
            com.facebook.simplejni.NativeHolder r8 = r1.A00     // Catch:{ 19b -> 0x0467 }
            r1 = 90
            long r1 = (long) r1     // Catch:{ 19b -> 0x0467 }
            r6 = 1
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r6, r1, r8)     // Catch:{ 19b -> 0x0467 }
            int r6 = (int) r1     // Catch:{ 19b -> 0x0467 }
            if (r6 == 0) goto L_0x0445
            X.7ix r3 = r0.A08     // Catch:{ 19b -> 0x0467 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0467 }
            java.lang.String r1 = "WESOpaqueClientCreateLoginStart failed with WESOpaqueStatusType="
            java.lang.String r4 = X.AnonymousClass000.A0r(r1, r2, r6)     // Catch:{ 19b -> 0x0467 }
            r5 = 4
            r6 = 1
            r7 = -1
            r8 = -1
            r3.BWr(r4, r5, r6, r7, r8)     // Catch:{ 19b -> 0x0467 }
            return
        L_0x0445:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 19b -> 0x0467 }
            r1 = 91
            long r1 = (long) r1     // Catch:{ 19b -> 0x0467 }
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r5, r1, r8)     // Catch:{ 19b -> 0x0467 }
            byte[] r1 = (byte[]) r1     // Catch:{ 19b -> 0x0467 }
            java.lang.Object r2 = r0.A0B     // Catch:{ 19b -> 0x0467 }
            monitor-enter(r2)     // Catch:{ 19b -> 0x0467 }
            r0.A06 = r1     // Catch:{ all -> 0x0464 }
            r0.A05 = r4     // Catch:{ all -> 0x0464 }
            r0.A03 = r7     // Catch:{ all -> 0x0464 }
            r0.A01 = r3     // Catch:{ all -> 0x0464 }
            r1 = 1
            r0.A00 = r1     // Catch:{ all -> 0x0464 }
            monitor-exit(r2)     // Catch:{ all -> 0x0464 }
            r0.A02()     // Catch:{ 19b -> 0x0467 }
            return
        L_0x0464:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0464 }
            throw r1     // Catch:{ 19b -> 0x0467 }
        L_0x0467:
            r2 = move-exception
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r1, r2)
            r2 = 1
            java.lang.String r1 = "invalid server response"
            r0.BWq(r1, r2, r11)
            return
        L_0x0474:
            java.lang.Object r5 = r0.A02
            X.33b r5 = (X.C592133b) r5
            java.lang.Object r7 = r0.A01
            X.4xo r7 = (X.C101504xo) r7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            X.C36321k7.A1Q(r0, r3, r1)
            r4 = -1
            r2 = 1
            X.9nx r1 = X.C90514aH.A0e(r14, r5)     // Catch:{ 19b -> 0x04e0 }
            r0 = 7
            X.C165017sk.A00(r1, r14, r0)     // Catch:{ 19b -> 0x04e0 }
            java.lang.String r0 = "success"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ 19b -> 0x04e0 }
            X.6yM r0 = X.C148126yM.A00     // Catch:{ 19b -> 0x04e0 }
            java.lang.Object r5 = X.C203379ns.A02(r14, r0, r1)     // Catch:{ 19b -> 0x04e0 }
            X.1jK r5 = (X.C35831jK) r5     // Catch:{ 19b -> 0x04e0 }
            java.lang.String r0 = "count"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ 19b -> 0x04e0 }
            X.6yN r0 = X.C148136yN.A00     // Catch:{ 19b -> 0x04e0 }
            X.C203379ns.A02(r14, r0, r1)     // Catch:{ 19b -> 0x04e0 }
            if (r5 != 0) goto L_0x04b9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x04e0 }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess success was empty id="
            X.C36321k7.A1P(r0, r3, r1)     // Catch:{ 19b -> 0x04e0 }
            java.lang.String r0 = "success was empty"
            r7.BWq(r0, r2, r4)     // Catch:{ 19b -> 0x04e0 }
            return
        L_0x04b9:
            java.lang.Object r6 = r5.A00     // Catch:{ 19b -> 0x04e0 }
            X.1Cm r0 = r7.A00     // Catch:{ 19b -> 0x04e0 }
            r0.A01()     // Catch:{ 19b -> 0x04e0 }
            java.lang.String r0 = "encb/LoginUserHandler/finishLogin saving backup key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 19b -> 0x04e0 }
            java.lang.Object r1 = r7.A0B     // Catch:{ 19b -> 0x04e0 }
            monitor-enter(r1)     // Catch:{ 19b -> 0x04e0 }
            X.5mV r8 = r7.A02     // Catch:{ all -> 0x04dd }
            X.C18740tg.A06(r8)     // Catch:{ all -> 0x04dd }
            monitor-exit(r1)     // Catch:{ all -> 0x04dd }
            X.7ix r9 = r7.A08     // Catch:{ 19b -> 0x04e0 }
            X.0wU r0 = r7.A01     // Catch:{ 19b -> 0x04e0 }
            r10 = 10
            X.74x r5 = new X.74x     // Catch:{ 19b -> 0x04e0 }
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)     // Catch:{ 19b -> 0x04e0 }
            r0.Boy(r5)     // Catch:{ 19b -> 0x04e0 }
            return
        L_0x04dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04dd }
            throw r0     // Catch:{ 19b -> 0x04e0 }
        L_0x04e0:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "invalid server response"
            r7.BWq(r0, r2, r4)
            return
        L_0x04ec:
            java.lang.Object r4 = r0.A02
            X.33b r4 = (X.C592133b) r4
            java.lang.Object r2 = r0.A01
            X.7o3 r2 = (X.C162117o3) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess id="
            X.C36321k7.A1Q(r0, r3, r1)
            r1 = -1
            r0 = 1
            X.9nx r5 = X.C90514aH.A0e(r14, r4)     // Catch:{ 19b -> 0x052f }
            r4 = 6
            X.C165017sk.A00(r5, r14, r4)     // Catch:{ 19b -> 0x052f }
            java.lang.String r4 = "success"
            java.lang.String[] r16 = new java.lang.String[]{r4}     // Catch:{ 19b -> 0x052f }
            X.6yL r15 = X.C148116yL.A00     // Catch:{ 19b -> 0x052f }
            r17 = 1
            r19 = 1
            X.C203379ns.A0C(r14, r15, r16, r17, r19)     // Catch:{ 19b -> 0x052f }
            X.9nx r4 = r14.A0c(r4)     // Catch:{ 19b -> 0x052f }
            if (r4 != 0) goto L_0x052b
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x052f }
            java.lang.String r4 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess was empty id="
            X.C36321k7.A1P(r4, r3, r5)     // Catch:{ 19b -> 0x052f }
            java.lang.String r3 = "success was empty"
            r2.BWq(r3, r0, r1)     // Catch:{ 19b -> 0x052f }
            return
        L_0x052b:
            r2.onSuccess()     // Catch:{ 19b -> 0x052f }
            return
        L_0x052f:
            r4 = move-exception
            java.lang.String r3 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess/invalid server response"
            goto L_0x057a
        L_0x0533:
            java.lang.Object r4 = r0.A02
            X.33b r4 = (X.C592133b) r4
            java.lang.Object r2 = r0.A01
            X.7o4 r2 = (X.C162127o4) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess id="
            X.C36321k7.A1Q(r0, r3, r1)
            r1 = -1
            r0 = 1
            X.9nx r5 = X.C90514aH.A0e(r14, r4)     // Catch:{ 19b -> 0x0577 }
            r4 = 11
            X.C165017sk.A00(r5, r14, r4)     // Catch:{ 19b -> 0x0577 }
            java.lang.String r4 = "success"
            java.lang.String[] r16 = new java.lang.String[]{r4}     // Catch:{ 19b -> 0x0577 }
            X.6yT r15 = X.C148196yT.A00     // Catch:{ 19b -> 0x0577 }
            r17 = 1
            r19 = 1
            X.C203379ns.A0C(r14, r15, r16, r17, r19)     // Catch:{ 19b -> 0x0577 }
            X.9nx r4 = r14.A0c(r4)     // Catch:{ 19b -> 0x0577 }
            if (r4 != 0) goto L_0x0573
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0577 }
            java.lang.String r4 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess was empty id="
            X.C36321k7.A1P(r4, r3, r5)     // Catch:{ 19b -> 0x0577 }
            java.lang.String r3 = "success was empty"
            r2.BWq(r3, r0, r1)     // Catch:{ 19b -> 0x0577 }
            return
        L_0x0573:
            r2.onSuccess()     // Catch:{ 19b -> 0x0577 }
            return
        L_0x0577:
            r4 = move-exception
            java.lang.String r3 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess/invalid server response"
        L_0x057a:
            com.whatsapp.util.Log.e(r3, r4)
            java.lang.String r3 = "invalid server response"
            r2.BWq(r3, r0, r1)
            return
        L_0x0583:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "BizVNameXmppMethods/sendGetBizVNameCert/onSuccess; iq="
            X.C36321k7.A1Q(r1, r3, r2)
            java.lang.String r1 = "verified_name"
            X.9nx r6 = r14.A0c(r1)
            X.C18740tg.A06(r6)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r8 = r6.A0X(r2, r1)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            if (r8 != 0) goto L_0x05a5
            java.lang.Object r8 = r0.A01
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
        L_0x05a5:
            java.lang.String r1 = "v"
            r4 = 0
            java.lang.String r5 = r6.A0i(r1, r4)
            java.lang.String r1 = "verified_level"
            java.lang.String r3 = r6.A0i(r1, r4)
            r1 = 0
            java.lang.String r7 = "serial"
            long r13 = r6.A0V(r7, r1)
            java.lang.String r1 = "host_storage"
            java.lang.String r7 = r6.A0i(r1, r4)
            java.lang.String r1 = "actual_actors"
            java.lang.String r2 = r6.A0i(r1, r4)
            java.lang.String r1 = "privacy_mode_ts"
            java.lang.String r1 = r6.A0i(r1, r4)
            X.3ur r9 = new X.3ur
            r9.<init>((java.lang.String) r7, (java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0646
            if (r3 == 0) goto L_0x0646
            byte[] r11 = r6.A01
            java.lang.Object r10 = r0.A00
            X.65C r10 = (X.AnonymousClass65C) r10
            X.005 r1 = r10.A01
            r1.get()
            if (r11 == 0) goto L_0x061c
            X.4uB r1 = X.C99924uB.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            X.8Hz r2 = X.C170918Hz.A08(r1, r11)     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            X.4uB r2 = (X.C99924uB) r2     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            int r1 = r2.bitField0_     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            r1 = r1 & 1
            if (r1 == 0) goto L_0x061c
            X.AUx r1 = r2.details_     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            byte[] r2 = r1.A06()     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            X.8RK r1 = X.AnonymousClass8RK.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            X.8Hz r2 = X.C170918Hz.A08(r1, r2)     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            X.8RK r2 = (X.AnonymousClass8RK) r2     // Catch:{ 186 -> 0x0607, IllegalArgumentException -> 0x060e }
            if (r2 == 0) goto L_0x061c
            goto L_0x0625
        L_0x0607:
            r2 = move-exception
            java.lang.String r1 = "vname invalidproto:"
            com.whatsapp.util.Log.w(r1, r2)
            goto L_0x061c
        L_0x060e:
            r5 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "vname failed to get identity entry for jid = "
            java.lang.String r1 = X.AnonymousClass000.A0l(r4, r1, r2)
            com.whatsapp.util.Log.w(r1, r5)
        L_0x061c:
            java.lang.String r1 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, certblob is null."
            goto L_0x0621
        L_0x061f:
            java.lang.String r1 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, serial is not present in certblob"
        L_0x0621:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x062d
        L_0x0625:
            int r1 = r2.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x061f
            long r13 = r2.serial_
        L_0x062d:
            int r12 = X.C111485cM.A00(r3)
            java.lang.Object r7 = r0.A02
            X.4tL r7 = (X.C99424tL) r7
            X.005 r0 = r10.A02
            java.lang.Object r0 = r0.get()
            X.0wU r0 = (X.C19770wU) r0
            X.73w r6 = new X.73w
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.Boy(r6)
            return
        L_0x0646:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "BizVNameXmppMethods/unknown vname cert payload version or vlevel for jid:"
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = " v="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " vlevel="
            X.C36321k7.A1R(r1, r3, r2)
            java.lang.Object r0 = r0.A02
            X.8Hw r0 = (X.C170888Hw) r0
            r0.A04(r4)
            return
        L_0x0667:
            X.C36321k7.A0w(r3, r14)
            java.lang.String r1 = "privacy"
            X.9nx r2 = r14.A0d(r1)
            java.lang.String r1 = "list"
            java.util.List r1 = r2.A0j(r1)
            java.util.Iterator r13 = X.C90514aH.A14(r1)
            r8 = 0
            r10 = r8
            r11 = r8
        L_0x067d:
            r4 = 0
        L_0x067e:
            boolean r1 = r13.hasNext()
            r6 = 2
            r5 = 154475307(0x9351b2b, float:2.1799857E-33)
            if (r1 == 0) goto L_0x0715
            X.9nx r9 = X.C36431kI.A0s(r13)
            java.lang.String r1 = "user"
            java.util.List r1 = r9.A0j(r1)
            java.util.ArrayList r6 = X.C36411kG.A13(r1)
            java.util.Iterator r12 = r1.iterator()
        L_0x069a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x06b2
            X.9nx r7 = X.C36431kI.A0s(r12)
            java.lang.Class<X.11F> r2 = X.AnonymousClass11F.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r1 = r7.A0X(r2, r1)
            if (r1 == 0) goto L_0x069a
            r6.add(r1)
            goto L_0x069a
        L_0x06b2:
            java.lang.String r1 = "type"
            java.lang.String r7 = r9.A0i(r1, r8)
            java.lang.String r1 = "default"
            java.lang.String r2 = r9.A0i(r1, r8)
            java.lang.String r1 = "true"
            boolean r9 = r1.equals(r2)
            if (r7 == 0) goto L_0x06fe
            int r2 = r7.hashCode()
            r1 = -1653850041(0xffffffff9d6c4047, float:-3.126757E-21)
            if (r2 == r1) goto L_0x06f1
            r1 = -567451565(0xffffffffde2d6053, float:-3.12326916E18)
            if (r2 == r1) goto L_0x06e6
            r1 = 1333012765(0x4f74291d, float:4.0963351E9)
            if (r2 != r1) goto L_0x067e
            java.lang.String r1 = "blacklist"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x067e
            if (r9 == 0) goto L_0x06e4
            r4 = 2
        L_0x06e4:
            r11 = r6
            goto L_0x067e
        L_0x06e6:
            java.lang.String r1 = "contacts"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x067e
            if (r9 == 0) goto L_0x067e
            goto L_0x067d
        L_0x06f1:
            java.lang.String r1 = "whitelist"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x067e
            if (r9 == 0) goto L_0x06fc
            r4 = 1
        L_0x06fc:
            r10 = r6
            goto L_0x067e
        L_0x06fe:
            java.lang.Object r0 = r0.A02
            X.6Ki r0 = (X.C130256Ki) r0
            X.0ze r2 = r0.A03
            int r1 = r3.hashCode()
            r0 = 4158(0x103e, float:5.827E-42)
            r2.markerEnd(r5, r1, r0)
            java.lang.String r1 = "status list type is null"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0715:
            java.lang.Object r12 = r0.A01
            X.5qE r12 = (X.C119655qE) r12
            java.lang.String r9 = ","
            java.lang.String r13 = "null"
            if (r10 == 0) goto L_0x079d
            java.lang.String r1 = ""
            java.lang.String r7 = X.C007103b.A0Q(r9, r1, r1, r10, r8)
        L_0x0725:
            if (r11 == 0) goto L_0x072d
            java.lang.String r1 = ""
            java.lang.String r13 = X.C007103b.A0Q(r9, r1, r1, r11, r8)
        L_0x072d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "get status privacy job response distributionMode="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "; allowList="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = "; denyList="
            X.C36321k7.A1Q(r1, r13, r2)
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r2 = r12.A00
            X.16E r1 = r2.A00
            if (r1 == 0) goto L_0x077f
            boolean r1 = r1.A0H()
            if (r1 != 0) goto L_0x077f
            java.lang.String r1 = "save status privacy"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.16E r1 = r2.A00
            if (r1 == 0) goto L_0x077f
            X.12i r7 = r1.A04
            java.lang.String r2 = "status_distribution"
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r7.A04(r2, r1)
            java.lang.String r4 = ""
            if (r11 != 0) goto L_0x0794
            r2 = r4
        L_0x076b:
            java.lang.String r1 = "status_black_list"
            r7.A04(r1, r2)
            if (r10 == 0) goto L_0x077a
            java.lang.String[] r1 = X.AnonymousClass143.A0O(r10)
            java.lang.String r4 = android.text.TextUtils.join(r9, r1)
        L_0x077a:
            java.lang.String r1 = "status_white_list"
            r7.A04(r1, r4)
        L_0x077f:
            java.lang.Object r1 = r0.A00
            X.8Hw r1 = (X.C170888Hw) r1
            r1.A04(r8)
            java.lang.Object r0 = r0.A02
            X.6Ki r0 = (X.C130256Ki) r0
            X.0ze r1 = r0.A03
            int r0 = r3.hashCode()
            r1.markerEnd(r5, r0, r6)
            return
        L_0x0794:
            java.lang.String[] r1 = X.AnonymousClass143.A0O(r11)
            java.lang.String r2 = android.text.TextUtils.join(r9, r1)
            goto L_0x076b
        L_0x079d:
            r7 = r13
            goto L_0x0725
        L_0x079f:
            r1 = 1
            X.AnonymousClass00C.A0D(r14, r1)
            java.lang.String r1 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "paused_state"
            X.9nx r5 = r14.A0d(r1)
            java.lang.String r1 = "disclosure_id"
            X.9nx r1 = r14.A0d(r1)
            java.lang.String r3 = r1.A0e()
            java.lang.String r1 = "ttl"
            X.9nx r1 = r14.A0d(r1)
            java.lang.String r2 = r1.A0e()
            java.lang.String r1 = "df_token"
            X.9nx r1 = r14.A0d(r1)
            java.lang.String r7 = r1.A0e()
            if (r3 == 0) goto L_0x0830
            int r8 = java.lang.Integer.parseInt(r3)
        L_0x07d2:
            if (r2 == 0) goto L_0x082d
            long r9 = java.lang.Long.parseLong(r2)
        L_0x07d8:
            java.lang.String r1 = "is_paused"
            r4 = 0
            java.lang.String r1 = r5.A0i(r1, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r1)
            java.lang.String r1 = "ndc"
            java.lang.String r1 = r5.A0i(r1, r4)
            boolean r2 = java.lang.Boolean.parseBoolean(r1)
            java.lang.String r1 = "npr"
            java.lang.String r1 = r5.A0i(r1, r4)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            X.6Bj r6 = new X.6Bj
            r6.<init>(r3, r2, r1)
            if (r7 != 0) goto L_0x0800
            java.lang.String r7 = ""
        L_0x0800:
            X.6CY r5 = new X.6CY
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r7 = r0.A00
            X.5rQ r7 = (X.C120385rQ) r7
            X.5xT r8 = r7.A01
            X.005 r0 = r8.A04
            java.lang.Object r0 = r0.get()
            X.1UC r0 = (X.AnonymousClass1UC) r0
            java.lang.Boolean r0 = r0.A08()
            boolean r1 = X.C90494aF.A1Y(r0)
            X.6Bj r0 = r5.A02
            boolean r0 = r0.A00
            if (r1 == 0) goto L_0x083d
            if (r0 != 0) goto L_0x0855
            X.005 r0 = r8.A05
            java.lang.Object r1 = r0.get()
            X.1UC r1 = (X.AnonymousClass1UC) r1
            monitor-enter(r1)
            goto L_0x0832
        L_0x082d:
            r9 = 0
            goto L_0x07d8
        L_0x0830:
            r8 = 0
            goto L_0x07d2
        L_0x0832:
            android.content.SharedPreferences r0 = r1.A06()     // Catch:{ all -> 0x083a }
            X.C90504aG.A12(r0)     // Catch:{ all -> 0x083a }
            goto L_0x0854
        L_0x083a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x083d:
            if (r0 == 0) goto L_0x0855
            X.005 r0 = r8.A03
            java.lang.Object r2 = r0.get()
            X.6KN r2 = (X.AnonymousClass6KN) r2
            X.71Z r1 = new X.71Z
            r1.<init>(r8)
            X.6Ee r0 = X.C128936Ee.A00()
            X.AnonymousClass6KN.A00(r0, r1, r2)
            goto L_0x0855
        L_0x0854:
            monitor-exit(r1)
        L_0x0855:
            long r3 = r5.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            X.0wo r0 = r8.A00
            long r0 = X.C19970wo.A00(r0)
            long r3 = r3 + r0
            int r6 = r5.A00
            java.lang.String r5 = r5.A03
            X.0v0 r0 = r8.A01
            java.lang.String r2 = "pre_consent_bloks_integrity_disclosure_id"
            java.lang.String r1 = "pre_consent_bloks_integrity_timestamp"
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r1 = r0.putInt(r2, r6)
            java.lang.String r0 = "pre_consent_bloks_integrity_df_token"
            X.C36341k9.A0x(r1, r0, r5)
            X.62G r0 = r7.A00
            r0.A00(r6, r5)
            return
        L_0x0882:
            java.lang.String r1 = "ForceSuspendStateIqHelper/sendData:onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r0 = r0.A00
            X.7jx r0 = (X.C159807jx) r0
            r0.onSuccess()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165337tG.BiM(X.9nx, java.lang.String):void");
    }

    public static void A00(C203399nx r6, C186008vG r7, C118135nO r8) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            AnonymousClass5Pn r0 = new AnonymousClass5Pn(r6, r7);
            AnonymousClass62J r2 = r8.A00;
            String str = r0.A00;
            AnonymousClass00C.A08(str);
            String str2 = r0.A01;
            AnonymousClass00C.A08(str2);
            AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = r2.A00;
            accountLinkingWebAuthActivity.A07 = C36441kJ.A19(str, str2);
            AnonymousClass3GB r3 = r2.A01;
            r3.A00();
            accountLinkingWebAuthActivity.A05.Bp3(new C1498272x(r3, accountLinkingWebAuthActivity, 4));
        } catch (C235919b e) {
            A0I.add(C36331k8.A0i("GetNativeSSOLoginTokensResponseSuccess: ", AnonymousClass000.A0u(), e));
            try {
                C186278vh r1 = new C186278vh(r6, r7, 28);
                r8.A00.A00(new AnonymousClass5V6(r1.A00, ((C184838t5) r1.A01).A01));
            } catch (C235919b e2) {
                A0I.add(C36331k8.A0i("GetNativeSSOLoginTokensResponseError: ", AnonymousClass000.A0u(), e2));
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                throw new C235919b(AnonymousClass000.A0q(AnonymousClass14B.A07("\n", A0I), A0u));
            }
        }
    }

    public C165337tG(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }
}
