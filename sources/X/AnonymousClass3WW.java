package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3WW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WW implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ C27821Py A00;

    public /* synthetic */ AnonymousClass3WW(C27821Py r1) {
        this.A00 = r1;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        C27821Py r9 = this.A00;
        Log.i("NfcChatHandlerImpl/onActivityCreated/createndef");
        NdefRecord[] ndefRecordArr = new NdefRecord[2];
        AnonymousClass00T r6 = r9.A03;
        byte[] A1Z = C36371kC.A1Z("application/com.whatsapp.chat", (Charset) C36381kD.A0p(r6));
        C19730wQ r8 = r9.A00;
        byte[] A1Z2 = C36371kC.A1Z(C36371kC.A0e(r8).getRawString(), (Charset) C36381kD.A0p(r6));
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("jid", C36371kC.A0e(r8).getRawString());
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, C237919w.A00(r8, r9.A01));
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r8.A0A.A02());
        } catch (JSONException e) {
            Log.e("NfcChatHandlerImpl/createNdefRecordPayload", e);
        }
        ndefRecordArr[0] = new NdefRecord(2, A1Z, A1Z2, C36371kC.A1Z(C36381kD.A0y(A1B), (Charset) C36381kD.A0p(r6)));
        NdefRecord createApplicationRecord = NdefRecord.createApplicationRecord("com.whatsapp");
        AnonymousClass00C.A08(createApplicationRecord);
        ndefRecordArr[1] = createApplicationRecord;
        return new NdefMessage(ndefRecordArr);
    }
}
