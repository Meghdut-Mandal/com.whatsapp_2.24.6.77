package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1YI  reason: invalid class name */
public class AnonymousClass1YI {
    public final AnonymousClass1N4 A00;
    public final AnonymousClass1KK A01;
    public final AnonymousClass16D A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C18820ts A05;
    public final AnonymousClass17Y A06;
    public final C24051Aw A07;

    public C602337a A00(String str) {
        StringBuilder sb;
        String str2 = null;
        AnonymousClass9UV r6 = new AnonymousClass9UV();
        try {
            for (String split : C200709i5.A00(str)) {
                C200709i5.A01(Arrays.asList(C200709i5.A00.split(split)), r6);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C602837f> list = r6.A02;
            if (list.size() <= 257) {
                sb.append("contactpicker/contact array separation (size: ");
                sb.append(list.size());
                sb.append(")");
                C224214g r7 = new C224214g(sb.toString());
                for (C602837f r9 : list) {
                    try {
                        C19630wG r8 = this.A04;
                        AnonymousClass16D r2 = this.A02;
                        C21060yb r0 = this.A03;
                        C18820ts r62 = this.A05;
                        C65033Ql r1 = new C65033Ql(r2, r0, r8, r62);
                        r1.A06(r9);
                        r1.A04(this.A01);
                        C65643Sx r22 = r1.A04;
                        try {
                            AnonymousClass363 r02 = new AnonymousClass363(new C64643Ow(this.A00, r62).A01(r22), r22);
                            arrayList2.add(r02);
                            arrayList.add(r02.A00);
                        } catch (AnonymousClass1YJ e) {
                            Log.e((Throwable) new C108695Un(e));
                            throw new Av1();
                        }
                    } catch (AnonymousClass1YJ e2) {
                        Log.e("Failed to generate VCard data, skip it.", e2);
                    }
                }
                r7.A01();
                if (arrayList2.size() == 1) {
                    str2 = ((AnonymousClass363) arrayList2.get(0)).A01.A03();
                }
                return new C602337a(str2, arrayList, arrayList2);
            }
            sb = new StringBuilder();
            sb.append("Too many vCards for a contact array message: ");
            sb.append(list.size());
            Log.w(sb.toString());
            throw new Av2();
        } catch (AnonymousClass1YJ unused) {
            throw new Av3();
        }
    }

    public String A01(Uri uri) {
        IOException th;
        AnonymousClass5RB r2;
        C21050ya A0O = this.A03.A0O();
        if (A0O != null) {
            C24051Aw r5 = this.A07;
            r5.A02(uri);
            try {
                AnonymousClass00C.A0D(uri, 0);
                ContentResolver A002 = C21050ya.A00(A0O);
                A0O.A01.A00(C51822oR.FILE, uri.getAuthority());
                AssetFileDescriptor openAssetFileDescriptor = A002.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    try {
                        r5.A03(openAssetFileDescriptor.getParcelFileDescriptor());
                        FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                        try {
                            r2 = new AnonymousClass5RB(createInputStream, 10000000);
                            String A003 = AnonymousClass14X.A00(r2);
                            C18740tg.A06(A003);
                            r2.close();
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openAssetFileDescriptor.close();
                            return A003;
                        } catch (Throwable th2) {
                            th = th2;
                            if (createInputStream != null) {
                                try {
                                    createInputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        if (openAssetFileDescriptor != null) {
                            openAssetFileDescriptor.close();
                        }
                        throw th4;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open uri=");
                    sb.append(uri);
                    th = new IOException(sb.toString());
                    throw th;
                }
            } catch (SecurityException e) {
                throw new IOException(e);
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
        } else {
            throw new IOException("Unable to open uri; cr=null");
        }
        throw th;
    }

    public void A02(AnonymousClass1YJ r9) {
        AnonymousClass17Y r1;
        int i;
        Log.e("vcardloader/exception", new C108695Un(r9));
        if (r9 instanceof Av3) {
            r1 = this.A06;
            i = R.string.f12nameremoved;
        } else if (r9 instanceof Av2) {
            this.A06.A0E(this.A05.A0L(new Object[]{257}, R.plurals.f10nameremoved, 257), 0);
            return;
        } else if (r9 instanceof Av1) {
            r1 = this.A06;
            i = R.string.f12nameremoved;
        } else {
            return;
        }
        r1.A06(i, 0);
    }

    public AnonymousClass1YI(AnonymousClass1N4 r1, AnonymousClass17Y r2, AnonymousClass1KK r3, AnonymousClass16D r4, C21060yb r5, C19630wG r6, C18820ts r7, C24051Aw r8) {
        this.A04 = r6;
        this.A06 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r3;
    }
}
