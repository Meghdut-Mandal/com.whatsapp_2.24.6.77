package X;

import android.os.Bundle;
import com.whatsapp.group.NewGroupRouter;
import java.util.List;

/* renamed from: X.3OQ  reason: invalid class name */
public final class AnonymousClass3OQ {
    public static final NewGroupRouter A00(AnonymousClass147 r5, List list, int i, boolean z) {
        NewGroupRouter newGroupRouter = new NewGroupRouter();
        Bundle A07 = AnonymousClass001.A07();
        A07.putStringArrayList("preselected_jids", AnonymousClass143.A07(list));
        A07.putString("parent_group", r5.getRawString());
        A07.putBoolean("duplicate_ug_found", false);
        A07.putInt("entry_point", i);
        A07.putBoolean("create_lazily", false);
        A07.putBoolean("optional_participants", z);
        newGroupRouter.A17(A07);
        return newGroupRouter;
    }

    public final NewGroupRouter A01(AnonymousClass147 r7, String str, List list, List list2, int i, boolean z, boolean z2) {
        AnonymousClass00C.A0D(list, 0);
        Bundle A07 = AnonymousClass001.A07();
        if (list2 != null && !list2.isEmpty()) {
            AnonymousClass3UJ.A0A(A07, list2);
        }
        NewGroupRouter newGroupRouter = new NewGroupRouter();
        Bundle A072 = AnonymousClass001.A07();
        A072.putStringArrayList("preselected_jids", AnonymousClass143.A07(list));
        A072.putString("parent_group", C36381kD.A0w(r7));
        A072.putBoolean("duplicate_ug_found", z);
        A072.putInt("entry_point", i);
        A072.putBoolean("include_captions", z2);
        A072.putString("appended_message", str);
        A072.putBoolean("create_lazily", false);
        A072.putBoolean("optional_participants", false);
        A072.putBundle("optional_messages", A07);
        newGroupRouter.A17(A072);
        return newGroupRouter;
    }
}
