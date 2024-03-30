package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextData;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1X4  reason: invalid class name */
public class AnonymousClass1X4 {
    public final C19700wN A00;
    public final C237019m A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C24041Av A04;
    public final C21100yf A05;
    public final C20050ww A06;
    public final AnonymousClass19J A07;
    public final C26021Io A08;
    public final C25791Hr A09;
    public final AnonymousClass1XZ A0A;
    public final AnonymousClass1AO A0B;
    public final AnonymousClass1LV A0C;
    public final AnonymousClass196 A0D;
    public final AnonymousClass16D A0E;
    public final AnonymousClass1DM A0F;
    public final AnonymousClass171 A0G;
    public final AnonymousClass1A6 A0H;
    public final AnonymousClass1G5 A0I;
    public final C24341Cb A0J;
    public final C19970wo A0K;
    public final C19630wG A0L;
    public final C20830yE A0M;
    public final C18820ts A0N;
    public final C20060wx A0O;
    public final AnonymousClass1IN A0P;
    public final C25851Hx A0Q;
    public final AnonymousClass1E3 A0R;
    public final AnonymousClass1C7 A0S;
    public final C220712t A0T;
    public final C220412q A0U;
    public final AnonymousClass1A5 A0V;
    public final C24381Cf A0W;
    public final C20310xM A0X;
    public final AnonymousClass1SR A0Y;
    public final C24541Cv A0Z;
    public final AnonymousClass16J A0a;
    public final AnonymousClass1FN A0b;
    public final AnonymousClass1NO A0c;
    public final AnonymousClass1QI A0d;
    public final AnonymousClass1FV A0e;
    public final AnonymousClass1YE A0f;
    public final AnonymousClass1YC A0g;
    public final AnonymousClass1DW A0h;
    public final C29541Xa A0i;
    public final C20810yC A0j;
    public final C20500xf A0k;
    public final C21010yW A0l;
    public final C20510xg A0m;
    public final AnonymousClass13E A0n;
    public final AnonymousClass1P5 A0o;
    public final AnonymousClass1D5 A0p;
    public final AnonymousClass1Y4 A0q;
    public final AnonymousClass1GH A0r;
    public final AnonymousClass1FU A0s;
    public final C24811Dw A0t;
    public final AnonymousClass1ST A0u;
    public final AnonymousClass1GD A0v;
    public final AnonymousClass1Y2 A0w;
    public final AnonymousClass19A A0x;
    public final AnonymousClass1C4 A0y;
    public final C28361Si A0z;
    public final AnonymousClass1BF A10;
    public final C237919w A11;
    public final C29711Xr A12;
    public final AnonymousClass1TY A13;
    public final AnonymousClass1FO A14;
    public final AnonymousClass1TU A15;
    public final C29551Xb A16;
    public final AnonymousClass1YB A17;
    public final AnonymousClass1AW A18;
    public final AnonymousClass1EO A19;
    public final AnonymousClass1BS A1A;
    public final AnonymousClass1CR A1B;
    public final C29561Xc A1C;
    public final C29731Xt A1D;
    public final C23981Ap A1E;
    public final AnonymousClass1AP A1F;
    public final AnonymousClass1YD A1G;
    public final AnonymousClass1A1 A1H;
    public final AnonymousClass1GX A1I;
    public final C19770wU A1J;
    public final C000100b A1K;
    public final AnonymousClass005 A1L;
    public final AnonymousClass005 A1M;
    public final AnonymousClass005 A1N;
    public final AnonymousClass005 A1O;
    public final AnonymousClass005 A1P;
    public final AnonymousClass005 A1Q;
    public final AnonymousClass005 A1R;
    public final AnonymousClass005 A1S;
    public final AnonymousClass1XR A1T;
    public final AnonymousClass1DT A1U;
    public final C26851Lt A1V;
    public final C29411Wn A1W;
    public final AnonymousClass1KK A1X;
    public final AnonymousClass1KM A1Y;
    public final AnonymousClass1NG A1Z;
    public final AnonymousClass1Y3 A1a;
    public final C21060yb A1b;
    public final AnonymousClass17Z A1c;
    public final C19420v0 A1d;
    public final AnonymousClass1YG A1e;
    public final C29571Xd A1f;
    public final AnonymousClass17S A1g;
    public final AnonymousClass1LW A1h;
    public final AnonymousClass17X A1i;
    public final AnonymousClass176 A1j;
    public final AnonymousClass1NZ A1k;
    public final AnonymousClass1TA A1l;
    public final C28071Rf A1m;
    public final AnonymousClass1FY A1n;
    public final C25121Fb A1o;
    public final C20350xQ A1p;
    public final AnonymousClass1DU A1q;
    public final AnonymousClass1GJ A1r;
    public final C27331Nu A1s;
    public final C18950u5 A1t = new C18950u5(1, 10);
    public final C29721Xs A1u;
    public final AnonymousClass1X7 A1v;
    public final AnonymousClass005 A1w;
    public final AnonymousClass005 A1x;
    public final AnonymousClass005 A1y;

    public static AnonymousClass2bV A01(AnonymousClass1X4 r11, C145166tS r12, AnonymousClass3XT r13, AnonymousClass11F r14, AnonymousClass3BG r15, AnonymousClass3T1 r16, AnonymousClass3L1 r17, String str, List list, boolean z, boolean z2, boolean z3) {
        long A002;
        C88264Sa r6;
        C88264Sa r62;
        C29551Xb r3;
        AnonymousClass11F r4 = r14;
        boolean z4 = r14 instanceof C177528dw;
        String str2 = str;
        if (z4) {
            boolean A092 = AnonymousClass3UN.A09(r12, AnonymousClass3UN.A02(r11.A1q, str2));
            C606538v r1 = new C606538v(r12);
            r1.A02 = A092;
            r1.A01 = true;
            if (r1.A03 == null) {
                r62 = C79963uZ.A00;
            } else {
                r62 = new C79953uY(r1);
            }
            r3 = r11.A16;
            A002 = C19970wo.A00(r11.A0K);
        } else {
            A002 = C19970wo.A00(r11.A0K);
            A07(r11, A002);
            C606538v r18 = new C606538v(r12);
            if (r18.A03 == null) {
                r6 = C79963uZ.A00;
            } else {
                r6 = new C79953uY(r18);
            }
            r3 = r11.A16;
        }
        AnonymousClass2bV A003 = r3.A00(r4, r16, r62, str2, list, A002);
        AnonymousClass3L1 r0 = r17;
        if (r17 != null) {
            A003.A12(r0);
        }
        if (r15 != null) {
            A003.A0V = r15;
            A003.A0j(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
        r11.A0T(A003);
        if (z) {
            A003.A0j(4);
        }
        if (z2) {
            A003.A0j(2);
        }
        if (z4) {
            TextData textData = new TextData();
            textData.backgroundColor = AnonymousClass3UN.A00();
            textData.textColor = -1;
            textData.fontStyle = 0;
            A003.A1Z(textData);
            A003.A16(AnonymousClass3UN.A07(A003.A0b()));
            C18740tg.A06(r13);
            A003.A0p(r13);
            r11.A1D.A08(A003, "request", C55802vD.A00(r11.A0h, A003, r11.A18, r11.A19), 0, false, false);
        }
        A003.A1W = z3;
        return A003;
    }

    private void A05(AnonymousClass1XY r12, AnonymousClass3XT r13, String str, List list, List list2, boolean z) {
        ArrayList arrayList;
        String str2 = str;
        List list3 = list;
        List list4 = list2;
        if (str == null || list.size() > 1 || !AnonymousClass143.A0N(list4)) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            Object obj = null;
            for (Object next : list4) {
                if (next instanceof C177528dw) {
                    obj = next;
                } else {
                    arrayList2.add(next);
                }
            }
            Pair pair = new Pair(arrayList2, obj);
            list4 = (List) pair.first;
            ArrayList arrayList3 = new ArrayList();
            Object obj2 = pair.second;
            arrayList = arrayList3;
            if (obj2 != null) {
                arrayList3.add(obj2);
                arrayList = arrayList3;
            }
        }
        AnonymousClass1XY r4 = r12;
        AnonymousClass3XT r5 = r13;
        boolean z2 = z;
        A06(r4, r5, str2, list3, arrayList, z2, false);
        A06(r4, r5, str2, list3, list4, z2, true);
    }

    public AnonymousClass33E A0C(AnonymousClass3SC r11, Integer num, byte[] bArr, boolean z, boolean z2) {
        return A03(this, (AnonymousClass4R0) null, (AnonymousClass2bU) null, r11, (Integer) null, num, bArr, false, z, z2);
    }

    public void A0I(C145166tS r17, AnonymousClass3XT r18, AnonymousClass3T1 r19, String str, List list, List list2, boolean z, boolean z2) {
        A0D(r17, r18, (AnonymousClass3JL) null, (C63663Kx) null, (AnonymousClass3BG) null, r19, (AnonymousClass3L1) null, (AnonymousClass4UX) null, (Integer) null, str, list, list2, z, z2, false);
    }

    public void A0V(AnonymousClass3T1 r22, int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        long j;
        int i3 = 0;
        int i4 = 0;
        boolean z4 = z;
        if (z) {
            i4 = 1;
        }
        AnonymousClass3T1 r6 = r22;
        try {
            r6.A07 = i4;
            this.A1g.A08(r6);
            C28071Rf r9 = this.A1m;
            C45732Sm r8 = new C45732Sm();
            C46752bc r11 = r6.A1U;
            if (r11 != null) {
                r8.A09 = Long.valueOf((long) r11.A00);
            }
            boolean z5 = false;
            if (z) {
                r8.A04 = 1;
            } else {
                r8.A04 = 2;
                Long l = r6.A0g;
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    long longValue = l.longValue();
                    boolean z6 = false;
                    if (longValue <= System.currentTimeMillis()) {
                        z6 = true;
                    }
                    r8.A03 = Boolean.valueOf(z6);
                    if (longValue <= currentTimeMillis) {
                        j = 0;
                    } else {
                        j = longValue - currentTimeMillis;
                    }
                    r8.A0B = Long.valueOf(j);
                }
                if (r11 != null) {
                    r8.A0A = Long.valueOf((long) Math.round((((float) (currentTimeMillis - r11.A02)) / 1000.0f) / 3600.0f));
                }
            }
            r8.A06 = Integer.valueOf(i);
            r8.A0D = 1L;
            r8.A07 = Integer.valueOf(AnonymousClass6UH.A01(r6.A1I, r6.A09, C66013Ui.A0q(r6)));
            C64933Qa r0 = r6.A1J;
            AnonymousClass11F r3 = r0.A00;
            if (r3 != null) {
                C220412q r1 = r9.A03;
                AnonymousClass16D r112 = r9.A02;
                r8.A08 = Long.valueOf((long) AnonymousClass3TD.A00(r112, r1, r3));
                if (AnonymousClass143.A0G(r3)) {
                    GroupJid groupJid = (GroupJid) r3;
                    AnonymousClass17X r12 = r9.A04;
                    boolean A0C2 = r12.A0C(groupJid);
                    boolean A0D2 = r12.A0D(groupJid);
                    if (A0C2 && A0D2) {
                        z5 = true;
                    }
                    r8.A02 = Boolean.valueOf(z5);
                    z3 = true;
                } else {
                    z3 = false;
                }
                r8.A01 = z3;
                if (r0.A02) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                r8.A05 = i2;
                AnonymousClass141 A082 = r112.A08(r3);
                if ((r3 instanceof AnonymousClass147) && A082 != null) {
                    r8.A00 = Boolean.valueOf(r9.A07.A0n(A082, (AnonymousClass147) r3));
                }
                r8.A0E = r9.A06.A03(r3.getRawString());
            }
            r9.A05.Bly(r8);
            C195759Vv r13 = new C195759Vv(r6.A0L(), r0);
            long j2 = r6.A1N;
            C18740tg.A06(r3);
            C19970wo r82 = this.A0K;
            long A002 = C19970wo.A00(r82);
            C64933Qa A022 = this.A11.A02(r3, true);
            int i5 = 0;
            if (z) {
                i5 = 1;
            }
            C46752bc r113 = new C46752bc(A022, r13, i5, A002, j2, C19970wo.A00(r82));
            if (z2 && !z) {
                r113.A1X = true;
            }
            if (r0.A02 && !z) {
                i3 = 7;
            }
            r113.A01 = i3;
            r6.A1U = r113;
            r6.A07 = r113.A01;
            this.A0f.A01(r113);
        } catch (SQLiteException e) {
            r6.A07 = z ^ true ? 1 : 0;
            e.getMessage();
            this.A02.A0H(new C35231iM(0, (Object) this, z4));
        }
    }

    public void A0W(AnonymousClass3T1 r4, AnonymousClass2bO r5) {
        UserJid userJid;
        if (!r4.A1T(1)) {
            AnonymousClass005 r1 = this.A1M;
            if (((AnonymousClass1HX) r1.get()).A06(r4)) {
                AnonymousClass1HX r12 = (AnonymousClass1HX) r1.get();
                if (r4.A1E()) {
                    userJid = r12.A01(r4.A0w);
                } else {
                    userJid = null;
                }
                r5.A18(Collections.singletonList(new C80163ux(userJid, (String) null)));
            }
        }
    }

    public void A0X(AnonymousClass3T1 r23, String str, String str2, String str3, String str4, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2bZ r1 = new AnonymousClass2bZ(this.A11.A02((AnonymousClass11F) it.next(), true), 55, C19970wo.A00(this.A0K));
            C206659tl r11 = new C206659tl(str2, bArr, str3);
            String str5 = str;
            AnonymousClass00C.A0D(str5, 1);
            r1.BqZ(new C207219uk((C207199ui) null, (C206489tU) null, r11, (C207089uX) null, (C206819u1) null, new C206679tn(str5, 1, 1), (AnonymousClass3XY) null, str4, (String) null, (String) null, (String) null, C023409w.A00, 4));
            A0T(r1);
            AnonymousClass3T1 r3 = r23;
            if (r23 != null) {
                this.A14.A00(r1, r3);
            }
            this.A0X.A0h(r1);
            C44782Ov r32 = new C44782Ov();
            r32.A00 = 6;
            r32.A01 = 33;
            this.A0l.Bls(r32, new C18950u5(1, 1), false);
        }
    }

    public void A0b(AnonymousClass3SC r7, byte[] bArr, boolean z, boolean z2) {
        A0C(r7, (Integer) null, bArr, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C46962bx A00(X.AnonymousClass11F r20, X.AnonymousClass3T1 r21, X.C135066c4 r22, java.lang.Integer r23, boolean r24) {
        /*
            r19 = this;
            X.3Qj r7 = new X.3Qj
            r7.<init>()
            r3 = r22
            java.lang.String r2 = r3.A0A
            r8 = 0
            if (r2 == 0) goto L_0x003a
            int r1 = r3.A01
            r0 = 3
            if (r1 != r0) goto L_0x0033
            android.net.Uri r6 = android.net.Uri.parse(r2)
        L_0x0015:
            int r0 = r3.A00
            long r1 = (long) r0
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r4 = r19
            if (r0 <= 0) goto L_0x003c
            X.0wG r0 = r4.A0L
            android.content.Context r1 = r0.A00
            r0 = 2131894553(0x7f122119, float:1.9423914E38)
            java.lang.String r2 = r1.getString(r0)
            X.17Y r1 = r4.A02
            r0 = 1
            r1.A0F(r2, r0)
            return r8
        L_0x0033:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r7.A0I = r0
        L_0x003a:
            r6 = r8
            goto L_0x0015
        L_0x003c:
            int r0 = r3.A03
            r7.A0A = r0
            int r0 = r3.A02
            r7.A06 = r0
            X.1D5 r5 = r4.A0p
            r16 = 0
            r15 = 20
            r12 = r8
            r13 = r8
            r14 = r8
            r17 = 0
            r9 = r20
            r10 = r21
            r18 = r24
            r11 = r8
            X.2bU r8 = r5.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.2bx r8 = (X.C46962bx) r8
            java.lang.String r0 = r3.A0E
            r8.A04 = r0
            java.lang.String r0 = r3.A0D
            r8.A05 = r0
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "image/webp"
            r8.A05 = r0
        L_0x006a:
            X.3S2 r0 = r3.A04
            r8.A05 = r0
            r0 = r23
            r8.A06 = r0
            boolean r2 = r3.A0N
            boolean r1 = r3.A0I
            boolean r0 = r3.A0L
            if (r1 == 0) goto L_0x007c
            r2 = r2 | 2
        L_0x007c:
            if (r0 == 0) goto L_0x0080
            r2 = r2 | 4
        L_0x0080:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.A01 = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A00(X.11F, X.3T1, X.6c4, java.lang.Integer, boolean):X.2bx");
    }

    public static final AnonymousClass33E A02() {
        AnonymousClass33E r2 = new AnonymousClass33E();
        C023409w r1 = C023409w.A00;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.A0C(r1);
        return r2;
    }

    public static void A08(AnonymousClass1X4 r3, AnonymousClass11F r4) {
        AnonymousClass1CR r2 = r3.A1B;
        if (r2.A0k(r4)) {
            AnonymousClass196 r1 = r3.A0D;
            Set A052 = r1.A05(r4, false);
            r2.A0T(r4);
            r1.A0Q(A052);
        }
    }

    public static void A0A(AnonymousClass1X4 r2, AnonymousClass3T1 r3, Runnable runnable, Collection collection, byte[] bArr) {
        if (bArr != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3T1) it.next()).A1C(bArr);
            }
        }
        if (r3 == null) {
            r2.A02.Bp3(runnable);
        } else {
            r2.A1o.A03(r3, new C35321iV(r3, collection, runnable, 7));
        }
    }

    public AnonymousClass33E A0B(C135066c4 r12, List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C46962bx A002 = A00((AnonymousClass11F) it.next(), (AnonymousClass3T1) null, r12, Integer.valueOf(i), false);
            if (A002 != null) {
                arrayList.add(A002);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C19420v0 r3 = this.A1d;
        if (!((SharedPreferences) r3.A00.get()).getBoolean("sticker_maker_upsell_dismissed", false)) {
            C19420v0.A00(r3).putBoolean("sticker_maker_upsell_dismissed", true).apply();
        }
        return A0C(new AnonymousClass3SC(arrayList), (Integer) null, (byte[]) null, false, false);
    }

    public void A0E(Activity activity, C24801Dv r11, AnonymousClass3T1 r12) {
        String str;
        File file;
        if (!(r12 instanceof AnonymousClass2bU)) {
            str = "UserActions/userActionShare/app/share/message-is-not-media-message";
        } else {
            AnonymousClass2bU r8 = (AnonymousClass2bU) r12;
            C65013Qj r0 = r8.A01;
            if (r0 == null || (file = r0.A0I) == null || !file.exists()) {
                str = "UserActions/userActionShare/app/share/media-does-not-exist";
            } else {
                C19770wU r4 = this.A1J;
                r4.Boy(new C35621iz(this, r12, 23));
                WeakReference weakReference = new WeakReference(activity);
                AnonymousClass17Y r3 = this.A02;
                r3.A05(0, R.string.f12nameremoved);
                C19700wN r2 = this.A00;
                AnonymousClass1TA r02 = this.A1l;
                C66363Vr r5 = new C66363Vr(r11, weakReference, r8, this, 0);
                AnonymousClass28n r1 = new AnonymousClass28n(r2, r02, r8);
                r1.A0B(r5, r3.A04);
                r4.Boy(r1);
                return;
            }
        }
        Log.w(str);
        AnonymousClass17Y r32 = this.A02;
        boolean A002 = C20060wx.A00();
        int i = R.string.f12nameremoved;
        if (A002) {
            i = R.string.f12nameremoved;
        }
        r32.A06(i, 0);
    }

    public /* synthetic */ void A0F(Uri uri, C24801Dv r12, AnonymousClass2bU r13, WeakReference weakReference) {
        String str;
        String A1a2;
        Intent intent;
        int i;
        this.A02.A02();
        if (weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            boolean A0l2 = C66013Ui.A0l(r13);
            boolean A012 = C20800yB.A01(C21000yV.A02, this.A0j, 7721);
            C19730wQ r6 = this.A03;
            int i2 = r13.A1I;
            if (i2 == 23) {
                str = ((C46852bm) r13).A09;
            } else if (i2 != 44) {
                if (i2 == 1) {
                    i = R.string.f12nameremoved;
                } else if (i2 == 2) {
                    i = R.string.f12nameremoved;
                } else if (i2 == 3) {
                    i = R.string.f12nameremoved;
                } else if (i2 != 9) {
                    i = R.string.f12nameremoved;
                    if (i2 != 13) {
                        i = R.string.f12nameremoved;
                    }
                } else {
                    i = R.string.f12nameremoved;
                }
                str = context.getString(i, new Object[]{r6.A0A.A02()});
            } else {
                str = ((C46952bw) r13).A08;
            }
            C18820ts r1 = this.A0N;
            if (C202359le.A04(r13)) {
                A1a2 = C202359le.A00(r13);
            } else if (i2 == 44) {
                A1a2 = C65853Ts.A03(r1, (C46952bw) r13);
            } else {
                A1a2 = r13.A1a();
            }
            String A002 = C111735cl.A00(this.A00, r13);
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType(A002);
            if (!TextUtils.isEmpty(str)) {
                intent2.putExtra("android.intent.extra.SUBJECT", str);
            }
            if (A012) {
                StringBuilder sb = new StringBuilder();
                if (A1a2 != null) {
                    sb.append(A1a2);
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(context.getString(R.string.f12nameremoved, new Object[]{context.getString(R.string.f12nameremoved)}));
                sb.append(System.getProperty("line.separator"));
                sb.append("https://whatsapp.com/dl/source=sfw");
                A1a2 = sb.toString();
            }
            if (!TextUtils.isEmpty(A1a2)) {
                intent2.putExtra("android.intent.extra.TEXT", A1a2);
            }
            intent2.putExtra("origin", 3);
            intent2.putExtra("android.intent.extra.STREAM", uri);
            if (Build.VERSION.SDK_INT >= 29 || !A0l2) {
                intent = Intent.createChooser(intent2, (CharSequence) null);
            } else {
                ArrayList arrayList = new ArrayList();
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str2 = activityInfo.name;
                        String str3 = activityInfo.applicationInfo.packageName;
                        Intent intent3 = new Intent(intent2);
                        intent3.setClassName(str3, str2);
                        intent3.setPackage(str3);
                        arrayList.add(intent3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Intent intent4 = (Intent) it.next();
                    if ("com.whatsapp".equals(intent4.getPackage()) || "com.whatsapp.w4b".equals(intent4.getPackage())) {
                        intent4.putExtra("enforce_hfm_limit", true);
                    }
                }
                intent = AnonymousClass3UJ.A01((IntentSender) null, (CharSequence) null, arrayList);
            }
            intent.setFlags(1);
            r12.A06(context, intent);
        }
    }

    public void A0G(C225314u r11, AnonymousClass2bU r12, boolean z) {
        C24341Cb r6 = this.A0J;
        C20060wx r7 = this.A0O;
        C225314u r3 = r11;
        if (r6.A04(new C71053g9(r11, r7))) {
            C160107kT r2 = null;
            if (z) {
                boolean z2 = r12 instanceof C46852bm;
                AnonymousClass17Y r4 = this.A02;
                C21010yW r9 = this.A0l;
                AnonymousClass171 r5 = this.A0G;
                AnonymousClass141 A042 = C66013Ui.A04(this.A0V, r12);
                if (z2) {
                    r2 = new AnonymousClass2XK(r3, r4, r5, r6, r7, A042, r9);
                } else {
                    r2 = new C75593nU(r3, r4, r5, r6, r7, A042, r9);
                }
            }
            this.A0u.A0C(r2, r12, 0);
        }
    }

    public void A0H(AnonymousClass1XY r18, AnonymousClass3XT r19, String str, List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list2) {
            if (next instanceof C28981Uw) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        AnonymousClass1XY r4 = r18;
        AnonymousClass3XT r5 = r19;
        String str2 = str;
        List list3 = list;
        boolean z2 = z;
        if (!arrayList.isEmpty()) {
            if (C20800yB.A01(C21000yV.A02, this.A0j, 6323)) {
                A05(r4, r5, str2, list3, arrayList, z2);
            }
        }
        A05(r4, r5, str2, list3, arrayList2, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.11F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass11F r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            boolean r0 = r4 instanceof X.C177618e5
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.AnonymousClass143.A0H(r4)
            if (r0 != 0) goto L_0x002e
            X.0wQ r0 = r3.A03
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x002e
            X.1XR r0 = r3.A1T
            android.os.Handler r2 = r0.A00
            java.util.HashMap r1 = r0.A04
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x002f
            r4 = r0
        L_0x0025:
            r1 = 1
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r1, r0, r0, r4)
            r0.sendToTarget()
        L_0x002e:
            return
        L_0x002f:
            r1.put(r4, r4)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A0J(X.11F):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.11F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.AnonymousClass11F r4, int r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002d
            boolean r0 = r4 instanceof X.C177618e5
            if (r0 != 0) goto L_0x002d
            boolean r0 = r4 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x002d
            boolean r0 = X.AnonymousClass143.A0H(r4)
            if (r0 != 0) goto L_0x002d
            X.0wQ r0 = r3.A03
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x002d
            X.1XR r0 = r3.A1T
            android.os.Handler r2 = r0.A00
            java.util.HashMap r1 = r0.A04
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x002e
            r4 = r0
        L_0x0025:
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r0, r5, r4)
            r0.sendToTarget()
        L_0x002d:
            return
        L_0x002e:
            r1.put(r4, r4)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A0K(X.11F, int):void");
    }

    public void A0M(AnonymousClass11F r8, Integer num, boolean z) {
        String A0L2;
        StringBuilder sb = new StringBuilder();
        sb.append("UserActions/userActionSetChatArchived; jid=");
        sb.append(r8);
        sb.append("; archive=");
        sb.append(z);
        Log.i(sb.toString());
        this.A0T.A08(r8, num, z);
        if (z) {
            A0L2 = this.A0L.A00.getString(R.string.f12nameremoved);
        } else {
            A0L2 = this.A0N.A0L(new Object[]{1}, R.plurals.f10nameremoved, 1);
        }
        AnonymousClass17Y r2 = this.A02;
        r2.A0E(A0L2, 0);
        r2.A0H(new C35621iz(this, r8, 17));
    }

    public void A0O(AnonymousClass11F r6, String str, String str2, String str3, String str4, long j) {
        C207149ud r4;
        AnonymousClass2cT r3 = new AnonymousClass2cT(this.A11.A02(r6, true), C19970wo.A00(this.A0K));
        AnonymousClass3T1 A012 = this.A1H.A01.A01(j);
        if (A012 != null) {
            this.A14.A00(r3, A012);
        }
        if (str4 == null || str4.equals("1")) {
            r4 = new C207149ud((AnonymousClass90O) null, new C206919uD(str2, str3), str);
        } else {
            String A013 = this.A0L.A01(R.string.f12nameremoved);
            r4 = new C207149ud(AnonymousClass90O.EXTENSIONS_1, new C206919uD(str2, str3), A013);
        }
        r3.A00 = r4;
        this.A0X.A0h(r3);
    }

    public void A0P(AnonymousClass11F r6, boolean z) {
        AnonymousClass1YG r4 = this.A1e;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r6);
        if (C20800yB.A01(C21000yV.A02, r4.A03, 2805)) {
            AnonymousClass1YG.A01(r4, A002, 24);
        }
        A0Q(r6, z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b0, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.AnonymousClass11F r23, boolean r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            X.1AO r2 = r0.A0B
            r1 = 6
            r14 = r23
            r2.A00(r14, r1)
            X.0xf r12 = r0.A0k
            X.0wU r15 = r0.A1J
            X.0yW r13 = r0.A0l
            X.1Cv r11 = r0.A0Z
            r1 = 11
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r1 = 0
            r18 = 6
            r17 = r1
            X.C65093Qs.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Hr r4 = r0.A09
            r3 = 0
            r12 = 5
            r5 = 0
            r9 = r1
            r10 = r1
            r11 = 0
            r13 = 0
            r6 = r4
            r7 = r14
            r8 = r1
            r6.A02(r7, r8, r9, r10, r11, r12, r13)
            X.16D r4 = r0.A0E
            X.141 r10 = r4.A08(r14)
            X.1Si r8 = r0.A0z
            r8.A0D(r14, r1)
            X.3Mv r4 = X.C64153Mv.A01
            X.AnonymousClass00C.A0D(r14, r3)
            X.11F r4 = X.C64153Mv.A00
            boolean r4 = X.AnonymousClass00C.A0J(r4, r14)
            if (r4 == 0) goto L_0x004a
            X.C64153Mv.A00 = r1
        L_0x004a:
            java.util.Set r4 = X.C64153Mv.A04
            r4.remove(r14)
            java.util.Set r4 = X.C64153Mv.A03
            r4.remove(r14)
            X.1Lt r7 = r0.A1V
            r9 = r24
            if (r25 == 0) goto L_0x00f2
            X.196 r4 = r7.A01
            java.util.Set r6 = r4.A06(r14, r9)
        L_0x0060:
            X.0xM r4 = r7.A03
            r4.A0e(r14, r9)
            X.196 r4 = r7.A00
            r4.A0Q(r6)
            if (r10 == 0) goto L_0x01c6
            boolean r4 = r10.A0G()
            if (r4 != 0) goto L_0x0078
            X.11F r4 = r10.A0H
            boolean r4 = r4 instanceof X.C177618e5
            if (r4 == 0) goto L_0x007d
        L_0x0078:
            X.1Wn r4 = r0.A1W
            r4.A06(r10)
        L_0x007d:
            X.1Wn r4 = r0.A1W
            r4.A07(r14)
            X.1CR r6 = r0.A1B
            boolean r4 = r10.A0G()
            r6.A0d(r14, r4)
            A08(r0, r14)
            X.12q r4 = r0.A0U
            java.util.HashSet r4 = r4.A01
            r4.remove(r14)
            X.1Y3 r7 = r0.A1a
            java.lang.Class<X.11F> r4 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r6 = r10.A06(r4)
            X.11F r6 = (X.AnonymousClass11F) r6
            r4 = 1
            r7.A01(r6, r4, r4, r4)
            r8.A09()
            X.0xQ r8 = r0.A1p
            X.1Lt r4 = r8.A07
            r4.A00(r10)
            java.lang.Class<X.147> r7 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r4 = r10.A06(r7)
            if (r4 == 0) goto L_0x00d1
            X.12q r6 = r8.A0M
            java.lang.Class<com.whatsapp.jid.GroupJid> r4 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r4 = r10.A06(r4)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            int r6 = r6.A05(r4)
            r4 = 1
            if (r6 != r4) goto L_0x00d1
            X.1LV r6 = r8.A08
            com.whatsapp.jid.Jid r4 = r10.A06(r7)
            X.147 r4 = (X.AnonymousClass147) r4
            r6.A0D(r4)
        L_0x00d1:
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = r10.A06(r4)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x0133
            X.0yC r7 = r0.A0j
            r6 = 4991(0x137f, float:6.994E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r4 = X.C20800yB.A01(r4, r7, r6)
            if (r4 != 0) goto L_0x0133
            X.1DM r12 = r0.A0F
            X.1DN r4 = r12.A03
            X.16r r4 = r4.A00
            X.1M0 r11 = r4.A04()
            goto L_0x00f8
        L_0x00f2:
            java.util.Set r6 = java.util.Collections.emptySet()
            goto L_0x0060
        L_0x00f8:
            java.lang.String r8 = "wa_trusted_contacts"
            java.lang.String r7 = "wa_trusted_contacts.jid = ?"
            r13 = 1
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = r9.getRawString()     // Catch:{ all -> 0x0118 }
            r6[r3] = r4     // Catch:{ all -> 0x0118 }
            X.C229416o.A02(r11, r8, r7, r6)     // Catch:{ all -> 0x0118 }
            java.lang.String r8 = "wa_trusted_contacts_send"
            java.lang.String r7 = "wa_trusted_contacts_send.jid = ?"
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = r9.getRawString()     // Catch:{ all -> 0x0118 }
            r6[r3] = r4     // Catch:{ all -> 0x0118 }
            X.C229416o.A02(r11, r8, r7, r6)     // Catch:{ all -> 0x0118 }
            goto L_0x0122
        L_0x0118:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x011d }
            throw r1
        L_0x011d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0122:
            r11.close()
            java.util.Map r4 = X.AnonymousClass1DM.A03(r12)
            r4.remove(r9)
            java.util.Map r4 = X.AnonymousClass1DM.A02(r12)
            r4.remove(r9)
        L_0x0133:
            boolean r4 = r10.A0C()
            if (r4 == 0) goto L_0x01c6
            X.1KK r4 = r0.A1X
            X.9uZ r4 = r4.A07(r9)
            if (r4 == 0) goto L_0x01c6
            boolean r4 = r4.A0X
            if (r4 == 0) goto L_0x01c6
            X.1KM r4 = r0.A1Y
            java.lang.String r8 = r14.getRawString()
            X.0v0 r9 = r4.A0A
            r9.A1M(r8)
            r9.A1K(r8)
            r9.A1L(r8)
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "dc_user_postcode_"
            r6.append(r4)
            r6.append(r8)
            java.lang.String r4 = r6.toString()
            android.content.SharedPreferences$Editor r4 = r7.remove(r4)
            r4.apply()
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "dc_location_name_"
            r6.append(r4)
            r6.append(r8)
            java.lang.String r4 = r6.toString()
            android.content.SharedPreferences$Editor r4 = r7.remove(r4)
            r4.apply()
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "dc_default_postcode_"
            r6.append(r4)
            r6.append(r8)
            java.lang.String r4 = r6.toString()
            android.content.SharedPreferences$Editor r4 = r7.remove(r4)
            r4.apply()
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "dc_business_domain_"
            r6.append(r4)
            r6.append(r8)
            java.lang.String r4 = r6.toString()
            android.content.SharedPreferences$Editor r4 = r7.remove(r4)
            r4.apply()
        L_0x01c6:
            boolean r4 = r14 instanceof X.C177538dx
            if (r4 == 0) goto L_0x0245
            X.1Nu r8 = r0.A1s
            X.1Cf r6 = r0.A0W
            r4 = r14
            X.8dx r4 = (X.C177538dx) r4
            r19 = 60
            X.23C r7 = new X.23C
            r7.<init>(r6, r4)
            java.lang.String r4 = "BroadcastXmppMethods/sendDeleteBroadcastList"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.19A r15 = r8.A00
            java.lang.String r6 = r15.A09()
            X.8dx r12 = r7.A01
            r11 = 1
            java.lang.String r4 = "id"
            if (r12 == 0) goto L_0x0292
            X.1AL[] r10 = new X.AnonymousClass1AL[r11]
            X.1AL r9 = new X.1AL
            r9.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r4)
            r10[r3] = r9
            java.lang.String r9 = "list"
            X.9nx r12 = new X.9nx
            r12.<init>(r9, r10)
        L_0x01fa:
            java.lang.String r10 = "delete"
            X.9nx r9 = new X.9nx
            r9.<init>((X.C203399nx) r12, (java.lang.String) r10, (X.AnonymousClass1AL[]) r1)
            r1 = 4
            X.1AL[] r10 = new X.AnonymousClass1AL[r1]
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r4, (java.lang.String) r6)
            r10[r3] = r1
            java.lang.String r12 = "xmlns"
            java.lang.String r4 = "w:b"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r12, (java.lang.String) r4)
            r10[r11] = r1
            r12 = 2
            java.lang.String r11 = "type"
            java.lang.String r4 = "set"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r11, (java.lang.String) r4)
            r10[r12] = r1
            r12 = 3
            X.8e2 r11 = X.C177588e2.A00
            java.lang.String r4 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r4)
            r10[r12] = r1
            java.lang.String r1 = "iq"
            X.9nx r4 = new X.9nx
            r4.<init>((X.C203399nx) r9, (java.lang.String) r1, (X.AnonymousClass1AL[]) r10)
            X.3Tr r1 = new X.3Tr
            r1.<init>(r7, r8, r7, r2)
            r20 = 32000(0x7d00, double:1.581E-319)
            r17 = r4
            r18 = r6
            r16 = r1
            r15.A0E(r16, r17, r18, r19, r20)
        L_0x0245:
            X.1Wn r1 = r0.A1W
            r1.A03()
            java.util.Map r2 = X.C56122vm.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2.put(r14, r1)
            X.0v0 r6 = r0.A1d
            X.005 r1 = r6.A00
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r4 = "1on1_invite_sender"
            java.lang.String r2 = r1.getString(r4, r5)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = r1.A02(r2)
            if (r1 == 0) goto L_0x027d
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x027d
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r6)
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)
            r0.apply()
        L_0x027c:
            return
        L_0x027d:
            X.1NZ r1 = r0.A1k
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r14)
            boolean r0 = r1.A01(r7)
            if (r0 == 0) goto L_0x027c
            if (r7 == 0) goto L_0x027c
            X.16r r0 = r1.A00
            X.1M0 r6 = r0.A04()
            goto L_0x0295
        L_0x0292:
            r12 = r1
            goto L_0x01fa
        L_0x0295:
            X.14e r5 = r6.A02     // Catch:{ all -> 0x02ad }
            java.lang.String r4 = "recently_accepted_deeplink_invites"
            java.lang.String r2 = "user_jid=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x02ad }
            r1[r3] = r0     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "delete_invite"
            r5.A03(r4, r2, r0, r1)     // Catch:{ all -> 0x02ad }
            r6.close()
            return
        L_0x02ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02af }
        L_0x02af:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A0Q(X.11F, boolean, boolean):void");
    }

    public void A0R(UserJid userJid, Boolean bool, int i, int i2) {
        C80103un A0B2 = this.A0U.A0B(userJid);
        if (A0B2 == null || A0B2.expiration != i) {
            AnonymousClass1FY r4 = this.A1n;
            long A002 = C19970wo.A00(this.A0K);
            AnonymousClass00C.A0D(userJid, 0);
            AnonymousClass2bH r2 = new AnonymousClass2bH(r4.A00.A02(userJid, true), A002);
            r2.A0q(userJid);
            r2.A1X(Integer.valueOf(i));
            if (i > 0) {
                r2.A04 = i2;
                if (bool != null) {
                    r2.A0d = bool;
                }
            }
            A0T(r2);
            this.A0X.A0h(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r8.A0P(X.C65533Sl.A03(r5)) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
        if (r0.A02(r10) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        if ((r10 instanceof X.AnonymousClass2bT) != false) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(X.AnonymousClass3T1 r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserActions/prepareSendMessage msg="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Qa r0 = r10.A1J
            X.11F r5 = r0.A00
            boolean r4 = r5 instanceof X.C177528dw
            r3 = 1
            if (r4 == 0) goto L_0x0191
            X.0yC r2 = r9.A0j
            r1 = 5477(0x1565, float:7.675E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x002e
            X.13z r0 = X.C223613z.A00
            r10.A0q(r0)
        L_0x002e:
            X.1Xc r0 = r9.A1C
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x003b
            r0 = 262144(0x40000, float:3.67342E-40)
            r10.A0j(r0)
        L_0x003b:
            X.005 r0 = r9.A1N
            java.lang.Object r0 = r0.get()
            X.1Hg r0 = (X.C25681Hg) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x005c
            X.005 r0 = r9.A1M
            java.lang.Object r1 = r0.get()
            X.1HX r1 = (X.AnonymousClass1HX) r1
            java.util.List r0 = r10.A0w
            com.whatsapp.jid.UserJid r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x005c
            r10.A1A(r3)
        L_0x005c:
            X.0yC r6 = r9.A0j
            X.12q r8 = r9.A0U
            X.005 r7 = r9.A1M
            X.1FU r1 = r9.A0s
            X.005 r2 = r9.A1R
            boolean r0 = r10 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x0080
            boolean r0 = r1.A00(r10)
            if (r0 != 0) goto L_0x0080
            boolean r0 = r10 instanceof X.AnonymousClass2bM
            if (r0 != 0) goto L_0x0107
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r0 = X.C65533Sl.A03(r5)
            boolean r0 = r8.A0P(r0)
            if (r0 == 0) goto L_0x0107
        L_0x0080:
            r10.A13 = r3
            r0 = 32
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = X.AnonymousClass136.A00()
            r0.nextBytes(r1)
            r10.A1b = r1
        L_0x008f:
            boolean r0 = r10.A1E()
            if (r0 != 0) goto L_0x009b
            boolean r0 = X.C197029b1.A00(r5)
            if (r0 == 0) goto L_0x00a0
        L_0x009b:
            X.1DT r0 = r9.A1U
            r0.A0L(r10, r3)
        L_0x00a0:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r3 = X.C222813r.A00(r5)
            if (r3 == 0) goto L_0x00b1
            X.1IN r1 = r9.A0P
            X.9TX r0 = r1.A00(r3)
            r1.A06(r0, r10)
        L_0x00b1:
            r0 = 508(0x1fc, float:7.12E-43)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00f9
            X.1Hx r0 = r9.A0Q
            X.1IO r0 = r0.A01
            X.9Xu r2 = r0.A01(r3)
            r0 = 6122(0x17ea, float:8.579E-42)
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x00fa
            if (r2 != 0) goto L_0x00fc
            X.1IN r1 = r9.A0P
            X.9TX r0 = r1.A00(r3)
            boolean r0 = r0 instanceof X.C175408aR
            if (r0 == 0) goto L_0x00f9
            X.9TX r2 = r1.A00(r3)
            X.8aR r2 = (X.C175408aR) r2
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r2.A02
            long r4 = r2.A00
        L_0x00e5:
            r10.A0q = r1
            r10.A0p = r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.convert(r1, r0)
            int r0 = (int) r1
            r10.A03 = r0
        L_0x00f9:
            return
        L_0x00fa:
            if (r2 == 0) goto L_0x00f9
        L_0x00fc:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x00f9
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r2.A05
            long r4 = r2.A01
            goto L_0x00e5
        L_0x0107:
            boolean r0 = r10.A1G()
            if (r0 == 0) goto L_0x0119
            r1 = 3146(0xc4a, float:4.408E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r1)
            if (r0 == 0) goto L_0x0119
            goto L_0x0080
        L_0x0119:
            if (r5 == 0) goto L_0x008f
            java.lang.Object r0 = r7.get()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            boolean r0 = r0.A09(r10)
            if (r0 != 0) goto L_0x0080
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 == 0) goto L_0x0139
            r1 = 3143(0xc47, float:4.404E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r1)
            if (r0 == 0) goto L_0x0139
            goto L_0x0080
        L_0x0139:
            boolean r0 = r5 instanceof X.C177538dx
            if (r0 == 0) goto L_0x0149
            r1 = 3144(0xc48, float:4.406E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r1)
            if (r0 == 0) goto L_0x0149
            goto L_0x0080
        L_0x0149:
            if (r4 == 0) goto L_0x0157
            r1 = 3145(0xc49, float:4.407E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r1)
            if (r0 == 0) goto L_0x0157
            goto L_0x0080
        L_0x0157:
            X.3Kx r0 = r10.A0P()
            if (r0 == 0) goto L_0x0167
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x0167
            goto L_0x0080
        L_0x0167:
            java.lang.Object r4 = r2.get()
            X.9R4 r4 = (X.AnonymousClass9R4) r4
            X.0yC r2 = r4.A00
            r1 = 5717(0x1655, float:8.011E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x018b
            X.005 r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.6TA r0 = (X.AnonymousClass6TA) r0
            if (r0 == 0) goto L_0x018b
            boolean r0 = r0.A02(r10)
            if (r0 == 0) goto L_0x018b
            goto L_0x0080
        L_0x018b:
            boolean r0 = r10 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x008f
            goto L_0x0080
        L_0x0191:
            boolean r0 = r5 instanceof X.C177618e5
            if (r0 == 0) goto L_0x003b
            r10.A10 = r3
            X.17X r0 = r9.A1i
            r1 = r5
            X.144 r1 = (X.AnonymousClass144) r1
            X.17r r0 = r0.A07
            X.6X6 r1 = r0.A0C(r1)
            X.1A5 r0 = r9.A0V
            X.141 r0 = r0.A01(r5)
            java.lang.String r0 = r0.A0J()
            r10.A0r = r0
            X.0y7 r0 = r1.A05()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            X.0wQ r1 = r9.A03
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03
            r2.remove(r0)
            X.13w r0 = r1.A08()
            r2.remove(r0)
            r10.A19(r2)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A0T(X.3T1):void");
    }

    public void A0U(AnonymousClass3T1 r4) {
        int i = r4.A1I;
        C18740tg.A0C(!C66013Ui.A0J(i));
        C18740tg.A0C(!C66013Ui.A0K(i));
        boolean z = false;
        if (i == 82) {
            z = true;
        }
        C18740tg.A0C(!z);
        ((C20280xJ) this.A1y.get()).A03(r4, false);
        if (r4 instanceof AnonymousClass2bM) {
            r4 = this.A1H.A03(((AnonymousClass2bM) r4).A1Z());
        }
        this.A0a.A05(r4, -1);
    }

    public void A0Y(AnonymousClass3T1 r18, String str, String str2, List list, boolean z) {
        String str3 = str;
        byte[] bArr = null;
        AnonymousClass3T1 r12 = r18;
        String str4 = str2;
        List<AnonymousClass11F> list2 = list;
        boolean z2 = z;
        if (str2 != null) {
            try {
                bArr = str4.getBytes(C19430v1.A0B);
            } catch (UnsupportedEncodingException unused) {
            }
            if (bArr != null) {
                long length = (long) bArr.length;
                C21100yf r8 = this.A05;
                if (length > ((long) r8.A04(C21100yf.A1r)) * 1024) {
                    this.A02.A07(R.string.f12nameremoved, 1);
                    return;
                }
                long A042 = ((long) r8.A04(C21100yf.A1x)) * 1024;
                if (A042 > 0 && length > A042) {
                    if (str == null) {
                        C19630wG r5 = this.A0L;
                        str3 = new C65033Ql(this.A0E, this.A1b, r5, this.A0N).A00(str4);
                        if (str3 == null) {
                            str3 = r5.A00.getString(R.string.f12nameremoved);
                        }
                    }
                    this.A1J.Boy(new C35551is(this, list2, bArr, r12, str3, 1, 1, z2));
                    return;
                }
            }
        }
        for (AnonymousClass11F A022 : list2) {
            AnonymousClass2bX r2 = new AnonymousClass2bX(this.A11.A02(A022, true), C19970wo.A00(this.A0K));
            r2.A1Y(str4);
            r2.A00 = str3;
            this.A14.A00(r2, r12);
            if (z) {
                r2.A0j(4);
            }
            A0T(r2);
            this.A0X.A0h(r2);
        }
    }

    public void A0Z(AnonymousClass3T1 r20, List list, List list2, boolean z) {
        String string;
        List list3 = list2;
        String join = TextUtils.join("\n", list3);
        byte[] bArr = null;
        if (join != null) {
            try {
                bArr = join.getBytes(C19430v1.A0B);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        AnonymousClass3T1 r14 = r20;
        List<AnonymousClass11F> list4 = list;
        boolean z2 = z;
        if (bArr != null) {
            int length = bArr.length;
            int size = list3.size();
            long j = (long) length;
            C21100yf r10 = this.A05;
            if (j > ((long) r10.A04(C21100yf.A1r)) * 1024) {
                int i = R.string.f12nameremoved;
                if (size == 1) {
                    i = R.string.f12nameremoved;
                }
                this.A02.A07(i, 1);
                return;
            }
            long A042 = ((long) r10.A04(C21100yf.A1x)) * 1024;
            if (A042 > 0 && j > A042 && list3.size() > 0) {
                C19630wG r3 = this.A0L;
                AnonymousClass16D r2 = this.A0E;
                C21060yb r0 = this.A1b;
                C18820ts r9 = this.A0N;
                int size2 = list3.size();
                String A002 = new C65033Ql(r2, r0, r3, r9).A00((String) list3.get(0));
                if (A002 != null) {
                    int i2 = size2 - 1;
                    string = r9.A0L(new Object[]{A002, Integer.valueOf(i2)}, R.plurals.f10nameremoved, (long) i2);
                } else {
                    string = r3.A00.getString(R.string.f12nameremoved);
                }
                this.A1J.Boy(new C35551is(this, list4, bArr, r14, string, size, 1, z2));
                return;
            }
        }
        for (AnonymousClass11F A022 : list4) {
            String A0L2 = this.A0N.A0L(new Object[]{Integer.valueOf(list3.size())}, R.plurals.f10nameremoved, (long) list3.size());
            AnonymousClass2bW r22 = new AnonymousClass2bW(this.A11.A02(A022, true), C19970wo.A00(this.A0K));
            r22.A00 = A0L2;
            r22.A1Y(list3);
            this.A14.A00(r22, r14);
            if (z) {
                r22.A0j(4);
            }
            A0T(r22);
            this.A0X.A0h(r22);
        }
    }

    public void A0a(AnonymousClass2bL r16) {
        C19770wU r1 = this.A1J;
        C19970wo r7 = this.A0K;
        C19700wN r3 = this.A00;
        C20050ww r5 = this.A06;
        C20310xM r9 = this.A0X;
        AnonymousClass16J r10 = this.A0a;
        AnonymousClass13E r12 = this.A0n;
        C20830yE r8 = this.A0M;
        r1.Box(new C50332ka(r3, this.A01, r5, this.A0I, r7, r8, r9, r10, this.A0b, r12, this.A0o, r16), new Void[0]);
    }

    public void A0c(Collection collection, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserActions/userActionDeleteMessages ");
        sb.append(collection.size());
        Log.i(sb.toString());
        ArrayList A042 = A04(this, collection);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UserActions/userActionDeleteMessages messagesToDeleteIncludingAssociatedMessages=");
        sb2.append(A042.size());
        Log.i(sb2.toString());
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r3 = (AnonymousClass3T1) it.next();
            C65093Qs.A02(this.A0k, this.A0l, r3, 6);
            r3.A1X = true;
            if ((r3 instanceof AnonymousClass2bU) && r3.A1J.A02) {
                this.A0q.A08(r3, false);
            }
            this.A1j.A0C(r3.A1J);
        }
        this.A0S.A01(new C35311iU(this, A042, 1, z, z2), 20);
        this.A1J.Boy(new C35621iz(this, A042, 30));
    }

    public void A0d(Set set, boolean z) {
        this.A1J.Bp1(new C35291iS(this, set, 1, z));
    }

    public boolean A0e(AnonymousClass3T1 r19, String str, boolean z) {
        AnonymousClass1NG r4 = this.A1Z;
        AnonymousClass3T1 r3 = r19;
        C64933Qa r7 = r3.A1J;
        AnonymousClass11F r1 = r7.A00;
        C222813r r0 = UserJid.Companion;
        String str2 = str;
        if (r4.A0O(C222813r.A00(r1)) && !TextUtils.isEmpty(str2)) {
            return false;
        }
        C18740tg.A06(r1);
        if (r1 instanceof C28981Uw) {
            C18740tg.A06(r1);
            if (!C65903Tx.A06(this.A0U, (C28981Uw) r1, (AnonymousClass1GQ) this.A1x.get())) {
                return false;
            }
        }
        C195759Vv r9 = new C195759Vv(r3.A0L(), r7);
        C195759Vv A012 = C183338qd.A01(r3);
        long j = r3.A1N;
        C19970wo r5 = this.A0K;
        C180868mY r72 = new C180868mY(this.A11.A02(r1, true), r9, A012, str2, C19970wo.A00(r5), j, C19970wo.A00(r5));
        this.A0f.A01(r72);
        if (TextUtils.isEmpty(str2)) {
            C29721Xs r02 = this.A1u;
            r02.A01.Bly(C29721Xs.A00(r02.A00.A0C(r3), AnonymousClass3UK.A05(r72), 2));
            Parcelable.Creator creator = AnonymousClass147.CREATOR;
            AnonymousClass147 A032 = C65533Sl.A03(r1);
            if (A032 != null && this.A0U.A05(A032) == 3) {
                this.A1J.Boy(new C35621iz(this, A032, 19));
            }
        } else if (z) {
            C29721Xs r03 = this.A1u;
            r03.A01.Bly(C29721Xs.A00(r03.A00.A0C(r3), AnonymousClass3UK.A05(r72), 3));
        }
        this.A1J.Boy(new C35621iz(this, r3, 22));
        return true;
    }

    public static ArrayList A04(AnonymousClass1X4 r7, Collection collection) {
        AnonymousClass3KQ A0N2;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r4 = (AnonymousClass3T1) it.next();
            if (r4.A0M() != null) {
                AnonymousClass005 r3 = r7.A1M;
                r3.get();
                if ((r4 instanceof AnonymousClass2bV) && C63903Lw.A00(r4) && r4.A0N() != null && r4.A0M() != null && ((A0N2 = r4.A0N()) == null || A0N2.A00 == null)) {
                    Iterator it2 = ((C62573Gr) r7.A1w.get()).A00(r4.A0M().A02).iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3T1 r1 = (AnonymousClass3T1) it2.next();
                        if (((AnonymousClass1HX) r3.get()).A08(r1)) {
                            arrayList.add(r1);
                        }
                    }
                }
            }
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static void A09(AnonymousClass1X4 r6, AnonymousClass3T1 r7, AnonymousClass3T1 r8) {
        C64933Qa r1;
        if (r7.A0X() != null) {
            r1 = r7.A0X().A02;
        } else {
            r1 = r7.A1J;
        }
        C19970wo r0 = r6.A0K;
        r8.A11(new AnonymousClass37F(r1, C19970wo.A00(r0), C19970wo.A00(r0)));
        r8.A0j(C132986Wc.A0F);
        r8.A1R = r7.A1R;
        C29571Xd r2 = r6.A1f;
        try {
            if (r8 instanceof AnonymousClass2bT) {
                if (!C20800yB.A01(C21000yV.A01, r2.A0W, 7357)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid edited message ");
                    sb.append(r8);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            AnonymousClass3T1 A002 = C29571Xd.A00(r2, r8, true, false);
            if (A002 != null) {
                ((C20280xJ) r2.A0f.get()).A01(A002);
            } else {
                Log.e("EditMessageManager/handleOutgoingEditedMessage message failed to store");
            }
        } catch (IllegalArgumentException e) {
            Log.e("EditMessageManager/handleOutgoingEditedMessage", e);
            r2.A01.A0E("EditMessageManager/handleOutgoingEditedMessage/invalidMessage", (String) null, false);
        }
    }

    public ArrayList A0D(C145166tS r23, AnonymousClass3XT r24, AnonymousClass3JL r25, C63663Kx r26, AnonymousClass3BG r27, AnonymousClass3T1 r28, AnonymousClass3L1 r29, AnonymousClass4UX r30, Integer num, String str, List list, List list2, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList(list.size());
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r13 = (AnonymousClass11F) it.next();
            AnonymousClass2bV A012 = A01(this, r23, r24, r13, r27, r28, r29, str, list2, z, z2, z3);
            arrayList.add(A012);
            C63663Kx r02 = r26;
            if (r26 != null) {
                A012.A0u(r02);
            }
            if (num != null) {
                A012.A0j(num.intValue());
            }
            A012.A1K.A01(r25);
            AnonymousClass4UX r8 = r30;
            if (r30 != null && r8.Bt3()) {
                if (A012.A1J.A00 instanceof C28981Uw) {
                    C29861Yg r3 = (C29861Yg) this.A1P.get();
                    r3.A01.A01(new C35741jB(r3, A012, 32), 73);
                } else {
                    this.A0X.A0m(A012, 1);
                }
                r8.Baz(A012);
                long BIK = r8.BIK();
                if (BIK > 0) {
                    this.A02.A0I(new C35321iV(this, r8, A012, 5), BIK);
                }
            } else if (r13 instanceof C28981Uw) {
                C29861Yg r32 = (C29861Yg) this.A1P.get();
                r32.A07.Boy(new C35741jB(r32, A012, 31));
            } else {
                this.A0X.A0h(A012);
            }
        }
        return arrayList;
    }

    public void A0L(AnonymousClass11F r4, AnonymousClass3T1 r5, C135066c4 r6, Integer num, boolean z) {
        C46962bx A002 = A00(r4, r5, r6, num, z);
        if (A002 != null) {
            A0b(new AnonymousClass3SC(Collections.singletonList(A002)), (byte[]) null, false, false);
        }
    }

    public void A0N(AnonymousClass11F r17, String str) {
        A0D((C145166tS) null, (AnonymousClass3XT) null, (AnonymousClass3JL) null, (C63663Kx) null, (AnonymousClass3BG) null, (AnonymousClass3T1) null, (AnonymousClass3L1) null, (AnonymousClass4UX) null, (Integer) null, str, Collections.singletonList(r17), (List) null, false, false, false);
    }

    public void A0S(AnonymousClass4R0 r11, AnonymousClass2bU r12) {
        A03(this, r11, (AnonymousClass2bU) null, new AnonymousClass3SC(Collections.singletonList(r12)), (Integer) null, (Integer) null, (byte[]) null, false, false, false);
    }

    public static void A07(AnonymousClass1X4 r4, long j) {
        if (j < 946684800000L || j > 2208988800000L) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserActions/reportIfBadTime: time=");
            C18820ts r2 = r4.A0N;
            sb.append(AnonymousClass6XI.A03(r2, C20040wv.A09(r2, j), AnonymousClass3UM.A00(r2, j)));
            Log.e(sb.toString());
            if (r4.A1t.A00()) {
                r4.A00.A0E("UserActions/badTime", (String) null, false);
            }
        }
    }

    public AnonymousClass1X4(C19700wN r4, C237019m r5, AnonymousClass17Y r6, AnonymousClass1XR r7, C19730wQ r8, AnonymousClass1DT r9, C24041Av r10, C21100yf r11, C20050ww r12, C26851Lt r13, C29411Wn r14, AnonymousClass19J r15, C26021Io r16, AnonymousClass1KK r17, AnonymousClass1KM r18, C25791Hr r19, AnonymousClass1NG r20, AnonymousClass1XZ r21, AnonymousClass1AO r22, AnonymousClass1LV r23, AnonymousClass196 r24, AnonymousClass16D r25, AnonymousClass1DM r26, AnonymousClass171 r27, AnonymousClass1Y3 r28, AnonymousClass1A6 r29, AnonymousClass1G5 r30, C24341Cb r31, C21060yb r32, C19970wo r33, C19630wG r34, AnonymousClass17Z r35, C20830yE r36, C19420v0 r37, C18820ts r38, C20060wx r39, AnonymousClass1IN r40, C25851Hx r41, AnonymousClass1YG r42, AnonymousClass1E3 r43, AnonymousClass1C7 r44, C220712t r45, C220412q r46, AnonymousClass1A5 r47, C24381Cf r48, C20310xM r49, AnonymousClass1SR r50, C29571Xd r51, AnonymousClass17S r52, AnonymousClass1LW r53, AnonymousClass17X r54, C24541Cv r55, AnonymousClass176 r56, AnonymousClass16J r57, AnonymousClass1FN r58, AnonymousClass1NZ r59, AnonymousClass1NO r60, AnonymousClass1QI r61, AnonymousClass1FV r62, AnonymousClass1YE r63, AnonymousClass1YC r64, AnonymousClass1TA r65, AnonymousClass1DW r66, C28071Rf r67, AnonymousClass1FY r68, C29541Xa r69, C20810yC r70, C20500xf r71, C21010yW r72, C25121Fb r73, C20350xQ r74, C20510xg r75, AnonymousClass13E r76, AnonymousClass1DU r77, AnonymousClass1P5 r78, AnonymousClass1D5 r79, AnonymousClass1Y4 r80, AnonymousClass1GH r81, AnonymousClass1FU r82, C24811Dw r83, AnonymousClass1ST r84, AnonymousClass1GJ r85, AnonymousClass1GD r86, AnonymousClass1Y2 r87, AnonymousClass19A r88, AnonymousClass1C4 r89, C27331Nu r90, C28361Si r91, AnonymousClass1BF r92, C237919w r93, C29711Xr r94, AnonymousClass1TY r95, AnonymousClass1FO r96, AnonymousClass1TU r97, C29551Xb r98, AnonymousClass1YB r99, AnonymousClass1AW r100, AnonymousClass1EO r101, C29721Xs r102, AnonymousClass1BS r103, AnonymousClass1CR r104, C29561Xc r105, C29731Xt r106, C23981Ap r107, AnonymousClass1AP r108, AnonymousClass1YD r109, AnonymousClass1A1 r110, AnonymousClass1X7 r111, AnonymousClass1GX r112, C19770wU r113, C000100b r114, AnonymousClass005 r115, AnonymousClass005 r116, AnonymousClass005 r117, AnonymousClass005 r118, AnonymousClass005 r119, AnonymousClass005 r120, AnonymousClass005 r121, AnonymousClass005 r122, AnonymousClass005 r123, AnonymousClass005 r124, AnonymousClass005 r125) {
        this.A0L = r34;
        this.A0K = r33;
        this.A0j = r70;
        this.A1v = r111;
        this.A02 = r6;
        this.A00 = r4;
        this.A03 = r8;
        this.A1J = r113;
        this.A0U = r46;
        this.A1K = r114;
        this.A1q = r77;
        this.A06 = r12;
        this.A0l = r72;
        this.A0T = r45;
        this.A0y = r89;
        this.A05 = r11;
        this.A0D = r24;
        this.A0p = r79;
        this.A0O = r39;
        this.A0k = r71;
        this.A0n = r76;
        this.A1N = r115;
        this.A0x = r88;
        this.A1A = r103;
        this.A08 = r16;
        this.A1M = r116;
        this.A0E = r25;
        this.A0h = r66;
        this.A1h = r53;
        this.A1I = r112;
        this.A1U = r9;
        this.A1E = r107;
        this.A1b = r32;
        this.A1r = r85;
        this.A0G = r27;
        this.A0N = r38;
        this.A1S = r117;
        this.A1Z = r20;
        this.A0B = r22;
        this.A0X = r49;
        this.A0Y = r50;
        this.A1H = r110;
        this.A0m = r75;
        this.A1m = r67;
        this.A0Z = r55;
        this.A0a = r57;
        this.A1x = r118;
        this.A1O = r119;
        this.A1p = r74;
        this.A07 = r15;
        this.A1B = r104;
        this.A1T = r7;
        this.A0J = r31;
        this.A1F = r108;
        this.A1W = r14;
        this.A0S = r44;
        this.A09 = r19;
        this.A1L = r120;
        this.A11 = r93;
        this.A0v = r86;
        this.A1y = r121;
        this.A0A = r21;
        this.A0i = r69;
        this.A16 = r98;
        this.A0t = r83;
        this.A1j = r56;
        this.A0z = r91;
        this.A0F = r26;
        this.A0c = r60;
        this.A1l = r65;
        this.A1C = r105;
        this.A0M = r36;
        this.A1d = r37;
        this.A1s = r90;
        this.A0C = r23;
        this.A0H = r29;
        this.A1f = r51;
        this.A12 = r94;
        this.A01 = r5;
        this.A0u = r84;
        this.A1R = r122;
        this.A1u = r102;
        this.A0b = r58;
        this.A1D = r106;
        this.A0r = r81;
        this.A0d = r61;
        this.A0W = r48;
        this.A1g = r52;
        this.A14 = r96;
        this.A0w = r87;
        this.A0s = r82;
        this.A0R = r43;
        this.A10 = r92;
        this.A15 = r97;
        this.A0o = r78;
        this.A1X = r17;
        this.A0e = r62;
        this.A1w = r123;
        this.A1a = r28;
        this.A1Y = r18;
        this.A1o = r73;
        this.A13 = r95;
        this.A0q = r80;
        this.A1n = r68;
        this.A1i = r54;
        this.A1P = r125;
        this.A1Q = r124;
        this.A17 = r99;
        this.A0V = r47;
        this.A0g = r64;
        this.A1G = r109;
        this.A0Q = r41;
        this.A0f = r63;
        this.A04 = r10;
        this.A1k = r59;
        this.A0P = r40;
        this.A1e = r42;
        this.A0I = r30;
        this.A1V = r13;
        this.A18 = r100;
        this.A19 = r101;
        this.A1c = r35;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (((java.lang.Boolean) r6.A0C(r1.A00, (long) r1.A0B).first).booleanValue() != false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass33E A03(X.AnonymousClass1X4 r25, X.AnonymousClass4R0 r26, X.AnonymousClass2bU r27, X.AnonymousClass3SC r28, java.lang.Integer r29, java.lang.Integer r30, byte[] r31, boolean r32, boolean r33, boolean r34) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserActions/userActionSendMediaMessages/size = "
            r1.append(r0)
            r3 = r28
            java.util.concurrent.CopyOnWriteArrayList r7 = r3.A02
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r30 == 0) goto L_0x0036
            int r2 = r30.intValue()
            java.util.Iterator r1 = r7.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r0.A0j(r2)
            goto L_0x0026
        L_0x0036:
            r14 = r25
            X.1GJ r6 = r14.A1r
            X.2bU r0 = r3.A01()
            boolean r0 = r6.A0K(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0066
            X.2bU r1 = r3.A01()
            X.1Gl r0 = X.AnonymousClass6Y1.A02(r1)
            boolean r0 = X.AnonymousClass6Y1.A09(r0)
            if (r0 == 0) goto L_0x0088
            long r4 = r1.A00
            int r0 = r1.A0B
            long r0 = (long) r0
            android.util.Pair r0 = r6.A0C(r4, r0)
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0088
        L_0x0066:
            X.2bU r0 = r3.A01()
            X.1Gl r1 = X.AnonymousClass6Y1.A02(r0)
            X.3Qj r0 = r0.A01
            X.C18740tg.A06(r0)
            java.io.File r0 = r0.A0I
            boolean r0 = r6.A0G(r1, r0)
            if (r0 != 0) goto L_0x0088
            X.17Y r1 = r14.A02
            r0 = 2131894329(0x7f122039, float:1.942346E38)
            r1.A06(r0, r2)
            X.33E r5 = A02()
            return r5
        L_0x0088:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = X.C007103b.A0Y(r7)
            java.util.Iterator r13 = r0.iterator()
        L_0x009a:
            boolean r0 = r13.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x010e
            java.lang.Object r9 = r13.next()
            X.2bU r9 = (X.AnonymousClass2bU) r9
            r14.A0T(r9)
            X.0yC r4 = r14.A0j
            int r0 = r9.A0B
            long r0 = (long) r0
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            int r10 = X.C55412ua.A00(r4, r0)
            int r0 = r7.size()
            if (r0 == r2) goto L_0x00c6
            r1 = 695(0x2b7, float:9.74E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r1)
            if (r0 == 0) goto L_0x010a
        L_0x00c6:
            X.3Qa r0 = r9.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x010a
            int r1 = r9.A1I
            r0 = 3
            if (r1 != r0) goto L_0x010a
            int r0 = r9.A0B
            if (r0 <= r10) goto L_0x010a
            r9.A0B = r10
            X.3Qj r2 = r9.A01
            X.C18740tg.A06(r2)
            long r4 = r2.A0F
            long r0 = (long) r10
            long r0 = r0 * r11
            long r4 = r4 + r0
            r2.A0G = r4
            r6.add(r9)
        L_0x00e8:
            X.3Qa r0 = r9.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0104
            X.1Xc r0 = r14.A1C
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0104
            X.1Xt r2 = r14.A1D
            int r0 = r9.A0C
            long r0 = (long) r0
            java.lang.String r4 = "request"
            X.1Xw r2 = r2.A0A
            r2.A03(r9, r4, r0)
        L_0x0104:
            X.1Y2 r0 = r14.A0w
            r0.A01(r9)
            goto L_0x009a
        L_0x010a:
            r8.add(r9)
            goto L_0x00e8
        L_0x010e:
            X.2bU r0 = r3.A01()
            X.3Qj r0 = r0.A01
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            java.io.File r0 = r0.A0I
            if (r0 == 0) goto L_0x012a
            X.0wU r4 = r14.A1J
            r1 = 27
            X.1iz r0 = new X.1iz
            r0.<init>(r14, r3, r1)
            r4.Boy(r0)
        L_0x012a:
            X.33E r28 = A02()
            X.33E r17 = A02()
            boolean r0 = r8.isEmpty()
            r15 = r26
            r5 = r27
            r19 = r29
            r4 = r31
            r21 = r32
            r22 = r33
            r23 = r34
            if (r0 != 0) goto L_0x015d
            int r0 = r3.A00
            X.3SC r7 = new X.3SC
            r7.<init>(r8, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r7.A02
            java.util.List r0 = X.C007103b.A0Y(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c6
            X.33E r28 = A02()
        L_0x015d:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x017a
            int r0 = r3.A00
            X.3SC r3 = new X.3SC
            r3.<init>(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.A02
            java.util.List r0 = X.C007103b.A0Y(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a9
            X.33E r17 = A02()
        L_0x017a:
            r0 = 2
            X.33E[] r4 = new X.AnonymousClass33E[r0]
            r0 = 0
            r4[r0] = r28
            r4[r2] = r17
            X.33E r5 = new X.33E
            r5.<init>()
            r2 = 2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r1 = 0
        L_0x018e:
            r0 = r4[r1]
            X.3ty r0 = r0.A00
            r3.add(r0)
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x018e
            X.8UW r2 = new X.8UW
            r2.<init>(r3)
            r1 = 8
            X.413 r0 = new X.413
            r0.<init>(r5, r1)
            r2.A0A(r0)
            return r5
        L_0x01a9:
            X.33E r17 = new X.33E
            r17.<init>()
            java.util.List r1 = X.C007103b.A0Y(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            X.3w3 r13 = new X.3w3
            r18 = r3
            r20 = r4
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            A0A(r14, r5, r13, r0, r4)
            goto L_0x017a
        L_0x01c6:
            X.33E r28 = new X.33E
            r28.<init>()
            java.util.List r0 = X.C007103b.A0Y(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.3w3 r0 = new X.3w3
            r24 = r0
            r29 = r7
            r30 = r19
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            A0A(r14, r5, r0, r1, r4)
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A03(X.1X4, X.4R0, X.2bU, X.3SC, java.lang.Integer, java.lang.Integer, byte[], boolean, boolean, boolean):X.33E");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0223, code lost:
        if (r14 == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0225, code lost:
        if (r4 == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0227, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0230, code lost:
        if (X.C65703Td.A03((X.C47002cZ) r0) != false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0232, code lost:
        r30 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0234, code lost:
        r5 = r5.A00;
        r29 = r5 instanceof X.C28981Uw;
        r28 = r44.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0242, code lost:
        if (r28.hasNext() == false) goto L_0x06bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0244, code lost:
        r7 = (X.AnonymousClass11F) r28.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r6 = r1.A17;
        r3 = X.C19970wo.A00(r1.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0252, code lost:
        if (r31 != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0254, code lost:
        if (r30 != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0256, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0257, code lost:
        if (r29 == false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0259, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0260, code lost:
        if (r0.A1T(androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0262, code lost:
        r10 = r6.A01.A02(r7, true);
        r9 = r0.A0V;
        r2 = new X.AnonymousClass2bV(r10, r3);
        r2.A16(r9.A08);
        r2.A0V = r9;
        r2.A0j(androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027c, code lost:
        r9 = r6.A00;
        r6 = X.C21000yV.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        if (r15 != 46) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028c, code lost:
        r10 = r6.A01.A02(r7, true);
        r9 = r0.A0b();
        r2 = new X.AnonymousClass2bV(r10, r3);
        r2.A16(X.AnonymousClass14B.A0C(r9, 65536));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a6, code lost:
        if (r25 == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a8, code lost:
        r11 = (X.AnonymousClass2bU) r0;
        r14 = r11.A01;
        X.C18740tg.A06(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b0, code lost:
        if (r9 == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b3, code lost:
        r10 = new X.C65013Qj(r14);
        r10.A0V = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bc, code lost:
        r10 = r14.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c0, code lost:
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c6, code lost:
        if (r10.A0D != 0) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c8, code lost:
        r10.A0D = r11.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02cc, code lost:
        r2 = r11.A1Z(r10, r6.A01.A02(r7, true), r3, r40);
        r12 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e9, code lost:
        if (X.AnonymousClass3T2.A03(r12, r11, r2.A1J.A00 instanceof X.C177528dw) == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02eb, code lost:
        r3 = r11.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ed, code lost:
        if (r3 == null) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f3, code lost:
        if (r3.A01() == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f9, code lost:
        if (r11.A1Q() == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0305, code lost:
        if (java.util.Arrays.equals(r11.A0a.A0A, r10.A0a) != false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0307, code lost:
        com.whatsapp.util.Log.e("FMessageFactory/newFMessageForForward/thumbnail and media file key not the same");
        r2.A12((X.AnonymousClass3L1) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0314, code lost:
        if (X.AnonymousClass3T2.A01(r12, r2) == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0316, code lost:
        r3 = r2.A1Y();
        X.C18740tg.A06(r3);
        r3.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0320, code lost:
        r10 = r11.A0a.A00();
        r10.A02 = r14.A0D;
        r10.A09 = r9;
        r10.A0C = X.AnonymousClass3T2.A02(r12, r2);
        r2.A12(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0336, code lost:
        if (r9 == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033b, code lost:
        if ((r2 instanceof X.C46882bp) == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x033d, code lost:
        r2.A04 = null;
        r2.A03 = null;
        r3 = r2.A01;
        X.C18740tg.A06(r3);
        r3.A0O = null;
        r3.A0N = null;
        r11 = r2.A1Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034e, code lost:
        if (r11 == null) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0350, code lost:
        r9 = r11.A06();
        r11.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0357, code lost:
        if (r9 == null) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0359, code lost:
        r4 = r9.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035b, code lost:
        if (r4 != 4) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035d, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035e, code lost:
        r26 = r26 + ((long) r9[r3]);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0365, code lost:
        if (r3 < r4) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036d, code lost:
        if (r2.A01.A0C != r26) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x036f, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r11.A02 = r9;
        r11.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0375, code lost:
        r2.A0n(1);
        r2.A07 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x037b, code lost:
        r2.A0n(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x037f, code lost:
        r2.A1f(r24);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0388, code lost:
        if ((r0 instanceof X.AnonymousClass2bV) == false) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x038a, code lost:
        r2 = ((X.AnonymousClass2bV) r0).A1X(r6.A01.A02(r7, true), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0398, code lost:
        r3 = r0.A0a;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x039a, code lost:
        if (r9 == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x039c, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x039d, code lost:
        X.C18740tg.A0C(r0 instanceof X.AnonymousClass4RV);
        r2 = ((X.AnonymousClass4RV) r0).B31(r6.A01.A02(r7, true), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b1, code lost:
        if (r3 == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b3, code lost:
        r2.A12(r3.A00());
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03bc, code lost:
        if (X.C20800yB.A01(r6, r9, 4513) == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03be, code lost:
        X.AnonymousClass00C.A0D(r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03c4, code lost:
        if (r15 == 23) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03c8, code lost:
        if (r15 == 37) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03cc, code lost:
        if (r15 == 52) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ce, code lost:
        switch(r15) {
            case 25: goto L_0x03e9;
            case 26: goto L_0x03e9;
            case 27: goto L_0x03e9;
            case 28: goto L_0x03e9;
            case 29: goto L_0x03e9;
            case 30: goto L_0x03e9;
            default: goto L_0x03d1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d2, code lost:
        r2.A0t((X.C63673Ky) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03d8, code lost:
        if ((r0 instanceof X.C23043B1o) == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03da, code lost:
        r3 = (X.C23043B1o) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03dd, code lost:
        if (r3 == null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03df, code lost:
        r3 = r3.BA8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e3, code lost:
        if (r3 == null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03e7, code lost:
        if (r3.A0B == null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03eb, code lost:
        if ((r5 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ed, code lost:
        r2.A0t(new X.C63673Ky((X.AnonymousClass141) null, (com.whatsapp.jid.UserJid) r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03fe, code lost:
        if (X.C20800yB.A01(r6, r9, 5431) == false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0400, code lost:
        r2.A0h = java.lang.Long.valueOf(r0.A1N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0408, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x040d, code lost:
        if (X.C131806Qs.A02(r0) == false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x040f, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0410, code lost:
        r2.A09 = r3;
        r7 = r7 instanceof X.C177528dw;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0414, code lost:
        if (r7 == false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x041a, code lost:
        if (android.text.TextUtils.isEmpty(r45) != false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x041c, code lost:
        r2.A17(r45.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0425, code lost:
        if ((r2 instanceof X.AnonymousClass2bV) == false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0427, code lost:
        r4 = new com.whatsapp.TextData();
        r4.backgroundColor = X.AnonymousClass3UN.A00();
        r4.textColor = -1;
        r4.fontStyle = 0;
        ((X.AnonymousClass2bV) r2).A1Z(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0442, code lost:
        if (X.C202359le.A04(r2) == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0444, code lost:
        r9 = new java.lang.StringBuilder();
        r3 = r2.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0451, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0453, code lost:
        r9.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0456, code lost:
        r3 = X.C202359le.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0460, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0466, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0468, code lost:
        r9.append("\n\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x046b, code lost:
        r9.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x046e, code lost:
        r3 = r2.A0T().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0474, code lost:
        if (r3 == null) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0476, code lost:
        r3 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x047c, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0482, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0484, code lost:
        r9.append("\n\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0487, code lost:
        r9.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x048a, code lost:
        r4 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0492, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0494, code lost:
        r2.A16(X.AnonymousClass3UN.A07(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (((X.AnonymousClass1HX) r1.A1M.get()).A06(r0) == false) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x049d, code lost:
        if ((r2 instanceof X.C46812bi) == false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x049f, code lost:
        r4 = (X.C46942bv) r2;
        r3 = (X.AnonymousClass3QP) r4.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04b1, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0b()) != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04b3, code lost:
        r2.A16(X.AnonymousClass3UN.A07(r2.A0b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04bf, code lost:
        if (r3 == null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04c2, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04c4, code lost:
        r9 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c6, code lost:
        r4.A1j(new X.AnonymousClass3QP(r9, X.AnonymousClass3UN.A00(), 0, 0, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04dc, code lost:
        if (r18 == false) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04de, code lost:
        r2.A0j(1);
        r2.A06 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04e6, code lost:
        if (r29 != false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04e8, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04ed, code lost:
        if (r0.A0W() == null) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04ef, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04f4, code lost:
        if (r0.A0W() == null) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04f6, code lost:
        r2.A0z(r0.A0W());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04fd, code lost:
        r3 = r2.A0W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0501, code lost:
        if (r3 == null) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0503, code lost:
        r4 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0506, code lost:
        if (r29 == false) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0508, code lost:
        r10 = (X.C28981Uw) r5;
        r4 = ((X.C44072La) r1.A0U.A09(r5, false)).A0K;
        X.AnonymousClass00C.A0D(r10, 1);
        X.AnonymousClass00C.A0D(r4, 3);
        r2.A0z(new X.C63393Jw(r10, (X.C52332pG) null, r4, (java.lang.String) null, (int) r0.A1O));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0536, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0537, code lost:
        if (r12 == false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0539, code lost:
        r10 = (X.C32241dD) r1.A1O.get();
        r9 = X.AnonymousClass1DT.A06(r2.A1J.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x054f, code lost:
        if (X.C52332pG.A04.equals(r4) != false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0551, code lost:
        r3 = X.C52332pG.A02.equals(r4);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0558, code lost:
        if (r3 == false) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x055a, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x055b, code lost:
        r10.A0F(r2, r9, r4, X.AnonymousClass6UH.A01(r15, r0.A09, X.C66013Ui.A0q(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0570, code lost:
        if (X.C20800yB.A01(r6, r42, 4513) == false) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0576, code lost:
        if (r0.A0O() == null) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0578, code lost:
        r2.A0t(r0.A0O());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0581, code lost:
        if ((r2 instanceof X.C46962bx) == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0583, code lost:
        ((X.C46962bx) r2).A06 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x058d, code lost:
        A0T(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0590, code lost:
        if (r7 == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0592, code lost:
        r2.A0p(r46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0597, code lost:
        r4 = r2.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0599, code lost:
        if (r4 == 0) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x059c, code lost:
        if (r4 != 1) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x059e, code lost:
        if (r7 == false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05a0, code lost:
        r1.A1D.A08(r2, "request", X.C55802vD.A00(r1.A0h, r0, r41, r1.A19), 0, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05c9, code lost:
        if (((X.AnonymousClass1HX) r1.A1M.get()).A01(r0.A0w) == null) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05cb, code lost:
        r2.A1b = null;
        r2.A13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05d0, code lost:
        r2.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05e7, code lost:
        if (r9 != null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05f4, code lost:
        if (X.C132046Rx.A01(r9, X.C19970wo.A00(r1.A0K)) == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0628, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r42, 1844) == false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0670, code lost:
        if (r11 < r2) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0672, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0674, code lost:
        if (r6 == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0690, code lost:
        if (r2.A01() != false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06a7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06a8, code lost:
        com.whatsapp.util.Log.e("UserActions/userActionForwardMessage ", r2);
        r1.A00.A0E("UserActions/userActionForwardMessage", r2.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06bf, code lost:
        if (X.C66013Ui.A0J(r15) == false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06c1, code lost:
        if (r31 != false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06c3, code lost:
        X.C18740tg.A0C(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06c6, code lost:
        if (r30 == false) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06c8, code lost:
        r4 = new X.AnonymousClass33E();
        r43.Boy(new X.C35371ia(r1, r0, r2, r4, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06e0, code lost:
        r4 = new java.util.ArrayList(r44.size());
        r3 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06f1, code lost:
        if (r3.hasNext() == false) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06f3, code lost:
        r4.add(r3.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06fb, code lost:
        r4 = A03(r1, (X.AnonymousClass4R0) null, (X.AnonymousClass2bU) r0, new X.AnonymousClass3SC(r4, r21), (java.lang.Integer) null, (java.lang.Integer) null, r23, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0714, code lost:
        r4 = new X.AnonymousClass33E();
        r9 = r2;
        A0A(r1, r0, new X.C35371ia(r1, r0, r9, r4, 4), r9, r23);
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x072e, code lost:
        if (r44.size() > 1) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0730, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0731, code lost:
        r43.Boy(new X.C35261iP((java.lang.Object) r1, X.C203229nZ.A01(r5, r2), 1, (java.lang.Object) r0));
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x05d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(X.AnonymousClass1XY r48, X.AnonymousClass3XT r49, java.lang.String r50, java.util.List r51, java.util.List r52, boolean r53, boolean r54) {
        /*
            r47 = this;
            r44 = r52
            int r0 = r44.size()
            if (r0 == 0) goto L_0x0779
            r4 = 0
            int r1 = r51.size()
            r0 = 1
            r17 = 0
            if (r1 <= r0) goto L_0x0014
            r17 = 1
        L_0x0014:
            int r21 = r51.size()
            java.util.Iterator r16 = r51.iterator()
        L_0x001c:
            boolean r0 = r16.hasNext()
            r1 = r47
            r46 = r49
            r45 = r50
            if (r0 == 0) goto L_0x075f
            java.lang.Object r0 = r16.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            if (r17 == 0) goto L_0x075b
            if (r53 == 0) goto L_0x0757
            X.3Jw r2 = r0.A0W()
            if (r2 != 0) goto L_0x0040
            X.3Qa r2 = r0.A1J
            X.11F r2 = r2.A00
            boolean r2 = r2 instanceof X.C28981Uw
            if (r2 == 0) goto L_0x0757
        L_0x0040:
            r40 = 1
        L_0x0042:
            java.lang.String r19 = "UserActions/userActionForwardMessage"
            r4 = 1
            boolean r2 = r0.A1T(r4)
            r6 = 0
            if (r2 != 0) goto L_0x0066
            X.3Qa r3 = r0.A1J
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x0066
            X.11F r2 = r3.A00
            boolean r2 = r2 instanceof X.C28981Uw
            if (r2 != 0) goto L_0x0066
            X.005 r2 = r1.A1M
            java.lang.Object r2 = r2.get()
            X.1HX r2 = (X.AnonymousClass1HX) r2
            boolean r2 = r2.A06(r0)
            if (r2 == 0) goto L_0x0751
        L_0x0066:
            int r3 = r0.A1I
            r2 = 20
            if (r3 == r2) goto L_0x0751
            r18 = 1
            X.3Qa r2 = r0.A1J
            boolean r3 = r2.A02
            int r2 = r0.A06
            if (r3 == 0) goto L_0x0742
            int r20 = java.lang.Math.max(r4, r2)
        L_0x007a:
            X.0wU r2 = r1.A1J
            r43 = r2
            r2 = 20
            X.1iz r3 = new X.1iz
            r3.<init>(r1, r0, r2)
            r2 = r43
            r2.Boy(r3)
            boolean r2 = r0 instanceof X.C46882bp
            r8 = 0
            if (r2 == 0) goto L_0x0113
            r5 = r0
            X.2bU r5 = (X.AnonymousClass2bU) r5
            X.3Qj r2 = r5.A01
            if (r2 == 0) goto L_0x012f
            java.io.File r7 = r2.A0I
            if (r7 == 0) goto L_0x012f
            X.C18740tg.A06(r7)
            r2 = 21
            X.1iz r3 = new X.1iz
            r3.<init>(r1, r0, r2)
            r2 = r43
            r2.Boy(r3)
            java.lang.String r3 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            X.9oz r2 = new X.9oz     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            r2.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            int r2 = r2.A0Y(r4)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            if (r2 == r4) goto L_0x012f
            if (r2 == 0) goto L_0x012f
            if (r40 == 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            r2 = r8
            r28 = r8
            goto L_0x00c7
        L_0x00c1:
            java.util.List r2 = r0.A0w     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            java.lang.String r28 = r5.A1a()     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
        L_0x00c7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            r5.<init>()     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            java.lang.String r3 = "sendmedia/send-image jids:"
            r5.append(r3)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            java.lang.Object[] r3 = r44.toArray()     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            java.lang.String r3 = java.util.Arrays.deepToString(r3)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            r5.append(r3)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            android.net.Uri r23 = android.net.Uri.fromFile(r7)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            r32 = 3
            r24 = r46
            r26 = r8
            r27 = r8
            r31 = r8
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r22 = r48
            r25 = r8
            r29 = r44
            r30 = r2
            r33 = r20
            r34 = r21
            X.33E r4 = r22.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ IOException -> 0x0111, OutOfMemoryError -> 0x010f, 1X5 -> 0x010d, SecurityException -> 0x0129 }
            goto L_0x001c
        L_0x010d:
            r3 = move-exception
            goto L_0x012a
        L_0x010f:
            r3 = move-exception
            goto L_0x012a
        L_0x0111:
            r3 = move-exception
            goto L_0x012a
        L_0x0113:
            boolean r2 = r0 instanceof X.C46962bx
            if (r2 == 0) goto L_0x012f
            r2 = r0
            X.2bU r2 = (X.AnonymousClass2bU) r2
            long r2 = r2.A00
            r9 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x012f
            X.17Y r1 = r1.A02
            r0 = 2131894553(0x7f122119, float:1.9423914E38)
            goto L_0x0146
        L_0x0129:
            r3 = move-exception
        L_0x012a:
            r2 = r19
            com.whatsapp.util.Log.e(r2, r3)
        L_0x012f:
            X.0yC r2 = r1.A0j
            r42 = r2
            X.0yf r5 = r1.A05
            X.1AW r2 = r1.A18
            r41 = r2
            r3 = r42
            boolean r2 = X.C66013Ui.A0W(r5, r3, r0, r2)
            if (r2 != 0) goto L_0x014f
            X.17Y r1 = r1.A02
            r0 = 2131891041(0x7f121361, float:1.941679E38)
        L_0x0146:
            r1.A04(r0, r4)
        L_0x0149:
            X.33E r4 = A02()
            goto L_0x001c
        L_0x014f:
            X.9lY r2 = r0.A0M
            if (r2 == 0) goto L_0x0159
            X.17Y r1 = r1.A02
            r0 = 2131891040(0x7f121360, float:1.9416789E38)
            goto L_0x0146
        L_0x0159:
            X.0xf r5 = r1.A0k
            X.0yW r3 = r1.A0l
            r2 = 2
            X.C65093Qs.A02(r5, r3, r0, r2)
            X.3Qa r5 = r0.A1J
            int r3 = r44.size()
            java.util.ArrayList r22 = new java.util.ArrayList
            r2 = r22
            r2.<init>(r3)
            int r2 = r44.size()
            if (r2 <= r4) goto L_0x019d
            X.1D5 r2 = r1.A0p
            X.0wo r3 = r2.A06
            X.0wQ r2 = r2.A03
            java.lang.String r24 = X.C237919w.A00(r2, r3)
        L_0x017e:
            int r15 = r0.A1I
            boolean r2 = X.C66013Ui.A0M(r15)
            if (r2 == 0) goto L_0x01b3
            int r2 = r0.A0D()
            if (r2 != 0) goto L_0x01b3
            boolean r2 = r0.A1F()
            if (r2 == 0) goto L_0x01b3
            java.lang.String r2 = r0.A0b()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x01b3
            goto L_0x01a0
        L_0x019d:
            r24 = r8
            goto L_0x017e
        L_0x01a0:
            java.lang.String r2 = r0.A0b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01ab, StringIndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01ad }
            byte[] r23 = android.util.Base64.decode(r2, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01ab, StringIndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01ad }
            goto L_0x01b5
        L_0x01a9:
            r3 = move-exception
            goto L_0x01ae
        L_0x01ab:
            r3 = move-exception
            goto L_0x01ae
        L_0x01ad:
            r3 = move-exception
        L_0x01ae:
            java.lang.String r2 = "UserActions/userActionForwardMessage/base64-decode/error"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x01b3:
            r23 = r8
        L_0x01b5:
            boolean r4 = r0 instanceof X.C181798o3
            if (r4 == 0) goto L_0x01eb
            r7 = 695(0x2b7, float:9.74E-43)
            X.0yV r3 = X.C21000yV.A02
            r2 = r42
            boolean r2 = X.C20800yB.A01(r3, r2, r7)
            if (r2 == 0) goto L_0x01eb
            r9 = r0
            X.2bU r9 = (X.AnonymousClass2bU) r9
            int r2 = r9.A0B
            long r2 = (long) r2
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
            r7 = r42
            int r3 = X.C55412ua.A00(r7, r2)
            int r2 = r9.A0B
            if (r2 <= r3) goto L_0x01eb
            java.util.Iterator r3 = r44.iterator()
        L_0x01dc:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r2 = r3.next()
            boolean r2 = r2 instanceof X.C177528dw
            if (r2 == 0) goto L_0x01dc
            r6 = 1
        L_0x01eb:
            boolean r2 = r0 instanceof X.AnonymousClass2bU
            r25 = r2
            if (r2 == 0) goto L_0x0693
            r2 = r0
            X.2bU r2 = (X.AnonymousClass2bU) r2
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L_0x0693
        L_0x01f8:
            r14 = 1
        L_0x01f9:
            java.util.Iterator r7 = r44.iterator()
        L_0x01fd:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x05d7
            java.lang.Object r2 = r7.next()
            boolean r3 = r2 instanceof X.C177528dw
            r2 = r42
            boolean r2 = X.AnonymousClass3T2.A03(r2, r0, r3)
            if (r2 == 0) goto L_0x01fd
            X.3L1 r2 = r0.A0a
            boolean r3 = r0.A1Q()
            if (r3 == 0) goto L_0x01fd
            if (r2 == 0) goto L_0x0221
            boolean r2 = r2.A01()
            if (r2 != 0) goto L_0x01fd
        L_0x0221:
            r31 = 0
            if (r14 == 0) goto L_0x0232
        L_0x0225:
            if (r4 == 0) goto L_0x0232
            r2 = r0
            X.2cZ r2 = (X.C47002cZ) r2
            boolean r2 = X.C65703Td.A03(r2)
            r30 = 1
            if (r2 != 0) goto L_0x0234
        L_0x0232:
            r30 = 0
        L_0x0234:
            X.11F r5 = r5.A00
            boolean r2 = r5 instanceof X.C28981Uw
            r29 = r2
            java.util.Iterator r28 = r44.iterator()
        L_0x023e:
            boolean r2 = r28.hasNext()
            if (r2 == 0) goto L_0x06bb
            java.lang.Object r7 = r28.next()
            X.11F r7 = (X.AnonymousClass11F) r7
            X.1YB r6 = r1.A17     // Catch:{ 1X6 -> 0x06a7 }
            X.0wo r2 = r1.A0K     // Catch:{ 1X6 -> 0x06a7 }
            long r3 = X.C19970wo.A00(r2)     // Catch:{ 1X6 -> 0x06a7 }
            if (r31 != 0) goto L_0x0259
            if (r30 != 0) goto L_0x0259
            r9 = 0
            if (r29 == 0) goto L_0x025a
        L_0x0259:
            r9 = 1
        L_0x025a:
            r2 = 1024(0x400, float:1.435E-42)
            boolean r2 = r0.A1T(r2)     // Catch:{ 1X6 -> 0x06a7 }
            if (r2 == 0) goto L_0x0288
            X.19w r9 = r6.A01     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 1
            X.3Qa r10 = r9.A02(r7, r2)     // Catch:{ 1X6 -> 0x06a7 }
            X.3BG r9 = r0.A0V     // Catch:{ 1X6 -> 0x06a7 }
            X.2bV r2 = new X.2bV     // Catch:{ 1X6 -> 0x06a7 }
            r2.<init>(r10, r3)     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r3 = r9.A08     // Catch:{ 1X6 -> 0x06a7 }
            r2.A16(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0V = r9     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 1024(0x400, float:1.435E-42)
            r2.A0j(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x027c:
            X.0yC r9 = r6.A00     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 4513(0x11a1, float:6.324E-42)
            X.0yV r6 = X.C21000yV.A02     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = X.C20800yB.A01(r6, r9, r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x03bc
        L_0x0288:
            r2 = 46
            if (r15 != r2) goto L_0x02a6
            X.19w r9 = r6.A01     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 1
            X.3Qa r10 = r9.A02(r7, r2)     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r9 = r0.A0b()     // Catch:{ 1X6 -> 0x06a7 }
            X.2bV r2 = new X.2bV     // Catch:{ 1X6 -> 0x06a7 }
            r2.<init>(r10, r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r3 = X.AnonymousClass14B.A0C(r9, r3)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A16(r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x027c
        L_0x02a6:
            if (r25 == 0) goto L_0x0386
            r11 = r0
            X.2bU r11 = (X.AnonymousClass2bU) r11     // Catch:{ 1X6 -> 0x06a7 }
            X.3Qj r14 = r11.A01     // Catch:{ 1X6 -> 0x06a7 }
            X.C18740tg.A06(r14)     // Catch:{ 1X6 -> 0x06a7 }
            if (r9 == 0) goto L_0x02b3
            goto L_0x02bc
        L_0x02b3:
            X.3Qj r10 = new X.3Qj     // Catch:{ 1X6 -> 0x06a7 }
            r10.<init>(r14)     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 0
            r10.A0V = r2     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x02c0
        L_0x02bc:
            X.3Qj r10 = r14.A00()     // Catch:{ 1X6 -> 0x06a7 }
        L_0x02c0:
            long r12 = r10.A0D     // Catch:{ 1X6 -> 0x06a7 }
            r26 = 0
            int r2 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x02cc
            long r12 = r11.A0I     // Catch:{ 1X6 -> 0x06a7 }
            r10.A0D = r12     // Catch:{ 1X6 -> 0x06a7 }
        L_0x02cc:
            X.19w r12 = r6.A01     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 1
            X.3Qa r37 = r12.A02(r7, r2)     // Catch:{ 1X6 -> 0x06a7 }
            r35 = r11
            r36 = r10
            r38 = r3
            X.2bU r2 = r35.A1Z(r36, r37, r38, r40)     // Catch:{ 1X6 -> 0x06a7 }
            X.0yC r12 = r6.A00     // Catch:{ 1X6 -> 0x06a7 }
            X.3Qa r3 = r2.A1J     // Catch:{ 1X6 -> 0x06a7 }
            X.11F r3 = r3.A00     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = r3 instanceof X.C177528dw     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = X.AnonymousClass3T2.A03(r12, r11, r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x030f
            X.3L1 r3 = r11.A0a     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x030f
            boolean r3 = r3.A01()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x030f
            boolean r3 = r11.A1Q()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x030f
            X.3L1 r3 = r11.A0a     // Catch:{ 1X6 -> 0x06a7 }
            byte[] r3 = r3.A0A     // Catch:{ 1X6 -> 0x06a7 }
            byte[] r4 = r10.A0a     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = java.util.Arrays.equals(r3, r4)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 != 0) goto L_0x0320
            java.lang.String r3 = "FMessageFactory/newFMessageForForward/thumbnail and media file key not the same"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A12(r8)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x030f:
            boolean r3 = X.AnonymousClass3T2.A01(r12, r2)     // Catch:{ 1X6 -> 0x06a7 }
            r10 = 1
            if (r3 == 0) goto L_0x0336
            X.6Q6 r3 = r2.A1Y()     // Catch:{ 1X6 -> 0x06a7 }
            X.C18740tg.A06(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3.A05 = r10     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x0336
        L_0x0320:
            X.3L1 r3 = r11.A0a     // Catch:{ 1X6 -> 0x06a7 }
            X.3L1 r10 = r3.A00()     // Catch:{ 1X6 -> 0x06a7 }
            long r3 = r14.A0D     // Catch:{ 1X6 -> 0x06a7 }
            r10.A02 = r3     // Catch:{ 1X6 -> 0x06a7 }
            r10.A09 = r9     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = X.AnonymousClass3T2.A02(r12, r2)     // Catch:{ 1X6 -> 0x06a7 }
            r10.A0C = r3     // Catch:{ 1X6 -> 0x06a7 }
            r2.A12(r10)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x030f
        L_0x0336:
            if (r9 == 0) goto L_0x0339
            goto L_0x037b
        L_0x0339:
            boolean r3 = r2 instanceof X.C46882bp     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x0375
            r2.A04 = r8     // Catch:{ 1X6 -> 0x06a7 }
            r2.A03 = r8     // Catch:{ 1X6 -> 0x06a7 }
            X.3Qj r3 = r2.A01     // Catch:{ 1X6 -> 0x06a7 }
            X.C18740tg.A06(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3.A0O = r8     // Catch:{ 1X6 -> 0x06a7 }
            r3.A0N = r8     // Catch:{ 1X6 -> 0x06a7 }
            X.6Q6 r11 = r2.A1Y()     // Catch:{ 1X6 -> 0x06a7 }
            if (r11 == 0) goto L_0x0375
            int[] r9 = r11.A06()     // Catch:{ 1X6 -> 0x06a7 }
            r11.A01()     // Catch:{ 1X6 -> 0x06a7 }
            if (r9 == 0) goto L_0x0375
            int r4 = r9.length     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 4
            if (r4 != r3) goto L_0x0375
            r3 = 0
        L_0x035e:
            r12 = r9[r3]     // Catch:{ 1X6 -> 0x06a7 }
            long r12 = (long) r12     // Catch:{ 1X6 -> 0x06a7 }
            long r26 = r26 + r12
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x035e
            X.3Qj r3 = r2.A01     // Catch:{ 1X6 -> 0x06a7 }
            long r3 = r3.A0C     // Catch:{ 1X6 -> 0x06a7 }
            int r12 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x0375
            monitor-enter(r11)     // Catch:{ 1X6 -> 0x06a7 }
            r11.A02 = r9     // Catch:{ all -> 0x06a4 }
            r11.A01 = r10     // Catch:{ all -> 0x06a4 }
            monitor-exit(r11)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0375:
            r2.A0n(r10)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A07 = r8     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x037f
        L_0x037b:
            r3 = 2
            r2.A0n(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x037f:
            r3 = r24
            r2.A1f(r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x027c
        L_0x0386:
            boolean r2 = r0 instanceof X.AnonymousClass2bV     // Catch:{ 1X6 -> 0x06a7 }
            if (r2 == 0) goto L_0x039d
            r10 = r0
            X.2bV r10 = (X.AnonymousClass2bV) r10     // Catch:{ 1X6 -> 0x06a7 }
            X.19w r11 = r6.A01     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 1
            X.3Qa r2 = r11.A02(r7, r2)     // Catch:{ 1X6 -> 0x06a7 }
            X.2bV r2 = r10.A1X(r2, r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0398:
            X.3L1 r3 = r0.A0a     // Catch:{ 1X6 -> 0x06a7 }
            if (r9 == 0) goto L_0x027c
            goto L_0x03b1
        L_0x039d:
            boolean r2 = r0 instanceof X.AnonymousClass4RV     // Catch:{ 1X6 -> 0x06a7 }
            X.C18740tg.A0C(r2)     // Catch:{ 1X6 -> 0x06a7 }
            r10 = r0
            X.4RV r10 = (X.AnonymousClass4RV) r10     // Catch:{ 1X6 -> 0x06a7 }
            X.19w r11 = r6.A01     // Catch:{ 1X6 -> 0x06a7 }
            r2 = 1
            X.3Qa r2 = r11.A02(r7, r2)     // Catch:{ 1X6 -> 0x06a7 }
            X.3T1 r2 = r10.B31(r2, r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x0398
        L_0x03b1:
            if (r3 == 0) goto L_0x027c
            X.3L1 r3 = r3.A00()     // Catch:{ 1X6 -> 0x06a7 }
            r2.A12(r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x027c
        L_0x03bc:
            if (r3 == 0) goto L_0x03d2
            r3 = 1
            X.AnonymousClass00C.A0D(r2, r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 23
            if (r15 == r3) goto L_0x03e9
            r3 = 37
            if (r15 == r3) goto L_0x03e9
            r3 = 52
            if (r15 == r3) goto L_0x03e9
            switch(r15) {
                case 25: goto L_0x03e9;
                case 26: goto L_0x03e9;
                case 27: goto L_0x03e9;
                case 28: goto L_0x03e9;
                case 29: goto L_0x03e9;
                case 30: goto L_0x03e9;
                default: goto L_0x03d1;
            }     // Catch:{ 1X6 -> 0x06a7 }
        L_0x03d1:
            goto L_0x03d6
        L_0x03d2:
            r2.A0t(r8)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x03f8
        L_0x03d6:
            boolean r3 = r0 instanceof X.C23043B1o     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x03f8
            r3 = r0
            X.B1o r3 = (X.C23043B1o) r3     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x03f8
            X.9uk r3 = r3.BA8()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x03f8
            java.lang.String r3 = r3.A0B     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x03f8
        L_0x03e9:
            boolean r3 = r5 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x03f8
            r4 = r5
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 1X6 -> 0x06a7 }
            X.3Ky r3 = new X.3Ky     // Catch:{ 1X6 -> 0x06a7 }
            r3.<init>(r8, r4)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0t(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x03f8:
            r3 = 5431(0x1537, float:7.61E-42)
            boolean r3 = X.C20800yB.A01(r6, r9, r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x0408
            long r3 = r0.A1N     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0h = r3     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0408:
            boolean r4 = X.C131806Qs.A02(r0)     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 3
            if (r4 == 0) goto L_0x0410
            r3 = 7
        L_0x0410:
            r2.A09 = r3     // Catch:{ 1X6 -> 0x06a7 }
            boolean r7 = r7 instanceof X.C177528dw     // Catch:{ 1X6 -> 0x06a7 }
            if (r7 == 0) goto L_0x04dc
            boolean r3 = android.text.TextUtils.isEmpty(r45)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 != 0) goto L_0x0423
            java.lang.String r3 = r45.trim()     // Catch:{ 1X6 -> 0x06a7 }
            r2.A17(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0423:
            boolean r3 = r2 instanceof X.AnonymousClass2bV     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x049b
            r9 = r2
            X.2bV r9 = (X.AnonymousClass2bV) r9     // Catch:{ 1X6 -> 0x06a7 }
            com.whatsapp.TextData r4 = new com.whatsapp.TextData     // Catch:{ 1X6 -> 0x06a7 }
            r4.<init>()     // Catch:{ 1X6 -> 0x06a7 }
            int r3 = X.AnonymousClass3UN.A00()     // Catch:{ 1X6 -> 0x06a7 }
            r4.backgroundColor = r3     // Catch:{ 1X6 -> 0x06a7 }
            r3 = -1
            r4.textColor = r3     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 0
            r4.fontStyle = r3     // Catch:{ 1X6 -> 0x06a7 }
            r9.A1Z(r4)     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = X.C202359le.A04(r2)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x04a9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ 1X6 -> 0x06a7 }
            r9.<init>()     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r3 = r2.A0b()     // Catch:{ 1X6 -> 0x06a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r4 != 0) goto L_0x0456
            r9.append(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0456:
            java.lang.String r3 = X.C202359le.A01(r2)     // Catch:{ 1X6 -> 0x06a7 }
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r4 = "\n\n"
            if (r10 != 0) goto L_0x046e
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 1X6 -> 0x06a7 }
            if (r10 != 0) goto L_0x046b
            r9.append(r4)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x046b:
            r9.append(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x046e:
            X.3Cq r3 = r2.A0T()     // Catch:{ 1X6 -> 0x06a7 }
            X.37E r3 = r3.A00     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x048a
            java.lang.String r3 = r3.A01     // Catch:{ 1X6 -> 0x06a7 }
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r10 != 0) goto L_0x048a
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 1X6 -> 0x06a7 }
            if (r10 != 0) goto L_0x0487
            r9.append(r4)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0487:
            r9.append(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x048a:
            java.lang.String r4 = r9.toString()     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 != 0) goto L_0x049b
            java.lang.String r3 = X.AnonymousClass3UN.A07(r4)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A16(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x049b:
            boolean r3 = r2 instanceof X.C46812bi     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x04dc
            r4 = r2
            X.2bv r4 = (X.C46942bv) r4     // Catch:{ 1X6 -> 0x06a7 }
            X.3Kh r3 = r4.A00     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.Object r3 = r3.A00     // Catch:{ 1X6 -> 0x06a7 }
            X.3QP r3 = (X.AnonymousClass3QP) r3     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x04bf
        L_0x04a9:
            java.lang.String r3 = r0.A0b()     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 != 0) goto L_0x049b
            java.lang.String r3 = r2.A0b()     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r3 = X.AnonymousClass3UN.A07(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A16(r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x049b
        L_0x04bf:
            if (r3 == 0) goto L_0x04c2
            goto L_0x04c4
        L_0x04c2:
            r9 = r8
            goto L_0x04c6
        L_0x04c4:
            byte[] r9 = r3.A05     // Catch:{ 1X6 -> 0x06a7 }
        L_0x04c6:
            int r34 = X.AnonymousClass3UN.A00()     // Catch:{ 1X6 -> 0x06a7 }
            r35 = 0
            X.3QP r3 = new X.3QP     // Catch:{ 1X6 -> 0x06a7 }
            r36 = 0
            r37 = 0
            r32 = r3
            r33 = r9
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ 1X6 -> 0x06a7 }
            r4.A1j(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x04dc:
            if (r18 == 0) goto L_0x057f
            r3 = 1
            r2.A0j(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3 = r20
            r2.A06 = r3     // Catch:{ 1X6 -> 0x06a7 }
            if (r29 != 0) goto L_0x04ef
            X.3Jw r3 = r0.A0W()     // Catch:{ 1X6 -> 0x06a7 }
            r12 = 0
            if (r3 == 0) goto L_0x04f0
        L_0x04ef:
            r12 = 1
        L_0x04f0:
            X.3Jw r3 = r0.A0W()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x0506
            X.3Jw r3 = r0.A0W()     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0z(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x04fd:
            X.3Jw r3 = r2.A0W()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x0536
            X.2pG r4 = r3.A02     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x0537
        L_0x0506:
            if (r29 == 0) goto L_0x04fd
            X.12q r4 = r1.A0U     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 0
            X.3Qp r11 = r4.A09(r5, r3)     // Catch:{ 1X6 -> 0x06a7 }
            X.2La r11 = (X.C44072La) r11     // Catch:{ 1X6 -> 0x06a7 }
            r10 = r5
            X.1Uw r10 = (X.C28981Uw) r10     // Catch:{ 1X6 -> 0x06a7 }
            long r3 = r0.A1O     // Catch:{ 1X6 -> 0x06a7 }
            int r9 = (int) r3     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.String r4 = r11.A0K     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 1
            X.AnonymousClass00C.A0D(r10, r3)     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 3
            X.AnonymousClass00C.A0D(r4, r3)     // Catch:{ 1X6 -> 0x06a7 }
            X.3Jw r3 = new X.3Jw     // Catch:{ 1X6 -> 0x06a7 }
            r36 = r8
            r32 = r3
            r33 = r10
            r34 = r8
            r35 = r4
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0z(r3)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x04fd
        L_0x0536:
            r4 = r8
        L_0x0537:
            if (r12 == 0) goto L_0x0568
            X.005 r3 = r1.A1O     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.Object r10 = r3.get()     // Catch:{ 1X6 -> 0x06a7 }
            X.1dD r10 = (X.C32241dD) r10     // Catch:{ 1X6 -> 0x06a7 }
            X.3Qa r3 = r2.A1J     // Catch:{ 1X6 -> 0x06a7 }
            X.11F r3 = r3.A00     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.Integer r9 = X.AnonymousClass1DT.A06(r3)     // Catch:{ 1X6 -> 0x06a7 }
            X.2pG r3 = X.C52332pG.UPDATE_CARD     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = r3.equals(r4)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 != 0) goto L_0x055a
            X.2pG r3 = X.C52332pG.LINK_CARD     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = r3.equals(r4)     // Catch:{ 1X6 -> 0x06a7 }
            r4 = 0
            if (r3 == 0) goto L_0x055b
        L_0x055a:
            r4 = 1
        L_0x055b:
            int r11 = r0.A09     // Catch:{ 1X6 -> 0x06a7 }
            boolean r3 = X.C66013Ui.A0q(r0)     // Catch:{ 1X6 -> 0x06a7 }
            int r3 = X.AnonymousClass6UH.A01(r15, r11, r3)     // Catch:{ 1X6 -> 0x06a7 }
            r10.A0F(r2, r9, r4, r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0568:
            r4 = 4513(0x11a1, float:6.324E-42)
            r3 = r42
            boolean r3 = X.C20800yB.A01(r6, r3, r4)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x057f
            X.3Ky r3 = r0.A0O()     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x057f
            X.3Ky r3 = r0.A0O()     // Catch:{ 1X6 -> 0x06a7 }
            r2.A0t(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x057f:
            boolean r3 = r2 instanceof X.C46962bx     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x058d
            r4 = r2
            X.2bx r4 = (X.C46962bx) r4     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ 1X6 -> 0x06a7 }
            r4.A06 = r3     // Catch:{ 1X6 -> 0x06a7 }
        L_0x058d:
            r1.A0T(r2)     // Catch:{ 1X6 -> 0x06a7 }
            if (r7 == 0) goto L_0x0597
            r3 = r46
            r2.A0p(r3)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x0597:
            int r4 = r2.A1I     // Catch:{ 1X6 -> 0x06a7 }
            if (r4 == 0) goto L_0x059e
            r3 = 1
            if (r4 != r3) goto L_0x05bb
        L_0x059e:
            if (r7 == 0) goto L_0x05bb
            X.1DW r6 = r1.A0h     // Catch:{ 1X6 -> 0x06a7 }
            X.1EO r4 = r1.A19     // Catch:{ 1X6 -> 0x06a7 }
            r3 = r41
            int r35 = X.C55802vD.A00(r6, r0, r3, r4)     // Catch:{ 1X6 -> 0x06a7 }
            X.1Xt r3 = r1.A1D     // Catch:{ 1X6 -> 0x06a7 }
            r36 = 0
            java.lang.String r34 = "request"
            r38 = 0
            r39 = 0
            r32 = r3
            r33 = r2
            r32.A08(r33, r34, r35, r36, r38, r39)     // Catch:{ 1X6 -> 0x06a7 }
        L_0x05bb:
            X.005 r3 = r1.A1M     // Catch:{ 1X6 -> 0x06a7 }
            java.lang.Object r4 = r3.get()     // Catch:{ 1X6 -> 0x06a7 }
            X.1HX r4 = (X.AnonymousClass1HX) r4     // Catch:{ 1X6 -> 0x06a7 }
            java.util.List r3 = r0.A0w     // Catch:{ 1X6 -> 0x06a7 }
            com.whatsapp.jid.UserJid r3 = r4.A01(r3)     // Catch:{ 1X6 -> 0x06a7 }
            if (r3 == 0) goto L_0x05d0
            r2.A1b = r8     // Catch:{ 1X6 -> 0x06a7 }
            r3 = 0
            r2.A13 = r3     // Catch:{ 1X6 -> 0x06a7 }
        L_0x05d0:
            r3 = r22
            r3.add(r2)     // Catch:{ 1X6 -> 0x06a7 }
            goto L_0x023e
        L_0x05d7:
            if (r25 == 0) goto L_0x0633
            r2 = r0
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r7 = r2.A01
            X.C18740tg.A06(r7)
            long r2 = r2.A0I
            X.6Rx r9 = X.C132046Rx.A00(r7, r2)
            if (r9 == 0) goto L_0x05f6
        L_0x05e9:
            X.0wo r2 = r1.A0K
            long r2 = X.C19970wo.A00(r2)
            boolean r2 = X.C132046Rx.A01(r9, r2)
            r7 = 1
            if (r2 != 0) goto L_0x05f7
        L_0x05f6:
            r7 = 0
        L_0x05f7:
            if (r25 == 0) goto L_0x062c
            r2 = r0
            X.2bU r2 = (X.AnonymousClass2bU) r2
            java.lang.String r2 = r2.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = r2 ^ 1
        L_0x0604:
            if (r14 == 0) goto L_0x0221
            if (r7 == 0) goto L_0x0221
            if (r3 == 0) goto L_0x0221
            X.0wQ r9 = r1.A03
            X.0wo r2 = r1.A0K
            long r11 = X.C19970wo.A00(r2)
            if (r25 == 0) goto L_0x0650
            X.11F r3 = r5.A00
            boolean r2 = r3 instanceof X.C177528dw
            if (r2 != 0) goto L_0x0221
            boolean r2 = r3 instanceof X.C177638e7
            if (r2 == 0) goto L_0x0650
            r7 = 1844(0x734, float:2.584E-42)
            X.0yV r3 = X.C21000yV.A02
            r2 = r42
            boolean r2 = X.C20800yB.A01(r3, r2, r7)
            if (r2 == 0) goto L_0x0650
            goto L_0x0221
        L_0x062c:
            boolean r2 = r0 instanceof X.AnonymousClass2bV
            r3 = 0
            if (r2 == 0) goto L_0x0604
            r3 = 1
            goto L_0x0604
        L_0x0633:
            boolean r2 = r0 instanceof X.AnonymousClass2bV
            if (r2 == 0) goto L_0x05f6
            X.3L1 r2 = r0.A0a
            if (r2 == 0) goto L_0x05f6
            byte[] r7 = r2.A0A
            long r2 = r2.A02
            long r9 = r0.A0I
            if (r7 == 0) goto L_0x05f6
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x064a
            r2 = r9
        L_0x064a:
            X.6Rx r9 = new X.6Rx
            r9.<init>(r7, r2)
            goto L_0x05e9
        L_0x0650:
            boolean r2 = X.C66013Ui.A0L(r15)
            if (r2 != 0) goto L_0x0221
            boolean r2 = X.C66013Ui.A0J(r15)
            if (r2 == 0) goto L_0x0678
            boolean r2 = X.C66013Ui.A0V(r9, r0)
            if (r2 != 0) goto L_0x0678
            long r2 = r0.A0I
            r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r2 = r2 + r9
            r9 = 0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0678
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0678
        L_0x0672:
            r31 = 1
            if (r6 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0678:
            boolean r2 = X.C66013Ui.A0q(r0)
            if (r2 == 0) goto L_0x0221
            long r2 = r0.A0I
            r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r11 = r11 - r9
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0221
            X.3L1 r2 = r0.A0a
            if (r2 == 0) goto L_0x0221
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x0221
            goto L_0x0672
        L_0x0693:
            boolean r2 = r0 instanceof X.AnonymousClass2bV
            if (r2 == 0) goto L_0x06a1
            X.3L1 r2 = r0.A0a
            if (r2 == 0) goto L_0x06a1
            java.lang.String r2 = r2.A05
            if (r2 == 0) goto L_0x06a1
            goto L_0x01f8
        L_0x06a1:
            r14 = 0
            goto L_0x01f9
        L_0x06a4:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ 1X6 -> 0x06a7 }
            throw r0     // Catch:{ 1X6 -> 0x06a7 }
        L_0x06a7:
            r2 = move-exception
            java.lang.String r0 = "UserActions/userActionForwardMessage "
            com.whatsapp.util.Log.e(r0, r2)
            X.0wN r3 = r1.A00
            java.lang.String r2 = r2.getMessage()
            r1 = 1
            r0 = r19
            r3.A0E(r0, r2, r1)
            goto L_0x0149
        L_0x06bb:
            boolean r2 = X.C66013Ui.A0J(r15)
            if (r2 == 0) goto L_0x0714
            if (r31 != 0) goto L_0x0714
            X.C18740tg.A0C(r25)
            if (r30 == 0) goto L_0x06e0
            X.33E r4 = new X.33E
            r4.<init>()
            r10 = 5
            X.1ia r2 = new X.1ia
            r5 = r2
            r6 = r1
            r7 = r0
            r8 = r22
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r43
            r0.Boy(r2)
            goto L_0x001c
        L_0x06e0:
            int r2 = r44.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r3 = r22.iterator()
        L_0x06ed:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x06fb
            java.lang.Object r2 = r3.next()
            r4.add(r2)
            goto L_0x06ed
        L_0x06fb:
            X.3SC r3 = new X.3SC
            r2 = r21
            r3.<init>(r4, r2)
            X.2bU r0 = (X.AnonymousClass2bU) r0
            r11 = 0
            r9 = r8
            r12 = 0
            r13 = 0
            r4 = r1
            r5 = r8
            r6 = r0
            r7 = r3
            r10 = r23
            X.33E r4 = A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x001c
        L_0x0714:
            X.33E r4 = new X.33E
            r4.<init>()
            r11 = 4
            X.1ia r6 = new X.1ia
            r7 = r1
            r8 = r0
            r9 = r22
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r23
            A0A(r1, r0, r6, r9, r2)
            int r3 = r44.size()
            r2 = 1
            if (r3 > r2) goto L_0x0731
            r2 = 0
        L_0x0731:
            int r5 = X.C203229nZ.A01(r5, r2)
            r3 = 1
            X.1iP r2 = new X.1iP
            r2.<init>((java.lang.Object) r1, (int) r5, (int) r3, (java.lang.Object) r0)
            r0 = r43
            r0.Boy(r2)
            goto L_0x001c
        L_0x0742:
            int r2 = r2 + 1
            int r20 = java.lang.Math.max(r4, r2)
            r3 = 5
            r2 = r20
            if (r2 < r3) goto L_0x007a
            r20 = 127(0x7f, float:1.78E-43)
            goto L_0x007a
        L_0x0751:
            r18 = 0
            r20 = 0
            goto L_0x007a
        L_0x0757:
            r40 = 0
            goto L_0x0042
        L_0x075b:
            r40 = r53
            goto L_0x0042
        L_0x075f:
            if (r54 == 0) goto L_0x0779
            boolean r0 = android.text.TextUtils.isEmpty(r45)
            if (r0 != 0) goto L_0x0779
            if (r4 == 0) goto L_0x0779
            X.3tq r5 = new X.3tq
            r3 = r46
            r2 = r45
            r0 = r44
            r5.<init>(r1, r3, r2, r0)
            X.3ty r0 = r4.A00
            r0.A0A(r5)
        L_0x0779:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X4.A06(X.1XY, X.3XT, java.lang.String, java.util.List, java.util.List, boolean, boolean):void");
    }
}
