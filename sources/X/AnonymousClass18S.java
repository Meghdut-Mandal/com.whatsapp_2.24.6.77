package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.18S  reason: invalid class name */
public class AnonymousClass18S implements Application.ActivityLifecycleCallbacks {
    public boolean A00 = true;
    public boolean A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public final C21010yW A05;
    public final AnonymousClass18T A06;
    public final C19770wU A07;
    public final AnonymousClass1JW A08;
    public final C21390zA A09;
    public final C21400zB A0A;
    public final C21360z5 A0B;
    public final AnonymousClass18U A0C;
    public final AnonymousClass18Z A0D;
    public final C235718z A0E;
    public final C21060yb A0F;
    public final C21860zv A0G;
    public final AnonymousClass1JL A0H;
    public final AnonymousClass1JH A0I;
    public final AnonymousClass1JF A0J;
    public final AnonymousClass1JU A0K;
    public final AnonymousClass1JD A0L;
    public final AnonymousClass11e A0M;
    public final AnonymousClass1JS A0N;
    public final AnonymousClass1JI A0O;
    public final AnonymousClass1JV A0P;
    public final AnonymousClass1J5 A0Q;
    public final C233318b A0R;
    public final AnonymousClass005 A0S;
    public final AnonymousClass005 A0T;

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        A00(activity, false, "onCreated");
    }

    public void onActivityPostResumed(Activity activity) {
        A00(activity, false, "onResumed");
        A00(activity, true, "onRendered");
    }

    public void onActivityPostStarted(Activity activity) {
        A00(activity, false, "onStarted");
    }

    public void onActivityPreResumed(Activity activity) {
        A00(activity, true, "onResumed");
    }

    public void onActivityPreStarted(Activity activity) {
        A00(activity, true, "onStarted");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static void A00(Activity activity, Boolean bool, String str) {
        if (activity instanceof AnonymousClass14o) {
            AnonymousClass14o r2 = (AnonymousClass14o) activity;
            if (r2.A2I() != 78318969) {
                return;
            }
            if (bool.booleanValue()) {
                r2.A2T(str);
            } else {
                r2.A2S(str);
            }
        }
    }

    private void A01(Activity activity, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = activity.getClass();
        sb.append(cls.getName());
        sb.append(".on");
        sb.append(str);
        Log.i(sb.toString());
        if (z) {
            this.A0G.A02(cls.getSimpleName(), str);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(activity, "Create", true);
        if (this.A02 == 0) {
            this.A0M.A09 = true;
        }
        if (activity instanceof AnonymousClass01I) {
            ((AnonymousClass01I) activity).getSupportFragmentManager().A0S.A00.add(new AnonymousClass05O(this.A0N, true));
        }
        Window window = activity.getWindow();
        window.setCallback(new AnonymousClass1QR(window.getCallback(), this.A0Q, this.A0R));
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = activity;
        A01(activity, "Destroy", false);
        this.A0K.A00();
        AnonymousClass1JF r5 = this.A0J;
        StringBuilder sb = new StringBuilder();
        sb.append("Activity_");
        sb.append(activity.getClass().getSimpleName());
        sb.append("_");
        sb.append(activity.hashCode());
        String obj = sb.toString();
        ConcurrentHashMap concurrentHashMap = r5.A04;
        if (!concurrentHashMap.containsKey(obj) && ((long) concurrentHashMap.size()) <= 100) {
            concurrentHashMap.put(obj, new C1511778n(activity2, obj, r5.A03, SystemClock.elapsedRealtime()));
            r5.A02.Boz(new C35711j8(r5, 13), "MemoryLeakReporter.pruneRefs");
        }
    }

    public void onActivityPaused(Activity activity) {
        if (!(activity instanceof C16150oh)) {
            AnonymousClass11e r2 = this.A0M;
            StringBuilder sb = new StringBuilder();
            sb.append("pause_");
            sb.append(activity.getClass());
            r2.A07(sb.toString());
        }
        if (!(activity instanceof AnonymousClass4V7)) {
            this.A0L.A00();
        }
        A01(activity, "Pause", true);
        if (this.A04) {
            this.A07.Bp1(new C35291iS(this, activity, 0, this.A01));
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (activity instanceof AnonymousClass14o) {
            AnonymousClass14o r5 = (AnonymousClass14o) activity;
            if (r5.A2I() == 78318969) {
                AnonymousClass174 r4 = r5.A00;
                r4.A01.A0D(activity.getClass().getSimpleName(), -1);
                r5.A2T("onCreated");
            }
            AnonymousClass1JL r3 = this.A0H;
            AtomicBoolean atomicBoolean = r3.A01;
            if (!atomicBoolean.get() && r3.A08() && !atomicBoolean.getAndSet(true)) {
                C201089ip r42 = (C201089ip) r3.A08.getValue();
                Context context = r3.A03;
                String packageName = context.getPackageName();
                AnonymousClass00C.A0B(packageName);
                AnonymousClass00C.A0D(packageName, 0);
                ComponentName componentName = new ComponentName(packageName, "com.whatsapp.HomeActivity");
                ArrayList A032 = AnonymousClass03T.A03(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.Conversation")));
                if (((Boolean) r3.A05.getValue()).booleanValue()) {
                    A032.add(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.chatinfo.ContactInfoActivity")));
                    A032.add(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.group.GroupChatInfoActivity")));
                    A032.add(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.chatinfo.ListChatInfoActivity")));
                    A032.add(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.newsletter.NewsletterInfoActivity")));
                    A032.add(new AnonymousClass011(componentName, new ComponentName(packageName, "com.whatsapp.gallery.MediaGalleryActivity")));
                }
                AnonymousClass00T r7 = r3.A07;
                if (((Boolean) r7.getValue()).booleanValue()) {
                    ComponentName componentName2 = new ComponentName(packageName, "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                    A032.add(new AnonymousClass011(componentName, componentName2));
                    A032.add(new AnonymousClass011(componentName2, new ComponentName(packageName, "com.whatsapp.Conversation")));
                }
                int i = (int) ((context.getResources().getDisplayMetrics().density * 600.0f) + 0.5f);
                ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(A032, 10));
                Iterator it = A032.iterator();
                while (it.hasNext()) {
                    AnonymousClass011 r0 = (AnonymousClass011) it.next();
                    arrayList.add(new AnonymousClass9VJ((ComponentName) r0.first, (ComponentName) r0.second));
                }
                C192809Iq r02 = new C192809Iq(C007103b.A0f(arrayList), i, i);
                r42.A00(new AnonymousClass80X(r02.A02, r02.A01, r02.A00));
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(packageName, "com.whatsapp.home.ui.HomePlaceholderActivity"));
                List singletonList = Collections.singletonList("com.whatsapp.HomeActivity");
                AnonymousClass00C.A08(singletonList);
                r42.A00(AnonymousClass1JL.A00(intent, packageName, singletonList, i, i));
                if (((Boolean) r7.getValue()).booleanValue()) {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(packageName, "com.whatsapp.home.ui.StarredMessagesPlaceholderActivity"));
                    List singletonList2 = Collections.singletonList("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                    AnonymousClass00C.A08(singletonList2);
                    r42.A00(AnonymousClass1JL.A00(intent2, packageName, singletonList2, i, i));
                }
                List<String> singletonList3 = Collections.singletonList("com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                AnonymousClass00C.A08(singletonList3);
                ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(singletonList3, 10));
                for (String componentName3 : singletonList3) {
                    arrayList2.add(new AnonymousClass9V7(new ComponentName(packageName, componentName3)));
                }
                r42.A00(new C42861zc(new C56902xH(C007103b.A0f(arrayList2)).A00));
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        C18950u5 r0;
        boolean z = true;
        A01(activity, "Resume", true);
        if (activity instanceof C225714y) {
            r0 = ((C225714y) activity).BGv();
        } else {
            r0 = C19430v1.A03;
        }
        if (!r0.A00()) {
            this.A01 = false;
            z = false;
        } else if (new Random().nextBoolean()) {
            this.A01 = true;
        } else {
            this.A01 = false;
            this.A04 = true;
            return;
        }
        this.A04 = false;
        if (z) {
            this.A07.Bp1(new C35291iS(this, activity, 0, z));
        }
    }

    public void onActivityStarted(Activity activity) {
        A01(activity, "Start", true);
        if (this.A02 == 0 && !this.A03) {
            Log.i("app-init/application foregrounded");
            MessageService.A01(activity, this.A0P);
            C21360z5 r1 = this.A0B;
            if (!r1.A03() && !r1.A02()) {
                ((C20720y3) this.A0S.get()).A0C(1, true, false, false, false);
            }
            AnonymousClass18Z r4 = this.A0D;
            C21380z9 r12 = r4.A0K;
            r4.A0I.execute(new C35481il(4, C21380z9.A00(r12, r12.A01), r4));
            AnonymousClass18U r0 = this.A0C;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C19420v0 r42 = r0.A02;
            if (elapsedRealtime < ((SharedPreferences) r42.A00.get()).getLong("app_background_time", 0)) {
                C19420v0.A00(r42).putLong("app_background_time", -1800000).apply();
            }
            C21390zA r02 = this.A09;
            r02.A00 = true;
            for (AnonymousClass0z8 BRC : r02.getObservers()) {
                BRC.BRC();
            }
        }
        int i = this.A02;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        this.A00 = z;
        this.A02 = i + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof AnonymousClass1QR)) {
            window.setCallback(new AnonymousClass1QR(callback, this.A0Q, this.A0R));
        }
        AnonymousClass18U r2 = this.A0C;
        C19420v0 r13 = r2.A02;
        if (r13.A2K() && !r2.A03()) {
            Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
            r13.A22(false);
            r2.A02(false);
        }
    }

    public void onActivityStopped(Activity activity) {
        C34121gU r0;
        A01(activity, "Stop", true);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.A03 = isChangingConfigurations;
        int i = this.A02 - 1;
        this.A02 = i;
        if (i == 0 && !isChangingConfigurations) {
            this.A0G.A02("App", "backgrounded");
            Log.i("app-init/application backgrounded");
            AnonymousClass11e r1 = this.A0M;
            r1.A07("app_session_ended");
            r1.A09 = false;
            AnonymousClass1JH r5 = this.A0I;
            r5.A04.Boy(new C35741jB(r5, this.A0F, 5));
            if (!"com.whatsapp.authentication.AppAuthenticationActivity".equals(activity.getClass().getName())) {
                AnonymousClass18U r3 = this.A0C;
                C19420v0 r52 = r3.A02;
                if (!((SharedPreferences) r52.A00.get()).getBoolean("fingerprint_authentication_needed", false)) {
                    Log.i("AppAuthManager/onApplicationBackground");
                    r3.A02(true);
                    C19420v0.A00(r52).putLong("app_background_time", SystemClock.elapsedRealtime()).apply();
                }
            }
            this.A0E.A03 = false;
            AnonymousClass1JI r2 = this.A0O;
            if ((AnonymousClass1JI.A00(r2) || r2.A03.BMN(689639794)) && (r0 = r2.A00) != null) {
                r0.report();
                r2.A01 = false;
                r2.A00 = null;
            }
            AnonymousClass18Z r53 = this.A0D;
            C21380z9 r12 = r53.A0K;
            r53.A0I.execute(new C35481il(3, C21380z9.A00(r12, r12.A01), r53));
            List<C114895i0> list = (List) this.A08.A00.get(0);
            if (list != null) {
                for (C114895i0 r02 : list) {
                    C98444rR r32 = r02.A00;
                    AnonymousClass00C.A0D(r32, 0);
                    ((C157937ew) r32.A02).BBh(C023109s.A00).execute(new C1497572q(r32, 12));
                }
            }
            C21390zA r03 = this.A09;
            r03.A00 = false;
            for (AnonymousClass0z8 onAppBackgrounded : r03.getObservers()) {
                onAppBackgrounded.onAppBackgrounded();
            }
            this.A00 = true;
        }
    }

    public AnonymousClass18S(AnonymousClass1JW r2, C21390zA r3, C21400zB r4, C21360z5 r5, AnonymousClass18U r6, AnonymousClass18Z r7, C235718z r8, C21060yb r9, C21860zv r10, C21010yW r11, AnonymousClass1JL r12, AnonymousClass18T r13, AnonymousClass1JH r14, AnonymousClass1JF r15, AnonymousClass1JU r16, AnonymousClass1JD r17, AnonymousClass11e r18, AnonymousClass1JS r19, AnonymousClass1JI r20, AnonymousClass1JV r21, AnonymousClass1J5 r22, C233318b r23, C19770wU r24, AnonymousClass005 r25, AnonymousClass005 r26) {
        this.A0A = r4;
        this.A07 = r24;
        this.A0B = r5;
        this.A05 = r11;
        this.A06 = r13;
        this.A0C = r6;
        this.A0D = r7;
        this.A0R = r23;
        this.A0M = r18;
        this.A0F = r9;
        this.A0E = r8;
        this.A0Q = r22;
        this.A0L = r17;
        this.A0T = r26;
        this.A0J = r15;
        this.A0H = r12;
        this.A0I = r14;
        this.A0S = r25;
        this.A0O = r20;
        this.A09 = r3;
        this.A0N = r19;
        this.A0K = r16;
        this.A0P = r21;
        this.A0G = r10;
        this.A08 = r2;
        this.A02 = 0;
    }
}
