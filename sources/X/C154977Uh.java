package X;

import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.7Uh  reason: invalid class name and case insensitive filesystem */
public final class C154977Uh extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ int $selectedPosePosition;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154977Uh(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i, int i2) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$selectedPosePosition = i;
        this.$instanceKey = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        int i = this.$selectedPosePosition;
        ArrayList<C101394xU> A0J = C36321k7.A0J(list);
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C36351kA.A0v();
            }
            AnonymousClass6AY r0 = (AnonymousClass6AY) next;
            A0J.add(new C101394xU(r0.A00, r0.A01, AnonymousClass00F.A00(avatarProfilePhotoViewModel.A03.A00.A00.getApplicationContext(), R.color.f6nameremoved), AnonymousClass000.A1S(i2, i)));
            i2 = i3;
        }
        for (C101394xU r8 : A0J) {
            if (r8.A03) {
                this.this$0.A00.A0D(new C132306Ta(C90514aH.A0a(this.this$0.A00).A00, r8, A0J, C90514aH.A0a(this.this$0.A00).A02, false, false, false));
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel2 = this.this$0;
                int i4 = this.$instanceKey;
                int size = A0J.size();
                AnonymousClass1HC r1 = avatarProfilePhotoViewModel2.A06;
                r1.A03(C106035Ic.A00, i4, size);
                r1.A01(i4, "poses_sent_to_ui");
                r1.A02(C52322pF.SUCCESS, i4);
                return AnonymousClass0AJ.A00;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
