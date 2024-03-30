package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.73M  reason: invalid class name */
public class AnonymousClass73M implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public AnonymousClass73M(Object obj, Object obj2, String str, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = j;
        this.A02 = obj2;
    }

    public final void run() {
        Set set;
        String str;
        String str2;
        switch (this.A04) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str3 = this.A03;
                long j = this.A00;
                AnonymousClass6PR r7 = (AnonymousClass6PR) this.A02;
                restoreFromBackupActivity.A0p.block();
                restoreFromBackupActivity.A3r((C131006Ni) null, 24);
                restoreFromBackupActivity.A09.A1R(str3);
                if (j > 0) {
                    restoreFromBackupActivity.A09.A1f(str3, j);
                }
                if (r7 instanceof C101534xr) {
                    C101534xr r72 = (C101534xr) r7;
                    synchronized (r72) {
                        Map map = r72.A00;
                        if (map != null) {
                            set = map.keySet();
                        } else {
                            set = Collections.emptySet();
                        }
                    }
                } else {
                    set = Collections.emptySet();
                }
                if (!set.isEmpty()) {
                    Log.i("restore>RestoreFromBackupActivity/create-media-placeholders/before message restore");
                    RestoreFromBackupViewModel restoreFromBackupViewModel = restoreFromBackupActivity.A0H;
                    if (!set.isEmpty()) {
                        C36391kE.A1R(restoreFromBackupViewModel.A06, restoreFromBackupViewModel, set, 20);
                    }
                }
                RestoreFromBackupActivity.A0K(restoreFromBackupActivity);
                return;
            case 1:
                C198329dH r6 = (C198329dH) this.A01;
                Jid jid = (Jid) this.A02;
                String str4 = this.A03;
                long j2 = this.A00;
                try {
                    AnonymousClass6VE r1 = r6.A0E;
                    AnonymousClass6B4 A032 = r1.A03(jid, str4);
                    if (A032 != null) {
                        A032.A00 = j2;
                        r1.A05(A032, jid);
                        AnonymousClass6B4 A033 = r1.A03(jid, str4);
                        if (A033 != null) {
                            C001700s r3 = r6.A0A;
                            if (r3 != null) {
                                r3.A0C(C36341k9.A0I(str4, (int) A033.A00));
                                return;
                            }
                            return;
                        }
                    }
                    C001700s r0 = r6.A06;
                    if (r0 != null) {
                        C36331k8.A13(r0);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    C001700s r02 = r6.A06;
                    if (r02 != null) {
                        C36331k8.A13(r02);
                        return;
                    }
                    return;
                }
            case 2:
                ((VoiceServiceEventCallback) this.A01).m14lambda$setScheduledCallJoinTimeDiffMs$7$comwhatsappcallingserviceVoiceServiceEventCallback(this.A03, (GroupJid) this.A02, this.A00);
                return;
            default:
                AnonymousClass54E r11 = (AnonymousClass54E) this.A01;
                Context context = (Context) this.A02;
                String str5 = this.A03;
                long j3 = this.A00;
                Activity A002 = C18860tw.A00(context);
                if (A002 == null) {
                    str = "SendLocationAction/execute/findActivityContextResultedNull";
                } else if (A002 instanceof AnonymousClass4V7) {
                    AnonymousClass4V7 r2 = (AnonymousClass4V7) A002;
                    String A0a = C90494aF.A0a(r2);
                    if (A0a != null) {
                        boolean A05 = r11.A01.A05(A002.getApplicationContext());
                        boolean BJy = r2.BJy();
                        Context applicationContext = context.getApplicationContext();
                        boolean A0E = r11.A00.A0E(2570);
                        Intent A0D = C36431kI.A0D();
                        A0D.putExtra("jid", A0a);
                        A0D.putExtra("quoted_message_row_id", j3);
                        A0D.putExtra("has_number_from_url", BJy);
                        A0D.putExtra("start_in_fullscreen_mode", A0E);
                        String packageName = applicationContext.getPackageName();
                        if (A05) {
                            str2 = "com.whatsapp.location.LocationPicker2";
                        } else {
                            str2 = "com.whatsapp.location.LocationPicker";
                        }
                        A0D.setClassName(packageName, str2);
                        HashMap A0J = AnonymousClass001.A0J();
                        A0J.put("message_id", str5);
                        A0J.put("chat_id", A0a);
                        A0D.putExtra("carry_forward_extras", A0J);
                        A002.startActivityForResult(A0D, 904);
                        return;
                    }
                    str = "SendLocationAction/execute/jidIsNull";
                } else {
                    str = "SendLocationAction/execute/findActivityContextIsNotConversationInterface";
                }
                Log.e(str);
                return;
        }
    }
}
