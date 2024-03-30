package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoColorView;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;
import java.util.List;

/* renamed from: X.4mH  reason: invalid class name and case insensitive filesystem */
public final class C95784mH extends C02920Ck {
    public final C006302t A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        int i2 = R.layout.f9nameremoved;
        if (i == 0) {
            i2 = R.layout.f9nameremoved;
        }
        View inflate = C36351kA.A0C(viewGroup).inflate(i2, viewGroup, false);
        List list = AnonymousClass0D3.A0I;
        if (i == 0) {
            AnonymousClass00C.A0B(inflate);
            return new C101384xT(inflate);
        }
        AnonymousClass00C.A0B(inflate);
        return new C101374xS(inflate);
    }

    public C95784mH(C006302t r2) {
        super((C02830Cb) new C95614lu());
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        C107975Rq r0;
        String A0w;
        C96944o9 r92 = (C96944o9) r9;
        AnonymousClass00C.A0D(r92, 0);
        AnonymousClass5ZY r6 = (AnonymousClass5ZY) A0L(i);
        AnonymousClass00C.A0B(r6);
        C154347Rv r7 = new C154347Rv(this);
        if (r92 instanceof C101384xT) {
            C101384xT r93 = (C101384xT) r92;
            AnonymousClass00C.A0D(r6, 0);
            C101414xW r62 = (C101414xW) r6;
            if (r62 instanceof C101394xU) {
                C101394xU r63 = (C101394xU) r62;
                C101384xT.A00(r93, r63.A00, r63.A03);
                View view = r93.A0H;
                int A002 = AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved);
                AvatarProfilePhotoImageView avatarProfilePhotoImageView = r93.A00;
                avatarProfilePhotoImageView.setAvatarPoseBackgroundColor(A002);
                avatarProfilePhotoImageView.setImageBitmap(r63.A01);
                C36411kG.A1C(view, r7, r63, 7);
                String str = r63.A02;
                if (str != null) {
                    Context context = view.getContext();
                    if (TextUtils.isEmpty(str)) {
                        A0w = context.getString(R.string.f12nameremoved);
                    } else {
                        A0w = C36351kA.A0w(context, str, 1, R.string.f12nameremoved);
                    }
                    avatarProfilePhotoImageView.setContentDescription(A0w);
                }
            } else if (r62 instanceof C101404xV) {
                C101404xV r64 = (C101404xV) r62;
                View view2 = r93.A0H;
                int A003 = AnonymousClass00F.A00(view2.getContext(), R.color.f6nameremoved);
                AvatarProfilePhotoImageView avatarProfilePhotoImageView2 = r93.A00;
                avatarProfilePhotoImageView2.setAvatarPoseBackgroundColor(A003);
                Integer num = r64.A00;
                if (num != null) {
                    C101384xT.A00(r93, num.intValue(), r64.A01);
                } else {
                    avatarProfilePhotoImageView2.A04();
                }
                view2.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            C101374xS r94 = (C101374xS) r92;
            AnonymousClass00C.A0D(r6, 0);
            C101424xX r5 = (C101424xX) r6;
            boolean z = r5.A03;
            if (z) {
                r0 = C107975Rq.SELECTED;
            } else {
                r0 = C107975Rq.IDLE;
            }
            AvatarProfilePhotoColorView avatarProfilePhotoColorView = r94.A00;
            int i2 = r5.A00;
            int i3 = r5.A01;
            avatarProfilePhotoColorView.A00 = r0;
            avatarProfilePhotoColorView.A01.setColor(i2);
            avatarProfilePhotoColorView.A02.setColor(i3);
            avatarProfilePhotoColorView.invalidate();
            avatarProfilePhotoColorView.setSelected(z);
            avatarProfilePhotoColorView.setContentDescription(r5.A02);
            C36411kG.A1C(r94.A0H, r7, r6, 6);
        }
    }

    public int getItemViewType(int i) {
        Object A0L = A0L(i);
        if (A0L instanceof C101414xW) {
            return 0;
        }
        if (A0L instanceof C101424xX) {
            return 1;
        }
        throw C36441kJ.A18();
    }
}
