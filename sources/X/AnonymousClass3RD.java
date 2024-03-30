package X;

import android.os.Bundle;
import com.whatsapp.mute.ui.MuteDialogFragment;
import java.util.Collection;

/* renamed from: X.3RD  reason: invalid class name */
public abstract class AnonymousClass3RD {
    public static final MuteDialogFragment A00(AnonymousClass11F r4) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A0B = C36351kA.A0B(r4, "jid");
        A0B.putInt("mute_entry_point", 1);
        A0B.putBoolean("is_mute_call", true);
        muteDialogFragment.A17(A0B);
        return muteDialogFragment;
    }

    public static final MuteDialogFragment A01(AnonymousClass11F r4, C51992oi r5) {
        AnonymousClass00C.A0D(r4, 0);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A0B = C36351kA.A0B(r4, "jid");
        A0B.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A17(A0B);
        return muteDialogFragment;
    }

    public static final MuteDialogFragment A02(C51992oi r5, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putStringArrayList("jids", AnonymousClass143.A07(collection));
        A07.putBoolean("mute_in_conversation_fragment", true);
        A07.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A17(A07);
        return muteDialogFragment;
    }
}
