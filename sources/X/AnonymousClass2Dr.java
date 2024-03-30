package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.info.views.StarredMessageInfoView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2Dr  reason: invalid class name */
public abstract class AnonymousClass2Dr extends AnonymousClass27o {
    public long A00;
    public View A01;
    public AnonymousClass18S A02;
    public AnonymousClass1X4 A03;
    public AnonymousClass9XI A04;
    public C29461Ws A05;
    public AnonymousClass9Y1 A06;
    public C199439fJ A07;
    public AnonymousClass4PU A08;
    public AnonymousClass4PV A09;
    public AnonymousClass3HB A0A;
    public AnonymousClass4PW A0B;
    public C62513Gl A0C;
    public C235718z A0D;
    public AnonymousClass3L5 A0E;
    public AnonymousClass1Q7 A0F;
    public AnonymousClass16D A0G;
    public C20830yE A0H;
    public AnonymousClass163 A0I;
    public C220412q A0J;
    public C24381Cf A0K;
    public C20310xM A0L;
    public AnonymousClass17X A0M;
    public AnonymousClass1EL A0N;
    public C32641dx A0O;
    public C24631De A0P;
    public AnonymousClass1FR A0Q;
    public AnonymousClass1CR A0R;
    public AnonymousClass1A1 A0S;
    public AnonymousClass1N6 A0T;
    public MediaCard A0U;
    public AnonymousClass1EM A0V;
    public AnonymousClass1SV A0W;
    public AnonymousClass1RJ A0X;
    public AnonymousClass005 A0Y;
    public boolean A0Z;
    public C009904e A0a = null;
    public C39801to A0b;
    public AnonymousClass2bU A0c;
    public boolean A0d = false;
    public final HashSet A0e = C36441kJ.A16();

    public void A2X() {
        this.A0T.A03(A3j(), 5);
        super.A2X();
    }

    public AnonymousClass11F A3j() {
        if (this instanceof NewsletterInfoActivity) {
            return ((NewsletterInfoActivity) this).A3v();
        }
        if (this instanceof GroupChatInfoActivity) {
            return ((GroupChatInfoActivity) this).A3t();
        }
        if (this instanceof ListChatInfoActivity) {
            return ((ListChatInfoActivity) this).A3t();
        }
        return C36351kA.A0k(((ContactInfoActivity) this).A0z);
    }

    public void A3k() {
        this.A0C.A01(C36361kB.A0d(A3j(), this.A0R).A03);
    }

    public void A3l() {
        this.A0b.A0T();
    }

    public void A3m() {
        MediaCard mediaCard = this.A0U;
        if (mediaCard == null) {
            mediaCard = (MediaCard) C03570Gk.A0B(this, R.id.media_card_view);
        }
        this.A0U = mediaCard;
        this.A0A = this.A09.B4D(this, A3j(), this.A0U);
    }

    public void A3o(Bitmap bitmap) {
        if (bitmap != null) {
            ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((AnonymousClass2E6) findViewById(R.id.content));
            C36351kA.A19(chatInfoLayoutV2, R.id.photo_progress);
            chatInfoLayoutV2.A03.setImageBitmap(bitmap);
            chatInfoLayoutV2.A03.setOnClickListener(chatInfoLayoutV2.A0B);
            AnonymousClass9UJ r5 = new AnonymousClass9UJ(bitmap);
            new C37021lg(r5, new C68203bV(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
        }
    }

    public void A3p(C39801to r3) {
        this.A0b = r3;
        C55422ub.A01(this, r3.A02, 0);
        C55422ub.A01(this, r3.A05, 2);
        C55422ub.A01(this, r3.A07, 6);
        C55422ub.A01(this, r3.A03, 4);
        C55422ub.A01(this, r3.A06, 5);
        C55422ub.A01(this, r3.A04, 1);
        C55422ub.A01(this, r3.A01, 3);
    }

    public void A3r(String str, int i) {
        View A022 = C012005e.A02(this.A00, R.id.exit_group_btn);
        if (A022 instanceof ListItemWithLeftIcon) {
            AnonymousClass22V r1 = (AnonymousClass22V) A022;
            r1.setTitle(str);
            r1.setIcon(i);
        }
    }

    public void A3s(List list) {
        this.A0A.A01(list);
    }

    public void onCreate(Bundle bundle) {
        C64933Qa A032;
        if (AnonymousClass3U9.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                C92034d1 r2 = new C92034d1(true, false);
                r2.addTarget(C36401kF.A0o(new AnonymousClass3CG(this).A00, R.string.f12nameremoved));
                window.setSharedElementEnterTransition(r2);
                r2.addListener(new C89284Vy(this, 0));
            }
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        A28(5);
        super.onCreate(bundle);
        C235718z r3 = this.A0D;
        this.A0a = BnD(new C67443Zv(this, r3, 4), new C009504a());
        if (bundle != null && (A032 = AnonymousClass3UJ.A03(bundle, "requested_message")) != null) {
            this.A0c = (AnonymousClass2bU) this.A0S.A03(A032);
        }
    }

    public void onDestroy() {
        if (this.A0d) {
            C235718z r1 = this.A0D;
            if (!r1.A01) {
                r1.A03 = false;
                this.A0d = false;
            }
        }
        super.onDestroy();
        A3l();
    }

    public void A3n(long j) {
        ((StarredMessageInfoView) findViewById(R.id.starred_messages_layout)).A08(j, this.A0N.A02(A3j()));
    }

    public void A3q(Integer num) {
        AnonymousClass2E6 r6 = (AnonymousClass2E6) findViewById(R.id.content);
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) r6;
        C36351kA.A19(chatInfoLayoutV2, R.id.photo_progress);
        if (num != null) {
            chatInfoLayoutV2.A05.A05(chatInfoLayoutV2.A03, chatInfoLayoutV2.A00, num.intValue(), C36441kJ.A05(chatInfoLayoutV2.getResources(), R.dimen.f7nameremoved));
        }
        chatInfoLayoutV2.A03.setOnClickListener(chatInfoLayoutV2.A0B);
        r6.setColor(C36391kE.A05(this));
        findViewById(R.id.bottom_shade).setBackgroundColor(0);
        findViewById(R.id.top_shade).setBackgroundColor(0);
    }

    public void finishAfterTransition() {
        A3l();
        super.finishAfterTransition();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 34 && i2 == -1) {
            this.A0A.A00((View) null);
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A3l();
        }
    }

    public void onResume() {
        AnonymousClass11F A3j = A3j();
        if (A3j != null && this.A0D.A0P(A3j())) {
            C009904e r2 = this.A0a;
            if (r2 != null) {
                C235718z r1 = this.A0D;
                if (!r1.A02) {
                    this.A0d = true;
                    r1.A09(r2, A3j, 4);
                }
            }
            finish();
            C235718z r12 = this.A0D;
            if (!r12.A01) {
                r12.A02 = false;
            }
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass2bU r0 = this.A0c;
        if (r0 != null) {
            AnonymousClass3UJ.A09(bundle, r0.A1J, "requested_message");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        AnonymousClass11F A3j = A3j();
        if (A3j != null && this.A0D.A06.A0Q(A3j)) {
            Window window = getWindow();
            if (z) {
                window.clearFlags(DefaultCrypto.BUFFER_SIZE);
            } else {
                window.setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
            }
        }
    }
}
