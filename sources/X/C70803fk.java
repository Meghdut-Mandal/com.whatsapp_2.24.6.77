package X;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.3fk  reason: invalid class name and case insensitive filesystem */
public class C70803fk implements AnonymousClass4Q1 {
    public static final C594934d A7b = new C594934d(true, true);
    public static final HashMap A7c = AnonymousClass001.A0J();
    public static final HashMap A7d = AnonymousClass001.A0J();
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06;
    public long A07 = -1;
    public ObjectAnimator A08 = null;
    public BroadcastReceiver A09;
    public Intent A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public ViewGroup A0Q;
    public ViewGroup A0R;
    public ViewGroup A0S;
    public ViewGroup A0T;
    public ViewGroup A0U;
    public ViewGroup A0V;
    public ViewGroup A0W;
    public ViewGroup A0X;
    public FrameLayout A0Y;
    public FrameLayout A0Z;
    public ImageButton A0a;
    public ImageButton A0b;
    public ImageButton A0c;
    public ImageButton A0d;
    public LinearLayout A0e;
    public TextView A0f;
    public TextView A0g;
    public C009904e A0h = null;
    public AnonymousClass0V9 A0i;
    public Toolbar A0j;
    public C06360Th A0k = null;
    public C001600r A0l;
    public C39501sW A0m;
    public BottomSheetBehavior A0n;
    public C19460v5 A0o;
    public C19460v5 A0p;
    public C19460v5 A0q;
    public C19460v5 A0r;
    public C19460v5 A0s;
    public C19460v5 A0t;
    public AnonymousClass1NC A0u;
    public AnonymousClass18S A0v;
    public C24801Dv A0w;
    public C32621dv A0x;
    public AnonymousClass1N4 A0y;
    public C19700wN A0z;
    public C56972xS A10;
    public C56982xT A11;
    public C57082xf A12;
    public C57282xz A13;
    public C57292y0 A14;
    public C57302y1 A15;
    public C61393Br A16;
    public C57322y3 A17;
    public C57352y6 A18;
    public C57362y7 A19;
    public C57372y8 A1A;
    public C57382y9 A1B;
    public C57402yB A1C;
    public C57412yC A1D;
    public C57422yD A1E;
    public C57432yE A1F;
    public C57442yF A1G;
    public C57462yH A1H;
    public C57472yI A1I;
    public C57482yJ A1J;
    public C57502yL A1K;
    public AnonymousClass60O A1L;
    public C57512yM A1M;
    public C57522yN A1N;
    public C57532yO A1O;
    public C57542yP A1P;
    public C57552yQ A1Q;
    public AnonymousClass3C1 A1R;
    public AnonymousClass3C6 A1S;
    public AnonymousClass3C7 A1T;
    public AnonymousClass17Y A1U;
    public KeyboardPopupLayout A1V;
    public C19730wQ A1W;
    public C21360z5 A1X;
    public AnonymousClass3DY A1Y;
    public AnonymousClass1XY A1Z;
    public AnonymousClass13T A1a;
    public C20050ww A1b;
    public TextEmojiLabel A1c;
    public TextEmojiLabel A1d;
    public AnonymousClass1LI A1e;
    public AnonymousClass1X4 A1f;
    public WaEditText A1g;
    public C28961Uu A1h;
    public AnonymousClass1RU A1i;
    public C129036Er A1j;
    public C39441sH A1k;
    public C22909AyL A1l;
    public C63553Km A1m;
    public C26421Kc A1n;
    public AnonymousClass9XI A1o;
    public C194289Oy A1p = null;
    public AnonymousClass4PE A1q;
    public C167497y9 A1r;
    public AnonymousClass2ZL A1s;
    public C64723Pe A1t;
    public C29461Ws A1u;
    public AnonymousClass9Y1 A1v;
    public C89034Uz A1w;
    public C195119So A1x;
    public C603337l A1y;
    public AnonymousClass1NG A1z;
    public C33201et A20;
    public BotEmbodimentViewModel A21;
    public C38531pF A22;
    public BonsaiPromptsViewModel A23;
    public C39921uG A24;
    public AnonymousClass1ND A25;
    public AnonymousClass1PW A26;
    public AnonymousClass1MK A27;
    public C24361Cd A28;
    public C32211dA A29;
    public C87494Pa A2A;
    public AnonymousClass1LV A2B;
    public ConversationCommunityViewModel A2C;
    public C74113l5 A2D;
    public C20230xE A2E;
    public AnonymousClass1Q7 A2F;
    public C207109uZ A2G = null;
    public AnonymousClass1Pp A2H;
    public AnonymousClass16I A2I;
    public AnonymousClass185 A2J;
    public C235618y A2K;
    public AnonymousClass1RY A2L;
    public C27761Ps A2M;
    public C20430xY A2N;
    public C33751fs A2O;
    public AnonymousClass28d A2P;
    public AnonymousClass28e A2Q;
    public AnonymousClass3AC A2R;
    public C63193Jc A2S;
    public C62083Es A2T;
    public ConversationListView A2U;
    public AnonymousClass3NY A2V;
    public AnonymousClass319 A2W;
    public AnonymousClass1Y3 A2X;
    public AnonymousClass3CN A2Y;
    public C62313Fr A2Z;
    public AnonymousClass1NM A2a;
    public C53852rz A2b;
    public C16280ou A2c;
    public AnonymousClass3AE A2d;
    public MessageSelectionViewModel A2e;
    public AnonymousClass2ZM A2f;
    public C201709k9 A2g;
    public C30791am A2h;
    public AnonymousClass34K A2i;
    public AnonymousClass382 A2j;
    public AnonymousClass3AV A2k;
    public AnonymousClass4V6 A2l;
    public AnonymousClass3AF A2m;
    public C65593Sr A2n;
    public C61023Ag A2o;
    public C62093Et A2p;
    public C43642Jg A2q;
    public AnonymousClass1G5 A2r;
    public AnonymousClass31Q A2s;
    public C39951uL A2t;
    public C39821ts A2u;
    public ConversationSearchViewModel A2v;
    public AnonymousClass3FY A2w;
    public C40061uh A2x;
    public C39941uJ A2y;
    public C39471sS A2z;
    public C24341Cb A30;
    public C21060yb A31;
    public AnonymousClass1MP A32;
    public C19970wo A33;
    public C25271Fq A34;
    public C19420v0 A35;
    public C18820ts A36;
    public CountryGatingViewModel A37;
    public C21860zv A38;
    public C26151Jb A39;
    public C599936b A3A;
    public C25851Hx A3B;
    public AnonymousClass1I2 A3C;
    public AnonymousClass3PE A3D;
    public AnonymousClass3HK A3E;
    public C25871Hz A3F;
    public AnonymousClass1I7 A3G;
    public AnonymousClass1I4 A3H;
    public AnonymousClass3HG A3I;
    public C24531Cu A3J;
    public C220712t A3K;
    public AnonymousClass1DP A3L;
    public AnonymousClass1JB A3M;
    public AnonymousClass1ER A3N;
    public C220412q A3O;
    public AnonymousClass1A5 A3P;
    public AnonymousClass165 A3Q;
    public C20310xM A3R;
    public AnonymousClass1A4 A3S;
    public C20650xu A3T;
    public C24541Cv A3U;
    public AnonymousClass12P A3V;
    public AnonymousClass17U A3W;
    public AnonymousClass1YR A3X;
    public AnonymousClass141 A3Y;
    public AnonymousClass12O A3Z;
    public C236419g A3a;
    public C64733Pf A3b;
    public AnonymousClass6O1 A3c;
    public AnonymousClass1XN A3d;
    public AnonymousClass1H2 A3e;
    public EmojiSearchKeyboardContainer A3f;
    public EmojiSearchProvider A3g;
    public C62383Fy A3h;
    public AnonymousClass1TD A3i;
    public BaseExpressionsBottomSheet A3j;
    public C125375zo A3k;
    public ExpressionsBottomSheetView A3l;
    public C609439y A3m;
    public C20810yC A3n;
    public C20500xf A3o;
    public C54352so A3p;
    public AnonymousClass3HH A3q;
    public AnonymousClass2M8 A3r;
    public AnonymousClass2MC A3s;
    public AnonymousClass1GZ A3t;
    public AnonymousClass3L7 A3u;
    public C24511Cs A3v;
    public C233117z A3w;
    public C589931v A3x;
    public C39281rd A3y = null;
    public AnonymousClass1JL A3z;
    public AnonymousClass1CF A40;
    public C61813Dn A41;
    public C65573Sp A42;
    public AnonymousClass2aL A43;
    public C32881eL A44;
    public AnonymousClass11F A45;
    public AnonymousClass1DU A46;
    public AnonymousClass2XH A47;
    public AnonymousClass1D5 A48;
    public AnonymousClass1D0 A49;
    public AnonymousClass1YL A4A;
    public MentionableEntry A4B;
    public AnonymousClass19I A4C;
    public C20720y3 A4D;
    public WhatsAppLibLoader A4E;
    public NewsletterLinkLauncher A4F;
    public AnonymousClass3UC A4G;
    public NewsletterViewModel A4H;
    public C28361Si A4I;
    public C34061gO A4J;
    public C20600xp A4K;
    public AnonymousClass6OW A4L;
    public AnonymousClass1LX A4M;
    public C61223Ba A4N;
    public AnonymousClass2ZN A4O;
    public C24601Db A4P;
    public C24631De A4Q;
    public AnonymousClass1EV A4R;
    public C29941Yp A4S;
    public C202179lC A4T;
    public AnonymousClass39O A4U;
    public C167527yC A4V;
    public PaymentMerchantAccountViewModel A4W;
    public AnonymousClass3EV A4X;
    public AnonymousClass1FR A4Y;
    public AnonymousClass1JD A4Z;
    public C28441Sr A4a;
    public AnonymousClass1JI A4b;
    public C78053rU A4c;
    public C63583Kp A4d;
    public C19890wg A4e;
    public C27361Nx A4f;
    public C24681Dj A4g;
    public C30921az A4h;
    public AnonymousClass3T1 A4i;
    public C237919w A4j;
    public C238019x A4k;
    public AnonymousClass3UB A4l;
    public AnonymousClass13I A4m;
    public C199859g8 A4n;
    public AnonymousClass1S3 A4o;
    public AnonymousClass1CR A4p;
    public AnonymousClass3T0 A4q;
    public C64883Pu A4r;
    public AnonymousClass1BB A4s;
    public AnonymousClass1AP A4t;
    public AnonymousClass3P6 A4u;
    public AnonymousClass3GT A4v;
    public C95494lK A4w;
    public C63513Ki A4x;
    public AnonymousClass3EH A4y;
    public C122815vT A4z;
    public AnonymousClass1YD A50;
    public C133356Xz A51;
    public AnonymousClass1A1 A52;
    public C20380xT A53;
    public AnonymousClass1C6 A54;
    public C39781tl A55;
    public AnonymousClass1N6 A56;
    public AnonymousClass1E4 A57;
    public ToSGatingViewModel A58;
    public C28081Rg A59;
    public C32811eE A5A;
    public AnonymousClass1Q0 A5B;
    public C64263Nh A5C;
    public C26371Jx A5D;
    public C64813Pn A5E;
    public AnonymousClass1GX A5F;
    public AnonymousClass1SV A5G;
    public C224214g A5H = null;
    public AnonymousClass13J A5I;
    public C131376Ou A5J;
    public AnonymousClass1RJ A5K;
    public AnonymousClass1RJ A5L;
    public AnonymousClass1RJ A5M;
    public AnonymousClass1RJ A5N;
    public AnonymousClass1RJ A5O;
    public AnonymousClass1RJ A5P;
    public AnonymousClass1RJ A5Q;
    public AnonymousClass1RJ A5R;
    public C19770wU A5S;
    public AnonymousClass5ND A5T;
    public C88974Ut A5U;
    public C62683Hc A5V;
    public AnonymousClass2ZD A5W;
    public C65813To A5X;
    public AnonymousClass2ZP A5Y;
    public AnonymousClass6YP A5Z;
    public C62493Gj A5a;
    public C27721Pm A5b;
    public AnonymousClass1KI A5c;
    public C31351bg A5d;
    public WDSButton A5e;
    public AnonymousClass005 A5f;
    public AnonymousClass005 A5g;
    public AnonymousClass005 A5h;
    public AnonymousClass005 A5i;
    public AnonymousClass005 A5j;
    public AnonymousClass005 A5k;
    public AnonymousClass005 A5l;
    public AnonymousClass005 A5m;
    public AnonymousClass005 A5n;
    public AnonymousClass005 A5o;
    public AnonymousClass005 A5p;
    public AnonymousClass005 A5q;
    public AnonymousClass005 A5r;
    public AnonymousClass005 A5s;
    public AnonymousClass005 A5t;
    public AnonymousClass005 A5u;
    public AnonymousClass005 A5v;
    public AnonymousClass005 A5w;
    public AnonymousClass005 A5x;
    public AnonymousClass005 A5y;
    public Boolean A5z;
    public Integer A60 = null;
    public Long A61;
    public Runnable A62;
    public Runnable A63;
    public String A64;
    public String A65;
    public boolean A66;
    public boolean A67;
    public boolean A68 = false;
    public boolean A69;
    public boolean A6A = false;
    public boolean A6B;
    public boolean A6C = false;
    public boolean A6D = false;
    public boolean A6E;
    public boolean A6F;
    public boolean A6G;
    public boolean A6H;
    public boolean A6I = false;
    public boolean A6J = false;
    public boolean A6K = false;
    public boolean A6L;
    public boolean A6M;
    public boolean A6N;
    public boolean A6O = false;
    public boolean A6P;
    public boolean A6Q = true;
    public boolean A6R;
    public boolean A6S = true;
    public boolean A6T;
    public boolean A6U = false;
    public boolean A6V;
    public boolean A6W = false;
    public boolean A6X = false;
    public boolean A6Y = false;
    public boolean A6Z;
    public boolean A6a;
    public long A6b = 0;
    public Handler A6c;
    public View A6d;
    public View A6e;
    public ImageView A6f;
    public ImageView A6g;
    public AnonymousClass0FM A6h;
    public C021809f A6i;
    public C50082kB A6j;
    public AnonymousClass3KZ A6k;
    public AnonymousClass36T A6l;
    public AnonymousClass383 A6m;
    public AnonymousClass28b A6n;
    public AnonymousClass3XU A6o;
    public AnonymousClass2g8 A6p;
    public C224214g A6q;
    public C18910u1 A6r;
    public AnonymousClass2j9 A6s;
    public boolean A6t = false;
    public boolean A6u;
    public boolean A6v = false;
    public final DataSetObserver A6w = new AnonymousClass4VP(this, 1);
    public final Handler A6x = C36341k9.A0H();
    public final Handler A6y = C36341k9.A0H();
    public final TextWatcher A6z = new AnonymousClass4WJ(this, 7);
    public final AnonymousClass026 A70 = new C89854Yd(this, 7);
    public final C88314Sf A71 = new C89604Xe(this, 3);
    public final AnonymousClass4Q4 A72 = new AnonymousClass3T4(this, 2);
    public final AnonymousClass1N0 A73 = new AnonymousClass1N1();
    public final AnonymousClass4T8 A74 = new C54632tG(this, 0);
    public final AnonymousClass3L8 A75 = new AnonymousClass4WD(this, 0);
    public final AnonymousClass190 A76 = C36441kJ.A0j();
    public final C22972AzO A77 = new C76083oI(this);
    public final C88234Rx A78 = new C55842vH(this, 0);
    public final AnonymousClass005 A79 = new AZ4((Object) null, new C65873Tu(this, 5));
    public final Runnable A7A = new C81103wT(this, 32);
    public final Set A7B = C36441kJ.A16();
    public final Set A7C = C36441kJ.A16();
    public final Stack A7D = new Stack();
    public final DatePickerDialog.OnDateSetListener A7E = new C55472ug(this, 0);
    public final TextWatcher A7F = new AnonymousClass4WJ(this, 5);
    public final TextWatcher A7G = new AnonymousClass4WJ(this, 6);
    public final View.OnClickListener A7H = C48742hy.A00(this, 22);
    public final View.OnClickListener A7I = new C66963Xz(this, 23);
    public final ViewTreeObserver.OnPreDrawListener A7J = new C89924Yk(this, 4);
    public final AbsListView.OnScrollListener A7K = new C67323Zj(this);
    public final TextView.OnEditorActionListener A7L = new C67423Zt(this);
    public final AnonymousClass16A A7M = new AnonymousClass3U3(this, 2);
    public final AnonymousClass31L A7N = new AnonymousClass31L(this);
    public final AnonymousClass3N2 A7O = new AnonymousClass3N2(this);
    public final AnonymousClass3N3 A7P = new AnonymousClass3N3(this);
    public final AnonymousClass31M A7Q = new AnonymousClass31M(this);
    public final AnonymousClass31N A7R = new AnonymousClass31N(this);
    public final AnonymousClass4UR A7S = new C89874Yf(this, 1);
    public final C61233Bb A7T = new AnonymousClass2ZR(this);
    public final C129156Fn A7U = new AnonymousClass4WH(this, 0);
    public final AnonymousClass3L3 A7V = new C50382kf(this);
    public final AnonymousClass1NK A7W = new AnonymousClass4YF(this, 2);
    public final Set A7X = C36441kJ.A16();
    public final Set A7Y = C36441kJ.A16();
    public final int[] A7Z = new int[2];
    public volatile Boolean A7a = null;

    public static void A0U(View view, ViewGroup viewGroup, C70803fk r13) {
        AnonymousClass3AE r2;
        C70803fk r8 = r13;
        r13.A23(r13.A1i(1));
        boolean z = false;
        ConversationListView conversationListView = r13.A2U;
        if (conversationListView != null) {
            z = conversationListView.A0B(0);
        }
        r13.A06 = -1;
        r13.A1V.setClipChildren(false);
        int transcriptMode = r13.A2U.getTranscriptMode();
        ViewGroup viewGroup2 = viewGroup;
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setDuration(250);
        View view2 = view;
        view.startAnimation(translateAnimation);
        if (viewGroup == r13.A0X && r13.A0T.getVisibility() == 0) {
            r13.A0T.startAnimation(translateAnimation);
        }
        if (viewGroup == r13.A0X && (r2 = r13.A2d) != null) {
            r2.A05.A03.setLayoutTransition((LayoutTransition) null);
        }
        if (r13.A4B.A0K) {
            r13.A0Y.startAnimation(translateAnimation);
        }
        if (z) {
            r13.A2U.setTranscriptMode(2);
            r13.A2U.startAnimation(translateAnimation);
        }
        View view3 = r13.A2R.A02;
        Drawable background = view3.getBackground();
        if (!(background instanceof C36991ld)) {
            background = new C36991ld(view3.getBackground());
            view3.setBackground(background);
        }
        C36991ld r3 = (C36991ld) background;
        r3.A00 = height;
        r3.invalidateSelf();
        C37671n1 r22 = new C37671n1(r13, r3, height);
        r22.setDuration(250);
        r13.A2R.A02.startAnimation(r22);
        r22.setAnimationListener(new C428921c(view2, viewGroup2, r8, transcriptMode, z));
    }

    public static void A0V(View view, ViewGroup viewGroup, C70803fk r9) {
        boolean z = false;
        C70803fk r4 = r9;
        ConversationListView conversationListView = r9.A2U;
        if (conversationListView != null) {
            z = conversationListView.A0B(0);
        }
        r9.A06 = 1;
        r9.A1V.setClipChildren(false);
        int transcriptMode = r9.A2U.getTranscriptMode();
        ConversationListView conversationListView2 = r9.A2U;
        if (z) {
            conversationListView2.setTranscriptMode(2);
        } else {
            conversationListView2.setTranscriptMode(0);
        }
        r9.A23(r9.A1i(0));
        viewGroup.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZP(view, viewGroup, r4, transcriptMode, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Y(com.whatsapp.TextEmojiLabel r5, X.C70803fk r6, boolean r7, boolean r8) {
        /*
            r2 = 0
            X.155 r3 = A0C(r6)
            X.0xf r1 = r6.A3o
            X.11F r0 = r6.A45
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 == 0) goto L_0x0033
            X.11F r1 = r6.A45
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0020
            X.1NG r0 = r6.A1z
            boolean r1 = X.C36351kA.A1X(r0, r1)
            r0 = 2131896083(0x7f122713, float:1.9427017E38)
            if (r1 != 0) goto L_0x0023
        L_0x0020:
            r0 = 2131896085(0x7f122715, float:1.9427021E38)
        L_0x0023:
            java.lang.String r0 = X.C44122Lf.A02(r3, r0)
            r5.setText(r0)
            X.1rU r0 = new X.1rU
            r0.<init>()
            X.C012005e.A0V(r5, r0)
            return
        L_0x0033:
            X.0yC r1 = r6.A3n
            X.11F r0 = r6.A45
            boolean r0 = X.AnonymousClass3RR.A00(r1, r0)
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0052
            X.155 r3 = A0C(r6)
            r2 = 2131894748(0x7f1221dc, float:1.942431E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r0 = X.C36391kE.A0v(r3, r0, r1, r4, r2)
        L_0x004e:
            r5.setText(r0)
            return
        L_0x0052:
            if (r8 == 0) goto L_0x005c
            r0 = 2131888631(0x7f1209f7, float:1.9411903E38)
        L_0x0057:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x004e
        L_0x005c:
            if (r7 == 0) goto L_0x0062
            r6.A0Z(r5, r2)
            return
        L_0x0062:
            X.11F r0 = r6.A45
            boolean r0 = r6.A1h(r0)
            if (r0 == 0) goto L_0x006e
            r0 = 2131894922(0x7f12228a, float:1.9424662E38)
            goto L_0x0057
        L_0x006e:
            r2 = 2131890059(0x7f120f8b, float:1.94148E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.155 r0 = A0C(r6)
            X.C36361kB.A0x(r0, r3, r1)
            android.text.Spanned r0 = X.AnonymousClass14B.A01(r3, r1, r2)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A0Y(com.whatsapp.TextEmojiLabel, X.3fk, boolean, boolean):void");
    }

    public static void A1L(C70803fk r14, boolean z) {
        C90284Zu r9 = new C90284Zu(r14, 1);
        AnonymousClass3AE r6 = new AnonymousClass3AE(A0C(r14), r14.A2l.getFMessageIO(), r9, r14.A2z, A0K(r14), r14.A2l.getGroupChatManager().A11.A01(), z);
        r14.A2d = r6;
        AnonymousClass3CT r5 = new AnonymousClass3CT(r14);
        AnonymousClass3HK r2 = r14.A3E;
        AnonymousClass11F r4 = r14.A45;
        ConversationListView conversationListView = r14.A2U;
        MentionableEntry mentionableEntry = r14.A4B;
        ViewGroup viewGroup = r14.A0X;
        KeyboardPopupLayout keyboardPopupLayout = r14.A1V;
        if (r2.A0U && !r2.A0E) {
            r2.A0A = r4;
            r2.A07 = r5;
            r2.A02 = conversationListView;
            r2.A03 = mentionableEntry;
            r2.A01 = viewGroup;
            r2.A06 = r6;
            Activity activity = r2.A0I;
            boolean A1S2 = AnonymousClass000.A1S(C36341k9.A04(activity), 2);
            if (r2.A0H != 2) {
                r2.A08 = (IcebreakerBubbleView) C03570Gk.A0B(activity, r2.A0G);
            } else if (!A1S2) {
                View inflate = LayoutInflater.from(activity).inflate(R.layout.f9nameremoved, viewGroup, false);
                r2.A00 = inflate;
                C18740tg.A04(inflate);
                r2.A05 = (ShimmerFrameLayout) C012005e.A02(inflate, R.id.shimmer);
                r2.A00.setVisibility(8);
                viewGroup.addView(r2.A00);
                AnonymousClass80Q r52 = new AnonymousClass80Q(activity, keyboardPopupLayout, viewGroup, mentionableEntry, new AnonymousClass31W(r2), r2.A0B);
                r2.A09 = r52;
                r52.setVisibility(8);
                r2.A0F = false;
                viewGroup.addView(r2.A09);
                mentionableEntry.addTextChangedListener(r2.A0J);
            }
            r2.A0E = true;
        }
        AnonymousClass398 r22 = (AnonymousClass398) A7c.get(C36411kG.A0h(r14.A3Y));
        if (r22 != null && (r22.A03 || r22.A04)) {
            AnonymousClass3HK r3 = r14.A3E;
            if (r3.A0E) {
                if (r3.A0H == 2) {
                    r3.A06.A05.setVisibility(8);
                    View view = r3.A00;
                    C18740tg.A04(view);
                    view.setVisibility(0);
                    ShimmerFrameLayout shimmerFrameLayout = r3.A05;
                    C18740tg.A04(shimmerFrameLayout);
                    shimmerFrameLayout.A03();
                } else {
                    IcebreakerBubbleView icebreakerBubbleView = r3.A08;
                    C18740tg.A04(icebreakerBubbleView);
                    icebreakerBubbleView.removeAllViews();
                    ((ShimmerFrameLayout) C012005e.A02(C36351kA.A0C(icebreakerBubbleView).inflate(R.layout.f9nameremoved, icebreakerBubbleView, true), R.id.shimmer)).A03();
                    icebreakerBubbleView.setVisibility(0);
                }
            }
        }
        r14.A0X.addView(r14.A2d.A05);
    }

    private void A1V(Integer num, Integer num2, Integer num3) {
        Integer num4 = num3;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A3l;
        if (expressionsBottomSheetView != null) {
            if (expressionsBottomSheetView.isShown()) {
                num4 = null;
            }
            Integer num5 = num;
            Integer num6 = num2;
            this.A3l.A0F(num4, num6, num5, C54212sa.A00(this.A45), A02(this));
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3f;
            if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
                this.A3f.A02();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.3XT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.3XT} */
    /* JADX WARNING: type inference failed for: r9v6, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r12v9, types: [X.155] */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ef, code lost:
        if (r10.A0I != null) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f1, code lost:
        r8 = r1.getIntExtra("provider", 0);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f8, code lost:
        if (r8 == 1) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fa, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fb, code lost:
        if (r8 == 2) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fd, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fe, code lost:
        r10.A05 = r7;
        r8 = r0.A48.A04(r9, r10, r11, r0.A2x.A0F, r1.getStringExtra("caption"), r14, X.C65713Te.A03(r1.getStringExtra("mentions")), (java.util.List) null, 13, 0, 0, r0.A6F);
        r8.A00 = 1;
        A0A(r0).A0b(r8, r6, r5, r4);
        r0.A2U.A0O = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0237, code lost:
        if (A1e(r0) != false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0239, code lost:
        r3 = r0.A3s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023b, code lost:
        if (r3 == null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023d, code lost:
        r3.A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0240, code lost:
        r0.A4c.A04(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024b, code lost:
        if (r1.getBooleanExtra("clear_message_after_send", false) == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024d, code lost:
        A0O();
        A0f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0274, code lost:
        r3 = r0.A3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0276, code lost:
        if (r3 == null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0278, code lost:
        r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029f, code lost:
        if (r9 == null) goto L_0x01ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A24(int r24, int r25, android.content.Intent r26) {
        /*
            r23 = this;
            r2 = 0
            r0 = r23
            r7 = r25
            r1 = r26
            if (r25 != 0) goto L_0x005c
            if (r26 == 0) goto L_0x005c
            java.lang.String r3 = "oom"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.17Y r5 = A09(r0)
            X.155 r4 = A0C(r0)
            r3 = 2131889315(0x7f120ca3, float:1.941329E38)
            r5.A0C(r4, r3)
        L_0x0026:
            java.lang.String r3 = "no-space"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x0041
            java.lang.String r3 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.17Y r5 = A09(r0)
            X.155 r4 = A0C(r0)
            r3 = 2131889309(0x7f120c9d, float:1.9413278E38)
            r5.A0C(r4, r3)
        L_0x0041:
            java.lang.String r3 = "io-error"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.17Y r5 = A09(r0)
            X.155 r4 = A0C(r0)
            r3 = 2131889297(0x7f120c91, float:1.9413254E38)
            r5.A0C(r4, r3)
        L_0x005c:
            java.util.Set r3 = r0.A7X
            java.util.Iterator r5 = r3.iterator()
        L_0x0062:
            boolean r3 = r5.hasNext()
            r4 = r24
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r5.next()
            X.4P8 r3 = (X.AnonymousClass4P8) r3
            boolean r3 = r3.BQk(r1, r4, r7)
            if (r3 == 0) goto L_0x0062
        L_0x0076:
            return
        L_0x0077:
            java.lang.String r5 = "jids"
            r12 = 0
            r3 = 1
            r6 = -1
            switch(r24) {
                case 2: goto L_0x02cf;
                case 8: goto L_0x02c8;
                case 9: goto L_0x02b1;
                case 11: goto L_0x03a2;
                case 13: goto L_0x03a2;
                case 22: goto L_0x02a8;
                case 25: goto L_0x0197;
                case 27: goto L_0x018a;
                case 42: goto L_0x0159;
                case 51: goto L_0x0076;
                case 52: goto L_0x0076;
                case 53: goto L_0x0143;
                case 120: goto L_0x012b;
                case 475: goto L_0x010c;
                case 555: goto L_0x00c7;
                case 802: goto L_0x02b1;
                case 806: goto L_0x02a8;
                case 811: goto L_0x0396;
                case 813: goto L_0x0076;
                case 858: goto L_0x02b1;
                case 905: goto L_0x033f;
                case 906: goto L_0x02f5;
                default: goto L_0x007f;
            }
        L_0x007f:
            X.4V6 r2 = r0.A2l     // Catch:{ NullPointerException -> 0x0086 }
            X.155 r12 = r2.getActivityNullable()     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x008b
        L_0x0086:
            java.lang.String r2 = "ConversationDelegate/onActivityResult/default/hostActivityIsNull"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x008b:
            X.1am r6 = r0.A2h
            X.1ao r0 = r6.A01
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x009b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r5 = r2.next()
            X.9Yd r5 = (X.C196209Yd) r5
            java.lang.Integer r0 = r5.A04()
            if (r0 == 0) goto L_0x009b
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x009b
            X.0wU r4 = r6.A07
            X.0yW r3 = r6.A04
            X.0xM r2 = r6.A02
            X.1A1 r0 = r6.A06
            r8 = r5
            r9 = r12
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r0
            r14 = r4
            r15 = r7
            r8.A07(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x00c7:
            if (r7 != r6) goto L_0x0076
            X.4V6 r1 = r0.A2l
            android.view.View r5 = r1.getContentView()
            X.4V6 r2 = r0.A2l
            r1 = 2131896106(0x7f12272a, float:1.9427064E38)
            java.lang.String r8 = r2.getString(r1)
            java.util.List r9 = java.util.Collections.emptyList()
            X.0yb r7 = r0.A31
            X.155 r6 = A0C(r0)
            r10 = 2000(0x7d0, float:2.803E-42)
            r11 = 0
            X.3ZU r4 = new X.3ZU
            r4.<init>((android.view.View) r5, (X.AnonymousClass012) r6, (X.C21060yb) r7, (java.lang.String) r8, (java.util.List) r9, (int) r10, (boolean) r11)
            r3 = 2131895190(0x7f122396, float:1.9425206E38)
            r2 = 22
            X.3Xz r1 = new X.3Xz
            r1.<init>(r0, r2)
            r4.A04(r1, r3)
            X.155 r2 = A0C(r0)
            r1 = 2130970726(0x7f040866, float:1.755017E38)
            r0 = 2131102279(0x7f060a47, float:1.7816991E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            r4.A03(r0)
            r4.A02()
            return
        L_0x010c:
            if (r26 == 0) goto L_0x0076
            java.lang.String r2 = "error_code"
            int r2 = r1.getIntExtra(r2, r6)
            r1 = 475(0x1db, float:6.66E-43)
            if (r2 != r1) goto L_0x0076
            X.6Ou r1 = r0.A5J
            X.155 r0 = A0C(r0)
            X.6EW r1 = r1.A01(r0)
            X.3tb r0 = new X.3tb
            r0.<init>()
            r1.A02(r0)
            return
        L_0x012b:
            X.0wU r5 = r0.A5S
            r4 = 2
            X.3wT r1 = new X.3wT
            r1.<init>((X.C70803fk) r0, (int) r4)
            r5.Boy(r1)
            A15(r0)
            X.141 r1 = r0.A3Y
            int r1 = r1.A00
            if (r1 != r3) goto L_0x0076
            r0.A2Z(r2)
            return
        L_0x0143:
            if (r25 != 0) goto L_0x0076
            X.155 r3 = A0C(r0)
            X.4V6 r0 = r0.A2l
            android.view.View r2 = r0.getContentView()
            r0 = 53
            X.4t3 r0 = X.C63933Lz.A00(r3, r1, r2, r0)
            r0.A0P()
            return
        L_0x0159:
            if (r7 != r6) goto L_0x0076
            if (r26 == 0) goto L_0x0076
            java.lang.String r3 = "contact"
            java.lang.String r1 = r1.getStringExtra(r3)
            com.whatsapp.jid.UserJid r4 = X.C36431kI.A0l(r1)
            if (r4 == 0) goto L_0x0076
            X.155 r1 = A0C(r0)
            android.content.Intent r3 = X.AnonymousClass190.A0F(r1, r2)
            X.C36371kC.A17(r3, r4)
            X.11F r1 = r0.A45
            java.lang.String r2 = X.AnonymousClass143.A03(r1)
            java.lang.String r1 = "group_reply_jid"
            r3.putExtra(r1, r2)
            X.4V6 r1 = r0.A2l
            r1.startActivity(r3)
            X.4V6 r0 = r0.A2l
            r0.finish()
            return
        L_0x018a:
            if (r7 != r6) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r1 = r0.A2U
            r1.A0O = r3
            r0.A0O()
            A0f(r0)
            return
        L_0x0197:
            if (r7 != r6) goto L_0x0076
            java.lang.String r4 = "file_path"
            java.lang.String r8 = r1.getStringExtra(r4)
            java.lang.String r4 = "media_url"
            java.lang.String r9 = r1.getStringExtra(r4)
            java.lang.Class<X.11F> r4 = X.AnonymousClass11F.class
            java.util.ArrayList r14 = X.C36401kF.A0u(r1, r4, r5)
            boolean r4 = X.AnonymousClass143.A0N(r14)
            if (r4 == 0) goto L_0x02a3
            X.C18740tg.A06(r1)
            android.os.Bundle r5 = r1.getExtras()
            X.3Pu r4 = r0.A4r
            X.3XT r11 = r4.A01(r5)
            java.lang.String r4 = "audience_clicked"
            boolean r5 = r1.getBooleanExtra(r4, r2)
            java.lang.String r4 = "audience_updated"
            boolean r4 = r1.getBooleanExtra(r4, r2)
        L_0x01ca:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 == 0) goto L_0x01d6
            boolean r7 = android.text.TextUtils.isEmpty(r9)
            if (r7 != 0) goto L_0x0253
        L_0x01d6:
            X.3Qj r10 = new X.3Qj
            r10.<init>()
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x027c
            java.io.File r6 = new java.io.File
            r6.<init>(r8)
            r10.A0I = r6
            byte[] r6 = X.C25541Gs.A04(r6)
            r9 = r12
        L_0x01ed:
            java.io.File r7 = r10.A0I
            if (r7 == 0) goto L_0x0253
        L_0x01f1:
            java.lang.String r7 = "provider"
            int r8 = r1.getIntExtra(r7, r2)
            r7 = 1
            if (r8 == r3) goto L_0x01fe
            r7 = 2
            if (r8 == r7) goto L_0x01fe
            r7 = 0
        L_0x01fe:
            r10.A05 = r7
            X.1D5 r8 = r0.A48
            r17 = 13
            java.lang.String r7 = "caption"
            java.lang.String r13 = r1.getStringExtra(r7)
            X.1uh r7 = r0.A2x
            X.3T1 r12 = r7.A0F
            java.lang.String r7 = "mentions"
            java.lang.String r7 = r1.getStringExtra(r7)
            java.util.ArrayList r15 = X.C65713Te.A03(r7)
            boolean r7 = r0.A6F
            r16 = 0
            r19 = 0
            r18 = 0
            r20 = r7
            X.3SC r8 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A00 = r3
            X.1X4 r7 = A0A(r0)
            r7.A0b(r8, r6, r5, r4)
            com.whatsapp.conversation.ConversationListView r4 = r0.A2U
            r4.A0O = r3
            boolean r3 = A1e(r0)
            if (r3 != 0) goto L_0x0274
            X.2MC r3 = r0.A3s
            if (r3 == 0) goto L_0x0274
            r3.A01(r2)
        L_0x0240:
            X.3rU r3 = r0.A4c
            r3.A04(r2)
            java.lang.String r3 = "clear_message_after_send"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            if (r1 == 0) goto L_0x0253
            r0.A0O()
            A0f(r0)
        L_0x0253:
            boolean r1 = A1e(r0)
            if (r1 != 0) goto L_0x025c
            A1Y(r0)
        L_0x025c:
            A0g(r0)
            boolean r1 = A1e(r0)
            if (r1 == 0) goto L_0x0076
            X.4V6 r1 = r0.A2l
            X.01M r2 = r1.getLifecycle()
            com.whatsapp.conversation.delegate.ConversationDelegate$52 r1 = new com.whatsapp.conversation.delegate.ConversationDelegate$52
            r1.<init>(r0)
            r2.A04(r1)
            return
        L_0x0274:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r3 = r0.A3f
            if (r3 == 0) goto L_0x0240
            r3.A02()
            goto L_0x0240
        L_0x027c:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r7 = "media_width"
            int r7 = r1.getIntExtra(r7, r6)
            r10.A0A = r7
            java.lang.String r7 = "media_height"
            int r6 = r1.getIntExtra(r7, r6)
            r10.A06 = r6
            java.lang.String r6 = "preview_media_url"
            java.lang.String r7 = r1.getStringExtra(r6)
            if (r7 == 0) goto L_0x029e
            X.1GZ r6 = r0.A3t
            byte[] r12 = r6.A03(r7)
        L_0x029e:
            r6 = r12
            if (r9 != 0) goto L_0x01f1
            goto L_0x01ed
        L_0x02a3:
            r11 = r12
            r4 = 0
            r5 = 0
            goto L_0x01ca
        L_0x02a8:
            if (r7 != r6) goto L_0x0076
            r0.A0O()
            A0f(r0)
            goto L_0x02ba
        L_0x02b1:
            if (r7 != r6) goto L_0x0076
            com.whatsapp.mentions.MentionableEntry r2 = r0.A4B
            java.lang.String r1 = ""
            r2.setText(r1)
        L_0x02ba:
            X.0yC r1 = r0.A3n
            boolean r1 = X.C36391kE.A1Y(r1)
            if (r1 == 0) goto L_0x0076
            X.28e r0 = r0.A2Q
            r0.A0H()
            return
        L_0x02c8:
            if (r7 != r6) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r0 = r0.A2U
            r0.A0O = r3
            return
        L_0x02cf:
            if (r7 != r6) goto L_0x0076
            java.lang.String r4 = "ad_creation_tapped"
            boolean r4 = r1.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L_0x03a6
            X.0v5 r2 = r0.A0o
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x046d
            r2.A02()
            X.4V6 r1 = r0.A2l
            r1.getActivityNullable()
            X.4V6 r0 = r0.A2l
            r0.getForwardMessages()
            java.lang.String r0 = "handleAdvertiseForwardClick"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02f5:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r2 = r0.A2e
            X.00s r2 = r2.A00
            java.lang.Object r4 = r2.A04()
            X.3Gh r4 = (X.C62473Gh) r4
            if (r4 == 0) goto L_0x030f
            java.util.HashMap r2 = r4.A03
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x030f
            r2 = 2
            if (r7 != r2) goto L_0x0315
            X.AnonymousClass3SJ.A03(r0)
        L_0x030f:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r0.A2e
            r0.A0S()
            return
        L_0x0315:
            r2 = 3
            if (r7 != r2) goto L_0x030f
            java.lang.String r2 = "RESULT_EXTRA_ACTION_ID"
            int r3 = r1.getIntExtra(r2, r6)
            if (r3 == r6) goto L_0x030f
            X.3C1 r1 = r0.A1R
            X.2JR r2 = r1.A00(r0)
            java.util.Collection r1 = r4.A01()
            boolean r1 = r2.B73(r0, r1, r3)
            if (r1 == 0) goto L_0x030f
            X.2Jg r1 = r0.A2q
            X.4Ua r1 = r1.A00(r3)
            if (r1 == 0) goto L_0x030f
            boolean r1 = r1.BBr()
            if (r1 == 0) goto L_0x0076
            goto L_0x030f
        L_0x033f:
            if (r7 != r6) goto L_0x038a
            X.11F r1 = r0.A45
            boolean r4 = r1 instanceof X.C28981Uw
            X.0v0 r1 = r0.A35
            android.content.SharedPreferences r5 = X.C36341k9.A0E(r1)
            if (r4 == 0) goto L_0x0393
            java.lang.String r1 = "first_channel_message_edit_modal_shown"
        L_0x034f:
            boolean r1 = r5.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x038a
            X.0v0 r1 = r0.A35
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r1)
            if (r4 == 0) goto L_0x0390
            java.lang.String r1 = "first_channel_message_edit_modal_shown"
        L_0x035f:
            X.C36331k8.A0w(r2, r1, r3)
            X.155 r1 = A0C(r0)
            X.1qm r3 = X.AnonymousClass3LW.A00(r1)
            r1 = 2131889621(0x7f120dd5, float:1.941391E38)
            if (r4 == 0) goto L_0x0372
            r1 = 2131889620(0x7f120dd4, float:1.9413909E38)
        L_0x0372:
            r3.A0c(r1)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r3.A0h(r12, r1)
            r2 = 2131896681(0x7f122969, float:1.942823E38)
            r1 = 36
            if (r4 != 0) goto L_0x0384
            r1 = 35
        L_0x0384:
            X.C39001qm.A0E(r3, r0, r1, r2)
            r3.A0b()
        L_0x038a:
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4B
            r0.requestFocus()
            return
        L_0x0390:
            java.lang.String r1 = "first_message_edit_modal_shown"
            goto L_0x035f
        L_0x0393:
            java.lang.String r1 = "first_message_edit_modal_shown"
            goto L_0x034f
        L_0x0396:
            if (r7 != r6) goto L_0x039f
            X.3XU r1 = r0.A6o
            if (r1 == 0) goto L_0x039f
            r0.A1T(r1)
        L_0x039f:
            r0.A6o = r12
            return
        L_0x03a2:
            A0l(r0)
            return
        L_0x03a6:
            X.4V6 r4 = r0.A2l
            java.util.Collection r6 = r4.getForwardMessages()
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x0479
            java.lang.Class<X.11F> r4 = X.AnonymousClass11F.class
            java.util.ArrayList r4 = X.C36401kF.A0u(r1, r4, r5)
            java.lang.String r5 = "include_captions"
            boolean r16 = r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "appended_message"
            java.lang.String r13 = r1.getStringExtra(r5)
            boolean r5 = X.AnonymousClass143.A0N(r4)
            if (r5 == 0) goto L_0x03d7
            X.C18740tg.A06(r1)
            android.os.Bundle r5 = r1.getExtras()
            X.3Pu r1 = r0.A4r
            X.3XT r12 = r1.A01(r5)
        L_0x03d7:
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>(r4)
            X.11F r1 = r0.A45
            boolean r1 = r1 instanceof X.C28981Uw
            if (r1 == 0) goto L_0x041b
            X.11F r7 = X.AnonymousClass143.A01(r4)
            if (r7 == 0) goto L_0x041b
            X.3BF r1 = A0G(r0)
            X.005 r1 = r1.A0B
            java.lang.Object r1 = r1.get()
            X.1Tc r1 = (X.C28551Tc) r1
            boolean r1 = r1.A05(r6)
            if (r1 == 0) goto L_0x041b
            X.4V6 r5 = r0.A2l
            r1 = 2131890828(0x7f12128c, float:1.9416359E38)
            r5.Bu1(r1)
            X.0wU r5 = r0.A5S
            r22 = 37
            X.74x r1 = new X.74x
            r17 = r1
            r18 = r7
            r19 = r0
            r20 = r6
            r21 = r12
            r17.<init>((java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21, (int) r22)
            r5.Boy(r1)
            r15.remove(r7)
        L_0x041b:
            X.1X4 r10 = A0A(r0)
            X.1XY r11 = r0.A1Z
            java.util.ArrayList r14 = X.C36441kJ.A15(r6)
            X.3xS r1 = X.C81713xS.A00
            java.util.Collections.sort(r14, r1)
            r10.A0H(r11, r12, r13, r14, r15, r16)
            int r1 = r4.size()
            if (r1 != r3) goto L_0x0473
            java.lang.Object r1 = r4.get(r2)
            boolean r1 = r1 instanceof X.C177528dw
            if (r1 != 0) goto L_0x0473
            X.11F r3 = r0.A45
            X.C18740tg.A06(r3)
            java.lang.Object r1 = r4.get(r2)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x046d
            X.4V6 r1 = r0.A2l
            X.1Dv r7 = r1.getActivityUtils()
            X.155 r6 = A0C(r0)
            X.190 r5 = r0.A76
            X.155 r3 = A0C(r0)
            X.4V6 r1 = r0.A2l
            X.16D r1 = r1.getContactManager()
            X.141 r1 = X.C36371kC.A0a(r1, r4, r2)
            android.content.Intent r2 = r5.A1W(r3, r1)
            java.lang.String r1 = "Conversation:forwardMessage"
            r7.A08(r6, r2, r1)
        L_0x046d:
            X.4V6 r0 = r0.A2l
            r0.B7Q()
            return
        L_0x0473:
            X.4V6 r1 = r0.A2l
            r1.Bvu(r4)
            goto L_0x046d
        L_0x0479:
            java.lang.String r1 = "conversation/forward/failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.17Y r3 = A09(r0)
            r1 = 2131891040(0x7f121360, float:1.9416789E38)
            r3.A06(r1, r2)
            goto L_0x046d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A24(int, int, android.content.Intent):void");
    }

    public void A2B(ViewGroup viewGroup, AnonymousClass3T1 r9) {
        AnonymousClass3T1 fMessage = ((C87614Pm) viewGroup).getFMessage();
        Stack stack = this.A7D;
        if (!stack.isEmpty() && ((AnonymousClass36V) stack.peek()).A00.A1N != fMessage.A1N) {
            stack.clear();
        }
        stack.push(new AnonymousClass36V(r9, fMessage, viewGroup.getTop()));
        if (fMessage != null) {
            A2L(r9, fMessage, this.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        } else {
            A2K(r9);
        }
        if ((r9 instanceof C46962bx) && AnonymousClass3RT.A00) {
            AnonymousClass2IR A022 = this.A2U.A02(r9.A1J);
            if (A022 instanceof C88244Ry) {
                ((C88244Ry) A022).BuP();
            }
        }
    }

    public void A2V(String str) {
        String str2 = str;
        if (str != null) {
            View A0B2 = C03570Gk.A0B(A0B(this), 16908290);
            List emptyList = Collections.emptyList();
            new AnonymousClass3ZU(A0B2, (AnonymousClass012) A0C(this), this.A31, str2, emptyList, 0, false).A02();
        }
    }

    public boolean A2d(int i, KeyEvent keyEvent) {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (i == 82 || i == 4) {
            if (A1e(this) && (expressionsBottomSheetView = this.A3l) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0n) != null) {
                bottomSheetBehavior.A0W(5);
                return false;
            } else if (!A1e(this) && A1Y(this)) {
                return false;
            } else {
                if (C36391kE.A1Y(this.A3n) && this.A2Q.A0H()) {
                    return false;
                }
            }
        }
        if (this.A6K) {
            if (i == 23) {
                if (keyEvent.getAction() == 1 && A2a()) {
                    AnonymousClass6YP r1 = this.A5Z;
                    if (!r1.A0v.A0A) {
                        r1.A0T(true, this.A6F);
                        return true;
                    }
                }
            } else if (A2a()) {
                AnonymousClass6YP r12 = this.A5Z;
                if (!r12.A0v.A0A) {
                    if (i == 19) {
                        r12.A0R(this.A6F);
                        return true;
                    } else if (i == 21) {
                        r12.A0T(false, this.A6F);
                        return true;
                    }
                }
            }
        }
        return this.A2l.Bib(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (X.C54912tl.A00(A0H(r10), r5, r11, r13) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2h(X.C46812bi r11, int r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r3 = r10
            X.0yC r0 = A0H(r10)
            boolean r9 = X.C132476Tw.A01(r0)
            X.1nd r0 = A0D(r10)
            r6 = r11
            X.3T1 r5 = A0J(r0, r11)
            r2 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0066
            X.0yC r0 = A0H(r10)
            boolean r0 = X.C54912tl.A00(r0, r5, r11, r13)
            if (r0 == 0) goto L_0x005c
            r10.A69 = r8
            r4 = r5
            X.2bi r4 = (X.C46812bi) r4
            X.4V6 r0 = r10.A2l
            X.3HF r1 = r0.getMessageAudioPlayerFactory()
            X.155 r0 = r0.getActivityNullable()
            X.6zU r7 = r1.A01(r0, r14, r8)
            r7.A0J = r4
            r7.A08 = r8
            int r1 = r4.A0D
            r0 = 9
            if (r1 == r0) goto L_0x0041
            r0 = 10
            if (r1 != r0) goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            r7.A0P = r2
            X.3fS r0 = new X.3fS
            r0.<init>(r7, r10, r4)
            r7.A0F = r0
            X.155 r1 = A0C(r10)
            X.17Y r0 = A09(r10)
            X.3vt r2 = new X.3vt
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass3MG.A01(r1, r0, r2, r12)
            return r8
        L_0x005c:
            X.0yC r0 = A0H(r10)
            boolean r0 = X.C54912tl.A00(r0, r5, r11, r13)
            if (r0 != 0) goto L_0x0078
        L_0x0066:
            if (r9 == 0) goto L_0x0078
            X.4V6 r0 = r10.A2l
            X.0yf r1 = r0.getServerProps()
            X.0yh r0 = X.C21100yf.A1B
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            r10.A2S(r11, r0, r8)
        L_0x0078:
            X.155 r0 = A0C(r10)
            X.AnonymousClass3MG.A00(r0, r12)
            r10.A6E = r2
            r0 = 0
            r10.A4i = r0
            r10.A69 = r2
            X.0yC r1 = r10.A3n
            r0 = 6129(0x17f1, float:8.589E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0097
            X.9lT r0 = X.C202289lT.A0X
            if (r0 == 0) goto L_0x0097
            r0.A03()
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2h(X.2bi, int, boolean, boolean):boolean");
    }

    public static int A01(C70803fk r0) {
        return r0.A2l.getResources().getConfiguration().orientation;
    }

    public static Resources A04(C70803fk r0) {
        return r0.A2l.getActivityNullable().getResources();
    }

    public static Window A05(C70803fk r0) {
        return r0.A2l.getWindow();
    }

    public static AnonymousClass01z A06(C70803fk r0) {
        return r0.A2l.getSupportFragmentManager();
    }

    public static AnonymousClass012 A07(C70803fk r0) {
        return r0.A2l.getLifecycleOwner();
    }

    public static AnonymousClass04H A08(C70803fk r1) {
        return new AnonymousClass04H(r1.A2l.getViewModelStoreOwner());
    }

    public static AnonymousClass17Y A09(C70803fk r0) {
        return r0.A2l.getGlobalUI();
    }

    public static AnonymousClass1X4 A0A(C70803fk r0) {
        return r0.A2l.getUserActions();
    }

    public static AnonymousClass155 A0B(C70803fk r0) {
        return r0.A2l.BoP();
    }

    public static AnonymousClass155 A0C(C70803fk r0) {
        return r0.A2l.getActivityNullable();
    }

    public static C38051nd A0D(C70803fk r0) {
        return r0.A2U.getConversationCursorAdapter();
    }

    private AnonymousClass3KZ A0E() {
        C51472ns r0;
        AnonymousClass3KZ r02 = this.A6k;
        if (r02 != null) {
            return r02;
        }
        C20810yC r2 = this.A3n;
        if (this.A2t.A0U() || !this.A40.A01(this.A45) || (A1X(this) && !A0H(this).A0E(5875))) {
            r0 = C51472ns.NONE;
        } else if (!this.A5I.BJo() || !this.A4p.A0h() || A1X(this)) {
            r0 = C51472ns.VOICE_ONLY;
        } else {
            r0 = C51472ns.VOICE_AND_VIDEO;
        }
        AnonymousClass3KZ A002 = C63743Lf.A00(r0, r2);
        this.A6k = A002;
        return A002;
    }

    public static AnonymousClass3B6 A0F(C70803fk r0) {
        return (AnonymousClass3B6) r0.A5i.get();
    }

    public static AnonymousClass3BF A0G(C70803fk r0) {
        return (AnonymousClass3BF) r0.A5r.get();
    }

    public static C20810yC A0H(C70803fk r0) {
        return r0.A2l.getAbProps();
    }

    public static AnonymousClass3XM A0I(C70803fk r4) {
        String A0H2 = r4.A2l.getWAContactNames().A0H(r4.A3Y);
        if (A0H2 == null) {
            return null;
        }
        return new AnonymousClass3XM(Boolean.valueOf(r4.A3Y.A0G()), A0H2, AnonymousClass143.A03(r4.A45));
    }

    public static C19770wU A0K(C70803fk r0) {
        return r0.A2l.getWaWorkers();
    }

    public static List A0L(C70803fk r3, AnonymousClass141 r4) {
        AnonymousClass4V6 r0 = r3.A2l;
        return AnonymousClass3UL.A04(r0.getMeManager(), r3.A2l.getContactManager(), r0.getGroupParticipantsManager(), r4);
    }

    private void A0M() {
        AnonymousClass2j9 r1 = this.A6s;
        if (r1 != null) {
            r1.A0D(true);
            this.A6s = null;
        }
        C56452wJ r4 = new C56452wJ(this, 0);
        AnonymousClass1A1 fMessageDatabase = this.A2l.getFMessageDatabase();
        C65813To r2 = this.A5X;
        AnonymousClass11F r12 = this.A45;
        C18740tg.A06(r12);
        this.A6s = new AnonymousClass2j9(r12, fMessageDatabase, r4, r2);
        C36391kE.A1Q(this.A6s, A0K(this));
    }

    private void A0N() {
        this.A1c.setVisibility(8);
        AnonymousClass0FM r0 = this.A6h;
        if (r0 != null) {
            r0.dismiss();
            this.A6h = null;
        }
    }

    private void A0O() {
        AnonymousClass398 r0 = (AnonymousClass398) A7c.get(C36411kG.A0h(this.A3Y));
        if (r0 != null) {
            AnonymousClass3HK r1 = this.A3E;
            boolean z = r0.A03;
            AnonymousClass11F r02 = r1.A0A;
            if (r02 != null) {
                C64553Ol.A00(r1.A0P, r02.getRawString(), 1, z);
            }
        }
    }

    private void A0Q() {
        View view;
        AnonymousClass3HK r2 = this.A3E;
        if (r2.A0E) {
            if (r2.A0H == 2) {
                view = r2.A09;
            } else {
                view = r2.A08;
            }
            C18740tg.A04(view);
            if (view.getVisibility() == 0) {
                A1N(this, true);
            }
        }
    }

    private void A0R() {
        AnonymousClass1G5 r4 = this.A2r;
        AnonymousClass4V6 r3 = this.A2l;
        r4.A00.set(new AnonymousClass1G6(r3, r3.getScreenLockStateProvider(), true));
    }

    private void A0S() {
        AnonymousClass1G6 A002 = this.A2r.A00();
        C18740tg.A06(A002);
        C88834Uf r0 = A002.A00;
        AnonymousClass4V6 r4 = this.A2l;
        if (r0 == r4) {
            AnonymousClass1G5 r3 = this.A2r;
            r3.A00.compareAndSet(A002, new AnonymousClass1G6(r4, r4.getScreenLockStateProvider(), false));
        }
    }

    private void A0T(int i) {
        View view = this.A6e;
        if (view != null) {
            AnonymousClass1JZ.A07(view, this.A36, view.getPaddingLeft(), this.A6e.getPaddingTop(), this.A6e.getPaddingRight(), i);
        }
    }

    public static void A0X(View view, C70803fk r3) {
        int height;
        ViewGroup viewGroup = r3.A0S;
        if (viewGroup != null && (height = viewGroup.getHeight()) > 0) {
            A16(r3, (int) (((float) height) - view.getY()));
        }
    }

    public static void A0a(AnonymousClass4PM r2, C70803fk r3, List list) {
        C38471oy r1 = (C38471oy) r3.A2U.findViewById(R.id.bot_message_prompts_view);
        if (list == null || list.isEmpty()) {
            r3.A2U.removeFooterView(r1);
        } else if (r2 != null) {
            if (r1 == null) {
                r1 = new C38471oy(A0C(r3));
                r3.A2U.addFooterView(r1);
            }
            r1.setData(list, r2);
        }
    }

    public static void A0b(AnonymousClass6BK r6, C70803fk r7) {
        if (r7.A6d == null && r7.A0e != null) {
            AnonymousClass1Q7 r0 = r7.A2F;
            C20810yC r4 = r7.A3n;
            View B4b = r0.B4b(A0C(r7), r7.A1W, r6, r4, r7.A45);
            r7.A6d = B4b;
            int i = 1;
            if (r7.A0O == null) {
                i = 0;
            }
            r7.A0e.addView(B4b, i);
        }
    }

    public static void A0c(C207109uZ r5, C70803fk r6) {
        String str;
        UserJid A0l2;
        if (r5 != null || ((A0l2 = C36351kA.A0l(r6.A3Y)) != null && (r5 = r6.A2l.getBusinessProfileManager().A07(A0l2)) != null)) {
            AnonymousClass1KI r3 = r6.A5c;
            int i = r5.A00;
            r3.A00(r3.A00, 5, i);
            r6.A5i.get();
            AnonymousClass155 A0C2 = A0C(r6);
            AnonymousClass00C.A0D(A0C2, 0);
            if (i == 1) {
                str = "com.bloks.www.whatsapp.ai.biz.consent";
            } else if (i != 3) {
                str = "com.bloks.www.whatsapp.ai.biz.third_party_consent";
            } else {
                str = "com.bloks.www.whatsapp.ai.biz.assistant_consent";
            }
            Intent A0D2 = C36431kI.A0D();
            C36421kH.A0l(A0C2, A0D2, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity", str);
            A0D2.putExtra("is_async_component", false);
            A0D2.putExtra("restore_saved_instance", true);
            A0B(r6).BuO(A0D2, 120);
        }
    }

    public static void A0d(C70803fk r1) {
        C88974Ut r12 = r1.A5U;
        if (r12 != null && r12.BCi()) {
            r12.BlK();
        }
    }

    public static void A0e(C70803fk r2) {
        BaseExpressionsBottomSheet baseExpressionsBottomSheet = r2.A3j;
        if (baseExpressionsBottomSheet != null) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = (ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet;
            expressionsKeyboardSearchBottomSheet.A0N = null;
            expressionsKeyboardSearchBottomSheet.A0E = null;
            expressionsKeyboardSearchBottomSheet.A0J = null;
            r2.A3j = null;
        }
    }

    public static void A0f(C70803fk r3) {
        MentionableEntry mentionableEntry = r3.A4B;
        TextWatcher textWatcher = r3.A7F;
        mentionableEntry.removeTextChangedListener(textWatcher);
        r3.A6H = false;
        try {
            r3.A4B.setText("");
            r3.A21();
            TextKeyListener.clear(r3.A4B.getText());
            r3.A0M();
            r3.A0Q();
        } finally {
            if (!A1X(r3)) {
                r3.A4B.addTextChangedListener(textWatcher);
            }
        }
    }

    public static void A0h(C70803fk r2) {
        if (r2.A0s.A05()) {
            r2.A2l.findViewById(R.id.stub_quick_reply_btn);
            r2.A0s.A02();
            C18740tg.A06(r2.A45);
            throw AnonymousClass001.A0A("makeQuickReplyHelper");
        }
    }

    public static void A0i(C70803fk r4) {
        ViewGroup viewGroup = (ViewGroup) r4.A2l.findViewById(R.id.push_to_video_stub);
        if (r4.A2l.findViewById(R.id.push_to_video_root_view) == null) {
            r4.A2l.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        }
    }

    public static void A0j(C70803fk r15) {
        int i;
        if (r15.A5Z == null) {
            A1I(r15, "voice_recording_ui_start");
            r15.A2l.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) r15.A2l.findViewById(R.id.voice_note_stub), true);
            r15.A6e = r15.A2l.findViewById(R.id.voice_note_layout);
            if (r15.A6G) {
                i = A04(r15).getDimensionPixelOffset(R.dimen.f7nameremoved);
            } else {
                i = 0;
            }
            r15.A0T(i);
            C90254Zr r11 = new C90254Zr(r15, 0);
            C62493Gj r3 = r15.A5a;
            AnonymousClass155 A0C2 = A0C(r15);
            KeyboardPopupLayout keyboardPopupLayout = r15.A1V;
            AnonymousClass190 r1 = r15.A76;
            AnonymousClass155 r7 = A0C2;
            AnonymousClass6YP A002 = r3.A01.A00(keyboardPopupLayout, A0C2, r7, r15.A2u, r3.A00.A01(A0C2, keyboardPopupLayout), r3.A04.B43(A0C2, r1), r11, (AnonymousClass33M) null, true, true);
            r15.A5Z = A002;
            AnonymousClass11F r4 = r15.A45;
            C18740tg.A0F(!AnonymousClass000.A1V(A002.A0H), "Do not update the ptt receiver once the recording has started");
            A002.A0B = r4;
            C20810yC r12 = A002.A0r;
            if (r12.A0E(2832) && !(A002.A0B instanceof C28981Uw) && (!r12.A0E(3953) || !AnonymousClass143.A0H(A002.A0B))) {
                ImageButton imageButton = A002.A12.A0E;
                imageButton.setVisibility(0);
                C36351kA.A1E(imageButton, A002, 12);
            }
            r15.A5Z.A0D = r15.A2x.A0F;
            A12(r15);
            A1I(r15, "voice_recording_ui_end");
        }
    }

    public static void A0k(C70803fk r1) {
        if (r1.A3E.A01()) {
            r1.A23(r1.A1i(1));
        }
        r1.A3E.A00();
    }

    public static void A0l(C70803fk r4) {
        UserJid A0l2;
        if (r4.A7a != null && r4.A7a.booleanValue()) {
            ConversationListView conversationListView = r4.A2U;
            int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
            while (true) {
                if (firstVisiblePosition > conversationListView.getLastVisiblePosition()) {
                    break;
                }
                View childAt = conversationListView.getChildAt(firstVisiblePosition);
                if (childAt instanceof AnonymousClass2I3) {
                    AnonymousClass2I3 r1 = (AnonymousClass2I3) childAt;
                    if (r1 != null) {
                        r1.A07 = true;
                    }
                } else {
                    firstVisiblePosition++;
                }
            }
        }
        r4.A2N.A08();
        if (r4.A3Y.A0C() && (A0l2 = C36351kA.A0l(r4.A3Y)) != null) {
            AnonymousClass4V6 r2 = r4.A2l;
            r2.getBusinessProfileManager().A0E(r2, A0l2, (String) null);
        }
        r4.A2l.getAddContactLogUtil().A01();
    }

    public static void A0n(C70803fk r2) {
        r2.A2l.getMessageAudioPlayerProvider().A04();
        r2.A2l.invalidateOptionsMenu();
        C88974Ut r1 = r2.A5U;
        if (r1 != null && r1.BCi()) {
            r1.BlK();
        }
        AnonymousClass4V6 r0 = r2.A2l;
        AnonymousClass3UR.A03(r0.getContentView(), r0.getMessageAudioPlayerProvider());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A2l.BMu() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0o(X.C70803fk r4) {
        /*
            android.view.View r3 = r4.A0C
            X.0V9 r0 = r4.A0i
            r2 = 8
            if (r0 != 0) goto L_0x0011
            X.4V6 r0 = r4.A2l
            boolean r1 = r0.BMu()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r3.setVisibility(r0)
            r4.A0N()
            com.whatsapp.TextEmojiLabel r0 = r4.A1d
            r0.setVisibility(r2)
            X.36T r0 = r4.A6l
            X.1RJ r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            r0.A03(r2)
        L_0x0027:
            android.view.View r0 = r4.A0H
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A0o(X.3fk):void");
    }

    public static void A0p(C70803fk r8) {
        AnonymousClass3T1 r2;
        AnonymousClass2IR A022;
        if (r8.A2l.getSelectedMessages() == null || r8.A2l.getSelectedMessages().A03.isEmpty()) {
            r2 = null;
        } else {
            r2 = (AnonymousClass3T1) AnonymousClass3R6.A00(r8.A2l.getSelectedMessages().A01());
        }
        AnonymousClass4V6 r1 = r8.A2l;
        if (r1.getSelectionActionMode() != null && r1.getSelectedMessages() != null && r8.A2x.A0F == null && r2 != null && r8.A4n.A02(r2) && (A022 = r8.A2U.A02(r2.A1J)) != null) {
            if (A022.A1P() && A022.A03 == 0) {
                View view = A022.A0b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (A022.getWidth() / 6)});
                ofFloat.setDuration(600).setInterpolator(new AnonymousClass02K());
                AnonymousClass4VL.A00(ofFloat, A022, 5);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
                C36391kE.A13(ofFloat2.setDuration(200));
                AnonymousClass4VL.A00(ofFloat2, A022, 6);
                AnimatorSet A0C2 = C36441kJ.A0C();
                A0C2.play(ofFloat);
                A0C2.play(ofFloat2).after(900);
                A0C2.start();
                A022.A03 = 2;
                A022.invalidate();
            }
            A09(r8).A06(R.string.f12nameremoved, 1);
            r8.A2l.B7Q();
        }
    }

    public static void A0q(C70803fk r5) {
        if (r5.A0S != null) {
            r5.A3l = new ExpressionsBottomSheetView(r5.A1V.getContext(), (AttributeSet) null, 0, r5.A45);
            C02460Ak r3 = new C02460Ak(-1, -1);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            bottomSheetBehavior.A0d(true);
            bottomSheetBehavior.A0W(4);
            bottomSheetBehavior.A0V(r5.A2l.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
            r3.A00(bottomSheetBehavior);
            r5.A3l.setLayoutParams(r3);
            r5.A0S.addView(r5.A3l);
        }
        r5.A0D = r5.A2l.findViewById(R.id.expressions_view_root);
        r5.A3f = (EmojiSearchKeyboardContainer) r5.A2l.findViewById(R.id.emoji_search_keyboard_container);
        r5.A3g.A01((Integer) null);
        ExpressionsBottomSheetView expressionsBottomSheetView = r5.A3l;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0I = r5.A78;
            expressionsBottomSheetView.A0F = new C55042ty(r5, 0);
            expressionsBottomSheetView.A01 = r5.A71;
            expressionsBottomSheetView.setExpressionsSearchListener(r5.A74);
            r5.A3l.setAdapterFunStickerData(A0I(r5));
            r5.A3l.setVisibility(8);
            r5.A3l.setTabSelectionListener(new C74303lO(r5));
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(r5.A3l);
            r5.A0n = A022;
            A022.A0Z(new C89194Vp(r5, 4));
            ViewGroup viewGroup = r5.A0S;
            if (viewGroup != null) {
                viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C90144Zg(0, r5, false));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r5.A3n, 4245) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0r(X.C70803fk r5) {
        /*
            android.view.ViewGroup r0 = r5.A0R
            if (r0 == 0) goto L_0x006c
            X.155 r2 = A0C(r5)
            if (r2 == 0) goto L_0x006c
            boolean r1 = r2 instanceof com.whatsapp.Conversation
            r0 = 2131429218(0x7f0b0762, float:1.8480103E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131433479(0x7f0b1807, float:1.8488745E38)
        L_0x0014:
            android.view.View r4 = r2.findViewById(r0)
            if (r4 == 0) goto L_0x006c
            com.whatsapp.conversation.ConversationListView r0 = r5.A2U
            android.view.View r0 = r0.getLastRow()
            r3 = 0
            if (r0 != 0) goto L_0x006d
            r1 = 0
        L_0x0024:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2U
            int r0 = r0.getBottom()
            if (r1 < r0) goto L_0x0047
            X.1JL r0 = r5.A3z
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0047
            boolean r0 = A1e(r5)
            if (r0 == 0) goto L_0x0047
            X.0yC r2 = r5.A3n
            X.0yV r1 = X.C21000yV.A01
            r0 = 4245(0x1095, float:5.949E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            X.1re r0 = new X.1re
            r0.<init>()
            X.C07460Xt.A01(r4, r0)
            X.C011004s.A07(r4, r0)
            X.155 r0 = A0B(r5)
            android.view.Window r0 = r0.getWindow()
            X.AnonymousClass0Q4.A00(r0, r3)
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1V
            X.1rd r1 = new X.1rd
            r1.<init>(r0, r3, r2)
            r5.A3y = r1
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1V
            X.C07460Xt.A01(r0, r1)
        L_0x006c:
            return
        L_0x006d:
            int r1 = r0.getBottom()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A0r(X.3fk):void");
    }

    public static void A0s(C70803fk r4) {
        ViewGroup viewGroup;
        AnonymousClass11F r3 = r4.A45;
        if (C20800yB.A01(C21000yV.A01, A0F(r4).A02.A01, 6358)) {
            C39931uI r1 = (C39931uI) A0F(r4).A07.get();
            r1.A0S(r4.A3Y, r3);
            C66033Uk.A00(A07(r4), r1.A09, r4, 15);
        } else if (r3 != null && (viewGroup = (ViewGroup) r4.A2l.findViewById(R.id.biz_prompts_container)) != null) {
            C38531pF r0 = new C38531pF(A0C(r4));
            r4.A22 = r0;
            r0.getViewModel().A0S(r4.A3Y, r3);
            viewGroup.addView(r4.A22);
            r4.A1V.addOnLayoutChangeListener(new AnonymousClass4XX(r4, 0));
        }
    }

    public static void A0t(C70803fk r7) {
        r7.A0C.setVisibility(8);
        r7.A0H.setVisibility(0);
        AnonymousClass36T r6 = r7.A6l;
        AnonymousClass141 r5 = r7.A3Y;
        View view = r7.A0H;
        AnonymousClass31J r3 = new AnonymousClass31J(r7);
        C36331k8.A1I(r5, view);
        AnonymousClass1RJ r1 = r6.A00;
        if (r1 == null) {
            r1 = C36341k9.A0Y(view, R.id.blocked_chat_delete_unblock_footer_stub);
            r6.A00 = r1;
        }
        r1.A07(new C79403tf(r6, r3, r5));
        AnonymousClass1RJ r0 = r6.A00;
        if (r0 != null) {
            r0.A03(0);
        }
    }

    public static void A0u(C70803fk r3) {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        if (r3.A3f != null && (expressionsBottomSheetView = r3.A3l) != null && r3.A0n != null) {
            r3.A1V.A04 = true;
            expressionsBottomSheetView.setVisibility(8);
            r3.A3l.post(new C81103wT(r3, 19));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0v(X.C70803fk r6) {
        /*
            X.3Sr r0 = r6.A2n
            X.4UQ r0 = r0.A03
            if (r0 == 0) goto L_0x000d
            boolean r1 = r0.isVisible()
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            X.3AF r3 = r6.A2m
            if (r0 == 0) goto L_0x002f
            X.0yC r1 = r3.A03
            r0 = 2481(0x9b1, float:3.477E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002e
            X.1nx r1 = r3.A00
            if (r1 == 0) goto L_0x002e
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x002e
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r3.A01 = r0
        L_0x002e:
            return
        L_0x002f:
            X.11F r4 = r6.A45
            X.4V6 r1 = r6.A2l
            r0 = 2131427821(0x7f0b01ed, float:1.847727E38)
            android.view.View r5 = r1.findViewById(r0)
            X.155 r2 = A0C(r6)
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            if (r5 == 0) goto L_0x002e
            boolean r0 = r4 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x002e
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x002e
            X.0yC r1 = r3.A03
            r0 = 2481(0x9b1, float:3.477E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            r3.A01 = r0
            X.0wU r0 = r3.A06
            r6 = 39
            X.74x r1 = new X.74x
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.Boy(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A0v(X.3fk):void");
    }

    public static void A0w(C70803fk r3) {
        if (!r3.A1V.A04) {
            ExpressionsBottomSheetView expressionsBottomSheetView = r3.A3l;
            if (expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) {
                A0y(r3);
                return;
            }
            String string = r3.A2l.getString(R.string.f12nameremoved);
            r3.A0b.setImageResource(R.drawable.ib_keyboard);
            r3.A0b.setContentDescription(string);
            r3.A1V(20, (Integer) null, 32);
            A0x(r3);
            C64263Nh r2 = r3.A5C;
            C64263Nh.A00(r2, 5);
            if (r2.A01) {
                r2.A00.Bly(new C44272Ms());
            }
        }
    }

    public static void A0y(C70803fk r3) {
        ExpressionsBottomSheetView expressionsBottomSheetView = r3.A3l;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0C();
        }
        BottomSheetBehavior bottomSheetBehavior = r3.A0n;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            ExpressionsBottomSheetView expressionsBottomSheetView2 = r3.A3l;
            if (expressionsBottomSheetView2 == null || expressionsBottomSheetView2.getVisibility() != 8) {
                r3.A1V.A04 = true;
                ExpressionsBottomSheetView expressionsBottomSheetView3 = r3.A3l;
                if (expressionsBottomSheetView3 != null) {
                    expressionsBottomSheetView3.setVisibility(8);
                    r3.A3l.post(new C81103wT(r3, 27));
                    return;
                }
                return;
            }
            C36421kH.A1D(r3.A4B);
            return;
        }
        r3.A6X = true;
        bottomSheetBehavior.A0W(4);
    }

    public static void A0z(C70803fk r2) {
        ExpressionsBottomSheetView expressionsBottomSheetView = r2.A3l;
        if (expressionsBottomSheetView != null) {
            A0X(expressionsBottomSheetView, r2);
            r2.A3l.A0E(4);
            r2.A3l.A0A();
            r2.A3l.A0D();
            r2.A1m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0169, code lost:
        if (r1.A0A(X.C36441kJ.A0n(r1.A02)) != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0193, code lost:
        if (r1 != null) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A11(X.C70803fk r12) {
        /*
            X.0yC r2 = r12.A3n
            X.0yV r1 = X.C21000yV.A01
            r0 = 7693(0x1e0d, float:1.078E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x002b
            X.141 r3 = r12.A3Y
            if (r3 == 0) goto L_0x002a
            X.00r r0 = r12.A0l
            if (r0 != 0) goto L_0x0023
            X.3Sr r0 = r12.A2n
            X.1Rs r2 = r0.A0P
            r12.A0l = r2
            X.012 r1 = A07(r12)
            r0 = 14
            X.AnonymousClass3UW.A00(r1, r2, r3, r12, r0)
        L_0x0023:
            X.0wU r1 = r12.A5S
            r0 = 35
            X.C80283v9.A00(r1, r12, r3, r0)
        L_0x002a:
            return
        L_0x002b:
            X.3Sr r3 = r12.A2n
            X.141 r5 = r12.A3Y
            boolean r7 = r12.A67
            boolean r4 = r12.A6V
            java.lang.Boolean r9 = r12.A7a
            X.3IL r0 = r5.A0F
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r8 = 1
            r2 = 0
            if (r0 != 0) goto L_0x004c
            X.141 r0 = r5.A0G
            if (r0 != 0) goto L_0x004c
            boolean r0 = r5.A0s
            if (r0 == 0) goto L_0x025d
            int r1 = r5.A07
            r0 = 2
            if (r1 == r0) goto L_0x025d
        L_0x004c:
            r11 = 1
        L_0x004d:
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x00b8
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r4 = X.C36381kD.A0e(r5, r0)
            X.147 r4 = (X.AnonymousClass147) r4
            X.1C6 r1 = r3.A0O
            X.0xQ r0 = r3.A0L
            X.17X r0 = r0.A0U
            boolean r0 = r0.A0H(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A09(r4, r0)
            if (r0 == 0) goto L_0x00b6
            X.C65593Sr.A03(r3, r5, r2)
        L_0x0072:
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x0083
            int r1 = r0.getType()
            X.3Qn r0 = r3.A0H
            X.3BC r0 = r0.A02(r1, r8)
            X.C65593Sr.A01(r0, r3)
        L_0x0083:
            r7 = r8
        L_0x0084:
            r3.A08 = r2
            boolean r0 = r3.A07
            if (r7 == r0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/spam/"
            X.C36321k7.A1X(r0, r1, r7)
            r3.A07 = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x0099:
            A0v(r12)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002a
            X.1C6 r2 = r12.A54
            X.141 r0 = r12.A3Y
            X.11F r1 = X.C36331k8.A0G(r0)
            r0 = 1
            r2.A08(r1, r0)
            X.C38051nd.A00(r12)
            return
        L_0x00b4:
            r0 = 0
            goto L_0x0099
        L_0x00b6:
            r8 = 0
            goto L_0x0072
        L_0x00b8:
            X.0xf r0 = r3.A0K
            X.11F r6 = r3.A0N
            boolean r0 = X.AnonymousClass3M3.A01(r0, r6)
            if (r0 != 0) goto L_0x00ec
            X.0yC r1 = r3.A0J
            boolean r0 = X.AnonymousClass3RR.A00(r1, r6)
            if (r0 != 0) goto L_0x00ec
            X.0v5 r10 = r3.A0C
            boolean r0 = r10.A05()
            if (r0 == 0) goto L_0x00dc
            X.1K3 r0 = X.C36441kJ.A0f(r10)
            boolean r0 = r0.BLB(r6)
            if (r0 != 0) goto L_0x00ec
        L_0x00dc:
            X.1NV r10 = r3.A0E
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x0104
            X.0yC r0 = r10.A01
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 == 0) goto L_0x0104
        L_0x00ec:
            X.C65593Sr.A03(r3, r5, r2)
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x0102
            X.3Qn r0 = r3.A0H
            X.3BC r1 = r0.A04(r5)
            if (r1 != 0) goto L_0x0195
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x0102
            r0.BKD()
        L_0x0102:
            r7 = 0
            goto L_0x0084
        L_0x0104:
            X.11F r0 = r5.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x01d7
            X.1CF r0 = r3.A0M
            boolean r0 = r0.A02(r6)
            if (r0 != 0) goto L_0x01d7
            if (r7 != 0) goto L_0x019c
            if (r11 == 0) goto L_0x011e
            X.1C6 r0 = r3.A0O
            boolean r0 = r0.A07(r6)
            if (r0 == 0) goto L_0x01d7
        L_0x011e:
            java.util.ArrayList r0 = r3.A06
            if (r0 != 0) goto L_0x012e
            X.3Gc r7 = r3.A0R     // Catch:{ all -> 0x0260 }
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r5)     // Catch:{ all -> 0x0260 }
            java.util.ArrayList r0 = r7.A00(r0)     // Catch:{ all -> 0x0260 }
            r3.A06 = r0     // Catch:{ all -> 0x0260 }
        L_0x012e:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0184
            X.1Ew r4 = r3.A0I
            X.12q r0 = r4.A04
            X.3Qp r0 = r0.A09(r6, r2)
            if (r0 == 0) goto L_0x014f
            int r0 = r0.A0B
            if (r0 != r8) goto L_0x014f
            r8 = 0
        L_0x0143:
            X.2Kd r4 = r3.A05
            if (r4 == 0) goto L_0x0102
            X.01L r1 = r3.A0B
            java.util.ArrayList r0 = r3.A06
            r4.A01(r1, r6, r0, r8)
            goto L_0x0102
        L_0x014f:
            X.0wQ r0 = r3.A0D
            boolean r0 = X.C36361kB.A1X(r0, r5)
            if (r0 == 0) goto L_0x016c
            boolean r0 = X.C36391kE.A1X(r1)
            if (r0 == 0) goto L_0x016c
            X.16D r1 = r3.A0F
            X.0wQ r0 = r1.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            X.141 r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x016c
            goto L_0x0143
        L_0x016c:
            X.2Kd r0 = r3.A05
            if (r0 != 0) goto L_0x0143
            X.01L r0 = r3.A0B
            X.2Kd r1 = new X.2Kd
            r1.<init>(r0)
            r3.A05 = r1
            X.3Gc r0 = r3.A0R
            r1.setup(r4, r0)
            android.widget.ListView r0 = r3.A0A
            r0.addFooterView(r1)
            goto L_0x0143
        L_0x0184:
            if (r4 == 0) goto L_0x01fd
            X.C65593Sr.A03(r3, r5, r2)
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x0102
            X.3Qn r0 = r3.A0H
            X.3BC r1 = r0.A03(r5)
            if (r1 == 0) goto L_0x0102
        L_0x0195:
            X.4UQ r0 = r3.A03
            r0.BoA(r1)
            goto L_0x0102
        L_0x019c:
            X.2Ke r0 = r3.A04
            if (r0 != 0) goto L_0x01ae
            X.01L r0 = r3.A0B
            X.2Ke r1 = new X.2Ke
            r1.<init>(r0)
            r3.A04 = r1
            android.widget.ListView r0 = r3.A0A
            r0.addFooterView(r1)
        L_0x01ae:
            X.2Ke r5 = r3.A04
            X.C18740tg.A04(r5)
            X.31K r1 = r3.A0G
            java.util.Objects.requireNonNull(r1)
            r0 = 43
            X.3wT r4 = new X.3wT
            r4.<init>((java.lang.Object) r1, (int) r0)
            android.view.View r1 = r5.A00
            r0 = 24
            X.C48742hy.A01(r1, r5, r0)
            android.view.View r1 = r5.A01
            r0 = 17
            X.C48932iI.A00(r1, r6, r5, r4, r0)
            android.widget.TextView r1 = r5.A03
            r0 = 2131888327(0x7f1208c7, float:1.9411286E38)
            r1.setText(r0)
            goto L_0x0102
        L_0x01d7:
            X.1o8 r0 = r3.A01
            r1 = 8
            if (r0 == 0) goto L_0x01e2
            android.view.View r0 = r0.A00
            r0.setVisibility(r1)
        L_0x01e2:
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x01e9
            r0.BKD()
        L_0x01e9:
            X.2Kd r0 = r3.A05
            if (r0 == 0) goto L_0x01f2
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
        L_0x01f2:
            X.2Ke r0 = r3.A04
            if (r0 == 0) goto L_0x0102
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
            goto L_0x0102
        L_0x01fd:
            X.1C6 r4 = r3.A0O
            X.11F r0 = X.C36331k8.A0G(r5)
            int r1 = X.AnonymousClass1C6.A00(r0, r4)
            r0 = -1
            if (r1 != r0) goto L_0x0238
            X.C65593Sr.A03(r3, r5, r2)
            r7 = 1
        L_0x020e:
            r8 = 0
        L_0x020f:
            X.1o8 r1 = r3.A01
            if (r1 == 0) goto L_0x021c
            X.0wQ r0 = r3.A0D
            boolean r0 = r0.A0L()
            r1.A00(r6, r8, r0)
        L_0x021c:
            X.4UQ r0 = r3.A03
            if (r0 == 0) goto L_0x022d
            int r1 = r0.getType()
            X.3Qn r0 = r3.A0H
            X.3BC r0 = r0.A05(r5, r1, r7)
            X.C65593Sr.A01(r0, r3)
        L_0x022d:
            if (r7 == 0) goto L_0x0084
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0084
            r4.A03(r6, r2)
            goto L_0x0084
        L_0x0238:
            boolean r0 = r4.A07(r6)
            if (r0 == 0) goto L_0x0244
            X.C65593Sr.A03(r3, r5, r8)
            r7 = 1
            r2 = 1
            goto L_0x020e
        L_0x0244:
            r7 = 0
            boolean r0 = r5.A0N()
            if (r0 != 0) goto L_0x020e
            X.11F r0 = r5.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x020e
            if (r9 == 0) goto L_0x0259
            boolean r0 = r9.booleanValue()
            if (r0 != 0) goto L_0x020e
        L_0x0259:
            X.C65593Sr.A02(r3, r5)
            goto L_0x020f
        L_0x025d:
            r11 = 0
            goto L_0x004d
        L_0x0260:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A11(X.3fk):void");
    }

    public static void A12(C70803fk r3) {
        AnonymousClass6YP r2 = r3.A5Z;
        if (r2 != null) {
            C145166tS r1 = r3.A2z.A01;
            if (r1 instanceof AnonymousClass28U) {
                AnonymousClass3PE r0 = r3.A3D;
                r2.A09 = (AnonymousClass28U) r1;
                r2.A0A = r0;
            }
        }
    }

    public static void A13(C70803fk r3) {
        AnonymousClass2HG r2 = (AnonymousClass2HG) r3.A2Z.A00.A00(AnonymousClass2HG.class);
        if (r2 != null) {
            r2.A00 = r3.A3Y;
            boolean A0B2 = r2.A0B();
            boolean A0C2 = r2.A0C();
            if (A0B2) {
                if (A0C2) {
                    AnonymousClass2HG.A01(r2);
                } else {
                    r2.A08();
                }
            } else if (A0C2) {
                r2.A0A(false);
            }
        }
    }

    public static void A14(C70803fk r7) {
        AnonymousClass2HO r5 = (AnonymousClass2HO) r7.A2Z.A00.A00(AnonymousClass2HO.class);
        if (r5 != null) {
            AnonymousClass141 r72 = r7.A3Y;
            r5.A01 = r72;
            C24531Cu r6 = r5.A07;
            C65073Qp A092 = r6.A02.A09((AnonymousClass11F) C36381kD.A0e(r72, UserJid.class), false);
            if (A092 != null && A092.A0C != -1) {
                C36391kE.A1Q(new C49242in(r5, r6, r72), r5.A09);
            } else if (r5.A0C()) {
                r5.A0A(true);
            }
        }
    }

    public static void A15(C70803fk r3) {
        if (r3.A3Y.A0E() && r3.A3n.A0E(5587) && !C36351kA.A1X(r3.A1z, r3.A45)) {
            r3.A1U.A0H(new C81103wT(r3, 21));
        }
    }

    public static void A16(C70803fk r3, int i) {
        int height;
        BottomSheetBehavior bottomSheetBehavior = r3.A0n;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J != 5 && r3.A1V != null && r3.A0S != null) {
            ExpressionsBottomSheetView expressionsBottomSheetView = r3.A3l;
            if ((expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) && (height = r3.A0S.getHeight()) > 0) {
                ViewGroup.LayoutParams layoutParams = r3.A1V.getLayoutParams();
                layoutParams.height = (int) ((float) (height - i));
                r3.A1V.requestLayout();
            }
        }
    }

    public static void A17(C70803fk r42, int i) {
        List singletonList;
        C70803fk r0 = r42;
        AnonymousClass3UB r1 = r0.A4l;
        int i2 = i;
        if (r1 == null || i2 != r1.A0K) {
            A0i(r0);
            if (!AnonymousClass6YG.A02() || !r0.A27.A03()) {
                boolean A0E2 = r0.A3n.A0E(7304);
                C62683Hc r12 = r0.A5V;
                if (A0E2) {
                    for (AnonymousClass38r r13 : r12.A00.A08) {
                        r13.hashCode();
                        r13.A03.A0V(true);
                    }
                } else {
                    r12.A01();
                }
                C69823e9 r8 = new C69823e9(r0);
                AnonymousClass11F r14 = r0.A45;
                if (r14 == null) {
                    singletonList = Collections.emptyList();
                } else {
                    singletonList = Collections.singletonList(r14);
                }
                C57322y3 r3 = r0.A17;
                AnonymousClass155 A0C2 = A0C(r0);
                ViewGroup A0O2 = C36411kG.A0O(r0.A1V, R.id.push_to_video_root_view);
                View A022 = C012005e.A02(r0.A1V, R.id.buttons);
                View A023 = C012005e.A02(r0.A1V, R.id.entry);
                View A024 = C012005e.A02(r0.A1V, R.id.input_layout_content);
                AnonymousClass3T1 r10 = r0.A2x.A0F;
                C39501sW r9 = r0.A0m;
                C27121Mz r32 = r3.A00;
                C18800tq r15 = r32.A01;
                C19630wG A0W2 = C36351kA.A0W(r15);
                C19970wo A0V2 = C36351kA.A0V(r15);
                C20810yC A0V3 = C36341k9.A0V(r15);
                AnonymousClass17Y A0M2 = C36351kA.A0M(r15);
                C19700wN A0V4 = C36391kE.A0V(r15);
                AnonymousClass1XY A0Y2 = C36411kG.A0Y(r15);
                C19770wU A0Z2 = C36341k9.A0Z(r15);
                C21010yW A0g2 = C36351kA.A0g(r15);
                C18830tt r2 = r15.A00;
                AnonymousClass1MK A0W3 = C36381kD.A0W(r15);
                C21060yb A0U2 = C36351kA.A0U(r15);
                C18820ts A0T2 = C36341k9.A0T(r15);
                C24341Cb A0a2 = C36431kI.A0a(r15);
                C19420v0 A0Y3 = C36351kA.A0Y(r15);
                C20830yE A0X2 = C36351kA.A0X(r15);
                C19890wg A0m2 = C36351kA.A0m(r15);
                C27111My r16 = r32.A00;
                C39501sW r17 = r9;
                r0.A4l = new AnonymousClass3UB(A022, A023, A024, A0O2, r17, A0V4, (C57332y4) r16.A1H.get(), (C57342y5) r16.A1I.get(), A0C2, (C20690y0) r15.A6r.get(), A0M2, A0Y2, A0W3, r8, A0a2, A0U2, A0V2, A0W2, A0X2, A0Y3, A0T2, (C20060wx) r15.A8B.get(), (C21860zv) r2.A4A.get(), A0V3, A0g2, A0m2, r10, A0Z2, (C27721Pm) r2.A0t.get(), singletonList, i);
                return;
            }
            r0.A1U.A06(R.string.f12nameremoved, 1);
        }
    }

    public static void A1A(C70803fk r3, int i) {
        int A002;
        View view;
        if (i == 0) {
            A002 = r3.A2F.getBackgroundColorRes();
        } else if (C19550w8.A01() || !C222013h.A05) {
            ViewGroup viewGroup = r3.A0V;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                r3.A5o.get();
                AnonymousClass155 A0C2 = A0C(r3);
                AnonymousClass00C.A0D(A0C2, 0);
                A002 = C224314h.A00(A0C2);
            } else {
                A002 = R.color.f6nameremoved;
            }
        } else {
            A002 = R.color.f6nameremoved;
        }
        int A003 = AnonymousClass00F.A00(A0B(r3), A002);
        if (!r3.A3z.A08() || (view = r3.A0O) == null) {
            AnonymousClass1RB.A00(A05(r3), A003, true);
        } else {
            view.setBackgroundColor(A003);
        }
    }

    public static void A1C(C70803fk r2, long j, boolean z, boolean z2) {
        AnonymousClass141 A052;
        AnonymousClass4V6 r0 = r2.A2l;
        if (z2) {
            C19730wQ meManager = r0.getMeManager();
            meManager.A0G();
            A052 = meManager.A0E;
        } else {
            A052 = r0.getContactManager().A05(j);
        }
        if (A052 != null) {
            A1F(r2, A052, C36331k8.A0G(A052), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r13.A07 == null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1D(X.C70803fk r12, X.AnonymousClass3HD r13) {
        /*
            X.141 r5 = r13.A05
            r12.A3Y = r5
            X.9uZ r0 = r13.A04
            r12.A2G = r0
            A11(r12)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r1 = 17
            r0.setGravity(r1)
            android.widget.ImageView r0 = r12.A6f
            r3 = 8
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r12.A6g
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5e
            r0.setVisibility(r3)
            boolean r0 = r13.A0G
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0032
            X.141 r0 = r13.A06
            if (r0 == 0) goto L_0x0032
            X.147 r0 = r13.A07
            r9 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            X.147 r8 = r13.A07
            if (r8 == 0) goto L_0x0040
            com.whatsapp.community.ConversationCommunityViewModel r7 = r12.A2C
            X.0wU r6 = r7.A07
            r0 = 15
            X.C80263v7.A00(r6, r7, r8, r0)
        L_0x0040:
            boolean r0 = r13.A09
            java.lang.String r7 = "learn-more"
            if (r0 == 0) goto L_0x0107
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            r12.A0N()
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r4)
            android.view.View r0 = r12.A0H
            r0.setVisibility(r4)
            X.141 r0 = r12.A3Y
            boolean r0 = r0.A0i
            if (r0 == 0) goto L_0x00ae
            com.whatsapp.TextEmojiLabel r6 = r12.A1d
            r5 = 2131887536(0x7f1205b0, float:1.9409682E38)
        L_0x0063:
            r6.setText(r5)
        L_0x0066:
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setClickable(r4)
        L_0x006b:
            android.view.View r0 = r12.A0H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0096
            X.3Sr r1 = r12.A2n
            X.4UQ r0 = r1.A03
            boolean r0 = r0 instanceof X.C70853fp
            if (r0 == 0) goto L_0x0096
            X.1RJ r5 = r1.A0Q
            int r0 = r5.A00()
            if (r0 != 0) goto L_0x0096
            android.view.ViewGroup$LayoutParams r4 = r5.A02()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            X.01L r1 = r1.A0B
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = X.C65103Qt.A01(r1, r0)
            r4.bottomMargin = r0
            r5.A06(r4)
        L_0x0096:
            android.view.View r0 = r12.A0C
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x0490
            X.4V6 r0 = r12.A2l
            boolean r0 = r0.BMu()
            if (r0 != 0) goto L_0x0490
            r12.A1o()
            A1Y(r12)
            goto L_0x0490
        L_0x00ae:
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00b8
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r12.A0Z(r0, r2)
            goto L_0x0066
        L_0x00b8:
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x00ed
            X.4V6 r0 = r12.A2l
            X.1e1 r8 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            android.content.Context r6 = r0.getContext()
            X.4V6 r5 = r12.A2l
            r1 = 2131894755(0x7f1221e3, float:1.9424324E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r7
            java.lang.String r5 = r5.getString(r1, r0)
            r1 = 3
            X.3wT r0 = new X.3wT
            r0.<init>((X.C70803fk) r12, (int) r1)
            android.text.SpannableStringBuilder r1 = r8.A02(r6, r0, r5, r7)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            X.0yC r0 = r12.A3n
            X.C36331k8.A10(r1, r0)
            goto L_0x0066
        L_0x00ed:
            int r0 = r13.A00
            if (r0 != r2) goto L_0x0100
            int r1 = r13.A01
            com.whatsapp.TextEmojiLabel r6 = r12.A1d
            r0 = 6
            r5 = 2131888631(0x7f1209f7, float:1.9411903E38)
            if (r1 != r0) goto L_0x0063
            r5 = 2131888630(0x7f1209f6, float:1.94119E38)
            goto L_0x0063
        L_0x0100:
            com.whatsapp.TextEmojiLabel r6 = r12.A1d
            r5 = 2131887538(0x7f1205b2, float:1.9409686E38)
            goto L_0x0063
        L_0x0107:
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x0159
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r3)
            android.view.View r0 = r12.A0H
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1c
            r0.setVisibility(r4)
            boolean r0 = r12.A2a()
            if (r0 == 0) goto L_0x012d
            X.6YP r0 = r12.A5Z
            X.C18740tg.A06(r0)
            r0.A0T(r4, r4)
        L_0x012d:
            com.whatsapp.TextEmojiLabel r1 = r12.A1c
            r0 = 2131888510(0x7f12097e, float:1.9411657E38)
            r1.setText(r0)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A37
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x006b
            X.155 r0 = A0C(r12)
            X.1qm r4 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131888511(0x7f12097f, float:1.941166E38)
            r4.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            r4.A0h(r0, r1)
            X.C36341k9.A11(r4)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A37
            r0.A00 = r2
            goto L_0x006b
        L_0x0159:
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x01d0
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r3)
            android.view.View r0 = r12.A0H
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r12.A1c
            X.0yC r0 = r12.A3n
            X.C36331k8.A1A(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r12.A1c
            r0.setVisibility(r4)
            boolean r0 = r12.A2a()
            if (r0 == 0) goto L_0x0186
            X.6YP r0 = r12.A5Z
            X.C18740tg.A06(r0)
            r0.A0T(r4, r4)
        L_0x0186:
            X.4V6 r1 = r12.A2l
            r0 = 2131894956(0x7f1222ac, float:1.9424731E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r7 = X.C36441kJ.A0P(r0)
            X.155 r1 = A0C(r12)
            r0 = 2
            X.4Vw r5 = new X.4Vw
            r5.<init>(r1, r12, r0)
            int r1 = r7.length()
            r0 = 33
            r7.setSpan(r5, r4, r1, r0)
            X.4V6 r0 = r12.A2l
            X.0wQ r0 = r0.getMeManager()
            boolean r6 = r0.A0L()
            com.whatsapp.TextEmojiLabel r5 = r12.A1c
            X.4V6 r1 = r12.A2l
            r0 = 2131894947(0x7f1222a3, float:1.9424713E38)
            if (r6 == 0) goto L_0x01bc
            r0 = 2131894948(0x7f1222a4, float:1.9424715E38)
        L_0x01bc:
            java.lang.String r1 = r1.getString(r0)
            android.text.Spannable[] r0 = new android.text.Spannable[r2]
            r0[r4] = r7
            android.text.SpannableStringBuilder r0 = X.AnonymousClass6YV.A04(r1, r0)
            r5.setText(r0)
            A1R(r12, r4)
            goto L_0x006b
        L_0x01d0:
            boolean r0 = r13.A0E
            if (r0 != 0) goto L_0x029d
            X.11F r0 = r12.A45
            boolean r0 = r12.A1h(r0)
            if (r0 != 0) goto L_0x029d
            com.whatsapp.jid.UserJid r0 = r13.A08
            if (r0 == 0) goto L_0x0223
            X.4V6 r0 = r12.A2l
            X.1e1 r8 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            android.content.Context r7 = r0.getContext()
            X.4V6 r5 = r12.A2l
            r1 = 2131893129(0x7f121b89, float:1.9421026E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r6 = "redirect-chat"
            r0[r4] = r6
            java.lang.String r5 = r5.getString(r1, r0)
            r1 = 33
            X.3v9 r0 = new X.3v9
            r0.<init>(r12, r13, r1)
            android.text.SpannableStringBuilder r1 = r8.A02(r7, r0, r5, r6)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            X.0yC r0 = r12.A3n
            X.C36331k8.A10(r1, r0)
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            android.view.View r0 = r12.A0H
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r4)
            goto L_0x006b
        L_0x0223:
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x022e
            A15(r12)
            goto L_0x006b
        L_0x022e:
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0298
            com.whatsapp.jid.UserJid r6 = X.C36351kA.A0l(r5)
            if (r6 == 0) goto L_0x0298
            X.0yC r1 = r12.A3n
            X.AnonymousClass00C.A0D(r1, r4)
            r0 = 6743(0x1a57, float:9.449E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0298
            X.0yC r5 = r12.A3n
            X.005 r0 = r12.A5p
            java.lang.Object r0 = r0.get()
            X.32W r0 = (X.AnonymousClass32W) r0
            X.3N5 r0 = r0.A00
            java.lang.String r1 = X.AnonymousClass3N5.A00(r0)
            X.AnonymousClass00C.A0D(r5, r4)
            X.AnonymousClass00C.A0D(r1, r2)
            java.util.HashSet r0 = X.AnonymousClass6TR.A00(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0298
            X.1Hx r0 = r12.A3B
            X.1IO r0 = r0.A01
            X.9Xu r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x0298
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "business_search"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0298
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1c
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r4)
            android.view.View r0 = r12.A0H
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            java.lang.String r0 = "You can't send messages in this chat because Business Search isn't launched in your country"
            r1.setText(r0)
            goto L_0x0066
        L_0x0298:
            A0o(r12)
            goto L_0x006b
        L_0x029d:
            r6 = 3
            if (r9 == 0) goto L_0x02b0
            int r0 = r13.A01
            if (r0 != r6) goto L_0x031d
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setGravity(r1)
        L_0x02a9:
            android.view.View r1 = r12.A0H
            r0 = 49
            X.C48812i6.A00(r1, r13, r12, r0)
        L_0x02b0:
            android.view.View r0 = r12.A0C
            r0.setVisibility(r3)
            r12.A0N()
            boolean r0 = r12.A2a()
            if (r0 == 0) goto L_0x02c6
            X.6YP r0 = r12.A5Z
            X.C18740tg.A06(r0)
            r0.A0T(r4, r4)
        L_0x02c6:
            android.view.View r0 = r12.A0H
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r4)
            if (r9 == 0) goto L_0x0346
            int r0 = r13.A01
            if (r0 != r6) goto L_0x0346
            X.4V6 r0 = r12.A2l
            X.1e1 r6 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            android.content.Context r5 = r0.getContext()
            X.4V6 r9 = r12.A2l
            X.0yC r8 = r12.A3n
            X.0yV r1 = X.C21000yV.A01
            r0 = 4727(0x1277, float:6.624E-42)
            boolean r0 = X.C20800yB.A01(r1, r8, r0)
            r1 = 2131890060(0x7f120f8c, float:1.9414801E38)
            if (r0 == 0) goto L_0x02f6
            r1 = 2131890061(0x7f120f8d, float:1.9414803E38)
        L_0x02f6:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r7
            java.lang.String r4 = r9.getString(r1, r0)
            r1 = 4
            X.3wT r0 = new X.3wT
            r0.<init>((X.C70803fk) r12, (int) r1)
            android.text.SpannableStringBuilder r1 = r6.A02(r5, r0, r4, r7)
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            X.0yC r0 = r12.A3n
            X.C36331k8.A10(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            X.0yb r0 = r12.A31
            X.C36331k8.A16(r1, r0)
            goto L_0x006b
        L_0x031d:
            com.whatsapp.TextEmojiLabel r1 = r12.A1d
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            X.141 r5 = r13.A06
            android.widget.ImageView r0 = r12.A6g
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r12.A6f
            r0.setVisibility(r4)
            X.4V6 r0 = r12.A2l
            X.3QY r1 = r0.getConversationRowInflater()
            X.155 r0 = r0.getActivityNullable()
            X.1RY r1 = r1.A02(r0)
            android.widget.ImageView r0 = r12.A6g
            r1.A08(r0, r5)
            goto L_0x02a9
        L_0x0346:
            X.141 r1 = r12.A3Y
            X.11F r0 = r1.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x03fd
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0356
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x03fd
        L_0x0356:
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            r0.setVisibility(r3)
            X.383 r6 = r12.A6m
            X.141 r1 = r12.A3Y
            java.lang.Class<X.1Uw> r0 = X.C28981Uw.class
            com.whatsapp.jid.Jid r7 = X.C36381kD.A0e(r1, r0)
            X.11F r7 = (X.AnonymousClass11F) r7
            android.view.View r5 = r12.A0H
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r10 = 0
            X.AnonymousClass00C.A0D(r7, r4)
            X.AnonymousClass00C.A0D(r5, r2)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0386
            X.3hE r1 = r6.A01
            X.3IZ r0 = r1.A01(r7)
            if (r0 == 0) goto L_0x038d
            X.2La r0 = r0.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x038d
        L_0x0386:
            r5.setVisibility(r3)
            r6.A00 = r2
            goto L_0x006b
        L_0x038d:
            java.lang.ref.WeakReference r0 = r6.A03
            java.lang.Object r8 = r0.get()
            X.014 r8 = (X.AnonymousClass014) r8
            if (r8 == 0) goto L_0x006b
            X.00s r4 = r1.A00
            r1 = 9
            X.4ZI r0 = new X.4ZI
            r0.<init>(r7, r1)
            X.08S r4 = X.AnonymousClass0VV.A00(r0, r4)
            X.4M3 r1 = new X.4M3
            r1.<init>(r5, r6)
            r0 = 16
            X.C66033Uk.A00(r8, r4, r1, r0)
            r5.setVisibility(r10)
            r0 = 2131432016(0x7f0b1250, float:1.8485778E38)
            android.view.ViewStub r0 = X.C36431kI.A0M(r5, r0)
            if (r0 == 0) goto L_0x03bd
            r0.inflate()
        L_0x03bd:
            r0 = 2131432899(0x7f0b15c3, float:1.8487568E38)
            android.widget.TextView r4 = X.C36391kE.A0P(r5, r0)
            if (r4 == 0) goto L_0x03ed
            r0 = 2131891463(0x7f121507, float:1.9417647E38)
            java.lang.String r9 = X.C36361kB.A0m(r8, r0)
            r0 = 2131100330(0x7f0602aa, float:1.7813038E38)
            java.lang.String r1 = X.AnonymousClass14B.A03(r8, r0)
            X.AnonymousClass00C.A08(r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r10] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = X.AnonymousClass14B.A0I(r0)
            java.lang.String r0 = java.lang.String.format(r1, r9, r0)
            X.C36361kB.A1P(r0, r4)
            r0 = 42
            X.C67113Yo.A00(r4, r8, r6, r7, r0)
        L_0x03ed:
            r0 = 2131428868(0x7f0b0604, float:1.8479393E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x006b
            r0 = 48
            X.AnonymousClass3YF.A00(r1, r6, r5, r0)
            goto L_0x006b
        L_0x03fd:
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0463
            X.0yC r0 = r12.A3n
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 != 0) goto L_0x0463
            X.3AV r6 = r12.A2k
            X.155 r10 = A0C(r12)
            com.whatsapp.TextEmojiLabel r5 = r12.A1d
            r9 = 0
            X.AnonymousClass00C.A0D(r10, r4)
            X.AnonymousClass00C.A0D(r5, r2)
            X.0yC r7 = r6.A05
            r0 = 5985(0x1761, float:8.387E-42)
            int r1 = r7.A07(r0)
            X.2pJ r0 = X.C52362pJ.COUNTRY_DISABLED
            int r0 = r0.value
            if (r1 != r0) goto L_0x0430
            r0 = 2131887071(0x7f1203df, float:1.9408739E38)
            r5.setText(r0)
            goto L_0x006b
        L_0x0430:
            r11 = 2131887070(0x7f1203de, float:1.9408737E38)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.1fu r0 = r6.A01
            android.net.Uri r0 = r0.A00()
            r4 = 2131887072(0x7f1203e0, float:1.940874E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r1, r9, r4)
            java.lang.String r4 = X.C36351kA.A0x(r10, r0, r8, r9, r11)
            X.1e1 r1 = r6.A06
            android.content.Context r0 = r5.getContext()
            android.text.SpannableString r0 = r1.A00(r0, r4)
            r5.setText(r0)
            X.C36331k8.A10(r5, r7)
            X.0yb r0 = r6.A04
            X.C36331k8.A16(r5, r0)
            goto L_0x006b
        L_0x0463:
            X.0yC r0 = r12.A3n
            boolean r0 = X.C36421kH.A1Z(r0)
            if (r0 == 0) goto L_0x047a
            X.1NG r1 = r12.A1z
            X.141 r0 = r12.A3Y
            boolean r0 = X.C36331k8.A1Y(r1, r0)
            if (r0 == 0) goto L_0x047a
            A0t(r12)
            goto L_0x006b
        L_0x047a:
            com.whatsapp.TextEmojiLabel r6 = r12.A1d
            boolean r5 = r13.A0F
            int r1 = r13.A00
            boolean r0 = X.AnonymousClass000.A1S(r1, r2)
            A0Y(r6, r12, r5, r0)
            if (r1 == r2) goto L_0x006b
            com.whatsapp.TextEmojiLabel r0 = r12.A1d
            X.C48902iF.A00(r0, r12, r13, r4)
            goto L_0x006b
        L_0x0490:
            A13(r12)     // Catch:{ all -> 0x064e }
            int r5 = r13.A03
            X.3Fr r0 = r12.A2Z
            java.lang.Class<X.2HN> r1 = X.AnonymousClass2HN.class
            X.3Ok r0 = r0.A00
            X.3uz r4 = r0.A00(r1)
            X.2HN r4 = (X.AnonymousClass2HN) r4
            if (r4 == 0) goto L_0x04c6
            X.141 r1 = r12.A3Y
            r4.A00 = r5
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0631
            X.147 r0 = X.C36431kI.A0j(r1)
        L_0x04b1:
            r4.A02 = r0
            boolean r0 = r1.A0u
            r4.A03 = r0
            boolean r1 = r4.A0B()
            boolean r0 = r4.A0C()
            if (r1 == 0) goto L_0x0629
            if (r0 == 0) goto L_0x0624
            X.AnonymousClass2HN.A00(r4)
        L_0x04c6:
            int r6 = r13.A02
            X.3Fr r0 = r12.A2Z
            java.lang.Class<X.2HM> r1 = X.AnonymousClass2HM.class
            X.3Ok r0 = r0.A00
            X.3uz r5 = r0.A00(r1)
            X.2HM r5 = (X.AnonymousClass2HM) r5
            if (r5 == 0) goto L_0x04fa
            X.11F r1 = r12.A45
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x04fa
            X.1LV r0 = r12.A2B
            X.147 r1 = (X.AnonymousClass147) r1
            X.147 r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x04fa
            r4 = 0
            r5.A00 = r6
            r5.A02 = r0
            boolean r1 = r5.A0B()
            boolean r0 = r5.A0C()
            if (r1 == 0) goto L_0x061d
            if (r0 == 0) goto L_0x0618
            X.AnonymousClass2HM.A00(r5)
        L_0x04fa:
            X.3Fr r0 = r12.A2Z
            java.lang.Class<X.2HJ> r1 = X.AnonymousClass2HJ.class
            X.3Ok r0 = r0.A00
            X.3uz r1 = r0.A00(r1)
            X.2HJ r1 = (X.AnonymousClass2HJ) r1
            if (r1 == 0) goto L_0x0517
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0612
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x060d
            r1.A0D()
        L_0x0517:
            X.0yC r1 = r12.A3n
            r0 = 5002(0x138a, float:7.009E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x053e
            X.3Fr r0 = r12.A2Z
            java.lang.Class<X.2HK> r1 = X.AnonymousClass2HK.class
            X.3Ok r0 = r0.A00
            X.3uz r1 = r0.A00(r1)
            X.2HK r1 = (X.AnonymousClass2HK) r1
            if (r1 == 0) goto L_0x053e
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0607
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x0602
            X.AnonymousClass2HK.A00(r1)
        L_0x053e:
            com.whatsapp.TextEmojiLabel r6 = r12.A1d
            boolean r5 = r13.A0C
            boolean r4 = r13.A0D
            boolean r0 = A1X(r12)
            if (r0 == 0) goto L_0x05a2
            X.1nd r1 = A0D(r12)
            boolean r0 = r1.A0E
            if (r0 == r4) goto L_0x056b
            X.11F r0 = r12.A45
            X.1Uw r0 = (X.C28981Uw) r0
            r12.A1U(r0, r4)
            r1.A0E = r4
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            com.whatsapp.conversation.ConversationListView r0 = r12.A2U
            r0.A05()
            X.4V6 r0 = r12.A2l
            r0.invalidateOptionsMenu()
        L_0x056b:
            if (r4 == 0) goto L_0x05a2
            if (r5 == 0) goto L_0x05a2
            android.view.View r0 = r12.A0H
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setOrientation(r2)
            r6.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5e
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5e
            r0 = 2131891552(0x7f121560, float:1.9417827E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5e
            X.1gn r0 = X.C34301gn.DESTRUCTIVE
            r1.setAction(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.C36371kC.A0N()
            r0 = 17
            r1.gravity = r0
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5e
            r0.setLayoutParams(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5e
            r0 = 18
            X.C66963Xz.A00(r1, r12, r0)
        L_0x05a2:
            com.whatsapp.mentions.MentionableEntry r3 = r12.A4B
            if (r3 == 0) goto L_0x05c4
            X.1K3 r0 = X.AnonymousClass3B6.A00(r12)
            X.11F r1 = r12.A45
            X.1K4 r0 = (X.AnonymousClass1K4) r0
            X.1K5 r0 = r0.A01
            boolean r5 = r0.A01(r1)
            com.whatsapp.mentions.MentionPickerView r4 = r3.A0B
            if (r4 == 0) goto L_0x05c4
            X.0wU r3 = r4.A0N
            r1 = 42
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r5)
            r3.Bp1(r0)
        L_0x05c4:
            X.9uZ r0 = r12.A2G
            if (r0 == 0) goto L_0x0601
            X.0yC r1 = r12.A3n
            r0 = 5747(0x1673, float:8.053E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0601
            X.3B6 r0 = A0F(r12)
            X.1Es r5 = r0.A06
            X.141 r4 = r12.A3Y
            X.31I r3 = new X.31I
            r3.<init>(r12)
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x0601
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0601
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = "unset"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0634
            boolean r1 = X.C25031Es.A00(r4, r5)
            X.3fk r0 = r3.A00
            r0.A6U = r1
        L_0x0601:
            return
        L_0x0602:
            r1.A08()
            goto L_0x053e
        L_0x0607:
            r0 = 0
            r1.A0A(r0)
            goto L_0x053e
        L_0x060d:
            r1.A08()
            goto L_0x0517
        L_0x0612:
            r0 = 0
            r1.A0A(r0)
            goto L_0x0517
        L_0x0618:
            r5.A08()
            goto L_0x04fa
        L_0x061d:
            if (r0 == 0) goto L_0x04fa
            r5.A0A(r4)
            goto L_0x04fa
        L_0x0624:
            r4.A08()
            goto L_0x04c6
        L_0x0629:
            if (r0 == 0) goto L_0x04c6
            r0 = 0
            r4.A0A(r0)
            goto L_0x04c6
        L_0x0631:
            r0 = 0
            goto L_0x04b1
        L_0x0634:
            X.1Em r1 = r5.A02
            X.3uL r0 = new X.3uL
            r0.<init>(r3, r4, r5)
            X.1En r5 = r1.A01
            X.3dr r4 = new X.3dr
            r4.<init>(r0, r1)
            long[] r3 = new long[r2]
            r2 = 0
            r0 = 20231027(0x134b373, double:9.9954554E-317)
            r3[r2] = r0
            r5.A00(r4, r3)
            return
        L_0x064e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1D(X.3fk, X.3HD):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1E(X.C70803fk r4, X.AnonymousClass3PE r5) {
        /*
            java.lang.String r3 = r5.A09
            java.lang.String r1 = r5.A08
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 == 0) goto L_0x0011
            boolean r0 = X.AnonymousClass14B.A0F(r3)
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 != 0) goto L_0x0024
            X.0yC r1 = A0H(r4)
            r0 = 3994(0xf9a, float:5.597E-42)
        L_0x001d:
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0024:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0031
            X.0yC r1 = A0H(r4)
            r0 = 2255(0x8cf, float:3.16E-42)
            goto L_0x001d
        L_0x0031:
            X.141 r0 = r4.A3Y
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)
            if (r1 == 0) goto L_0x0010
            r0 = 44
            X.74l r2 = new X.74l
            r2.<init>(r4, r1, r3, r0)
            X.9XI r0 = r4.A1o
            X.3ty r1 = r0.A02(r1)
            r0 = 11
            X.C79593ty.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1E(X.3fk, X.3PE):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[Catch:{ ActivityNotFoundException -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1F(X.C70803fk r5, X.AnonymousClass141 r6, X.AnonymousClass11F r7, boolean r8) {
        /*
            if (r8 == 0) goto L_0x0033
            X.1eE r0 = r5.A5A     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.0yC r1 = r0.A00     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r0 = 913(0x391, float:1.28E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            if (r0 == 0) goto L_0x0033
            X.155 r4 = A0C(r5)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            if (r4 == 0) goto L_0x006f
            boolean r0 = r4.isFinishing()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            if (r0 != 0) goto L_0x006f
            X.1eE r1 = r5.A5A     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.01z r0 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r1.A05(r0, r6, r7)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.01z r3 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            java.lang.String r2 = "request_bottom_sheet_fragment"
            r1 = 3
            X.3RF r0 = new X.3RF     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r0.<init>(r5, r1)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r3.A0l(r0, r4, r2)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            goto L_0x0040
        L_0x0033:
            X.1eE r0 = r5.A5A     // Catch:{ ActivityNotFoundException -> 0x0066 }
            android.content.Intent r2 = r0.A03(r6, r7, r8)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.4V6 r1 = r5.A2l     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r0 = 13
            r1.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0066 }
        L_0x0040:
            X.36b r0 = r5.A3A     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.1YG r3 = r0.A02     // Catch:{ ActivityNotFoundException -> 0x0066 }
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r7)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.0yC r1 = r3.A03     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r0 = 2805(0xaf5, float:3.93E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            if (r0 == 0) goto L_0x005b
            r0 = 22
            if (r8 == 0) goto L_0x0058
            r0 = 21
        L_0x0058:
            X.AnonymousClass1YG.A01(r3, r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0066 }
        L_0x005b:
            X.4V6 r0 = r5.A2l     // Catch:{ ActivityNotFoundException -> 0x0066 }
            X.1dz r1 = r0.getAddContactLogUtil()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r0 = 5
            r1.A03(r8, r0)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            return
        L_0x0066:
            X.155 r1 = A0B(r5)
            r0 = 12
            X.AnonymousClass3SJ.A01(r1, r0)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1F(X.3fk, X.141, X.11F, boolean):void");
    }

    public static void A1G(C70803fk r6, AnonymousClass3T1 r7) {
        int i;
        int A072;
        ConversationListView conversationListView = r6.A2U;
        int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
        int lastVisiblePosition = conversationListView.getLastVisiblePosition();
        int A062 = conversationListView.getConversationCursorAdapter().A06(r7);
        if (A062 >= 0 && (i = A062 + 1) >= firstVisiblePosition) {
            if (i <= lastVisiblePosition) {
                View childAt = conversationListView.getChildAt(i - firstVisiblePosition);
                if (childAt == null || childAt.getTop() <= (A072 = C36441kJ.A07(conversationListView) - C36441kJ.A07(childAt))) {
                    return;
                }
            } else {
                A072 = C36441kJ.A07(conversationListView);
            }
            conversationListView.smoothScrollToPositionFromTop(i, A072);
            if (!conversationListView.A0K) {
                conversationListView.setTranscriptMode(0);
                conversationListView.setVisibility(0);
                r6.A5Q.A03(0);
                r6.A2x.A03 = 0;
                A1P(r6, false);
            }
        }
    }

    public static void A1H(C70803fk r7, Boolean bool, List list) {
        String A0t2;
        if (list == null || list.isEmpty() || !Boolean.TRUE.equals(bool)) {
            r7.A5K.A03(8);
            return;
        }
        r7.A5K.A03(0);
        r7.A5K.A05(r7.A7H);
        TextView A0H2 = C36401kF.A0H(A0B(r7), R.id.active_cart_badge);
        C18820ts r72 = r7.A36;
        AnonymousClass00C.A0D(r72, 0);
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AnonymousClass6B4) it.next()).A00;
        }
        if (j == 0) {
            A0t2 = "";
        } else if (j <= 99) {
            A0t2 = r72.A0M().format(j);
            AnonymousClass00C.A0B(A0t2);
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(r72.A0M().format(99));
            A0t2 = AnonymousClass000.A0t(A0u2, '+');
        }
        A0H2.setText(A0t2);
    }

    public static void A1I(C70803fk r0, String str) {
        r0.A2l.BPK(str);
    }

    public static void A1J(C70803fk r3, String str) {
        if (str == null || str.length() <= 0 || r3.A3T.A0N() || C36341k9.A0E(r3.A35).getInt("backup_restore_state", 0) != 512) {
            AnonymousClass1RJ r1 = r3.A5N;
            if (r1 == null) {
                r1 = new AnonymousClass1RJ(r3.A2l.findViewById(R.id.conversation_fts_not_ready_view_stub));
                r3.A5N = r1;
            }
            r1.A03(8);
            C40061uh r12 = r3.A2x;
            r12.A0G = str;
            r12.A0I = C202859mm.A03(r3.A36, str);
            C40061uh r13 = r3.A2x;
            r13.A0H = r13.A0G;
            C38051nd.A00(r3);
            return;
        }
        AnonymousClass1RJ r14 = r3.A5N;
        if (r14 == null) {
            r14 = new AnonymousClass1RJ(r3.A2l.findViewById(R.id.conversation_fts_not_ready_view_stub));
            r3.A5N = r14;
        }
        r14.A03(0);
    }

    public static void A1M(C70803fk r10, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(r10.A2x.A0G);
        C40061uh r1 = r10.A2x;
        if (isEmpty) {
            r1.A0G = null;
            r1.A0I = null;
            return;
        }
        r1.A0H = r1.A0G;
        r10.A1o();
        int firstPosition = r10.A2U.getFirstPosition();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("conversation/search/ first-visible:");
        A0u2.append(r10.A2U.getFirstVisiblePosition());
        A0u2.append(" header-count:");
        A0u2.append(r10.A2U.getHeaderViewsCount());
        A0u2.append(" first-pos:");
        A0u2.append(firstPosition);
        boolean z2 = z;
        C36321k7.A1X(" up:", A0u2, z);
        if (firstPosition < 0) {
            r10.A0P();
            return;
        }
        C38051nd A0D2 = A0D(r10);
        AnonymousClass3T1 A082 = A0D2.getItem(firstPosition);
        if (A082 != null) {
            if (A082.A1J.A00 == null) {
                Log.i("conversation/search/divider-at-search-position");
                A082 = A0D2.getItem(firstPosition + 1);
                if (A082 == null) {
                    Log.w("conversation/search/first-message-is-null");
                    return;
                }
            }
            C50082kB r0 = r10.A6j;
            if (r0 != null) {
                r0.A0D(true);
            }
            AnonymousClass1S3 r2 = r10.A4o;
            if (r2 == null) {
                r2 = r10.A3T.A0D(r10.A45);
                r10.A4o = r2;
            }
            C40061uh r12 = r10.A2x;
            r2.A04(r12.A0G);
            r2.A05(r12.A0I);
            C19970wo time = r10.A2l.getTime();
            AnonymousClass17U r5 = r10.A3W;
            C20650xu r4 = r10.A3T;
            AnonymousClass4V6 r13 = r10.A2l;
            r10.A6j = new C50082kB(r13, time, r13.getCoreMessageStore(), r4, r5, A082, r10.A4o, r13.getFMessageDatabase(), z2);
            C36371kC.A1P(r10.A6j, A0K(r10));
        }
    }

    public static void A1N(C70803fk r3, boolean z) {
        Jid A0h2 = C36411kG.A0h(r3.A3Y);
        A7c.remove(A0h2);
        AnonymousClass1YG r0 = r3.A3A.A02;
        UserJid A0b2 = C36401kF.A0b(A0h2);
        if (A0b2 != null) {
            AnonymousClass1YG.A00(r0, A0b2).A01 = false;
        }
        AnonymousClass6YP r1 = r3.A5Z;
        if (r1 != null) {
            r1.A09 = null;
            r1.A0A = null;
        }
        AnonymousClass1YG r02 = r3.A3A.A02;
        if (A0b2 != null) {
            AnonymousClass1YG.A00(r02, A0b2).A02 = false;
        }
        if (z) {
            AnonymousClass3HK r03 = r3.A3E;
            AnonymousClass11F r12 = r03.A0A;
            if (r12 != null) {
                C64553Ol r04 = r03.A0P;
                r04.A01.remove(r12.getRawString());
            }
            A0k(r3);
        }
    }

    public static void A1O(C70803fk r2, boolean z) {
        View A012;
        View A013;
        View findViewById = r2.A2l.findViewById(16908298);
        if (findViewById != null) {
            int i = 4;
            if (z) {
                i = 1;
            }
            findViewById.setImportantForAccessibility(i);
        }
        AnonymousClass1RJ r1 = r2.A5Q;
        if (!(r1.A00 == null || (A013 = r1.A01()) == null)) {
            int i2 = 4;
            if (z) {
                i2 = 1;
            }
            A013.setImportantForAccessibility(i2);
        }
        AnonymousClass1RJ r12 = r2.A5R;
        if (r12.A00 != null && (A012 = r12.A01()) != null) {
            int i3 = 4;
            if (z) {
                i3 = 1;
            }
            A012.setImportantForAccessibility(i3);
        }
    }

    public static void A1P(C70803fk r4, boolean z) {
        if (r4.A5K.A00 != null) {
            int dimensionPixelSize = r4.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = r4.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            View A012 = r4.A5K.A01();
            int i = 0;
            if (!z) {
                i = dimensionPixelSize2;
                dimensionPixelSize2 = 0;
            }
            A012.setPadding(dimensionPixelSize, i, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public static void A1Q(C70803fk r3, boolean z) {
        ExpressionsBottomSheetView expressionsBottomSheetView = r3.A3l;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.setCurrentChatJid(r3.A45);
            r3.A3l.setVisibility(0);
            r3.A3l.getViewTreeObserver().addOnGlobalLayoutListener(new C90144Zg(1, r3, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0.A1J.A02 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1R(X.C70803fk r5, boolean r6) {
        /*
            if (r6 != 0) goto L_0x0009
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A58
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            X.0FM r0 = r5.A6h
            if (r0 == 0) goto L_0x0010
            r0.dismiss()
        L_0x0010:
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r2 = r5.A58
            X.11F r0 = r5.A45
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            X.1Cv r0 = r2.A04
            X.3T1 r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x0027
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            r4 = 1
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            X.4V6 r0 = r5.A2l
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131624770(0x7f0e0342, float:1.887673E38)
            r2 = 0
            android.view.View r1 = r1.inflate(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131894953(0x7f1222a9, float:1.9424725E38)
            r1.setText(r0)
            X.155 r0 = A0C(r5)
            X.1qm r3 = X.AnonymousClass3LW.A00(r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0Y(r1)
            r0.A0Y(r1)
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A58
            X.0wQ r0 = r0.A03
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x009f
            r0 = 2131894952(0x7f1222a8, float:1.9424723E38)
            if (r4 == 0) goto L_0x0060
            r0 = 2131894946(0x7f1222a2, float:1.9424711E38)
        L_0x0060:
            r3.A0c(r0)
            X.4V6 r0 = r5.A2l
            X.0wQ r0 = r0.getMeManager()
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0084
            r0 = 2131891807(0x7f12165f, float:1.9418344E38)
            r3.setPositiveButton(r0, r2)
        L_0x0075:
            X.0FM r0 = r3.create()
            r5.A6h = r0
            r0.show()
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r5.A58
            r0 = 1
            r1.A00 = r0
            return
        L_0x0084:
            r2 = 2131894950(0x7f1222a6, float:1.942472E38)
            r1 = 37
            X.4XM r0 = new X.4XM
            r0.<init>(r5, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131894949(0x7f1222a5, float:1.9424717E38)
            r1 = 38
            X.4XM r0 = new X.4XM
            r0.<init>(r5, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x0075
        L_0x009f:
            r0 = 2131894951(0x7f1222a7, float:1.9424721E38)
            if (r4 == 0) goto L_0x0060
            r0 = 2131894945(0x7f1222a1, float:1.942471E38)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1R(X.3fk, boolean):void");
    }

    public static void A1S(C70803fk r4, boolean z) {
        r4.A1V.A04 = true;
        BottomSheetBehavior bottomSheetBehavior = r4.A0n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0W(5);
        }
        r4.A1V.postDelayed(new AnonymousClass75B(29, (Object) r4, z), (long) (A00(r4) * 300.0f));
    }

    private void A1T(AnonymousClass3XU r18) {
        AnonymousClass3XN r0;
        AnonymousClass3XN r02;
        if (C36331k8.A1Y(this.A1z, this.A3Y)) {
            AnonymousClass3SJ.A03(this);
            return;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(this.A45);
        AnonymousClass3XU r1 = r18;
        AnonymousClass3XN r7 = r1.A01;
        if (r7.A01 > 0) {
            r0 = r7;
        } else {
            r0 = r1.A02;
        }
        int i = r0.A01;
        if (r7.A00 > 0) {
            r02 = r7;
        } else {
            r02 = r1.A02;
        }
        int i2 = r02.A00;
        String stringText = this.A4B.getStringText();
        this.A2l.startActivityForResult(AnonymousClass190.A1K(A0C(this), r1.A02.A02, r7.A02, r1.A03.A02, A0I2, r1.A00, 22, this.A6F, false).putExtra("media_width", i).putExtra("media_height", i2).putExtra("jid", AnonymousClass143.A03(this.A45)).putExtra("caption", stringText).putExtra("mentions", C65713Te.A01(this.A4B.getMentions())).putExtra("clear_message_after_send", C36421kH.A1a(stringText)).putExtra("usage_quote", AnonymousClass000.A1V(this.A2x.A0F)), 25);
    }

    private void A1U(C28981Uw r8, boolean z) {
        C52282pB r3;
        String string;
        TextView textView = (TextView) this.A2l.findViewById(R.id.suspended_newsletter_view_text);
        if (textView != null) {
            if (z) {
                this.A2U.setEmptyView(textView);
                C44072La r0 = (C44072La) C36371kC.A0W(((AnonymousClass3G3) A0G(this).A0D.get()).A00, r8);
                if (r0 != null) {
                    r3 = r0.A0E;
                } else {
                    r3 = null;
                }
                if (r3 == C52282pB.NOT_ENFORCED || r3 == null) {
                    this.A39.A00(C188648zz.A0E, r3.toString());
                } else {
                    if (r3.ordinal() != 2) {
                        C36361kB.A1P(A0C(this).getString(R.string.f12nameremoved), textView);
                    } else {
                        String A012 = A0G(this).A06.A01(A0G(this).A06.A00());
                        if (A012 == null) {
                            string = this.A2l.getString(R.string.f12nameremoved);
                        } else {
                            string = this.A2l.getString(R.string.f12nameremoved, A012);
                        }
                        textView.setText(string);
                        C66963Xz.A00(textView, this, 19);
                    }
                    textView.setTextSize(this.A2S.A01(this.A2l.getResources()));
                    textView.setBackgroundResource(R.drawable.date_balloon);
                    C36331k8.A0r(A0B(this), textView, R.color.f6nameremoved);
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }

    public static boolean A1W(C70803fk r1) {
        r1.A2l.getImeUtils();
        return AnonymousClass1N2.A00(r1.A0C);
    }

    public static boolean A1X(C70803fk r0) {
        return r0.A3Y.A0H instanceof C28981Uw;
    }

    public static boolean A1Y(C70803fk r3) {
        r3.A4c.A04(false);
        AnonymousClass2M8 r0 = r3.A3r;
        if (r0 != null && r0.isShowing()) {
            r3.A3r.dismiss();
            return true;
        } else if (!A1e(r3)) {
            return false;
        } else {
            r3.A1n();
            return true;
        }
    }

    public static boolean A1Z(C70803fk r2) {
        if (!r2.A6L || 3 != r2.A3O.A05(C65533Sl.A01(r2.A45))) {
            return false;
        }
        return true;
    }

    public static boolean A1c(C70803fk r1) {
        if (r1.A3z.A08() || !A1e(r1) || !r1.A3n.A09(6409).contains(C52302pD.USE_KEYBOARD_LISTENER_DELAYED.value)) {
            return false;
        }
        return true;
    }

    public static boolean A1d(C70803fk r1) {
        if (r1.A3z.A08() || !A1e(r1) || !r1.A3n.A09(6409).contains(C52302pD.USE_KEYBOARD_LISTENER.value)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1f(X.C70803fk r9) {
        /*
            X.9uZ r1 = r9.A2G
            r5 = 1
            r8 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x000e
            int r0 = r1.A00
        L_0x000c:
            if (r0 != r5) goto L_0x0075
        L_0x000e:
            return r5
        L_0x000f:
            X.11F r0 = r9.A45
            com.whatsapp.jid.UserJid r7 = X.C36401kF.A0b(r0)
            if (r7 == 0) goto L_0x0085
            X.141 r0 = r9.A3Y
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0085
            X.4V6 r0 = r9.A2l
            X.1KK r0 = r0.getBusinessProfileManager()
            X.1LE r0 = r0.A06
            java.lang.String r6 = r7.getRawString()
            X.16r r0 = r0.A00
            X.1M0 r4 = r0.get()
            java.lang.String r2 = "SELECT welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?"
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x007e }
            r1[r8] = r6     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "GET_BUSINESS_WELCOME_MESSAGE_PROTOCOL_MODE"
            android.database.Cursor r2 = X.C229416o.A03(r4, r2, r0, r1)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "welcome_message_protocol_mode"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0077 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0059
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            r2.close()     // Catch:{ all -> 0x007e }
            r4.close()
            if (r3 != 0) goto L_0x000e
            X.4V6 r0 = r9.A2l
            X.1KK r0 = r0.getBusinessProfileManager()
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r7)
            if (r1 == 0) goto L_0x0075
            X.1LE r0 = r0.A06
            int r0 = r0.A05(r1)
            goto L_0x000c
        L_0x0075:
            r5 = 0
            return r5
        L_0x0077:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0085:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1f(X.3fk):boolean");
    }

    public int A1i(int i) {
        if (i != 0) {
            if (i != 1) {
                if (this.A0T.getVisibility() == 0) {
                    return R.drawable.ib_new_expanded;
                }
            } else if (this.A4B.A0K) {
                return R.drawable.ib_new_expanded_bottom;
            } else {
                if (this.A0T.getVisibility() != 0) {
                    return R.drawable.ib_new_round;
                }
            }
            if (this.A0X.getVisibility() == 0) {
                return R.drawable.ib_new_expanded;
            }
            return R.drawable.ib_new_round;
        } else if (!this.A4B.A0K) {
            return R.drawable.ib_new_expanded;
        } else {
            return R.drawable.ib_new_expanded_bottom;
        }
    }

    public Dialog A1j(int i) {
        AnonymousClass6YP r0 = this.A5Z;
        if (r0 != null && r0.A0V()) {
            AnonymousClass6YP r1 = this.A5Z;
            if (!r1.A0v.A0A) {
                r1.A01 = i;
                return null;
            }
        }
        Dialog A002 = this.A6n.A00(this.A3Y, i);
        if (A002 == null) {
            return this.A2l.BiX(i);
        }
        return A002;
    }

    public C18910u1 A1k() {
        C18910u1 r0 = this.A6r;
        if (r0 != null) {
            return r0;
        }
        C18910u1 A0x2 = C36431kI.A0x(new C65873Tu(this, 4));
        this.A6r = A0x2;
        return A0x2;
    }

    public void A1l() {
        boolean A1Y2 = C36401kF.A1Y(this.A3n);
        AnonymousClass141 r1 = this.A3Y;
        if (A1Y2) {
            A1C(this, r1.A0I(), true, C36361kB.A1X(this.A1W, r1));
        } else {
            CreateOrAddToContactsDialog.A03(r1, C36361kB.A1X(this.A1W, r1)).A1f(A06(this), (String) null);
        }
    }

    public void A1m() {
        KeyboardPopupLayout keyboardPopupLayout = this.A1V;
        keyboardPopupLayout.A04 = false;
        keyboardPopupLayout.requestLayout();
    }

    public void A1o() {
        BottomSheetBehavior bottomSheetBehavior;
        SharedPreferences.Editor A002;
        String str;
        if (this.A4B == null) {
            return;
        }
        if (A1e(this)) {
            int A032 = A03(this);
            MentionableEntry mentionableEntry = this.A4B;
            if (mentionableEntry != null) {
                mentionableEntry.A0B();
            }
            if (A032 > 0 && (bottomSheetBehavior = this.A0n) != null) {
                int i = bottomSheetBehavior.A0D;
                if (i <= 0 || i > A032) {
                    int A012 = A01(this);
                    C19420v0 r0 = this.A35;
                    if (A012 == 1) {
                        if (r0.A0A() != A032) {
                            A002 = C19420v0.A00(this.A35);
                            str = "expressions_tray_peek_height_portrait";
                        } else {
                            return;
                        }
                    } else if (r0.A09() != A032) {
                        A002 = C19420v0.A00(this.A35);
                        str = "expressions_tray_peek_height_landscape";
                    } else {
                        return;
                    }
                    C36341k9.A0v(A002, str, A032);
                    BottomSheetBehavior bottomSheetBehavior2 = this.A0n;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.A0V(A032);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.A4B.A0B();
    }

    public void A1p() {
        int i;
        if (this.A3E.A01()) {
            C80233v4 A002 = C80233v4.A00(this, 48);
            C80233v4 A003 = C80233v4.A00(this, 49);
            AnonymousClass3HK r4 = this.A3E;
            if (r4.A0E && !r4.A0C && r4.A0H == 2) {
                r4.A0C = true;
                C81333wq r1 = r4.A04;
                if (r1 != null) {
                    r4.A0K.A0G(r1);
                }
                AnonymousClass80Q r5 = r4.A09;
                C18740tg.A04(r5);
                int i2 = r4.A01.getLayoutParams().height;
                AnonymousClass4VX r2 = new AnonymousClass4VX(r4, r4.A01.getHeight(), 0);
                r2.setDuration(400);
                r2.setAnimationListener(new C429221f(r4, r5, A002, A003, i2));
                r4.A01.startAnimation(r2);
            }
        } else if (this.A0X.getVisibility() == 0 && (i = this.A06) >= 0) {
            C36321k7.A1T("conversation/hidelinkpreview/start ", AnonymousClass000.A0u(), i);
            AnonymousClass3AE r0 = this.A2d;
            if (r0 != null) {
                A0U(r0.A05, this.A0X, this);
            }
            A1N(this, false);
        }
    }

    public void A1q() {
        KeyEvent.Callback callback;
        if (this.A0A.getIntExtra("calling-tooltip-scenario", 0) == 1) {
            AnonymousClass31Q r0 = this.A2s;
            AnonymousClass4V6 r6 = this.A2l;
            ViewGroup viewGroup = this.A0R;
            Toolbar toolbar = this.A0j;
            int i = this.A05;
            AnonymousClass00C.A0D(r6, 0);
            AnonymousClass385 r7 = r0.A00;
            C52562pd r8 = C52562pd.A02;
            TextView textView = r7.A01;
            if (textView == null) {
                ViewStub viewStub = (ViewStub) r6.findViewById(R.id.tooltip_view_stub);
                textView = null;
                if (viewStub != null) {
                    callback = viewStub.inflate();
                } else {
                    callback = null;
                }
                if (callback instanceof TextView) {
                    textView = (TextView) callback;
                }
                r7.A01 = textView;
                if (textView == null) {
                    return;
                }
            }
            if (viewGroup != null) {
                View childAt = viewGroup.getChildAt(0);
                childAt.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZS(childAt, viewGroup, textView, toolbar, r6, r7, r8, i));
            }
        }
    }

    public void A1r() {
        int i;
        Integer num;
        Cursor A092;
        this.A1j.A02(A07(this), new C82153yE(this));
        C40061uh r4 = this.A2x;
        LinkedHashMap A002 = r4.A0q.A00(r4.A0t);
        if (!A002.isEmpty()) {
            r4.A0Q.post(new C80283v9(r4, A002, 48));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 || (i2 == 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) {
            KeyguardManager A062 = this.A2l.getSystemServices().A06();
            C18740tg.A06(A062);
            if (A062.isKeyguardLocked()) {
                Log.i("conversation/locked");
                AnonymousClass4VN r3 = new AnonymousClass4VN(this, 1);
                this.A09 = r3;
                this.A2l.BnJ(r3, new IntentFilter("android.intent.action.USER_PRESENT"), true);
            }
        }
        this.A32.A02();
        if (this.A2l.getIntent().getBooleanExtra("fromNotification", false) && this.A2l.getIntent().getBooleanExtra("last_notification_keep_in_chat", false)) {
            this.A3i.A00("kic_notification_taps");
            if (this.A6L) {
                this.A3i.A00("kic_group_notification_taps");
            }
        }
        if (this.A2l.getIntent().getBooleanExtra("fromMessageReminderNotification", false) && this.A3n.A0E(5544)) {
            AnonymousClass1NM r5 = this.A2a;
            AnonymousClass11F r2 = this.A45;
            String stringExtra = this.A2l.getIntent().getStringExtra("inorganic_notification_id");
            AnonymousClass11F r32 = this.A45;
            r5.A0B(r2, 10);
            r5.A0O.A00(r32, stringExtra, 1, 3);
        }
        C19770wU A0K2 = A0K(this);
        UserJid A0b2 = C36401kF.A0b(this.A45);
        if (A0b2 != null) {
            C80283v9.A00(A0K2, this, A0b2, 36);
        }
        C62573Gr r6 = (C62573Gr) A0F(this).A08.get();
        AnonymousClass11F r42 = this.A45;
        AnonymousClass00C.A0D(r42, 0);
        if (C197029b1.A00(r42) && r6.A00.A00() && r6.A02.A0C(r42) == null) {
            C20310xM r33 = r6.A03;
            boolean z = false;
            ArrayList A142 = C36441kJ.A14(2);
            A142.add(String.valueOf(r33.A0H.A08(r42)));
            A142.add(String.valueOf(new int[]{87}[0]));
            AnonymousClass1M0 A042 = r33.A0c.get();
            try {
                C224114e r52 = A042.A02;
                String str = AnonymousClass2xD.A0N;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND ");
                C36351kA.A1O("message_type IN ", A0u2, 1);
                A092 = r52.A09(AnonymousClass000.A0q(" LIMIT 1", A0u2), "CHECK_MSG_EXISTENCE_BY_JID_IN_CHAT", C36371kC.A1b(A142, 0));
                if (A092.getCount() > 0) {
                    z = true;
                }
                A092.close();
                A042.close();
                if (!z) {
                    r6.A01.A00(r42, true);
                }
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (this.A3Y.A0E()) {
            A15(this);
            C25031Es r22 = A0F(this).A06;
            AnonymousClass11F r1 = this.A45;
            AnonymousClass00C.A0D(r1, 0);
            AnonymousClass141 A082 = r22.A00.A08(r1);
            if (A082 != null && C25031Es.A00(A082, r22)) {
                A0c(this.A2G, this);
            }
        }
        AnonymousClass11F r23 = this.A45;
        if (r23 != null) {
            if (this.A3n.A0E(5869)) {
                this.A4h.A03(r23);
            }
            this.A3b.A01(r23, this.A3Y.A0C());
        }
        this.A1U.A0H(new C81103wT(this, 0));
        if (this.A7a == null) {
            AnonymousClass11F r43 = this.A45;
            C20500xf r34 = this.A3o;
            this.A7a = Boolean.valueOf(AnonymousClass3MX.A00(this.A2l.getContactManager(), this.A3Z, this.A3n, r34, r43));
        }
        this.A1U.A0H(new C81103wT(this, 1));
        C207109uZ r0 = this.A2G;
        if (r0 != null && r0.A0Z && this.A3n.A0E(7152)) {
            C609439y r8 = this.A3m;
            AnonymousClass155 A0C2 = A0C(this);
            AnonymousClass00C.A0D(A0C2, 0);
            if (!A0C2.getPackageManager().hasSystemFeature("android.software.webview")) {
                Log.e("FlowsLogger/FlowsWebPreloader.preloadWebView - WebView feature is not supported.");
            } else {
                long A0B2 = C36441kJ.A0B(r8.A04, 7154) * 60000;
                Long l = r8.A02;
                if (l == null || l.longValue() + A0B2 <= System.currentTimeMillis()) {
                    C81193wc.A00(r8.A03, r8, A0C2, 40);
                }
            }
        }
        if (!A1a(this)) {
            C39941uJ r35 = this.A2y;
            if (C36341k9.A0E(r35.A02).getInt("push_to_video_sending_enabled", -1) == 1) {
                i = 0;
            } else {
                AnonymousClass3KZ r12 = r35.A01;
                if (r12.A0A) {
                    num = 1;
                    C39941uJ.A01(r35, num.intValue());
                    return;
                } else if (r12.A0B) {
                    i = 2;
                } else {
                    return;
                }
            }
            num = Integer.valueOf(i);
            C39941uJ.A01(r35, num.intValue());
            return;
        }
        return;
        throw th;
    }

    public void A1t() {
        C40061uh r4 = this.A2x;
        C600336f A0S2 = r4.A0k.A0S(r4.A0t, C40061uh.A02(r4), r4.A0A, r4.A0O);
        r4.A0V(A0S2.A01);
        r4.A0W(A0S2.A02);
        r4.A0Y(A0S2);
        C62103Eu r0 = new C62103Eu();
        r0.A01 = A0S2;
        C36341k9.A0H().post(new C80283v9(r4, r0.A00(), 49));
    }

    public void A1u() {
        ViewPropertyAnimator viewPropertyAnimator;
        C92924f8 r0;
        AnonymousClass28e r02;
        if (this.A68 && !C36411kG.A0a(this.A5n).A01) {
            C36411kG.A0a(this.A5n).A03 = false;
            this.A68 = false;
        }
        AnonymousClass0V9 selectionActionMode = this.A2l.getSelectionActionMode();
        if (selectionActionMode != null) {
            selectionActionMode.A05();
        }
        AnonymousClass0V9 r03 = this.A0i;
        if (r03 != null) {
            r03.A05();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A08 = null;
        AnonymousClass2M8 r04 = this.A3r;
        if (r04 != null) {
            r04.A0K();
        }
        if (C36391kE.A1Y(this.A3n) && (r02 = this.A2Q) != null) {
            r02.A0H();
            r02.A02 = null;
        }
        AnonymousClass6YP r05 = this.A5Z;
        if (r05 != null) {
            r05.A0I();
        }
        Runnable runnable = this.A63;
        if (runnable != null) {
            this.A5S.Bnx(runnable);
        }
        A0S();
        AnonymousClass1G6 A002 = this.A2r.A00();
        C18740tg.A06(A002);
        C88834Uf r1 = A002.A00;
        AnonymousClass4V6 r06 = this.A2l;
        if (r1 == r06) {
            AnonymousClass1G5 r2 = this.A2r;
            r2.A00.compareAndSet(A002, new AnonymousClass1G6((C88834Uf) null, r06.getScreenLockStateProvider(), false));
        }
        C40061uh r12 = this.A2x;
        if (r12 != null) {
            r12.A0K = A0B(this).isChangingConfigurations();
            if (this.A2l.isFinishing()) {
                C40061uh r4 = this.A2x;
                r4.A0m.A03(r4.A0t, A0B(this).getLocalClassName());
            }
        }
        boolean A1Z2 = C36411kG.A1Z(this.A6j);
        C24511Cs r13 = this.A3v;
        if (r13 != null) {
            this.A3w.unregisterObserver(r13);
        }
        this.A5b.unregisterObserver(this.A7W);
        this.A5Y.unregisterObserver(this.A7V);
        this.A2f.unregisterObserver(this.A7O);
        this.A5W.unregisterObserver(this.A7R);
        this.A4O.unregisterObserver(this.A7T);
        this.A1n.unregisterObserver(this.A7M);
        this.A4s.unregisterObserver(this.A7U);
        if (this.A1p != null) {
            ((C19580wB) this.A5j.get()).unregisterObserver(this.A1p);
        }
        C133356Xz r07 = this.A51;
        if (r07 != null) {
            r07.A0B.unregisterObserver(r07.A09);
        }
        this.A50.unregisterObserver(this.A7Q);
        this.A4S.unregisterObserver(this.A7P);
        AnonymousClass2j9 r08 = this.A6s;
        if (r08 != null) {
            r08.A0D(A1Z2);
            this.A6s = null;
        }
        MentionableEntry mentionableEntry = this.A4B;
        if (mentionableEntry != null) {
            mentionableEntry.removeTextChangedListener(this.A7G);
            this.A4B.removeTextChangedListener(this.A7F);
            AnonymousClass2g8 r14 = this.A6p;
            if (r14 != null) {
                this.A4B.removeTextChangedListener(r14);
            }
            this.A4B.setFilters(new InputFilter[0]);
            this.A4B.A0F();
            this.A4B = null;
        }
        C78053rU r09 = this.A4c;
        if (r09 != null) {
            r09.A00();
        }
        WaEditText waEditText = this.A1g;
        if (waEditText != null) {
            waEditText.removeTextChangedListener(this.A6z);
        }
        BroadcastReceiver broadcastReceiver = this.A09;
        if (broadcastReceiver != null) {
            this.A2l.unregisterReceiver(broadcastReceiver);
            this.A09 = null;
        }
        AnonymousClass4V6 r010 = this.A2l;
        AnonymousClass3UR.A08(r010.getMessageAudioPlayerProvider(), r010.getWaSharedPreferences(), this.A45);
        AnonymousClass3UR.A02(this.A0E, this.A2l.getMessageAudioPlayerProvider());
        AnonymousClass1RY r011 = this.A2L;
        if (r011 != null) {
            r011.A02();
            this.A2L = null;
        }
        if (this.A69) {
            this.A4L.A01();
            this.A69 = false;
        }
        C88974Ut r15 = this.A5U;
        if (r15 != null && r15.BCi()) {
            r15.B34();
        }
        if (this.A5T != null) {
            ((ViewGroup) A05(this).getDecorView()).removeView(this.A5T);
            ConversationListView conversationListView = this.A2U;
            C32211dA r42 = this.A29;
            Set set = conversationListView.A05.A00;
            synchronized (set) {
                set.remove(r42);
            }
            this.A5T = null;
        }
        C18910u1 r012 = this.A6r;
        if (r012 != null && r012.A01()) {
            ((C196089Xp) this.A6r.get()).A00();
        }
        Set<Application.ActivityLifecycleCallbacks> set2 = this.A7B;
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : set2) {
            onActivityDestroyed.onActivityDestroyed(A0C(this));
        }
        set2.clear();
        this.A7C.clear();
        this.A7X.clear();
        this.A7Y.clear();
        this.A2P = null;
        ((C160497l6) this.A5u.get()).Bqh();
        ConversationListView conversationListView2 = this.A2U;
        if (conversationListView2 != null) {
            DataSetObserver dataSetObserver = this.A6w;
            conversationListView2.removeCallbacks(conversationListView2.A0J);
            C38051nd conversationCursorAdapter = conversationListView2.getConversationCursorAdapter();
            if (conversationCursorAdapter != null) {
                conversationCursorAdapter.unregisterDataSetObserver(dataSetObserver);
                Cursor cursor = conversationCursorAdapter.getCursor();
                if (cursor != null) {
                    cursor.close();
                }
            }
            conversationListView2.A0B.A00();
        }
        if (this.A3A.A00.A00.BMN(1029386189)) {
            this.A3A.A00.A02((String) null, 4);
        }
        if (AnonymousClass3M3.A01(this.A3o, this.A45)) {
            C36331k8.A0w(C19420v0.A00(this.A2l.getWaSharedPreferences()), "wac_consent_shown", A1Z2);
        }
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3f;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer.A0B = null;
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A3l;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0B();
            this.A3l = null;
            this.A0n = null;
        }
        A0e(this);
        AnonymousClass34K r22 = this.A2i;
        C001700s r16 = r22.A01;
        if (r16.A04() != null) {
            r22.A00 = null;
            r16.A0D((Object) null);
        }
        if (this.A0R != null) {
            AnonymousClass155 A0C2 = A0C(this);
            if (A0C2 instanceof Conversation) {
                View A0B2 = C03570Gk.A0B(A0C2, R.id.root);
                C07460Xt.A01(A0B2, (C06650Um) null);
                C011004s.A07(A0B2, (C010904r) null);
            }
            C07460Xt.A01(this.A1V, (C06650Um) null);
        }
        this.A3y = null;
        C62313Fr r013 = this.A2Z;
        if (r013 != null) {
            C80183uz A003 = r013.A00();
            if (A003 instanceof AnonymousClass2HF) {
                PinInChatBannerViewModel pinInChatBannerViewModel = ((AnonymousClass2HF) A003).A03;
                Runnable runnable2 = pinInChatBannerViewModel.A00;
                if (runnable2 != null) {
                    pinInChatBannerViewModel.A02.A0G(runnable2);
                }
                pinInChatBannerViewModel.A00 = null;
            }
        }
        if (A1a(this)) {
            A0F(this).A09.get();
            Window A052 = A05(this);
            AnonymousClass00C.A0D(A052, 0);
            View A0M2 = C36411kG.A0M(A052);
            if (!(A0M2 == null || (r0 = (C92924f8) A0M2.findViewById(R.id.bot_embodiment_view)) == null)) {
                r0.A01();
            }
        }
        AnonymousClass3UB r17 = this.A4l;
        if (!(r17 == null || (viewPropertyAnimator = r17.A02) == null)) {
            viewPropertyAnimator.cancel();
            r17.A02 = null;
        }
        if (AnonymousClass3B6.A00(this).BLD(this.A45)) {
            C07710Yz.A02(((AnonymousClass66D) A0F(this).A0B.get()).A01).remove(this.A45);
        }
        if (this.A3n.A0E(3403)) {
            this.A4u.A01();
        }
    }

    public void A1v() {
        long j;
        if (!this.A66) {
            this.A2l.Beg();
            if (this.A0A.hasExtra("start_t")) {
                this.A2l.getTime();
                long uptimeMillis = SystemClock.uptimeMillis() - this.A0A.getLongExtra("start_t", 0);
                C28441Sr r6 = this.A4a;
                r6.A04.markerEnd(703934026, 2);
                boolean z = r6.A01;
                C45682Sh r8 = r6.A00;
                if (r8 == null) {
                    r8 = null;
                } else if (z && C36331k8.A1b(r6.A06)) {
                    AnonymousClass11h A012 = ((AnonymousClass11g) r6.A05.get()).A01("chat_open");
                    long j2 = (Long) A012.A02.get("msgstore.db");
                    if (j2 == null) {
                        j2 = 0L;
                    }
                    r8.A07 = j2;
                    long j3 = (Long) A012.A03.get("msgstore.db");
                    if (j3 == null) {
                        j3 = 0L;
                    }
                    r8.A08 = j3;
                    long j4 = (Long) A012.A00.get("msgstore.db");
                    if (j4 == null) {
                        j4 = 0L;
                    }
                    r8.A06 = j4;
                }
                r6.A00 = null;
                r6.A01 = false;
                AnonymousClass11F r9 = this.A45;
                if (r9 instanceof AnonymousClass144) {
                    A0K(this).Boy(new AnonymousClass73L(this, r9, r8, 3, uptimeMillis));
                } else {
                    C28081Rg r10 = this.A59;
                    r10.A0J.Boy(new C80763vv(r8, r9, r10, 3, 0, 0, uptimeMillis));
                }
                this.A0A.removeExtra("start_t");
                int A072 = A0H(this).A07(1550);
                C28081Rg r82 = this.A59;
                long j5 = (long) A072;
                if (j5 > 0 && uptimeMillis >= j5) {
                    AnonymousClass2PC r1 = new AnonymousClass2PC();
                    r1.A02 = "chat_open";
                    r1.A00 = Long.valueOf(uptimeMillis);
                    r1.A01 = Long.valueOf(j5);
                    r82.A0E.Blv(r1);
                }
            }
            AnonymousClass1E4 r5 = this.A57;
            r5.A02.execute(new C35771jE(r5, this.A45, 12));
            C61023Ag r4 = this.A2o;
            boolean z2 = this.A3Y.A0H instanceof C177618e5;
            AnonymousClass11F r12 = this.A45;
            if (r4.A01.A05() && z2) {
                C222713q r0 = AnonymousClass11F.A00;
                AnonymousClass144 A002 = AnonymousClass6H4.A00(r12);
                if (A002 != null) {
                    C80283v9.A00(r4.A07, r4, A002, 44);
                }
            }
            if (A1X(this)) {
                C52512pY A003 = C65903Tx.A00(this.A0A);
                NewsletterViewModel newsletterViewModel = this.A4H;
                if (newsletterViewModel != null) {
                    j = (long) AnonymousClass3IZ.A00(newsletterViewModel).A08;
                } else {
                    j = 0;
                }
                C32241dD r52 = (C32241dD) A0G(this).A09.get();
                AnonymousClass11F r83 = this.A45;
                C52382pL A0S2 = this.A2t.A0S();
                Long l = this.A61;
                AnonymousClass00C.A0D(r83, 0);
                AnonymousClass2RZ r3 = new AnonymousClass2RZ();
                r3.A06 = r83.user;
                r3.A00 = Integer.valueOf(AnonymousClass3RE.A00(A003));
                r3.A01 = AnonymousClass3RE.A02(A003);
                if (A0S2 != null) {
                    int ordinal = A0S2.ordinal();
                    int i = 4;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i = 3;
                        } else if (ordinal == 2) {
                            i = 2;
                        } else if (ordinal == 3) {
                            i = 1;
                        } else {
                            throw C36441kJ.A18();
                        }
                    }
                    r3.A02 = Integer.valueOf(i);
                }
                r3.A05 = Long.valueOf(j);
                if ((A003 == C52512pY.NEWSLETTER_DIRECTORY || A003 == C52512pY.NEWSLETTER_DIRECTORY_SEARCH) && r52.A02.A0E(5471)) {
                    r3.A03 = Long.valueOf(C32241dD.A00(r52));
                }
                Integer num = r3.A00;
                if (num != null && num.intValue() == 13) {
                    r3.A04 = l;
                }
                r52.A03.Bly(r3);
                A0G(this).A0F.get();
                this.A0A.getStringExtra("wamo_pc_id");
            }
        }
    }

    public void A1x() {
        this.A2l.getStartupTracker().A06(this.A2U, new C81103wT(this, 14), "Conversation", 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04da, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04db, code lost:
        A1I(r0, "on_resume_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04de, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x040b A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0414 A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x041c A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0425 A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0432 A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1y() {
        /*
            r25 = this;
            java.lang.String r1 = "on_resume_end"
            r0 = r25
            java.lang.String r2 = "on_resume_start"
            A1I(r0, r2)     // Catch:{ all -> 0x04d8 }
            r8 = 0
            r0.A6a = r8     // Catch:{ all -> 0x04d8 }
            java.lang.String r3 = "conversation/resume"
            X.14g r2 = new X.14g     // Catch:{ all -> 0x04d8 }
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r4 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            boolean r3 = r4.A0P(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0044
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r3 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A02     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x005e
            X.155 r3 = A0B(r0)     // Catch:{ all -> 0x04d8 }
            r3.finish()     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r3 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A01     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x0044
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r3 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            r3.A02 = r8     // Catch:{ all -> 0x04d8 }
        L_0x0044:
            X.12q r5 = r0.A3O     // Catch:{ all -> 0x04d8 }
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.16D r4 = r3.getContactManager()     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            int r7 = X.AnonymousClass3TD.A00(r4, r5, r3)     // Catch:{ all -> 0x04d8 }
            X.1LX r3 = r0.A4M     // Catch:{ all -> 0x04d8 }
            java.lang.String r4 = "ephemeral"
            r5 = 0
            X.1LY r3 = r3.A00     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A01(r5, r4)     // Catch:{ all -> 0x04d8 }
            goto L_0x00ae
        L_0x005e:
            r3 = 1
            r0.A68 = r3     // Catch:{ all -> 0x04d8 }
            android.content.Intent r5 = r0.A0A     // Catch:{ all -> 0x04d8 }
            r4 = 8
            java.lang.String r3 = "chatlockEntryPoint"
            int r7 = r5.getIntExtra(r3, r4)     // Catch:{ all -> 0x04d8 }
            X.04e r3 = r0.A0h     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x00a0
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r9 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            X.155 r3 = A0B(r0)     // Catch:{ all -> 0x04d8 }
            X.01z r4 = r3.getSupportFragmentManager()     // Catch:{ all -> 0x04d8 }
            java.lang.String r3 = "com.whatsapp.HomeActivity.ConversationFragment"
            X.02E r6 = r4.A0N(r3)     // Catch:{ all -> 0x04d8 }
            if (r6 != 0) goto L_0x0089
            X.155 r6 = A0C(r0)     // Catch:{ all -> 0x04d8 }
        L_0x0089:
            X.155 r5 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            X.C36331k8.A1I(r6, r5)     // Catch:{ all -> 0x04d8 }
            X.04a r4 = new X.04a     // Catch:{ all -> 0x04d8 }
            r4.<init>()     // Catch:{ all -> 0x04d8 }
            X.3Zv r3 = new X.3Zv     // Catch:{ all -> 0x04d8 }
            r3.<init>(r5, r9, r7)     // Catch:{ all -> 0x04d8 }
            X.04e r3 = r6.BnD(r3, r4)     // Catch:{ all -> 0x04d8 }
            r0.A0h = r3     // Catch:{ all -> 0x04d8 }
        L_0x00a0:
            X.005 r3 = r0.A5n     // Catch:{ all -> 0x04d8 }
            X.18z r5 = X.C36411kG.A0a(r3)     // Catch:{ all -> 0x04d8 }
            X.11F r4 = r0.A45     // Catch:{ all -> 0x04d8 }
            X.04e r3 = r0.A0h     // Catch:{ all -> 0x04d8 }
            r5.A09(r3, r4, r7)     // Catch:{ all -> 0x04d8 }
            goto L_0x0044
        L_0x00ae:
            r6 = 1
            r3 = r3 ^ 1
            if (r7 <= 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00c1
            X.3Fy r9 = r0.A3h     // Catch:{ all -> 0x04d8 }
            X.01z r7 = A06(r0)     // Catch:{ all -> 0x04d8 }
            X.11F r4 = r0.A45     // Catch:{ all -> 0x04d8 }
            r3 = 5
            r9.A00(r7, r4, r3)     // Catch:{ all -> 0x04d8 }
        L_0x00c1:
            X.1MK r3 = r0.A27     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A00()     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x00d1
            X.1MK r3 = r0.A27     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x00dd
        L_0x00d1:
            X.1PW r7 = r0.A26     // Catch:{ all -> 0x04d8 }
            java.lang.String r4 = "show_voip_activity"
            X.6Up r3 = new X.6Up     // Catch:{ all -> 0x04d8 }
            r3.<init>(r4)     // Catch:{ all -> 0x04d8 }
            r7.A00(r3)     // Catch:{ all -> 0x04d8 }
        L_0x00dd:
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            r3.Bie()     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x00f5
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            r3.finish()     // Catch:{ all -> 0x04d8 }
            r2.A01()     // Catch:{ all -> 0x04d8 }
            java.lang.String r2 = "conversation/resume/no contact"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x04d8 }
            goto L_0x04d4
        L_0x00f5:
            X.0yC r4 = r0.A3n     // Catch:{ all -> 0x04d8 }
            r3 = 5386(0x150a, float:7.547E-42)
            int r7 = r4.A07(r3)     // Catch:{ all -> 0x04d8 }
            if (r7 < 0) goto L_0x0110
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04d8 }
            long r3 = r0.A6b     // Catch:{ all -> 0x04d8 }
            long r9 = r9 - r3
            long r3 = (long) r7     // Catch:{ all -> 0x04d8 }
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0110
            X.1ts r3 = r0.A2u     // Catch:{ all -> 0x04d8 }
            r3.A0T(r8)     // Catch:{ all -> 0x04d8 }
        L_0x0110:
            r0.A0R()     // Catch:{ all -> 0x04d8 }
            X.0xp r3 = r0.A4K     // Catch:{ all -> 0x04d8 }
            java.util.HashMap r3 = r3.A0M     // Catch:{ all -> 0x04d8 }
            r3.clear()     // Catch:{ all -> 0x04d8 }
            X.1A5 r4 = r0.A3P     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            java.lang.Class<X.11F> r7 = X.AnonymousClass11F.class
            X.11F r3 = X.C36441kJ.A0k(r3, r7)     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r4.A01(r3)     // Catch:{ all -> 0x04d8 }
            r0.A3Y = r3     // Catch:{ all -> 0x04d8 }
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.hasWindowFocus()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x013d
            X.1Y3 r4 = r0.A2X     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            X.11F r3 = X.C36441kJ.A0k(r3, r7)     // Catch:{ all -> 0x04d8 }
            r4.A01(r3, r6, r6, r6)     // Catch:{ all -> 0x04d8 }
        L_0x013d:
            X.1uL r3 = r0.A2t     // Catch:{ all -> 0x04d8 }
            r3.A0T()     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A0G()     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x015e
            X.141 r9 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r9.A0H     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3 instanceof X.C28981Uw     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x015e
            X.1Nx r4 = r0.A4f     // Catch:{ all -> 0x04d8 }
            X.11F r3 = X.C36441kJ.A0k(r9, r7)     // Catch:{ all -> 0x04d8 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x04d8 }
            r4.A07(r3)     // Catch:{ all -> 0x04d8 }
        L_0x015e:
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3 instanceof X.C28981Uw     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0177
            X.3BF r3 = A0G(r0)     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r3.A0A     // Catch:{ all -> 0x04d8 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x04d8 }
            X.1Zi r4 = (X.C30131Zi) r4     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            X.1Uw r3 = (X.C28981Uw) r3     // Catch:{ all -> 0x04d8 }
            r4.A06(r3)     // Catch:{ all -> 0x04d8 }
        L_0x0177:
            X.3Sr r4 = r0.A2n     // Catch:{ all -> 0x04d8 }
            X.1o8 r3 = r4.A01     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x0187
            X.4UQ r3 = r4.A03     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x018a
            boolean r3 = r3.isVisible()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x018a
        L_0x0187:
            A11(r0)     // Catch:{ all -> 0x04d8 }
        L_0x018a:
            boolean r3 = X.C56772wr.A00     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x01bf
            boolean r3 = r0.A6u     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x01bf
            boolean r3 = r0.A6Z     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x01bf
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ all -> 0x04d8 }
            java.lang.String r3 = "fromNotification"
            boolean r3 = r4.getBooleanExtra(r3, r8)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x01dd
            X.1Si r4 = r0.A4I     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            r4.A0B(r3)     // Catch:{ all -> 0x04d8 }
            r0.A6T = r6     // Catch:{ all -> 0x04d8 }
            X.1NM r4 = r0.A2a     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            r4.A0B(r3, r6)     // Catch:{ all -> 0x04d8 }
        L_0x01b4:
            X.0v0 r3 = r0.A35     // Catch:{ all -> 0x04d8 }
            android.content.SharedPreferences$Editor r4 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x04d8 }
            java.lang.String r3 = "newsletter_message_received"
            X.C36331k8.A0w(r4, r3, r8)     // Catch:{ all -> 0x04d8 }
        L_0x01bf:
            X.C56772wr.A00 = r8     // Catch:{ all -> 0x04d8 }
            java.util.ArrayList r4 = X.C56772wr.A01     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            com.whatsapp.jid.Jid r3 = r3.A06(r7)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r4.remove(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x01e3
            java.lang.String r3 = "conversation/dialog_ask_gps"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.155 r4 = A0B(r0)     // Catch:{ all -> 0x04d8 }
            r3 = 2
            X.AnonymousClass3SJ.A01(r4, r3)     // Catch:{ all -> 0x04d8 }
            goto L_0x01e3
        L_0x01dd:
            X.1Si r3 = r0.A4I     // Catch:{ all -> 0x04d8 }
            r3.A0H(r6)     // Catch:{ all -> 0x04d8 }
            goto L_0x01b4
        L_0x01e3:
            X.1Q0 r3 = r0.A5B     // Catch:{ IllegalStateException -> 0x01e9 }
            r3.A01()     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x01ef
        L_0x01e9:
            r4 = move-exception
            java.lang.String r3 = "conversation/ap/stateerror"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x04d8 }
        L_0x01ef:
            boolean r3 = r0.A6u     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x0210
            boolean r3 = X.AnonymousClass3RT.A00     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0210
            com.whatsapp.conversation.ConversationListView r9 = r0.A2U     // Catch:{ all -> 0x04d8 }
            r7 = 0
        L_0x01fa:
            int r3 = r9.getChildCount()     // Catch:{ all -> 0x04d8 }
            if (r7 >= r3) goto L_0x0210
            android.view.View r4 = r9.getChildAt(r7)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r4 instanceof X.C88244Ry     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x020d
            X.4Ry r4 = (X.C88244Ry) r4     // Catch:{ all -> 0x04d8 }
            r4.BuP()     // Catch:{ all -> 0x04d8 }
        L_0x020d:
            int r7 = r7 + 1
            goto L_0x01fa
        L_0x0210:
            boolean r3 = r0.A6u     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0231
            r0.A6u = r8     // Catch:{ all -> 0x04d8 }
        L_0x0216:
            X.13T r3 = r0.A1a     // Catch:{ all -> 0x04d8 }
            int r3 = r3.A00()     // Catch:{ all -> 0x04d8 }
            if (r3 <= 0) goto L_0x022c
            java.lang.String r3 = "conversation/dialog_software_expire_warning"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.155 r4 = A0B(r0)     // Catch:{ all -> 0x04d8 }
            r3 = 115(0x73, float:1.61E-43)
            X.AnonymousClass3SJ.A01(r4, r3)     // Catch:{ all -> 0x04d8 }
        L_0x022c:
            X.13I r3 = r0.A4m     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A00     // Catch:{ all -> 0x04d8 }
            goto L_0x0242
        L_0x0231:
            boolean r3 = r0.A6Z     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0216
            X.1ll r7 = new X.1ll     // Catch:{ all -> 0x04d8 }
            r7.<init>(r0)     // Catch:{ all -> 0x04d8 }
            r0.A6c = r7     // Catch:{ all -> 0x04d8 }
            r3 = 3000(0xbb8, double:1.482E-320)
            r7.sendEmptyMessageDelayed(r8, r3)     // Catch:{ all -> 0x04d8 }
            goto L_0x0216
        L_0x0242:
            if (r3 == 0) goto L_0x025e
            java.lang.String r3 = "conversation/dialog_login_failed"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.1Fq r7 = r0.A34     // Catch:{ all -> 0x04d8 }
            r4 = 20
            java.lang.String r3 = "ConvPreReg"
            r7.A03(r4, r3)     // Catch:{ all -> 0x04d8 }
            X.155 r7 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            X.0yC r4 = r0.A3n     // Catch:{ all -> 0x04d8 }
            X.1RU r3 = r0.A1i     // Catch:{ all -> 0x04d8 }
            X.AnonymousClass3SK.A01(r7, r3, r4)     // Catch:{ all -> 0x04d8 }
            goto L_0x0290
        L_0x025e:
            X.1Uu r3 = r0.A1h     // Catch:{ all -> 0x04d8 }
            X.3Ip r3 = r3.A00()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x02aa
            X.0yC r4 = r0.A3n     // Catch:{ all -> 0x04d8 }
            r3 = 2466(0x9a2, float:3.456E-42)
            boolean r3 = r4.A0E(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x02aa
            java.lang.String r3 = "home/show-account-logout-request"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.1Uu r3 = r0.A1h     // Catch:{ all -> 0x04d8 }
            X.3Ip r8 = r3.A00()     // Catch:{ all -> 0x04d8 }
            X.1Uu r3 = r0.A1h     // Catch:{ all -> 0x04d8 }
            r3.A01(r5)     // Catch:{ all -> 0x04d8 }
            X.1Fq r7 = r0.A34     // Catch:{ all -> 0x04d8 }
            r4 = 52
            java.lang.String r3 = "HomeActivityShowingDialog"
            r7.A03(r4, r3)     // Catch:{ all -> 0x04d8 }
            X.155 r3 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            X.AnonymousClass3SK.A00(r3, r8)     // Catch:{ all -> 0x04d8 }
        L_0x0290:
            X.0v5 r4 = r0.A0q     // Catch:{ all -> 0x04d8 }
            boolean r3 = r4.A05()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x02cd
            X.0v5 r3 = r0.A0r     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A05()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x02cd
            r4.A02()     // Catch:{ all -> 0x04d8 }
            java.lang.String r2 = "getHasReceivedCertRelatedNack"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0A(r2)     // Catch:{ all -> 0x04d8 }
            throw r2     // Catch:{ all -> 0x04d8 }
        L_0x02aa:
            X.0wo r4 = r0.A33     // Catch:{ all -> 0x04d8 }
            X.0v0 r3 = r0.A35     // Catch:{ all -> 0x04d8 }
            boolean r3 = X.C28971Uv.A00(r4, r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0290
            X.4V6 r7 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.0v0 r3 = r0.A35     // Catch:{ all -> 0x04d8 }
            android.content.SharedPreferences r4 = X.C36341k9.A0E(r3)     // Catch:{ all -> 0x04d8 }
            java.lang.String r3 = "device_switching_code"
            java.lang.String r3 = r4.getString(r3, r5)     // Catch:{ all -> 0x04d8 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x04d8 }
            com.whatsapp.registration.VerificationCodeBottomSheet r3 = com.whatsapp.registration.VerificationCodeBottomSheet.A03(r3)     // Catch:{ all -> 0x04d8 }
            r7.Btm(r3)     // Catch:{ all -> 0x04d8 }
            goto L_0x0290
        L_0x02cd:
            X.0yC r4 = r0.A3n     // Catch:{ all -> 0x04d8 }
            r3 = 3181(0xc6d, float:4.458E-42)
            boolean r3 = r4.A0E(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0315
            boolean r3 = r0.A6L     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0315
            X.12q r4 = r0.A3O     // Catch:{ all -> 0x04d8 }
            X.141 r3 = r0.A3Y     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r3.A0H     // Catch:{ all -> 0x04d8 }
            X.3Qp r9 = X.C36371kC.A0W(r4, r3)     // Catch:{ all -> 0x04d8 }
            if (r9 == 0) goto L_0x0315
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.0v0 r4 = r3.getWaSharedPreferences()     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r9.A06()     // Catch:{ all -> 0x04d8 }
            long r10 = r4.A0R(r3)     // Catch:{ all -> 0x04d8 }
            r7 = 0
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0315
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04d8 }
            long r7 = X.C36391kE.A0B(r3)     // Catch:{ all -> 0x04d8 }
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0315
            X.17Y r7 = A09(r0)     // Catch:{ all -> 0x04d8 }
            r4 = 34
            X.3v9 r3 = new X.3v9     // Catch:{ all -> 0x04d8 }
            r3.<init>(r0, r9, r4)     // Catch:{ all -> 0x04d8 }
            r7.A0H(r3)     // Catch:{ all -> 0x04d8 }
        L_0x0315:
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1V6 r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A0B()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x032a
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1V6 r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            r3.A05()     // Catch:{ all -> 0x04d8 }
        L_0x032a:
            boolean r3 = r0.A6E     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0335
            X.3T1 r3 = r0.A4i     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0335
            A1G(r0, r3)     // Catch:{ all -> 0x04d8 }
        L_0x0335:
            r0.A21()     // Catch:{ all -> 0x04d8 }
            java.util.Set r3 = r0.A7B     // Catch:{ all -> 0x04d8 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x04d8 }
        L_0x033e:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0352
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x04d8 }
            android.app.Application$ActivityLifecycleCallbacks r4 = (android.app.Application.ActivityLifecycleCallbacks) r4     // Catch:{ all -> 0x04d8 }
            X.155 r3 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            r4.onActivityResumed(r3)     // Catch:{ all -> 0x04d8 }
            goto L_0x033e
        L_0x0352:
            X.1JI r4 = r0.A4b     // Catch:{ all -> 0x04d8 }
            X.155 r3 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            r4.A01(r3)     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r3 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            X.2bi r4 = r3.A00     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x037c
            r0.A4i = r4     // Catch:{ all -> 0x04d8 }
            r0.A6E = r6     // Catch:{ all -> 0x04d8 }
            X.1nd r3 = A0D(r0)     // Catch:{ all -> 0x04d8 }
            X.3Qa r4 = r4.A1J     // Catch:{ all -> 0x04d8 }
            java.util.Set r3 = r3.A0R     // Catch:{ all -> 0x04d8 }
            r3.add(r4)     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r3 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            r3.A00 = r5     // Catch:{ all -> 0x04d8 }
        L_0x037c:
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1V6 r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            X.6zU r5 = r3.A00()     // Catch:{ all -> 0x04d8 }
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1V6 r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            X.2bi r4 = r3.A01()     // Catch:{ all -> 0x04d8 }
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r3 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A02     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x03a7
            if (r5 == 0) goto L_0x03a7
            if (r4 == 0) goto L_0x03a7
            r0.A69 = r6     // Catch:{ all -> 0x04d8 }
            X.3fS r3 = new X.3fS     // Catch:{ all -> 0x04d8 }
            r3.<init>(r5, r0, r4)     // Catch:{ all -> 0x04d8 }
            r5.A0F = r3     // Catch:{ all -> 0x04d8 }
        L_0x03a7:
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r3 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r3.A04     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x03e7
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r3 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            X.11F r4 = r0.A45     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x03cf
            X.1V6 r3 = r3.A07     // Catch:{ all -> 0x04d8 }
            X.2bi r3 = r3.A01()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x03cf
            X.3Qa r3 = r3.A1J     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r3.A00     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x03cf
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x03e7
        L_0x03cf:
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r4 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r0.A45     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x047a
            X.1V6 r3 = r4.A07     // Catch:{ all -> 0x04d8 }
            X.2bi r3 = r3.A01()     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x047a
            X.3Qa r3 = r3.A1J     // Catch:{ all -> 0x04d8 }
            X.11F r3 = r3.A00     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x047a
        L_0x03e7:
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            android.view.View r3 = r3.getContentView()     // Catch:{ all -> 0x04d8 }
            boolean r3 = X.AnonymousClass1V9.A00(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0465
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1V6 r5 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            X.005 r4 = r0.A5s     // Catch:{ all -> 0x04d8 }
            android.view.View r3 = r3.getContentView()     // Catch:{ all -> 0x04d8 }
            X.AnonymousClass3UR.A04(r3, r5, r4)     // Catch:{ all -> 0x04d8 }
        L_0x0402:
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.C36421kH.A1I(r3)     // Catch:{ all -> 0x04d8 }
            X.3UB r3 = r0.A4l     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x040e
            X.AnonymousClass3UB.A03(r3)     // Catch:{ all -> 0x04d8 }
        L_0x040e:
            com.whatsapp.conversation.ConversationListView r4 = r0.A2U     // Catch:{ all -> 0x04d8 }
            boolean r3 = r4.A0N     // Catch:{ all -> 0x04d8 }
            if (r3 != 0) goto L_0x0418
            r3 = 0
            r4.setTranscriptMode(r3)     // Catch:{ all -> 0x04d8 }
        L_0x0418:
            X.1sH r3 = r0.A1k     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0421
            X.9Uf r3 = r3.A00     // Catch:{ all -> 0x04d8 }
            r3.A00()     // Catch:{ all -> 0x04d8 }
        L_0x0421:
            X.7y9 r3 = r0.A1r     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0428
            r3.A0T()     // Catch:{ all -> 0x04d8 }
        L_0x0428:
            X.0yC r4 = r0.A3n     // Catch:{ all -> 0x04d8 }
            r3 = 7149(0x1bed, float:1.0018E-41)
            boolean r3 = r4.A0E(r3)     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0450
            java.lang.String r3 = "ConversationDelegate/addStickerTrayListeners"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x04d8 }
            X.3rU r4 = r0.A4c     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x043f
            X.4Rx r3 = r0.A78     // Catch:{ all -> 0x04d8 }
            r4.A04 = r3     // Catch:{ all -> 0x04d8 }
        L_0x043f:
            X.2M8 r4 = r0.A3r     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x0448
            X.4Rx r3 = r0.A78     // Catch:{ all -> 0x04d8 }
            r4.A0L(r3)     // Catch:{ all -> 0x04d8 }
        L_0x0448:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r4 = r0.A3l     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x0450
            X.4Rx r3 = r0.A78     // Catch:{ all -> 0x04d8 }
            r4.A0I = r3     // Catch:{ all -> 0x04d8 }
        L_0x0450:
            X.3Fr r3 = r0.A2Z     // Catch:{ all -> 0x04d8 }
            X.3uz r4 = r3.A00()     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x0461
            boolean r3 = r4 instanceof X.AnonymousClass2HH     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0461
            X.2HH r4 = (X.AnonymousClass2HH) r4     // Catch:{ all -> 0x04d8 }
            X.AnonymousClass2HH.A00(r4)     // Catch:{ all -> 0x04d8 }
        L_0x0461:
            r2.A01()     // Catch:{ all -> 0x04d8 }
            goto L_0x04d4
        L_0x0465:
            X.005 r3 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.1V7 r5 = X.C36431kI.A0o(r3)     // Catch:{ all -> 0x04d8 }
            boolean r3 = r5.A01     // Catch:{ all -> 0x04d8 }
            if (r3 == 0) goto L_0x0402
            X.0zA r4 = r5.A06     // Catch:{ all -> 0x04d8 }
            X.1V8 r3 = r5.A08     // Catch:{ all -> 0x04d8 }
            r4.unregisterObserver(r3)     // Catch:{ all -> 0x04d8 }
            r3 = 0
            r5.A01 = r3     // Catch:{ all -> 0x04d8 }
            goto L_0x0402
        L_0x047a:
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            android.view.View r8 = r3.getContentView()     // Catch:{ all -> 0x04d8 }
            X.0yC r20 = A0H(r0)     // Catch:{ all -> 0x04d8 }
            X.155 r7 = A0C(r0)     // Catch:{ all -> 0x04d8 }
            X.17Y r10 = A09(r0)     // Catch:{ all -> 0x04d8 }
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.0wQ r11 = r3.getMeManager()     // Catch:{ all -> 0x04d8 }
            X.0wU r21 = A0K(r0)     // Catch:{ all -> 0x04d8 }
            X.4V6 r3 = r0.A2l     // Catch:{ all -> 0x04d8 }
            X.1Pn r15 = r3.getContactPhotos()     // Catch:{ all -> 0x04d8 }
            X.16D r12 = r3.getContactManager()     // Catch:{ all -> 0x04d8 }
            X.171 r13 = r3.getWAContactNames()     // Catch:{ all -> 0x04d8 }
            X.0ts r6 = r0.A36     // Catch:{ all -> 0x04d8 }
            X.3HF r16 = r3.getMessageAudioPlayerFactory()     // Catch:{ all -> 0x04d8 }
            X.1V6 r17 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x04d8 }
            X.005 r5 = r0.A5s     // Catch:{ all -> 0x04d8 }
            X.005 r4 = r0.A5x     // Catch:{ all -> 0x04d8 }
            android.view.View r9 = r0.A0E     // Catch:{ all -> 0x04d8 }
            X.1RY r14 = r0.A2L     // Catch:{ all -> 0x04d8 }
            X.0v0 r18 = r3.getWaSharedPreferences()     // Catch:{ all -> 0x04d8 }
            java.lang.String r24 = "conversation-activity"
            r19 = r6
            r22 = r5
            r23 = r4
            android.util.Pair r4 = X.AnonymousClass3UR.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x04d8 }
            java.lang.Object r3 = r4.first     // Catch:{ all -> 0x04d8 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x04d8 }
            r0.A0E = r3     // Catch:{ all -> 0x04d8 }
            java.lang.Object r3 = r4.second     // Catch:{ all -> 0x04d8 }
            X.1RY r3 = (X.AnonymousClass1RY) r3     // Catch:{ all -> 0x04d8 }
            r0.A2L = r3     // Catch:{ all -> 0x04d8 }
            goto L_0x0402
        L_0x04d4:
            A1I(r0, r1)
            return
        L_0x04d8:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x04da }
        L_0x04da:
            r2 = move-exception
            A1I(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1y():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.3Qa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.2be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.2be} */
    /* JADX WARNING: type inference failed for: r19v3 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025e  */
    public void A1z() {
        /*
            r46 = this;
            java.lang.String r29 = "on_start_end"
            r5 = r46
            java.lang.String r0 = "on_start_start"
            A1I(r5, r0)     // Catch:{ all -> 0x0477 }
            java.lang.String r1 = "conversation/start"
            X.14g r0 = new X.14g     // Catch:{ all -> 0x0477 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0477 }
            r5.A5H = r0     // Catch:{ all -> 0x0477 }
            X.1JB r0 = r5.A3M     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x0022
            X.11F r0 = r5.A45     // Catch:{ all -> 0x0477 }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x004b
            boolean r0 = A1a(r5)     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x004b
        L_0x0022:
            X.2ZL r1 = r5.A1s     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            r1.registerObserver(r0)     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            r0.Bif()     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x0471
            X.11F r0 = r5.A45     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x0059
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            r0.finish()     // Catch:{ all -> 0x0477 }
            X.14g r0 = r5.A5H     // Catch:{ all -> 0x0477 }
            r0.A01()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = "conversation/start/no jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0477 }
            goto L_0x0471
        L_0x004b:
            r0 = 1
            X.2Wx r1 = new X.2Wx     // Catch:{ all -> 0x0477 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x0477 }
            r5.A3M = r1     // Catch:{ all -> 0x0477 }
            X.1DP r0 = r5.A3L     // Catch:{ all -> 0x0477 }
            r0.registerObserver(r1)     // Catch:{ all -> 0x0477 }
            goto L_0x0022
        L_0x0059:
            X.3Jc r3 = r5.A2S     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            X.0v0 r0 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x0477 }
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x0477 }
            java.lang.String r1 = "interface_font_size"
            java.lang.String r0 = "0"
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0477 }
            r2 = 0
            int r0 = X.AnonymousClass6R8.A00(r0, r2)     // Catch:{ all -> 0x0477 }
            r3.A00 = r0     // Catch:{ all -> 0x0477 }
            r5.A0R()     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x0477 }
            r0.BS7()     // Catch:{ all -> 0x0477 }
            X.3Sr r0 = r5.A2n     // Catch:{ all -> 0x0477 }
            android.view.View r1 = r0.A00     // Catch:{ all -> 0x0477 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0477 }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x046d }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x046d }
            java.lang.String r0 = "open_comment_thread"
            boolean r28 = r1.getBooleanExtra(r0, r2)     // Catch:{ all -> 0x046d }
            X.4V6 r0 = r5.A2l     // Catch:{ all -> 0x046d }
            android.content.Intent r0 = r0.getIntent()     // Catch:{ all -> 0x046d }
            java.lang.String r11 = "row_id"
            r6 = 0
            long r16 = r0.getLongExtra(r11, r6)     // Catch:{ all -> 0x046d }
            X.1uh r4 = r5.A2x     // Catch:{ all -> 0x046d }
            X.3Et r12 = r5.A2p     // Catch:{ all -> 0x046d }
            X.12q r0 = r4.A0j     // Catch:{ all -> 0x046d }
            r38 = r0
            X.11F r3 = r4.A0t     // Catch:{ all -> 0x046d }
            X.38C r1 = r0.A0A(r3)     // Catch:{ all -> 0x046d }
            int r8 = r1.A00     // Catch:{ all -> 0x046d }
            r4.A05 = r8     // Catch:{ all -> 0x046d }
            int r2 = r1.A01     // Catch:{ all -> 0x046d }
            r4.A06 = r2     // Catch:{ all -> 0x046d }
            if (r8 > 0) goto L_0x00bb
            if (r2 > 0) goto L_0x00bb
            r9 = 0
            goto L_0x00c4
        L_0x00bb:
            int r9 = r1.A02     // Catch:{ all -> 0x046d }
            r4.A07 = r9     // Catch:{ all -> 0x046d }
            boolean r0 = r3 instanceof X.C28981Uw     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x00c6
            r9 = r8
        L_0x00c4:
            r4.A07 = r9     // Catch:{ all -> 0x046d }
        L_0x00c6:
            long r0 = r1.A03     // Catch:{ all -> 0x046d }
            r4.A09 = r0     // Catch:{ all -> 0x046d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x046d }
            java.lang.String r0 = "messagesViewModel/start/unseen "
            r1.append(r0)     // Catch:{ all -> 0x046d }
            r1.append(r9)     // Catch:{ all -> 0x046d }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x046d }
            r1.append(r8)     // Catch:{ all -> 0x046d }
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ all -> 0x046d }
            X.C40061uh.A07(r4)     // Catch:{ all -> 0x046d }
            int r0 = r4.A07     // Catch:{ all -> 0x046d }
            boolean r43 = X.AnonymousClass000.A1R(r0)
            X.3Eu r27 = new X.3Eu     // Catch:{ all -> 0x046d }
            r27.<init>()     // Catch:{ all -> 0x046d }
            X.1Rs r0 = r4.A0z     // Catch:{ all -> 0x046d }
            r45 = r0
            java.lang.Object r2 = r45.A04()     // Catch:{ all -> 0x046d }
            X.3Gt r2 = (X.C62593Gt) r2     // Catch:{ all -> 0x046d }
            if (r2 == 0) goto L_0x010b
            boolean r1 = r2.A05     // Catch:{ all -> 0x046d }
            if (r1 == 0) goto L_0x0103
            r0 = r27
            r0.A05 = r1     // Catch:{ all -> 0x046d }
        L_0x0103:
            java.util.Collection r1 = r2.A04     // Catch:{ all -> 0x046d }
            if (r1 == 0) goto L_0x010b
            r0 = r27
            r0.A04 = r1     // Catch:{ all -> 0x046d }
        L_0x010b:
            android.content.Intent r2 = r4.A0P     // Catch:{ all -> 0x046d }
            long r25 = r2.getLongExtra(r11, r6)     // Catch:{ all -> 0x046d }
            java.lang.String r15 = "sort_id"
            r9 = -9223372036854775808
            long r23 = r2.getLongExtra(r15, r9)     // Catch:{ all -> 0x046d }
            java.lang.String r13 = "carousel_card_idx"
            r0 = -1
            int r8 = r2.getIntExtra(r13, r0)     // Catch:{ all -> 0x046d }
            int r18 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r18 <= 0) goto L_0x014d
            X.174 r0 = r12.A05     // Catch:{ all -> 0x046d }
            r19 = r0
            X.3qG r14 = new X.3qG     // Catch:{ all -> 0x046d }
            r0 = r25
            r14.<init>(r12, r0)     // Catch:{ all -> 0x046d }
            r0 = r19
            X.0zf r0 = r0.A01     // Catch:{ all -> 0x046d }
            X.0ze r1 = r0.A05     // Catch:{ all -> 0x046d }
            X.0zg r0 = r0.A04     // Catch:{ all -> 0x046d }
            int r0 = r0.A06     // Catch:{ all -> 0x046d }
            r1.BPD(r14, r0)     // Catch:{ all -> 0x046d }
        L_0x013c:
            int r22 = X.C40061uh.A02(r4)     // Catch:{ all -> 0x046d }
            X.36f r0 = r4.A0C     // Catch:{ all -> 0x046d }
            r12 = 1
            if (r0 == 0) goto L_0x0158
            r12 = 0
            boolean r0 = r4.A0K     // Catch:{ all -> 0x046d }
            r42 = 0
            if (r0 == 0) goto L_0x015a
            goto L_0x0158
        L_0x014d:
            X.174 r0 = r12.A05     // Catch:{ all -> 0x046d }
            java.lang.String r12 = "is_starred"
            r1 = 0
            X.0zf r0 = r0.A01     // Catch:{ all -> 0x046d }
            r0.A0B(r12, r1, r1)     // Catch:{ all -> 0x046d }
            goto L_0x013c
        L_0x0158:
            r42 = 1
        L_0x015a:
            r21 = 0
            if (r18 <= 0) goto L_0x0220
            r2.putExtra(r11, r6)     // Catch:{ all -> 0x046d }
            r2.putExtra(r15, r9)     // Catch:{ all -> 0x046d }
            r0 = -1
            r2.putExtra(r13, r0)     // Catch:{ all -> 0x046d }
            X.3Qa r1 = X.AnonymousClass3UJ.A02(r2)     // Catch:{ all -> 0x046d }
            if (r8 < 0) goto L_0x01a0
            X.3CQ r20 = new X.3CQ     // Catch:{ all -> 0x046d }
            r20.<init>()     // Catch:{ all -> 0x046d }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x046d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x046d }
            r0 = r20
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x046d }
            r0.put(r1, r11)     // Catch:{ all -> 0x046d }
            X.2be r19 = new X.2be     // Catch:{ all -> 0x046d }
            r0 = r19
            r0.<init>(r1, r8)     // Catch:{ all -> 0x046d }
        L_0x0189:
            java.lang.String r0 = "query"
            java.lang.String r1 = r2.getStringExtra(r0)     // Catch:{ all -> 0x046d }
            r4.A0G = r1     // Catch:{ all -> 0x046d }
            X.0ts r0 = r4.A0h     // Catch:{ all -> 0x046d }
            java.util.ArrayList r0 = X.C202859mm.A03(r0, r1)     // Catch:{ all -> 0x046d }
            r4.A0I = r0     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r4.A0G     // Catch:{ all -> 0x046d }
            r4.A0H = r0     // Catch:{ all -> 0x046d }
            long r14 = r4.A0O     // Catch:{ all -> 0x046d }
            goto L_0x01a5
        L_0x01a0:
            r19 = r1
            r20 = r21
            goto L_0x0189
        L_0x01a5:
            X.0xM r0 = r4.A0k     // Catch:{ all -> 0x021d }
            r18 = 51
            X.17T r1 = r0.A0j     // Catch:{ all -> 0x021d }
            r32 = 51
            r30 = r1
            r31 = r3
            r33 = r25
            r35 = r14
            long r33 = r30.A05(r31, r32, r33, r35)     // Catch:{ all -> 0x021d }
            r30 = r0
            X.36f r8 = r30.A0S(r31, r32, r33, r35)     // Catch:{ all -> 0x021d }
            long r0 = r4.A0B     // Catch:{ all -> 0x021d }
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021d }
            boolean r0 = r3 instanceof X.C28981Uw     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x01d5
            X.1SL r12 = r4.A0u     // Catch:{ all -> 0x021d }
            r11 = r3
            X.1Uw r11 = (X.C28981Uw) r11     // Catch:{ all -> 0x021d }
            r1 = r21
            r0 = r18
            r12.A05(r11, r1, r13, r0)     // Catch:{ all -> 0x021d }
        L_0x01d5:
            android.database.Cursor r0 = r8.A00     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x01dd
            r0.getCount()     // Catch:{ all -> 0x021d }
            goto L_0x01e3
        L_0x01dd:
            r0 = r22
            X.36f r8 = X.C40061uh.A03(r4, r0, r14)     // Catch:{ all -> 0x046d }
        L_0x01e3:
            java.lang.String r0 = "messagesViewModel/start/count"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x046d }
            long r0 = r8.A02     // Catch:{ all -> 0x046d }
            int r11 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01f0
            r25 = r23
        L_0x01f0:
            X.17U r9 = r4.A0o     // Catch:{ all -> 0x021d }
            r10 = r3
            r11 = r0
            r13 = r25
            int r9 = r9.A03(r10, r11, r13)     // Catch:{ all -> 0x021d }
            r0 = r38
            X.3Qp r0 = X.C36351kA.A0Z(r0, r3)     // Catch:{ all -> 0x046d }
            if (r0 != 0) goto L_0x0203
            goto L_0x0206
        L_0x0203:
            long r0 = r0.A0Q     // Catch:{ all -> 0x046d }
            goto L_0x0208
        L_0x0206:
            r0 = 1
        L_0x0208:
            int r10 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x020e
            int r9 = r9 + 1
        L_0x020e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x046d }
            java.lang.String r0 = "messagesViewModel/start/count/result "
            X.C36321k7.A1T(r0, r1, r9)     // Catch:{ all -> 0x046d }
            r37 = r21
            r12 = 1
            r42 = 1
            goto L_0x026a
        L_0x021d:
            r0 = move-exception
            goto L_0x03dd
        L_0x0220:
            r9 = -1
            X.1YX r0 = r4.A0d     // Catch:{ all -> 0x046d }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x046d }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x046d }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x046d }
            X.34H r1 = (X.AnonymousClass34H) r1     // Catch:{ all -> 0x046d }
            boolean r0 = r4.A0K     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x024b
            if (r43 != 0) goto L_0x024b
            if (r1 == 0) goto L_0x024b
            int r0 = r1.A01     // Catch:{ all -> 0x046d }
            if (r0 >= 0) goto L_0x0243
            java.lang.Boolean r1 = X.C36371kC.A0m()     // Catch:{ all -> 0x046d }
            r0 = r27
            r0.A03 = r1     // Catch:{ all -> 0x046d }
            goto L_0x024b
        L_0x0243:
            r9 = r0
            int r0 = r1.A00     // Catch:{ all -> 0x046d }
            java.lang.Integer r37 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x046d }
            goto L_0x024d
        L_0x024b:
            r37 = r21
        L_0x024d:
            if (r42 == 0) goto L_0x025e
            int r1 = r4.A07     // Catch:{ all -> 0x046d }
            r0 = 90
            if (r1 <= r0) goto L_0x025e
            int r8 = r1 + 10
            long r0 = r4.A0O     // Catch:{ all -> 0x046d }
            X.36f r8 = X.C40061uh.A03(r4, r8, r0)     // Catch:{ all -> 0x046d }
            goto L_0x0266
        L_0x025e:
            long r0 = r4.A0O     // Catch:{ all -> 0x046d }
            r8 = r22
            X.36f r8 = X.C40061uh.A03(r4, r8, r0)     // Catch:{ all -> 0x046d }
        L_0x0266:
            r19 = r21
            r20 = r21
        L_0x026a:
            android.database.Cursor r13 = r8.A00     // Catch:{ all -> 0x046d }
            if (r13 == 0) goto L_0x03de
            boolean r0 = r13.isClosed()     // Catch:{ all -> 0x046d }
            if (r0 != 0) goto L_0x03de
            if (r12 == 0) goto L_0x0279
            if (r43 == 0) goto L_0x02be
            goto L_0x027c
        L_0x0279:
            if (r43 == 0) goto L_0x02be
            goto L_0x02a1
        L_0x027c:
            r0 = r38
            X.3Qp r0 = X.C36351kA.A0Z(r0, r3)     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x02a1
            long r0 = r0.A0L     // Catch:{ all -> 0x046d }
            r11 = 1
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x02a1
            X.0wU r11 = r4.A19     // Catch:{ all -> 0x046d }
            X.00s r0 = r4.A0U     // Catch:{ all -> 0x046d }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x046d }
            X.31R r10 = new X.31R     // Catch:{ all -> 0x046d }
            r10.<init>(r0)     // Catch:{ all -> 0x046d }
            r1 = 2
            X.3wc r0 = new X.3wc     // Catch:{ all -> 0x046d }
            r0.<init>(r10, r4, r1)     // Catch:{ all -> 0x046d }
            r11.Bp1(r0)     // Catch:{ all -> 0x046d }
        L_0x02a1:
            int r1 = r4.A07     // Catch:{ all -> 0x046d }
            int r0 = r13.getCount()     // Catch:{ all -> 0x046d }
            if (r1 <= r0) goto L_0x02be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x046d }
            java.lang.String r0 = "messagesViewModel/start/unseen greater than cursor count "
            r1.append(r0)     // Catch:{ all -> 0x046d }
            int r0 = r13.getCount()     // Catch:{ all -> 0x046d }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x046d }
            X.C40061uh.A09(r4)     // Catch:{ all -> 0x046d }
            r43 = 0
        L_0x02be:
            long r0 = r8.A01     // Catch:{ all -> 0x046d }
            r4.A0V(r0)     // Catch:{ all -> 0x046d }
            long r0 = r8.A02     // Catch:{ all -> 0x046d }
            r4.A0W(r0)     // Catch:{ all -> 0x046d }
            if (r43 == 0) goto L_0x02d4
            int r11 = r4.A07     // Catch:{ all -> 0x046d }
            int r10 = r13.getCount()     // Catch:{ all -> 0x046d }
            r44 = 1
            if (r11 == r10) goto L_0x02d6
        L_0x02d4:
            r44 = 0
        L_0x02d6:
            int r11 = r13.getCount()     // Catch:{ all -> 0x046d }
            r10 = r22
            boolean r10 = X.C36371kC.A1T(r11, r10)
            r4.A0L = r10     // Catch:{ all -> 0x046d }
            r10 = r38
            X.3Qp r10 = X.C36351kA.A0Z(r10, r3)     // Catch:{ all -> 0x046d }
            if (r10 != 0) goto L_0x02ec
            r10 = 0
            goto L_0x02ee
        L_0x02ec:
            int r10 = r10.A03     // Catch:{ all -> 0x046d }
        L_0x02ee:
            r4.A01 = r10     // Catch:{ all -> 0x046d }
            boolean r10 = r4.A0L     // Catch:{ all -> 0x046d }
            int r41 = X.C36351kA.A00(r10)
            r10 = r38
            X.3Qp r10 = X.C36351kA.A0Z(r10, r3)     // Catch:{ all -> 0x046d }
            if (r10 != 0) goto L_0x0300
            r14 = 0
            goto L_0x0302
        L_0x0300:
            int r14 = r10.A03     // Catch:{ all -> 0x046d }
        L_0x0302:
            r4.A0Y(r8)     // Catch:{ all -> 0x046d }
            X.C40061uh.A0B(r4, r0)     // Catch:{ all -> 0x046d }
            java.lang.String r1 = X.C56682wi.A01     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r2.getAction()     // Catch:{ all -> 0x046d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x0335
            int r0 = r13.getCount()     // Catch:{ all -> 0x046d }
            if (r0 <= 0) goto L_0x0335
            X.3Qa r1 = X.AnonymousClass3UJ.A02(r2)     // Catch:{ all -> 0x046d }
            if (r1 == 0) goto L_0x0335
            X.1A1 r0 = r4.A0w     // Catch:{ all -> 0x046d }
            X.3T1 r35 = r0.A03(r1)     // Catch:{ all -> 0x046d }
        L_0x0326:
            X.1Rs r12 = r4.A10     // Catch:{ all -> 0x046d }
            int r2 = r4.A05     // Catch:{ all -> 0x046d }
            int r1 = r4.A06     // Catch:{ all -> 0x046d }
            int r0 = r4.A07     // Catch:{ all -> 0x046d }
            X.3GJ r11 = new X.3GJ     // Catch:{ all -> 0x046d }
            r11.<init>(r2, r1, r0)     // Catch:{ all -> 0x046d }
            monitor-enter(r4)     // Catch:{ all -> 0x046d }
            goto L_0x0338
        L_0x0335:
            r35 = 0
            goto L_0x0326
        L_0x0338:
            X.3T1 r15 = r4.A0E     // Catch:{ all -> 0x03db }
            monitor-exit(r4)     // Catch:{ all -> 0x046d }
            X.1Rs r2 = r4.A12     // Catch:{ all -> 0x046d }
            java.util.concurrent.atomic.AtomicBoolean r10 = r2.A00     // Catch:{ all -> 0x046d }
            r1 = 1
            r0 = 0
            boolean r0 = r10.compareAndSet(r1, r0)     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x0383
            java.lang.Object r1 = r2.A04()     // Catch:{ all -> 0x046d }
        L_0x034b:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x046d }
            X.3H9 r0 = new X.3H9     // Catch:{ all -> 0x046d }
            r30 = r0
            r31 = r20
            r32 = r11
            r33 = r8
            r34 = r15
            r36 = r19
            r38 = r1
            r39 = r14
            r40 = r9
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x046d }
            r12.A0D(r0)     // Catch:{ all -> 0x046d }
            int r1 = r4.A07     // Catch:{ all -> 0x046d }
            if (r1 <= 0) goto L_0x0374
            int r0 = r13.getCount()     // Catch:{ all -> 0x046d }
            if (r1 != r0) goto L_0x0374
            X.C40061uh.A09(r4)     // Catch:{ all -> 0x046d }
        L_0x0374:
            int r0 = r4.A07     // Catch:{ all -> 0x046d }
            if (r0 <= 0) goto L_0x0390
            boolean r0 = r4.A1H     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x0390
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x03cc
            goto L_0x03d0
        L_0x0383:
            r1 = 0
            goto L_0x034b
        L_0x0385:
            X.3Qa r1 = r0.A1J     // Catch:{ all -> 0x046d }
            boolean r1 = r1.A02     // Catch:{ all -> 0x046d }
            if (r1 == 0) goto L_0x0390
            int r1 = r0.A0D     // Catch:{ all -> 0x046d }
            r0 = 6
            if (r1 == r0) goto L_0x03c6
        L_0x0390:
            java.util.List r0 = r4.A1E     // Catch:{ all -> 0x046d }
            r0.clear()     // Catch:{ all -> 0x046d }
            X.1Ak r1 = X.C23931Ak.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x046d }
            r0 = r27
            r0.A00 = r1     // Catch:{ all -> 0x046d }
            r1 = 1
            r0.A06 = r1     // Catch:{ all -> 0x046d }
            X.1Rs r1 = r4.A0y     // Catch:{ all -> 0x046d }
            r0 = r21
            r1.A0D(r0)     // Catch:{ all -> 0x046d }
            X.1Rs r1 = r4.A11     // Catch:{ all -> 0x046d }
            r1.A0D(r0)     // Catch:{ all -> 0x046d }
            r2.A0D(r0)     // Catch:{ all -> 0x046d }
            X.C40061uh.A0A(r4)     // Catch:{ all -> 0x046d }
            X.3Gt r1 = r27.A00()     // Catch:{ all -> 0x046d }
            r0 = r45
            r0.A0D(r1)     // Catch:{ all -> 0x046d }
            X.3T1 r0 = r4.A0S()     // Catch:{ all -> 0x046d }
            X.C40061uh.A0D(r4, r0)     // Catch:{ all -> 0x046d }
            X.C40061uh.A06(r4)     // Catch:{ all -> 0x046d }
            goto L_0x03e3
        L_0x03c6:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x046d }
            if (r0 != 0) goto L_0x03d0
        L_0x03cc:
            X.C40061uh.A09(r4)     // Catch:{ all -> 0x046d }
            goto L_0x0390
        L_0x03d0:
            X.1A1 r0 = r4.A0w     // Catch:{ all -> 0x03d9 }
            X.3T1 r0 = r0.A01(r13, r3)     // Catch:{ all -> 0x03d9 }
            if (r0 == 0) goto L_0x03c6
            goto L_0x0385
        L_0x03d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x046d }
        L_0x03db:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x046d }
        L_0x03dd:
            throw r0     // Catch:{ all -> 0x046d }
        L_0x03de:
            java.lang.String r0 = "messagesViewModel/start/cursor is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x046d }
        L_0x03e3:
            if (r28 == 0) goto L_0x03f7
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f7
            X.0wU r4 = r5.A5S     // Catch:{ all -> 0x046d }
            r3 = 8
            X.3vB r2 = new X.3vB     // Catch:{ all -> 0x046d }
            r0 = r16
            r2.<init>(r5, r0, r3)     // Catch:{ all -> 0x046d }
            r4.Boy(r2)     // Catch:{ all -> 0x046d }
        L_0x03f7:
            X.1JL r2 = r5.A3z     // Catch:{ all -> 0x0477 }
            X.155 r1 = A0C(r5)     // Catch:{ all -> 0x0477 }
            X.026 r0 = r5.A70     // Catch:{ all -> 0x0477 }
            r2.A05(r1, r0)     // Catch:{ all -> 0x0477 }
            X.1JL r0 = r5.A3z     // Catch:{ all -> 0x0477 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0411
            X.1JL r1 = r5.A3z     // Catch:{ all -> 0x0477 }
            X.3L8 r0 = r5.A75     // Catch:{ all -> 0x0477 }
            r1.registerObserver(r0)     // Catch:{ all -> 0x0477 }
        L_0x0411:
            X.11F r0 = r5.A45     // Catch:{ all -> 0x0477 }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0471
            X.3BF r0 = A0G(r5)     // Catch:{ all -> 0x0477 }
            X.005 r0 = r0.A08     // Catch:{ all -> 0x0477 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0477 }
            X.3F8 r4 = (X.AnonymousClass3F8) r4     // Catch:{ all -> 0x0477 }
            X.11F r2 = r5.A45     // Catch:{ all -> 0x0477 }
            X.3Ro r0 = X.C28981Uw.A03     // Catch:{ all -> 0x0477 }
            boolean r0 = r2 instanceof X.C28981Uw     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x042f
            X.1Uw r2 = (X.C28981Uw) r2     // Catch:{ all -> 0x0477 }
        L_0x042d:
            monitor-enter(r4)     // Catch:{ all -> 0x0477 }
            goto L_0x0431
        L_0x042f:
            r2 = 0
            goto L_0x042d
        L_0x0431:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ all -> 0x046a }
            X.0yC r1 = r4.A02     // Catch:{ all -> 0x046a }
            r0 = 4306(0x10d2, float:6.034E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x0468
            X.12q r0 = r4.A00     // Catch:{ all -> 0x046a }
            X.1GQ r1 = r4.A04     // Catch:{ all -> 0x046a }
            boolean r0 = X.C65903Tx.A06(r0, r2, r1)     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x0468
            X.1Uw r0 = r4.A07     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x0450
            r4.A00()     // Catch:{ all -> 0x046a }
        L_0x0450:
            r4.A07 = r2     // Catch:{ all -> 0x046a }
            boolean r0 = X.C36391kE.A1Z(r1)     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x0468
            X.1Uw r3 = r4.A07     // Catch:{ all -> 0x046a }
            if (r3 == 0) goto L_0x0468
            X.0wU r2 = r4.A06     // Catch:{ all -> 0x046a }
            r1 = 32
            X.74j r0 = new X.74j     // Catch:{ all -> 0x046a }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x046a }
            r2.Boy(r0)     // Catch:{ all -> 0x046a }
        L_0x0468:
            monitor-exit(r4)     // Catch:{ all -> 0x0477 }
            goto L_0x0471
        L_0x046a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0477 }
            throw r0     // Catch:{ all -> 0x0477 }
        L_0x046d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x046f }
        L_0x046f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0477 }
        L_0x0471:
            r0 = r29
            A1I(r5, r0)
            return
        L_0x0477:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0479 }
        L_0x0479:
            r1 = move-exception
            r0 = r29
            A1I(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1z():void");
    }

    public void A20() {
        View view;
        AnonymousClass1JB r1;
        this.A3z.A06(this.A70);
        if (this.A3z.A0C()) {
            this.A3z.unregisterObserver(this.A75);
        }
        this.A1s.unregisterObserver(this.A2l);
        if (A0B(this).isFinishing() && (r1 = this.A3M) != null) {
            this.A3L.unregisterObserver(r1);
            this.A3M = null;
        }
        if (this.A0C != null) {
            this.A5z = Boolean.valueOf(A1W(this));
        }
        if (A2a()) {
            AnonymousClass6YP r0 = this.A5Z;
            C18740tg.A06(r0);
            r0.A0J();
        }
        A0S();
        A0d(this);
        this.A4T.A03(this.A77);
        A1o();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("conversation/stop/release ");
        A0u2.append(SQLiteDatabase.releaseMemory());
        A0u2.append(" jid=");
        C36321k7.A1N(this.A45, A0u2);
        if (this.A2x != null) {
            ConversationListView conversationListView = this.A2U;
            AnonymousClass11F r7 = this.A45;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.A7J;
            if (conversationListView.getHeight() != 0) {
                if (conversationListView.A0B(0)) {
                    conversationListView.A0N = true;
                    AnonymousClass1YX r02 = conversationListView.A06;
                    C18740tg.A06(r7);
                    r02.A00(r7);
                } else {
                    conversationListView.A01 = conversationListView.getFirstVisiblePosition();
                    View childAt = conversationListView.getChildAt(0);
                    conversationListView.A02 = 0;
                    if (childAt != null) {
                        conversationListView.A02 = childAt.getTop();
                    }
                    AnonymousClass1YX r3 = conversationListView.A06;
                    C18740tg.A06(r7);
                    r3.A00.put(r7, new AnonymousClass34H(conversationListView.A01 - conversationListView.getHeaderViewsCount(), conversationListView.A02));
                    conversationListView.getHeaderViewsCount();
                    conversationListView.A0N = false;
                }
            }
            Cursor cursor = conversationListView.getConversationCursorAdapter().getCursor();
            if (cursor != null) {
                cursor.close();
            }
            C36351kA.A1D(conversationListView, onPreDrawListener);
        }
        AnonymousClass2M8 r12 = this.A3r;
        if (!(r12 == null || (view = r12.A0I) == null)) {
            C36351kA.A1C(view, r12);
        }
        if (this.A45 instanceof C28981Uw) {
            ((AnonymousClass3F8) A0G(this).A08.get()).A00();
        }
        for (Application.ActivityLifecycleCallbacks onActivityStopped : this.A7B) {
            onActivityStopped.onActivityStopped(A0C(this));
        }
    }

    public void A22(int i) {
        C18740tg.A06(this.A2l.getReactionsTrayViewModel());
        if (i == 2) {
            if (A1e(this)) {
                if (this.A3l == null) {
                    A0q(this);
                }
                this.A1V.post(new C81103wT(this, 12));
                return;
            }
            AnonymousClass2M8 r0 = this.A3r;
            if (r0 != null) {
                AnonymousClass2M8.A05(r0, 0);
                this.A0C.setVisibility(8);
                this.A1U.A0H(new C81103wT(this, 13));
            }
        } else if (i == 0 && !this.A2t.A0U()) {
            if (A1e(this)) {
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3f;
                if (emojiSearchKeyboardContainer != null) {
                    emojiSearchKeyboardContainer.A02();
                }
            } else {
                AnonymousClass2MC r02 = this.A3s;
                if (r02 != null && r02.A02()) {
                    this.A3s.A01(false);
                }
            }
            this.A0C.setVisibility(0);
        }
    }

    public void A23(int i) {
        AnonymousClass3AC r0 = this.A2R;
        C18820ts r3 = r0.A05;
        View view = r0.A02;
        C36991ld.A00(new C100744vb(AnonymousClass00E.A00(view.getContext(), i), r3), view);
    }

    public void A25(long j, String str, String str2) {
        A0A(this).A0O((AnonymousClass11F) C36381kD.A0e(this.A3Y, AnonymousClass11F.class), str, "address_message", str2, (String) null, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[SYNTHETIC, Splitter:B:14:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A26(android.app.assist.AssistContent r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002e
            X.11F r3 = r4.A45
            boolean r0 = X.C36371kC.A1T(r1, r0)
            X.C18740tg.A0B(r0)
            java.lang.String r1 = "Invalid"
            if (r3 == 0) goto L_0x004c
            boolean r0 = X.AnonymousClass143.A0G(r3)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r3 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0049
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = "Individual"
        L_0x0023:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "conversation/provide-assist-content/invalid-conversation-id"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002e:
            return
        L_0x002f:
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = "conversation_type"
            org.json.JSONObject r2 = r1.put(r0, r2)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r1 = "conversation_id"
            X.C18740tg.A06(r3)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ JSONException -> 0x0056 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0056 }
            if (r0 == 0) goto L_0x002e
            goto L_0x004e
        L_0x0049:
            java.lang.String r2 = "Group"
            goto L_0x0023
        L_0x004c:
            r2 = r1
            goto L_0x0023
        L_0x004e:
            java.lang.String r0 = r0.toString()
            r5.setStructuredData(r0)
            return
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "assistant-utils/get-conversation-structured-data/exception"
            com.whatsapp.util.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A26(android.app.assist.AssistContent):void");
    }

    public void A27(Configuration configuration) {
        ViewGroup viewGroup;
        ConversationListView conversationListView = this.A2U;
        if (conversationListView != null) {
            if (conversationListView.A0K) {
                conversationListView.setTranscriptMode(2);
                Handler handler = conversationListView.A0S;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(0, 1000);
                }
            } else {
                conversationListView.setSelection(conversationListView.A00);
            }
        }
        C88974Ut r2 = this.A5U;
        if (r2 != null) {
            int i = configuration.orientation;
            r2.Bqg(i);
            if (!r2.BCh()) {
                r2.BrO(i);
            }
        }
        if (this.A2Q != null && Build.VERSION.SDK_INT >= 24 && this.A2l.isInMultiWindowMode()) {
            AnonymousClass28e.A07(this.A2Q);
        }
        AnonymousClass6YP r1 = this.A5Z;
        if (r1 != null) {
            C1492470k r4 = r1.A12;
            r4.A0L.clear();
            File file = r1.A0J;
            if (file != null) {
                r4.A04(r1.A0G, file, false, true);
            }
        }
        MentionableEntry mentionableEntry = this.A4B;
        if (mentionableEntry != null) {
            if (configuration.orientation == 1) {
                float A002 = C36341k9.A00(mentionableEntry.getContext());
                int i2 = 6;
                if (A002 < 1.5f) {
                    i2 = 4;
                    if (A002 >= 1.0f) {
                        i2 = 5;
                    }
                }
                mentionableEntry.setMaxLines(i2);
            } else {
                mentionableEntry.setMaxLines(2);
                C88974Ut r12 = this.A5U;
                if (r12 != null && r12.BCi() && !r12.BCh()) {
                    r12.B6h();
                    this.A5U.BrO(1);
                }
                AnonymousClass6YP r0 = this.A5Z;
                if (r0 != null && r0.A0U()) {
                    A1o();
                }
            }
        }
        AnonymousClass3HK r42 = this.A3E;
        if (r42 != null && r42.A0E) {
            boolean A1S2 = AnonymousClass000.A1S(configuration.orientation, 2);
            r42.A0D = A1S2;
            if (r42.A0H == 2 && A1S2) {
                r42.A00();
            }
        }
        C40061uh r43 = this.A2x;
        if (r43 != null) {
            Point point = new Point();
            C36321k7.A0K(A0B(this), point);
            r43.A00 = (point.y * 2) / A0B(this).getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        this.A3z.A04(A0C(this));
        boolean A092 = this.A3z.A09();
        int i3 = configuration.screenWidthDp;
        if (i3 != this.A02) {
            this.A02 = i3;
            if (A092 != this.A6A) {
                this.A6A = A092;
                if (A092) {
                    AnonymousClass155 A0B2 = A0B(this);
                    Intent intent = this.A0A;
                    C36351kA.A1J(A0B2, intent, 1);
                    Intent A032 = AnonymousClass190.A03(A0B2);
                    A032.setData(intent.getData());
                    A032.putExtras(intent);
                    A032.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
                    A032.putExtra("secondary_container_class", "com.whatsapp.Conversation");
                    C36371kC.A1G(A05(this), 0);
                    this.A2l.startActivity(A032);
                    this.A2l.finish();
                }
            }
        }
        LinearLayout linearLayout = this.A0e;
        if (linearLayout != null && this.A6A) {
            linearLayout.addOnLayoutChangeListener(new AnonymousClass4XX(this, 1));
        }
        if (A1e(this) && (viewGroup = this.A0S) != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C90144Zg(0, this, true));
        }
        AnonymousClass28d r3 = this.A2P;
        if (r3 != null) {
            if ((r3 instanceof C43312Gv) && configuration.orientation == 2) {
                r3.A08().post(new AVW(r3, 43));
            }
            r3.A00 = configuration;
        }
        if (AnonymousClass3B6.A00(this).BLD(this.A45)) {
            AnonymousClass3B6.A00(this).BmA(configuration, A05(this), this.A2U, this.A3Y);
        }
    }

    public void A2D(C600336f r5, AnonymousClass3T1 r6, int i) {
        Cursor cursor;
        if (!C55362uV.A00(this.A3T)) {
            this.A2l.Bnv();
        } else if (!this.A3z.A09()) {
            A06(this).A0N("search_fragment_conversation");
        } else {
            View view = this.A0L;
            if (!(view == null || this.A0J == null || this.A0M == null || this.A0K == null)) {
                view.setEnabled(true);
                this.A0J.setEnabled(true);
                this.A0M.setVisibility(8);
                this.A0K.setVisibility(8);
            }
        }
        if (r6 != null) {
            C38051nd A0D2 = A0D(this);
            A0D2.A0R.add(r6.A1J);
            if (r5 == null || (cursor = r5.A00) == null) {
                this.A2U.A05();
            } else {
                this.A2x.A0V(r5.A01);
                this.A2x.A0W(r5.A02);
                this.A2x.A0Y(r5);
                this.A2U.A08(cursor);
            }
            ConversationListView conversationListView = this.A2U;
            C36421kH.A15(conversationListView, i + conversationListView.getHeaderViewsCount(), this.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            this.A6q.A01();
        } else {
            A0P();
        }
        this.A6j = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2E(X.AnonymousClass3KV r6) {
        /*
            r5 = this;
            X.3Fr r0 = r5.A2Z
            java.lang.Class<X.2HP> r1 = X.AnonymousClass2HP.class
            X.3Ok r0 = r0.A00
            X.3uz r4 = r0.A00(r1)
            X.2HP r4 = (X.AnonymousClass2HP) r4
            if (r4 == 0) goto L_0x003a
            X.1aM r0 = r4.A0E
            com.whatsapp.voipcalling.CallInfo r1 = r0.B9F()
            r3 = 0
            if (r1 == 0) goto L_0x0042
            com.whatsapp.jid.GroupJid r0 = r1.groupJid
        L_0x0019:
            X.141 r2 = r4.A0H
            boolean r0 = X.C36411kG.A1V(r2, r0)
            if (r0 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0040
            com.whatsapp.voipcalling.CallState r1 = r1.callState
        L_0x0025:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x003d
        L_0x0029:
            X.11F r1 = r2.A0H
            if (r6 == 0) goto L_0x003b
            X.11F r0 = r6.A04
        L_0x002f:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x003d
            r4.A07 = r6
        L_0x0037:
            X.AnonymousClass2HP.A04(r4)
        L_0x003a:
            return
        L_0x003b:
            r0 = r3
            goto L_0x002f
        L_0x003d:
            r4.A07 = r3
            goto L_0x0037
        L_0x0040:
            r1 = r3
            goto L_0x0025
        L_0x0042:
            r0 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2E(X.3KV):void");
    }

    public void A2F(AnonymousClass141 r6) {
        C63583Kp r1 = this.A4d;
        if (r1.A03(r6.A0H)) {
            AnonymousClass1ND r3 = this.A25;
            List A0L2 = A0L(this, r6);
            r3.BPb(A0C(this), (GroupJid) C36381kD.A0e(r6, AnonymousClass147.class), A0L2, 25);
            return;
        }
        r1.A00(3);
    }

    public void A2G(AnonymousClass141 r14, boolean z, boolean z2) {
        C63583Kp r1 = this.A4d;
        boolean z3 = z;
        if (r1.A03(r14.A0H)) {
            if (!z2) {
                if (this.A3n.A0E(927) && r14.A0G()) {
                    AnonymousClass1ND r0 = this.A25;
                    List A0L2 = A0L(this, r14);
                    r0.Bui(A0C(this), (GroupJid) C36381kD.A0e(r14, AnonymousClass147.class), (String) null, A0L2, 9, z3);
                    return;
                } else if (!r14.A0G() || !C34681hT.A0R(this.A3n, false)) {
                    C19420v0 waSharedPreferences = this.A2l.getWaSharedPreferences();
                    AnonymousClass155 A0C2 = A0C(this);
                    int i = 8;
                    if (this.A6L) {
                        i = 25;
                    }
                    if (CallConfirmationFragment.A07(A0C2, waSharedPreferences, r14, Integer.valueOf(i), z)) {
                        return;
                    }
                } else {
                    C36381kD.A1F(C53402rG.A00((AnonymousClass147) C36381kD.A0e(r14, AnonymousClass147.class), 25, z), A06(this), "LGCCallConfirmationSheet");
                    return;
                }
            }
            if (r14.A0G()) {
                GroupJid groupJid = (GroupJid) C36381kD.A0e(r14, AnonymousClass147.class);
                AnonymousClass1ND r7 = this.A25;
                List A0L3 = A0L(this, r14);
                AnonymousClass155 A0C3 = A0C(this);
                int i2 = 25;
                if (C36431kI.A02(this.A0A, "calling-tooltip-scenario") == 1) {
                    i2 = 48;
                }
                r7.Buc(A0C3, groupJid, A0L3, i2, z);
                return;
            }
            this.A25.Bua(A0C(this), r14, 8, z);
            return;
        }
        int i3 = 3;
        if (z) {
            i3 = 4;
        }
        r1.A00(i3);
    }

    public void A2H(AnonymousClass3XU r4) {
        if (!this.A2l.getWaPermissionsHelper().A0B()) {
            this.A6o = r4;
            RequestPermissionActivity.A0B.A0D(A0C(this), 811);
            return;
        }
        A1T(r4);
    }

    public void A2I(UserJid userJid) {
        C39471sS r2 = this.A2z;
        C196089Xp r1 = (C196089Xp) A1k().get();
        C206759tv A072 = r2.A0M.A07(userJid);
        if (A072 != null) {
            r1.A02((ImageView) null, A072, (C22914AyQ) null, new C69343dN(r2, userJid), 2);
        } else {
            C81193wc.A01(r2.A0c, r2, userJid, 4);
        }
    }

    public void A2J(AnonymousClass3T1 r8) {
        if (!this.A2t.A0U() && this.A4B != null) {
            AnonymousClass6YP r0 = this.A5Z;
            if (r0 != null) {
                r0.A0D = r8;
            }
            if (r8 == null) {
                this.A0T.setVisibility(8);
                this.A0U.setVisibility(8);
                A23(R.drawable.ib_new_round);
                return;
            }
            AnonymousClass0V9 r02 = this.A0i;
            if (r02 != null) {
                r02.A05();
            }
            if (this.A0G == null) {
                View A0J2 = C36431kI.A0J(this.A2l.getLayoutInflater(), R.layout.f9nameremoved);
                this.A0G = A0J2;
                ((FrameLayout) A0J2.findViewById(R.id.quoted_message_frame)).setForeground(AnonymousClass3UF.A02(A0C(this), R.drawable.balloon_incoming_frame, R.color.f6nameremoved));
                this.A0T.addView(this.A0G);
                AnonymousClass1JZ.A05(this.A0G.findViewById(R.id.quoted_title_frame), this.A36, 0, this.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                C36341k9.A10(this.A0G, R.id.cancel, 0);
                C48742hy.A01(this.A0G.findViewById(R.id.cancel), this, 23);
                TextView A0P2 = C36391kE.A0P(this.A0G, R.id.quoted_title);
                A0P2.setTextSize(this.A2S.A02(this.A2l.getResources()));
                C33511fU.A03(A0P2);
            }
            A0F(this).A0A.get();
            if (C63903Lw.A01(r8) && A0F(this).A02.A00()) {
                MentionableEntry mentionableEntry = this.A4B;
                C225314u A0N2 = C225314u.A0N(mentionableEntry.getContext());
                AnonymousClass1K5 r4 = (AnonymousClass1K5) mentionableEntry.A05.A03();
                if (A0N2 != null && r4 != null && r4.A00() && r4.A02.A03()) {
                    if (r4.A00.A01(mentionableEntry.getMentions()) == null) {
                        ((C132326Tc) r4.A05.get()).A03(A0N2, new C85694Ib(new C40611vp(mentionableEntry, 11)));
                    }
                }
            }
            AnonymousClass3JO r5 = new AnonymousClass3JO(this.A45, false, false);
            if (this.A4n.A03(r8)) {
                this.A4n.A01(this.A0G, this.A2g, r8, r5);
            } else {
                C201709k9 r42 = this.A2g;
                View view = this.A0G;
                AnonymousClass4V6 r03 = this.A2l;
                r42.A06(view, r03.getConversationRowInflater().A02(r03.getActivityNullable()), r8, r5);
            }
            int visibility = this.A0G.findViewById(R.id.quoted_thumb).getVisibility();
            View findViewById = this.A0G.findViewById(R.id.cancel_image);
            if (visibility == 0) {
                findViewById.setBackgroundResource(R.drawable.semi_white_circle);
            } else {
                findViewById.setBackgroundColor(0);
            }
            if (this.A0T.getVisibility() != 0 || this.A06 < 0) {
                Log.i("conversation/replypreview/start");
                A0V(this.A0G, this.A0T, this);
            }
            if (A1e(this)) {
                ExpressionsBottomSheetView expressionsBottomSheetView = this.A3l;
                if (expressionsBottomSheetView != null && expressionsBottomSheetView.getVisibility() == 0) {
                    return;
                }
            } else {
                AnonymousClass2M8 r04 = this.A3r;
                if (r04 != null && r04.isShowing()) {
                    return;
                }
            }
            AnonymousClass6YP r05 = this.A5Z;
            if (r05 == null || !r05.A0U()) {
                AnonymousClass3UB r06 = this.A4l;
                if (r06 == null || !r06.A0D) {
                    C36421kH.A1D(this.A4B);
                }
            }
        }
    }

    public void A2Q(AnonymousClass3T1 r7, String str, String str2) {
        AnonymousClass1X4 A0A2 = A0A(this);
        AnonymousClass2cT r3 = new AnonymousClass2cT(C36411kG.A0o(C36331k8.A0G(this.A3Y), A0A2.A11), C19970wo.A00(A0A2.A0K));
        A0A2.A14.A00(r3, r7);
        r3.A00 = new C207149ud((AnonymousClass90O) null, new C206919uD("menu_options", str2), str);
        C36401kF.A1E(A0A2, r3);
    }

    public void A2R(AnonymousClass3T1 r20, boolean z) {
        MentionableEntry mentionableEntry = this.A4B;
        AnonymousClass0V9 r1 = this.A0i;
        KeyboardPopupLayout keyboardPopupLayout = this.A1V;
        ConversationListView conversationListView = this.A2U;
        ViewGroup viewGroup = this.A0W;
        ViewGroup viewGroup2 = this.A0T;
        ViewGroup viewGroup3 = this.A0U;
        C201709k9 r3 = this.A2g;
        AnonymousClass3T1 r4 = r20;
        if (r20 != null && !this.A2t.A0U() && mentionableEntry != null) {
            if (r1 != null) {
                r1.A05();
            }
            this.A2x.A0a(r4);
            View view = this.A0P;
            if (view == null) {
                view = new C38281oA(A0C(this), new AnonymousClass75A(this, viewGroup3, keyboardPopupLayout, conversationListView, viewGroup, viewGroup2, 8));
                this.A0P = view;
                viewGroup3.addView(view);
            }
            AnonymousClass3JO r5 = new AnonymousClass3JO(this.A45, false, false);
            if (this.A4n.A03(r4)) {
                this.A4n.A01(view, r3, r4, r5);
            } else {
                AnonymousClass4V6 r0 = this.A2l;
                r3.A06(view, r0.getConversationRowInflater().A02(r0.getActivityNullable()), r4, r5);
            }
            boolean z2 = false;
            ConversationListView conversationListView2 = this.A2U;
            if (conversationListView2 != null) {
                z2 = conversationListView2.A0B(0);
            }
            if (!z) {
                viewGroup3.setVisibility(0);
                return;
            }
            keyboardPopupLayout.setClipChildren(false);
            int transcriptMode = conversationListView.getTranscriptMode();
            if (z2) {
                conversationListView.setTranscriptMode(2);
            } else {
                conversationListView.setTranscriptMode(0);
            }
            viewGroup3.setVisibility(0);
            viewGroup3.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZR(view, viewGroup3, viewGroup, conversationListView, keyboardPopupLayout, transcriptMode, z2));
        }
    }

    public void A2S(C46812bi r4, long j, boolean z) {
        if (z) {
            this.A07 = r4.A1N;
        }
        if (j == 0) {
            this.A2U.removeCallbacks(this.A62);
        }
        C80283v9 r1 = new C80283v9(this, r4, 40);
        this.A62 = r1;
        this.A2U.postDelayed(r1, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.C34681hT.A0N(r2) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2T(X.C107265Nh r7) {
        /*
            r6 = this;
            r5 = 9
            X.1ND r4 = r6.A25
            X.155 r3 = A0C(r6)
            X.0yC r2 = r6.A3n
            int r1 = r7.A08
            r0 = 2
            if (r1 != r0) goto L_0x0016
            boolean r1 = X.C34681hT.A0N(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r4.BNr(r3, r7, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2T(X.5Nh):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (X.C34681hT.A0B(r6.A0D, r6.A0I) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2U(X.C107265Nh r11) {
        /*
            r10 = this;
            X.3Fr r0 = r10.A2Z
            java.lang.Class<X.2HP> r1 = X.AnonymousClass2HP.class
            X.3Ok r0 = r0.A00
            X.3uz r6 = r0.A00(r1)
            X.2HP r6 = (X.AnonymousClass2HP) r6
            if (r6 == 0) goto L_0x007d
            X.1aM r0 = r6.A0E
            com.whatsapp.voipcalling.CallInfo r5 = r0.B9F()
            r4 = 0
            if (r5 == 0) goto L_0x009d
            com.whatsapp.jid.GroupJid r0 = r5.groupJid
        L_0x0019:
            X.141 r3 = r6.A0H
            boolean r0 = X.C36411kG.A1V(r3, r0)
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x009b
            com.whatsapp.voipcalling.CallState r1 = r5.callState
        L_0x0027:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r8 = 0
            if (r1 != r0) goto L_0x002d
        L_0x002c:
            r8 = 1
        L_0x002d:
            if (r11 == 0) goto L_0x0099
            com.whatsapp.jid.GroupJid r0 = r11.A0D
            if (r0 == 0) goto L_0x0099
            com.whatsapp.jid.GroupJid r0 = r11.A0D
            boolean r0 = X.C36411kG.A1V(r3, r0)
            if (r0 == 0) goto L_0x0099
            int r1 = r11.A08
            r0 = 2
            if (r1 == r0) goto L_0x004a
            X.0yC r1 = r6.A0I
            X.0wQ r0 = r6.A0D
            boolean r0 = X.C34681hT.A0B(r0, r1)
            if (r0 == 0) goto L_0x0099
        L_0x004a:
            r7 = 1
        L_0x004b:
            com.whatsapp.voipcalling.CallState r1 = r6.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0057
            if (r5 == 0) goto L_0x0097
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            if (r0 == 0) goto L_0x0097
        L_0x0057:
            r3 = 1
        L_0x0058:
            if (r11 == 0) goto L_0x006a
            java.util.ArrayList r1 = r11.A0C()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0081
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0081
        L_0x0068:
            r9 = 0
        L_0x0069:
            r2 = r9
        L_0x006a:
            if (r8 == 0) goto L_0x007e
            if (r7 == 0) goto L_0x007e
            if (r3 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            r6.A08 = r11
        L_0x0074:
            X.AnonymousClass2HP.A04(r6)
            if (r5 == 0) goto L_0x007b
            com.whatsapp.voipcalling.CallState r4 = r5.callState
        L_0x007b:
            r6.A09 = r4
        L_0x007d:
            return
        L_0x007e:
            r6.A08 = r4
            goto L_0x0074
        L_0x0081:
            java.util.Iterator r2 = r1.iterator()
        L_0x0085:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.next()
            X.5Nf r0 = (X.C107255Nf) r0
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x0085
            goto L_0x0069
        L_0x0097:
            r3 = 0
            goto L_0x0058
        L_0x0099:
            r7 = 0
            goto L_0x004b
        L_0x009b:
            r1 = r4
            goto L_0x0027
        L_0x009d:
            r0 = r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2U(X.5Nh):void");
    }

    public void A2W(boolean z) {
        AnonymousClass11F r2;
        ViewGroup viewGroup;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View.OnClickListener onClickListener;
        this.A6G = z;
        AnonymousClass28d r4 = this.A2P;
        if (r4 != null) {
            boolean z2 = !z;
            if (r4 instanceof AnonymousClass2Gw) {
                r4.A04.findViewById(R.id.back).setClickable(z2);
                View findViewById = r4.A04.findViewById(R.id.whatsapp_toolbar_home);
                if (findViewById != null) {
                    findViewById.setVisibility(C36351kA.A00(z2));
                }
            } else {
                View view = r4.A01;
                if (view != null) {
                    C36361kB.A0G(r4.A07(), R.id.whatsapp_toolbar_home).setVisibility(C36351kA.A00(z2 ? 1 : 0));
                    if (z2) {
                        onClickListener = r4.A0T;
                    } else {
                        onClickListener = null;
                    }
                    view.setOnClickListener(onClickListener);
                    view.setClickable(z2);
                }
            }
        }
        if (z) {
            r2 = this.A45;
        } else {
            r2 = null;
        }
        AnonymousClass1JL r1 = this.A3z;
        if (r1.A0C()) {
            String A0w2 = C36381kD.A0w(r2);
            Iterator A0s2 = C36361kB.A0s(r1);
            while (A0s2.hasNext()) {
                AnonymousClass3L8 r12 = (AnonymousClass3L8) A0s2.next();
                if (r12 instanceof AnonymousClass2Vy) {
                    ConversationsFragment.A0P(((AnonymousClass2Vy) r12).A00, A0w2);
                }
            }
        }
        View findViewById2 = this.A2l.findViewById(R.id.split_view_divider);
        if (findViewById2 != null) {
            findViewById2.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
        if (this.A2R != null) {
            int i6 = 0;
            if (this.A6G) {
                i = A04(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
                i6 = A04(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
                i2 = A04(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
                i3 = A04(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
                i4 = A04(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            AnonymousClass3AC r0 = this.A2R;
            C18820ts r42 = r0.A05;
            View view2 = r0.A02;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                i5 = 0;
            } else {
                i5 = marginLayoutParams.topMargin;
            }
            AnonymousClass1JZ.A06(view2, r42, i6, i5, i2, i);
            C18820ts r5 = this.A36;
            ViewGroup viewGroup2 = this.A0W;
            AnonymousClass1JZ.A07(viewGroup2, r5, viewGroup2.getPaddingLeft(), this.A0W.getPaddingTop(), this.A0W.getPaddingRight(), i3);
            A0T(i4);
            Resources A042 = A04(this);
            boolean z3 = this.A6G;
            int i7 = R.dimen.f7nameremoved;
            if (z3) {
                i7 = R.dimen.f7nameremoved;
            }
            int dimensionPixelOffset = A042.getDimensionPixelOffset(i7);
            FrameLayout frameLayout = this.A2R.A03;
            ViewGroup.MarginLayoutParams A0N2 = C36411kG.A0N(frameLayout);
            A0N2.bottomMargin = dimensionPixelOffset;
            frameLayout.setLayoutParams(A0N2);
        }
        C88814Ud r02 = ((AnonymousClass1Q8) this.A2F).A00;
        if (r02 != null) {
            r02.setShouldShowGenericContactOrGroupName(z);
        }
        if (A1e(this) && (viewGroup = this.A0S) != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C90144Zg(0, this, true));
        }
    }

    public void A2X(boolean z) {
        View view;
        View view2;
        this.A6q = new C224214g("conversation/search/searchTask");
        if (!C55362uV.A00(this.A3T)) {
            this.A2l.Bu1(R.string.f12nameremoved);
        } else if (!this.A3z.A09()) {
            A06(this).A0N("search_fragment_conversation");
        } else if (this.A0L != null && this.A0J != null && (view = this.A0M) != null && (view2 = this.A0K) != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view2.setVisibility(0);
            }
            this.A0L.setEnabled(false);
            this.A0J.setEnabled(false);
        }
    }

    public void A2Y(boolean z) {
        AnonymousClass141 r2 = this.A3Y;
        if (r2 == null) {
            Log.e("conversation/window-focus-changed/no contact");
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("conversation/window-focus-changed ");
        A0u2.append(r2.A0H);
        C36321k7.A1X(" ", A0u2, z);
        if (z) {
            A0B(this).getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
            this.A2X.A01(C36351kA.A0j(this.A3Y), 1, true, true);
            if (this.A6T) {
                this.A4I.A09();
                this.A6T = false;
                return;
            }
            return;
        }
        C235718z A0a2 = C36411kG.A0a(this.A5n);
        AnonymousClass11F r1 = this.A45;
        AnonymousClass00C.A0D(r1, 0);
        if (A0a2.A06.A0Q(r1)) {
            A0B(this).getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        if (A01(r0) == 2) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2Z(boolean r26) {
        /*
            r25 = this;
            r0 = r25
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r3 = r0.A21
            if (r3 == 0) goto L_0x0012
            X.17Y r2 = r3.A03
            java.lang.Runnable r1 = r3.A08
            r2.A0G(r1)
            java.lang.Runnable r1 = r3.A07
            r2.A0G(r1)
        L_0x0012:
            X.1NG r2 = r0.A1z
            X.141 r1 = r0.A3Y
            boolean r1 = X.C36331k8.A1Y(r2, r1)
            if (r1 == 0) goto L_0x0026
            X.155 r1 = A0B(r0)
            r0 = 106(0x6a, float:1.49E-43)
        L_0x0022:
            X.AnonymousClass3SJ.A01(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.6YP r2 = r0.A5Z
            r5 = 8
            r7 = 1
            if (r2 == 0) goto L_0x0057
            X.6Q9 r1 = r2.A0H
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.A6F
            r2.A0T(r7, r1)
            X.0V9 r1 = r0.A0i
            if (r1 == 0) goto L_0x0025
            android.view.View r0 = r0.A0C
            r0.setVisibility(r5)
            return
        L_0x0040:
            boolean r1 = r2.A0U()
            if (r1 == 0) goto L_0x0057
            X.6YP r2 = r0.A5Z
            java.io.File r1 = r2.A0I
            if (r1 == 0) goto L_0x0057
            boolean r1 = r0.A6F
            r2.A0S(r1)
            X.6YP r0 = r0.A5Z
            r0.A0Q(r7)
            return
        L_0x0057:
            com.whatsapp.mentions.MentionableEntry r1 = r0.A4B
            java.lang.String r2 = r1.getStringText()
            boolean r1 = r0.A6H
            java.lang.String r1 = X.AnonymousClass6YV.A0B(r2, r1)
            X.4V6 r2 = r0.A2l
            X.0yb r3 = r2.getSystemServices()
            X.0wg r2 = r0.A4e
            boolean r2 = X.AnonymousClass6YV.A0P(r3, r2, r1)
            if (r2 != 0) goto L_0x007c
            X.17Y r1 = A09(r0)
            r0 = 2131887537(0x7f1205b1, float:1.9409684E38)
            r1.A06(r0, r7)
            return
        L_0x007c:
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r26 == 0) goto L_0x00bc
            java.lang.String r1 = X.AnonymousClass14B.A0C(r1, r4)
        L_0x0085:
            X.1sS r3 = r0.A2z
            r11 = 0
            r3.A0W(r11)
            android.view.ViewGroup r3 = r0.A0X
            r3.setVisibility(r5)
            android.view.ViewGroup r3 = r0.A0T
            r3.setVisibility(r5)
            r3 = 2131231753(0x7f080409, float:1.8079596E38)
            r0.A23(r3)
            android.view.ViewGroup r3 = r0.A0U
            r3.setVisibility(r5)
            int r8 = r1.length()
            if (r8 <= 0) goto L_0x015b
            X.141 r6 = r0.A3Y
            if (r6 == 0) goto L_0x00ce
            X.9uZ r4 = r0.A2G
            if (r4 == 0) goto L_0x00ce
            boolean r3 = r0.A6t
            if (r3 != 0) goto L_0x00ce
            boolean r3 = r0.A6U
            if (r3 == 0) goto L_0x00ce
            A0c(r4, r0)
            r0.A6t = r7
            return
        L_0x00bc:
            int r3 = r1.length()
            int r3 = r1.codePointCount(r2, r3)
            if (r3 <= r4) goto L_0x0085
            X.155 r1 = A0B(r0)
            r0 = 17
            goto L_0x0022
        L_0x00ce:
            java.util.HashMap r4 = A7c
            java.lang.Class<X.11F> r5 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r3 = r6.A06(r5)
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x0204
            r0.A0O()
            X.1sS r3 = r0.A2z
            X.6tS r6 = r3.A01
            boolean r3 = r6 instanceof X.AnonymousClass28U
            if (r3 == 0) goto L_0x0201
            X.3FY r4 = r0.A2w
            X.28U r6 = (X.AnonymousClass28U) r6
            X.3PE r3 = r0.A3D
            X.3BG r14 = r4.A00(r6, r3)
            X.1sS r3 = r0.A2z
            r3.A0V(r11)
            A1N(r0, r7)
        L_0x00f9:
            X.1uh r3 = r0.A2x
            X.3T1 r7 = r3.A0F
            boolean r3 = r7 instanceof X.C46852bm
            if (r3 == 0) goto L_0x0127
            X.9Y1 r6 = r0.A1v
            boolean r3 = r6.A03
            if (r3 == 0) goto L_0x0127
            X.2bm r7 = (X.C46852bm) r7
            X.9Sx r4 = X.C36321k7.A03(r6)
            X.9Y1 r3 = r0.A1v
            X.C36321k7.A0p(r4, r3)
            r3 = 36
            X.C36401kF.A1F(r4, r3)
            r3 = 48
            X.C36411kG.A1G(r4, r3)
            java.lang.String r3 = r7.A06
            r4.A0G = r3
            com.whatsapp.jid.UserJid r3 = r7.A01
            r4.A00 = r3
            r6.A03(r4)
        L_0x0127:
            X.1sS r3 = r0.A2z
            X.6tS r10 = r3.A01
            boolean r3 = r10 instanceof X.AnonymousClass28T
            if (r3 == 0) goto L_0x01ca
            X.28T r10 = (X.AnonymousClass28T) r10
            X.3XW r4 = r10.A00
            if (r4 == 0) goto L_0x0155
            X.1X4 r9 = A0A(r0)
            X.141 r3 = r0.A3Y
            com.whatsapp.jid.Jid r3 = r3.A06(r5)
            java.util.List r15 = java.util.Collections.singletonList(r3)
            java.lang.String r11 = r4.A00
            java.lang.String r12 = r4.A03
            java.lang.String r13 = r4.A01
            byte[] r16 = r4.A00()
            X.1uh r3 = r0.A2x
            X.3T1 r10 = r3.A0F
            r14 = r1
            r9.A0X(r10, r11, r12, r13, r14, r15, r16)
        L_0x0155:
            A0f(r0)
            A0k(r0)
        L_0x015b:
            X.4V6 r1 = r0.A2l
            X.0yb r1 = r1.getSystemServices()
            android.view.inputmethod.InputMethodManager r1 = r1.A0N()
            X.C18740tg.A06(r1)
            boolean r1 = r1.isFullscreenMode()
            r5 = 4
            if (r1 != 0) goto L_0x0192
            com.whatsapp.mentions.MentionableEntry r1 = r0.A4B
            int r3 = r1.getHeight()
            com.whatsapp.conversation.ConversationListView r1 = r0.A2U
            int r1 = X.C36431kI.A04(r1, r3)
            int r3 = r1 * 4
            android.view.Window r1 = A05(r0)
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getHeight()
            if (r3 >= r1) goto L_0x0198
            int r3 = A01(r0)
            r1 = 2
            if (r3 != r1) goto L_0x0198
        L_0x0192:
            r0.A1o()
            A1Y(r0)
        L_0x0198:
            boolean r1 = A1e(r0)
            if (r1 == 0) goto L_0x01aa
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r0.A0n
            if (r4 == 0) goto L_0x01aa
            int r3 = r4.A0J
            r1 = 3
            if (r3 != r1) goto L_0x01aa
            r4.A0W(r5)
        L_0x01aa:
            if (r8 <= 0) goto L_0x0025
            X.4V6 r1 = r0.A2l
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r1 = "fb_share_wa_redirect"
            boolean r1 = r3.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L_0x0025
            X.155 r1 = A0B(r0)
            r1.finishAffinity()
            X.4V6 r1 = r0.A2l
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r1.overridePendingTransition(r2, r0)
            return
        L_0x01ca:
            X.1X4 r9 = A0A(r0)
            X.141 r3 = r0.A3Y
            com.whatsapp.jid.Jid r3 = r3.A06(r5)
            java.util.List r20 = java.util.Collections.singletonList(r3)
            X.1sS r3 = r0.A2z
            X.4UX r6 = r3.A0b
            X.3L1 r5 = r3.A04
            X.1uh r3 = r0.A2x
            X.3T1 r15 = r3.A0F
            com.whatsapp.mentions.MentionableEntry r3 = r0.A4B
            java.util.List r21 = r3.getMentions()
            boolean r4 = r0.A6F
            boolean r3 = r0.A6H
            r13 = r11
            r18 = r11
            r24 = 0
            r12 = r11
            r17 = r6
            r19 = r1
            r22 = r4
            r23 = r3
            r16 = r5
            r9.A0D(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0155
        L_0x0201:
            r0.A0Q()
        L_0x0204:
            r14 = r11
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2Z(boolean):void");
    }

    public boolean A2a() {
        AnonymousClass6YP r0 = this.A5Z;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        return true;
    }

    public boolean A2b() {
        if (this.A0i == null) {
            this.A2l.B7Q();
            this.A4o = this.A3T.A0D(this.A45);
            A0K(this).Bp1(new C81103wT(this, 15));
            if (!this.A3z.A09()) {
                if (this.A2v == null) {
                    ConversationSearchViewModel conversationSearchViewModel = (ConversationSearchViewModel) A08(this).A00(ConversationSearchViewModel.class);
                    this.A2v = conversationSearchViewModel;
                    AnonymousClass012 A072 = A07(this);
                    C66033Uk r1 = new C66033Uk(this, 6);
                    AnonymousClass00C.A0D(A072, 0);
                    conversationSearchViewModel.A00.A08(A072, r1);
                    ConversationSearchViewModel conversationSearchViewModel2 = this.A2v;
                    AnonymousClass012 A073 = A07(this);
                    C66033Uk r12 = new C66033Uk(this, 9);
                    AnonymousClass00C.A0D(A073, 0);
                    conversationSearchViewModel2.A01.A08(A073, r12);
                    ConversationSearchViewModel conversationSearchViewModel3 = this.A2v;
                    AnonymousClass012 A074 = A07(this);
                    C80073uk r13 = new C80073uk(this, 43);
                    AnonymousClass00C.A0D(A074, 0);
                    conversationSearchViewModel3.A02.A08(A074, r13);
                    ConversationSearchViewModel conversationSearchViewModel4 = this.A2v;
                    AnonymousClass012 A075 = A07(this);
                    C80073uk r14 = new C80073uk(this, 44);
                    AnonymousClass00C.A0D(A075, 0);
                    conversationSearchViewModel4.A04.A08(A075, r14);
                    ConversationSearchViewModel conversationSearchViewModel5 = this.A2v;
                    AnonymousClass012 A076 = A07(this);
                    C66033Uk r15 = new C66033Uk(this, 8);
                    AnonymousClass00C.A0D(A076, 0);
                    conversationSearchViewModel5.A03.A08(A076, r15);
                }
                AnonymousClass01z A062 = A06(this);
                AnonymousClass02E A0N2 = A062.A0N("search_fragment_conversation");
                ViewGroup viewGroup = this.A0V;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                if (A0N2 == null && !A0B(this).isFinishing() && !A0B(this).isDestroyed()) {
                    A0N2 = new ConversationSearchFragment();
                    AnonymousClass09Y r16 = new AnonymousClass09Y(A062);
                    r16.A0G = true;
                    r16.A0F(A0N2, "search_fragment_conversation", R.id.search_fragment_holder);
                    r16.A0J("search_fragment_conversation");
                    r16.A01();
                    A062.A0T();
                }
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A0N2;
                ConversationSearchViewModel conversationSearchViewModel6 = this.A2v;
                AnonymousClass00C.A0D(conversationSearchViewModel6, 0);
                conversationSearchFragment.A02 = conversationSearchViewModel6;
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                }
                String str = this.A2x.A0H;
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (wDSConversationSearchView2 != null) {
                    wDSConversationSearchView2.setText((CharSequence) str);
                }
                DatePickerDialog.OnDateSetListener onDateSetListener = this.A7E;
                AnonymousClass00C.A0D(onDateSetListener, 0);
                conversationSearchFragment.A00 = onDateSetListener;
                A1A(this, this.A00);
            } else {
                C021809f r17 = this.A6i;
                if (r17 == null) {
                    r17 = new AnonymousClass4YO(this, 2);
                    this.A6i = r17;
                }
                this.A0i = this.A2l.But(r17);
            }
            AnonymousClass6YP r18 = this.A5Z;
            if (r18 == null || (r18.A0H == null && !r18.A0U())) {
                this.A0C.setVisibility(8);
                A1Y(this);
            }
            if (!A1W(this)) {
                InputMethodManager A0N3 = this.A2l.getSystemServices().A0N();
                C18740tg.A06(A0N3);
                A0N3.toggleSoftInput(0, 0);
            }
            AnonymousClass22r r0 = this.A2Q.A02;
            if (r0 != null && r0.isShowing()) {
                this.A2Q.A0H();
            }
        }
        return false;
    }

    public boolean A2c(int i, KeyEvent keyEvent) {
        AnonymousClass6YP r0;
        Iterator it = this.A7Y.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!keyEvent.isPrintingKey() || !this.A4B.isShown() || this.A4B.hasFocus() || ((r0 = this.A5Z) != null && r0.A0H != null)) {
            return this.A2l.Bia(i, keyEvent);
        }
        this.A4B.requestFocus();
        this.A4B.dispatchKeyEvent(keyEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        if (r10.A0n.A0J != 2) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2e(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r3 = "conversation/dispatch-touch-event "
            X.1nd r0 = A0D(r10)
            boolean r0 = r0.A0C
            r2 = 0
            if (r0 == 0) goto L_0x0019
            X.4V6 r0 = r10.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            X.6zU r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            X.0Th r0 = r10.A0k
            r1 = 1
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A00(r11)
            if (r0 == 0) goto L_0x0026
            return r1
        L_0x0026:
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x002e
            r10.A6E = r2
        L_0x002e:
            boolean r0 = A1e(r10)
            if (r0 != 0) goto L_0x0071
            X.2MC r0 = r10.A3s
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0071
            android.view.View r0 = r10.A0C
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0071
            android.view.View r0 = r10.A0C
            int[] r6 = r10.A7Z
            r0.getLocationOnScreen(r6)
            float r4 = r11.getRawY()
            r0 = r6[r1]
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            float r5 = r11.getRawY()
            r4 = r6[r1]
            android.view.View r0 = r10.A0C
            int r0 = X.C36431kI.A04(r0, r4)
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x011b
            r10.A6v = r1
        L_0x0071:
            int r0 = r11.getActionMasked()
            r4 = 2
            if (r0 == r4) goto L_0x0133
            int r0 = r11.getActionMasked()
            if (r0 == r1) goto L_0x0133
            boolean r0 = A1e(r10)
            if (r0 == 0) goto L_0x0133
            float r9 = r11.getX()
            float r8 = r11.getY()
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4B
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0133
            int[] r1 = new int[r4]
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4B
            r0.getLocationInWindow(r1)
            r6 = r1[r2]
            r7 = 1
            r1 = r1[r7]
            boolean r0 = r10.A6G
            if (r0 == 0) goto L_0x00bc
            X.4V6 r5 = r10.A2l
            r0 = 2131434196(0x7f0b1ad4, float:1.84902E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x00bc
            int[] r5 = new int[r4]
            r0.getLocationInWindow(r5)
            r0 = r5[r2]
            int r6 = r6 - r0
            r0 = r5[r7]
            int r1 = r1 - r0
        L_0x00bc:
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4B
            int r0 = r0.getWidth()
            int r6 = r6 + r0
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            float r0 = (float) r1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4B
            int r0 = X.C36431kI.A04(r0, r1)
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0n
            if (r0 == 0) goto L_0x0133
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r10.A3l
            if (r0 == 0) goto L_0x0133
            com.whatsapp.KeyboardPopupLayout r0 = r10.A1V
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0019
            boolean r0 = A1e(r10)
            if (r0 == 0) goto L_0x0104
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A3f
            if (r0 == 0) goto L_0x0104
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0104
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A3f
            r0.A02()
        L_0x0100:
            A0y(r10)
            goto L_0x0133
        L_0x0104:
            boolean r0 = A1e(r10)
            if (r0 == 0) goto L_0x0133
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r10.A3l
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0133
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0n
            int r0 = r0.A0J
            if (r0 == r4) goto L_0x0133
            goto L_0x0100
        L_0x011b:
            int r0 = r11.getAction()
            if (r0 != r1) goto L_0x0071
            boolean r0 = r10.A6v
            if (r0 == 0) goto L_0x012f
            X.2MC r0 = r10.A3s
            r0.A01(r1)
            android.view.View r0 = r10.A0C
            r0.requestFocus()
        L_0x012f:
            r10.A6v = r2
            goto L_0x0071
        L_0x0133:
            X.4V6 r0 = r10.A2l     // Catch:{ ActivityNotFoundException -> 0x013f, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x013a }
            boolean r0 = r0.BvF(r11)     // Catch:{ ActivityNotFoundException -> 0x013f, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x013a }
            return r0
        L_0x013a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return r2
        L_0x013f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            X.17Y r1 = A09(r10)
            r0 = 2131886365(0x7f12011d, float:1.9407307E38)
            r1.A06(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2e(android.view.MotionEvent):boolean");
    }

    public boolean A2g(AnonymousClass3T1 r4) {
        if (this.A2l.getSeenMessages().contains(r4.A1J)) {
            return false;
        }
        C38051nd A0D2 = A0D(this);
        if (A0D2.A06(r4) > A0D2.A04()) {
            return true;
        }
        return A0D2.A07.contains(r4);
    }

    public static float A00(C70803fk r2) {
        return Settings.Global.getFloat(A0B(r2).getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static int A02(C70803fk r1) {
        if (A1a(r1)) {
            return 6;
        }
        if (r1.A3Y.A0H instanceof C28981Uw) {
            return 5;
        }
        return 0;
    }

    public static int A03(C70803fk r4) {
        AnonymousClass09H A082;
        int i = 0;
        if (!A1W(r4)) {
            return 0;
        }
        Activity activity = (Activity) C32551do.A00(r4.A0B.getContext());
        if (!(activity == null || (A082 = C012005e.A08(C36361kB.A0C(activity))) == null)) {
            AnonymousClass09I r2 = A082.A00;
            i = r2.A0C(8).A00 - r2.A0C(2).A00;
        }
        int height = r4.A0B.getRootView().getHeight();
        if (i <= 0) {
            Rect A062 = AnonymousClass001.A06();
            r4.A0B.getWindowVisibleDisplayFrame(A062);
            i = height - A062.bottom;
            if (i <= 0) {
                return r4.A0B.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            }
        }
        return Math.max(i, (int) (((float) height) * 0.3f));
    }

    public static AnonymousClass3T1 A0J(C38051nd r5, AnonymousClass3T1 r6) {
        AnonymousClass3T1 r4 = null;
        if (r5.getCursor() != null) {
            int count = r5.getCount();
            int A062 = r5.A06(r6);
            if (A062 >= 0) {
                int i = A062 + 1;
                r4 = r5.getItem(i);
                while (i <= count && r4 != null && (r4.A1J.A00 == null || r4.A1I == 10)) {
                    r4 = r5.getItem(i);
                    i++;
                }
            }
        }
        return r4;
    }

    private void A0P() {
        EditText editText;
        EditText editText2;
        A09(this).A06(R.string.f12nameremoved, 0);
        if (!this.A3z.A09()) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A06(this).A0N("search_fragment_conversation");
            if (conversationSearchFragment != null) {
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (!(wDSConversationSearchView == null || (editText2 = wDSConversationSearchView.A01) == null)) {
                    editText2.sendAccessibilityEvent(8);
                }
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (!(wDSConversationSearchView2 == null || (editText = wDSConversationSearchView2.A01) == null)) {
                    editText.requestFocus();
                }
                WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
                if (wDSConversationSearchView3 != null) {
                    wDSConversationSearchView3.A02();
                    return;
                }
                return;
            }
            return;
        }
        this.A1g.sendAccessibilityEvent(8);
        this.A1g.requestFocus();
        this.A1g.A0C(false);
    }

    public static void A0W(View view, C70803fk r3) {
        String string = view.getResources().getString(R.string.f12nameremoved);
        r3.A0b.setImageResource(R.drawable.ib_emoji);
        r3.A0b.setContentDescription(string);
        r3.A1V.getLayoutParams().height = -1;
        r3.A1V.requestLayout();
    }

    private void A0Z(TextEmojiLabel textEmojiLabel, boolean z) {
        CharSequence A012;
        AnonymousClass155 A0C2 = A0C(this);
        if (C36371kC.A00(this.A3x.A00.A0E(3180) ? 1 : 0) == 2) {
            ((LinearLayout) this.A0H).setOrientation(1);
            LinearLayout.LayoutParams A0N2 = C36371kC.A0N();
            A0N2.gravity = 1;
            this.A1d.setLayoutParams(A0N2);
            this.A5e.setVisibility(0);
            this.A5e.setText(R.string.f12nameremoved);
            A012 = A0C2.getString(R.string.f12nameremoved);
            AnonymousClass3YD.A00(this.A5e, this, 5, z);
        } else if (z) {
            A012 = A0C2.getString(R.string.f12nameremoved);
        } else {
            Object[] objArr = new Object[1];
            C36361kB.A0x(A0C(this), A0C2, objArr);
            A012 = AnonymousClass14B.A01(A0C2, objArr, R.string.f12nameremoved);
        }
        textEmojiLabel.setText(A012);
    }

    public static void A0g(C70803fk r2) {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (A1e(r2) && (expressionsBottomSheetView = r2.A3l) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = r2.A0n) != null && bottomSheetBehavior.A0J == 3) {
            bottomSheetBehavior.A0W(4);
        }
    }

    public static void A0m(C70803fk r5) {
        AnonymousClass02E A0N2;
        Window window;
        AnonymousClass01z A062 = A06(r5);
        if (A062.A0I() == 1 && (A0N2 = A062.A0N("search_fragment_conversation")) != null && A0N2.A15()) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A06(r5).A0N("search_fragment_conversation");
            if (conversationSearchFragment != null) {
                AnonymousClass01I A0h2 = conversationSearchFragment.A0h();
                if (!(A0h2 == null || (window = A0h2.getWindow()) == null)) {
                    AnonymousClass1RC.A09(window, false);
                }
                ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                if (conversationSearchViewModel != null) {
                    conversationSearchViewModel.A00.A0D("");
                }
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A00();
                }
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (wDSConversationSearchView2 != null) {
                    AnonymousClass4WT r1 = conversationSearchFragment.A07;
                    AnonymousClass00C.A0D(r1, 0);
                    wDSConversationSearchView2.A01.removeTextChangedListener(r1);
                }
            }
            A06(r5).A0n("search_fragment_conversation", 1);
            C36341k9.A0y(r5.A0V);
            A1A(r5, r5.A00);
            A1A(r5, r5.A00);
        }
        AnonymousClass155 A0C2 = A0C(r5);
        if (r5.A3z.A09() && (A0C2 instanceof AnonymousClass15G)) {
            AnonymousClass15G.A0F((AnonymousClass15G) A0C2, 0);
        }
        C40061uh r12 = r5.A2x;
        r12.A0G = null;
        r12.A0I = null;
        r5.A4o = null;
        C36421kH.A1F(r5.A5N);
        if (r5.A2t.A0U()) {
            r5.A4B.A0B();
        } else {
            r5.A0C.setVisibility(0);
            r5.A4B.requestFocus();
        }
        C38051nd.A00(r5);
    }

    public static void A0x(C70803fk r6) {
        AnonymousClass22r r0;
        C39281rd r2;
        if (A1W(r6)) {
            r6.A1V.A04 = true;
            r6.A6C = true;
            r6.A6Y = true;
            if ((A1c(r6) || A1d(r6)) && (r2 = r6.A3y) != null) {
                r2.A01 = new AnonymousClass2A6(r6, 9);
                r2.A00 = new AnonymousClass2A6(r6, 10);
                r6.A1o();
                return;
            }
            r6.A1o();
            long j = 300;
            if (A1e(r6) && r6.A3n.A0E(7616)) {
                j = 50;
            }
            r6.A1V.postDelayed(new C81103wT(r6, 20), (long) ((int) (A00(r6) * 50.0f)));
            r6.A1V.postDelayed(new C81103wT(r6, 26), (long) ((int) (((float) j) * A00(r6))));
            return;
        }
        if (C36391kE.A1Y(r6.A3n) && (r0 = r6.A2Q.A02) != null && r0.isShowing()) {
            r6.A1V.A04 = true;
            r6.A2Q.A0H();
        }
        A1Q(r6, true);
    }

    public static void A10(C70803fk r5) {
        boolean A1b2 = A1b(r5);
        AnonymousClass155 A0C2 = A0C(r5);
        C20810yC r0 = r5.A3n;
        C18820ts r3 = r5.A36;
        if (A1b2) {
            WaImageButton A012 = C63733Le.A01(A0C2, r0);
            if (A012.getVisibility() != 8) {
                A012.setVisibility(8);
                if (A012.getId() == R.id.input_attach_button_left) {
                    View A0B2 = C03570Gk.A0B(A0C2, R.id.entry);
                    AnonymousClass1JZ.A05(A0B2, r3, A0C2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), A0B2.getPaddingEnd());
                    return;
                }
                return;
            }
            return;
        }
        WaImageButton A013 = C63733Le.A01(A0C2, r0);
        if (A013.getVisibility() != 0) {
            A013.setVisibility(0);
            if (A013.getId() == R.id.input_attach_button_left) {
                View A0B3 = C03570Gk.A0B(A0C2, R.id.entry);
                AnonymousClass1JZ.A05(A0B3, r3, 0, A0B3.getPaddingEnd());
            }
        }
    }

    public static void A18(C70803fk r4, int i) {
        View view;
        if (A0H(r4).A0E(834) && A1g(r4, i) && (view = r4.A0F) != null && view.getVisibility() != 8) {
            C19420v0 waSharedPreferences = r4.A2l.getWaSharedPreferences();
            C36341k9.A0x(C19420v0.A00(waSharedPreferences), "payment_chat_composer_entry_nux_shown", r4.A2l.getWaSharedPreferences().A0h());
            ObjectAnimator objectAnimator = r4.A08;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            r4.A0F.setVisibility(8);
        }
    }

    public static void A19(C70803fk r6, int i) {
        if (A0H(r6).A0E(834) && A1g(r6, i)) {
            if (!r6.A2l.getWaSharedPreferences().A0h().equals(C36341k9.A0E(r6.A2l.getWaSharedPreferences()).getString("payment_chat_composer_entry_nux_shown", ""))) {
                View view = r6.A0F;
                if (view != null) {
                    view.setVisibility(0);
                }
                ObjectAnimator objectAnimator = r6.A08;
                if (objectAnimator == null) {
                    View view2 = r6.A0F;
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C36381kD.A1S(new float[1], propertyValuesHolderArr);
                    propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
                    r6.A08 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                r6.A08.setRepeatCount(-1);
                r6.A08.setRepeatMode(1);
                r6.A08.start();
                return;
            }
            A18(r6, i);
        }
    }

    public static void A1B(C70803fk r1, int i) {
        if (A1a(r1)) {
            r1.A0a.setVisibility(8);
        } else {
            r1.A0a.setVisibility(i);
        }
    }

    public static void A1K(C70803fk r4, String str, int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = 10;
        if (z) {
            i2 = 3;
        }
        r4.A1V(valueOf, Integer.valueOf(i2), 31);
        A0x(r4);
        r4.A1V.postDelayed(new C80383vJ(r4, str, 2, z), 200);
    }

    public static boolean A1a(C70803fk r2) {
        return AnonymousClass3B6.A00(r2).BLB(r2.A45);
    }

    public static boolean A1b(C70803fk r3) {
        if (A1a(r3)) {
            return true;
        }
        if (r3.A4B == null || ((AnonymousClass1HX) A0F(r3).A0A.get()).A01(r3.A4B.getMentions()) == null) {
            return false;
        }
        return true;
    }

    public static boolean A1e(C70803fk r1) {
        return A0H(r1).A0E(3792);
    }

    public static boolean A1g(C70803fk r3, int i) {
        if (!A0H(r3).A0E(743) || !r3.A4Y.A0d(A0C(r3), C36351kA.A0l(r3.A3Y), i)) {
            return false;
        }
        if (i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    private boolean A1h(Jid jid) {
        List list;
        if (!AnonymousClass143.A0H(jid)) {
            return false;
        }
        if (this.A4g.A05()) {
            C32881eL r0 = this.A44;
            AnonymousClass00C.A0D(jid, 0);
            AnonymousClass00T r2 = r0.A01;
            String A0t2 = C36371kC.A0t(C36411kG.A0E(r2), String.valueOf(0));
            if (A0t2 != null) {
                Set<String> stringSet = C36411kG.A0E(r2).getStringSet("optedInIntegratorNames", C004702c.A00);
                if (stringSet != null) {
                    list = C007103b.A0Y(stringSet);
                } else {
                    list = C023409w.A00;
                }
                if (!list.contains(A0t2)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public void A1n() {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (A1e(this) && (expressionsBottomSheetView = this.A3l) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0n) != null) {
            bottomSheetBehavior.A0W(5);
        }
    }

    public void A1s() {
        AnonymousClass2MC r0;
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        AnonymousClass02E A0N2;
        AnonymousClass01z A062 = A06(this);
        if (A062.A0I() == 1 && (A0N2 = A062.A0N("search_fragment_conversation")) != null && A0N2.A15()) {
            A0m(this);
        } else if (A1e(this) && (expressionsBottomSheetView = this.A3l) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0n) != null) {
            bottomSheetBehavior.A0W(5);
        } else if (A1e(this) || (r0 = this.A3s) == null || !r0.A03()) {
            C88974Ut r1 = this.A5U;
            if (r1 == null || !r1.BCi() || !r1.BCh()) {
                AnonymousClass3UB r12 = this.A4l;
                if (r12 != null) {
                    AnonymousClass3UB.A06(r12, false, false);
                }
                Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                if (A7c.get(this.A3Y.A06(cls)) != null) {
                    AnonymousClass1YG.A01(this.A3A.A02, C36401kF.A0b(this.A45), 7);
                }
                boolean booleanExtra = this.A2l.getIntent().getBooleanExtra("fb_share_wa_redirect", false);
                if ((this.A2l.isTaskRoot() || this.A2l.getIntent().getBooleanExtra("fb_share_wa_redirect", false)) && !A0B(this).getComponentName().getClassName().equals("com.whatsapp.HomeActivity")) {
                    Intent A032 = AnonymousClass190.A03(A0C(this));
                    if (booleanExtra) {
                        A032.putExtra("fb_share_wa_redirect", true);
                    }
                    this.A2l.finishAndRemoveTask();
                    this.A2l.startActivity(A032);
                    return;
                }
                C65073Qp A0Z2 = C36351kA.A0Z(this.A3O, this.A3Y.A06(cls));
                if (A0Z2 != null && A0Z2.A0p) {
                    this.A3K.A06((AnonymousClass11F) C36381kD.A0e(this.A3Y, cls));
                }
                this.A5s.get();
                this.A2l.BiV();
                return;
            }
            r1.B76(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1w() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.A6b = r0
            r0 = 1
            r5.A6a = r0
            r5.A0S()
            X.4V6 r0 = r5.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0021
            X.4V6 r0 = r5.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            r0.A03()
        L_0x0021:
            X.4V6 r0 = r5.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            X.AnonymousClass3UR.A07(r0)
            X.005 r0 = r5.A5s
            X.1V7 r4 = X.C36431kI.A0o(r0)
            X.4V6 r0 = r5.A2l
            android.view.View r0 = r0.getContentView()
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            boolean r2 = X.AnonymousClass1V9.A00(r0)
            X.1V6 r0 = r4.A07
            boolean r1 = r0.A0B()
            r0 = 1
            if (r2 == 0) goto L_0x00cb
            r4.A05 = r0
            r4.A04 = r0
        L_0x004b:
            r4.A03 = r0
        L_0x004d:
            X.141 r1 = r5.A3Y
            if (r1 == 0) goto L_0x007b
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4B
            if (r0 == 0) goto L_0x007b
            java.util.HashMap r2 = X.C56772wr.A02
            java.lang.Class<X.11F> r4 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r1.A06(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4B
            java.lang.String r0 = r0.getStringText()
            r2.put(r1, r0)
            java.util.HashMap r2 = A7d
            X.141 r0 = r5.A3Y
            com.whatsapp.jid.Jid r1 = r0.A06(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4B
            java.util.List r0 = r0.getMentions()
            java.lang.String r0 = X.C65713Te.A01(r0)
            r2.put(r1, r0)
        L_0x007b:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2U
            if (r0 == 0) goto L_0x0088
            X.1nd r0 = r0.getConversationCursorAdapter()
            X.1Ak r0 = r0.A07
            r0.size()
        L_0x0088:
            android.os.Handler r0 = r5.A6c
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.hasMessages(r3)
            if (r0 == 0) goto L_0x00a8
            android.os.Handler r0 = r5.A6c
            r0.removeMessages(r3)
            X.4V6 r0 = r5.A2l
            X.0yb r0 = r0.getSystemServices()
            android.os.PowerManager r0 = r0.A0G()
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "conversation/pause pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00a8:
            X.0v5 r1 = r5.A0q
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00db
            r1.A02()
            X.4V6 r0 = r5.A2l
            r0.getActivityNullable()
            java.lang.String r0 = "unregisterActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00bf:
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x00a8
            android.os.Handler r0 = r5.A6c
            r0.sendEmptyMessage(r3)
            goto L_0x00a8
        L_0x00cb:
            if (r1 == 0) goto L_0x00d3
            r4.A05 = r0
            r4.A04 = r3
            goto L_0x004b
        L_0x00d3:
            r4.A05 = r3
            r4.A04 = r3
            r4.A03 = r3
            goto L_0x004d
        L_0x00db:
            X.3UB r2 = r5.A4l
            if (r2 == 0) goto L_0x00f4
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x015f
            X.1Pm r1 = r2.A0q
            X.1NK r0 = r2.A0p
            r1.unregisterObserver(r0)
            r1 = 17
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.AnonymousClass3UB.A05(r2, r0)
        L_0x00f4:
            A0d(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0105
            X.4V6 r0 = r5.A2l
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 != 0) goto L_0x0113
        L_0x0105:
            boolean r0 = r5.A2a()
            if (r0 == 0) goto L_0x0113
            X.6YP r0 = r5.A5Z
            X.C18740tg.A06(r0)
            r0.A0J()
        L_0x0113:
            X.11F r0 = r5.A45
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x012c
            X.3BF r0 = A0G(r5)
            X.005 r0 = r0.A0E
            java.lang.Object r1 = r0.get()
            X.4V1 r1 = (X.AnonymousClass4V1) r1
            X.11F r0 = r5.A45
            X.1Uw r0 = (X.C28981Uw) r0
            r1.B2i(r0)
        L_0x012c:
            X.0yC r1 = r5.A3n
            r0 = 7149(0x1bed, float:1.0018E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = "ConversationDelegate/removeStickerTrayListeners"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3rU r0 = r5.A4c
            r1 = 0
            if (r0 == 0) goto L_0x0142
            r0.A04 = r1
        L_0x0142:
            X.2M8 r0 = r5.A3r
            if (r0 == 0) goto L_0x0149
            r0.A0L(r1)
        L_0x0149:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r5.A3l
            if (r0 == 0) goto L_0x014f
            r0.A0I = r1
        L_0x014f:
            X.0yC r1 = r5.A3n
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x015e
            X.3P6 r0 = r5.A4u
            r0.A01()
        L_0x015e:
            return
        L_0x015f:
            X.AnonymousClass3UB.A06(r2, r3, r3)
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A1w():void");
    }

    public void A21() {
        boolean A1X2 = A1X(this);
        int i = R.string.f12nameremoved;
        if (A1X2) {
            i = R.string.f12nameremoved;
        }
        this.A4B.setHint(this.A2l.getString(i));
    }

    public void A28(Drawable drawable, View view) {
        ImageView imageView = new ImageView(A0C(this));
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(4);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C90124Ze(imageView, view, this, 2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        this.A1V.addView(imageView, layoutParams);
    }

    public void A2A(Bundle bundle) {
        this.A5z = Boolean.valueOf(A1W(this));
        bundle.putBoolean("added_by_qr_code", this.A67);
        bundle.putBoolean("has_number_from_url", this.A6F);
        bundle.putBoolean("has_text_from_url", this.A6H);
        bundle.putBoolean("keyboard_visible", this.A5z.booleanValue());
        bundle.putBoolean("added_by_number_search", this.A2x.A0J);
        bundle.putLong("ephemeral_session_start", this.A2x.A0l.A00);
    }

    public void A2C(AnonymousClass4Q5 r4, C207219uk r5) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("arg_select_list_content", r5);
        SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
        selectListBottomSheet.A17(A072);
        selectListBottomSheet.A00 = r4;
        AnonymousClass155 A0C2 = A0C(this);
        if (A0C2 != null && (A0C2 instanceof AnonymousClass4V7)) {
            C65443Sb.A00(selectListBottomSheet, A0C2);
        }
    }

    public void A2K(AnonymousClass3T1 r3) {
        A2L(r3, (AnonymousClass3T1) null, this.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2L(X.AnonymousClass3T1 r14, X.AnonymousClass3T1 r15, int r16) {
        /*
            r13 = this;
            X.1nd r1 = A0D(r13)
            X.1uh r4 = r13.A2x
            int r9 = r1.A04()
            com.whatsapp.conversation.ConversationListView r0 = r13.A2U
            int r10 = r0.getFirstVisiblePosition()
            int r11 = r1.getCount()
            boolean r0 = r15 instanceof X.AnonymousClass2cV
            r6 = r14
            if (r0 == 0) goto L_0x0068
            X.3T1 r0 = r15.A0S()
            if (r0 == 0) goto L_0x0068
            X.3Qa r1 = r0.A1J
            X.3Qa r0 = new X.3Qa
            r0.<init>(r1)
            X.3Qa r2 = r14.A1J
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.C203369nr.A09(r14)
            if (r0 == 0) goto L_0x0068
            X.2cV r15 = (X.AnonymousClass2cV) r15
            java.lang.Integer r3 = r15.A01
            if (r3 == 0) goto L_0x0069
            int r1 = r3.intValue()
            X.2be r0 = new X.2be
            r0.<init>(r2, r1)
        L_0x0043:
            java.util.List r7 = java.util.Collections.singletonList(r0)
            if (r3 != 0) goto L_0x0051
            r5 = 0
        L_0x004a:
            r12 = 1
            r8 = r16
            r4.A0X(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0051:
            X.3CQ r5 = new X.3CQ
            r5.<init>()
            int r1 = r3.intValue()
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A00
            r0.put(r2, r1)
            goto L_0x004a
        L_0x0068:
            r3 = 0
        L_0x0069:
            X.3Qa r0 = r14.A1J
            r2 = r0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A2L(X.3T1, X.3T1, int):void");
    }

    public void A2M(AnonymousClass3T1 r13, C64933Qa r14, AnonymousClass3DS r15, String str, String str2, Bitmap[] bitmapArr, int i) {
        Object[] A1Q2 = C36441kJ.A1Q();
        C64933Qa r6 = r14;
        String str3 = str;
        String str4 = str2;
        AnonymousClass000.A19(r14, str3, str4, A1Q2);
        String.format("conversation/initInlineVideoPlayback rowKey:%s fullUrl:%s canonicalUrl:%s", A1Q2);
        if (A2a()) {
            AnonymousClass6YP r0 = this.A5Z;
            C18740tg.A06(r0);
            r0.A0K();
        }
        C88974Ut r3 = this.A5U;
        AnonymousClass3T1 r5 = r13;
        AnonymousClass3DS r7 = r15;
        Bitmap[] bitmapArr2 = bitmapArr;
        int i2 = i;
        if (r3 == null || this.A5T == null) {
            AnonymousClass5ND r2 = new AnonymousClass5ND(A0C(this), this.A2U);
            this.A5T = r2;
            r2.A01 = this.A2l.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            C69953eM r1 = new C69953eM(this);
            this.A29 = r1;
            this.A2U.A05.A02(r1);
            this.A5T.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZT(new AnonymousClass31H(this), this, r5, r6, r7, str3, str4, bitmapArr2, i2));
            ((ViewGroup) A05(this).getDecorView()).addView(this.A5T, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        r3.B7D(new C145166tS(this.A1b, this.A46, str3), r5, r6, r7, str3, str4, bitmapArr2, i2);
    }

    public void A2N(AnonymousClass3T1 r10, AnonymousClass3EY r11) {
        AnonymousClass1X4 A0A2 = A0A(this);
        AnonymousClass11F A0G2 = C36331k8.A0G(this.A3Y);
        String str = r11.A03;
        if (str == null) {
            str = "N/A - Empty Button Title";
        }
        AnonymousClass2cU r3 = new AnonymousClass2cU(C36411kG.A0o(A0G2, A0A2.A11), str, r11.A04, C19970wo.A00(A0A2.A0K));
        A0A2.A14.A00(r3, r10);
        C36401kF.A1E(A0A2, r3);
    }

    public void A2O(AnonymousClass3T1 r10, C206729ts r11) {
        AnonymousClass1X4 A0A2 = A0A(this);
        C64933Qa A0o2 = C36411kG.A0o(C36331k8.A0G(this.A3Y), A0A2.A11);
        long A002 = C19970wo.A00(A0A2.A0K);
        C207149ud r0 = new C207149ud(r11.A03, r11.A00, r11.A02, 1);
        AnonymousClass2cT r1 = new AnonymousClass2cT(A0o2, A002);
        r1.A00 = r0;
        A0A2.A14.A00(r1, r10);
        C36401kF.A1E(A0A2, r1);
    }

    public void A2P(AnonymousClass3T1 r11, AnonymousClass3P8 r12) {
        AnonymousClass1X4 A0A2 = A0A(this);
        AnonymousClass11F A0G2 = C36331k8.A0G(this.A3Y);
        String str = r12.A08;
        String str2 = r12.A01;
        int i = r12.A05;
        Integer num = r12.A07;
        AnonymousClass2cV r1 = new AnonymousClass2cV(C36411kG.A0o(A0G2, A0A2.A11), C19970wo.A00(A0A2.A0K));
        r1.A16(str);
        r1.A02 = str2;
        r1.A00 = i;
        r1.A01 = num;
        A0A2.A14.A00(r1, r11);
        C36401kF.A1E(A0A2, r1);
    }

    public boolean A2f(AnonymousClass11F r7, int i) {
        boolean z = false;
        if (i == R.id.menuitem_add_to_contacts || i == R.id.menuitem_add_to_existing_contact) {
            if (r7 != null) {
                AnonymousClass141 A082 = this.A2l.getContactManager().A08(r7);
                if (i == R.id.menuitem_add_to_contacts) {
                    z = true;
                }
                A1F(this, A082, r7, z);
                return true;
            }
            Log.w("conversation/add-contact-failed");
            A09(this).A06(R.string.f12nameremoved, 0);
            return true;
        } else if (i != R.id.menuitem_message_contact) {
            if (i == R.id.menuitem_voice_call_contact) {
                if (r7 != null) {
                    this.A25.Bua(A0C(this), this.A2l.getContactManager().A0D(r7), 8, false);
                    return true;
                }
            } else if (i != R.id.menuitem_video_call_contact) {
                return false;
            } else {
                if (r7 != null) {
                    this.A25.Bua(A0C(this), this.A2l.getContactManager().A0D(r7), 8, true);
                    return true;
                }
            }
            Log.e("conversation/call-contact/error no-resource");
            return true;
        } else if (r7 != null) {
            this.A2l.getActivityUtils().A08(A0C(this), this.A76.A1W(A0C(this), this.A2l.getContactManager().A0D(r7)), "Conversation:messageContact");
            this.A2l.finish();
            return true;
        } else {
            Log.e("conversation/message-contact/error no-resource");
            return true;
        }
    }

    public void BQn() {
        A0l(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.3fk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v189, resolved type: X.3fk} */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r7v117, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r41v20, types: [X.2H0] */
    /* JADX WARNING: type inference failed for: r34v34, types: [X.2H2] */
    /* JADX WARNING: type inference failed for: r34v35, types: [X.2Gz] */
    /* JADX WARNING: type inference failed for: r43v15, types: [X.2H1] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0621, code lost:
        r34 = new X.AnonymousClass3K0(X.C36441kJ.A00(r11.getResources(), com.whatsapp.R.dimen.f7nameremoved), r11.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved), r37, r38, r39);
        r9 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0640, code lost:
        if (r37 != false) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0642, code lost:
        if (r18 != false) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0644, code lost:
        if (r38 == false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0646, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0647, code lost:
        r5 = (X.C39781tl) X.AnonymousClass4ZD.A00(r8, r5, r34, r9, 6).A00(X.C39781tl.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0654, code lost:
        r1.A55 = r5;
        X.C80073uk.A00(A07(r1), (X.C001700s) ((com.whatsapp.conversation.viewmodel.SurveyViewModel) A08(r1).A00(com.whatsapp.conversation.viewmodel.SurveyViewModel.class)).A00.getValue(), r1, 32);
        r8 = r1.A4Y;
        r7 = X.C36401kF.A0b(r1.A45);
        r6 = X.C36441kJ.A0n(r1.A1W);
        r5 = X.C202159l8.A0E;
        r6 = r8.A0j(r7, r6, "55");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x068f, code lost:
        if (r1.A4R.A01() == false) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0691, code lost:
        if (r6 == false) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0693, code lost:
        r5 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) A08(r1).A00(com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.class);
        r1.A4W = r5;
        X.C66033Uk.A00(A07(r1), (X.C001700s) r5.A05.getValue(), r1, 2);
        ((X.C001700s) r1.A4W.A07.getValue()).A08(A07(r1), new X.C165177t0(r1, 8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x06c9, code lost:
        r8 = r1.A2l.getWaSharedPreferences().A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x06d7, code lost:
        if (r8.isEmpty() != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x06e3, code lost:
        if (A0H(r1).A0E(6084) == false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x06e5, code lost:
        r7 = r1.A2p;
        r6 = r7.A05;
        r5 = new X.C77273qE(r7, r8);
        r6 = r6.A01;
        r6.A06.BPD(r5, r6.A04.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x06f9, code lost:
        r1.A2p.A00(r1.A3Y);
        r9 = r1.A2p;
        r8 = A0C(r1);
        r7 = r1.A45;
        r6 = r9.A05;
        r5 = new X.C89304Wa(r8, r9, r7, 1);
        r6 = r6.A01;
        r6.A06.BPD(r5, r6.A04.A06);
        r5 = r10.A0Z;
        X.C18740tg.A06(java.lang.Boolean.valueOf(r5));
        r1.A6F = r5;
        r5 = r10.A0b;
        X.C18740tg.A06(java.lang.Boolean.valueOf(r5));
        r1.A6H = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0734, code lost:
        if ((r1.A45 instanceof X.C28981Uw) == false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0736, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x074b, code lost:
        if (((X.AnonymousClass3G3) A0G(r1).A0D.get()).A01((X.C28981Uw) r1.A45) != false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x074d, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x074e, code lost:
        r1.A6O = r5;
        r1.A61 = r10.A0D;
        r1.A67 = r10.A0T;
        r1.A2x.A0J = r10.A0S;
        r8 = r1.A3H;
        r8.A02.Bp3(new X.C35691j6(r8, 31));
        r5 = r3.A0E;
        r6 = X.AnonymousClass000.A0u();
        r6.append("conversation/onCreate entryPoint=");
        r11 = r10.A0G;
        X.C36321k7.A1a(r6, r11);
        r6 = r1.A3G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x077e, code lost:
        if (r5 != false) goto L_0x078c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x078a, code lost:
        if (r6.A00.A00.A0E(976) == false) goto L_0x0877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0792, code lost:
        if (r1.A3G.A00() != false) goto L_0x0877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0794, code lost:
        r7 = r1.A3A.A02;
        r19 = com.whatsapp.jid.UserJid.class;
        r6 = (com.whatsapp.jid.UserJid) r1.A3Y.A06(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x07a4, code lost:
        if (r6 == null) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x07ae, code lost:
        if ((r7.A01.A00(r6) instanceof X.C175418aS) == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x07b0, code lost:
        r1.A3F.A01(r1.A45, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x07b9, code lost:
        r6 = X.C222813r.A00(r1.A45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x07bf, code lost:
        if (r6 == null) goto L_0x07d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x07c1, code lost:
        r6 = (X.C175418aS) r1.A3C.A05.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x07cb, code lost:
        if (r6 == null) goto L_0x07d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x07cd, code lost:
        r1.A3C.A07(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x07d2, code lost:
        r1.A65 = r11;
        r1.A64 = r10.A0F;
        r7 = r1.A2j;
        r6 = r1.A45;
        r8 = r1.A3D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x07e4, code lost:
        if (android.text.TextUtils.isEmpty(r8.A05) != false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x07ec, code lost:
        if (android.text.TextUtils.isEmpty(r8.A0A) != false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x07f4, code lost:
        if (r7.A02.A0M(r6) != false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x07fe, code lost:
        if (r7.A03.A0E(2666) == false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0800, code lost:
        r8 = r7.A00.A0D(r6);
        r7.A01.A05(X.C52152oy.CTWA, r6, (java.lang.Runnable) null, r8.A0J(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0819, code lost:
        r6 = r1.A3A;
        r5 = r6.A01;
        r12 = r1.A2z;
        r11 = r6.A00;
        r9 = r5.A00;
        r8 = r9.A00.A5d;
        r36 = X.C36351kA.A0M(r9.A01);
        r5 = r9.A01;
        r44 = X.C36391kE.A0j(r5);
        r37 = X.C36381kD.A0U(r5);
        r6 = r5.A00;
        r1.A3E = new X.AnonymousClass3HK(r8, r36, r37, X.C27111My.A1u(r9.A00), r12, r3, (X.C64553Ol) r6.A24.get(), (X.AnonymousClass31Y) r6.A25.get(), r11, r44, X.C36371kC.A0l(r5), X.C36401kF.A0f(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0877, code lost:
        r7 = r1.A3A.A02;
        r19 = com.whatsapp.jid.UserJid.class;
        r6 = (com.whatsapp.jid.UserJid) r1.A3Y.A06(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0887, code lost:
        if (r6 == null) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0891, code lost:
        if ((r7.A01.A00(r6) instanceof X.C175418aS) == false) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0893, code lost:
        r1.A3F.A01(r1.A45, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x089c, code lost:
        r9 = (com.whatsapp.jid.UserJid) r1.A3Y.A06(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x08a6, code lost:
        if (r9 == null) goto L_0x08e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x08a8, code lost:
        r8 = r1.A3b;
        r7 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x08ac, code lost:
        if (r5 != false) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x08ae, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x08b9, code lost:
        if (r8.A01.A00.A0E(976) == false) goto L_0x08bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x08bb, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x08c2, code lost:
        if (X.C64733Pf.A00(r8, r9, !r5, r7) == false) goto L_0x08e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x08c4, code lost:
        r6 = X.C54172sW.A00(r1.A45, X.C51612o6.A04, java.lang.Boolean.valueOf(r1.A3Y.A0C()));
        r6.A07 = new X.C44052Ky(r10, r1, 0);
        X.C65443Sb.A01(r6, A06(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x08e6, code lost:
        A1E(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x08eb, code lost:
        if (A0H(r1).A0E(508) == false) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x08ef, code lost:
        if (r1.A65 == null) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x08f1, code lost:
        r6 = X.C222813r.A00(r1.A45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x08f7, code lost:
        if (r6 == null) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x08f9, code lost:
        X.C80283v9.A00(A0K(r1), r1, r6, 37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0900, code lost:
        r1.A6M = r1.A3Y.A0H instanceof X.C177618e5;
        r8 = r1.A45;
        r7 = X.C222813r.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x091a, code lost:
        if (X.AnonymousClass3TD.A00(r1.A2l.getContactManager(), r1.A3O, r8) <= 0) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x091c, code lost:
        if (r7 == null) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0924, code lost:
        if (r1.A5D.A01(r7) != false) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0926, code lost:
        A0A(r1).A0R(r7, (java.lang.Boolean) null, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x092e, code lost:
        r1.A6u = true;
        A1I(r1, "inflateViews_start");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0939, code lost:
        if (A1e(r1) == false) goto L_0x0964;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x093b, code lost:
        A1I(r1, "conversationBottomSheet");
        r6 = r1.A2l;
        r5 = com.whatsapp.R.layout.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0945, code lost:
        r6.setContentView(r5);
        A1I(r1, "inflateViews_end");
        r7 = X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.conversation_root_layout);
        r5 = (androidx.appcompat.widget.Toolbar) r7.findViewById(com.whatsapp.R.id.toolbar);
        r1.A0j = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0964, code lost:
        A1I(r1, "conversation");
        r6 = r1.A2l;
        r5 = com.whatsapp.R.layout.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x096f, code lost:
        if (r5 == null) goto L_0x0a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x097b, code lost:
        if (X.AnonymousClass3B6.A00(r1).BLD(r1.A45) == false) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x097d, code lost:
        r6 = X.C36411kG.A0O(r7, com.whatsapp.R.id.search_fragment_and_toolbar_holder);
        r9 = X.AnonymousClass3B6.A00(r1);
        r6.removeView(r1.A0j);
        r8 = A0C(r1);
        r7 = (android.view.ViewGroup) X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.root);
        r6 = new X.AnonymousClass4YA(r9, r1, 2);
        X.AnonymousClass00C.A0D(r8, 0);
        r5 = X.C36341k9.A0J(r7, 1).inflate(com.whatsapp.R.layout.f9nameremoved, r7, false);
        X.AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.whatsapp.bonsai.BonsaiToolbar");
        r5 = (com.whatsapp.bonsai.BonsaiToolbar) r5;
        r7.addView(r5);
        r5.A00 = r8;
        X.AnonymousClass1RC.A05(r8, com.whatsapp.R.color.f6nameremoved);
        r5.addOnLayoutChangeListener(r6);
        r1.A0j = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x09c9, code lost:
        r8 = r1.A0j;
        r8.A0F();
        X.C36421kH.A0y(r1.A0j, r8, r8.getPaddingLeft(), r1.A0j.getPaddingTop(), A04(r1).getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved));
        r1.A0j.setTouchscreenBlocksFocus(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x09ef, code lost:
        if (r1.A6B != false) goto L_0x0a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x09f1, code lost:
        r1.A2l.setSupportActionBar(r1.A0j);
        r2 = r1.A2l.getSupportActionBar();
        X.C18740tg.A06(r2);
        r2.A0U(false);
        r2.A0X(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0a07, code lost:
        A1I(r1, "setupToolbar");
        r1.A0V = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.search_fragment_holder);
        A1I(r1, "searchFragmentHolder");
        r8 = (com.whatsapp.KeyboardPopupLayout) r1.A2l.findViewById(com.whatsapp.R.id.conversation_layout);
        r1.A1V = r8;
        r8.setKeyboardPopupBackgroundColor(X.C36351kA.A02(A0C(r1), A0B(r1), com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r1.A0B = X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.root);
        A1I(r1, "conversationLayoutRoot");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0a56, code lost:
        if (A1e(r1) == false) goto L_0x0a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0a58, code lost:
        r1.A0S = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.coordinator);
        r2 = X.C63733Le.A00(A0C(r1), r1.A3n);
        r1.A0b = r2;
        X.C66963Xz.A00(r2, r1, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0a74, code lost:
        r1.A0R = (android.view.ViewGroup) r1.A2l.findViewById(16908290);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0a87, code lost:
        if (r1.A3z.A08() != false) goto L_0x0a95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0a93, code lost:
        if (X.AnonymousClass3B6.A00(r1).BLD(r1.A45) == false) goto L_0x0ac5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0a95, code lost:
        X.AnonymousClass1RC.A03(A0C(r1));
        r2 = r1.A2l.findViewById(com.whatsapp.R.id.status_bar);
        r1.A0O = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0aa7, code lost:
        if (r2 == null) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0aad, code lost:
        if (X.C19550w8.A01() == false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0ab9, code lost:
        if (X.AnonymousClass3B6.A00(r1).BLD(r1.A45) == false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0abb, code lost:
        X.C011004s.A07(r1.A0R, new X.AnonymousClass4ZQ(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0ac5, code lost:
        r1.A2F.setVisibilityChangeListener(new X.C89744Xs(r1, 2));
        r2 = (android.widget.LinearLayout) r1.A2l.findViewById(com.whatsapp.R.id.conversation_root_layout);
        r1.A0e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0ade, code lost:
        r1.A0O.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0ae5, code lost:
        if (r2 == null) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0aef, code lost:
        if (r1.A3n.A0E(6989) != false) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0af1, code lost:
        A0b((X.AnonymousClass6BK) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0af4, code lost:
        r1.A0C = r1.A2l.findViewById(com.whatsapp.R.id.edit_layout);
        r1.A1d = (com.whatsapp.TextEmojiLabel) r1.A2l.findViewById(com.whatsapp.R.id.read_only_chat_info);
        r1.A6g = (android.widget.ImageView) r1.A2l.findViewById(com.whatsapp.R.id.read_only_chat_info_community_icon);
        r7 = (android.widget.ImageView) r1.A2l.findViewById(com.whatsapp.R.id.read_only_chat_info_community_right_arrow);
        r1.A6f = r7;
        X.C36321k7.A0L(A0B(r1), r7, r1.A36, com.whatsapp.R.drawable.chevron_right);
        r1.A0H = r1.A2l.findViewById(com.whatsapp.R.id.read_only_chat_info_container);
        r1.A5e = (com.whatsapp.wds.components.button.WDSButton) r1.A2l.findViewById(com.whatsapp.R.id.exit_delete_group_button);
        r1.A1c = (com.whatsapp.TextEmojiLabel) r1.A2l.findViewById(com.whatsapp.R.id.composer_blocker_textview);
        r1.A5M = new X.AnonymousClass1RJ(r1.A2l.findViewById(com.whatsapp.R.id.date_divider_header_view_stub));
        r5 = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.banner_container);
        r1.A0Q = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0b7b, code lost:
        if (X.C19550w8.A00() == false) goto L_0x0b83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0b7d, code lost:
        r5.setAccessibilityTraversalBefore(16908298);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0b83, code lost:
        r1.A0X = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.web_page_preview_container);
        r1.A0T = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.quoted_message_preview_container);
        r1.A0U = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.quoted_message_preview_container_v2);
        r1.A0W = (android.view.ViewGroup) r1.A2l.findViewById(com.whatsapp.R.id.voice_note_draft_layout_v2);
        X.C012005e.A02(r1.A1V, com.whatsapp.R.id.congratulations_stub);
        r2 = r1.A2l;
        r2.getLifecycleOwner();
        r18 = (com.whatsapp.settings.chat.wallpaper.WallPaperView) X.C36391kE.A0L(X.C36361kB.A0h(r2.BoP(), com.whatsapp.R.id.conversation_background), 0);
        r18.A00 = new X.C77613qm(r1);
        r2 = (com.whatsapp.conversation.ConversationListView) r1.A2l.getListView();
        r1.A2U = r2;
        r2.setDividerHeight(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0bf3, code lost:
        if (A1a(r1) == false) goto L_0x0c59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0bf5, code lost:
        r11 = X.AnonymousClass3B6.A00(r1);
        A1I(r1, "bonsai_start");
        r8 = r1.A3Y.A0H;
        r2 = (X.AnonymousClass1K4) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0c05, code lost:
        if (r8 == null) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0c07, code lost:
        r2 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0c0d, code lost:
        if (X.C197029b1.A00(r8) == false) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0c15, code lost:
        if (r2.A00.A00() == false) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0c17, code lost:
        r7 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0c1d, code lost:
        if (r7.get(r8) != null) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0c1f, code lost:
        r6 = r2.A04;
        r5 = r6.A09(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0c25, code lost:
        if (r5 == null) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0c27, code lost:
        r2 = r2.A01.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0c2d, code lost:
        if (r2 == null) goto L_0x0c35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0c2f, code lost:
        r6.A0I(r2, r8);
        r7.put(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0c3f, code lost:
        if (X.AnonymousClass3B6.A00(r1).BLD(r1.A45) == false) goto L_0x0c54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0c41, code lost:
        r11.BmA(X.AnonymousClass000.A0U(A0B(r1)), A05(r1), r1.A2U, r1.A3Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0c54, code lost:
        A1I(r1, "bonsai_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0c59, code lost:
        r1.A2U.getViewTreeObserver().addOnPreDrawListener(r1.A7J);
        r5 = r1.A2U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0c68, code lost:
        if (r1.A6R == false) goto L_0x0c6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0c6a, code lost:
        X.C36421kH.A11(r5, r1, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0c6f, code lost:
        r1.A6l = new X.AnonymousClass36T(A0C(r1), X.C36381kD.A0V(r1.A14.A00.A01));
        r2 = A0G(r1).A03;
        r7 = A0C(r1);
        r5 = r2.A00.A01;
        r1.A6m = new X.AnonymousClass383(r7, (X.C71723hE) r5.A00.A2y.get(), X.C18840tu.A00(r5.A2i));
        r8 = r1.A2l.getStartupTracker();
        r7 = r1.A2U;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0cb6, code lost:
        if (A1X(r1) == false) goto L_0x0cb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0cb8, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0cb9, code lost:
        r8.A05(r7, new X.C81103wT(r1, 5), "Conversation", r6);
        r17 = (android.widget.ImageButton) r1.A2l.findViewById(com.whatsapp.R.id.draft_send_v2);
        X.C36321k7.A0L(A0B(r1), r17, r1.A36, com.whatsapp.R.drawable.input_send);
        r7 = new X.AnonymousClass3AC(X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.edit_layout), X.C36341k9.A0T(r1.A15.A00.A01));
        r1.A2R = r7;
        r6 = r7.A04;
        X.AnonymousClass1JZ.A03(r6, 0, java.lang.Math.max(r6.getPaddingLeft(), r6.getPaddingRight()));
        r5 = r7.A02;
        r5.setBackgroundResource(com.whatsapp.R.drawable.ib_new_round);
        r5.setPadding(0, 0, 0, 0);
        r2 = X.C63733Le.A01(A0C(r1), r1.A3n);
        r1.A0c = r2;
        X.C66963Xz.A00(r2, r1, 25);
        r1.A6K = r1.A2l.getSystemServices().A0P("android.hardware.type.featurephone");
        r6 = (com.whatsapp.conversation.ConversationEntryActionButton) X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.conversation_entry_action_button);
        r7 = r1.A2l.getViewModelStoreOwner();
        r5 = r1.A1O;
        r36 = A0E();
        r38 = r1.A3n.A0E(4548);
        r39 = r1.A3n.A0E(4549);
        r2 = r1.A45;
        X.C36351kA.A1J(r7, r5, 1);
        r1.A2u = (X.C39821ts) new X.AnonymousClass04H(new X.C68163bR(r5, r36, r2, r38, r39), r7).A00(X.C39821ts.class);
        r7 = r1.A2l.getViewModelStoreOwner();
        r5 = r1.A1P;
        r2 = A0E();
        X.C36351kA.A1J(r7, r5, 1);
        r1.A2y = (X.C39941uJ) X.AnonymousClass4ZG.A00(r7, r2, r5, 9).A00(X.C39941uJ.class);
        r1.A0m = new X.C39501sW();
        r7 = X.AnonymousClass0VV.A01(X.AnonymousClass0VV.A00(X.C67543a5.A00, r1.A2u.A04));
        r5 = X.C36441kJ.A0Y();
        r5.A0F(r7, new X.AnonymousClass3UZ(r5));
        X.C66033Uk.A00(A07(r1), r5, r1, 3);
        X.C66033Uk.A00(A07(r1), r7, r1, 4);
        r8 = r1.A36;
        r0 = r1.A2l;
        X.AnonymousClass97U.A00(r0.getLifecycleOwner(), r1.A2u, r1.A2y, r8, X.C36361kB.A0h(r0.BoP(), com.whatsapp.R.id.push_to_record_media_tooltip));
        r1.A5P = new X.AnonymousClass1RJ(r1.A2l.findViewById(com.whatsapp.R.id.quick_action_bar));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0dfd, code lost:
        if (A1a(r1) != false) goto L_0x0e05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0dff, code lost:
        r1.A2u.A0U(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0e05, code lost:
        r0 = r1.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0e0c, code lost:
        if (r0.A05() == false) goto L_0x0e1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0e0e, code lost:
        r0.A02();
        r1.A2l.getActivityNullable();
        r0 = X.AnonymousClass001.A0A("create");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0e1d, code lost:
        r0 = (X.AnonymousClass3K4) r1.A2u.A00.A04();
        r5 = r1.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0e2d, code lost:
        if (r5.A05() == false) goto L_0x0e45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0e2f, code lost:
        if (r0 == null) goto L_0x0e36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0e34, code lost:
        if (r0.A01 == 1) goto L_0x0e45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0e36, code lost:
        r5.A02();
        r1.A2l.getViewModelStoreOwner();
        r0 = X.AnonymousClass001.A0A("createSmbViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0e4f, code lost:
        if (A0F(r1).A00.A05() == false) goto L_0x0e70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0e59, code lost:
        if (r1.A3n.A0E(7466) == false) goto L_0x0e70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0e5b, code lost:
        A0F(r1).A00.A02();
        r1.A2l.getActivityNullable();
        r0 = X.AnonymousClass001.A0A("createSuggestedReplyViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0e70, code lost:
        r6.A02(A0C(r1), new X.C90314Zx(r1, 0), r1.A2u);
        r5 = X.C36341k9.A00(A0C(r1));
        r2 = r1.A3n;
        X.AnonymousClass00C.A0D(r2, 1);
        r0 = r2.A07(5363);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0e93, code lost:
        if (r0 >= 0) goto L_0x0e97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0e95, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0e97, code lost:
        r0 = java.lang.Integer.valueOf(X.C14960mT.A01(((float) r0) * r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0ea1, code lost:
        r1.A60 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0eab, code lost:
        if (r1.A3n.A0E(4416) != false) goto L_0x0ec3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0ead, code lost:
        X.C66033Uk.A00(A07(r1), X.AnonymousClass0VV.A01(X.AnonymousClass0VV.A00(X.C67553a6.A00, r1.A2u.A04)), r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0ec3, code lost:
        r0 = (android.widget.ImageButton) X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.camera_btn);
        r1.A0a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0ed4, code lost:
        if (X.C222013h.A07 == false) goto L_0x0ed9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0ed6, code lost:
        r0.setPadding(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0ed9, code lost:
        r6 = X.AnonymousClass3MW.A00(r1.A45);
        X.C67143Yr.A00(r1.A0a, r1, r6, 10);
        r5 = A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0ef2, code lost:
        if (r1.A3n.A0E(6256) != false) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0ef6, code lost:
        if (r5.A04 == false) goto L_0x1050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0ef8, code lost:
        r1.A0a.setOnLongClickListener(new X.AnonymousClass3Z6(r5, r1, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0f02, code lost:
        A1B(r1, 8);
        r5 = new X.AnonymousClass31K(r1);
        r34 = r1.A3n;
        r25 = r1.A1W;
        r64 = A0K(r1);
        r24 = r1.A0u;
        r23 = r1.A3O;
        r22 = r1.A54;
        r15 = r1.A3o;
        r48 = A0C(r1);
        r14 = r1.A1z;
        r13 = r1.A3X;
        r11 = r1.A2J;
        r56 = r1.A2l.getWaSharedPreferences();
        r9 = r1.A2B;
        r7 = r1.A3a;
        r0 = r1.A2l;
        r58 = r0.getGroupParticipantsManager();
        r47 = new X.C65053Qn(r48, r24, r0.getActivityNullable(), r25, r14, r1.A20, r9, r11, r56, r23, r58, r13, r7, r34, r15, r22, r64, r1.A5g, new X.C81103wT((java.lang.Object) r5, 28), new X.C81103wT((java.lang.Object) r5, 29));
        r0 = r1.A1G;
        r37 = A0C(r1);
        r40 = A0C(r1);
        r11 = r1.A45;
        r9 = r1.A2U;
        r4 = r0.A00;
        r0 = r4.A01;
        r50 = X.C36341k9.A0V(r0);
        r41 = X.C36351kA.A0N(r0);
        r48 = X.C36351kA.A0a(r0);
        r51 = r0.AzV();
        r45 = X.C36341k9.A0R(r0);
        r57 = X.C36351kA.A0q(r0);
        r42 = X.C36381kD.A0V(r0);
        r52 = X.C36361kB.A0a(r0);
        r55 = X.C36351kA.A0n(r0);
        r53 = X.C36361kB.A0b(r0);
        r38 = X.C19460v5.A01((X.AnonymousClass1K3) r0.A0x.get());
        r44 = X.C18800tq.A48(r0);
        r0 = r4.A00;
        r1.A2n = new X.C65593Sr((android.view.ViewStub) r1.A2l.findViewById(com.whatsapp.R.id.block_add_footer_floating_view_stub), r9, r37, r38, (X.C57452yG) r0.A1J.get(), r40, r41, r42, (X.C33201et) r0.A2K.get(), r44, r45, r5, r47, r48, (X.C25071Ew) r0.A8t.get(), r50, r51, r52, r53, r11, r55, (X.AnonymousClass1C6) r0.A7s.get(), r57);
        r40 = new X.C54192sY();
        r5 = r1.A1T;
        r35 = A0C(r1);
        r38 = A0C(r1);
        r2 = r5.A00(r35, r1.A2l.B4o(), new X.C89954Yn(r1, 2), r38, r1.A7S, r40, r1.A45);
        r1.A6n = r2;
        r0 = r1.A7B;
        r106 = r0;
        r0.add(r2);
        r15 = r10.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x1045, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x1077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x104d, code lost:
        if (android.text.TextUtils.isEmpty(r3.A0B) != false) goto L_0x1077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x1050, code lost:
        r5 = new X.C70333ez(r1);
        r1.A0a.setOnTouchListener(new X.AnonymousClass2L0((android.view.View.OnTouchListener) new X.C53782rs(r5, r1, 5), r1, (java.lang.Runnable) new X.C81283wl((java.lang.Object) r1, r6, 24), (java.lang.Runnable) X.C80233v4.A00(r5, 43)));
        r1.A0a.setOnClickListener((android.view.View.OnClickListener) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x1077, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x1084, code lost:
        if (A7c.get(X.C36411kG.A0h(r1.A3Y)) == null) goto L_0x1087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x1086, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x1087, code lost:
        r2 = r1.A3A.A02;
        r0 = X.C222813r.A00(r1.A45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x1091, code lost:
        if (r0 == null) goto L_0x1099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x1093, code lost:
        X.AnonymousClass1YG.A00(r2, r0).A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x1099, code lost:
        A1I(r1, "on_create_conversation_start");
        r2 = new X.C224214g("conversation/createconversation");
        A0R();
        r35 = A0C(r1);
        r13 = r1.A45;
        r0 = r1.A2l;
        r38 = r0.getConversationRowInflater();
        r41 = r0.getTime();
        r11 = r1.A1W;
        r9 = r1.A4j;
        r48 = r1.A2l.getFMessageDatabase();
        r8 = r1.A4C;
        r7 = A0F(r1).A03;
        r34 = new X.C38051nd(r35, r11, r1.A2Y, r38, r1.A2l, r7, r41, r1.A35, r1.A3n, r13, r8, (X.AnonymousClass3G3) A0G(r1).A0D.get(), r9, r48);
        r34.registerDataSetObserver(r1.A6w);
        r4 = (com.whatsapp.mentions.MentionableEntry) r1.A2l.findViewById(com.whatsapp.R.id.entry);
        r1.A4B = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x110f, code lost:
        if (r4 == null) goto L_0x11d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x1111, code lost:
        r4.A0D = new X.AnonymousClass4XH(new X.C64483Od(), r1, 0);
        A23(com.whatsapp.R.drawable.ib_new_round);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x112b, code lost:
        if (r1.A4B.A0I(r1.A45) == false) goto L_0x1159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x112d, code lost:
        r4 = (android.widget.FrameLayout) X.C03570Gk.A0B(A0B(r1), com.whatsapp.R.id.mention_attach);
        r1.A0Y = r4;
        r2 = r1.A4B;
        r2.A0A = new X.AnonymousClass4Y0(r1, 1);
        r2.A0G(r4, r1.A45, false, false, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x1159, code lost:
        A21();
        r1.A4B.setFilters(new android.text.InputFilter[]{new X.C66773Xg(r1.A5Z)});
        r1.A4B.A03 = r1.A2l.findViewById(com.whatsapp.R.id.input_layout);
        r1.A0Z = (android.widget.FrameLayout) r1.A2l.findViewById(com.whatsapp.R.id.quick_reply_attach);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x118d, code lost:
        if (r1.A0s.A05() == false) goto L_0x119f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x1195, code lost:
        if (X.C55942vR.A00(r1.A3n) == false) goto L_0x11f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x119d, code lost:
        if (r1.A3Y.A0E() == false) goto L_0x11f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x119f, code lost:
        r1.A0Z.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x11a8, code lost:
        if (r1.A55 == null) goto L_0x11d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x11aa, code lost:
        new X.C69533dg(X.C36421kH.A0E(A0B(r1), com.whatsapp.R.id.mention_attach), A07(r1), r1.A2a, r1.A2h, r1.A4B, r1.A55).A00 = new X.C69543dh(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x11d7, code lost:
        r4 = r1.A3n;
        r25 = X.C21000yV.A01;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x11e4, code lost:
        if (X.C20800yB.A01(r25, r4, 4093) == false) goto L_0x1221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x11e6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x11f1, code lost:
        if (X.C20800yB.A01(r25, r1.A3n, 6004) != false) goto L_0x1222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x11fc, code lost:
        if (r1.A3n.A0E(5811) == false) goto L_0x1207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x1204, code lost:
        if (X.C197029b1.A00(r1.A45) == false) goto L_0x1207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x120d, code lost:
        if (r1.A3Y.A0C() == false) goto L_0x121d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x120f, code lost:
        r2 = X.C80233v4.A00(r1, 47);
        r1.A63 = r2;
        r1.A5S.Boy(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x121d, code lost:
        A0h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x1221, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x1222, code lost:
        r1.A6J = r0;
        r2 = r1.A45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x1228, code lost:
        if ((r2 instanceof X.C28981Uw) == false) goto L_0x1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x122a, code lost:
        A1U((X.C28981Uw) r2, r1.A6O);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x1231, code lost:
        r1.A2U.setAdapter(r34);
        r0 = r10.A0Y;
        r2 = r1.A4I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x123c, code lost:
        if (r0 == false) goto L_0x12ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x123e, code lost:
        r2.A0B(r1.A45);
        r1.A6T = true;
        r1.A2a.A0B(r1.A45, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x1259, code lost:
        if (r1.A2l.getIntent().getBooleanExtra("fromNotification", false) == false) goto L_0x1287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x1267, code lost:
        if (r1.A2l.getIntent().getBooleanExtra("last_notification_keep_in_chat", false) == false) goto L_0x1287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x1269, code lost:
        r0 = r1.A3h;
        r4 = A0B(r1).getSupportFragmentManager();
        r2 = r1.A45;
        X.AnonymousClass00C.A0D(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x127f, code lost:
        if (X.AnonymousClass3OP.A00(r4, r0.A00) == false) goto L_0x1287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x1281, code lost:
        X.C36371kC.A1C(r2, r4, 1);
        com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A0N = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x1287, code lost:
        X.C36331k8.A0w(X.C19420v0.A00(r1.A35), "newsletter_message_received", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x1294, code lost:
        if (r10.A0X == false) goto L_0x12bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x1296, code lost:
        r1.A4J.A02();
        r5 = r10.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x129d, code lost:
        if (r5 == null) goto L_0x12b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x129f, code lost:
        r1.A26.A00(new X.C132636Up("show_vc_lobby", (java.lang.Object) r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x12ac, code lost:
        r2.A0H(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x12b1, code lost:
        if (r16 == null) goto L_0x12bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x12b3, code lost:
        r1.A2a.A0B(r16, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x12bb, code lost:
        r1.A6Z = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x12c5, code lost:
        if (r1.A0A.getStringExtra("ig_post_url") == null) goto L_0x12cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x12c7, code lost:
        A1N(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x12cb, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x12cf, code lost:
        if (r10.A0a == false) goto L_0x147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x12d3, code lost:
        if (r1.A66 != false) goto L_0x147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x12d7, code lost:
        if (r10.A0U == false) goto L_0x147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x12d9, code lost:
        r1.A2W.A00.remove(r1.A45);
        r1.A2U.A0O = true;
        r6 = r10.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x12e9, code lost:
        if (r6 == null) goto L_0x131d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r7 = r1.A1Z;
        r34 = r7;
        r34.A03(A0C(r1), A0C(r1), new X.C68813cV(r1), (X.AnonymousClass3XT) null, r10.A0H, java.util.Collections.singletonList(r1.A45), r6, r10.A00, 38, false, r10.A0W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        r2 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x1320, code lost:
        if (r2 != 4) goto L_0x1374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x1322, code lost:
        r0 = r1.A2l;
        r2 = new X.C65033Ql(r0.getContactManager(), r1.A31, r0.getWAContext(), r1.A36);
        r4 = r1.A0y;
        r5 = r10.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        r7 = new X.C64643Ow(r4, r2.A03);
        r2.A05(r5);
        r6 = r2.A04;
        r0 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x1347, code lost:
        if (r0 == null) goto L_0x1461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x1349, code lost:
        r4 = r2.A00;
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x1353, code lost:
        if (r9.hasNext() == false) goto L_0x136e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x1355, code lost:
        r2 = (X.C607439e) r9.next();
        r0 = r4.A0F(r2.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x1361, code lost:
        if (r0 == null) goto L_0x134f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x1363, code lost:
        r2.A01 = (com.whatsapp.jid.UserJid) r0.A06(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x136e, code lost:
        r5 = r7.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x1376, code lost:
        if (r2 != 14) goto L_0x138d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        A0A(r1).A0Z((X.AnonymousClass3T1) null, java.util.Collections.singletonList(r1.A45), r10.A0R, r1.A6F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x1391, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x140a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x1393, code lost:
        r6 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x1399, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x140a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x139b, code lost:
        X.AnonymousClass1YG.A01(r1.A3A.A02, X.C222813r.A00(r1.A45), 1);
        r4 = r3.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x13af, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x13fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x13b1, code lost:
        r2 = r1.A3E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x13b5, code lost:
        if (r2.A0U == false) goto L_0x13c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x13b9, code lost:
        if (r3.A0H == false) goto L_0x13c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x13be, code lost:
        if (r2.A0H == 2) goto L_0x13cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x13c0, code lost:
        X.C56772wr.A02.put(X.C36411kG.A0h(r1.A3Y), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x13cb, code lost:
        r5 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x13cd, code lost:
        if (r5 != null) goto L_0x13d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x13cf, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x13d1, code lost:
        if (r0 == null) goto L_0x13f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x13d3, code lost:
        r5 = r0.user;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x13d5, code lost:
        A7c.put(X.C36411kG.A0h(r1.A3Y), new X.AnonymousClass398(r5, r15, r6, r3.A0H, r3.A0I));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x13f7, code lost:
        r5 = r1.A45.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x13fe, code lost:
        X.C56772wr.A02.remove(X.C36411kG.A0h(r1.A3Y));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x140a, code lost:
        r4 = r10.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x140c, code lost:
        if (r4 == null) goto L_0x147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x1412, code lost:
        if (r4.length() <= 0) goto L_0x147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x1416, code lost:
        if (r10.A0V == false) goto L_0x1424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x1418, code lost:
        X.C56772wr.A02.put(X.C36411kG.A0h(r1.A3Y), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x1424, code lost:
        A0A(r1).A0I(X.C64033Mj.A00(r1.A2l.getLinkifyWeb().A03(r4)), (X.AnonymousClass3XT) null, (X.AnonymousClass3T1) null, r4, java.util.Collections.singletonList(X.C36411kG.A0h(r1.A3Y)), (java.util.List) null, r1.A6F, r1.A6H);
        r1.A6H = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x1456, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x1457, code lost:
        com.whatsapp.util.Log.e("addWaIdsToVCard", new X.C108695Un(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x1506, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x2a36, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x2a37, code lost:
        A1I(r1, "on_create_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x2a3c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x05de, code lost:
        if (r13.A0E() == false) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x05f4, code lost:
        if (r9.A02.BLB(r12) == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x05f8, code lost:
        if (r14 != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x05fa, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0605, code lost:
        if (((X.AnonymousClass1K4) r9.A02).A01.A01(r12) != false) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0607, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0608, code lost:
        r38 = r13.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x060c, code lost:
        if (r18 == false) goto L_0x0616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x060e, code lost:
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0614, code lost:
        if (X.C197029b1.A00(r12) != false) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0616, code lost:
        r39 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0618, code lost:
        if (r37 != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x061a, code lost:
        if (r18 != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x061c, code lost:
        if (r14 != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x061e, code lost:
        if (r38 != false) goto L_0x0621;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:683:0x296c A[Catch:{ 1YJ -> 0x1456 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A29(android.os.Bundle r108) {
        /*
            r107 = this;
            java.lang.String r32 = "messages_to_forward_bundle"
            java.lang.String r31 = "sms_invite_intent"
            java.lang.String r30 = "error_message"
            java.lang.String r33 = "on_create_end"
            r1 = r107
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.11e r0 = r0.getStartupTracker()     // Catch:{ all -> 0x2a34 }
            java.lang.String r17 = "Conversation"
            if (r0 == 0) goto L_0x001f
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.11e r2 = r0.getStartupTracker()     // Catch:{ all -> 0x2a34 }
            r0 = r17
            r2.A0A(r0)     // Catch:{ all -> 0x2a34 }
        L_0x001f:
            X.1JL r2 = r1.A3z     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r2.A04(r0)     // Catch:{ all -> 0x2a34 }
            X.1JL r0 = r1.A3z     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x2a34 }
            r1.A6A = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.Intent r21 = r0.getIntent()     // Catch:{ all -> 0x2a34 }
            r20 = r108
            if (r21 == 0) goto L_0x0077
            X.1JL r0 = r1.A3z     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x0077
            X.1JL r3 = r1.A3z     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = r21
            android.content.Intent r4 = r3.A01(r2, r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x0077
            android.view.Window r2 = A05(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 0
            X.C36371kC.A1G(r2, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r3 = "key_perf_tracked"
            r2 = 1
            r0 = r21
            r0.putExtra(r3, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = r20
            r2.BiW(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.startActivity(r4)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x0077:
            java.lang.String r2 = "conversation/create"
            X.14g r29 = new X.14g     // Catch:{ all -> 0x2a34 }
            r0 = r29
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x2a34 }
            X.1JL r0 = r1.A3z     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x00a7
            android.view.Window r2 = A05(r1)     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.AnonymousClass3U9.A00     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x00a7
            X.155 r0 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0D     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x00a7
            r0 = 13
            r2.requestFeature(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 12
            r2.requestFeature(r0)     // Catch:{ all -> 0x2a34 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)     // Catch:{ all -> 0x2a34 }
        L_0x00a7:
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = r20
            r2.BiW(r0)     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 6128(0x17f0, float:8.587E-42)
            r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "on_create_start"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.3Br r2 = r1.A16     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.174 r0 = r0.getInteractionPerfTracker()     // Catch:{ all -> 0x2a34 }
            X.3Et r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            r1.A2p = r0     // Catch:{ all -> 0x2a34 }
            X.0wU r4 = A0K(r1)     // Catch:{ all -> 0x2a34 }
            X.1MP r3 = r1.A32     // Catch:{ all -> 0x2a34 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x2a34 }
            r2 = 30
            X.3wT r0 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r0.<init>((java.lang.Object) r3, (int) r2)     // Catch:{ all -> 0x2a34 }
            r4.Boy(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "viewModels"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.04H r2 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.tosgating.viewmodel.ToSGatingViewModel> r0 = com.whatsapp.tosgating.viewmodel.ToSGatingViewModel.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = (com.whatsapp.tosgating.viewmodel.ToSGatingViewModel) r0     // Catch:{ all -> 0x2a34 }
            r1.A58 = r0     // Catch:{ all -> 0x2a34 }
            X.04H r2 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.countrygating.viewmodel.CountryGatingViewModel> r0 = com.whatsapp.countrygating.viewmodel.CountryGatingViewModel.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = (com.whatsapp.countrygating.viewmodel.CountryGatingViewModel) r0     // Catch:{ all -> 0x2a34 }
            r1.A37 = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r5 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2xf r4 = r1.A12     // Catch:{ all -> 0x2a34 }
            android.os.Handler r3 = r1.A6y     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2
            X.04H r2 = X.AnonymousClass4ZD.A00(r5, r3, r4, r2, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1sS> r0 = X.C39471sS.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = (X.C39471sS) r0     // Catch:{ all -> 0x2a34 }
            r1.A2z = r0     // Catch:{ all -> 0x2a34 }
            X.04H r2 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.7yC> r28 = X.C167527yC.class
            r0 = r28
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.7yC r0 = (X.C167527yC) r0     // Catch:{ all -> 0x2a34 }
            r1.A4V = r0     // Catch:{ all -> 0x2a34 }
            X.01z r5 = A06(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.String r4 = "NewCommunityAdminBottomSheetFragment"
            X.012 r3 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r2 = 4
            X.3RF r0 = new X.3RF     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2a34 }
            r5.A0l(r0, r3, r4)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.00r r3 = r0.A0C     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 20
            X.C80073uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.00s r2 = r0.A0F     // Catch:{ all -> 0x2a34 }
            X.012 r0 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r15 = 37
            X.C80073uk.A00(r0, r2, r1, r15)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.00s r3 = r0.A0E     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 19
            X.C80073uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.00s r0 = r0.A0G     // Catch:{ all -> 0x2a34 }
            X.08S r3 = X.AnonymousClass0VV.A01(r0)     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 36
            X.C80073uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1AP r5 = r1.A4t     // Catch:{ all -> 0x2a34 }
            X.0wU r7 = A0K(r1)     // Catch:{ all -> 0x2a34 }
            X.005 r8 = r1.A5w     // Catch:{ all -> 0x2a34 }
            X.1BB r4 = r1.A4s     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r3 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            X.3GT r6 = r1.A4v     // Catch:{ all -> 0x2a34 }
            X.6Xz r2 = new X.6Xz     // Catch:{ all -> 0x2a34 }
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2a34 }
            r1.A51 = r2     // Catch:{ all -> 0x2a34 }
            X.3rU r0 = new X.3rU     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2)     // Catch:{ all -> 0x2a34 }
            r1.A4c = r0     // Catch:{ all -> 0x2a34 }
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1V(r20)
            r1.A66 = r0     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 1154(0x482, float:1.617E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            r1.A6R = r0     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 1395(0x573, float:1.955E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            r1.A6P = r0     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A66     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x01bc
            X.166 r0 = X.C148826zU.A13     // Catch:{ all -> 0x2a34 }
            r0.clear()     // Catch:{ all -> 0x2a34 }
        L_0x01bc:
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r1.A4E     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x2a34 }
            r5 = 3
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "conversation/aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "on_create_whatsapp_lib_failure"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.BPG(r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x01db:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0wQ r0 = r0.getMeManager()     // Catch:{ all -> 0x2a34 }
            r0.A0G()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2a08
            X.12P r0 = r1.A3V     // Catch:{ all -> 0x2a34 }
            r0.A06()     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A08     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2a08
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.12U r0 = r0.getRegistrationStateManager()     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2a08
            X.3Es r3 = r1.A2T     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A66     // Catch:{ all -> 0x2a34 }
            r6 = r21
            r0 = r20
            X.3BR r10 = r3.A00(r6, r0, r2)     // Catch:{ all -> 0x2a34 }
            X.3PE r3 = r10.A06     // Catch:{ all -> 0x2a34 }
            r1.A3D = r3     // Catch:{ all -> 0x2a34 }
            int r2 = r10.A02     // Catch:{ all -> 0x2a34 }
            if (r2 == r4) goto L_0x29f8
            r0 = 2
            if (r2 == r0) goto L_0x29de
            if (r2 == r5) goto L_0x2998
            X.C18740tg.A06(r21)     // Catch:{ all -> 0x2a34 }
            r1.A0A = r6     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r10.A08     // Catch:{ all -> 0x2a34 }
            r16 = r0
            X.C18740tg.A06(r16)     // Catch:{ all -> 0x2a34 }
            r1.A45 = r0     // Catch:{ all -> 0x2a34 }
            X.1ER r2 = r1.A3N     // Catch:{ all -> 0x2a34 }
            X.3PE r0 = X.AnonymousClass3PE.A0L     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r5 = r16
            r2.A01(r5, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "chatlockEntryPoint"
            r0 = 8
            int r9 = r6.getIntExtra(r2, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "mat_entry_point"
            int r0 = X.C36431kI.A02(r6, r0)     // Catch:{ all -> 0x2a34 }
            r1.A01 = r0     // Catch:{ all -> 0x2a34 }
            X.005 r0 = r1.A5n     // Catch:{ all -> 0x2a34 }
            X.18z r8 = X.C36411kG.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            X.01z r2 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "com.whatsapp.HomeActivity.ConversationFragment"
            X.02E r7 = r2.A0N(r0)     // Catch:{ all -> 0x2a34 }
            if (r7 != 0) goto L_0x025f
            X.155 r7 = A0C(r1)     // Catch:{ all -> 0x2a34 }
        L_0x025f:
            X.155 r6 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ all -> 0x2a34 }
            r2 = 1
            X.AnonymousClass00C.A0D(r6, r4)     // Catch:{ all -> 0x2a34 }
            X.04a r5 = new X.04a     // Catch:{ all -> 0x2a34 }
            r5.<init>()     // Catch:{ all -> 0x2a34 }
            X.3Zv r4 = new X.3Zv     // Catch:{ all -> 0x2a34 }
            r4.<init>(r6, r8, r9)     // Catch:{ all -> 0x2a34 }
            X.04e r4 = r7.BnD(r4, r5)     // Catch:{ all -> 0x2a34 }
            r1.A0h = r4     // Catch:{ all -> 0x2a34 }
            X.141 r4 = r10.A07     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x2a34 }
            r1.A3Y = r4     // Catch:{ all -> 0x2a34 }
            boolean r4 = r4.A0G()     // Catch:{ all -> 0x2a34 }
            r1.A6L = r4     // Catch:{ all -> 0x2a34 }
            X.1A4 r6 = r1.A3S     // Catch:{ all -> 0x2a34 }
            if (r108 == 0) goto L_0x0298
            r4 = -1
            java.lang.String r7 = "ephemeral_session_start"
            r8 = r20
            long r4 = r8.getLong(r7, r4)     // Catch:{ all -> 0x2a34 }
            r6.A00 = r4     // Catch:{ all -> 0x2a34 }
        L_0x0298:
            X.1A4 r6 = r1.A3S     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.155 r4 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.String r4 = r4.getLocalClassName()     // Catch:{ all -> 0x2a34 }
            r6.A00(r5, r4)     // Catch:{ all -> 0x2a34 }
            X.04H r5 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.conversation.conversationrow.MessageSelectionViewModel> r4 = com.whatsapp.conversation.conversationrow.MessageSelectionViewModel.class
            X.04R r4 = r5.A00(r4)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r4 = (com.whatsapp.conversation.conversationrow.MessageSelectionViewModel) r4     // Catch:{ all -> 0x2a34 }
            r1.A2e = r4     // Catch:{ all -> 0x2a34 }
            X.00s r5 = r4.A01     // Catch:{ all -> 0x2a34 }
            X.012 r4 = A07(r1)     // Catch:{ all -> 0x2a34 }
            X.C66033Uk.A00(r4, r5, r1, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r4 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r12 = r4.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2yB r11 = r1.A1C     // Catch:{ all -> 0x2a34 }
            X.4V6 r4 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.017 r36 = r4.getSavedStateRegistryOwner()     // Catch:{ all -> 0x2a34 }
            X.4Ut r9 = r1.A5U     // Catch:{ all -> 0x2a34 }
            X.11F r8 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.141 r7 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.155 r4 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            android.content.Intent r35 = r4.getIntent()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r6 = r1.A2e     // Catch:{ all -> 0x2a34 }
            r5 = 0
            X.1sG r4 = new X.1sG     // Catch:{ all -> 0x2a34 }
            r34 = r4
            r37 = r11
            r38 = r6
            r39 = r7
            r40 = r8
            r41 = r9
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x2a34 }
            X.04H r6 = new X.04H     // Catch:{ all -> 0x2a34 }
            r6.<init>(r4, r12)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1uh> r4 = X.C40061uh.class
            X.04R r8 = r6.A00(r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r8 = (X.C40061uh) r8     // Catch:{ all -> 0x2a34 }
            r1.A2x = r8     // Catch:{ all -> 0x2a34 }
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ all -> 0x2a34 }
            r6.<init>()     // Catch:{ all -> 0x2a34 }
            X.155 r4 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            X.C36321k7.A0K(r4, r6)     // Catch:{ all -> 0x2a34 }
            int r4 = r6.y     // Catch:{ all -> 0x2a34 }
            int r7 = r4 * 2
            X.155 r4 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r6 = r4.getResources()     // Catch:{ all -> 0x2a34 }
            r4 = 2131166100(0x7f070394, float:1.7946436E38)
            int r4 = r6.getDimensionPixelSize(r4)     // Catch:{ all -> 0x2a34 }
            int r7 = r7 / r4
            r8.A00 = r7     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            r4 = 8
            r6.A03 = r4     // Catch:{ all -> 0x2a34 }
            X.00s r7 = r6.A0V     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 26
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r7 = r4.A0U     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 25
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A15     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 30
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A14     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 29
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r7 = r4.A0W     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 27
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A17     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 42
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A18     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r26 = 31
            r4 = 31
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A0z     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 23
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r4 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r4.A10     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 24
            X.C80073uk.A00(r6, r7, r1, r4)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r8 = r6.A0Y     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 39
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r8 = r6.A0R     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 38
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r6.A0y     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 21
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r6.A11     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 28
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r6.A12     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 11
            X.C66033Uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r6.A13     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 12
            X.C66033Uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r8 = r6.A0X     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 18
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r6.A16     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 49
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.147> r27 = X.AnonymousClass147.class
            r7 = r27
            com.whatsapp.jid.Jid r7 = r6.A06(r7)     // Catch:{ all -> 0x2a34 }
            X.147 r7 = (X.AnonymousClass147) r7     // Catch:{ all -> 0x2a34 }
            if (r7 == 0) goto L_0x046c
            X.12q r6 = r1.A3O     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6.A0O(r7)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x046c
            X.1LV r6 = r1.A2B     // Catch:{ all -> 0x2a34 }
            X.147 r11 = r6.A02(r7)     // Catch:{ all -> 0x2a34 }
            if (r11 == 0) goto L_0x046c
            X.4V6 r6 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r8 = r6.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2xT r7 = r1.A11     // Catch:{ all -> 0x2a34 }
            r6 = 2
            X.04H r7 = X.AnonymousClass4ZG.A00(r8, r11, r7, r6)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1uO> r6 = X.C39971uO.class
            X.04R r9 = r7.A00(r6)     // Catch:{ all -> 0x2a34 }
            X.1uO r9 = (X.C39971uO) r9     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r9.A03     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            X.C66033Uk.A00(r6, r7, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4ZT r8 = new X.4ZT     // Catch:{ all -> 0x2a34 }
            r8.<init>(r11, r2)     // Catch:{ all -> 0x2a34 }
            X.1LV r7 = r1.A2B     // Catch:{ all -> 0x2a34 }
            X.3UQ r6 = new X.3UQ     // Catch:{ all -> 0x2a34 }
            r39 = 1
            r34 = r6
            r36 = r7
            r37 = r9
            r38 = r8
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
            X.08S r8 = r9.A00     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r8.A08(r7, r6)     // Catch:{ all -> 0x2a34 }
            X.1Rs r8 = r9.A02     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 15
            X.AnonymousClass3UW.A00(r7, r8, r11, r1, r6)     // Catch:{ all -> 0x2a34 }
        L_0x046c:
            X.04H r7 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r6 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.04R r6 = r7.A00(r6)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.community.ConversationCommunityViewModel r6 = (com.whatsapp.community.ConversationCommunityViewModel) r6     // Catch:{ all -> 0x2a34 }
            r1.A2C = r6     // Catch:{ all -> 0x2a34 }
            X.00s r8 = r6.A03     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 35
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.community.ConversationCommunityViewModel r6 = r1.A2C     // Catch:{ all -> 0x2a34 }
            X.00s r8 = r6.A02     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 34
            X.C80073uk.A00(r7, r8, r1, r6)     // Catch:{ all -> 0x2a34 }
            boolean r6 = A1Z(r1)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x04ae
            com.whatsapp.community.ConversationCommunityViewModel r7 = r1.A2C     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x2a34 }
            android.util.Pair r5 = android.util.Pair.create(r6, r5)     // Catch:{ all -> 0x2a34 }
            r7.A00 = r5     // Catch:{ all -> 0x2a34 }
            X.0wU r8 = r7.A07     // Catch:{ all -> 0x2a34 }
            r5 = 14
            X.C80263v7.A00(r8, r7, r6, r5)     // Catch:{ all -> 0x2a34 }
        L_0x04ae:
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r8 = r5.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2yC r7 = r1.A1D     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r1.A45     // Catch:{ all -> 0x2a34 }
            r5 = 8
            X.04H r6 = X.AnonymousClass4ZG.A00(r8, r6, r7, r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1tS> r5 = X.C39741tS.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            X.1tS r5 = (X.C39741tS) r5     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r5.A01     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 33
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r13 = r5.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2y9 r12 = r1.A1B     // Catch:{ all -> 0x2a34 }
            X.11F r11 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.1sS r9 = r1.A2z     // Catch:{ all -> 0x2a34 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r8 = r1.A37     // Catch:{ all -> 0x2a34 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r7 = r1.A58     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.3bS r5 = new X.3bS     // Catch:{ all -> 0x2a34 }
            r34 = r5
            r35 = r12
            r36 = r9
            r37 = r8
            r38 = r6
            r39 = r11
            r40 = r7
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2a34 }
            X.04H r6 = new X.04H     // Catch:{ all -> 0x2a34 }
            r6.<init>(r5, r13)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1uL> r5 = X.C39951uL.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            X.1uL r5 = (X.C39951uL) r5     // Catch:{ all -> 0x2a34 }
            r1.A2t = r5     // Catch:{ all -> 0x2a34 }
            boolean r5 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0510
            X.005 r5 = r1.A5i     // Catch:{ all -> 0x2a34 }
            r5.get()     // Catch:{ all -> 0x2a34 }
        L_0x0510:
            X.1uL r5 = r1.A2t     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r5.A0H     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 46
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.1uL r5 = r1.A2t     // Catch:{ all -> 0x2a34 }
            X.00s r7 = r5.A03     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 22
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.1uL r5 = r1.A2t     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r5.A0I     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 47
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.1uL r5 = r1.A2t     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r5.A0G     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 48
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r8 = r5.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2xS r7 = r1.A10     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r5 = 7
            X.04H r6 = X.AnonymousClass4ZG.A00(r8, r7, r6, r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1u5> r5 = X.C39881u5.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            X.1u5 r5 = (X.C39881u5) r5     // Catch:{ all -> 0x2a34 }
            X.1Rs r7 = r5.A03     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 41
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.04H r6 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.pnh.RequestPhoneNumberViewModel> r5 = com.whatsapp.pnh.RequestPhoneNumberViewModel.class
            X.04R r7 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.pnh.RequestPhoneNumberViewModel r7 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r7     // Catch:{ all -> 0x2a34 }
            X.3C6 r6 = r1.A1S     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.3Kp r7 = r6.A00(r5, r7)     // Catch:{ all -> 0x2a34 }
            r1.A4d = r7     // Catch:{ all -> 0x2a34 }
            X.141 r5 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r5.A0H     // Catch:{ all -> 0x2a34 }
            boolean r5 = r6 instanceof X.C223313w     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x058b
            X.13w r6 = (X.C223313w) r6     // Catch:{ all -> 0x2a34 }
            r7.A01(r6)     // Catch:{ all -> 0x2a34 }
        L_0x058b:
            boolean r5 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x05a5
            X.155 r7 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.3BF r5 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.2yS r6 = r5.A01     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.1Uw r5 = (X.C28981Uw) r5     // Catch:{ all -> 0x2a34 }
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r5 = X.C54902tk.A00(r6, r7, r5)     // Catch:{ all -> 0x2a34 }
            r1.A4H = r5     // Catch:{ all -> 0x2a34 }
        L_0x05a5:
            X.3AV r9 = r1.A2k     // Catch:{ all -> 0x2a34 }
            X.155 r11 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r14 = r1.A3n     // Catch:{ all -> 0x2a34 }
            X.141 r13 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.11F r12 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r8 = r5.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r14, r2)     // Catch:{ all -> 0x2a34 }
            r5 = 2
            X.C36341k9.A1E(r13, r5, r12)     // Catch:{ all -> 0x2a34 }
            r5 = 4
            X.AnonymousClass00C.A0D(r8, r5)     // Catch:{ all -> 0x2a34 }
            boolean r6 = r12 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x2a34 }
            r5 = 0
            if (r6 == 0) goto L_0x05d4
            r7 = r12
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7     // Catch:{ all -> 0x2a34 }
        L_0x05cd:
            boolean r6 = X.C55942vR.A00(r14)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x05e0
            goto L_0x05d6
        L_0x05d4:
            r7 = r5
            goto L_0x05cd
        L_0x05d6:
            if (r7 == 0) goto L_0x05e0
            boolean r6 = r13.A0E()     // Catch:{ all -> 0x2a34 }
            r37 = 1
            if (r6 != 0) goto L_0x05e2
        L_0x05e0:
            r37 = 0
        L_0x05e2:
            r6 = 5811(0x16b3, float:8.143E-42)
            boolean r14 = r14.A0E(r6)     // Catch:{ all -> 0x2a34 }
            if (r14 == 0) goto L_0x05f6
            if (r7 == 0) goto L_0x05f6
            X.1K3 r6 = r9.A02     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6.BLB(r12)     // Catch:{ all -> 0x2a34 }
            r18 = 1
            if (r6 != 0) goto L_0x05fa
        L_0x05f6:
            r18 = 0
            if (r14 == 0) goto L_0x0607
        L_0x05fa:
            X.1K3 r6 = r9.A02     // Catch:{ all -> 0x2a34 }
            X.1K4 r6 = (X.AnonymousClass1K4) r6     // Catch:{ all -> 0x2a34 }
            X.1K5 r6 = r6.A01     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6.A01(r12)     // Catch:{ all -> 0x2a34 }
            r14 = 1
            if (r6 != 0) goto L_0x0608
        L_0x0607:
            r14 = 0
        L_0x0608:
            boolean r38 = r13.A0C()     // Catch:{ all -> 0x2a34 }
            if (r18 == 0) goto L_0x0616
            boolean r6 = X.C197029b1.A00(r12)     // Catch:{ all -> 0x2a34 }
            r39 = 1
            if (r6 != 0) goto L_0x0618
        L_0x0616:
            r39 = 0
        L_0x0618:
            if (r37 != 0) goto L_0x0621
            if (r18 != 0) goto L_0x0621
            if (r14 != 0) goto L_0x0621
            if (r38 != 0) goto L_0x0621
            goto L_0x0654
        L_0x0621:
            android.content.res.Resources r12 = r11.getResources()     // Catch:{ all -> 0x2a34 }
            r6 = 2131165439(0x7f0700ff, float:1.7945095E38)
            int r36 = r12.getDimensionPixelSize(r6)     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x2a34 }
            r6 = 2131165438(0x7f0700fe, float:1.7945093E38)
            float r35 = X.C36441kJ.A00(r11, r6)     // Catch:{ all -> 0x2a34 }
            X.3K0 r6 = new X.3K0     // Catch:{ all -> 0x2a34 }
            r34 = r6
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
            X.2xy r9 = r9.A00     // Catch:{ all -> 0x2a34 }
            if (r37 != 0) goto L_0x0646
            if (r18 != 0) goto L_0x0646
            if (r38 == 0) goto L_0x0647
        L_0x0646:
            r5 = r7
        L_0x0647:
            r7 = 6
            X.04H r6 = X.AnonymousClass4ZD.A00(r8, r5, r6, r9, r7)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1tl> r5 = X.C39781tl.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            X.1tl r5 = (X.C39781tl) r5     // Catch:{ all -> 0x2a34 }
        L_0x0654:
            r1.A55 = r5     // Catch:{ all -> 0x2a34 }
            X.04H r6 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.conversation.viewmodel.SurveyViewModel> r5 = com.whatsapp.conversation.viewmodel.SurveyViewModel.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.viewmodel.SurveyViewModel r5 = (com.whatsapp.conversation.viewmodel.SurveyViewModel) r5     // Catch:{ all -> 0x2a34 }
            X.00T r5 = r5.A00     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r5.getValue()     // Catch:{ all -> 0x2a34 }
            X.00s r7 = (X.C001700s) r7     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 32
            X.C80073uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.1FR r8 = r1.A4Y     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r7 = X.C36401kF.A0b(r5)     // Catch:{ all -> 0x2a34 }
            X.0wQ r5 = r1.A1W     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.PhoneUserJid r6 = X.C36441kJ.A0n(r5)     // Catch:{ all -> 0x2a34 }
            X.9l8 r5 = X.C202159l8.A0E     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = "55"
            boolean r6 = r8.A0j(r7, r6, r5)     // Catch:{ all -> 0x2a34 }
            X.1EV r5 = r1.A4R     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5.A01()     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x06c9
            if (r6 == 0) goto L_0x06c9
            X.04H r6 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel> r5 = com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.class
            X.04R r5 = r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r5 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r5     // Catch:{ all -> 0x2a34 }
            r1.A4W = r5     // Catch:{ all -> 0x2a34 }
            X.00T r5 = r5.A05     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r5.getValue()     // Catch:{ all -> 0x2a34 }
            X.00s r7 = (X.C001700s) r7     // Catch:{ all -> 0x2a34 }
            X.012 r6 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 2
            X.C66033Uk.A00(r6, r7, r1, r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r5 = r1.A4W     // Catch:{ all -> 0x2a34 }
            X.00T r5 = r5.A07     // Catch:{ all -> 0x2a34 }
            java.lang.Object r8 = r5.getValue()     // Catch:{ all -> 0x2a34 }
            X.00s r8 = (X.C001700s) r8     // Catch:{ all -> 0x2a34 }
            X.012 r7 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 8
            X.7t0 r5 = new X.7t0     // Catch:{ all -> 0x2a34 }
            r5.<init>(r1, r6)     // Catch:{ all -> 0x2a34 }
            r8.A08(r7, r5)     // Catch:{ all -> 0x2a34 }
        L_0x06c9:
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r5 = r5.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            java.lang.String r8 = r5.A0b()     // Catch:{ all -> 0x2a34 }
            boolean r5 = r8.isEmpty()     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x06f9
            X.0yC r6 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 6084(0x17c4, float:8.525E-42)
            boolean r5 = r6.A0E(r5)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x06f9
            X.3Et r7 = r1.A2p     // Catch:{ all -> 0x2a34 }
            X.174 r6 = r7.A05     // Catch:{ all -> 0x2a34 }
            X.3qE r5 = new X.3qE     // Catch:{ all -> 0x2a34 }
            r5.<init>(r7, r8)     // Catch:{ all -> 0x2a34 }
            X.0zf r6 = r6.A01     // Catch:{ all -> 0x2a34 }
            X.0zE r7 = r6.A06     // Catch:{ all -> 0x2a34 }
            X.0zg r6 = r6.A04     // Catch:{ all -> 0x2a34 }
            int r6 = r6.A06     // Catch:{ all -> 0x2a34 }
            r7.BPD(r5, r6)     // Catch:{ all -> 0x2a34 }
        L_0x06f9:
            X.3Et r6 = r1.A2p     // Catch:{ all -> 0x2a34 }
            X.141 r5 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r6.A00(r5)     // Catch:{ all -> 0x2a34 }
            X.3Et r9 = r1.A2p     // Catch:{ all -> 0x2a34 }
            X.155 r8 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r7 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.174 r6 = r9.A05     // Catch:{ all -> 0x2a34 }
            X.4Wa r5 = new X.4Wa     // Catch:{ all -> 0x2a34 }
            r5.<init>(r8, r9, r7, r2)     // Catch:{ all -> 0x2a34 }
            X.0zf r6 = r6.A01     // Catch:{ all -> 0x2a34 }
            X.0zE r7 = r6.A06     // Catch:{ all -> 0x2a34 }
            X.0zg r6 = r6.A04     // Catch:{ all -> 0x2a34 }
            int r6 = r6.A06     // Catch:{ all -> 0x2a34 }
            r7.BPD(r5, r6)     // Catch:{ all -> 0x2a34 }
            boolean r5 = r10.A0Z     // Catch:{ all -> 0x2a34 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x2a34 }
            r1.A6F = r5     // Catch:{ all -> 0x2a34 }
            boolean r5 = r10.A0b     // Catch:{ all -> 0x2a34 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x2a34 }
            r1.A6H = r5     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5 instanceof X.C28981Uw     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x074d
            X.3BF r5 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.005 r5 = r5.A0D     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r5.get()     // Catch:{ all -> 0x2a34 }
            X.3G3 r6 = (X.AnonymousClass3G3) r6     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.1Uw r5 = (X.C28981Uw) r5     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6.A01(r5)     // Catch:{ all -> 0x2a34 }
            r5 = 1
            if (r6 != 0) goto L_0x074e
        L_0x074d:
            r5 = 0
        L_0x074e:
            r1.A6O = r5     // Catch:{ all -> 0x2a34 }
            java.lang.Long r5 = r10.A0D     // Catch:{ all -> 0x2a34 }
            r1.A61 = r5     // Catch:{ all -> 0x2a34 }
            boolean r5 = r10.A0T     // Catch:{ all -> 0x2a34 }
            r1.A67 = r5     // Catch:{ all -> 0x2a34 }
            X.1uh r6 = r1.A2x     // Catch:{ all -> 0x2a34 }
            boolean r5 = r10.A0S     // Catch:{ all -> 0x2a34 }
            r6.A0J = r5     // Catch:{ all -> 0x2a34 }
            X.1I4 r8 = r1.A3H     // Catch:{ all -> 0x2a34 }
            X.17Y r7 = r8.A02     // Catch:{ all -> 0x2a34 }
            r6 = 31
            X.1j6 r5 = new X.1j6     // Catch:{ all -> 0x2a34 }
            r5.<init>(r8, r6)     // Catch:{ all -> 0x2a34 }
            r7.Bp3(r5)     // Catch:{ all -> 0x2a34 }
            boolean r5 = r3.A0E     // Catch:{ all -> 0x2a34 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x2a34 }
            java.lang.String r7 = "conversation/onCreate entryPoint="
            r6.append(r7)     // Catch:{ all -> 0x2a34 }
            java.lang.String r11 = r10.A0G     // Catch:{ all -> 0x2a34 }
            X.C36321k7.A1a(r6, r11)     // Catch:{ all -> 0x2a34 }
            X.1I7 r6 = r1.A3G     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x078c
            X.1I6 r6 = r6.A00     // Catch:{ all -> 0x2a34 }
            X.0yC r7 = r6.A00     // Catch:{ all -> 0x2a34 }
            r6 = 976(0x3d0, float:1.368E-42)
            boolean r6 = r7.A0E(r6)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x0877
        L_0x078c:
            X.1I7 r6 = r1.A3G     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6.A00()     // Catch:{ all -> 0x2a34 }
            if (r6 != 0) goto L_0x0877
            X.36b r5 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.1YG r7 = r5.A02     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.jid.UserJid> r19 = com.whatsapp.jid.UserJid.class
            r5 = r19
            com.whatsapp.jid.Jid r6 = r6.A06(r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x07b9
            X.1IN r5 = r7.A01     // Catch:{ all -> 0x2a34 }
            X.9TX r5 = r5.A00(r6)     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5 instanceof X.C175418aS     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x07b9
            X.1Hz r7 = r1.A3F     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r1.A45     // Catch:{ all -> 0x2a34 }
            r5 = 10
            r7.A01(r6, r5)     // Catch:{ all -> 0x2a34 }
        L_0x07b9:
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r6 = X.C222813r.A00(r5)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x07d2
            X.1I2 r5 = r1.A3C     // Catch:{ all -> 0x2a34 }
            X.1IB r5 = r5.A05     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r5.A01(r6)     // Catch:{ all -> 0x2a34 }
            X.8aS r6 = (X.C175418aS) r6     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x07d2
            X.1I2 r5 = r1.A3C     // Catch:{ all -> 0x2a34 }
            r5.A07(r6)     // Catch:{ all -> 0x2a34 }
        L_0x07d2:
            r1.A65 = r11     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r10.A0F     // Catch:{ all -> 0x2a34 }
            r1.A64 = r5     // Catch:{ all -> 0x2a34 }
            X.382 r7 = r1.A2j     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.3PE r8 = r1.A3D     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r8.A05     // Catch:{ all -> 0x2a34 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x0819
            java.lang.String r5 = r8.A0A     // Catch:{ all -> 0x2a34 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x0819
            X.12q r5 = r7.A02     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5.A0M(r6)     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x0819
            X.0yC r8 = r7.A03     // Catch:{ all -> 0x2a34 }
            r5 = 2666(0xa6a, float:3.736E-42)
            boolean r5 = r8.A0E(r5)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0819
            X.16D r5 = r7.A00     // Catch:{ all -> 0x2a34 }
            X.141 r8 = r5.A0D(r6)     // Catch:{ all -> 0x2a34 }
            X.12t r5 = r7.A01     // Catch:{ all -> 0x2a34 }
            java.lang.String r38 = r8.A0J()     // Catch:{ all -> 0x2a34 }
            r37 = 0
            X.2oy r35 = X.C52152oy.CTWA     // Catch:{ all -> 0x2a34 }
            r39 = 1
            r34 = r5
            r36 = r6
            r34.A05(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
        L_0x0819:
            X.36b r6 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.2y2 r5 = r6.A01     // Catch:{ all -> 0x2a34 }
            X.1sS r12 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.3IH r11 = r6.A00     // Catch:{ all -> 0x2a34 }
            X.1Mz r9 = r5.A00     // Catch:{ all -> 0x2a34 }
            X.1My r5 = r9.A00     // Catch:{ all -> 0x2a34 }
            android.app.Activity r8 = r5.A5d     // Catch:{ all -> 0x2a34 }
            X.0tq r5 = r9.A01     // Catch:{ all -> 0x2a34 }
            X.17Y r36 = X.C36351kA.A0M(r5)     // Catch:{ all -> 0x2a34 }
            X.0tq r5 = r9.A01     // Catch:{ all -> 0x2a34 }
            X.1DU r44 = X.C36391kE.A0j(r5)     // Catch:{ all -> 0x2a34 }
            X.0ww r37 = X.C36381kD.A0U(r5)     // Catch:{ all -> 0x2a34 }
            X.0tt r6 = r5.A00     // Catch:{ all -> 0x2a34 }
            X.004 r7 = r6.A25     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x2a34 }
            X.31Y r7 = (X.AnonymousClass31Y) r7     // Catch:{ all -> 0x2a34 }
            X.1EM r45 = X.C36371kC.A0l(r5)     // Catch:{ all -> 0x2a34 }
            X.004 r6 = r6.A24     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x2a34 }
            X.3Ol r6 = (X.C64553Ol) r6     // Catch:{ all -> 0x2a34 }
            X.1My r9 = r9.A00     // Catch:{ all -> 0x2a34 }
            X.3FY r38 = X.C27111My.A1u(r9)     // Catch:{ all -> 0x2a34 }
            X.1N2 r46 = X.C36401kF.A0f(r5)     // Catch:{ all -> 0x2a34 }
            X.3HK r5 = new X.3HK     // Catch:{ all -> 0x2a34 }
            r34 = r5
            r35 = r8
            r39 = r12
            r40 = r3
            r41 = r6
            r42 = r7
            r43 = r11
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x2a34 }
            r1.A3E = r5     // Catch:{ all -> 0x2a34 }
            X.0yC r6 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 508(0x1fc, float:7.12E-43)
            boolean r5 = r6.A0E(r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x08eb
        L_0x0877:
            X.36b r6 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.1YG r7 = r6.A02     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.jid.UserJid> r19 = com.whatsapp.jid.UserJid.class
            r8 = r19
            com.whatsapp.jid.Jid r6 = r6.A06(r8)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x089c
            X.1IN r7 = r7.A01     // Catch:{ all -> 0x2a34 }
            X.9TX r6 = r7.A00(r6)     // Catch:{ all -> 0x2a34 }
            boolean r6 = r6 instanceof X.C175418aS     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x089c
            X.1Hz r8 = r1.A3F     // Catch:{ all -> 0x2a34 }
            X.11F r7 = r1.A45     // Catch:{ all -> 0x2a34 }
            r6 = 9
            r8.A01(r7, r6)     // Catch:{ all -> 0x2a34 }
        L_0x089c:
            X.141 r7 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r6 = r19
            com.whatsapp.jid.Jid r9 = r7.A06(r6)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x2a34 }
            if (r9 == 0) goto L_0x08e6
            X.3Pf r8 = r1.A3b     // Catch:{ all -> 0x2a34 }
            boolean r7 = r3.A0G     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x08bb
            X.1I6 r5 = r8.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r6 = r5.A00     // Catch:{ all -> 0x2a34 }
            r5 = 976(0x3d0, float:1.368E-42)
            boolean r6 = r6.A0E(r5)     // Catch:{ all -> 0x2a34 }
            r5 = 0
            if (r6 == 0) goto L_0x08bc
        L_0x08bb:
            r5 = 1
        L_0x08bc:
            r5 = r5 ^ 1
            boolean r5 = X.C64733Pf.A00(r8, r9, r5, r7)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x08e6
            X.2o6 r7 = X.C51612o6.NON_BLOCKING_DISCLOSURE     // Catch:{ all -> 0x2a34 }
            X.11F r6 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.141 r5 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5.A0C()     // Catch:{ all -> 0x2a34 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r6 = X.C54172sW.A00(r6, r7, r5)     // Catch:{ all -> 0x2a34 }
            X.2Ky r5 = new X.2Ky     // Catch:{ all -> 0x2a34 }
            r5.<init>(r10, r1, r0)     // Catch:{ all -> 0x2a34 }
            r6.A07 = r5     // Catch:{ all -> 0x2a34 }
            X.01z r5 = A06(r1)     // Catch:{ all -> 0x2a34 }
            X.C65443Sb.A01(r6, r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x07d2
        L_0x08e6:
            A1E(r1, r3)     // Catch:{ all -> 0x2a34 }
            goto L_0x07d2
        L_0x08eb:
            if (r5 == 0) goto L_0x0900
            java.lang.String r5 = r1.A65     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0900
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r6 = X.C222813r.A00(r5)     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x0900
            X.0wU r5 = A0K(r1)     // Catch:{ all -> 0x2a34 }
            X.C80283v9.A00(r5, r1, r6, r15)     // Catch:{ all -> 0x2a34 }
        L_0x0900:
            X.141 r5 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r5.A0H     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5 instanceof X.C177618e5     // Catch:{ all -> 0x2a34 }
            r1.A6M = r5     // Catch:{ all -> 0x2a34 }
            X.11F r8 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r8)     // Catch:{ all -> 0x2a34 }
            X.12q r6 = r1.A3O     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.16D r5 = r5.getContactManager()     // Catch:{ all -> 0x2a34 }
            int r5 = X.AnonymousClass3TD.A00(r5, r6, r8)     // Catch:{ all -> 0x2a34 }
            if (r5 <= 0) goto L_0x092e
            if (r7 == 0) goto L_0x092e
            X.1Jx r5 = r1.A5D     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5.A01(r7)     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x092e
            X.1X4 r6 = A0A(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 0
            r6.A0R(r7, r5, r0, r0)     // Catch:{ all -> 0x2a34 }
        L_0x092e:
            r1.A6u = r2     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = "inflateViews_start"
            A1I(r1, r5)     // Catch:{ all -> 0x2a34 }
            boolean r5 = A1e(r1)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0964
            java.lang.String r5 = "conversationBottomSheet"
            A1I(r1, r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r6 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r5 = 2131624521(0x7f0e0249, float:1.8876224E38)
        L_0x0945:
            r6.setContentView(r5)     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = "inflateViews_end"
            A1I(r1, r5)     // Catch:{ all -> 0x2a34 }
            X.155 r6 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 2131429218(0x7f0b0762, float:1.8480103E38)
            android.view.View r7 = X.C03570Gk.A0B(r6, r5)     // Catch:{ all -> 0x2a34 }
            r5 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r5 = r7.findViewById(r5)     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5     // Catch:{ all -> 0x2a34 }
            r1.A0j = r5     // Catch:{ all -> 0x2a34 }
            goto L_0x096f
        L_0x0964:
            java.lang.String r5 = "conversation"
            A1I(r1, r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r6 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r5 = 2131624506(0x7f0e023a, float:1.8876194E38)
            goto L_0x0945
        L_0x096f:
            if (r5 == 0) goto L_0x0a07
            X.1K3 r6 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r5 = r6.BLD(r5)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x09c9
            r5 = 2131433608(0x7f0b1888, float:1.8489006E38)
            android.view.ViewGroup r6 = X.C36411kG.A0O(r7, r5)     // Catch:{ all -> 0x2a34 }
            X.1K3 r9 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r5 = r1.A0j     // Catch:{ all -> 0x2a34 }
            r6.removeView(r5)     // Catch:{ all -> 0x2a34 }
            X.155 r8 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r6 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 2131433479(0x7f0b1807, float:1.8488745E38)
            android.view.View r7 = X.C03570Gk.A0B(r6, r5)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x2a34 }
            r5 = 2
            X.4YA r6 = new X.4YA     // Catch:{ all -> 0x2a34 }
            r6.<init>(r9, r1, r5)     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r8, r0)     // Catch:{ all -> 0x2a34 }
            android.view.LayoutInflater r5 = X.C36341k9.A0J(r7, r2)     // Catch:{ all -> 0x2a34 }
            r2 = 2131624213(0x7f0e0115, float:1.88756E38)
            android.view.View r5 = r5.inflate(r2, r7, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.bonsai.BonsaiToolbar"
            X.AnonymousClass00C.A0E(r5, r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.bonsai.BonsaiToolbar r5 = (com.whatsapp.bonsai.BonsaiToolbar) r5     // Catch:{ all -> 0x2a34 }
            r7.addView(r5)     // Catch:{ all -> 0x2a34 }
            r5.A00 = r8     // Catch:{ all -> 0x2a34 }
            r2 = 2131102402(0x7f060ac2, float:1.781724E38)
            X.AnonymousClass1RC.A05(r8, r2)     // Catch:{ all -> 0x2a34 }
            r5.addOnLayoutChangeListener(r6)     // Catch:{ all -> 0x2a34 }
            r1.A0j = r5     // Catch:{ all -> 0x2a34 }
        L_0x09c9:
            androidx.appcompat.widget.Toolbar r8 = r1.A0j     // Catch:{ all -> 0x2a34 }
            r8.A0F()     // Catch:{ all -> 0x2a34 }
            int r7 = r8.getPaddingLeft()     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r2 = r1.A0j     // Catch:{ all -> 0x2a34 }
            int r6 = r2.getPaddingTop()     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r5 = A04(r1)     // Catch:{ all -> 0x2a34 }
            r2 = 2131166168(0x7f0703d8, float:1.7946574E38)
            int r5 = r5.getDimensionPixelSize(r2)     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r2 = r1.A0j     // Catch:{ all -> 0x2a34 }
            X.C36421kH.A0y(r2, r8, r7, r6, r5)     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r2 = r1.A0j     // Catch:{ all -> 0x2a34 }
            r2.setTouchscreenBlocksFocus(r0)     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A6B     // Catch:{ all -> 0x2a34 }
            if (r2 != 0) goto L_0x0a07
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            androidx.appcompat.widget.Toolbar r2 = r1.A0j     // Catch:{ all -> 0x2a34 }
            r5.setSupportActionBar(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.07B r2 = r2.getSupportActionBar()     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x2a34 }
            r2.A0U(r0)     // Catch:{ all -> 0x2a34 }
            r2.A0X(r0)     // Catch:{ all -> 0x2a34 }
        L_0x0a07:
            java.lang.String r2 = "setupToolbar"
            A1I(r1, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433609(0x7f0b1889, float:1.8489009E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0V = r2     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "searchFragmentHolder"
            A1I(r1, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429209(0x7f0b0759, float:1.8480084E38)
            android.view.View r8 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.KeyboardPopupLayout r8 = (com.whatsapp.KeyboardPopupLayout) r8     // Catch:{ all -> 0x2a34 }
            r1.A1V = r8     // Catch:{ all -> 0x2a34 }
            X.155 r7 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r6 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r5 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r2 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r2 = X.C36351kA.A02(r6, r7, r5, r2)     // Catch:{ all -> 0x2a34 }
            r8.setKeyboardPopupBackgroundColor(r2)     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r2 = 2131433479(0x7f0b1807, float:1.8488745E38)
            android.view.View r2 = X.C03570Gk.A0B(r5, r2)     // Catch:{ all -> 0x2a34 }
            r1.A0B = r2     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "conversationLayoutRoot"
            A1I(r1, r2)     // Catch:{ all -> 0x2a34 }
            boolean r2 = A1e(r1)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0a74
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429274(0x7f0b079a, float:1.8480216E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0S = r2     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r2 = X.C63733Le.A00(r5, r2)     // Catch:{ all -> 0x2a34 }
            r1.A0b = r2     // Catch:{ all -> 0x2a34 }
            X.C66963Xz.A00(r2, r1, r4)     // Catch:{ all -> 0x2a34 }
        L_0x0a74:
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0R = r2     // Catch:{ all -> 0x2a34 }
            X.1JL r2 = r1.A3z     // Catch:{ all -> 0x2a34 }
            boolean r2 = r2.A08()     // Catch:{ all -> 0x2a34 }
            if (r2 != 0) goto L_0x0a95
            X.1K3 r5 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r2 = r5.BLD(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0ac5
        L_0x0a95:
            X.155 r2 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass1RC.A03(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131434246(0x7f0b1b06, float:1.84903E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            r1.A0O = r2     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0abb
            boolean r2 = X.C19550w8.A01()     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0ade
            X.1K3 r5 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r2 = r5.BLD(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0ade
        L_0x0abb:
            android.view.ViewGroup r5 = r1.A0R     // Catch:{ all -> 0x2a34 }
            X.4ZQ r2 = new X.4ZQ     // Catch:{ all -> 0x2a34 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.C011004s.A07(r5, r2)     // Catch:{ all -> 0x2a34 }
        L_0x0ac5:
            X.1Q7 r6 = r1.A2F     // Catch:{ all -> 0x2a34 }
            r5 = 2
            X.4Xs r2 = new X.4Xs     // Catch:{ all -> 0x2a34 }
            r2.<init>(r1, r5)     // Catch:{ all -> 0x2a34 }
            r6.setVisibilityChangeListener(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429218(0x7f0b0762, float:1.8480103E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch:{ all -> 0x2a34 }
            r1.A0e = r2     // Catch:{ all -> 0x2a34 }
            goto L_0x0ae4
        L_0x0ade:
            android.view.View r2 = r1.A0O     // Catch:{ all -> 0x2a34 }
            r2.setVisibility(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x0abb
        L_0x0ae4:
            r6 = 0
            if (r2 == 0) goto L_0x0af4
            X.0yC r5 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r2 = 6989(0x1b4d, float:9.794E-42)
            boolean r2 = r5.A0E(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 != 0) goto L_0x0af4
            A0b(r6, r1)     // Catch:{ all -> 0x2a34 }
        L_0x0af4:
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429777(0x7f0b0991, float:1.8481236E38)
            r9 = 2131429777(0x7f0b0991, float:1.8481236E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            r1.A0C = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433166(0x7f0b16ce, float:1.848811E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2     // Catch:{ all -> 0x2a34 }
            r1.A1d = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433167(0x7f0b16cf, float:1.8488112E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ all -> 0x2a34 }
            r1.A6g = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433168(0x7f0b16d0, float:1.8488114E38)
            android.view.View r7 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ all -> 0x2a34 }
            r1.A6f = r7     // Catch:{ all -> 0x2a34 }
            X.0ts r6 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r2 = 2131231312(0x7f080250, float:1.8078701E38)
            X.C36321k7.A0L(r5, r7, r6, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433169(0x7f0b16d1, float:1.8488116E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            r1.A0H = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131430119(0x7f0b0ae7, float:1.848193E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2     // Catch:{ all -> 0x2a34 }
            r1.A5e = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429017(0x7f0b0699, float:1.8479695E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2     // Catch:{ all -> 0x2a34 }
            r1.A1c = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429376(0x7f0b0800, float:1.8480423E38)
            android.view.View r5 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            X.1RJ r2 = new X.1RJ     // Catch:{ all -> 0x2a34 }
            r2.<init>(r5)     // Catch:{ all -> 0x2a34 }
            r1.A5M = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131427927(0x7f0b0257, float:1.8477484E38)
            android.view.View r5 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x2a34 }
            r1.A0Q = r5     // Catch:{ all -> 0x2a34 }
            boolean r2 = X.C19550w8.A00()     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0b83
            r2 = 16908298(0x102000a, float:2.3877257E-38)
            r5.setAccessibilityTraversalBefore(r2)     // Catch:{ all -> 0x2a34 }
        L_0x0b83:
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131435343(0x7f0b1f4f, float:1.8492525E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0X = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433099(0x7f0b168b, float:1.8487974E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0T = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131433100(0x7f0b168c, float:1.8487976E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0U = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131435221(0x7f0b1ed5, float:1.8492278E38)
            android.view.View r2 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2a34 }
            r1.A0W = r2     // Catch:{ all -> 0x2a34 }
            com.whatsapp.KeyboardPopupLayout r5 = r1.A1V     // Catch:{ all -> 0x2a34 }
            r2 = 2131429039(0x7f0b06af, float:1.847974E38)
            X.C012005e.A02(r5, r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2.getLifecycleOwner()     // Catch:{ all -> 0x2a34 }
            r5 = 2131429189(0x7f0b0745, float:1.8480044E38)
            X.155 r2 = r2.BoP()     // Catch:{ all -> 0x2a34 }
            X.1RJ r2 = X.C36361kB.A0h(r2, r5)     // Catch:{ all -> 0x2a34 }
            android.view.View r18 = X.C36391kE.A0L(r2, r0)     // Catch:{ all -> 0x2a34 }
            r2 = r18
            com.whatsapp.settings.chat.wallpaper.WallPaperView r2 = (com.whatsapp.settings.chat.wallpaper.WallPaperView) r2     // Catch:{ all -> 0x2a34 }
            r18 = r2
            X.3qm r2 = new X.3qm     // Catch:{ all -> 0x2a34 }
            r2.<init>(r1)     // Catch:{ all -> 0x2a34 }
            r5 = r18
            r5.A00 = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.widget.ListView r2 = r2.getListView()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r2 = (com.whatsapp.conversation.ConversationListView) r2     // Catch:{ all -> 0x2a34 }
            r1.A2U = r2     // Catch:{ all -> 0x2a34 }
            r2.setDividerHeight(r0)     // Catch:{ all -> 0x2a34 }
            boolean r2 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0c59
            X.1K3 r11 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "bonsai_start"
            A1I(r1, r2)     // Catch:{ all -> 0x2a34 }
            X.141 r2 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.11F r8 = r2.A0H     // Catch:{ all -> 0x2a34 }
            r2 = r11
            X.1K4 r2 = (X.AnonymousClass1K4) r2     // Catch:{ all -> 0x2a34 }
            if (r8 == 0) goto L_0x0c35
            X.1KD r2 = r2.A03     // Catch:{ all -> 0x2a34 }
            boolean r5 = X.C197029b1.A00(r8)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0c35
            X.1Hg r5 = r2.A00     // Catch:{ all -> 0x2a34 }
            boolean r5 = r5.A00()     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0c35
            java.util.concurrent.ConcurrentHashMap r7 = r2.A06     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r7.get(r8)     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x0c35
            X.12q r6 = r2.A04     // Catch:{ all -> 0x2a34 }
            X.3Qp r5 = r6.A09(r8, r0)     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x0c35
            X.1KE r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.2LZ r2 = r2.A00(r5)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0c35
            r6.A0I(r2, r8)     // Catch:{ all -> 0x2a34 }
            r7.put(r8, r2)     // Catch:{ all -> 0x2a34 }
        L_0x0c35:
            X.1K3 r5 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r2 = r5.BLD(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0c54
            com.whatsapp.conversation.ConversationListView r7 = r1.A2U     // Catch:{ all -> 0x2a34 }
            X.141 r6 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            android.content.res.Configuration r5 = X.AnonymousClass000.A0U(r2)     // Catch:{ all -> 0x2a34 }
            android.view.Window r2 = A05(r1)     // Catch:{ all -> 0x2a34 }
            r11.BmA(r5, r2, r7, r6)     // Catch:{ all -> 0x2a34 }
        L_0x0c54:
            java.lang.String r2 = "bonsai_end"
            A1I(r1, r2)     // Catch:{ all -> 0x2a34 }
        L_0x0c59:
            com.whatsapp.conversation.ConversationListView r2 = r1.A2U     // Catch:{ all -> 0x2a34 }
            android.view.ViewTreeObserver r5 = r2.getViewTreeObserver()     // Catch:{ all -> 0x2a34 }
            android.view.ViewTreeObserver$OnPreDrawListener r2 = r1.A7J     // Catch:{ all -> 0x2a34 }
            r5.addOnPreDrawListener(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r5 = r1.A2U     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A6R     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0c6f
            r2 = 9
            X.C36421kH.A11(r5, r1, r2)     // Catch:{ all -> 0x2a34 }
        L_0x0c6f:
            X.2y0 r2 = r1.A14     // Catch:{ all -> 0x2a34 }
            X.155 r6 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.1NG r5 = X.C36381kD.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.36T r2 = new X.36T     // Catch:{ all -> 0x2a34 }
            r2.<init>(r6, r5)     // Catch:{ all -> 0x2a34 }
            r1.A6l = r2     // Catch:{ all -> 0x2a34 }
            X.3BF r2 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.2yV r2 = r2.A03     // Catch:{ all -> 0x2a34 }
            X.155 r7 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r5 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.0tt r2 = r5.A00     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r2.A2y     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.3hE r6 = (X.C71723hE) r6     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r5.A2i     // Catch:{ all -> 0x2a34 }
            X.005 r5 = X.C18840tu.A00(r2)     // Catch:{ all -> 0x2a34 }
            X.383 r2 = new X.383     // Catch:{ all -> 0x2a34 }
            r2.<init>(r7, r6, r5)     // Catch:{ all -> 0x2a34 }
            r1.A6m = r2     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.11e r8 = r2.getStartupTracker()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r7 = r1.A2U     // Catch:{ all -> 0x2a34 }
            boolean r2 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            r6 = 2
            if (r2 == 0) goto L_0x0cb9
            r6 = 5
        L_0x0cb9:
            r2 = 5
            X.3wT r5 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r5.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r2 = r17
            r8.A05(r7, r5, r2, r6)     // Catch:{ all -> 0x2a34 }
            X.4V6 r5 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429693(0x7f0b093d, float:1.8481066E38)
            android.view.View r17 = r5.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            r2 = r17
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2     // Catch:{ all -> 0x2a34 }
            r17 = r2
            r6 = 2131233044(0x7f080914, float:1.8082214E38)
            X.0ts r5 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r7 = r17
            X.C36321k7.A0L(r2, r7, r5, r6)     // Catch:{ all -> 0x2a34 }
            X.2y1 r2 = r1.A15     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            android.view.View r5 = X.C03570Gk.A0B(r5, r9)     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.0ts r2 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.3AC r7 = new X.3AC     // Catch:{ all -> 0x2a34 }
            r7.<init>(r5, r2)     // Catch:{ all -> 0x2a34 }
            r1.A2R = r7     // Catch:{ all -> 0x2a34 }
            android.widget.FrameLayout r6 = r7.A04     // Catch:{ all -> 0x2a34 }
            int r5 = r6.getPaddingLeft()     // Catch:{ all -> 0x2a34 }
            int r2 = r6.getPaddingRight()     // Catch:{ all -> 0x2a34 }
            int r2 = java.lang.Math.max(r5, r2)     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass1JZ.A03(r6, r0, r2)     // Catch:{ all -> 0x2a34 }
            android.view.View r5 = r7.A02     // Catch:{ all -> 0x2a34 }
            r2 = 2131231753(0x7f080409, float:1.8079596E38)
            r5.setBackgroundResource(r2)     // Catch:{ all -> 0x2a34 }
            r5.setPadding(r0, r0, r0, r0)     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            com.whatsapp.WaImageButton r2 = X.C63733Le.A01(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A0c = r2     // Catch:{ all -> 0x2a34 }
            r0 = 25
            X.C66963Xz.A00(r2, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yb r2 = r0.getSystemServices()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "android.hardware.type.featurephone"
            boolean r0 = r2.A0P(r0)     // Catch:{ all -> 0x2a34 }
            r1.A6K = r0     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131429201(0x7f0b0751, float:1.8480068E38)
            android.view.View r6 = X.C03570Gk.A0B(r2, r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationEntryActionButton r6 = (com.whatsapp.conversation.ConversationEntryActionButton) r6     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r7 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2yO r5 = r1.A1O     // Catch:{ all -> 0x2a34 }
            X.3KZ r36 = r1.A0E()     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 4548(0x11c4, float:6.373E-42)
            boolean r38 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 4549(0x11c5, float:6.375E-42)
            boolean r39 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.C36351kA.A1J(r7, r5, r0)     // Catch:{ all -> 0x2a34 }
            X.3bR r0 = new X.3bR     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r35 = r5
            r37 = r2
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
            X.04H r2 = new X.04H     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1ts> r0 = X.C39821ts.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.1ts r0 = (X.C39821ts) r0     // Catch:{ all -> 0x2a34 }
            r1.A2u = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r7 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.2yP r5 = r1.A1P     // Catch:{ all -> 0x2a34 }
            X.3KZ r2 = r1.A0E()     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.C36351kA.A1J(r7, r5, r0)     // Catch:{ all -> 0x2a34 }
            r0 = 9
            X.04H r2 = X.AnonymousClass4ZG.A00(r7, r2, r5, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1uJ> r0 = X.C39941uJ.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.1uJ r0 = (X.C39941uJ) r0     // Catch:{ all -> 0x2a34 }
            r1.A2y = r0     // Catch:{ all -> 0x2a34 }
            X.1sW r0 = new X.1sW     // Catch:{ all -> 0x2a34 }
            r0.<init>()     // Catch:{ all -> 0x2a34 }
            r1.A0m = r0     // Catch:{ all -> 0x2a34 }
            X.1ts r0 = r1.A2u     // Catch:{ all -> 0x2a34 }
            X.1hi r2 = r0.A04     // Catch:{ all -> 0x2a34 }
            X.3a5 r0 = X.C67543a5.A00     // Catch:{ all -> 0x2a34 }
            X.08S r0 = X.AnonymousClass0VV.A00(r0, r2)     // Catch:{ all -> 0x2a34 }
            X.08S r7 = X.AnonymousClass0VV.A01(r0)     // Catch:{ all -> 0x2a34 }
            X.08S r5 = X.C36441kJ.A0Y()     // Catch:{ all -> 0x2a34 }
            X.3UZ r0 = new X.3UZ     // Catch:{ all -> 0x2a34 }
            r0.<init>(r5)     // Catch:{ all -> 0x2a34 }
            r5.A0F(r7, r0)     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 3
            X.C66033Uk.A00(r2, r5, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 4
            X.C66033Uk.A00(r2, r7, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.0ts r8 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.012 r7 = r0.getLifecycleOwner()     // Catch:{ all -> 0x2a34 }
            X.155 r2 = r0.BoP()     // Catch:{ all -> 0x2a34 }
            r0 = 2131433048(0x7f0b1658, float:1.848787E38)
            X.1RJ r5 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            X.1ts r2 = r1.A2u     // Catch:{ all -> 0x2a34 }
            X.1uJ r0 = r1.A2y     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass97U.A00(r7, r2, r0, r8, r5)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131433080(0x7f0b1678, float:1.8487936E38)
            android.view.View r2 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            X.1RJ r0 = new X.1RJ     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2)     // Catch:{ all -> 0x2a34 }
            r1.A5P = r0     // Catch:{ all -> 0x2a34 }
            boolean r0 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x0e05
            X.1ts r2 = r1.A2u     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r2.A0U(r0)     // Catch:{ all -> 0x2a34 }
        L_0x0e05:
            r7 = 0
            X.0v5 r0 = r1.A0p     // Catch:{ all -> 0x2a34 }
            boolean r2 = r0.A05()     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0e1d
            r0.A02()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.getActivityNullable()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "create"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x2a34 }
        L_0x0e1c:
            throw r0     // Catch:{ all -> 0x2a34 }
        L_0x0e1d:
            X.1ts r0 = r1.A2u     // Catch:{ all -> 0x2a34 }
            X.00r r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.A04()     // Catch:{ all -> 0x2a34 }
            X.3K4 r0 = (X.AnonymousClass3K4) r0     // Catch:{ all -> 0x2a34 }
            X.0v5 r5 = r1.A0t     // Catch:{ all -> 0x2a34 }
            boolean r2 = r5.A05()     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0e45
            if (r0 == 0) goto L_0x0e36
            int r2 = r0.A01     // Catch:{ all -> 0x2a34 }
            r0 = 1
            if (r2 == r0) goto L_0x0e45
        L_0x0e36:
            r5.A02()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "createSmbViewModel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x0e1c
        L_0x0e45:
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.0v5 r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A05()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x0e70
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 7466(0x1d2a, float:1.0462E-41)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x0e70
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.0v5 r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            r0.A02()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.getActivityNullable()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "createSuggestedReplyViewModel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x0e1c
        L_0x0e70:
            X.155 r5 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1ts r2 = r1.A2u     // Catch:{ all -> 0x2a34 }
            r12 = 0
            X.4Zx r0 = new X.4Zx     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r12)     // Catch:{ all -> 0x2a34 }
            r6.A02(r5, r0, r2)     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            float r5 = X.C36341k9.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ all -> 0x2a34 }
            r0 = 5363(0x14f3, float:7.515E-42)
            int r0 = r2.A07(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 >= 0) goto L_0x0e97
            r0 = 0
            goto L_0x0ea1
        L_0x0e97:
            float r0 = (float) r0     // Catch:{ all -> 0x2a34 }
            float r0 = r0 * r5
            int r0 = X.C14960mT.A01(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x2a34 }
        L_0x0ea1:
            r1.A60 = r0     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 4416(0x1140, float:6.188E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x0ec3
            X.1ts r0 = r1.A2u     // Catch:{ all -> 0x2a34 }
            X.1hi r2 = r0.A04     // Catch:{ all -> 0x2a34 }
            X.3a6 r0 = X.C67553a6.A00     // Catch:{ all -> 0x2a34 }
            X.08S r0 = X.AnonymousClass0VV.A00(r0, r2)     // Catch:{ all -> 0x2a34 }
            X.08S r5 = X.AnonymousClass0VV.A01(r0)     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 5
            X.C66033Uk.A00(r2, r5, r1, r0)     // Catch:{ all -> 0x2a34 }
        L_0x0ec3:
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131428534(0x7f0b04b6, float:1.8478715E38)
            android.view.View r0 = X.C03570Gk.A0B(r2, r0)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0     // Catch:{ all -> 0x2a34 }
            r1.A0a = r0     // Catch:{ all -> 0x2a34 }
            boolean r2 = X.C222013h.A07     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x0ed9
            r0.setPadding(r12, r12, r12, r12)     // Catch:{ all -> 0x2a34 }
        L_0x0ed9:
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            int r6 = X.AnonymousClass3MW.A00(r0)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r2 = r1.A0a     // Catch:{ all -> 0x2a34 }
            r0 = 10
            X.C67143Yr.A00(r2, r1, r6, r0)     // Catch:{ all -> 0x2a34 }
            X.3KZ r5 = r1.A0E()     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 6256(0x1870, float:8.767E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x0f02
            boolean r0 = r5.A04     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1050
            android.widget.ImageButton r2 = r1.A0a     // Catch:{ all -> 0x2a34 }
            X.3Z6 r0 = new X.3Z6     // Catch:{ all -> 0x2a34 }
            r0.<init>(r5, r1, r6)     // Catch:{ all -> 0x2a34 }
            r2.setOnLongClickListener(r0)     // Catch:{ all -> 0x2a34 }
        L_0x0f02:
            r0 = 8
            A1B(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131428036(0x7f0b02c4, float:1.8477705E38)
            android.view.View r8 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x2a34 }
            X.31K r5 = new X.31K     // Catch:{ all -> 0x2a34 }
            r5.<init>(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r34 = r0
            X.0wQ r0 = r1.A1W     // Catch:{ all -> 0x2a34 }
            r25 = r0
            X.0wU r64 = A0K(r1)     // Catch:{ all -> 0x2a34 }
            X.1NC r0 = r1.A0u     // Catch:{ all -> 0x2a34 }
            r24 = r0
            X.12q r0 = r1.A3O     // Catch:{ all -> 0x2a34 }
            r23 = r0
            X.1C6 r0 = r1.A54     // Catch:{ all -> 0x2a34 }
            r22 = r0
            X.0xf r15 = r1.A3o     // Catch:{ all -> 0x2a34 }
            X.155 r48 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1NG r14 = r1.A1z     // Catch:{ all -> 0x2a34 }
            X.1YR r13 = r1.A3X     // Catch:{ all -> 0x2a34 }
            X.185 r11 = r1.A2J     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r56 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            X.1LV r9 = r1.A2B     // Catch:{ all -> 0x2a34 }
            X.19g r7 = r1.A3a     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.17X r58 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2a34 }
            X.1et r6 = r1.A20     // Catch:{ all -> 0x2a34 }
            X.155 r50 = r0.getActivityNullable()     // Catch:{ all -> 0x2a34 }
            r0 = 28
            X.3wT r4 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r4.<init>((java.lang.Object) r5, (int) r0)     // Catch:{ all -> 0x2a34 }
            r0 = 29
            X.3wT r2 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r2.<init>((java.lang.Object) r5, (int) r0)     // Catch:{ all -> 0x2a34 }
            X.005 r0 = r1.A5g     // Catch:{ all -> 0x2a34 }
            X.3Qn r47 = new X.3Qn     // Catch:{ all -> 0x2a34 }
            r49 = r24
            r51 = r25
            r52 = r14
            r53 = r6
            r54 = r9
            r55 = r11
            r57 = r23
            r59 = r13
            r60 = r7
            r61 = r34
            r62 = r15
            r63 = r22
            r65 = r0
            r66 = r4
            r67 = r2
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)     // Catch:{ all -> 0x2a34 }
            X.2yF r0 = r1.A1G     // Catch:{ all -> 0x2a34 }
            X.155 r37 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r40 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r11 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r9 = r1.A2U     // Catch:{ all -> 0x2a34 }
            X.1Mz r4 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r0 = r4.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r50 = X.C36341k9.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.0wQ r41 = X.C36351kA.A0N(r0)     // Catch:{ all -> 0x2a34 }
            X.12q r48 = X.C36351kA.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A7s     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1C6 r7 = (X.AnonymousClass1C6) r7     // Catch:{ all -> 0x2a34 }
            X.0xf r51 = r0.AzV()     // Catch:{ all -> 0x2a34 }
            X.16D r45 = X.C36341k9.A0R(r0)     // Catch:{ all -> 0x2a34 }
            X.13J r57 = X.C36351kA.A0q(r0)     // Catch:{ all -> 0x2a34 }
            X.1NG r42 = X.C36381kD.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.0xQ r52 = X.C36361kB.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.1A1 r55 = X.C36351kA.A0n(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A8t     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1Ew r6 = (X.C25071Ew) r6     // Catch:{ all -> 0x2a34 }
            X.1CF r53 = X.C36361kB.A0b(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A0x     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1K3 r2 = (X.AnonymousClass1K3) r2     // Catch:{ all -> 0x2a34 }
            X.1GC r38 = X.C19460v5.A01(r2)     // Catch:{ all -> 0x2a34 }
            X.1NV r44 = X.C18800tq.A48(r0)     // Catch:{ all -> 0x2a34 }
            X.1My r0 = r4.A00     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A2K     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1et r2 = (X.C33201et) r2     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r0.A1J     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.2yG r0 = (X.C57452yG) r0     // Catch:{ all -> 0x2a34 }
            X.3Sr r4 = new X.3Sr     // Catch:{ all -> 0x2a34 }
            r34 = r4
            r35 = r8
            r36 = r9
            r39 = r0
            r43 = r2
            r46 = r5
            r49 = r6
            r54 = r11
            r56 = r7
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)     // Catch:{ all -> 0x2a34 }
            r1.A2n = r4     // Catch:{ all -> 0x2a34 }
            r14 = 17
            X.2sY r40 = new X.2sY     // Catch:{ all -> 0x2a34 }
            r40.<init>()     // Catch:{ all -> 0x2a34 }
            X.3C7 r5 = r1.A1T     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r38 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2
            X.4Yn r4 = new X.4Yn     // Catch:{ all -> 0x2a34 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.4Ov r36 = r0.B4o()     // Catch:{ all -> 0x2a34 }
            X.4UR r2 = r1.A7S     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r34 = r5
            r37 = r4
            r39 = r2
            r41 = r0
            X.28b r2 = r34.A00(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x2a34 }
            r1.A6n = r2     // Catch:{ all -> 0x2a34 }
            java.util.Set r0 = r1.A7B     // Catch:{ all -> 0x2a34 }
            r106 = r0
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
            java.lang.String r15 = r10.A0E     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x1077
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x1077
            goto L_0x1086
        L_0x1050:
            X.3ez r5 = new X.3ez     // Catch:{ all -> 0x2a34 }
            r5.<init>(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 5
            X.2rs r2 = new X.2rs     // Catch:{ all -> 0x2a34 }
            r2.<init>(r5, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.3wl r0 = new X.3wl     // Catch:{ all -> 0x2a34 }
            r0.<init>((java.lang.Object) r1, (int) r6, (int) r4)     // Catch:{ all -> 0x2a34 }
            r4 = 43
            X.3v4 r5 = X.C80233v4.A00(r5, r4)     // Catch:{ all -> 0x2a34 }
            X.2L0 r4 = new X.2L0     // Catch:{ all -> 0x2a34 }
            r4.<init>((android.view.View.OnTouchListener) r2, (X.C70803fk) r1, (java.lang.Runnable) r0, (java.lang.Runnable) r5)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r0 = r1.A0a     // Catch:{ all -> 0x2a34 }
            r0.setOnTouchListener(r4)     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r0 = r1.A0a     // Catch:{ all -> 0x2a34 }
            r0.setOnClickListener(r7)     // Catch:{ all -> 0x2a34 }
            goto L_0x0f02
        L_0x1077:
            java.util.HashMap r2 = A7c     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x2a34 }
            r4 = 0
            if (r0 == 0) goto L_0x1087
        L_0x1086:
            r4 = 1
        L_0x1087:
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.1YG r2 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1099
            X.3QA r0 = X.AnonymousClass1YG.A00(r2, r0)     // Catch:{ all -> 0x2a34 }
            r0.A01 = r4     // Catch:{ all -> 0x2a34 }
        L_0x1099:
            java.lang.String r0 = "on_create_conversation_start"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "conversation/createconversation"
            X.14g r24 = new X.14g     // Catch:{ all -> 0x2a34 }
            r2 = r24
            r2.<init>((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            r1.A0R()     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r13 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.3QY r38 = r0.getConversationRowInflater()     // Catch:{ all -> 0x2a34 }
            X.0wo r41 = r0.getTime()     // Catch:{ all -> 0x2a34 }
            X.0wQ r11 = r1.A1W     // Catch:{ all -> 0x2a34 }
            X.19w r9 = r1.A4j     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1A1 r48 = r0.getFMessageDatabase()     // Catch:{ all -> 0x2a34 }
            X.19I r8 = r1.A4C     // Catch:{ all -> 0x2a34 }
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.3S3 r7 = r0.A03     // Catch:{ all -> 0x2a34 }
            X.4V6 r6 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.3CN r5 = r1.A2Y     // Catch:{ all -> 0x2a34 }
            X.3BF r0 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.005 r0 = r0.A0D     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.3G3 r4 = (X.AnonymousClass3G3) r4     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            X.0v0 r0 = r1.A35     // Catch:{ all -> 0x2a34 }
            X.1nd r23 = new X.1nd     // Catch:{ all -> 0x2a34 }
            r34 = r23
            r36 = r11
            r37 = r5
            r39 = r6
            r40 = r7
            r42 = r0
            r43 = r2
            r44 = r13
            r45 = r8
            r46 = r4
            r47 = r9
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x2a34 }
            android.database.DataSetObserver r0 = r1.A6w     // Catch:{ all -> 0x2a34 }
            r2 = r23
            r2.registerDataSetObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            android.view.View r4 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4     // Catch:{ all -> 0x2a34 }
            r1.A4B = r4     // Catch:{ all -> 0x2a34 }
            if (r4 == 0) goto L_0x11d7
            X.3Od r2 = new X.3Od     // Catch:{ all -> 0x2a34 }
            r2.<init>()     // Catch:{ all -> 0x2a34 }
            X.4XH r0 = new X.4XH     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2, r1, r12)     // Catch:{ all -> 0x2a34 }
            r4.A0D = r0     // Catch:{ all -> 0x2a34 }
            r0 = 2131231753(0x7f080409, float:1.8079596E38)
            r1.A23(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r0 = r2.A0I(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1159
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131431569(0x7f0b1091, float:1.848487E38)
            android.view.View r4 = X.C03570Gk.A0B(r2, r0)     // Catch:{ all -> 0x2a34 }
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch:{ all -> 0x2a34 }
            r1.A0Y = r4     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r5 = 1
            X.4Y0 r0 = new X.4Y0     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x2a34 }
            r2.A0A = r0     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 1
            r34 = r2
            r35 = r4
            r36 = r0
            r34.A0G(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2a34 }
        L_0x1159:
            r1.A21()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r5 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r0 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r0]     // Catch:{ all -> 0x2a34 }
            X.6YP r2 = r1.A5Z     // Catch:{ all -> 0x2a34 }
            X.3Xg r0 = new X.3Xg     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2)     // Catch:{ all -> 0x2a34 }
            r4[r12] = r0     // Catch:{ all -> 0x2a34 }
            r5.setFilters(r4)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r4 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131430928(0x7f0b0e10, float:1.848357E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            r4.A03 = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131433088(0x7f0b1680, float:1.8487952E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ all -> 0x2a34 }
            r1.A0Z = r0     // Catch:{ all -> 0x2a34 }
            X.0v5 r0 = r1.A0s     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A05()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x119f
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C55942vR.A00(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x11f4
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x11f4
        L_0x119f:
            android.widget.FrameLayout r2 = r1.A0Z     // Catch:{ all -> 0x2a34 }
            r0 = 8
            r2.setVisibility(r0)     // Catch:{ all -> 0x2a34 }
        L_0x11a6:
            X.1tl r0 = r1.A55     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x11d7
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131431569(0x7f0b1091, float:1.848487E38)
            android.view.ViewGroup r35 = X.C36421kH.A0E(r2, r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r6 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.1tl r5 = r1.A55     // Catch:{ all -> 0x2a34 }
            X.012 r36 = A07(r1)     // Catch:{ all -> 0x2a34 }
            X.1NM r4 = r1.A2a     // Catch:{ all -> 0x2a34 }
            X.1am r2 = r1.A2h     // Catch:{ all -> 0x2a34 }
            X.3dg r0 = new X.3dg     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r37 = r4
            r38 = r2
            r39 = r6
            r40 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2a34 }
            X.3dh r2 = new X.3dh     // Catch:{ all -> 0x2a34 }
            r2.<init>(r1)     // Catch:{ all -> 0x2a34 }
            r0.A00 = r2     // Catch:{ all -> 0x2a34 }
        L_0x11d7:
            X.0yC r4 = r1.A3n     // Catch:{ all -> 0x2a34 }
            X.0yV r25 = X.C21000yV.A01     // Catch:{ all -> 0x2a34 }
            r2 = 4093(0xffd, float:5.736E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r0, r4, r2)     // Catch:{ all -> 0x2a34 }
            r11 = 0
            if (r0 == 0) goto L_0x1221
            X.0yC r4 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r2 = 6004(0x1774, float:8.413E-42)
            r0 = r25
            boolean r2 = X.C20800yB.A01(r0, r4, r2)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            if (r2 != 0) goto L_0x1222
            goto L_0x1221
        L_0x11f4:
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 5811(0x16b3, float:8.143E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1207
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C197029b1.A00(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1207
            goto L_0x119f
        L_0x1207:
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x121d
            r0 = 47
            X.3v4 r2 = X.C80233v4.A00(r1, r0)     // Catch:{ all -> 0x2a34 }
            r1.A63 = r2     // Catch:{ all -> 0x2a34 }
            X.0wU r0 = r1.A5S     // Catch:{ all -> 0x2a34 }
            r0.Boy(r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x11a6
        L_0x121d:
            A0h(r1)     // Catch:{ all -> 0x2a34 }
            goto L_0x11a6
        L_0x1221:
            r0 = 0
        L_0x1222:
            r1.A6J = r0     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r0 = r2 instanceof X.C28981Uw     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1231
            boolean r0 = r1.A6O     // Catch:{ all -> 0x2a34 }
            X.1Uw r2 = (X.C28981Uw) r2     // Catch:{ all -> 0x2a34 }
            r1.A1U(r2, r0)     // Catch:{ all -> 0x2a34 }
        L_0x1231:
            com.whatsapp.conversation.ConversationListView r0 = r1.A2U     // Catch:{ all -> 0x2a34 }
            r2 = r23
            r0.setAdapter(r2)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r10.A0Y     // Catch:{ all -> 0x2a34 }
            X.1Si r2 = r1.A4I     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x12ac
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r2.A0B(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r1.A6T = r0     // Catch:{ all -> 0x2a34 }
            X.1NM r4 = r1.A2a     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            r4.A0B(r2, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "fromNotification"
            boolean r0 = r2.getBooleanExtra(r0, r12)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1287
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "last_notification_keep_in_chat"
            boolean r0 = r2.getBooleanExtra(r0, r12)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1287
            X.3Fy r0 = r1.A3h     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            X.01z r4 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x2a34 }
            r5 = 0
            X.AnonymousClass00C.A0D(r4, r12)     // Catch:{ all -> 0x2a34 }
            X.0v0 r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.AnonymousClass3OP.A00(r4, r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1287
            r0 = 1
            X.C36371kC.A1C(r2, r4, r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A0N = r5     // Catch:{ all -> 0x2a34 }
        L_0x1287:
            X.0v0 r0 = r1.A35     // Catch:{ all -> 0x2a34 }
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "newsletter_message_received"
            X.C36331k8.A0w(r2, r0, r12)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r10.A0X     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x12bb
            X.1gO r0 = r1.A4J     // Catch:{ all -> 0x2a34 }
            r0.A02()     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r10.A0P     // Catch:{ all -> 0x2a34 }
            if (r5 == 0) goto L_0x12b1
            X.1PW r4 = r1.A26     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = "show_vc_lobby"
            X.6Up r0 = new X.6Up     // Catch:{ all -> 0x2a34 }
            r0.<init>((java.lang.String) r2, (java.lang.Object) r5)     // Catch:{ all -> 0x2a34 }
            r4.A00(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x12b1
        L_0x12ac:
            r0 = 1
            r2.A0H(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x1287
        L_0x12b1:
            if (r16 == 0) goto L_0x12bb
            X.1NM r4 = r1.A2a     // Catch:{ all -> 0x2a34 }
            r2 = 4
            r0 = r16
            r4.A0B(r0, r2)     // Catch:{ all -> 0x2a34 }
        L_0x12bb:
            r1.A6Z = r12     // Catch:{ all -> 0x2a34 }
            android.content.Intent r2 = r1.A0A     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "ig_post_url"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x12cb
            r0 = 1
            A1N(r1, r0)     // Catch:{ all -> 0x2a34 }
        L_0x12cb:
            boolean r0 = r10.A0a     // Catch:{ all -> 0x2a34 }
            r16 = 0
            if (r0 == 0) goto L_0x147a
            boolean r0 = r1.A66     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x147a
            boolean r0 = r10.A0U     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x147a
            X.319 r0 = r1.A2W     // Catch:{ all -> 0x2a34 }
            java.util.HashMap r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r2.remove(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2U     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r2.A0O = r0     // Catch:{ all -> 0x2a34 }
            java.util.ArrayList r6 = r10.A0Q     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x131d
            X.1XY r7 = r1.A1Z     // Catch:{ all -> 0x1506 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x1506 }
            java.util.List r40 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x1506 }
            java.lang.String r5 = r10.A0H     // Catch:{ all -> 0x1506 }
            int r4 = r10.A00     // Catch:{ all -> 0x1506 }
            boolean r2 = r10.A0W     // Catch:{ all -> 0x1506 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x1506 }
            X.155 r36 = A0C(r1)     // Catch:{ all -> 0x1506 }
            X.3cV r0 = new X.3cV     // Catch:{ all -> 0x1506 }
            r0.<init>(r1)     // Catch:{ all -> 0x1506 }
            r43 = 38
            r44 = 0
            r34 = r7
            r37 = r0
            r38 = r16
            r39 = r5
            r41 = r6
            r42 = r4
            r45 = r2
            r34.A03(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x1506 }
            goto L_0x147a
        L_0x131d:
            int r2 = r10.A01     // Catch:{ all -> 0x2a34 }
            r0 = 4
            if (r2 != r0) goto L_0x1374
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0wG r6 = r0.getWAContext()     // Catch:{ all -> 0x2a34 }
            X.16D r5 = r0.getContactManager()     // Catch:{ all -> 0x2a34 }
            X.0yb r4 = r1.A31     // Catch:{ all -> 0x2a34 }
            X.0ts r0 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.3Ql r2 = new X.3Ql     // Catch:{ all -> 0x2a34 }
            r2.<init>(r5, r4, r6, r0)     // Catch:{ all -> 0x2a34 }
            X.1N4 r4 = r1.A0y     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r10.A0O     // Catch:{ all -> 0x2a34 }
            X.0ts r0 = r2.A03     // Catch:{ 1YJ -> 0x1456 }
            X.3Ow r7 = new X.3Ow     // Catch:{ 1YJ -> 0x1456 }
            r7.<init>(r4, r0)     // Catch:{ 1YJ -> 0x1456 }
            r2.A05(r5)     // Catch:{ 1YJ -> 0x1456 }
            X.3Sx r6 = r2.A04     // Catch:{ 1YJ -> 0x1456 }
            java.util.List r0 = r6.A06     // Catch:{ 1YJ -> 0x1456 }
            if (r0 == 0) goto L_0x1461
            X.16D r4 = r2.A00     // Catch:{ 1YJ -> 0x1456 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 1YJ -> 0x1456 }
        L_0x134f:
            boolean r0 = r9.hasNext()     // Catch:{ 1YJ -> 0x1456 }
            if (r0 == 0) goto L_0x136e
            java.lang.Object r2 = r9.next()     // Catch:{ 1YJ -> 0x1456 }
            X.39e r2 = (X.C607439e) r2     // Catch:{ 1YJ -> 0x1456 }
            java.lang.String r0 = r2.A02     // Catch:{ 1YJ -> 0x1456 }
            X.141 r0 = r4.A0F(r0)     // Catch:{ 1YJ -> 0x1456 }
            if (r0 == 0) goto L_0x134f
            r8 = r19
            com.whatsapp.jid.Jid r0 = r0.A06(r8)     // Catch:{ 1YJ -> 0x1456 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ 1YJ -> 0x1456 }
            r2.A01 = r0     // Catch:{ 1YJ -> 0x1456 }
            goto L_0x134f
        L_0x136e:
            java.lang.String r5 = r7.A01(r6)     // Catch:{ 1YJ -> 0x1456 }
            goto L_0x1461
        L_0x1374:
            r0 = 14
            if (r2 != r0) goto L_0x138d
            X.1X4 r5 = A0A(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            java.util.ArrayList r4 = r10.A0R     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A6F     // Catch:{ all -> 0x2a34 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2a34 }
            r6 = r16
            r5.A0Z(r6, r0, r4, r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x147a
        L_0x138d:
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x140a
            java.lang.String r6 = r3.A0B     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x140a
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.1YG r4 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r2 = X.C222813r.A00(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.AnonymousClass1YG.A01(r4, r2, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r4 = r3.A07     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x13fe
            X.3HK r2 = r1.A3E     // Catch:{ all -> 0x2a34 }
            boolean r0 = r2.A0U     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x13c0
            boolean r0 = r3.A0H     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x13c0
            int r2 = r2.A0H     // Catch:{ all -> 0x2a34 }
            r0 = 2
            if (r2 == r0) goto L_0x13cb
        L_0x13c0:
            java.util.HashMap r2 = X.C56772wr.A02     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)     // Catch:{ all -> 0x2a34 }
            r2.put(r0, r4)     // Catch:{ all -> 0x2a34 }
        L_0x13cb:
            java.lang.String r5 = r3.A04     // Catch:{ all -> 0x2a34 }
            if (r5 != 0) goto L_0x13d5
            com.whatsapp.jid.UserJid r0 = r3.A01     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x13f7
            java.lang.String r5 = r0.user     // Catch:{ all -> 0x2a34 }
        L_0x13d5:
            boolean r4 = r3.A0H     // Catch:{ all -> 0x2a34 }
            boolean r2 = r3.A0I     // Catch:{ all -> 0x2a34 }
            X.398 r0 = new X.398     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r35 = r5
            r36 = r15
            r37 = r6
            r38 = r4
            r39 = r2
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
            java.util.HashMap r4 = A7c     // Catch:{ all -> 0x2a34 }
            X.141 r2 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r2 = X.C36411kG.A0h(r2)     // Catch:{ all -> 0x2a34 }
            r4.put(r2, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x147a
        L_0x13f7:
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r0.getRawString()     // Catch:{ all -> 0x2a34 }
            goto L_0x13d5
        L_0x13fe:
            java.util.HashMap r2 = X.C56772wr.A02     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)     // Catch:{ all -> 0x2a34 }
            r2.remove(r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x13cb
        L_0x140a:
            java.lang.String r4 = r10.A0L     // Catch:{ all -> 0x2a34 }
            if (r4 == 0) goto L_0x147a
            int r0 = r4.length()     // Catch:{ all -> 0x2a34 }
            if (r0 <= 0) goto L_0x147a
            boolean r0 = r10.A0V     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1424
            java.util.HashMap r2 = X.C56772wr.A02     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)     // Catch:{ all -> 0x2a34 }
            r2.put(r0, r4)     // Catch:{ all -> 0x2a34 }
            goto L_0x147a
        L_0x1424:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1DU r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = r0.A03(r4)     // Catch:{ all -> 0x2a34 }
            X.6tS r35 = X.C64033Mj.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.1X4 r34 = A0A(r1)     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)     // Catch:{ all -> 0x2a34 }
            java.util.List r39 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A6F     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A6H     // Catch:{ all -> 0x2a34 }
            r37 = r16
            r40 = r16
            r36 = r16
            r38 = r4
            r41 = r2
            r42 = r0
            r34.A0I(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2a34 }
            r1.A6H = r12     // Catch:{ all -> 0x2a34 }
            goto L_0x147a
        L_0x1456:
            r0 = move-exception
            X.5Un r2 = new X.5Un     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "addWaIdsToVCard"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x2a34 }
        L_0x1461:
            X.1X4 r34 = A0A(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r4 = r1.A45     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = r10.A0N     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A6F     // Catch:{ all -> 0x2a34 }
            java.util.List r38 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x2a34 }
            r35 = r16
            r36 = r2
            r37 = r5
            r39 = r0
            r34.A0Y(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
        L_0x147a:
            java.util.HashMap r2 = X.C56772wr.A02     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.11F> r5 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r2.get(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x1509
            java.util.HashMap r2 = A7d     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x2a34 }
            java.util.ArrayList r2 = X.C65713Te.A03(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r0.setMentionableText(r4, r2)     // Catch:{ all -> 0x2a34 }
            A10(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r34 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1H2 r38 = r0.getEmojiLoader()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yb r37 = r0.getSystemServices()     // Catch:{ all -> 0x2a34 }
            X.0wg r2 = r1.A4e     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.text.Editable r35 = r0.getEditableText()     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.text.TextPaint r36 = r0.getPaint()     // Catch:{ all -> 0x2a34 }
            r40 = 2131102076(0x7f06097c, float:1.781658E38)
            boolean r0 = r1.A6J     // Catch:{ all -> 0x2a34 }
            r39 = r2
            r41 = r0
            X.AnonymousClass6YV.A0F(r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1DU r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x2a34 }
            java.lang.String r8 = r0.A03(r4)     // Catch:{ all -> 0x2a34 }
            X.1sS r0 = r1.A2z     // Catch:{ all -> 0x2a34 }
            r0.A0V(r8)     // Catch:{ all -> 0x2a34 }
            X.1sS r2 = r1.A2z     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r2.A09 = r0     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x14fa
            X.00s r7 = r2.A0G     // Catch:{ all -> 0x2a34 }
            X.2pW r6 = X.C52492pW.LOADING     // Catch:{ all -> 0x2a34 }
            r9 = r16
            X.3JB r2 = new X.3JB     // Catch:{ all -> 0x2a34 }
            r2.<init>(r9, r6, r9)     // Catch:{ all -> 0x2a34 }
            r7.A0D(r2)     // Catch:{ all -> 0x2a34 }
        L_0x14fa:
            X.1sS r6 = r1.A2z     // Catch:{ all -> 0x1506 }
            X.11F r2 = r1.A45     // Catch:{ all -> 0x1506 }
            X.0u1 r0 = r1.A1k()     // Catch:{ all -> 0x1506 }
            r6.A0U(r2, r0, r8)     // Catch:{ all -> 0x1506 }
            goto L_0x1513
        L_0x1506:
            r0 = move-exception
            goto L_0x0e1c
        L_0x1509:
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r2 = r16
            r0.setText(r2)     // Catch:{ all -> 0x2a34 }
            r1.A0M()     // Catch:{ all -> 0x2a34 }
        L_0x1513:
            boolean r0 = X.AnonymousClass14B.A0F(r4)     // Catch:{ all -> 0x2a34 }
            r2 = 8
            if (r0 == 0) goto L_0x1525
            X.13J r0 = r1.A5I     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.BJo()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1529
            r2 = 0
            goto L_0x1529
        L_0x1525:
            A1B(r1, r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x152c
        L_0x1529:
            A1B(r1, r2)     // Catch:{ all -> 0x2a34 }
        L_0x152c:
            java.util.HashMap r2 = A7c     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Object r9 = r2.get(r0)     // Catch:{ all -> 0x2a34 }
            X.398 r9 = (X.AnonymousClass398) r9     // Catch:{ all -> 0x2a34 }
            if (r9 == 0) goto L_0x15db
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.3IH r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            r2 = 1029386189(0x3d5b2fcd, float:0.053512383)
            X.0ze r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.BMN(r2)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x1554
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.3IH r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "chats_list_screen"
            r2.A01(r0)     // Catch:{ all -> 0x2a34 }
        L_0x1554:
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.1YG r4 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r2 = X.C222813r.A00(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 2
            X.AnonymousClass1YG.A01(r4, r2, r0)     // Catch:{ all -> 0x2a34 }
            X.1sS r2 = r1.A2z     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x2a34 }
            r2.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.36b r0 = r1.A3A     // Catch:{ all -> 0x2a34 }
            X.3IH r5 = r0.A00     // Catch:{ all -> 0x2a34 }
            boolean r0 = r9.A03     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1576
            boolean r0 = r9.A04     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1576
            r11 = 1
        L_0x1576:
            java.lang.String r4 = "preview_load_starts"
            if (r11 == 0) goto L_0x1584
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass000.A0p(r0, r4, r2)     // Catch:{ all -> 0x2a34 }
        L_0x1584:
            r5.A00(r4)     // Catch:{ all -> 0x2a34 }
            X.1sS r8 = r1.A2z     // Catch:{ all -> 0x2a34 }
            X.1DU r4 = r8.A0W     // Catch:{ all -> 0x2a34 }
            X.0ww r2 = r8.A0I     // Catch:{ all -> 0x2a34 }
            X.28U r0 = new X.28U     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C20050ww) r2, (X.AnonymousClass398) r9, (X.AnonymousClass1DU) r4)     // Catch:{ all -> 0x2a34 }
            r8.A01 = r0     // Catch:{ all -> 0x2a34 }
            X.2pW r2 = X.C52492pW.LOADING     // Catch:{ all -> 0x2a34 }
            X.C39471sS.A02(r0, r8, r2)     // Catch:{ all -> 0x2a34 }
            X.3E3 r7 = new X.3E3     // Catch:{ all -> 0x2a34 }
            r7.<init>(r8, r3, r9)     // Catch:{ all -> 0x2a34 }
            X.17Y r6 = r8.A0H     // Catch:{ all -> 0x2a34 }
            X.0wU r5 = r8.A0c     // Catch:{ all -> 0x2a34 }
            X.19A r4 = r8.A0Y     // Catch:{ all -> 0x2a34 }
            X.19J r2 = r8.A0J     // Catch:{ all -> 0x2a34 }
            X.3pe r0 = new X.3pe     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r35 = r6
            r36 = r2
            r37 = r7
            r38 = r4
            r39 = r5
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2a34 }
            X.0wU r2 = r0.A07     // Catch:{ all -> 0x2a34 }
            X.C81193wc.A01(r2, r0, r9, r14)     // Catch:{ all -> 0x2a34 }
            java.util.List r5 = r8.A0d     // Catch:{ all -> 0x2a34 }
            r4 = 3
            X.3wU r2 = new X.3wU     // Catch:{ all -> 0x2a34 }
            r2.<init>((java.lang.Object) r0, (int) r4)     // Catch:{ all -> 0x2a34 }
            r5.add(r2)     // Catch:{ all -> 0x2a34 }
            X.00s r4 = r7.A00     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 13
            X.AnonymousClass3UW.A00(r2, r4, r9, r1, r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r3.A0K     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x15db
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.C36421kH.A1D(r0)     // Catch:{ all -> 0x2a34 }
        L_0x15db:
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.3CG r22 = new X.3CG     // Catch:{ all -> 0x2a34 }
            r2 = r22
            r2.<init>(r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A6L     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1855
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.147 r42 = X.C65533Sl.A02(r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A6P     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1604
            X.2VL r2 = new X.2VL     // Catch:{ all -> 0x2a34 }
            r3 = r23
            r0 = r42
            r2.<init>(r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            r1.A3v = r2     // Catch:{ all -> 0x2a34 }
            X.17z r0 = r1.A3w     // Catch:{ all -> 0x2a34 }
            r0.registerObserver(r2)     // Catch:{ all -> 0x2a34 }
        L_0x1604:
            X.2yQ r0 = r1.A1Q     // Catch:{ all -> 0x2a34 }
            X.155 r44 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.141 r5 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.012 r45 = r2.getLifecycleOwner()     // Catch:{ all -> 0x2a34 }
            X.016 r46 = r2.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r0 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.0wo r62 = X.C36351kA.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.0yC r69 = X.C36341k9.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.17Y r48 = X.C36351kA.A0M(r0)     // Catch:{ all -> 0x2a34 }
            X.0wQ r49 = X.C36351kA.A0N(r0)     // Catch:{ all -> 0x2a34 }
            X.0wU r77 = X.C36341k9.A0Z(r0)     // Catch:{ all -> 0x2a34 }
            X.12q r64 = X.C36351kA.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.1H2 r68 = X.C36351kA.A0e(r0)     // Catch:{ all -> 0x2a34 }
            X.1Pp r56 = X.C36361kB.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.16D r57 = X.C36341k9.A0R(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A2G     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.1dv r4 = (X.C32621dv) r4     // Catch:{ all -> 0x2a34 }
            X.1EM r75 = X.C36371kC.A0l(r0)     // Catch:{ all -> 0x2a34 }
            X.13J r76 = X.C36351kA.A0q(r0)     // Catch:{ all -> 0x2a34 }
            X.171 r59 = X.C36341k9.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.0ts r63 = X.C36341k9.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.16I r58 = X.C36351kA.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.0xQ r70 = X.C36361kB.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.1EL r73 = X.C36381kD.A0d(r0)     // Catch:{ all -> 0x2a34 }
            X.1Cd r53 = X.C36371kC.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.1Sq r55 = X.C36391kE.A0b(r0)     // Catch:{ all -> 0x2a34 }
            X.1LV r54 = X.C36361kB.A0U(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A1A     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.1Kc r3 = (X.C26421Kc) r3     // Catch:{ all -> 0x2a34 }
            X.1Op r71 = X.C36381kD.A0c(r0)     // Catch:{ all -> 0x2a34 }
            X.17X r66 = X.C36351kA.A0b(r0)     // Catch:{ all -> 0x2a34 }
            X.1Ps r60 = X.C36361kB.A0W(r0)     // Catch:{ all -> 0x2a34 }
            X.1A5 r65 = X.C36371kC.A0X(r0)     // Catch:{ all -> 0x2a34 }
            X.17z r72 = X.C36371kC.A0c(r0)     // Catch:{ all -> 0x2a34 }
            X.1LI r50 = X.C36361kB.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.1My r0 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.3Qf r61 = X.C27111My.A1G(r0)     // Catch:{ all -> 0x2a34 }
            X.2Gw r0 = new X.2Gw     // Catch:{ all -> 0x2a34 }
            r43 = r0
            r47 = r4
            r51 = r22
            r52 = r3
            r67 = r5
            r74 = r42
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ all -> 0x2a34 }
            r1.A2P = r0     // Catch:{ all -> 0x2a34 }
            X.2yI r2 = r1.A1I     // Catch:{ all -> 0x2a34 }
            X.155 r44 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r52 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r72 = r0
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r84 = r0
            X.1Mz r4 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r4.A01     // Catch:{ all -> 0x2a34 }
            X.0wo r74 = X.C36351kA.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.0yC r88 = X.C36341k9.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.17Y r53 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wQ r54 = X.C36351kA.A0N(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r104 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.12q r78 = X.C36351kA.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.0v6 r45 = X.C19470v6.A00     // Catch:{ all -> 0x2a34 }
            X.0yf r55 = X.C36431kI.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1X4 r56 = X.C36361kB.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.0xf r89 = r2.AzV()     // Catch:{ all -> 0x2a34 }
            X.1MK r61 = X.C36381kD.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1Pp r67 = X.C36361kB.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.16D r68 = X.C36341k9.A0R(r2)     // Catch:{ all -> 0x2a34 }
            X.171 r70 = X.C36341k9.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.13J r103 = X.C36351kA.A0q(r2)     // Catch:{ all -> 0x2a34 }
            X.0ts r76 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.1EM r102 = X.C36371kC.A0l(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A3q     // Catch:{ all -> 0x2a34 }
            java.lang.Object r41 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r41
            X.1NN r0 = (X.AnonymousClass1NN) r0     // Catch:{ all -> 0x2a34 }
            r41 = r0
            X.004 r0 = r2.A6d     // Catch:{ all -> 0x2a34 }
            java.lang.Object r40 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r40
            X.1Nx r0 = (X.C27361Nx) r0     // Catch:{ all -> 0x2a34 }
            r40 = r0
            X.0tt r3 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A4F     // Catch:{ all -> 0x2a34 }
            java.lang.Object r39 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r39
            X.1dx r0 = (X.C32641dx) r0     // Catch:{ all -> 0x2a34 }
            r39 = r0
            X.004 r0 = r2.A1G     // Catch:{ all -> 0x2a34 }
            java.lang.Object r38 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r38
            X.1HP r0 = (X.AnonymousClass1HP) r0     // Catch:{ all -> 0x2a34 }
            r38 = r0
            X.004 r0 = r2.A1W     // Catch:{ all -> 0x2a34 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r37
            X.1AO r0 = (X.AnonymousClass1AO) r0     // Catch:{ all -> 0x2a34 }
            r37 = r0
            X.16I r69 = X.C36351kA.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A1O     // Catch:{ all -> 0x2a34 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r36
            X.1HJ r0 = (X.AnonymousClass1HJ) r0     // Catch:{ all -> 0x2a34 }
            r36 = r0
            X.1NM r73 = X.C36401kF.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1CR r99 = X.C36371kC.A0j(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A1k     // Catch:{ all -> 0x2a34 }
            java.lang.Object r35 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r35
            X.67L r0 = (X.AnonymousClass67L) r0     // Catch:{ all -> 0x2a34 }
            r35 = r0
            X.1Cd r62 = X.C36371kC.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.1Sq r66 = X.C36391kE.A0b(r2)     // Catch:{ all -> 0x2a34 }
            X.1Pr r87 = X.C36381kD.A0b(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A8e     // Catch:{ all -> 0x2a34 }
            java.lang.Object r34 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r34
            X.1YR r0 = (X.AnonymousClass1YR) r0     // Catch:{ all -> 0x2a34 }
            r34 = r0
            X.004 r0 = r2.A7V     // Catch:{ all -> 0x2a34 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1b9 r15 = (X.C31021b9) r15     // Catch:{ all -> 0x2a34 }
            X.1LU r86 = X.C36411kG.A0e(r2)     // Catch:{ all -> 0x2a34 }
            X.0v0 r75 = X.C36351kA.A0Y(r2)     // Catch:{ all -> 0x2a34 }
            X.1LV r65 = X.C36361kB.A0U(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A4M     // Catch:{ all -> 0x2a34 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1HO r14 = (X.AnonymousClass1HO) r14     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A61     // Catch:{ all -> 0x2a34 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.17r r13 = (X.C232317r) r13     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A7W     // Catch:{ all -> 0x2a34 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1bA r11 = (X.C31031bA) r11     // Catch:{ all -> 0x2a34 }
            X.19g r85 = X.C36381kD.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.1My r0 = r4.A00     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r0.A2R     // Catch:{ all -> 0x2a34 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.3C4 r9 = (X.AnonymousClass3C4) r9     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A1p     // Catch:{ all -> 0x2a34 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1T4 r8 = (X.AnonymousClass1T4) r8     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r0.A2S     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.3C5 r7 = (X.AnonymousClass3C5) r7     // Catch:{ all -> 0x2a34 }
            X.17X r80 = X.C36351kA.A0b(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r3.A11     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.3Nh r6 = (X.C64263Nh) r6     // Catch:{ all -> 0x2a34 }
            X.1Ps r71 = X.C36361kB.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1A5 r79 = X.C36371kC.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r2.A2n     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.1Jx r5 = (X.C26371Jx) r5     // Catch:{ all -> 0x2a34 }
            X.17z r91 = X.C36371kC.A0c(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A1K     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.4PT r4 = (X.AnonymousClass4PT) r4     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r0.A2T     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.2zB r3 = (X.C58012zB) r3     // Catch:{ all -> 0x2a34 }
            X.1EL r92 = X.C36381kD.A0d(r2)     // Catch:{ all -> 0x2a34 }
            X.2tw r95 = new X.2tw     // Catch:{ all -> 0x2a34 }
            r95.<init>()     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A8w     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1Pj r0 = (X.C27701Pj) r0     // Catch:{ all -> 0x2a34 }
            X.2H1 r16 = new X.2H1     // Catch:{ all -> 0x2a34 }
            r47 = r45
            r48 = r45
            r43 = r16
            r46 = r45
            r49 = r9
            r50 = r7
            r51 = r3
            r57 = r22
            r58 = r4
            r59 = r35
            r60 = r0
            r63 = r37
            r64 = r8
            r77 = r36
            r81 = r14
            r82 = r13
            r83 = r34
            r90 = r41
            r93 = r42
            r94 = r39
            r96 = r40
            r97 = r15
            r98 = r11
            r100 = r6
            r101 = r5
            r105 = r38
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105)     // Catch:{ all -> 0x2a34 }
        L_0x183d:
            boolean r0 = r1.A6B     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x184c
            X.28d r2 = r1.A2P     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x184c
            androidx.appcompat.widget.Toolbar r0 = r1.A0j     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r0, r12)     // Catch:{ all -> 0x2a34 }
            r2.A0C = r0     // Catch:{ all -> 0x2a34 }
        L_0x184c:
            X.28d r2 = r1.A2P     // Catch:{ all -> 0x2a34 }
            r0 = r106
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x1e84
        L_0x1855:
            boolean r0 = r1.A6M     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1983
            X.11F r3 = r1.A45     // Catch:{ all -> 0x2a34 }
            android.os.Parcelable$Creator r0 = X.C177538dx.CREATOR     // Catch:{ all -> 0x2a34 }
            boolean r0 = r3 instanceof X.C177538dx     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1980
            X.8dx r3 = (X.C177538dx) r3     // Catch:{ all -> 0x2a34 }
        L_0x1863:
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r51 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            X.17Y r37 = A09(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0wQ r38 = r0.getMeManager()     // Catch:{ all -> 0x2a34 }
            X.0wU r56 = A0K(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1H2 r50 = r0.getEmojiLoader()     // Catch:{ all -> 0x2a34 }
            X.1Pp r0 = r1.A2H     // Catch:{ all -> 0x2a34 }
            r16 = r0
            X.1dv r15 = r1.A0x     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1EM r54 = r0.getGroupChatUtils()     // Catch:{ all -> 0x2a34 }
            X.13J r14 = r1.A5I     // Catch:{ all -> 0x2a34 }
            X.171 r45 = r0.getWAContactNames()     // Catch:{ all -> 0x2a34 }
            X.0ts r13 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.16I r11 = r1.A2I     // Catch:{ all -> 0x2a34 }
            X.1Cd r9 = r1.A28     // Catch:{ all -> 0x2a34 }
            X.1Kc r8 = r1.A1n     // Catch:{ all -> 0x2a34 }
            X.1Ps r7 = r1.A2M     // Catch:{ all -> 0x2a34 }
            X.1A5 r6 = r1.A3P     // Catch:{ all -> 0x2a34 }
            X.17z r5 = r1.A3w     // Catch:{ all -> 0x2a34 }
            X.1LI r4 = r1.A1e     // Catch:{ all -> 0x2a34 }
            X.141 r2 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.2Gu r0 = new X.2Gu     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r36 = r15
            r39 = r4
            r40 = r22
            r41 = r8
            r42 = r9
            r43 = r16
            r44 = r11
            r46 = r7
            r47 = r13
            r48 = r6
            r49 = r2
            r52 = r5
            r53 = r3
            r55 = r14
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ all -> 0x2a34 }
            r1.A2P = r0     // Catch:{ all -> 0x2a34 }
            X.2xz r0 = r1.A13     // Catch:{ all -> 0x2a34 }
            X.141 r11 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r42 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r9 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r0 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r60 = X.C36341k9.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.17Y r43 = X.C36351kA.A0M(r0)     // Catch:{ all -> 0x2a34 }
            X.0wQ r44 = X.C36351kA.A0N(r0)     // Catch:{ all -> 0x2a34 }
            X.0wU r68 = X.C36341k9.A0Z(r0)     // Catch:{ all -> 0x2a34 }
            X.12q r56 = X.C36351kA.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.0v6 r36 = X.C19470v6.A00     // Catch:{ all -> 0x2a34 }
            X.0yf r45 = X.C36431kI.A0W(r0)     // Catch:{ all -> 0x2a34 }
            X.1X4 r46 = X.C36361kB.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.0xf r61 = r0.AzV()     // Catch:{ all -> 0x2a34 }
            X.1MK r48 = X.C36381kD.A0W(r0)     // Catch:{ all -> 0x2a34 }
            X.13J r67 = X.C36351kA.A0q(r0)     // Catch:{ all -> 0x2a34 }
            X.0ts r55 = X.C36341k9.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.0tt r4 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r4.A4F     // Catch:{ all -> 0x2a34 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1dx r8 = (X.C32641dx) r8     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r0.A1W     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1AO r7 = (X.AnonymousClass1AO) r7     // Catch:{ all -> 0x2a34 }
            X.16I r51 = X.C36351kA.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.1NM r53 = X.C36401kF.A0W(r0)     // Catch:{ all -> 0x2a34 }
            X.1CR r65 = X.C36371kC.A0j(r0)     // Catch:{ all -> 0x2a34 }
            X.1Cd r49 = X.C36371kC.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.0v0 r54 = X.C36351kA.A0Y(r0)     // Catch:{ all -> 0x2a34 }
            X.19g r59 = X.C36381kD.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.1My r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A2R     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.3C4 r6 = (X.AnonymousClass3C4) r6     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A2S     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.3C5 r5 = (X.AnonymousClass3C5) r5     // Catch:{ all -> 0x2a34 }
            X.1A5 r57 = X.C36371kC.A0X(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r0.A2n     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1Jx r4 = (X.C26371Jx) r4     // Catch:{ all -> 0x2a34 }
            X.17z r62 = X.C36371kC.A0c(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A2T     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.2zB r0 = (X.C58012zB) r0     // Catch:{ all -> 0x2a34 }
            X.2Gz r16 = new X.2Gz     // Catch:{ all -> 0x2a34 }
            r38 = r36
            r34 = r16
            r37 = r36
            r39 = r6
            r40 = r5
            r41 = r0
            r47 = r22
            r50 = r7
            r52 = r9
            r58 = r11
            r63 = r3
            r64 = r8
            r66 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)     // Catch:{ all -> 0x2a34 }
            goto L_0x183d
        L_0x1980:
            r3 = 0
            goto L_0x1863
        L_0x1983:
            boolean r0 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1b3c
            X.3BF r0 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.2yU r2 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.3Ro r3 = X.C28981Uw.A03     // Catch:{ all -> 0x2a34 }
            boolean r3 = r0 instanceof X.C28981Uw     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x1b39
            X.1Uw r0 = (X.C28981Uw) r0     // Catch:{ all -> 0x2a34 }
        L_0x199d:
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x2a34 }
            X.141 r9 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            android.content.Intent r3 = r1.A0A     // Catch:{ all -> 0x2a34 }
            java.lang.String r7 = "wamo_pc_id"
            java.lang.String r62 = r3.getStringExtra(r7)     // Catch:{ all -> 0x2a34 }
            X.1Mz r3 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r3.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r54 = X.C36341k9.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.17Y r38 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wQ r39 = X.C36351kA.A0N(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r61 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.12q r50 = X.C36351kA.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.1H2 r53 = X.C36351kA.A0e(r2)     // Catch:{ all -> 0x2a34 }
            X.1Pp r44 = X.C36361kB.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A2G     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1dv r6 = (X.C32621dv) r6     // Catch:{ all -> 0x2a34 }
            X.13J r60 = X.C36351kA.A0q(r2)     // Catch:{ all -> 0x2a34 }
            X.171 r46 = X.C36341k9.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.0ts r49 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.1EM r59 = X.C36371kC.A0l(r2)     // Catch:{ all -> 0x2a34 }
            X.16I r45 = X.C36351kA.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.1Cd r43 = X.C36371kC.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A1A     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1Kc r5 = (X.C26421Kc) r5     // Catch:{ all -> 0x2a34 }
            X.1Ps r47 = X.C36361kB.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1A5 r51 = X.C36371kC.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.17z r55 = X.C36371kC.A0c(r2)     // Catch:{ all -> 0x2a34 }
            X.1My r3 = r3.A00     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r3.A1M     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.2yS r4 = (X.C57572yS) r4     // Catch:{ all -> 0x2a34 }
            X.1LI r40 = X.C36361kB.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.0wo r48 = X.C36351kA.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.0tt r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r2.A2u     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.3Ov r3 = (X.C64633Ov) r3     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r2.A2w     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.3G3 r2 = (X.AnonymousClass3G3) r2     // Catch:{ all -> 0x2a34 }
            X.2Gy r8 = new X.2Gy     // Catch:{ all -> 0x2a34 }
            r34 = r8
            r36 = r6
            r37 = r4
            r41 = r22
            r42 = r5
            r52 = r9
            r56 = r0
            r57 = r3
            r58 = r2
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ all -> 0x2a34 }
            r1.A2P = r8     // Catch:{ all -> 0x2a34 }
            X.3BF r0 = A0G(r1)     // Catch:{ all -> 0x2a34 }
            X.2yR r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r45 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r55 = r0
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r69 = r0
            X.141 r15 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            android.content.Intent r0 = r1.A0A     // Catch:{ all -> 0x2a34 }
            r0.getStringExtra(r7)     // Catch:{ all -> 0x2a34 }
            X.1Mz r0 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r0.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r66 = X.C36341k9.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.17Y r46 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wQ r47 = X.C36351kA.A0N(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r76 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.12q r62 = X.C36351kA.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.0v6 r36 = X.C19470v6.A00     // Catch:{ all -> 0x2a34 }
            X.0yf r48 = X.C36431kI.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1X4 r49 = X.C36361kB.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.0xf r67 = r2.AzV()     // Catch:{ all -> 0x2a34 }
            X.1MK r51 = X.C36381kD.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.0ts r60 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r2.A1W     // Catch:{ all -> 0x2a34 }
            java.lang.Object r14 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.1AO r14 = (X.AnonymousClass1AO) r14     // Catch:{ all -> 0x2a34 }
            X.16I r54 = X.C36351kA.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.1NM r56 = X.C36401kF.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1CR r74 = X.C36371kC.A0j(r2)     // Catch:{ all -> 0x2a34 }
            X.1Cd r52 = X.C36371kC.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.0v0 r59 = X.C36351kA.A0Y(r2)     // Catch:{ all -> 0x2a34 }
            X.19g r65 = X.C36381kD.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.1My r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A2R     // Catch:{ all -> 0x2a34 }
            java.lang.Object r13 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.3C4 r13 = (X.AnonymousClass3C4) r13     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A2S     // Catch:{ all -> 0x2a34 }
            java.lang.Object r11 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.3C5 r11 = (X.AnonymousClass3C5) r11     // Catch:{ all -> 0x2a34 }
            X.1A5 r63 = X.C36371kC.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r2.A2n     // Catch:{ all -> 0x2a34 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.1Jx r9 = (X.C26371Jx) r9     // Catch:{ all -> 0x2a34 }
            X.17z r68 = X.C36371kC.A0c(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A2T     // Catch:{ all -> 0x2a34 }
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.2zB r8 = (X.C58012zB) r8     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A1M     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.2yS r7 = (X.C57572yS) r7     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r0.A35     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.2yT r6 = (X.C57582yT) r6     // Catch:{ all -> 0x2a34 }
            X.0tt r3 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r3.A4F     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1dx r5 = (X.C32641dx) r5     // Catch:{ all -> 0x2a34 }
            X.0wo r58 = X.C36351kA.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A1f     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1DP r4 = (X.AnonymousClass1DP) r4     // Catch:{ all -> 0x2a34 }
            X.1dD r72 = X.C36431kI.A0n(r2)     // Catch:{ all -> 0x2a34 }
            X.0yb r57 = X.C36351kA.A0U(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r3 = r3.A2w     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2a34 }
            X.3G3 r3 = (X.AnonymousClass3G3) r3     // Catch:{ all -> 0x2a34 }
            X.1GQ r71 = X.C36371kC.A0f(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r0.A3E     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.0v5 r0 = (X.C19460v5) r0     // Catch:{ all -> 0x2a34 }
            X.2H2 r16 = new X.2H2     // Catch:{ all -> 0x2a34 }
            r38 = r36
            r34 = r16
            r37 = r36
            r39 = r0
            r40 = r7
            r41 = r6
            r42 = r13
            r43 = r11
            r44 = r8
            r50 = r22
            r53 = r14
            r61 = r4
            r64 = r15
            r70 = r5
            r73 = r3
            r75 = r9
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76)     // Catch:{ all -> 0x2a34 }
            goto L_0x183d
        L_0x1b39:
            r0 = 0
            goto L_0x199d
        L_0x1b3c:
            X.1K3 r2 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r0 = r2.BLD(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1c11
            X.1K3 r0 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2.getGlobalUI()     // Catch:{ all -> 0x2a34 }
            X.11F r3 = r1.A45     // Catch:{ all -> 0x2a34 }
            android.widget.LinearLayout r9 = r1.A0e     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r4 = r1.A0R     // Catch:{ all -> 0x2a34 }
            android.view.Window r8 = A05(r1)     // Catch:{ all -> 0x2a34 }
            X.141 r11 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.155 r7 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1K4 r0 = (X.AnonymousClass1K4) r0     // Catch:{ all -> 0x2a34 }
            r2 = 1
            X.AnonymousClass00C.A0D(r3, r2)     // Catch:{ all -> 0x2a34 }
            r2 = 2
            X.AnonymousClass00C.A0D(r9, r2)     // Catch:{ all -> 0x2a34 }
            r2 = 3
            X.AnonymousClass00C.A0D(r4, r2)     // Catch:{ all -> 0x2a34 }
            r2 = 4
            X.C36421kH.A1J(r8, r2, r11)     // Catch:{ all -> 0x2a34 }
            r2 = 7
            X.AnonymousClass00C.A0D(r7, r2)     // Catch:{ all -> 0x2a34 }
            X.1LH r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.0w4 r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0yC r52 = X.C36341k9.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.17Y r37 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wQ r38 = X.C36351kA.A0N(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r57 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.1H2 r51 = X.C36351kA.A0e(r2)     // Catch:{ all -> 0x2a34 }
            X.1Pp r44 = X.C36361kB.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A2G     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1dv r6 = (X.C32621dv) r6     // Catch:{ all -> 0x2a34 }
            X.1EM r55 = X.C36371kC.A0l(r2)     // Catch:{ all -> 0x2a34 }
            X.13J r56 = X.C36351kA.A0q(r2)     // Catch:{ all -> 0x2a34 }
            X.171 r46 = X.C36341k9.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.0ts r48 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.16I r45 = X.C36351kA.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A0x     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1K3 r5 = (X.AnonymousClass1K3) r5     // Catch:{ all -> 0x2a34 }
            X.1Cd r43 = X.C36371kC.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r4 = r2.A1A     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2a34 }
            X.1Kc r4 = (X.C26421Kc) r4     // Catch:{ all -> 0x2a34 }
            X.1Ps r47 = X.C36361kB.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1A5 r49 = X.C36371kC.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.17z r53 = X.C36371kC.A0c(r2)     // Catch:{ all -> 0x2a34 }
            X.1LI r39 = X.C36361kB.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.2Gv r2 = new X.2Gv     // Catch:{ all -> 0x2a34 }
            r34 = r2
            r35 = r7
            r36 = r6
            r40 = r22
            r41 = r4
            r42 = r5
            r50 = r11
            r54 = r3
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)     // Catch:{ all -> 0x2a34 }
            X.04H r5 = X.C36441kJ.A0b(r7)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel> r4 = com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel.class
            X.04R r4 = r5.A00(r4)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r4 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r4     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.BLC(r3)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1bff
            X.AnonymousClass1K4.A00(r9, r8, r7, r4, r3)     // Catch:{ all -> 0x2a34 }
        L_0x1bff:
            X.011 r2 = X.C36441kJ.A19(r2, r4)     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x2a34 }
            X.28d r0 = (X.AnonymousClass28d) r0     // Catch:{ all -> 0x2a34 }
            r1.A2P = r0     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r2.second     // Catch:{ all -> 0x2a34 }
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r0 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r0     // Catch:{ all -> 0x2a34 }
            r1.A21 = r0     // Catch:{ all -> 0x2a34 }
            goto L_0x183d
        L_0x1c11:
            X.2yH r0 = r1.A1H     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1A5 r13 = r1.A3P     // Catch:{ all -> 0x2a34 }
            X.11F r11 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x2a34 }
            X.141 r9 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.012 r36 = r2.getLifecycleOwner()     // Catch:{ all -> 0x2a34 }
            X.016 r37 = r2.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.1Mz r3 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r0 = r3.A01     // Catch:{ all -> 0x2a34 }
            X.0wo r52 = X.C36351kA.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.0yC r59 = X.C36341k9.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.17Y r40 = X.C36351kA.A0M(r0)     // Catch:{ all -> 0x2a34 }
            X.0wQ r41 = X.C36351kA.A0N(r0)     // Catch:{ all -> 0x2a34 }
            X.0wU r68 = X.C36341k9.A0Z(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A99     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.164 r7 = (X.AnonymousClass164) r7     // Catch:{ all -> 0x2a34 }
            X.12q r55 = X.C36351kA.A0a(r0)     // Catch:{ all -> 0x2a34 }
            X.1H2 r58 = X.C36351kA.A0e(r0)     // Catch:{ all -> 0x2a34 }
            X.0xf r60 = r0.AzV()     // Catch:{ all -> 0x2a34 }
            X.1Sf r64 = X.C36431kI.A0v(r0)     // Catch:{ all -> 0x2a34 }
            X.1Pp r47 = X.C36361kB.A0V(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A2G     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1dv r6 = (X.C32621dv) r6     // Catch:{ all -> 0x2a34 }
            X.1EM r66 = X.C36371kC.A0l(r0)     // Catch:{ all -> 0x2a34 }
            X.13J r67 = X.C36351kA.A0q(r0)     // Catch:{ all -> 0x2a34 }
            X.171 r49 = X.C36341k9.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.0ts r53 = X.C36341k9.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A9L     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1El r5 = (X.C24961El) r5     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A8u     // Catch:{ all -> 0x2a34 }
            X.005 r70 = X.C18840tu.A00(r2)     // Catch:{ all -> 0x2a34 }
            X.16I r48 = X.C36351kA.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.1Cd r46 = X.C36371kC.A0T(r0)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A0x     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1K3 r2 = (X.AnonymousClass1K3) r2     // Catch:{ all -> 0x2a34 }
            X.1GC r38 = X.C19460v5.A01(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r0.A1A     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1Kc r4 = (X.C26421Kc) r4     // Catch:{ all -> 0x2a34 }
            X.1Ps r50 = X.C36361kB.A0W(r0)     // Catch:{ all -> 0x2a34 }
            X.17z r61 = X.C36371kC.A0c(r0)     // Catch:{ all -> 0x2a34 }
            X.0tt r2 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r2.A0E     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.1dE r2 = (X.C32251dE) r2     // Catch:{ all -> 0x2a34 }
            X.004 r8 = r0.A26     // Catch:{ all -> 0x2a34 }
            X.005 r71 = X.C18840tu.A00(r8)     // Catch:{ all -> 0x2a34 }
            X.1My r3 = r3.A00     // Catch:{ all -> 0x2a34 }
            X.004 r8 = r3.A0N     // Catch:{ all -> 0x2a34 }
            X.005 r72 = X.C18840tu.A00(r8)     // Catch:{ all -> 0x2a34 }
            X.1LI r42 = X.C36361kB.A0S(r0)     // Catch:{ all -> 0x2a34 }
            X.1YG r54 = X.C18800tq.A7W(r0)     // Catch:{ all -> 0x2a34 }
            X.1CF r62 = X.C36361kB.A0b(r0)     // Catch:{ all -> 0x2a34 }
            X.3Qf r51 = X.C27111My.A1G(r3)     // Catch:{ all -> 0x2a34 }
            X.2Gx r0 = new X.2Gx     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r39 = r6
            r43 = r7
            r44 = r22
            r45 = r4
            r56 = r13
            r57 = r9
            r63 = r11
            r65 = r2
            r69 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)     // Catch:{ all -> 0x2a34 }
            r1.A2P = r0     // Catch:{ all -> 0x2a34 }
            boolean r0 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x183d
            X.2y8 r2 = r1.A1A     // Catch:{ all -> 0x2a34 }
            X.155 r42 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r51 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r74 = r0
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r94 = r0
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r84 = r0
            X.1Mz r3 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r3.A01     // Catch:{ all -> 0x2a34 }
            X.0yC r88 = X.C36341k9.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.17Y r52 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wQ r54 = X.C36351kA.A0N(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r103 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.12q r81 = X.C36351kA.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.0v6 r43 = X.C19470v6.A00     // Catch:{ all -> 0x2a34 }
            X.0yW r90 = X.C36351kA.A0g(r2)     // Catch:{ all -> 0x2a34 }
            X.0yf r55 = X.C36431kI.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1X4 r56 = X.C36361kB.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.0xf r89 = r2.AzV()     // Catch:{ all -> 0x2a34 }
            X.1e2 r53 = X.C36371kC.A0R(r2)     // Catch:{ all -> 0x2a34 }
            X.1Dv r47 = X.C36351kA.A0J(r2)     // Catch:{ all -> 0x2a34 }
            X.1MK r65 = X.C36381kD.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.16D r68 = X.C36341k9.A0R(r2)     // Catch:{ all -> 0x2a34 }
            X.13J r102 = X.C36351kA.A0q(r2)     // Catch:{ all -> 0x2a34 }
            X.171 r72 = X.C36341k9.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.0ts r79 = X.C36341k9.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A7k     // Catch:{ all -> 0x2a34 }
            java.lang.Object r40 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r40
            X.62F r0 = (X.AnonymousClass62F) r0     // Catch:{ all -> 0x2a34 }
            r40 = r0
            X.0tt r4 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r4.A4F     // Catch:{ all -> 0x2a34 }
            java.lang.Object r39 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r39
            X.1dx r0 = (X.C32641dx) r0     // Catch:{ all -> 0x2a34 }
            r39 = r0
            X.004 r0 = r2.A1W     // Catch:{ all -> 0x2a34 }
            java.lang.Object r38 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r38
            X.1AO r0 = (X.AnonymousClass1AO) r0     // Catch:{ all -> 0x2a34 }
            r38 = r0
            X.16I r70 = X.C36351kA.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.1NG r62 = X.C36381kD.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A4O     // Catch:{ all -> 0x2a34 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r37
            X.1Cv r0 = (X.C24541Cv) r0     // Catch:{ all -> 0x2a34 }
            r37 = r0
            X.1NM r76 = X.C36401kF.A0W(r2)     // Catch:{ all -> 0x2a34 }
            X.1CR r98 = X.C36371kC.A0j(r2)     // Catch:{ all -> 0x2a34 }
            X.1My r3 = r3.A00     // Catch:{ all -> 0x2a34 }
            X.39O r97 = X.C27111My.A2t(r3)     // Catch:{ all -> 0x2a34 }
            X.1Cd r66 = X.C36371kC.A0T(r2)     // Catch:{ all -> 0x2a34 }
            X.1eN r92 = X.C27111My.A2I(r3)     // Catch:{ all -> 0x2a34 }
            X.185 r71 = X.C36371kC.A0U(r2)     // Catch:{ all -> 0x2a34 }
            X.1LU r86 = X.C36411kG.A0e(r2)     // Catch:{ all -> 0x2a34 }
            X.0v0 r78 = X.C36351kA.A0Y(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A18     // Catch:{ all -> 0x2a34 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r36
            X.3Km r0 = (X.C63553Km) r0     // Catch:{ all -> 0x2a34 }
            r36 = r0
            X.1EV r96 = X.C36371kC.A0h(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A19     // Catch:{ all -> 0x2a34 }
            java.lang.Object r35 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r35
            X.1KK r0 = (X.AnonymousClass1KK) r0     // Catch:{ all -> 0x2a34 }
            r35 = r0
            X.004 r0 = r2.A1R     // Catch:{ all -> 0x2a34 }
            java.lang.Object r34 = r0.get()     // Catch:{ all -> 0x2a34 }
            r0 = r34
            X.9Y1 r0 = (X.AnonymousClass9Y1) r0     // Catch:{ all -> 0x2a34 }
            r34 = r0
            X.004 r0 = r2.A29     // Catch:{ all -> 0x2a34 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.16p r15 = (X.C229516p) r15     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A4P     // Catch:{ all -> 0x2a34 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.16v r14 = (X.C230116v) r14     // Catch:{ all -> 0x2a34 }
            X.1NV r64 = X.C18800tq.A48(r2)     // Catch:{ all -> 0x2a34 }
            X.19g r85 = X.C36381kD.A0a(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A2R     // Catch:{ all -> 0x2a34 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.3C4 r13 = (X.AnonymousClass3C4) r13     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A2S     // Catch:{ all -> 0x2a34 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.3C5 r11 = (X.AnonymousClass3C5) r11     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r4.A11     // Catch:{ all -> 0x2a34 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.3Nh r9 = (X.C64263Nh) r9     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A2s     // Catch:{ all -> 0x2a34 }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1LL r8 = (X.AnonymousClass1LL) r8     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A17     // Catch:{ all -> 0x2a34 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.9fJ r7 = (X.C199439fJ) r7     // Catch:{ all -> 0x2a34 }
            X.1A5 r82 = X.C36371kC.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A2n     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1Jx r6 = (X.C26371Jx) r6     // Catch:{ all -> 0x2a34 }
            X.17z r91 = X.C36371kC.A0c(r2)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r4.A0X     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.9RO r5 = (X.AnonymousClass9RO) r5     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A2T     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.2zB r4 = (X.C58012zB) r4     // Catch:{ all -> 0x2a34 }
            X.1YG r80 = X.C18800tq.A7W(r2)     // Catch:{ all -> 0x2a34 }
            X.1CF r93 = X.C36361kB.A0b(r2)     // Catch:{ all -> 0x2a34 }
            X.31m r87 = X.C27111My.A26(r3)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r2.A3C     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.54F r2 = (X.AnonymousClass54F) r2     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r3.A2K     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1et r0 = (X.C33201et) r0     // Catch:{ all -> 0x2a34 }
            X.2H0 r16 = new X.2H0     // Catch:{ all -> 0x2a34 }
            r45 = r43
            r46 = r43
            r41 = r16
            r44 = r43
            r48 = r13
            r49 = r11
            r50 = r4
            r57 = r22
            r58 = r36
            r59 = r35
            r60 = r34
            r61 = r7
            r63 = r0
            r67 = r38
            r69 = r15
            r73 = r5
            r75 = r8
            r77 = r2
            r83 = r37
            r95 = r39
            r99 = r9
            r100 = r6
            r101 = r14
            r104 = r40
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104)     // Catch:{ all -> 0x2a34 }
            goto L_0x183d
        L_0x1e84:
            if (r16 == 0) goto L_0x1e90
            r2 = r16
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
            java.util.Set r0 = r1.A7C     // Catch:{ all -> 0x2a34 }
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
        L_0x1e90:
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r0.requestFocus()     // Catch:{ all -> 0x2a34 }
            X.3Ok r2 = new X.3Ok     // Catch:{ all -> 0x2a34 }
            r2.<init>(r10, r1)     // Catch:{ all -> 0x2a34 }
            X.3Fr r0 = new X.3Fr     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2)     // Catch:{ all -> 0x2a34 }
            r1.A2Z = r0     // Catch:{ all -> 0x2a34 }
            A14(r1)     // Catch:{ all -> 0x2a34 }
            X.3Fr r0 = r1.A2Z     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.2HE> r2 = X.AnonymousClass2HE.class
            X.3Ok r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.3uz r0 = r0.A00(r2)     // Catch:{ all -> 0x2a34 }
            X.2HE r0 = (X.AnonymousClass2HE) r0     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1ec8
            boolean r3 = r0.A0B()     // Catch:{ all -> 0x2a34 }
            boolean r2 = r0.A0C()     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x1ebf
            if (r2 != 0) goto L_0x1ec8
            goto L_0x1ec5
        L_0x1ebf:
            if (r2 == 0) goto L_0x1ec8
            r0.A0A(r12)     // Catch:{ all -> 0x2a34 }
            goto L_0x1ec8
        L_0x1ec5:
            r0.A08()     // Catch:{ all -> 0x2a34 }
        L_0x1ec8:
            X.3Fr r2 = r1.A2Z     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.2HI> r0 = X.AnonymousClass2HI.class
            r2.A01(r0, r12)     // Catch:{ all -> 0x2a34 }
            X.3Fr r0 = r1.A2Z     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.2HH> r2 = X.AnonymousClass2HH.class
            X.3Ok r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            r0.A00(r2)     // Catch:{ all -> 0x2a34 }
            X.9lC r0 = r1.A4T     // Catch:{ all -> 0x2a34 }
            r2 = r23
            java.util.List r2 = r2.A0Q     // Catch:{ all -> 0x2a34 }
            r2.add(r0)     // Catch:{ all -> 0x2a34 }
            r24.A01()     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 5532(0x159c, float:7.752E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1efe
            X.155 r3 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1mO r2 = new X.1mO     // Catch:{ all -> 0x2a34 }
            r2.<init>(r1)     // Catch:{ all -> 0x2a34 }
            X.0Th r0 = new X.0Th     // Catch:{ all -> 0x2a34 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x2a34 }
            r1.A0k = r0     // Catch:{ all -> 0x2a34 }
        L_0x1efe:
            java.lang.String r0 = "on_create_conversation_end"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1FR r2 = r1.A4Y     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            int r3 = r2.A0D(r0)     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131432407(0x7f0b13d7, float:1.848657E38)
            X.1RJ r2 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A5O = r2     // Catch:{ all -> 0x2a34 }
            X.3te r0 = new X.3te     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x2a34 }
            r2.A07(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1f3a
            boolean r0 = A1g(r1, r3)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x1f3a
            A19(r1, r3)     // Catch:{ all -> 0x2a34 }
            X.1RJ r0 = r1.A5O     // Catch:{ all -> 0x2a34 }
            r0.A03(r12)     // Catch:{ all -> 0x2a34 }
        L_0x1f3a:
            X.2rr r53 = new X.2rr     // Catch:{ all -> 0x2a34 }
            r53.<init>()     // Catch:{ all -> 0x2a34 }
            X.155 r37 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r61 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            X.17Y r39 = A09(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1N2 r74 = r0.getImeUtils()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0wQ r41 = r0.getMeManager()     // Catch:{ all -> 0x2a34 }
            X.0wN r0 = r1.A0z     // Catch:{ all -> 0x2a34 }
            r36 = r0
            X.1XY r0 = r1.A1Z     // Catch:{ all -> 0x2a34 }
            r42 = r0
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0y0 r38 = r0.getFMessageIO()     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yW r62 = r2.getWamRuntime()     // Catch:{ all -> 0x2a34 }
            X.4Uz r0 = r1.A1w     // Catch:{ all -> 0x2a34 }
            r47 = r0
            X.1X4 r43 = r2.getUserActions()     // Catch:{ all -> 0x2a34 }
            X.3Pe r0 = r1.A1t     // Catch:{ all -> 0x2a34 }
            r46 = r0
            X.1YL r0 = r1.A4A     // Catch:{ all -> 0x2a34 }
            r66 = r0
            X.0wx r60 = r2.getStorageUtils()     // Catch:{ all -> 0x2a34 }
            X.2XH r0 = r1.A47     // Catch:{ all -> 0x2a34 }
            r65 = r0
            X.37l r0 = r1.A1y     // Catch:{ all -> 0x2a34 }
            r48 = r0
            X.1GX r0 = r1.A5F     // Catch:{ all -> 0x2a34 }
            r76 = r0
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yb r57 = r0.getSystemServices()     // Catch:{ all -> 0x2a34 }
            X.1NG r0 = r1.A1z     // Catch:{ all -> 0x2a34 }
            r49 = r0
            X.1JD r0 = r1.A4Z     // Catch:{ all -> 0x2a34 }
            r24 = r0
            X.1Cb r0 = r1.A30     // Catch:{ all -> 0x2a34 }
            r23 = r0
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.16m r51 = r0.getContactAccessHelper()     // Catch:{ all -> 0x2a34 }
            X.0yE r58 = r0.getWaPermissionsHelper()     // Catch:{ all -> 0x2a34 }
            X.0v0 r59 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            X.3Pn r0 = r1.A5E     // Catch:{ all -> 0x2a34 }
            r22 = r0
            X.3Km r0 = r1.A1m     // Catch:{ all -> 0x2a34 }
            r16 = r0
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1KK r45 = r0.getBusinessProfileManager()     // Catch:{ all -> 0x2a34 }
            X.1G4 r73 = r0.getScreenLockStateProvider()     // Catch:{ all -> 0x2a34 }
            X.0wg r15 = r1.A4e     // Catch:{ all -> 0x2a34 }
            X.4V6 r14 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1V6 r54 = r14.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x2a34 }
            X.155 r0 = r14.getActivityNullable()     // Catch:{ all -> 0x2a34 }
            X.3g8 r2 = new X.3g8     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0)     // Catch:{ all -> 0x2a34 }
            X.11F r13 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r11 = r1.A6F     // Catch:{ all -> 0x2a34 }
            com.whatsapp.KeyboardPopupLayout r9 = r1.A1V     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r8 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.7yC r7 = r1.A4V     // Catch:{ all -> 0x2a34 }
            com.whatsapp.community.ConversationCommunityViewModel r6 = r1.A2C     // Catch:{ all -> 0x2a34 }
            X.3EV r5 = r1.A4X     // Catch:{ all -> 0x2a34 }
            X.39O r4 = r1.A4U     // Catch:{ all -> 0x2a34 }
            X.2so r3 = r1.A3p     // Catch:{ all -> 0x2a34 }
            X.28e r0 = new X.28e     // Catch:{ all -> 0x2a34 }
            r34 = r0
            r40 = r9
            r44 = r16
            r50 = r6
            r52 = r14
            r55 = r2
            r56 = r23
            r63 = r3
            r64 = r13
            r67 = r8
            r68 = r4
            r69 = r7
            r70 = r5
            r71 = r24
            r72 = r15
            r75 = r22
            r77 = r11
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ all -> 0x2a34 }
            r1.A2Q = r0     // Catch:{ all -> 0x2a34 }
            r2 = r106
            r2.add(r0)     // Catch:{ all -> 0x2a34 }
            java.util.Set r0 = r1.A7X     // Catch:{ all -> 0x2a34 }
            X.28e r2 = r1.A2Q     // Catch:{ all -> 0x2a34 }
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
            java.util.Set r3 = r1.A7Y     // Catch:{ all -> 0x2a34 }
            X.28e r2 = r1.A2Q     // Catch:{ all -> 0x2a34 }
            r3.add(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r3 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2 = 2131429707(0x7f0b094b, float:1.8481094E38)
            android.view.View r3 = r3.findViewById(r2)     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x2098
            X.0yC r4 = A0H(r1)     // Catch:{ all -> 0x2a34 }
            r2 = 1416(0x588, float:1.984E-42)
            boolean r2 = r4.A0E(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x2098
            X.2yE r2 = r1.A1F     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r6 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.1My r4 = r2.A00     // Catch:{ all -> 0x2a34 }
            android.app.Activity r4 = r4.A5d     // Catch:{ all -> 0x2a34 }
            X.0tq r7 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.1XY r37 = X.C36411kG.A0Y(r7)     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.17Y r36 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0yE r40 = X.C36351kA.A0X(r2)     // Catch:{ all -> 0x2a34 }
            X.1Gn r44 = X.C18800tq.AF5(r2)     // Catch:{ all -> 0x2a34 }
            X.16D r38 = X.C36341k9.A0R(r2)     // Catch:{ all -> 0x2a34 }
            X.171 r39 = X.C36341k9.A0S(r2)     // Catch:{ all -> 0x2a34 }
            X.1H2 r41 = X.C36351kA.A0e(r2)     // Catch:{ all -> 0x2a34 }
            X.0yW r42 = X.C36351kA.A0g(r2)     // Catch:{ all -> 0x2a34 }
            X.A8W r2 = new X.A8W     // Catch:{ all -> 0x2a34 }
            r34 = r2
            r35 = r4
            r43 = r5
            r45 = r6
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x2a34 }
            X.2y6 r4 = r1.A18     // Catch:{ all -> 0x2a34 }
            X.1Mz r4 = r4.A00     // Catch:{ all -> 0x2a34 }
            X.1My r5 = r4.A00     // Catch:{ all -> 0x2a34 }
            android.app.Activity r5 = r5.A5d     // Catch:{ all -> 0x2a34 }
            X.0tq r6 = r4.A01     // Catch:{ all -> 0x2a34 }
            X.0wo r7 = X.C36351kA.A0V(r6)     // Catch:{ all -> 0x2a34 }
            X.0tq r4 = r4.A01     // Catch:{ all -> 0x2a34 }
            X.0yW r8 = X.C36351kA.A0g(r4)     // Catch:{ all -> 0x2a34 }
            X.1Gn r9 = X.C18800tq.AF5(r4)     // Catch:{ all -> 0x2a34 }
            X.9v6 r4 = new X.9v6     // Catch:{ all -> 0x2a34 }
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x2a34 }
            r3.setOnDragListener(r4)     // Catch:{ all -> 0x2a34 }
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
        L_0x2098:
            X.2sH r39 = new X.2sH     // Catch:{ all -> 0x2a34 }
            r39.<init>()     // Catch:{ all -> 0x2a34 }
            X.2yD r2 = r1.A1E     // Catch:{ all -> 0x2a34 }
            boolean r3 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x20aa
            X.005 r3 = r1.A5i     // Catch:{ all -> 0x2a34 }
            r3.get()     // Catch:{ all -> 0x2a34 }
        L_0x20aa:
            X.11F r5 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.KeyboardPopupLayout r4 = r1.A1V     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r6 = r1.A2U     // Catch:{ all -> 0x2a34 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x2a34 }
            r3 = 42
            X.3v4 r45 = X.C80233v4.A00(r6, r3)     // Catch:{ all -> 0x2a34 }
            X.155 r37 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1Mz r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            X.17Y r38 = X.C36351kA.A0M(r2)     // Catch:{ all -> 0x2a34 }
            X.0wU r44 = X.C36341k9.A0Z(r2)     // Catch:{ all -> 0x2a34 }
            X.0yb r40 = X.C36351kA.A0U(r2)     // Catch:{ all -> 0x2a34 }
            X.0tt r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.004 r2 = r2.A4L     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x2a34 }
            X.3T0 r3 = (X.AnonymousClass3T0) r3     // Catch:{ all -> 0x2a34 }
            X.28c r2 = new X.28c     // Catch:{ all -> 0x2a34 }
            r34 = r2
            r36 = r4
            r41 = r5
            r42 = r3
            r43 = r18
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x2a34 }
            r3 = r106
            r3.add(r2)     // Catch:{ all -> 0x2a34 }
            X.3ck r2 = r2.A01     // Catch:{ all -> 0x2a34 }
            r0.add(r2)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "lifecycle_callbacks_start"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            java.util.Iterator r4 = r106.iterator()     // Catch:{ all -> 0x2a34 }
        L_0x20fd:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2113
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x2a34 }
            android.app.Application$ActivityLifecycleCallbacks r2 = (android.app.Application.ActivityLifecycleCallbacks) r2     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r3 = r20
            r2.onActivityCreated(r0, r3)     // Catch:{ all -> 0x2a34 }
            goto L_0x20fd
        L_0x2113:
            java.lang.String r0 = "lifecycle_callbacks_end"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1nd r5 = A0D(r1)     // Catch:{ all -> 0x2a34 }
            boolean r0 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            r4 = 0
            if (r0 != 0) goto L_0x216a
            boolean r0 = A1Z(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x216a
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2a34 }
            r0 = 2131166133(0x7f0703b5, float:1.7946503E38)
            int r3 = r2.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2a34 }
            r0 = 2131166132(0x7f0703b4, float:1.79465E38)
            int r0 = r2.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2a34 }
            int r3 = r3 * 2
            int r3 = r3 + r0
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2a34 }
            r0 = 2131167414(0x7f0708b6, float:1.79491E38)
            int r3 = X.C36441kJ.A06(r2, r0, r3)     // Catch:{ all -> 0x2a34 }
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch:{ all -> 0x2a34 }
            r2.<init>()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ all -> 0x2a34 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x2a34 }
            r0.getMetrics(r2)     // Catch:{ all -> 0x2a34 }
            int r0 = r2.widthPixels     // Catch:{ all -> 0x2a34 }
            if (r0 <= r3) goto L_0x216a
            r4 = 1
        L_0x216a:
            r5.A0B = r4     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131427540(0x7f0b00d4, float:1.84767E38)
            X.1RJ r3 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A5K = r3     // Catch:{ all -> 0x2a34 }
            r2 = 9
            X.4ZP r0 = new X.4ZP     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.A07(r0)     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r2 = r19
            com.whatsapp.jid.Jid r5 = r0.A06(r2)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2201
            if (r5 == 0) goto L_0x2201
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r4 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.AyL r0 = r1.A1l     // Catch:{ all -> 0x2a34 }
            X.9Uf r3 = r0.B3r(r5)     // Catch:{ all -> 0x2a34 }
            X.2y7 r2 = r1.A19     // Catch:{ all -> 0x2a34 }
            X.3bG r0 = new X.3bG     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x2a34 }
            X.04H r2 = new X.04H     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.1sH> r0 = X.C39441sH.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.1sH r0 = (X.C39441sH) r0     // Catch:{ all -> 0x2a34 }
            r1.A1k = r0     // Catch:{ all -> 0x2a34 }
            X.9Uf r0 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.00r r3 = r0.A03     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 10
            X.C66033Uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r3 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.4PE r2 = r1.A1q     // Catch:{ all -> 0x2a34 }
            X.3bH r0 = new X.3bH     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x2a34 }
            X.04H r2 = new X.04H     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.7y9> r0 = X.C167497y9.class
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.7y9 r0 = (X.C167497y9) r0     // Catch:{ all -> 0x2a34 }
            r1.A1r = r0     // Catch:{ all -> 0x2a34 }
            X.00s r3 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 45
            X.C80073uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.2Co r0 = new X.2Co     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1)     // Catch:{ all -> 0x2a34 }
            r1.A1p = r0     // Catch:{ all -> 0x2a34 }
            X.005 r0 = r1.A5j     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.0wB r2 = (X.C19580wB) r2     // Catch:{ all -> 0x2a34 }
            X.9Oy r0 = r1.A1p     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
        L_0x2201:
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131433564(0x7f0b185c, float:1.8488917E38)
            X.1RJ r3 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A5Q = r3     // Catch:{ all -> 0x2a34 }
            r2 = 7
            X.4ZP r0 = new X.4ZP     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.A07(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            A1P(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1RJ r3 = r1.A5Q     // Catch:{ all -> 0x2a34 }
            r2 = 15
            X.3Xz r0 = new X.3Xz     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2a34 }
            r3.A05(r0)     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131432074(0x7f0b128a, float:1.8485895E38)
            X.1RJ r3 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A5R = r3     // Catch:{ all -> 0x2a34 }
            r2 = 8
            X.4ZP r0 = new X.4ZP     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.A07(r0)     // Catch:{ all -> 0x2a34 }
            X.1RJ r3 = r1.A5R     // Catch:{ all -> 0x2a34 }
            r2 = 16
            X.3Xz r0 = new X.3Xz     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2a34 }
            r3.A05(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2U     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r2.setScrollbarFadingEnabled(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2U     // Catch:{ all -> 0x2a34 }
            android.widget.AbsListView$OnScrollListener r0 = r1.A7K     // Catch:{ all -> 0x2a34 }
            r2.setOnScrollListener(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r2.setScrollbarFadingEnabled(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.text.TextWatcher r0 = r1.A7G     // Catch:{ all -> 0x2a34 }
            r2.addTextChangedListener(r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = r1.A6J     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2278
            X.0ts r3 = r1.A36     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            X.2g8 r0 = new X.2g8     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x2a34 }
            r1.A6p = r0     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r2.addTextChangedListener(r0)     // Catch:{ all -> 0x2a34 }
        L_0x2278:
            boolean r0 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x2287
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.text.TextWatcher r0 = r1.A7F     // Catch:{ all -> 0x2a34 }
            r2.addTextChangedListener(r0)     // Catch:{ all -> 0x2a34 }
        L_0x2287:
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.widget.TextView$OnEditorActionListener r0 = r1.A7L     // Catch:{ all -> 0x2a34 }
            r2.setOnEditorActionListener(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.view.View$OnClickListener r0 = r1.A7I     // Catch:{ all -> 0x2a34 }
            r2.setOnClickListener(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r3 = r1.A4B     // Catch:{ all -> 0x2a34 }
            r2 = 6
            X.3wT r0 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.setupEnterIsSend(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 17
            r2 = r17
            X.C66963Xz.A00(r2, r1, r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = X.C36361kB.A0n(r0)     // Catch:{ all -> 0x2a34 }
            boolean r2 = X.AnonymousClass14B.A0F(r0)     // Catch:{ all -> 0x2a34 }
            r1.A6Q = r2     // Catch:{ all -> 0x2a34 }
            X.1ts r0 = r1.A2u     // Catch:{ all -> 0x2a34 }
            r0.A0V(r2)     // Catch:{ all -> 0x2a34 }
            X.1uJ r0 = r1.A2y     // Catch:{ all -> 0x2a34 }
            r0.A0T(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 != 0) goto L_0x22ce
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0zE r4 = r0.getQuickPerformanceLogger()     // Catch:{ all -> 0x2a34 }
            r3 = 703926750(0x29f511de, float:1.0883285E-13)
            java.lang.String r2 = "composer_has_text"
            r0 = 1
            r4.markerAnnotate((int) r3, (java.lang.String) r2, (boolean) r0)     // Catch:{ all -> 0x2a34 }
        L_0x22ce:
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x235c
            boolean r0 = A1e(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x235c
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2131429172(0x7f0b0734, float:1.848001E38)
            X.1RJ r3 = X.C36361kB.A0h(r2, r0)     // Catch:{ all -> 0x2a34 }
            r1.A5L = r3     // Catch:{ all -> 0x2a34 }
            r2 = 20
            X.3Xz r0 = new X.3Xz     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2a34 }
            r3.A05(r0)     // Catch:{ all -> 0x2a34 }
            X.3P6 r4 = r1.A4u     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r2 = r1.A0b     // Catch:{ all -> 0x2a34 }
            X.1RJ r3 = r1.A5L     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r2, r12)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x2a34 }
            r4.A02 = r2     // Catch:{ all -> 0x2a34 }
            r4.A04 = r3     // Catch:{ all -> 0x2a34 }
            r2 = 10
            X.4ZP r0 = new X.4ZP     // Catch:{ all -> 0x2a34 }
            r0.<init>((java.lang.Object) r4, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.A07(r0)     // Catch:{ all -> 0x2a34 }
            X.4lK r0 = r1.A4w     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x234f
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.016 r5 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2a34 }
            X.0yC r4 = r1.A3n     // Catch:{ all -> 0x2a34 }
            X.0v0 r3 = r1.A35     // Catch:{ all -> 0x2a34 }
            X.5vT r2 = r1.A4z     // Catch:{ all -> 0x2a34 }
            X.3bK r0 = new X.3bK     // Catch:{ all -> 0x2a34 }
            r0.<init>(r3, r4, r2)     // Catch:{ all -> 0x2a34 }
            X.04H r2 = new X.04H     // Catch:{ all -> 0x2a34 }
            r2.<init>(r0, r5)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<X.4lK> r0 = X.C95494lK.class
            X.04R r2 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.4lK r2 = (X.C95494lK) r2     // Catch:{ all -> 0x2a34 }
            r1.A4w = r2     // Catch:{ all -> 0x2a34 }
            X.6Xz r0 = r1.A51     // Catch:{ all -> 0x2a34 }
            r0.A01 = r2     // Catch:{ all -> 0x2a34 }
            X.17Y r3 = A09(r1)     // Catch:{ all -> 0x2a34 }
            X.4lK r2 = r1.A4w     // Catch:{ all -> 0x2a34 }
            X.3EH r0 = new X.3EH     // Catch:{ all -> 0x2a34 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x2a34 }
            r1.A4y = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            com.whatsapp.emoji.search.EmojiSearchProvider r2 = r0.getEmojiSearchProvider()     // Catch:{ all -> 0x2a34 }
            r0 = 0
            r2.A01(r0)     // Catch:{ all -> 0x2a34 }
        L_0x234f:
            X.4lK r0 = r1.A4w     // Catch:{ all -> 0x2a34 }
            X.00s r3 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 14
            X.C66033Uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
        L_0x235c:
            boolean r0 = A1e(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x2454
            X.155 r2 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r14 = X.C63733Le.A00(r2, r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "emojiPopup_start"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.3HH r3 = r1.A3q     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            r3.A00 = r0     // Catch:{ all -> 0x2a34 }
            com.whatsapp.KeyboardPopupLayout r2 = r1.A1V     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B     // Catch:{ all -> 0x2a34 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x2a34 }
            X.11F r4 = r1.A45     // Catch:{ all -> 0x2a34 }
            java.lang.Integer r18 = X.C54212sa.A00(r4)     // Catch:{ all -> 0x2a34 }
            r13 = r3
            r15 = r2
            r16 = r0
            r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2a34 }
            X.3HG r0 = r1.A3I     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass3HG.A00(r0, r3)     // Catch:{ all -> 0x2a34 }
            X.3HH r0 = r1.A3q     // Catch:{ all -> 0x2a34 }
            r0.A05 = r4     // Catch:{ all -> 0x2a34 }
            boolean r0 = A1X(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x23a7
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 6110(0x17de, float:8.562E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x23d8
        L_0x23a7:
            X.3HH r8 = r1.A3q     // Catch:{ all -> 0x2a34 }
            X.3HG r3 = r1.A3I     // Catch:{ all -> 0x2a34 }
            X.4lK r2 = r1.A4w     // Catch:{ all -> 0x2a34 }
            X.6Xz r0 = r1.A51     // Catch:{ all -> 0x2a34 }
            X.3HE r0 = r3.A02(r2, r0)     // Catch:{ all -> 0x2a34 }
            r8.A04 = r0     // Catch:{ all -> 0x2a34 }
            X.3HG r0 = r1.A3I     // Catch:{ all -> 0x2a34 }
            X.4lK r7 = r1.A4w     // Catch:{ all -> 0x2a34 }
            X.1AP r6 = r0.A04     // Catch:{ all -> 0x2a34 }
            X.1HA r5 = r0.A03     // Catch:{ all -> 0x2a34 }
            X.3Ki r4 = r0.A06     // Catch:{ all -> 0x2a34 }
            X.3BO r3 = r0.A00     // Catch:{ all -> 0x2a34 }
            X.3GT r2 = r0.A05     // Catch:{ all -> 0x2a34 }
            X.3H8 r0 = new X.3H8     // Catch:{ all -> 0x2a34 }
            r37 = r6
            r38 = r2
            r39 = r7
            r40 = r4
            r34 = r0
            r35 = r3
            r36 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2a34 }
            r8.A01 = r0     // Catch:{ all -> 0x2a34 }
        L_0x23d8:
            X.3HH r0 = r1.A3q     // Catch:{ all -> 0x2a34 }
            X.2M8 r2 = r0.A00()     // Catch:{ all -> 0x2a34 }
            r1.A3r = r2     // Catch:{ all -> 0x2a34 }
            X.3Nh r0 = r1.A5C     // Catch:{ all -> 0x2a34 }
            r2.A0D = r0     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            android.widget.PopupWindow$OnDismissListener r0 = r0.getOnPopupWindowDismissListener()     // Catch:{ all -> 0x2a34 }
            r2.setOnDismissListener(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yW r37 = r2.getWamRuntime()     // Catch:{ all -> 0x2a34 }
            X.3L7 r5 = r1.A3u     // Catch:{ all -> 0x2a34 }
            r0 = 2131430521(0x7f0b0c79, float:1.8482745E38)
            android.view.View r4 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.gifsearch.GifSearchContainer r4 = (com.whatsapp.gifsearch.GifSearchContainer) r4     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r3 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.emoji.search.EmojiSearchContainer r3 = (com.whatsapp.emoji.search.EmojiSearchContainer) r3     // Catch:{ all -> 0x2a34 }
            X.2M8 r2 = r1.A3r     // Catch:{ all -> 0x2a34 }
            X.155 r35 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.2MC r0 = new X.2MC     // Catch:{ all -> 0x2a34 }
            r38 = r2
            r39 = r4
            r40 = r5
            r34 = r0
            r36 = r3
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2a34 }
            r1.A3s = r0     // Catch:{ all -> 0x2a34 }
            X.3rU r4 = r1.A4c     // Catch:{ all -> 0x2a34 }
            X.4V6 r3 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.2M8 r2 = r1.A3r     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            r4.A01(r2, r0, r3)     // Catch:{ all -> 0x2a34 }
            X.2M8 r3 = r1.A3r     // Catch:{ all -> 0x2a34 }
            X.4Sf r0 = r1.A71     // Catch:{ all -> 0x2a34 }
            r3.A0H(r0)     // Catch:{ all -> 0x2a34 }
            r2 = 16
            X.3wT r0 = new X.3wT     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.A0F = r0     // Catch:{ all -> 0x2a34 }
            X.4ZL r0 = new X.4ZL     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r12)     // Catch:{ all -> 0x2a34 }
            r3.A0A = r0     // Catch:{ all -> 0x2a34 }
            X.4Rx r0 = r1.A78     // Catch:{ all -> 0x2a34 }
            r3.A0L(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "emojiPopup_end"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.2MC r2 = r1.A3s     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r2.A00 = r0     // Catch:{ all -> 0x2a34 }
            r2.A00 = r0     // Catch:{ all -> 0x2a34 }
        L_0x2454:
            X.3rU r2 = r1.A4c     // Catch:{ all -> 0x2a34 }
            X.2ty r0 = new X.2ty     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r12)     // Catch:{ all -> 0x2a34 }
            r2.A01 = r0     // Catch:{ all -> 0x2a34 }
            X.4Rx r0 = r1.A78     // Catch:{ all -> 0x2a34 }
            r2.A04 = r0     // Catch:{ all -> 0x2a34 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4B     // Catch:{ all -> 0x2a34 }
            android.content.Context r0 = r2.getContext()     // Catch:{ all -> 0x2a34 }
            float r4 = X.C36341k9.A00(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 6
            if (r3 >= 0) goto L_0x247a
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 4
            if (r3 < 0) goto L_0x247a
            r0 = 5
        L_0x247a:
            r2.setMaxLines(r0)     // Catch:{ all -> 0x2a34 }
            X.1Pm r2 = r1.A5b     // Catch:{ all -> 0x2a34 }
            X.1NK r0 = r1.A7W     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.1MK r0 = r1.A27     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x249a
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            r0 = 6989(0x1b4d, float:9.794E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x249a
            r0 = 0
            A0b(r0, r1)     // Catch:{ all -> 0x2a34 }
        L_0x249a:
            X.2ZP r2 = r1.A5Y     // Catch:{ all -> 0x2a34 }
            X.3L3 r0 = r1.A7V     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.2ZM r2 = r1.A2f     // Catch:{ all -> 0x2a34 }
            X.3N2 r0 = r1.A7O     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.2ZD r2 = r1.A5W     // Catch:{ all -> 0x2a34 }
            X.31N r0 = r1.A7R     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.2ZN r2 = r1.A4O     // Catch:{ all -> 0x2a34 }
            X.3Bb r0 = r1.A7T     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.1Kc r2 = r1.A1n     // Catch:{ all -> 0x2a34 }
            X.16A r0 = r1.A7M     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.1BB r2 = r1.A4s     // Catch:{ all -> 0x2a34 }
            X.6Fn r0 = r1.A7U     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.6Xz r0 = r1.A51     // Catch:{ all -> 0x2a34 }
            X.1BB r2 = r0.A0B     // Catch:{ all -> 0x2a34 }
            X.6Fn r0 = r0.A09     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.1YD r2 = r1.A50     // Catch:{ all -> 0x2a34 }
            X.31M r0 = r1.A7Q     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            X.1Yp r2 = r1.A4S     // Catch:{ all -> 0x2a34 }
            X.3N3 r0 = r1.A7P     // Catch:{ all -> 0x2a34 }
            r2.registerObserver(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r1.A58     // Catch:{ all -> 0x2a34 }
            X.00s r3 = r0.A01     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 7
            X.C66033Uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C21360z5.A00()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2535
            java.lang.String r0 = "conversation/device-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment r0 = new com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment     // Catch:{ all -> 0x2a34 }
            r0.<init>()     // Catch:{ all -> 0x2a34 }
            r2.Btm(r0)     // Catch:{ all -> 0x2a34 }
        L_0x24fc:
            X.1uh r0 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.155 r5 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.9up r2 = r10.A05     // Catch:{ all -> 0x2a34 }
            X.319 r3 = r0.A0c     // Catch:{ all -> 0x2a34 }
            java.util.HashMap r4 = r3.A00     // Catch:{ all -> 0x2a34 }
            X.11F r3 = r0.A0t     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x2a34 }
            X.3T1 r4 = (X.AnonymousClass3T1) r4     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x257f
            X.3Qj r4 = new X.3Qj     // Catch:{ all -> 0x2a34 }
            r4.<init>()     // Catch:{ all -> 0x2a34 }
            java.io.File r3 = r10.A0B     // Catch:{ all -> 0x2a34 }
            r4.A0I = r3     // Catch:{ all -> 0x2a34 }
            X.388 r3 = new X.388     // Catch:{ all -> 0x2a34 }
            r3.<init>(r4, r2, r10, r0)     // Catch:{ all -> 0x2a34 }
            X.0wU r2 = r0.A19     // Catch:{ all -> 0x2a34 }
            X.1GX r6 = r0.A0x     // Catch:{ all -> 0x2a34 }
            X.2ic r0 = new X.2ic     // Catch:{ all -> 0x2a34 }
            r0.<init>(r5, r3, r6)     // Catch:{ all -> 0x2a34 }
            r3 = 1
            java.io.File[] r3 = new java.io.File[r3]     // Catch:{ all -> 0x2a34 }
            java.io.File r4 = r4.A0I     // Catch:{ all -> 0x2a34 }
            r3[r12] = r4     // Catch:{ all -> 0x2a34 }
            r2.Box(r0, r3)     // Catch:{ all -> 0x2a34 }
            goto L_0x25bf
        L_0x2535:
            X.0z5 r0 = r1.A1X     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x254e
            java.lang.String r0 = "conversation/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            X.155 r3 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0y3 r2 = r1.A4D     // Catch:{ all -> 0x2a34 }
            X.1Si r0 = r1.A4I     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass3SK.A02(r3, r2, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x24fc
        L_0x254e:
            X.0z5 r0 = r1.A1X     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2567
            java.lang.String r0 = "conversation/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            X.155 r3 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0y3 r2 = r1.A4D     // Catch:{ all -> 0x2a34 }
            X.1Si r0 = r1.A4I     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass3SK.A03(r3, r2, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x24fc
        L_0x2567:
            X.13T r0 = r1.A1a     // Catch:{ all -> 0x2a34 }
            int r0 = r0.A00()     // Catch:{ all -> 0x2a34 }
            if (r0 <= 0) goto L_0x24fc
            java.lang.String r0 = "conversation/software-about-to-expire"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            X.155 r2 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 115(0x73, float:1.61E-43)
            X.AnonymousClass3SJ.A01(r2, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x24fc
        L_0x257f:
            if (r4 == 0) goto L_0x2590
            long r2 = r4.A1N     // Catch:{ all -> 0x2a34 }
            X.1A1 r5 = r0.A0w     // Catch:{ all -> 0x25bd }
            X.3T1 r2 = X.C36421kH.A0R(r5, r2)     // Catch:{ all -> 0x25bd }
            if (r2 == 0) goto L_0x258c
            r4 = r2
        L_0x258c:
            r0.A0a(r4)     // Catch:{ all -> 0x2a34 }
            goto L_0x25bf
        L_0x2590:
            X.147 r6 = r10.A09     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x25ab
            X.0wo r2 = r0.A0g     // Catch:{ all -> 0x2a34 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x2a34 }
            java.lang.String r5 = r10.A0J     // Catch:{ all -> 0x2a34 }
            java.lang.String r4 = r10.A0I     // Catch:{ all -> 0x2a34 }
            X.2c5 r3 = X.C55162uB.A00(r6, r5, r4, r2)     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = ""
            r3.A16(r2)     // Catch:{ all -> 0x2a34 }
            r0.A0a(r3)     // Catch:{ all -> 0x2a34 }
            goto L_0x25bf
        L_0x25ab:
            java.lang.Long r2 = r10.A0C     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x25bf
            long r2 = r2.longValue()     // Catch:{ all -> 0x2a34 }
            X.1A1 r4 = r0.A0w     // Catch:{ all -> 0x25bd }
            X.3T1 r2 = X.C36421kH.A0R(r4, r2)     // Catch:{ all -> 0x25bd }
            r0.A0a(r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x25bf
        L_0x25bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x2a34 }
        L_0x25bf:
            if (r108 == 0) goto L_0x25cf
            java.lang.String r2 = "keyboard_visible"
            r0 = r20
            boolean r0 = r0.getBoolean(r2)     // Catch:{ all -> 0x2a34 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x2a34 }
            r1.A5z = r0     // Catch:{ all -> 0x2a34 }
        L_0x25cf:
            r29.A01()     // Catch:{ all -> 0x2a34 }
            X.04H r2 = A08(r1)     // Catch:{ all -> 0x2a34 }
            r0 = r28
            X.04R r0 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            X.7yC r0 = (X.C167527yC) r0     // Catch:{ all -> 0x2a34 }
            r1.A4V = r0     // Catch:{ all -> 0x2a34 }
            X.1nd r3 = A0D(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.38f r2 = r0.getFirstDrawMonitor()     // Catch:{ all -> 0x2a34 }
            X.174 r0 = r0.getInteractionPerfTracker()     // Catch:{ all -> 0x2a34 }
            r3.A09 = r2     // Catch:{ all -> 0x2a34 }
            r3.A08 = r0     // Catch:{ all -> 0x2a34 }
            android.os.Bundle r2 = r10.A04     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x26aa
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x2a34 }
            r1.A5z = r0     // Catch:{ all -> 0x2a34 }
            android.content.Intent r0 = r1.A0A     // Catch:{ all -> 0x2a34 }
            java.lang.String r3 = "new_group_result_bundle"
            android.os.Bundle r0 = r0.getBundleExtra(r3)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2628
            android.content.Intent r0 = r1.A0A     // Catch:{ all -> 0x2a34 }
            android.os.Bundle r3 = r0.getBundleExtra(r3)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "invite_intent"
            boolean r0 = r3.containsKey(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2628
            r4 = 53
            com.whatsapp.invites.PromptSendGroupInviteDialogFragment r3 = new com.whatsapp.invites.PromptSendGroupInviteDialogFragment     // Catch:{ all -> 0x2a34 }
            r3.<init>()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "invite_intent_code"
            r2.putInt(r0, r4)     // Catch:{ all -> 0x2a34 }
            r3.A17(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.Btm(r3)     // Catch:{ all -> 0x2a34 }
        L_0x2628:
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C36441kJ.A1L(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2652
            r0 = r31
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2652
            boolean r0 = X.C19550w8.A09()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2643
            android.content.Intent r3 = X.C53952sA.A00(r10)     // Catch:{ all -> 0x2a34 }
            goto L_0x264b
        L_0x2643:
            r0 = r31
            android.os.Parcelable r3 = r2.getParcelable(r0)     // Catch:{ all -> 0x2a34 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x2a34 }
        L_0x264b:
            if (r3 == 0) goto L_0x2652
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.startActivity(r3)     // Catch:{ all -> 0x2a34 }
        L_0x2652:
            r0 = r30
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x266e
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.1qm r3 = X.AnonymousClass3LW.A00(r0)     // Catch:{ all -> 0x2a34 }
            r0 = r30
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x2a34 }
            X.C39001qm.A0A(r3, r0)     // Catch:{ all -> 0x2a34 }
            r3.A0b()     // Catch:{ all -> 0x2a34 }
        L_0x266e:
            r0 = r32
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x26aa
            r0 = r32
            android.os.Bundle r0 = r2.getBundle(r0)     // Catch:{ all -> 0x2a34 }
            java.util.ArrayList r8 = X.AnonymousClass3UJ.A05(r0)     // Catch:{ all -> 0x2a34 }
            if (r8 == 0) goto L_0x26aa
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x26aa
            X.0wU r3 = r1.A5S     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2a34 }
            java.util.ArrayList r7 = X.C36441kJ.A15(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "include_captions"
            boolean r9 = r2.getBoolean(r0, r12)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "appended_message"
            java.lang.String r6 = r2.getString(r0)     // Catch:{ all -> 0x2a34 }
            X.2iP r0 = new X.2iP     // Catch:{ all -> 0x2a34 }
            r4 = r0
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x2a34 }
            X.C36391kE.A1Q(r0, r3)     // Catch:{ all -> 0x2a34 }
        L_0x26aa:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.1EL r2 = r0.getSuspensionManager()     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r2.A01(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x26f3
            X.141 r2 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r0 = r27
            com.whatsapp.jid.Jid r6 = r2.A06(r0)     // Catch:{ all -> 0x2a34 }
            X.147 r6 = (X.AnonymousClass147) r6     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x2a34 }
            X.31v r2 = r1.A3x     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.17X r0 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2a34 }
            boolean r5 = r0.A0C(r6)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.17X r0 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2a34 }
            boolean r4 = r0.A0D(r6)     // Catch:{ all -> 0x2a34 }
            X.4Wp r3 = new X.4Wp     // Catch:{ all -> 0x2a34 }
            r3.<init>(r1, r12)     // Catch:{ all -> 0x2a34 }
            X.0yC r2 = r2.A00     // Catch:{ all -> 0x2a34 }
            r0 = 3180(0xc6c, float:4.456E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x27b1
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r2 = com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet.A03(r3, r6, r5, r4)     // Catch:{ all -> 0x2a34 }
        L_0x26ee:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.Btm(r2)     // Catch:{ all -> 0x2a34 }
        L_0x26f3:
            X.11F r3 = r1.A45     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x271c
            X.12q r2 = r1.A3O     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.16D r0 = r0.getContactManager()     // Catch:{ all -> 0x2a34 }
            int r2 = X.AnonymousClass3TD.A00(r0, r2, r3)     // Catch:{ all -> 0x2a34 }
            X.0ts r0 = r1.A36     // Catch:{ all -> 0x2a34 }
            java.lang.String r3 = X.AnonymousClass3TD.A02(r0, r2)     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x271c
            X.155 r2 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0yb r0 = r0.getSystemServices()     // Catch:{ all -> 0x2a34 }
            X.C33521fV.A00(r2, r0, r3)     // Catch:{ all -> 0x2a34 }
        L_0x271c:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r0 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "ptt_fast_playback_player_state"
            int r0 = r2.getInt(r0, r12)     // Catch:{ all -> 0x2a34 }
            X.C148826zU.A12 = r0     // Catch:{ all -> 0x2a34 }
            X.0xf r2 = r1.A3o     // Catch:{ all -> 0x2a34 }
            X.11F r0 = r1.A45     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.AnonymousClass3M3.A01(r2, r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x275e
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r0 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r3 = "wac_intro_shown"
            boolean r0 = r0.getBoolean(r3, r12)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x275e
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            com.whatsapp.WAChatIntroBottomSheet r0 = new com.whatsapp.WAChatIntroBottomSheet     // Catch:{ all -> 0x2a34 }
            r0.<init>()     // Catch:{ all -> 0x2a34 }
            r2.Btm(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.0v0 r2 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.C36331k8.A18(r2, r3, r0)     // Catch:{ all -> 0x2a34 }
        L_0x275e:
            java.lang.String r2 = r10.A0K     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x2776
            X.3Dn r4 = r1.A41     // Catch:{ all -> 0x2a34 }
            X.4V6 r3 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x2a34 }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r2)     // Catch:{ all -> 0x2a34 }
            X.3Jt r2 = X.C54682tL.A00(r0)     // Catch:{ all -> 0x2a34 }
            r0 = 1
            r4.A00(r3, r2, r0)     // Catch:{ all -> 0x2a34 }
        L_0x2776:
            android.widget.LinearLayout r3 = r1.A0e     // Catch:{ all -> 0x2a34 }
            if (r3 == 0) goto L_0x2787
            boolean r0 = r1.A6A     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2787
            r2 = 1
            X.4XX r0 = new X.4XX     // Catch:{ all -> 0x2a34 }
            r0.<init>((X.C70803fk) r1, (int) r2)     // Catch:{ all -> 0x2a34 }
            r3.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x2a34 }
        L_0x2787:
            X.0yC r2 = r1.A3n     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r2, r12)     // Catch:{ all -> 0x2a34 }
            r0 = 4268(0x10ac, float:5.981E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x27ae
            X.155 r2 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            android.widget.ImageButton r0 = X.C63733Le.A00(r2, r0)     // Catch:{ all -> 0x2a34 }
        L_0x279e:
            r1.A0d = r0     // Catch:{ all -> 0x2a34 }
            A10(r1)     // Catch:{ all -> 0x2a34 }
            boolean r2 = r1.A66     // Catch:{ all -> 0x2a34 }
            X.155 r4 = A0B(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x27b7
        L_0x27ae:
            android.widget.ImageButton r0 = r1.A0c     // Catch:{ all -> 0x2a34 }
            goto L_0x279e
        L_0x27b1:
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r2 = com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog.A03(r6, r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x26ee
        L_0x27b7:
            if (r2 != 0) goto L_0x27df
            java.lang.String r2 = "show_expired_newsletter_message_dialog"
            r0 = r21
            boolean r0 = r0.getBooleanExtra(r2, r12)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x27ca
            r3 = 2131895256(0x7f1223d8, float:1.942534E38)
            r2 = 2131895255(0x7f1223d7, float:1.9425338E38)
            goto L_0x27da
        L_0x27ca:
            java.lang.String r2 = "show_revoked_newsletter_message_dialog"
            r0 = r21
            boolean r0 = r0.getBooleanExtra(r2, r12)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x27df
            r3 = 2131895261(0x7f1223dd, float:1.942535E38)
            r2 = 2131895260(0x7f1223dc, float:1.9425348E38)
        L_0x27da:
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x2a34 }
            r4.BO9(r0, r3, r2)     // Catch:{ all -> 0x2a34 }
        L_0x27df:
            boolean r0 = r1.A66     // Catch:{ all -> 0x2a34 }
            X.01z r5 = A06(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x2805
            java.lang.String r2 = "show_event_message_on_create_bundle"
            r0 = r21
            android.os.Bundle r2 = r0.getBundleExtra(r2)     // Catch:{ all -> 0x2a34 }
            if (r2 == 0) goto L_0x2805
            java.lang.String r0 = ""
            X.3Qa r4 = X.AnonymousClass3UJ.A03(r2, r0)     // Catch:{ all -> 0x2a34 }
            if (r4 == 0) goto L_0x2805
            X.0wU r3 = r1.A5S     // Catch:{ all -> 0x2a34 }
            r2 = 23
            X.3vL r0 = new X.3vL     // Catch:{ all -> 0x2a34 }
            r0.<init>(r1, r4, r5, r2)     // Catch:{ all -> 0x2a34 }
            r3.Bp1(r0)     // Catch:{ all -> 0x2a34 }
        L_0x2805:
            X.141 r2 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r0 = r19
            com.whatsapp.jid.Jid r4 = r2.A06(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            r3 = 0
            X.3L0 r2 = r0.A0E     // Catch:{ all -> 0x2a34 }
            X.3U1 r0 = new X.3U1     // Catch:{ all -> 0x2a34 }
            r0.<init>(r2)     // Catch:{ all -> 0x2a34 }
            r0.A02 = r4     // Catch:{ all -> 0x2a34 }
            r0.A01 = r3     // Catch:{ all -> 0x2a34 }
            boolean r5 = r0.A04()     // Catch:{ all -> 0x2a34 }
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2842
            X.0yC r0 = r1.A3n     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C55942vR.A00(r0)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2966
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.1Es r0 = r0.A06     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = r0.A01()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "yes"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x2a34 }
            goto L_0x2850
        L_0x2842:
            boolean r0 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x2857
            if (r5 != 0) goto L_0x2857
            X.141 r0 = r1.A3Y     // Catch:{ all -> 0x2a34 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x2a34 }
        L_0x2850:
            if (r0 == 0) goto L_0x2966
            A0s(r1)     // Catch:{ all -> 0x2a34 }
            goto L_0x2966
        L_0x2857:
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.1Hg r0 = r0.A02     // Catch:{ all -> 0x2a34 }
            X.11F r4 = r1.A45     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r0, r12)     // Catch:{ all -> 0x2a34 }
            X.0yC r3 = r0.A01     // Catch:{ all -> 0x2a34 }
            r2 = 6358(0x18d6, float:8.91E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r0, r3, r2)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2877
            boolean r0 = X.C197029b1.A00(r4)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x28f0
            if (r5 == 0) goto L_0x2877
            goto L_0x28f0
        L_0x2877:
            X.4V6 r2 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0 = 2131429845(0x7f0b09d5, float:1.8481374E38)
            android.view.View r6 = r2.findViewById(r0)     // Catch:{ all -> 0x2a34 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x2a34 }
            if (r6 == 0) goto L_0x2966
            X.04H r2 = A08(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.Class<com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel> r0 = com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class
            X.04R r5 = r2.A00(r0)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r5 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r5     // Catch:{ all -> 0x2a34 }
            r1.A23 = r5     // Catch:{ all -> 0x2a34 }
            X.11F r4 = r1.A45     // Catch:{ all -> 0x2a34 }
            r5.A00 = r4     // Catch:{ all -> 0x2a34 }
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x28b7
            X.16J r3 = r5.A03     // Catch:{ all -> 0x2a34 }
            java.lang.Iterable r0 = X.C36421kH.A0X(r3)     // Catch:{ all -> 0x2a34 }
            X.4a5 r2 = r5.A01     // Catch:{ all -> 0x2a34 }
            boolean r0 = X.C007103b.A0j(r0, r2)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x28ab
            r3.registerObserver(r2)     // Catch:{ all -> 0x2a34 }
        L_0x28ab:
            X.0wU r3 = r5.A06     // Catch:{ all -> 0x2a34 }
            r2 = 13
            X.74h r0 = new X.74h     // Catch:{ all -> 0x2a34 }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x2a34 }
            r3.Bp1(r0)     // Catch:{ all -> 0x2a34 }
        L_0x28b7:
            X.1tl r0 = r1.A55     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x28c6
            X.1hi r3 = r0.A05     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 40
            X.C80073uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
        L_0x28c6:
            X.1K3 r9 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r0 = r1.A23     // Catch:{ all -> 0x2a34 }
            X.1hi r2 = r0.A05     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            X.012 r7 = r0.getLifecycleOwner()     // Catch:{ all -> 0x2a34 }
            X.155 r8 = r0.getActivityNullable()     // Catch:{ all -> 0x2a34 }
            X.0ts r10 = r1.A36     // Catch:{ all -> 0x2a34 }
            X.1K4 r9 = (X.AnonymousClass1K4) r9     // Catch:{ all -> 0x2a34 }
            X.AnonymousClass00C.A0D(r2, r12)     // Catch:{ all -> 0x2a34 }
            r0 = 3
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ all -> 0x2a34 }
            r0 = 4
            X.C36421kH.A1J(r8, r0, r10)     // Catch:{ all -> 0x2a34 }
            X.3av r5 = new X.3av     // Catch:{ all -> 0x2a34 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2a34 }
            r2.A08(r7, r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x2966
        L_0x28f0:
            X.11F r7 = r1.A45     // Catch:{ all -> 0x2a34 }
            if (r7 == 0) goto L_0x2966
            X.1uG r0 = r1.A24     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x2966
            X.3B6 r0 = A0F(r1)     // Catch:{ all -> 0x2a34 }
            X.2yX r2 = r0.A01     // Catch:{ all -> 0x2a34 }
            X.1Mz r0 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r0 = r0.A01     // Catch:{ all -> 0x2a34 }
            X.17Y r9 = X.C36351kA.A0M(r0)     // Catch:{ all -> 0x2a34 }
            X.1Mz r0 = r2.A00     // Catch:{ all -> 0x2a34 }
            X.0tq r8 = r0.A01     // Catch:{ all -> 0x2a34 }
            X.0wU r20 = X.C36341k9.A0Z(r8)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A7r     // Catch:{ all -> 0x2a34 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.17U r6 = (X.AnonymousClass17U) r6     // Catch:{ all -> 0x2a34 }
            X.1X4 r10 = X.C36361kB.A0T(r8)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A4O     // Catch:{ all -> 0x2a34 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1Cv r5 = (X.C24541Cv) r5     // Catch:{ all -> 0x2a34 }
            X.16J r16 = X.C36361kB.A0Z(r8)     // Catch:{ all -> 0x2a34 }
            X.1NM r14 = X.C36401kF.A0W(r8)     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A3L     // Catch:{ all -> 0x2a34 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1F4 r4 = (X.AnonymousClass1F4) r4     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A14     // Catch:{ all -> 0x2a34 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.6BB r3 = (X.AnonymousClass6BB) r3     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A12     // Catch:{ all -> 0x2a34 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.30Y r2 = (X.AnonymousClass30Y) r2     // Catch:{ all -> 0x2a34 }
            X.004 r0 = r8.A19     // Catch:{ all -> 0x2a34 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2a34 }
            X.1KK r0 = (X.AnonymousClass1KK) r0     // Catch:{ all -> 0x2a34 }
            X.1uG r8 = new X.1uG     // Catch:{ all -> 0x2a34 }
            r11 = r0
            r12 = r2
            r13 = r3
            r15 = r5
            r17 = r6
            r18 = r4
            r19 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x2a34 }
            r1.A24 = r8     // Catch:{ all -> 0x2a34 }
            X.08S r3 = r8.A03     // Catch:{ all -> 0x2a34 }
            X.012 r2 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r0 = 13
            X.C66033Uk.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x2a34 }
        L_0x2966:
            boolean r0 = A1a(r1)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2a2e
            X.1K3 r3 = X.AnonymousClass3B6.A00(r1)     // Catch:{ all -> 0x2a34 }
            int r2 = r1.A01     // Catch:{ all -> 0x2a34 }
            X.1K4 r3 = (X.AnonymousClass1K4) r3     // Catch:{ all -> 0x2a34 }
            r0 = 20
            if (r2 != r0) goto L_0x2a2e
            X.0yC r3 = r3.A07     // Catch:{ all -> 0x2a34 }
            r2 = 6983(0x1b47, float:9.785E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r0, r3, r2)     // Catch:{ all -> 0x2a34 }
            if (r0 == 0) goto L_0x2a2e
            X.1uh r0 = r1.A2x     // Catch:{ all -> 0x2a34 }
            X.00s r3 = r0.A0S     // Catch:{ all -> 0x2a34 }
            r0 = 16
            X.3UW r2 = new X.3UW     // Catch:{ all -> 0x2a34 }
            r2.<init>(r3, r1, r0)     // Catch:{ all -> 0x2a34 }
            X.012 r0 = A07(r1)     // Catch:{ all -> 0x2a34 }
            r3.A08(r0, r2)     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x2998:
            java.lang.String r0 = "fail_tell_a_friend"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            java.lang.String r6 = r10.A0M     // Catch:{ all -> 0x2a34 }
            android.net.Uri r4 = r10.A03     // Catch:{ all -> 0x2a34 }
            android.content.Intent r3 = X.C36431kI.A0D()     // Catch:{ all -> 0x2a34 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "com.whatsapp.conversationslist.SmsDefaultAppWarning"
            r3.setClassName(r2, r0)     // Catch:{ all -> 0x2a34 }
            r3.setData(r4)     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x29c0
            java.lang.String r0 = "sms_body"
            r3.putExtra(r0, r6)     // Catch:{ all -> 0x2a34 }
        L_0x29c0:
            r3.setData(r4)     // Catch:{ all -> 0x2a34 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2a34 }
            if (r0 != 0) goto L_0x29ce
            java.lang.String r0 = "sms_body"
            r3.putExtra(r0, r6)     // Catch:{ all -> 0x2a34 }
        L_0x29ce:
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.startActivity(r3)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.BPG(r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x29de:
            java.lang.String r0 = "fail_display_name"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.1Y3 r3 = r1.A2X     // Catch:{ all -> 0x2a34 }
            X.11F r2 = r10.A08     // Catch:{ all -> 0x2a34 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x2a34 }
            r3.A01(r2, r4, r4, r4)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.BPG(r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x29f8:
            java.lang.String r0 = "fail"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.BPG(r5)     // Catch:{ all -> 0x2a34 }
            goto L_0x2a2e
        L_0x2a08:
            java.lang.String r0 = "conversation/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2a34 }
            java.lang.String r0 = "no_msg_store"
            A1I(r1, r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.getGlobalUI()     // Catch:{ all -> 0x2a34 }
            X.155 r0 = A0C(r1)     // Catch:{ all -> 0x2a34 }
            android.content.Intent r2 = X.AnonymousClass190.A09(r0)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.startActivity(r2)     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.finish()     // Catch:{ all -> 0x2a34 }
            X.4V6 r0 = r1.A2l     // Catch:{ all -> 0x2a34 }
            r0.BPG(r5)     // Catch:{ all -> 0x2a34 }
        L_0x2a2e:
            r0 = r33
            A1I(r1, r0)
            return
        L_0x2a34:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x2a36 }
        L_0x2a36:
            r2 = move-exception
            r0 = r33
            A1I(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70803fk.A29(android.os.Bundle):void");
    }
}
