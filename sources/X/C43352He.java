package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2He  reason: invalid class name and case insensitive filesystem */
public abstract class C43352He extends AnonymousClass2I0 {
    public ConversationCarousel A00;
    public AnonymousClass3S3 A01;
    public C25121Fb A02;
    public ArrayList A03 = AnonymousClass001.A0I();
    public boolean A04;
    public boolean A05;
    public final AnonymousClass2HQ A06;
    public final C89014Ux A07;
    public final Runnable A08 = C80233v4.A00(this, 17);

    public C43352He(Context context, C89004Uw r8, AnonymousClass2bV r9) {
        super(context, r8, r9);
        C20810yC r4 = this.A0G;
        AnonymousClass00C.A07(r4);
        this.A06 = new AnonymousClass2HQ(C36371kC.A0B(this), r8, getBotPluginUtil(), r4, this.A03);
        this.A07 = getCarouselCustomizer();
    }

    public boolean A1P() {
        return true;
    }

    public void A22(AnonymousClass3T1 r5, boolean z) {
        AnonymousClass00C.A0D(r5, 0);
        super.A22(r5, z);
        if (z) {
            C39981uP r0 = this.A05;
            if (r0 != null) {
                ArrayList arrayList = this.A03;
                AnonymousClass00C.A0D(arrayList, 0);
                AnonymousClass3R7.A01(r0.A01, arrayList);
            }
            A2D();
        }
        C89004Uw r2 = this.A0c;
        if (r2 != null && r2.BK6()) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                if (r2.BMT(C36391kE.A0l(it))) {
                    this.A05 = true;
                    return;
                }
            }
        } else if (this.A05) {
            A2D();
            this.A05 = false;
        }
    }

    public boolean A2C(C64933Qa r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (!AnonymousClass00C.A0J(this.A0K.A1J, r5)) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J(C36391kE.A0l(it).A1J, r5)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A2J(AnonymousClass2bV r9, ArrayList arrayList, boolean z) {
        C51212nS r0;
        C52212p4 r1;
        C36331k8.A1I(r9, arrayList);
        boolean z2 = false;
        boolean A1W = C36371kC.A1W(this.A0K, r9);
        if (!z) {
            ArrayList arrayList2 = this.A03;
            if (arrayList2.size() == arrayList.size()) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (arrayList2.get(i) != arrayList.get(i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        if (A1W || z) {
            this.A03 = arrayList;
            AnonymousClass2HQ r2 = this.A06;
            r2.A01 = C89834Yb.A00(arrayList, 3);
            if (!arrayList.isEmpty()) {
                AnonymousClass3T1 r02 = (AnonymousClass3T1) arrayList.get(0);
                if (r02 != null) {
                    AnonymousClass3KQ A0N = r02.A0N();
                    if (A0N != null) {
                        r1 = A0N.A00;
                    } else {
                        r1 = null;
                    }
                    if (r1 == C52212p4.REELS) {
                        r0 = C51212nS.REEL;
                        r2.A00 = r0;
                    }
                }
                r0 = C51212nS.LINK_PREVIEW;
                r2.A00 = r0;
            }
            if (A1W) {
                getCarouselRecyclerView().A0h(0);
            }
            if (z || A1W) {
                z2 = true;
            }
        }
        A22(r9, z2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        C37541mm.A05(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 0);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            int i = (int) rawX;
            int i2 = (int) rawY;
            Rect A062 = AnonymousClass001.A06();
            getCarouselRecyclerView().getGlobalVisibleRect(A062);
            if (A062.contains(i, i2)) {
                this.A0Z = true;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.A0Z = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 0);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            int i = (int) rawX;
            int i2 = (int) rawY;
            Rect A062 = AnonymousClass001.A06();
            getCarouselRecyclerView().getGlobalVisibleRect(A062);
            if (A062.contains(i, i2)) {
                this.A0Z = true;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.A0Z = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBotPluginUtil(AnonymousClass3S3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCarouselRecyclerView(ConversationCarousel conversationCarousel) {
        AnonymousClass00C.A0D(conversationCarousel, 0);
        this.A00 = conversationCarousel;
    }

    public final void setFMessageLazyDataManager(C25121Fb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    private final C89014Ux getCarouselCustomizer() {
        C89004Uw r0;
        if (C197029b1.A00(this.A0K.A1J.A00) || (r0 = this.A0c) == null || r0.getContainerType() != 0) {
            return super.getRowCustomizer();
        }
        return this.A0C.A05;
    }

    private final C52222p5 getPluginProvider() {
        AnonymousClass3KQ A0N = this.A0K.A0N();
        if (A0N != null) {
            return A0N.A01;
        }
        return null;
    }

    public void A1Z() {
        this.A06.A06();
    }

    public final void A2G() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass2bV) it.next()).A01 == 4) {
                if (!this.A04) {
                    this.A04 = true;
                    this.A0R.A0I(this.A08, AnonymousClass6X5.A0L);
                    return;
                }
                return;
            }
        }
    }

    public final void A2H() {
        if (!this.A0G.A0E(7268) || getPluginProvider() == null) {
            ConversationCarousel carouselRecyclerView = getCarouselRecyclerView();
            C89014Ux r4 = this.A07;
            carouselRecyclerView.setPaddingRelative(r4.B8x() + r4.BEy(getContext(), this.A09.A01()), carouselRecyclerView.getPaddingTop(), r4.B8y(this.A0K) + r4.BEv(getContext(), this.A09.A01()), carouselRecyclerView.getPaddingBottom());
            return;
        }
        int A052 = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
        ConversationCarousel carouselRecyclerView2 = getCarouselRecyclerView();
        carouselRecyclerView2.setPaddingRelative(A052, carouselRecyclerView2.getPaddingTop(), A052, carouselRecyclerView2.getPaddingBottom());
    }

    public final void A2I(AnonymousClass2bV r4) {
        if (this.A0G.A0E(7075)) {
            this.A0K.A0N();
            getFMessageLazyDataManager().A03(r4, new C80283v9(this, r4, 2));
        }
    }

    public final AnonymousClass3S3 getBotPluginUtil() {
        AnonymousClass3S3 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("botPluginUtil");
    }

    public final ConversationCarousel getCarouselRecyclerView() {
        ConversationCarousel conversationCarousel = this.A00;
        if (conversationCarousel != null) {
            return conversationCarousel;
        }
        throw C36331k8.A0d("carouselRecyclerView");
    }

    public final C25121Fb getFMessageLazyDataManager() {
        C25121Fb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("fMessageLazyDataManager");
    }

    public int getMessageCount() {
        return this.A03.size() + 1;
    }

    public final List getAlbumMessages() {
        return this.A03;
    }

    public List getAllMessages() {
        return this.A03;
    }

    public final AnonymousClass2HQ getCarouselAdapter() {
        return this.A06;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0R.A0G(this.A08);
        this.A04 = false;
    }
}
