package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.R;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4bA  reason: invalid class name and case insensitive filesystem */
public final class C90924bA extends BroadcastReceiver {
    public boolean A00;
    public final C19420v0 A01;
    public final Object A02;
    public final WeakReference A03;
    public volatile boolean A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C90924bA(C19420v0 r2, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r2;
        this.A03 = AnonymousClass001.A0F(verifyPhoneNumber);
    }

    public void onReceive(Context context, Intent intent) {
        SharedPreferences.Editor editor;
        String A0q;
        String str;
        String str2;
        if (!this.A04) {
            synchronized (this.A02) {
                if (!this.A04) {
                    C56042vd.A01(context);
                    this.A04 = true;
                }
            }
        }
        boolean A1a = C36341k9.A1a(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Log.i("SMSRetrieverReceiver/onReceive/text/intent");
            if (this.A00) {
                str2 = "SMSRetrieverReceiver/onReceive/already received";
            } else {
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
                if (verifyPhoneNumber == null) {
                    str2 = "SMSRetrieverReceiver/onReceive/activity is null";
                } else if (verifyPhoneNumber.BLh()) {
                    str2 = "SMSRetrieverReceiver/onReceive/destroyed";
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        str = "SMSRetrieverReceiver/onReceive/bundle-null";
                    } else {
                        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        if (status == null) {
                            str = "SMSRetrieverReceiver/onReceive/status-null";
                        } else {
                            int i = status.A01;
                            if (i == 0) {
                                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                if (string == null) {
                                    C65983Uf.A0Q(this.A01, "null-sms-message");
                                    return;
                                }
                                String string2 = verifyPhoneNumber.getString(R.string.f12nameremoved);
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("(?:WhatsApp|");
                                A0u.append(Pattern.quote(string2));
                                Matcher matcher = Pattern.compile(AnonymousClass000.A0q(").*?([0-9]{3})-([0-9]{3})", A0u)).matcher(string);
                                if (!matcher.find()) {
                                    A0q = null;
                                } else {
                                    StringBuilder A0u2 = AnonymousClass000.A0u();
                                    A0u2.append(matcher.group(A1a ? 1 : 0));
                                    A0q = AnonymousClass000.A0q(matcher.group(2), A0u2);
                                }
                                if (AnonymousClass6R8.A00(A0q, -1) != -1) {
                                    this.A00 = A1a;
                                    verifyPhoneNumber.A3m(A0q);
                                } else {
                                    Log.w("SMSRetrieverReceiver/onReceive/no-code");
                                    C65983Uf.A0Q(this.A01, "server-send-mismatch-empty");
                                }
                                editor = C19420v0.A00(this.A01).putInt("sms_retriever_retry_count", 0);
                            } else if (i == 15) {
                                C19420v0 r5 = this.A01;
                                int i2 = C36341k9.A0E(r5).getInt("sms_retriever_retry_count", 0);
                                if (i2 < 2) {
                                    zzw A042 = new AnonymousClass0JK((Activity) verifyPhoneNumber).A04();
                                    A042.addOnSuccessListener(new C109305Xb(new AnonymousClass7UP(this, i2), 1));
                                    A042.addOnFailureListener(new C164277rY(this, 3));
                                    return;
                                }
                                C65983Uf.A0Q(r5, "timeout-waiting-for-sms");
                                editor = C19420v0.A00(r5).putInt("sms_retriever_retry_count", 0);
                            } else {
                                return;
                            }
                            editor.apply();
                            return;
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            Log.i(str2);
        }
    }

    public C90924bA() {
        this.A04 = false;
        this.A02 = C36441kJ.A11();
    }
}
