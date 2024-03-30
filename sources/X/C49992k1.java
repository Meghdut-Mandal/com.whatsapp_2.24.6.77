package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: X.2k1  reason: invalid class name and case insensitive filesystem */
public class C49992k1 extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final C19970wo A02;
    public final C24381Cf A03;
    public final AnonymousClass141 A04;
    public final C20510xg A05;
    public final String A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A002;
        String str = this.A06;
        AnonymousClass141 r12 = this.A04;
        C589731t r13 = new C589731t(this);
        C19970wo r2 = this.A02;
        AnonymousClass17Y r10 = this.A00;
        C19730wQ r1 = this.A01;
        C20510xg r15 = this.A05;
        C24381Cf r11 = this.A03;
        if (TextUtils.isEmpty(str)) {
            A002 = null;
        } else {
            A002 = C237919w.A00(r1, r2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C75233mt r9 = new C75233mt(r10, r11, r12, r13, str);
        try {
            r15.A05(r9, (AnonymousClass147) C36381kD.A0e(r12, AnonymousClass147.class), r12.A0K.A04, A002, str).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e) {
            Log.w("groupinfo/setgroupdescription/timeout", e);
            r9.BWp("", 0);
        }
        return null;
    }

    public void A0A() {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A00.setVisibility(0);
            groupChatInfoActivity.A1r.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A00.setVisibility(8);
            groupChatInfoActivity.A1r.setVisibility(0);
        }
    }

    public C49992k1(AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, C24381Cf r5, AnonymousClass141 r6, GroupChatInfoActivity groupChatInfoActivity, C20510xg r8, String str) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = str;
        this.A07 = AnonymousClass001.A0F(groupChatInfoActivity);
    }
}
