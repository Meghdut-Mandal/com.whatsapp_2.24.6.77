package X;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Zk  reason: invalid class name and case insensitive filesystem */
public abstract class C67333Zk implements AdapterView.OnItemClickListener {
    public long A00;
    public final C19970wo A01;

    public C67333Zk(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C29731Xt r1;
        UserJid userJid;
        List list;
        List list2;
        List list3;
        Map map;
        String A03;
        Integer num;
        Integer num2;
        C36321k7.A0w(adapterView, view);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            if (this instanceof AnonymousClass4WM) {
                AnonymousClass4WM r2 = (AnonymousClass4WM) this;
                switch (r2.A01) {
                    case 0:
                        String A0e = C36421kH.A0e(SetAboutInfo.A0A, i);
                        SetAboutInfo setAboutInfo = (SetAboutInfo) r2.A00;
                        setAboutInfo.A3i(A0e);
                        setAboutInfo.A05.A01(3);
                        return;
                    case 1:
                        C42491yu r4 = (C42491yu) view.getTag();
                        if (r4 == null) {
                            return;
                        }
                        if (r4.A06 != C223613z.A00 || r4.A01 != 0) {
                            StatusesFragment statusesFragment = (StatusesFragment) r2.A00;
                            statusesFragment.A1C(AnonymousClass190.A0b(statusesFragment.A1D(), r4.A06, false, false, false));
                            r1 = statusesFragment.A10;
                            userJid = r4.A06;
                            AnonymousClass3P0 r0 = statusesFragment.A0x;
                            list = r0.A02;
                            list2 = r0.A03;
                            list3 = r0.A01;
                            map = r0.A05;
                            A03 = StatusesFragment.A03(statusesFragment);
                            AnonymousClass00C.A0D(userJid, 0);
                            C36321k7.A11(list, list2, list3);
                            num = null;
                            num2 = null;
                            break;
                        } else {
                            StatusesFragment.A0B((StatusesFragment) r2.A00);
                            return;
                        }
                        break;
                    default:
                        MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A00;
                        if (myStatusesActivity.A0x.isEmpty()) {
                            AnonymousClass3T1 A0n = C36411kG.A0n(myStatusesActivity.A0X.A00, i);
                            AnonymousClass0V9 r02 = myStatusesActivity.A00;
                            if (r02 != null) {
                                r02.A05();
                            }
                            A03 = null;
                            Intent A0b = AnonymousClass190.A0b(myStatusesActivity, A0n.A0L(), false, false, false);
                            AnonymousClass3UJ.A00(A0b, A0n.A1J);
                            myStatusesActivity.startActivity(A0b);
                            if (myStatusesActivity.A0J.A07() != null) {
                                r1 = myStatusesActivity.A0W;
                                userJid = C223613z.A00;
                                list = Collections.emptyList();
                                list2 = Collections.emptyList();
                                list3 = Collections.emptyList();
                                map = Collections.emptyMap();
                                num = C36371kC.A0o();
                                num2 = Integer.valueOf(i);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                }
                r1.A07(userJid, num, num2, A03, list, list2, list3, map);
                return;
            }
            ((C48722hw) this).A01.A00 = i;
        }
    }
}
