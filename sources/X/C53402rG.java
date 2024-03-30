package X;

import com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet;

/* renamed from: X.2rG  reason: invalid class name and case insensitive filesystem */
public abstract class C53402rG {
    public static final LGCCallConfirmationSheet A00(AnonymousClass147 r5, int i, boolean z) {
        AnonymousClass00C.A0D(r5, 1);
        LGCCallConfirmationSheet lGCCallConfirmationSheet = new LGCCallConfirmationSheet();
        AnonymousClass011[] r2 = new AnonymousClass011[3];
        r2[0] = C36441kJ.A19("is_video", Boolean.valueOf(z));
        C36341k9.A1J("group_jid", r5, r2, 1);
        r2[2] = C36441kJ.A19("call_from_ui", Integer.valueOf(i));
        lGCCallConfirmationSheet.A17(C05430Pr.A00(r2));
        return lGCCallConfirmationSheet;
    }
}
