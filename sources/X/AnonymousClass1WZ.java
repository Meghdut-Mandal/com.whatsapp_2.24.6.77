package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1WZ  reason: invalid class name */
public class AnonymousClass1WZ {
    public final /* synthetic */ AnonymousClass1WX A00;

    public AnonymousClass1WZ(AnonymousClass1WX r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass3T1 r6, int i) {
        C64933Qa r4 = r6.A1J;
        this.A00.A00.A04(C203719oc.A05(r6, i), r6.A1Q);
        StringBuilder sb = new StringBuilder();
        sb.append("WriterThread/write/message-received; message.key=");
        sb.append(r4);
        Log.i(sb.toString());
    }

    public void A01(C203399nx r5, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("loggableStanzaId=");
        sb.append(j);
        sb.append(", id=");
        sb.append(r5.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
        String obj = sb.toString();
        this.A00.A00.A04(r5, j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WriterThread/write/type=");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(obj);
        Log.i(sb2.toString());
    }

    public void A02(C207209uj r5) {
        this.A00.A00.A04(C203719oc.A06(r5.A01(), r5), r5.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("WriterThread/write/send-stanza-received; stanzaKey=");
        sb.append(r5);
        Log.i(sb.toString());
    }

    public void A03(C207209uj r7, boolean z) {
        C200139gg r4 = this.A00.A00;
        C203399nx r5 = null;
        if (z) {
            r5 = new C203399nx("features", new AnonymousClass1AL[]{new AnonymousClass1AL("readreceipts", "disable")}, (C203399nx[]) null);
        }
        r4.A04(C203719oc.A06(r5, r7), r7.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("WriterThread/write/read-receipt-received; stanzaKey=");
        sb.append(r7);
        sb.append("; disable=");
        sb.append(z);
        Log.i(sb.toString());
    }
}
