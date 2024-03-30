package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2JG  reason: invalid class name */
public abstract class AnonymousClass2JG extends C43452Hq implements C89004Uw, C17210qu {
    public MenuItem A00;
    public C19460v5 A01;
    public AnonymousClass3C3 A02;
    public AnonymousClass1XY A03;
    public C24361Cd A04;
    public AnonymousClass4V4 A05;
    public AnonymousClass16I A06;
    public AnonymousClass1RY A07;
    public MessageSelectionViewModel A08;
    public C43672Jj A09;
    public AnonymousClass1A4 A0A;
    public AnonymousClass1QH A0B;
    public C20650xu A0C;
    public AnonymousClass12P A0D;
    public C233117z A0E;
    public AnonymousClass11F A0F;
    public C64883Pu A0G;
    public String A0H;
    public ArrayList A0I;
    public final AbsListView.OnScrollListener A0J = new C67313Zi(this);
    public final AnonymousClass4Q4 A0K = new AnonymousClass3T4(this, 1);
    public final C32001cn A0L = new AnonymousClass4W0(this, 9);
    public final C226815j A0M = AnonymousClass4W3.A00(this, 18);
    public final C24511Cs A0N = new AnonymousClass4WB(this, 14);

    public AnonymousClass4V4 A3j() {
        C48812i6 r9 = new C48812i6(this, this.A01, 47);
        C19730wQ r3 = this.A02;
        C70523fI r0 = this.A00;
        return new C39301rf(this, r3, r0.A0C, this.A07, r0.A0L, this, r0.A0x, r9);
    }

    public AnonymousClass0V4 BUt(Bundle bundle, int i) {
        C88094Rj r4;
        String string;
        C18820ts r2 = this.A00;
        if (this instanceof EnforcedMessagesActivity) {
            r4 = ((EnforcedMessagesActivity) this).A01;
            if (r4 == null) {
                throw C36331k8.A0d("enforcedMessageCursorProvider");
            }
        } else if (this instanceof StarredMessagesActivity) {
            r4 = ((StarredMessagesActivity) this).A03;
        } else {
            r4 = ((KeptMessagesActivity) this).A03;
        }
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("query");
        }
        return new C40161v3(this, r2, this.A0F, r4, string);
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A052 = this.A00.A05();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19460v5 r1 = this.A01;
                if (r1.A05()) {
                    r1.A02();
                    throw AnonymousClass001.A0A("handleAdvertiseForwardClick");
                }
            } else if (A052.isEmpty() || stringArrayListExtra == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(A3k());
                C36341k9.A1O(A0u, "/forward/failed");
                this.A05.A06(R.string.f12nameremoved, 0);
            } else {
                ArrayList A062 = AnonymousClass143.A06(AnonymousClass11F.class, stringArrayListExtra);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                AnonymousClass3XT r6 = null;
                if (AnonymousClass143.A0N(A062)) {
                    C18740tg.A06(intent);
                    r6 = this.A0G.A01(intent.getExtras());
                }
                AnonymousClass1X4 r4 = this.A00.A07;
                AnonymousClass1XY r5 = this.A03;
                ArrayList A15 = C36441kJ.A15(A052);
                Collections.sort(A15, C81703xR.A00);
                r4.A0H(r5, r6, stringExtra, A15, A062, booleanExtra);
                if (A062.size() != 1 || (A062.get(0) instanceof C177528dw)) {
                    Bvu(A062);
                } else {
                    C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A00.A0C, A062, 0), C36441kJ.A0j());
                }
            }
            B7Q();
        }
    }

    public String A3k() {
        if (this instanceof EnforcedMessagesActivity) {
            return "EnforcedNewsletterMessage";
        }
        if (this instanceof StarredMessagesActivity) {
            return "starred";
        }
        return "kept";
    }

    public void A3l() {
        Bundle bundle;
        if (!TextUtils.isEmpty(this.A0H)) {
            bundle = AnonymousClass001.A07();
            bundle.putString("query", this.A0H);
        } else {
            bundle = null;
        }
        C07540Ye.A00(this).A02(bundle, this);
    }

    public void A3m() {
        if (this instanceof EnforcedMessagesActivity) {
            EnforcedMessagesActivity enforcedMessagesActivity = (EnforcedMessagesActivity) this;
            ((AnonymousClass1RJ) enforcedMessagesActivity.A03.getValue()).A03(C36351kA.A00(enforcedMessagesActivity.A05.isEmpty() ? 1 : 0));
        } else if (this instanceof StarredMessagesActivity) {
            int i = 0;
            if (this.A05.BAi() == null) {
                C36341k9.A13(this, R.id.empty_view, 8);
                C36341k9.A13(this, R.id.search_no_matches, 8);
                C36341k9.A13(this, R.id.progress, 0);
                return;
            }
            ArrayList arrayList = this.A0I;
            if (arrayList == null || arrayList.isEmpty()) {
                C36341k9.A13(this, R.id.empty_view, 0);
                ImageView A0Q = C36411kG.A0Q(this, R.id.starred_messages_empty_image);
                if (C222013h.A07) {
                    A0Q.setBackground((Drawable) null);
                    A0Q.setImageTintList((ColorStateList) null);
                    A0Q.setImageResource(R.drawable.no_starred_msgs_wds);
                } else {
                    A0Q.setBackgroundResource(R.drawable.teal_circle);
                    A0Q.setImageTintList(AnonymousClass00F.A04(this, C36391kE.A03(this)));
                    A0Q.setImageResource(R.drawable.no_starred_msgs);
                    i = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                A0Q.setPadding(i, i, i, i);
                C36341k9.A13(this, R.id.search_no_matches, 8);
            } else {
                C36341k9.A13(this, R.id.empty_view, 8);
                TextView A0Q2 = C36391kE.A0Q(this, R.id.search_no_matches);
                A0Q2.setVisibility(0);
                Object[] A0L2 = AnonymousClass001.A0L();
                A0L2[0] = this.A0H;
                C36341k9.A0s(this, A0Q2, A0L2, R.string.f12nameremoved);
            }
            C36341k9.A13(this, R.id.progress, 8);
        } else {
            KeptMessagesActivity keptMessagesActivity = (KeptMessagesActivity) this;
            ScrollView scrollView = keptMessagesActivity.A01;
            if (scrollView != null && keptMessagesActivity.A02 != null && keptMessagesActivity.A00 != null) {
                if (keptMessagesActivity.A05.BAi() == null) {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(8);
                    keptMessagesActivity.A00.setVisibility(0);
                    return;
                }
                ArrayList arrayList2 = keptMessagesActivity.A0I;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    scrollView.setVisibility(0);
                    keptMessagesActivity.A02.setVisibility(8);
                } else {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(0);
                    WaTextView waTextView = keptMessagesActivity.A02;
                    Object[] A0L3 = AnonymousClass001.A0L();
                    A0L3[0] = keptMessagesActivity.A0H;
                    C36341k9.A0s(keptMessagesActivity, waTextView, A0L3, R.string.f12nameremoved);
                }
                keptMessagesActivity.A00.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Ba0(X.AnonymousClass0V4 r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.database.Cursor r5 = (android.database.Cursor) r5
            X.4V4 r0 = r3.A05
            r0.BvP(r5)
            r3.A3m()
            java.lang.String r0 = r3.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003d
            X.4V4 r0 = r3.A05
            boolean r1 = r0.isEmpty()
            android.view.MenuItem r0 = r3.A00
            if (r1 == 0) goto L_0x003e
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isActionViewExpanded()
            if (r0 == 0) goto L_0x002a
            android.view.MenuItem r0 = r3.A00
            r0.collapseActionView()
        L_0x002a:
            android.view.MenuItem r0 = r3.A00
        L_0x002c:
            r0.setVisible(r2)
        L_0x002f:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r1 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r1
            android.view.MenuItem r0 = r1.A00
            if (r0 == 0) goto L_0x003d
            r0.setVisible(r2)
        L_0x003d:
            return
        L_0x003e:
            r2 = 1
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JG.Ba0(X.0V4, java.lang.Object):void");
    }

    public void Ba7(AnonymousClass0V4 r3) {
        this.A05.BvP((Cursor) null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        if (this.A0C.A0N() && !(this instanceof EnforcedMessagesActivity)) {
            SearchView searchView = new SearchView(this);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            int A002 = C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
            C36351kA.A15(getResources(), C36391kE.A0P(searchView, R.id.search_src_text), A002);
            searchView.setQueryHint(getString(R.string.f12nameremoved));
            searchView.A06 = new C53842ry(this, 4);
            MenuItem icon = C36411kG.A0I(menu).setIcon(R.drawable.ic_action_search);
            this.A00 = icon;
            C62503Gk r1 = this.A00;
            synchronized (r1) {
                listAdapter = r1.A00;
            }
            icon.setVisible(!listAdapter.isEmpty());
            this.A00.setActionView(searchView);
            this.A00.setShowAsAction(10);
            this.A00.setOnActionExpandListener(new AnonymousClass4Z3(this, 2));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0A.A00);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem == null) {
            return false;
        }
        menuItem.expandActionView();
        return false;
    }

    public boolean BgA() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A3k());
        C36321k7.A1a(A0u, "/selectionrequested");
        return this.A08.A0T(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A2u();
        C36321k7.A0O(this);
        this.A06.registerObserver(this.A0M);
        this.A04.registerObserver(this.A0L);
        this.A0E.registerObserver(this.A0N);
        C27731Pn r3 = this.A00.A0H;
        StringBuilder A0u = AnonymousClass000.A0u();
        String A3k = A3k();
        A0u.append(A3k);
        this.A07 = r3.A05(this, AnonymousClass000.A0q("-messages-activity", A0u));
        if (C36401kF.A0M(this) != null) {
            AnonymousClass12P r0 = this.A0D;
            r0.A06();
            if (r0.A08 && this.A0A.A03()) {
                this.A0F = C36331k8.A0F(this);
                AnonymousClass1A4 r32 = this.A0A;
                if (bundle != null) {
                    r32.A00 = bundle.getLong("ephemeral_session_start", -1);
                }
                this.A0B.A02(this.A0F, AnonymousClass000.A0k(this));
                this.A05 = A3j();
                C07540Ye.A00(this).A03(this);
                MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) C36441kJ.A0b(this).A00(MessageSelectionViewModel.class);
                this.A08 = messageSelectionViewModel;
                messageSelectionViewModel.A01.A08(this, new C88554Td(this, 48));
                return;
            }
        }
        C36321k7.A1a(AnonymousClass000.A0v(A3k), "/create/no-me-or-msgstore-db");
        C36351kA.A12(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A02();
        this.A06.unregisterObserver(this.A0M);
        this.A04.unregisterObserver(this.A0L);
        this.A0E.unregisterObserver(this.A0N);
        this.A00.A0R.A06();
        if (isFinishing()) {
            this.A0B.A03(this.A0F, AnonymousClass000.A0k(this));
        }
    }

    public void onPause() {
        super.onPause();
        if (this.A00.A0R.A0B()) {
            this.A00.A0R.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A0R.A0B()) {
            this.A00.A0R.A05();
        }
        this.A05.notifyDataSetChanged();
    }
}
