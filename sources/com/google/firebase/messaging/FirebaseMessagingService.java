package com.google.firebase.messaging;

import X.AnonymousClass001;
import X.AnonymousClass7cR;
import X.C132436Tp;
import X.C18960u7;
import X.C90464aC;
import X.C90474aD;
import X.C90494aF;
import X.C90734ag;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends C90734ag {
    public static final Queue A00 = new ArrayDeque(10);

    public static boolean A02(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static void A01(Intent intent, String str) {
        String str2;
        Bundle A07 = AnonymousClass001.A07();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A07.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A07.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A07.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A07.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A07.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A07.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A07.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() == null || !C132436Tp.A02(intent.getExtras())) {
                str2 = "data";
            } else {
                str2 = "display";
            }
            A07.putString("_nmc", str2);
        }
        if (C90494aF.A1a("FirebaseMessaging")) {
            String valueOf = String.valueOf(A07);
            StringBuilder A0i = C90464aC.A0i(valueOf, C90474aD.A05(str) + 22);
            A0i.append("Sending event=");
            A0i.append(str);
            C90464aC.A1G(" params=", valueOf, "FirebaseMessaging", A0i);
        }
        C18960u7 A002 = C18960u7.A00();
        C18960u7.A02(A002);
        A002.A02.A02(AnonymousClass7cR.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}
