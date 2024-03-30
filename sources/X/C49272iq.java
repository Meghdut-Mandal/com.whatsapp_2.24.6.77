package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.group.GroupChatInfoActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2iq  reason: invalid class name and case insensitive filesystem */
public class C49272iq extends C132446Tt {
    public final C27761Ps A00;
    public final AnonymousClass141 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Context A0G = C36441kJ.A0G(this.A02);
        if (A0G != null) {
            return C36401kF.A09(A0G, this.A00, this.A01, 640);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A02.get();
        if (groupChatInfoActivity != null) {
            if (bitmap != null) {
                groupChatInfoActivity.A3o(bitmap);
            } else {
                groupChatInfoActivity.A3q(Integer.valueOf(AnonymousClass1Pp.A00(groupChatInfoActivity.A0h, groupChatInfoActivity.A3t(), false)));
            }
            if (C202899mr.A02(groupChatInfoActivity.A3t())) {
                groupChatInfoActivity.A06.setVisibility(0);
            }
        }
    }

    public C49272iq(C27761Ps r2, AnonymousClass141 r3, GroupChatInfoActivity groupChatInfoActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass001.A0F(groupChatInfoActivity);
        this.A01 = r3;
    }
}
