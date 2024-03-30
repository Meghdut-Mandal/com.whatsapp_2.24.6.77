package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Kk  reason: invalid class name and case insensitive filesystem */
public abstract class C43922Kk extends AnonymousClass24N {
    public FrameLayout A00;
    public C61333Bl A01;
    public KeyboardPopupLayout A02;
    public AnonymousClass2IR A03;
    public AnonymousClass3HC A04;
    public MessageSelectionDropDownRecyclerView A05;
    public Configuration A06;
    public final AnonymousClass00T A07 = C36431kI.A1I(new C83764Aq(this));
    public final AnonymousClass00T A08 = C54252se.A00(this, "EXTRA_CUSTOMIZER_ID", 0);
    public final AnonymousClass00T A09 = C54252se.A00(this, "EXTRA_INITIAL_TOP_MARGIN", 0);
    public final AnonymousClass00T A0A = C36431kI.A1I(new C83774Ar(this));
    public final AnonymousClass00T A0B = C54252se.A00(this, "EXTRA_MSG_PADDING_BOTTOM", 0);
    public final AnonymousClass00T A0C = C54252se.A00(this, "EXTRA_MSG_PADDING_END", 0);
    public final AnonymousClass00T A0D = C54252se.A00(this, "EXTRA_MSG_PADDING_START", 0);
    public final AnonymousClass00T A0E = C54252se.A00(this, "EXTRA_MSG_PADDING_TOP", 0);
    public final AnonymousClass00T A0F = C54252se.A00(this, "EXTRA_PROFILE_PICTURE_WIDTH", 0);
    public final AnonymousClass00T A0G = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4G8(this));
    public final AnonymousClass00T A0H = C36431kI.A1I(new C83784As(this));
    public final AnonymousClass00T A0I = C36431kI.A1I(new C83794At(this));
    public final AnonymousClass00T A0J = C54252se.A00(this, "EXTRA_START_MARGIN", 0);

    public static final void A07(View view) {
        AnonymousClass00C.A0D(view, 0);
        view.setEnabled(false);
        if (view instanceof ViewGroup) {
            Iterator A12 = C36381kD.A12(view);
            while (A12.hasNext()) {
                A07(C36431kI.A0K(A12));
            }
        }
    }

    public final void A3m() {
        C39721tO r9;
        C89474Wr r8;
        AnonymousClass2IR r82;
        AnonymousClass3PH r3;
        boolean z = this instanceof SingleSelectedMessageActivity;
        if (z) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) this;
            C39701tL r0 = singleSelectedMessageActivity.A07;
            r9 = null;
            if (r0 == null) {
                throw C36331k8.A0d("singleSelectedMessageViewModel");
            }
            AnonymousClass3T1 A0r = C36431kI.A0r(r0.A00);
            if (A0r != null) {
                C19460v5 r1 = singleSelectedMessageActivity.A00;
                if (r1 != null) {
                    if (!r1.A05() || !C36441kJ.A0f(r1).BLB(A0r.A1J.A00)) {
                        r3 = new AnonymousClass3PH();
                    } else {
                        C19460v5 r02 = singleSelectedMessageActivity.A00;
                        if (r02 != null) {
                            r3 = (AnonymousClass3PH) ((AnonymousClass1K4) C36441kJ.A0f(r02)).A09.getValue();
                        } else {
                            throw C36331k8.A0d("bonsaiUiUtilOptional");
                        }
                    }
                    r9 = (C39721tO) C36441kJ.A0b(singleSelectedMessageActivity).A00(C39721tO.class);
                    List A11 = C36371kC.A11(A0r);
                    AnonymousClass2Jf r03 = singleSelectedMessageActivity.A06;
                    if (r03 != null) {
                        r9.A0S(r3, r03, A11);
                    } else {
                        throw C36331k8.A0d("dropDownMessageSelectionActionRepository");
                    }
                } else {
                    throw C36331k8.A0d("bonsaiUiUtilOptional");
                }
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) this;
            SelectedImageAlbumViewModel selectedImageAlbumViewModel = selectedImageAndVideoAlbumActivity.A03;
            r9 = null;
            if (selectedImageAlbumViewModel == null) {
                throw C36331k8.A0d("selectedImageAlbumViewModel");
            }
            Collection collection = (Collection) selectedImageAlbumViewModel.A00.A04();
            if (collection != null) {
                r9 = (C39721tO) C36441kJ.A0b(selectedImageAndVideoAlbumActivity).A00(C39721tO.class);
                AnonymousClass3PH r12 = new AnonymousClass3PH();
                AnonymousClass2Jf r04 = selectedImageAndVideoAlbumActivity.A02;
                if (r04 != null) {
                    r9.A0S(r12, r04, collection);
                } else {
                    throw C36331k8.A0d("dropDownMessageSelectionActionRepository");
                }
            }
        }
        if (r9 == null) {
            setResult(0, (Intent) null);
            finish();
        } else {
            C66033Uk.A00(this, r9.A03, C53102qm.A02(this, 20), 18);
            View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, A3i(), false);
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView");
            MessageSelectionDropDownRecyclerView messageSelectionDropDownRecyclerView = (MessageSelectionDropDownRecyclerView) inflate;
            AnonymousClass00C.A0D(messageSelectionDropDownRecyclerView, 0);
            this.A05 = messageSelectionDropDownRecyclerView;
            MessageSelectionDropDownRecyclerView A3j = A3j();
            C18820ts r10 = this.A00;
            AnonymousClass00C.A07(r10);
            if (z) {
                r8 = new C89474Wr((SingleSelectedMessageActivity) this);
            } else {
                r8 = new C89474Wr((SelectedImageAndVideoAlbumActivity) this);
            }
            A3j.A01 = r9;
            C40841wC r5 = new C40841wC(C36371kC.A0B(A3j), this, r8, r9, r10);
            A3j.A00 = r5;
            A3j.setAdapter(r5);
            A3j.getContext();
            C36321k7.A0Q(A3j);
        }
        C61333Bl r32 = this.A01;
        if (r32 != null) {
            AnonymousClass3QY A002 = r32.A00(getSupportFragmentManager(), AnonymousClass2XJ.A01(this.A04));
            C89004Uw r52 = (C89004Uw) this.A07.getValue();
            if (z) {
                SingleSelectedMessageActivity singleSelectedMessageActivity2 = (SingleSelectedMessageActivity) this;
                AnonymousClass00C.A0D(r52, 1);
                C39701tL r05 = singleSelectedMessageActivity2.A07;
                if (r05 == null) {
                    throw C36331k8.A0d("singleSelectedMessageViewModel");
                }
                AnonymousClass3T1 A0r2 = C36431kI.A0r(r05.A00);
                if (A0r2 != null) {
                    r82 = A002.A03(singleSelectedMessageActivity2, r52, A0r2);
                }
                setResult(0, (Intent) null);
                finish();
                return;
            }
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity2 = (SelectedImageAndVideoAlbumActivity) this;
            boolean A1V = C36371kC.A1V(r52);
            AnonymousClass2bU A012 = SelectedImageAndVideoAlbumActivity.A01(selectedImageAndVideoAlbumActivity2);
            if (A012 != null) {
                r82 = AnonymousClass3QY.A00(selectedImageAndVideoAlbumActivity2, C51752oK.TOP, A002, r52, A012);
                if (r82 instanceof AnonymousClass2IC) {
                    C43482Hx r13 = (C43482Hx) r82;
                    SelectedImageAlbumViewModel selectedImageAlbumViewModel2 = selectedImageAndVideoAlbumActivity2.A03;
                    if (selectedImageAlbumViewModel2 == null) {
                        throw C36331k8.A0d("selectedImageAlbumViewModel");
                    }
                    r13.A2F(C36401kF.A0w(selectedImageAlbumViewModel2.A00), A1V);
                }
            }
            setResult(0, (Intent) null);
            finish();
            return;
            BaseBundle baseBundle = (BaseBundle) this.A0G.getValue();
            r82.A1g(baseBundle.getInt("EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE", -1));
            C89004Uw r4 = r82.A0c;
            if (r4 != null) {
                r4.BrT(r82.getFMessage(), baseBundle.getInt("EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT", 1));
            }
            r82.A1Y();
            AnonymousClass1JZ.A07(r82, this.A00, C36331k8.A02(this.A0D), C36331k8.A02(this.A0E), C36331k8.A02(this.A0C), C36331k8.A02(this.A0B));
            A07(r82);
            r82.A1b();
            r82.setEnabled(true);
            r82.A2M = false;
            C66963Xz.A00(r82, this, 32);
            A3i().addView(r82);
            ViewGroup.MarginLayoutParams A0N = C36411kG.A0N(r82);
            A0N.width = C36331k8.A02(this.A0I);
            A0N.height = C36331k8.A02(this.A0H);
            A0N.topMargin = C36331k8.A02(this.A09);
            r82.setLayoutParams(A0N);
            this.A03 = r82;
            A3l();
            return;
        }
        throw C36331k8.A0d("conversationRowInflaterFactory");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.A06;
        if (!(configuration2 != null && configuration.screenWidthDp == configuration2.screenWidthDp && configuration.screenHeightDp == configuration2.screenHeightDp)) {
            setResult(0, (Intent) null);
            finish();
        }
        this.A06 = configuration;
    }

    public final FrameLayout A3i() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw C36331k8.A0d("selectedMessageContainer");
    }

    public final MessageSelectionDropDownRecyclerView A3j() {
        MessageSelectionDropDownRecyclerView messageSelectionDropDownRecyclerView = this.A05;
        if (messageSelectionDropDownRecyclerView != null) {
            return messageSelectionDropDownRecyclerView;
        }
        throw C36331k8.A0d("messageSelectionDropDownRecyclerView");
    }

    public void A3k() {
        float measuredHeight;
        int x;
        AnonymousClass2IR r4 = this.A03;
        if (r4 != null) {
            C36351kA.A1B(A3j(), A3i().getWidth() - C36331k8.A02(this.A0F), Integer.MIN_VALUE);
            MessageSelectionDropDownRecyclerView A3j = A3j();
            float y = r4.getY();
            AnonymousClass2IR r2 = this.A03;
            if (r2 == null) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = ((float) r2.getMeasuredHeight()) * r2.getScaleY();
            }
            A3j.setY(y + measuredHeight + ((float) C36331k8.A02(this.A0A)));
            int i = 8388613;
            if (C36351kA.A1Y(this.A00)) {
                i = 8388611;
            }
            C36391kE.A1G(A3j(), A3i(), -2, i);
            if (A3n()) {
                View view = r4.A0b;
                x = (((int) view.getX()) + view.getWidth()) - A3j().getMeasuredWidth();
            } else {
                x = (int) r4.A0b.getX();
            }
            MessageSelectionDropDownRecyclerView A3j2 = A3j();
            ViewGroup.MarginLayoutParams A0N = C36411kG.A0N(A3j2);
            A0N.leftMargin = x;
            A3j2.setLayoutParams(A0N);
        }
    }

    public boolean A3n() {
        if (this instanceof SingleSelectedMessageActivity) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) this;
            C39701tL r0 = singleSelectedMessageActivity.A07;
            if (r0 == null) {
                throw C36331k8.A0d("singleSelectedMessageViewModel");
            }
            AnonymousClass3T1 A0r = C36431kI.A0r(r0.A00);
            if (A0r == null || A0r.A1J.A02 != C36351kA.A1Y(singleSelectedMessageActivity.A00)) {
                return false;
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) this;
            AnonymousClass2bU A012 = SelectedImageAndVideoAlbumActivity.A01(selectedImageAndVideoAlbumActivity);
            if (A012 == null || A012.A1J.A02 != C36351kA.A1Y(selectedImageAndVideoAlbumActivity.A00)) {
                return false;
            }
        }
        return true;
    }

    public void A3l() {
        A3i().post(new C81103wT((Object) this, 44));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.f1nameremoved);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.f1nameremoved, 0);
        if (getIntent() == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        setContentView((int) R.layout.f9nameremoved);
        C36361kB.A0C(this).setBackgroundColor(C015006m.A00(getTheme(), getResources(), R.color.f6nameremoved));
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) C36361kB.A0D(this, R.id.selected_message_keyboard_popup_layout);
        AnonymousClass00C.A0D(keyboardPopupLayout, 0);
        this.A02 = keyboardPopupLayout;
        FrameLayout frameLayout = (FrameLayout) C36361kB.A0D(this, R.id.selected_message_container);
        AnonymousClass00C.A0D(frameLayout, 0);
        this.A00 = frameLayout;
        C66963Xz.A00(A3i(), this, 33);
        AnonymousClass1JZ.A03(A3i(), C36331k8.A02(this.A0J), 0);
    }

    public void onResume() {
        super.onResume();
        this.A06 = AnonymousClass000.A0U(this);
    }
}
