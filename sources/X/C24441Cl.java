package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Cl  reason: invalid class name and case insensitive filesystem */
public class C24441Cl {
    public static final byte[] A01 = {2};
    public static final byte[] A02 = {1};
    public final AnonymousClass19A A00;

    public static void A00(C203399nx r10, AnonymousClass7hQ r11, String str) {
        String str2;
        C203399nx A0c = r10.A0c("error");
        int i = -1;
        if (A0c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("encb/EncryptedBackupProtocolHelper/processError error node is empty, id=");
            sb.append(str);
            Log.e(sb.toString());
            str2 = "error node is empty";
        } else {
            String A0i = A0c.A0i("text", (String) null);
            if (A0i == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("encb/EncryptedBackupProtocolHelper/processError error text is empty, id=");
                sb2.append(str);
                Log.e(sb2.toString());
                str2 = "error text is empty";
            } else {
                String A0i2 = A0c.A0i("code", (String) null);
                if (A0i2 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("encb/EncryptedBackupProtocolHelper/processError error code is empty, id=");
                    sb3.append(str);
                    sb3.append(", text=");
                    sb3.append(A0i);
                    Log.e(sb3.toString());
                    str2 = "error code is empty";
                } else {
                    try {
                        int parseInt = Integer.parseInt(A0i2);
                        if (parseInt == 408) {
                            String A0i3 = A0c.A0i("backoff", (String) null);
                            if (A0i3 == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("encb/EncryptedBackupProtocolHelper/processError code=408 (request timeout) but backoff value is empty, id=");
                                sb4.append(str);
                                sb4.append(", code=");
                                sb4.append(parseInt);
                                sb4.append(", text=");
                                sb4.append(A0i);
                                Log.e(sb4.toString());
                                str2 = "timeout is empty";
                            } else {
                                try {
                                    i = Integer.parseInt(A0i3);
                                } catch (NumberFormatException unused) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("encb/EncryptedBackupProtocolHelper/processError timeout is not numerical, id=");
                                    sb5.append(str);
                                    sb5.append(", code=");
                                    sb5.append(parseInt);
                                    sb5.append(", text=");
                                    sb5.append(A0i);
                                    sb5.append(", timeout=");
                                    sb5.append(A0i3);
                                    Log.e(sb5.toString());
                                    str2 = "timeout is not numerical";
                                }
                            }
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("encb/EncryptedBackupProtocolHelper/processError id=");
                        sb6.append(str);
                        sb6.append(", code=");
                        sb6.append(parseInt);
                        sb6.append(", text=");
                        sb6.append(A0i);
                        sb6.append(", timeout=");
                        sb6.append(i);
                        Log.e(sb6.toString());
                        r11.BWq(A0i, parseInt, i);
                        return;
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("encb/EncryptedBackupProtocolHelper/processError error code is not numerical, id=");
                        sb7.append(str);
                        sb7.append(", text=");
                        sb7.append(A0i);
                        sb7.append(", errorCodeString=");
                        sb7.append(A0i2);
                        Log.e(sb7.toString());
                        str2 = "error code is not numerical";
                    }
                }
            }
        }
        r11.BWq(str2, 1, i);
    }

    public C24441Cl(AnonymousClass19A r1) {
        this.A00 = r1;
    }
}
