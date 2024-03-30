package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1CZ  reason: invalid class name */
public class AnonymousClass1CZ {
    public final Map A00 = new HashMap();

    public void A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        C1261262q r1 = new C1261262q(bArr, bArr3, i);
        Map map = this.A00;
        map.put(new AnonymousClass66K(str, bArr2), r1);
        StringBuilder sb = new StringBuilder();
        sb.append("BackupCipherKeys/updateKeyForBackupFile v=");
        sb.append(str);
        Log.i(sb.toString());
        map.size();
    }
}
