package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;
import java.util.Collection;

/* renamed from: X.2sv  reason: invalid class name and case insensitive filesystem */
public abstract class C54422sv {
    public static final void A00(AnonymousClass01z r6, AnonymousClass012 r7, AnonymousClass147 r8, AnonymousClass147 r9, Collection collection, AnonymousClass00S r11, C006302t r12, int i, int i2, boolean z) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(collection, 5);
        AnonymousClass09Y r2 = new AnonymousClass09Y(r6);
        AddMembersRouter addMembersRouter = new AddMembersRouter();
        Bundle A0B = C36351kA.A0B(r8, "group");
        A0B.putString("parent_group", C36381kD.A0w(r9));
        A0B.putStringArrayList("jids", AnonymousClass143.A07(collection));
        A0B.putInt("request_invite_members", i);
        A0B.putBoolean("is_cag_and_community_add", z);
        A0B.putInt("entry_point", i2);
        addMembersRouter.A17(A0B);
        r2.A0D(addMembersRouter, "tag");
        r2.A04();
        r6.A0l(new AnonymousClass3RF(r11, 8), r7, "AddMembersRouter");
        r6.A0l(new AnonymousClass3RF(r12, 9), r7, "AddMembersSuccess");
    }
}
