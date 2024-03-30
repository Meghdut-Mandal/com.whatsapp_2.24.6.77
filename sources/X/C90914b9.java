package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.whatsapp.R;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4b9  reason: invalid class name and case insensitive filesystem */
public class C90914b9 extends BroadcastReceiver {
    public boolean A00;
    public final Object A01;
    public final C19420v0 A02;
    public final WeakReference A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        SmsMessage smsMessage;
        String str;
        if (!this.A04) {
            synchronized (this.A01) {
                if (!this.A04) {
                    C56042vd.A01(context);
                    this.A04 = true;
                }
            }
        }
        Log.i("receivedtextreceiver/text/intent");
        if (this.A00) {
            str = "receivedtextreceiver/already received";
        } else {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
            if (verifyPhoneNumber == null) {
                str = "receivedtextreceiver/activity is null";
            } else if (verifyPhoneNumber.BLh()) {
                str = "receivedtextreceiver/destroyed";
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = "receivedtextreceiver/bundle-null";
                } else {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr == null) {
                        str = "receivedtextreceiver/pdus-null";
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("receivedtextreceiver/pdus-length/");
                        C36321k7.A1Y(A0u, r5);
                        String string = verifyPhoneNumber.getString(R.string.f12nameremoved);
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("(?:WhatsApp|");
                        A0u2.append(Pattern.quote(string));
                        Pattern compile = Pattern.compile(AnonymousClass000.A0q(").*?([0-9]{3})-([0-9]{3})", A0u2));
                        for (Object obj : objArr) {
                            String str2 = null;
                            try {
                                if (C19550w8.A01()) {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj, extras.getString("format"));
                                } else {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj);
                                }
                                if (smsMessage != null) {
                                    try {
                                        str2 = smsMessage.getMessageBody();
                                        C36321k7.A1Q("verifysms/getMessageBody ", str2, AnonymousClass000.A0u());
                                        StringBuilder A0u3 = AnonymousClass000.A0u();
                                        A0u3.append("verifysms/displayMessageBody ");
                                        C36321k7.A1a(A0u3, smsMessage.getDisplayMessageBody());
                                        StringBuilder A0u4 = AnonymousClass000.A0u();
                                        A0u4.append("verifysms/displayOriginatingAddress ");
                                        C36321k7.A1a(A0u4, smsMessage.getDisplayOriginatingAddress());
                                        StringBuilder A0u5 = AnonymousClass000.A0u();
                                        A0u5.append("verifysms/emailBody ");
                                        C36321k7.A1a(A0u5, smsMessage.getEmailBody());
                                        StringBuilder A0u6 = AnonymousClass000.A0u();
                                        A0u6.append("verifysms/emailFrom ");
                                        C36321k7.A1a(A0u6, smsMessage.getEmailFrom());
                                        StringBuilder A0u7 = AnonymousClass000.A0u();
                                        A0u7.append("verifysms/getOriginatingAddress ");
                                        C36321k7.A1a(A0u7, smsMessage.getOriginatingAddress());
                                        StringBuilder A0u8 = AnonymousClass000.A0u();
                                        A0u8.append("verifysms/getPseudoSubject ");
                                        C36321k7.A1a(A0u8, smsMessage.getPseudoSubject());
                                        StringBuilder A0u9 = AnonymousClass000.A0u();
                                        A0u9.append("verifysms/getServiceCenterAddress ");
                                        C36321k7.A1a(A0u9, smsMessage.getServiceCenterAddress());
                                    } catch (NullPointerException e) {
                                        Log.e("verifysms", e);
                                    }
                                    if (str2 == null) {
                                        Log.i("receivedtextreceiver/message-null");
                                    } else {
                                        C36321k7.A1Q("verifysms/text-receiver/", str2, AnonymousClass000.A0u());
                                        Matcher matcher = compile.matcher(str2);
                                        if (matcher.find()) {
                                            StringBuilder A0u10 = AnonymousClass000.A0u();
                                            A0u10.append(matcher.group(1));
                                            String A0q = AnonymousClass000.A0q(matcher.group(2), A0u10);
                                            if (A0q != null) {
                                                if (AnonymousClass6R8.A00(A0q, -1) != -1) {
                                                    this.A00 = true;
                                                    abortBroadcast();
                                                    verifyPhoneNumber.A3m(A0q);
                                                } else {
                                                    Log.w("verifysms/text-receiver/no-code");
                                                    C65983Uf.A0Q(this.A02, "server-send-mismatch-empty");
                                                }
                                            }
                                        }
                                        Log.w("verifysms/text-receiver/not_sms_verification");
                                    }
                                }
                            } catch (OutOfMemoryError e2) {
                                Log.e("verifysms/text/out-of-memory ", e2);
                            }
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str);
    }

    public C90914b9(C19420v0 r2, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        this.A03 = AnonymousClass001.A0F(verifyPhoneNumber);
        this.A02 = r2;
    }

    public C90914b9() {
        this.A04 = false;
        this.A01 = C36441kJ.A11();
    }
}
