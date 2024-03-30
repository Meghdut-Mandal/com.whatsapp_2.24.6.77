package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2kF  reason: invalid class name and case insensitive filesystem */
public class C50122kF extends C132446Tt {
    public final int A00;
    public final Uri A01;
    public final C20690y0 A02;
    public final C21060yb A03;
    public final C20810yC A04;
    public final C21010yW A05;
    public final AnonymousClass1D5 A06;
    public final AnonymousClass3T1 A07;
    public final C25561Gu A08;
    public final AnonymousClass1GX A09;
    public final File A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final boolean A0E;
    public final AnonymousClass17Y A0F;
    public final AnonymousClass1X4 A0G;
    public final C19630wG A0H;
    public final C18820ts A0I;
    public final WeakReference A0J;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Integer num;
        File file;
        String str;
        int i;
        C21060yb r2 = this.A03;
        Uri uri = this.A01;
        String A0M = AnonymousClass1GW.A0M(uri, r2.A0O());
        try {
            C25561Gu r19 = this.A08;
            C20810yC r15 = this.A04;
            C20690y0 r11 = this.A02;
            C21010yW r13 = this.A05;
            AnonymousClass1D5 r20 = this.A06;
            AnonymousClass1GX r3 = this.A09;
            List list = this.A0C;
            File file2 = this.A0A;
            AnonymousClass3T1 r22 = this.A07;
            boolean z = this.A0E;
            String str2 = this.A0B;
            List list2 = this.A0D;
            int i2 = this.A00;
            boolean A1a = C36331k8.A1a(r15, r11);
            C36321k7.A12(r13, r20, r3);
            C36321k7.A10(list, uri);
            if (file2 == null) {
                file2 = r3.A0h(uri);
                AnonymousClass00C.A08(file2);
            }
            long length = file2.length();
            String A0L = AnonymousClass1GW.A0L(uri);
            C25571Gv r17 = C25561Gu.A04;
            String A022 = C25571Gv.A02(uri, r2);
            if (A022 != null && (A0L == null || A0L.length() == 0)) {
                A0L = AnonymousClass6YY.A07(A022);
            }
            C44742Or r9 = new C44742Or();
            r9.A00 = Double.valueOf(Math.ceil(((double) length) / ((double) 20000000)) * ((double) 20) * ((double) SearchActionVerificationClientService.MS_TO_NS));
            if (A0L == null || A0L.length() == 0) {
                num = null;
            } else {
                String A1D = C36431kI.A1D(Locale.ROOT, A0L);
                if (C25561Gu.A0A.contains(A1D)) {
                    i = 2;
                } else if (C25561Gu.A0C.contains(A1D)) {
                    i = 3;
                } else if (C25561Gu.A06.contains(A1D)) {
                    i = 4;
                } else if (C25561Gu.A08.contains(A1D)) {
                    i = 5;
                } else if (C25561Gu.A07.contains(A1D)) {
                    i = 6;
                } else if (C25561Gu.A09.contains(A1D)) {
                    i = 7;
                } else if (C25561Gu.A0B.contains(A1D)) {
                    i = 8;
                } else {
                    num = Integer.valueOf(A1a);
                }
                num = Integer.valueOf(i);
            }
            r9.A01 = num;
            if (length <= C36401kF.A04(r15, 542)) {
                r13.Bly(r9);
                byte[] A042 = r19.A04(file2, A0M, 1.0f, r19.A01.A07(6249));
                if (!r11.A0i(file2)) {
                    file = r11.A0X(C36361kB.A0l());
                    r11.A0e(file2, file);
                } else {
                    file = file2;
                }
                C65013Qj r32 = new C65013Qj();
                r32.A0I = file;
                if (str2 != null) {
                    int length2 = str2.length() - (A1a ? 1 : 0);
                    boolean z2 = false;
                    int i3 = 0;
                    while (i3 <= length2) {
                        int i4 = length2;
                        if (!z2) {
                            i4 = i3;
                        }
                        int A002 = AnonymousClass00C.A00(str2.charAt(i4), 32);
                        boolean z3 = false;
                        if (A002 <= 0) {
                            z3 = true;
                        }
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length2--;
                        } else if (!z3) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    }
                    str = str2.subSequence(i3, length2 + 1).toString();
                } else {
                    str = null;
                }
                AnonymousClass3SC A043 = r20.A04((Uri) null, r32, (AnonymousClass3XT) null, r22, str, list, (List) null, (List) null, 9, 0, 0, z);
                int A072 = r17.A07(file2, A0M);
                Iterator it = C007103b.A0Y(A043.A02).iterator();
                while (it.hasNext()) {
                    AnonymousClass2bU A0r = C36441kJ.A0r(it);
                    if (A0r instanceof C46972by) {
                        C46972by r1 = (C46972by) A0r;
                        r1.A00 = A072;
                        r1.A05 = A0M;
                        r1.A06 = A022;
                        r1.A18(list2);
                    }
                }
                A043.A00 = i2;
                return C36441kJ.A0Q(A043, A042);
            }
            r13.Blx(r9, C25561Gu.A03);
            throw new C52792qB();
        } catch (Exception e) {
            return e;
        }
    }

    public void A0A() {
        C225014r r2 = (C225014r) this.A0J.get();
        if (r2 != null) {
            r2.Bu2(0, R.string.f12nameremoved);
        }
    }

    public void A0C(Object obj) {
        AnonymousClass17Y r1;
        int i;
        Object obj2 = obj;
        C225014r r4 = (C225014r) this.A0J.get();
        if (r4 != null) {
            r4.Bnv();
        }
        Context context = this.A0H.A00;
        if (obj2 instanceof C25591Gx) {
            r1 = this.A0F;
            i = R.string.f12nameremoved;
        } else if (obj2 instanceof C52792qB) {
            int A072 = this.A04.A07(542);
            AnonymousClass17Y r11 = this.A0F;
            Locale locale = AnonymousClass000.A0U(context).locale;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, A072, 0);
            r11.A0D(r4, C36391kE.A0v(context, this.A0I.A0K(new Object[]{String.format(locale, "%d", objArr)}, 283, (long) A072), new Object[1], 0, R.string.f12nameremoved));
            return;
        } else if (obj2 instanceof IOException) {
            Throwable th = (Throwable) obj2;
            C36321k7.A1J(th, "sendmedia/senddocumentasync/ioerror ", AnonymousClass000.A0u());
            if (th.getMessage() == null || !th.getMessage().contains("No space")) {
                this.A0F.A06(R.string.f12nameremoved, 0);
                return;
            } else {
                r1 = this.A0F;
                i = R.string.f12nameremoved;
            }
        } else if (obj2 instanceof Pair) {
            Pair pair = (Pair) obj2;
            this.A0G.A0b((AnonymousClass3SC) pair.first, (byte[]) pair.second, false, false);
            return;
        } else {
            return;
        }
        r1.A0D(r4, context.getString(i));
    }

    public C50122kF(Uri uri, C225014r r3, C20690y0 r4, AnonymousClass17Y r5, AnonymousClass1X4 r6, C21060yb r7, C19630wG r8, C18820ts r9, C20810yC r10, C21010yW r11, AnonymousClass1D5 r12, AnonymousClass3T1 r13, C25561Gu r14, AnonymousClass1GX r15, File file, String str, List list, List list2, int i, boolean z) {
        this.A04 = r10;
        this.A0F = r5;
        this.A0H = r8;
        this.A02 = r4;
        this.A05 = r11;
        this.A0G = r6;
        this.A06 = r12;
        this.A08 = r14;
        this.A09 = r15;
        this.A03 = r7;
        this.A0I = r9;
        this.A0C = list;
        this.A01 = uri;
        this.A0A = file;
        this.A07 = r13;
        this.A0J = AnonymousClass001.A0F(r3);
        this.A0E = z;
        this.A0B = str;
        this.A0D = list2;
        this.A00 = i;
    }
}
