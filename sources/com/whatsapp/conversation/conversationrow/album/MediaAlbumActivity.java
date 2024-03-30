package com.whatsapp.conversation.conversationrow.album;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass012;
import X.AnonymousClass07B;
import X.AnonymousClass0PG;
import X.AnonymousClass0V4;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass13K;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1D1;
import X.AnonymousClass1E2;
import X.AnonymousClass1GQ;
import X.AnonymousClass1H2;
import X.AnonymousClass1JL;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass1XY;
import X.AnonymousClass22g;
import X.AnonymousClass22t;
import X.AnonymousClass2IU;
import X.AnonymousClass2bI;
import X.AnonymousClass319;
import X.AnonymousClass3E2;
import X.AnonymousClass3J6;
import X.AnonymousClass3K9;
import X.AnonymousClass3PH;
import X.AnonymousClass3SJ;
import X.AnonymousClass3T1;
import X.AnonymousClass3T4;
import X.AnonymousClass3U9;
import X.AnonymousClass3UJ;
import X.AnonymousClass3XT;
import X.AnonymousClass4P9;
import X.AnonymousClass4Q4;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4W7;
import X.AnonymousClass4WB;
import X.AnonymousClass6O1;
import X.C011004s;
import X.C02460Ak;
import X.C07540Ye;
import X.C1261362r;
import X.C17210qu;
import X.C177528dw;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C19890wg;
import X.C20800yB;
import X.C21000yV;
import X.C21710zg;
import X.C222713q;
import X.C226815j;
import X.C233117z;
import X.C24361Cd;
import X.C24511Cs;
import X.C27111My;
import X.C32001cn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C36771lH;
import X.C37981nW;
import X.C39181rS;
import X.C40141v1;
import X.C43642Jg;
import X.C43662Ji;
import X.C61383Bq;
import X.C62013Ej;
import X.C62473Gh;
import X.C64883Pu;
import X.C67303Zh;
import X.C67703aL;
import X.C70523fI;
import X.C70683fY;
import X.C70783fi;
import X.C70793fj;
import X.C74953mR;
import X.C80283v9;
import X.C81703xR;
import X.C88554Td;
import X.C88784Ua;
import X.C89004Uw;
import X.C89014Ux;
import X.C89324Wc;
import X.C89924Yk;
import X.C90394a5;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MediaAlbumActivity extends AnonymousClass2IU implements C89004Uw, C17210qu, AnonymousClass4P9 {
    public Bundle A00;
    public View A01;
    public ListView A02;
    public Toolbar A03;
    public C19460v5 A04;
    public C61383Bq A05;
    public AnonymousClass1XY A06;
    public C24361Cd A07;
    public AnonymousClass16I A08;
    public AnonymousClass319 A09;
    public MessageSelectionViewModel A0A;
    public C37981nW A0B;
    public C43662Ji A0C;
    public C36771lH A0D;
    public AnonymousClass3E2 A0E;
    public C70683fY A0F;
    public AnonymousClass22t A0G;
    public C1261362r A0H;
    public AnonymousClass6O1 A0I;
    public AnonymousClass1XN A0J;
    public AnonymousClass3J6 A0K;
    public C233117z A0L;
    public AnonymousClass1JL A0M;
    public AnonymousClass11F A0N;
    public AnonymousClass11F A0O;
    public AnonymousClass3K9 A0P;
    public AnonymousClass1D1 A0Q;
    public AnonymousClass1E2 A0R;
    public AnonymousClass1GQ A0S;
    public C19890wg A0T;
    public C64883Pu A0U;
    public AnonymousClass13J A0V;
    public boolean A0W;
    public final AnonymousClass4Q4 A0X;
    public final HashSet A0Y;
    public final HashSet A0Z;
    public final C32001cn A0a;
    public final C226815j A0b;
    public final AnonymousClass191 A0c;
    public final C24511Cs A0d;

    public int A2I() {
        return 78318969;
    }

    public void Ba7(AnonymousClass0V4 r1) {
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public void onStart() {
        super.onStart();
        AnonymousClass1H2 r8 = this.A0C;
        C70523fI r0 = this.A00;
        AnonymousClass16D r2 = r0.A0C;
        AnonymousClass171 r3 = r0.A0F;
        C18820ts r7 = this.A00;
        this.A0F = new AnonymousClass4W7(this, r2, r3, new AnonymousClass3PH(), this.A05.A00(this), this.A0C, r7, r8, this, 0);
    }

    public static int A0u(MediaAlbumActivity mediaAlbumActivity) {
        if (mediaAlbumActivity.A0D.A0E(6650)) {
            Rect A062 = AnonymousClass001.A06();
            C36361kB.A0C(mediaAlbumActivity).getWindowVisibleDisplayFrame(A062);
            return A062.top;
        }
        int identifier = mediaAlbumActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C36361kB.A02(mediaAlbumActivity, identifier);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0w(com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r11) {
        /*
            X.1nW r0 = r11.A0B
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.1nW r0 = r11.A0B
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x0017:
            boolean r0 = r2.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x002f
            X.3T1 r0 = X.C36391kE.A0l(r2)
            int r1 = r0.A1I
            if (r1 != r6) goto L_0x0029
            int r10 = r10 + 1
            goto L_0x0017
        L_0x0029:
            r0 = 3
            if (r1 != r0) goto L_0x0017
            int r8 = r8 + 1
            goto L_0x0017
        L_0x002f:
            X.1nW r0 = r11.A0B
            java.util.List r0 = r0.A00
            X.3T1 r4 = X.C36411kG.A0n(r0, r7)
            if (r8 != 0) goto L_0x007d
            X.0ts r9 = r11.A00
            r5 = 2131755250(0x7f1000f2, float:1.9141374E38)
            long r2 = (long) r10
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
        L_0x0045:
            r1[r7] = r0
            java.lang.String r5 = r9.A0L(r1, r5, r2)
        L_0x004b:
            long r2 = r4.A0I
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r0, r2)
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r5)
            java.lang.String r1 = "  "
            r3.append(r1)
            r0 = 2131896446(0x7f12287e, float:1.9427753E38)
            X.C36351kA.A14(r11, r3, r0)
            r3.append(r1)
            X.0ts r2 = r11.A00
            long r0 = r4.A0I
            java.lang.String r0 = X.AnonymousClass3UY.A0E(r2, r0)
            java.lang.String r5 = X.AnonymousClass000.A0q(r0, r3)
        L_0x0075:
            X.07B r0 = X.C36381kD.A0O(r11)
            r0.A0P(r5)
            return
        L_0x007d:
            if (r10 != 0) goto L_0x008c
            X.0ts r9 = r11.A00
            r5 = 2131755253(0x7f1000f5, float:1.914138E38)
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0045
        L_0x008c:
            r3 = 2131891767(0x7f121637, float:1.9418263E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            X.0ts r1 = r11.A00
            r0 = 2131755250(0x7f1000f2, float:1.9141374E38)
            java.lang.String r0 = X.C36331k8.A0g(r1, r10, r7, r0)
            r2[r7] = r0
            X.0ts r1 = r11.A00
            r0 = 2131755253(0x7f1000f5, float:1.914138E38)
            java.lang.String r0 = X.C36331k8.A0g(r1, r8, r7, r0)
            java.lang.String r5 = X.C36391kE.A0v(r11, r0, r2, r6, r3)
            goto L_0x004b
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0w(com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity):void");
    }

    public void A2F() {
        if (!this.A0W) {
            this.A0W = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r2 = r1.A00;
            C36321k7.A0X(r1, r2, this, C36321k7.A05(r1, r2, this));
            AnonymousClass22g.A0l(this);
            this.A0Q = (AnonymousClass1D1) r1.APG.get();
            this.A0R = (AnonymousClass1E2) r1.Adc.get();
            this.A06 = C36411kG.A0Y(r1);
            this.A0J = C36351kA.A0d(r1);
            this.A0V = C36351kA.A0q(r1);
            this.A0S = C36371kC.A0f(r1);
            this.A08 = C36351kA.A0S(r1);
            this.A07 = C36371kC.A0T(r1);
            this.A0M = (AnonymousClass1JL) r2.A3t.get();
            this.A0U = C36381kD.A0h(r2);
            this.A0T = C36351kA.A0m(r1);
            this.A0L = C36371kC.A0c(r1);
            this.A0P = (AnonymousClass3K9) r2.A2s.get();
            this.A09 = (AnonymousClass319) r2.A19.get();
            this.A0C = new C43662Ji((C43642Jg) r1.A00.A6J.get());
            this.A0E = (AnonymousClass3E2) r2.A4j.get();
            this.A04 = C19470v6.A00;
            this.A05 = (C61383Bq) A0L2.A17.get();
            this.A0H = C36371kC.A0b(r2);
            this.A0I = C36351kA.A0c(r2);
        }
    }

    public /* bridge */ /* synthetic */ void BNx(Object obj) {
        this.A05.A00(this).B73(C70793fj.A00, Collections.singleton(obj), 1);
    }

    public AnonymousClass0V4 BUt(Bundle bundle, int i) {
        AnonymousClass1A1 r2 = this.A00.A0x;
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        C18740tg.A06(longArrayExtra);
        return new C40141v1(this, r2, longArrayExtra);
    }

    public /* bridge */ /* synthetic */ void Ba0(AnonymousClass0V4 r10, Object obj) {
        int headerViewsCount;
        int A0u;
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            C37981nW r8 = this.A0B;
            r8.A00 = list;
            r8.notifyDataSetChanged();
            MediaAlbumActivity mediaAlbumActivity = r8.A02;
            if (mediaAlbumActivity.A00 != null) {
                mediaAlbumActivity.getListView().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
                mediaAlbumActivity.A00 = null;
            } else {
                int intExtra = mediaAlbumActivity.getIntent().getIntExtra("start_index", 0);
                if (intExtra < r8.getCount()) {
                    C62013Ej r6 = r8.A01;
                    Point point = new Point();
                    MediaAlbumActivity mediaAlbumActivity2 = r6.A05;
                    C36321k7.A0K(mediaAlbumActivity2, point);
                    int i = point.y;
                    int i2 = point.x;
                    ListView listView = mediaAlbumActivity2.getListView();
                    C18740tg.A04(listView);
                    if (i >= i2) {
                        View view = r8.getView(intExtra, (View) null, listView);
                        boolean z = false;
                        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), 0);
                        r6.A01 = (i * 4) / 5;
                        int measuredHeight = view.getMeasuredHeight();
                        r6.A02 = measuredHeight;
                        int i3 = r6.A01;
                        if (i3 < measuredHeight) {
                            r6.A00 = intExtra;
                        } else {
                            r6.A00 = -1;
                        }
                        if (intExtra != 0) {
                            int min = Math.min(measuredHeight, i3);
                            if (intExtra == r8.getCount() - 1) {
                                z = true;
                            }
                            r6.A03 = r6.A00(i, min, z);
                            headerViewsCount = intExtra + listView.getHeaderViewsCount();
                            A0u = r6.A03;
                        } else {
                            r6.A03 = 0;
                        }
                    } else {
                        headerViewsCount = intExtra + listView.getHeaderViewsCount();
                        A0u = A0u(mediaAlbumActivity2) + C36391kE.A02(mediaAlbumActivity2);
                    }
                    listView.setSelectionFromTop(headerViewsCount, A0u);
                }
            }
            A0w(this);
            C89924Yk.A00(getListView().getViewTreeObserver(), this, 3);
            return;
        }
        finish();
    }

    public boolean BgA() {
        Log.i("MediaAlbumActivity/starred/onSelectionRequested");
        return this.A0A.A0T(C36371kC.A00(C20800yB.A01(C21000yV.A01, ((AnonymousClass13K) this.A0V).A02, 2889) ? 1 : 0));
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A00.A0P.A01;
    }

    public void onCreate(Bundle bundle) {
        int length;
        if (AnonymousClass3U9.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220);
            autoTransition.setInterpolator(new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        this.A00 = bundle;
        super.onCreate(bundle);
        A1p();
        this.A03 = C36361kB.A0O(this, R.layout.f9nameremoved);
        this.A01 = findViewById(R.id.root);
        setSupportActionBar(this.A03);
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        A0O2.A0U(true);
        this.A08.registerObserver(this.A0b);
        this.A00.A0Z.registerObserver(this.A0c);
        this.A07.registerObserver(this.A0a);
        this.A0L.registerObserver(this.A0d);
        C36361kB.A0C(this).setSystemUiVisibility(1792);
        C36391kE.A14(this);
        getWindow().addFlags(134217728);
        String stringExtra = getIntent().getStringExtra("chat_jid");
        C222713q r1 = AnonymousClass11F.A00;
        this.A0N = r1.A02(stringExtra);
        AnonymousClass11F A022 = r1.A02(C36341k9.A0d(this));
        this.A0O = A022;
        if (A022 == null) {
            A0O2.A0I(R.string.f12nameremoved);
        } else if (this.A0D.A0E(6650)) {
            C80283v9.A00(this.A04, this, A0O2, 16);
        } else {
            C70523fI r0 = this.A00;
            A0O2.A0Q(C36381kD.A0u(r0.A0C, r0.A0F, this.A0O));
        }
        this.A0B = new C37981nW(this);
        ListView listView = getListView();
        this.A02 = listView;
        listView.setFastScrollEnabled(false);
        this.A02.setScrollbarFadingEnabled(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(0, 0, 0, C36391kE.A02(this));
        this.A02.addHeaderView(frameLayout, (Object) null, false);
        FrameLayout frameLayout2 = new FrameLayout(this);
        this.A02.addFooterView(frameLayout2, (Object) null, false);
        View findViewById = findViewById(R.id.title_background);
        C011004s.A07(this.A02, new C67703aL(frameLayout, frameLayout2, findViewById, this));
        C36771lH r02 = new C36771lH(C36391kE.A05(this));
        this.A0D = r02;
        A0O2.A0K(r02);
        int A052 = C36391kE.A05(this);
        int A053 = C36391kE.A05(this);
        this.A02.setOnScrollListener(new C67303Zh(frameLayout, this, AnonymousClass00F.A00(this, R.color.f6nameremoved), A053, A052));
        A3i(this.A0B);
        View findViewById2 = findViewById(R.id.background);
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
        verticalSwipeDismissBehavior.A05 = new C74953mR(findViewById2, findViewById, this);
        ((C02460Ak) this.A02.getLayoutParams()).A00(verticalSwipeDismissBehavior);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) C36441kJ.A0b(this).A00(MessageSelectionViewModel.class);
        this.A0A = messageSelectionViewModel;
        messageSelectionViewModel.A01.A08(this, new C88554Td(this, 38));
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        if (longArrayExtra == null || (length = longArrayExtra.length) == 0) {
            finish();
            return;
        }
        A0O2.A0P(C36331k8.A0g(this.A00, length, 0, R.plurals.f10nameremoved));
        C07540Ye.A00(this).A03(this);
        C36401kF.A1C(this);
    }

    public MediaAlbumActivity(int i) {
        this.A0W = false;
        C89324Wc.A00(this, 46);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1.A02(r2, false) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A0v() {
        /*
            r6 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.1nW r0 = r6.A0B
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0040
            java.util.Iterator r4 = r0.iterator()
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            X.2bU r3 = X.C36441kJ.A0r(r4)
            X.3Qj r2 = X.AnonymousClass2bU.A00(r3)
            boolean r0 = X.C66013Ui.A10(r3)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0032
            X.1D1 r1 = r6.A0Q
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            boolean r0 = r1.A02(r2, r0)
            if (r0 != 0) goto L_0x003c
        L_0x0032:
            X.1E2 r1 = r6.A0R
            X.0yC r0 = r6.A0D
            boolean r0 = X.AnonymousClass3T2.A00(r0, r1, r3)
            if (r0 == 0) goto L_0x000e
        L_0x003c:
            r5.add(r3)
            goto L_0x000e
        L_0x0040:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0v():java.util.ArrayList");
    }

    public static void A0x(MediaAlbumActivity mediaAlbumActivity, AnonymousClass141 r5, AnonymousClass11F r6, AnonymousClass3T1 r7) {
        if ((!r5.A0G() || mediaAlbumActivity.A00.A0X.A0C((GroupJid) r6)) && !mediaAlbumActivity.A00.A10.A04(r5, r6)) {
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(mediaAlbumActivity.getPackageName(), "com.whatsapp.status.playback.MessageReplyActivity");
            A0D2.putExtra("isMediaViewReply", false);
            mediaAlbumActivity.startActivity(AnonymousClass3UJ.A00(A0D2, r7.A1J));
            return;
        }
        C18740tg.A0E(!(r7 instanceof AnonymousClass2bI), "should not reply to systemMessage");
        AnonymousClass11F A0J2 = r7.A0J();
        C18740tg.A06(A0J2);
        mediaAlbumActivity.A09.A00.put(A0J2, r7);
        new AnonymousClass190();
        Intent A082 = C36361kB.A08(mediaAlbumActivity, A0J2, 0);
        A082.putExtra("extra_quoted_message_row_id", r7.A0F);
        mediaAlbumActivity.A01.A07(mediaAlbumActivity, A082);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void Be8(int i) {
        AnonymousClass3J6 r1;
        super.Be8(i);
        if (i == 0 && (r1 = this.A0K) != null) {
            r1.A01(false);
        }
    }

    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            A20(new C39181rS(this));
        }
        super.finishAfterTransition();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        C88784Ua A002;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i == 906) {
                C62473Gh r4 = (C62473Gh) this.A0A.A00.A04();
                if (r4 != null && !r4.A03.isEmpty()) {
                    if (i2 == 2) {
                        AnonymousClass3SJ.A01(this, 106);
                    } else if (!(i2 != 3 || intent == null || (intExtra = intent.getIntExtra("RESULT_EXTRA_ACTION_ID", -1)) == -1)) {
                        if (this.A05.A00(this).B73(C70783fi.A00, r4.A01(), intExtra) && (A002 = this.A0C.A00(intExtra)) != null && !A002.BBr()) {
                            return;
                        }
                    }
                }
                this.A0A.A0S();
            }
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19460v5 r1 = this.A04;
                if (r1.A05()) {
                    r1.A02();
                    getForwardMessages();
                    throw AnonymousClass001.A0A("handleAdvertiseForwardClick");
                }
            } else {
                ArrayList A052 = this.A00.A05();
                if (!A052.isEmpty()) {
                    ArrayList A0k = C36341k9.A0k(intent);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    AnonymousClass3XT r6 = null;
                    if (AnonymousClass143.A0N(A0k)) {
                        C18740tg.A06(intent);
                        Bundle extras = intent.getExtras();
                        C64883Pu r0 = this.A0U;
                        C18740tg.A06(extras);
                        r6 = r0.A01(extras);
                    }
                    AnonymousClass1X4 r42 = this.A00.A07;
                    AnonymousClass1XY r5 = this.A06;
                    ArrayList A15 = C36441kJ.A15(A052);
                    Collections.sort(A15, C81703xR.A00);
                    r42.A0H(r5, r6, stringExtra, A15, A0k, booleanExtra);
                    if (A0k.size() != 1 || (A0k.get(0) instanceof C177528dw)) {
                        Bvu(A0k);
                    } else if (this.A0D.A0E(6650)) {
                        C80283v9.A00(this.A04, this, A0k, 15);
                    } else {
                        C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A00.A0C, A0k, 0), C36441kJ.A0j());
                    }
                } else {
                    Log.w("MediaAlbumActivity/forward/failed");
                    this.A05.A06(R.string.f12nameremoved, 0);
                }
            }
            B7Q();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int size = A0v().size();
        if (size <= 0 || !this.A0D.A0E(4048)) {
            return false;
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, size, 0);
        menu.add(0, 0, 0, getString(R.string.f12nameremoved, objArr));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.unregisterObserver(this.A0b);
        this.A00.A0Z.unregisterObserver(this.A0c);
        this.A07.unregisterObserver(this.A0a);
        this.A0L.unregisterObserver(this.A0d);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 16908332) {
                AnonymousClass0PG.A00(this);
            }
            return true;
        }
        this.A0E.A00(this, A0v(), true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView listView = getListView();
        bundle.putInt("top_index", listView.getFirstVisiblePosition());
        int i = 0;
        View childAt = listView.getChildAt(0);
        if (childAt != null) {
            i = childAt.getTop() - listView.getPaddingTop();
        }
        bundle.putInt("top_offset", i);
    }

    public MediaAlbumActivity() {
        this(0);
        this.A0Y = C36441kJ.A16();
        this.A0Z = C36441kJ.A16();
        this.A0c = C90394a5.A00(this, 10);
        this.A0b = AnonymousClass4W3.A00(this, 15);
        this.A0a = new AnonymousClass4W0(this, 7);
        this.A0d = new AnonymousClass4WB(this, 12);
        this.A0X = new AnonymousClass3T4(this, 0);
    }
}
