package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Environment;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1WQ  reason: invalid class name */
public class AnonymousClass1WQ extends C19580wB {
    public final AnonymousClass1WR A00;
    public final C19700wN A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C29301Wc A04;
    public final C24431Ck A05;
    public final C29321We A06;
    public final AnonymousClass1NG A07;
    public final AnonymousClass196 A08;
    public final AnonymousClass1NM A09;
    public final C21060yb A0A;
    public final C19630wG A0B;
    public final C20830yE A0C;
    public final C19420v0 A0D;
    public final AnonymousClass189 A0E;
    public final C220612s A0F;
    public final AnonymousClass12P A0G;
    public final AnonymousClass1QN A0H;
    public final C29311Wd A0I;
    public final C231917n A0J;
    public final AnonymousClass16S A0K;
    public final AnonymousClass1XJ A0L;
    public final C20810yC A0M;
    public final AnonymousClass1P5 A0N;
    public final AnonymousClass1DE A0O;
    public final AnonymousClass1XA A0P;
    public final C29341Wg A0Q;
    public final C24251Bs A0R;
    public final AnonymousClass1XW A0S;
    public final C29501Ww A0T;
    public final AnonymousClass1CR A0U;
    public final AnonymousClass1B5 A0V;
    public final AnonymousClass1E9 A0W;
    public final C19770wU A0X;
    public final AnonymousClass1XV A0Y;
    public final C220812u A0Z;
    public final AnonymousClass005 A0a;
    public final AnonymousClass005 A0b;
    public final AnonymousClass005 A0c;
    public final C19460v5 A0d;
    public final C19460v5 A0e;
    public final C19460v5 A0f;
    public final C19460v5 A0g;
    public final C19460v5 A0h;
    public final C19460v5 A0i;
    public final C19460v5 A0j;
    public final C19460v5 A0k;
    public final C19460v5 A0l;
    public final C19460v5 A0m;
    public final C19460v5 A0n;
    public final C29411Wn A0o;
    public final AnonymousClass1RU A0p;
    public final C29461Ws A0q;
    public final AnonymousClass1Pd A0r;
    public final C19990wq A0s;
    public final AnonymousClass1UU A0t;
    public final AnonymousClass1ST A0u;
    public final AnonymousClass1C4 A0v;
    public final C28361Si A0w;
    public final AnonymousClass13J A0x;
    public final C21570zS A0y;
    public final AnonymousClass005 A0z;
    public final AnonymousClass005 A10;
    public final AnonymousClass004 A11;

    private void A00(Context context, Runnable runnable, boolean z) {
        Set emptySet;
        AnonymousClass1ST r4 = this.A0u;
        synchronized (r4.A0F) {
            Iterator it = r4.A0B().iterator();
            while (it.hasNext()) {
                AnonymousClass1ST.A06(r4, (AnonymousClass2bU) it.next(), true, true);
            }
        }
        this.A0w.A0H(false);
        C29461Ws r1 = this.A0q;
        synchronized (r1) {
            r1.A01.clear();
            r1.A02.clear();
            r1.A03.clear();
        }
        this.A02.A0H(new C35671j4(this, 4));
        this.A0S.A01();
        C29501Ww r2 = this.A0T;
        r2.A08();
        AnonymousClass1WR r0 = this.A00;
        r0.A01 = false;
        r0.A00 = null;
        r0.A04.A1j((String) null, (String) null);
        this.A07.A0B();
        r2.A0D((String) null, (String) null, (String) null);
        this.A0P.A01(true, true);
        Context context2 = this.A0B.A00;
        C19770wU r42 = this.A0X;
        r42.Boy(new C35321iV(this, context2, runnable, 9));
        Log.i("deleteaccountconfirm/removeDatabasesAndResetState() done");
        File filesDir = context.getFilesDir();
        filesDir.toString();
        for (int i = 0; i < context.fileList().length; i++) {
        }
        if (z) {
            emptySet = Collections.singleton("Logs");
        } else {
            emptySet = Collections.emptySet();
        }
        AnonymousClass6YY.A0H(filesDir, emptySet);
        r42.Boy(C80963wF.A00);
        AnonymousClass1NM r22 = this.A09;
        synchronized (r22) {
            AnonymousClass1NM.A00(r22).edit().clear().commit();
            C27131Na r12 = r22.A08;
            C27131Na.A01(r12).edit().clear().commit();
            C27131Na.A00(r12).edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        StringBuilder sb = new StringBuilder();
        sb.append("deleteacctconfirm/externalmedia-state ");
        sb.append(externalStorageState);
        Log.i(sb.toString());
        if (this.A0C.A0I(externalStorageState)) {
            AnonymousClass6YO.A0D(C29301Wc.A00(this.A04).A04);
        }
        this.A0o.A02();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append("_preferences");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb2.toString(), 0);
        if (!sharedPreferences.edit().clear().commit()) {
            Log.e("deleteacctconfirm/cleanup/clear failed");
        }
        A02();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Objects.requireNonNull("2.24.6.77");
        if (!edit.putString("version", "2.24.6.77").commit()) {
            Log.e("deleteacctconfirm/cleanup/setversion failed");
        }
        C19420v0 r43 = this.A0D;
        String A0c2 = r43.A0c();
        SharedPreferences.Editor A002 = C19420v0.A00(r43);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("gdrive_last_successful_backup_timestamp:");
        sb3.append(A0c2);
        SharedPreferences.Editor remove = A002.remove(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("gdrive_last_successful_backup_total_size:");
        sb4.append(A0c2);
        SharedPreferences.Editor remove2 = remove.remove(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("gdrive_last_successful_backup_media_size:");
        sb5.append(A0c2);
        SharedPreferences.Editor remove3 = remove2.remove(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("gdrive_last_successful_backup_video_size:");
        sb6.append(A0c2);
        SharedPreferences.Editor remove4 = remove3.remove(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append("gdrive_last_successful_backup_encrypted:");
        sb7.append(A0c2);
        remove4.remove(sb7.toString()).remove("gdrive_restore_start_timestamp").remove("gdrive_backup_start_timestamp").remove("gdrive_next_prompt_for_setup_timestamp").remove("gdrive_error_code").remove("interface_gdrive_backup_frequency").remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_media_restore_network_setting").remove("gdrive_old_media_encryption_status").remove("gdrive_old_media_encryption_start_time").remove("gdrive_last_restore_file_is_encrypted").remove("gdrive_successive_backup_failed_count").remove("gdrive_already_uploaded_bytes").remove("gdrive_user_initiated_backup").remove("gdrive_state").remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").remove("interface_gdrive_backup_network_setting").remove("gdrive_include_videos_in_backup").remove("gdrive_backup_filters").remove("gdrive_approx_media_download_size").remove("gdrive_account_name").remove("gdrive_setup_user_prompted_count").commit();
        if (C20800yB.A01(C21000yV.A02, this.A0M, 4471)) {
            C19420v0.A00(r43).remove("contactless_jids_store").apply();
        }
        C19990wq r13 = this.A0s;
        C19980wp.A00(r13.A00).edit().clear().commit();
        SharedPreferences sharedPreferences2 = r13.A01.A01;
        sharedPreferences2.edit().putInt("registration_device_id", 0).commit();
        sharedPreferences2.edit().putInt("companion_registration_state", 0).commit();
    }

    public void A01() {
        C29501Ww.A02(this.A0T, 6, true);
        for (AnonymousClass1ZW BaA : getObservers()) {
            BaA.BaA();
        }
        C35621iz r11 = new C35621iz(this, new AtomicInteger(2), 33);
        C29301Wc r1 = this.A04;
        Context context = this.A0B.A00;
        C20220xD A002 = C29301Wc.A00(r1);
        String A0c2 = A002.A07.A0c();
        C19730wQ r12 = A002.A00;
        r12.A0G();
        if (r12.A00 == null || TextUtils.isEmpty(A0c2)) {
            Log.i("deleteacctconfirm/not registered or no google account so no google backup deletion");
            r11.run();
        } else {
            r12.A0G();
            PhoneUserJid phoneUserJid = r12.A03;
            C18740tg.A06(phoneUserJid);
            ConditionVariable conditionVariable = new ConditionVariable(false);
            AnonymousClass29O r10 = new AnonymousClass29O(conditionVariable, A002);
            ConditionVariable conditionVariable2 = new ConditionVariable(false);
            context.bindService(AnonymousClass190.A14(context, (String) null), new AnonymousClass6ZG(conditionVariable2, A002, r10), 1);
            Intent A14 = AnonymousClass190.A14(context, "action_delete");
            A14.putExtra("account_name", A0c2);
            A14.putExtra("jid_user", phoneUserJid.user);
            C19770wU r2 = A002.A0A;
            r2.Boy(new C35321iV(conditionVariable2, context, A14, 10));
            r2.Box(new AnonymousClass5MO(context, conditionVariable2, conditionVariable, A002, r10, r11), new Void[0]);
        }
        this.A0v.A00();
        ((C20720y3) this.A10.get()).A0G(false, 13);
        A00(context, r11, false);
        if (Build.VERSION.SDK_INT >= 26) {
            C34091gR.A00(context, this.A0A);
        }
        C131616Pt r22 = (C131616Pt) this.A11.get();
        r22.A01.A07(-1);
        AnonymousClass6S8 r13 = r22.A00.A01;
        try {
            C1496071z A003 = AnonymousClass6S8.A00(r13);
            if (A003 != null) {
                A003.close();
                C1496071z.A07(A003.A06);
            }
            r13.A03 = null;
            AnonymousClass6S8.A00(r13);
            r13.A00 = new HashMap();
            AnonymousClass6S8.A01(r13);
        } catch (IOException unused) {
            Log.e("BkCacheSaveOnDiskHelper/clearAllEntries exception wile clearing all entries");
        }
    }

    public void A02() {
        Context context = this.A0B.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        String obj = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        AnonymousClass9XO r1 = new AnonymousClass9XO(context);
        r1.A07 = obj;
        r1.A02 = null;
        r1.A02 = null;
        r1.A02(context, (PreferenceScreen) null, R.xml.f14nameremoved);
        sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
    }

    public void A03(boolean z) {
        this.A0s.A01.A01.edit().putInt("companion_registration_state", 9).commit();
        for (AnonymousClass1ZW BaA : getObservers()) {
            BaA.BaA();
        }
        AnonymousClass6VR r0 = (AnonymousClass6VR) this.A0y.get();
        r0.A06.B74(new C97444ph(r0));
        Context context = this.A0B.A00;
        this.A0v.A00();
        boolean z2 = false;
        ((C20720y3) this.A10.get()).A0G(false, 13);
        if (z) {
            this.A0r.A02(true);
        }
        C20810yC r2 = this.A0M;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 2489) && !this.A0p.A0A()) {
            try {
                ActivityManager A042 = this.A0A.A04();
                if (A042 == null) {
                    String packageName = context.getPackageName();
                    Runtime runtime = Runtime.getRuntime();
                    StringBuilder sb = new StringBuilder();
                    sb.append("pm clear ");
                    sb.append(packageName);
                    runtime.exec(sb.toString());
                    return;
                } else if (A042.clearApplicationUserData()) {
                    return;
                }
            } catch (IOException | SecurityException e) {
                this.A01.A0D("DeleteAccount/clearApplicationUserData/failed to clear, falling back to old cleanup flow", e.getMessage(), e);
            }
        } else if (this.A03.A0L() && C20800yB.A01(r1, r2, 624)) {
            z2 = true;
        }
        A00(context, (Runnable) null, z2);
    }

    public AnonymousClass1WQ(C19460v5 r2, C19460v5 r3, C19460v5 r4, C19460v5 r5, C19460v5 r6, C19460v5 r7, C19460v5 r8, C19460v5 r9, C19460v5 r10, C19460v5 r11, C19460v5 r12, AnonymousClass1WR r13, C19700wN r14, AnonymousClass17Y r15, C19730wQ r16, C29411Wn r17, AnonymousClass1RU r18, C29301Wc r19, C24431Ck r20, C29321We r21, C29461Ws r22, AnonymousClass1NG r23, AnonymousClass196 r24, AnonymousClass1Pd r25, AnonymousClass1NM r26, C19990wq r27, C21060yb r28, C19630wG r29, C20830yE r30, C19420v0 r31, AnonymousClass189 r32, C220612s r33, AnonymousClass12P r34, AnonymousClass1QN r35, C29311Wd r36, C231917n r37, AnonymousClass16S r38, AnonymousClass1XJ r39, AnonymousClass1UU r40, C20810yC r41, AnonymousClass1P5 r42, AnonymousClass1DE r43, AnonymousClass1ST r44, AnonymousClass1C4 r45, C28361Si r46, AnonymousClass1XA r47, C29341Wg r48, C24251Bs r49, AnonymousClass1XW r50, C29501Ww r51, AnonymousClass1CR r52, AnonymousClass1B5 r53, AnonymousClass1E9 r54, AnonymousClass13J r55, C19770wU r56, AnonymousClass1XV r57, C220812u r58, C21570zS r59, AnonymousClass005 r60, AnonymousClass005 r61, AnonymousClass005 r62, AnonymousClass005 r63, AnonymousClass005 r64, AnonymousClass005 r65, AnonymousClass004 r66) {
        super(r64);
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0M = r41;
        this.A02 = r15;
        this.A00 = r13;
        this.A01 = r14;
        this.A03 = r16;
        this.A0B = r29;
        this.A0X = r56;
        this.A0b = r60;
        this.A0v = r45;
        this.A0i = r3;
        this.A08 = r24;
        this.A0Z = r58;
        this.A0K = r38;
        this.A0l = r2;
        this.A04 = r19;
        this.A0x = r55;
        this.A0A = r28;
        this.A11 = r66;
        this.A0p = r18;
        this.A0y = r59;
        this.A07 = r23;
        this.A05 = r20;
        this.A0V = r53;
        this.A09 = r26;
        this.A0U = r52;
        this.A0I = r36;
        this.A06 = r21;
        this.A0O = r43;
        this.A0E = r32;
        this.A0Q = r48;
        this.A0o = r17;
        this.A0t = r40;
        this.A0W = r54;
        this.A0q = r22;
        this.A0w = r46;
        this.A0G = r34;
        this.A0T = r51;
        this.A0n = r4;
        this.A0C = r30;
        this.A0D = r31;
        this.A0J = r37;
        this.A0s = r27;
        this.A0r = r25;
        this.A0L = r39;
        this.A0u = r44;
        this.A10 = r61;
        this.A0m = r5;
        this.A0Y = r57;
        this.A0d = r6;
        this.A0N = r42;
        this.A0k = r7;
        this.A0j = r8;
        this.A0g = r9;
        this.A0P = r47;
        this.A0f = r11;
        this.A0H = r35;
        this.A0R = r49;
        this.A0S = r50;
        this.A0F = r33;
        this.A0c = r62;
        this.A0e = r10;
        this.A0z = r63;
        this.A0h = r12;
        this.A0a = r65;
    }
}
