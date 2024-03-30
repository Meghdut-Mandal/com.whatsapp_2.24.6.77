package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Yp  reason: invalid class name and case insensitive filesystem */
public class C67123Yp implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C67123Yp(Context context, View view, C18820ts r9, C20810yC r10, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A07 = 3;
        this.A04 = view;
        this.A03 = statusPlaybackBaseFragment;
        this.A00 = new int[2];
        this.A01 = new int[2];
        this.A05 = new C07200Ws(context, view, C36421kH.A01(C36351kA.A1Y(r9) ? 1 : 0), 0, C55822vF.A00(r10));
        this.A02 = new C90104Zc(this, 32);
    }

    public void onClick(View view) {
        AnonymousClass3T1 r0;
        Boolean bool;
        switch (this.A07) {
            case 0:
                C225314u r4 = (C225314u) this.A04;
                if (r4 != null) {
                    View.OnClickListener onClickListener = (View.OnClickListener) this.A03;
                    if ((onClickListener instanceof C48912iG) && ((C48912iG) onClickListener).A01 == 44) {
                        ((C19770wU) this.A05).Boy(C80233v4.A00(this, 9));
                    }
                    AnonymousClass1K6 r3 = (AnonymousClass1K6) this.A00;
                    AnonymousClass4WW r2 = new AnonymousClass4WW(view, this, 1);
                    if (!((C25681Hg) r3.A07.get()).A01()) {
                        r4.Btm(new BonsaiWaitlistUnavailableBottomSheet());
                        return;
                    }
                    AnonymousClass1K6.A00(r4, r2, r3, C51412nm.AGENT, C36371kC.A0p());
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.A03;
                C87184Nu r22 = (C87184Nu) this.A05;
                DialogFragment dialogFragment = (DialogFragment) this.A06;
                AnonymousClass00C.A0D(dialogFragment, 6);
                AnonymousClass3RY.A00((Context) this.A01, drawable, (TextEmojiLabel) this.A02, r22, (AnonymousClass3P8) this.A04);
                dialogFragment.A1b();
                return;
            case 2:
                View view2 = (View) this.A00;
                AnonymousClass141 r9 = (AnonymousClass141) this.A01;
                AnonymousClass1NG r8 = (AnonymousClass1NG) this.A02;
                C20800yB r7 = (C20800yB) this.A03;
                C33201et r5 = (C33201et) this.A04;
                C225014r r42 = (C225014r) this.A05;
                Activity activity = (Activity) this.A06;
                C18740tg.A06(r9);
                UserJid A0l = C36351kA.A0l(r9);
                C18740tg.A06(A0l);
                boolean A0O = r8.A0O(A0l);
                String str = "block_header_chat";
                boolean A0C = r9.A0C();
                if (A0O) {
                    if (A0C) {
                        str = "biz_block_header_chat";
                    }
                    r8.A0G(activity, r9, str, false);
                    return;
                } else if (A0C) {
                    Context context = view2.getContext();
                    Context context2 = view2.getContext();
                    AnonymousClass00C.A0D(r7, 0);
                    context.startActivity(AnonymousClass190.A0x(context2, A0l, "biz_block_header_chat", false, r7.A0E(6185), false, false));
                    return;
                } else {
                    AnonymousClass3F5 B3t = r5.B3t(A0l, str);
                    B3t.A04 = true;
                    B3t.A05 = false;
                    B3t.A01(0, 1);
                    r42.Btm(AnonymousClass3F5.A00(B3t));
                    return;
                }
            default:
                if (this.A06 == null) {
                    ViewTreeObserver viewTreeObserver = ((View) this.A04).getViewTreeObserver();
                    this.A06 = viewTreeObserver;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.A02);
                    }
                }
                int[] iArr = (int[]) this.A00;
                ((View) this.A04).getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) this.A01;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                C07200Ws r52 = (C07200Ws) this.A05;
                C016307a r43 = r52.A03;
                r43.clear();
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
                List list = statusPlaybackContactFragment.A0n;
                if (!(list == null || (r0 = (AnonymousClass3T1) C007103b.A0P(list, statusPlaybackContactFragment.A00)) == null)) {
                    AnonymousClass3LC A032 = StatusPlaybackContactFragment.A03(r0, statusPlaybackContactFragment);
                    if (!statusPlaybackContactFragment.A0s || !(A032 instanceof C47572f9)) {
                        UserJid userJid = statusPlaybackContactFragment.A0R;
                        if (userJid != null) {
                            AnonymousClass1CR r02 = statusPlaybackContactFragment.A0W;
                            if (r02 != null) {
                                bool = Boolean.valueOf(r02.A0l(userJid));
                            } else {
                                throw C36331k8.A0d("chatSettingsStore");
                            }
                        } else {
                            bool = null;
                        }
                        boolean A1X = C36371kC.A1X(bool, true);
                        int i = R.id.menuitem_conversations_mute;
                        int i2 = R.string.f12nameremoved;
                        if (A1X) {
                            i = R.id.menuitem_conversations_unmute;
                            i2 = R.string.f12nameremoved;
                        }
                        r43.add(0, i, 0, i2);
                        UserJid userJid2 = statusPlaybackContactFragment.A0R;
                        if ((userJid2 instanceof PhoneUserJid) && userJid2 != C223613z.A00) {
                            r43.add(0, (int) R.id.menuitem_conversations_message_contact, 0, (int) R.string.f12nameremoved);
                            r43.add(0, (int) R.id.menuitem_conversations_voice_call_contact, 0, (int) R.string.f12nameremoved);
                            if (statusPlaybackContactFragment.A0d != null) {
                                r43.add(0, (int) R.id.menuitem_conversations_video_call_contact, 0, (int) R.string.f12nameremoved);
                                r43.add(0, (int) R.id.menuitem_conversations_contact_info, 0, (int) R.string.f12nameremoved);
                                r43.add(0, (int) R.id.menuitem_report_status, 0, (int) R.string.f12nameremoved);
                            } else {
                                throw C36331k8.A0d("systemFeatures");
                            }
                        }
                    } else {
                        C47572f9 r92 = (C47572f9) A032;
                        r43.add(0, (int) R.id.menuitem_forward, 0, (int) R.string.f12nameremoved);
                        AnonymousClass3T1 r1 = r92.A05;
                        if (r1 != null && r92.A0D.A02() && r92.A0C.A07(3, Collections.singletonList(r1))) {
                            r43.add(0, (int) R.id.menuitem_share_status_facebook, 0, (int) R.string.f12nameremoved);
                        }
                        if (!r92.A03.A0L() || (C19980wp.A00(r92.A06).getBoolean("post_status_in_companion", false) && r92.A0G.A0E(4905))) {
                            r43.add(0, (int) R.id.menuitem_delete, 0, (int) R.string.f12nameremoved);
                        }
                    }
                }
                r52.A00 = new C89974Yp(this, 2);
                r52.A01 = new AnonymousClass4Y5(this, 1);
                r52.A00();
                statusPlaybackBaseFragment.A06 = true;
                statusPlaybackBaseFragment.A1a();
                return;
        }
    }

    public C67123Yp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }
}
