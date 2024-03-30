package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.conversation.comments.CommentActionsBottomSheet;
import com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Y7  reason: invalid class name */
public class AnonymousClass4Y7 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4Y7(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnLongClickListener(new AnonymousClass4Y7(obj, obj2, i));
    }

    public final boolean onLongClick(View view) {
        int i;
        AnonymousClass3T1 r3;
        C225314u r2;
        switch (this.A02) {
            case 0:
                AnonymousClass3FG r22 = (AnonymousClass3FG) this.A00;
                r22.A00(CallLogActivity.A0G(r22.A0B, (C107265Nh) this.A01), true, true);
                break;
            case 1:
                CallLinkActivity.A01((CallLinkActivity) this.A00, (AnonymousClass3XZ) this.A01);
                break;
            case 2:
                AnonymousClass2HF r4 = (AnonymousClass2HF) this.A00;
                AnonymousClass3T1 r32 = (AnonymousClass3T1) this.A01;
                ViewGroup viewGroup = r4.A01;
                AnonymousClass4V7 r5 = r4.A01;
                AnonymousClass155 BoP = r5.BoP();
                C20810yC r0 = r4.A02;
                C07200Ws r8 = new C07200Ws(BoP, viewGroup, 8388613, 0, C55822vF.A00(r0));
                C016307a r7 = r8.A03;
                if (C36361kB.A1Y(r0)) {
                    r7.A0C = true;
                }
                if (r4.A01.A01(r32)) {
                    MenuItem add = r7.add(0, 0, 1, (int) R.string.f12nameremoved);
                    add.setIcon(R.drawable.vec_ic_action_unpin_in_chat);
                    AnonymousClass0VM.A01(C36431kI.A0G(r5.BoP(), R.color.f6nameremoved), add);
                    i = 2;
                } else {
                    i = 1;
                }
                MenuItem add2 = r7.add(0, 1, i, (int) R.string.f12nameremoved);
                add2.setIcon(R.drawable.vec_ic_action_arrow_next);
                AnonymousClass0VM.A01(C36431kI.A0G(r5.BoP(), R.color.f6nameremoved), add2);
                r8.A01 = new AnonymousClass4XD(r32, r4, 2);
                r8.A00();
                break;
            case 3:
                r3 = (AnonymousClass3T1) this.A01;
                AnonymousClass00C.A0D(r3, 1);
                r2 = ((C38481oz) this.A00).getActivity();
                break;
            case 4:
                r3 = (AnonymousClass3T1) this.A01;
                AnonymousClass00C.A0D(r3, 1);
                r2 = ((C38491p0) this.A00).getActivity();
                break;
            case 5:
                AnonymousClass3T1 r33 = (AnonymousClass3T1) this.A01;
                AnonymousClass00C.A0D(r33, 1);
                C225314u activity = ((C38761ps) this.A00).getActivity();
                Bundle A07 = AnonymousClass001.A07();
                AnonymousClass3UJ.A08(A07, r33.A1J);
                C36381kD.A17(A07, new CommentActionsBottomSheet(), activity);
                break;
            case 6:
                C64753Ph r1 = (C64753Ph) this.A00;
                AnonymousClass3T1 r42 = (AnonymousClass3T1) this.A01;
                AnonymousClass2IM r34 = r1.A0D;
                C89004Uw r23 = r34.A0c;
                if (r23 != null) {
                    r23.Bur(r1.A07);
                    C64753Ph.A00(r1);
                    r1.A02.setSelected(r23.BMT(r42));
                    r34.getRowCustomizer();
                    C80273v8.A00(r34.A21, r34, r42, 39);
                    break;
                }
                break;
            case 7:
                C43562Ir r02 = (C43562Ir) this.A00;
                AnonymousClass3T1 r35 = (AnonymousClass3T1) this.A01;
                C89004Uw r12 = r02.A01;
                AnonymousClass1RJ selectionView = r02.getSelectionView();
                if (!r12.BK6()) {
                    r12.Bur(r35);
                    break;
                } else {
                    ((CarouselItemSelectionView) selectionView.A01()).setRowSelected(r12.Bvv(r35));
                    break;
                }
            case 8:
                C42691zE r13 = (C42691zE) this.A00;
                AnonymousClass1H2 r52 = r13.A04;
                ImageView imageView = r13.A02;
                AnonymousClass3TC.A01(imageView, r13.A03.getRootView(), new C38851qK(imageView, (AnonymousClass4QU) this.A01, r52, r13.A01.A00, false));
                break;
            case 9:
                C41841xr r03 = (C41841xr) this.A00;
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01;
                C36341k9.A1D(r03);
                AnonymousClass2Ty r14 = r03.A00;
                AnonymousClass4V2 r04 = r14.A08;
                if (r04 == null || !mediaGalleryFragmentBase.A1k(r04, r14)) {
                    return false;
                }
                return true;
            case 10:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                Set singleton = Collections.singleton(this.A01);
                AnonymousClass01I A0i = mediaViewFragment.A0i();
                AnonymousClass17Y r36 = mediaViewFragment.A0H;
                C28371Sj r9 = mediaViewFragment.A1F;
                C19730wQ r43 = mediaViewFragment.A0J;
                AnonymousClass16D r53 = mediaViewFragment.A0S;
                C18820ts r82 = mediaViewFragment.A0j;
                C65853Ts.A04(A0i, r36, r43, r53, mediaViewFragment.A0W, mediaViewFragment.A0d, r82, r9, mediaViewFragment.A1N, mediaViewFragment.A1U, singleton);
                break;
            case 11:
                C42301yb r15 = (C42301yb) this.A01;
                List list = AnonymousClass0D3.A0I;
                AnonymousClass00C.A0D(r15, 1);
                TextEmojiLabel textEmojiLabel = r15.A00;
                Context A0B = C36371kC.A0B(textEmojiLabel);
                String A18 = C36431kI.A18(textEmojiLabel);
                String str = r15.A03;
                C40691vx r6 = ((AnonymousClass33D) this.A00).A00;
                List list2 = r6.A06;
                int size = list2.size();
                int i2 = R.string.f12nameremoved;
                if (size > 1) {
                    i2 = R.string.f12nameremoved;
                }
                int size2 = list2.size();
                int i3 = R.string.f12nameremoved;
                if (size2 > 1) {
                    i3 = R.string.f12nameremoved;
                }
                AnonymousClass3W8 r37 = AnonymousClass3W8.A00;
                C89624Xg r24 = new C89624Xg(r6, A18, str, 1);
                AnonymousClass00C.A0D(r37, 3);
                C39001qm A002 = AnonymousClass3LW.A00(A0B);
                A002.A0Z(A0B.getString(i2));
                A002.A0Q(r37, A0B.getString(R.string.f12nameremoved));
                A002.A0S(r24, A0B.getString(i3));
                C36341k9.A11(A002);
                break;
            case 12:
                C48022gZ r38 = (C48022gZ) this.A01;
                List list3 = AnonymousClass0D3.A0I;
                AnonymousClass4UI r25 = ((C48282h0) this.A00).A06;
                UserJid userJid = r38.A01.A09;
                AnonymousClass00C.A08(userJid);
                r25.BhV(userJid, r38.A05);
                break;
            case 13:
                List list4 = AnonymousClass0D3.A0I;
                C32101cy r16 = ((C48292h1) this.A00).A06;
                UserJid userJid2 = ((C48022gZ) this.A01).A01.A09;
                AnonymousClass00C.A08(userJid2);
                r16.BhV(userJid2, false);
                break;
            default:
                List list5 = AnonymousClass0D3.A0I;
                C32111cz r26 = ((AnonymousClass2h4) this.A00).A03;
                C48022gZ r39 = (C48022gZ) ((C48032ga) this.A01);
                UserJid userJid3 = r39.A01.A09;
                AnonymousClass00C.A08(userJid3);
                r26.BhV(userJid3, r39.A05);
                break;
        }
        Bundle A072 = AnonymousClass001.A07();
        AnonymousClass3UJ.A08(A072, r3.A1J);
        CommentActionsBottomSheet commentActionsBottomSheet = new CommentActionsBottomSheet();
        commentActionsBottomSheet.A17(A072);
        r2.Btm(commentActionsBottomSheet);
        return true;
    }
}
