package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public class C49182ih extends C132446Tt {
    public final AnonymousClass3T1 A00;
    public final /* synthetic */ MyStatusesActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49182ih(AnonymousClass3T1 r2, MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A01 = myStatusesActivity;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Collection<AnonymousClass3Q6> values = this.A01.A0H.A00(this.A00).A00.values();
        AnonymousClass00C.A08(values);
        int i = 0;
        for (AnonymousClass3Q6 A012 : values) {
            if (A012.A01(13) > 0) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        MyStatusesActivity myStatusesActivity = this.A01;
        HashMap hashMap = myStatusesActivity.A0u;
        C64933Qa r1 = this.A00.A1J;
        hashMap.put(r1, obj);
        myStatusesActivity.A0v.remove(r1);
        myStatusesActivity.A0X.notifyDataSetChanged();
    }
}
