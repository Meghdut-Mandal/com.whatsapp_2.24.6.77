package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2iC  reason: invalid class name and case insensitive filesystem */
public class C48872iC extends C33541fX {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C48872iC(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    public void A02(View view) {
        Intent A08;
        String packageName;
        String str;
        Object obj;
        AnonymousClass3HA groupInviteClickUtils;
        switch (this.A05) {
            case 0:
                C45632Sc r1 = (C45632Sc) this.A03;
                if (r1 != null) {
                    r1.A0B = C36371kC.A0m();
                }
                groupInviteClickUtils = ((InviteViaLinkView) this.A04).getGroupInviteClickUtils();
                break;
            case 1:
                C46902br r9 = (C46902br) this.A03;
                C63593Kq r12 = r9.A02;
                if (r12 == null) {
                    if (r9.A1J.A02) {
                        obj = C36381kD.A0T((C19730wQ) this.A02).A0H;
                    } else {
                        obj = this.A04;
                    }
                    UserJid userJid = (UserJid) obj;
                    C18740tg.A06(userJid);
                    double d = r9.A00;
                    double d2 = r9.A01;
                    long j = r9.A0I;
                    r12 = new C63593Kq(userJid);
                    r12.A00 = d;
                    r12.A01 = d2;
                    r12.A05 = j;
                }
                Context context = (Context) this.A00;
                AnonymousClass11F A012 = C64933Qa.A01(r9);
                if (((AnonymousClass1P6) this.A01).A05(context)) {
                    String rawString = A012.getRawString();
                    String rawString2 = r12.A06.getRawString();
                    long j2 = r12.A05;
                    double d3 = r12.A00;
                    double d4 = r12.A01;
                    A08 = C36401kF.A08(rawString);
                    A08.putExtra("final_location_jid", rawString2);
                    A08.putExtra("final_location_timestamp", j2);
                    A08.putExtra("final_location_latitude", d3);
                    A08.putExtra("final_location_longitude", d4);
                    packageName = context.getPackageName();
                    str = "com.whatsapp.location.GroupChatLiveLocationsActivity2";
                } else {
                    String rawString3 = A012.getRawString();
                    String rawString4 = r12.A06.getRawString();
                    long j3 = r12.A05;
                    double d5 = r12.A00;
                    double d6 = r12.A01;
                    A08 = C36401kF.A08(rawString3);
                    A08.putExtra("final_location_jid", rawString4);
                    A08.putExtra("final_location_timestamp", j3);
                    A08.putExtra("final_location_latitude", d5);
                    A08.putExtra("final_location_longitude", d6);
                    packageName = context.getPackageName();
                    str = "com.whatsapp.location.GroupChatLiveLocationsActivity";
                }
                A08.setClassName(packageName, str);
                context.startActivity(A08);
                return;
            case 2:
                AnonymousClass4V7 A013 = AnonymousClass3SS.A01(((AnonymousClass3TU) this.A00).A04);
                if (A013 != null) {
                    C65243Rh r0 = (C65243Rh) this.A02;
                    String str2 = r0.A03;
                    String str3 = r0.A02;
                    AnonymousClass3T1 r2 = (AnonymousClass3T1) this.A03;
                    A013.BKc(r2, r2.A1J, (AnonymousClass3DS) this.A01, str2, str3, (Bitmap[]) this.A04, r0.A01);
                    return;
                }
                return;
            default:
                C45632Sc r13 = (C45632Sc) this.A03;
                if (r13 != null) {
                    r13.A0B = C36371kC.A0m();
                }
                groupInviteClickUtils = ((C50802mf) this.A04).getGroupInviteClickUtils();
                break;
        }
        groupInviteClickUtils.A00((C225314u) this.A00, (AnonymousClass11F) this.A01, (AnonymousClass147) this.A02);
    }
}
