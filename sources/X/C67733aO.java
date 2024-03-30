package X;

import com.whatsapp.avatar.editor.AvatarEditorLauncherActivity;
import com.whatsapp.avatar.editor.AvatarEditorLauncherActivity$closeActivityWhenEditorCloses$1$1;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;

/* renamed from: X.3aO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67733aO implements C004301x {
    public final /* synthetic */ AvatarEditorLauncherActivity A00;

    public /* synthetic */ C67733aO(AvatarEditorLauncherActivity avatarEditorLauncherActivity) {
        this.A00 = avatarEditorLauncherActivity;
    }

    public final void BRR(AnonymousClass02E r4, AnonymousClass01z r5) {
        AnonymousClass01N r1;
        AvatarEditorLauncherActivity avatarEditorLauncherActivity = this.A00;
        if ((r4 instanceof BkCdsBottomSheetFragment) && (r1 = r4.A0P) != null) {
            r1.A04(new AvatarEditorLauncherActivity$closeActivityWhenEditorCloses$1$1(r4, avatarEditorLauncherActivity));
        }
    }
}
