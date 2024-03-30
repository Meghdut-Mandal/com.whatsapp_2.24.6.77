package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* renamed from: X.3WV  reason: invalid class name */
public class AnonymousClass3WV implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public AnonymousClass3WV(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A0D == null) {
            Log.w("idverification/createndef/no-fingerprint");
            return null;
        }
        return new NdefMessage(new NdefRecord[]{new NdefRecord(2, "application/com.whatsapp.identity".getBytes(Charset.forName("US-ASCII")), C36371kC.A0e(identityVerificationActivity.A02).getRawString().getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A0D.A02.A0o()), NdefRecord.createApplicationRecord("com.whatsapp")});
    }
}
