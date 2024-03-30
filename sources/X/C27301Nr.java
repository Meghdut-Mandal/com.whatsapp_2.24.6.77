package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Nr  reason: invalid class name and case insensitive filesystem */
public class C27301Nr implements C20420xX, AnonymousClass00M {
    public final AnonymousClass164 A00;
    public final AnonymousClass16D A01;
    public final C27311Ns A02;
    public final AnonymousClass1A6 A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final C19770wU A06;

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYp() {
    }

    public static HashSet A00(C27301Nr r4) {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = ((SharedPreferences) r4.A05.A00.get()).getStringSet("pending_users_to_sync_device", new HashSet());
        C18740tg.A06(stringSet);
        hashSet.addAll(AnonymousClass143.A08((String[]) stringSet.toArray(new String[0])));
        return hashSet;
    }

    public void A01(UserJid[] userJidArr, int i) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceSyncManager/scheduleSyncDevicesJob size=");
        sb.append(r7);
        sb.append(" type=");
        sb.append(i);
        Log.i(sb.toString());
        String[] A0O = AnonymousClass143.A0O(Arrays.asList(userJidArr));
        ConditionVariable conditionVariable = C18740tg.A00;
        if (A0O == null || A0O.length == 0) {
            throw new IllegalArgumentException("invalid jid list");
        }
        ArrayList arrayList = new ArrayList();
        for (UserJid userJid : userJidArr) {
            C27311Ns r1 = this.A02;
            Set set = r1.A03;
            synchronized (set) {
                if (!set.contains(userJid)) {
                    r1.A01.put(userJid, Long.valueOf(C19970wo.A00(r1.A00)));
                    set.add(userJid);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(userJid);
            }
        }
        if (!arrayList.isEmpty()) {
            new C35261iP((Object) this, i, 9, (Object) arrayList).run();
        }
    }

    public void BYo() {
        this.A06.Boy(new C35691j6(this, 2));
    }

    public C27301Nr(AnonymousClass164 r1, AnonymousClass16D r2, C27311Ns r3, AnonymousClass1A6 r4, C19970wo r5, C19420v0 r6, C19770wU r7) {
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }
}
