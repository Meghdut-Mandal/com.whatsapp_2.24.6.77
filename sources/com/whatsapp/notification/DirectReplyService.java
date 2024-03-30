package com.whatsapp.notification;

import X.AVn;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0TA;
import X.AnonymousClass0TH;
import X.AnonymousClass0UA;
import X.AnonymousClass0VG;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass17Y;
import X.AnonymousClass1NM;
import X.AnonymousClass1U4;
import X.AnonymousClass1X4;
import X.AnonymousClass1Y3;
import X.AnonymousClass3T1;
import X.AnonymousClass3XT;
import X.AnonymousClass6YV;
import X.C07250Wx;
import X.C145166tS;
import X.C1502774q;
import X.C18740tg;
import X.C19890wg;
import X.C21060yb;
import X.C28361Si;
import X.C28981Uw;
import X.C34061gO;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C47172dd;
import X.C65743Th;
import X.C71853hR;
import X.C81123wV;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class DirectReplyService extends C47172dd {
    public AnonymousClass17Y A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass16D A02;
    public AnonymousClass1Y3 A03;
    public AnonymousClass1NM A04;
    public C21060yb A05;
    public AnonymousClass16J A06;
    public C28361Si A07;
    public C34061gO A08;
    public C19890wg A09;
    public boolean A0A = false;

    public DirectReplyService() {
        super("DirectReply");
    }

    public static C07250Wx A00(Context context, AnonymousClass141 r14, String str, int i, boolean z) {
        boolean equals = "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str);
        int i2 = R.string.f12nameremoved;
        if (equals) {
            i2 = R.string.f12nameremoved;
        }
        String string = context.getString(i2);
        AnonymousClass0TA r0 = new AnonymousClass0TA();
        r0.A00 = string;
        AnonymousClass0TH r7 = new AnonymousClass0TH(r0.A02, string, "direct_reply_input", r0.A03, r0.A01);
        Intent putExtra = new Intent(str, AnonymousClass1U4.A00(r14), context, DirectReplyService.class).putExtra("direct_reply_num_messages", i);
        CharSequence charSequence = r7.A01;
        int i3 = 134217728;
        C65743Th.A05(putExtra, 134217728);
        if (C65743Th.A02) {
            i3 = 167772160;
        }
        AnonymousClass0UA r1 = new AnonymousClass0UA(R.drawable.ic_action_reply, charSequence, PendingIntent.getService(context, 0, putExtra, i3));
        ArrayList arrayList = r1.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            r1.A01 = arrayList;
        }
        arrayList.add(r7);
        r1.A00 = 1;
        r1.A03 = false;
        r1.A02 = z;
        return r1.A00();
    }

    public static boolean A01() {
        return C36371kC.A1T(Build.VERSION.SDK_INT, 24);
    }

    public /* synthetic */ void A05(Intent intent, AnonymousClass141 r13, C71853hR r14, String str) {
        this.A06.unregisterObserver(r14);
        if (Build.VERSION.SDK_INT >= 28 && !"com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str)) {
            C28361Si r2 = this.A07;
            AnonymousClass11F A0j = C36351kA.A0j(r13);
            int intExtra = intent.getIntExtra("direct_reply_num_messages", 0);
            C36321k7.A1K(A0j, "messagenotification/posting reply update runnable for jid:", AnonymousClass000.A0u());
            Handler A042 = r2.A04();
            boolean z = true;
            if (!(A0j instanceof C28981Uw)) {
                z = false;
            }
            A042.post(r2.A06.A01(A0j, (AnonymousClass3T1) null, intExtra, true, true, false, true, z));
        }
    }

    public /* synthetic */ void A06(AnonymousClass141 r20, C71853hR r21, String str, String str2) {
        this.A06.registerObserver(r21);
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        AnonymousClass141 r9 = r20;
        this.A01.A0I((C145166tS) null, (AnonymousClass3XT) null, (AnonymousClass3T1) null, str, Collections.singletonList(r9.A06(cls)), (List) null, false, false);
        if ("com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str2)) {
            this.A08.A03();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        AnonymousClass1Y3 r1 = this.A03;
        AnonymousClass11F A0k = C36441kJ.A0k(r9, cls);
        if (i < 28) {
            r1.A01(A0k, 2, true, true);
            this.A07.A09();
            return;
        }
        r1.A01(A0k, 2, true, false);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }

    public void onHandleIntent(Intent intent) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("directreplyservice/intent: ");
        Intent intent2 = intent;
        A0u.append(intent2);
        A0u.append(" num_message:");
        C36321k7.A1Y(A0u, C36431kI.A02(intent2, "direct_reply_num_messages"));
        Bundle A012 = AnonymousClass0VG.A01(intent2);
        if (A012 == null) {
            str = "directreplyservice/could not find remote input";
        } else {
            String str2 = null;
            if (AnonymousClass1U4.A01(intent2.getData())) {
                AnonymousClass16D r2 = this.A02;
                Uri data = intent2.getData();
                C18740tg.A0B(AnonymousClass1U4.A01(data));
                AnonymousClass141 A052 = r2.A05(ContentUris.parseId(data));
                if (A052 != null) {
                    CharSequence charSequence = A012.getCharSequence("direct_reply_input");
                    if (charSequence != null) {
                        str2 = charSequence.toString().trim();
                    }
                    if (!AnonymousClass6YV.A0P(this.A05, this.A09, str2)) {
                        Log.i("directreplyservice/message is empty");
                        C81123wV.A00(this.A00, this, 36);
                        return;
                    }
                    String action = intent2.getAction();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    C71853hR r6 = new C71853hR(C36351kA.A0j(A052), countDownLatch);
                    this.A04.A0B(A052.A0H, 2);
                    this.A00.A0H(new AVn(this, r6, A052, str2, action, 3));
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        Log.e("Interrupted while waiting to add message", e);
                    }
                    this.A00.A0H(new C1502774q(this, r6, A052, intent2, action, 7));
                    return;
                }
            }
            str = "directreplyservice/contact could not be found";
        }
        Log.i(str);
    }
}
