package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onInput$2;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.ArrayList;

/* renamed from: X.4WK  reason: invalid class name */
public class AnonymousClass4WK extends C66803Xj {
    public Object A00;
    public Object A01;
    public final int A02;

    public static AnimationSet A00(boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        ScaleAnimation scaleAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (!z2) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(100);
        animationSet.addAnimation(alphaAnimation);
        float f = 0.0f;
        if (z2) {
            if (z) {
                f = 1.0f;
            }
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, f, 1, 0.5f);
        } else {
            if (z) {
                f = 1.0f;
            }
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, f, 1, 0.5f);
        }
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    public AnonymousClass4WK(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        Object value;
        AnonymousClass3QM r2;
        Object value2;
        AnonymousClass3QM r22;
        AnonymousClass3EH r1;
        GridLayout gridLayout;
        Editable editable2 = editable;
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(editable2, 0);
                AnonymousClass3QT r12 = (AnonymousClass3QT) this.A01;
                AnonymousClass3UG.A07(r12.A02, ((TextView) this.A00).getPaint(), editable2, r12.A09, 1.3f);
                return;
            case 1:
                AnonymousClass00C.A0D(editable2, 0);
                String obj = editable2.toString();
                CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this.A01;
                C40001uV r5 = (C40001uV) commentsBottomSheet.A0U.getValue();
                AnonymousClass00C.A0D(obj, 0);
                if (AnonymousClass14B.A0F(obj)) {
                    AnonymousClass05L r4 = r5.A0Q;
                    do {
                        value2 = r4.getValue();
                        r22 = (AnonymousClass3QM) value2;
                    } while (!r4.B3B(value2, new AnonymousClass3QM(r22.A01, r22.A02, r22.A03, r22.A04, r22.A00, false)));
                } else {
                    C36331k8.A1T(new CommentsBottomSheetViewModel$onInput$2(r5, (C023509x) null), C109325Xd.A00(r5));
                    AnonymousClass05L r42 = r5.A0Q;
                    do {
                        value = r42.getValue();
                        r2 = (AnonymousClass3QM) value;
                    } while (!r42.B3B(value, new AnonymousClass3QM(r2.A01, r2.A02, r2.A03, r2.A04, r2.A00, true)));
                }
                Context A0a = commentsBottomSheet.A0a();
                AnonymousClass1H2 r9 = commentsBottomSheet.A0G;
                if (r9 != null) {
                    C21060yb r8 = commentsBottomSheet.A08;
                    if (r8 != null) {
                        C19890wg r10 = commentsBottomSheet.A0J;
                        if (r10 != null) {
                            TextPaint paint = ((TextView) this.A00).getPaint();
                            if (commentsBottomSheet.A0F != null) {
                                AnonymousClass6YV.A0F(A0a, editable2, paint, r8, r9, r10, R.color.f6nameremoved, C36331k8.A1b(commentsBottomSheet.A0W));
                                return;
                            }
                            throw C36331k8.A0d("emojiRichFormatterStaticCaller");
                        }
                        throw C36331k8.A0d("sharedPreferencesFactory");
                    }
                    throw C36331k8.A0W();
                }
                throw C36331k8.A0d("emojiLoader");
            case 2:
                ((View) this.A01).setEnabled(!AnonymousClass14B.A0F(editable2.toString()));
                return;
            case 5:
                String obj2 = editable2.toString();
                boolean isEmpty = TextUtils.isEmpty(obj2);
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                AnonymousClass1X4 r13 = messageReplyActivity.A0D;
                AnonymousClass11F A0j = C36351kA.A0j((AnonymousClass141) this.A01);
                if (!isEmpty) {
                    r13.A0K(A0j, 0);
                } else {
                    r13.A0J(A0j);
                }
                AnonymousClass1H2 r43 = messageReplyActivity.A0C;
                Editable editable3 = editable2;
                AnonymousClass6YV.A0F(messageReplyActivity, editable3, messageReplyActivity.A0o.getPaint(), messageReplyActivity.A08, r43, messageReplyActivity.A0s, R.color.f6nameremoved, messageReplyActivity.A1H);
                boolean A0F = AnonymousClass14B.A0F(obj2);
                messageReplyActivity.A0T.A0V(A0F);
                if (!A0F) {
                    MessageReplyActivity.A0h(messageReplyActivity);
                } else if (messageReplyActivity.A1K) {
                    if (C36381kD.A1X(messageReplyActivity)) {
                        if (messageReplyActivity.A0x == C52592pg.EMOJI) {
                            gridLayout = messageReplyActivity.A06;
                        } else {
                            gridLayout = messageReplyActivity.A05;
                        }
                        AnimatorSet A0C = C36441kJ.A0C();
                        ArrayList A0I = AnonymousClass001.A0I();
                        if (gridLayout != null) {
                            for (int i = 0; i < gridLayout.getChildCount(); i++) {
                                ObjectAnimator A05 = C36401kF.A05(gridLayout.getChildAt(i), 1.0f);
                                A05.setDuration(150);
                                A05.setInterpolator(MessageReplyActivity.A1d);
                                A0I.add(A05);
                            }
                        }
                        View view = messageReplyActivity.A02;
                        if (view != null) {
                            ObjectAnimator A052 = C36401kF.A05(view, 1.0f);
                            A052.setDuration(150);
                            A052.setInterpolator(MessageReplyActivity.A1d);
                            A0I.add(A052);
                        }
                        A0C.playTogether(A0I);
                        A0C.start();
                    } else {
                        messageReplyActivity.A04.setVisibility(0);
                    }
                }
                if (messageReplyActivity.A1J != A0F && messageReplyActivity.A1B.BJo()) {
                    messageReplyActivity.A1J = A0F;
                    ImageButton imageButton = messageReplyActivity.A09;
                    boolean A1Y = C36351kA.A1Y(messageReplyActivity.A00);
                    if (A0F) {
                        imageButton.startAnimation(AnonymousClass3SS.A00(A1Y, true, false));
                        messageReplyActivity.A07.startAnimation(A00(C36351kA.A1Y(messageReplyActivity.A00), true));
                        messageReplyActivity.A07.setVisibility(0);
                    } else {
                        imageButton.startAnimation(AnonymousClass3SS.A00(A1Y, false, false));
                        messageReplyActivity.A07.startAnimation(A00(C36351kA.A1Y(messageReplyActivity.A00), false));
                        messageReplyActivity.A07.setVisibility(8);
                    }
                }
                if (messageReplyActivity.A14.A01() && (r1 = messageReplyActivity.A15) != null && messageReplyActivity.A0b.A02) {
                    r1.A00(obj2);
                    return;
                }
                return;
            default:
                super.afterTextChanged(editable2);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        View view;
        boolean z;
        WaEditText waEditText;
        switch (this.A02) {
            case 3:
                view = ((InteropComposeEnterInfoActivity) this.A01).A0F;
                if (view != null) {
                    z = AnonymousClass000.A1X(((C006302t) this.A00).invoke(charSequence));
                    break;
                } else {
                    throw C36331k8.A0d("createChatButton");
                }
            case 4:
                AnonymousClass00C.A0D(charSequence, 0);
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A01;
                Runnable runnable = stickerSearchDialogFragment.A0C;
                if (!(runnable == null || (waEditText = stickerSearchDialogFragment.A05) == null)) {
                    waEditText.removeCallbacks(runnable);
                }
                View view2 = (View) this.A00;
                AnonymousClass736 r3 = new AnonymousClass736(stickerSearchDialogFragment, charSequence, view2, 41);
                stickerSearchDialogFragment.A0C = r3;
                WaEditText waEditText2 = stickerSearchDialogFragment.A05;
                if (waEditText2 != null) {
                    waEditText2.postDelayed(r3, 500);
                }
                view2.setVisibility(0);
                return;
            case 6:
                view = (View) this.A01;
                z = AnonymousClass000.A1R(charSequence.length());
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
        view.setEnabled(z);
    }
}
