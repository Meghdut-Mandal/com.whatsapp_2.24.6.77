package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1D5;
import X.AnonymousClass1E9;
import X.AnonymousClass1GX;
import X.AnonymousClass1U4;
import X.AnonymousClass1X4;
import X.AnonymousClass3RK;
import X.C07700Yy;
import X.C1502274l;
import X.C1503374w;
import X.C177618e5;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20500xf;
import X.C20810yC;
import X.C228816i;
import X.C228916j;
import X.C229016k;
import X.C235618y;
import X.C25271Fq;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C56682wi;
import X.C63823Lo;
import X.C65013Qj;
import X.C65743Th;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public C228816i A00;
    public AnonymousClass185 A01;
    public C18820ts A02;
    public C20810yC A03;
    public C20500xf A04;
    public AnonymousClass1E9 A05;
    public AnonymousClass1X4 A06;
    public AnonymousClass16D A07;
    public C25271Fq A08;
    public AnonymousClass1D5 A09;
    public AnonymousClass1GX A0A;
    public final Handler A0B = C36341k9.A0H();

    public void performAction(Intent intent, boolean z, Bundle bundle) {
        StringBuilder A0u;
        Uri uri;
        String obj;
        if (!z) {
            obj = "VoiceMessagingService/ignoring unverified voice message";
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            AnonymousClass11F A0N = C36421kH.A0N(stringExtra);
            if ((A0N instanceof PhoneUserJid) || (A0N instanceof C177618e5) || AnonymousClass143.A0G(A0N)) {
                C20810yC r2 = this.A03;
                AnonymousClass185 r1 = this.A01;
                UserJid A0b = C36401kF.A0b(A0N);
                if (!C63823Lo.A01(r1, r2, this.A04, A0b)) {
                    if (!AnonymousClass3RK.A00(this.A01, (C235618y) null, this.A03, this.A04, A0b, this.A05)) {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            if (clipData.getItemCount() == 1) {
                                ClipData.Item itemAt = clipData.getItemAt(0);
                                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                    try {
                                        C65013Qj r4 = new C65013Qj();
                                        r4.A0I = this.A0A.A0h(uri);
                                        C36321k7.A1K(A0N, "VoiceMessagingService/sending verified voice message (voice); jid=", AnonymousClass000.A0u());
                                        this.A0B.post(new C1503374w(this, A0N, r4, 28));
                                        return;
                                    } catch (IOException e) {
                                        Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                                        return;
                                    }
                                }
                            } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                                A0u = AnonymousClass000.A0u();
                                A0u.append("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                                A0u.append(clipData.getItemCount());
                            }
                        }
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                        boolean isEmpty = TextUtils.isEmpty(stringExtra2);
                        A0u = AnonymousClass000.A0u();
                        if (isEmpty) {
                            A0u.append("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                            A0u.append(A0N);
                            A0u.append("; text=");
                            A0u.append(stringExtra2);
                        } else {
                            C36321k7.A1K(A0N, "VoiceMessagingService/sending verified voice message (text); jid=", A0u);
                            this.A0B.post(new C1502274l(this, A0N, stringExtra2, 9));
                            return;
                        }
                    }
                }
                C18740tg.A06(A0N);
                Uri A002 = AnonymousClass1U4.A00(this.A07.A0D(A0N));
                String str = C56682wi.A00;
                Intent A0F = AnonymousClass190.A0F(this, 0);
                A0F.setData(A002);
                A0F.setAction(str);
                A0F.addFlags(335544320);
                PendingIntent A003 = C65743Th.A00(this, 2, A0F.putExtra("fromNotification", true), 0);
                C07700Yy A0F2 = C36421kH.A0F(this);
                A0F2.A0L = "err";
                A0F2.A09 = 1;
                A0F2.A0I(true);
                A0F2.A06(4);
                A0F2.A0A = 0;
                A0F2.A0D = A003;
                A0F2.A0F(getString(R.string.f12nameremoved));
                A0F2.A0E(getString(R.string.f12nameremoved));
                C36361kB.A1A(A0F2);
                this.A08.A02(35, A0F2.A05());
                return;
            }
            A0u = AnonymousClass000.A0u();
            A0u.append("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=");
            A0u.append(stringExtra);
            obj = A0u.toString();
        }
        Log.w(obj);
    }

    public void attachBaseContext(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A03 = C36341k9.A0V(A0P);
        this.A06 = C36361kB.A0T(A0P);
        this.A04 = A0P.AzV();
        this.A09 = (AnonymousClass1D5) A0P.A4j.get();
        this.A07 = C36341k9.A0R(A0P);
        this.A0A = (AnonymousClass1GX) A0P.A4k.get();
        this.A02 = A0P.BxU();
        this.A05 = (AnonymousClass1E9) A0P.A8c.get();
        this.A01 = C36371kC.A0U(A0P);
        this.A08 = C36391kE.A0d(A0P);
        C228916j A0Z = C18830tt.A0Z(A0P.AfI.A00);
        this.A00 = A0Z;
        super.attachBaseContext(new C229016k(context, A0Z, this.A02));
    }

    public void postForegroundNotification() {
        C07700Yy A0F = C36421kH.A0F(this);
        A0F.A0F(getString(R.string.f12nameremoved));
        A0F.A0D = C65743Th.A00(this, 1, AnonymousClass190.A03(this), 0);
        A0F.A09 = -2;
        C36361kB.A1A(A0F);
        Notification A052 = A0F.A05();
        C36321k7.A1K(A052, "VoiceMessagingService/posting assistant notif:", AnonymousClass000.A0u());
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(19, A052, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        } else {
            startForeground(19, A052);
        }
    }
}
