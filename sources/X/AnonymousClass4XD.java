package X;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4XD  reason: invalid class name */
public class AnonymousClass4XD implements C16620po {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XD(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C51672oC r3;
        long j;
        int i;
        switch (this.A02) {
            case 0:
                DeleteAccountFeedback deleteAccountFeedback = (DeleteAccountFeedback) this.A00;
                deleteAccountFeedback.A01 = menuItem.getItemId();
                ((TextView) this.A01).setText(menuItem.getTitle());
                EditText editText = deleteAccountFeedback.A03;
                int i2 = deleteAccountFeedback.A01;
                int i3 = R.string.f12nameremoved;
                if (i2 == 2) {
                    i3 = R.string.f12nameremoved;
                }
                editText.setHint(i3);
                return false;
            case 1:
                C39161rN r1 = (C39161rN) this.A00;
                r1.getActivity().startActivity(C36441kJ.A0j().A1W(r1.getActivity(), ((AnonymousClass3K2) this.A01).A03));
                return true;
            case 2:
                AnonymousClass2HF r4 = (AnonymousClass2HF) this.A00;
                AnonymousClass3T1 r32 = (AnonymousClass3T1) this.A01;
                if (menuItem.getItemId() == 0) {
                    r4.A01.A02(C80183uz.A05(r4), r32, 85);
                    return true;
                } else if (menuItem.getItemId() != 1) {
                    return false;
                } else {
                    r4.A01.BpS(r32);
                    return true;
                }
            default:
                C48772i1 r2 = (C48772i1) this.A00;
                AnonymousClass3T1 r42 = (AnonymousClass3T1) this.A01;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menuitem_forward) {
                    MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A00;
                    AnonymousClass0V9 r0 = myStatusesActivity.A00;
                    if (r0 != null) {
                        r0.A05();
                    }
                    myStatusesActivity.A0O = r42;
                    AnonymousClass3OM r5 = new AnonymousClass3OM(myStatusesActivity);
                    r5.A09 = C36371kC.A0m();
                    r5.A01 = r42.A1J.A00;
                    int i4 = r42.A1I;
                    AnonymousClass3OM.A03(r5, i4);
                    if (i4 == 3) {
                        j = C36371kC.A07(((AnonymousClass2bU) r42).A0B);
                    } else {
                        j = 0;
                    }
                    r5.A0T = Long.valueOf(j);
                    if (i4 == 0) {
                        String A0b = r42.A0b();
                        C18740tg.A06(A0b);
                        i = A0b.length();
                    } else {
                        i = 0;
                    }
                    r5.A0R = Integer.valueOf(i);
                    myStatusesActivity.startActivityForResult(AnonymousClass3OM.A00(r5), 2);
                    return true;
                } else if (itemId == R.id.menuitem_delete) {
                    MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) r2.A00;
                    Map map = myStatusesActivity2.A0x;
                    map.clear();
                    map.put(r42.A1J, r42);
                    AnonymousClass3SJ.A01(myStatusesActivity2, 13);
                    map.clear();
                    return true;
                } else {
                    if (itemId == R.id.menuitem_share_status_facebook) {
                        r3 = C51672oC.FACEBOOK_SHARE;
                    } else if (itemId == R.id.menuitem_share_status_third_party) {
                        r3 = C51672oC.THIRD_PARTY_SHARE;
                    } else if (itemId == R.id.menuitem_share_status_instagram) {
                        r3 = C51672oC.INSTAGRAM_SHARE;
                    } else if (itemId != R.id.menuitem_advertise_on_facebook) {
                        return true;
                    } else {
                        MyStatusesActivity myStatusesActivity3 = (MyStatusesActivity) r2.A00;
                        C19460v5 r12 = myStatusesActivity3.A03;
                        if (r12.A05()) {
                            r12.A02();
                            throw AnonymousClass001.A0A("logStatusEntryPointClicked");
                        }
                        ((AnonymousClass005) myStatusesActivity3.A02.A02()).get();
                        String str = r42.A1J.A01;
                        C52522pZ r13 = C52522pZ.A0e;
                        AnonymousClass00C.A0D(str, 0);
                        new AnonymousClass8UQ(r13, str, 4);
                        throw AnonymousClass001.A0A("launchAdsCreationExperience");
                    }
                    MyStatusesActivity myStatusesActivity4 = (MyStatusesActivity) r2.A00;
                    Map map2 = myStatusesActivity4.A0x;
                    map2.clear();
                    map2.put(r42.A1J, r42);
                    myStatusesActivity4.A3k(r3, C36371kC.A0p(), Collections.singletonList(r42));
                    return true;
                }
        }
    }
}
