package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0um  reason: invalid class name and case insensitive filesystem */
public final class C19340um extends C19330ul {
    public final /* synthetic */ C19320uk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19340um(Looper looper, C19320uk r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        String str;
        Bundle bundle;
        String str2;
        String str3;
        String valueOf;
        String str4;
        String str5;
        String str6;
        C19320uk r4 = this.A00;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new AnonymousClass5RN());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C134506b9) {
                        r4.A01 = (C134506b9) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        r4.A00 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    str2 = "FirebaseInstanceId";
                    if (Log.isLoggable(str2, 3)) {
                        str3 = "Unexpected response action: ";
                        valueOf = String.valueOf(action);
                    } else {
                        return;
                    }
                } else {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf2 = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf2);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf3 = String.valueOf(stringExtra2);
                            if (valueOf3.length() != 0) {
                                str5 = "Received InstanceID error ".concat(valueOf3);
                            } else {
                                str5 = new String("Received InstanceID error ");
                            }
                            Log.d("FirebaseInstanceId", str5);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf4 = String.valueOf(stringExtra2);
                                if (valueOf4.length() != 0) {
                                    str4 = "Unexpected structured response ".concat(valueOf4);
                                } else {
                                    str4 = new String("Unexpected structured response ");
                                }
                                Log.w("FirebaseInstanceId", str4);
                                return;
                            }
                            str = split[2];
                            String str7 = split[3];
                            if (str7.startsWith(":")) {
                                str7 = str7.substring(1);
                            }
                            bundle = intent2.putExtra("error", str7).getExtras();
                        } else {
                            AnonymousClass007 r3 = r4.A04;
                            synchronized (r3) {
                                for (int i = 0; i < r3.size(); i++) {
                                    C19320uk.A01(intent2.getExtras(), r4, (String) r3.A04(i));
                                }
                            }
                            return;
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (!matcher.matches()) {
                            str2 = "FirebaseInstanceId";
                            if (Log.isLoggable(str2, 3)) {
                                str3 = "Unexpected response string: ";
                                valueOf = String.valueOf(stringExtra);
                            } else {
                                return;
                            }
                        } else {
                            str = matcher.group(1);
                            String group = matcher.group(2);
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                        }
                    }
                    C19320uk.A01(bundle, r4, str);
                    return;
                }
                if (valueOf.length() != 0) {
                    str6 = str3.concat(valueOf);
                } else {
                    str6 = new String(str3);
                }
                Log.d(str2, str6);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }
}
