package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Mc  reason: invalid class name and case insensitive filesystem */
public final class C26941Mc extends Handler implements C26931Mb {
    public final /* synthetic */ C20720y3 A00;

    public void BTq() {
        sendEmptyMessage(6);
    }

    public void BUL() {
        sendEmptyMessage(1);
    }

    public void BUO(C31901cZ r2) {
        obtainMessage(0, r2).sendToTarget();
    }

    public void BVq(boolean z) {
        obtainMessage(4, z ? 1 : 0, 0).sendToTarget();
    }

    public void BaN(AnonymousClass1WL r2) {
        obtainMessage(2, r2).sendToTarget();
    }

    public void Bgr() {
        sendEmptyMessage(7);
    }

    public void Bkn(Message message) {
        message.what = 5;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26941Mc(Looper looper, C20720y3 r2) {
        super(looper);
        this.A00 = r2;
    }

    public void BUK(Integer num, int i, boolean z, boolean z2) {
        obtainMessage(3, new AnonymousClass9MZ(this, num, i, z, z2)).sendToTarget();
    }

    public void BZM(String str) {
        obtainMessage(8, str).sendToTarget();
    }

    public void Be5() {
        sendEmptyMessage(9);
    }

    public void handleMessage(Message message) {
        C29501Ww r0;
        String str;
        AnonymousClass11F r5;
        AnonymousClass3A3 r02;
        int i;
        C19930wk r03;
        Runnable r8;
        C23046B1r b1r;
        Message message2 = message;
        boolean z = false;
        switch (message2.what) {
            case 0:
                C20720y3 r2 = this.A00;
                C31901cZ r3 = (C31901cZ) message2.obj;
                if (!r2.A12) {
                    Log.i("MessageHandler/handleSendingChannelReady/not started");
                    return;
                }
                r2.A07 = r3;
                AnonymousClass1MV r1 = r2.A0d;
                r1.A00 = r2;
                C26981Mg.A00(r1.A01, r1.A04.A00, new IntentFilter("com.whatsapp.MessageHandler.LOGOUT_ACTION"), (Handler) null, C19430v1.A0C, false);
                AnonymousClass19A r12 = r2.A0X;
                AnonymousClass612 r04 = new AnonymousClass612(r2);
                r12.A0D = r3;
                r12.A00 = r04;
                Log.i("MessageHandler/handleConnectionThreadReady connectionready");
                C26991Mh r52 = r2.A0Z;
                r2.A00 = r52.BAe();
                C26981Mg.A01(r2.A0E, r2.A0Q.A00, new IntentFilter("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"), false);
                HandlerThread handlerThread = new HandlerThread("MessageHandler Connectivity Handler");
                r2.A03 = handlerThread;
                handlerThread.start();
                r52.BuX(new Handler(r2.A03.getLooper()));
                C20720y3.A06(r2, true, false, false);
                AnonymousClass19J r13 = r2.A0H;
                r13.A06 = true;
                r13.A03 = -1;
                AnonymousClass1WP r05 = r2.A08;
                if (r05 != null) {
                    r05.A03();
                    return;
                }
                return;
            case 1:
                C20720y3 r14 = this.A00;
                AtomicBoolean atomicBoolean = C20720y3.A14;
                AnonymousClass19J r15 = r14.A08.A0B;
                r15.A04 = 1;
                r15.A00++;
                C18740tg.A01();
                for (C20420xX BYm : r15.getObservers()) {
                    BYm.BYm();
                }
                return;
            case 2:
                C20720y3 r4 = this.A00;
                AtomicBoolean atomicBoolean2 = C20720y3.A14;
                r4.A0g.set(false);
                AnonymousClass1WL r32 = (AnonymousClass1WL) message2.obj;
                synchronized (r4.A0f) {
                    int i2 = r32.type;
                    boolean z2 = false;
                    if (i2 == 4 || i2 == 6 || i2 == 8) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MessageHandler/login failed with reason: ");
                        sb.append(i2);
                        Log.w(sb.toString());
                        r4.A0B = true;
                        if (r32.type == 6) {
                            z2 = true;
                        }
                        C20720y3.A05(r4, z2);
                    } else {
                        AnonymousClass1WP r6 = r4.A08;
                        Context context = r6.A0K.A00;
                        C19460v5 r16 = r6.A00;
                        if (r16.A05()) {
                            AnonymousClass1ZY r53 = (AnonymousClass1ZY) r16.A02();
                            if (r53.A01.A00.A09(C21100yf.A0P)) {
                                AnonymousClass1VD r17 = r53.A02;
                                AnonymousClass1VD.A00(new C164607s5(r17, 0), r17);
                            }
                        }
                        int i3 = r32.type;
                        if (i3 != 0) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned");
                                    r6.A02.A0G();
                                    r6.A0s.A01();
                                    r6.A0j.A00(true);
                                    AnonymousClass1WP.A01(r6, r32);
                                    if (!r6.A06.A0L()) {
                                        AnonymousClass3KW r122 = (AnonymousClass3KW) r6.A0t.get();
                                        int i4 = r32.violationType;
                                        String str2 = r32.banAppealToken;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("banmanager/startPermanentBanFlow vt: ");
                                        sb2.append(i4);
                                        Log.i(sb2.toString());
                                        if (i4 > 0) {
                                            if (C20800yB.A01(C21000yV.A02, r122.A06, 622) && r122.A08.A03()) {
                                                AnonymousClass1RU r18 = r122.A02;
                                                Log.i("AccountSwitcher/updateBannedAccountSharedPrefs");
                                                C19730wQ r10 = r18.A05;
                                                if (r10.A08() != null) {
                                                    r10.A0G();
                                                    if (r10.A03 != null) {
                                                        C19420v0 r9 = r18.A09;
                                                        C223313w A08 = r10.A08();
                                                        String str3 = null;
                                                        if (A08 != null) {
                                                            str = A08.getRawString();
                                                        } else {
                                                            str = null;
                                                        }
                                                        C19420v0.A00(r9).putString("account_switching_banned_account_lid", str).apply();
                                                        r10.A0G();
                                                        PhoneUserJid phoneUserJid = r10.A03;
                                                        if (phoneUserJid != null) {
                                                            str3 = phoneUserJid.user;
                                                        }
                                                        C19420v0.A00(r9).putString("account_switching_banned_account_phone_user_jid", str3).apply();
                                                        C29501Ww r19 = r122.A07;
                                                        r19.A03();
                                                        C29501Ww.A02(r19, 9, true);
                                                        C19420v0 r54 = r122.A05;
                                                        C19420v0.A00(r54).putBoolean("support_ban_appeal_user_banned_from_chat_disconnect", true).apply();
                                                        C19420v0.A00(r54).putBoolean("support_ban_appeal_screen_before_verification", true).apply();
                                                        r122.A01.A02();
                                                        r122.A00.Bp3(new C80523vX(r122, context, str2, i4, 11));
                                                        r4.A0V.A00(true);
                                                        r4.A0W.A01(r32);
                                                        C235819a r110 = r4.A0a;
                                                        C31901cZ r06 = r4.A07;
                                                        z2 = true;
                                                        r110.A06(z2);
                                                    }
                                                }
                                                Log.i("AccountSwitcher/updateBannedAccountSharedPrefs/me manager is null");
                                                C29501Ww r192 = r122.A07;
                                                r192.A03();
                                                C29501Ww.A02(r192, 9, true);
                                                C19420v0 r542 = r122.A05;
                                                C19420v0.A00(r542).putBoolean("support_ban_appeal_user_banned_from_chat_disconnect", true).apply();
                                                C19420v0.A00(r542).putBoolean("support_ban_appeal_screen_before_verification", true).apply();
                                                r122.A01.A02();
                                                r122.A00.Bp3(new C80523vX(r122, context, str2, i4, 11));
                                                r4.A0V.A00(true);
                                                r4.A0W.A01(r32);
                                                C235819a r1102 = r4.A0a;
                                                C31901cZ r062 = r4.A07;
                                                z2 = true;
                                                r1102.A06(z2);
                                            }
                                        }
                                        Log.i("banmanager/startPermanentBanFlow/notify-or-show-login-failure-overlay-alert");
                                        r0 = r122.A07;
                                    }
                                    Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                    r6.A0r.Bp1(new C35711j8(r6, 24));
                                    r6.A04.A0H(new C35711j8(r6, 25));
                                    r4.A0V.A00(true);
                                    r4.A0W.A01(r32);
                                    C235819a r11022 = r4.A0a;
                                    C31901cZ r0622 = r4.A07;
                                    z2 = true;
                                    r11022.A06(z2);
                                } else if (i3 != 9) {
                                    if (i3 == 11) {
                                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/wf-underage-account");
                                        r6.A02.A0G();
                                        r6.A0s.A01();
                                        r6.A0j.A00(true);
                                        AnonymousClass1WP.A01(r6, r32);
                                        if (!r6.A06.A0L()) {
                                            Object obj = r6.A0u.get();
                                            C18740tg.A06(obj);
                                            C64703Pc r142 = (C64703Pc) obj;
                                            int i5 = r32.violationType;
                                            String str4 = r32.violationReason;
                                            int i6 = r32.violationSourceAcct;
                                            String str5 = r32.banAppealToken;
                                            AnonymousClass00C.A0D(context, 0);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("WfacManager/startWfacFlow violationType: ");
                                            sb3.append(i5);
                                            sb3.append(" violationReason: ");
                                            sb3.append(str4);
                                            sb3.append(" violationSourceAccount: ");
                                            sb3.append(i6);
                                            AnonymousClass00C.A0D(sb3.toString(), 0);
                                            r142.A02(3, i6);
                                            if (i5 != 14 || !AnonymousClass00C.A0J(str4, "u13_checkpoint")) {
                                                AnonymousClass3TI.A01("WfacManager/startWfacFlow/notify-or-show-login-failure-overlay-alert");
                                                r0 = r142.A04;
                                            } else {
                                                C29501Ww r111 = r142.A04;
                                                r111.A03();
                                                C29501Ww.A02(r111, 21, true);
                                                r142.A01.A02();
                                                r142.A00.Bp3(new C80633vi(context, r142, str5, str4, i6));
                                            }
                                        }
                                        Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                        r6.A0r.Bp1(new C35711j8(r6, 24));
                                        r6.A04.A0H(new C35711j8(r6, 25));
                                    } else if (i3 == 2) {
                                        int i7 = r32.code;
                                        int i8 = r32.expire_time_out;
                                        String str6 = r32.banMessage;
                                        String str7 = r32.faqUrl;
                                        Intent intent = new Intent();
                                        intent.setClassName(context.getPackageName(), "com.whatsapp.spamwarning.SpamWarningActivity");
                                        if (i7 >= 100) {
                                            intent.putExtra("spam_warning_reason_key", i7);
                                        }
                                        intent.putExtra("expiry_in_seconds", i8);
                                        if (!TextUtils.isEmpty(str6)) {
                                            intent.putExtra("spam_warning_message_key", str6);
                                        }
                                        if (!TextUtils.isEmpty(str7)) {
                                            intent.putExtra("faq_url_key", str7);
                                        }
                                        intent.setFlags(268435456);
                                        C19420v0 r102 = r6.A0L;
                                        long currentTimeMillis = System.currentTimeMillis() + (((long) r32.expire_time_out) * 1000);
                                        C19420v0.A00(r102).putBoolean("spam_banned", true).apply();
                                        r102.A1h("spam_banned_expiry_timestamp", currentTimeMillis);
                                        context.startActivity(intent);
                                    } else if (i3 != 3) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("message-handler-callback/login-failed LoginFailureException type: ");
                                        sb4.append(i3);
                                        sb4.append(" server error code: ");
                                        sb4.append(r32.serverErrorCode);
                                        Log.e(sb4.toString());
                                    } else {
                                        long j = r32.expiration_time;
                                        if (j <= 0) {
                                            j = C19970wo.A00(r6.A0J);
                                        }
                                        C19420v0.A00(r6.A0L).putLong("software_forced_expiration", j).apply();
                                        AnonymousClass1WP.A00(r6);
                                    }
                                    r4.A0V.A00(true);
                                    r4.A0W.A01(r32);
                                    C235819a r110222 = r4.A0a;
                                    C31901cZ r06222 = r4.A07;
                                    if (r06222 != null && r06222.BK2()) {
                                        z2 = true;
                                    }
                                    r110222.A06(z2);
                                } else {
                                    Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/not authorized");
                                    C19770wU r92 = r6.A0r;
                                    AnonymousClass189 r55 = r6.A0N;
                                    Objects.requireNonNull(r55);
                                    r92.Boy(new C35711j8(r55, 23));
                                }
                                r0.A06();
                                r4.A0V.A00(true);
                                r4.A0W.A01(r32);
                                C235819a r1102222 = r4.A0a;
                                C31901cZ r062222 = r4.A07;
                                z2 = true;
                                r1102222.A06(z2);
                            } else {
                                Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/underage-account");
                                C19420v0.A00(r6.A0L).putBoolean("underage_account_banned", true).apply();
                                r6.A0j.A00(true);
                                if (!r6.A06.A0L()) {
                                    Intent A03 = r6.A0k.A03();
                                    A03.putExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", true);
                                    context.startActivity(A03);
                                    r4.A0V.A00(true);
                                    r4.A0W.A01(r32);
                                    C235819a r11022222 = r4.A0a;
                                    C31901cZ r0622222 = r4.A07;
                                    z2 = true;
                                    r11022222.A06(z2);
                                }
                                Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                r6.A0r.Bp1(new C35711j8(r6, 24));
                                r6.A04.A0H(new C35711j8(r6, 25));
                                r4.A0V.A00(true);
                                r4.A0W.A01(r32);
                                C235819a r110222222 = r4.A0a;
                                C31901cZ r06222222 = r4.A07;
                                z2 = true;
                                r110222222.A06(z2);
                            }
                        }
                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password");
                        r6.A0j.A00(true);
                        AnonymousClass1WP.A01(r6, r32);
                        if (!r6.A06.A0L()) {
                            C19980wp.A00(r6.A0I).edit().putBoolean("previously_logged_out_from_primary", true).apply();
                            r6.A0k.A06();
                            AnonymousClass12P r07 = r6.A0P;
                            r07.A06();
                            if (r07.A08) {
                                r6.A0r.Boy(new C35711j8(r6, 29));
                            }
                            r4.A0V.A00(true);
                            r4.A0W.A01(r32);
                            C235819a r1102222222 = r4.A0a;
                            C31901cZ r062222222 = r4.A07;
                            z2 = true;
                            r1102222222.A06(z2);
                        }
                        Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                        r6.A0r.Bp1(new C35711j8(r6, 24));
                        r6.A04.A0H(new C35711j8(r6, 25));
                        r4.A0V.A00(true);
                        r4.A0W.A01(r32);
                        C235819a r11022222222 = r4.A0a;
                        C31901cZ r0622222222 = r4.A07;
                        z2 = true;
                        r11022222222.A06(z2);
                    }
                }
                return;
            case 3:
                C20720y3 r42 = this.A00;
                AtomicBoolean atomicBoolean3 = C20720y3.A14;
                r42.A0g.set(false);
                Object obj2 = message2.obj;
                C18740tg.A06(obj2);
                AnonymousClass9MZ r08 = (AnonymousClass9MZ) obj2;
                C20720y3.A03(r42, r08.A01, r08.A00, r08.A02, r08.A03);
                return;
            case 4:
                C20720y3 r22 = this.A00;
                if (message2.arg1 == 1) {
                    z = true;
                }
                C20720y3.A04(r22, z);
                return;
            case 5:
                C20720y3 r112 = this.A00;
                AtomicBoolean atomicBoolean4 = C20720y3.A14;
                C30351a4 r93 = r112.A08.A0a;
                int i9 = message2.arg1;
                if (i9 == 5) {
                    BaseBundle baseBundle = (BaseBundle) message2.obj;
                    r5 = (AnonymousClass11F) Jid.Companion.A02(baseBundle.getString("jid"));
                    String string = baseBundle.getString("pushName");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("app/xmpp/recv/handle_available ");
                    sb5.append(r5);
                    sb5.append(' ');
                    sb5.append(string);
                    Log.i(sb5.toString());
                    AnonymousClass141 A01 = r93.A06.A01(r5);
                    C27361Nx r62 = r93.A0C;
                    boolean z3 = true;
                    if (!AnonymousClass143.A0G(r5) && ((r02 = (AnonymousClass3A3) r62.A04.get(r5)) == null || r02.A04 != 1)) {
                        z3 = false;
                    }
                    HashMap hashMap = r62.A04;
                    AnonymousClass3A3 r23 = (AnonymousClass3A3) hashMap.get(r5);
                    if (r23 == null) {
                        r23 = new AnonymousClass3A3();
                        hashMap.put(r5, r23);
                    }
                    r23.A04 = 1;
                    r23.A01 = 1;
                    r62.A09(r5, true);
                    if (!z3 && A01.A0H != null) {
                        AnonymousClass1XR r09 = r93.A02;
                        Object obj3 = r5;
                        Handler handler = r09.A00;
                        HashMap hashMap2 = r09.A04;
                        Object obj4 = hashMap2.get(r5);
                        if (obj4 != null) {
                            obj3 = obj4;
                        } else {
                            hashMap2.put(r5, r5);
                        }
                        handler.removeMessages(2, obj3);
                    }
                } else if (i9 == 12) {
                    r93.A03.A01();
                    return;
                } else if (i9 == 24) {
                    Bundle data = message2.getData();
                    C207209uj r63 = (C207209uj) data.getParcelable("stanzaKey");
                    byte[] byteArray = data.getByteArray("jidHash");
                    AnonymousClass6NS r43 = (AnonymousClass6NS) message2.obj;
                    C201579ju A002 = AnonymousClass19L.A00(r93.A0B, 2, r63.A00);
                    if (A002 != null) {
                        A002.A04(3);
                    }
                    C131666Pz r010 = new C131666Pz(C108515Tu.A0I);
                    r010.A02 = true;
                    r010.A00 = r43;
                    r010.A05(byteArray);
                    C20430xY.A00(r93.A05, r010.A01(), true);
                    r93.A0A.A01(r63);
                    return;
                } else if (i9 == 64) {
                    BaseBundle baseBundle2 = (BaseBundle) message2.obj;
                    r5 = (AnonymousClass11F) Jid.Companion.A02(baseBundle2.getString("jid"));
                    String string2 = baseBundle2.getString("pushName");
                    long j2 = baseBundle2.getLong("lastSeen");
                    String string3 = baseBundle2.getString("presence");
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("app/xmpp/recv/handle_unavailable ");
                    sb6.append(r5);
                    sb6.append(' ');
                    sb6.append(string2);
                    sb6.append(" last:");
                    sb6.append(j2);
                    sb6.append(" presence: ");
                    sb6.append(string3);
                    Log.i(sb6.toString());
                    r93.A06.A01(r5);
                    if (string3 == null) {
                        i = 1;
                    } else {
                        i = 2;
                        if (string3.equals("deny")) {
                            i = 0;
                        }
                    }
                    C27361Nx r011 = r93.A0C;
                    GroupJid A04 = r011.A04(r5, i, j2);
                    r011.A09(r5, true);
                    if (A04 != null) {
                        r93.A04.A00(A04);
                    }
                } else if (i9 == 85) {
                    r93.A0A.A01((C207209uj) ((Bundle) message2.obj).getParcelable("stanzaKey"));
                    return;
                } else if (i9 == 88) {
                    BaseBundle baseBundle3 = (BaseBundle) message2.obj;
                    AnonymousClass11F r33 = (AnonymousClass11F) Jid.Companion.A02(baseBundle3.getString("jid"));
                    String string4 = baseBundle3.getString("pushName");
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("app/xmpp/recv/handle_unsubscribe");
                    sb7.append(r33);
                    sb7.append(' ');
                    sb7.append(string4);
                    Log.i(sb7.toString());
                    r93.A06.A01(r33);
                    r93.A0C.A09(r33, false);
                    r93.A04.A00(r33);
                    return;
                } else if (i9 == 158) {
                    int i10 = message2.getData().getInt("errorCode");
                    C20720y3 r113 = r93.A09;
                    if (i10 >= 500 && i10 < 600) {
                        r113.A0B = true;
                        C20720y3.A05(r113, false);
                        return;
                    }
                    return;
                } else if (i9 != 237) {
                    if (i9 == 20) {
                        BaseBundle baseBundle4 = (BaseBundle) message2.obj;
                        String string5 = baseBundle4.getString("jid");
                        C222513o r114 = Jid.Companion;
                        Jid A02 = r114.A02(string5);
                        Jid A022 = r114.A02(baseBundle4.getString("author"));
                        Jid A023 = r114.A02(baseBundle4.getString("author_pn"));
                        int i11 = baseBundle4.getInt("media");
                        r03 = r93.A0E;
                        r8 = new C35391ic(r93, A022, A023, A02, i11, 4);
                    } else if (i9 == 21) {
                        BaseBundle baseBundle5 = (BaseBundle) message2.obj;
                        String string6 = baseBundle5.getString("jid");
                        C222513o r115 = Jid.Companion;
                        Jid A024 = r115.A02(string6);
                        Jid A025 = r115.A02(baseBundle5.getString("author"));
                        Jid A026 = r115.A02(baseBundle5.getString("author_pn"));
                        r03 = r93.A0E;
                        r8 = new C35371ia(r93, A025, A026, A024, 20);
                    } else {
                        return;
                    }
                    r03.execute(r8);
                    return;
                } else {
                    r93.A00.A0E("SmaxInvalidError", "[WA Debug] Server sent smax-invalid (code:479)", false);
                    return;
                }
                r93.A04.A00(r5);
                return;
            case 6:
                C20720y3 r116 = this.A00;
                AtomicBoolean atomicBoolean5 = C20720y3.A14;
                r116.A0g.set(false);
                AnonymousClass1WP r44 = r116.A08;
                Log.i("message-handler-callback/handlerconnected/handleclockwrong");
                AnonymousClass1MM r117 = r44.A0m;
                Context context2 = r44.A0K.A00;
                r117.A01(context2, GcmFGService.class);
                C225014r r24 = r44.A04.A00;
                if (r24 == null || !AnonymousClass3SK.A02(r24, r44.A0Z, r44.A0c)) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("message-handler-callback/handlerconnected/displayclockwrong/notification ");
                    sb8.append(new Date());
                    sb8.append(" ");
                    sb8.append(System.currentTimeMillis());
                    Log.w(sb8.toString());
                    r44.A0p.A01(context2.getString(R.string.f12nameremoved), context2.getString(R.string.f12nameremoved), 8, false);
                    r44.A0c.A01 = true;
                    return;
                }
                return;
            case 7:
                C20720y3 r118 = this.A00;
                AtomicBoolean atomicBoolean6 = C20720y3.A14;
                r118.A0g.set(false);
                AnonymousClass1WP r34 = r118.A08;
                Log.i("message-handler-callback/handlerconnected/handlesoftwareexpired");
                r34.A0m.A01(r34.A0K.A00, GcmFGService.class);
                AnonymousClass1WP.A00(r34);
                return;
            case 8:
                C20720y3 r119 = this.A00;
                AtomicBoolean atomicBoolean7 = C20720y3.A14;
                AnonymousClass19Z r120 = r119.A0W;
                Object obj5 = message2.obj;
                Map map = r120.A04;
                synchronized (map) {
                    b1r = (C23046B1r) map.remove(obj5);
                }
                if (b1r != null) {
                    b1r.BVO((Object) null);
                    return;
                }
                return;
            case 9:
                C20720y3 r121 = this.A00;
                AtomicBoolean atomicBoolean8 = C20720y3.A14;
                AnonymousClass1WP r012 = r121.A08;
                if (r012 != null) {
                    r012.A04();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
