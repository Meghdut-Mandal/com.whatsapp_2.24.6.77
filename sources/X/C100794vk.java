package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4vk  reason: invalid class name and case insensitive filesystem */
public abstract class C100794vk extends C100874wB implements AnonymousClass4UT, AnonymousClass4U9, AnonymousClass7fN, AnonymousClass4R2 {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public AnonymousClass16D A03;
    public AnonymousClass171 A04;
    public C64953Qc A05;
    public C220412q A06;
    public AnonymousClass3XT A07;
    public AnonymousClass16E A08;
    public C1261362r A09;
    public AnonymousClass6O1 A0A;
    public AnonymousClass1XN A0B;
    public EmojiSearchProvider A0C;
    public AnonymousClass3G2 A0D;
    public C19890wg A0E;
    public C64883Pu A0F;
    public C28331Sf A0G;
    public C60963Aa A0H;
    public AnonymousClass1GX A0I;
    public AnonymousClass1UM A0J;
    public C28781Ua A0K;
    public File A0L;
    public List A0M;
    public List A0N;
    public C160657lN A0O;
    public AnonymousClass6BW A0P;
    public View A0Q;
    public boolean A0R;
    public final AnonymousClass005 A0S = C165307tD.A00(this, 0);

    public void A3j(File file, boolean z) {
        DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) this;
        if (documentPreviewActivity.A0N.size() == 0) {
            documentPreviewActivity.A3k(false);
            return;
        }
        Uri uri = (Uri) documentPreviewActivity.getIntent().getParcelableExtra("uri");
        if (uri != null) {
            File file2 = file;
            if (z) {
                documentPreviewActivity.A00.A04(uri, documentPreviewActivity, (AnonymousClass3T1) null, file2, documentPreviewActivity.A0H.A05.getStringText(), documentPreviewActivity.A0N, documentPreviewActivity.A0H.A05.getMentions(), 1, false);
                documentPreviewActivity.Bvu(documentPreviewActivity.A0N);
                documentPreviewActivity.setResult(-1);
            } else {
                Intent A0D2 = C36431kI.A0D();
                if (file != null) {
                    A0D2.putExtra("file_path", file.getPath());
                }
                A0D2.putExtra("uri", documentPreviewActivity.getIntent().getParcelableExtra("uri"));
                A0D2.putExtra("caption", documentPreviewActivity.A0H.A05.getStringText());
                A0D2.putExtra("mentions", C65713Te.A01(documentPreviewActivity.A0H.A05.getMentions()));
                A0D2.putStringArrayListExtra("jids", AnonymousClass143.A07(documentPreviewActivity.A0N));
                A0D2.putExtra("clear_message_after_send", documentPreviewActivity.getIntent().getBooleanExtra("clear_message_after_send", false));
                documentPreviewActivity.setResult(-1, A0D2);
            }
            documentPreviewActivity.finish();
        }
    }

    public /* synthetic */ void BQm() {
    }

    public void Be4(int i) {
    }

    public void BeL(boolean z) {
        this.A0R = true;
        A3k(z);
    }

    public /* synthetic */ void BkR() {
    }

    public /* synthetic */ void onDismiss() {
    }

    private void A01() {
        A3j(this.A0L, C36421kH.A1T(getIntent(), "send"));
        this.A05.A03(2);
        this.A0L = null;
    }

    public static void A07(C18800tq r1, C100794vk r2, C220412q r3) {
        r2.A06 = r3;
        r2.A08 = (AnonymousClass16E) r1.A80.get();
        r2.A0B = (AnonymousClass1XN) r1.A7G.get();
        r2.A0G = (C28331Sf) r1.A7w.get();
    }

    public void A3k(boolean z) {
        int i;
        AnonymousClass3OM r1 = new AnonymousClass3OM(this);
        r1.A0G = true;
        r1.A0L = true;
        r1.A0c = this.A0N;
        if (this instanceof GifVideoPreviewActivity) {
            i = 13;
        } else {
            i = 9;
        }
        r1.A0a = C36441kJ.A15(Collections.singleton(Integer.valueOf(i)));
        r1.A0M = Boolean.valueOf(z);
        Intent A022 = AnonymousClass3OM.A02(r1, "com.whatsapp.contact.picker.ContactPicker");
        this.A0F.A02(A022, this.A07);
        startActivityForResult(A022, 1);
    }

    public void BaW(File file, String str) {
        this.A0L = file;
        if (TextUtils.isEmpty(getIntent().getStringExtra("media_url")) && file == null) {
            Log.e("MediaPreviewActivity/onMediaFileLoaded neither file nor media url provided");
            finish();
        }
    }

    public void Be3(int i) {
        AnonymousClass3XT r1;
        AnonymousClass3XT r12 = this.A07;
        int i2 = i;
        if (!(r12.A00 == i || this.A07 == (r1 = new AnonymousClass3XT(r12.A01, r12.A02, i2, r12.A03, r12.A04)))) {
            this.A07 = r1;
        }
        A01();
    }

    public void onCreate(Bundle bundle) {
        C160657lN A002;
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        boolean z = false;
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0W(false);
        }
        boolean A003 = this.A0G.A00();
        int i = R.layout.f9nameremoved;
        if (A003) {
            i = R.layout.f9nameremoved;
        }
        AnonymousClass141 r5 = null;
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) null, false);
        this.A0Q = inflate;
        setContentView(inflate);
        this.A01 = C36441kJ.A0T(this.A0Q, R.id.preview_holder);
        this.A00 = C03570Gk.A0B(this, R.id.loading_progress);
        this.A02 = (ImageView) C03570Gk.A0B(this, R.id.thumb_view);
        this.A00.setVisibility(0);
        this.A02.setVisibility(0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("uri");
        if (parcelableExtra == null) {
            BaW((File) null, (String) null);
        } else {
            C107025Mg r2 = new C107025Mg(this, this, this.A0I);
            this.A04.Bp0(r2, parcelableExtra);
        }
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        if (A0F2 != null) {
            List singletonList = Collections.singletonList(A0F2);
            this.A0M = singletonList;
            this.A0N = singletonList;
        } else {
            ArrayList A0u = C36401kF.A0u(getIntent(), AnonymousClass11F.class, "jids");
            this.A0M = A0u;
            this.A0N = A0u;
        }
        if (this.A0G.A00()) {
            A002 = this.A0D.A01((ViewStub) C03570Gk.A0B(this, R.id.media_recipients_stub), (C51292na) this.A0S.get());
        } else {
            A002 = this.A0D.A00((DefaultRecipientsView) C03570Gk.A0B(this, R.id.media_recipients));
        }
        this.A0O = A002;
        this.A0P = new AnonymousClass6BW((WaImageButton) C03570Gk.A0B(this, R.id.send), this.A00);
        if (getIntent().getBooleanExtra("usage_quote", false) || AnonymousClass143.A0L(this.A0N)) {
            this.A0O.B5T();
        } else {
            this.A0O.Bru(this);
        }
        C48752hz.A00(this.A0P.A01, this, 32);
        if (this.A0K.A00()) {
            z = Boolean.TRUE.equals(this.A0J.A01(AnonymousClass1US.MEDIA_PREVIEW_ACTIVITY));
        }
        this.A07 = new AnonymousClass3XT(this.A08.A0A(), this.A08.A0B(), this.A08.A05(), z, false);
        A3i();
        C20810yC r18 = this.A0D;
        AnonymousClass1N2 r16 = this.A0C;
        C19700wN r15 = this.A03;
        AnonymousClass1H2 r14 = this.A0C;
        AnonymousClass1XN r13 = this.A0B;
        C21060yb r11 = this.A08;
        C18820ts r10 = this.A00;
        C1261362r r9 = this.A09;
        EmojiSearchProvider emojiSearchProvider = this.A0C;
        C19420v0 r7 = this.A09;
        C19890wg r4 = this.A0E;
        AnonymousClass6O1 r3 = this.A0A;
        AnonymousClass1N0 r22 = this.A0B;
        View view = this.A0Q;
        if (A0F2 != null) {
            r5 = this.A03.A0D(A0F2);
        }
        AnonymousClass1H2 r28 = r14;
        EmojiSearchProvider emojiSearchProvider2 = emojiSearchProvider;
        C20810yC r30 = r18;
        AnonymousClass1N0 r24 = r22;
        C1261362r r25 = r9;
        AnonymousClass6O1 r26 = r3;
        AnonymousClass1XN r27 = r13;
        C21060yb r20 = r11;
        C19420v0 r21 = r7;
        C18820ts r222 = r10;
        AnonymousClass141 r23 = r5;
        View view2 = view;
        C19700wN r19 = r15;
        this.A0H = new C60963Aa(this, view2, r19, r20, r21, r222, r23, r24, r25, r26, r27, r28, emojiSearchProvider2, r30, this, r4, r16, getIntent().getStringExtra("caption"), C65713Te.A03(getIntent().getStringExtra("mentions")), this.A0N, this.A02.A0L());
    }

    public void A3i() {
        View A0B2 = C03570Gk.A0B(this, R.id.input_container);
        boolean A1R = AnonymousClass000.A1R(this.A0N.size());
        this.A0O.Brt(this.A07, this.A0N, true);
        C18820ts r0 = this.A00;
        if (A1R) {
            AnonymousClass6H8.A00(A0B2, r0);
        } else {
            AnonymousClass6H8.A01(A0B2, r0);
        }
        this.A0P.A01(A1R);
    }

    public void BT7() {
        A01();
    }

    public void BgE() {
        A01();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A0N = C36401kF.A0u(intent, AnonymousClass11F.class, "jids");
            C18740tg.A06(intent);
            AnonymousClass3XT A012 = this.A0F.A01(intent.getExtras());
            C18740tg.A06(A012);
            this.A07 = A012;
            A3i();
            if (i2 == -1) {
                A01();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A0L != null && isFinishing()) {
            this.A0L.getPath();
            AnonymousClass6YY.A0P(this.A0L);
        }
    }
}
