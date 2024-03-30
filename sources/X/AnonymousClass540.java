package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.540  reason: invalid class name */
public class AnonymousClass540 extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C30741ah A01;
    public final AnonymousClass1BB A02;
    public final C24001Ar A03;
    public final C19770wU A04;
    public final AnonymousClass17Y A05;
    public final C24041Av A06;
    public final C20810yC A07;
    public final AnonymousClass1AP A08;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "favoriteSticker";
    }

    public static C135066c4 A00(AnonymousClass540 r8, C1032354m r9) {
        C1266464w r1 = r9.A01;
        C135066c4 r6 = new C135066c4();
        String str = r1.A07;
        r6.A0E = str;
        r6.A0H = r1.A08;
        r6.A09 = r1.A04;
        r6.A0C = r1.A05;
        String str2 = r1.A06;
        r6.A0D = str2;
        r6.A0N = "application/was".equals(str2);
        r6.A03 = r1.A01;
        r6.A02 = r1.A00;
        String str3 = r1.A03;
        r6.A07 = str3;
        r6.A00 = (int) r1.A02;
        if (str3 == null) {
            Log.e("FavouriteStickerHandler/findStickerAndDownload Receive empty sticker direct path");
            return null;
        }
        AnonymousClass1AP r3 = r8.A08;
        C18740tg.A06(str);
        File A042 = r3.A04.A04(str, str2);
        C18740tg.A06(A042);
        if (A042.exists() || ((A042 = r3.A06(r6, A042)) != null && A042.exists())) {
            r6.A02(A042.getAbsolutePath(), 1);
            r3.A0C.A04(r6);
            return r6;
        }
        C36321k7.A1R("StickerRepository/setFileForFavoriteSticker download fail, fileHash=", str, AnonymousClass000.A0u());
        return null;
    }

    public static void A01(AnonymousClass540 r3, C135066c4 r4, long j) {
        if (!r4.A0L && r3.A08.A0H(r4, Long.valueOf(j), true, true)) {
            r3.A05.A0H(new C80263v7(r3, r4, 44));
        }
    }

    private void A02(String str) {
        C24001Ar r2 = this.A03;
        C135066c4 A012 = r2.A01(str);
        if (A012 != null) {
            this.A06.A07(str, A012.A0D);
            r2.A02(str);
            this.A05.A0H(new C80263v7(this, A012, 45));
        }
    }

    public C201669k5 A0A(C202599mH r23, String str, boolean z) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        long j;
        C202599mH r4 = r23;
        String[] strArr = r4.A06;
        C199769fw r3 = r4.A01;
        AnonymousClass8SS r5 = r4.A03;
        String str6 = null;
        if (strArr.length == 2 && "favoriteSticker".equals(strArr[0])) {
            String str7 = strArr[1];
            if (TextUtils.isEmpty(str7)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("favorite-sticker-mutation/from-key-value unable to create file hash from ");
                C36321k7.A1Z(A0u, strArr[1]);
            } else if (C199769fw.A03.equals(r3) && r5 != null && r5.A0u() && (r5.bitField0_ & 134217728) != 0) {
                C100054uO r0 = r5.stickerAction_;
                C100054uO r1 = r0;
                if (r0 == null) {
                    r0 = C100054uO.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 256) != 0) {
                    C100054uO r02 = r1;
                    if (r1 == null) {
                        r02 = C100054uO.DEFAULT_INSTANCE;
                    }
                    if ((r02.bitField0_ & 512) != 0) {
                        C100054uO r03 = r1;
                        if (r1 == null) {
                            r03 = C100054uO.DEFAULT_INSTANCE;
                        }
                        i = r03.deviceIdHint_;
                    } else {
                        i = -1;
                    }
                    if (r1 == null) {
                        r1 = C100054uO.DEFAULT_INSTANCE;
                    }
                    if ((r1.bitField0_ & 2) != 0) {
                        str2 = Base64.encodeToString(r1.fileEncSha256_.A06(), 2);
                    } else {
                        str2 = null;
                    }
                    if ((r1.bitField0_ & 4) != 0) {
                        str3 = Base64.encodeToString(r1.mediaKey_.A06(), 1);
                    } else {
                        str3 = null;
                    }
                    int i4 = r1.bitField0_;
                    if ((i4 & 1) != 0) {
                        str4 = r1.url_;
                    } else {
                        str4 = null;
                    }
                    if ((i4 & 8) != 0) {
                        str5 = r1.mimetype_;
                    } else {
                        str5 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i2 = r1.width_;
                    } else {
                        i2 = 0;
                    }
                    if ((i4 & 16) != 0) {
                        i3 = r1.height_;
                    } else {
                        i3 = 0;
                    }
                    if ((i4 & 64) != 0) {
                        str6 = r1.directPath_;
                    }
                    if ((i4 & 128) != 0) {
                        j = r1.fileLength_;
                    } else {
                        j = 0;
                    }
                    C1266464w r7 = new C1266464w(str7, str4, str2, str3, str5, str6, i2, i3, j);
                    long j2 = r5.timestamp_;
                    C201539jo r42 = r4.A02;
                    C100054uO r04 = r5.stickerAction_;
                    if (r04 == null) {
                        r04 = C100054uO.DEFAULT_INSTANCE;
                    }
                    return new C1032354m(r7, r42, str, i, j2, r04.isFavorite_, z);
                }
            }
        }
        return null;
    }

    public List A0D(boolean z) {
        Log.i("FavoriteStickerHandler/createBootstrapMutations");
        C24001Ar r1 = this.A03;
        C18740tg.A00();
        ArrayList A012 = r1.A05.A01(150, 1);
        ArrayList A0v = C36401kF.A0v(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass6EB r3 = (AnonymousClass6EB) it.next();
            C36361kB.A1O(new C1266464w(r3.A0B, r3.A0E, r3.A0A, r3.A0C, r3.A0D, r3.A08, r3.A06, r3.A05, (long) r3.A04), Long.valueOf(r3.A07), A0v);
        }
        ArrayList A0v2 = C36401kF.A0v(A0v);
        Iterator it2 = A0v.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            A0v2.add(new C1032354m((C1266464w) pair.first, (C201539jo) null, (String) null, this.A00.A04(), C36431kI.A09(pair.second), true, false));
        }
        return A0v2;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r4) {
        C1032354m r42 = (C1032354m) r4;
        String str = r42.A01.A07;
        if (!r42.A02) {
            A02(str);
        } else if (this.A03.A01(str) == null) {
            C135066c4 A002 = A00(this, r42);
            if (A002 != null) {
                A01(this, A002, r42.A04);
            } else {
                return;
            }
        }
        A05(r42);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C1032354m r32 = (C1032354m) r3;
        String str = r32.A01.A07;
        if (!r32.A02) {
            A02(str);
        } else if (this.A03.A01(str) == null) {
            A04(r32);
            return;
        }
        A06(r32);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C1032354m r62 = (C1032354m) r6;
        if (r7 == null || r7.A04 <= r62.A04) {
            String str = r62.A01.A07;
            if (!r62.A02) {
                A02(str);
            } else if (this.A03.A01(str) == null) {
                if (r7 != null) {
                    A04(r7);
                }
                A08(r62);
                this.A04.Boy(new C80263v7(this, r62, 43));
                return;
            }
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A07.A0E(2775);
    }

    public AnonymousClass540(AnonymousClass17Y r1, C19730wQ r2, C24041Av r3, C30741ah r4, AnonymousClass1AC r5, C20810yC r6, AnonymousClass1BB r7, AnonymousClass1AP r8, C24001Ar r9, C19770wU r10) {
        super(r5);
        this.A07 = r6;
        this.A05 = r1;
        this.A00 = r2;
        this.A04 = r10;
        this.A03 = r9;
        this.A02 = r7;
        this.A08 = r8;
        this.A06 = r3;
        this.A01 = r4;
    }
}
