package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8YE  reason: invalid class name */
public class AnonymousClass8YE extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final AnonymousClass005 A01;
    public final C19730wQ A02;
    public final C19980wp A03;
    public final C20810yC A04;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "removeRecentSticker";
    }

    public boolean A0H() {
        return true;
    }

    private void A00(C135066c4 r5) {
        AnonymousClass777 r3 = new AnonymousClass777();
        ((C104665Ar) this.A01.get()).A0I(new C21629ASv(r3), r5);
        try {
            r3.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("RemoveRecentStickerHandler/removeStickerFromRecentBlocking ", e);
        }
    }

    public C201669k5 A0A(C202599mH r17, String str, boolean z) {
        C202599mH r2 = r17;
        String[] strArr = r2.A06;
        C199769fw r5 = r2.A01;
        AnonymousClass8SS r4 = r2.A03;
        if (strArr.length == 2 && "removeRecentSticker".equals(C165617ti.A0a(strArr))) {
            String str2 = strArr[1];
            if (TextUtils.isEmpty(str2)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("remove-recent-sticker-mutation/from-key-value unable to create file hash from ");
                C36321k7.A1Z(A0u, strArr[1]);
            } else if (C199769fw.A03.equals(r5) && r4 != null && C165577te.A1W(r4.bitField0_) && (r4.bitField0_ & 268435456) != 0) {
                AnonymousClass8ON r0 = r4.removeRecentStickerAction_;
                AnonymousClass8ON r1 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8ON.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    long j = r4.timestamp_;
                    if (r1 == null) {
                        r1 = AnonymousClass8ON.DEFAULT_INSTANCE;
                    }
                    return new C176018bR(r2.A02, str, str2, j, r1.lastStickerSentTs_, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r8) {
        C104665Ar r3;
        C135066c4 r2;
        C23166B8a b8a;
        C176018bR r82 = (C176018bR) r8;
        AnonymousClass005 r6 = this.A01;
        Pair A0C = ((C104665Ar) r6.get()).A0C(r82.A01);
        if (A0C != null) {
            long A09 = C36431kI.A09(A0C.second);
            long j = r82.A00;
            if (A09 == j) {
                r3 = (C104665Ar) r6.get();
                r2 = (C135066c4) A0C.first;
                b8a = new C23166B8a(this, r82, 0);
            } else if (A09 < j) {
                r3 = (C104665Ar) r6.get();
                r2 = (C135066c4) A0C.first;
                b8a = null;
            } else {
                A05(r82);
                return;
            }
            r3.A0I(b8a, r2);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r8) {
        C176018bR r82 = (C176018bR) r8;
        AnonymousClass005 r6 = this.A01;
        Pair A0C = ((C104665Ar) r6.get()).A0C(r82.A01);
        if (A0C == null || C36431kI.A09(A0C.second) > r82.A00) {
            A06(r82);
            return;
        }
        ((C104665Ar) r6.get()).A0I(new C23166B8a(this, r82, 1), (C135066c4) A0C.first);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r7, C201669k5 r8) {
        C176018bR r72 = (C176018bR) r7;
        C176018bR r82 = (C176018bR) r8;
        if (r82 == null) {
            Pair A0C = ((C104665Ar) this.A01.get()).A0C(r72.A01);
            if (A0C != null) {
                C135066c4 r5 = (C135066c4) A0C.first;
                if (r5.A0E != null) {
                    long A09 = C36431kI.A09(A0C.second);
                    long j = r72.A00;
                    if (A09 == j) {
                        A00(r5);
                    } else if (A09 < j) {
                        A00(r5);
                    }
                }
            }
            A08(r72);
            return;
        } else if (r82.A00 <= r72.A00) {
            A09(r72, r82);
            return;
        }
        A07(r72);
    }

    public AnonymousClass8YE(C19730wQ r1, C19980wp r2, C19970wo r3, AnonymousClass1AC r4, C20810yC r5, AnonymousClass005 r6) {
        super(r4);
        this.A00 = r3;
        this.A04 = r5;
        this.A02 = r1;
        this.A01 = r6;
        this.A03 = r2;
    }

    public List A0D(boolean z) {
        return AnonymousClass001.A0I();
    }
}
