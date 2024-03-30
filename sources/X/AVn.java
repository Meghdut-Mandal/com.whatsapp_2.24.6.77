package X;

import android.app.job.JobParameters;
import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.download.service.MediaDownloadJobService;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class AVn implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public AVn(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj3;
    }

    public final void run() {
        C207219uk BA8;
        C207089uX r0;
        switch (this.A05) {
            case 0:
                ((OutgoingSignalingHandler) this.A00).m7lambda$sendCallStanza$0$comwhatsappcallingserviceOutgoingSignalingHandler((Jid) this.A01, this.A03, this.A04, (VoipStanzaChildNode) this.A02);
                return;
            case 1:
                String str = this.A03;
                String str2 = this.A04;
                C20310xM r5 = (C20310xM) this.A01;
                AnonymousClass3T1 A032 = ((AnonymousClass1A1) this.A02).A03(C165617ti.A0R(C36421kH.A0N(str2), str, false));
                if (A032 != null && C61583Cq.A00(A032) != null) {
                    for (AnonymousClass3EY r02 : C61583Cq.A00(A032).A02) {
                        r02.A00 = true;
                    }
                } else if ((A032 instanceof C23043B1o) && (BA8 = ((C23043B1o) A032).BA8()) != null && BA8.A00 == 5 && (r0 = BA8.A04) != null) {
                    for (C206569tc r03 : r0.A03) {
                        r03.A00 = true;
                    }
                } else {
                    return;
                }
                r5.A0k(A032);
                return;
            case 2:
                String str3 = this.A03;
                MediaDownloadJobService.A03((JobParameters) this.A01, (MediaDownloadJobService) this.A00, str3, this.A04, (ArrayList) this.A02);
                return;
            case 3:
                ((DirectReplyService) this.A00).A06((AnonymousClass141) this.A02, (C71853hR) this.A01, this.A03, this.A04);
                return;
            default:
                AnonymousClass8gG r7 = (AnonymousClass8gG) this.A00;
                String str4 = this.A03;
                String str5 = this.A04;
                AnonymousClass9FK r8 = (AnonymousClass9FK) this.A02;
                AnonymousClass00C.A0D(r8, 4);
                AnonymousClass19A r10 = r7.A04;
                String A09 = r10.A09();
                C20810yC r1 = r7.A03;
                UserJid A002 = C111255bz.A00(r7.A02, r1, (UserJid) this.A01);
                if (A002 != null) {
                    AnonymousClass6QB A0T = C36421kH.A0T();
                    C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
                    C203539oF.A0E(A0T, A09);
                    AnonymousClass6QB A0a = C165587tf.A0a();
                    C36331k8.A1D(A0a, "action", "get-order-transaction");
                    C36351kA.A1I(A002, A0a, "receiver");
                    if (C203539oF.A0P(str5, 1, 100, false)) {
                        C36331k8.A1D(A0a, "order_id", str5);
                    }
                    if (C203539oF.A0P(str4, 1, 100, false)) {
                        C36331k8.A1D(A0a, "payment_config_id", str4);
                    }
                    r10.A0K(new B7O(r7.A01.A00, r7.A00, r7.A05, AnonymousClass9I1.A04(r7, "get-order-transaction"), r7, r8, r7.A07.A00("get-order-transaction")), C165567td.A0I(A0a, A0T), A09, 204, 0);
                    return;
                }
                Log.e("PAY: IndiaUpiP2mGetOrderTransactionAction/getOrderTransaction: lidCompatibleJid is null");
                r8.A00.Bnv();
                return;
        }
    }
}
