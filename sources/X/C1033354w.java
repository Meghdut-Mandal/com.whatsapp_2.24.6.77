package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Signature;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.54w  reason: invalid class name and case insensitive filesystem */
public class C1033354w extends C26481Ki {
    public static final int A0E = ((int) TimeUnit.MINUTES.toMillis(60));
    public static final String A0F;
    public static final String A0G = AnonymousClass6KT.A03;
    public static final String A0H;
    public AnonymousClass58B A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass17Y A04;
    public final C122285ub A05;
    public final C19630wG A06;
    public final C19420v0 A07;
    public final C18820ts A08;
    public final C20810yC A09;
    public final C24121Be A0A;
    public final C19970wo A0B;
    public final C21010yW A0C;
    public final AnonymousClass1EV A0D;

    public boolean A0B() {
        return true;
    }

    public boolean A0E(String str, Map map, byte[] bArr) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            byte[] decode = Base64.decode(str, 0);
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(C90464aC.A0l(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxj0ym0SqSduZYfRk73qv\nj3WfGfzt76TUqcSDwDURn4Qlw4mMIgmI+WOGASQw8A97Q9SeohkZzL29HPuOPceV\n+pkmBl7LQ+BnyxvifXkohvzITpWFEwkDLlrf4lVSm7mizW8tYq1M+b65TRXFQZPO\nhdowDrdrAwR1K/T+1yppCL1zrE8YOBQf3/gFGrdKRWmGiaq+/5Zf9NKT0b5+FFBu\nP+rKp/t9aMITn9JBOI9OxP6lALyibqgf8Lbe91dT0NZOZKF1Ps5foLBsURVr40v+\nG08E8ovPO7k64OPSW8CUsmlPU0yesEiU99YLMac8oWJAwbjlV/g9SmqmkHLRcq7w\nrwIDAQAB\n", 0)));
            instance.update(bArr);
            return instance.verify(decode);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BloksAssetManager/verifySignature: ");
            A0u.append(A01());
            C36321k7.A1J(e, "Exception:", A0u);
            return false;
        }
    }

    public void A0F(C160427kz r8, String str, boolean z) {
        this.A03 = z;
        this.A02 = str;
        if (this.A09) {
            C1501874h.A01(this.A03, this, r8, 3);
            return;
        }
        String str2 = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "2.24.6.77";
            Objects.requireNonNull(str2);
        }
        C20810yC r6 = this.A09;
        C24121Be r1 = this.A0A;
        String A012 = A01();
        String A062 = this.A08.A06();
        Uri.Builder A002 = AnonymousClass6XA.A00(r6, r1, "wa/static/downloadable");
        A002.appendQueryParameter("category", A012);
        A002.appendQueryParameter("locale", A062);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A002.appendQueryParameter("existing_id", (String) null);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.appendQueryParameter("version", str2);
        }
        super.A03(r8, (Object) null, C90474aD.A0b(A002), (Map) null);
    }

    private AnonymousClass58B A00() {
        AnonymousClass58B r2 = new AnonymousClass58B();
        int i = 0;
        if ("BR".equals(C202159l8.A01(this.A05.A02.A0f()).A03)) {
            i = 4;
        }
        r2.A02 = C36441kJ.A0y(i);
        Objects.requireNonNull("2.24.6.77");
        r2.A05 = "2.24.6.77";
        r2.A01 = Boolean.valueOf(this.A03);
        r2.A06 = this.A02;
        return r2;
    }

    private String A01() {
        String A1A = C36431kI.A1A(C202159l8.A01(this.A05.A02.A0f()).A03, C113135f3.A00);
        if (TextUtils.isEmpty(A1A)) {
            return CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        }
        return AnonymousClass000.A0q("_p", AnonymousClass000.A0v(A1A));
    }

    public /* bridge */ /* synthetic */ String A05(Object obj) {
        return C36371kC.A0t(C36341k9.A0E(this.A07), "bloks_local_tag");
    }

    public void A08() {
        C19420v0 r3 = this.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        Objects.requireNonNull("2.24.6.77");
        A0u.append("2.24.6.77");
        A0u.append(C202159l8.A01(this.A05.A02.A0f()).A03);
        C36421kH.A1N(A0u);
        C36341k9.A0x(C19420v0.A00(r3), "bloks_version", AnonymousClass000.A0q(this.A08.A06(), A0u));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj, String str) {
        C36341k9.A0x(C19420v0.A00(this.A07), "bloks_local_tag", str);
    }

    public boolean A0G() {
        if (A04(A02(A0G)) || A04(A02(A0H))) {
            return false;
        }
        return true;
    }

    public boolean A0I(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        File A022 = A02(A0F);
        if (A022 != null) {
            AnonymousClass6YY.A0Q(A022);
        }
        File A023 = A02(A0G);
        File A024 = A02(A0H);
        if (A023 == null || A024 == null) {
            Log.e("BloksAssetManager/store/Could not prepare resource subdirectory");
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String A072 = AnonymousClass6YY.A07(nextEntry.getName());
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append(AnonymousClass6YY.A08(nextEntry.getName()));
                        String A0p = AnonymousClass000.A0p(".", A072, A0u);
                        if ("png".equals(A072)) {
                            File A052 = AnonymousClass6YY.A05(A023.getCanonicalPath(), nextEntry.getName());
                            if (A052 == null) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("BloksAssetManager/store/malicious zip file: ");
                                C36321k7.A1Z(A0u2, nextEntry.getName());
                                zipInputStream.close();
                                return false;
                            }
                            C90474aD.A15(A052.getParentFile());
                            fileOutputStream = C90524aI.A0W(A052);
                        } else if ("json".equals(A072)) {
                            fileOutputStream = C90524aI.A0W(C90524aI.A0T(A024.getAbsolutePath(), A0p));
                        }
                        AnonymousClass6YY.A0J(zipInputStream, fileOutputStream);
                        fileOutputStream.close();
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
        } catch (IOException e) {
            Log.e("BloksAssetManager/store/Failed!", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("downloadable");
        String str = File.separator;
        A0u.append(str);
        String A0q = AnonymousClass000.A0q("bloks_pay", A0u);
        A0F = A0q;
        A0H = AnonymousClass000.A0q("layout", C36331k8.A0k(A0q, str));
    }

    public C1033354w(AnonymousClass17Y r9, C20050ww r10, C122285ub r11, C19970wo r12, C19630wG r13, C19420v0 r14, C18820ts r15, C20810yC r16, C21010yW r17, AnonymousClass13E r18, AnonymousClass1EV r19, C24121Be r20, C21080yd r21, C19770wU r22) {
        super(r10, r13, r18, r21, r22, C36401kF.A0k());
        this.A0B = r12;
        this.A09 = r16;
        this.A04 = r9;
        this.A06 = r13;
        this.A0C = r17;
        this.A08 = r15;
        this.A05 = r11;
        this.A07 = r14;
        this.A0D = r19;
        this.A0A = r20;
        this.A00 = 15;
        this.A01 = 4;
    }

    public void A06() {
        AnonymousClass58B A002 = A00();
        this.A00 = A002;
        A002.A00 = C36381kD.A0j();
        A002.A04 = C90484aE.A0i(this.A01, C19970wo.A00(this.A0B));
        this.A0C.Bly(this.A00);
    }

    public void A07() {
        this.A00 = A00();
        this.A01 = Long.valueOf(C19970wo.A00(this.A0B));
        this.A0C.Bly(this.A00);
    }

    public void A09(int i) {
        AnonymousClass58B A002 = A00();
        this.A00 = A002;
        A002.A00 = C36371kC.A0m();
        A002.A03 = C36441kJ.A0y(i);
        A002.A04 = C90484aE.A0i(this.A01, C19970wo.A00(this.A0B));
        this.A0C.Bly(this.A00);
    }

    public /* bridge */ /* synthetic */ boolean A0C(InputStream inputStream, Object obj, Map map) {
        return A0I(inputStream);
    }

    public /* bridge */ /* synthetic */ boolean A0D(Object obj) {
        return A0G();
    }

    public boolean A0H() {
        StringBuilder A0u = AnonymousClass000.A0u();
        Objects.requireNonNull("2.24.6.77");
        A0u.append("2.24.6.77");
        A0u.append(C202159l8.A01(this.A05.A02.A0f()).A03);
        C36421kH.A1N(A0u);
        return AnonymousClass000.A0q(this.A08.A06(), A0u).equals(C36371kC.A0t(C36341k9.A0E(this.A07), "bloks_version"));
    }
}
