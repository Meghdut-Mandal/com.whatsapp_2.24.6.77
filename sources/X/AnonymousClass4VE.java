package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.4VE  reason: invalid class name */
public class AnonymousClass4VE extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4VE(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (2 - this.A02 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        AnonymousClass00C.A0D(animator, 0);
        animator.removeListener(this);
    }

    public void onAnimationEnd(Animator animator) {
        Bitmap photo;
        switch (this.A02) {
            case 0:
                AnonymousClass2HL r1 = (AnonymousClass2HL) this.A01;
                AnonymousClass2HL.A02(r1, (C87684Pt) this.A00);
                r1.A01.setTranslationY(0.0f);
                return;
            case 1:
                ((View) this.A01).setVisibility(4);
                return;
            case 2:
                ReactionsTrayViewModel reactionsTrayViewModel = ((C43842Ka) this.A01).A0F;
                String A18 = C36431kI.A18((TextView) this.A00);
                C34831hi r3 = reactionsTrayViewModel.A0D;
                if (A18.equals(((AnonymousClass3GR) r3.A04()).A00)) {
                    A18 = "";
                }
                reactionsTrayViewModel.A0S(0);
                r3.A0D(new AnonymousClass3GR(((AnonymousClass3GR) r3.A04()).A00, A18, true));
                return;
            case 3:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                AnonymousClass2bU r7 = (AnonymousClass2bU) this.A01;
                File A012 = AnonymousClass2bU.A01(r7);
                if (A012 != null) {
                    Uri fromFile = Uri.fromFile(A012);
                    ArrayList A0I = AnonymousClass001.A0I();
                    A0I.add(fromFile);
                    AnonymousClass3FR r5 = new AnonymousClass3FR(mediaViewFragment.A0a());
                    r5.A0H = A0I;
                    r5.A0D = AnonymousClass143.A03(mediaViewFragment.A13);
                    r5.A02 = 29;
                    r5.A0N = true;
                    r5.A04 = 23;
                    int i = r7.A1I;
                    if ((i == 1 || i == 42) && AnonymousClass3U9.A00) {
                        PhotoView A1b = mediaViewFragment.A1b(r7.A1J);
                        if (!(A1b == null || (photo = A1b.getPhoto()) == null)) {
                            mediaViewFragment.A0P.A02().A0D(AnonymousClass000.A0q("-media_view", C36381kD.A11(fromFile)), photo);
                            r5.A08 = fromFile;
                        }
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        C36341k9.A1H(C012005e.A02(mediaViewFragment.A0d(), R.id.pager_container), fromFile.toString(), A0I2);
                        View A022 = C012005e.A02(mediaViewFragment.A0d(), R.id.media_preview_header);
                        C36341k9.A1H(A022, C011004s.A03(A022), A0I2);
                        View A023 = C012005e.A02(mediaViewFragment.A0d(), R.id.media_preview_footer);
                        C36341k9.A1H(A023, C011004s.A03(A023), A0I2);
                        View A024 = C012005e.A02(mediaViewFragment.A0d(), R.id.media_preview_send);
                        C36341k9.A1H(A024, C011004s.A03(A024), A0I2);
                        mediaViewFragment.A0t(r5.A01(), 5, AnonymousClass0YW.A01(mediaViewFragment.A0i(), (AnonymousClass00I[]) A0I2.toArray(new AnonymousClass00I[0])).A00.toBundle());
                        return;
                    }
                    mediaViewFragment.startActivityForResult(r5.A01(), 5);
                    mediaViewFragment.A0i().overridePendingTransition(17432576, 0);
                    return;
                }
                return;
            default:
                MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass2XU) this.A00).A06;
                if (mediaViewBaseFragment.A0h() != null) {
                    mediaViewBaseFragment.A1o(true, true);
                    ((AnonymousClass4R6) this.A01).Bjb(true);
                    return;
                }
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A02 != 0) {
            super.onAnimationStart(animator);
        } else {
            AnonymousClass3T3.A04(((C43842Ka) this.A01).A0F.A04);
        }
    }
}
